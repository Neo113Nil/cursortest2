package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.appsflyer.attribution.RequestError;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.util.HashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ge3 extends md3 implements he3 {
    public static he3 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof he3 ? (he3) queryLocalInterface : new fe3(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 2);
    }

    @Override // defpackage.md3
    public final boolean b(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        je3 je3Var = null;
        me3 me3Var = null;
        je3 je3Var2 = null;
        je3 je3Var3 = null;
        je3 je3Var4 = null;
        je3 je3Var5 = null;
        ve3 ve3Var = null;
        ve3 ve3Var2 = null;
        ve3 ve3Var3 = null;
        je3 je3Var6 = null;
        je3 je3Var7 = null;
        je3 je3Var8 = null;
        je3 je3Var9 = null;
        je3 je3Var10 = null;
        je3 je3Var11 = null;
        xe3 xe3Var = null;
        je3 je3Var12 = null;
        je3 je3Var13 = null;
        je3 je3Var14 = null;
        je3 je3Var15 = null;
        je3 je3Var16 = null;
        switch (i) {
            case 1:
                b01 I = st1.I(parcel.readStrongBinder());
                ye3 ye3Var = (ye3) od3.a(parcel, ye3.CREATOR);
                long readLong = parcel.readLong();
                od3.d(parcel);
                initialize(I, ye3Var, readLong);
                break;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) od3.a(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z = false;
                    r4 = true;
                } else {
                    z = false;
                }
                boolean z2 = parcel.readInt() != 0 ? true : z;
                long readLong2 = parcel.readLong();
                od3.d(parcel);
                logEvent(readString, readString2, bundle, r4, z2, readLong2);
                break;
            case 3:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) od3.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    je3Var = queryLocalInterface instanceof je3 ? (je3) queryLocalInterface : new ie3(readStrongBinder);
                }
                je3 je3Var17 = je3Var;
                long readLong3 = parcel.readLong();
                od3.d(parcel);
                logEventAndBundle(readString3, readString4, bundle2, je3Var17, readLong3);
                break;
            case 4:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                b01 I2 = st1.I(parcel.readStrongBinder());
                ClassLoader classLoader = od3.a;
                r4 = parcel.readInt() != 0;
                long readLong4 = parcel.readLong();
                od3.d(parcel);
                setUserProperty(readString5, readString6, I2, r4, readLong4);
                break;
            case 5:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                ClassLoader classLoader2 = od3.a;
                r4 = parcel.readInt() != 0;
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    je3Var16 = queryLocalInterface2 instanceof je3 ? (je3) queryLocalInterface2 : new ie3(readStrongBinder2);
                }
                od3.d(parcel);
                getUserProperties(readString7, readString8, r4, je3Var16);
                break;
            case 6:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    je3Var15 = queryLocalInterface3 instanceof je3 ? (je3) queryLocalInterface3 : new ie3(readStrongBinder3);
                }
                od3.d(parcel);
                getMaxUserProperties(readString9, je3Var15);
                break;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                od3.d(parcel);
                setUserId(readString10, readLong5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) od3.a(parcel, Bundle.CREATOR);
                long readLong6 = parcel.readLong();
                od3.d(parcel);
                setConditionalUserProperty(bundle3, readLong6);
                break;
            case 9:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                Bundle bundle4 = (Bundle) od3.a(parcel, Bundle.CREATOR);
                od3.d(parcel);
                clearConditionalUserProperty(readString11, readString12, bundle4);
                break;
            case 10:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    je3Var14 = queryLocalInterface4 instanceof je3 ? (je3) queryLocalInterface4 : new ie3(readStrongBinder4);
                }
                od3.d(parcel);
                getConditionalUserProperties(readString13, readString14, je3Var14);
                break;
            case 11:
                ClassLoader classLoader3 = od3.a;
                r4 = parcel.readInt() != 0;
                long readLong7 = parcel.readLong();
                od3.d(parcel);
                setMeasurementEnabled(r4, readLong7);
                break;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                long readLong8 = parcel.readLong();
                od3.d(parcel);
                resetAnalyticsData(readLong8);
                break;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                long readLong9 = parcel.readLong();
                od3.d(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                long readLong10 = parcel.readLong();
                od3.d(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                b01 I3 = st1.I(parcel.readStrongBinder());
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                long readLong11 = parcel.readLong();
                od3.d(parcel);
                setCurrentScreen(I3, readString15, readString16, readLong11);
                break;
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    je3Var13 = queryLocalInterface5 instanceof je3 ? (je3) queryLocalInterface5 : new ie3(readStrongBinder5);
                }
                od3.d(parcel);
                getCurrentScreenName(je3Var13);
                break;
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    je3Var12 = queryLocalInterface6 instanceof je3 ? (je3) queryLocalInterface6 : new ie3(readStrongBinder6);
                }
                od3.d(parcel);
                getCurrentScreenClass(je3Var12);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    xe3Var = queryLocalInterface7 instanceof xe3 ? (xe3) queryLocalInterface7 : new we3(readStrongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", 2);
                }
                od3.d(parcel);
                setInstanceIdProvider(xe3Var);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    je3Var11 = queryLocalInterface8 instanceof je3 ? (je3) queryLocalInterface8 : new ie3(readStrongBinder8);
                }
                od3.d(parcel);
                getCachedAppInstanceId(je3Var11);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    je3Var10 = queryLocalInterface9 instanceof je3 ? (je3) queryLocalInterface9 : new ie3(readStrongBinder9);
                }
                od3.d(parcel);
                getAppInstanceId(je3Var10);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    je3Var9 = queryLocalInterface10 instanceof je3 ? (je3) queryLocalInterface10 : new ie3(readStrongBinder10);
                }
                od3.d(parcel);
                getGmpAppId(je3Var9);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    je3Var8 = queryLocalInterface11 instanceof je3 ? (je3) queryLocalInterface11 : new ie3(readStrongBinder11);
                }
                od3.d(parcel);
                generateEventId(je3Var8);
                break;
            case 23:
                String readString17 = parcel.readString();
                long readLong12 = parcel.readLong();
                od3.d(parcel);
                beginAdUnitExposure(readString17, readLong12);
                break;
            case 24:
                String readString18 = parcel.readString();
                long readLong13 = parcel.readLong();
                od3.d(parcel);
                endAdUnitExposure(readString18, readLong13);
                break;
            case Constants.MAX_TREE_DEPTH /* 25 */:
                b01 I4 = st1.I(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                od3.d(parcel);
                onActivityStarted(I4, readLong14);
                break;
            case 26:
                b01 I5 = st1.I(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                od3.d(parcel);
                onActivityStopped(I5, readLong15);
                break;
            case 27:
                b01 I6 = st1.I(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) od3.a(parcel, Bundle.CREATOR);
                long readLong16 = parcel.readLong();
                od3.d(parcel);
                onActivityCreated(I6, bundle5, readLong16);
                break;
            case 28:
                b01 I7 = st1.I(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                od3.d(parcel);
                onActivityDestroyed(I7, readLong17);
                break;
            case 29:
                b01 I8 = st1.I(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                od3.d(parcel);
                onActivityPaused(I8, readLong18);
                break;
            case 30:
                b01 I9 = st1.I(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                od3.d(parcel);
                onActivityResumed(I9, readLong19);
                break;
            case 31:
                b01 I10 = st1.I(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    je3Var7 = queryLocalInterface12 instanceof je3 ? (je3) queryLocalInterface12 : new ie3(readStrongBinder12);
                }
                long readLong20 = parcel.readLong();
                od3.d(parcel);
                onActivitySaveInstanceState(I10, je3Var7, readLong20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) od3.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    je3Var6 = queryLocalInterface13 instanceof je3 ? (je3) queryLocalInterface13 : new ie3(readStrongBinder13);
                }
                long readLong21 = parcel.readLong();
                od3.d(parcel);
                performAction(bundle6, je3Var6, readLong21);
                break;
            case 33:
                int readInt = parcel.readInt();
                String readString19 = parcel.readString();
                b01 I11 = st1.I(parcel.readStrongBinder());
                b01 I12 = st1.I(parcel.readStrongBinder());
                b01 I13 = st1.I(parcel.readStrongBinder());
                od3.d(parcel);
                logHealthData(readInt, readString19, I11, I12, I13);
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    ve3Var3 = queryLocalInterface14 instanceof ve3 ? (ve3) queryLocalInterface14 : new ne3(readStrongBinder14);
                }
                od3.d(parcel);
                setEventInterceptor(ve3Var3);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    ve3Var2 = queryLocalInterface15 instanceof ve3 ? (ve3) queryLocalInterface15 : new ne3(readStrongBinder15);
                }
                od3.d(parcel);
                registerOnMeasurementEventListener(ve3Var2);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    ve3Var = queryLocalInterface16 instanceof ve3 ? (ve3) queryLocalInterface16 : new ne3(readStrongBinder16);
                }
                od3.d(parcel);
                unregisterOnMeasurementEventListener(ve3Var);
                break;
            case 37:
                HashMap readHashMap = parcel.readHashMap(od3.a);
                od3.d(parcel);
                initForTests(readHashMap);
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    je3Var5 = queryLocalInterface17 instanceof je3 ? (je3) queryLocalInterface17 : new ie3(readStrongBinder17);
                }
                int readInt2 = parcel.readInt();
                od3.d(parcel);
                getTestFlag(je3Var5, readInt2);
                break;
            case 39:
                ClassLoader classLoader4 = od3.a;
                r4 = parcel.readInt() != 0;
                od3.d(parcel);
                setDataCollectionEnabled(r4);
                break;
            case RequestError.NETWORK_FAILURE /* 40 */:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    je3Var4 = queryLocalInterface18 instanceof je3 ? (je3) queryLocalInterface18 : new ie3(readStrongBinder18);
                }
                od3.d(parcel);
                isDataCollectionEnabled(je3Var4);
                break;
            case RequestError.NO_DEV_KEY /* 41 */:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) od3.a(parcel, Bundle.CREATOR);
                od3.d(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long readLong22 = parcel.readLong();
                od3.d(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) od3.a(parcel, Bundle.CREATOR);
                long readLong23 = parcel.readLong();
                od3.d(parcel);
                setConsent(bundle8, readLong23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) od3.a(parcel, Bundle.CREATOR);
                long readLong24 = parcel.readLong();
                od3.d(parcel);
                setConsentThirdParty(bundle9, readLong24);
                break;
            case 46:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    je3Var3 = queryLocalInterface19 instanceof je3 ? (je3) queryLocalInterface19 : new ie3(readStrongBinder19);
                }
                od3.d(parcel);
                getSessionId(je3Var3);
                break;
            case 48:
                Intent intent = (Intent) od3.a(parcel, Intent.CREATOR);
                od3.d(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                ze3 ze3Var = (ze3) od3.a(parcel, ze3.CREATOR);
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                long readLong25 = parcel.readLong();
                od3.d(parcel);
                setCurrentScreenByScionActivityInfo(ze3Var, readString20, readString21, readLong25);
                break;
            case 51:
                ze3 ze3Var2 = (ze3) od3.a(parcel, ze3.CREATOR);
                long readLong26 = parcel.readLong();
                od3.d(parcel);
                onActivityStartedByScionActivityInfo(ze3Var2, readLong26);
                break;
            case 52:
                ze3 ze3Var3 = (ze3) od3.a(parcel, ze3.CREATOR);
                long readLong27 = parcel.readLong();
                od3.d(parcel);
                onActivityStoppedByScionActivityInfo(ze3Var3, readLong27);
                break;
            case 53:
                ze3 ze3Var4 = (ze3) od3.a(parcel, ze3.CREATOR);
                Bundle bundle10 = (Bundle) od3.a(parcel, Bundle.CREATOR);
                long readLong28 = parcel.readLong();
                od3.d(parcel);
                onActivityCreatedByScionActivityInfo(ze3Var4, bundle10, readLong28);
                break;
            case 54:
                ze3 ze3Var5 = (ze3) od3.a(parcel, ze3.CREATOR);
                long readLong29 = parcel.readLong();
                od3.d(parcel);
                onActivityDestroyedByScionActivityInfo(ze3Var5, readLong29);
                break;
            case 55:
                ze3 ze3Var6 = (ze3) od3.a(parcel, ze3.CREATOR);
                long readLong30 = parcel.readLong();
                od3.d(parcel);
                onActivityPausedByScionActivityInfo(ze3Var6, readLong30);
                break;
            case 56:
                ze3 ze3Var7 = (ze3) od3.a(parcel, ze3.CREATOR);
                long readLong31 = parcel.readLong();
                od3.d(parcel);
                onActivityResumedByScionActivityInfo(ze3Var7, readLong31);
                break;
            case 57:
                ze3 ze3Var8 = (ze3) od3.a(parcel, ze3.CREATOR);
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    je3Var2 = queryLocalInterface20 instanceof je3 ? (je3) queryLocalInterface20 : new ie3(readStrongBinder20);
                }
                long readLong32 = parcel.readLong();
                od3.d(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(ze3Var8, je3Var2, readLong32);
                break;
            case 58:
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    me3Var = queryLocalInterface21 instanceof me3 ? (me3) queryLocalInterface21 : new ke3(readStrongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback", 2);
                }
                od3.d(parcel);
                retrieveAndUploadBatches(me3Var);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
