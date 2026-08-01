package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b6 extends p5 implements d6 {
    @Override // com.google.android.gms.internal.measurement.d6
    public final void beginAdUnitExposure(String str, long j) {
        Parcel F = F();
        F.writeString(str);
        F.writeLong(j);
        G(F, 23);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel F = F();
        F.writeString(str);
        F.writeString(str2);
        r5.b(F, bundle);
        G(F, 9);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void endAdUnitExposure(String str, long j) {
        Parcel F = F();
        F.writeString(str);
        F.writeLong(j);
        G(F, 24);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void generateEventId(f6 f6Var) {
        Parcel F = F();
        r5.c(F, f6Var);
        G(F, 22);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void getCachedAppInstanceId(f6 f6Var) {
        Parcel F = F();
        r5.c(F, f6Var);
        G(F, 19);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void getConditionalUserProperties(String str, String str2, f6 f6Var) {
        Parcel F = F();
        F.writeString(str);
        F.writeString(str2);
        r5.c(F, f6Var);
        G(F, 10);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void getCurrentScreenClass(f6 f6Var) {
        Parcel F = F();
        r5.c(F, f6Var);
        G(F, 17);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void getCurrentScreenName(f6 f6Var) {
        Parcel F = F();
        r5.c(F, f6Var);
        G(F, 16);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void getGmpAppId(f6 f6Var) {
        Parcel F = F();
        r5.c(F, f6Var);
        G(F, 21);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void getMaxUserProperties(String str, f6 f6Var) {
        Parcel F = F();
        F.writeString(str);
        r5.c(F, f6Var);
        G(F, 6);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void getUserProperties(String str, String str2, boolean z10, f6 f6Var) {
        Parcel F = F();
        F.writeString(str);
        F.writeString(str2);
        ClassLoader classLoader = r5.f2731a;
        F.writeInt(z10 ? 1 : 0);
        r5.c(F, f6Var);
        G(F, 5);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void initialize(j7.a aVar, n6 n6Var, long j) {
        Parcel F = F();
        r5.c(F, aVar);
        r5.b(F, n6Var);
        F.writeLong(j);
        G(F, 1);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void initializeWithElapsedTime(j7.a aVar, n6 n6Var, long j, long j3) {
        Parcel F = F();
        r5.c(F, aVar);
        r5.b(F, n6Var);
        F.writeLong(j);
        F.writeLong(j3);
        G(F, 60);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j, long j3) {
        Parcel F = F();
        F.writeString(str);
        F.writeString(str2);
        r5.b(F, bundle);
        F.writeInt(1);
        F.writeInt(1);
        F.writeLong(j);
        F.writeLong(j3);
        G(F, 59);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void logHealthData(int i3, String str, j7.a aVar, j7.a aVar2, j7.a aVar3) {
        Parcel F = F();
        F.writeInt(5);
        F.writeString("Error with data collection. Data lost.");
        r5.c(F, aVar);
        r5.c(F, aVar2);
        r5.c(F, aVar3);
        G(F, 33);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void onActivityCreatedByScionActivityInfo(p6 p6Var, Bundle bundle, long j) {
        Parcel F = F();
        r5.b(F, p6Var);
        r5.b(F, bundle);
        F.writeLong(j);
        G(F, 53);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void onActivityDestroyedByScionActivityInfo(p6 p6Var, long j) {
        Parcel F = F();
        r5.b(F, p6Var);
        F.writeLong(j);
        G(F, 54);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void onActivityPausedByScionActivityInfo(p6 p6Var, long j) {
        Parcel F = F();
        r5.b(F, p6Var);
        F.writeLong(j);
        G(F, 55);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void onActivityResumedByScionActivityInfo(p6 p6Var, long j) {
        Parcel F = F();
        r5.b(F, p6Var);
        F.writeLong(j);
        G(F, 56);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void onActivitySaveInstanceStateByScionActivityInfo(p6 p6Var, f6 f6Var, long j) {
        Parcel F = F();
        r5.b(F, p6Var);
        r5.c(F, f6Var);
        F.writeLong(j);
        G(F, 57);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void onActivityStartedByScionActivityInfo(p6 p6Var, long j) {
        Parcel F = F();
        r5.b(F, p6Var);
        F.writeLong(j);
        G(F, 51);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void onActivityStoppedByScionActivityInfo(p6 p6Var, long j) {
        Parcel F = F();
        r5.b(F, p6Var);
        F.writeLong(j);
        G(F, 52);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void retrieveAndUploadBatches(h6 h6Var) {
        Parcel F = F();
        r5.c(F, h6Var);
        G(F, 58);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel F = F();
        r5.b(F, bundle);
        F.writeLong(j);
        G(F, 8);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void setCurrentScreenByScionActivityInfo(p6 p6Var, String str, String str2, long j) {
        Parcel F = F();
        r5.b(F, p6Var);
        F.writeString(str);
        F.writeString(str2);
        F.writeLong(j);
        G(F, 50);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void setDataCollectionEnabled(boolean z10) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void setUserProperty(String str, String str2, j7.a aVar, boolean z10, long j) {
        Parcel F = F();
        F.writeString("fcm");
        F.writeString("_ln");
        r5.c(F, aVar);
        F.writeInt(1);
        F.writeLong(j);
        G(F, 4);
    }
}
