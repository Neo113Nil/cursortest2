package com.artillery.ctc;

import com.arthenica.ffmpegkit.n;
import com.artillery.ctc.base.AsrModel;
import com.artillery.ctc.base.KeyResult;
import com.artillery.ctc.uitls.DeviceUtils;
import com.google.android.exoplayer2.ExoPlayer;
import f6.l;
import f6.p;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.t0;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: k, reason: collision with root package name */
    public static final b f745k = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public OkHttpClient f746a;

    /* renamed from: b, reason: collision with root package name */
    public final y5.f f747b;

    /* renamed from: c, reason: collision with root package name */
    public final y5.f f748c;

    /* renamed from: d, reason: collision with root package name */
    public final y5.f f749d;

    /* renamed from: e, reason: collision with root package name */
    public WebSocket f750e;

    /* renamed from: f, reason: collision with root package name */
    public l f751f;

    /* renamed from: g, reason: collision with root package name */
    public f6.a f752g;

    /* renamed from: h, reason: collision with root package name */
    public f6.a f753h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f754i;

    /* renamed from: j, reason: collision with root package name */
    public AsrModel f755j;

    public static final class a extends SuspendLambda implements p {

        /* renamed from: a, reason: collision with root package name */
        public Object f756a;

        /* renamed from: b, reason: collision with root package name */
        public int f757b;

        public a(kotlin.coroutines.c cVar) {
            super(2, cVar);
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
            return ((a) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return c.this.new a(cVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0037 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0045  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0038 -> B:5:0x003d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            ChannelIterator it;
            a aVar;
            Object hasNext;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f757b;
            if (i8 == 0) {
                y5.g.throwOnFailure(obj);
                it = c.this.b().iterator();
                aVar = this;
                aVar.f756a = it;
                aVar.f757b = 1;
                hasNext = it.hasNext(aVar);
                if (hasNext != coroutine_suspended) {
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ChannelIterator channelIterator = (ChannelIterator) this.f756a;
                y5.g.throwOnFailure(obj);
                ChannelIterator channelIterator2 = channelIterator;
                Object obj2 = coroutine_suspended;
                a aVar2 = this;
                if (!((Boolean) obj).booleanValue()) {
                    byte[] bArr = (byte[]) channelIterator2.next();
                    if (bArr.length == 0) {
                        c cVar = c.this;
                        cVar.a(cVar.a());
                    } else {
                        c.this.a(bArr);
                    }
                    aVar = aVar2;
                    coroutine_suspended = obj2;
                    it = channelIterator2;
                    aVar.f756a = it;
                    aVar.f757b = 1;
                    hasNext = it.hasNext(aVar);
                    if (hasNext != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Object obj3 = coroutine_suspended;
                    aVar2 = aVar;
                    obj = hasNext;
                    channelIterator2 = it;
                    obj2 = obj3;
                    if (!((Boolean) obj).booleanValue()) {
                        return y5.w.INSTANCE;
                    }
                }
            }
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(o oVar) {
            this();
        }

        public final c a() {
            return C0015c.f759a.a();
        }
    }

    /* renamed from: com.artillery.ctc.c$c, reason: collision with other inner class name */
    public static final class C0015c {

        /* renamed from: a, reason: collision with root package name */
        public static final C0015c f759a = new C0015c();

        /* renamed from: b, reason: collision with root package name */
        public static final c f760b = new c(null);

        public final c a() {
            return f760b;
        }
    }

    public final class d extends WebSocketListener {

        public static final class a extends SuspendLambda implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f762a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f763b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ WebSocket f764c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, WebSocket webSocket, kotlin.coroutines.c cVar2) {
                super(2, cVar2);
                this.f763b = cVar;
                this.f764c = webSocket;
            }

            @Override // f6.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
                return ((a) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                return new a(this.f763b, this.f764c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                if (this.f762a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
                this.f763b.b(this.f764c);
                return y5.w.INSTANCE;
            }
        }

        public d() {
        }

        @Override // okhttp3.WebSocketListener
        public void onClosed(WebSocket webSocket, int i8, String reason) {
            kotlin.jvm.internal.s.checkNotNullParameter(webSocket, "webSocket");
            kotlin.jvm.internal.s.checkNotNullParameter(reason, "reason");
            super.onClosed(webSocket, i8, reason);
        }

        @Override // okhttp3.WebSocketListener
        public void onClosing(WebSocket webSocket, int i8, String reason) {
            kotlin.jvm.internal.s.checkNotNullParameter(webSocket, "webSocket");
            kotlin.jvm.internal.s.checkNotNullParameter(reason, "reason");
            super.onClosing(webSocket, i8, reason);
            webSocket.close(1000, "");
            f6.a aVar = c.this.f752g;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, String text) {
            boolean contains$default;
            l lVar;
            kotlin.jvm.internal.s.checkNotNullParameter(webSocket, "webSocket");
            kotlin.jvm.internal.s.checkNotNullParameter(text, "text");
            super.onMessage(webSocket, text);
            contains$default = StringsKt__StringsKt.contains$default((CharSequence) text, (CharSequence) "\"TYPE_HEARTBEAT\"", false, 2, (Object) null);
            if (contains$default || (lVar = c.this.f751f) == null) {
                return;
            }
            lVar.invoke(com.artillery.ctc.d.a(text, com.artillery.ctc.h.f791d.a().b()));
        }

        @Override // okhttp3.WebSocketListener
        public void onOpen(WebSocket webSocket, Response response) {
            kotlin.jvm.internal.s.checkNotNullParameter(webSocket, "webSocket");
            kotlin.jvm.internal.s.checkNotNullParameter(response, "response");
            super.onOpen(webSocket, response);
            kotlinx.coroutines.i.launch$default(c.this.d(), null, null, new a(c.this, webSocket, null), 3, null);
            c.this.f754i = true;
            f6.a aVar = c.this.f753h;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public static final class e extends Lambda implements f6.a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f765a = new e();

        public e() {
            super(0);
        }

        @Override // f6.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.channels.b invoke() {
            return kotlinx.coroutines.channels.d.Channel$default(0, null, null, 7, null);
        }
    }

    public static final class f extends Lambda implements f6.a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f766a = new f();

        public f() {
            super(0);
        }

        @Override // f6.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return new ArrayList();
        }
    }

    public static final class g extends Lambda implements f6.a {

        /* renamed from: a, reason: collision with root package name */
        public static final g f767a = new g();

        public g() {
            super(0);
        }

        @Override // f6.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i0 invoke() {
            return j0.CoroutineScope(t0.getIO());
        }
    }

    public static final class h extends SuspendLambda implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f768a;

        public h(kotlin.coroutines.c cVar) {
            super(2, cVar);
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
            return ((h) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return c.this.new h(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (this.f768a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
            WebSocket webSocket = c.this.f750e;
            if (webSocket != null) {
                c.this.a(webSocket);
            }
            return y5.w.INSTANCE;
        }
    }

    public static final class i extends SuspendLambda implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f770a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ byte[] f772c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f773d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(byte[] bArr, boolean z7, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f772c = bArr;
            this.f773d = z7;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
            return ((i) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return c.this.new i(this.f772c, this.f773d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            Object removeFirst;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f770a;
            if (i8 == 0 || i8 == 1) {
                y5.g.throwOnFailure(obj);
                while (!c.this.c().isEmpty()) {
                    removeFirst = kotlin.collections.v.removeFirst(c.this.c());
                    kotlinx.coroutines.channels.b b8 = c.this.b();
                    this.f770a = 1;
                    if (b8.send((byte[]) removeFirst, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                kotlinx.coroutines.channels.b b9 = c.this.b();
                byte[] bArr = this.f772c;
                this.f770a = 2;
                if (b9.send(bArr, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i8 != 2) {
                    if (i8 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.g.throwOnFailure(obj);
                    return y5.w.INSTANCE;
                }
                y5.g.throwOnFailure(obj);
            }
            if (this.f773d) {
                this.f770a = 3;
                if (c.this.b().send(new byte[0], this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return y5.w.INSTANCE;
        }
    }

    public /* synthetic */ c(o oVar) {
        this();
    }

    public final void a(AsrModel config) {
        kotlin.jvm.internal.s.checkNotNullParameter(config, "config");
        this.f755j = config;
    }

    public c() {
        y5.f lazy;
        y5.f lazy2;
        y5.f lazy3;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        lazy = kotlin.b.lazy(lazyThreadSafetyMode, (f6.a) g.f767a);
        this.f747b = lazy;
        lazy2 = kotlin.b.lazy(lazyThreadSafetyMode, (f6.a) e.f765a);
        this.f748c = lazy2;
        lazy3 = kotlin.b.lazy(lazyThreadSafetyMode, (f6.a) f.f766a);
        this.f749d = lazy3;
        this.f755j = new AsrModel(null, 1, null);
        kotlinx.coroutines.i.launch$default(d(), null, null, new a(null), 3, null);
    }

    public final List c() {
        return (List) this.f749d.getValue();
    }

    public final i0 d() {
        return (i0) this.f747b.getValue();
    }

    public final void e() {
        kotlinx.coroutines.i.launch$default(d(), null, null, new h(null), 3, null);
    }

    public final kotlinx.coroutines.channels.b b() {
        return (kotlinx.coroutines.channels.b) this.f748c.getValue();
    }

    public final void b(WebSocket webSocket) {
        KeyResult c8 = com.artillery.ctc.h.f791d.a().c();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "START");
        JSONObject jSONObject2 = new JSONObject();
        String ttsAppId = c8.getTtsAppId();
        if (ttsAppId.length() == 0) {
            ttsAppId = "0";
        }
        jSONObject2.put("appid", Integer.parseInt(ttsAppId));
        jSONObject2.put("appkey", c8.getTtsAppKey());
        jSONObject2.put("dev_pid", this.f755j.dev_pid.getCode());
        jSONObject2.put("cuid", DeviceUtils.getUniqueDeviceId());
        jSONObject2.put(n.KEY_FORMAT_PROPERTIES, "pcm");
        jSONObject2.put("sample", 16000);
        y5.w wVar = y5.w.INSTANCE;
        jSONObject.put("data", jSONObject2);
        String jSONObject3 = jSONObject.toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(jSONObject3, "body.toString()");
        webSocket.send(jSONObject3);
    }

    public final void a(f6.a onClose, f6.a onReady, l onResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(onClose, "onClose");
        kotlin.jvm.internal.s.checkNotNullParameter(onReady, "onReady");
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        this.f751f = onResult;
        this.f752g = onClose;
        this.f753h = onReady;
        this.f746a = new OkHttpClient.Builder().proxy(Proxy.NO_PROXY).connectTimeout(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, TimeUnit.MILLISECONDS).build();
        Request build = new Request.Builder().url("wss://vop.baidu.com/realtime_asr?sn=" + DeviceUtils.getUniqueDeviceId()).build();
        OkHttpClient okHttpClient = this.f746a;
        if (okHttpClient != null) {
            this.f754i = false;
            this.f750e = okHttpClient.newWebSocket(build, new d());
            okHttpClient.dispatcher().executorService().shutdown();
        }
    }

    public final void a(byte[] bytes, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(bytes, "bytes");
        if (this.f754i) {
            kotlinx.coroutines.i.launch$default(d(), null, null, new i(bytes, z7, null), 3, null);
        } else {
            c().add(bytes);
        }
    }

    public final void a(byte[] bArr) {
        a(ByteString.a.of$default(ByteString.Companion, bArr, 0, 0, 3, null));
    }

    public final void a(ByteString byteString) {
        WebSocket webSocket = this.f750e;
        if (webSocket != null) {
            webSocket.send(byteString);
        }
    }

    public final void a(String str) {
        WebSocket webSocket = this.f750e;
        if (webSocket != null) {
            webSocket.send(str);
        }
    }

    public final void a(WebSocket webSocket) {
        webSocket.send(a());
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "FINISH");
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(jSONObject2, "JSONObject().apply {\n   …SH\")\n        }.toString()");
        return jSONObject2;
    }
}
