package com.google.maps.android.data.geojson;

import android.util.Log;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.maps.android.data.Geometry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class GeoJsonParser {
    private static final String BOUNDING_BOX = "bbox";
    private static final String FEATURE = "Feature";
    private static final String FEATURE_COLLECTION = "FeatureCollection";
    private static final String FEATURE_COLLECTION_ARRAY = "features";
    private static final String FEATURE_GEOMETRY = "geometry";
    private static final String FEATURE_ID = "id";
    private static final String GEOMETRY_COLLECTION = "GeometryCollection";
    private static final String GEOMETRY_COLLECTION_ARRAY = "geometries";
    private static final String GEOMETRY_COORDINATES_ARRAY = "coordinates";
    private static final String LINESTRING = "LineString";
    private static final String LOG_TAG = "GeoJsonParser";
    private static final String MULTILINESTRING = "MultiLineString";
    private static final String MULTIPOINT = "MultiPoint";
    private static final String MULTIPOLYGON = "MultiPolygon";
    private static final String POINT = "Point";
    private static final String POLYGON = "Polygon";
    private static final String PROPERTIES = "properties";
    private final JSONObject mGeoJsonFile;
    private final ArrayList<GeoJsonFeature> mGeoJsonFeatures = new ArrayList<>();
    private LatLngBounds mBoundingBox = null;

    private static class LatLngAlt {
        public final Double altitude;
        public final LatLng latLng;

        LatLngAlt(LatLng latLng, Double d8) {
            this.latLng = latLng;
            this.altitude = d8;
        }
    }

    public GeoJsonParser(JSONObject jSONObject) {
        this.mGeoJsonFile = jSONObject;
        parseGeoJson();
    }

    private static Geometry createGeometry(String str, JSONArray jSONArray) {
        str.hashCode();
        switch (str) {
            case "MultiPolygon":
                return createMultiPolygon(jSONArray);
            case "MultiPoint":
                return createMultiPoint(jSONArray);
            case "MultiLineString":
                return createMultiLineString(jSONArray);
            case "Point":
                return createPoint(jSONArray);
            case "Polygon":
                return createPolygon(jSONArray);
            case "LineString":
                return createLineString(jSONArray);
            case "GeometryCollection":
                return createGeometryCollection(jSONArray);
            default:
                return null;
        }
    }

    private static GeoJsonGeometryCollection createGeometryCollection(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            Geometry parseGeometry = parseGeometry(jSONArray.getJSONObject(i8));
            if (parseGeometry != null) {
                arrayList.add(parseGeometry);
            }
        }
        return new GeoJsonGeometryCollection(arrayList);
    }

    private static GeoJsonLineString createLineString(JSONArray jSONArray) {
        ArrayList<LatLngAlt> parseCoordinatesArray = parseCoordinatesArray(jSONArray);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<LatLngAlt> it = parseCoordinatesArray.iterator();
        while (it.hasNext()) {
            LatLngAlt next = it.next();
            arrayList.add(next.latLng);
            Double d8 = next.altitude;
            if (d8 != null) {
                arrayList2.add(d8);
            }
        }
        return new GeoJsonLineString(arrayList, arrayList2);
    }

    private static GeoJsonMultiLineString createMultiLineString(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            arrayList.add(createLineString(jSONArray.getJSONArray(i8)));
        }
        return new GeoJsonMultiLineString(arrayList);
    }

    private static GeoJsonMultiPoint createMultiPoint(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            arrayList.add(createPoint(jSONArray.getJSONArray(i8)));
        }
        return new GeoJsonMultiPoint(arrayList);
    }

    private static GeoJsonMultiPolygon createMultiPolygon(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            arrayList.add(createPolygon(jSONArray.getJSONArray(i8)));
        }
        return new GeoJsonMultiPolygon(arrayList);
    }

    private static GeoJsonPoint createPoint(JSONArray jSONArray) {
        LatLngAlt parseCoordinate = parseCoordinate(jSONArray);
        return new GeoJsonPoint(parseCoordinate.latLng, parseCoordinate.altitude);
    }

    private static GeoJsonPolygon createPolygon(JSONArray jSONArray) {
        return new GeoJsonPolygon(parseCoordinatesArrays(jSONArray));
    }

    private static boolean isGeometry(String str) {
        return str.matches("Point|MultiPoint|LineString|MultiLineString|Polygon|MultiPolygon|GeometryCollection");
    }

    private static LatLngBounds parseBoundingBox(JSONArray jSONArray) {
        return new LatLngBounds(new LatLng(jSONArray.getDouble(1), jSONArray.getDouble(0)), new LatLng(jSONArray.getDouble(3), jSONArray.getDouble(2)));
    }

    private static LatLngAlt parseCoordinate(JSONArray jSONArray) {
        return new LatLngAlt(new LatLng(jSONArray.getDouble(1), jSONArray.getDouble(0)), jSONArray.length() < 3 ? null : Double.valueOf(jSONArray.getDouble(2)));
    }

    private static ArrayList<LatLngAlt> parseCoordinatesArray(JSONArray jSONArray) {
        ArrayList<LatLngAlt> arrayList = new ArrayList<>();
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            arrayList.add(parseCoordinate(jSONArray.getJSONArray(i8)));
        }
        return arrayList;
    }

    private static ArrayList<ArrayList<LatLng>> parseCoordinatesArrays(JSONArray jSONArray) {
        ArrayList<ArrayList<LatLng>> arrayList = new ArrayList<>();
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            ArrayList<LatLngAlt> parseCoordinatesArray = parseCoordinatesArray(jSONArray.getJSONArray(i8));
            ArrayList<LatLng> arrayList2 = new ArrayList<>();
            Iterator<LatLngAlt> it = parseCoordinatesArray.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().latLng);
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    private static GeoJsonFeature parseFeature(JSONObject jSONObject) {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            String string = jSONObject.has("id") ? jSONObject.getString("id") : null;
            LatLngBounds parseBoundingBox = jSONObject.has(BOUNDING_BOX) ? parseBoundingBox(jSONObject.getJSONArray(BOUNDING_BOX)) : null;
            Geometry parseGeometry = (!jSONObject.has(FEATURE_GEOMETRY) || jSONObject.isNull(FEATURE_GEOMETRY)) ? null : parseGeometry(jSONObject.getJSONObject(FEATURE_GEOMETRY));
            if (jSONObject.has(PROPERTIES) && !jSONObject.isNull(PROPERTIES)) {
                hashMap = parseProperties(jSONObject.getJSONObject(PROPERTIES));
            }
            return new GeoJsonFeature(parseGeometry, string, hashMap, parseBoundingBox);
        } catch (JSONException unused) {
            Log.w(LOG_TAG, "Feature could not be successfully parsed " + jSONObject.toString());
            return null;
        }
    }

    private ArrayList<GeoJsonFeature> parseFeatureCollection(JSONObject jSONObject) {
        ArrayList<GeoJsonFeature> arrayList = new ArrayList<>();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(FEATURE_COLLECTION_ARRAY);
            if (jSONObject.has(BOUNDING_BOX)) {
                this.mBoundingBox = parseBoundingBox(jSONObject.getJSONArray(BOUNDING_BOX));
            }
            for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i8);
                    if (jSONObject2.getString("type").equals(FEATURE)) {
                        GeoJsonFeature parseFeature = parseFeature(jSONObject2);
                        if (parseFeature != null) {
                            arrayList.add(parseFeature);
                        } else {
                            Log.w(LOG_TAG, "Index of Feature in Feature Collection that could not be created: " + i8);
                        }
                    }
                } catch (JSONException unused) {
                    Log.w(LOG_TAG, "Index of Feature in Feature Collection that could not be created: " + i8);
                }
            }
            return arrayList;
        } catch (JSONException unused2) {
            Log.w(LOG_TAG, "Feature Collection could not be created.");
            return arrayList;
        }
    }

    private void parseGeoJson() {
        try {
            String string = this.mGeoJsonFile.getString("type");
            if (string.equals(FEATURE)) {
                GeoJsonFeature parseFeature = parseFeature(this.mGeoJsonFile);
                if (parseFeature != null) {
                    this.mGeoJsonFeatures.add(parseFeature);
                }
            } else if (string.equals(FEATURE_COLLECTION)) {
                this.mGeoJsonFeatures.addAll(parseFeatureCollection(this.mGeoJsonFile));
            } else if (isGeometry(string)) {
                GeoJsonFeature parseGeometryToFeature = parseGeometryToFeature(this.mGeoJsonFile);
                if (parseGeometryToFeature != null) {
                    this.mGeoJsonFeatures.add(parseGeometryToFeature);
                }
            } else {
                Log.w(LOG_TAG, "GeoJSON file could not be parsed.");
            }
        } catch (JSONException unused) {
            Log.w(LOG_TAG, "GeoJSON file could not be parsed.");
        }
    }

    public static Geometry parseGeometry(JSONObject jSONObject) {
        String string;
        JSONArray jSONArray;
        try {
            string = jSONObject.getString("type");
        } catch (JSONException unused) {
        }
        if (!string.equals(GEOMETRY_COLLECTION)) {
            if (isGeometry(string)) {
                jSONArray = jSONObject.getJSONArray(GEOMETRY_COORDINATES_ARRAY);
            }
            return null;
        }
        jSONArray = jSONObject.getJSONArray(GEOMETRY_COLLECTION_ARRAY);
        return createGeometry(string, jSONArray);
    }

    private static GeoJsonFeature parseGeometryToFeature(JSONObject jSONObject) {
        Geometry parseGeometry = parseGeometry(jSONObject);
        if (parseGeometry != null) {
            return new GeoJsonFeature(parseGeometry, null, new HashMap(), null);
        }
        Log.w(LOG_TAG, "Geometry could not be parsed");
        return null;
    }

    private static HashMap<String, String> parseProperties(JSONObject jSONObject) {
        HashMap<String, String> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.isNull(next) ? null : jSONObject.getString(next));
        }
        return hashMap;
    }

    public LatLngBounds getBoundingBox() {
        return this.mBoundingBox;
    }

    public ArrayList<GeoJsonFeature> getFeatures() {
        return this.mGeoJsonFeatures;
    }
}
