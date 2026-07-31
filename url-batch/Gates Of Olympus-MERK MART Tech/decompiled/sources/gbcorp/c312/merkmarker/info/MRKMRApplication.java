package gbcorp.c312.merkmarker.info;

import android.app.Application;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import gbcorp.c312.merkmarker.info.data.repository.GTSLYPrepRepository;
import gbcorp.c312.merkmarker.info.di.DataModuleKt;
import gbcorp.c312.merkmarker.info.di.DispatcherModuleKt;
import gbcorp.c312.merkmarker.info.di.GTSLYDiModuleKt;
import gbcorp.c312.merkmarker.info.di.ViewModuleKt;
import gbcorp.c312.merkmarker.info.util.GTSLYInstallReferrerManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.json.JSONObject;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.android.ext.koin.KoinExtKt;
import org.koin.core.KoinApplication;
import org.koin.core.context.GlobalContext;
import org.koin.core.module.Module;

/* compiled from: MRKMRApplication.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lgbcorp/c312/merkmarker/info/MRKMRApplication;", "Landroid/app/Application;", "<init>", "()V", "appScope", "Lkotlinx/coroutines/CoroutineScope;", "onCreate", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public class MRKMRApplication extends Application {
    public static final int $stable = 8;
    private final CoroutineScope appScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getDefault()));

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        final List plus = CollectionsKt.plus((Collection<? extends Module>) CollectionsKt.plus((Collection<? extends Module>) DataModuleKt.getDataModule().plus(ViewModuleKt.getViewModule()), GTSLYDiModuleKt.getGtslyDiModule()), DispatcherModuleKt.getDispatcherModule());
        GlobalContext.INSTANCE.startKoin(new Function1() { // from class: gbcorp.c312.merkmarker.info.MRKMRApplication$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit onCreate$lambda$0;
                onCreate$lambda$0 = MRKMRApplication.onCreate$lambda$0(MRKMRApplication.this, plus, (KoinApplication) obj);
                return onCreate$lambda$0;
            }
        });
        MRKMRApplication mRKMRApplication = this;
        final GTSLYPrepRepository gTSLYPrepRepository = (GTSLYPrepRepository) ComponentCallbackExtKt.getKoin(mRKMRApplication).getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(GTSLYPrepRepository.class), null, null);
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        appsFlyerLib.subscribeForDeepLink(new DeepLinkListener() { // from class: gbcorp.c312.merkmarker.info.MRKMRApplication$$ExternalSyntheticLambda1
            @Override // com.appsflyer.deeplink.DeepLinkListener
            public final void onDeepLinking(DeepLinkResult deepLinkResult) {
                MRKMRApplication.onCreate$lambda$1(GTSLYPrepRepository.this, deepLinkResult);
            }
        });
        AppsFlyerConversionListener appsFlyerConversionListener = new AppsFlyerConversionListener() { // from class: gbcorp.c312.merkmarker.info.MRKMRApplication$onCreate$conversionListener$1
            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onAttributionFailure(String error) {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onConversionDataSuccess(Map<String, Object> conversionData) {
                if (conversionData == null) {
                    conversionData = MapsKt.emptyMap();
                }
                GTSLYPrepRepository.this.setAppsFlyerDataState(conversionData);
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onConversionDataFail(String error) {
                GTSLYPrepRepository.this.setAppsFlyerDataState(MapsKt.emptyMap());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onAppOpenAttribution(Map<String, String> data) {
                LinkedHashMap emptyMap;
                if (data == null) {
                    emptyMap = MapsKt.emptyMap();
                } else {
                    emptyMap = new LinkedHashMap(MapsKt.mapCapacity(data.size()));
                    Iterator<T> it = data.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        emptyMap.put(entry.getKey(), (String) entry.getValue());
                    }
                }
                GTSLYPrepRepository.this.setAppsFlyerDataState(emptyMap);
            }
        };
        appsFlyerLib.setDebugLog(true);
        MRKMRApplication mRKMRApplication2 = this;
        appsFlyerLib.init(BuildConfig.DevKey, appsFlyerConversionListener, mRKMRApplication2);
        appsFlyerLib.start(mRKMRApplication2);
        ((GTSLYInstallReferrerManager) ComponentCallbackExtKt.getKoin(mRKMRApplication).getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(GTSLYInstallReferrerManager.class), null, null)).fetchAndStoreInstallReferrer();
        String appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(mRKMRApplication2);
        if (appsFlyerUID == null) {
            appsFlyerUID = "";
        }
        gTSLYPrepRepository.setAppsFlyerIdState(appsFlyerUID);
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: gbcorp.c312.merkmarker.info.MRKMRApplication$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                MRKMRApplication.onCreate$lambda$2(MRKMRApplication.this, gTSLYPrepRepository, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(MRKMRApplication mRKMRApplication, List list, KoinApplication startKoin) {
        Intrinsics.checkNotNullParameter(startKoin, "$this$startKoin");
        KoinExtKt.androidLogger$default(startKoin, null, 1, null);
        KoinExtKt.androidContext(startKoin, mRKMRApplication);
        startKoin.modules((List<Module>) list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(GTSLYPrepRepository gTSLYPrepRepository, DeepLinkResult deepLinkResult) {
        Intrinsics.checkNotNullParameter(deepLinkResult, "deepLinkResult");
        DeepLinkResult.Status status = deepLinkResult.getStatus();
        Intrinsics.checkNotNullExpressionValue(status, "getStatus(...)");
        if (status == DeepLinkResult.Status.FOUND) {
            JSONObject clickEvent = deepLinkResult.getDeepLink().getClickEvent();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> keys = clickEvent.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                linkedHashMap.put(next, clickEvent.get(next));
            }
            gTSLYPrepRepository.setAppsFlyerDataState(linkedHashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(MRKMRApplication mRKMRApplication, GTSLYPrepRepository gTSLYPrepRepository, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            String str = (String) task.getResult();
            if (str == null) {
                str = "";
            }
            BuildersKt__Builders_commonKt.launch$default(mRKMRApplication.appScope, null, null, new MRKMRApplication$onCreate$3$1(gTSLYPrepRepository, str, null), 3, null);
        } catch (RuntimeException unused) {
        }
    }
}
