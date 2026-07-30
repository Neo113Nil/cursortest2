package com.artillery.ctc;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.artillery.ctc.base.AiGcBody;
import com.artillery.ctc.base.AnalysisModel;
import com.artillery.ctc.base.AsrModel;
import com.artillery.ctc.base.AsrSilkyModel;
import com.artillery.ctc.base.Audio2TextBody;
import com.artillery.ctc.base.Audio2TextBodyRaw;
import com.artillery.ctc.base.AzureConfigData;
import com.artillery.ctc.base.AzureConfigResult;
import com.artillery.ctc.base.BaseResult;
import com.artillery.ctc.base.ChatBodyRequest;
import com.artillery.ctc.base.ChatPictureRequestBody;
import com.artillery.ctc.base.ChatRequestBody;
import com.artillery.ctc.base.ChatResponseAnswer;
import com.artillery.ctc.base.ChatResponseResult;
import com.artillery.ctc.base.GPTInternalBody;
import com.artillery.ctc.base.HealthDataBody;
import com.artillery.ctc.base.HealthQABody;
import com.artillery.ctc.base.IflytekData;
import com.artillery.ctc.base.IflytekResponseData;
import com.artillery.ctc.base.IflytekResult;
import com.artillery.ctc.base.KeyResult;
import com.artillery.ctc.base.LanguageResult;
import com.artillery.ctc.base.LargeModel;
import com.artillery.ctc.base.NetChatBody;
import com.artillery.ctc.base.OverseasConfigModel;
import com.artillery.ctc.base.QueryBody;
import com.artillery.ctc.base.Result;
import com.artillery.ctc.base.SmartRecognizeAsrResult;
import com.artillery.ctc.base.StockQueryBody;
import com.artillery.ctc.base.Text2AudioBody;
import com.artillery.ctc.base.Text2AudioSilkyBody;
import com.artillery.ctc.base.Text2AudioSilkyConfig;
import com.artillery.ctc.base.Text2MusicBody;
import com.artillery.ctc.base.TranslateBody;
import com.artillery.ctc.base.TranslateModelResult;
import com.artillery.ctc.base.WrapResult;
import com.artillery.ctc.h;
import com.artillery.ctc.helper.resultUtils.Decoder;
import com.artillery.ctc.interfaces.IChatPictureCallback;
import com.artillery.ctc.interfaces.IResultCallback;
import com.artillery.ctc.interfaces.ISimpleCallback;
import com.artillery.ctc.uitls.Base64Utils;
import com.artillery.ctc.uitls.DeviceUtils;
import com.artillery.ctc.w;
import com.baidu.ar.util.SystemInfoUtil;
import com.drake.net.NetConfig;
import com.drake.net.exception.ConvertException;
import com.drake.net.exception.NetException;
import com.drake.net.internal.NetDeferred;
import com.drake.net.request.Method;
import com.google.android.exoplayer2.C;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.InputStream;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.TypesJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.o1;
import kotlinx.coroutines.v1;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: h, reason: collision with root package name */
    public static final a0 f797h = new a0(null);

    /* renamed from: i, reason: collision with root package name */
    public static final y5.f f798i;

    /* renamed from: a, reason: collision with root package name */
    public final y5.f f799a;

    /* renamed from: b, reason: collision with root package name */
    public Context f800b;

    /* renamed from: c, reason: collision with root package name */
    public z.a f801c;

    /* renamed from: d, reason: collision with root package name */
    public final y5.f f802d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f803e;

    /* renamed from: f, reason: collision with root package name */
    public final y5.f f804f;

    /* renamed from: g, reason: collision with root package name */
    public l1 f805g;

    public static final class a extends Lambda implements f6.a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f806a = new a();

        public a() {
            super(0);
        }

        @Override // f6.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i invoke() {
            return new i(null);
        }
    }

    public static final class a0 {
        public a0() {
        }

        public /* synthetic */ a0(kotlin.jvm.internal.o oVar) {
            this();
        }

        public final i a() {
            return b();
        }

        public final i b() {
            return (i) i.f798i.getValue();
        }
    }

    public static final class a1 extends Lambda implements f6.l {

        /* renamed from: a, reason: collision with root package name */
        public static final a1 f807a = new a1();

        public a1() {
            super(1);
        }

        public final void a(String it) {
            kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
            Log.d("burialPoint", "translateWithBodyOverseas: " + it);
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class b implements ISimpleCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f6.l f808a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f809b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GPTInternalBody f810c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f6.l f811d;

        public b(f6.l lVar, i iVar, GPTInternalBody gPTInternalBody, f6.l lVar2) {
            this.f808a = lVar;
            this.f809b = iVar;
            this.f810c = gPTInternalBody;
            this.f811d = lVar2;
        }

        @Override // com.artillery.ctc.interfaces.ISimpleCallback
        public void onSuccess(String json) {
            String str;
            kotlin.jvm.internal.s.checkNotNullParameter(json, "json");
            try {
                this.f808a.invoke(json);
                if (json.length() != 0 && json.length() > 0) {
                    String str2 = ((BaseResult) new Gson().fromJson(json, BaseResult.class)).type;
                    if (kotlin.text.t.equals("dcs", str2, true) || !kotlin.text.t.equals("response", str2, true)) {
                        return;
                    }
                    ChatResponseResult a8 = this.f809b.a(json);
                    if (a8.getEnded() == 1) {
                        ChatResponseAnswer data = a8.getData();
                        String str3 = "";
                        if (data != null) {
                            str = data.getAnswer();
                            if (str == null) {
                                str = "";
                            }
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            str3 = str;
                        }
                        com.artillery.ctc.m a9 = com.artillery.ctc.m.f1137l.a();
                        GPTInternalBody gPTInternalBody = this.f810c;
                        Text2AudioSilkyBody text2AudioSilkyBody = gPTInternalBody.tts;
                        Base64Utils.Companion companion = Base64Utils.Companion;
                        byte[] bytes = str3.getBytes(gPTInternalBody.asr.getTtsEncodingByLanguage());
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                        a9.a(Text2AudioSilkyBody.copy$default(text2AudioSilkyBody, companion.encodeToString(bytes), null, null, 6, null), this.f811d);
                    }
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    public static final class b0 implements ISimpleCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f6.l f812a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f813b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GPTInternalBody f814c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f6.l f815d;

        public static final class a extends SuspendLambda implements f6.p {

            /* renamed from: a, reason: collision with root package name */
            public int f816a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GPTInternalBody f817b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f818c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ i f819d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ f6.l f820e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(GPTInternalBody gPTInternalBody, String str, i iVar, f6.l lVar, kotlin.coroutines.c cVar) {
                super(2, cVar);
                this.f817b = gPTInternalBody;
                this.f818c = str;
                this.f819d = iVar;
                this.f820e = lVar;
            }

            @Override // f6.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
                return ((a) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                return new a(this.f817b, this.f818c, this.f819d, this.f820e, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                String optString;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                int i8 = this.f816a;
                if (i8 == 0) {
                    y5.g.throwOnFailure(obj);
                    ChatRequestBody.Oversea oversea = this.f817b.gptBody.oversea;
                    if (oversea == null || !kotlin.jvm.internal.s.areEqual(oversea.stream, kotlin.coroutines.jvm.internal.a.boxBoolean(true))) {
                        JSONObject optJSONObject = new JSONObject(this.f818c).optJSONObject("rows");
                        JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject("data") : null;
                        optString = optJSONObject2 != null ? optJSONObject2.optString("answer") : null;
                        String str = optString == null ? "" : optString;
                        if (str.length() > 0) {
                            com.artillery.ctc.w a8 = com.artillery.ctc.w.f1268j.a();
                            Text2AudioSilkyBody copy$default = Text2AudioSilkyBody.copy$default(this.f817b.tts, str, null, null, 6, null);
                            f6.l lVar = this.f820e;
                            this.f816a = 1;
                            if (a8.a(copy$default, lVar, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        JSONObject jSONObject = new JSONObject(this.f818c);
                        JSONArray optJSONArray = jSONObject.optJSONArray("choices");
                        if (optJSONArray == null) {
                            return y5.w.INSTANCE;
                        }
                        com.artillery.ctc.d.a("openAiChatOverseas => length => " + optJSONArray.length(), null, 1, null);
                        if (optJSONArray.length() <= 0) {
                            return y5.w.INSTANCE;
                        }
                        JSONObject optJSONObject3 = optJSONArray.optJSONObject(0);
                        String optString2 = jSONObject.optString("id");
                        if (optString2 == null) {
                            optString2 = "";
                        }
                        String optString3 = optJSONObject3.optString("finish_reason", "");
                        JSONObject optJSONObject4 = optJSONObject3.optJSONObject("delta");
                        String optString4 = optJSONObject4 != null ? optJSONObject4.optString(FirebaseAnalytics.Param.CONTENT) : null;
                        if (optString4 == null) {
                            optString4 = "";
                        }
                        String a9 = this.f819d.a(optString2, optString4);
                        com.artillery.ctc.d.a("finish_reason => " + optString3 + ", result => " + a9, null, 1, null);
                        if (kotlin.text.t.equals("stop", optString3, true)) {
                            com.artillery.ctc.w a10 = com.artillery.ctc.w.f1268j.a();
                            Text2AudioSilkyConfig text2AudioSilkyConfig = this.f817b.tts.config;
                            optString = text2AudioSilkyConfig != null ? text2AudioSilkyConfig.language : null;
                            a10.a(optString != null ? optString : "", a9, this.f820e);
                        }
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

        public b0(f6.l lVar, i iVar, GPTInternalBody gPTInternalBody, f6.l lVar2) {
            this.f812a = lVar;
            this.f813b = iVar;
            this.f814c = gPTInternalBody;
            this.f815d = lVar2;
        }

        @Override // com.artillery.ctc.interfaces.ISimpleCallback
        public void onSuccess(String json) {
            kotlin.jvm.internal.s.checkNotNullParameter(json, "json");
            try {
                this.f812a.invoke(json);
                if (json.length() == 0) {
                    return;
                }
                com.artillery.ctc.d.a("openAiChatOverseas => json => " + json, null, 1, null);
                kotlinx.coroutines.i.launch$default(this.f813b.d(), null, null, new a(this.f814c, json, this.f813b, this.f815d, null), 3, null);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    public static final class b1 extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f821a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ QueryBody f822b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f6.l f823c;

        public static final class a extends SuspendLambda implements f6.p {

            /* renamed from: a, reason: collision with root package name */
            public int f824a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f6.l f825b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f826c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f6.l lVar, String str, kotlin.coroutines.c cVar) {
                super(2, cVar);
                this.f825b = lVar;
                this.f826c = str;
            }

            @Override // f6.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
                return ((a) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                return new a(this.f825b, this.f826c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                if (this.f824a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
                this.f825b.invoke(this.f826c);
                return y5.w.INSTANCE;
            }
        }

        public static final class b extends SuspendLambda implements f6.p {

            /* renamed from: a, reason: collision with root package name */
            public int f827a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f6.l f828b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(f6.l lVar, kotlin.coroutines.c cVar) {
                super(2, cVar);
                this.f828b = lVar;
            }

            @Override // f6.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
                return ((b) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                return new b(this.f828b, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                if (this.f827a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
                this.f828b.invoke("");
                return y5.w.INSTANCE;
            }
        }

        public static final class c extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ QueryBody f829a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(QueryBody queryBody) {
                super(1);
                this.f829a = queryBody;
            }

            public final void a(r4.b post) {
                kotlin.jvm.internal.s.checkNotNullParameter(post, "$this$post");
                String json = new Gson().toJson(this.f829a);
                kotlin.jvm.internal.s.checkNotNullExpressionValue(json, "Gson().toJson(body)");
                post.json(com.artillery.ctc.d.a(json));
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((r4.b) obj);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b1(QueryBody queryBody, f6.l lVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f822b = queryBody;
            this.f823c = lVar;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
            return ((b1) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new b1(this.f822b, this.f823c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f821a;
            try {
                if (i8 == 0) {
                    y5.g.throwOnFailure(obj);
                    r4.b post$default = com.drake.net.a.post$default("/thrid/app/knowledgeable", null, new c(this.f822b), 2, null);
                    NetConfig.INSTANCE.getRequestInterceptor();
                    r4.d.setKType(post$default.getOkHttpRequest(), kotlin.jvm.internal.u.typeOf(String.class));
                    Response execute = post$default.getOkHttpClient().newCall(post$default.buildRequest()).execute();
                    try {
                        Object onConvert = r4.e.converter(execute.request()).onConvert(TypesJVMKt.getJavaType(kotlin.jvm.internal.u.typeOf(String.class)), execute);
                        if (onConvert == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        String str = (String) onConvert;
                        v1 main = kotlinx.coroutines.t0.getMain();
                        a aVar = new a(this.f823c, str, null);
                        this.f821a = 1;
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
                } else if (i8 == 1) {
                    y5.g.throwOnFailure(obj);
                } else {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.g.throwOnFailure(obj);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                v1 main2 = kotlinx.coroutines.t0.getMain();
                b bVar = new b(this.f823c, null);
                this.f821a = 2;
                if (kotlinx.coroutines.g.withContext(main2, bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return y5.w.INSTANCE;
        }
    }

    public static final class c extends Lambda implements f6.l {

        /* renamed from: a, reason: collision with root package name */
        public static final c f830a = new c();

        public c() {
            super(1);
        }

        public final void a(String it) {
            kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
            Log.d("burialPoint", "aiImageWithBody: " + it);
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class c0 extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f831a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StockQueryBody f832b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f6.l f833c;

        public static final class a extends SuspendLambda implements f6.p {

            /* renamed from: a, reason: collision with root package name */
            public int f834a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f6.l f835b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f836c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f6.l lVar, String str, kotlin.coroutines.c cVar) {
                super(2, cVar);
                this.f835b = lVar;
                this.f836c = str;
            }

            @Override // f6.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
                return ((a) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                return new a(this.f835b, this.f836c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                if (this.f834a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
                f6.l lVar = this.f835b;
                String str = this.f836c;
                if (str == null) {
                    str = "";
                }
                lVar.invoke(str);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(StockQueryBody stockQueryBody, f6.l lVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f832b = stockQueryBody;
            this.f833c = lVar;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
            return ((c0) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new c0(this.f832b, this.f833c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f831a;
            if (i8 == 0) {
                y5.g.throwOnFailure(obj);
                String a8 = com.artillery.ctc.a0.f675a.a().a(this.f832b);
                v1 main = kotlinx.coroutines.t0.getMain();
                a aVar = new a(this.f833c, a8, null);
                this.f831a = 1;
                if (kotlinx.coroutines.g.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
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

    public static final class d extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f837a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ChatPictureRequestBody f838b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ IChatPictureCallback f839c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f840d;

        public /* synthetic */ class a extends FunctionReferenceImpl implements f6.p {
            public a(Object obj) {
                super(2, obj, IChatPictureCallback.class, "onFail", "onFail(ILjava/lang/String;)V", 0);
            }

            public final void a(int i8, String p12) {
                kotlin.jvm.internal.s.checkNotNullParameter(p12, "p1");
                ((IChatPictureCallback) this.receiver).onFail(i8, p12);
            }

            @Override // f6.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a(((Number) obj).intValue(), (String) obj2);
                return y5.w.INSTANCE;
            }
        }

        public /* synthetic */ class b extends FunctionReferenceImpl implements f6.l {
            public b(Object obj) {
                super(1, obj, IChatPictureCallback.class, "onSuccess", "onSuccess(Ljava/util/List;)V", 0);
            }

            public final void a(List p02) {
                kotlin.jvm.internal.s.checkNotNullParameter(p02, "p0");
                ((IChatPictureCallback) this.receiver).onSuccess(p02);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((List) obj);
                return y5.w.INSTANCE;
            }
        }

        public static final class c extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public static final c f841a = new c();

            public c() {
                super(1);
            }

            public final void a(String it) {
                kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
                Log.d("burialPoint", "aiImageWithBodyOverseas: " + it);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((String) obj);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ChatPictureRequestBody chatPictureRequestBody, IChatPictureCallback iChatPictureCallback, i iVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f838b = chatPictureRequestBody;
            this.f839c = iChatPictureCallback;
            this.f840d = iVar;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
            return ((d) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new d(this.f838b, this.f839c, this.f840d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            List mutableListOf;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f837a;
            if (i8 == 0) {
                y5.g.throwOnFailure(obj);
                com.artillery.ctc.s a8 = com.artillery.ctc.s.f1177a.a();
                ChatPictureRequestBody chatPictureRequestBody = this.f838b;
                a aVar = new a(this.f839c);
                b bVar = new b(this.f839c);
                this.f837a = 1;
                if (a8.a(chatPictureRequestBody, aVar, bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
            }
            try {
                i iVar = this.f840d;
                mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(com.artillery.ctc.d.b("aiImageWithBodyOverseas", this.f838b.tid));
                iVar.a(mutableListOf, c.f841a);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            return y5.w.INSTANCE;
        }
    }

    public static final class d0 extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f842a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StockQueryBody f843b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f6.l f844c;

        public static final class a extends SuspendLambda implements f6.p {

            /* renamed from: a, reason: collision with root package name */
            public int f845a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f6.l f846b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f847c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f6.l lVar, String str, kotlin.coroutines.c cVar) {
                super(2, cVar);
                this.f846b = lVar;
                this.f847c = str;
            }

            @Override // f6.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
                return ((a) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                return new a(this.f846b, this.f847c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                if (this.f845a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
                f6.l lVar = this.f846b;
                String str = this.f847c;
                if (str == null) {
                    str = "";
                }
                lVar.invoke(str);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(StockQueryBody stockQueryBody, f6.l lVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f843b = stockQueryBody;
            this.f844c = lVar;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
            return ((d0) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new d0(this.f843b, this.f844c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f842a;
            if (i8 == 0) {
                y5.g.throwOnFailure(obj);
                String b8 = com.artillery.ctc.a0.f675a.a().b(this.f843b);
                v1 main = kotlinx.coroutines.t0.getMain();
                a aVar = new a(this.f844c, b8, null);
                this.f842a = 1;
                if (kotlinx.coroutines.g.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
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

    public static final class e extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f848a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ChatPictureRequestBody f849b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ IChatPictureCallback f850c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f851d;

        public /* synthetic */ class a extends FunctionReferenceImpl implements f6.p {
            public a(Object obj) {
                super(2, obj, IChatPictureCallback.class, "onFail", "onFail(ILjava/lang/String;)V", 0);
            }

            public final void a(int i8, String p12) {
                kotlin.jvm.internal.s.checkNotNullParameter(p12, "p1");
                ((IChatPictureCallback) this.receiver).onFail(i8, p12);
            }

            @Override // f6.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a(((Number) obj).intValue(), (String) obj2);
                return y5.w.INSTANCE;
            }
        }

        public /* synthetic */ class b extends FunctionReferenceImpl implements f6.l {
            public b(Object obj) {
                super(1, obj, IChatPictureCallback.class, "onSuccess", "onSuccess(Ljava/util/List;)V", 0);
            }

            public final void a(List p02) {
                kotlin.jvm.internal.s.checkNotNullParameter(p02, "p0");
                ((IChatPictureCallback) this.receiver).onSuccess(p02);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((List) obj);
                return y5.w.INSTANCE;
            }
        }

        public static final class c extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public static final c f852a = new c();

            public c() {
                super(1);
            }

            public final void a(String it) {
                kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
                Log.d("burialPoint", "aiImageWithBodyOverseas: " + it);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((String) obj);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ChatPictureRequestBody chatPictureRequestBody, IChatPictureCallback iChatPictureCallback, i iVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f849b = chatPictureRequestBody;
            this.f850c = iChatPictureCallback;
            this.f851d = iVar;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
            return ((e) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new e(this.f849b, this.f850c, this.f851d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            List mutableListOf;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f848a;
            if (i8 == 0) {
                y5.g.throwOnFailure(obj);
                com.artillery.ctc.s a8 = com.artillery.ctc.s.f1177a.a();
                ChatPictureRequestBody chatPictureRequestBody = this.f849b;
                a aVar = new a(this.f850c);
                b bVar = new b(this.f850c);
                this.f848a = 1;
                if (a8.b(chatPictureRequestBody, aVar, bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
            }
            try {
                i iVar = this.f851d;
                mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(com.artillery.ctc.d.b("aiImageWithBodyOverseas", this.f849b.tid));
                iVar.a(mutableListOf, c.f852a);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            return y5.w.INSTANCE;
        }
    }

    public static final class e0 extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f853a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StockQueryBody f854b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f6.l f855c;

        public static final class a extends SuspendLambda implements f6.p {

            /* renamed from: a, reason: collision with root package name */
            public int f856a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f6.l f857b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f858c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f6.l lVar, String str, kotlin.coroutines.c cVar) {
                super(2, cVar);
                this.f857b = lVar;
                this.f858c = str;
            }

            @Override // f6.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
                return ((a) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                return new a(this.f857b, this.f858c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                if (this.f856a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
                f6.l lVar = this.f857b;
                String str = this.f858c;
                if (str == null) {
                    str = "";
                }
                lVar.invoke(str);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(StockQueryBody stockQueryBody, f6.l lVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f854b = stockQueryBody;
            this.f855c = lVar;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
            return ((e0) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new e0(this.f854b, this.f855c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f853a;
            if (i8 == 0) {
                y5.g.throwOnFailure(obj);
                String c8 = com.artillery.ctc.a0.f675a.a().c(this.f854b);
                v1 main = kotlinx.coroutines.t0.getMain();
                a aVar = new a(this.f855c, c8, null);
                this.f853a = 1;
                if (kotlinx.coroutines.g.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
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

    public static final class f extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f859a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f860b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f6.l f861c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f862d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f863e;

        public static final class a extends SuspendLambda implements f6.p {

            /* renamed from: a, reason: collision with root package name */
            public int f864a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f6.l f865b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f866c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f6.l lVar, String str, kotlin.coroutines.c cVar) {
                super(2, cVar);
                this.f865b = lVar;
                this.f866c = str;
            }

            @Override // f6.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
                return ((a) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                return new a(this.f865b, this.f866c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                if (this.f864a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
                this.f865b.invoke(this.f866c);
                return y5.w.INSTANCE;
            }
        }

        public static final class b extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f867a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f868b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i8, String str) {
                super(1);
                this.f867a = i8;
                this.f868b = str;
            }

            public final void a(r4.f get) {
                kotlin.jvm.internal.s.checkNotNullParameter(get, "$this$get");
                get.addQuery("v", Integer.valueOf(this.f867a));
                r4.a.addQuery$default(get, TypedValues.TransitionType.S_TO, this.f868b, false, 4, null);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((r4.f) obj);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(f6.l lVar, String str, int i8, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f861c = lVar;
            this.f862d = str;
            this.f863e = i8;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
            return ((f) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            f fVar = new f(this.f861c, this.f862d, this.f863e, cVar);
            fVar.f860b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            boolean contains$default;
            String str;
            boolean contains$default2;
            boolean contains$default3;
            List split$default;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f859a;
            try {
                if (i8 == 0) {
                    y5.g.throwOnFailure(obj);
                    String str2 = this.f862d;
                    if (str2 != null) {
                        Locale locale = Locale.ROOT;
                        String lowerCase = str2.toLowerCase(locale);
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        String lowerCase2 = "zh-HK".toLowerCase(locale);
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        contains$default = StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) lowerCase2, false, 2, (Object) null);
                        if (!contains$default) {
                            String lowerCase3 = "zh-TW".toLowerCase(locale);
                            kotlin.jvm.internal.s.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                            contains$default2 = StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) lowerCase3, false, 2, (Object) null);
                            if (!contains$default2) {
                                contains$default3 = StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) "-", false, 2, (Object) null);
                                if (contains$default3) {
                                    split$default = StringsKt__StringsKt.split$default((CharSequence) str2, new String[]{"-"}, false, 0, 6, (Object) null);
                                    str = (String) CollectionsKt___CollectionsKt.first(split$default);
                                    str2 = str;
                                }
                            }
                        }
                        str = "cht";
                        str2 = str;
                    }
                    r4.f fVar = com.drake.net.a.get$default("https://swapi.yueqizhixiang.com/llm/aigcStyles", null, new b(this.f863e, str2), 2, null);
                    NetConfig.INSTANCE.getRequestInterceptor();
                    r4.d.setKType(fVar.getOkHttpRequest(), kotlin.jvm.internal.u.typeOf(String.class));
                    Response execute = fVar.getOkHttpClient().newCall(fVar.buildRequest()).execute();
                    try {
                        try {
                            Object onConvert = r4.e.converter(execute.request()).onConvert(TypesJVMKt.getJavaType(kotlin.jvm.internal.u.typeOf(String.class)), execute);
                            if (onConvert == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            String str3 = (String) onConvert;
                            CoroutineDispatcher io2 = kotlinx.coroutines.t0.getIO();
                            a aVar = new a(this.f861c, str3, null);
                            this.f859a = 1;
                            if (kotlinx.coroutines.g.withContext(io2, aVar, this) == coroutine_suspended) {
                                return coroutine_suspended;
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
            } catch (Exception e10) {
                e10.printStackTrace();
                f6.l lVar = this.f861c;
                String message = e10.getMessage();
                if (message == null) {
                    message = "";
                }
                lVar.invoke(message);
            }
            return y5.w.INSTANCE;
        }
    }

    public static final class f0 implements ISimpleCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SmartRecognizeAsrResult f869a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f6.l f870b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f871c;

        public f0(SmartRecognizeAsrResult smartRecognizeAsrResult, f6.l lVar, String str) {
            this.f869a = smartRecognizeAsrResult;
            this.f870b = lVar;
            this.f871c = str;
        }

        @Override // com.artillery.ctc.interfaces.ISimpleCallback
        public void onSuccess(String data) {
            kotlin.jvm.internal.s.checkNotNullParameter(data, "data");
            com.artillery.ctc.d.a("sourceText = " + this.f869a.getText() + ",data = " + data + ", index = " + this.f869a.getIndex(), null, 1, null);
            try {
                TranslateModelResult translateModelResult = (TranslateModelResult) y.g.a(data, TranslateModelResult.class);
                if (translateModelResult.getData() == null || !(!translateModelResult.getData().isEmpty())) {
                    return;
                }
                String data2 = ((Result) CollectionsKt___CollectionsKt.first((List) translateModelResult.getData())).getData();
                f6.l lVar = this.f870b;
                JsonObject jsonObject = new JsonObject();
                SmartRecognizeAsrResult smartRecognizeAsrResult = this.f869a;
                String str = this.f871c;
                jsonObject.addProperty("translateText", data2);
                jsonObject.addProperty("sourceText", smartRecognizeAsrResult.getText());
                jsonObject.addProperty("index", Integer.valueOf(smartRecognizeAsrResult.getIndex()));
                jsonObject.addProperty("targetLanguage", str);
                String a8 = y.g.a(jsonObject);
                kotlin.jvm.internal.s.checkNotNullExpressionValue(a8, "toJson(JsonObject().appl…                       })");
                lVar.invoke(a8);
            } catch (Exception e8) {
                com.artillery.ctc.d.a(e8.getStackTrace().toString(), null, 1, null);
            }
        }
    }

    public static final class g extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public Object f872a;

        /* renamed from: b, reason: collision with root package name */
        public int f873b;

        /* renamed from: c, reason: collision with root package name */
        public int f874c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f875d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Map f876e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ i f877f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ f6.l f878g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ f6.l f879h;

        public static final class a extends SuspendLambda implements f6.p {

            /* renamed from: a, reason: collision with root package name */
            public int f880a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f881b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f882c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Object f883d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ f6.l f884e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, Object obj, f6.l lVar, kotlin.coroutines.c cVar) {
                super(2, cVar);
                this.f882c = str;
                this.f883d = obj;
                this.f884e = lVar;
            }

            @Override // f6.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
                return ((a) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                a aVar = new a(this.f882c, this.f883d, this.f884e, cVar);
                aVar.f881b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                if (this.f880a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
                kotlinx.coroutines.i0 i0Var = (kotlinx.coroutines.i0) this.f881b;
                o1.ensureActive(i0Var.getCoroutineContext());
                r4.f fVar = new r4.f();
                String str = this.f882c;
                Object obj2 = this.f883d;
                f6.l lVar = this.f884e;
                fVar.setPath(str);
                fVar.setMethod(Method.GET);
                fVar.setGroup(i0Var.getCoroutineContext().get(kotlinx.coroutines.g0.Key));
                fVar.tag(obj2);
                if (lVar != null) {
                    lVar.invoke(fVar);
                }
                NetConfig.INSTANCE.getRequestInterceptor();
                r4.d.setKType(fVar.getOkHttpRequest(), kotlin.jvm.internal.u.nullableTypeOf(String.class));
                Response execute = fVar.getOkHttpClient().newCall(fVar.buildRequest()).execute();
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

        public static final class b extends SuspendLambda implements f6.p {

            /* renamed from: a, reason: collision with root package name */
            public int f885a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f886b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f887c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Object f888d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ f6.l f889e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, f6.l lVar, kotlin.coroutines.c cVar) {
                super(2, cVar);
                this.f887c = str;
                this.f888d = obj;
                this.f889e = lVar;
            }

            @Override // f6.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
                return ((b) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                b bVar = new b(this.f887c, this.f888d, this.f889e, cVar);
                bVar.f886b = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                if (this.f885a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
                kotlinx.coroutines.i0 i0Var = (kotlinx.coroutines.i0) this.f886b;
                o1.ensureActive(i0Var.getCoroutineContext());
                r4.b bVar = new r4.b();
                String str = this.f887c;
                Object obj2 = this.f888d;
                f6.l lVar = this.f889e;
                bVar.setPath(str);
                bVar.setMethod(Method.POST);
                bVar.setGroup(i0Var.getCoroutineContext().get(kotlinx.coroutines.g0.Key));
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

        public static final class c extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ KeyResult f890a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f891b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(KeyResult keyResult, i iVar) {
                super(1);
                this.f890a = keyResult;
                this.f891b = iVar;
            }

            public final void a(r4.f Get) {
                kotlin.jvm.internal.s.checkNotNullParameter(Get, "$this$Get");
                r4.a.addQuery$default(Get, "ak", this.f890a.getOverSeaAk(), false, 4, null);
                r4.a.addQuery$default(Get, "sn", this.f890a.getDeviceId(), false, 4, null);
                i iVar = this.f891b;
                Configuration configuration = Resources.getSystem().getConfiguration();
                kotlin.jvm.internal.s.checkNotNullExpressionValue(configuration, "getSystem().configuration");
                r4.a.addQuery$default(Get, "language", iVar.a(configuration).getLanguage(), false, 4, null);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((r4.f) obj);
                return y5.w.INSTANCE;
            }
        }

        public static final class d extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Map f892a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Map map) {
                super(1);
                this.f892a = map;
            }

            public final void a(r4.b Post) {
                kotlin.jvm.internal.s.checkNotNullParameter(Post, "$this$Post");
                Post.json(new Gson().toJson(this.f892a));
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((r4.b) obj);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Map map, i iVar, f6.l lVar, f6.l lVar2, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f876e = map;
            this.f877f = iVar;
            this.f878g = lVar;
            this.f879h = lVar2;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
            return ((g) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            g gVar = new g(this.f876e, this.f877f, this.f878g, this.f879h, cVar);
            gVar.f875d = obj;
            return gVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(17:0|1|(1:2)|(1:(1:(16:6|7|8|9|10|11|(1:13)(1:30)|(1:15)|16|(1:18)|(1:20)|21|22|(1:24)(1:28)|25|26)(2:34|35))(3:36|37|38))(3:76|77|(1:79))|39|40|41|42|(1:44)|45|(1:47)|48|49|(4:54|(4:56|(1:58)|59|(2:61|(1:63)(12:64|9|10|11|(0)(0)|(0)|16|(0)|(0)|21|22|(0)(0)))(1:65))(5:66|(1:68)|69|(1:71)|72)|25|26)|73|25|26) */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x009a, code lost:
        
            r2 = 1;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0224 A[Catch: Exception -> 0x0229, TryCatch #1 {Exception -> 0x0229, blocks: (B:11:0x01e8, B:13:0x0224, B:16:0x022f, B:18:0x0235, B:21:0x023c), top: B:10:0x01e8, outer: #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x022e  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0235 A[Catch: Exception -> 0x0229, TryCatch #1 {Exception -> 0x0229, blocks: (B:11:0x01e8, B:13:0x0224, B:16:0x022f, B:18:0x0235, B:21:0x023c), top: B:10:0x01e8, outer: #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x023b  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x027f A[Catch: Exception -> 0x0028, TryCatch #2 {Exception -> 0x0028, blocks: (B:7:0x0021, B:9:0x01d9, B:22:0x0277, B:24:0x027f, B:28:0x0299, B:33:0x0274, B:37:0x0037, B:40:0x007e, B:49:0x009b, B:51:0x00bb, B:54:0x00c3, B:56:0x00e8, B:59:0x00ed, B:61:0x00f7, B:65:0x02a1, B:66:0x02a9, B:69:0x02b0, B:72:0x02b8, B:73:0x02bc, B:77:0x0045, B:11:0x01e8, B:13:0x0224, B:16:0x022f, B:18:0x0235, B:21:0x023c), top: B:2:0x0011, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0299 A[Catch: Exception -> 0x0028, TryCatch #2 {Exception -> 0x0028, blocks: (B:7:0x0021, B:9:0x01d9, B:22:0x0277, B:24:0x027f, B:28:0x0299, B:33:0x0274, B:37:0x0037, B:40:0x007e, B:49:0x009b, B:51:0x00bb, B:54:0x00c3, B:56:0x00e8, B:59:0x00ed, B:61:0x00f7, B:65:0x02a1, B:66:0x02a9, B:69:0x02b0, B:72:0x02b8, B:73:0x02bc, B:77:0x0045, B:11:0x01e8, B:13:0x0224, B:16:0x022f, B:18:0x0235, B:21:0x023c), top: B:2:0x0011, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x022b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            kotlinx.coroutines.i0 i0Var;
            kotlinx.coroutines.n0 async$default;
            Object await;
            KeyResult copy;
            kotlinx.coroutines.n0 async$default2;
            Object await2;
            int i8;
            KeyResult keyResult;
            KeyResult keyResult2;
            String azureApiKey;
            String area;
            KeyResult copy2;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i9 = this.f874c;
            try {
            } catch (Exception e8) {
                e8.printStackTrace();
                f6.l lVar = this.f879h;
                String message = e8.getMessage();
                lVar.invoke(message != null ? message : "");
            }
            if (i9 == 0) {
                y5.g.throwOnFailure(obj);
                i0Var = (kotlinx.coroutines.i0) this.f875d;
                async$default = kotlinx.coroutines.i.async$default(i0Var, kotlinx.coroutines.t0.getIO().plus(f2.m1260SupervisorJob$default((l1) null, 1, (Object) null)), null, new b("/service/botwatch/api/queryDevcie", null, new d(this.f876e), null), 2, null);
                NetDeferred netDeferred = new NetDeferred(async$default);
                this.f875d = i0Var;
                this.f874c = 1;
                await = netDeferred.await(this);
                if (await == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i9 != 1) {
                    if (i9 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i8 = this.f873b;
                    keyResult = (KeyResult) this.f872a;
                    keyResult2 = (KeyResult) this.f875d;
                    y5.g.throwOnFailure(obj);
                    await2 = obj;
                    AzureConfigResult azureConfigResult = (AzureConfigResult) new Gson().fromJson((String) await2, AzureConfigResult.class);
                    try {
                        com.artillery.ctc.h a8 = com.artillery.ctc.h.f791d.a();
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(keyResult, "keyResult");
                        String uniqueDeviceId = DeviceUtils.getUniqueDeviceId();
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(uniqueDeviceId, "getUniqueDeviceId()");
                        String mac = keyResult2.getMac();
                        String channel = keyResult2.getChannel();
                        AzureConfigData rows = azureConfigResult.getRows();
                        azureApiKey = rows == null ? rows.getAzureApiKey() : null;
                        if (azureApiKey == null) {
                            azureApiKey = "";
                        }
                        AzureConfigData rows2 = azureConfigResult.getRows();
                        area = rows2 != null ? rows2.getArea() : null;
                        if (area == null) {
                            area = "";
                        }
                        copy2 = r9.copy((r53 & 1) != 0 ? r9.deviceId : null, (r53 & 2) != 0 ? r9.appKey : null, (r53 & 4) != 0 ? r9.secretKey : null, (r53 & 8) != 0 ? r9.appid : null, (r53 & 16) != 0 ? r9.clientId : null, (r53 & 32) != 0 ? r9.clientSecret : null, (r53 & 64) != 0 ? r9.ttsAppId : null, (r53 & 128) != 0 ? r9.ttsAppKey : null, (r53 & 256) != 0 ? r9.ttsAppSecret : null, (r53 & 512) != 0 ? r9.deviceUnique : uniqueDeviceId, (r53 & 1024) != 0 ? r9.aiClientId : null, (r53 & 2048) != 0 ? r9.aiClientSecret : null, (r53 & 4096) != 0 ? r9.oversea : 0, (r53 & 8192) != 0 ? r9.overSeaAk : null, (r53 & 16384) != 0 ? r9.accountResult : null, (r53 & 32768) != 0 ? r9.accountAiResult : null, (r53 & 65536) != 0 ? r9.supportLangure : null, (r53 & 131072) != 0 ? r9.ttsConfig : null, (r53 & 262144) != 0 ? r9.mac : mac, (r53 & 524288) != 0 ? r9.channel : channel, (r53 & 1048576) != 0 ? r9.overseasConfig : new OverseasConfigModel(azureApiKey, area), (r53 & 2097152) != 0 ? r9.ak : null, (r53 & 4194304) != 0 ? r9.functionType : kotlin.coroutines.jvm.internal.a.boxInt(i8), (r53 & 8388608) != 0 ? r9.typeList : null, (r53 & 16777216) != 0 ? r9.xfAsrAppId : null, (r53 & 33554432) != 0 ? r9.xfAsrAPISecret : null, (r53 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? r9.xfAsrAPIKey : null, (r53 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r9.xfTtsAppId : null, (r53 & 268435456) != 0 ? r9.xfTtsAPISecret : null, (r53 & 536870912) != 0 ? r9.xfTtsAPIKey : null, (r53 & 1073741824) != 0 ? r9.xfVoiceName : null, (r53 & Integer.MIN_VALUE) != 0 ? r9.xfVoiceNameList : null, (r54 & 1) != 0 ? r9.wsExpriceTime : null, (r54 & 2) != 0 ? r9.xfAsrStdAppId : null, (r54 & 4) != 0 ? keyResult.xfAsrStdAPIKey : null);
                        a8.a(copy2);
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                    if (this.f877f.f800b == null) {
                        i iVar = this.f877f;
                        Context context = iVar.f800b;
                        kotlin.jvm.internal.s.checkNotNull(context);
                        iVar.a(context);
                        this.f878g.invoke(kotlin.coroutines.jvm.internal.a.boxInt(keyResult.getOversea()));
                    } else {
                        this.f879h.invoke("context is NULL");
                    }
                    return y5.w.INSTANCE;
                }
                i0Var = (kotlinx.coroutines.i0) this.f875d;
                y5.g.throwOnFailure(obj);
                await = obj;
            }
            kotlinx.coroutines.i0 i0Var2 = i0Var;
            String str = (String) await;
            String str2 = (String) this.f876e.get("type");
            if (str2 == null) {
                str2 = "";
            }
            if (str2.length() == 0) {
                str2 = "1";
            }
            int i10 = Integer.parseInt(str2);
            com.artillery.ctc.d.a("functionType: " + i10, null, 1, null);
            h.b bVar = com.artillery.ctc.h.f791d;
            KeyResult c8 = bVar.a().c();
            if (str != null && str.length() != 0) {
                WrapResult wrapResult = (WrapResult) new Gson().fromJson(str, WrapResult.class);
                com.artillery.ctc.d.a("queryDevice: " + str, null, 1, null);
                if (wrapResult.code == 0) {
                    String str3 = wrapResult.data;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String a9 = y.e.a(str3);
                    if (a9.length() > 0) {
                        KeyResult keyResult3 = (KeyResult) new Gson().fromJson(a9, KeyResult.class);
                        com.artillery.ctc.d.b("解析->" + a9, null, 1, null);
                        com.artillery.ctc.d.a("isOversea => true", null, 1, null);
                        com.artillery.ctc.h a10 = bVar.a();
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(keyResult3, "keyResult");
                        String uniqueDeviceId2 = DeviceUtils.getUniqueDeviceId();
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(uniqueDeviceId2, "getUniqueDeviceId()");
                        copy = keyResult3.copy((r53 & 1) != 0 ? keyResult3.deviceId : null, (r53 & 2) != 0 ? keyResult3.appKey : null, (r53 & 4) != 0 ? keyResult3.secretKey : null, (r53 & 8) != 0 ? keyResult3.appid : null, (r53 & 16) != 0 ? keyResult3.clientId : null, (r53 & 32) != 0 ? keyResult3.clientSecret : null, (r53 & 64) != 0 ? keyResult3.ttsAppId : null, (r53 & 128) != 0 ? keyResult3.ttsAppKey : null, (r53 & 256) != 0 ? keyResult3.ttsAppSecret : null, (r53 & 512) != 0 ? keyResult3.deviceUnique : uniqueDeviceId2, (r53 & 1024) != 0 ? keyResult3.aiClientId : null, (r53 & 2048) != 0 ? keyResult3.aiClientSecret : null, (r53 & 4096) != 0 ? keyResult3.oversea : 0, (r53 & 8192) != 0 ? keyResult3.overSeaAk : null, (r53 & 16384) != 0 ? keyResult3.accountResult : null, (r53 & 32768) != 0 ? keyResult3.accountAiResult : null, (r53 & 65536) != 0 ? keyResult3.supportLangure : null, (r53 & 131072) != 0 ? keyResult3.ttsConfig : null, (r53 & 262144) != 0 ? keyResult3.mac : c8.getMac(), (r53 & 524288) != 0 ? keyResult3.channel : c8.getChannel(), (r53 & 1048576) != 0 ? keyResult3.overseasConfig : null, (r53 & 2097152) != 0 ? keyResult3.ak : null, (r53 & 4194304) != 0 ? keyResult3.functionType : kotlin.coroutines.jvm.internal.a.boxInt(i10), (r53 & 8388608) != 0 ? keyResult3.typeList : null, (r53 & 16777216) != 0 ? keyResult3.xfAsrAppId : null, (r53 & 33554432) != 0 ? keyResult3.xfAsrAPISecret : null, (r53 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? keyResult3.xfAsrAPIKey : null, (r53 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? keyResult3.xfTtsAppId : null, (r53 & 268435456) != 0 ? keyResult3.xfTtsAPISecret : null, (r53 & 536870912) != 0 ? keyResult3.xfTtsAPIKey : null, (r53 & 1073741824) != 0 ? keyResult3.xfVoiceName : null, (r53 & Integer.MIN_VALUE) != 0 ? keyResult3.xfVoiceNameList : null, (r54 & 1) != 0 ? keyResult3.wsExpriceTime : null, (r54 & 2) != 0 ? keyResult3.xfAsrStdAppId : null, (r54 & 4) != 0 ? keyResult3.xfAsrStdAPIKey : null);
                        a10.a(copy);
                        async$default2 = kotlinx.coroutines.i.async$default(i0Var2, kotlinx.coroutines.t0.getIO().plus(f2.m1260SupervisorJob$default((l1) null, 1, (Object) null)), null, new a("https://swapi.yueqizhixiang.com/dmp/llm/getAzureConfig", null, new c(keyResult3, this.f877f), null), 2, null);
                        NetDeferred netDeferred2 = new NetDeferred(async$default2);
                        this.f875d = c8;
                        this.f872a = keyResult3;
                        this.f873b = i10;
                        this.f874c = 2;
                        await2 = netDeferred2.await(this);
                        if (await2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i8 = i10;
                        keyResult = keyResult3;
                        keyResult2 = c8;
                        AzureConfigResult azureConfigResult2 = (AzureConfigResult) new Gson().fromJson((String) await2, AzureConfigResult.class);
                        com.artillery.ctc.h a82 = com.artillery.ctc.h.f791d.a();
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(keyResult, "keyResult");
                        String uniqueDeviceId3 = DeviceUtils.getUniqueDeviceId();
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(uniqueDeviceId3, "getUniqueDeviceId()");
                        String mac2 = keyResult2.getMac();
                        String channel2 = keyResult2.getChannel();
                        AzureConfigData rows3 = azureConfigResult2.getRows();
                        if (rows3 == null) {
                        }
                        if (azureApiKey == null) {
                        }
                        AzureConfigData rows22 = azureConfigResult2.getRows();
                        if (rows22 != null) {
                        }
                        if (area == null) {
                        }
                        copy2 = r9.copy((r53 & 1) != 0 ? r9.deviceId : null, (r53 & 2) != 0 ? r9.appKey : null, (r53 & 4) != 0 ? r9.secretKey : null, (r53 & 8) != 0 ? r9.appid : null, (r53 & 16) != 0 ? r9.clientId : null, (r53 & 32) != 0 ? r9.clientSecret : null, (r53 & 64) != 0 ? r9.ttsAppId : null, (r53 & 128) != 0 ? r9.ttsAppKey : null, (r53 & 256) != 0 ? r9.ttsAppSecret : null, (r53 & 512) != 0 ? r9.deviceUnique : uniqueDeviceId3, (r53 & 1024) != 0 ? r9.aiClientId : null, (r53 & 2048) != 0 ? r9.aiClientSecret : null, (r53 & 4096) != 0 ? r9.oversea : 0, (r53 & 8192) != 0 ? r9.overSeaAk : null, (r53 & 16384) != 0 ? r9.accountResult : null, (r53 & 32768) != 0 ? r9.accountAiResult : null, (r53 & 65536) != 0 ? r9.supportLangure : null, (r53 & 131072) != 0 ? r9.ttsConfig : null, (r53 & 262144) != 0 ? r9.mac : mac2, (r53 & 524288) != 0 ? r9.channel : channel2, (r53 & 1048576) != 0 ? r9.overseasConfig : new OverseasConfigModel(azureApiKey, area), (r53 & 2097152) != 0 ? r9.ak : null, (r53 & 4194304) != 0 ? r9.functionType : kotlin.coroutines.jvm.internal.a.boxInt(i8), (r53 & 8388608) != 0 ? r9.typeList : null, (r53 & 16777216) != 0 ? r9.xfAsrAppId : null, (r53 & 33554432) != 0 ? r9.xfAsrAPISecret : null, (r53 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? r9.xfAsrAPIKey : null, (r53 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r9.xfTtsAppId : null, (r53 & 268435456) != 0 ? r9.xfTtsAPISecret : null, (r53 & 536870912) != 0 ? r9.xfTtsAPIKey : null, (r53 & 1073741824) != 0 ? r9.xfVoiceName : null, (r53 & Integer.MIN_VALUE) != 0 ? r9.xfVoiceNameList : null, (r54 & 1) != 0 ? r9.wsExpriceTime : null, (r54 & 2) != 0 ? r9.xfAsrStdAppId : null, (r54 & 4) != 0 ? keyResult.xfAsrStdAPIKey : null);
                        a82.a(copy2);
                        if (this.f877f.f800b == null) {
                        }
                    } else {
                        this.f879h.invoke("解码失败");
                    }
                } else {
                    f6.l lVar2 = this.f879h;
                    String str4 = wrapResult.message;
                    if (str4 == null) {
                        str4 = "";
                    }
                    if (str4.length() == 0) {
                        str4 = "初始化失败";
                    }
                    lVar2.invoke(str4);
                }
                return y5.w.INSTANCE;
            }
            this.f879h.invoke("result is NULL");
            return y5.w.INSTANCE;
        }
    }

    public static final class g0 extends Lambda implements f6.l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f6.l f893a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f894b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f6.l f895c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f6.l f896d;

        public static final class a extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f6.l f897a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f898b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f6.l f899c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ SmartRecognizeAsrResult f900d;

            /* renamed from: com.artillery.ctc.i$g0$a$a, reason: collision with other inner class name */
            public static final class C0017a extends Lambda implements f6.l {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ f6.l f901a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SmartRecognizeAsrResult f902b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0017a(f6.l lVar, SmartRecognizeAsrResult smartRecognizeAsrResult) {
                    super(1);
                    this.f901a = lVar;
                    this.f902b = smartRecognizeAsrResult;
                }

                public final void a(String ttsResult) {
                    kotlin.jvm.internal.s.checkNotNullParameter(ttsResult, "ttsResult");
                    try {
                        f6.l lVar = this.f901a;
                        Object a8 = y.g.a(ttsResult, JsonObject.class);
                        ((JsonObject) a8).addProperty("index", Integer.valueOf(this.f902b.getIndex()));
                        String a9 = y.g.a(a8);
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(a9, "toJson(\n                …                       })");
                        lVar.invoke(a9);
                    } catch (Exception e8) {
                        com.artillery.ctc.d.a(e8.getStackTrace().toString(), null, 1, null);
                    }
                }

                @Override // f6.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((String) obj);
                    return y5.w.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f6.l lVar, i iVar, f6.l lVar2, SmartRecognizeAsrResult smartRecognizeAsrResult) {
                super(1);
                this.f897a = lVar;
                this.f898b = iVar;
                this.f899c = lVar2;
                this.f900d = smartRecognizeAsrResult;
            }

            public final void a(String transResult) {
                String str;
                z.g streamtrans;
                kotlin.jvm.internal.s.checkNotNullParameter(transResult, "transResult");
                kotlin.jvm.internal.w wVar = kotlin.jvm.internal.w.INSTANCE;
                this.f897a.invoke(transResult);
                JSONObject jSONObject = new JSONObject(transResult);
                i iVar = this.f898b;
                String optString = jSONObject.optString("translateText");
                kotlin.jvm.internal.s.checkNotNullExpressionValue(optString, "jsonObject.optString(\"translateText\")");
                z.a aVar = this.f898b.f801c;
                kotlin.jvm.internal.s.checkNotNull(aVar);
                z.e parameter = aVar.getParameter();
                if (parameter == null || (streamtrans = parameter.getStreamtrans()) == null || (str = streamtrans.getTo()) == null) {
                    str = "";
                }
                iVar.c(new Text2AudioSilkyBody(optString, new Text2AudioSilkyConfig(str, null, 0, null, null, null, null, null, null, null, null, null, 4094, null), null, 4, null), new C0017a(this.f899c, this.f900d));
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((String) obj);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(f6.l lVar, i iVar, f6.l lVar2, f6.l lVar3) {
            super(1);
            this.f893a = lVar;
            this.f894b = iVar;
            this.f895c = lVar2;
            this.f896d = lVar3;
        }

        public final void a(String result) {
            kotlin.jvm.internal.s.checkNotNullParameter(result, "result");
            try {
                this.f893a.invoke(result);
                SmartRecognizeAsrResult smartRecognizeAsrResult = (SmartRecognizeAsrResult) y.g.a(result, SmartRecognizeAsrResult.class);
                if (smartRecognizeAsrResult == null || smartRecognizeAsrResult.getText().length() <= 0) {
                    return;
                }
                i iVar = this.f894b;
                z.a aVar = iVar.f801c;
                kotlin.jvm.internal.s.checkNotNull(aVar);
                iVar.a(smartRecognizeAsrResult, aVar, new a(this.f895c, this.f894b, this.f896d, smartRecognizeAsrResult));
            } catch (Exception e8) {
                com.artillery.ctc.d.a(e8.getStackTrace().toString(), null, 1, null);
            }
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class h extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f903a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Audio2TextBody f904b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f905c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ISimpleCallback f906d;

        public static final class a extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ISimpleCallback f907a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ISimpleCallback iSimpleCallback) {
                super(1);
                this.f907a = iSimpleCallback;
            }

            public final void a(String it) {
                kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
                this.f907a.onSuccess(it);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((String) obj);
                return y5.w.INSTANCE;
            }
        }

        public static final class b extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public static final b f908a = new b();

            public b() {
                super(1);
            }

            public final void a(String it) {
                kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
                Log.d("burialPoint", "audio2TextJson: " + it);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((String) obj);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Audio2TextBody audio2TextBody, i iVar, ISimpleCallback iSimpleCallback, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f904b = audio2TextBody;
            this.f905c = iVar;
            this.f906d = iSimpleCallback;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
            return ((h) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new h(this.f904b, this.f905c, this.f906d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            List mutableListOf;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f903a;
            if (i8 == 0) {
                y5.g.throwOnFailure(obj);
                com.artillery.ctc.b0 a8 = com.artillery.ctc.b0.f689e.a();
                Audio2TextBody audio2TextBody = this.f904b;
                a aVar = new a(this.f906d);
                this.f903a = 1;
                if (a8.a(audio2TextBody, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
            }
            try {
                i iVar = this.f905c;
                mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(com.artillery.ctc.d.b("audio2TextJson for baidu", this.f904b.tid));
                iVar.a(mutableListOf, b.f908a);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            return y5.w.INSTANCE;
        }
    }

    public static final class h0 extends Lambda implements f6.l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f6.l f909a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f910b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f6.l f911c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f6.l f912d;

        public static final class a extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f6.l f913a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f914b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f6.l f915c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ SmartRecognizeAsrResult f916d;

            /* renamed from: com.artillery.ctc.i$h0$a$a, reason: collision with other inner class name */
            public static final class C0018a extends Lambda implements f6.l {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ f6.l f917a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SmartRecognizeAsrResult f918b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0018a(f6.l lVar, SmartRecognizeAsrResult smartRecognizeAsrResult) {
                    super(1);
                    this.f917a = lVar;
                    this.f918b = smartRecognizeAsrResult;
                }

                public final void a(String ttsResult) {
                    kotlin.jvm.internal.s.checkNotNullParameter(ttsResult, "ttsResult");
                    try {
                        f6.l lVar = this.f917a;
                        Object a8 = y.g.a(ttsResult, JsonObject.class);
                        ((JsonObject) a8).addProperty("index", Integer.valueOf(this.f918b.getIndex()));
                        String a9 = y.g.a(a8);
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(a9, "toJson(\n                …                       })");
                        lVar.invoke(a9);
                    } catch (Exception e8) {
                        com.artillery.ctc.d.a(e8.getStackTrace().toString(), null, 1, null);
                    }
                }

                @Override // f6.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((String) obj);
                    return y5.w.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f6.l lVar, i iVar, f6.l lVar2, SmartRecognizeAsrResult smartRecognizeAsrResult) {
                super(1);
                this.f913a = lVar;
                this.f914b = iVar;
                this.f915c = lVar2;
                this.f916d = smartRecognizeAsrResult;
            }

            public final void a(String transResult) {
                String str;
                z.g streamtrans;
                kotlin.jvm.internal.s.checkNotNullParameter(transResult, "transResult");
                kotlin.jvm.internal.w wVar = kotlin.jvm.internal.w.INSTANCE;
                this.f913a.invoke(transResult);
                JSONObject jSONObject = new JSONObject(transResult);
                i iVar = this.f914b;
                String optString = jSONObject.optString("translateText");
                kotlin.jvm.internal.s.checkNotNullExpressionValue(optString, "jsonObject.optString(\"translateText\")");
                z.a aVar = this.f914b.f801c;
                kotlin.jvm.internal.s.checkNotNull(aVar);
                z.e parameter = aVar.getParameter();
                if (parameter == null || (streamtrans = parameter.getStreamtrans()) == null || (str = streamtrans.getTo()) == null) {
                    str = "";
                }
                iVar.c(new Text2AudioSilkyBody(optString, new Text2AudioSilkyConfig(str, null, 0, null, null, null, null, null, null, null, null, null, 4094, null), null, 4, null), new C0018a(this.f915c, this.f916d));
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((String) obj);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(f6.l lVar, i iVar, f6.l lVar2, f6.l lVar3) {
            super(1);
            this.f909a = lVar;
            this.f910b = iVar;
            this.f911c = lVar2;
            this.f912d = lVar3;
        }

        public final void a(String result) {
            kotlin.jvm.internal.s.checkNotNullParameter(result, "result");
            try {
                SmartRecognizeAsrResult smartRecognizeAsrResult = (SmartRecognizeAsrResult) y.g.a(result, SmartRecognizeAsrResult.class);
                if (kotlin.jvm.internal.s.areEqual(smartRecognizeAsrResult.getStatus(), "0")) {
                    this.f909a.invoke(result);
                    if (smartRecognizeAsrResult.getText().length() > 0) {
                        i iVar = this.f910b;
                        z.a aVar = iVar.f801c;
                        kotlin.jvm.internal.s.checkNotNull(aVar);
                        iVar.a(smartRecognizeAsrResult, aVar, new a(this.f911c, this.f910b, this.f912d, smartRecognizeAsrResult));
                    }
                }
            } catch (Exception e8) {
                com.artillery.ctc.d.a(e8.getStackTrace().toString(), null, 1, null);
            }
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return y5.w.INSTANCE;
        }
    }

    /* renamed from: com.artillery.ctc.i$i, reason: collision with other inner class name */
    public static final class C0019i extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f919a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Audio2TextBodyRaw f920b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f921c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ISimpleCallback f922d;

        /* renamed from: com.artillery.ctc.i$i$a */
        public static final class a extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ISimpleCallback f923a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ISimpleCallback iSimpleCallback) {
                super(1);
                this.f923a = iSimpleCallback;
            }

            public final void a(String it) {
                kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
                this.f923a.onSuccess(it);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((String) obj);
                return y5.w.INSTANCE;
            }
        }

        /* renamed from: com.artillery.ctc.i$i$b */
        public static final class b extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public static final b f924a = new b();

            public b() {
                super(1);
            }

            public final void a(String it) {
                kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
                Log.d("burialPoint", "audio2TextRaw: " + it);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((String) obj);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0019i(Audio2TextBodyRaw audio2TextBodyRaw, i iVar, ISimpleCallback iSimpleCallback, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f920b = audio2TextBodyRaw;
            this.f921c = iVar;
            this.f922d = iSimpleCallback;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
            return ((C0019i) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new C0019i(this.f920b, this.f921c, this.f922d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            List mutableListOf;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f919a;
            if (i8 == 0) {
                y5.g.throwOnFailure(obj);
                com.artillery.ctc.b0 a8 = com.artillery.ctc.b0.f689e.a();
                Audio2TextBodyRaw audio2TextBodyRaw = this.f920b;
                a aVar = new a(this.f922d);
                this.f919a = 1;
                if (a8.a(audio2TextBodyRaw, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
            }
            try {
                i iVar = this.f921c;
                mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(com.artillery.ctc.d.b("audio2TextRaw for baidu", this.f920b.tid));
                iVar.a(mutableListOf, b.f924a);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            return y5.w.INSTANCE;
        }
    }

    public static final class i0 extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f925a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AiGcBody f926b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f6.l f927c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f928d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ IChatPictureCallback f929e;

        public static final class a extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f6.l f930a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f931b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ AiGcBody f932c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ IChatPictureCallback f933d;

            /* renamed from: com.artillery.ctc.i$i0$a$a, reason: collision with other inner class name */
            public static final class C0020a implements ISimpleCallback {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ AiGcBody f934a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f935b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ IChatPictureCallback f936c;

                public C0020a(AiGcBody aiGcBody, i iVar, IChatPictureCallback iChatPictureCallback) {
                    this.f934a = aiGcBody;
                    this.f935b = iVar;
                    this.f936c = iChatPictureCallback;
                }

                @Override // com.artillery.ctc.interfaces.ISimpleCallback
                public void onSuccess(String data) {
                    TranslateModelResult translateModelResult;
                    List<Result> data2;
                    Object firstOrNull;
                    String data3;
                    kotlin.jvm.internal.s.checkNotNullParameter(data, "data");
                    if (data.length() == 0 || (translateModelResult = (TranslateModelResult) new Gson().fromJson(data, TranslateModelResult.class)) == null) {
                        return;
                    }
                    if ((translateModelResult.getCode() != 0 && !translateModelResult.getSuccess()) || (data2 = translateModelResult.getData()) == null || data2.isEmpty()) {
                        return;
                    }
                    firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) translateModelResult.getData());
                    Result result = (Result) firstOrNull;
                    if (result == null || (data3 = result.getData()) == null || data3.length() == 0) {
                        return;
                    }
                    AiGcBody aiGcBody = this.f934a;
                    StringBuilder sb = new StringBuilder();
                    ChatPictureRequestBody.ChatPictureParams chatPictureParams = aiGcBody.picture.params;
                    String str = chatPictureParams != null ? chatPictureParams.tag : null;
                    if (str != null && str.length() != 0) {
                        ChatPictureRequestBody.ChatPictureParams chatPictureParams2 = aiGcBody.picture.params;
                        sb.append(chatPictureParams2 != null ? chatPictureParams2.tag : null);
                        sb.append(' ');
                    }
                    sb.append(result.getData());
                    String sb2 = sb.toString();
                    kotlin.jvm.internal.s.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
                    AiGcBody aiGcBody2 = this.f934a;
                    ChatPictureRequestBody chatPictureRequestBody = aiGcBody2.picture;
                    ChatPictureRequestBody.ChatPictureParams chatPictureParams3 = chatPictureRequestBody.params;
                    this.f935b.a(AiGcBody.copy$default(aiGcBody2, ChatPictureRequestBody.copy$default(chatPictureRequestBody, null, chatPictureParams3 != null ? ChatPictureRequestBody.ChatPictureParams.copy$default(chatPictureParams3, sb2, null, 0, 0, 0, null, 30, null) : null, null, null, null, 29, null), null, 2, null).picture, this.f936c);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f6.l lVar, i iVar, AiGcBody aiGcBody, IChatPictureCallback iChatPictureCallback) {
                super(1);
                this.f930a = lVar;
                this.f931b = iVar;
                this.f932c = aiGcBody;
                this.f933d = iChatPictureCallback;
            }

            public final void a(String data) {
                IflytekData data2;
                kotlin.jvm.internal.s.checkNotNullParameter(data, "data");
                this.f930a.invoke(data);
                try {
                    if (data.length() > 0) {
                        IflytekResponseData iflytekResponseData = (IflytekResponseData) new Gson().fromJson(data, IflytekResponseData.class);
                        if (iflytekResponseData.getCode() != 0 || (data2 = iflytekResponseData.getData()) == null) {
                            return;
                        }
                        i iVar = this.f931b;
                        AiGcBody aiGcBody = this.f932c;
                        IChatPictureCallback iChatPictureCallback = this.f933d;
                        IflytekResult result = data2.getResult();
                        if (result != null) {
                            try {
                                iVar.e().decode(result.getText());
                            } catch (Exception e8) {
                                e8.printStackTrace();
                            }
                        }
                        if (data2.getStatus() == 2) {
                            String resultString = iVar.e().toResultString();
                            iVar.e().discard();
                            com.artillery.ctc.m.f1137l.a().d();
                            if (y.c.a(aiGcBody.asr.language)) {
                                ChatPictureRequestBody chatPictureRequestBody = aiGcBody.picture;
                                ChatPictureRequestBody.ChatPictureParams chatPictureParams = chatPictureRequestBody.params;
                                iVar.a(AiGcBody.copy$default(aiGcBody, ChatPictureRequestBody.copy$default(chatPictureRequestBody, null, chatPictureParams != null ? ChatPictureRequestBody.ChatPictureParams.copy$default(chatPictureParams, resultString, null, 0, 0, 0, null, 62, null) : null, null, null, null, 29, null), null, 2, null).picture, iChatPictureCallback);
                            } else {
                                List listOf = kotlin.collections.q.listOf(new TranslateBody(resultString, y.c.b(aiGcBody.asr.language), "en", 0, null, 24, null));
                                String uniqueDeviceId = DeviceUtils.getUniqueDeviceId();
                                kotlin.jvm.internal.s.checkNotNullExpressionValue(uniqueDeviceId, "getUniqueDeviceId()");
                                iVar.c(new QueryBody(listOf, uniqueDeviceId), new C0020a(aiGcBody, iVar, iChatPictureCallback));
                            }
                        }
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((String) obj);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(AiGcBody aiGcBody, f6.l lVar, i iVar, IChatPictureCallback iChatPictureCallback, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f926b = aiGcBody;
            this.f927c = lVar;
            this.f928d = iVar;
            this.f929e = iChatPictureCallback;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
            return ((i0) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new i0(this.f926b, this.f927c, this.f928d, this.f929e, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (this.f925a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
            com.artillery.ctc.m a8 = com.artillery.ctc.m.f1137l.a();
            AiGcBody aiGcBody = this.f926b;
            a8.a(aiGcBody.asr, new a(this.f927c, this.f928d, aiGcBody, this.f929e));
            return y5.w.INSTANCE;
        }
    }

    public static final class j extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f937a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Audio2TextBodyRaw f938b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f939c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ISimpleCallback f940d;

        public static final class a extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ISimpleCallback f941a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ISimpleCallback iSimpleCallback) {
                super(1);
                this.f941a = iSimpleCallback;
            }

            public final void a(String it) {
                kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
                this.f941a.onSuccess(it);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((String) obj);
                return y5.w.INSTANCE;
            }
        }

        public static final class b extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public static final b f942a = new b();

            public b() {
                super(1);
            }

            public final void a(String it) {
                kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
                Log.d("burialPoint", "audio2TextRawOverseas: " + it);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((String) obj);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Audio2TextBodyRaw audio2TextBodyRaw, i iVar, ISimpleCallback iSimpleCallback, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f938b = audio2TextBodyRaw;
            this.f939c = iVar;
            this.f940d = iSimpleCallback;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
            return ((j) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new j(this.f938b, this.f939c, this.f940d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            List mutableListOf;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f937a;
            if (i8 == 0) {
                y5.g.throwOnFailure(obj);
                com.artillery.ctc.w a8 = com.artillery.ctc.w.f1268j.a();
                Audio2TextBodyRaw audio2TextBodyRaw = this.f938b;
                a aVar = new a(this.f940d);
                this.f937a = 1;
                if (a8.a(audio2TextBodyRaw, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
            }
            try {
                i iVar = this.f939c;
                mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(com.artillery.ctc.d.b("audio2TextRawOverseas", this.f938b.tid));
                iVar.a(mutableListOf, b.f942a);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            return y5.w.INSTANCE;
        }
    }

    public static final class j0 extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f943a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AiGcBody f944b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f6.l f945c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f946d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ IChatPictureCallback f947e;

        public static final class a extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f6.l f948a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f949b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ AiGcBody f950c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ IChatPictureCallback f951d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f6.l lVar, i iVar, AiGcBody aiGcBody, IChatPictureCallback iChatPictureCallback) {
                super(1);
                this.f948a = lVar;
                this.f949b = iVar;
                this.f950c = aiGcBody;
                this.f951d = iChatPictureCallback;
            }

            public final void a(String data) {
                String asrResultText;
                ChatPictureRequestBody.ChatOverseasPictureParams chatOverseasPictureParams;
                kotlin.jvm.internal.s.checkNotNullParameter(data, "data");
                this.f948a.invoke(data);
                try {
                    if (data.length() > 0) {
                        JSONObject jSONObject = new JSONObject(data);
                        if (kotlin.jvm.internal.s.areEqual(jSONObject.optString("reason", ""), "RecognizedSpeech") && (asrResultText = jSONObject.optString("text", "")) != null && asrResultText.length() != 0) {
                            i iVar = this.f949b;
                            ChatPictureRequestBody chatPictureRequestBody = this.f950c.picture;
                            ChatPictureRequestBody.ChatOverseasPictureParams chatOverseasPictureParams2 = chatPictureRequestBody.overseas;
                            if (chatOverseasPictureParams2 != null) {
                                kotlin.jvm.internal.s.checkNotNullExpressionValue(asrResultText, "asrResultText");
                                chatOverseasPictureParams = chatOverseasPictureParams2.copy((r30 & 1) != 0 ? chatOverseasPictureParams2.prompt : asrResultText, (r30 & 2) != 0 ? chatOverseasPictureParams2.resizeWidth : null, (r30 & 4) != 0 ? chatOverseasPictureParams2.resizeHeight : null, (r30 & 8) != 0 ? chatOverseasPictureParams2.width : null, (r30 & 16) != 0 ? chatOverseasPictureParams2.height : null, (r30 & 32) != 0 ? chatOverseasPictureParams2.image_num : null, (r30 & 64) != 0 ? chatOverseasPictureParams2.image : null, (r30 & 128) != 0 ? chatOverseasPictureParams2.style : null, (r30 & 256) != 0 ? chatOverseasPictureParams2.url : null, (r30 & 512) != 0 ? chatOverseasPictureParams2.pdf_file : null, (r30 & 1024) != 0 ? chatOverseasPictureParams2.pdf_file_num : null, (r30 & 2048) != 0 ? chatOverseasPictureParams2.change_degree : null, (r30 & 4096) != 0 ? chatOverseasPictureParams2.language : null, (r30 & 8192) != 0 ? chatOverseasPictureParams2.oversea : null);
                            } else {
                                chatOverseasPictureParams = null;
                            }
                            iVar.b(ChatPictureRequestBody.copy$default(chatPictureRequestBody, chatOverseasPictureParams, null, null, null, null, 30, null), this.f951d);
                        }
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((String) obj);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(AiGcBody aiGcBody, f6.l lVar, i iVar, IChatPictureCallback iChatPictureCallback, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f944b = aiGcBody;
            this.f945c = lVar;
            this.f946d = iVar;
            this.f947e = iChatPictureCallback;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
            return ((j0) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new j0(this.f944b, this.f945c, this.f946d, this.f947e, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (this.f943a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
            com.artillery.ctc.w a8 = com.artillery.ctc.w.f1268j.a();
            AiGcBody aiGcBody = this.f944b;
            a8.b(aiGcBody.asr.language, new a(this.f945c, this.f946d, aiGcBody, this.f947e));
            return y5.w.INSTANCE;
        }
    }

    public static final class k extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f952a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f953b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f6.l f954c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List f955d;

        public static final class a extends SuspendLambda implements f6.p {

            /* renamed from: a, reason: collision with root package name */
            public int f956a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f957b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f958c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Object f959d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ f6.l f960e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, Object obj, f6.l lVar, kotlin.coroutines.c cVar) {
                super(2, cVar);
                this.f958c = str;
                this.f959d = obj;
                this.f960e = lVar;
            }

            @Override // f6.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
                return ((a) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                a aVar = new a(this.f958c, this.f959d, this.f960e, cVar);
                aVar.f957b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                if (this.f956a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
                kotlinx.coroutines.i0 i0Var = (kotlinx.coroutines.i0) this.f957b;
                o1.ensureActive(i0Var.getCoroutineContext());
                r4.b bVar = new r4.b();
                String str = this.f958c;
                Object obj2 = this.f959d;
                f6.l lVar = this.f960e;
                bVar.setPath(str);
                bVar.setMethod(Method.POST);
                bVar.setGroup(i0Var.getCoroutineContext().get(kotlinx.coroutines.g0.Key));
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
            public final /* synthetic */ List f961a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(List list) {
                super(1);
                this.f961a = list;
            }

            public final void a(r4.b Post) {
                kotlin.jvm.internal.s.checkNotNullParameter(Post, "$this$Post");
                Post.json(new Gson().toJson(this.f961a));
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((r4.b) obj);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(f6.l lVar, List list, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f954c = lVar;
            this.f955d = list;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
            return ((k) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            k kVar = new k(this.f954c, this.f955d, cVar);
            kVar.f953b = obj;
            return kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            kotlinx.coroutines.n0 async$default;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f952a;
            try {
                if (i8 == 0) {
                    y5.g.throwOnFailure(obj);
                    kotlinx.coroutines.i0 i0Var = (kotlinx.coroutines.i0) this.f953b;
                    async$default = kotlinx.coroutines.i.async$default(i0Var, kotlinx.coroutines.t0.getIO().plus(f2.m1260SupervisorJob$default((l1) null, 1, (Object) null)), null, new a("/data/upload/hm", null, new b(this.f955d), null), 2, null);
                    NetDeferred netDeferred = new NetDeferred(async$default);
                    this.f952a = 1;
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
                String str = (String) obj;
                f6.l lVar = this.f954c;
                if (str == null) {
                    str = "";
                }
                lVar.invoke(str);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            return y5.w.INSTANCE;
        }
    }

    public static final class k0 extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f962a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f6.l f963b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GPTInternalBody f964c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f965d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f6.l f966e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ f6.l f967f;

        public static final class a extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f6.l f968a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f969b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ GPTInternalBody f970c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ f6.l f971d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ f6.l f972e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f6.l lVar, i iVar, GPTInternalBody gPTInternalBody, f6.l lVar2, f6.l lVar3) {
                super(1);
                this.f968a = lVar;
                this.f969b = iVar;
                this.f970c = gPTInternalBody;
                this.f971d = lVar2;
                this.f972e = lVar3;
            }

            public final void a(String data) {
                IflytekData data2;
                ChatRequestBody copy;
                kotlin.jvm.internal.s.checkNotNullParameter(data, "data");
                this.f968a.invoke(data);
                try {
                    if (data.length() > 0) {
                        IflytekResponseData iflytekResponseData = (IflytekResponseData) new Gson().fromJson(data, IflytekResponseData.class);
                        if (iflytekResponseData.getCode() != 0 || (data2 = iflytekResponseData.getData()) == null) {
                            return;
                        }
                        i iVar = this.f969b;
                        GPTInternalBody gPTInternalBody = this.f970c;
                        f6.l lVar = this.f971d;
                        f6.l lVar2 = this.f972e;
                        IflytekResult result = data2.getResult();
                        if (result != null) {
                            try {
                                iVar.e().decode(result.getText());
                            } catch (Exception e8) {
                                e8.printStackTrace();
                            }
                        }
                        if (data2.getStatus() == 2) {
                            String resultString = iVar.e().toResultString();
                            iVar.e().discard();
                            com.artillery.ctc.m.f1137l.a().d();
                            ChatRequestBody chatRequestBody = gPTInternalBody.gptBody;
                            ChatRequestBody.Data data3 = chatRequestBody.data;
                            copy = chatRequestBody.copy((r18 & 1) != 0 ? chatRequestBody.oversea : null, (r18 & 2) != 0 ? chatRequestBody.data : data3 != null ? ChatRequestBody.Data.copy$default(data3, resultString, false, 0, null, 14, null) : null, (r18 & 4) != 0 ? chatRequestBody.pid : null, (r18 & 8) != 0 ? chatRequestBody.mode : null, (r18 & 16) != 0 ? chatRequestBody.dcs_data : null, (r18 & 32) != 0 ? chatRequestBody.userId : null, (r18 & 64) != 0 ? chatRequestBody.qid : null, (r18 & 128) != 0 ? chatRequestBody.tid : null);
                            iVar.c(GPTInternalBody.copy$default(gPTInternalBody, copy, null, null, 6, null), lVar, lVar2);
                        }
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((String) obj);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(f6.l lVar, GPTInternalBody gPTInternalBody, i iVar, f6.l lVar2, f6.l lVar3, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f963b = lVar;
            this.f964c = gPTInternalBody;
            this.f965d = iVar;
            this.f966e = lVar2;
            this.f967f = lVar3;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
            return ((k0) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new k0(this.f963b, this.f964c, this.f965d, this.f966e, this.f967f, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (this.f962a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
            if (this.f963b != null) {
                com.artillery.ctc.m a8 = com.artillery.ctc.m.f1137l.a();
                GPTInternalBody gPTInternalBody = this.f964c;
                a8.a(gPTInternalBody.asr, new a(this.f963b, this.f965d, gPTInternalBody, this.f966e, this.f967f));
            } else {
                try {
                    this.f965d.c(this.f964c, this.f966e, this.f967f);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
            return y5.w.INSTANCE;
        }
    }

    public static final class l extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f973a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f974b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ChatRequestBody f975c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f976d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ISimpleCallback f977e;

        public static final class a extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.i0 f978a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ISimpleCallback f979b;

            /* renamed from: com.artillery.ctc.i$l$a$a, reason: collision with other inner class name */
            public static final class C0021a extends SuspendLambda implements f6.p {

                /* renamed from: a, reason: collision with root package name */
                public int f980a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ISimpleCallback f981b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f982c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0021a(ISimpleCallback iSimpleCallback, String str, kotlin.coroutines.c cVar) {
                    super(2, cVar);
                    this.f981b = iSimpleCallback;
                    this.f982c = str;
                }

                @Override // f6.p
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
                    return ((C0021a) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                    return new C0021a(this.f981b, this.f982c, cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    if (this.f980a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.g.throwOnFailure(obj);
                    this.f981b.onSuccess(this.f982c);
                    return y5.w.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlinx.coroutines.i0 i0Var, ISimpleCallback iSimpleCallback) {
                super(1);
                this.f978a = i0Var;
                this.f979b = iSimpleCallback;
            }

            public final void a(String it) {
                kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
                kotlinx.coroutines.i.launch$default(this.f978a, kotlinx.coroutines.t0.getMain(), null, new C0021a(this.f979b, it, null), 2, null);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((String) obj);
                return y5.w.INSTANCE;
            }
        }

        public static final class b extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public static final b f983a = new b();

            public b() {
                super(1);
            }

            public final void a(String it) {
                kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
                Log.d("burialPoint", "chatWithBody: " + it);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((String) obj);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ChatRequestBody chatRequestBody, i iVar, ISimpleCallback iSimpleCallback, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f975c = chatRequestBody;
            this.f976d = iVar;
            this.f977e = iSimpleCallback;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
            return ((l) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            l lVar = new l(this.f975c, this.f976d, this.f977e, cVar);
            lVar.f974b = obj;
            return lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List mutableListOf;
            kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (this.f973a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
            com.artillery.ctc.e.f774d.a().a(this.f975c, new a((kotlinx.coroutines.i0) this.f974b, this.f977e));
            try {
                i iVar = this.f976d;
                mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(com.artillery.ctc.d.b("chatWithBody", this.f975c.getTid()));
                iVar.a(mutableListOf, b.f983a);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            return y5.w.INSTANCE;
        }
    }

    public static final class l0 extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f984a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f6.l f985b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GPTInternalBody f986c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f987d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f6.l f988e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ f6.l f989f;

        public static final class a extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f6.l f990a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f991b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ GPTInternalBody f992c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ f6.l f993d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ f6.l f994e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f6.l lVar, i iVar, GPTInternalBody gPTInternalBody, f6.l lVar2, f6.l lVar3) {
                super(1);
                this.f990a = lVar;
                this.f991b = iVar;
                this.f992c = gPTInternalBody;
                this.f993d = lVar2;
                this.f994e = lVar3;
            }

            public final void a(String data) {
                ChatRequestBody copy;
                kotlin.jvm.internal.s.checkNotNullParameter(data, "data");
                this.f990a.invoke(data);
                try {
                    if (data.length() > 0) {
                        JSONObject jSONObject = new JSONObject(data);
                        if (kotlin.jvm.internal.s.areEqual(jSONObject.optString("reason", ""), "RecognizedSpeech")) {
                            String text = jSONObject.optString("text", "");
                            kotlin.jvm.internal.s.checkNotNullExpressionValue(text, "text");
                            if (text.length() > 0) {
                                i iVar = this.f991b;
                                GPTInternalBody gPTInternalBody = this.f992c;
                                ChatRequestBody chatRequestBody = gPTInternalBody.gptBody;
                                ChatRequestBody.Oversea oversea = chatRequestBody.oversea;
                                copy = chatRequestBody.copy((r18 & 1) != 0 ? chatRequestBody.oversea : oversea != null ? oversea.copy((r20 & 1) != 0 ? oversea.qid : null, (r20 & 2) != 0 ? oversea.prompt : text, (r20 & 4) != 0 ? oversea.userId : null, (r20 & 8) != 0 ? oversea.stream : null, (r20 & 16) != 0 ? oversea.max_tokens : null, (r20 & 32) != 0 ? oversea.messages : null, (r20 & 64) != 0 ? oversea.language : null, (r20 & 128) != 0 ? oversea.enableContext : null, (r20 & 256) != 0 ? oversea.enableSearch : null) : null, (r18 & 2) != 0 ? chatRequestBody.data : null, (r18 & 4) != 0 ? chatRequestBody.pid : null, (r18 & 8) != 0 ? chatRequestBody.mode : null, (r18 & 16) != 0 ? chatRequestBody.dcs_data : null, (r18 & 32) != 0 ? chatRequestBody.userId : null, (r18 & 64) != 0 ? chatRequestBody.qid : null, (r18 & 128) != 0 ? chatRequestBody.tid : null);
                                iVar.d(GPTInternalBody.copy$default(gPTInternalBody, copy, null, null, 6, null), this.f993d, this.f994e);
                            }
                        }
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((String) obj);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(f6.l lVar, GPTInternalBody gPTInternalBody, i iVar, f6.l lVar2, f6.l lVar3, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f985b = lVar;
            this.f986c = gPTInternalBody;
            this.f987d = iVar;
            this.f988e = lVar2;
            this.f989f = lVar3;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
            return ((l0) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new l0(this.f985b, this.f986c, this.f987d, this.f988e, this.f989f, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (this.f984a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
            if (this.f985b != null) {
                com.artillery.ctc.w a8 = com.artillery.ctc.w.f1268j.a();
                GPTInternalBody gPTInternalBody = this.f986c;
                a8.b(gPTInternalBody.asr.language, new a(this.f985b, this.f987d, gPTInternalBody, this.f988e, this.f989f));
            } else {
                try {
                    this.f987d.d(this.f986c, this.f988e, this.f989f);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
            return y5.w.INSTANCE;
        }
    }

    public static final class m extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f995a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f996b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ChatRequestBody f997c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f998d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ISimpleCallback f999e;

        public static final class a extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.i0 f1000a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ISimpleCallback f1001b;

            /* renamed from: com.artillery.ctc.i$m$a$a, reason: collision with other inner class name */
            public static final class C0022a extends SuspendLambda implements f6.p {

                /* renamed from: a, reason: collision with root package name */
                public int f1002a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ISimpleCallback f1003b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f1004c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0022a(ISimpleCallback iSimpleCallback, String str, kotlin.coroutines.c cVar) {
                    super(2, cVar);
                    this.f1003b = iSimpleCallback;
                    this.f1004c = str;
                }

                @Override // f6.p
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
                    return ((C0022a) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                    return new C0022a(this.f1003b, this.f1004c, cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    if (this.f1002a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.g.throwOnFailure(obj);
                    this.f1003b.onSuccess(this.f1004c);
                    return y5.w.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlinx.coroutines.i0 i0Var, ISimpleCallback iSimpleCallback) {
                super(1);
                this.f1000a = i0Var;
                this.f1001b = iSimpleCallback;
            }

            public final void a(String it) {
                kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
                kotlinx.coroutines.i.launch$default(this.f1000a, kotlinx.coroutines.t0.getMain(), null, new C0022a(this.f1001b, it, null), 2, null);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((String) obj);
                return y5.w.INSTANCE;
            }
        }

        public static final class b extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public static final b f1005a = new b();

            public b() {
                super(1);
            }

            public final void a(String it) {
                kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
                Log.d("burialPoint", "chatWithBody: " + it);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((String) obj);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ChatRequestBody chatRequestBody, i iVar, ISimpleCallback iSimpleCallback, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f997c = chatRequestBody;
            this.f998d = iVar;
            this.f999e = iSimpleCallback;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
            return ((m) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            m mVar = new m(this.f997c, this.f998d, this.f999e, cVar);
            mVar.f996b = obj;
            return mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            List mutableListOf;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f995a;
            if (i8 == 0) {
                y5.g.throwOnFailure(obj);
                kotlinx.coroutines.i0 i0Var = (kotlinx.coroutines.i0) this.f996b;
                com.artillery.ctc.s a8 = com.artillery.ctc.s.f1177a.a();
                ChatRequestBody chatRequestBody = this.f997c;
                a aVar = new a(i0Var, this.f999e);
                this.f995a = 1;
                if (a8.a(chatRequestBody, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
            }
            try {
                i iVar = this.f998d;
                mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(com.artillery.ctc.d.b("chatWithBodyOverseas", this.f997c.getTid()));
                iVar.a(mutableListOf, b.f1005a);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            return y5.w.INSTANCE;
        }
    }

    public static final class m0 extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f1006a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Text2AudioBody f1007b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f1008c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ISimpleCallback f1009d;

        public static final class a extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ISimpleCallback f1010a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ISimpleCallback iSimpleCallback) {
                super(1);
                this.f1010a = iSimpleCallback;
            }

            public final void a(String it) {
                kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
                this.f1010a.onSuccess(it);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((String) obj);
                return y5.w.INSTANCE;
            }
        }

        public static final class b extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public static final b f1011a = new b();

            public b() {
                super(1);
            }

            public final void a(String it) {
                kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
                Log.d("burialPoint", "text2Audio: " + it);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((String) obj);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(Text2AudioBody text2AudioBody, i iVar, ISimpleCallback iSimpleCallback, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f1007b = text2AudioBody;
            this.f1008c = iVar;
            this.f1009d = iSimpleCallback;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
            return ((m0) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new m0(this.f1007b, this.f1008c, this.f1009d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            List mutableListOf;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f1006a;
            if (i8 == 0) {
                y5.g.throwOnFailure(obj);
                com.artillery.ctc.b0 a8 = com.artillery.ctc.b0.f689e.a();
                Text2AudioBody text2AudioBody = this.f1007b;
                a aVar = new a(this.f1009d);
                this.f1006a = 1;
                if (com.artillery.ctc.b0.a(a8, text2AudioBody, false, aVar, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
            }
            try {
                i iVar = this.f1008c;
                mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(com.artillery.ctc.d.b("text2Audio for baidu", this.f1007b.tid));
                iVar.a(mutableListOf, b.f1011a);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            return y5.w.INSTANCE;
        }
    }

    public static final class n extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f1012a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ NetChatBody f1013b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ IResultCallback f1014c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f1015d;

        public static final class a extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public static final a f1016a = new a();

            public a() {
                super(1);
            }

            public final void a(String it) {
                kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
                Log.d("burialPoint", "chatWithBody: " + it);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((String) obj);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(NetChatBody netChatBody, IResultCallback iResultCallback, i iVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f1013b = netChatBody;
            this.f1014c = iResultCallback;
            this.f1015d = iVar;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
            return ((n) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new n(this.f1013b, this.f1014c, this.f1015d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List mutableListOf;
            String str = "";
            kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (this.f1012a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
            try {
                com.artillery.ctc.s.f1177a.a().b(this.f1013b, this.f1014c);
            } catch (Exception e8) {
                e8.printStackTrace();
                IResultCallback iResultCallback = this.f1014c;
                Integer boxInt = kotlin.coroutines.jvm.internal.a.boxInt(90000);
                String message = e8.getMessage();
                if (message == null) {
                    message = "";
                }
                iResultCallback.onFail(boxInt, message);
            }
            i iVar = this.f1015d;
            try {
                AnalysisModel[] analysisModelArr = new AnalysisModel[1];
                String str2 = this.f1013b.requestId;
                if (str2 != null) {
                    str = str2;
                }
                analysisModelArr[0] = com.artillery.ctc.d.b("postChatThirdReq", str);
                mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(analysisModelArr);
                iVar.a(mutableListOf, a.f1016a);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            return y5.w.INSTANCE;
        }
    }

    public static final class n0 extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f1017a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Text2AudioBody f1018b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f6.l f1019c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f1020d;

        public static final class a extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public static final a f1021a = new a();

            public a() {
                super(1);
            }

            public final void a(String it) {
                kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
                Log.d("burialPoint", "text2AudioAfterPlay: " + it);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((String) obj);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(Text2AudioBody text2AudioBody, f6.l lVar, i iVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f1018b = text2AudioBody;
            this.f1019c = lVar;
            this.f1020d = iVar;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
            return ((n0) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new n0(this.f1018b, this.f1019c, this.f1020d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            List mutableListOf;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f1017a;
            if (i8 == 0) {
                y5.g.throwOnFailure(obj);
                com.artillery.ctc.b0 a8 = com.artillery.ctc.b0.f689e.a();
                Text2AudioBody text2AudioBody = this.f1018b;
                f6.l lVar = this.f1019c;
                this.f1017a = 1;
                if (a8.a(text2AudioBody, lVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
            }
            try {
                i iVar = this.f1020d;
                mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(com.artillery.ctc.d.b("text2AudioAfterPlay for baidu", this.f1018b.tid));
                iVar.a(mutableListOf, a.f1021a);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            return y5.w.INSTANCE;
        }
    }

    public static final class o extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f1022a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ NetChatBody f1023b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ IResultCallback f1024c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f1025d;

        public static final class a extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public static final a f1026a = new a();

            public a() {
                super(1);
            }

            public final void a(String it) {
                kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
                Log.d("burialPoint", "chatWithBody: " + it);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((String) obj);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(NetChatBody netChatBody, IResultCallback iResultCallback, i iVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f1023b = netChatBody;
            this.f1024c = iResultCallback;
            this.f1025d = iVar;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
            return ((o) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new o(this.f1023b, this.f1024c, this.f1025d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List mutableListOf;
            String str = "";
            kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (this.f1022a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
            try {
                com.artillery.ctc.s.f1177a.a().a(this.f1023b, this.f1024c);
            } catch (Exception e8) {
                e8.printStackTrace();
                IResultCallback iResultCallback = this.f1024c;
                Integer boxInt = kotlin.coroutines.jvm.internal.a.boxInt(90000);
                String message = e8.getMessage();
                if (message == null) {
                    message = "";
                }
                iResultCallback.onFail(boxInt, message);
            }
            i iVar = this.f1025d;
            try {
                AnalysisModel[] analysisModelArr = new AnalysisModel[1];
                String str2 = this.f1023b.requestId;
                if (str2 != null) {
                    str = str2;
                }
                analysisModelArr[0] = com.artillery.ctc.d.b("postChatThirdReq", str);
                mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(analysisModelArr);
                iVar.a(mutableListOf, a.f1026a);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            return y5.w.INSTANCE;
        }
    }

    public static final class o0 extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f1027a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Text2AudioBody f1028b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f6.l f1029c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f1030d;

        public static final class a extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public static final a f1031a = new a();

            public a() {
                super(1);
            }

            public final void a(String it) {
                kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
                Log.d("burialPoint", "text2AudioAfterPlayOverseas: " + it);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((String) obj);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(Text2AudioBody text2AudioBody, f6.l lVar, i iVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f1028b = text2AudioBody;
            this.f1029c = lVar;
            this.f1030d = iVar;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
            return ((o0) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new o0(this.f1028b, this.f1029c, this.f1030d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List mutableListOf;
            kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (this.f1027a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
            com.artillery.ctc.w a8 = com.artillery.ctc.w.f1268j.a();
            Text2AudioBody text2AudioBody = this.f1028b;
            a8.b(text2AudioBody.lan, text2AudioBody.tex, this.f1029c);
            try {
                i iVar = this.f1030d;
                mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(com.artillery.ctc.d.b("text2AudioAfterPlayOverseas", this.f1028b.tid));
                iVar.a(mutableListOf, a.f1031a);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            return y5.w.INSTANCE;
        }
    }

    public static final class p extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f1032a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f1033b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ChatBodyRequest f1034c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ISimpleCallback f1035d;

        public static final class a extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.i0 f1036a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ISimpleCallback f1037b;

            /* renamed from: com.artillery.ctc.i$p$a$a, reason: collision with other inner class name */
            public static final class C0023a extends SuspendLambda implements f6.p {

                /* renamed from: a, reason: collision with root package name */
                public int f1038a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ISimpleCallback f1039b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f1040c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0023a(ISimpleCallback iSimpleCallback, String str, kotlin.coroutines.c cVar) {
                    super(2, cVar);
                    this.f1039b = iSimpleCallback;
                    this.f1040c = str;
                }

                @Override // f6.p
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
                    return ((C0023a) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                    return new C0023a(this.f1039b, this.f1040c, cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    if (this.f1038a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.g.throwOnFailure(obj);
                    this.f1039b.onSuccess(this.f1040c);
                    return y5.w.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlinx.coroutines.i0 i0Var, ISimpleCallback iSimpleCallback) {
                super(1);
                this.f1036a = i0Var;
                this.f1037b = iSimpleCallback;
            }

            public final void a(String result) {
                kotlin.jvm.internal.s.checkNotNullParameter(result, "result");
                kotlinx.coroutines.i.launch$default(this.f1036a, kotlinx.coroutines.t0.getMain(), null, new C0023a(this.f1037b, result, null), 2, null);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((String) obj);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ChatBodyRequest chatBodyRequest, ISimpleCallback iSimpleCallback, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f1034c = chatBodyRequest;
            this.f1035d = iSimpleCallback;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
            return ((p) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            p pVar = new p(this.f1034c, this.f1035d, cVar);
            pVar.f1033b = obj;
            return pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (this.f1032a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
            com.artillery.ctc.e.f774d.a().a(this.f1034c, new a((kotlinx.coroutines.i0) this.f1033b, this.f1035d));
            return y5.w.INSTANCE;
        }
    }

    public static final class p0 extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f1041a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Text2AudioSilkyBody f1042b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f6.l f1043c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(Text2AudioSilkyBody text2AudioSilkyBody, f6.l lVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f1042b = text2AudioSilkyBody;
            this.f1043c = lVar;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
            return ((p0) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new p0(this.f1042b, this.f1043c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (this.f1041a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
            com.artillery.ctc.m.f1137l.a().a(this.f1042b, this.f1043c);
            return y5.w.INSTANCE;
        }
    }

    public static final class q extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f1044a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f6.l f1045b;

        public static final class a extends SuspendLambda implements f6.p {

            /* renamed from: a, reason: collision with root package name */
            public int f1046a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f6.l f1047b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ List f1048c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f6.l lVar, List list, kotlin.coroutines.c cVar) {
                super(2, cVar);
                this.f1047b = lVar;
                this.f1048c = list;
            }

            @Override // f6.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
                return ((a) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                return new a(this.f1047b, this.f1048c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                if (this.f1046a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
                f6.l lVar = this.f1047b;
                String json = new Gson().toJson(this.f1048c);
                kotlin.jvm.internal.s.checkNotNullExpressionValue(json, "Gson().toJson(list)");
                lVar.invoke(json);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(f6.l lVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f1045b = lVar;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
            return ((q) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new q(this.f1045b, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            List split$default;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f1044a;
            try {
                if (i8 == 0) {
                    y5.g.throwOnFailure(obj);
                    split$default = StringsKt__StringsKt.split$default((CharSequence) com.artillery.ctc.h.f791d.a().c().getSupportLangure(), new String[]{SystemInfoUtil.COMMA}, false, 0, 6, (Object) null);
                    ArrayList arrayList = new ArrayList(kotlin.collections.r.collectionSizeOrDefault(split$default, 10));
                    Iterator it = split$default.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new LanguageResult((String) it.next(), null, 2, null));
                    }
                    v1 main = kotlinx.coroutines.t0.getMain();
                    a aVar = new a(this.f1045b, arrayList, null);
                    this.f1044a = 1;
                    if (kotlinx.coroutines.g.withContext(main, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.g.throwOnFailure(obj);
                }
            } catch (Exception e8) {
                e8.printStackTrace();
                this.f1045b.invoke("");
            }
            return y5.w.INSTANCE;
        }
    }

    public static final class q0 extends Lambda implements f6.l {

        /* renamed from: a, reason: collision with root package name */
        public static final q0 f1049a = new q0();

        public q0() {
            super(1);
        }

        public final void a(String it) {
            kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
            Log.d("burialPoint", "text2AudioInternal: " + it);
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class r extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f1050a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f6.l f1051b;

        public static final class a extends SuspendLambda implements f6.p {

            /* renamed from: a, reason: collision with root package name */
            public int f1052a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f6.l f1053b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ List f1054c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f6.l lVar, List list, kotlin.coroutines.c cVar) {
                super(2, cVar);
                this.f1053b = lVar;
                this.f1054c = list;
            }

            @Override // f6.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
                return ((a) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                return new a(this.f1053b, this.f1054c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                if (this.f1052a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
                f6.l lVar = this.f1053b;
                String json = new Gson().toJson(this.f1054c);
                kotlin.jvm.internal.s.checkNotNullExpressionValue(json, "Gson().toJson(list)");
                lVar.invoke(json);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(f6.l lVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f1051b = lVar;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
            return ((r) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new r(this.f1051b, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f1050a;
            try {
                if (i8 == 0) {
                    y5.g.throwOnFailure(obj);
                    List<LanguageResult> ttsConfig = com.artillery.ctc.h.f791d.a().c().getTtsConfig();
                    ArrayList arrayList = new ArrayList(kotlin.collections.r.collectionSizeOrDefault(ttsConfig, 10));
                    Iterator<T> it = ttsConfig.iterator();
                    while (it.hasNext()) {
                        arrayList.add(LanguageResult.copy$default((LanguageResult) it.next(), null, null, 3, null));
                    }
                    v1 main = kotlinx.coroutines.t0.getMain();
                    a aVar = new a(this.f1051b, arrayList, null);
                    this.f1050a = 1;
                    if (kotlinx.coroutines.g.withContext(main, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.g.throwOnFailure(obj);
                }
            } catch (Exception e8) {
                e8.printStackTrace();
                this.f1051b.invoke("");
            }
            return y5.w.INSTANCE;
        }
    }

    public static final class r0 extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f1055a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Text2AudioSilkyBody f1056b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f6.l f1057c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(Text2AudioSilkyBody text2AudioSilkyBody, f6.l lVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f1056b = text2AudioSilkyBody;
            this.f1057c = lVar;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
            return ((r0) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new r0(this.f1056b, this.f1057c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f1055a;
            if (i8 == 0) {
                y5.g.throwOnFailure(obj);
                com.artillery.ctc.w a8 = com.artillery.ctc.w.f1268j.a();
                Text2AudioSilkyBody text2AudioSilkyBody = this.f1056b;
                f6.l lVar = this.f1057c;
                this.f1055a = 1;
                if (a8.a(text2AudioSilkyBody, lVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
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

    public static final class s extends Lambda implements f6.l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ISimpleCallback f1058a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ISimpleCallback iSimpleCallback) {
            super(1);
            this.f1058a = iSimpleCallback;
        }

        public final void a(String it) {
            kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
            this.f1058a.onSuccess(it);
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class s0 extends Lambda implements f6.l {

        /* renamed from: a, reason: collision with root package name */
        public static final s0 f1059a = new s0();

        public s0() {
            super(1);
        }

        public final void a(String it) {
            kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
            Log.d("burialPoint", "text2AudioInternal: " + it);
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class t extends Lambda implements f6.l {

        /* renamed from: a, reason: collision with root package name */
        public static final t f1060a = new t();

        public t() {
            super(1);
        }

        public final void a(String it) {
            kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
            Log.d("burialPoint", "healthAnalysisWithBody: " + it);
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class t0 extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f1061a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Text2AudioSilkyBody f1062b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f6.l f1063c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t0(Text2AudioSilkyBody text2AudioSilkyBody, f6.l lVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f1062b = text2AudioSilkyBody;
            this.f1063c = lVar;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
            return ((t0) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new t0(this.f1062b, this.f1063c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (this.f1061a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
            com.artillery.ctc.w a8 = com.artillery.ctc.w.f1268j.a();
            Text2AudioSilkyBody text2AudioSilkyBody = this.f1062b;
            Text2AudioSilkyConfig text2AudioSilkyConfig = text2AudioSilkyBody.config;
            String str = text2AudioSilkyConfig != null ? text2AudioSilkyConfig.language : null;
            if (str == null) {
                str = "";
            }
            a8.a(str, text2AudioSilkyBody.text, this.f1063c);
            return y5.w.INSTANCE;
        }
    }

    public static final class u extends Lambda implements f6.l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ISimpleCallback f1064a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(ISimpleCallback iSimpleCallback) {
            super(1);
            this.f1064a = iSimpleCallback;
        }

        public final void a(String it) {
            kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
            this.f1064a.onSuccess(it);
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class u0 extends Lambda implements f6.l {

        /* renamed from: a, reason: collision with root package name */
        public static final u0 f1065a = new u0();

        public u0() {
            super(1);
        }

        public final void a(String it) {
            kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
            Log.d("burialPoint", "text2AudioInternalOverseas: " + it);
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class v extends Lambda implements f6.l {

        /* renamed from: a, reason: collision with root package name */
        public static final v f1066a = new v();

        public v() {
            super(1);
        }

        public final void a(String it) {
            kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
            Log.d("burialPoint", "healthQAWithBody: " + it);
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class v0 extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f1067a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Text2MusicBody f1068b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f6.l f1069c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v0(Text2MusicBody text2MusicBody, f6.l lVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f1068b = text2MusicBody;
            this.f1069c = lVar;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.i0 i0Var, kotlin.coroutines.c cVar) {
            return ((v0) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new v0(this.f1068b, this.f1069c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (this.f1067a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
            com.artillery.ctc.w.f1268j.a().a(this.f1068b, this.f1069c);
            return y5.w.INSTANCE;
        }
    }

    public static final class w extends Lambda implements f6.l {

        /* renamed from: a, reason: collision with root package name */
        public static final w f1070a = new w();

        public w() {
            super(1);
        }

        public final void a(OkHttpClient.Builder initialize) {
            kotlin.jvm.internal.s.checkNotNullParameter(initialize, "$this$initialize");
            TimeUnit timeUnit = TimeUnit.MINUTES;
            initialize.connectTimeout(5L, timeUnit);
            initialize.readTimeout(5L, timeUnit);
            initialize.writeTimeout(5L, timeUnit);
            q4.a.setDebug$default(initialize, false, null, 2, null);
            initialize.proxy(Proxy.NO_PROXY);
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OkHttpClient.Builder) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class w0 extends Lambda implements f6.l {

        /* renamed from: a, reason: collision with root package name */
        public static final w0 f1071a = new w0();

        public w0() {
            super(1);
        }

        public final void a(String it) {
            kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
            Log.d("burialPoint", "text2Music: " + it);
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class x extends Lambda implements f6.a {

        /* renamed from: a, reason: collision with root package name */
        public static final x f1072a = new x();

        public x() {
            super(0);
        }

        @Override // f6.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.i0 invoke() {
            return kotlinx.coroutines.j0.MainScope();
        }
    }

    public static final class x0 extends Lambda implements f6.l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ISimpleCallback f1073a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x0(ISimpleCallback iSimpleCallback) {
            super(1);
            this.f1073a = iSimpleCallback;
        }

        public final void a(String it) {
            kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
            this.f1073a.onSuccess(it);
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class y extends Lambda implements f6.a {

        /* renamed from: a, reason: collision with root package name */
        public static final y f1074a = new y();

        public y() {
            super(0);
        }

        @Override // f6.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Decoder invoke() {
            return new Decoder();
        }
    }

    public static final class y0 extends Lambda implements f6.l {

        /* renamed from: a, reason: collision with root package name */
        public static final y0 f1075a = new y0();

        public y0() {
            super(1);
        }

        public final void a(String it) {
            kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
            Log.d("burialPoint", "translateWithBody: " + it);
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class z extends Lambda implements f6.a {

        /* renamed from: a, reason: collision with root package name */
        public static final z f1076a = new z();

        public z() {
            super(0);
        }

        @Override // f6.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap invoke() {
            return new HashMap();
        }
    }

    public static final class z0 extends Lambda implements f6.l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ISimpleCallback f1077a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z0(ISimpleCallback iSimpleCallback) {
            super(1);
            this.f1077a = iSimpleCallback;
        }

        public final void a(String it) {
            kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
            this.f1077a.onSuccess(it);
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return y5.w.INSTANCE;
        }
    }

    static {
        y5.f lazy;
        lazy = kotlin.b.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (f6.a) a.f806a);
        f798i = lazy;
    }

    public /* synthetic */ i(kotlin.jvm.internal.o oVar) {
        this();
    }

    public final Decoder e() {
        return (Decoder) this.f802d.getValue();
    }

    public final HashMap f() {
        return (HashMap) this.f804f.getValue();
    }

    public final boolean g() {
        return com.artillery.ctc.h.f791d.a().e();
    }

    public final boolean h() {
        return com.artillery.ctc.h.f791d.a().c().isOversea();
    }

    public final void i() {
        com.artillery.ctc.z.f1350u.a().i();
    }

    public final List j() {
        List<LargeModel> typeList = com.artillery.ctc.h.f791d.a().c().getTypeList();
        return typeList == null ? CollectionsKt__CollectionsKt.emptyList() : typeList;
    }

    public final void k() {
        com.artillery.ctc.m.f1137l.a().d();
    }

    public final void l() {
        com.artillery.ctc.w.f1268j.a().j();
    }

    public final void m() {
        try {
            com.artillery.ctc.b0.f689e.a().f();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        try {
            com.artillery.ctc.c.f745k.a().e();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final void n() {
        com.artillery.ctc.z.f1350u.a().j();
    }

    public final void o() {
        com.artillery.ctc.w.f1268j.a().i();
    }

    public i() {
        y5.f lazy;
        y5.f lazy2;
        y5.f lazy3;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        lazy = kotlin.b.lazy(lazyThreadSafetyMode, (f6.a) x.f1072a);
        this.f799a = lazy;
        lazy2 = kotlin.b.lazy(lazyThreadSafetyMode, (f6.a) y.f1074a);
        this.f802d = lazy2;
        this.f803e = new HashMap();
        lazy3 = kotlin.b.lazy(lazyThreadSafetyMode, (f6.a) z.f1076a);
        this.f804f = lazy3;
    }

    public final void c(byte[] bytes, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(bytes, "bytes");
        com.artillery.ctc.c.f745k.a().a(bytes, z7);
    }

    public final kotlinx.coroutines.i0 d() {
        return (kotlinx.coroutines.i0) this.f799a.getValue();
    }

    public final void e(String uuid) {
        kotlin.jvm.internal.s.checkNotNullParameter(uuid, "uuid");
        l1 l1Var = (l1) this.f803e.remove(uuid);
        if (l1Var == null || !l1Var.isActive()) {
            return;
        }
        l1.a.cancel$default(l1Var, (CancellationException) null, 1, (Object) null);
    }

    public final void b() {
        try {
            com.artillery.ctc.w.f1268j.a().a();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void c(QueryBody body, ISimpleCallback call) {
        List mutableListOf;
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        a(body, new x0(call));
        try {
            mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(com.artillery.ctc.d.b("translateWithBody", ((TranslateBody) CollectionsKt___CollectionsKt.first((List) body.query)).getTid()));
            a(mutableListOf, y0.f1075a);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void d(QueryBody body, ISimpleCallback call) {
        List mutableListOf;
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        TranslateBody translateBody = (TranslateBody) CollectionsKt___CollectionsKt.first((List) body.query);
        com.artillery.ctc.w.f1268j.a().a(translateBody, new z0(call));
        try {
            mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(com.artillery.ctc.d.b("translateWithBodyOverseas", translateBody.getTid()));
            a(mutableListOf, a1.f807a);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void b(QueryBody body, ISimpleCallback call) {
        List mutableListOf;
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        a(body, new u(call));
        try {
            mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(com.artillery.ctc.d.b("healthQAWithBody", ((HealthQABody) CollectionsKt___CollectionsKt.first((List) body.query)).tid));
            a(mutableListOf, v.f1066a);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void e(byte[] bytes, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(bytes, "bytes");
        com.artillery.ctc.z.f1350u.a().b(bytes, z7);
    }

    public final void a(Context context, Map map, f6.l onSuccess, f6.l onErrorCall) {
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(map, "map");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onErrorCall, "onErrorCall");
        try {
            this.f800b = context;
            NetConfig.INSTANCE.initialize(c(), context, w.f1070a);
            a(map, onSuccess, onErrorCall);
        } catch (Exception e8) {
            e8.printStackTrace();
            String message = e8.getMessage();
            if (message == null) {
                message = "";
            }
            onErrorCall.invoke(message);
        }
    }

    public final void c(GPTInternalBody gPTInternalBody, f6.l lVar, f6.l lVar2) {
        a(gPTInternalBody, lVar, lVar2);
    }

    public final void c(Text2AudioSilkyBody body, f6.l onResult) {
        List mutableListOf;
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        kotlinx.coroutines.i.launch$default(d(), null, null, new t0(body, onResult, null), 3, null);
        try {
            mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(com.artillery.ctc.d.b("text2AudioOverseas", body.tid));
            a(mutableListOf, u0.f1065a);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void d(String uuid) {
        kotlin.jvm.internal.s.checkNotNullParameter(uuid, "uuid");
        l1 l1Var = (l1) this.f803e.remove(uuid);
        if (l1Var == null || !l1Var.isActive()) {
            return;
        }
        l1.a.cancel$default(l1Var, (CancellationException) null, 1, (Object) null);
    }

    public final void b(String uuid) {
        kotlin.jvm.internal.s.checkNotNullParameter(uuid, "uuid");
        l1 l1Var = (l1) this.f803e.remove(uuid);
        if (l1Var == null || !l1Var.isActive()) {
            return;
        }
        l1.a.cancel$default(l1Var, (CancellationException) null, 1, (Object) null);
    }

    public final void d(GPTInternalBody gPTInternalBody, f6.l lVar, f6.l lVar2) {
        b(gPTInternalBody, lVar, lVar2);
    }

    public final void b(f6.l onResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        kotlinx.coroutines.i.launch$default(d(), kotlinx.coroutines.t0.getIO(), null, new r(onResult, null), 2, null);
    }

    public final void d(byte[] bytes, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(bytes, "bytes");
        com.artillery.ctc.z.f1350u.a().a(bytes, z7);
    }

    public final void a(Map map, f6.l lVar, f6.l lVar2) {
        kotlinx.coroutines.i.launch$default(d(), kotlinx.coroutines.t0.getIO(), null, new g(map, this, lVar, lVar2, null), 2, null);
    }

    public final void b(Text2AudioSilkyBody body, f6.l onResult) {
        List mutableListOf;
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        kotlinx.coroutines.i.launch$default(d(), null, null, new r0(body, onResult, null), 3, null);
        try {
            mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(com.artillery.ctc.d.b("text2AudioInternal for iflyte", body.tid));
            a(mutableListOf, s0.f1059a);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final Locale a(Configuration configuration) {
        LocaleList locales;
        Locale locale;
        if (Build.VERSION.SDK_INT >= 24) {
            locales = configuration.getLocales();
            locale = locales.get(0);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(locale, "{\n            configurat…ocales().get(0)\n        }");
            return locale;
        }
        Locale locale2 = configuration.locale;
        kotlin.jvm.internal.s.checkNotNullExpressionValue(locale2, "{\n            configuration.locale\n        }");
        return locale2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r4.length() == 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r4.length() == 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        r2 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(AsrSilkyModel asrSilkyModel, f6.l onResult) {
        String str;
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        w.b bVar = com.artillery.ctc.w.f1268j;
        com.artillery.ctc.w a8 = bVar.a();
        String str2 = "zh-CN";
        if (asrSilkyModel != null) {
            str = asrSilkyModel.language;
        } else {
            str = bVar.a().b().language;
        }
        a8.a(str2, onResult);
    }

    public final void a(Context context) {
        com.artillery.ctc.e.f774d.a().a(context);
    }

    public final void c(String uuid) {
        kotlin.jvm.internal.s.checkNotNullParameter(uuid, "uuid");
        l1 l1Var = (l1) this.f803e.remove(uuid);
        if (l1Var == null || !l1Var.isActive()) {
            return;
        }
        l1.a.cancel$default(l1Var, (CancellationException) null, 1, (Object) null);
    }

    public final void a(Text2AudioBody body, ISimpleCallback call) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        kotlinx.coroutines.i.launch$default(d(), kotlinx.coroutines.t0.getIO(), null, new m0(body, this, call, null), 2, null);
    }

    public final void b(boolean z7) {
        com.artillery.ctc.h.f791d.a().b(z7);
    }

    public final void a(Text2AudioBody body, f6.l onFail) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onFail, "onFail");
        kotlinx.coroutines.i.launch$default(d(), kotlinx.coroutines.t0.getIO(), null, new n0(body, onFail, this, null), 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r4.length() == 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r4.length() == 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        r2 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(AsrSilkyModel asrSilkyModel, f6.l onResult) {
        String str;
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        w.b bVar = com.artillery.ctc.w.f1268j;
        com.artillery.ctc.w a8 = bVar.a();
        String str2 = "zh-CN";
        if (asrSilkyModel != null) {
            str = asrSilkyModel.language;
        } else {
            str = bVar.a().b().language;
        }
        a8.b(str2, onResult);
    }

    public final void a(Audio2TextBody body, ISimpleCallback call) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        kotlinx.coroutines.i.launch$default(d(), kotlinx.coroutines.t0.getIO(), null, new h(body, this, call, null), 2, null);
    }

    public final void c(ChatPictureRequestBody body, IChatPictureCallback call) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        kotlinx.coroutines.i.launch$default(d(), kotlinx.coroutines.t0.getIO(), null, new e(body, call, this, null), 2, null);
    }

    public final void a(Audio2TextBodyRaw body, ISimpleCallback call) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        kotlinx.coroutines.i.launch$default(d(), kotlinx.coroutines.t0.getIO(), null, new C0019i(body, this, call, null), 2, null);
    }

    public final void c(StockQueryBody body, f6.l onResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        kotlinx.coroutines.i.launch$default(d(), kotlinx.coroutines.t0.getIO(), null, new e0(body, onResult, null), 2, null);
    }

    public final void a(InputStream inputStream, f6.l onResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(inputStream, "inputStream");
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        com.artillery.ctc.b0.f689e.a().a(inputStream, onResult);
    }

    public final String c() {
        if (g()) {
            com.artillery.ctc.d.c("debug url", "ChatApi");
            return "http://test-api.lizheng.design";
        }
        com.artillery.ctc.d.c("product url", "ChatApi");
        return "https://api.lizheng.design";
    }

    public final void a(f6.a onClose, f6.a onReady, f6.l onResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(onClose, "onClose");
        kotlin.jvm.internal.s.checkNotNullParameter(onReady, "onReady");
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        com.artillery.ctc.c.f745k.a().a(onClose, onReady, onResult);
    }

    public final void b(byte[] bytes, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(bytes, "bytes");
        com.artillery.ctc.w.f1268j.a().a(bytes, z7);
    }

    public final void a(AsrModel model) {
        kotlin.jvm.internal.s.checkNotNullParameter(model, "model");
        com.artillery.ctc.b0.f689e.a().a(model);
        com.artillery.ctc.c.f745k.a().a(model);
    }

    public final void b(AsrSilkyModel asrModel) {
        kotlin.jvm.internal.s.checkNotNullParameter(asrModel, "asrModel");
        com.artillery.ctc.w.f1268j.a().b(asrModel);
    }

    public final String b(AiGcBody body, f6.l onAsrResult, IChatPictureCallback onAiGcResult) {
        l1 launch$default;
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onAsrResult, "onAsrResult");
        kotlin.jvm.internal.s.checkNotNullParameter(onAiGcResult, "onAiGcResult");
        launch$default = kotlinx.coroutines.i.launch$default(d(), kotlinx.coroutines.t0.getIO(), null, new j0(body, onAsrResult, this, onAiGcResult, null), 2, null);
        String uuid = UUID.randomUUID().toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.f803e.put(uuid, launch$default);
        return uuid;
    }

    public final void a(ChatRequestBody body, ISimpleCallback call) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        kotlinx.coroutines.i.launch$default(d(), kotlinx.coroutines.t0.getIO(), null, new l(body, this, call, null), 2, null);
    }

    public final void a(ChatBodyRequest body, ISimpleCallback block) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(block, "block");
        kotlinx.coroutines.i.launch$default(d(), kotlinx.coroutines.t0.getIO(), null, new p(body, block, null), 2, null);
    }

    public final void a(ChatPictureRequestBody body, IChatPictureCallback call) {
        List mutableListOf;
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        ChatPictureRequestBody.ChatPictureParams chatPictureParams = body.params;
        if (chatPictureParams == null) {
            chatPictureParams = new ChatPictureRequestBody.ChatPictureParams(null, null, 0, 0, 0, null, 63, null);
        }
        String str = chatPictureParams.query;
        if (str.length() == 0) {
            ChatPictureRequestBody.ChatOverseasPictureParams chatOverseasPictureParams = body.overseas;
            str = chatOverseasPictureParams != null ? chatOverseasPictureParams.prompt : null;
            if (str == null) {
                str = "";
            }
        }
        c(ChatPictureRequestBody.copy$default(body, new ChatPictureRequestBody.ChatOverseasPictureParams(str, null, null, Integer.valueOf(chatPictureParams.width), Integer.valueOf(chatPictureParams.height), Integer.valueOf(chatPictureParams.batchSize), null, chatPictureParams.style, null, null, null, null, null, null, 16198, null), null, null, null, null, 30, null), call);
        try {
            mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(com.artillery.ctc.d.b("aiImageWithBody", body.tid));
            a(mutableListOf, c.f830a);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final String b(GPTInternalBody body, f6.l lVar, f6.l onAiResult, f6.l onTtsResult) {
        l1 launch$default;
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onAiResult, "onAiResult");
        kotlin.jvm.internal.s.checkNotNullParameter(onTtsResult, "onTtsResult");
        launch$default = kotlinx.coroutines.i.launch$default(d(), kotlinx.coroutines.t0.getIO(), null, new l0(lVar, body, this, onAiResult, onTtsResult, null), 2, null);
        String uuid = UUID.randomUUID().toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.f803e.put(uuid, launch$default);
        return uuid;
    }

    public final void b(ChatPictureRequestBody body, IChatPictureCallback call) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        kotlinx.coroutines.i.launch$default(d(), kotlinx.coroutines.t0.getIO(), null, new d(body, call, this, null), 2, null);
    }

    public final void b(Audio2TextBodyRaw body, ISimpleCallback call) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        kotlinx.coroutines.i.launch$default(d(), kotlinx.coroutines.t0.getIO(), null, new j(body, this, call, null), 2, null);
    }

    public final void b(Text2AudioBody body, f6.l onFail) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onFail, "onFail");
        kotlinx.coroutines.i.launch$default(d(), kotlinx.coroutines.t0.getIO(), null, new o0(body, onFail, this, null), 2, null);
    }

    public final void b(GPTInternalBody gPTInternalBody, f6.l lVar, f6.l lVar2) {
        b(gPTInternalBody.gptBody, new b0(lVar, this, gPTInternalBody, lVar2));
    }

    public final void b(ChatRequestBody body, ISimpleCallback call) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        kotlinx.coroutines.i.launch$default(d(), kotlinx.coroutines.t0.getIO(), null, new m(body, this, call, null), 2, null);
    }

    public final void b(NetChatBody body, IResultCallback call) {
        l1 launch$default;
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        l1 l1Var = this.f805g;
        if (l1Var != null) {
            l1.a.cancel$default(l1Var, (CancellationException) null, 1, (Object) null);
        }
        launch$default = kotlinx.coroutines.i.launch$default(d(), kotlinx.coroutines.t0.getIO(), null, new o(body, call, this, null), 2, null);
        this.f805g = launch$default;
    }

    public final void b(StockQueryBody body, f6.l onResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        kotlinx.coroutines.i.launch$default(d(), kotlinx.coroutines.t0.getIO(), null, new d0(body, onResult, null), 2, null);
    }

    public final void b(z.a aVar, f6.l asrCallback, f6.l translateCallback, f6.l ttsPathCallback) {
        kotlin.jvm.internal.s.checkNotNullParameter(asrCallback, "asrCallback");
        kotlin.jvm.internal.s.checkNotNullParameter(translateCallback, "translateCallback");
        kotlin.jvm.internal.s.checkNotNullParameter(ttsPathCallback, "ttsPathCallback");
        com.artillery.ctc.z.f1350u.a().b(aVar, new h0(asrCallback, this, translateCallback, ttsPathCallback));
    }

    public final void a(QueryBody body, ISimpleCallback call) {
        List mutableListOf;
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        a(body, new s(call));
        try {
            mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(com.artillery.ctc.d.b("healthAnalysisWithBody", ((HealthDataBody) CollectionsKt___CollectionsKt.first((List) body.query)).tid));
            a(mutableListOf, t.f1060a);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void a(QueryBody queryBody, f6.l lVar) {
        kotlinx.coroutines.i.launch$default(d(), kotlinx.coroutines.t0.getIO(), null, new b1(queryBody, lVar, null), 2, null);
    }

    public final String a(GPTInternalBody body, f6.l lVar, f6.l onAiResult, f6.l onTtsResult) {
        l1 launch$default;
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onAiResult, "onAiResult");
        kotlin.jvm.internal.s.checkNotNullParameter(onTtsResult, "onTtsResult");
        launch$default = kotlinx.coroutines.i.launch$default(d(), kotlinx.coroutines.t0.getIO(), null, new k0(lVar, body, this, onAiResult, onTtsResult, null), 2, null);
        String uuid = UUID.randomUUID().toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.f803e.put(uuid, launch$default);
        return uuid;
    }

    public final String a(String str, String str2) {
        String str3 = (String) f().get(str);
        if (str3 == null) {
            str3 = "";
        }
        String str4 = str3 + str2;
        kotlin.jvm.internal.s.checkNotNullExpressionValue(str4, "StringBuilder().apply(builderAction).toString()");
        f().put(str, str4);
        return str4;
    }

    public final void a(GPTInternalBody gPTInternalBody, f6.l lVar, f6.l lVar2) {
        a(gPTInternalBody.gptBody, new b(lVar, this, gPTInternalBody, lVar2));
    }

    public final ChatResponseResult a(String str) {
        Object fromJson = new Gson().fromJson(str, (Class<Object>) ChatResponseResult.class);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(fromJson, "Gson().fromJson(json, Ch…sponseResult::class.java)");
        return (ChatResponseResult) fromJson;
    }

    public final String a(AiGcBody body, f6.l onAsrResult, IChatPictureCallback onAiGcResult) {
        l1 launch$default;
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onAsrResult, "onAsrResult");
        kotlin.jvm.internal.s.checkNotNullParameter(onAiGcResult, "onAiGcResult");
        launch$default = kotlinx.coroutines.i.launch$default(d(), kotlinx.coroutines.t0.getIO(), null, new i0(body, onAsrResult, this, onAiGcResult, null), 2, null);
        String uuid = UUID.randomUUID().toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.f803e.put(uuid, launch$default);
        return uuid;
    }

    public final void a(AsrSilkyModel asrSilkyModel, f6.l onResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        com.artillery.ctc.m.f1137l.a().a(asrSilkyModel, onResult);
    }

    public final void a(byte[] bytes, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(bytes, "bytes");
        com.artillery.ctc.m.f1137l.a().a(bytes, z7);
    }

    public final void a(AsrSilkyModel asrModel) {
        kotlin.jvm.internal.s.checkNotNullParameter(asrModel, "asrModel");
        com.artillery.ctc.m.f1137l.a().b(asrModel);
    }

    public final void a(f6.l onResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        kotlinx.coroutines.i.launch$default(d(), kotlinx.coroutines.t0.getIO(), null, new q(onResult, null), 2, null);
    }

    public final void a(Text2AudioSilkyBody body, f6.l onResult) {
        List mutableListOf;
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        kotlinx.coroutines.i.launch$default(d(), null, null, new p0(body, onResult, null), 3, null);
        try {
            mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(com.artillery.ctc.d.b("text2AudioInternal for iflyte", body.tid));
            a(mutableListOf, q0.f1049a);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void a(Text2MusicBody body, f6.l onResult) {
        List mutableListOf;
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        kotlinx.coroutines.i.launch$default(d(), kotlinx.coroutines.t0.getIO(), null, new v0(body, onResult, null), 2, null);
        try {
            String uuid = UUID.randomUUID().toString();
            kotlin.jvm.internal.s.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(com.artillery.ctc.d.b("text2Music", uuid));
            a(mutableListOf, w0.f1071a);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void a(List list, f6.l onResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "list");
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        kotlinx.coroutines.i.launch$default(d(), kotlinx.coroutines.t0.getIO(), null, new k(onResult, list, null), 2, null);
    }

    public final void a(boolean z7) {
        com.artillery.ctc.h.f791d.a().a(z7);
    }

    public final void a(int i8, String str, f6.l onCall) {
        kotlin.jvm.internal.s.checkNotNullParameter(onCall, "onCall");
        kotlinx.coroutines.i.launch$default(d(), kotlinx.coroutines.t0.getIO(), null, new f(onCall, str, i8, null), 2, null);
    }

    public final void a(NetChatBody body, IResultCallback call) {
        l1 launch$default;
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(call, "call");
        l1 l1Var = this.f805g;
        if (l1Var != null) {
            l1.a.cancel$default(l1Var, (CancellationException) null, 1, (Object) null);
        }
        if (!kotlin.jvm.internal.s.areEqual(body.param.enableSearch, Boolean.TRUE)) {
            launch$default = kotlinx.coroutines.i.launch$default(d(), kotlinx.coroutines.t0.getIO(), null, new n(body, call, this, null), 2, null);
            this.f805g = launch$default;
        } else {
            b(NetChatBody.copy$default(body, null, 2, null, 5, null), call);
        }
    }

    public final void a(StockQueryBody body, f6.l onResult) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(onResult, "onResult");
        kotlinx.coroutines.i.launch$default(d(), kotlinx.coroutines.t0.getIO(), null, new c0(body, onResult, null), 2, null);
    }

    public final void a(z.a aVar, f6.l asrCallback, f6.l translateCallback, f6.l ttsPathCallback) {
        kotlin.jvm.internal.s.checkNotNullParameter(asrCallback, "asrCallback");
        kotlin.jvm.internal.s.checkNotNullParameter(translateCallback, "translateCallback");
        kotlin.jvm.internal.s.checkNotNullParameter(ttsPathCallback, "ttsPathCallback");
        this.f801c = aVar;
        com.artillery.ctc.z.f1350u.a().a(aVar, new g0(asrCallback, this, translateCallback, ttsPathCallback));
    }

    public final void a(z.a body) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        this.f801c = body;
        com.artillery.ctc.z.f1350u.a().a(body);
    }

    public final void a(SmartRecognizeAsrResult smartRecognizeAsrResult, z.a aVar, f6.l lVar) {
        List split$default;
        List split$default2;
        if (kotlin.jvm.internal.s.areEqual(smartRecognizeAsrResult.getStatus(), "0")) {
            z.a aVar2 = this.f801c;
            kotlin.jvm.internal.s.checkNotNull(aVar2);
            z.e parameter = aVar2.getParameter();
            kotlin.jvm.internal.s.checkNotNull(parameter);
            z.g streamtrans = parameter.getStreamtrans();
            kotlin.jvm.internal.s.checkNotNull(streamtrans);
            split$default = StringsKt__StringsKt.split$default((CharSequence) streamtrans.getFrom(), new String[]{"-"}, false, 0, 6, (Object) null);
            String str = (String) split$default.get(0);
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            split$default2 = StringsKt__StringsKt.split$default((CharSequence) streamtrans.getTo(), new String[]{"-"}, false, 0, 6, (Object) null);
            String lowerCase2 = ((String) split$default2.get(0)).toLowerCase(locale);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (kotlin.jvm.internal.s.areEqual(smartRecognizeAsrResult.getLanguage(), lowerCase) || !kotlin.jvm.internal.s.areEqual(smartRecognizeAsrResult.getLanguage(), lowerCase2)) {
                lowerCase = lowerCase2;
            }
            if (!kotlin.jvm.internal.s.areEqual(smartRecognizeAsrResult.getLanguage(), lowerCase)) {
                List listOf = kotlin.collections.q.listOf(new TranslateBody(smartRecognizeAsrResult.getText(), smartRecognizeAsrResult.getLanguage(), lowerCase, 2, ""));
                String uuid = UUID.randomUUID().toString();
                kotlin.jvm.internal.s.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
                c(new QueryBody(listOf, uuid), new f0(smartRecognizeAsrResult, lVar, lowerCase));
                return;
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("translateText", smartRecognizeAsrResult.getText());
            jsonObject.addProperty("sourceText", smartRecognizeAsrResult.getText());
            jsonObject.addProperty("index", Integer.valueOf(smartRecognizeAsrResult.getIndex()));
            jsonObject.addProperty("targetLanguage", lowerCase);
            String a8 = y.g.a(jsonObject);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(a8, "toJson(JsonObject().appl…guage)\n                })");
            lVar.invoke(a8);
        }
    }
}
