package com.artillery.ctc;

import com.artillery.ctc.base.AsrSilkyModel;
import com.artillery.ctc.base.Audio2TextBodyRaw;
import com.artillery.ctc.base.Language;
import com.artillery.ctc.base.OverseasConfigModel;
import com.artillery.ctc.base.Text2AudioSilkyBody;
import com.artillery.ctc.base.Text2AudioSilkyConfig;
import com.artillery.ctc.base.Text2MusicBody;
import com.artillery.ctc.base.TranslateBody;
import com.artillery.ctc.h;
import com.artillery.ctc.uitls.PathUtils;
import com.baidu.mapapi.http.wrapper.HttpManager;
import com.drake.net.NetConfig;
import com.drake.net.exception.ConvertException;
import com.drake.net.exception.NetException;
import com.drake.net.internal.NetDeferred;
import com.drake.net.request.Method;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.internal.LinkedTreeMap;
import com.just.agentweb.DefaultWebClient;
import com.realsil.sdk.core.bluetooth.connection.le.GattError;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.m0;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.TypesJVMKt;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.g0;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.o1;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.v1;
import okhttp3.Response;
import okhttp3.WebSocket;
import okio.ByteString;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: j, reason: collision with root package name */
    public static final b f1268j = new b(null);

    /* renamed from: k, reason: collision with root package name */
    public static final int f1269k = 10000;

    /* renamed from: l, reason: collision with root package name */
    public static final int f1270l = 30000;

    /* renamed from: a, reason: collision with root package name */
    public final y5.f f1271a;

    /* renamed from: b, reason: collision with root package name */
    public final y5.f f1272b;

    /* renamed from: c, reason: collision with root package name */
    public final y5.f f1273c;

    /* renamed from: d, reason: collision with root package name */
    public WebSocket f1274d;

    /* renamed from: e, reason: collision with root package name */
    public AsrSilkyModel f1275e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1276f;

    /* renamed from: g, reason: collision with root package name */
    public AsrSilkyModel f1277g;

    /* renamed from: h, reason: collision with root package name */
    public BufferedOutputStream f1278h;

    /* renamed from: i, reason: collision with root package name */
    public HttpURLConnection f1279i;

    public static final class a extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public Object f1280a;

        /* renamed from: b, reason: collision with root package name */
        public int f1281b;

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
            return w.this.new a(cVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0045  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0038 -> B:5:0x003d). Please report as a decompilation issue!!! */
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
            int i8 = this.f1281b;
            if (i8 == 0) {
                y5.g.throwOnFailure(obj);
                it = w.this.d().iterator();
                aVar = this;
                aVar.f1280a = it;
                aVar.f1281b = 1;
                hasNext = it.hasNext(aVar);
                if (hasNext != coroutine_suspended) {
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ChannelIterator channelIterator = (ChannelIterator) this.f1280a;
                y5.g.throwOnFailure(obj);
                ChannelIterator channelIterator2 = channelIterator;
                Object obj2 = coroutine_suspended;
                a aVar2 = this;
                if (!((Boolean) obj).booleanValue()) {
                    Pair pair = (Pair) channelIterator2.next();
                    if (pair.getFirst() == null) {
                        w wVar = w.this;
                        wVar.a(wVar.f1277g);
                    } else {
                        w wVar2 = w.this;
                        Object first = pair.getFirst();
                        kotlin.jvm.internal.s.checkNotNull(first);
                        wVar2.a((byte[]) first);
                    }
                    if (((Boolean) pair.getSecond()).booleanValue()) {
                        w.this.h();
                    }
                    com.artillery.ctc.d.a("是否最后一包 -> " + ((Boolean) pair.getSecond()).booleanValue(), null, 1, null);
                    aVar = aVar2;
                    coroutine_suspended = obj2;
                    it = channelIterator2;
                    aVar.f1280a = it;
                    aVar.f1281b = 1;
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

        public /* synthetic */ b(kotlin.jvm.internal.o oVar) {
            this();
        }

        public final w a() {
            return c.f1283a.a();
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f1283a = new c();

        /* renamed from: b, reason: collision with root package name */
        public static final w f1284b = new w(null);

        public final w a() {
            return f1284b;
        }
    }

    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f1285a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f1286b;

        /* renamed from: d, reason: collision with root package name */
        public int f1288d;

        public d(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f1286b = obj;
            this.f1288d |= Integer.MIN_VALUE;
            return w.this.a((Audio2TextBodyRaw) null, (f6.l) null, this);
        }
    }

    public static final class e extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f1289a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f6.l f1290b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f1291c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(f6.l lVar, String str, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f1290b = lVar;
            this.f1291c = str;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
            return ((e) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new e(this.f1290b, this.f1291c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (this.f1289a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
            this.f1290b.invoke(this.f1291c);
            return y5.w.INSTANCE;
        }
    }

    public static final class f extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f1292a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f6.l f1293b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Exception f1294c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(f6.l lVar, Exception exc, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f1293b = lVar;
            this.f1294c = exc;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
            return ((f) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new f(this.f1293b, this.f1294c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (this.f1292a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
            f6.l lVar = this.f1293b;
            String message = this.f1294c.getMessage();
            if (message == null) {
                message = "";
            }
            lVar.invoke(message);
            return y5.w.INSTANCE;
        }
    }

    public static final class g extends Lambda implements f6.l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ OverseasConfigModel f1295a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w f1296b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Audio2TextBodyRaw f1297c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(OverseasConfigModel overseasConfigModel, w wVar, Audio2TextBodyRaw audio2TextBodyRaw) {
            super(1);
            this.f1295a = overseasConfigModel;
            this.f1296b = wVar;
            this.f1297c = audio2TextBodyRaw;
        }

        public final void a(r4.b post) {
            kotlin.jvm.internal.s.checkNotNullParameter(post, "$this$post");
            r4.a.addQuery$default(post, "ak", this.f1295a.getAk(), false, 4, null);
            r4.a.addQuery$default(post, "sn", this.f1295a.getSn(), false, 4, null);
            r4.a.addQuery$default(post, "language", this.f1296b.a(this.f1297c.language), false, 4, null);
            post.setBody(y.f.a(this.f1297c.rawFile, r4.c.INSTANCE.getOCTET_STREAM()));
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r4.b) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class h extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f1298a;

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
            return w.this.new h(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (this.f1298a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
            w.this.h();
            return y5.w.INSTANCE;
        }
    }

    public static final class i extends Lambda implements f6.a {

        /* renamed from: a, reason: collision with root package name */
        public static final i f1300a = new i();

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
        public static final j f1301a = new j();

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
        public static final k f1302a = new k();

        public k() {
            super(0);
        }

        @Override // f6.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i0 invoke() {
            return j0.CoroutineScope(f2.m1260SupervisorJob$default((l1) null, 1, (Object) null).plus(t0.getIO()));
        }
    }

    public static final class l extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f1303a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f1305c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f6.l f1306d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, f6.l lVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f1305c = str;
            this.f1306d = lVar;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
            return ((l) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return w.this.new l(this.f1305c, this.f1306d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (this.f1303a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
            try {
                OverseasConfigModel overseasConfig = com.artillery.ctc.h.f791d.a().c().getOverseasConfig();
                URL url = new URL(DefaultWebClient.HTTPS_SCHEME + overseasConfig.getSn() + ".stt.speech.microsoft.com/speech/recognition/conversation/cognitiveservices/v1?language=" + w.this.a(this.f1305c));
                w wVar = w.this;
                URLConnection openConnection = url.openConnection();
                kotlin.jvm.internal.s.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setRequestMethod(HttpManager.HTTP_POST);
                httpURLConnection.setRequestProperty("Ocp-Apim-Subscription-Key", overseasConfig.getAk());
                httpURLConnection.setRequestProperty("Content-Type", "audio/wav; codecs=audio/pcm; samplerate=16000");
                httpURLConnection.setRequestProperty("Accept", "application/json;text/xml");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setChunkedStreamingMode(1024);
                httpURLConnection.setConnectTimeout(httpURLConnection.getConnectTimeout());
                httpURLConnection.setReadTimeout(httpURLConnection.getReadTimeout());
                wVar.f1279i = httpURLConnection;
                w wVar2 = w.this;
                HttpURLConnection httpURLConnection2 = w.this.f1279i;
                kotlin.jvm.internal.s.checkNotNull(httpURLConnection2);
                wVar2.f1278h = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                w.this.f1276f = true;
                while (w.this.f1276f) {
                }
                HttpURLConnection httpURLConnection3 = w.this.f1279i;
                kotlin.jvm.internal.s.checkNotNull(httpURLConnection3);
                int responseCode = httpURLConnection3.getResponseCode();
                if (responseCode == 200) {
                    HttpURLConnection httpURLConnection4 = w.this.f1279i;
                    kotlin.jvm.internal.s.checkNotNull(httpURLConnection4);
                    InputStream inputStream = httpURLConnection4.getInputStream();
                    kotlin.jvm.internal.s.checkNotNullExpressionValue(inputStream, "conn!!.inputStream");
                    Reader inputStreamReader = new InputStreamReader(inputStream, kotlin.text.d.UTF_8);
                    BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                    try {
                        String readText = TextStreamsKt.readText(bufferedReader);
                        kotlin.io.b.closeFinally(bufferedReader, null);
                        Object a8 = y.g.a(readText, Map.class);
                        kotlin.jvm.internal.s.checkNotNull(a8, "null cannot be cast to non-null type com.google.gson.internal.LinkedTreeMap<*, *>");
                        LinkedTreeMap linkedTreeMap = (LinkedTreeMap) a8;
                        JsonObject jsonObject = new JsonObject();
                        jsonObject.addProperty("reason", "RecognizedSpeech");
                        for (Map.Entry entry : linkedTreeMap.entrySet()) {
                            kotlin.jvm.internal.s.checkNotNullExpressionValue(entry, "map.entries");
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            if (value instanceof Number) {
                                String lowerCase = key.toString().toLowerCase(Locale.ROOT);
                                kotlin.jvm.internal.s.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                jsonObject.addProperty(lowerCase, kotlin.coroutines.jvm.internal.a.boxLong(((Number) value).longValue()));
                            } else if (value instanceof Boolean) {
                                String lowerCase2 = key.toString().toLowerCase(Locale.ROOT);
                                kotlin.jvm.internal.s.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                jsonObject.addProperty(lowerCase2, (Boolean) value);
                            } else if (value instanceof String) {
                                String lowerCase3 = key.toString().toLowerCase(Locale.ROOT);
                                kotlin.jvm.internal.s.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                jsonObject.addProperty(lowerCase3, (String) value);
                            } else {
                                jsonObject.addProperty(key.toString(), new Gson().toJson(value));
                            }
                        }
                        V v7 = linkedTreeMap.get("DisplayText");
                        if (v7 == 0 || (str = v7.toString()) == null) {
                            str = "";
                        }
                        jsonObject.addProperty("text", str);
                        jsonObject.addProperty("resultId", "");
                        f6.l lVar = this.f1306d;
                        String a9 = y.g.a(jsonObject);
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(a9, "toJson(jsonObject)");
                        lVar.invoke(a9);
                    } finally {
                    }
                } else {
                    com.artillery.ctc.d.a("请求失败：responseCode=" + responseCode, null, 1, null);
                    this.f1306d.invoke("{\"RecognitionStatus\":\"Failed\",\"DisplayText\":\"\"}");
                }
            } catch (Exception e8) {
                e8.printStackTrace();
                com.artillery.ctc.d.a(y5.w.INSTANCE.toString(), null, 1, null);
                this.f1306d.invoke("{\"RecognitionStatus\":\"Failed\",\"DisplayText\":\"\"}");
            }
            return y5.w.INSTANCE;
        }
    }

    public static final class m extends kotlin.coroutines.a implements g0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f6.l f1307a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(g0.a aVar, f6.l lVar) {
            super(aVar);
            this.f1307a = lVar;
        }

        @Override // kotlinx.coroutines.g0
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            com.artillery.ctc.d.c("协程异常: " + th.getMessage(), "startText2Speech");
            this.f1307a.invoke("{\"code\":500,\"path\":\"\"}");
        }
    }

    public static final class n extends Lambda implements f6.l {

        /* renamed from: a, reason: collision with root package name */
        public static final n f1308a = new n();

        public n() {
            super(1);
        }

        public final void a(Throwable th) {
            if (th == null) {
                com.artillery.ctc.d.c("协程正常结束", "startText2Speech");
                return;
            }
            com.artillery.ctc.d.c("协程异常结束: " + th, "startText2Speech");
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class o extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f1309a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f1310b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ w f1311c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f1312d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f6.l f1313e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, w wVar, String str2, f6.l lVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f1310b = str;
            this.f1311c = wVar;
            this.f1312d = str2;
            this.f1313e = lVar;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
            return ((o) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new o(this.f1310b, this.f1311c, this.f1312d, this.f1313e, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String trimIndent;
            kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (this.f1309a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
            if (this.f1310b.length() == 0) {
                com.artillery.ctc.d.c("text is isEmpty", "startText2Speech");
                return y5.w.INSTANCE;
            }
            OverseasConfigModel overseasConfig = com.artillery.ctc.h.f791d.a().c().getOverseasConfig();
            URL url = new URL(DefaultWebClient.HTTPS_SCHEME + overseasConfig.getSn() + ".tts.speech.microsoft.com/cognitiveservices/v1");
            File file = new File(PathUtils.join(PathUtils.getInternalAppCachePath(), "speech/" + System.currentTimeMillis() + ".wav"));
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                parentFile.mkdirs();
            }
            com.artillery.ctc.d.c("languageStr=" + this.f1311c.a(this.f1312d), "startText2Speech");
            com.artillery.ctc.d.c("language2LanguageVoiceName = " + this.f1311c.b(this.f1312d), "startText2Speech");
            URLConnection openConnection = url.openConnection();
            kotlin.jvm.internal.s.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestMethod(HttpManager.HTTP_POST);
            httpURLConnection.setRequestProperty("Ocp-Apim-Subscription-Key", overseasConfig.getAk());
            httpURLConnection.setRequestProperty("Content-Type", "application/ssml+xml");
            httpURLConnection.setRequestProperty("X-Microsoft-OutputFormat", "ogg-16khz-16bit-mono-opus");
            httpURLConnection.setRequestProperty("User-Agent", "AzureTTSClient");
            httpURLConnection.setDoOutput(true);
            trimIndent = StringsKt__IndentKt.trimIndent("\n            <speak version='1.0' xml:lang='en-US'>\n              <voice xml:lang='en-US' xml:gender='Female' name='" + this.f1311c.b(this.f1312d) + "'>\n                " + this.f1310b + "\n              </voice>\n            </speak>\n        ");
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                Charset charset = kotlin.text.d.UTF_8;
                byte[] bytes = trimIndent.getBytes(charset);
                kotlin.jvm.internal.s.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                y5.w wVar = y5.w.INSTANCE;
                String str = null;
                kotlin.io.b.closeFinally(outputStream, null);
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    if (errorStream != null) {
                        Reader inputStreamReader = new InputStreamReader(errorStream, charset);
                        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                        try {
                            String readText = TextStreamsKt.readText(bufferedReader);
                            kotlin.io.b.closeFinally(bufferedReader, null);
                            str = readText;
                        } finally {
                        }
                    }
                    throw new IOException("TTS request failed. ResponseCode=" + responseCode + ", Error=" + str);
                }
                InputStream input = httpURLConnection.getInputStream();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(input, "input");
                        kotlin.io.a.copyTo$default(input, fileOutputStream, 0, 2, null);
                        kotlin.io.b.closeFinally(fileOutputStream, null);
                        kotlin.io.b.closeFinally(input, null);
                        System.out.println((Object) ("TTS succeeded, audio saved to " + file.getAbsolutePath()));
                        JsonObject jsonObject = new JsonObject();
                        jsonObject.addProperty("path", file.getAbsolutePath());
                        String obj2 = jsonObject.toString();
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(obj2, "result.toString()");
                        com.artillery.ctc.d.c(obj2, "startText2Speech");
                        f6.l lVar = this.f1313e;
                        String obj3 = jsonObject.toString();
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(obj3, "result.toString()");
                        lVar.invoke(obj3);
                        return y5.w.INSTANCE;
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        }
    }

    public static final class p extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f1314a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f1315b;

        /* renamed from: d, reason: collision with root package name */
        public int f1317d;

        public p(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f1315b = obj;
            this.f1317d |= Integer.MIN_VALUE;
            return w.this.a((Text2AudioSilkyBody) null, (f6.l) null, this);
        }
    }

    public static final class q extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f1318a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f6.l f1319b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(f6.l lVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f1319b = lVar;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
            return ((q) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new q(this.f1319b, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (this.f1318a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
            com.artillery.ctc.d.c("文本不能为空", "text2AudioOverseasHttp");
            this.f1319b.invoke("");
            return y5.w.INSTANCE;
        }
    }

    public static final class r extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f1320a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ OverseasConfigModel f1321b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Text2AudioSilkyBody f1322c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ w f1323d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f6.l f1324e;

        public static final class a extends SuspendLambda implements f6.p {

            /* renamed from: a, reason: collision with root package name */
            public int f1325a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f1326b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f6.l f1327c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, f6.l lVar, kotlin.coroutines.c cVar) {
                super(2, cVar);
                this.f1326b = str;
                this.f1327c = lVar;
            }

            @Override // f6.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
                return ((a) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                return new a(this.f1326b, this.f1327c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                if (this.f1325a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
                com.artillery.ctc.d.c("text2Audio result = " + this.f1326b, "text2AudioOverseasHttp");
                this.f1327c.invoke(this.f1326b);
                return y5.w.INSTANCE;
            }
        }

        public static final class b extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ OverseasConfigModel f1328a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Text2AudioSilkyBody f1329b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ w f1330c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(OverseasConfigModel overseasConfigModel, Text2AudioSilkyBody text2AudioSilkyBody, w wVar) {
                super(1);
                this.f1328a = overseasConfigModel;
                this.f1329b = text2AudioSilkyBody;
                this.f1330c = wVar;
            }

            public final void a(r4.b post) {
                HashMap hashMapOf;
                String str;
                kotlin.jvm.internal.s.checkNotNullParameter(post, "$this$post");
                r4.a.addQuery$default(post, "ak", this.f1328a.getAk(), false, 4, null);
                r4.a.addQuery$default(post, "sn", this.f1328a.getSn(), false, 4, null);
                Pair[] pairArr = new Pair[2];
                pairArr[0] = new Pair("text", this.f1329b.text);
                Text2AudioSilkyConfig text2AudioSilkyConfig = this.f1329b.config;
                String a8 = (text2AudioSilkyConfig == null || (str = text2AudioSilkyConfig.language) == null) ? null : this.f1330c.a(str);
                if (a8 == null) {
                    a8 = "";
                }
                if (a8.length() == 0) {
                    a8 = "zh-CN";
                }
                pairArr[1] = new Pair("language", a8);
                hashMapOf = m0.hashMapOf(pairArr);
                post.json(hashMapOf);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((r4.b) obj);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(OverseasConfigModel overseasConfigModel, Text2AudioSilkyBody text2AudioSilkyBody, w wVar, f6.l lVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f1321b = overseasConfigModel;
            this.f1322c = text2AudioSilkyBody;
            this.f1323d = wVar;
            this.f1324e = lVar;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
            return ((r) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new r(this.f1321b, this.f1322c, this.f1323d, this.f1324e, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f1320a;
            if (i8 == 0) {
                y5.g.throwOnFailure(obj);
                r4.b post$default = com.drake.net.a.post$default(com.artillery.ctc.a.f674a.c("tts"), null, new b(this.f1321b, this.f1322c, this.f1323d), 2, null);
                NetConfig.INSTANCE.getRequestInterceptor();
                r4.d.setKType(post$default.getOkHttpRequest(), kotlin.jvm.internal.u.typeOf(String.class));
                Response execute = post$default.getOkHttpClient().newCall(post$default.buildRequest()).execute();
                try {
                    Object onConvert = r4.e.converter(execute.request()).onConvert(TypesJVMKt.getJavaType(kotlin.jvm.internal.u.typeOf(String.class)), execute);
                    if (onConvert == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    String str = (String) onConvert;
                    v1 main = t0.getMain();
                    a aVar = new a(str, this.f1324e, null);
                    this.f1320a = 1;
                    if (kotlinx.coroutines.g.withContext(main, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
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

    public static final class s extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f1331a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Exception f1332b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f6.l f1333c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Exception exc, f6.l lVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f1332b = exc;
            this.f1333c = lVar;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
            return ((s) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new s(this.f1332b, this.f1333c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (this.f1331a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
            com.artillery.ctc.d.c("Exception = " + this.f1332b.getStackTrace(), "text2AudioOverseas");
            this.f1333c.invoke("");
            return y5.w.INSTANCE;
        }
    }

    public static final class t extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f1334a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f1335b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f6.l f1336c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Text2MusicBody f1337d;

        public static final class a extends SuspendLambda implements f6.p {

            /* renamed from: a, reason: collision with root package name */
            public int f1338a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f1339b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f1340c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Object f1341d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ f6.l f1342e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, Object obj, f6.l lVar, kotlin.coroutines.c cVar) {
                super(2, cVar);
                this.f1340c = str;
                this.f1341d = obj;
                this.f1342e = lVar;
            }

            @Override // f6.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
                return ((a) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                a aVar = new a(this.f1340c, this.f1341d, this.f1342e, cVar);
                aVar.f1339b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                if (this.f1338a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
                i0 i0Var = (i0) this.f1339b;
                o1.ensureActive(i0Var.getCoroutineContext());
                r4.b bVar = new r4.b();
                String str = this.f1340c;
                Object obj2 = this.f1341d;
                f6.l lVar = this.f1342e;
                bVar.setPath(str);
                bVar.setMethod(Method.POST);
                bVar.setGroup(i0Var.getCoroutineContext().get(g0.Key));
                bVar.tag(obj2);
                if (lVar != null) {
                    lVar.invoke(bVar);
                }
                NetConfig.INSTANCE.getRequestInterceptor();
                r4.d.setKType(bVar.getOkHttpRequest(), kotlin.jvm.internal.u.nullableTypeOf(String.class));
                Response execute = bVar.getOkHttpClient().newCall(bVar.buildRequest()).execute();
                try {
                    return (String) r4.e.converter(execute.request()).onConvert(TypesJVMKt.getJavaType(kotlin.jvm.internal.u.nullableTypeOf(String.class)), execute);
                } catch (NetException e8) {
                    throw e8;
                } catch (CancellationException e9) {
                    throw e9;
                } catch (Throwable th) {
                    throw new ConvertException(execute, "An unexpected error occurred in the converter", th, null, 8, null);
                }
            }
        }

        public static final class b extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ OverseasConfigModel f1343a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Text2MusicBody f1344b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(OverseasConfigModel overseasConfigModel, Text2MusicBody text2MusicBody) {
                super(1);
                this.f1343a = overseasConfigModel;
                this.f1344b = text2MusicBody;
            }

            public final void a(r4.b Post) {
                kotlin.jvm.internal.s.checkNotNullParameter(Post, "$this$Post");
                r4.a.addQuery$default(Post, "ak", this.f1343a.getAk(), false, 4, null);
                r4.a.addQuery$default(Post, "sn", this.f1343a.getSn(), false, 4, null);
                Post.json(new Gson().toJson(this.f1344b));
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((r4.b) obj);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(f6.l lVar, Text2MusicBody text2MusicBody, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f1336c = lVar;
            this.f1337d = text2MusicBody;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
            return ((t) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            t tVar = new t(this.f1336c, this.f1337d, cVar);
            tVar.f1335b = obj;
            return tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            n0 async$default;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f1334a;
            try {
                if (i8 == 0) {
                    y5.g.throwOnFailure(obj);
                    i0 i0Var = (i0) this.f1335b;
                    OverseasConfigModel azureConfig = com.artillery.ctc.h.f791d.a().c().getAzureConfig();
                    async$default = kotlinx.coroutines.i.async$default(i0Var, t0.getIO().plus(f2.m1260SupervisorJob$default((l1) null, 1, (Object) null)), null, new a(com.artillery.ctc.a.f674a.c("generate_audio"), null, new b(azureConfig, this.f1337d), null), 2, null);
                    NetDeferred netDeferred = new NetDeferred(async$default);
                    this.f1334a = 1;
                    obj = netDeferred.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.g.throwOnFailure(obj);
                }
                this.f1336c.invoke((String) obj);
            } catch (Exception e8) {
                e8.printStackTrace();
                this.f1336c.invoke("");
            }
            return y5.w.INSTANCE;
        }
    }

    public static final class u extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f1345a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f6.l f1346b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TranslateBody f1347c;

        public static final class a extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ OverseasConfigModel f1348a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TranslateBody f1349b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(OverseasConfigModel overseasConfigModel, TranslateBody translateBody) {
                super(1);
                this.f1348a = overseasConfigModel;
                this.f1349b = translateBody;
            }

            public final void a(r4.b post) {
                kotlin.jvm.internal.s.checkNotNullParameter(post, "$this$post");
                r4.a.addQuery$default(post, "ak", this.f1348a.getAk(), false, 4, null);
                r4.a.addQuery$default(post, "sn", this.f1348a.getSn(), false, 4, null);
                String json = new Gson().toJson(this.f1349b);
                kotlin.jvm.internal.s.checkNotNullExpressionValue(json, "Gson().toJson(body)");
                post.json(com.artillery.ctc.d.a(json, "type", "tid"));
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((r4.b) obj);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(f6.l lVar, TranslateBody translateBody, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f1346b = lVar;
            this.f1347c = translateBody;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
            return ((u) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new u(this.f1346b, this.f1347c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object onConvert;
            kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (this.f1345a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
            try {
                r4.b post$default = com.drake.net.a.post$default("https://swapi.yueqizhixiang.com/dmp/llm/translate-1", null, new a(com.artillery.ctc.h.f791d.a().c().getAzureConfig(), this.f1347c), 2, null);
                NetConfig.INSTANCE.getRequestInterceptor();
                r4.d.setKType(post$default.getOkHttpRequest(), kotlin.jvm.internal.u.typeOf(String.class));
                Response execute = post$default.getOkHttpClient().newCall(post$default.buildRequest()).execute();
                try {
                    try {
                        try {
                            onConvert = r4.e.converter(execute.request()).onConvert(TypesJVMKt.getJavaType(kotlin.jvm.internal.u.typeOf(String.class)), execute);
                        } catch (CancellationException e8) {
                            throw e8;
                        }
                    } catch (Throwable th) {
                        throw new ConvertException(execute, "An unexpected error occurred in the converter", th, null, 8, null);
                    }
                } catch (NetException e9) {
                    throw e9;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f1346b.invoke("");
            }
            if (onConvert == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            String str = (String) onConvert;
            if (str.length() == 0) {
                this.f1346b.invoke("");
            } else {
                this.f1346b.invoke(str);
            }
            return y5.w.INSTANCE;
        }
    }

    public /* synthetic */ w(kotlin.jvm.internal.o oVar) {
        this();
    }

    public final AsrSilkyModel b() {
        return this.f1275e;
    }

    public final i0 e() {
        return (i0) this.f1271a.getValue();
    }

    public final boolean f() {
        return false;
    }

    public final boolean g() {
        return com.artillery.ctc.h.f791d.a().c().getOverseasConfig().isEmpty();
    }

    public final void h() {
        String c8 = c();
        WebSocket webSocket = this.f1274d;
        com.artillery.ctc.d.a("发送最后完成包 -> " + (webSocket != null ? Boolean.valueOf(webSocket.send(c8)) : null), null, 1, null);
    }

    public final void i() {
    }

    public final void j() {
        i();
        BufferedOutputStream bufferedOutputStream = this.f1278h;
        if (bufferedOutputStream != null) {
            bufferedOutputStream.flush();
        }
        BufferedOutputStream bufferedOutputStream2 = this.f1278h;
        if (bufferedOutputStream2 != null) {
            bufferedOutputStream2.close();
        }
        this.f1276f = false;
    }

    public w() {
        y5.f lazy;
        y5.f lazy2;
        y5.f lazy3;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        lazy = kotlin.b.lazy(lazyThreadSafetyMode, (f6.a) k.f1302a);
        this.f1271a = lazy;
        lazy2 = kotlin.b.lazy(lazyThreadSafetyMode, (f6.a) i.f1300a);
        this.f1272b = lazy2;
        lazy3 = kotlin.b.lazy(lazyThreadSafetyMode, (f6.a) j.f1301a);
        this.f1273c = lazy3;
        this.f1275e = new AsrSilkyModel("zh-CN", null, null, 0, null, null, null, 0, GattError.GATT_PRC_IN_PROGRESS, null);
        kotlinx.coroutines.i.launch$default(e(), t0.getIO(), null, new a(null), 2, null);
        this.f1277g = new AsrSilkyModel(null, null, null, 0, null, null, null, 0, 255, null);
    }

    public final void b(AsrSilkyModel model) {
        kotlin.jvm.internal.s.checkNotNullParameter(model, "model");
        this.f1275e = model;
    }

    public final String c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "FINISH");
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(jSONObject2, "JSONObject().apply {\n   …SH\")\n        }.toString()");
        return jSONObject2;
    }

    public final kotlinx.coroutines.channels.b d() {
        return (kotlinx.coroutines.channels.b) this.f1272b.getValue();
    }

    public final void b(String language, f6.l onResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(language, "language");
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        if (f()) {
            return;
        }
        if (!g()) {
            kotlinx.coroutines.i.launch$default(e(), null, null, new l(language, onResult, null), 3, null);
        } else {
            onResult.invoke("");
        }
    }

    public final void a() {
        kotlinx.coroutines.i.launch$default(e(), t0.getIO(), null, new h(null), 2, null);
    }

    public final void a(AsrSilkyModel asrSilkyModel) {
        OverseasConfigModel azureConfig = com.artillery.ctc.h.f791d.a().c().getAzureConfig();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "START");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ak", azureConfig.getAk());
        jSONObject2.put("sn", azureConfig.getSn());
        jSONObject2.put("language", a(asrSilkyModel.language));
        y5.w wVar = y5.w.INSTANCE;
        jSONObject.put("data", jSONObject2);
        com.artillery.ctc.d.a("第一帧 => " + jSONObject, null, 1, null);
        WebSocket webSocket = this.f1274d;
        if (webSocket != null) {
            String jSONObject3 = jSONObject.toString();
            kotlin.jvm.internal.s.checkNotNullExpressionValue(jSONObject3, "body.toString()");
            webSocket.send(jSONObject3);
        }
    }

    public final void b(String language, String text, f6.l onResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(language, "language");
        kotlin.jvm.internal.s.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        if (!f() && g()) {
            onResult.invoke("");
        }
    }

    public final String b(String str) {
        Language of = Language.Companion.of(str);
        String voiceName = of != null ? of.getVoiceName() : null;
        if (voiceName == null) {
            voiceName = "";
        }
        return voiceName.length() == 0 ? str : voiceName;
    }

    public final void a(byte[] buffer) {
        kotlin.jvm.internal.s.checkNotNullParameter(buffer, "buffer");
        WebSocket webSocket = this.f1274d;
        if (webSocket != null) {
            ByteString of$default = ByteString.a.of$default(ByteString.Companion, buffer, 0, 0, 3, null);
            com.artillery.ctc.d.a("status => " + webSocket.send(of$default) + ", 实时语音发送第二帧" + System.currentTimeMillis() + ", 发送数据 sendMiddleFrame:" + of$default, null, 1, null);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(1:11)(2:15|16))(2:17|18))(3:19|20|(2:22|23)(4:24|25|26|(3:28|29|(1:31))(2:32|33)))|12|13))|46|6|7|(0)(0)|12|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0047, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e8, code lost:
    
        r0.printStackTrace();
        r3 = kotlinx.coroutines.t0.getMain();
        r6 = new com.artillery.ctc.w.f(r19, r0, null);
        r4.f1285a = null;
        r4.f1288d = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fc, code lost:
    
        if (kotlinx.coroutines.g.withContext(r3, r6, r4) == r5) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fe, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Audio2TextBodyRaw audio2TextBodyRaw, f6.l lVar, kotlin.coroutines.c cVar) {
        d dVar;
        Object coroutine_suspended;
        int i8;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i9 = dVar.f1288d;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                dVar.f1288d = i9 - Integer.MIN_VALUE;
                Object obj = dVar.f1286b;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = dVar.f1288d;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    h.b bVar = com.artillery.ctc.h.f791d;
                    bVar.a().c();
                    OverseasConfigModel azureConfig = bVar.a().c().getAzureConfig();
                    if (azureConfig.isEmpty()) {
                        lVar.invoke("");
                        return y5.w.INSTANCE;
                    }
                    r4.b post$default = com.drake.net.a.post$default("https://swapi.yueqizhixiang.com/dmp/mvoice/pro_api", null, new g(azureConfig, this, audio2TextBodyRaw), 2, null);
                    NetConfig.INSTANCE.getRequestInterceptor();
                    r4.d.setKType(post$default.getOkHttpRequest(), kotlin.jvm.internal.u.typeOf(String.class));
                    Response execute = post$default.getOkHttpClient().newCall(post$default.buildRequest()).execute();
                    try {
                        try {
                            Object onConvert = r4.e.converter(execute.request()).onConvert(TypesJVMKt.getJavaType(kotlin.jvm.internal.u.typeOf(String.class)), execute);
                            if (onConvert != null) {
                                String str = (String) onConvert;
                                v1 main = t0.getMain();
                                e eVar = new e(lVar, str, null);
                                dVar.f1285a = lVar;
                                dVar.f1288d = 1;
                                if (kotlinx.coroutines.g.withContext(main, eVar, dVar) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                        } catch (NetException e8) {
                            throw e8;
                        }
                    } catch (CancellationException e9) {
                        throw e9;
                    } catch (Throwable th) {
                        throw new ConvertException(execute, "An unexpected error occurred in the converter", th, null, 8, null);
                    }
                } else if (i8 == 1) {
                    y5.g.throwOnFailure(obj);
                } else {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.g.throwOnFailure(obj);
                }
                return y5.w.INSTANCE;
            }
        }
        dVar = new d(cVar);
        Object obj2 = dVar.f1286b;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = dVar.f1288d;
        if (i8 != 0) {
        }
        return y5.w.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Text2AudioSilkyBody text2AudioSilkyBody, f6.l lVar, kotlin.coroutines.c cVar) {
        p pVar;
        Object coroutine_suspended;
        int i8;
        v1 main;
        s sVar;
        f6.l lVar2 = lVar;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i9 = pVar.f1317d;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                pVar.f1317d = i9 - Integer.MIN_VALUE;
                p pVar2 = pVar;
                Object obj = pVar2.f1315b;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = pVar2.f1317d;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    try {
                        if (text2AudioSilkyBody.text.length() == 0) {
                            v1 main2 = t0.getMain();
                            q qVar = new q(lVar2, null);
                            pVar2.f1314a = lVar2;
                            pVar2.f1317d = 1;
                            if (kotlinx.coroutines.g.withContext(main2, qVar, pVar2) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            OverseasConfigModel azureConfig = com.artillery.ctc.h.f791d.a().c().getAzureConfig();
                            if (azureConfig.isEmpty()) {
                                com.artillery.ctc.d.c("没有找到AzureConfig", "text2AudioOverseasHttp");
                                lVar2.invoke("");
                                return y5.w.INSTANCE;
                            }
                            CoroutineDispatcher io2 = t0.getIO();
                            r rVar = new r(azureConfig, text2AudioSilkyBody, this, lVar, null);
                            pVar2.f1314a = lVar2;
                            pVar2.f1317d = 2;
                            if (kotlinx.coroutines.g.withContext(io2, rVar, pVar2) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } catch (Exception e8) {
                        e = e8;
                        e.printStackTrace();
                        main = t0.getMain();
                        sVar = new s(e, lVar2, null);
                        pVar2.f1314a = null;
                        pVar2.f1317d = 3;
                        if (kotlinx.coroutines.g.withContext(main, sVar, pVar2) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return y5.w.INSTANCE;
                    }
                } else if (i8 == 1 || i8 == 2) {
                    f6.l lVar3 = (f6.l) pVar2.f1314a;
                    try {
                        y5.g.throwOnFailure(obj);
                    } catch (Exception e9) {
                        e = e9;
                        lVar2 = lVar3;
                        e.printStackTrace();
                        main = t0.getMain();
                        sVar = new s(e, lVar2, null);
                        pVar2.f1314a = null;
                        pVar2.f1317d = 3;
                        if (kotlinx.coroutines.g.withContext(main, sVar, pVar2) == coroutine_suspended) {
                        }
                        return y5.w.INSTANCE;
                    }
                } else {
                    if (i8 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.g.throwOnFailure(obj);
                }
                return y5.w.INSTANCE;
            }
        }
        pVar = new p(cVar);
        p pVar22 = pVar;
        Object obj2 = pVar22.f1315b;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = pVar22.f1317d;
        if (i8 != 0) {
        }
        return y5.w.INSTANCE;
    }

    public final void a(String language, f6.l onResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(language, "language");
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        if (f()) {
            onResult.invoke("");
        } else if (g()) {
            onResult.invoke("");
        }
    }

    public final void a(byte[] bytes, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(bytes, "bytes");
        if (f() || g()) {
            return;
        }
        BufferedOutputStream bufferedOutputStream = this.f1278h;
        if (bufferedOutputStream != null) {
            bufferedOutputStream.write(bytes);
        }
        BufferedOutputStream bufferedOutputStream2 = this.f1278h;
        if (bufferedOutputStream2 != null) {
            bufferedOutputStream2.flush();
        }
        if (z7) {
            j();
        }
    }

    public final void a(String language, String text, f6.l onResult) {
        l1 launch$default;
        kotlin.jvm.internal.s.checkNotNullParameter(language, "language");
        kotlin.jvm.internal.s.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        if (f()) {
            return;
        }
        if (g()) {
            com.artillery.ctc.d.c("configEmpty", "startText2Speech");
            onResult.invoke("");
            return;
        }
        com.artillery.ctc.d.c("language = " + language + ", text => " + text, "startText2Speech");
        launch$default = kotlinx.coroutines.i.launch$default(e(), t0.getIO().plus(new m(g0.Key, onResult)), null, new o(text, this, language, onResult, null), 2, null);
        launch$default.invokeOnCompletion(n.f1308a);
    }

    public final void a(Text2MusicBody body, f6.l black) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(black, "black");
        try {
            kotlinx.coroutines.i.launch$default(e(), t0.getIO(), null, new t(black, body, null), 2, null);
        } catch (Exception unused) {
            black.invoke("");
        }
    }

    public final void a(TranslateBody body, f6.l onSuccess) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        try {
            kotlinx.coroutines.i.launch$default(e(), t0.getIO(), null, new u(onSuccess, body, null), 2, null);
        } catch (Exception unused) {
            onSuccess.invoke("");
        }
    }

    public final String a(String str) {
        Language of = Language.Companion.of(str);
        String fullCode = of != null ? of.getFullCode() : null;
        if (fullCode == null) {
            fullCode = "";
        }
        return fullCode.length() == 0 ? str : fullCode;
    }
}
