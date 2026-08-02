package com.squareup.cash.work.presenters.shift.geofence;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.gps.backend.api.Location;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.work.identifiers.LocationIdentifier;
import com.squareup.cash.work.presenters.shift.geofence.GeofenceStatus;
import com.squareup.cash.work.screens.ClockInBottomSheetScreen;
import com.squareup.cash.work.screens.LocationClockInControls;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;

/* loaded from: classes7.dex */
public final class GeofenceStateResolver {
    public static final Set IMPERIAL_COUNTRY_CODES = ArraysKt___ArraysKt.toSet(new String[]{"US", "LR", "MM"});
    public final AndroidStringManager stringManager;

    public interface GeofenceAction {

        public final class OpenSettings implements GeofenceAction {
            public final String text;

            public OpenSettings(String str) {
                str.getClass();
                this.text = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenSettings) && Intrinsics.areEqual(this.text, ((OpenSettings) obj).text);
            }

            public final int hashCode() {
                return this.text.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenSettings(text=", this.text, ")");
            }
        }

        public final class RequestLocationPermission implements GeofenceAction {
            public final String text;

            public RequestLocationPermission(String str) {
                str.getClass();
                this.text = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RequestLocationPermission) && Intrinsics.areEqual(this.text, ((RequestLocationPermission) obj).text);
            }

            public final int hashCode() {
                return this.text.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RequestLocationPermission(text=", this.text, ")");
            }
        }
    }

    public final class GeofenceResolution {
        public final boolean isAllowed;
        public final GeofenceAction reasonAction;
        public final String reasonText;
        public final GeofenceStatus status;

        public GeofenceResolution(GeofenceStatus geofenceStatus, String str, GeofenceAction geofenceAction, boolean z) {
            this.status = geofenceStatus;
            this.reasonText = str;
            this.reasonAction = geofenceAction;
            this.isAllowed = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GeofenceResolution)) {
                return false;
            }
            GeofenceResolution geofenceResolution = (GeofenceResolution) obj;
            return this.status.equals(geofenceResolution.status) && Intrinsics.areEqual(this.reasonText, geofenceResolution.reasonText) && Intrinsics.areEqual(this.reasonAction, geofenceResolution.reasonAction) && this.isAllowed == geofenceResolution.isAllowed;
        }

        public final int hashCode() {
            int hashCode = this.status.hashCode() * 31;
            String str = this.reasonText;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            GeofenceAction geofenceAction = this.reasonAction;
            return Boolean.hashCode(this.isAllowed) + ((hashCode2 + (geofenceAction != null ? geofenceAction.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "GeofenceResolution(status=" + this.status + ", reasonText=" + this.reasonText + ", reasonAction=" + this.reasonAction + ", isAllowed=" + this.isAllowed + ")";
        }
    }

    public final class RadiusText {
        public final String unit;
        public final String value;

        public RadiusText(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.value = str;
            this.unit = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RadiusText)) {
                return false;
            }
            RadiusText radiusText = (RadiusText) obj;
            return Intrinsics.areEqual(this.value, radiusText.value) && Intrinsics.areEqual(this.unit, radiusText.unit);
        }

        public final int hashCode() {
            return this.unit.hashCode() + (this.value.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("RadiusText(value=", this.value, ", unit=", this.unit, ")");
        }
    }

    public final class ReasonText {
        public final GeofenceAction action;
        public final String text;

        public ReasonText(String str, GeofenceAction geofenceAction) {
            str.getClass();
            this.text = str;
            this.action = geofenceAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReasonText)) {
                return false;
            }
            ReasonText reasonText = (ReasonText) obj;
            return Intrinsics.areEqual(this.text, reasonText.text) && Intrinsics.areEqual(this.action, reasonText.action);
        }

        public final int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            GeofenceAction geofenceAction = this.action;
            return hashCode + (geofenceAction == null ? 0 : geofenceAction.hashCode());
        }

        public final String toString() {
            return "ReasonText(text=" + this.text + ", action=" + this.action + ")";
        }
    }

    public final class SelectedLocationGeofenceInput {
        public final boolean canUseGeofencing;
        public final double geofenceRadiusInMeters;
        public final boolean isGeofencingEnabled;
        public final Double latitude;
        public final String locationName;
        public final Double longitude;

        public SelectedLocationGeofenceInput(boolean z, boolean z2, double d, Double d2, Double d3, String str) {
            this.canUseGeofencing = z;
            this.isGeofencingEnabled = z2;
            this.geofenceRadiusInMeters = d;
            this.latitude = d2;
            this.longitude = d3;
            this.locationName = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectedLocationGeofenceInput)) {
                return false;
            }
            SelectedLocationGeofenceInput selectedLocationGeofenceInput = (SelectedLocationGeofenceInput) obj;
            return this.canUseGeofencing == selectedLocationGeofenceInput.canUseGeofencing && this.isGeofencingEnabled == selectedLocationGeofenceInput.isGeofencingEnabled && Double.compare(this.geofenceRadiusInMeters, selectedLocationGeofenceInput.geofenceRadiusInMeters) == 0 && Intrinsics.areEqual((Object) this.latitude, (Object) selectedLocationGeofenceInput.latitude) && Intrinsics.areEqual((Object) this.longitude, (Object) selectedLocationGeofenceInput.longitude) && this.locationName.equals(selectedLocationGeofenceInput.locationName);
        }

        public final int hashCode() {
            int m = Fragment$5$$ExternalSyntheticOutline0.m(this.geofenceRadiusInMeters, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.canUseGeofencing) * 31, 31, this.isGeofencingEnabled), 31);
            Double d = this.latitude;
            int hashCode = (m + (d == null ? 0 : d.hashCode())) * 31;
            Double d2 = this.longitude;
            return this.locationName.hashCode() + ((hashCode + (d2 != null ? d2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("SelectedLocationGeofenceInput(canUseGeofencing=", ", isGeofencingEnabled=", ", geofenceRadiusInMeters=", this.canUseGeofencing, this.isGeofencingEnabled);
            m.append(this.geofenceRadiusInMeters);
            m.append(", latitude=");
            m.append(this.latitude);
            m.append(", longitude=");
            m.append(this.longitude);
            m.append(", locationName=");
            m.append(this.locationName);
            m.append(")");
            return m.toString();
        }
    }

    public GeofenceStateResolver(AndroidStringManager androidStringManager) {
        this.stringManager = androidStringManager;
    }

    public static SelectedLocationGeofenceInput toSelectedLocationGeofenceInput(ClockInBottomSheetScreen clockInBottomSheetScreen, LocationIdentifier locationIdentifier) {
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        String str2;
        if (locationIdentifier != null && (str = locationIdentifier.token) != null) {
            Iterator it = clockInBottomSheetScreen.locationControls.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((LocationClockInControls) obj).token, str)) {
                    break;
                }
            }
            LocationClockInControls locationClockInControls = (LocationClockInControls) obj;
            if (locationClockInControls != null) {
                Iterator it2 = clockInBottomSheetScreen.locationCoordinates.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (Intrinsics.areEqual(((ClockInBottomSheetScreen.LocationCoordinates) obj2).token, str)) {
                        break;
                    }
                }
                ClockInBottomSheetScreen.LocationCoordinates locationCoordinates = (ClockInBottomSheetScreen.LocationCoordinates) obj2;
                Iterator it3 = clockInBottomSheetScreen.locations.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it3.next();
                    if (Intrinsics.areEqual(((ClockInBottomSheetScreen.LocationInfo) obj3).token, str)) {
                        break;
                    }
                }
                ClockInBottomSheetScreen.LocationInfo locationInfo = (ClockInBottomSheetScreen.LocationInfo) obj3;
                return new SelectedLocationGeofenceInput(clockInBottomSheetScreen.canUseGeofencing, locationClockInControls.isGeofencingEnabled, locationClockInControls.geofenceRadiusInMeters, locationCoordinates != null ? locationCoordinates.latitude : null, locationCoordinates != null ? locationCoordinates.longitude : null, (locationInfo == null || (str2 = locationInfo.name) == null) ? str : str2);
            }
        }
        return null;
    }

    public final ReasonText geofenceRequiredReason(SelectedLocationGeofenceInput selectedLocationGeofenceInput, RadiusText radiusText, GeofenceAction geofenceAction) {
        String str = radiusText.value;
        String str2 = radiusText.unit;
        String str3 = selectedLocationGeofenceInput.locationName;
        str.getClass();
        str2.getClass();
        ArrayMap arrayMap = new ArrayMap(3);
        arrayMap.put("location_name", str3);
        arrayMap.put("radius", str);
        arrayMap.put("unit", str2);
        Resources resources = this.stringManager.resources;
        resources.getClass();
        String format2 = new MessageFormat(resources.getString(R.string.work_shift_disclaimer_geofence_permission_required)).format(arrayMap);
        format2.getClass();
        return new ReasonText(format2, geofenceAction);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final GeofenceResolution resolve(SelectedLocationGeofenceInput selectedLocationGeofenceInput, boolean z, boolean z2, boolean z3, Location location) {
        boolean z4;
        double d;
        GeofenceStatus.InvalidCoordinates invalidCoordinates;
        RadiusText radiusText;
        ReasonText reasonText;
        Object obj = GeofenceStatus.InvalidCoordinates.INSTANCE;
        boolean z5 = true;
        Object obj2 = GeofenceStatus.PermissionDeniedNeedsSettings.INSTANCE;
        Object obj3 = GeofenceStatus.PermissionRequired.INSTANCE;
        Object obj4 = GeofenceStatus.InsideGeofence.INSTANCE;
        Object obj5 = GeofenceStatus.OutsideGeofence.INSTANCE;
        Object obj6 = GeofenceStatus.NotRequired.INSTANCE;
        if (selectedLocationGeofenceInput == null) {
            invalidCoordinates = obj6;
            z4 = false;
            d = 0.0d;
        } else {
            double d2 = selectedLocationGeofenceInput.geofenceRadiusInMeters;
            Double d3 = selectedLocationGeofenceInput.longitude;
            z4 = false;
            Double d4 = selectedLocationGeofenceInput.latitude;
            d = 0.0d;
            if (!selectedLocationGeofenceInput.canUseGeofencing || !selectedLocationGeofenceInput.isGeofencingEnabled || d2 <= 0.0d) {
                invalidCoordinates = obj6;
            } else if (!z) {
                invalidCoordinates = (z3 || z2) ? obj2 : obj3;
            } else if (d4 == null || d3 == null || Intrinsics.areEqual(d4) || Intrinsics.areEqual(d3)) {
                invalidCoordinates = obj;
            } else {
                if (location != null) {
                    android.location.Location.distanceBetween(d4.doubleValue(), d3.doubleValue(), location.latitude, location.longitude, new float[1]);
                    if (r2[0] <= d2) {
                        invalidCoordinates = obj4;
                    }
                }
                invalidCoordinates = obj5;
            }
        }
        if (selectedLocationGeofenceInput != null) {
            double d5 = selectedLocationGeofenceInput.geofenceRadiusInMeters;
            AndroidStringManager androidStringManager = this.stringManager;
            if (d5 <= d) {
                radiusText = null;
            } else {
                radiusText = IMPERIAL_COUNTRY_CODES.contains(Locale.getDefault().getCountry()) ? new RadiusText(String.valueOf(MathKt__MathJVMKt.roundToInt(d5 * 3.28084d)), androidStringManager.get(R.string.work_shift_distance_unit_feet)) : new RadiusText(String.valueOf(MathKt__MathJVMKt.roundToInt(d5)), androidStringManager.get(R.string.work_shift_distance_unit_meters));
            }
            if (radiusText != null) {
                if (invalidCoordinates.equals(obj3)) {
                    reasonText = geofenceRequiredReason(selectedLocationGeofenceInput, radiusText, new GeofenceAction.RequestLocationPermission(androidStringManager.get(R.string.work_shift_disclaimer_geofence_permission_action)));
                } else if (invalidCoordinates.equals(obj2)) {
                    reasonText = geofenceRequiredReason(selectedLocationGeofenceInput, radiusText, new GeofenceAction.OpenSettings(androidStringManager.get(R.string.work_shift_disclaimer_geofence_open_settings_action)));
                } else if (invalidCoordinates.equals(obj5)) {
                    reasonText = geofenceRequiredReason(selectedLocationGeofenceInput, radiusText, null);
                } else if (invalidCoordinates.equals(obj)) {
                    reasonText = new ReasonText(androidStringManager.get(R.string.work_shift_disclaimer_geofence_invalid_coordinates), null);
                } else if (!invalidCoordinates.equals(obj4) && !invalidCoordinates.equals(obj6)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                String str = reasonText == null ? reasonText.text : null;
                GeofenceAction geofenceAction = reasonText != null ? reasonText.action : null;
                if (!invalidCoordinates.equals(obj6) && !invalidCoordinates.equals(obj4)) {
                    z5 = z4;
                }
                return new GeofenceResolution(invalidCoordinates, str, geofenceAction, z5);
            }
        }
        reasonText = null;
        if (reasonText == null) {
        }
        if (reasonText != null) {
        }
        if (!invalidCoordinates.equals(obj6)) {
            z5 = z4;
        }
        return new GeofenceResolution(invalidCoordinates, str, geofenceAction, z5);
    }
}
