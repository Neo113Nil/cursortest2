package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzca extends zzbm implements zzcc {
    zzca(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void beginAdUnitExposure(String str, long j8) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeLong(j8);
        zzc(23, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbo.zzd(zza, bundle);
        zzc(9, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void clearMeasurementEnabled(long j8) {
        Parcel zza = zza();
        zza.writeLong(j8);
        zzc(43, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void endAdUnitExposure(String str, long j8) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeLong(j8);
        zzc(24, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void generateEventId(zzcf zzcfVar) {
        Parcel zza = zza();
        zzbo.zze(zza, zzcfVar);
        zzc(22, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getAppInstanceId(zzcf zzcfVar) {
        Parcel zza = zza();
        zzbo.zze(zza, zzcfVar);
        zzc(20, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getCachedAppInstanceId(zzcf zzcfVar) {
        Parcel zza = zza();
        zzbo.zze(zza, zzcfVar);
        zzc(19, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getConditionalUserProperties(String str, String str2, zzcf zzcfVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbo.zze(zza, zzcfVar);
        zzc(10, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getCurrentScreenClass(zzcf zzcfVar) {
        Parcel zza = zza();
        zzbo.zze(zza, zzcfVar);
        zzc(17, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getCurrentScreenName(zzcf zzcfVar) {
        Parcel zza = zza();
        zzbo.zze(zza, zzcfVar);
        zzc(16, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getGmpAppId(zzcf zzcfVar) {
        Parcel zza = zza();
        zzbo.zze(zza, zzcfVar);
        zzc(21, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getMaxUserProperties(String str, zzcf zzcfVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbo.zze(zza, zzcfVar);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getSessionId(zzcf zzcfVar) {
        Parcel zza = zza();
        zzbo.zze(zza, zzcfVar);
        zzc(46, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getTestFlag(zzcf zzcfVar, int i8) {
        Parcel zza = zza();
        zzbo.zze(zza, zzcfVar);
        zza.writeInt(i8);
        zzc(38, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getUserProperties(String str, String str2, boolean z7, zzcf zzcfVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        int i8 = zzbo.zza;
        zza.writeInt(z7 ? 1 : 0);
        zzbo.zze(zza, zzcfVar);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void initForTests(Map map) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void initialize(IObjectWrapper iObjectWrapper, zzcl zzclVar, long j8) {
        Parcel zza = zza();
        zzbo.zze(zza, iObjectWrapper);
        zzbo.zzd(zza, zzclVar);
        zza.writeLong(j8);
        zzc(1, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void isDataCollectionEnabled(zzcf zzcfVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void logEvent(String str, String str2, Bundle bundle, boolean z7, boolean z8, long j8) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbo.zzd(zza, bundle);
        zza.writeInt(z7 ? 1 : 0);
        zza.writeInt(z8 ? 1 : 0);
        zza.writeLong(j8);
        zzc(2, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void logEventAndBundle(String str, String str2, Bundle bundle, zzcf zzcfVar, long j8) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void logHealthData(int i8, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel zza = zza();
        zza.writeInt(5);
        zza.writeString(str);
        zzbo.zze(zza, iObjectWrapper);
        zzbo.zze(zza, iObjectWrapper2);
        zzbo.zze(zza, iObjectWrapper3);
        zzc(33, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j8) {
        Parcel zza = zza();
        zzbo.zze(zza, iObjectWrapper);
        zzbo.zzd(zza, bundle);
        zza.writeLong(j8);
        zzc(27, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j8) {
        Parcel zza = zza();
        zzbo.zze(zza, iObjectWrapper);
        zza.writeLong(j8);
        zzc(28, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityPaused(IObjectWrapper iObjectWrapper, long j8) {
        Parcel zza = zza();
        zzbo.zze(zza, iObjectWrapper);
        zza.writeLong(j8);
        zzc(29, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityResumed(IObjectWrapper iObjectWrapper, long j8) {
        Parcel zza = zza();
        zzbo.zze(zza, iObjectWrapper);
        zza.writeLong(j8);
        zzc(30, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcf zzcfVar, long j8) {
        Parcel zza = zza();
        zzbo.zze(zza, iObjectWrapper);
        zzbo.zze(zza, zzcfVar);
        zza.writeLong(j8);
        zzc(31, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityStarted(IObjectWrapper iObjectWrapper, long j8) {
        Parcel zza = zza();
        zzbo.zze(zza, iObjectWrapper);
        zza.writeLong(j8);
        zzc(25, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityStopped(IObjectWrapper iObjectWrapper, long j8) {
        Parcel zza = zza();
        zzbo.zze(zza, iObjectWrapper);
        zza.writeLong(j8);
        zzc(26, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void performAction(Bundle bundle, zzcf zzcfVar, long j8) {
        Parcel zza = zza();
        zzbo.zzd(zza, bundle);
        zzbo.zze(zza, zzcfVar);
        zza.writeLong(j8);
        zzc(32, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void registerOnMeasurementEventListener(zzci zzciVar) {
        Parcel zza = zza();
        zzbo.zze(zza, zzciVar);
        zzc(35, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void resetAnalyticsData(long j8) {
        Parcel zza = zza();
        zza.writeLong(j8);
        zzc(12, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setConditionalUserProperty(Bundle bundle, long j8) {
        Parcel zza = zza();
        zzbo.zzd(zza, bundle);
        zza.writeLong(j8);
        zzc(8, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setConsent(Bundle bundle, long j8) {
        Parcel zza = zza();
        zzbo.zzd(zza, bundle);
        zza.writeLong(j8);
        zzc(44, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setConsentThirdParty(Bundle bundle, long j8) {
        Parcel zza = zza();
        zzbo.zzd(zza, bundle);
        zza.writeLong(j8);
        zzc(45, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j8) {
        Parcel zza = zza();
        zzbo.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeLong(j8);
        zzc(15, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setDataCollectionEnabled(boolean z7) {
        Parcel zza = zza();
        int i8 = zzbo.zza;
        zza.writeInt(z7 ? 1 : 0);
        zzc(39, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel zza = zza();
        zzbo.zzd(zza, bundle);
        zzc(42, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setEventInterceptor(zzci zzciVar) {
        Parcel zza = zza();
        zzbo.zze(zza, zzciVar);
        zzc(34, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setInstanceIdProvider(zzck zzckVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setMeasurementEnabled(boolean z7, long j8) {
        Parcel zza = zza();
        int i8 = zzbo.zza;
        zza.writeInt(z7 ? 1 : 0);
        zza.writeLong(j8);
        zzc(11, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setMinimumSessionDuration(long j8) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setSessionTimeoutDuration(long j8) {
        Parcel zza = zza();
        zza.writeLong(j8);
        zzc(14, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setUserId(String str, long j8) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeLong(j8);
        zzc(7, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z7, long j8) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbo.zze(zza, iObjectWrapper);
        zza.writeInt(z7 ? 1 : 0);
        zza.writeLong(j8);
        zzc(4, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void unregisterOnMeasurementEventListener(zzci zzciVar) {
        Parcel zza = zza();
        zzbo.zze(zza, zzciVar);
        zzc(36, zza);
    }
}
