package com.appsflyer.api;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.exceptions.SDKMissingException;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1l;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1r;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1u;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1w;
import com.appsflyer.internal.models.InAppPurchaseValidationResult;
import com.appsflyer.internal.models.SubscriptionValidationResult;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public interface PurchaseClient {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata
    public static final class Builder {
        private AppsFlyerLib afClient;
        private AFPurchaseConnectorA1r.AFPurchaseConnectorA1w<?> billingClientFactory;
        private AFPurchaseConnectorA1r connector;
        private final Context context;
        private InAppPurchaseEventDataSource inAppPurchaseEventDataSource;
        private InAppPurchaseValidationResultListener inAppValidationResultListener;
        private final AFPurchaseConnectorA1l purchaseDatabaseHelper;
        private final Set<String> purchaseTypes;
        private boolean sandbox;
        private final Store store;
        private SubscriptionPurchaseEventDataSource subscriptionPurchaseEventDataSource;
        private SubscriptionPurchaseValidationResultListener subscriptionValidationResultListener;

        public /* synthetic */ class AFPurchaseConnectorA1y {
            public static final /* synthetic */ int[] InAppPurchaseEvent;

            static {
                int[] iArr = new int[Store.values().length];
                try {
                    iArr[Store.GOOGLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                InAppPurchaseEvent = iArr;
            }
        }

        public Builder(Context context, Store store) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(store, "");
            this.store = store;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            this.context = applicationContext;
            this.purchaseDatabaseHelper = new AFPurchaseConnectorA1l(context);
            this.purchaseTypes = new HashSet();
        }

        public final Builder autoLogInApps(boolean z4) {
            if (z4) {
                this.purchaseTypes.add("inapp");
                return this;
            }
            this.purchaseTypes.remove("inapp");
            return this;
        }

        public final PurchaseClient build() {
            try {
                if (this.afClient == null) {
                    this.afClient = AppsFlyerLib.getInstance();
                }
                if (AFPurchaseConnectorA1y.InAppPurchaseEvent[this.store.ordinal()] == 1 && this.connector == null) {
                    Context context = this.context;
                    AFPurchaseConnectorA1u.AFPurchaseConnectorA1x aFPurchaseConnectorA1x = (AFPurchaseConnectorA1u.AFPurchaseConnectorA1x) this.billingClientFactory;
                    try {
                        Object[] objArr = {context};
                        Map map = AFPurchaseConnectorA1w.PurchaseClientCompanion;
                        Object obj = map.get(-1362281777);
                        if (obj == null) {
                            obj = ((Class) AFPurchaseConnectorA1w.getQuantity((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 70, (-16777146) - Color.rgb(0, 0, 0), (char) KeyEvent.getDeadChar(0, 0))).getMethod("a_", Context.class);
                            map.put(-1362281777, obj);
                        }
                        this.connector = new AFPurchaseConnectorA1u(context, aFPurchaseConnectorA1x, (SharedPreferences) ((Method) obj).invoke(null, objArr), this.purchaseDatabaseHelper);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                Context context2 = this.context;
                boolean z4 = this.sandbox;
                AFPurchaseConnectorA1r aFPurchaseConnectorA1r = this.connector;
                Intrinsics.checkNotNull(aFPurchaseConnectorA1r);
                Set<String> set = this.purchaseTypes;
                SubscriptionPurchaseValidationResultListener subscriptionPurchaseValidationResultListener = this.subscriptionValidationResultListener;
                InAppPurchaseValidationResultListener inAppPurchaseValidationResultListener = this.inAppValidationResultListener;
                SubscriptionPurchaseEventDataSource subscriptionPurchaseEventDataSource = this.subscriptionPurchaseEventDataSource;
                InAppPurchaseEventDataSource inAppPurchaseEventDataSource = this.inAppPurchaseEventDataSource;
                AppsFlyerLib appsFlyerLib = this.afClient;
                Intrinsics.checkNotNull(appsFlyerLib);
                Object[] objArr2 = {context2, Boolean.valueOf(z4), aFPurchaseConnectorA1r, set, subscriptionPurchaseValidationResultListener, inAppPurchaseValidationResultListener, subscriptionPurchaseEventDataSource, inAppPurchaseEventDataSource, appsFlyerLib, this.purchaseDatabaseHelper};
                Map map2 = AFPurchaseConnectorA1w.PurchaseClientCompanion;
                Object obj2 = map2.get(-2048738244);
                if (obj2 == null) {
                    obj2 = ((Class) AFPurchaseConnectorA1w.getQuantity(TextUtils.indexOf("", "", 0, 0) + 70, KeyEvent.getMaxKeyCode() >> 16, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 41950))).getDeclaredConstructor(Context.class, Boolean.TYPE, AFPurchaseConnectorA1r.class, Set.class, SubscriptionPurchaseValidationResultListener.class, InAppPurchaseValidationResultListener.class, SubscriptionPurchaseEventDataSource.class, InAppPurchaseEventDataSource.class, AppsFlyerLib.class, AFPurchaseConnectorA1l.class);
                    map2.put(-2048738244, obj2);
                }
                return (PurchaseClient) ((Constructor) obj2).newInstance(objArr2);
            } catch (NoClassDefFoundError e4) {
                Log.w("AppsFlyer_Connector", "[PurchaseConnector]: AppsFlyer SDK required!");
                e4.printStackTrace();
                throw new SDKMissingException();
            }
        }

        public final Builder logSubscriptions(boolean z4) {
            if (z4) {
                this.purchaseTypes.add("subs");
                return this;
            }
            this.purchaseTypes.remove("subs");
            return this;
        }

        public final Builder setAfClient(AppsFlyerLib appsFlyerLib) {
            this.afClient = appsFlyerLib;
            return this;
        }

        public final Builder setBillingClientFactory(AFPurchaseConnectorA1r.AFPurchaseConnectorA1w<?> aFPurchaseConnectorA1w) {
            this.billingClientFactory = aFPurchaseConnectorA1w;
            return this;
        }

        public final Builder setConnector(AFPurchaseConnectorA1r aFPurchaseConnectorA1r) {
            this.connector = aFPurchaseConnectorA1r;
            return this;
        }

        public final Builder setInAppPurchaseEventDataSource(InAppPurchaseEventDataSource inAppPurchaseEventDataSource) {
            this.inAppPurchaseEventDataSource = inAppPurchaseEventDataSource;
            return this;
        }

        public final Builder setInAppValidationResultListener(InAppPurchaseValidationResultListener inAppPurchaseValidationResultListener) {
            this.inAppValidationResultListener = inAppPurchaseValidationResultListener;
            return this;
        }

        public final Builder setSandbox(boolean z4) {
            this.sandbox = z4;
            return this;
        }

        public final Builder setSubscriptionPurchaseEventDataSource(SubscriptionPurchaseEventDataSource subscriptionPurchaseEventDataSource) {
            this.subscriptionPurchaseEventDataSource = subscriptionPurchaseEventDataSource;
            return this;
        }

        public final Builder setSubscriptionValidationResultListener(SubscriptionPurchaseValidationResultListener subscriptionPurchaseValidationResultListener) {
            this.subscriptionValidationResultListener = subscriptionPurchaseValidationResultListener;
            return this;
        }
    }

    @Metadata
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String VERSION_NAME = "2.1.0";

        private Companion() {
        }

        public static /* synthetic */ void getVERSION_NAME$annotations() {
        }

        public final String getVERSION_NAME() {
            return VERSION_NAME;
        }
    }

    @Metadata
    public interface InAppPurchaseEventDataSource extends PurchaseEventDataSource<InAppPurchaseEvent> {
    }

    @Metadata
    public interface InAppPurchaseValidationResultListener extends ValidationResultListener<Map<String, ? extends InAppPurchaseValidationResult>> {
    }

    @Metadata
    public interface PurchaseEventDataSource<PurchaseType extends PurchaseEvent> {
        Map<String, Object> onNewPurchases(List<? extends PurchaseType> list);
    }

    @Metadata
    public interface SubscriptionPurchaseEventDataSource extends PurchaseEventDataSource<SubscriptionPurchaseEvent> {
    }

    @Metadata
    public interface SubscriptionPurchaseValidationResultListener extends ValidationResultListener<Map<String, ? extends SubscriptionValidationResult>> {
    }

    @Metadata
    public interface ValidationResultListener<Result> {
        void onFailure(String str, Throwable th);

        void onResponse(Result result);
    }

    static String getVERSION_NAME() {
        return Companion.getVERSION_NAME();
    }

    void startObservingTransactions();

    void stopObservingTransactions();
}
