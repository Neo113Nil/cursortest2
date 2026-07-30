package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fe3 extends w93 implements he3 {
    @Override // defpackage.he3
    public final void beginAdUnitExposure(String str, long j) {
        Parcel d = d();
        d.writeString(str);
        d.writeLong(j);
        H(d, 23);
    }

    @Override // defpackage.he3
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel d = d();
        d.writeString(str);
        d.writeString(str2);
        od3.b(d, bundle);
        H(d, 9);
    }

    @Override // defpackage.he3
    public final void endAdUnitExposure(String str, long j) {
        Parcel d = d();
        d.writeString(str);
        d.writeLong(j);
        H(d, 24);
    }

    @Override // defpackage.he3
    public final void generateEventId(je3 je3Var) {
        Parcel d = d();
        od3.c(d, je3Var);
        H(d, 22);
    }

    @Override // defpackage.he3
    public final void getAppInstanceId(je3 je3Var) {
        Parcel d = d();
        od3.c(d, je3Var);
        H(d, 20);
    }

    @Override // defpackage.he3
    public final void getCachedAppInstanceId(je3 je3Var) {
        Parcel d = d();
        od3.c(d, je3Var);
        H(d, 19);
    }

    @Override // defpackage.he3
    public final void getConditionalUserProperties(String str, String str2, je3 je3Var) {
        Parcel d = d();
        d.writeString(str);
        d.writeString(str2);
        od3.c(d, je3Var);
        H(d, 10);
    }

    @Override // defpackage.he3
    public final void getCurrentScreenClass(je3 je3Var) {
        Parcel d = d();
        od3.c(d, je3Var);
        H(d, 17);
    }

    @Override // defpackage.he3
    public final void getCurrentScreenName(je3 je3Var) {
        Parcel d = d();
        od3.c(d, je3Var);
        H(d, 16);
    }

    @Override // defpackage.he3
    public final void getGmpAppId(je3 je3Var) {
        Parcel d = d();
        od3.c(d, je3Var);
        H(d, 21);
    }

    @Override // defpackage.he3
    public final void getMaxUserProperties(String str, je3 je3Var) {
        Parcel d = d();
        d.writeString(str);
        od3.c(d, je3Var);
        H(d, 6);
    }

    @Override // defpackage.he3
    public final void getSessionId(je3 je3Var) {
        Parcel d = d();
        od3.c(d, je3Var);
        H(d, 46);
    }

    @Override // defpackage.he3
    public final void getTestFlag(je3 je3Var, int i) {
        Parcel d = d();
        od3.c(d, je3Var);
        d.writeInt(i);
        H(d, 38);
    }

    @Override // defpackage.he3
    public final void getUserProperties(String str, String str2, boolean z, je3 je3Var) {
        Parcel d = d();
        d.writeString(str);
        d.writeString(str2);
        ClassLoader classLoader = od3.a;
        d.writeInt(z ? 1 : 0);
        od3.c(d, je3Var);
        H(d, 5);
    }

    @Override // defpackage.he3
    public final void initialize(b01 b01Var, ye3 ye3Var, long j) {
        Parcel d = d();
        od3.c(d, b01Var);
        od3.b(d, ye3Var);
        d.writeLong(j);
        H(d, 1);
    }

    @Override // defpackage.he3
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel d = d();
        d.writeString(str);
        d.writeString(str2);
        od3.b(d, bundle);
        d.writeInt(z ? 1 : 0);
        d.writeInt(z2 ? 1 : 0);
        d.writeLong(j);
        H(d, 2);
    }

    @Override // defpackage.he3
    public final void logHealthData(int i, String str, b01 b01Var, b01 b01Var2, b01 b01Var3) {
        Parcel d = d();
        d.writeInt(5);
        d.writeString(str);
        od3.c(d, b01Var);
        od3.c(d, b01Var2);
        od3.c(d, b01Var3);
        H(d, 33);
    }

    @Override // defpackage.he3
    public final void onActivityCreatedByScionActivityInfo(ze3 ze3Var, Bundle bundle, long j) {
        Parcel d = d();
        od3.b(d, ze3Var);
        od3.b(d, bundle);
        d.writeLong(j);
        H(d, 53);
    }

    @Override // defpackage.he3
    public final void onActivityDestroyedByScionActivityInfo(ze3 ze3Var, long j) {
        Parcel d = d();
        od3.b(d, ze3Var);
        d.writeLong(j);
        H(d, 54);
    }

    @Override // defpackage.he3
    public final void onActivityPausedByScionActivityInfo(ze3 ze3Var, long j) {
        Parcel d = d();
        od3.b(d, ze3Var);
        d.writeLong(j);
        H(d, 55);
    }

    @Override // defpackage.he3
    public final void onActivityResumedByScionActivityInfo(ze3 ze3Var, long j) {
        Parcel d = d();
        od3.b(d, ze3Var);
        d.writeLong(j);
        H(d, 56);
    }

    @Override // defpackage.he3
    public final void onActivitySaveInstanceStateByScionActivityInfo(ze3 ze3Var, je3 je3Var, long j) {
        Parcel d = d();
        od3.b(d, ze3Var);
        od3.c(d, je3Var);
        d.writeLong(j);
        H(d, 57);
    }

    @Override // defpackage.he3
    public final void onActivityStartedByScionActivityInfo(ze3 ze3Var, long j) {
        Parcel d = d();
        od3.b(d, ze3Var);
        d.writeLong(j);
        H(d, 51);
    }

    @Override // defpackage.he3
    public final void onActivityStoppedByScionActivityInfo(ze3 ze3Var, long j) {
        Parcel d = d();
        od3.b(d, ze3Var);
        d.writeLong(j);
        H(d, 52);
    }

    @Override // defpackage.he3
    public final void registerOnMeasurementEventListener(ve3 ve3Var) {
        Parcel d = d();
        od3.c(d, ve3Var);
        H(d, 35);
    }

    @Override // defpackage.he3
    public final void resetAnalyticsData(long j) {
        Parcel d = d();
        d.writeLong(j);
        H(d, 12);
    }

    @Override // defpackage.he3
    public final void retrieveAndUploadBatches(me3 me3Var) {
        Parcel d = d();
        od3.c(d, me3Var);
        H(d, 58);
    }

    @Override // defpackage.he3
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel d = d();
        od3.b(d, bundle);
        d.writeLong(j);
        H(d, 8);
    }

    @Override // defpackage.he3
    public final void setConsentThirdParty(Bundle bundle, long j) {
        Parcel d = d();
        od3.b(d, bundle);
        d.writeLong(j);
        H(d, 45);
    }

    @Override // defpackage.he3
    public final void setCurrentScreenByScionActivityInfo(ze3 ze3Var, String str, String str2, long j) {
        Parcel d = d();
        od3.b(d, ze3Var);
        d.writeString(str);
        d.writeString(str2);
        d.writeLong(j);
        H(d, 50);
    }

    @Override // defpackage.he3
    public final void setDataCollectionEnabled(boolean z) {
        Parcel d = d();
        ClassLoader classLoader = od3.a;
        d.writeInt(z ? 1 : 0);
        H(d, 39);
    }

    @Override // defpackage.he3
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel d = d();
        od3.b(d, bundle);
        H(d, 42);
    }

    @Override // defpackage.he3
    public final void setEventInterceptor(ve3 ve3Var) {
        Parcel d = d();
        od3.c(d, ve3Var);
        H(d, 34);
    }

    @Override // defpackage.he3
    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel d = d();
        ClassLoader classLoader = od3.a;
        d.writeInt(z ? 1 : 0);
        d.writeLong(j);
        H(d, 11);
    }

    @Override // defpackage.he3
    public final void setSessionTimeoutDuration(long j) {
        Parcel d = d();
        d.writeLong(j);
        H(d, 14);
    }

    @Override // defpackage.he3
    public final void setSgtmDebugInfo(Intent intent) {
        Parcel d = d();
        od3.b(d, intent);
        H(d, 48);
    }

    @Override // defpackage.he3
    public final void setUserId(String str, long j) {
        Parcel d = d();
        d.writeString(str);
        d.writeLong(j);
        H(d, 7);
    }

    @Override // defpackage.he3
    public final void setUserProperty(String str, String str2, b01 b01Var, boolean z, long j) {
        Parcel d = d();
        d.writeString(str);
        d.writeString(str2);
        od3.c(d, b01Var);
        d.writeInt(z ? 1 : 0);
        d.writeLong(j);
        H(d, 4);
    }

    @Override // defpackage.he3
    public final void unregisterOnMeasurementEventListener(ve3 ve3Var) {
        Parcel d = d();
        od3.c(d, ve3Var);
        H(d, 36);
    }
}
