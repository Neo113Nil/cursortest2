package coil3.network;

import coil3.fetch.FetchResult;
import com.appsflyer.AppsFlyerProperties;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.SendChannel;

/* compiled from: ConcurrentRequestStrategy.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000fH\u0096@¢\u0006\u0002\u0010\u0011R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00060\tj\u0002`\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcoil3/network/DeDupeConcurrentRequestStrategy;", "Lcoil3/network/ConcurrentRequestStrategy;", "<init>", "()V", "concurrentRequests", "", "", "Lcoil3/network/DeDupeConcurrentRequestStrategy$Request;", "lock", "", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "apply", "Lcoil3/fetch/FetchResult;", "key", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Request", "coil-network-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeDupeConcurrentRequestStrategy implements ConcurrentRequestStrategy {
    private final Map<String, Request> concurrentRequests = new LinkedHashMap();
    private final Object lock = new Object();

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(5:(2:3|(8:5|6|7|(1:(1:(6:11|12|13|14|15|16)(2:22|23))(1:24))(4:37|68|45|(1:47))|25|26|(4:29|14|15|16)|28))|25|26|(0)|28)|53|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0097, code lost:
    
        if (r11.mo11102receiveCatchingJP2dKIU(r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0036, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // coil3.network.ConcurrentRequestStrategy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(String str, final Function1<? super Continuation<? super FetchResult>, ? extends Object> function1, Continuation<? super FetchResult> continuation) {
        DeDupeConcurrentRequestStrategy$apply$1 deDupeConcurrentRequestStrategy$apply$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        Request request;
        Request acquire;
        Function1 function12;
        String str2;
        Request request2;
        final String str3;
        try {
            if (continuation instanceof DeDupeConcurrentRequestStrategy$apply$1) {
                deDupeConcurrentRequestStrategy$apply$1 = (DeDupeConcurrentRequestStrategy$apply$1) continuation;
                if ((deDupeConcurrentRequestStrategy$apply$1.label & Integer.MIN_VALUE) != 0) {
                    deDupeConcurrentRequestStrategy$apply$1.label -= Integer.MIN_VALUE;
                    obj = deDupeConcurrentRequestStrategy$apply$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = deDupeConcurrentRequestStrategy$apply$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                        booleanRef.element = true;
                        synchronized (this.lock) {
                            Map<String, Request> map = this.concurrentRequests;
                            Request request3 = map.get(str);
                            if (request3 == null) {
                                booleanRef.element = false;
                                request3 = new Request();
                                map.put(str, request3);
                            }
                            request = request3;
                        }
                        acquire = request.acquire();
                        str2 = str;
                        function12 = function1;
                        if (booleanRef.element) {
                            Channel<Unit> channel = acquire.getChannel();
                            deDupeConcurrentRequestStrategy$apply$1.L$0 = str;
                            deDupeConcurrentRequestStrategy$apply$1.L$1 = function1;
                            deDupeConcurrentRequestStrategy$apply$1.L$2 = acquire;
                            deDupeConcurrentRequestStrategy$apply$1.label = 1;
                            str2 = str;
                            function12 = function1;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            request2 = (Request) deDupeConcurrentRequestStrategy$apply$1.L$1;
                            str3 = (String) deDupeConcurrentRequestStrategy$apply$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                request2.markSucceeded();
                                request2.release(new Function0() { // from class: coil3.network.DeDupeConcurrentRequestStrategy$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit apply$lambda$2;
                                        apply$lambda$2 = DeDupeConcurrentRequestStrategy.apply$lambda$2(DeDupeConcurrentRequestStrategy.this, str3);
                                        return apply$lambda$2;
                                    }
                                });
                                return obj;
                            } catch (Exception e) {
                                e = e;
                                request2.getChannel().mo11095trySendJP2dKIU(Unit.INSTANCE);
                                throw e;
                            }
                        }
                        Request request4 = (Request) deDupeConcurrentRequestStrategy$apply$1.L$2;
                        Function1 function13 = (Function1) deDupeConcurrentRequestStrategy$apply$1.L$1;
                        String str4 = (String) deDupeConcurrentRequestStrategy$apply$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        ((ChannelResult) obj).getHolder();
                        acquire = request4;
                        str2 = str4;
                        function12 = function13;
                    }
                    deDupeConcurrentRequestStrategy$apply$1.L$0 = str2;
                    deDupeConcurrentRequestStrategy$apply$1.L$1 = acquire;
                    deDupeConcurrentRequestStrategy$apply$1.L$2 = null;
                    deDupeConcurrentRequestStrategy$apply$1.label = 2;
                    obj = function12.invoke(deDupeConcurrentRequestStrategy$apply$1);
                    if (obj != coroutine_suspended) {
                        str3 = str2;
                        request2 = acquire;
                        request2.markSucceeded();
                        request2.release(new Function0() { // from class: coil3.network.DeDupeConcurrentRequestStrategy$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit apply$lambda$2;
                                apply$lambda$2 = DeDupeConcurrentRequestStrategy.apply$lambda$2(DeDupeConcurrentRequestStrategy.this, str3);
                                return apply$lambda$2;
                            }
                        });
                        return obj;
                    }
                    return coroutine_suspended;
                }
            }
            deDupeConcurrentRequestStrategy$apply$1.L$0 = str2;
            deDupeConcurrentRequestStrategy$apply$1.L$1 = acquire;
            deDupeConcurrentRequestStrategy$apply$1.L$2 = null;
            deDupeConcurrentRequestStrategy$apply$1.label = 2;
            obj = function12.invoke(deDupeConcurrentRequestStrategy$apply$1);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (Exception e2) {
            e = e2;
            request2 = acquire;
            request2.getChannel().mo11095trySendJP2dKIU(Unit.INSTANCE);
            throw e;
        } catch (Throwable th) {
            th = th;
            function1 = str2;
            str = acquire;
            str.release(new Function0() { // from class: coil3.network.DeDupeConcurrentRequestStrategy$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit apply$lambda$2;
                    apply$lambda$2 = DeDupeConcurrentRequestStrategy.apply$lambda$2(DeDupeConcurrentRequestStrategy.this, function1);
                    return apply$lambda$2;
                }
            });
            throw th;
        }
        deDupeConcurrentRequestStrategy$apply$1 = new DeDupeConcurrentRequestStrategy$apply$1(this, continuation);
        obj = deDupeConcurrentRequestStrategy$apply$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deDupeConcurrentRequestStrategy$apply$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit apply$lambda$2(DeDupeConcurrentRequestStrategy deDupeConcurrentRequestStrategy, String str) {
        synchronized (deDupeConcurrentRequestStrategy.lock) {
            deDupeConcurrentRequestStrategy.concurrentRequests.remove(str);
            Unit unit = Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: ConcurrentRequestStrategy.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0000J\u0006\u0010\u0011\u001a\u00020\u0006J\u0014\u0010\u0012\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00060\u0001j\u0002`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcoil3/network/DeDupeConcurrentRequestStrategy$Request;", "", "<init>", "()V", AppsFlyerProperties.CHANNEL, "Lkotlinx/coroutines/channels/Channel;", "", "getChannel", "()Lkotlinx/coroutines/channels/Channel;", "lock", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "hasSucceeded", "", "isClosed", "observerCount", "", "acquire", "markSucceeded", "release", "cleanup", "Lkotlin/Function0;", "coil-network-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Request {
        private boolean hasSucceeded;
        private boolean isClosed;
        private int observerCount;
        private final Channel<Unit> channel = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        private final Object lock = new Object();

        public final Channel<Unit> getChannel() {
            return this.channel;
        }

        public final Request acquire() {
            synchronized (this.lock) {
                this.observerCount++;
            }
            return this;
        }

        public final void markSucceeded() {
            synchronized (this.lock) {
                this.hasSucceeded = true;
                Unit unit = Unit.INSTANCE;
            }
        }

        public final void release(Function0<Unit> cleanup) {
            synchronized (this.lock) {
                int i = this.observerCount - 1;
                this.observerCount = i;
                if ((i <= 0 || this.hasSucceeded) && !this.isClosed) {
                    SendChannel.DefaultImpls.close$default(this.channel, null, 1, null);
                    cleanup.invoke();
                    this.isClosed = true;
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }
}
