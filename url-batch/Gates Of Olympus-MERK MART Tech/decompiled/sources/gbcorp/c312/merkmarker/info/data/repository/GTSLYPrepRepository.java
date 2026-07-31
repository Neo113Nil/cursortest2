package gbcorp.c312.merkmarker.info.data.repository;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import com.google.android.gms.common.internal.ImagesContract;
import gbcorp.c312.merkmarker.info.BuildConfig;
import gbcorp.c312.merkmarker.info.data.SharedPreferencesExtKt;
import gbcorp.c312.merkmarker.info.data.model.GTSLYUrlState;
import gbcorp.c312.merkmarker.info.data.service.GTSLYApiService;
import gbcorp.c312.merkmarker.info.data.service.GTSLYRequest;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: GTSLYPrepRepository.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001>B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0012J\u0016\u0010)\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010*J\u0016\u0010+\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010*J\u0016\u0010,\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010*J\u0016\u0010-\u001a\u00020.2\u0006\u0010(\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010*J\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001200J\u0018\u00101\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0086@¢\u0006\u0002\u00102J\u0010\u00103\u001a\u00020'2\u0006\u00104\u001a\u00020\u0012H\u0002J\u0010\u00105\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0012H\u0002J\b\u00106\u001a\u0004\u0018\u00010\u0012J\u000e\u00107\u001a\u00020'2\u0006\u00108\u001a\u00020\u0012J\b\u00109\u001a\u0004\u0018\u00010\u0012J\u000e\u0010:\u001a\u00020'2\u0006\u0010;\u001a\u00020\u0012J\u001c\u0010<\u001a\u00020'2\u0014\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0019\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001f0\u0019¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u001b\u0010!\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010#¨\u0006?"}, d2 = {"Lgbcorp/c312/merkmarker/info/data/repository/GTSLYPrepRepository;", "", "context", "Landroid/content/Context;", "gtslyApiService", "Lgbcorp/c312/merkmarker/info/data/service/GTSLYApiService;", "sharedPreferences", "Landroid/content/SharedPreferences;", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Landroid/content/Context;Lgbcorp/c312/merkmarker/info/data/service/GTSLYApiService;Landroid/content/SharedPreferences;Lkotlinx/coroutines/CoroutineDispatcher;)V", "urlState", "Lkotlinx/coroutines/flow/Flow;", "Lgbcorp/c312/merkmarker/info/data/model/GTSLYUrlState;", "getUrlState", "()Lkotlinx/coroutines/flow/Flow;", "fcmTokenState", "", "getFcmTokenState", "installReferrerState", "getInstallReferrerState", "_appsFlyerIdState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "appsFlyerIdState", "Lkotlinx/coroutines/flow/StateFlow;", "getAppsFlyerIdState", "()Lkotlinx/coroutines/flow/StateFlow;", "_appsFlyerDataState", "", "appsFlyerDataState", "", "getAppsFlyerDataState", "androidId", "getAndroidId", "()Ljava/lang/String;", "androidId$delegate", "Lkotlin/Lazy;", "onRequestFcmToken", "", "token", "onNewFcmToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "install", "refresh", "buildRequest", "Lgbcorp/c312/merkmarker/info/data/service/GTSLYRequest;", "getDeviceLocaleAndTimeZone", "Lkotlin/Pair;", "getAdvertisingId", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeUrlStateValue", ImagesContract.URL, "storeFcmToken", "getStoredFcmToken", "storeInstallReferrer", "referrer", "getStoredReferrer", "setAppsFlyerIdState", "id", "setAppsFlyerDataState", "state", "Companion", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GTSLYPrepRepository {
    private static final String FCM_TOKEN_KEY = "fcm_token";
    private static final String REFERRER_KEY = "install_referrer";
    private static final String STORED_URL_KEY = "stored_url";
    private final MutableStateFlow<Map<String, Object>> _appsFlyerDataState;
    private final MutableStateFlow<String> _appsFlyerIdState;

    /* renamed from: androidId$delegate, reason: from kotlin metadata */
    private final Lazy androidId;
    private final StateFlow<Map<String, Object>> appsFlyerDataState;
    private final StateFlow<String> appsFlyerIdState;
    private final Context context;
    private final CoroutineDispatcher coroutineDispatcher;
    private final Flow<String> fcmTokenState;
    private final GTSLYApiService gtslyApiService;
    private final Flow<String> installReferrerState;
    private final SharedPreferences sharedPreferences;
    private final Flow<GTSLYUrlState> urlState;
    public static final int $stable = 8;

    public GTSLYPrepRepository(Context context, GTSLYApiService gtslyApiService, SharedPreferences sharedPreferences, CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(gtslyApiService, "gtslyApiService");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "coroutineDispatcher");
        this.context = context;
        this.gtslyApiService = gtslyApiService;
        this.sharedPreferences = sharedPreferences;
        this.coroutineDispatcher = coroutineDispatcher;
        final Flow observeStringValue$default = SharedPreferencesExtKt.observeStringValue$default(sharedPreferences, STORED_URL_KEY, null, 2, null);
        final GTSLYUrlState.Companion companion = GTSLYUrlState.INSTANCE;
        this.urlState = new Flow<GTSLYUrlState>() { // from class: gbcorp.c312.merkmarker.info.data.repository.GTSLYPrepRepository$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: gbcorp.c312.merkmarker.info.data.repository.GTSLYPrepRepository$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ GTSLYUrlState.Companion receiver$inlined;

                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @DebugMetadata(c = "gbcorp.c312.merkmarker.info.data.repository.GTSLYPrepRepository$special$$inlined$map$1$2", f = "GTSLYPrepRepository.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: gbcorp.c312.merkmarker.info.data.repository.GTSLYPrepRepository$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, GTSLYUrlState.Companion companion) {
                    this.$this_unsafeFlow = flowCollector;
                    this.receiver$inlined = companion;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                GTSLYUrlState urlStateFromValue = this.receiver$inlined.urlStateFromValue((String) obj);
                                anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(urlStateFromValue, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.I$0;
                                Object obj3 = anonymousClass1.L$2;
                                Object obj4 = anonymousClass1.L$0;
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super GTSLYUrlState> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, companion), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        };
        this.fcmTokenState = SharedPreferencesExtKt.observeStringValue$default(sharedPreferences, FCM_TOKEN_KEY, null, 2, null);
        this.installReferrerState = SharedPreferencesExtKt.observeStringValue$default(sharedPreferences, REFERRER_KEY, null, 2, null);
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this._appsFlyerIdState = MutableStateFlow;
        this.appsFlyerIdState = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Map<String, Object>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this._appsFlyerDataState = MutableStateFlow2;
        this.appsFlyerDataState = FlowKt.asStateFlow(MutableStateFlow2);
        this.androidId = LazyKt.lazy(new Function0() { // from class: gbcorp.c312.merkmarker.info.data.repository.GTSLYPrepRepository$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String androidId_delegate$lambda$0;
                androidId_delegate$lambda$0 = GTSLYPrepRepository.androidId_delegate$lambda$0(GTSLYPrepRepository.this);
                return androidId_delegate$lambda$0;
            }
        });
    }

    public final Flow<GTSLYUrlState> getUrlState() {
        return this.urlState;
    }

    public final Flow<String> getFcmTokenState() {
        return this.fcmTokenState;
    }

    public final Flow<String> getInstallReferrerState() {
        return this.installReferrerState;
    }

    public final StateFlow<String> getAppsFlyerIdState() {
        return this.appsFlyerIdState;
    }

    public final StateFlow<Map<String, Object>> getAppsFlyerDataState() {
        return this.appsFlyerDataState;
    }

    private final String getAndroidId() {
        Object value = this.androidId.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (String) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String androidId_delegate$lambda$0(GTSLYPrepRepository gTSLYPrepRepository) {
        return Settings.Secure.getString(gTSLYPrepRepository.context.getContentResolver(), "android_id");
    }

    public final void onRequestFcmToken(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        if (getStoredFcmToken() == null) {
            storeFcmToken(token);
        }
    }

    public final Object onNewFcmToken(String str, Continuation<? super Unit> continuation) {
        String storedFcmToken = getStoredFcmToken();
        if (!Intrinsics.areEqual(str, storedFcmToken) && storedFcmToken != null) {
            storeFcmToken(str);
            Object refresh = refresh(str, continuation);
            return refresh == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? refresh : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final Object install(String str, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(this.coroutineDispatcher, new GTSLYPrepRepository$install$2(this, str, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r2, r4, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refresh(String str, Continuation<? super Unit> continuation) {
        GTSLYPrepRepository$refresh$1 gTSLYPrepRepository$refresh$1;
        int i;
        if (continuation instanceof GTSLYPrepRepository$refresh$1) {
            gTSLYPrepRepository$refresh$1 = (GTSLYPrepRepository$refresh$1) continuation;
            if ((gTSLYPrepRepository$refresh$1.label & Integer.MIN_VALUE) != 0) {
                gTSLYPrepRepository$refresh$1.label -= Integer.MIN_VALUE;
                Object obj = gTSLYPrepRepository$refresh$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = gTSLYPrepRepository$refresh$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    gTSLYPrepRepository$refresh$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
                    gTSLYPrepRepository$refresh$1.label = 1;
                    obj = buildRequest(str, gTSLYPrepRepository$refresh$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    str = (String) gTSLYPrepRepository$refresh$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                GTSLYRequest gTSLYRequest = (GTSLYRequest) obj;
                CoroutineDispatcher coroutineDispatcher = this.coroutineDispatcher;
                GTSLYPrepRepository$refresh$2 gTSLYPrepRepository$refresh$2 = new GTSLYPrepRepository$refresh$2(this, gTSLYRequest, null);
                gTSLYPrepRepository$refresh$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
                gTSLYPrepRepository$refresh$1.L$1 = SpillingKt.nullOutSpilledVariable(gTSLYRequest);
                gTSLYPrepRepository$refresh$1.label = 2;
            }
        }
        gTSLYPrepRepository$refresh$1 = new GTSLYPrepRepository$refresh$1(this, continuation);
        Object obj2 = gTSLYPrepRepository$refresh$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = gTSLYPrepRepository$refresh$1.label;
        if (i != 0) {
        }
        GTSLYRequest gTSLYRequest2 = (GTSLYRequest) obj2;
        CoroutineDispatcher coroutineDispatcher2 = this.coroutineDispatcher;
        GTSLYPrepRepository$refresh$2 gTSLYPrepRepository$refresh$22 = new GTSLYPrepRepository$refresh$2(this, gTSLYRequest2, null);
        gTSLYPrepRepository$refresh$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
        gTSLYPrepRepository$refresh$1.L$1 = SpillingKt.nullOutSpilledVariable(gTSLYRequest2);
        gTSLYPrepRepository$refresh$1.label = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object buildRequest(String str, Continuation<? super GTSLYRequest> continuation) {
        GTSLYPrepRepository$buildRequest$1 gTSLYPrepRepository$buildRequest$1;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String storedReferrer;
        LinkedHashMap value;
        if (continuation instanceof GTSLYPrepRepository$buildRequest$1) {
            gTSLYPrepRepository$buildRequest$1 = (GTSLYPrepRepository$buildRequest$1) continuation;
            if ((gTSLYPrepRepository$buildRequest$1.label & Integer.MIN_VALUE) != 0) {
                gTSLYPrepRepository$buildRequest$1.label -= Integer.MIN_VALUE;
                Object obj = gTSLYPrepRepository$buildRequest$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = gTSLYPrepRepository$buildRequest$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Pair<String, String> deviceLocaleAndTimeZone = getDeviceLocaleAndTimeZone();
                    String component1 = deviceLocaleAndTimeZone.component1();
                    String component2 = deviceLocaleAndTimeZone.component2();
                    Context context = this.context;
                    gTSLYPrepRepository$buildRequest$1.L$0 = str;
                    gTSLYPrepRepository$buildRequest$1.L$1 = component1;
                    gTSLYPrepRepository$buildRequest$1.L$2 = component2;
                    gTSLYPrepRepository$buildRequest$1.label = 1;
                    Object advertisingId = getAdvertisingId(context, gTSLYPrepRepository$buildRequest$1);
                    if (advertisingId == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str2 = str;
                    str3 = component2;
                    obj = advertisingId;
                    str4 = component1;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str7 = (String) gTSLYPrepRepository$buildRequest$1.L$2;
                    String str8 = (String) gTSLYPrepRepository$buildRequest$1.L$1;
                    String str9 = (String) gTSLYPrepRepository$buildRequest$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    str3 = str7;
                    str2 = str9;
                    str4 = str8;
                }
                str5 = (String) obj;
                String value2 = this.appsFlyerIdState.getValue();
                if (str5 != null) {
                    if (str5.length() <= 0) {
                        str5 = null;
                    }
                    if (str5 != null) {
                        str6 = str5;
                        storedReferrer = getStoredReferrer();
                        if (storedReferrer == null) {
                            storedReferrer = "";
                        }
                        String str10 = storedReferrer;
                        value = this._appsFlyerDataState.getValue();
                        if (value == null) {
                            value = new LinkedHashMap();
                        }
                        return new GTSLYRequest(BuildConfig.APPLICATION_ID, str2, str6, value2, str10, str4, str3, value);
                    }
                }
                str6 = value2;
                storedReferrer = getStoredReferrer();
                if (storedReferrer == null) {
                }
                String str102 = storedReferrer;
                value = this._appsFlyerDataState.getValue();
                if (value == null) {
                }
                return new GTSLYRequest(BuildConfig.APPLICATION_ID, str2, str6, value2, str102, str4, str3, value);
            }
        }
        gTSLYPrepRepository$buildRequest$1 = new GTSLYPrepRepository$buildRequest$1(this, continuation);
        Object obj2 = gTSLYPrepRepository$buildRequest$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = gTSLYPrepRepository$buildRequest$1.label;
        if (i != 0) {
        }
        str5 = (String) obj2;
        String value22 = this.appsFlyerIdState.getValue();
        if (str5 != null) {
        }
        str6 = value22;
        storedReferrer = getStoredReferrer();
        if (storedReferrer == null) {
        }
        String str1022 = storedReferrer;
        value = this._appsFlyerDataState.getValue();
        if (value == null) {
        }
        return new GTSLYRequest(BuildConfig.APPLICATION_ID, str2, str6, value22, str1022, str4, str3, value);
    }

    public final Pair<String, String> getDeviceLocaleAndTimeZone() {
        return new Pair<>(Locale.getDefault().toLanguageTag(), TimeZone.getDefault().getID());
    }

    public final Object getAdvertisingId(Context context, Continuation<? super String> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new GTSLYPrepRepository$getAdvertisingId$2(context, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void storeUrlStateValue(String url) {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putString(STORED_URL_KEY, url);
        edit.apply();
    }

    private final void storeFcmToken(String token) {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putString(FCM_TOKEN_KEY, token);
        edit.apply();
    }

    public final String getStoredFcmToken() {
        return this.sharedPreferences.getString(FCM_TOKEN_KEY, null);
    }

    public final void storeInstallReferrer(String referrer) {
        Intrinsics.checkNotNullParameter(referrer, "referrer");
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putString(REFERRER_KEY, referrer);
        edit.apply();
    }

    public final String getStoredReferrer() {
        return this.sharedPreferences.getString(REFERRER_KEY, null);
    }

    public final void setAppsFlyerIdState(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        MutableStateFlow<String> mutableStateFlow = this._appsFlyerIdState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), id)) {
        }
    }

    public final void setAppsFlyerDataState(Map<String, ? extends Object> state) {
        MutableStateFlow<Map<String, Object>> mutableStateFlow = this._appsFlyerDataState;
        do {
        } while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), state != null ? MapsKt.toMutableMap(state) : null));
    }
}
