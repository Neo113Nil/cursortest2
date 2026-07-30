package com.artillery.ctc;

import android.content.Context;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.artillery.ctc.base.AccountTokenResult;
import com.artillery.ctc.base.ChatBodyRequest;
import com.artillery.ctc.base.ChatRequestBody;
import com.artillery.ctc.base.KeyResult;
import com.artillery.ctc.h;
import com.artillery.ctc.uitls.ResourceUtils;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.drake.net.NetConfig;
import com.drake.net.exception.ConvertException;
import com.drake.net.exception.NetException;
import com.google.android.exoplayer2.C;
import com.google.gson.Gson;
import f6.l;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import kotlin.reflect.TypesJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.j0;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final b f774d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    public static final y5.f f775e;

    /* renamed from: a, reason: collision with root package name */
    public Context f776a;

    /* renamed from: b, reason: collision with root package name */
    public String f777b;

    /* renamed from: c, reason: collision with root package name */
    public final y5.f f778c;

    public static final class a extends Lambda implements f6.a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f779a = new a();

        public a() {
            super(0);
        }

        @Override // f6.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e invoke() {
            return new e(null);
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(o oVar) {
            this();
        }

        public final e a() {
            return b();
        }

        public final e b() {
            return (e) e.f775e.getValue();
        }
    }

    public static final class c extends Lambda implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f780a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ChatBodyRequest f781b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l lVar, ChatBodyRequest chatBodyRequest) {
            super(1);
            this.f780a = lVar;
            this.f781b = chatBodyRequest;
        }

        public final void a(String json) {
            String obj;
            String replace$default;
            kotlin.jvm.internal.s.checkNotNullParameter(json, "json");
            if (kotlin.text.t.startsWith$default(json, "data:", false, 2, null)) {
                replace$default = kotlin.text.t.replace$default(json, "data:", "", false, 4, (Object) null);
                obj = StringsKt__StringsKt.trim((CharSequence) replace$default).toString();
            } else {
                obj = StringsKt__StringsKt.trim((CharSequence) json).toString();
            }
            com.artillery.ctc.d.a("chatWithBodyV2A->结果:" + obj, null, 1, null);
            if (obj.length() <= 0) {
                this.f780a.invoke(obj);
                return;
            }
            try {
                l lVar = this.f780a;
                JSONObject jSONObject = new JSONObject(obj);
                String str = this.f781b.qid;
                if (str == null) {
                    str = "";
                }
                jSONObject.put(MapBundleKey.MapObjKey.OBJ_QID, str);
                String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.s.checkNotNullExpressionValue(jSONObject2, "JSONObject(tempJson).app…             }.toString()");
                lVar.invoke(jSONObject2);
            } catch (Exception e8) {
                e8.printStackTrace();
                this.f780a.invoke(obj);
            }
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class d extends Lambda implements f6.a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f782a = new d();

        public d() {
            super(0);
        }

        @Override // f6.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i0 invoke() {
            return j0.MainScope();
        }
    }

    /* renamed from: com.artillery.ctc.e$e, reason: collision with other inner class name */
    public static final class C0016e extends Lambda implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f783a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ChatRequestBody f784b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0016e(l lVar, ChatRequestBody chatRequestBody) {
            super(1);
            this.f783a = lVar;
            this.f784b = chatRequestBody;
        }

        public final void a(String json) {
            String obj;
            String replace$default;
            kotlin.jvm.internal.s.checkNotNullParameter(json, "json");
            if (kotlin.text.t.startsWith$default(json, "data:", false, 2, null)) {
                replace$default = kotlin.text.t.replace$default(json, "data:", "", false, 4, (Object) null);
                obj = StringsKt__StringsKt.trim((CharSequence) replace$default).toString();
            } else {
                obj = StringsKt__StringsKt.trim((CharSequence) json).toString();
            }
            com.artillery.ctc.d.a("postChatA->结果:" + obj, null, 1, null);
            if (obj.length() > 0) {
                try {
                    l lVar = this.f783a;
                    JSONObject jSONObject = new JSONObject(obj);
                    String str = this.f784b.qid;
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put(MapBundleKey.MapObjKey.OBJ_QID, str);
                    String jSONObject2 = jSONObject.toString();
                    kotlin.jvm.internal.s.checkNotNullExpressionValue(jSONObject2, "JSONObject(tempJson).app…             }.toString()");
                    lVar.invoke(jSONObject2);
                } catch (Exception e8) {
                    e8.printStackTrace();
                    this.f783a.invoke(obj);
                }
            }
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class f extends Lambda implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final f f785a = new f();

        public f() {
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

    static {
        y5.f lazy;
        lazy = kotlin.b.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (f6.a) a.f779a);
        f775e = lazy;
    }

    public /* synthetic */ e(o oVar) {
        this();
    }

    public final KeyResult b() {
        KeyResult copy;
        if (!d()) {
            return h.f791d.a().c();
        }
        AccountTokenResult e8 = e();
        h.b bVar = h.f791d;
        copy = r1.copy((r53 & 1) != 0 ? r1.deviceId : null, (r53 & 2) != 0 ? r1.appKey : null, (r53 & 4) != 0 ? r1.secretKey : null, (r53 & 8) != 0 ? r1.appid : null, (r53 & 16) != 0 ? r1.clientId : null, (r53 & 32) != 0 ? r1.clientSecret : null, (r53 & 64) != 0 ? r1.ttsAppId : null, (r53 & 128) != 0 ? r1.ttsAppKey : null, (r53 & 256) != 0 ? r1.ttsAppSecret : null, (r53 & 512) != 0 ? r1.deviceUnique : null, (r53 & 1024) != 0 ? r1.aiClientId : null, (r53 & 2048) != 0 ? r1.aiClientSecret : null, (r53 & 4096) != 0 ? r1.oversea : 0, (r53 & 8192) != 0 ? r1.overSeaAk : null, (r53 & 16384) != 0 ? r1.accountResult : null, (r53 & 32768) != 0 ? r1.accountAiResult : e8, (r53 & 65536) != 0 ? r1.supportLangure : null, (r53 & 131072) != 0 ? r1.ttsConfig : null, (r53 & 262144) != 0 ? r1.mac : null, (r53 & 524288) != 0 ? r1.channel : null, (r53 & 1048576) != 0 ? r1.overseasConfig : null, (r53 & 2097152) != 0 ? r1.ak : null, (r53 & 4194304) != 0 ? r1.functionType : null, (r53 & 8388608) != 0 ? r1.typeList : null, (r53 & 16777216) != 0 ? r1.xfAsrAppId : null, (r53 & 33554432) != 0 ? r1.xfAsrAPISecret : null, (r53 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? r1.xfAsrAPIKey : null, (r53 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r1.xfTtsAppId : null, (r53 & 268435456) != 0 ? r1.xfTtsAPISecret : null, (r53 & 536870912) != 0 ? r1.xfTtsAPIKey : null, (r53 & 1073741824) != 0 ? r1.xfVoiceName : null, (r53 & Integer.MIN_VALUE) != 0 ? r1.xfVoiceNameList : null, (r54 & 1) != 0 ? r1.wsExpriceTime : null, (r54 & 2) != 0 ? r1.xfAsrStdAppId : null, (r54 & 4) != 0 ? bVar.a().c().xfAsrStdAPIKey : null);
        bVar.a().a(copy);
        return copy;
    }

    public final String c() {
        if (this.f777b.length() == 0) {
            String readAssets2String = ResourceUtils.readAssets2String("events.json");
            kotlin.jvm.internal.s.checkNotNullExpressionValue(readAssets2String, "readAssets2String(\"events.json\")");
            this.f777b = readAssets2String;
        }
        return this.f777b;
    }

    public final boolean d() {
        return System.currentTimeMillis() >= h.f791d.a().c().getAccountAiResult().getExpires_time();
    }

    public final AccountTokenResult e() {
        AccountTokenResult copy;
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("https://openapi.baidu.com/oauth/2.0/token?grant_type=client_credentials&client_id=");
        h.b bVar = h.f791d;
        sb.append(bVar.a().c().getClientId());
        sb.append("&client_secret=");
        sb.append(bVar.a().c().getClientSecret());
        r4.b post$default = com.drake.net.a.post$default(sb.toString(), null, f.f785a, 2, null);
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

    public e() {
        y5.f lazy;
        this.f777b = "";
        lazy = kotlin.b.lazy(LazyThreadSafetyMode.NONE, (f6.a) d.f782a);
        this.f778c = lazy;
    }

    public final void a(Context context) {
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        this.f776a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067 A[Catch: Exception -> 0x003a, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x003a, blocks: (B:3:0x0016, B:5:0x0035, B:9:0x004e, B:12:0x0067, B:16:0x00ac, B:18:0x00b2, B:21:0x00ca, B:23:0x00dc, B:35:0x00d5, B:36:0x00d8, B:47:0x00ed, B:48:0x00f9, B:41:0x00fa, B:44:0x00fb, B:49:0x00fc, B:54:0x0144, B:56:0x014c, B:57:0x016b, B:59:0x0163, B:70:0x018a, B:71:0x0198, B:64:0x0199, B:67:0x019a, B:72:0x003d, B:74:0x0041, B:76:0x0045, B:20:0x00b6, B:31:0x00d2, B:51:0x0129, B:14:0x0094), top: B:2:0x0016, inners: #0, #2, #7, #8, #9, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc A[Catch: Exception -> 0x003a, TRY_LEAVE, TryCatch #5 {Exception -> 0x003a, blocks: (B:3:0x0016, B:5:0x0035, B:9:0x004e, B:12:0x0067, B:16:0x00ac, B:18:0x00b2, B:21:0x00ca, B:23:0x00dc, B:35:0x00d5, B:36:0x00d8, B:47:0x00ed, B:48:0x00f9, B:41:0x00fa, B:44:0x00fb, B:49:0x00fc, B:54:0x0144, B:56:0x014c, B:57:0x016b, B:59:0x0163, B:70:0x018a, B:71:0x0198, B:64:0x0199, B:67:0x019a, B:72:0x003d, B:74:0x0041, B:76:0x0045, B:20:0x00b6, B:31:0x00d2, B:51:0x0129, B:14:0x0094), top: B:2:0x0016, inners: #0, #2, #7, #8, #9, #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ChatRequestBody body, l onSuccess) {
        ChatRequestBody.Data data;
        boolean z7;
        Boolean bool;
        String obj;
        String replace$default;
        y5.w wVar;
        ResponseBody body2;
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        try {
            com.artillery.ctc.d.a("postChat->参数:" + y.g.a(body), null, 1, null);
            data = body.data;
        } catch (Exception e8) {
            e8.printStackTrace();
            onSuccess.invoke("");
        }
        if (data != null) {
            if (!data.stream) {
            }
            z7 = true;
            com.artillery.ctc.d.a("GPT body isSteam = " + z7, null, 1, null);
            if (z7) {
                r4.b post$default = com.drake.net.a.post$default("https://duer-kids.baidu.com/botwatch/api/operation/aigc/stream/dcschat", null, new com.artillery.ctc.f(b(), body, this), 2, null);
                NetConfig.INSTANCE.getRequestInterceptor();
                r4.d.setKType(post$default.getOkHttpRequest(), kotlin.jvm.internal.u.nullableTypeOf(Response.class));
                Response execute = post$default.getOkHttpClient().newCall(post$default.buildRequest()).execute();
                try {
                    try {
                        Response response = (Response) r4.e.converter(execute.request()).onConvert(TypesJVMKt.getJavaType(kotlin.jvm.internal.u.nullableTypeOf(Response.class)), execute);
                        if (response == null || (body2 = response.body()) == null) {
                            wVar = null;
                        } else {
                            InputStream byteStream = body2.byteStream();
                            try {
                                TextStreamsKt.forEachLine(new BufferedReader(new InputStreamReader(byteStream)), new C0016e(onSuccess, body));
                                y5.w wVar2 = y5.w.INSTANCE;
                                kotlin.io.b.closeFinally(byteStream, null);
                                wVar = y5.w.INSTANCE;
                            } finally {
                            }
                        }
                        if (wVar == null) {
                            com.artillery.ctc.d.a("GPT body is NULL", null, 1, null);
                            onSuccess.invoke("");
                            return;
                        }
                        return;
                    } catch (NetException e9) {
                        throw e9;
                    }
                } catch (CancellationException e10) {
                    throw e10;
                } catch (Throwable th) {
                    throw new ConvertException(execute, "An unexpected error occurred in the converter", th, null, 8, null);
                }
            }
            r4.b post$default2 = com.drake.net.a.post$default("https://duer-kids.baidu.com/botwatch/api/operation/aigc/stream/dcschat", null, new com.artillery.ctc.f(b(), body, this), 2, null);
            NetConfig.INSTANCE.getRequestInterceptor();
            r4.d.setKType(post$default2.getOkHttpRequest(), kotlin.jvm.internal.u.nullableTypeOf(String.class));
            Response execute2 = post$default2.getOkHttpClient().newCall(post$default2.buildRequest()).execute();
            try {
                try {
                    String str = (String) r4.e.converter(execute2.request()).onConvert(TypesJVMKt.getJavaType(kotlin.jvm.internal.u.nullableTypeOf(String.class)), execute2);
                    String str2 = str == null ? "" : str;
                    if (!kotlin.text.t.startsWith$default(str2, "data:", false, 2, null)) {
                        obj = StringsKt__StringsKt.trim((CharSequence) str2).toString();
                    } else {
                        replace$default = kotlin.text.t.replace$default(str2, "data:", "", false, 4, (Object) null);
                        obj = StringsKt__StringsKt.trim((CharSequence) replace$default).toString();
                    }
                    com.artillery.ctc.d.a("postChatB->结果:" + obj, null, 1, null);
                    onSuccess.invoke(obj);
                    return;
                } catch (NetException e11) {
                    throw e11;
                }
            } catch (CancellationException e12) {
                throw e12;
            } catch (Throwable th2) {
                throw new ConvertException(execute2, "An unexpected error occurred in the converter", th2, null, 8, null);
            }
            e8.printStackTrace();
            onSuccess.invoke("");
        }
        ChatRequestBody.Oversea oversea = body.oversea;
        if (oversea == null || (bool = oversea.stream) == null || !bool.booleanValue()) {
            z7 = false;
            com.artillery.ctc.d.a("GPT body isSteam = " + z7, null, 1, null);
            if (z7) {
            }
            e8.printStackTrace();
            onSuccess.invoke("");
        }
        z7 = true;
        com.artillery.ctc.d.a("GPT body isSteam = " + z7, null, 1, null);
        if (z7) {
        }
        e8.printStackTrace();
        onSuccess.invoke("");
    }

    public final void a(ChatBodyRequest body, l onSuccess) {
        Response execute;
        String obj;
        String replace$default;
        String str;
        Object obj2;
        int i8;
        o oVar;
        y5.w wVar;
        ResponseBody body2;
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        try {
            com.artillery.ctc.d.a("chatWithBodyV2->参数:" + new Gson().toJson(body), null, 1, null);
            if (kotlin.jvm.internal.s.areEqual(body.stream, Boolean.TRUE)) {
                r4.b post$default = com.drake.net.a.post$default("https://swapi.yueqizhixiang.com/llm/gpt", null, new g(b(), body), 2, null);
                NetConfig.INSTANCE.getRequestInterceptor();
                r4.d.setKType(post$default.getOkHttpRequest(), kotlin.jvm.internal.u.nullableTypeOf(Response.class));
                execute = post$default.getOkHttpClient().newCall(post$default.buildRequest()).execute();
                try {
                    try {
                        Response response = (Response) r4.e.converter(execute.request()).onConvert(TypesJVMKt.getJavaType(kotlin.jvm.internal.u.nullableTypeOf(Response.class)), execute);
                        if (response == null || (body2 = response.body()) == null) {
                            wVar = null;
                        } else {
                            InputStream byteStream = body2.byteStream();
                            try {
                                TextStreamsKt.forEachLine(new BufferedReader(new InputStreamReader(byteStream)), new c(onSuccess, body));
                                y5.w wVar2 = y5.w.INSTANCE;
                                kotlin.io.b.closeFinally(byteStream, null);
                                wVar = y5.w.INSTANCE;
                            } finally {
                            }
                        }
                        if (wVar == null) {
                            com.artillery.ctc.d.a("GPT body is NULL", null, 1, null);
                            onSuccess.invoke("");
                            return;
                        }
                        return;
                    } catch (CancellationException e8) {
                        throw e8;
                    }
                } catch (NetException e9) {
                    throw e9;
                } catch (Throwable th) {
                    throw new ConvertException(execute, str, th, obj2, i8, oVar);
                }
            }
            r4.b post$default2 = com.drake.net.a.post$default("https://swapi.yueqizhixiang.com/llm/gpt", null, new g(b(), body), 2, null);
            NetConfig.INSTANCE.getRequestInterceptor();
            r4.d.setKType(post$default2.getOkHttpRequest(), kotlin.jvm.internal.u.nullableTypeOf(String.class));
            execute = post$default2.getOkHttpClient().newCall(post$default2.buildRequest()).execute();
            try {
                try {
                    String str2 = (String) r4.e.converter(execute.request()).onConvert(TypesJVMKt.getJavaType(kotlin.jvm.internal.u.nullableTypeOf(String.class)), execute);
                    String str3 = str2 == null ? "" : str2;
                    if (!kotlin.text.t.startsWith$default(str3, "data:", false, 2, null)) {
                        obj = StringsKt__StringsKt.trim((CharSequence) str3).toString();
                    } else {
                        replace$default = kotlin.text.t.replace$default(str3, "data:", "", false, 4, (Object) null);
                        obj = StringsKt__StringsKt.trim((CharSequence) replace$default).toString();
                    }
                    com.artillery.ctc.d.a("chatWithBodyV2B->结果:" + obj, null, 1, null);
                    onSuccess.invoke(obj);
                    return;
                } finally {
                    ConvertException convertException = new ConvertException(execute, "An unexpected error occurred in the converter", th, null, 8, null);
                }
            } catch (NetException e10) {
                throw e10;
            } catch (CancellationException e11) {
                throw e11;
            }
        } catch (Exception e12) {
            e12.printStackTrace();
            com.artillery.ctc.d.a("chatWithBodyV2C->catch " + e12.getMessage(), null, 1, null);
            onSuccess.invoke("");
        }
        e12.printStackTrace();
        com.artillery.ctc.d.a("chatWithBodyV2C->catch " + e12.getMessage(), null, 1, null);
        onSuccess.invoke("");
    }
}
