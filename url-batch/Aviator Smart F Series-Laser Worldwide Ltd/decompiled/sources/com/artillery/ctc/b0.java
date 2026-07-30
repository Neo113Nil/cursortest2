package com.artillery.ctc;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.artillery.ctc.base.AccountTokenResult;
import com.artillery.ctc.base.AsrModel;
import com.artillery.ctc.base.Audio2TextBody;
import com.artillery.ctc.base.Audio2TextBodyRaw;
import com.artillery.ctc.base.KeyResult;
import com.artillery.ctc.base.Text2AudioBody;
import com.artillery.ctc.h;
import com.artillery.ctc.uitls.DeviceUtils;
import com.artillery.ctc.uitls.FileIOUtils;
import com.drake.net.NetConfig;
import com.drake.net.exception.ConvertException;
import com.drake.net.exception.NetException;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.gson.Gson;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.TypesJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.v1;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: e, reason: collision with root package name */
    public static final b f689e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    public static final y5.f f690f;

    /* renamed from: a, reason: collision with root package name */
    public AsrModel f691a;

    /* renamed from: b, reason: collision with root package name */
    public OkHttpClient f692b;

    /* renamed from: c, reason: collision with root package name */
    public final y5.f f693c;

    /* renamed from: d, reason: collision with root package name */
    public WebSocket f694d;

    public static final class a extends Lambda implements f6.a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f695a = new a();

        public a() {
            super(0);
        }

        @Override // f6.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b0 invoke() {
            return new b0(null);
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.o oVar) {
            this();
        }

        public final b0 a() {
            return b();
        }

        public final b0 b() {
            return (b0) b0.f690f.getValue();
        }
    }

    public final class c extends WebSocketListener {

        /* renamed from: a, reason: collision with root package name */
        public final InputStream f696a;

        /* renamed from: b, reason: collision with root package name */
        public final f6.l f697b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b0 f698c;

        public static final class a extends SuspendLambda implements f6.p {

            /* renamed from: a, reason: collision with root package name */
            public int f699a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b0 f700b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ WebSocket f701c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ c f702d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b0 b0Var, WebSocket webSocket, c cVar, kotlin.coroutines.c cVar2) {
                super(2, cVar2);
                this.f700b = b0Var;
                this.f701c = webSocket;
                this.f702d = cVar;
            }

            @Override // f6.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
                return ((a) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                return new a(this.f700b, this.f701c, this.f702d, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f699a;
                if (i8 == 0) {
                    y5.g.throwOnFailure(obj);
                    this.f700b.b(this.f701c);
                    b0 b0Var = this.f700b;
                    WebSocket webSocket = this.f701c;
                    InputStream a8 = this.f702d.a();
                    this.f699a = 1;
                    if (b0Var.a(webSocket, a8, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.g.throwOnFailure(obj);
                }
                this.f700b.a(this.f701c);
                return y5.w.INSTANCE;
            }
        }

        public c(b0 b0Var, InputStream inputStream, f6.l onResult) {
            kotlin.jvm.internal.s.checkNotNullParameter(inputStream, "inputStream");
            kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
            this.f698c = b0Var;
            this.f696a = inputStream;
            this.f697b = onResult;
        }

        public final InputStream a() {
            return this.f696a;
        }

        @Override // okhttp3.WebSocketListener
        public void onClosing(WebSocket webSocket, int i8, String reason) {
            kotlin.jvm.internal.s.checkNotNullParameter(webSocket, "webSocket");
            kotlin.jvm.internal.s.checkNotNullParameter(reason, "reason");
            super.onClosing(webSocket, i8, reason);
            webSocket.close(1000, "");
            this.f696a.close();
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, String text) {
            boolean contains$default;
            kotlin.jvm.internal.s.checkNotNullParameter(webSocket, "webSocket");
            kotlin.jvm.internal.s.checkNotNullParameter(text, "text");
            super.onMessage(webSocket, text);
            contains$default = StringsKt__StringsKt.contains$default((CharSequence) text, (CharSequence) "\"TYPE_HEARTBEAT\"", false, 2, (Object) null);
            if (contains$default) {
                return;
            }
            this.f697b.invoke(com.artillery.ctc.d.a(text, com.artillery.ctc.h.f791d.a().b()));
        }

        @Override // okhttp3.WebSocketListener
        public void onOpen(WebSocket webSocket, Response response) {
            kotlin.jvm.internal.s.checkNotNullParameter(webSocket, "webSocket");
            kotlin.jvm.internal.s.checkNotNullParameter(response, "response");
            super.onOpen(webSocket, response);
            kotlinx.coroutines.i.launch$default(this.f698c.c(), t0.getIO(), null, new a(this.f698c, webSocket, this, null), 2, null);
        }
    }

    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f703a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f704b;

        /* renamed from: d, reason: collision with root package name */
        public int f706d;

        public d(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f704b = obj;
            this.f706d |= Integer.MIN_VALUE;
            return b0.this.a((Audio2TextBody) null, (f6.l) null, this);
        }
    }

    public static final class e extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f707a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f6.l f708b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f709c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(f6.l lVar, String str, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f708b = lVar;
            this.f709c = str;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
            return ((e) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new e(this.f708b, this.f709c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (this.f707a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
            this.f708b.invoke(this.f709c);
            return y5.w.INSTANCE;
        }
    }

    public static final class f extends Lambda implements f6.l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Audio2TextBody f710a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ KeyResult f711b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Audio2TextBody audio2TextBody, KeyResult keyResult) {
            super(1);
            this.f710a = audio2TextBody;
            this.f711b = keyResult;
        }

        public final void a(r4.b post) {
            Audio2TextBody copy;
            kotlin.jvm.internal.s.checkNotNullParameter(post, "$this$post");
            Gson gson = new Gson();
            copy = r3.copy((r26 & 1) != 0 ? r3.speech : null, (r26 & 2) != 0 ? r3.len : 0L, (r26 & 4) != 0 ? r3.format : null, (r26 & 8) != 0 ? r3.rate : 0, (r26 & 16) != 0 ? r3.channel : 0, (r26 & 32) != 0 ? r3.cuid : null, (r26 & 64) != 0 ? r3.dev_pid : null, (r26 & 128) != 0 ? r3.lm_id : null, (r26 & 256) != 0 ? r3.lan : null, (r26 & 512) != 0 ? r3.token : this.f711b.getAccountResult().getAccess_token(), (r26 & 1024) != 0 ? this.f710a.tid : null);
            String json = gson.toJson(copy);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(json, "Gson()\n                 …                        )");
            post.json(com.artillery.ctc.d.a(json));
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r4.b) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f712a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f713b;

        /* renamed from: d, reason: collision with root package name */
        public int f715d;

        public g(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f713b = obj;
            this.f715d |= Integer.MIN_VALUE;
            return b0.this.a((Audio2TextBodyRaw) null, (f6.l) null, this);
        }
    }

    public static final class h extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f716a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f6.l f717b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f718c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(f6.l lVar, String str, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f717b = lVar;
            this.f718c = str;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
            return ((h) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new h(this.f717b, this.f718c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (this.f716a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
            this.f717b.invoke(this.f718c);
            return y5.w.INSTANCE;
        }
    }

    public static final class i extends Lambda implements f6.l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Audio2TextBodyRaw f719a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Audio2TextBodyRaw audio2TextBodyRaw) {
            super(1);
            this.f719a = audio2TextBodyRaw;
        }

        public final void a(r4.b post) {
            kotlin.jvm.internal.s.checkNotNullParameter(post, "$this$post");
            post.setHeader("Content-Type", "audio/pcm;rate=16000");
            post.setBody(y.f.a(this.f719a.rawFile, null, 1, null));
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r4.b) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class j extends Lambda implements f6.a {

        /* renamed from: a, reason: collision with root package name */
        public static final j f720a = new j();

        public j() {
            super(0);
        }

        @Override // f6.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i0 invoke() {
            return j0.MainScope();
        }
    }

    public static final class k extends Lambda implements f6.l {

        /* renamed from: a, reason: collision with root package name */
        public static final k f721a = new k();

        public k() {
            super(1);
        }

        public final void a(r4.b post) {
            kotlin.jvm.internal.s.checkNotNullParameter(post, "$this$post");
            post.json("");
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r4.b) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f722a;

        /* renamed from: b, reason: collision with root package name */
        public Object f723b;

        /* renamed from: c, reason: collision with root package name */
        public Object f724c;

        /* renamed from: d, reason: collision with root package name */
        public long f725d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f726e;

        /* renamed from: g, reason: collision with root package name */
        public int f728g;

        public l(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f726e = obj;
            this.f728g |= Integer.MIN_VALUE;
            return b0.this.a((WebSocket) null, (InputStream) null, this);
        }
    }

    public static final class m extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f729a;

        public m(kotlin.coroutines.c cVar) {
            super(2, cVar);
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
            return ((m) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return b0.this.new m(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (this.f729a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
            WebSocket webSocket = b0.this.f694d;
            if (webSocket != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", "CANCEL");
                String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.s.checkNotNullExpressionValue(jSONObject2, "JSONObject().apply {\n   …             }.toString()");
                webSocket.send(jSONObject2);
            }
            return y5.w.INSTANCE;
        }
    }

    public static final class n extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f731a;

        /* renamed from: b, reason: collision with root package name */
        public Object f732b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f733c;

        /* renamed from: e, reason: collision with root package name */
        public int f735e;

        public n(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f733c = obj;
            this.f735e |= Integer.MIN_VALUE;
            return b0.this.a((Text2AudioBody) null, false, (f6.l) null, (kotlin.coroutines.c) this);
        }
    }

    public static final class o extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f736a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ byte[] f737b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f6.l f738c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(byte[] bArr, f6.l lVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f737b = bArr;
            this.f738c = lVar;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
            return ((o) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new o(this.f737b, this.f738c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (this.f736a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
            String str = new String(this.f737b, kotlin.text.d.UTF_8);
            com.artillery.ctc.d.c("result = " + str, "text2Audio");
            this.f738c.invoke(str);
            return y5.w.INSTANCE;
        }
    }

    public static final class p extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f739a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ File f740b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f6.l f741c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(File file, f6.l lVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f740b = file;
            this.f741c = lVar;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
            return ((p) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new p(this.f740b, this.f741c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (this.f739a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
            String absolutePath = this.f740b.getAbsolutePath();
            kotlin.jvm.internal.s.checkNotNullExpressionValue(absolutePath, "path.absolutePath");
            com.artillery.ctc.d.c(absolutePath, "text2Audio");
            f6.l lVar = this.f741c;
            String absolutePath2 = this.f740b.getAbsolutePath();
            kotlin.jvm.internal.s.checkNotNullExpressionValue(absolutePath2, "path.absolutePath");
            lVar.invoke(absolutePath2);
            return y5.w.INSTANCE;
        }
    }

    public static final class q extends Lambda implements f6.l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Text2AudioBody f742a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ KeyResult f743b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Text2AudioBody text2AudioBody, KeyResult keyResult) {
            super(1);
            this.f742a = text2AudioBody;
            this.f743b = keyResult;
        }

        public final void a(r4.b post) {
            Text2AudioBody copy;
            kotlin.jvm.internal.s.checkNotNullParameter(post, "$this$post");
            copy = r3.copy((r24 & 1) != 0 ? r3.tex : null, (r24 & 2) != 0 ? r3.lan : null, (r24 & 4) != 0 ? r3.cuid : null, (r24 & 8) != 0 ? r3.ctp : null, (r24 & 16) != 0 ? r3.spd : 0, (r24 & 32) != 0 ? r3.pit : 0, (r24 & 64) != 0 ? r3.vol : 0, (r24 & 128) != 0 ? r3.per : 0, (r24 & 256) != 0 ? r3.aue : 0, (r24 & 512) != 0 ? r3.tok : this.f743b.getAccountResult().getAccess_token(), (r24 & 1024) != 0 ? this.f742a.tid : null);
            post.param("tex", copy.tex);
            post.param("lan", copy.lan);
            post.param("cuid", copy.cuid);
            post.param("ctp", copy.ctp);
            post.param("spd", Integer.valueOf(copy.spd));
            post.param("pit", Integer.valueOf(copy.pit));
            post.param("vol", Integer.valueOf(copy.vol));
            post.param("per", Integer.valueOf(copy.per));
            post.param("aue", Integer.valueOf(copy.aue));
            post.param("tok", copy.tok);
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r4.b) obj);
            return y5.w.INSTANCE;
        }
    }

    static {
        y5.f lazy;
        lazy = kotlin.b.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (f6.a) a.f695a);
        f690f = lazy;
    }

    public /* synthetic */ b0(kotlin.jvm.internal.o oVar) {
        this();
    }

    public final i0 c() {
        return (i0) this.f693c.getValue();
    }

    public final boolean d() {
        return System.currentTimeMillis() >= com.artillery.ctc.h.f791d.a().c().getAccountResult().getExpires_time();
    }

    public final AccountTokenResult e() {
        AccountTokenResult copy;
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("https://aip.baidubce.com/oauth/2.0/token?client_id=");
        h.b bVar = com.artillery.ctc.h.f791d;
        sb.append(bVar.a().c().getTtsAppKey());
        sb.append("&client_secret=");
        sb.append(bVar.a().c().getTtsAppSecret());
        sb.append("&grant_type=client_credentials");
        r4.b post$default = com.drake.net.a.post$default(sb.toString(), null, k.f721a, 2, null);
        NetConfig.INSTANCE.getRequestInterceptor();
        r4.d.setKType(post$default.getOkHttpRequest(), kotlin.jvm.internal.u.typeOf(String.class));
        Response execute = post$default.getOkHttpClient().newCall(post$default.buildRequest()).execute();
        try {
            Object onConvert = r4.e.converter(execute.request()).onConvert(TypesJVMKt.getJavaType(kotlin.jvm.internal.u.typeOf(String.class)), execute);
            if (onConvert == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            AccountTokenResult result = (AccountTokenResult) new Gson().fromJson((String) onConvert, AccountTokenResult.class);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(result, "result");
            copy = result.copy((r18 & 1) != 0 ? result.refresh_token : null, (r18 & 2) != 0 ? result.expires_in : 0, (r18 & 4) != 0 ? result.session_key : null, (r18 & 8) != 0 ? result.access_token : null, (r18 & 16) != 0 ? result.scope : null, (r18 & 32) != 0 ? result.session_secret : null, (r18 & 64) != 0 ? result.expires_time : currentTimeMillis + (result.getExpires_in() * 1000));
            return copy;
        } catch (NetException e8) {
            throw e8;
        } catch (CancellationException e9) {
            throw e9;
        } catch (Throwable th) {
            throw new ConvertException(execute, "An unexpected error occurred in the converter", th, null, 8, null);
        }
    }

    public final void f() {
        kotlinx.coroutines.i.launch$default(c(), t0.getIO(), null, new m(null), 2, null);
    }

    public b0() {
        y5.f lazy;
        this.f691a = new AsrModel(null, 1, null);
        lazy = kotlin.b.lazy(LazyThreadSafetyMode.NONE, (f6.a) j.f720a);
        this.f693c = lazy;
    }

    public final void a(AsrModel config) {
        kotlin.jvm.internal.s.checkNotNullParameter(config, "config");
        this.f691a = config;
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
        jSONObject2.put("dev_pid", this.f691a.dev_pid.getCode());
        jSONObject2.put("cuid", DeviceUtils.getUniqueDeviceId());
        jSONObject2.put(com.arthenica.ffmpegkit.n.KEY_FORMAT_PROPERTIES, "pcm");
        jSONObject2.put("sample", 16000);
        y5.w wVar = y5.w.INSTANCE;
        jSONObject.put("data", jSONObject2);
        String jSONObject3 = jSONObject.toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(jSONObject3, "body.toString()");
        webSocket.send(jSONObject3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(2:10|11)(2:15|16))(5:17|18|19|20|(3:22|23|(1:25))(2:26|27))|12|13))|41|6|7|(0)(0)|12|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0031, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ba, code lost:
    
        r13.printStackTrace();
        r13 = r13.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c1, code lost:
    
        if (r13 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c3, code lost:
    
        r13 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c5, code lost:
    
        r14.invoke(r13);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Audio2TextBody audio2TextBody, f6.l lVar, kotlin.coroutines.c cVar) {
        d dVar;
        Object coroutine_suspended;
        int i8;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i9 = dVar.f706d;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                dVar.f706d = i9 - Integer.MIN_VALUE;
                Object obj = dVar.f704b;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = dVar.f706d;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    r4.b post$default = com.drake.net.a.post$default("http://vop.baidu.com/server_api", null, new f(audio2TextBody, b()), 2, null);
                    NetConfig.INSTANCE.getRequestInterceptor();
                    r4.d.setKType(post$default.getOkHttpRequest(), kotlin.jvm.internal.u.typeOf(String.class));
                    Response execute = post$default.getOkHttpClient().newCall(post$default.buildRequest()).execute();
                    try {
                        Object onConvert = r4.e.converter(execute.request()).onConvert(TypesJVMKt.getJavaType(kotlin.jvm.internal.u.typeOf(String.class)), execute);
                        if (onConvert != null) {
                            String str = (String) onConvert;
                            v1 main = t0.getMain();
                            e eVar = new e(lVar, str, null);
                            dVar.f703a = lVar;
                            dVar.f706d = 1;
                            if (kotlinx.coroutines.g.withContext(main, eVar, dVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    } catch (NetException e8) {
                        throw e8;
                    } catch (CancellationException e9) {
                        throw e9;
                    } catch (Throwable th) {
                        throw new ConvertException(execute, "An unexpected error occurred in the converter", th, null, 8, null);
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.g.throwOnFailure(obj);
                }
                return y5.w.INSTANCE;
            }
        }
        dVar = new d(cVar);
        Object obj2 = dVar.f704b;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = dVar.f706d;
        if (i8 != 0) {
        }
        return y5.w.INSTANCE;
    }

    public final KeyResult b() {
        KeyResult copy;
        if (d()) {
            AccountTokenResult e8 = e();
            h.b bVar = com.artillery.ctc.h.f791d;
            copy = r1.copy((r53 & 1) != 0 ? r1.deviceId : null, (r53 & 2) != 0 ? r1.appKey : null, (r53 & 4) != 0 ? r1.secretKey : null, (r53 & 8) != 0 ? r1.appid : null, (r53 & 16) != 0 ? r1.clientId : null, (r53 & 32) != 0 ? r1.clientSecret : null, (r53 & 64) != 0 ? r1.ttsAppId : null, (r53 & 128) != 0 ? r1.ttsAppKey : null, (r53 & 256) != 0 ? r1.ttsAppSecret : null, (r53 & 512) != 0 ? r1.deviceUnique : null, (r53 & 1024) != 0 ? r1.aiClientId : null, (r53 & 2048) != 0 ? r1.aiClientSecret : null, (r53 & 4096) != 0 ? r1.oversea : 0, (r53 & 8192) != 0 ? r1.overSeaAk : null, (r53 & 16384) != 0 ? r1.accountResult : e8, (r53 & 32768) != 0 ? r1.accountAiResult : null, (r53 & 65536) != 0 ? r1.supportLangure : null, (r53 & 131072) != 0 ? r1.ttsConfig : null, (r53 & 262144) != 0 ? r1.mac : null, (r53 & 524288) != 0 ? r1.channel : null, (r53 & 1048576) != 0 ? r1.overseasConfig : null, (r53 & 2097152) != 0 ? r1.ak : null, (r53 & 4194304) != 0 ? r1.functionType : null, (r53 & 8388608) != 0 ? r1.typeList : null, (r53 & 16777216) != 0 ? r1.xfAsrAppId : null, (r53 & 33554432) != 0 ? r1.xfAsrAPISecret : null, (r53 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? r1.xfAsrAPIKey : null, (r53 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r1.xfTtsAppId : null, (r53 & 268435456) != 0 ? r1.xfTtsAPISecret : null, (r53 & 536870912) != 0 ? r1.xfTtsAPIKey : null, (r53 & 1073741824) != 0 ? r1.xfVoiceName : null, (r53 & Integer.MIN_VALUE) != 0 ? r1.xfVoiceNameList : null, (r54 & 1) != 0 ? r1.wsExpriceTime : null, (r54 & 2) != 0 ? r1.xfAsrStdAppId : null, (r54 & 4) != 0 ? bVar.a().c().xfAsrStdAPIKey : null);
            bVar.a().a(copy);
            return copy;
        }
        return com.artillery.ctc.h.f791d.a().c();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(2:10|11)(2:15|16))(5:17|18|19|20|(3:22|23|(1:25))(2:26|27))|12|13))|41|6|7|(0)(0)|12|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0038, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fe, code lost:
    
        r0.printStackTrace();
        r0 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0105, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0107, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0109, code lost:
    
        r19.invoke(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Audio2TextBodyRaw audio2TextBodyRaw, f6.l lVar, kotlin.coroutines.c cVar) {
        g gVar;
        Object coroutine_suspended;
        int i8;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i9 = gVar.f715d;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                gVar.f715d = i9 - Integer.MIN_VALUE;
                Object obj = gVar.f713b;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = gVar.f715d;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    Audio2TextBodyRaw copy$default = Audio2TextBodyRaw.copy$default(audio2TextBodyRaw, null, null, null, b().getAccountResult().getAccess_token(), null, null, 55, null);
                    r4.b post$default = com.drake.net.a.post$default("http://vop.baidu.com/server_api?cuid=" + copy$default.cuid + "&token=" + copy$default.token + "&dev_pid=" + copy$default.dev_pid, null, new i(copy$default), 2, null);
                    NetConfig.INSTANCE.getRequestInterceptor();
                    r4.d.setKType(post$default.getOkHttpRequest(), kotlin.jvm.internal.u.typeOf(String.class));
                    Response execute = post$default.getOkHttpClient().newCall(post$default.buildRequest()).execute();
                    try {
                        try {
                            Object onConvert = r4.e.converter(execute.request()).onConvert(TypesJVMKt.getJavaType(kotlin.jvm.internal.u.typeOf(String.class)), execute);
                            if (onConvert != null) {
                                String str = (String) onConvert;
                                v1 main = t0.getMain();
                                h hVar = new h(lVar, str, null);
                                gVar.f712a = lVar;
                                gVar.f715d = 1;
                                if (kotlinx.coroutines.g.withContext(main, hVar, gVar) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                        } catch (Throwable th) {
                            throw new ConvertException(execute, "An unexpected error occurred in the converter", th, null, 8, null);
                        }
                    } catch (NetException e8) {
                        throw e8;
                    } catch (CancellationException e9) {
                        throw e9;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.g.throwOnFailure(obj);
                }
                return y5.w.INSTANCE;
            }
        }
        gVar = new g(cVar);
        Object obj2 = gVar.f713b;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = gVar.f715d;
        if (i8 != 0) {
        }
        return y5.w.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:(4:11|12|13|14)(2:16|17))(4:18|19|20|21))(5:37|38|39|40|(5:42|43|(2:45|(4:47|48|49|(1:51)))(2:52|(2:54|(1:56)(2:57|(1:59))))|13|14)(2:60|61))|22|23|13|14))|78|6|7|(0)(0)|22|23|13|14|(2:(0)|(1:29))) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x003d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0158, code lost:
    
        r0.printStackTrace();
        r3 = r0.getMessage();
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0161, code lost:
    
        if (r3 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0163, code lost:
    
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0164, code lost:
    
        com.artillery.ctc.d.c(r3, "text2Audio");
        r0 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016d, code lost:
    
        if (r0 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0170, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0171, code lost:
    
        r2.invoke(r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Text2AudioBody text2AudioBody, boolean z7, f6.l lVar, kotlin.coroutines.c cVar) {
        n nVar;
        Object coroutine_suspended;
        int i8;
        InputStream byteStream;
        Throwable th;
        Throwable th2;
        f6.l lVar2 = lVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i9 = nVar.f735e;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                nVar.f735e = i9 - Integer.MIN_VALUE;
                Object obj = nVar.f733c;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = nVar.f735e;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    r4.b post$default = com.drake.net.a.post$default("https://tsn.baidu.com/text2audio", null, new q(text2AudioBody, b()), 2, null);
                    NetConfig.INSTANCE.getRequestInterceptor();
                    r4.d.setKType(post$default.getOkHttpRequest(), kotlin.jvm.internal.u.typeOf(Response.class));
                    Response execute = post$default.getOkHttpClient().newCall(post$default.buildRequest()).execute();
                    try {
                        try {
                            try {
                                Object onConvert = r4.e.converter(execute.request()).onConvert(TypesJVMKt.getJavaType(kotlin.jvm.internal.u.typeOf(Response.class)), execute);
                                if (onConvert != null) {
                                    Response response = (Response) onConvert;
                                    if (response.code() != 200) {
                                        ResponseBody body = response.body();
                                        if (body != null) {
                                            byteStream = body.byteStream();
                                            try {
                                                byte[] a8 = y.e.a(byteStream);
                                                v1 main = t0.getMain();
                                                o oVar = new o(a8, lVar2, null);
                                                nVar.f731a = lVar2;
                                                nVar.f732b = byteStream;
                                                nVar.f735e = 1;
                                                if (kotlinx.coroutines.g.withContext(main, oVar, nVar) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                th2 = th;
                                                throw th2;
                                            }
                                        }
                                    } else {
                                        ResponseBody body2 = response.body();
                                        if (body2 != null) {
                                            File createTempFile = File.createTempFile("tts", '.' + a(text2AudioBody.aue));
                                            FileIOUtils.writeFileFromIS(createTempFile, body2.byteStream());
                                            if (z7) {
                                                com.artillery.ctc.b a9 = com.artillery.ctc.b.f684c.a();
                                                String absolutePath = createTempFile.getAbsolutePath();
                                                kotlin.jvm.internal.s.checkNotNullExpressionValue(absolutePath, "path.absolutePath");
                                                a9.a(absolutePath);
                                            } else {
                                                v1 main2 = t0.getMain();
                                                p pVar = new p(createTempFile, lVar2, null);
                                                nVar.f731a = lVar2;
                                                nVar.f735e = 2;
                                                if (kotlinx.coroutines.g.withContext(main2, pVar, nVar) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                        }
                                    }
                                    return y5.w.INSTANCE;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type okhttp3.Response");
                            } catch (CancellationException e8) {
                                throw e8;
                            }
                        } catch (Throwable th4) {
                            throw new ConvertException(execute, "An unexpected error occurred in the converter", th4, null, 8, null);
                        }
                    } catch (NetException e9) {
                        throw e9;
                    }
                }
                if (i8 != 1) {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.g.throwOnFailure(obj);
                    return y5.w.INSTANCE;
                }
                ?? r22 = (Closeable) nVar.f732b;
                f6.l lVar3 = (f6.l) nVar.f731a;
                try {
                    y5.g.throwOnFailure(obj);
                    byteStream = r22;
                    lVar2 = lVar3;
                } catch (Throwable th5) {
                    th = th5;
                    byteStream = r22;
                    lVar2 = lVar3;
                    th2 = th;
                    try {
                        throw th2;
                    } catch (Throwable th6) {
                        kotlin.io.b.closeFinally(byteStream, th2);
                        throw th6;
                    }
                }
                y5.w wVar = y5.w.INSTANCE;
                kotlin.io.b.closeFinally(byteStream, null);
                return y5.w.INSTANCE;
            }
        }
        nVar = new n(cVar);
        Object obj2 = nVar.f733c;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = nVar.f735e;
        if (i8 != 0) {
        }
        y5.w wVar2 = y5.w.INSTANCE;
        kotlin.io.b.closeFinally(byteStream, null);
        return y5.w.INSTANCE;
    }

    public static /* synthetic */ Object a(b0 b0Var, Text2AudioBody text2AudioBody, boolean z7, f6.l lVar, kotlin.coroutines.c cVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return b0Var.a(text2AudioBody, z7, lVar, cVar);
    }

    public final Object a(Text2AudioBody text2AudioBody, f6.l lVar, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        Object a8 = a(text2AudioBody, true, lVar, cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return a8 == coroutine_suspended ? a8 : y5.w.INSTANCE;
    }

    public final String a(int i8) {
        List listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"mp3", "pcm", "pcm", "wav"});
        return (String) listOf.get(i8 - 3);
    }

    public final void a(InputStream inputStream, f6.l onResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(inputStream, "inputStream");
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        this.f692b = new OkHttpClient.Builder().proxy(Proxy.NO_PROXY).connectTimeout(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, TimeUnit.MILLISECONDS).build();
        Request build = new Request.Builder().url("wss://vop.baidu.com/realtime_asr?sn=" + DeviceUtils.getUniqueDeviceId()).build();
        OkHttpClient okHttpClient = this.f692b;
        if (okHttpClient != null) {
            this.f694d = okHttpClient.newWebSocket(build, new c(this, inputStream, onResult));
            okHttpClient.dispatcher().executorService().shutdown();
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006b -> B:10:0x006e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(okhttp3.WebSocket r12, java.io.InputStream r13, kotlin.coroutines.c r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.artillery.ctc.b0.l
            if (r0 == 0) goto L13
            r0 = r14
            com.artillery.ctc.b0$l r0 = (com.artillery.ctc.b0.l) r0
            int r1 = r0.f728g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f728g = r1
            goto L18
        L13:
            com.artillery.ctc.b0$l r0 = new com.artillery.ctc.b0$l
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f726e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()
            int r2 = r0.f728g
            r3 = 1
            if (r2 == 0) goto L45
            if (r2 != r3) goto L3d
            long r12 = r0.f725d
            java.lang.Object r2 = r0.f724c
            byte[] r2 = (byte[]) r2
            java.lang.Object r4 = r0.f723b
            java.io.InputStream r4 = (java.io.InputStream) r4
            java.lang.Object r5 = r0.f722a
            okhttp3.WebSocket r5 = (okhttp3.WebSocket) r5
            y5.g.throwOnFailure(r14)
            r14 = r5
            r10 = r1
            r1 = r0
            r0 = r4
            r4 = r2
            r2 = r10
            goto L6e
        L3d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L45:
            y5.g.throwOnFailure(r14)
            r14 = 5120(0x1400, float:7.175E-42)
            byte[] r14 = new byte[r14]
            long r4 = java.lang.System.currentTimeMillis()
            r2 = r1
            r1 = r0
            r0 = r13
            r10 = r14
            r14 = r12
            r12 = r4
            r4 = r10
        L57:
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r12 - r5
            r1.f722a = r14
            r1.f723b = r0
            r1.f724c = r4
            r1.f725d = r12
            r1.f728g = r3
            java.lang.Object r5 = kotlinx.coroutines.DelayKt.delay(r5, r1)
            if (r5 != r2) goto L6e
            return r2
        L6e:
            int r5 = r0.read(r4)     // Catch: java.lang.Throwable -> L73
            goto L74
        L73:
            r5 = -2
        L74:
            if (r5 <= 0) goto L89
            okio.ByteString$a r12 = okio.ByteString.Companion
            r13 = 0
            okio.ByteString r12 = r12.of(r4, r13, r5)
            long r6 = java.lang.System.currentTimeMillis()
            int r13 = r5 / 32
            long r8 = (long) r13
            long r6 = r6 + r8
            r14.send(r12)
            r12 = r6
        L89:
            if (r5 >= 0) goto L57
            y5.w r12 = y5.w.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.artillery.ctc.b0.a(okhttp3.WebSocket, java.io.InputStream, kotlin.coroutines.c):java.lang.Object");
    }

    public final void a(WebSocket webSocket) {
        kotlin.jvm.internal.s.checkNotNullParameter(webSocket, "webSocket");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "FINISH");
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(jSONObject2, "jsonObject.toString()");
        webSocket.send(jSONObject2);
    }
}
