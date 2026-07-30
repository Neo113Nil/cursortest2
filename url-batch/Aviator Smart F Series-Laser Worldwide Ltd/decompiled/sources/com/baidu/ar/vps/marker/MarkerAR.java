package com.baidu.ar.vps.marker;

import android.opengl.Matrix;
import android.text.TextUtils;
import android.util.Log;
import com.baidu.ar.ab;
import com.baidu.ar.arplay.representation.Matrixf4x4;
import com.baidu.ar.arplay.representation.Vector3f;
import com.baidu.ar.arplay.representation.Vector4f;
import com.baidu.ar.b3;
import com.baidu.ar.be;
import com.baidu.ar.c0;
import com.baidu.ar.ce;
import com.baidu.ar.e3;
import com.baidu.ar.g6;
import com.baidu.ar.ha;
import com.baidu.ar.ia;
import com.baidu.ar.j0;
import com.baidu.ar.ja;
import com.baidu.ar.k0;
import com.baidu.ar.k6;
import com.baidu.ar.k9;
import com.baidu.ar.ka;
import com.baidu.ar.kb;
import com.baidu.ar.m7;
import com.baidu.ar.marker.IMakerAxisCallback;
import com.baidu.ar.marker.IMarker;
import com.baidu.ar.marker.IMarkerLocationTimeCallBack;
import com.baidu.ar.marker.IMarkerStateListener;
import com.baidu.ar.marker.MarkerFrameInfo;
import com.baidu.ar.marker.OnCoordinateBoundListener;
import com.baidu.ar.marker.OnEulerAngleCallback;
import com.baidu.ar.marker.OnTrackerSessionCallback;
import com.baidu.ar.marker.PositioningModuleAddListener;
import com.baidu.ar.marker.TrackerType;
import com.baidu.ar.marker.model.Existance;
import com.baidu.ar.marker.model.LocationMarkerData;
import com.baidu.ar.marker.model.Segments;
import com.baidu.ar.marker.model.TranslationPrior;
import com.baidu.ar.mb;
import com.baidu.ar.n7;
import com.baidu.ar.p8;
import com.baidu.ar.q7;
import com.baidu.ar.s2;
import com.baidu.ar.statistic.StatisticApi;
import com.baidu.ar.statistic.StatisticConstants;
import com.baidu.ar.t2;
import com.baidu.ar.v;
import com.baidu.ar.v6;
import com.baidu.ar.v8;
import com.baidu.ar.w9;
import com.baidu.ar.z2;
import com.baidu.ar.z5;
import com.github.mikephil.charting.utils.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MarkerAR extends c0 implements IMarker, v6, z2.a {
    public OnTrackerSessionCallback A;
    public OnEulerAngleCallback B;
    public IMakerAxisCallback C;
    public IMarkerLocationTimeCallBack D;
    public k6 E;
    public ka G;
    public ia H;
    public ha I;
    public w9 J;
    public ce K;
    public boolean L;
    public PositioningModuleAddListener M;
    public p8 N;
    public int O;
    public boolean R;
    public boolean U;
    public boolean V;
    public float[] X;
    public boolean Y;
    public float[] Z;

    /* renamed from: e0, reason: collision with root package name */
    public TrackerType f3517e0;

    /* renamed from: f0, reason: collision with root package name */
    public f f3518f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f3519g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f3520h0;

    /* renamed from: v, reason: collision with root package name */
    public be f3521v;

    /* renamed from: w, reason: collision with root package name */
    public n7 f3522w;

    /* renamed from: x, reason: collision with root package name */
    public IMarkerStateListener f3523x;

    /* renamed from: y, reason: collision with root package name */
    public k9 f3524y;

    /* renamed from: z, reason: collision with root package name */
    public OnCoordinateBoundListener f3525z;
    public float F = 0.0f;
    public HashMap<String, Object> P = null;
    public float[] Q = new float[16];
    public float[] S = null;
    public int T = -1;
    public t2 W = new t2();

    /* renamed from: a0, reason: collision with root package name */
    public z2 f3513a0 = new z2(10000);

    /* renamed from: b0, reason: collision with root package name */
    public z2 f3514b0 = new z2(30000);

    /* renamed from: c0, reason: collision with root package name */
    public List<Segments> f3515c0 = new ArrayList();

    /* renamed from: d0, reason: collision with root package name */
    public int f3516d0 = -1;

    public class a implements v {
        public a() {
        }

        @Override // com.baidu.ar.v
        public void a() {
            MarkerAR markerAR = MarkerAR.this;
            markerAR.R = markerAR.I.a((g6) MarkerAR.this.H);
            if (MarkerAR.this.R) {
                MarkerAR.this.I.b(MarkerAR.this.H);
                MarkerAR.this.I.c(MarkerAR.this.H);
                MarkerAR.this.J = new w9("Geo", com.baidu.ar.vps.marker.a.GeoHeading.f3551a);
                MarkerAR.this.J.a(MarkerAR.this.I);
                MarkerAR.this.I.a((z5) MarkerAR.this.J);
                MarkerAR.this.I.b(MarkerAR.this.J);
                MarkerAR.this.I.c(MarkerAR.this.J);
                if (MarkerAR.this.S != null) {
                    MarkerAR markerAR2 = MarkerAR.this;
                    markerAR2.updateLocation(markerAR2.S, MarkerAR.this.T, MarkerAR.this.U);
                }
                if (MarkerAR.this.f3514b0 != null) {
                    MarkerAR.this.f3514b0.a(new h(MarkerAR.this, null));
                    MarkerAR.this.f3514b0.b();
                }
            }
        }
    }

    public class b implements v {
        public b() {
        }

        @Override // com.baidu.ar.v
        public void a() {
            MarkerAR markerAR = MarkerAR.this;
            markerAR.R = markerAR.I.a((g6) MarkerAR.this.G);
            if (MarkerAR.this.R) {
                MarkerAR.this.I.b(MarkerAR.this.G);
                MarkerAR.this.I.c(MarkerAR.this.G);
                MarkerAR.this.J = new w9("Geo", com.baidu.ar.vps.marker.a.GeoHeading.f3551a);
                MarkerAR.this.J.a(MarkerAR.this.I);
                MarkerAR.this.I.a((z5) MarkerAR.this.J);
                MarkerAR.this.I.b(MarkerAR.this.J);
                MarkerAR.this.I.c(MarkerAR.this.J);
            }
            if (MarkerAR.this.S != null) {
                MarkerAR markerAR2 = MarkerAR.this;
                markerAR2.updateLocation(markerAR2.S, MarkerAR.this.T, MarkerAR.this.U);
            }
            if (MarkerAR.this.f3514b0 != null) {
                MarkerAR.this.f3514b0.a(new h(MarkerAR.this, null));
                MarkerAR.this.f3514b0.b();
            }
        }
    }

    public class c implements e3 {
        public c(MarkerAR markerAR) {
        }

        @Override // com.baidu.ar.e3
        public void a(b3 b3Var) {
            Log.e("MarkerAR", "onDetected");
        }

        @Override // com.baidu.ar.e3
        public void b(kb kbVar) {
            Log.e("MarkerAR", "onRelease");
        }

        @Override // com.baidu.ar.e3
        public void a(kb kbVar) {
            Log.e("MarkerAR", "onSetup");
        }
    }

    public class d implements e3 {
        public d(MarkerAR markerAR) {
        }

        @Override // com.baidu.ar.e3
        public void a(b3 b3Var) {
            com.baidu.ar.h.a("addDetector:onDetected");
        }

        @Override // com.baidu.ar.e3
        public void b(kb kbVar) {
            com.baidu.ar.h.a("addDetector:onRelease");
        }

        @Override // com.baidu.ar.e3
        public void a(kb kbVar) {
            com.baidu.ar.h.a("addDetector:onSetup");
        }
    }

    public class e implements k0 {

        /* renamed from: a, reason: collision with root package name */
        public be f3528a;

        public e(be beVar) {
            this.f3528a = beVar;
        }

        @Override // com.baidu.ar.k0
        public void a(float f8, float f9, float f10) {
            be beVar = this.f3528a;
            if (beVar != null) {
                beVar.a(f8, f9, f10);
            }
            if (MarkerAR.this.f3524y != null) {
                MarkerAR.this.f3524y.a(new float[]{f8, f9, f10});
            }
        }
    }

    public class f implements n7 {

        /* renamed from: a, reason: collision with root package name */
        public ka f3530a;

        public f(ka kaVar) {
            this.f3530a = kaVar;
        }

        public void a() {
            this.f3530a = null;
        }

        @Override // com.baidu.ar.n7
        public void onImuUpdate(m7 m7Var) {
            ka kaVar = this.f3530a;
            if (kaVar != null && m7Var != null) {
                kaVar.d(m7Var.d());
            }
            if (MarkerAR.this.f3524y == null || m7Var == null) {
                return;
            }
            MarkerAR.this.f3524y.c(m7Var.d());
        }
    }

    public class g implements n7 {

        /* renamed from: a, reason: collision with root package name */
        public be f3532a;

        public g(be beVar) {
            this.f3532a = beVar;
        }

        @Override // com.baidu.ar.n7
        public void onImuUpdate(m7 m7Var) {
            be beVar = this.f3532a;
            if (beVar != null) {
                beVar.a(m7Var.d(), m7Var.b());
            }
            if (MarkerAR.this.f3524y == null || m7Var == null) {
                return;
            }
            MarkerAR.this.f3524y.c(m7Var.d());
        }
    }

    public class h implements z2.a {
        public h() {
        }

        @Override // com.baidu.ar.z2.a
        public void onTick() {
            if (MarkerAR.this.X != null) {
                HashMap hashMap = new HashMap();
                hashMap.put(StatisticConstants.NAVIGATION_SHOW_LAT, String.valueOf(MarkerAR.this.X[0]));
                hashMap.put(StatisticConstants.NAVIGATION_SHOW_LNG, String.valueOf(MarkerAR.this.X[1]));
                if (MarkerAR.this.Z != null) {
                    hashMap.put(StatisticConstants.NAVIGATION_SHOW_POSE, Arrays.toString(MarkerAR.this.Z));
                }
                if (MarkerAR.this.f3516d0 == 3) {
                    hashMap.put("type", "3DOF");
                }
                StatisticApi.onEvent(StatisticConstants.NAVIGATION_SHOW_TRAVEL, hashMap);
                MarkerAR.this.Y = false;
            }
        }

        public /* synthetic */ h(MarkerAR markerAR, a aVar) {
            this();
        }
    }

    @Override // com.baidu.ar.marker.IMarker
    public boolean bindingCoordinate() {
        ha haVar = this.I;
        if (haVar == null) {
            return false;
        }
        boolean e8 = haVar.e();
        this.L = e8;
        return e8;
    }

    @Override // com.baidu.ar.marker.IMarker
    public void choiceOneCoordinate(LocationMarkerData locationMarkerData) {
        be beVar = this.f3521v;
        if (beVar == null || beVar.g() == null) {
            return;
        }
        this.f3521v.g().choiceOneCoordinate(locationMarkerData);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void clearNavigationRoute() {
        if (this.V) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("event_name", "__reset_navigation_route");
            a(hashMap);
        }
    }

    @Override // com.baidu.ar.marker.IMarker
    public void clearRoute() {
        if (this.V) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("event_name", "__remove_navi_route");
            a(hashMap);
        }
    }

    @Override // com.baidu.ar.marker.IMarker
    public float[] convertLatLngFromPosition(float f8, float f9) {
        return this.I.a(new float[]{f8, f9, 0.0f, 1.0f});
    }

    @Override // com.baidu.ar.marker.IMarker
    public float[] convertPositionFromLatlng(float[] fArr) {
        return this.I.c(new float[]{fArr[0], fArr[1]});
    }

    @Override // com.baidu.ar.marker.IMarker
    public void createSession() {
        be beVar = this.f3521v;
        if (beVar == null || beVar.g() == null) {
            return;
        }
        this.f3521v.g().createSession(this.f3517e0);
    }

    @Override // com.baidu.ar.marker.IMarker
    public float[] getGeolocationByTransform() {
        com.baidu.ar.h.a("MarkerAR", "getGeolocationByTransform");
        ha haVar = this.I;
        if (haVar != null && haVar.c() != null) {
            return new float[]{this.I.c().f2613a.f3192b, this.I.c().f2613a.f3191a};
        }
        com.baidu.ar.h.a("MarkerAR", "mPositionService is null or geoLocationFromLocal is null");
        return new float[2];
    }

    @Override // com.baidu.ar.marker.IMarker
    public void hideFinalPoint() {
        if (this.V) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("event_name", "__hide_final_point");
            a(hashMap);
        }
    }

    @Override // com.baidu.ar.marker.IMarker
    public void hideNavigationContent() {
        if (this.V) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("event_name", "__vpas_content_res_hide");
            a(hashMap);
        }
    }

    public final void i() {
        if (this.I == null) {
            ha haVar = new ha();
            this.I = haVar;
            haVar.a(this);
            Matrix.setIdentityM(this.Q, 0);
        }
    }

    @Override // com.baidu.ar.marker.IMarker
    public void initMarkerByTrackerType(TrackerType trackerType) {
        be beVar = this.f3521v;
        if (beVar == null || beVar.g() == null) {
            return;
        }
        this.f3521v.g().initMarkerByTrackerType(trackerType);
    }

    @Override // com.baidu.ar.marker.IMarker
    public float[] location2ScreenPoint(float[] fArr) {
        return d() != null ? d().location2ScreenPoint(fArr) : new float[0];
    }

    @Override // com.baidu.ar.c0
    public void onCaseCreate(String str) {
        super.onCaseCreate(str);
        this.V = true;
    }

    @Override // com.baidu.ar.c0
    public void onCaseDestroy() {
        this.V = false;
        super.onCaseDestroy();
    }

    @Override // com.baidu.ar.z2.a
    public void onTick() {
    }

    @Override // com.baidu.ar.marker.IMarker
    public void openDataMock() {
        this.f3519g0 = true;
    }

    @Override // com.baidu.ar.marker.IMarker
    public void openDataRecorde() {
        if (ab.a("com.baidu.ar.maprecord.NavigationRecoderController", c().getClassLoader())) {
            int intValue = ((Integer) this.P.get("camera_input_width")).intValue();
            int intValue2 = ((Integer) this.P.get("camera_input_height")).intValue();
            if (this.f3524y == null) {
                this.f3524y = new k9(c(), intValue, intValue2);
            }
            k9 k9Var = this.f3524y;
            if (k9Var != null) {
                a(k9Var, (e3) null);
            }
        }
    }

    @Override // com.baidu.ar.c0, com.baidu.ar.cloud.ICloudIR
    public void pause() {
        super.pause();
        be beVar = this.f3521v;
        if (beVar != null) {
            beVar.h();
            j0.a().b();
        }
        k9 k9Var = this.f3524y;
        if (k9Var != null) {
            k9Var.g();
            this.f3524y = null;
        }
        this.f3520h0 = false;
        this.L = false;
        ia iaVar = this.H;
        if (iaVar != null) {
            iaVar.e();
        }
        f fVar = this.f3518f0;
        if (fVar != null) {
            fVar.a();
            this.f3518f0 = null;
        }
        this.H = null;
        this.J = null;
        ha haVar = this.I;
        if (haVar != null) {
            haVar.a();
        }
        a(this.f3522w);
    }

    @Override // com.baidu.ar.v6
    public void positioningServiceDidUpdateGeoHeading(float f8, float f9) {
        IMarkerStateListener iMarkerStateListener = this.f3523x;
        if (iMarkerStateListener != null) {
            iMarkerStateListener.compassResult(f8);
        }
    }

    @Override // com.baidu.ar.v6
    public void positioningServiceDidUpdateGeoLocalTransform() {
        OnCoordinateBoundListener onCoordinateBoundListener = this.f3525z;
        if (onCoordinateBoundListener != null) {
            onCoordinateBoundListener.onCoordinateBound();
        }
    }

    @Override // com.baidu.ar.v6
    public void positioningServiceDidUpdateLocalTransform(float[] fArr) {
        if (fArr == null || fArr.length <= 0) {
            return;
        }
        if (!this.Y) {
            this.Y = true;
            this.Z = new float[16];
            for (int i8 = 0; i8 < fArr.length; i8++) {
                this.Z[i8] = fArr[i8];
            }
        }
        Matrixf4x4 matrixf4x4 = new Matrixf4x4();
        matrixf4x4.setMatrixValues(fArr);
        if (d() != null && this.V) {
            d().updateTransforms(matrixf4x4);
            k9 k9Var = this.f3524y;
            if (k9Var != null) {
                k9Var.b(matrixf4x4.matrix);
            }
        }
        float f8 = fArr[12];
        float f9 = fArr[13];
        float f10 = fArr[14];
        this.F = f10;
        int i9 = this.O + 1;
        this.O = i9;
        if (i9 >= 30) {
            this.O = 0;
            a(new Vector3f(f8, f9, f10));
        }
    }

    @Override // com.baidu.ar.v6
    public void positioningServiceDidupdateGeoLocation(ja jaVar) {
    }

    @Override // com.baidu.ar.marker.IMarker
    public void postARRoute(List<Vector3f> list) {
        HashMap hashMap = new HashMap();
        for (int i8 = 0; i8 < list.size(); i8++) {
            hashMap.put(String.valueOf(i8), list.get(i8));
        }
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("event_name", "__add_navi_route");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("ctrl_points", hashMap);
        hashMap3.put("ctrl_points_count", Integer.valueOf(hashMap.size()));
        hashMap2.put("event_data", hashMap3);
        a(hashMap2);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void postArrow(float f8, float f9, float f10, float f11, int i8) {
        Vector3f vector3f = new Vector3f();
        vector3f.setX(f8);
        vector3f.setY(f9);
        vector3f.setZ(this.F - f11);
        Vector3f vector3f2 = new Vector3f();
        vector3f2.setX(0.5f);
        vector3f2.setY(0.5f);
        vector3f2.setZ(0.5f);
        a("__add_navi_arrow", vector3f, vector3f2, mb.a(f8, f9, i8), "" + System.currentTimeMillis());
    }

    @Override // com.baidu.ar.marker.IMarker
    public void postFinalArrow(String str, double[] dArr) {
        if (this.f3521v.g().getLocationTransforms() == null) {
            return;
        }
        float[] a8 = a(new float[]{(float) dArr[0], (float) dArr[1], 0.0f, 1.0f}, new double[]{r0[0], r0[1], r0[2], i.DOUBLE_EPSILON, r0[3], r0[4], r0[5], i.DOUBLE_EPSILON, r0[6], r0[7], r0[8], i.DOUBLE_EPSILON, r0[9], r0[10], r0[11], 1.0d});
        Vector3f vector3f = new Vector3f();
        vector3f.setX(a8[0]);
        vector3f.setY(a8[1]);
        vector3f.setZ(this.F - 1.0f);
        Vector3f vector3f2 = new Vector3f();
        vector3f2.setX(0.5f);
        vector3f2.setY(0.5f);
        vector3f2.setZ(0.5f);
        a("__show_final_point", vector3f, vector3f2, new Vector4f(0.0f, 0.0f, 0.0f, 1.0f), str);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void postLiftDown(double[] dArr, float f8) {
        a(dArr, f8, "__show_navi_lift_down");
    }

    @Override // com.baidu.ar.marker.IMarker
    public void postLiftUp(double[] dArr, float f8) {
        a(dArr, f8, "__show_navi_lift_up");
    }

    @Override // com.baidu.ar.marker.IMarker
    public void postNavigationRoute(List<Segments> list) {
        if (list == null || list.size() <= 0 || this.I == null || !this.V) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        new ArrayList();
        this.f3515c0 = list;
        ArrayList arrayList = new ArrayList();
        char c8 = 0;
        int i8 = 0;
        while (i8 < list.size()) {
            Segments segments = list.get(i8);
            List<double[]> points = segments.getPoints();
            ArrayList arrayList2 = new ArrayList();
            JSONArray jSONArray2 = new JSONArray();
            int i9 = 0;
            while (i9 < points.size()) {
                ha haVar = this.I;
                float[] fArr = new float[2];
                fArr[c8] = (float) points.get(i9)[c8];
                int i10 = i8;
                fArr[1] = (float) points.get(i9)[1];
                float[] c9 = haVar.c(fArr);
                if (c9 == null) {
                    return;
                }
                arrayList2.add(new Vector3f(c9[0], c9[1], 0.0f));
                try {
                    JSONArray jSONArray3 = new JSONArray();
                    jSONArray3.put((float) points.get(i9)[0]);
                    jSONArray3.put((float) points.get(i9)[1]);
                    jSONArray2.put(jSONArray3);
                } catch (JSONException e8) {
                    e8.printStackTrace();
                }
                i9++;
                i8 = i10;
                c8 = 0;
            }
            int i11 = i8;
            Existance existance = segments.getExistance();
            int pointsCount = segments.getPointsCount();
            HashMap hashMap = new HashMap();
            hashMap.put("points_count", Integer.valueOf(pointsCount));
            hashMap.put("points", arrayList2);
            float[] c10 = this.I.c(new float[]{(float) existance.getLatlng()[0], (float) existance.getLatlng()[1]});
            HashMap hashMap2 = new HashMap();
            hashMap2.put("location", new Vector3f(c10[0], c10[1], 0.0f));
            hashMap2.put("type", existance.getType());
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("points", jSONArray2);
                jSONObject.put("pointsCount", pointsCount);
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
            if (!TextUtils.isEmpty(existance.getDirectionType())) {
                hashMap2.put("direction_type", existance.getDirectionType());
            }
            if (!TextUtils.isEmpty(existance.getStreetName())) {
                hashMap2.put("street_name", existance.getStreetName());
            }
            hashMap.put("existance", hashMap2);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("type", existance.getType());
                if (!TextUtils.isEmpty(existance.getDirectionType())) {
                    jSONObject2.put("direction_type", existance.getDirectionType());
                }
                jSONObject2.put("street_name", existance.getStreetName());
                JSONArray jSONArray4 = new JSONArray();
                try {
                    jSONArray4.put(existance.getLatlng()[0]);
                    jSONArray4.put(existance.getLatlng()[1]);
                    jSONObject2.put("latlng", jSONArray4);
                    jSONObject.put("existance", jSONObject2);
                } catch (JSONException e10) {
                    e = e10;
                    e.printStackTrace();
                    jSONArray.put(jSONObject);
                    arrayList.add(hashMap);
                    Log.e("MarkerAR", segments.toString());
                    i8 = i11 + 1;
                    c8 = 0;
                }
            } catch (JSONException e11) {
                e = e11;
            }
            jSONArray.put(jSONObject);
            arrayList.add(hashMap);
            Log.e("MarkerAR", segments.toString());
            i8 = i11 + 1;
            c8 = 0;
        }
        k9 k9Var = this.f3524y;
        if (k9Var != null) {
            k9Var.a(jSONArray.toString());
        }
        HashMap hashMap3 = new HashMap();
        hashMap3.put("segment_count", "" + arrayList.size());
        hashMap3.put("segments", arrayList);
        HashMap hashMap4 = new HashMap();
        hashMap4.put("route", hashMap3);
        HashMap<String, Object> hashMap5 = new HashMap<>();
        hashMap5.put("event_name", "__update_navigation_route");
        hashMap5.put("event_data", hashMap4);
        a(hashMap5);
        a(this.S, this.U);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void postRoute(List<double[]> list) {
        float[] locationTransforms;
        be beVar = this.f3521v;
        if (beVar == null || !this.V || (locationTransforms = beVar.g().getLocationTransforms()) == null) {
            return;
        }
        double[] dArr = {locationTransforms[0], locationTransforms[1], locationTransforms[2], i.DOUBLE_EPSILON, locationTransforms[3], locationTransforms[4], locationTransforms[5], i.DOUBLE_EPSILON, locationTransforms[6], locationTransforms[7], locationTransforms[8], i.DOUBLE_EPSILON, locationTransforms[9], locationTransforms[10], locationTransforms[11], 1.0d};
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i8 = 0; i8 < list.size(); i8++) {
            double[] dArr2 = list.get(i8);
            try {
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put((float) dArr2[0]);
                jSONArray2.put((float) dArr2[1]);
                jSONArray.put(jSONArray2);
            } catch (JSONException e8) {
                e8.printStackTrace();
            }
            float[] a8 = a(new float[]{(float) dArr2[0], (float) dArr2[1], 0.0f, 1.0f}, dArr);
            Vector3f vector3f = new Vector3f();
            vector3f.setX(a8[0]);
            vector3f.setY(a8[1]);
            vector3f.setZ(0.0f);
            hashMap.put(String.valueOf(i8), vector3f);
        }
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("event_name", "__add_navi_route");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("ctrl_points", hashMap);
        hashMap3.put("ctrl_points_count", Integer.valueOf(hashMap.size()));
        hashMap2.put("event_data", hashMap3);
        a(hashMap2);
        k9 k9Var = this.f3524y;
        if (k9Var != null) {
            k9Var.a(jSONArray.toString());
        }
    }

    @Override // com.baidu.ar.c0
    public void release() {
        be beVar = this.f3521v;
        if (beVar != null) {
            beVar.release();
            j0.a().b();
            a(this.f3521v);
            this.f3521v = null;
        }
        f fVar = this.f3518f0;
        if (fVar != null) {
            fVar.a();
            this.f3518f0 = null;
        }
        k9 k9Var = this.f3524y;
        if (k9Var != null) {
            k9Var.g();
            this.f3524y.release();
            a(this.f3524y);
            this.f3524y = null;
        }
        this.f3523x = null;
        this.D = null;
        this.A = null;
        this.H = null;
        ha haVar = this.I;
        if (haVar != null) {
            haVar.a();
            this.K = null;
            this.H = null;
            this.A = null;
            this.I = null;
        }
        z2 z2Var = this.f3513a0;
        if (z2Var != null) {
            z2Var.a();
        }
        z2 z2Var2 = this.f3514b0;
        if (z2Var2 != null) {
            z2Var2.a();
        }
        super.release();
    }

    @Override // com.baidu.ar.marker.IMarker
    public void releaseMarker() {
        be beVar = this.f3521v;
        if (beVar == null || beVar.g() == null) {
            return;
        }
        this.f3521v.g().releaseAlgo();
    }

    @Override // com.baidu.ar.marker.IMarker
    public void removeAllArrow() {
        if (this.V) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("event_name", "__clear_navi_arrow");
            a(hashMap);
        }
    }

    @Override // com.baidu.ar.marker.IMarker
    public void removeArrowByArrowId(String str) {
        if (this.V) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("event_name", "__remove_navi_arrow");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("id", str);
            hashMap.put("event_data", hashMap2);
            a(hashMap);
        }
    }

    @Override // com.baidu.ar.marker.IMarker
    public void removeLiftDown() {
        if (this.V) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("event_name", "__hide_navi_lift_down");
            a(hashMap);
        }
    }

    @Override // com.baidu.ar.marker.IMarker
    public void removeLiftUp() {
        if (this.V) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("event_name", "__hide_navi_lift_up");
            a(hashMap);
        }
    }

    @Override // com.baidu.ar.marker.IMarker
    public void resetMarker() {
        be beVar = this.f3521v;
        if (beVar == null || beVar.g() == null) {
            return;
        }
        this.f3521v.g().resetAlgo();
    }

    @Override // com.baidu.ar.marker.IMarker
    public void resetNavigationController() {
        ha haVar = this.I;
        if (haVar != null) {
            haVar.a();
        }
    }

    @Override // com.baidu.ar.c0, com.baidu.ar.cloud.ICloudIR
    public void resume() {
        be beVar = this.f3521v;
        if (beVar != null) {
            beVar.i();
            j0.a().a(c(), new e(this.f3521v));
        }
        i();
    }

    @Override // com.baidu.ar.marker.IMarker
    public void runAREngineWithNavigation(PositioningModuleAddListener positioningModuleAddListener) {
        this.M = positioningModuleAddListener;
        if (this.H == null) {
            this.H = new ia("AREngine", com.baidu.ar.vps.marker.a.Local6Dof.f3551a);
        }
        this.f3516d0 = 2;
        this.H.a(this.I);
        this.H.a(new a());
    }

    @Override // com.baidu.ar.marker.IMarker
    public void runImuWithNavigation(PositioningModuleAddListener positioningModuleAddListener) {
        this.M = positioningModuleAddListener;
        if (this.G == null) {
            this.G = new ka(c());
        }
        if (!this.f3519g0) {
            if (this.f3518f0 == null) {
                this.f3518f0 = new f(this.G);
            }
            b(this.f3518f0);
        }
        this.f3516d0 = 3;
        this.G.a(this.I);
        this.G.a(new b());
        k9 k9Var = this.f3524y;
        if (k9Var != null) {
            a(k9Var, (e3) null);
        }
    }

    @Override // com.baidu.ar.marker.IMarker
    public void runPedometerWithNavigation(PositioningModuleAddListener positioningModuleAddListener) {
        if (this.K == null) {
            this.K = new ce("Pedometer-Vpas", com.baidu.ar.vps.marker.a.Local6Dof.f3551a | com.baidu.ar.vps.marker.a.GeoHeading.f3551a | com.baidu.ar.vps.marker.a.GeoLocation.f3551a);
        }
        int intValue = ((Integer) this.P.get("camera_input_width")).intValue();
        int intValue2 = ((Integer) this.P.get("camera_input_height")).intValue();
        this.K.b(this.I);
        this.f3516d0 = 1;
        if (this.f3521v == null && this.P != null) {
            be beVar = new be(c(), intValue, intValue2, this.f3523x, this.K);
            this.f3521v = beVar;
            if (!this.f3519g0) {
                b(new g(beVar));
                j0.a().a(c(), new e(this.f3521v));
            }
            b(this.P);
            this.f3521v.a(this.A);
            this.f3521v.a(this.E);
            this.f3521v.a(this.D);
            b(this.P);
            be beVar2 = this.f3521v;
            TrackerType trackerType = TrackerType.STEP_ODOMETRY_ANDROID;
            beVar2.a(trackerType);
            this.f3517e0 = trackerType;
            a(this.f3521v, new d(this));
        }
        if (positioningModuleAddListener != null) {
            positioningModuleAddListener.addPositioningResult(true);
        }
        k9 k9Var = this.f3524y;
        if (k9Var != null) {
            a(k9Var, (e3) null);
        }
    }

    @Override // com.baidu.ar.marker.IMarker
    public void runVpasWithNavigation(PositioningModuleAddListener positioningModuleAddListener) {
        HashMap<String, Object> hashMap;
        if (this.K == null) {
            this.K = new ce("Vpas", com.baidu.ar.vps.marker.a.Local6Dof.f3551a | com.baidu.ar.vps.marker.a.GeoHeading.f3551a | com.baidu.ar.vps.marker.a.GeoLocation.f3551a);
        }
        this.K.b(this.I);
        this.f3516d0 = 1;
        if (this.f3521v == null && (hashMap = this.P) != null) {
            this.f3521v = new be(c(), ((Integer) hashMap.get("camera_input_width")).intValue(), ((Integer) this.P.get("camera_input_height")).intValue(), this.f3523x, this.K);
            b(this.P);
            be beVar = this.f3521v;
            TrackerType trackerType = TrackerType.VIO_ARCORE_DATA;
            beVar.a(trackerType);
            this.f3517e0 = trackerType;
            this.f3521v.a(this.A);
            this.f3521v.a(this.D);
            this.f3521v.a(this.E);
            a(this.f3521v, new c(this));
        }
        if (positioningModuleAddListener != null) {
            positioningModuleAddListener.addPositioningResult(true);
        }
    }

    @Override // com.baidu.ar.marker.IMarker
    public void setAvailableFrame(MarkerFrameInfo markerFrameInfo) {
        be beVar = this.f3521v;
        if (beVar != null) {
            beVar.a(markerFrameInfo);
        }
        if (markerFrameInfo != null) {
            b(markerFrameInfo.getScaleY());
            ia iaVar = this.H;
            if (iaVar != null) {
                float[] a8 = iaVar.a(markerFrameInfo.getTrackingState(), markerFrameInfo.getOrignalTransform());
                OnEulerAngleCallback onEulerAngleCallback = this.B;
                if (onEulerAngleCallback != null) {
                    onEulerAngleCallback.onEulerAngleUpdate(a8);
                }
            }
            k9 k9Var = this.f3524y;
            if (k9Var != null) {
                k9Var.a(markerFrameInfo.getOrignalTransform(), markerFrameInfo.getTrackingState());
            }
        }
    }

    @Override // com.baidu.ar.marker.IMarker
    public void setAxisCallback(IMakerAxisCallback iMakerAxisCallback) {
        this.C = iMakerAxisCallback;
    }

    @Override // com.baidu.ar.marker.IMarker
    public void setCoordinateBoundListener(OnCoordinateBoundListener onCoordinateBoundListener) {
        this.f3525z = onCoordinateBoundListener;
    }

    @Override // com.baidu.ar.marker.IMarker
    public void setEulerAngleCallback(OnEulerAngleCallback onEulerAngleCallback) {
        this.B = onEulerAngleCallback;
    }

    @Override // com.baidu.ar.marker.IMarker
    public void setLocationTimeCallBack(IMarkerLocationTimeCallBack iMarkerLocationTimeCallBack) {
        this.D = iMarkerLocationTimeCallBack;
        be beVar = this.f3521v;
        if (beVar == null || beVar.g() == null) {
            return;
        }
        this.f3521v.g().setMarkerLocationTimeCallBack(this.D);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void setMarkerARSetupCallback(p8 p8Var) {
        this.N = p8Var;
    }

    @Override // com.baidu.ar.marker.IMarker
    public void setMarkerStateListener(IMarkerStateListener iMarkerStateListener) {
        this.f3523x = iMarkerStateListener;
    }

    @Override // com.baidu.ar.marker.IMarker
    public void setPositionCallback(k6 k6Var) {
        this.E = k6Var;
    }

    @Override // com.baidu.ar.marker.IMarker
    public void setTrackerSessionCallback(OnTrackerSessionCallback onTrackerSessionCallback) {
        this.A = onTrackerSessionCallback;
        be beVar = this.f3521v;
        if (beVar != null) {
            beVar.a(onTrackerSessionCallback);
        }
    }

    @Override // com.baidu.ar.c0
    public void setup(HashMap<String, Object> hashMap) {
        super.setup(hashMap);
        this.P = hashMap;
        i();
        p8 p8Var = this.N;
        if (p8Var != null) {
            p8Var.a();
        }
    }

    @Override // com.baidu.ar.marker.IMarker
    public void showNavigationContent() {
        if (this.V) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("event_name", "__vpas_content_res_show");
            a(hashMap);
        }
    }

    @Override // com.baidu.ar.marker.IMarker
    public void test() {
    }

    @Override // com.baidu.ar.marker.IMarker
    public void updateHeading(float f8, float f9) {
        w9 w9Var = this.J;
        if (w9Var != null) {
            w9Var.a(f8, f9);
            if (this.L && this.W.a(f9)) {
                f();
            }
            h();
            g();
        }
        k9 k9Var = this.f3524y;
        if (k9Var != null) {
            k9Var.a(f8, f9);
        }
    }

    @Override // com.baidu.ar.marker.IMarker
    public void updateImuData(float[] fArr) {
        ka kaVar = this.G;
        if (kaVar != null && fArr != null) {
            kaVar.d(fArr);
        }
        be beVar = this.f3521v;
        if (beVar != null) {
            beVar.a(fArr, (float[]) null);
        }
    }

    @Override // com.baidu.ar.marker.IMarker
    public void updateLocation(float[] fArr, int i8, boolean z7) {
        if (fArr == null || fArr.length <= 0) {
            return;
        }
        this.S = fArr;
        this.T = i8;
        this.U = z7;
        k9 k9Var = this.f3524y;
        if (k9Var != null) {
            k9Var.a(fArr, i8, z7);
        }
        this.X = new float[]{fArr[0], fArr[1]};
        if (this.J != null) {
            ja jaVar = new ja();
            s2 s2Var = new s2();
            s2Var.f3192b = fArr[0];
            s2Var.f3191a = fArr[1];
            jaVar.f2613a = s2Var;
            this.J.a(jaVar);
            if (this.L && this.W.a(fArr, i8)) {
                f();
            }
            if (this.I != null && this.L && this.V) {
                a(fArr, z7);
            }
        }
    }

    @Override // com.baidu.ar.marker.IMarker
    public void updateMeters(float f8) {
        if (this.V) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("event_name", "__ar_navi_update_meters");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("meters", Float.valueOf(f8));
            hashMap.put("event_data", hashMap2);
            a(hashMap);
        }
        k9 k9Var = this.f3524y;
        if (k9Var != null) {
            k9Var.a(f8);
        }
    }

    @Override // com.baidu.ar.marker.IMarker
    public void updateMockAccelerometer(float f8, float f9, float f10) {
        be beVar = this.f3521v;
        if (beVar != null) {
            beVar.a(f8, f9, f10);
        }
    }

    @Override // com.baidu.ar.marker.IMarker
    public void updateTransformData(int i8, float[] fArr) {
        ia iaVar = this.H;
        if (iaVar != null) {
            iaVar.a(i8, fArr);
        }
    }

    @Override // com.baidu.ar.marker.IMarker
    public void updateTranslationPrior(TranslationPrior translationPrior) {
        be beVar = this.f3521v;
        if (beVar == null || beVar.g() == null) {
            return;
        }
        this.f3521v.g().updateTranslationPrior(translationPrior);
    }

    public final void a(float f8) {
        if (!this.V || f8 <= 0.0f) {
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("event_name", "__update_fov");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("fov", Float.valueOf(f8));
        hashMap.put("event_data", hashMap2);
        a(hashMap);
    }

    public final void b(float f8) {
        if (f8 <= 0.0f) {
            return;
        }
        a(f8);
    }

    public final void f() {
        bindingCoordinate();
        if (this.f3515c0.size() > 0) {
            postNavigationRoute(this.f3515c0);
        }
    }

    public final void g() {
        w9 w9Var;
        if (this.f3516d0 != 3 || this.L || (w9Var = this.J) == null || !w9Var.h()) {
            return;
        }
        boolean e8 = this.I.e();
        PositioningModuleAddListener positioningModuleAddListener = this.M;
        if (positioningModuleAddListener != null) {
            positioningModuleAddListener.addPositioningResult(e8);
        }
        this.L = e8;
    }

    public final void h() {
        w9 w9Var;
        ia iaVar;
        if (this.L || this.f3520h0 || !this.R || (w9Var = this.J) == null || !w9Var.a() || !this.J.h() || (iaVar = this.H) == null || !iaVar.d()) {
            return;
        }
        boolean bindingCoordinate = bindingCoordinate();
        this.f3520h0 = true;
        PositioningModuleAddListener positioningModuleAddListener = this.M;
        if (positioningModuleAddListener != null) {
            positioningModuleAddListener.addPositioningResult(bindingCoordinate);
        }
    }

    @Override // com.baidu.ar.marker.IMarker
    public void postArrow(String str, int i8, double[] dArr, double[] dArr2, double[] dArr3, float f8, float f9) {
        float[] locationTransforms = this.f3521v.g().getLocationTransforms();
        this.K.b();
        if (locationTransforms == null) {
            return;
        }
        float[] fArr = {(float) dArr[0], (float) dArr[1], 0.0f, 1.0f};
        float[] fArr2 = {(float) dArr2[0], (float) dArr2[1], 0.0f, 1.0f};
        double[] dArr4 = {locationTransforms[0], locationTransforms[1], locationTransforms[2], i.DOUBLE_EPSILON, locationTransforms[3], locationTransforms[4], locationTransforms[5], i.DOUBLE_EPSILON, locationTransforms[6], locationTransforms[7], locationTransforms[8], i.DOUBLE_EPSILON, locationTransforms[9], locationTransforms[10], locationTransforms[11], 1.0d};
        float[] a8 = a(fArr, dArr4);
        float[] a9 = a(fArr2, dArr4);
        Vector3f vector3f = new Vector3f();
        vector3f.setX(a8[0]);
        vector3f.setY(a8[1]);
        vector3f.setZ(this.F - f9);
        Vector3f vector3f2 = new Vector3f();
        vector3f2.setX(f8);
        vector3f2.setY(f8);
        vector3f2.setZ(f8);
        Vector4f a10 = mb.a(a9[0] - a8[0], a9[1] - a8[1], i8);
        a("__add_navi_arrow", vector3f, vector3f2, a10, str);
        com.baidu.ar.h.a("post", "positionVec:" + Arrays.toString(vector3f.toArray()) + ",rotationVec :" + Arrays.toString(a10.toArray()));
    }

    public final void a(Vector3f vector3f) {
        if (this.V) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("event_name", "__vpas_update_user_position");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("position", vector3f);
            hashMap.put("event_data", hashMap2);
            a(hashMap);
        }
    }

    public final void b(n7 n7Var) {
        q7 q7Var = new q7();
        q7Var.a(com.baidu.ar.imu.a.WORLD);
        q7Var.a(0);
        q7Var.c(false);
        q7Var.b(true);
        q7Var.a(true);
        a(q7Var, n7Var);
    }

    public final void a(String str, Vector3f vector3f, Vector3f vector3f2, Vector4f vector4f) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("event_name", str);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("position", vector3f);
        hashMap2.put("scale", vector3f2);
        hashMap2.put("rotation", vector4f);
        hashMap.put("event_data", hashMap2);
        a(hashMap);
    }

    public final void b(HashMap<String, Object> hashMap) {
        String str;
        if (hashMap != null) {
            double[] dArr = new double[2];
            String str2 = null;
            try {
                dArr[0] = ((Double) hashMap.get("lat")).doubleValue();
                dArr[1] = ((Double) hashMap.get("lng")).doubleValue();
            } catch (Exception unused) {
                com.baidu.ar.h.b("MarkerAR", "initMarker gpsInfo error!!!");
                dArr = null;
            }
            try {
                str = (String) hashMap.get("building_id");
            } catch (Exception unused2) {
                com.baidu.ar.h.b("MarkerAR", "initMarker buildingId error!!!");
                str = null;
            }
            this.f3521v.g().setMapIndoorParams(dArr, str);
            try {
                str2 = (String) hashMap.get("cuid");
            } catch (Exception unused3) {
                com.baidu.ar.h.b("MarkerAR", "initMarker cuid error!!!");
            }
            this.f3521v.g().setBaiduMapCuid(str2);
        }
    }

    public final void a(String str, Vector3f vector3f, Vector3f vector3f2, Vector4f vector4f, String str2) {
        if (this.V) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("event_name", str);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("position", vector3f);
            hashMap2.put("scale", vector3f2);
            hashMap2.put("id", str2);
            hashMap2.put("rotation", vector4f);
            hashMap.put("event_data", hashMap2);
            a(hashMap);
        }
    }

    public final void a(double[] dArr, float f8, String str) {
        float[] locationTransforms;
        be beVar = this.f3521v;
        if (beVar == null || dArr == null || dArr.length <= 0 || (locationTransforms = beVar.g().getLocationTransforms()) == null) {
            return;
        }
        float[] a8 = a(new float[]{(float) dArr[0], (float) dArr[1], 0.0f, 1.0f}, new double[]{locationTransforms[0], locationTransforms[1], locationTransforms[2], i.DOUBLE_EPSILON, locationTransforms[3], locationTransforms[4], locationTransforms[5], i.DOUBLE_EPSILON, locationTransforms[6], locationTransforms[7], locationTransforms[8], i.DOUBLE_EPSILON, locationTransforms[9], locationTransforms[10], locationTransforms[11], 1.0d});
        Vector3f vector3f = new Vector3f();
        vector3f.setX(a8[0]);
        vector3f.setY(a8[1]);
        vector3f.setZ(this.F - 1.0f);
        Vector3f vector3f2 = new Vector3f();
        vector3f2.setX(f8);
        vector3f2.setY(f8);
        vector3f2.setZ(f8);
        a(str, vector3f, vector3f2, new Vector4f(0.0f, 0.0f, 0.0f, 1.0f));
    }

    public final void a(float[] fArr, boolean z7) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("event_name", "__update_located_location");
        HashMap hashMap2 = new HashMap();
        float[] c8 = this.I.c(new float[]{fArr[0], fArr[1]});
        if (c8 == null) {
            return;
        }
        hashMap2.put("location", new Vector3f(c8[0], c8[1], 0.0f));
        hashMap2.put("on_route", Integer.valueOf(z7 ? 1 : 0));
        hashMap.put("event_data", hashMap2);
        a(hashMap);
    }

    public final float[] a(float[] fArr, double[] dArr) {
        float[] fArr2 = new float[16];
        v8.a(fArr2, 0, dArr, 0);
        float[] fArr3 = new float[4];
        Matrix.multiplyMV(fArr3, 0, fArr2, 0, fArr, 0);
        return new float[]{fArr3[0], fArr3[1]};
    }
}
