package com.appsflyer.internal.connector.purcahse;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchasesParams;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1r;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.InterfaceC1490j3;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public class AFPurchaseConnectorA1u implements BillingClientStateListener, PurchasesUpdatedListener, AFPurchaseConnectorA1r, AFPurchaseConnectorA1y {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int PurchaseClientBuilder = 0;
    private static int logSubscriptions = 1;
    private static long setSandbox = 1913538383092066235L;
    private AFPurchaseConnectorA1r.AFPurchaseConnectorA1x InAppPurchaseEvent;
    private ScheduledExecutorService equals;
    private final BillingClient getOneTimePurchaseOfferDetails;
    private final AFPurchaseConnectorA1l getPackageName;
    final SharedPreferences getQuantity;
    private final AFPurchaseConnectorA1v stopObservingTransactions;
    final Context toJsonMap;
    private final PurchasesResponseListener startObservingTransactions = new PurchasesResponseListener() { // from class: com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1u.5
        @Override // com.android.billingclient.api.PurchasesResponseListener
        public final void onQueryPurchasesResponse(BillingResult billingResult, List<Purchase> list) {
            if (billingResult.getResponseCode() != 0) {
                AFLogger.afWarnLog("[PurchaseConnector]: Failed to query purchases history");
            } else if (!list.isEmpty()) {
                AFPurchaseConnectorA1u.this.getPackageName(list);
            } else {
                AFPurchaseConnectorA1u.this.getQuantity.edit().putBoolean("inapp_purchases_history_processed", true).apply();
                AFLogger.afDebugLog("[PurchaseConnector]: No history for non-consumed one-time purchases found");
            }
        }
    };
    private final PurchasesResponseListener PurchaseClient = new PurchasesResponseListener() { // from class: com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1u.1
        private static int $10 = 0;
        private static int $11 = 1;
        private static int getOneTimePurchaseOfferDetails = 1;
        private static int[] getPackageName = {1480127459, 1870905519, -2086726114, -1195519311, -721237928, 1029398052, 1886925259, 513191056, -1623653556, -402706125, -2037654713, 233685496, -1374427459, 130651729, -1313398039, -1738649748, -1699343426, 1532763029};
        private static int getQuantity;

        private static void a(int[] iArr, int i4, Object[] objArr) {
            int length;
            int[] iArr2;
            int i5;
            int length2;
            int[] iArr3;
            int i6;
            AFPurchaseConnectorA1c aFPurchaseConnectorA1c = new AFPurchaseConnectorA1c();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr4 = getPackageName;
            long j4 = -6033101233399176549L;
            if (iArr4 != null) {
                int i7 = $11 + 79;
                $10 = i7 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i7 % 2 != 0) {
                    length2 = iArr4.length;
                    iArr3 = new int[length2];
                    i6 = 1;
                } else {
                    length2 = iArr4.length;
                    iArr3 = new int[length2];
                    i6 = 0;
                }
                while (i6 < length2) {
                    int i8 = $10 + 81;
                    $11 = i8 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i8 % 2 == 0) {
                        iArr3[i6] = (int) (iArr4[i6] - 6033101233399176549L);
                        i6 >>= 1;
                    } else {
                        iArr3[i6] = (int) (iArr4[i6] ^ (-6033101233399176549L));
                        i6++;
                    }
                }
                iArr4 = iArr3;
            }
            int length3 = iArr4.length;
            int[] iArr5 = new int[length3];
            int[] iArr6 = getPackageName;
            if (iArr6 != null) {
                int i9 = $10 + 107;
                $11 = i9 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i9 % 2 == 0) {
                    length = iArr6.length;
                    iArr2 = new int[length];
                    i5 = 1;
                } else {
                    length = iArr6.length;
                    iArr2 = new int[length];
                    i5 = 0;
                }
                while (i5 < length) {
                    long j5 = j4;
                    iArr2[i5] = (int) (iArr6[i5] ^ j5);
                    i5++;
                    j4 = j5;
                }
                iArr6 = iArr2;
            }
            System.arraycopy(iArr6, 0, iArr5, 0, length3);
            aFPurchaseConnectorA1c.InAppPurchaseEvent = 0;
            while (true) {
                int i10 = aFPurchaseConnectorA1c.InAppPurchaseEvent;
                if (i10 >= iArr.length) {
                    objArr[0] = new String(cArr2, 0, i4);
                    return;
                }
                int i11 = iArr[i10];
                char c4 = (char) (i11 >> 16);
                cArr[0] = c4;
                char c5 = (char) i11;
                cArr[1] = c5;
                char c6 = (char) (iArr[i10 + 1] >> 16);
                cArr[2] = c6;
                char c7 = (char) iArr[i10 + 1];
                cArr[3] = c7;
                aFPurchaseConnectorA1c.getQuantity = (c4 << 16) + c5;
                aFPurchaseConnectorA1c.toJsonMap = (c6 << 16) + c7;
                AFPurchaseConnectorA1c.InAppPurchaseEvent(iArr5);
                int i12 = 0;
                while (i12 < 16) {
                    int i13 = aFPurchaseConnectorA1c.getQuantity ^ iArr5[i12];
                    aFPurchaseConnectorA1c.getQuantity = i13;
                    int quantity = AFPurchaseConnectorA1c.getQuantity(i13) ^ aFPurchaseConnectorA1c.toJsonMap;
                    int i14 = aFPurchaseConnectorA1c.getQuantity;
                    aFPurchaseConnectorA1c.getQuantity = quantity;
                    aFPurchaseConnectorA1c.toJsonMap = i14;
                    i12++;
                    $11 = ($10 + 73) % UserVerificationMethods.USER_VERIFY_PATTERN;
                }
                int i15 = aFPurchaseConnectorA1c.getQuantity;
                int i16 = aFPurchaseConnectorA1c.toJsonMap;
                aFPurchaseConnectorA1c.getQuantity = i16;
                aFPurchaseConnectorA1c.toJsonMap = i15;
                int i17 = i15 ^ iArr5[16];
                aFPurchaseConnectorA1c.toJsonMap = i17;
                int i18 = i16 ^ iArr5[17];
                aFPurchaseConnectorA1c.getQuantity = i18;
                cArr[0] = (char) (i18 >>> 16);
                cArr[1] = (char) i18;
                cArr[2] = (char) (i17 >>> 16);
                cArr[3] = (char) i17;
                AFPurchaseConnectorA1c.InAppPurchaseEvent(iArr5);
                int i19 = aFPurchaseConnectorA1c.InAppPurchaseEvent;
                cArr2[i19 * 2] = cArr[0];
                cArr2[(i19 * 2) + 1] = cArr[1];
                cArr2[(i19 * 2) + 2] = cArr[2];
                cArr2[(i19 * 2) + 3] = cArr[3];
                aFPurchaseConnectorA1c.InAppPurchaseEvent = i19 + 2;
                $11 = ($10 + 79) % UserVerificationMethods.USER_VERIFY_PATTERN;
            }
        }

        @Override // com.android.billingclient.api.PurchasesResponseListener
        public final void onQueryPurchasesResponse(BillingResult billingResult, List<Purchase> list) {
            int i4 = getQuantity + 117;
            getOneTimePurchaseOfferDetails = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 == 0) {
                billingResult.getResponseCode();
                throw null;
            }
            if (billingResult.getResponseCode() != 0) {
                AFLogger.afWarnLog("[PurchaseConnector]: Failed to query purchases history");
                return;
            }
            if (list.isEmpty()) {
                getOneTimePurchaseOfferDetails = (getQuantity + InterfaceC1490j3.d.b.f16810b) % UserVerificationMethods.USER_VERIFY_PATTERN;
                SharedPreferences.Editor edit = AFPurchaseConnectorA1u.this.getQuantity.edit();
                Object[] objArr = new Object[1];
                a(new int[]{781822138, 818696279, 1224573440, -2078472429, -624357308, -34214158, -544312192, 273047310, -785581712, -501433753, -78984151, 684984616}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 23, objArr);
                edit.putBoolean(((String) objArr[0]).intern(), true).apply();
                AFLogger.afDebugLog("[PurchaseConnector]: No active subscriptions and/or non-consumed one-time purchases found");
                return;
            }
            AFPurchaseConnectorA1u.this.getPackageName(billingResult, list, true);
            int i5 = getOneTimePurchaseOfferDetails + 81;
            getQuantity = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i5 % 2 != 0) {
                int i6 = 43 / 0;
            }
        }
    };
    private final PurchasesResponseListener hashCode = new PurchasesResponseListener() { // from class: com.appsflyer.internal.connector.purcahse.a
        @Override // com.android.billingclient.api.PurchasesResponseListener
        public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
            AFPurchaseConnectorA1u.this.toJsonMap(billingResult, list);
        }
    };
    private boolean autoLogInApps = true;

    public class AFPurchaseConnectorA1x implements AFPurchaseConnectorA1r.AFPurchaseConnectorA1w<BillingClient> {
        final PurchasesUpdatedListener getOneTimePurchaseOfferDetails;

        public AFPurchaseConnectorA1x(PurchasesUpdatedListener purchasesUpdatedListener) {
            this.getOneTimePurchaseOfferDetails = purchasesUpdatedListener;
        }
    }

    public AFPurchaseConnectorA1u(Context context, AFPurchaseConnectorA1x aFPurchaseConnectorA1x, SharedPreferences sharedPreferences, AFPurchaseConnectorA1l aFPurchaseConnectorA1l) {
        aFPurchaseConnectorA1x = aFPurchaseConnectorA1x == null ? new AFPurchaseConnectorA1x(this) : aFPurchaseConnectorA1x;
        this.toJsonMap = context;
        this.getQuantity = sharedPreferences;
        this.getOneTimePurchaseOfferDetails = BillingClient.newBuilder(AFPurchaseConnectorA1u.this.toJsonMap).setListener(aFPurchaseConnectorA1x.getOneTimePurchaseOfferDetails).enablePendingPurchases().build();
        this.getPackageName = aFPurchaseConnectorA1l;
        this.stopObservingTransactions = new AFPurchaseConnectorA1v(this, getQuantity());
    }

    private void equals() {
        logSubscriptions = (PurchaseClientBuilder + 49) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            if (this.getQuantity.getBoolean("inapp_purchases_history_processed", false)) {
                return;
            }
            this.getOneTimePurchaseOfferDetails.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), this.startObservingTransactions);
            logSubscriptions = (PurchaseClientBuilder + 27) % UserVerificationMethods.USER_VERIFY_PATTERN;
        } catch (Throwable th) {
            try {
                Object[] objArr = {th};
                Map map = AFPurchaseConnectorA1w.PurchaseClientCompanion;
                Object obj = map.get(-1174844903);
                if (obj == null) {
                    obj = ((Class) AFPurchaseConnectorA1w.getQuantity(70 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 69 - Process.getGidForName(""), (char) View.MeasureSpec.getSize(0))).getMethod("getQuantity", Throwable.class);
                    map.put(-1174844903, obj);
                }
                ((Method) obj).invoke(null, objArr);
                AFLogger.afErrorLog("[PurchaseConnector]: Failed to log purchases history", th, true);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (r0.getBoolean(((java.lang.String) r5[0]).intern(), false) != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:21:0x006e, B:24:0x00b6, B:28:0x0082), top: B:20:0x006e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void stopObservingTransactions() {
        Object obj;
        int i4 = PurchaseClientBuilder + 67;
        logSubscriptions = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            try {
                if (i4 % 2 == 0) {
                    SharedPreferences sharedPreferences = this.getQuantity;
                    Object[] objArr = new Object[1];
                    a("搜摽炽\uf4c5䆏\uaacc䧨⚍瑓\ue4e0姜㛭䐠풂榴ۊ名쑌祷ᘵⓎ둮।昁㒱ꐁᤧ", ViewConfiguration.getWindowTouchSlop() + 83, objArr);
                    if (sharedPreferences.getBoolean(((String) objArr[0]).intern(), false)) {
                        int i5 = logSubscriptions + 63;
                        PurchaseClientBuilder = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (i5 % 2 != 0) {
                            int i6 = 5 / 0;
                            return;
                        }
                        return;
                    }
                    this.getOneTimePurchaseOfferDetails.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("subs").build(), this.PurchaseClient);
                    return;
                }
                SharedPreferences sharedPreferences2 = this.getQuantity;
                Object[] objArr2 = new Object[1];
                a("搜摽炽\uf4c5䆏\uaacc䧨⚍瑓\ue4e0姜㛭䐠풂榴ۊ名쑌祷ᘵⓎ둮।昁㒱ꐁᤧ", ViewConfiguration.getWindowTouchSlop() >> 8, objArr2);
            } catch (Throwable th) {
                Object[] objArr3 = {th};
                Map map = AFPurchaseConnectorA1w.PurchaseClientCompanion;
                obj = map.get(-1174844903);
                if (obj != null) {
                }
                ((Method) obj).invoke(null, objArr3);
                AFLogger.afErrorLog("[PurchaseConnector]: Failed to log purchases history", th, true);
                return;
            }
            Object[] objArr32 = {th};
            Map map2 = AFPurchaseConnectorA1w.PurchaseClientCompanion;
            obj = map2.get(-1174844903);
            if (obj != null) {
                obj = ((Class) AFPurchaseConnectorA1w.getQuantity(69 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 70 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((-1) - ImageFormat.getBitsPerPixel(0)))).getMethod("getQuantity", Throwable.class);
                map2.put(-1174844903, obj);
            }
            ((Method) obj).invoke(null, objArr32);
            AFLogger.afErrorLog("[PurchaseConnector]: Failed to log purchases history", th, true);
            return;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void toJsonMap(BillingResult billingResult, List list) {
        if (billingResult.getResponseCode() != 0) {
            int i4 = PurchaseClientBuilder + 31;
            logSubscriptions = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0) {
                AFLogger.afWarnLog("[PurchaseConnector]: Failed to query purchases history");
                return;
            } else {
                AFLogger.afWarnLog("[PurchaseConnector]: Failed to query purchases history");
                throw null;
            }
        }
        getPackageName(billingResult, list, false);
        int i5 = PurchaseClientBuilder + 63;
        logSubscriptions = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
    }

    @Override // com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1r
    public void InAppPurchaseEvent() {
        logSubscriptions = (PurchaseClientBuilder + 91) % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (this.autoLogInApps) {
            this.autoLogInApps = false;
            this.getOneTimePurchaseOfferDetails.startConnection(this);
            Context context = this.toJsonMap;
            if (context instanceof Application) {
                int i4 = logSubscriptions + 39;
                PurchaseClientBuilder = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i4 % 2 != 0) {
                    ((Application) context).registerActivityLifecycleCallbacks(this.stopObservingTransactions);
                    throw null;
                }
                ((Application) context).registerActivityLifecycleCallbacks(this.stopObservingTransactions);
            }
        }
        int i5 = logSubscriptions + 5;
        PurchaseClientBuilder = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i5 % 2 != 0) {
            int i6 = 46 / 0;
        }
    }

    @Override // com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1r
    public boolean getOneTimePurchaseOfferDetails() {
        int i4 = logSubscriptions;
        boolean z4 = this.autoLogInApps;
        int i5 = i4 + 57;
        PurchaseClientBuilder = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i5 % 2 == 0) {
            return z4;
        }
        throw null;
    }

    void getPackageName(List<Purchase> list) {
        HashSet hashSet = new HashSet();
        Iterator<Purchase> it = list.iterator();
        while (it.hasNext()) {
            PurchaseClientBuilder = (logSubscriptions + 73) % UserVerificationMethods.USER_VERIFY_PATTERN;
            hashSet.add(it.next().getPurchaseToken());
            logSubscriptions = (PurchaseClientBuilder + 39) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        this.getPackageName.toJsonMap(hashSet);
        this.getQuantity.edit().putBoolean("inapp_purchases_history_processed", true).apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        r0 = r4.equals;
        r2 = com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1u.logSubscriptions + 5;
        com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1u.PurchaseClientBuilder = r2 % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if ((r2 % 2) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        r1 = 68 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x001e, code lost:
    
        r0 = java.util.concurrent.Executors.newScheduledThreadPool(2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        r4.equals = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x001c, code lost:
    
        if (r4.equals == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (r4.equals == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized ScheduledExecutorService getQuantity() {
        try {
            int i4 = PurchaseClientBuilder + 1;
            logSubscriptions = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 == 0) {
                int i5 = 20 / 0;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingServiceDisconnected() {
        PurchaseClientBuilder = (logSubscriptions + 47) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFLogger.afDebugLog("[PurchaseConnector]: onBillingServiceDisconnected");
        int i4 = PurchaseClientBuilder + 1;
        logSubscriptions = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingSetupFinished(BillingResult billingResult) {
        PurchaseClientBuilder = (logSubscriptions + 91) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFLogger.afDebugLog("[PurchaseConnector]: onBillingSetupFinished");
        if (billingResult.getResponseCode() != 0) {
            return;
        }
        stopObservingTransactions();
        equals();
        int i4 = PurchaseClientBuilder + 3;
        logSubscriptions = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list) {
        PurchaseClientBuilder = (logSubscriptions + 17) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFLogger.afDebugLog("[PurchaseConnector]: onPurchasesUpdated");
        getPackageName(billingResult, list, false);
        int i4 = logSubscriptions + 9;
        PurchaseClientBuilder = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static void a(String str, int i4, Object[] objArr) {
        char[] cArr = str;
        if (str != null) {
            int i5 = $11 + 55;
            $10 = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i5 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            cArr = str.toCharArray();
        }
        AFPurchaseConnectorA2z aFPurchaseConnectorA2z = new AFPurchaseConnectorA2z();
        char[] oneTimePurchaseOfferDetails = AFPurchaseConnectorA2z.getOneTimePurchaseOfferDetails(setSandbox ^ 7848782090230080433L, cArr, i4);
        aFPurchaseConnectorA2z.getPackageName = 4;
        while (true) {
            int i6 = aFPurchaseConnectorA2z.getPackageName;
            if (i6 >= oneTimePurchaseOfferDetails.length) {
                objArr[0] = new String(oneTimePurchaseOfferDetails, 4, oneTimePurchaseOfferDetails.length - 4);
                return;
            }
            int i7 = ($11 + 63) % UserVerificationMethods.USER_VERIFY_PATTERN;
            $10 = i7;
            aFPurchaseConnectorA2z.getOneTimePurchaseOfferDetails = i6 - 4;
            oneTimePurchaseOfferDetails[i6] = (char) ((oneTimePurchaseOfferDetails[i6] ^ oneTimePurchaseOfferDetails[i6 % 4]) ^ (r5 * (setSandbox ^ 7848782090230080433L)));
            aFPurchaseConnectorA2z.getPackageName = i6 + 1;
            $11 = (i7 + 39) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
    }

    private void getOneTimePurchaseOfferDetails(String str, List<String> list, List<Purchase> list2, boolean z4) {
        int i4 = logSubscriptions + 11;
        PurchaseClientBuilder = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            "subs".equals(str);
            throw null;
        }
        if ((!"subs".equals(str)) && !"inapp".equals(str)) {
            StringBuilder sb = new StringBuilder("[PurchaseConnector]: ");
            sb.append(str);
            sb.append(" SKU type is illegal");
            AFLogger.afWarnLog(sb.toString());
            return;
        }
        StringBuilder sb2 = new StringBuilder("[PurchaseConnector]: Querying Sku details:\n\ttype: ");
        sb2.append(str);
        sb2.append("\n\tSkus: ");
        try {
            Object[] objArr = {list, ", "};
            Map map = AFPurchaseConnectorA1w.PurchaseClientCompanion;
            Object obj = map.get(-1211899119);
            if (obj == null) {
                obj = ((Class) AFPurchaseConnectorA1w.getQuantity(TextUtils.getTrimmedLength("") + 70, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 70, (char) KeyEvent.keyCodeFromString(""))).getMethod("getPackageName", List.class, CharSequence.class);
                map.put(-1211899119, obj);
            }
            sb2.append((String) ((Method) obj).invoke(null, objArr));
            AFLogger.afDebugLog(sb2.toString());
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = list.iterator();
            logSubscriptions = (PurchaseClientBuilder + 57) % UserVerificationMethods.USER_VERIFY_PATTERN;
            while (it.hasNext()) {
                int i5 = PurchaseClientBuilder + 35;
                logSubscriptions = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i5 % 2 == 0) {
                    arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId(it.next()).setProductType(str).build());
                    throw null;
                }
                arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId(it.next()).setProductType(str).build());
            }
            QueryProductDetailsParams build = QueryProductDetailsParams.newBuilder().setProductList(arrayList).build();
            AFPurchaseConnectorA1r.AFPurchaseConnectorA1x aFPurchaseConnectorA1x = this.InAppPurchaseEvent;
            if (aFPurchaseConnectorA1x == null) {
                AFLogger.afWarnLog("[PurchaseConnector]: Skipping queryProductDetailsAsync because BillingUpdatesListener is null");
                return;
            }
            this.getOneTimePurchaseOfferDetails.queryProductDetailsAsync(build, new AFPurchaseConnectorA1n(str, aFPurchaseConnectorA1x, list2, z4));
            int i6 = logSubscriptions + 83;
            PurchaseClientBuilder = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i6 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1r
    public void toJsonMap(AFPurchaseConnectorA1r.AFPurchaseConnectorA1x aFPurchaseConnectorA1x) {
        int i4 = PurchaseClientBuilder + 119;
        int i5 = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        logSubscriptions = i5;
        if (i4 % 2 == 0) {
            this.InAppPurchaseEvent = aFPurchaseConnectorA1x;
            int i6 = 76 / 0;
        } else {
            this.InAppPurchaseEvent = aFPurchaseConnectorA1x;
        }
        int i7 = i5 + 55;
        PurchaseClientBuilder = i7 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1r
    public void getPackageName() {
        logSubscriptions = (PurchaseClientBuilder + 15) % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (!this.autoLogInApps) {
            this.autoLogInApps = true;
            this.getOneTimePurchaseOfferDetails.endConnection();
        }
        int i4 = PurchaseClientBuilder + 19;
        logSubscriptions = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1y
    public void toJsonMap() {
        logSubscriptions = (PurchaseClientBuilder + InterfaceC1490j3.d.b.f16810b) % UserVerificationMethods.USER_VERIFY_PATTERN;
        SharedPreferences sharedPreferences = this.getQuantity;
        Object[] objArr = new Object[1];
        a("搜摽炽\uf4c5䆏\uaacc䧨⚍瑓\ue4e0姜㛭䐠풂榴ۊ名쑌祷ᘵⓎ둮।昁㒱ꐁᤧ", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
        if (sharedPreferences.getBoolean(((String) objArr[0]).intern(), false)) {
            int i4 = PurchaseClientBuilder + 57;
            logSubscriptions = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0) {
                this.getOneTimePurchaseOfferDetails.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("subs").build(), this.hashCode);
                PurchaseClientBuilder = (logSubscriptions + 51) % UserVerificationMethods.USER_VERIFY_PATTERN;
            } else {
                this.getOneTimePurchaseOfferDetails.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("subs").build(), this.hashCode);
                throw null;
            }
        }
        if (this.getQuantity.getBoolean("inapp_purchases_history_processed", false)) {
            this.getOneTimePurchaseOfferDetails.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), this.hashCode);
            logSubscriptions = (PurchaseClientBuilder + 75) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019b A[Catch: all -> 0x01d5, TryCatch #2 {all -> 0x01d5, blocks: (B:71:0x0187, B:74:0x01c9, B:78:0x019b), top: B:70:0x0187 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void getPackageName(BillingResult billingResult, List<Purchase> list, boolean z4) {
        Object obj;
        PurchaseClientBuilder = (logSubscriptions + 31) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
        } catch (Throwable th) {
            try {
                Object[] objArr = {th};
                Map map = AFPurchaseConnectorA1w.PurchaseClientCompanion;
                obj = map.get(-1174844903);
                if (obj != null) {
                }
                ((Method) obj).invoke(null, objArr);
                AFLogger.afErrorLog("[PurchaseConnector]: Failed to query new purchase details", th, true);
                return;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        if (billingResult.getResponseCode() == 0 && list != null) {
            if (this.getOneTimePurchaseOfferDetails == null) {
                AFLogger.afWarnLog("[PurchaseConnector]: Got Ars billing callback but billing client is missing!");
                return;
            }
            Set<String> quantity = this.getPackageName.getQuantity();
            StringBuilder sb = new StringBuilder("tokens: ");
            sb.append(Arrays.deepToString(quantity.toArray(new String[0])));
            AFLogger.afDebugLog(sb.toString());
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<Purchase> it = list.iterator();
            while (it.hasNext()) {
                int i4 = PurchaseClientBuilder + 107;
                logSubscriptions = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i4 % 2 == 0) {
                    try {
                        Object[] objArr2 = {it.next().getPurchaseToken()};
                        Map map2 = AFPurchaseConnectorA1w.PurchaseClientCompanion;
                        Object obj2 = map2.get(-857619108);
                        if (obj2 == null) {
                            obj2 = ((Class) AFPurchaseConnectorA1w.getQuantity((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 70, (Process.myPid() >> 22) + 70, (char) (Color.rgb(0, 0, 0) + 16777216))).getMethod("getQuantity", String.class);
                            map2.put(-857619108, obj2);
                        }
                        quantity.contains(((Method) obj2).invoke(null, objArr2));
                        throw null;
                    } catch (Throwable th3) {
                        Throwable cause2 = th3.getCause();
                        if (cause2 == null) {
                            throw th3;
                        }
                        throw cause2;
                    }
                }
                Purchase next = it.next();
                try {
                    Object[] objArr3 = {next.getPurchaseToken()};
                    Map map3 = AFPurchaseConnectorA1w.PurchaseClientCompanion;
                    Object obj3 = map3.get(-857619108);
                    if (obj3 == null) {
                        obj3 = ((Class) AFPurchaseConnectorA1w.getQuantity(70 - TextUtils.getTrimmedLength(""), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 70, (char) (ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod("getQuantity", String.class);
                        map3.put(-857619108, obj3);
                    }
                    if (!quantity.contains(((Method) obj3).invoke(null, objArr3))) {
                        arrayList2.add(next);
                        arrayList.addAll(next.getProducts());
                        logSubscriptions = (PurchaseClientBuilder + InterfaceC1490j3.d.b.f16810b) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    }
                } catch (Throwable th4) {
                    Throwable cause3 = th4.getCause();
                    if (cause3 == null) {
                        throw th4;
                    }
                    throw cause3;
                }
                Object[] objArr4 = {th};
                Map map4 = AFPurchaseConnectorA1w.PurchaseClientCompanion;
                obj = map4.get(-1174844903);
                if (obj != null) {
                    obj = ((Class) AFPurchaseConnectorA1w.getQuantity(((Process.getThreadPriority(0) + 20) >> 6) + 70, 70 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) KeyEvent.getDeadChar(0, 0))).getMethod("getQuantity", Throwable.class);
                    map4.put(-1174844903, obj);
                }
                ((Method) obj).invoke(null, objArr4);
                AFLogger.afErrorLog("[PurchaseConnector]: Failed to query new purchase details", th, true);
                return;
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            getOneTimePurchaseOfferDetails("subs", arrayList, arrayList2, z4);
            getOneTimePurchaseOfferDetails("inapp", arrayList, arrayList2, z4);
            logSubscriptions = (PurchaseClientBuilder + 99) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return;
        }
        StringBuilder sb2 = new StringBuilder("[PurchaseConnector]: Failed to setup Ars Play billing service: ");
        sb2.append(billingResult.getResponseCode());
        sb2.append(" ");
        sb2.append(billingResult.getDebugMessage());
        AFLogger.afWarnLog(sb2.toString());
        int i5 = logSubscriptions + 39;
        PurchaseClientBuilder = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i5 % 2 != 0) {
            int i6 = 73 / 0;
        }
    }
}
