package dev.cct.translatorapp;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.firebase.FirebaseApp;
import dev.cct.translatorapp.Billing.BillingClass;
import dev.cct.translatorapp.TranslationRoomDatabase;
import dev.cct.translatorapp.TranslatorAdmobAds.AppObserver;
import dev.cct.translatorapp.ads.AppOpenAd;
import dev.cct.translatorapp.ads.ConstantParam;
import java.util.Arrays;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* compiled from: MainApplication.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0001J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Ldev/cct/translatorapp/MainApplication;", "Landroid/app/Application;", "()V", "appObserver", "Ldev/cct/translatorapp/TranslatorAdmobAds/AppObserver;", "applicationScope", "Lkotlinx/coroutines/CoroutineScope;", "database", "Ldev/cct/translatorapp/TranslationRoomDatabase;", "getDatabase", "()Ldev/cct/translatorapp/TranslationRoomDatabase;", "database$delegate", "Lkotlin/Lazy;", "repository", "Ldev/cct/translatorapp/TranslationRepository;", "getRepository", "()Ldev/cct/translatorapp/TranslationRepository;", "repository$delegate", "buildNewConfig", "Lcom/bytedance/sdk/openadsdk/api/init/PAGConfig;", "context", "Landroid/content/Context;", "initPangleSdk", "", "onCreate", "Companion", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MainApplication extends Application {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static Context appContext;
    private AppObserver appObserver;
    private final CoroutineScope applicationScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null));

    /* renamed from: database$delegate, reason: from kotlin metadata */
    private final Lazy database = LazyKt.lazy(new Function0<TranslationRoomDatabase>() { // from class: dev.cct.translatorapp.MainApplication$database$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final TranslationRoomDatabase invoke() {
            CoroutineScope coroutineScope;
            TranslationRoomDatabase.Companion companion = TranslationRoomDatabase.INSTANCE;
            MainApplication mainApplication = MainApplication.this;
            MainApplication mainApplication2 = mainApplication;
            coroutineScope = mainApplication.applicationScope;
            return companion.getDatabase(mainApplication2, coroutineScope);
        }
    });

    /* renamed from: repository$delegate, reason: from kotlin metadata */
    private final Lazy repository = LazyKt.lazy(new Function0<TranslationRepository>() { // from class: dev.cct.translatorapp.MainApplication$repository$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final TranslationRepository invoke() {
            TranslationRoomDatabase database;
            database = MainApplication.this.getDatabase();
            return new TranslationRepository(database.translationDao());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public final TranslationRoomDatabase getDatabase() {
        return (TranslationRoomDatabase) this.database.getValue();
    }

    public final TranslationRepository getRepository() {
        return (TranslationRepository) this.repository.getValue();
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        appContext = applicationContext;
        MainApplication mainApplication = this;
        new BillingClass(mainApplication);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new MainApplication$onCreate$1(this, null), 3, null);
        FirebaseApp.initializeApp(mainApplication);
        AudienceNetworkAds.initialize(mainApplication);
        MobileAds.initialize(mainApplication, new OnInitializationCompleteListener() { // from class: dev.cct.translatorapp.MainApplication$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
            public final void onInitializationComplete(InitializationStatus initializationStatus) {
                MainApplication.onCreate$lambda$0(initializationStatus);
            }
        });
        try {
            new AppOpenAd(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        AppObserver appObserver = new AppObserver(ConstantParam.INSTANCE.getAppOpen());
        this.appObserver = appObserver;
        ProcessLifecycleOwner.INSTANCE.get().getLifecycle().addObserver(appObserver);
        registerActivityLifecycleCallbacks(appObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(InitializationStatus initializationStatus) {
        Intrinsics.checkNotNullParameter(initializationStatus, "initializationStatus");
        Map<String, AdapterStatus> adapterStatusMap = initializationStatus.getAdapterStatusMap();
        Intrinsics.checkNotNullExpressionValue(adapterStatusMap, "initializationStatus.adapterStatusMap");
        for (String str : adapterStatusMap.keySet()) {
            AdapterStatus adapterStatus = adapterStatusMap.get(str);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Intrinsics.checkNotNull(adapterStatus);
            String format = String.format("Adapter name: %s, Description: %s, Latency: %d", Arrays.copyOf(new Object[]{str, adapterStatus.getDescription(), Integer.valueOf(adapterStatus.getLatency())}, 3));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            Log.d("MyApp", format);
        }
    }

    /* compiled from: MainApplication.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldev/cct/translatorapp/MainApplication$Companion;", "", "()V", "<set-?>", "Landroid/content/Context;", "appContext", "getAppContext", "()Landroid/content/Context;", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Context getAppContext() {
            Context context = MainApplication.appContext;
            if (context != null) {
                return context;
            }
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
            return null;
        }
    }

    public final void initPangleSdk(Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Application application = context;
        PAGSdk.init(application, buildNewConfig(application), new PAGSdk.PAGInitCallback() { // from class: dev.cct.translatorapp.MainApplication$initPangleSdk$1
            @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
            public void success() {
                Log.i("PangleApp", "pangle init success: ");
            }

            @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
            public void fail(int code, String msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                Log.i("PangleApp", "pangle init fail: " + code);
            }
        });
    }

    private final PAGConfig buildNewConfig(Context context) {
        return new PAGConfig.Builder().appId("8505613").appIcon(com.translator.alllanguagetranslations.ath.R.drawable.app_icon).debugLog(true).build();
    }
}
