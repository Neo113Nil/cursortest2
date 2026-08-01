package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.appsflyer.attribution.RequestError;
import java.util.HashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class c6 extends q5 implements d6 {
    public static d6 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof d6 ? (d6) queryLocalInterface : new b6(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 0);
    }

    @Override // com.google.android.gms.internal.measurement.q5
    public final boolean C(int i3, Parcel parcel, Parcel parcel2) {
        boolean z10;
        f6 f6Var = null;
        h6 h6Var = null;
        f6 f6Var2 = null;
        f6 f6Var3 = null;
        f6 f6Var4 = null;
        f6 f6Var5 = null;
        j6 j6Var = null;
        j6 j6Var2 = null;
        j6 j6Var3 = null;
        f6 f6Var6 = null;
        f6 f6Var7 = null;
        f6 f6Var8 = null;
        f6 f6Var9 = null;
        f6 f6Var10 = null;
        f6 f6Var11 = null;
        m6 m6Var = null;
        f6 f6Var12 = null;
        f6 f6Var13 = null;
        f6 f6Var14 = null;
        f6 f6Var15 = null;
        f6 f6Var16 = null;
        switch (i3) {
            case 1:
                j7.a E = j7.b.E(parcel.readStrongBinder());
                n6 n6Var = (n6) r5.a(parcel, n6.CREATOR);
                long readLong = parcel.readLong();
                r5.d(parcel);
                initialize(E, n6Var, readLong);
                break;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) r5.a(parcel, Bundle.CREATOR);
                boolean z11 = parcel.readInt() != 0;
                boolean z12 = parcel.readInt() != 0;
                long readLong2 = parcel.readLong();
                r5.d(parcel);
                logEvent(readString, readString2, bundle, z11, z12, readLong2);
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) r5.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    f6Var = queryLocalInterface instanceof f6 ? (f6) queryLocalInterface : new e6(readStrongBinder);
                }
                f6 f6Var17 = f6Var;
                long readLong3 = parcel.readLong();
                r5.d(parcel);
                logEventAndBundle(readString3, readString4, bundle2, f6Var17, readLong3);
                break;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                j7.a E2 = j7.b.E(parcel.readStrongBinder());
                ClassLoader classLoader = r5.f2731a;
                z10 = parcel.readInt() != 0;
                long readLong4 = parcel.readLong();
                r5.d(parcel);
                setUserProperty(readString5, readString6, E2, z10, readLong4);
                break;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                ClassLoader classLoader2 = r5.f2731a;
                z10 = parcel.readInt() != 0;
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    f6Var16 = queryLocalInterface2 instanceof f6 ? (f6) queryLocalInterface2 : new e6(readStrongBinder2);
                }
                r5.d(parcel);
                getUserProperties(readString7, readString8, z10, f6Var16);
                break;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    f6Var15 = queryLocalInterface3 instanceof f6 ? (f6) queryLocalInterface3 : new e6(readStrongBinder3);
                }
                r5.d(parcel);
                getMaxUserProperties(readString9, f6Var15);
                break;
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                r5.d(parcel);
                setUserId(readString10, readLong5);
                break;
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                Bundle bundle3 = (Bundle) r5.a(parcel, Bundle.CREATOR);
                long readLong6 = parcel.readLong();
                r5.d(parcel);
                setConditionalUserProperty(bundle3, readLong6);
                break;
            case 9:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                Bundle bundle4 = (Bundle) r5.a(parcel, Bundle.CREATOR);
                r5.d(parcel);
                clearConditionalUserProperty(readString11, readString12, bundle4);
                break;
            case 10:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    f6Var14 = queryLocalInterface4 instanceof f6 ? (f6) queryLocalInterface4 : new e6(readStrongBinder4);
                }
                r5.d(parcel);
                getConditionalUserProperties(readString13, readString14, f6Var14);
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                ClassLoader classLoader3 = r5.f2731a;
                z10 = parcel.readInt() != 0;
                long readLong7 = parcel.readLong();
                r5.d(parcel);
                setMeasurementEnabled(z10, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                r5.d(parcel);
                resetAnalyticsData(readLong8);
                break;
            case 13:
                long readLong9 = parcel.readLong();
                r5.d(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                r5.d(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                j7.a E3 = j7.b.E(parcel.readStrongBinder());
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                long readLong11 = parcel.readLong();
                r5.d(parcel);
                setCurrentScreen(E3, readString15, readString16, readLong11);
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    f6Var13 = queryLocalInterface5 instanceof f6 ? (f6) queryLocalInterface5 : new e6(readStrongBinder5);
                }
                r5.d(parcel);
                getCurrentScreenName(f6Var13);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    f6Var12 = queryLocalInterface6 instanceof f6 ? (f6) queryLocalInterface6 : new e6(readStrongBinder6);
                }
                r5.d(parcel);
                getCurrentScreenClass(f6Var12);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    m6Var = queryLocalInterface7 instanceof m6 ? (m6) queryLocalInterface7 : new k6(readStrongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", 0);
                }
                r5.d(parcel);
                setInstanceIdProvider(m6Var);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    f6Var11 = queryLocalInterface8 instanceof f6 ? (f6) queryLocalInterface8 : new e6(readStrongBinder8);
                }
                r5.d(parcel);
                getCachedAppInstanceId(f6Var11);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    f6Var10 = queryLocalInterface9 instanceof f6 ? (f6) queryLocalInterface9 : new e6(readStrongBinder9);
                }
                r5.d(parcel);
                getAppInstanceId(f6Var10);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    f6Var9 = queryLocalInterface10 instanceof f6 ? (f6) queryLocalInterface10 : new e6(readStrongBinder10);
                }
                r5.d(parcel);
                getGmpAppId(f6Var9);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    f6Var8 = queryLocalInterface11 instanceof f6 ? (f6) queryLocalInterface11 : new e6(readStrongBinder11);
                }
                r5.d(parcel);
                generateEventId(f6Var8);
                break;
            case 23:
                String readString17 = parcel.readString();
                long readLong12 = parcel.readLong();
                r5.d(parcel);
                beginAdUnitExposure(readString17, readLong12);
                break;
            case 24:
                String readString18 = parcel.readString();
                long readLong13 = parcel.readLong();
                r5.d(parcel);
                endAdUnitExposure(readString18, readLong13);
                break;
            case 25:
                j7.a E4 = j7.b.E(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                r5.d(parcel);
                onActivityStarted(E4, readLong14);
                break;
            case 26:
                j7.a E5 = j7.b.E(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                r5.d(parcel);
                onActivityStopped(E5, readLong15);
                break;
            case 27:
                j7.a E6 = j7.b.E(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) r5.a(parcel, Bundle.CREATOR);
                long readLong16 = parcel.readLong();
                r5.d(parcel);
                onActivityCreated(E6, bundle5, readLong16);
                break;
            case 28:
                j7.a E7 = j7.b.E(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                r5.d(parcel);
                onActivityDestroyed(E7, readLong17);
                break;
            case 29:
                j7.a E8 = j7.b.E(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                r5.d(parcel);
                onActivityPaused(E8, readLong18);
                break;
            case 30:
                j7.a E9 = j7.b.E(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                r5.d(parcel);
                onActivityResumed(E9, readLong19);
                break;
            case 31:
                j7.a E10 = j7.b.E(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    f6Var7 = queryLocalInterface12 instanceof f6 ? (f6) queryLocalInterface12 : new e6(readStrongBinder12);
                }
                long readLong20 = parcel.readLong();
                r5.d(parcel);
                onActivitySaveInstanceState(E10, f6Var7, readLong20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) r5.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    f6Var6 = queryLocalInterface13 instanceof f6 ? (f6) queryLocalInterface13 : new e6(readStrongBinder13);
                }
                long readLong21 = parcel.readLong();
                r5.d(parcel);
                performAction(bundle6, f6Var6, readLong21);
                break;
            case 33:
                int readInt = parcel.readInt();
                String readString19 = parcel.readString();
                j7.a E11 = j7.b.E(parcel.readStrongBinder());
                j7.a E12 = j7.b.E(parcel.readStrongBinder());
                j7.a E13 = j7.b.E(parcel.readStrongBinder());
                r5.d(parcel);
                logHealthData(readInt, readString19, E11, E12, E13);
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    j6Var3 = queryLocalInterface14 instanceof j6 ? (j6) queryLocalInterface14 : new i6(readStrongBinder14);
                }
                r5.d(parcel);
                setEventInterceptor(j6Var3);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    j6Var2 = queryLocalInterface15 instanceof j6 ? (j6) queryLocalInterface15 : new i6(readStrongBinder15);
                }
                r5.d(parcel);
                registerOnMeasurementEventListener(j6Var2);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    j6Var = queryLocalInterface16 instanceof j6 ? (j6) queryLocalInterface16 : new i6(readStrongBinder16);
                }
                r5.d(parcel);
                unregisterOnMeasurementEventListener(j6Var);
                break;
            case 37:
                HashMap readHashMap = parcel.readHashMap(r5.f2731a);
                r5.d(parcel);
                initForTests(readHashMap);
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    f6Var5 = queryLocalInterface17 instanceof f6 ? (f6) queryLocalInterface17 : new e6(readStrongBinder17);
                }
                int readInt2 = parcel.readInt();
                r5.d(parcel);
                getTestFlag(f6Var5, readInt2);
                break;
            case 39:
                ClassLoader classLoader4 = r5.f2731a;
                z10 = parcel.readInt() != 0;
                r5.d(parcel);
                setDataCollectionEnabled(z10);
                break;
            case RequestError.NETWORK_FAILURE /* 40 */:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    f6Var4 = queryLocalInterface18 instanceof f6 ? (f6) queryLocalInterface18 : new e6(readStrongBinder18);
                }
                r5.d(parcel);
                isDataCollectionEnabled(f6Var4);
                break;
            case RequestError.NO_DEV_KEY /* 41 */:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) r5.a(parcel, Bundle.CREATOR);
                r5.d(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long readLong22 = parcel.readLong();
                r5.d(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) r5.a(parcel, Bundle.CREATOR);
                long readLong23 = parcel.readLong();
                r5.d(parcel);
                setConsent(bundle8, readLong23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) r5.a(parcel, Bundle.CREATOR);
                long readLong24 = parcel.readLong();
                r5.d(parcel);
                setConsentThirdParty(bundle9, readLong24);
                break;
            case 46:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    f6Var3 = queryLocalInterface19 instanceof f6 ? (f6) queryLocalInterface19 : new e6(readStrongBinder19);
                }
                r5.d(parcel);
                getSessionId(f6Var3);
                break;
            case 48:
                Intent intent = (Intent) r5.a(parcel, Intent.CREATOR);
                r5.d(parcel);
                setSgtmDebugInfo(intent);
                break;
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                p6 p6Var = (p6) r5.a(parcel, p6.CREATOR);
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                long readLong25 = parcel.readLong();
                r5.d(parcel);
                setCurrentScreenByScionActivityInfo(p6Var, readString20, readString21, readLong25);
                break;
            case 51:
                p6 p6Var2 = (p6) r5.a(parcel, p6.CREATOR);
                long readLong26 = parcel.readLong();
                r5.d(parcel);
                onActivityStartedByScionActivityInfo(p6Var2, readLong26);
                break;
            case 52:
                p6 p6Var3 = (p6) r5.a(parcel, p6.CREATOR);
                long readLong27 = parcel.readLong();
                r5.d(parcel);
                onActivityStoppedByScionActivityInfo(p6Var3, readLong27);
                break;
            case 53:
                p6 p6Var4 = (p6) r5.a(parcel, p6.CREATOR);
                Bundle bundle10 = (Bundle) r5.a(parcel, Bundle.CREATOR);
                long readLong28 = parcel.readLong();
                r5.d(parcel);
                onActivityCreatedByScionActivityInfo(p6Var4, bundle10, readLong28);
                break;
            case 54:
                p6 p6Var5 = (p6) r5.a(parcel, p6.CREATOR);
                long readLong29 = parcel.readLong();
                r5.d(parcel);
                onActivityDestroyedByScionActivityInfo(p6Var5, readLong29);
                break;
            case 55:
                p6 p6Var6 = (p6) r5.a(parcel, p6.CREATOR);
                long readLong30 = parcel.readLong();
                r5.d(parcel);
                onActivityPausedByScionActivityInfo(p6Var6, readLong30);
                break;
            case 56:
                p6 p6Var7 = (p6) r5.a(parcel, p6.CREATOR);
                long readLong31 = parcel.readLong();
                r5.d(parcel);
                onActivityResumedByScionActivityInfo(p6Var7, readLong31);
                break;
            case 57:
                p6 p6Var8 = (p6) r5.a(parcel, p6.CREATOR);
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    f6Var2 = queryLocalInterface20 instanceof f6 ? (f6) queryLocalInterface20 : new e6(readStrongBinder20);
                }
                long readLong32 = parcel.readLong();
                r5.d(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(p6Var8, f6Var2, readLong32);
                break;
            case 58:
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    h6Var = queryLocalInterface21 instanceof h6 ? (h6) queryLocalInterface21 : new g6(readStrongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback", 0);
                }
                r5.d(parcel);
                retrieveAndUploadBatches(h6Var);
                break;
            case 59:
                String readString22 = parcel.readString();
                String readString23 = parcel.readString();
                Bundle bundle11 = (Bundle) r5.a(parcel, Bundle.CREATOR);
                boolean z13 = parcel.readInt() != 0;
                boolean z14 = parcel.readInt() != 0;
                long readLong33 = parcel.readLong();
                long readLong34 = parcel.readLong();
                r5.d(parcel);
                logEventWithElapsedTime(readString22, readString23, bundle11, z13, z14, readLong33, readLong34);
                break;
            case 60:
                j7.a E14 = j7.b.E(parcel.readStrongBinder());
                n6 n6Var2 = (n6) r5.a(parcel, n6.CREATOR);
                long readLong35 = parcel.readLong();
                long readLong36 = parcel.readLong();
                r5.d(parcel);
                initializeWithElapsedTime(E14, n6Var2, readLong35, readLong36);
                break;
            case 61:
                long readLong37 = parcel.readLong();
                long readLong38 = parcel.readLong();
                r5.d(parcel);
                resetAnalyticsDataWithElapsedTime(readLong37, readLong38);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
