package com.artillery.ctc;

import com.arthenica.ffmpegkit.n;
import com.artillery.ctc.base.AsrSilkyModel;
import com.artillery.ctc.base.Text2AudioSilkyBody;
import com.artillery.ctc.base.Text2AudioSilkyConfig;
import com.artillery.ctc.base.Text2AudioSilkyData;
import com.artillery.ctc.base.Text2AudioSilkyResult;
import com.artillery.ctc.uitls.Base64Utils;
import com.artillery.ctc.uitls.ConvertUtils;
import com.artillery.ctc.uitls.FileIOUtils;
import com.artillery.ctc.uitls.PathUtils;
import com.baidu.ar.constants.HttpConstants;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.just.agentweb.DefaultWebClient;
import f6.l;
import f6.p;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.t0;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: l, reason: collision with root package name */
    public static final b f1137l = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final y5.f f1138a;

    /* renamed from: b, reason: collision with root package name */
    public final y5.f f1139b;

    /* renamed from: c, reason: collision with root package name */
    public final y5.f f1140c;

    /* renamed from: d, reason: collision with root package name */
    public WebSocket f1141d;

    /* renamed from: e, reason: collision with root package name */
    public AsrSilkyModel f1142e;

    /* renamed from: f, reason: collision with root package name */
    public OkHttpClient f1143f;

    /* renamed from: g, reason: collision with root package name */
    public int f1144g;

    /* renamed from: h, reason: collision with root package name */
    public l1 f1145h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1146i;

    /* renamed from: j, reason: collision with root package name */
    public AsrSilkyModel f1147j;

    /* renamed from: k, reason: collision with root package name */
    public WebSocket f1148k;

    public static final class a extends SuspendLambda implements p {

        /* renamed from: a, reason: collision with root package name */
        public Object f1149a;

        /* renamed from: b, reason: collision with root package name */
        public int f1150b;

        /* renamed from: com.artillery.ctc.m$a$a, reason: collision with other inner class name */
        public static final class C0025a extends SuspendLambda implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f1152a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ byte[] f1153b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m f1154c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0025a(byte[] bArr, m mVar, kotlin.coroutines.c cVar) {
                super(2, cVar);
                this.f1153b = bArr;
                this.f1154c = mVar;
            }

            @Override // f6.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
                return ((C0025a) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                return new C0025a(this.f1153b, this.f1154c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                if (this.f1152a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
                byte[] bArr = this.f1153b;
                if (bArr == null) {
                    m mVar = this.f1154c;
                    mVar.b(mVar.f1147j, new byte[0]);
                } else {
                    if (!(bArr.length == 0)) {
                        m mVar2 = this.f1154c;
                        mVar2.a(mVar2.f1147j, this.f1153b);
                    } else {
                        m mVar3 = this.f1154c;
                        mVar3.a(mVar3.f1147j);
                    }
                }
                return y5.w.INSTANCE;
            }
        }

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
            return m.this.new a(cVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0042 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006d -> B:7:0x0038). Please report as a decompilation issue!!! */
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
            int i8 = this.f1150b;
            if (i8 == 0) {
                y5.g.throwOnFailure(obj);
                it = m.this.a().iterator();
            } else if (i8 == 1) {
                ChannelIterator channelIterator = (ChannelIterator) this.f1149a;
                y5.g.throwOnFailure(obj);
                ChannelIterator channelIterator2 = channelIterator;
                Object obj2 = coroutine_suspended;
                a aVar2 = this;
                if (!((Boolean) obj).booleanValue()) {
                    byte[] bArr = (byte[]) channelIterator2.next();
                    CoroutineDispatcher io2 = t0.getIO();
                    C0025a c0025a = new C0025a(bArr, m.this, null);
                    aVar2.f1149a = channelIterator2;
                    aVar2.f1150b = 2;
                    if (kotlinx.coroutines.g.withContext(io2, c0025a, aVar2) == obj2) {
                        return obj2;
                    }
                    aVar = aVar2;
                    coroutine_suspended = obj2;
                    it = channelIterator2;
                    aVar.f1149a = it;
                    aVar.f1150b = 1;
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
            } else {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (ChannelIterator) this.f1149a;
                y5.g.throwOnFailure(obj);
            }
            aVar = this;
            aVar.f1149a = it;
            aVar.f1150b = 1;
            hasNext = it.hasNext(aVar);
            if (hasNext != coroutine_suspended) {
            }
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(o oVar) {
            this();
        }

        public final m a() {
            return c.f1155a.a();
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f1155a = new c();

        /* renamed from: b, reason: collision with root package name */
        public static final m f1156b = new m(null);

        public final m a() {
            return f1156b;
        }
    }

    public final class d extends WebSocketListener {

        /* renamed from: a, reason: collision with root package name */
        public final AsrSilkyModel f1157a;

        /* renamed from: b, reason: collision with root package name */
        public final l f1158b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m f1159c;

        public static final class a extends SuspendLambda implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f1160a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f1161b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f1162c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m mVar, d dVar, kotlin.coroutines.c cVar) {
                super(2, cVar);
                this.f1161b = mVar;
                this.f1162c = dVar;
            }

            @Override // f6.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
                return ((a) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                return new a(this.f1161b, this.f1162c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f1160a;
                if (i8 == 0) {
                    y5.g.throwOnFailure(obj);
                    this.f1161b.f1147j = this.f1162c.a();
                    this.f1161b.f1144g = 0;
                    kotlinx.coroutines.channels.b a8 = this.f1161b.a();
                    this.f1160a = 1;
                    if (a8.send(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.g.throwOnFailure(obj);
                }
                this.f1161b.f1146i = true;
                return y5.w.INSTANCE;
            }
        }

        public d(m mVar, AsrSilkyModel asrModel, l onResult) {
            kotlin.jvm.internal.s.checkNotNullParameter(asrModel, "asrModel");
            kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
            this.f1159c = mVar;
            this.f1157a = asrModel;
            this.f1158b = onResult;
        }

        public final AsrSilkyModel a() {
            return this.f1157a;
        }

        @Override // okhttp3.WebSocketListener
        public void onClosing(WebSocket webSocket, int i8, String reason) {
            kotlin.jvm.internal.s.checkNotNullParameter(webSocket, "webSocket");
            kotlin.jvm.internal.s.checkNotNullParameter(reason, "reason");
            super.onClosing(webSocket, i8, reason);
            com.artillery.ctc.d.a("实时语音关闭->", null, 1, null);
        }

        @Override // okhttp3.WebSocketListener
        public void onFailure(WebSocket webSocket, Throwable t7, Response response) {
            kotlin.jvm.internal.s.checkNotNullParameter(webSocket, "webSocket");
            kotlin.jvm.internal.s.checkNotNullParameter(t7, "t");
            super.onFailure(webSocket, t7, response);
            com.artillery.ctc.d.a("实时语音发生错误->", null, 1, null);
            l lVar = this.f1158b;
            String response2 = response != null ? response.toString() : null;
            if (response2 == null) {
                response2 = "";
            }
            lVar.invoke(response2);
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, String text) {
            kotlin.jvm.internal.s.checkNotNullParameter(webSocket, "webSocket");
            kotlin.jvm.internal.s.checkNotNullParameter(text, "text");
            super.onMessage(webSocket, text);
            String a8 = com.artillery.ctc.d.a(text, com.artillery.ctc.h.f791d.a().b());
            com.artillery.ctc.d.a("实时识别的结果-> " + a8, null, 1, null);
            this.f1158b.invoke(a8);
        }

        @Override // okhttp3.WebSocketListener
        public void onOpen(WebSocket webSocket, Response response) {
            l1 launch$default;
            kotlin.jvm.internal.s.checkNotNullParameter(webSocket, "webSocket");
            kotlin.jvm.internal.s.checkNotNullParameter(response, "response");
            super.onOpen(webSocket, response);
            m mVar = this.f1159c;
            launch$default = kotlinx.coroutines.i.launch$default(mVar.c(), null, null, new a(this.f1159c, this, null), 3, null);
            mVar.f1145h = launch$default;
        }
    }

    public final class e extends WebSocketListener {

        /* renamed from: a, reason: collision with root package name */
        public final Text2AudioSilkyBody f1163a;

        /* renamed from: b, reason: collision with root package name */
        public final l f1164b;

        /* renamed from: c, reason: collision with root package name */
        public String f1165c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m f1166d;

        public static final class a extends SuspendLambda implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f1167a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebSocket f1168b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f1169c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WebSocket webSocket, e eVar, kotlin.coroutines.c cVar) {
                super(2, cVar);
                this.f1168b = webSocket;
                this.f1169c = eVar;
            }

            @Override // f6.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
                return ((a) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                return new a(this.f1168b, this.f1169c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                if (this.f1167a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
                JSONObject jSONObject = new JSONObject();
                e eVar = this.f1169c;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(HttpConstants.HTTP_APP_ID, "407cd7ce");
                y5.w wVar = y5.w.INSTANCE;
                jSONObject.put("common", jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("status", 2);
                jSONObject3.put("text", eVar.a().text);
                jSONObject.put("data", jSONObject3);
                if (eVar.a().config == null) {
                    jSONObject.put("business", new JSONObject(new Gson().toJson(new Text2AudioSilkyConfig("", null, 0, null, null, null, null, null, null, null, null, null, 4094, null))));
                } else {
                    jSONObject.put("business", new JSONObject(new Gson().toJson(eVar.a().config)));
                }
                WebSocket webSocket = this.f1168b;
                String jSONObject4 = jSONObject.toString();
                kotlin.jvm.internal.s.checkNotNullExpressionValue(jSONObject4, "obj.toString()");
                webSocket.send(jSONObject4);
                return y5.w.INSTANCE;
            }
        }

        public e(m mVar, Text2AudioSilkyBody body, l onResult) {
            kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
            kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
            this.f1166d = mVar;
            this.f1163a = body;
            this.f1164b = onResult;
            String join = PathUtils.join(PathUtils.getInternalAppCachePath(), String.valueOf(System.currentTimeMillis()));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(join, "join(PathUtils.getIntern…em.currentTimeMillis()}\")");
            this.f1165c = join;
        }

        public final Text2AudioSilkyBody a() {
            return this.f1163a;
        }

        @Override // okhttp3.WebSocketListener
        public void onClosing(WebSocket webSocket, int i8, String reason) {
            kotlin.jvm.internal.s.checkNotNullParameter(webSocket, "webSocket");
            kotlin.jvm.internal.s.checkNotNullParameter(reason, "reason");
            super.onClosing(webSocket, i8, reason);
        }

        @Override // okhttp3.WebSocketListener
        public void onFailure(WebSocket webSocket, Throwable t7, Response response) {
            kotlin.jvm.internal.s.checkNotNullParameter(webSocket, "webSocket");
            kotlin.jvm.internal.s.checkNotNullParameter(t7, "t");
            super.onFailure(webSocket, t7, response);
            l lVar = this.f1164b;
            String response2 = response != null ? response.toString() : null;
            if (response2 == null) {
                response2 = "";
            }
            lVar.invoke(response2);
            webSocket.close(1000, "");
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, String text) {
            kotlin.jvm.internal.s.checkNotNullParameter(webSocket, "webSocket");
            kotlin.jvm.internal.s.checkNotNullParameter(text, "text");
            super.onMessage(webSocket, text);
            try {
                Text2AudioSilkyResult result = (Text2AudioSilkyResult) new Gson().fromJson(text, Text2AudioSilkyResult.class);
                if (result.getCode() != 0) {
                    this.f1164b.invoke(text);
                }
                if (result.getData() != null) {
                    FileIOUtils.writeFileFromBytesByStream(this.f1165c, Base64Utils.Companion.decodeByString(result.getData().getAudio()), true);
                    if (result.getData().getStatus() == 2) {
                        l lVar = this.f1164b;
                        Gson gson = new Gson();
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(result, "result");
                        String json = gson.toJson(Text2AudioSilkyResult.copy$default(result, 0, null, Text2AudioSilkyData.copy$default(result.getData(), 0, this.f1165c, null, 5, null), null, com.artillery.ctc.h.f791d.a().b(), 11, null));
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(json, "Gson().toJson(\n         …                        )");
                        lVar.invoke(json);
                        webSocket.close(1000, "");
                    }
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onOpen(WebSocket webSocket, Response response) {
            l1 launch$default;
            kotlin.jvm.internal.s.checkNotNullParameter(webSocket, "webSocket");
            kotlin.jvm.internal.s.checkNotNullParameter(response, "response");
            super.onOpen(webSocket, response);
            m mVar = this.f1166d;
            launch$default = kotlinx.coroutines.i.launch$default(mVar.c(), null, null, new a(webSocket, this, null), 3, null);
            mVar.f1145h = launch$default;
        }
    }

    public static final class f extends Lambda implements f6.a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f1170a = new f();

        public f() {
            super(0);
        }

        @Override // f6.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.channels.b invoke() {
            return kotlinx.coroutines.channels.d.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        }
    }

    public static final class g extends Lambda implements f6.a {

        /* renamed from: a, reason: collision with root package name */
        public static final g f1171a = new g();

        public g() {
            super(0);
        }

        @Override // f6.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return new ArrayList();
        }
    }

    public static final class h extends Lambda implements f6.a {

        /* renamed from: a, reason: collision with root package name */
        public static final h f1172a = new h();

        public h() {
            super(0);
        }

        @Override // f6.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i0 invoke() {
            return j0.CoroutineScope(t0.getIO());
        }
    }

    public static final class i extends SuspendLambda implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f1173a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ byte[] f1175c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f1176d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(byte[] bArr, boolean z7, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f1175c = bArr;
            this.f1176d = z7;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
            return ((i) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return m.this.new i(this.f1175c, this.f1176d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            Object removeFirst;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f1173a;
            if (i8 == 0 || i8 == 1) {
                y5.g.throwOnFailure(obj);
                while (!m.this.b().isEmpty()) {
                    removeFirst = kotlin.collections.v.removeFirst(m.this.b());
                    kotlinx.coroutines.channels.b a8 = m.this.a();
                    this.f1173a = 1;
                    if (a8.send((byte[]) removeFirst, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (!(this.f1175c.length == 0)) {
                    kotlinx.coroutines.channels.b a9 = m.this.a();
                    byte[] bArr = this.f1175c;
                    this.f1173a = 2;
                    if (a9.send(bArr, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
            if (this.f1176d) {
                this.f1173a = 3;
                if (m.this.a().send(new byte[0], this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return y5.w.INSTANCE;
        }
    }

    public /* synthetic */ m(o oVar) {
        this();
    }

    public final void b(AsrSilkyModel model) {
        kotlin.jvm.internal.s.checkNotNullParameter(model, "model");
        this.f1142e = model;
    }

    public m() {
        y5.f lazy;
        y5.f lazy2;
        y5.f lazy3;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        lazy = kotlin.b.lazy(lazyThreadSafetyMode, (f6.a) h.f1172a);
        this.f1138a = lazy;
        lazy2 = kotlin.b.lazy(lazyThreadSafetyMode, (f6.a) f.f1170a);
        this.f1139b = lazy2;
        lazy3 = kotlin.b.lazy(lazyThreadSafetyMode, (f6.a) g.f1171a);
        this.f1140c = lazy3;
        this.f1142e = new AsrSilkyModel(null, null, null, 0, null, null, null, 0, 255, null);
        kotlinx.coroutines.i.launch$default(c(), null, null, new a(null), 3, null);
        this.f1147j = new AsrSilkyModel(null, null, null, 0, null, null, null, 0, 255, null);
    }

    public final i0 c() {
        return (i0) this.f1138a.getValue();
    }

    public final void d() {
        com.artillery.ctc.d.a("主动结束->stopRealAsr", null, 1, null);
        a(new byte[0], true);
    }

    public final List b() {
        return (List) this.f1140c.getValue();
    }

    public final void b(AsrSilkyModel asrSilkyModel, byte[] bArr) {
        WebSocket webSocket = this.f1141d;
        if (webSocket != null) {
            JsonObject jsonObject = new JsonObject();
            JsonObject jsonObject2 = new JsonObject();
            JsonObject jsonObject3 = new JsonObject();
            JsonObject jsonObject4 = new JsonObject();
            jsonObject3.addProperty(HttpConstants.HTTP_APP_ID, "407cd7ce");
            jsonObject2.addProperty("language", asrSilkyModel.language);
            jsonObject2.addProperty("domain", asrSilkyModel.domain);
            jsonObject2.addProperty("accent", asrSilkyModel.accent);
            jsonObject2.addProperty("ptt", (Number) 0);
            jsonObject2.addProperty("dwa", asrSilkyModel.dwa);
            jsonObject4.addProperty("status", (Number) 0);
            jsonObject4.addProperty(n.KEY_FORMAT_PROPERTIES, asrSilkyModel.format);
            jsonObject4.addProperty("encoding", asrSilkyModel.encoding);
            jsonObject4.addProperty("audio", Base64Utils.Companion.encodeToString(bArr));
            jsonObject.add("common", jsonObject3);
            jsonObject.add("business", jsonObject2);
            jsonObject.add("data", jsonObject4);
            com.artillery.ctc.d.a("实时语音发送第一帧->" + jsonObject, null, 1, null);
            com.artillery.ctc.d.a("发送数据:" + ConvertUtils.bytes2HexString(bArr), null, 1, null);
            String obj = jsonObject.toString();
            kotlin.jvm.internal.s.checkNotNullExpressionValue(obj, "frame.toString()");
            webSocket.send(obj);
            this.f1144g = 1;
        }
    }

    public final kotlinx.coroutines.channels.b a() {
        return (kotlinx.coroutines.channels.b) this.f1139b.getValue();
    }

    public final String a(String str, String str2, String str3) {
        String replace$default;
        String replace$default2;
        URL url = new URL(str);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(cn.hutool.core.date.d.HTTP_DATETIME_PATTERN, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String format = simpleDateFormat.format(new Date());
        kotlin.jvm.internal.s.checkNotNullExpressionValue(format, "format.format(Date())");
        StringBuilder sb = new StringBuilder();
        sb.append("host: " + url.getHost());
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append('\\n')");
        sb.append("date: " + format);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "append('\\n')");
        sb.append("GET " + url.getPath() + " HTTP/1.1");
        String sb2 = sb.toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        Mac mac = Mac.getInstance("hmacsha256");
        kotlin.jvm.internal.s.checkNotNullExpressionValue(mac, "getInstance(HMAC_SHA_256)");
        Charset charset = kotlin.text.d.UTF_8;
        byte[] bytes = str3.getBytes(charset);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        mac.init(new SecretKeySpec(bytes, "hmacsha256"));
        byte[] bytes2 = sb2.getBytes(charset);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
        byte[] doFinal = mac.doFinal(bytes2);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(doFinal, "mac.doFinal(builder.toByteArray())");
        Base64Utils.Companion companion = Base64Utils.Companion;
        String str4 = "api_key=\"" + str2 + "\", algorithm=\"hmac-sha256\", headers=\"host date request-line\", signature=\"" + companion.encodeToString(doFinal) + '\"';
        HttpUrl.Builder newBuilder = HttpUrl.Companion.get(DefaultWebClient.HTTPS_SCHEME + url.getHost() + url.getPath()).newBuilder();
        byte[] bytes3 = str4.getBytes(charset);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(bytes3, "this as java.lang.String).getBytes(charset)");
        replace$default = kotlin.text.t.replace$default(newBuilder.addQueryParameter("authorization", companion.encodeToString(bytes3)).addQueryParameter("date", format).addQueryParameter("host", url.getHost()).build().toString(), DefaultWebClient.HTTP_SCHEME, "ws://", false, 4, (Object) null);
        replace$default2 = kotlin.text.t.replace$default(replace$default, DefaultWebClient.HTTPS_SCHEME, "wss://", false, 4, (Object) null);
        return replace$default2;
    }

    public final void a(AsrSilkyModel asrSilkyModel, l onResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        if (asrSilkyModel == null) {
            asrSilkyModel = this.f1142e;
        }
        this.f1147j = asrSilkyModel;
        com.artillery.ctc.d.a("开始实时语音参数 ->" + new Gson().toJson(asrSilkyModel), null, 1, null);
        String a8 = a(asrSilkyModel.getHostUrl(), "74b97079090a537ced5a40d713c8a4dc", "MmE1NWZjOTNiM2ZmNzU2NDUyYWZkMWVj");
        this.f1143f = new OkHttpClient.Builder().proxy(Proxy.NO_PROXY).connectTimeout(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, TimeUnit.MILLISECONDS).build();
        Request build = new Request.Builder().url(a8).build();
        OkHttpClient okHttpClient = this.f1143f;
        if (okHttpClient != null) {
            this.f1144g = 0;
            this.f1146i = false;
            this.f1141d = okHttpClient.newWebSocket(build, new d(this, asrSilkyModel, onResult));
            okHttpClient.dispatcher().executorService().shutdown();
        }
    }

    public final void a(byte[] bytes, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(bytes, "bytes");
        com.artillery.ctc.d.a("标志->" + z7 + ",写入数据:" + ConvertUtils.bytes2HexString(bytes), null, 1, null);
        if (this.f1146i) {
            kotlinx.coroutines.i.launch$default(c(), null, null, new i(bytes, z7, null), 3, null);
        } else {
            b().add(bytes);
        }
    }

    public final void a(AsrSilkyModel asrModel, byte[] buffer) {
        kotlin.jvm.internal.s.checkNotNullParameter(asrModel, "asrModel");
        kotlin.jvm.internal.s.checkNotNullParameter(buffer, "buffer");
        WebSocket webSocket = this.f1141d;
        if (webSocket != null) {
            JsonObject jsonObject = new JsonObject();
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("status", (Number) 1);
            jsonObject2.addProperty(n.KEY_FORMAT_PROPERTIES, asrModel.format);
            jsonObject2.addProperty("encoding", asrModel.encoding);
            jsonObject2.addProperty("audio", Base64Utils.Companion.encodeToString(buffer));
            jsonObject.add("data", jsonObject2);
            com.artillery.ctc.d.a("实时语音发送第二帧" + System.currentTimeMillis() + "->" + jsonObject, null, 1, null);
            String obj = jsonObject.toString();
            kotlin.jvm.internal.s.checkNotNullExpressionValue(obj, "frame1.toString()");
            webSocket.send(obj);
            com.artillery.ctc.d.a("发送数据 sendMiddleFrame:" + ConvertUtils.bytes2HexString(buffer), null, 1, null);
        }
    }

    public final void a(AsrSilkyModel asrModel) {
        kotlin.jvm.internal.s.checkNotNullParameter(asrModel, "asrModel");
        WebSocket webSocket = this.f1141d;
        if (webSocket != null) {
            JsonObject jsonObject = new JsonObject();
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("status", (Number) 2);
            jsonObject2.addProperty("audio", "");
            jsonObject2.addProperty(n.KEY_FORMAT_PROPERTIES, asrModel.format);
            jsonObject2.addProperty("encoding", asrModel.encoding);
            jsonObject.add("data", jsonObject2);
            com.artillery.ctc.d.a("实时语音发送结束帧->" + jsonObject, null, 1, null);
            String obj = jsonObject.toString();
            kotlin.jvm.internal.s.checkNotNullExpressionValue(obj, "obj.toString()");
            webSocket.send(obj);
        }
    }

    public final void a(Text2AudioSilkyBody body, l onResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        com.artillery.ctc.d.a("Tts" + new Gson().toJson(body), null, 1, null);
        String a8 = a("https://tts-api.xfyun.cn/v2/tts", "74b97079090a537ced5a40d713c8a4dc", "MmE1NWZjOTNiM2ZmNzU2NDUyYWZkMWVj");
        this.f1143f = new OkHttpClient.Builder().proxy(Proxy.NO_PROXY).connectTimeout(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, TimeUnit.MILLISECONDS).build();
        Request build = new Request.Builder().url(a8).build();
        OkHttpClient okHttpClient = this.f1143f;
        if (okHttpClient != null) {
            this.f1148k = okHttpClient.newWebSocket(build, new e(this, body, onResult));
            okHttpClient.dispatcher().executorService().shutdown();
        }
    }
}
