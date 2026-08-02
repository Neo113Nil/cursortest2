package okhttp3.internal.ws;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import bo.app.mc$$ExternalSyntheticLambda0;
import com.fillr.n;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.common.math.DoubleUtils;
import com.google.common.primitives.Longs;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState$show$4;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.integration.C0349IntegrationBrowserWorker_Factory;
import com.withpersona.sdk2.inquiry.integration.IntegrationBrowserWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepStateManager_Factory_Impl;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepViewModel_Factory_Impl;
import com.withpersona.sdk2.inquiry.internal.DaggerInquiryComponent$InquiryComponentImpl;
import com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper;
import com.withpersona.sdk2.inquiry.shared.di.BaseDaggerFragment;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiController;
import com.withpersona.sdk2.inquiry.ui.uiStep.UiStepViewModel_Factory;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import dagger.android.AndroidInjector;
import dagger.internal.InstanceFactory;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.single.SingleFlatMap$SingleFlatMapCallback;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.channels.ChannelsKt__ChannelsKt;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.KTypeWrapper;
import kotlinx.serialization.internal.ParametrizedCacheEntry;
import kotlinx.serialization.internal.ParametrizedSerializerCache;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskQueue$execute$1;
import okhttp3.internal.ws.RealWebSocket.WriterTask;
import okio.BufferedSource;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Socket;
import okio.Source;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import papa.PapaEvent;
import papa.internal.LaunchTracker;
import retrofit2.Converter;

/* loaded from: classes9.dex */
public final class RealWebSocket$connect$1 implements AndroidInjector, OnFailureListener, WorkflowWorker, SingleObserver, Observer, ParametrizedSerializerCache, Callback, Converter {
    public final /* synthetic */ int $r8$classId;
    public final Object $request;
    public final Object this$0;

    public RealWebSocket$connect$1(DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl) {
        this.$r8$classId = 4;
        this.this$0 = daggerInquiryComponent$InquiryComponentImpl;
        this.$request = InstanceFactory.create(new IntegrationStepViewModel_Factory_Impl(new UiStepViewModel_Factory(InstanceFactory.create(new IntegrationStepStateManager_Factory_Impl(new n(daggerInquiryComponent$InquiryComponentImpl.contextProvider, daggerInquiryComponent$InquiryComponentImpl.navigationStateManagerProvider, InstanceFactory.create(new IntegrationBrowserWorker_Factory_Impl(new C0349IntegrationBrowserWorker_Factory(daggerInquiryComponent$InquiryComponentImpl.contextProvider, daggerInquiryComponent$InquiryComponentImpl.customTabsLauncherProvider))), daggerInquiryComponent$InquiryComponentImpl.trackingEventsLoggerProvider))))));
    }

    @Override // retrofit2.Converter
    public Object convert(Object obj) {
        Charset charset;
        ResponseBody responseBody = (ResponseBody) obj;
        Gson gson = (Gson) this.this$0;
        ResponseBody.BomAwareReader bomAwareReader = responseBody.reader;
        if (bomAwareReader == null) {
            BufferedSource source = responseBody.source();
            MediaType contentType = responseBody.contentType();
            if (contentType == null || (charset = MediaType.charset$default(contentType)) == null) {
                charset = Charsets.UTF_8;
            }
            bomAwareReader = new ResponseBody.BomAwareReader(source, charset);
            responseBody.reader = bomAwareReader;
        }
        JsonReader newJsonReader = gson.newJsonReader(bomAwareReader);
        try {
            Object read2 = ((TypeAdapter) this.$request).read2(newJsonReader);
            if (newJsonReader.peek() == JsonToken.END_DOCUMENT) {
                return read2;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }

    public Object dismiss(SuspendLambda suspendLambda) {
        if (!((Boolean) ((State) this.$request).getValue()).booleanValue()) {
            return Unit.INSTANCE;
        }
        ((Function0) this.this$0).invoke();
        Object first = FlowKt.first(Updater.snapshotFlow(new HCaptcha$$ExternalSyntheticLambda0(this, 24)), new StripeBottomSheetState$show$4(2, null, 2), suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (first != coroutineSingletons) {
            first = Unit.INSTANCE;
        }
        return first == coroutineSingletons ? first : Unit.INSTANCE;
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        return DoubleUtils.doesSameWorkAs(this, workflowWorker) && toString().equals(workflowWorker.toString());
    }

    @Override // kotlinx.serialization.internal.ParametrizedSerializerCache
    /* renamed from: get-gIAlu-s */
    public Object mo4205getgIAlus(KClass kClass, ArrayList arrayList) {
        Object failure;
        Object putIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.$request;
        Class javaClass = PapaEvent.getJavaClass(kClass);
        Object obj = concurrentHashMap.get(javaClass);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(javaClass, (obj = new ParametrizedCacheEntry()))) != null) {
            obj = putIfAbsent;
        }
        ParametrizedCacheEntry parametrizedCacheEntry = (ParametrizedCacheEntry) obj;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new KTypeWrapper((KType) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = parametrizedCacheEntry.serializers;
        Object obj2 = concurrentHashMap2.get(arrayList2);
        if (obj2 == null) {
            try {
                Result.Companion companion = Result.Companion;
                failure = (KSerializer) ((Function2) this.this$0).invoke(kClass, arrayList);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                failure = new Result.Failure(th);
            }
            Result result = new Result(failure);
            Object putIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList2, result);
            obj2 = putIfAbsent2 == null ? result : putIfAbsent2;
        }
        return ((Result) obj2).value;
    }

    @Override // dagger.android.AndroidInjector
    public void inject(BaseDaggerFragment baseDaggerFragment) {
        IntegrationStepFragment integrationStepFragment = (IntegrationStepFragment) baseDaggerFragment;
        DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl = (DaggerInquiryComponent$InquiryComponentImpl) this.this$0;
        integrationStepFragment.androidInjector = daggerInquiryComponent$InquiryComponentImpl.dispatchingAndroidInjector();
        integrationStepFragment.viewModelFactory = (IntegrationStepViewModel_Factory_Impl) ((InstanceFactory) this.$request).instance;
        integrationStepFragment.systemUiController = (SystemUiController) daggerInquiryComponent$InquiryComponentImpl.systemUiControllerProvider.get();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onComplete() {
        ((ProducerCoroutine) ((ProducerScope) this.this$0)).close(null);
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public void onError(Throwable th) {
        int i = this.$r8$classId;
        Object obj = this.this$0;
        switch (i) {
            case 7:
                ((SingleObserver) this.$request).onError(th);
                break;
            case 8:
                ((SingleObserver) obj).onError(th);
                break;
            default:
                ((ProducerCoroutine) ((ProducerScope) obj)).close(th);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ((PlayIntegrityHelper) this.this$0).logger.error("integrity:request:" + exc.getMessage());
        CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.$request;
        Result.Companion companion = Result.Companion;
        cancellableContinuationImpl.resumeWith(null);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onNext(Object obj) {
        try {
            ChannelsKt__ChannelsKt.trySendBlocking(obj, (ProducerScope) this.this$0);
        } catch (InterruptedException unused) {
        }
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        Source source;
        Sink sink;
        int intValue;
        try {
            Socket checkUpgradeSuccess$okhttp = ((RealWebSocket) this.this$0).checkUpgradeSuccess$okhttp(response);
            Headers headers = response.headers;
            int size = headers.size();
            int i = 0;
            int i2 = 0;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            Integer num = null;
            Integer num2 = null;
            while (i2 < size) {
                if (headers.name(i2).equalsIgnoreCase("Sec-WebSocket-Extensions")) {
                    String value = headers.value(i2);
                    int i3 = i;
                    while (i3 < value.length()) {
                        Headers headers2 = headers;
                        int delimiterOffset$default = _UtilCommonKt.delimiterOffset$default(value, ',', i3, i, 4);
                        int delimiterOffset = _UtilCommonKt.delimiterOffset(value, ';', i3, delimiterOffset$default);
                        String trimSubstring = _UtilCommonKt.trimSubstring(i3, delimiterOffset, value);
                        int i4 = delimiterOffset + 1;
                        if (trimSubstring.equalsIgnoreCase("permessage-deflate")) {
                            if (z) {
                                z4 = true;
                            }
                            while (true) {
                                i3 = i4;
                                while (i3 < delimiterOffset$default) {
                                    int delimiterOffset2 = _UtilCommonKt.delimiterOffset(value, ';', i3, delimiterOffset$default);
                                    int delimiterOffset3 = _UtilCommonKt.delimiterOffset(value, '=', i3, delimiterOffset2);
                                    String trimSubstring2 = _UtilCommonKt.trimSubstring(i3, delimiterOffset3, value);
                                    String removeSurrounding = delimiterOffset3 < delimiterOffset2 ? StringsKt.removeSurrounding(_UtilCommonKt.trimSubstring(delimiterOffset3 + 1, delimiterOffset2, value)) : null;
                                    i4 = delimiterOffset2 + 1;
                                    if (trimSubstring2.equalsIgnoreCase("client_max_window_bits")) {
                                        if (num != null) {
                                            z4 = true;
                                        }
                                        num = removeSurrounding != null ? StringsKt.toIntOrNull(removeSurrounding) : null;
                                        if (num != null) {
                                            break;
                                        }
                                        i3 = i4;
                                        z4 = true;
                                    } else if (trimSubstring2.equalsIgnoreCase("client_no_context_takeover")) {
                                        if (z2) {
                                            z4 = true;
                                        }
                                        if (removeSurrounding != null) {
                                            z4 = true;
                                        }
                                        i3 = i4;
                                        z2 = true;
                                    } else {
                                        if (trimSubstring2.equalsIgnoreCase("server_max_window_bits")) {
                                            if (num2 != null) {
                                                z4 = true;
                                            }
                                            num2 = removeSurrounding != null ? StringsKt.toIntOrNull(removeSurrounding) : null;
                                            if (num2 != null) {
                                                break;
                                            }
                                        } else if (trimSubstring2.equalsIgnoreCase("server_no_context_takeover")) {
                                            if (z3) {
                                                z4 = true;
                                            }
                                            if (removeSurrounding != null) {
                                                z4 = true;
                                            }
                                            i3 = i4;
                                            z3 = true;
                                        }
                                        i3 = i4;
                                        z4 = true;
                                    }
                                }
                            }
                            headers = headers2;
                            z = true;
                        } else {
                            i3 = i4;
                            headers = headers2;
                            z4 = true;
                        }
                        i = 0;
                    }
                }
                i2++;
                headers = headers;
                i = 0;
            }
            ((RealWebSocket) this.this$0).extensions = new WebSocketExtensions(z, num, z2, num2, z3, z4);
            if (z4 || num != null || (num2 != null && (8 > (intValue = num2.intValue()) || intValue >= 16))) {
                RealWebSocket realWebSocket = (RealWebSocket) this.this$0;
                synchronized (realWebSocket) {
                    realWebSocket.messageAndCloseQueue.clear();
                    realWebSocket.close(IptcConstants.IMAGE_RESOURCE_BLOCK_BACKGROUND_COLOR, "unexpected Sec-WebSocket-Extensions in response header");
                }
            }
            String str = _UtilJvmKt.okHttpName + " WebSocket " + ((Request) this.$request).url.redact();
            RealWebSocket realWebSocket2 = (RealWebSocket) this.this$0;
            LaunchTracker launchTracker = new LaunchTracker(checkUpgradeSuccess$okhttp);
            WebSocketExtensions webSocketExtensions = realWebSocket2.extensions;
            webSocketExtensions.getClass();
            synchronized (realWebSocket2) {
                try {
                    realWebSocket2.name = str;
                    realWebSocket2.socket = launchTracker;
                    realWebSocket2.writer = new WebSocketWriter((RealBufferedSink) launchTracker.launchInProgress, realWebSocket2.random, webSocketExtensions.perMessageDeflate, webSocketExtensions.clientNoContextTakeover, realWebSocket2.minimumDeflateSize);
                    realWebSocket2.writerTask = realWebSocket2.new WriterTask();
                    long j = realWebSocket2.pingIntervalMillis;
                    if (j != 0) {
                        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                        TaskQueue taskQueue = realWebSocket2.taskQueue;
                        mc$$ExternalSyntheticLambda0 mc__externalsyntheticlambda0 = new mc$$ExternalSyntheticLambda0(realWebSocket2, nanos, 4);
                        taskQueue.getClass();
                        taskQueue.schedule(new TaskQueue$execute$1(str + " ping", mc__externalsyntheticlambda0), nanos);
                    }
                    if (!realWebSocket2.messageAndCloseQueue.isEmpty()) {
                        realWebSocket2.runWriter();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            realWebSocket2.reader = new WebSocketReader((RealBufferedSource) launchTracker.lastAppBecameInvisibleRealtimeMillis, realWebSocket2, webSocketExtensions.perMessageDeflate, webSocketExtensions.serverNoContextTakeover);
            RealWebSocket realWebSocket3 = (RealWebSocket) this.this$0;
            try {
                realWebSocket3.listener.onOpen(realWebSocket3, response);
                while (realWebSocket3.receivedCloseCode == -1) {
                    WebSocketReader webSocketReader = realWebSocket3.reader;
                    webSocketReader.getClass();
                    webSocketReader.processNextFrame();
                }
            } catch (Exception e) {
                RealWebSocket.failWebSocket$default(realWebSocket3, e, null, 6);
            } finally {
                realWebSocket3.finishReader();
            }
        } catch (IOException e2) {
            RealWebSocket.failWebSocket$default((RealWebSocket) this.this$0, e2, response, 4);
            _UtilCommonKt.closeQuietly(response);
            Socket socket = response.socket;
            if (socket != null && (sink = socket.getSink()) != null) {
                _UtilCommonKt.closeQuietly(sink);
            }
            Socket socket2 = response.socket;
            if (socket2 == null || (source = socket2.getSource()) == null) {
                return;
            }
            _UtilCommonKt.closeQuietly(source);
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public void onSubscribe(Disposable disposable) {
        int i = this.$r8$classId;
        Object obj = this.this$0;
        switch (i) {
            case 7:
                DisposableHelper.replace((SingleFlatMap$SingleFlatMapCallback) obj, disposable);
                break;
            case 8:
                ((SingleObserver) obj).onSubscribe(disposable);
                break;
            default:
                AtomicReference atomicReference = (AtomicReference) this.$request;
                while (!atomicReference.compareAndSet(null, disposable)) {
                    if (atomicReference.get() != null) {
                        disposable.dispose();
                        break;
                    }
                }
                break;
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public void onSuccess(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.$request;
        switch (i) {
            case 7:
                ((SingleObserver) obj2).onSuccess(obj);
                break;
            default:
                try {
                    Object mo39apply = ((Function) obj2).mo39apply(obj);
                    Objects.requireNonNull(mo39apply, "The mapper function returned a null value.");
                    ((SingleObserver) this.this$0).onSuccess(mo39apply);
                    break;
                } catch (Throwable th) {
                    Longs.throwIfFatal(th);
                    onError(th);
                    return;
                }
        }
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public Flow run() {
        return (Flow) this.$request;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 6:
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FlowWorkflowWorker(", (String) this.this$0, ")");
            default:
                return super.toString();
        }
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        RealWebSocket.failWebSocket$default((RealWebSocket) this.this$0, iOException, null, 6);
    }

    public RealWebSocket$connect$1(String str, Flow flow) {
        this.$r8$classId = 6;
        str.getClass();
        flow.getClass();
        this.this$0 = str;
        this.$request = flow;
    }

    public RealWebSocket$connect$1(Function0 function0, MutableState mutableState) {
        this.$r8$classId = 2;
        function0.getClass();
        mutableState.getClass();
        this.this$0 = function0;
        this.$request = mutableState;
    }

    public RealWebSocket$connect$1(Object obj) {
        this.$r8$classId = 10;
        this.this$0 = obj;
        this.$request = Thread.currentThread();
    }

    public RealWebSocket$connect$1(Function2 function2) {
        this.$r8$classId = 12;
        this.this$0 = function2;
        this.$request = new ConcurrentHashMap();
    }

    public /* synthetic */ RealWebSocket$connect$1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$request = obj2;
    }
}
