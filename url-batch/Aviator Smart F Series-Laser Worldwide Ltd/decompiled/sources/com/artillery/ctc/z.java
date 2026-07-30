package com.artillery.ctc;

import android.util.Base64;
import com.artillery.ctc.base.AsrSilkyModel;
import com.artillery.ctc.base.KeyResult;
import com.crrepa.band.my.model.band.provider.watchface.BaseWatchFaceProvider;
import com.google.android.exoplayer2.upstream.CmcdConfiguration;
import com.google.gson.JsonObject;
import f6.p;
import java.io.UnsupportedEncodingException;
import java.net.Proxy;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.m0;
import kotlin.collections.r;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.t0;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: u, reason: collision with root package name */
    public static final c f1350u = new c(null);

    /* renamed from: v, reason: collision with root package name */
    public static String f1351v = "";

    /* renamed from: a, reason: collision with root package name */
    public final y5.f f1352a;

    /* renamed from: b, reason: collision with root package name */
    public final y5.f f1353b;

    /* renamed from: c, reason: collision with root package name */
    public final y5.f f1354c;

    /* renamed from: d, reason: collision with root package name */
    public final y5.f f1355d;

    /* renamed from: e, reason: collision with root package name */
    public final y5.f f1356e;

    /* renamed from: f, reason: collision with root package name */
    public WebSocket f1357f;

    /* renamed from: g, reason: collision with root package name */
    public AsrSilkyModel f1358g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1359h;

    /* renamed from: i, reason: collision with root package name */
    public OkHttpClient f1360i;

    /* renamed from: j, reason: collision with root package name */
    public int f1361j;

    /* renamed from: k, reason: collision with root package name */
    public l1 f1362k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1363l;

    /* renamed from: m, reason: collision with root package name */
    public AsrSilkyModel f1364m;

    /* renamed from: n, reason: collision with root package name */
    public z.a f1365n;

    /* renamed from: o, reason: collision with root package name */
    public OkHttpClient f1366o;

    /* renamed from: p, reason: collision with root package name */
    public int f1367p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1368q;

    /* renamed from: r, reason: collision with root package name */
    public WebSocket f1369r;

    /* renamed from: s, reason: collision with root package name */
    public int f1370s;

    /* renamed from: t, reason: collision with root package name */
    public f6.l f1371t;

    public static final class a extends SuspendLambda implements p {

        /* renamed from: a, reason: collision with root package name */
        public Object f1372a;

        /* renamed from: b, reason: collision with root package name */
        public int f1373b;

        /* renamed from: com.artillery.ctc.z$a$a, reason: collision with other inner class name */
        public static final class C0026a extends SuspendLambda implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f1375a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ byte[] f1376b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ z f1377c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0026a(byte[] bArr, z zVar, kotlin.coroutines.c cVar) {
                super(2, cVar);
                this.f1376b = bArr;
                this.f1377c = zVar;
            }

            @Override // f6.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
                return ((C0026a) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                return new C0026a(this.f1376b, this.f1377c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                if (this.f1375a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
                byte[] bArr = this.f1376b;
                if (bArr == null) {
                    z zVar = this.f1377c;
                    zVar.b(zVar.f1364m, new byte[0]);
                } else {
                    if (!(bArr.length == 0)) {
                        z zVar2 = this.f1377c;
                        zVar2.a(zVar2.f1364m, this.f1376b);
                    } else {
                        z zVar3 = this.f1377c;
                        zVar3.a(zVar3.f1364m);
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
            return z.this.new a(cVar);
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
            int i8 = this.f1373b;
            if (i8 == 0) {
                y5.g.throwOnFailure(obj);
                it = z.this.c().iterator();
            } else if (i8 == 1) {
                ChannelIterator channelIterator = (ChannelIterator) this.f1372a;
                y5.g.throwOnFailure(obj);
                ChannelIterator channelIterator2 = channelIterator;
                Object obj2 = coroutine_suspended;
                a aVar2 = this;
                if (!((Boolean) obj).booleanValue()) {
                    byte[] bArr = (byte[]) channelIterator2.next();
                    CoroutineDispatcher io2 = t0.getIO();
                    C0026a c0026a = new C0026a(bArr, z.this, null);
                    aVar2.f1372a = channelIterator2;
                    aVar2.f1373b = 2;
                    if (kotlinx.coroutines.g.withContext(io2, c0026a, aVar2) == obj2) {
                        return obj2;
                    }
                    aVar = aVar2;
                    coroutine_suspended = obj2;
                    it = channelIterator2;
                    aVar.f1372a = it;
                    aVar.f1373b = 1;
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
                it = (ChannelIterator) this.f1372a;
                y5.g.throwOnFailure(obj);
            }
            aVar = this;
            aVar.f1372a = it;
            aVar.f1373b = 1;
            hasNext = it.hasNext(aVar);
            if (hasNext != coroutine_suspended) {
            }
        }
    }

    public static final class b extends SuspendLambda implements p {

        /* renamed from: a, reason: collision with root package name */
        public Object f1378a;

        /* renamed from: b, reason: collision with root package name */
        public Object f1379b;

        /* renamed from: c, reason: collision with root package name */
        public int f1380c;

        public static final class a extends SuspendLambda implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f1382a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ byte[] f1383b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Ref$IntRef f1384c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ z f1385d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(byte[] bArr, Ref$IntRef ref$IntRef, z zVar, kotlin.coroutines.c cVar) {
                super(2, cVar);
                this.f1383b = bArr;
                this.f1384c = ref$IntRef;
                this.f1385d = zVar;
            }

            @Override // f6.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
                return ((a) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                return new a(this.f1383b, this.f1384c, this.f1385d, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                if (this.f1382a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
                byte[] bArr = this.f1383b;
                if (bArr == null) {
                    this.f1384c.element = 0;
                    z zVar = this.f1385d;
                    zVar.a(zVar.f1365n, new byte[0], this.f1384c.element);
                } else {
                    if (!(bArr.length == 0)) {
                        z zVar2 = this.f1385d;
                        zVar2.b(zVar2.f1365n, this.f1383b, this.f1384c.element);
                    } else {
                        z zVar3 = this.f1385d;
                        zVar3.a(zVar3.f1365n, this.f1384c.element);
                    }
                }
                this.f1384c.element++;
                return y5.w.INSTANCE;
            }
        }

        public b(kotlin.coroutines.c cVar) {
            super(2, cVar);
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
            return ((b) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return z.this.new b(cVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0052 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0080 -> B:7:0x0046). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            Ref$IntRef ref$IntRef;
            ChannelIterator it;
            b bVar;
            Object hasNext;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f1380c;
            if (i8 == 0) {
                y5.g.throwOnFailure(obj);
                ref$IntRef = new Ref$IntRef();
                it = z.this.d().iterator();
            } else if (i8 == 1) {
                ChannelIterator channelIterator = (ChannelIterator) this.f1379b;
                Ref$IntRef ref$IntRef2 = (Ref$IntRef) this.f1378a;
                y5.g.throwOnFailure(obj);
                Ref$IntRef ref$IntRef3 = ref$IntRef2;
                ChannelIterator channelIterator2 = channelIterator;
                Object obj2 = coroutine_suspended;
                b bVar2 = this;
                if (!((Boolean) obj).booleanValue()) {
                    byte[] bArr = (byte[]) channelIterator2.next();
                    CoroutineDispatcher io2 = t0.getIO();
                    a aVar = new a(bArr, ref$IntRef3, z.this, null);
                    bVar2.f1378a = ref$IntRef3;
                    bVar2.f1379b = channelIterator2;
                    bVar2.f1380c = 2;
                    if (kotlinx.coroutines.g.withContext(io2, aVar, bVar2) == obj2) {
                        return obj2;
                    }
                    bVar = bVar2;
                    coroutine_suspended = obj2;
                    it = channelIterator2;
                    ref$IntRef = ref$IntRef3;
                    bVar.f1378a = ref$IntRef;
                    bVar.f1379b = it;
                    bVar.f1380c = 1;
                    hasNext = it.hasNext(bVar);
                    if (hasNext != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Object obj3 = coroutine_suspended;
                    bVar2 = bVar;
                    obj = hasNext;
                    ref$IntRef3 = ref$IntRef;
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
                it = (ChannelIterator) this.f1379b;
                ref$IntRef = (Ref$IntRef) this.f1378a;
                y5.g.throwOnFailure(obj);
            }
            bVar = this;
            bVar.f1378a = ref$IntRef;
            bVar.f1379b = it;
            bVar.f1380c = 1;
            hasNext = it.hasNext(bVar);
            if (hasNext != coroutine_suspended) {
            }
        }
    }

    public static final class c {
        public c() {
        }

        public /* synthetic */ c(o oVar) {
            this();
        }

        public final z a() {
            return d.f1386a.a();
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f1386a = new d();

        /* renamed from: b, reason: collision with root package name */
        public static final z f1387b = new z(null);

        public final z a() {
            return f1387b;
        }
    }

    public final class e extends WebSocketListener {

        /* renamed from: a, reason: collision with root package name */
        public final z.a f1388a;

        /* renamed from: b, reason: collision with root package name */
        public final f6.l f1389b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ z f1390c;

        public static final class a extends SuspendLambda implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f1391a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f1392b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f1393c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(z zVar, e eVar, kotlin.coroutines.c cVar) {
                super(2, cVar);
                this.f1392b = zVar;
                this.f1393c = eVar;
            }

            @Override // f6.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
                return ((a) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                return new a(this.f1392b, this.f1393c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f1391a;
                if (i8 == 0) {
                    y5.g.throwOnFailure(obj);
                    this.f1392b.f1365n = this.f1393c.a();
                    this.f1392b.f1367p = 0;
                    kotlinx.coroutines.channels.b d8 = this.f1392b.d();
                    this.f1391a = 1;
                    if (d8.send(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.g.throwOnFailure(obj);
                }
                this.f1392b.f1368q = true;
                if (!this.f1392b.f1359h) {
                    this.f1392b.f1370s = 0;
                }
                return y5.w.INSTANCE;
            }
        }

        public e(z zVar, z.a body, f6.l asrCallback) {
            kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
            kotlin.jvm.internal.s.checkNotNullParameter(asrCallback, "asrCallback");
            this.f1390c = zVar;
            this.f1388a = body;
            this.f1389b = asrCallback;
        }

        public final z.a a() {
            return this.f1388a;
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
            f6.l lVar = this.f1389b;
            String response2 = response != null ? response.toString() : null;
            if (response2 == null) {
                response2 = "";
            }
            lVar.invoke(response2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x00e9, code lost:
        
            r14 = kotlin.text.s.toIntOrNull(r5);
         */
        @Override // okhttp3.WebSocketListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onMessage(WebSocket webSocket, String text) {
            Map emptyMap;
            String joinToString$default;
            Integer intOrNull;
            kotlin.jvm.internal.s.checkNotNullParameter(webSocket, "webSocket");
            kotlin.jvm.internal.s.checkNotNullParameter(text, "text");
            super.onMessage(webSocket, text);
            com.artillery.ctc.d.c(com.artillery.ctc.d.a(text, com.artillery.ctc.h.f791d.a().b()), "onMessage");
            if (kotlin.text.t.isBlank(text)) {
                com.artillery.ctc.d.a("【接收异常】消息内容为空", null, 1, null);
                return;
            }
            com.artillery.ctc.d.a("【接收消息】" + text, null, 1, null);
            try {
                JSONObject jSONObject = new JSONObject(text);
                String optString = jSONObject.optString("msg_type");
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject == null || (emptyMap = this.f1390c.a(optJSONObject)) == null) {
                    emptyMap = m0.emptyMap();
                }
                Object obj = emptyMap.get("action");
                String str = obj instanceof String ? (String) obj : null;
                Object obj2 = emptyMap.get("code");
                String str2 = obj2 instanceof String ? (String) obj2 : null;
                Object obj3 = emptyMap.get("desc");
                String str3 = obj3 instanceof String ? (String) obj3 : null;
                Object obj4 = emptyMap.get(CmcdConfiguration.KEY_SESSION_ID);
                String str4 = obj4 instanceof String ? (String) obj4 : null;
                if (str4 == null) {
                    Object obj5 = emptyMap.get("sessionId");
                    str4 = obj5 instanceof String ? (String) obj5 : null;
                }
                if (kotlin.jvm.internal.s.areEqual(str, "started")) {
                    if (str4 != null) {
                        z.f1351v = str4;
                        com.artillery.ctc.d.a("sessionId：" + z.f1351v, null, 1, null);
                        this.f1390c.f1368q = true;
                        return;
                    }
                    return;
                }
                if (kotlin.jvm.internal.s.areEqual(str, "end")) {
                    return;
                }
                if (kotlin.jvm.internal.s.areEqual(str, "error")) {
                    int intValue = (str2 == null || intOrNull == null) ? -1 : intOrNull.intValue();
                    StringBuilder sb = new StringBuilder();
                    sb.append("ASR Error (code: ");
                    sb.append(intValue);
                    sb.append("): ");
                    if (str3 == null) {
                        str3 = "未知错误";
                    }
                    sb.append(str3);
                    this.f1389b.invoke(new Exception(sb.toString()).toString());
                    return;
                }
                if (!kotlin.jvm.internal.s.areEqual(optString, "result") && !kotlin.jvm.internal.s.areEqual(str, "result")) {
                    com.artillery.ctc.d.a("【未处理消息】msgType=" + optString + ", action=" + str + ", sid=" + str4, null, 1, null);
                    return;
                }
                z.j data = ((z.k) y.g.a(text, z.k.class)).getData();
                List<z.n> rtList = data.getCn().getSt().getRtList();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = rtList.iterator();
                while (it.hasNext()) {
                    kotlin.collections.v.addAll(arrayList, ((z.n) it.next()).getWsList());
                }
                ArrayList<z.m> arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    kotlin.collections.v.addAll(arrayList2, ((z.p) it2.next()).getCwList());
                }
                ArrayList arrayList3 = new ArrayList(r.collectionSizeOrDefault(arrayList2, 10));
                String str5 = "";
                for (z.m mVar : arrayList2) {
                    String language = mVar.getLanguage();
                    arrayList3.add(mVar.getWord());
                    str5 = language;
                }
                joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList3, "", null, null, 0, null, null, 62, null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("识别词语：");
                sb2.append(joinToString$default);
                sb2.append(" 识别状态： ");
                sb2.append(kotlin.jvm.internal.s.areEqual(data.getCn().getSt().getResultType(), "0") ? "识别完成" : "识别中");
                sb2.append(" language:");
                sb2.append(str5);
                System.out.println((Object) sb2.toString());
                if (joinToString$default.length() > 0) {
                    f6.l lVar = this.f1389b;
                    JsonObject jsonObject = new JsonObject();
                    z zVar = this.f1390c;
                    jsonObject.addProperty("text", joinToString$default);
                    jsonObject.addProperty("status", data.getCn().getSt().getResultType());
                    jsonObject.addProperty("language", str5);
                    jsonObject.addProperty("index", Integer.valueOf(zVar.f1370s));
                    String a8 = y.g.a(jsonObject);
                    kotlin.jvm.internal.s.checkNotNullExpressionValue(a8, "toJson(JsonObject().appl…                       })");
                    lVar.invoke(a8);
                    if (kotlin.jvm.internal.s.areEqual(data.getCn().getSt().getResultType(), "0")) {
                        this.f1390c.f1370s++;
                    }
                }
            } catch (Exception unused) {
                String substring = text.substring(0, Math.min(50, text.length()));
                kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                com.artillery.ctc.d.a("【接收异常】非JSON文本消息：" + substring + "...", null, 1, null);
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onOpen(WebSocket webSocket, Response response) {
            l1 launch$default;
            kotlin.jvm.internal.s.checkNotNullParameter(webSocket, "webSocket");
            kotlin.jvm.internal.s.checkNotNullParameter(response, "response");
            super.onOpen(webSocket, response);
            z zVar = this.f1390c;
            launch$default = kotlinx.coroutines.i.launch$default(zVar.f(), null, null, new a(this.f1390c, this, null), 3, null);
            zVar.f1362k = launch$default;
        }
    }

    public final class f extends WebSocketListener {

        /* renamed from: a, reason: collision with root package name */
        public final z.a f1394a;

        /* renamed from: b, reason: collision with root package name */
        public final f6.l f1395b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ z f1396c;

        public static final class a extends SuspendLambda implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f1397a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f1398b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f1399c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(z zVar, f fVar, kotlin.coroutines.c cVar) {
                super(2, cVar);
                this.f1398b = zVar;
                this.f1399c = fVar;
            }

            @Override // f6.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
                return ((a) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                return new a(this.f1398b, this.f1399c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f1397a;
                if (i8 == 0) {
                    y5.g.throwOnFailure(obj);
                    this.f1398b.f1365n = this.f1399c.a();
                    this.f1398b.f1361j = 0;
                    kotlinx.coroutines.channels.b c8 = this.f1398b.c();
                    this.f1397a = 1;
                    if (c8.send(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.g.throwOnFailure(obj);
                }
                this.f1398b.f1363l = true;
                return y5.w.INSTANCE;
            }
        }

        public f(z zVar, z.a asrModel, f6.l onResult) {
            kotlin.jvm.internal.s.checkNotNullParameter(asrModel, "asrModel");
            kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
            this.f1396c = zVar;
            this.f1394a = asrModel;
            this.f1395b = onResult;
        }

        public final z.a a() {
            return this.f1394a;
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
            f6.l lVar = this.f1395b;
            String response2 = response != null ? response.toString() : null;
            if (response2 == null) {
                response2 = "";
            }
            lVar.invoke(response2);
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, String text) {
            String removePrefix;
            String removeSuffix;
            String replace$default;
            JSONObject jSONObject;
            kotlin.jvm.internal.s.checkNotNullParameter(webSocket, "webSocket");
            kotlin.jvm.internal.s.checkNotNullParameter(text, "text");
            super.onMessage(webSocket, text);
            String a8 = com.artillery.ctc.d.a(text, com.artillery.ctc.h.f791d.a().b());
            com.artillery.ctc.d.c(a8, "onMessage");
            try {
                JSONObject jSONObject2 = new JSONObject(a8);
                String optString = jSONObject2.optString("action");
                if (optString != null) {
                    int hashCode = optString.hashCode();
                    if (hashCode != -1897185151) {
                        if (hashCode != -934426595) {
                            if (hashCode == 96784904 && optString.equals("error")) {
                                com.artillery.ctc.d.a("RTASR Error: " + text, null, 1, null);
                                return;
                            }
                        } else if (optString.equals("result")) {
                            String dataStr = jSONObject2.optString("data");
                            try {
                                jSONObject = new JSONObject(dataStr);
                            } catch (Exception unused) {
                                kotlin.jvm.internal.s.checkNotNullExpressionValue(dataStr, "dataStr");
                                removePrefix = StringsKt__StringsKt.removePrefix(StringsKt__StringsKt.trim((CharSequence) dataStr).toString(), (CharSequence) "\"");
                                removeSuffix = StringsKt__StringsKt.removeSuffix(removePrefix, (CharSequence) "\"");
                                replace$default = kotlin.text.t.replace$default(removeSuffix, "\\\"", "\"", false, 4, (Object) null);
                                jSONObject = new JSONObject(replace$default);
                            }
                            String jSONObject3 = jSONObject.toString();
                            kotlin.jvm.internal.s.checkNotNullExpressionValue(jSONObject3, "cleanData.toString()");
                            Map a9 = a(jSONObject3);
                            com.artillery.ctc.d.a("RTASR result: " + a9, null, 1, null);
                            f6.l lVar = this.f1395b;
                            JsonObject jsonObject = new JsonObject();
                            z zVar = this.f1396c;
                            jsonObject.addProperty("text", String.valueOf(a9.get("text")));
                            jsonObject.addProperty("status", String.valueOf(a9.get("type")));
                            jsonObject.addProperty("language", "");
                            jsonObject.addProperty("index", Integer.valueOf(zVar.f1370s));
                            String a10 = y.g.a(jsonObject);
                            kotlin.jvm.internal.s.checkNotNullExpressionValue(a10, "toJson(JsonObject().appl…                       })");
                            lVar.invoke(a10);
                            if (kotlin.jvm.internal.s.areEqual(String.valueOf(a9.get("type")), "0")) {
                                this.f1396c.f1370s++;
                                return;
                            }
                            return;
                        }
                    } else if (optString.equals("started")) {
                        com.artillery.ctc.d.a("RTASR握手成功 sid=" + jSONObject2.optString(CmcdConfiguration.KEY_SESSION_ID), null, 1, null);
                        return;
                    }
                }
                com.artillery.ctc.d.a("RTASR 未知 action: " + optString, null, 1, null);
            } catch (Exception e8) {
                e8.getMessage();
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onOpen(WebSocket webSocket, Response response) {
            l1 launch$default;
            kotlin.jvm.internal.s.checkNotNullParameter(webSocket, "webSocket");
            kotlin.jvm.internal.s.checkNotNullParameter(response, "response");
            super.onOpen(webSocket, response);
            com.artillery.ctc.d.a(response.toString(), null, 1, null);
            z zVar = this.f1396c;
            launch$default = kotlinx.coroutines.i.launch$default(zVar.f(), null, null, new a(this.f1396c, this, null), 3, null);
            zVar.f1362k = launch$default;
        }

        public final Map a(String str) {
            Map emptyMap;
            Map mapOf;
            char first;
            StringBuilder sb = new StringBuilder();
            try {
                JSONObject jSONObject = new JSONObject(str).getJSONObject("cn").getJSONObject(CmcdConfiguration.KEY_STREAM_TYPE);
                String string = jSONObject.getString("type");
                JSONArray jSONArray = jSONObject.getJSONArray("rt");
                int length = jSONArray.length();
                for (int i8 = 0; i8 < length; i8++) {
                    JSONArray jSONArray2 = jSONArray.getJSONObject(i8).getJSONArray("ws");
                    int length2 = jSONArray2.length();
                    for (int i9 = 0; i9 < length2; i9++) {
                        JSONArray jSONArray3 = jSONArray2.getJSONObject(i9).getJSONArray("cw");
                        int length3 = jSONArray3.length();
                        for (int i10 = 0; i10 < length3; i10++) {
                            sb.append(jSONArray3.getJSONObject(i10).getString("w"));
                        }
                    }
                }
                String sb2 = sb.toString();
                kotlin.jvm.internal.s.checkNotNullExpressionValue(sb2, "resultBuilder.toString()");
                if (sb2.length() > 0) {
                    first = StringsKt___StringsKt.first(sb2);
                    if (a(first)) {
                        sb2 = StringsKt___StringsKt.drop(sb2, 1);
                    }
                }
                mapOf = m0.mapOf(y5.h.to("text", sb2), y5.h.to("type", string));
                return mapOf;
            } catch (Exception e8) {
                com.artillery.ctc.d.a("RTASR解析异常: " + e8.getMessage(), null, 1, null);
                emptyMap = m0.emptyMap();
                return emptyMap;
            }
        }

        public final boolean a(char c8) {
            boolean contains$default;
            contains$default = StringsKt__StringsKt.contains$default((CharSequence) "，。！？；：、“”‘’（）《》〈〉【】『』〔〕—…,.!?;:\"'()[]{}<>", c8, false, 2, (Object) null);
            return contains$default;
        }
    }

    public static final class g extends Lambda implements f6.l {

        /* renamed from: a, reason: collision with root package name */
        public static final g f1400a = new g();

        public g() {
            super(1);
        }

        public final void a(String it) {
            kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class h extends Lambda implements f6.a {

        /* renamed from: a, reason: collision with root package name */
        public static final h f1401a = new h();

        public h() {
            super(0);
        }

        @Override // f6.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.channels.b invoke() {
            return kotlinx.coroutines.channels.d.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        }
    }

    public static final class i extends Lambda implements f6.a {

        /* renamed from: a, reason: collision with root package name */
        public static final i f1402a = new i();

        public i() {
            super(0);
        }

        @Override // f6.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.channels.b invoke() {
            return kotlinx.coroutines.channels.d.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        }
    }

    public static final class j extends Lambda implements f6.a {

        /* renamed from: a, reason: collision with root package name */
        public static final j f1403a = new j();

        public j() {
            super(0);
        }

        @Override // f6.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return new ArrayList();
        }
    }

    public static final class k extends Lambda implements f6.a {

        /* renamed from: a, reason: collision with root package name */
        public static final k f1404a = new k();

        public k() {
            super(0);
        }

        @Override // f6.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i0 invoke() {
            return j0.CoroutineScope(t0.getIO());
        }
    }

    public static final class l extends Lambda implements f6.a {

        /* renamed from: a, reason: collision with root package name */
        public static final l f1405a = new l();

        public l() {
            super(0);
        }

        @Override // f6.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return new ArrayList();
        }
    }

    public static final class m extends SuspendLambda implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f1406a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ byte[] f1408c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f1409d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(byte[] bArr, boolean z7, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f1408c = bArr;
            this.f1409d = z7;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
            return ((m) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return z.this.new m(this.f1408c, this.f1409d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            Object removeFirst;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f1406a;
            if (i8 == 0 || i8 == 1) {
                y5.g.throwOnFailure(obj);
                while (!z.this.g().isEmpty()) {
                    removeFirst = kotlin.collections.v.removeFirst(z.this.g());
                    kotlinx.coroutines.channels.b d8 = z.this.d();
                    this.f1406a = 1;
                    if (d8.send((byte[]) removeFirst, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (!(this.f1408c.length == 0)) {
                    kotlinx.coroutines.channels.b d9 = z.this.d();
                    byte[] bArr = this.f1408c;
                    this.f1406a = 2;
                    if (d9.send(bArr, this) == coroutine_suspended) {
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
            if (this.f1409d) {
                this.f1406a = 3;
                if (z.this.d().send(new byte[0], this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return y5.w.INSTANCE;
        }
    }

    public static final class n extends SuspendLambda implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f1410a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ byte[] f1412c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f1413d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(byte[] bArr, boolean z7, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f1412c = bArr;
            this.f1413d = z7;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
            return ((n) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return z.this.new n(this.f1412c, this.f1413d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            Object removeFirst;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f1410a;
            if (i8 == 0 || i8 == 1) {
                y5.g.throwOnFailure(obj);
                while (!z.this.e().isEmpty()) {
                    removeFirst = kotlin.collections.v.removeFirst(z.this.e());
                    kotlinx.coroutines.channels.b c8 = z.this.c();
                    this.f1410a = 1;
                    if (c8.send((byte[]) removeFirst, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (!(this.f1412c.length == 0)) {
                    kotlinx.coroutines.channels.b c9 = z.this.c();
                    byte[] bArr = this.f1412c;
                    this.f1410a = 2;
                    if (c9.send(bArr, this) == coroutine_suspended) {
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
            if (this.f1413d) {
                this.f1410a = 3;
                if (z.this.c().send(new byte[0], this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return y5.w.INSTANCE;
        }
    }

    public /* synthetic */ z(o oVar) {
        this();
    }

    public final void j() {
        a(new byte[0], true);
        this.f1359h = false;
        this.f1370s = 0;
    }

    public z() {
        y5.f lazy;
        y5.f lazy2;
        y5.f lazy3;
        y5.f lazy4;
        y5.f lazy5;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        lazy = kotlin.b.lazy(lazyThreadSafetyMode, (f6.a) k.f1404a);
        this.f1352a = lazy;
        lazy2 = kotlin.b.lazy(lazyThreadSafetyMode, (f6.a) h.f1401a);
        this.f1353b = lazy2;
        lazy3 = kotlin.b.lazy(lazyThreadSafetyMode, (f6.a) i.f1402a);
        this.f1354c = lazy3;
        lazy4 = kotlin.b.lazy(lazyThreadSafetyMode, (f6.a) j.f1403a);
        this.f1355d = lazy4;
        lazy5 = kotlin.b.lazy(lazyThreadSafetyMode, (f6.a) l.f1405a);
        this.f1356e = lazy5;
        this.f1358g = new AsrSilkyModel(null, null, null, 0, null, null, null, 0, 255, null);
        kotlinx.coroutines.i.launch$default(f(), null, null, new a(null), 3, null);
        kotlinx.coroutines.i.launch$default(f(), null, null, new b(null), 3, null);
        this.f1364m = new AsrSilkyModel(null, null, null, 0, null, null, null, 0, 255, null);
        this.f1365n = new z.a(null, null, null, 7, null);
        this.f1371t = g.f1400a;
    }

    public final kotlinx.coroutines.channels.b d() {
        return (kotlinx.coroutines.channels.b) this.f1354c.getValue();
    }

    public final List e() {
        return (List) this.f1355d.getValue();
    }

    public final i0 f() {
        return (i0) this.f1352a.getValue();
    }

    public final List g() {
        return (List) this.f1356e.getValue();
    }

    public final String h() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(cn.hutool.core.date.d.UTC_WITH_ZONE_OFFSET_PATTERN);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        String format = simpleDateFormat.format(new Date());
        kotlin.jvm.internal.s.checkNotNullExpressionValue(format, "sdf.format(Date())");
        return format;
    }

    public final void i() {
        a(new byte[0], true);
    }

    public final kotlinx.coroutines.channels.b c() {
        return (kotlinx.coroutines.channels.b) this.f1353b.getValue();
    }

    public final String b(String str, String str2) {
        try {
            Charset charset = kotlin.text.d.UTF_8;
            byte[] bytes = str2.getBytes(charset);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "HmacSHA1");
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(secretKeySpec);
            byte[] bytes2 = str.getBytes(charset);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
            byte[] doFinal = mac.doFinal(bytes2);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(doFinal, "mac.doFinal(text)");
            String oauth = Base64.encodeToString(doFinal, 2);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(oauth, "oauth");
            return oauth;
        } catch (UnsupportedEncodingException e8) {
            throw new SignatureException("UnsupportedEncodingException:" + e8.getMessage());
        } catch (InvalidKeyException e9) {
            throw new SignatureException("InvalidKeyException:" + e9.getMessage());
        } catch (NoSuchAlgorithmException e10) {
            throw new SignatureException("NoSuchAlgorithmException:" + e10.getMessage());
        }
    }

    public final String a(String str, String str2) {
        String valueOf = String.valueOf(System.currentTimeMillis() / 1000);
        try {
            return "?appid=" + str + "&ts=" + valueOf + "&signa=" + URLEncoder.encode(b(String.valueOf(a(this, str + valueOf, null, 2, null)), str2), cn.hutool.core.util.l.UTF_8) + "&vadMdn=2";
        } catch (Exception e8) {
            e8.printStackTrace();
            return "";
        }
    }

    public static /* synthetic */ String a(z zVar, String str, Charset UTF_8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            UTF_8 = StandardCharsets.UTF_8;
            kotlin.jvm.internal.s.checkNotNullExpressionValue(UTF_8, "UTF_8");
        }
        return zVar.a(str, UTF_8);
    }

    public final Map b() {
        String replace$default;
        TreeMap treeMap = new TreeMap();
        KeyResult c8 = com.artillery.ctc.h.f791d.a().c();
        treeMap.put("audio_encode", "pcm_s16le");
        treeMap.put(BaseWatchFaceProvider.LANG, "autominor");
        treeMap.put("samplerate", "16000");
        treeMap.put("accessKeyId", String.valueOf(c8.getXfAsrAPIKey()));
        treeMap.put("appId", String.valueOf(c8.getXfAsrAppId()));
        String uuid = UUID.randomUUID().toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        replace$default = kotlin.text.t.replace$default(uuid, "-", "", false, 4, (Object) null);
        treeMap.put("uuid", replace$default);
        treeMap.put("utc", h());
        treeMap.put("eng_vad_mdn", "2");
        treeMap.put("signature", b(treeMap));
        return treeMap;
    }

    public final String a(String input, Charset charset) {
        Object m348constructorimpl;
        kotlin.jvm.internal.s.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.s.checkNotNullParameter(charset, "charset");
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            Result.a aVar = Result.Companion;
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bytes = input.getBytes(charset);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] digest = messageDigest.digest(bytes);
            char[] cArr2 = new char[digest.length * 2];
            kotlin.jvm.internal.s.checkNotNullExpressionValue(digest, "digest");
            int i8 = 0;
            for (byte b8 : digest) {
                int i9 = i8 + 1;
                cArr2[i8] = cArr[(b8 & 255) >>> 4];
                i8 += 2;
                cArr2[i9] = cArr[b8 & 15];
            }
            m348constructorimpl = Result.m348constructorimpl(new String(cArr2));
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m348constructorimpl = Result.m348constructorimpl(y5.g.createFailure(th));
        }
        if (Result.m354isFailureimpl(m348constructorimpl)) {
            m348constructorimpl = null;
        }
        return (String) m348constructorimpl;
    }

    public final String b(Map map) {
        try {
            KeyResult c8 = com.artillery.ctc.h.f791d.a().c();
            StringBuilder sb = new StringBuilder();
            boolean z7 = true;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!kotlin.jvm.internal.s.areEqual("signature", str) && str2 != null && !kotlin.text.t.isBlank(str2)) {
                    if (!z7) {
                        sb.append("&");
                    }
                    Charset charset = StandardCharsets.UTF_8;
                    sb.append(URLEncoder.encode(str, charset.name()));
                    sb.append("=");
                    sb.append(URLEncoder.encode(str2, charset.name()));
                    z7 = false;
                }
            }
            Mac mac = Mac.getInstance("HmacSHA1");
            String valueOf = String.valueOf(c8.getXfAsrAPISecret());
            Charset UTF_8 = StandardCharsets.UTF_8;
            kotlin.jvm.internal.s.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = valueOf.getBytes(UTF_8);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            mac.init(new SecretKeySpec(bytes, "HmacSHA1"));
            String sb2 = sb.toString();
            kotlin.jvm.internal.s.checkNotNullExpressionValue(sb2, "baseStr.toString()");
            kotlin.jvm.internal.s.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes2 = sb2.getBytes(UTF_8);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
            String encodeToString = Base64.encodeToString(mac.doFinal(bytes2), 2);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(encodeToString, "{\n            // 构建基础字符串…Base64.NO_WRAP)\n        }");
            return encodeToString;
        } catch (Exception e8) {
            throw new RuntimeException("计算签名失败", e8);
        }
    }

    public final String a(Map map) {
        StringBuilder sb = new StringBuilder();
        boolean z7 = true;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!z7) {
                sb.append("&");
            }
            try {
                Charset charset = StandardCharsets.UTF_8;
                sb.append(URLEncoder.encode(str, charset.name()));
                sb.append("=");
                sb.append(URLEncoder.encode(str2, charset.name()));
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            z7 = false;
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    public final void a(AsrSilkyModel asrModel, byte[] buffer) {
        kotlin.jvm.internal.s.checkNotNullParameter(asrModel, "asrModel");
        kotlin.jvm.internal.s.checkNotNullParameter(buffer, "buffer");
        WebSocket webSocket = this.f1357f;
        if (webSocket != null) {
            webSocket.send(ByteString.a.of$default(ByteString.Companion, buffer, 0, 0, 3, null));
        }
    }

    public final void a(AsrSilkyModel asrModel) {
        kotlin.jvm.internal.s.checkNotNullParameter(asrModel, "asrModel");
        WebSocket webSocket = this.f1357f;
        if (webSocket != null) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("end", Boolean.TRUE);
            String a8 = y.g.a(jsonObject);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(a8, "toJson(JsonObject().appl…nd\", true)\n            })");
            webSocket.send(a8);
        }
    }

    public final void a(z.a aVar, f6.l asrCallback) {
        kotlin.jvm.internal.s.checkNotNullParameter(asrCallback, "asrCallback");
        if (aVar == null) {
            aVar = this.f1365n;
        }
        this.f1365n = aVar;
        this.f1371t = asrCallback;
        if (com.artillery.ctc.h.f791d.a().c().getXfAsrAppId() == null) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("code", "-1");
            jsonObject.addProperty("message", "appId不存在");
            String a8 = y.g.a(jsonObject);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(a8, "toJson(JsonObject().appl…appId不存在\")\n            })");
            asrCallback.invoke(a8);
            return;
        }
        String str = "wss://office-api-ast-dx.iflyaisol.com/ast/communicate/v1?" + a(b());
        this.f1366o = new OkHttpClient.Builder().proxy(Proxy.NO_PROXY).connectTimeout(5000L, TimeUnit.MILLISECONDS).build();
        Request build = new Request.Builder().url(str).build();
        OkHttpClient okHttpClient = this.f1366o;
        if (okHttpClient != null) {
            this.f1367p = 0;
            this.f1368q = false;
            this.f1369r = okHttpClient.newWebSocket(build, new e(this, aVar, asrCallback));
            okHttpClient.dispatcher().executorService().shutdown();
        }
    }

    public final void b(z.a aVar, f6.l asrCallback) {
        kotlin.jvm.internal.s.checkNotNullParameter(asrCallback, "asrCallback");
        if (aVar == null) {
            aVar = this.f1365n;
        }
        this.f1365n = aVar;
        this.f1371t = asrCallback;
        KeyResult c8 = com.artillery.ctc.h.f791d.a().c();
        if (c8.getXfAsrAppId() == null) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("code", "-1");
            jsonObject.addProperty("message", "appId不存在");
            String a8 = y.g.a(jsonObject);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(a8, "toJson(JsonObject().appl…appId不存在\")\n            })");
            asrCallback.invoke(a8);
            return;
        }
        String xfAsrStdAppId = c8.getXfAsrStdAppId();
        if (xfAsrStdAppId == null) {
            xfAsrStdAppId = "";
        }
        String xfAsrStdAPIKey = c8.getXfAsrStdAPIKey();
        String str = "wss://rtasr.xfyun.cn/v1/ws" + a(xfAsrStdAppId, xfAsrStdAPIKey != null ? xfAsrStdAPIKey : "");
        this.f1360i = new OkHttpClient.Builder().proxy(Proxy.NO_PROXY).connectTimeout(5000L, TimeUnit.MILLISECONDS).build();
        Request build = new Request.Builder().url(str).build();
        OkHttpClient okHttpClient = this.f1360i;
        if (okHttpClient != null) {
            this.f1367p = 0;
            this.f1363l = false;
            this.f1357f = okHttpClient.newWebSocket(build, new f(this, this.f1365n, asrCallback));
            okHttpClient.dispatcher().executorService().shutdown();
        }
    }

    public final void a(byte[] bytes, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(bytes, "bytes");
        if (this.f1368q) {
            kotlinx.coroutines.i.launch$default(f(), null, null, new m(bytes, z7, null), 3, null);
        } else {
            g().add(bytes);
        }
    }

    public final void a(z.a body) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        this.f1359h = true;
        this.f1365n = body;
        a(body, this.f1371t);
    }

    public final void a(z.a aVar, byte[] bArr, int i8) {
        WebSocket webSocket = this.f1369r;
        if (webSocket != null) {
            webSocket.send(ByteString.a.of$default(ByteString.Companion, bArr, 0, 0, 3, null));
            this.f1367p = 1;
        }
    }

    public final void a(z.a aVar, int i8) {
        WebSocket webSocket = this.f1369r;
        if (webSocket != null) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("end", Boolean.TRUE);
            String a8 = y.g.a(jsonObject);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(a8, "toJson(JsonObject().appl…nd\", true)\n            })");
            webSocket.send(a8);
        }
    }

    public final Map a(JSONObject jSONObject) {
        kotlin.jvm.internal.s.checkNotNullParameter(jSONObject, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            kotlin.jvm.internal.s.checkNotNullExpressionValue(key, "key");
            Object obj = jSONObject.get(key);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(obj, "get(key)");
            linkedHashMap.put(key, obj);
        }
        return linkedHashMap;
    }

    public final void b(byte[] bytes, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(bytes, "bytes");
        if (this.f1363l) {
            kotlinx.coroutines.i.launch$default(f(), null, null, new n(bytes, z7, null), 3, null);
        } else {
            e().add(bytes);
        }
    }

    public final void b(AsrSilkyModel asrSilkyModel, byte[] bArr) {
        WebSocket webSocket = this.f1357f;
        if (webSocket != null) {
            webSocket.send(ByteString.a.of$default(ByteString.Companion, bArr, 0, 0, 3, null));
            this.f1361j = 1;
        }
    }

    public final void b(z.a aVar, byte[] bArr, int i8) {
        WebSocket webSocket = this.f1369r;
        if (webSocket != null) {
            webSocket.send(ByteString.a.of$default(ByteString.Companion, bArr, 0, 0, 3, null));
        }
    }
}
