package com.artillery.ctc;

import com.artillery.ctc.base.ChatOverseasSearchKey;
import com.artillery.ctc.base.ChatPictureRequestBody;
import com.artillery.ctc.base.ChatRequestBody;
import com.artillery.ctc.base.Content;
import com.artillery.ctc.base.DirectChatBody;
import com.artillery.ctc.base.NetChatBody;
import com.artillery.ctc.base.NetChatBodyAddMessageResult;
import com.artillery.ctc.base.NetChatBodyCreatThreadResult;
import com.artillery.ctc.base.NetChatBodyResult;
import com.artillery.ctc.base.NetChatBodyTokenResult;
import com.artillery.ctc.base.NetChatSearchResultItem;
import com.artillery.ctc.base.NetChatUsageItem;
import com.artillery.ctc.base.NetSearchThreadMessageItem;
import com.artillery.ctc.base.OverseasConfigModel;
import com.artillery.ctc.base.Text2ImageResult;
import com.artillery.ctc.interfaces.IResultCallback;
import com.artillery.ctc.uitls.StringUtils;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.drake.net.NetConfig;
import com.drake.net.exception.ConvertException;
import com.drake.net.exception.NetException;
import com.drake.net.internal.NetDeferred;
import com.drake.net.request.Method;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l0;
import kotlin.collections.m0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.TypesJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.g0;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.o1;
import kotlinx.coroutines.t0;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1177a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final y5.f f1178b;

    public static final class a extends Lambda implements f6.a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1179a = new a();

        public a() {
            super(0);
        }

        @Override // f6.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s invoke() {
            return new s(null);
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.o oVar) {
            this();
        }

        public final s a() {
            return b();
        }

        public final s b() {
            return (s) s.f1178b.getValue();
        }
    }

    public static final class c extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f1180a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f1181b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f1182c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f1183d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f6.l f1184e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Object obj, f6.l lVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f1182c = str;
            this.f1183d = obj;
            this.f1184e = lVar;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
            return ((c) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            c cVar2 = new c(this.f1182c, this.f1183d, this.f1184e, cVar);
            cVar2.f1181b = obj;
            return cVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (this.f1180a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
            i0 i0Var = (i0) this.f1181b;
            o1.ensureActive(i0Var.getCoroutineContext());
            r4.f fVar = new r4.f();
            String str = this.f1182c;
            Object obj2 = this.f1183d;
            f6.l lVar = this.f1184e;
            fVar.setPath(str);
            fVar.setMethod(Method.GET);
            fVar.setGroup(i0Var.getCoroutineContext().get(g0.Key));
            fVar.tag(obj2);
            if (lVar != null) {
                lVar.invoke(fVar);
            }
            NetConfig.INSTANCE.getRequestInterceptor();
            r4.d.setKType(fVar.getOkHttpRequest(), kotlin.jvm.internal.u.typeOf(File.class));
            Response execute = fVar.getOkHttpClient().newCall(fVar.buildRequest()).execute();
            try {
                Object onConvert = r4.e.converter(execute.request()).onConvert(TypesJVMKt.getJavaType(kotlin.jvm.internal.u.typeOf(File.class)), execute);
                if (onConvert != null) {
                    return (File) onConvert;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.io.File");
            } catch (NetException e8) {
                throw e8;
            } catch (CancellationException e9) {
                throw e9;
            } catch (Throwable th) {
                throw new ConvertException(execute, "An unexpected error occurred in the converter", th, null, 8, null);
            }
        }
    }

    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f1185a;

        /* renamed from: b, reason: collision with root package name */
        public Object f1186b;

        /* renamed from: c, reason: collision with root package name */
        public Object f1187c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f1188d;

        /* renamed from: f, reason: collision with root package name */
        public int f1190f;

        public d(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f1188d = obj;
            this.f1190f |= Integer.MIN_VALUE;
            return s.this.a((i0) null, (String) null, (String) null, (String) null, this);
        }
    }

    public static final class e extends Lambda implements f6.l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f1191a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f1192b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(File file, String str) {
            super(1);
            this.f1191a = file;
            this.f1192b = str;
        }

        public final void a(r4.f Get) {
            kotlin.jvm.internal.s.checkNotNullParameter(Get, "$this$Get");
            File targetFile = this.f1191a;
            kotlin.jvm.internal.s.checkNotNullExpressionValue(targetFile, "targetFile");
            Get.setDownloadDir(targetFile);
            Get.setDownloadFileName(this.f1192b);
            Get.setDownloadTempFile(true);
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r4.f) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f1193a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f1194b;

        /* renamed from: d, reason: collision with root package name */
        public int f1196d;

        public f(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f1194b = obj;
            this.f1196d |= Integer.MIN_VALUE;
            return s.this.a(null, null, this);
        }
    }

    public static final class g extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public int f1197a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ChatRequestBody f1198b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s f1199c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ OverseasConfigModel f1200d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f6.l f1201e;

        public static final class a extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f6.l f1202a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChatRequestBody f1203b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f6.l lVar, ChatRequestBody chatRequestBody) {
                super(1);
                this.f1202a = lVar;
                this.f1203b = chatRequestBody;
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
                com.artillery.ctc.d.a("OverseasGPTB postChat->结果:" + obj, null, 1, null);
                if (!kotlin.jvm.internal.s.areEqual(obj, "[DONE]") && obj.length() > 0) {
                    try {
                        f6.l lVar = this.f1202a;
                        JSONObject jSONObject = new JSONObject(obj);
                        ChatRequestBody.Oversea oversea = this.f1203b.oversea;
                        String str = oversea != null ? oversea.qid : null;
                        if (str == null) {
                            str = "";
                        }
                        jSONObject.put(MapBundleKey.MapObjKey.OBJ_QID, str);
                        String jSONObject2 = jSONObject.toString();
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(jSONObject2, "JSONObject(tempJson).app…             }.toString()");
                        lVar.invoke(jSONObject2);
                    } catch (Exception e8) {
                        e8.printStackTrace();
                        this.f1202a.invoke(obj);
                    }
                }
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((String) obj);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ChatRequestBody chatRequestBody, s sVar, OverseasConfigModel overseasConfigModel, f6.l lVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f1198b = chatRequestBody;
            this.f1199c = sVar;
            this.f1200d = overseasConfigModel;
            this.f1201e = lVar;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
            return ((g) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new g(this.f1198b, this.f1199c, this.f1200d, this.f1201e, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ChatRequestBody.Oversea oversea;
            String obj2;
            String replace$default;
            Boolean bool;
            ResponseBody body;
            kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (this.f1197a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y5.g.throwOnFailure(obj);
            ChatRequestBody chatRequestBody = this.f1198b;
            ChatRequestBody.Data data = chatRequestBody.data;
            if ((data == null || !data.stream) && ((oversea = chatRequestBody.oversea) == null || (bool = oversea.stream) == null || !bool.booleanValue())) {
                r4.b post$default = com.drake.net.a.post$default(com.artillery.ctc.a.f674a.c("gpt"), null, new t(this.f1200d, this.f1198b), 2, null);
                NetConfig.INSTANCE.getRequestInterceptor();
                r4.d.setKType(post$default.getOkHttpRequest(), kotlin.jvm.internal.u.nullableTypeOf(String.class));
                Response execute = post$default.getOkHttpClient().newCall(post$default.buildRequest()).execute();
                try {
                    String str = (String) r4.e.converter(execute.request()).onConvert(TypesJVMKt.getJavaType(kotlin.jvm.internal.u.nullableTypeOf(String.class)), execute);
                    String str2 = str == null ? "" : str;
                    if (kotlin.text.t.startsWith$default(str2, "data:", false, 2, null)) {
                        replace$default = kotlin.text.t.replace$default(str2, "data:", "", false, 4, (Object) null);
                        obj2 = StringsKt__StringsKt.trim((CharSequence) replace$default).toString();
                    } else {
                        obj2 = StringsKt__StringsKt.trim((CharSequence) str2).toString();
                    }
                    f6.l lVar = this.f1201e;
                    JSONObject jSONObject = new JSONObject(obj2);
                    ChatRequestBody.Oversea oversea2 = this.f1198b.oversea;
                    r4 = oversea2 != null ? oversea2.qid : null;
                    jSONObject.put(MapBundleKey.MapObjKey.OBJ_QID, r4 != null ? r4 : "");
                    String jSONObject2 = jSONObject.toString();
                    kotlin.jvm.internal.s.checkNotNullExpressionValue(jSONObject2, "JSONObject(tempJson).app…             }.toString()");
                    lVar.invoke(jSONObject2);
                } catch (NetException e8) {
                    throw e8;
                } catch (CancellationException e9) {
                    throw e9;
                } catch (Throwable th) {
                    throw new ConvertException(execute, "An unexpected error occurred in the converter", th, null, 8, null);
                }
            } else {
                r4.b post$default2 = com.drake.net.a.post$default(com.artillery.ctc.a.f674a.c("gpt"), null, new t(this.f1200d, this.f1198b), 2, null);
                NetConfig.INSTANCE.getRequestInterceptor();
                r4.d.setKType(post$default2.getOkHttpRequest(), kotlin.jvm.internal.u.nullableTypeOf(Response.class));
                Response execute2 = post$default2.getOkHttpClient().newCall(post$default2.buildRequest()).execute();
                try {
                    Response response = (Response) r4.e.converter(execute2.request()).onConvert(TypesJVMKt.getJavaType(kotlin.jvm.internal.u.nullableTypeOf(Response.class)), execute2);
                    if (response != null && (body = response.body()) != null) {
                        f6.l lVar2 = this.f1201e;
                        ChatRequestBody chatRequestBody2 = this.f1198b;
                        InputStream byteStream = body.byteStream();
                        try {
                            TextStreamsKt.forEachLine(new BufferedReader(new InputStreamReader(byteStream)), new a(lVar2, chatRequestBody2));
                            y5.w wVar = y5.w.INSTANCE;
                            kotlin.io.b.closeFinally(byteStream, null);
                            r4 = y5.w.INSTANCE;
                        } finally {
                        }
                    }
                    if (r4 == null) {
                        this.f1201e.invoke("");
                    }
                } catch (NetException e10) {
                    throw e10;
                } catch (CancellationException e11) {
                    throw e11;
                } catch (Throwable th2) {
                    throw new ConvertException(execute2, "An unexpected error occurred in the converter", th2, null, 8, null);
                }
            }
            return y5.w.INSTANCE;
        }
    }

    public static final class h extends Lambda implements f6.l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f1204a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IResultCallback f1205b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ NetChatBody f1206c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z7, IResultCallback iResultCallback, NetChatBody netChatBody) {
            super(1);
            this.f1204a = z7;
            this.f1205b = iResultCallback;
            this.f1206c = netChatBody;
        }

        public final void a(String json) {
            String replace$default;
            String str;
            Map mapOf;
            Map mapOf2;
            Map mapOf3;
            Map mapOf4;
            Map mapOf5;
            Map mapOf6;
            kotlin.jvm.internal.s.checkNotNullParameter(json, "json");
            if (!kotlin.text.t.startsWith$default(json, "data:", false, 2, null)) {
                StringsKt__StringsKt.trim((CharSequence) json).toString();
                return;
            }
            replace$default = kotlin.text.t.replace$default(json, "data:", "", false, 4, (Object) null);
            String obj = StringsKt__StringsKt.trim((CharSequence) replace$default).toString();
            try {
                if (kotlin.jvm.internal.s.areEqual(obj, "[DONE]")) {
                    return;
                }
                NetChatSearchResultItem netChatSearchResultItem = (NetChatSearchResultItem) y.g.a(obj, NetChatSearchResultItem.class);
                boolean areEqual = kotlin.jvm.internal.s.areEqual(netChatSearchResultItem.getObject(), "thread.message.delta");
                String str2 = MapBundleKey.MapObjKey.OBJ_QID;
                if (areEqual) {
                    Pair[] pairArr = new Pair[5];
                    List<Content> content = netChatSearchResultItem.getDelta().getContent();
                    ArrayList arrayList = new ArrayList(kotlin.collections.r.collectionSizeOrDefault(content, 10));
                    Iterator it = content.iterator();
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        mapOf5 = m0.mapOf(y5.h.to(FirebaseAnalytics.Param.CONTENT, ((Content) it.next()).getText().getValue()), y5.h.to("finish_reason", null));
                        mapOf6 = l0.mapOf(y5.h.to("delta", mapOf5));
                        arrayList.add(mapOf6);
                        it = it2;
                        str2 = str2;
                    }
                    String str3 = str2;
                    pairArr[0] = y5.h.to("choices", CollectionsKt___CollectionsKt.toList(arrayList));
                    pairArr[1] = y5.h.to("id", netChatSearchResultItem.getId());
                    pairArr[2] = y5.h.to("created", 0);
                    pairArr[3] = y5.h.to(com.liulishuo.filedownloader.services.f.KEY_MODEL, "gpt-4o-2024-08-06");
                    pairArr[4] = y5.h.to("object", netChatSearchResultItem.getObject());
                    mapOf4 = m0.mapOf(pairArr);
                    if (this.f1204a) {
                        IResultCallback iResultCallback = this.f1205b;
                        JSONObject jSONObject = new JSONObject(mapOf4);
                        String str4 = this.f1206c.requestId;
                        if (str4 == null) {
                            str4 = "";
                        }
                        jSONObject.put(str3, str4);
                        iResultCallback.onSuccess(jSONObject.toString());
                        return;
                    }
                    return;
                }
                if (!kotlin.jvm.internal.s.areEqual(netChatSearchResultItem.getObject(), "thread.message") || (!kotlin.jvm.internal.s.areEqual(netChatSearchResultItem.getStatus(), "completed") && !kotlin.jvm.internal.s.areEqual(netChatSearchResultItem.getStatus(), "incomplete"))) {
                    if (kotlin.jvm.internal.s.areEqual(netChatSearchResultItem.getObject(), "thread.run")) {
                        if (kotlin.jvm.internal.s.areEqual(netChatSearchResultItem.getStatus(), "completed") || kotlin.jvm.internal.s.areEqual(netChatSearchResultItem.getStatus(), "incomplete")) {
                            try {
                                NetChatUsageItem usage = netChatSearchResultItem.getUsage();
                                if (usage != null) {
                                    com.artillery.ctc.d.a("total_tokens:" + usage.getTotal_tokens() + ", prompt_tokens:" + usage.getPrompt_tokens() + ", completion_tokens:" + usage.getCompletion_tokens(), null, 1, null);
                                    return;
                                }
                                return;
                            } catch (Exception e8) {
                                e8.printStackTrace();
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                NetSearchThreadMessageItem netSearchThreadMessageItem = (NetSearchThreadMessageItem) y.g.a(obj, NetSearchThreadMessageItem.class);
                Map tempItem = (Map) y.g.a(obj, Map.class);
                kotlin.jvm.internal.s.checkNotNullExpressionValue(tempItem, "tempItem");
                Object obj2 = tempItem.get(FirebaseAnalytics.Param.CONTENT);
                kotlin.jvm.internal.s.checkNotNull(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.collections.Map<*, *>>");
                ArrayList arrayList2 = (ArrayList) obj2;
                if (!(!arrayList2.isEmpty()) || this.f1204a) {
                    str = "";
                } else {
                    Object obj3 = arrayList2.get(0);
                    kotlin.jvm.internal.s.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                    Object obj4 = ((Map) obj3).get("text");
                    kotlin.jvm.internal.s.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                    str = String.valueOf(((Map) obj4).get("value"));
                }
                mapOf = l0.mapOf(y5.h.to(FirebaseAnalytics.Param.CONTENT, str));
                mapOf2 = m0.mapOf(y5.h.to("delta", mapOf), y5.h.to("finish_reason", "stop"));
                mapOf3 = m0.mapOf(y5.h.to("choices", kotlin.collections.q.listOf(mapOf2)), y5.h.to("id", netChatSearchResultItem.getId()), y5.h.to("created", Integer.valueOf(netSearchThreadMessageItem.getCreated_at())), y5.h.to(com.liulishuo.filedownloader.services.f.KEY_MODEL, "gpt-4o-2024-08-06"), y5.h.to("object", netSearchThreadMessageItem.getObject()), y5.h.to("finish_reason", "stop"));
                IResultCallback iResultCallback2 = this.f1205b;
                JSONObject jSONObject2 = new JSONObject(mapOf3);
                String str5 = this.f1206c.requestId;
                if (str5 == null) {
                    str5 = "";
                }
                jSONObject2.put(MapBundleKey.MapObjKey.OBJ_QID, str5);
                iResultCallback2.onSuccess(jSONObject2.toString());
            } catch (Exception e9) {
                e9.printStackTrace();
                this.f1205b.onSuccess(json);
            }
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class i extends Lambda implements f6.l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ChatOverseasSearchKey f1207a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ NetChatBodyTokenResult f1208b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ NetChatBody f1209c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ChatOverseasSearchKey chatOverseasSearchKey, NetChatBodyTokenResult netChatBodyTokenResult, NetChatBody netChatBody) {
            super(1);
            this.f1207a = chatOverseasSearchKey;
            this.f1208b = netChatBodyTokenResult;
            this.f1209c = netChatBody;
        }

        public final void a(r4.b post) {
            Map mapOf;
            kotlin.jvm.internal.s.checkNotNullParameter(post, "$this$post");
            r4.a.addQuery$default(post, "api-version", this.f1207a.getApiVersion(), false, 4, null);
            post.addHeader("Authorization", this.f1208b.getToken_type() + ' ' + this.f1208b.getAccess_token());
            Gson gson = new Gson();
            mapOf = m0.mapOf(y5.h.to("role", com.moyoung.lib.ai.chat.b.ROLE_USER), y5.h.to(FirebaseAnalytics.Param.CONTENT, this.f1209c.param.prompt));
            post.json(gson.toJson(mapOf));
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r4.b) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class j extends Lambda implements f6.l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ChatOverseasSearchKey f1210a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ NetChatBodyTokenResult f1211b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ChatOverseasSearchKey chatOverseasSearchKey, NetChatBodyTokenResult netChatBodyTokenResult) {
            super(1);
            this.f1210a = chatOverseasSearchKey;
            this.f1211b = netChatBodyTokenResult;
        }

        public final void a(r4.b post) {
            kotlin.jvm.internal.s.checkNotNullParameter(post, "$this$post");
            r4.a.addQuery$default(post, "api-version", this.f1210a.getApiVersion(), false, 4, null);
            post.addHeader("Authorization", this.f1211b.getToken_type() + ' ' + this.f1211b.getAccess_token());
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r4.b) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class k extends Lambda implements f6.l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ChatOverseasSearchKey f1212a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ChatOverseasSearchKey chatOverseasSearchKey) {
            super(1);
            this.f1212a = chatOverseasSearchKey;
        }

        public final void a(r4.b post) {
            kotlin.jvm.internal.s.checkNotNullParameter(post, "$this$post");
            post.param("grant_type", "client_credentials");
            post.param("client_id", this.f1212a.getAppId());
            post.param("client_secret", this.f1212a.getPassword());
            post.param("resource", "https://ai.azure.com");
            post.param("subscriptionId", this.f1212a.getSubscriptionId());
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r4.b) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class l extends Lambda implements f6.l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ OverseasConfigModel f1213a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ NetChatBody f1214b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(OverseasConfigModel overseasConfigModel, NetChatBody netChatBody) {
            super(1);
            this.f1213a = overseasConfigModel;
            this.f1214b = netChatBody;
        }

        public final void a(r4.b post) {
            kotlin.jvm.internal.s.checkNotNullParameter(post, "$this$post");
            r4.a.addQuery$default(post, "ak", this.f1213a.getAk(), false, 4, null);
            r4.a.addQuery$default(post, "sn", this.f1213a.getSn(), false, 4, null);
            post.json(new Gson().toJson(this.f1214b));
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r4.b) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class m extends Lambda implements f6.l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IResultCallback f1215a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ NetChatBody f1216b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(IResultCallback iResultCallback, NetChatBody netChatBody) {
            super(1);
            this.f1215a = iResultCallback;
            this.f1216b = netChatBody;
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
            if (!kotlin.jvm.internal.s.areEqual(obj, "[DONE]") && obj.length() > 0) {
                try {
                    IResultCallback iResultCallback = this.f1215a;
                    JSONObject jSONObject = new JSONObject(obj);
                    String str = this.f1216b.requestId;
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put(MapBundleKey.MapObjKey.OBJ_QID, str);
                    iResultCallback.onSuccess(jSONObject.toString());
                } catch (Exception e8) {
                    e8.printStackTrace();
                    this.f1215a.onSuccess(obj);
                }
            }
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class n extends Lambda implements f6.l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ OverseasConfigModel f1217a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ NetChatBody f1218b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(OverseasConfigModel overseasConfigModel, NetChatBody netChatBody) {
            super(1);
            this.f1217a = overseasConfigModel;
            this.f1218b = netChatBody;
        }

        public final void a(r4.b post) {
            kotlin.jvm.internal.s.checkNotNullParameter(post, "$this$post");
            r4.a.addQuery$default(post, "ak", this.f1217a.getAk(), false, 4, null);
            r4.a.addQuery$default(post, "sn", this.f1217a.getSn(), false, 4, null);
            post.json(new Gson().toJson(this.f1218b));
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r4.b) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class o extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f1219a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f1220b;

        /* renamed from: d, reason: collision with root package name */
        public int f1222d;

        public o(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f1220b = obj;
            this.f1222d |= Integer.MIN_VALUE;
            return s.this.a(null, null, null, this);
        }
    }

    public static final class p extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public Object f1223a;

        /* renamed from: b, reason: collision with root package name */
        public Object f1224b;

        /* renamed from: c, reason: collision with root package name */
        public Object f1225c;

        /* renamed from: d, reason: collision with root package name */
        public Object f1226d;

        /* renamed from: e, reason: collision with root package name */
        public int f1227e;

        /* renamed from: f, reason: collision with root package name */
        public int f1228f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f1229g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ f6.p f1230h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ f6.l f1231i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ OverseasConfigModel f1232j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ ChatPictureRequestBody f1233k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ s f1234l;

        public static final class a extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ OverseasConfigModel f1235a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChatPictureRequestBody f1236b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(OverseasConfigModel overseasConfigModel, ChatPictureRequestBody chatPictureRequestBody) {
                super(1);
                this.f1235a = overseasConfigModel;
                this.f1236b = chatPictureRequestBody;
            }

            public final void a(r4.b post) {
                kotlin.jvm.internal.s.checkNotNullParameter(post, "$this$post");
                r4.a.addQuery$default(post, "ak", this.f1235a.getAk(), false, 4, null);
                r4.a.addQuery$default(post, "sn", this.f1235a.getSn(), false, 4, null);
                post.json(new Gson().toJson(this.f1236b.overseas));
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((r4.b) obj);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(f6.p pVar, f6.l lVar, OverseasConfigModel overseasConfigModel, ChatPictureRequestBody chatPictureRequestBody, s sVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f1230h = pVar;
            this.f1231i = lVar;
            this.f1232j = overseasConfigModel;
            this.f1233k = chatPictureRequestBody;
            this.f1234l = sVar;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
            return ((p) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            p pVar = new p(this.f1230h, this.f1231i, this.f1232j, this.f1233k, this.f1234l, cVar);
            pVar.f1229g = obj;
            return pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0191  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0134  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0184 -> B:5:0x0189). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            List flatten;
            p pVar;
            i0 i0Var;
            Iterator it;
            s sVar;
            Collection collection;
            int i8;
            Text2ImageResult.RowDataResult data;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i9 = this.f1228f;
            if (i9 == 0) {
                y5.g.throwOnFailure(obj);
                i0 i0Var2 = (i0) this.f1229g;
                List<Text2ImageResult.TaskResult> list = null;
                r4.b post$default = com.drake.net.a.post$default("https://swapi.yueqizhixiang.com/llm/txt2imgv2", null, new a(this.f1232j, this.f1233k), 2, null);
                NetConfig.INSTANCE.getRequestInterceptor();
                r4.d.setKType(post$default.getOkHttpRequest(), kotlin.jvm.internal.u.typeOf(String.class));
                Response execute = post$default.getOkHttpClient().newCall(post$default.buildRequest()).execute();
                try {
                    Object onConvert = r4.e.converter(execute.request()).onConvert(TypesJVMKt.getJavaType(kotlin.jvm.internal.u.typeOf(String.class)), execute);
                    if (onConvert == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    String str = (String) onConvert;
                    if (str.length() == 0) {
                        this.f1230h.invoke(kotlin.coroutines.jvm.internal.a.boxInt(-111), "");
                    } else {
                        Text2ImageResult text2ImageResult = (Text2ImageResult) new Gson().fromJson(str, Text2ImageResult.class);
                        if (text2ImageResult.isSuccess()) {
                            Text2ImageResult.RowResult rows = text2ImageResult.getRows();
                            if (rows != null && (data = rows.getData()) != null) {
                                list = data.getSub_task_result_list();
                            }
                            if (list == null) {
                                list = CollectionsKt__CollectionsKt.emptyList();
                            }
                            ArrayList arrayList = new ArrayList(kotlin.collections.r.collectionSizeOrDefault(list, 10));
                            Iterator<T> it2 = list.iterator();
                            while (it2.hasNext()) {
                                List<Text2ImageResult.TaskImageResult> final_image_list = ((Text2ImageResult.TaskResult) it2.next()).getFinal_image_list();
                                ArrayList arrayList2 = new ArrayList(kotlin.collections.r.collectionSizeOrDefault(final_image_list, 10));
                                for (Text2ImageResult.TaskImageResult taskImageResult : final_image_list) {
                                    arrayList2.add(new Pair(taskImageResult.valueKey(), taskImageResult.getImg_url()));
                                }
                                arrayList.add(arrayList2);
                            }
                            flatten = kotlin.collections.r.flatten(arrayList);
                            s sVar2 = this.f1234l;
                            ArrayList arrayList3 = new ArrayList(kotlin.collections.r.collectionSizeOrDefault(flatten, 10));
                            pVar = this;
                            i0Var = i0Var2;
                            it = flatten.iterator();
                            sVar = sVar2;
                            collection = arrayList3;
                            i8 = 0;
                            if (it.hasNext()) {
                            }
                        } else if (text2ImageResult.isErrorList()) {
                            this.f1230h.invoke(kotlin.coroutines.jvm.internal.a.boxInt(text2ImageResult.getErrorCode(-113)), text2ImageResult.getErrorMsg());
                        } else {
                            f6.p pVar2 = this.f1230h;
                            Integer boxInt = kotlin.coroutines.jvm.internal.a.boxInt(text2ImageResult.getErrorCode(-112));
                            String string = StringUtils.getString(R$string.task_generation_failed_please_try_again_later);
                            kotlin.jvm.internal.s.checkNotNullExpressionValue(string, "getString(R.string.task_…d_please_try_again_later)");
                            pVar2.invoke(boxInt, string);
                        }
                    }
                    return y5.w.INSTANCE;
                } catch (NetException e8) {
                    throw e8;
                } catch (CancellationException e9) {
                    throw e9;
                } catch (Throwable th) {
                    throw new ConvertException(execute, "An unexpected error occurred in the converter", th, null, 8, null);
                }
            }
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i8 = this.f1227e;
            collection = (Collection) this.f1226d;
            Iterator it3 = (Iterator) this.f1225c;
            Collection collection2 = (Collection) this.f1224b;
            s sVar3 = (s) this.f1223a;
            i0 i0Var3 = (i0) this.f1229g;
            y5.g.throwOnFailure(obj);
            pVar = this;
            sVar = sVar3;
            i0Var = i0Var3;
            Iterator it4 = it3;
            Collection collection3 = collection2;
            Object a8 = obj;
            collection.add((Pair) a8);
            collection = collection3;
            it = it4;
            if (it.hasNext()) {
                Object next = it.next();
                int i10 = i8 + 1;
                if (i8 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                Pair pair = (Pair) next;
                String str2 = ((String) pair.getFirst()) + '_' + i8;
                String str3 = (String) pair.getSecond();
                pVar.f1229g = i0Var;
                pVar.f1223a = sVar;
                pVar.f1224b = collection;
                pVar.f1225c = it;
                pVar.f1226d = collection;
                pVar.f1227e = i10;
                pVar.f1228f = 1;
                p pVar3 = pVar;
                a8 = s.a(sVar, i0Var, str2, str3, null, pVar, 4, null);
                if (a8 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pVar = pVar3;
                it4 = it;
                i8 = i10;
                collection3 = collection;
                collection.add((Pair) a8);
                collection = collection3;
                it = it4;
                if (it.hasNext()) {
                    pVar.f1231i.invoke((List) collection);
                    return y5.w.INSTANCE;
                }
            }
        }
    }

    public static final class q extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f1237a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f1238b;

        /* renamed from: d, reason: collision with root package name */
        public int f1240d;

        public q(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f1238b = obj;
            this.f1240d |= Integer.MIN_VALUE;
            return s.this.b(null, null, null, this);
        }
    }

    public static final class r extends SuspendLambda implements f6.p {

        /* renamed from: a, reason: collision with root package name */
        public Object f1241a;

        /* renamed from: b, reason: collision with root package name */
        public Object f1242b;

        /* renamed from: c, reason: collision with root package name */
        public Object f1243c;

        /* renamed from: d, reason: collision with root package name */
        public Object f1244d;

        /* renamed from: e, reason: collision with root package name */
        public int f1245e;

        /* renamed from: f, reason: collision with root package name */
        public int f1246f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f1247g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ ChatPictureRequestBody f1248h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ f6.p f1249i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ f6.l f1250j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ OverseasConfigModel f1251k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ s f1252l;

        public static final class a extends Lambda implements f6.l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ OverseasConfigModel f1253a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChatPictureRequestBody.ChatOverseasPictureParams f1254b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(OverseasConfigModel overseasConfigModel, ChatPictureRequestBody.ChatOverseasPictureParams chatOverseasPictureParams) {
                super(1);
                this.f1253a = overseasConfigModel;
                this.f1254b = chatOverseasPictureParams;
            }

            public final void a(r4.b post) {
                kotlin.jvm.internal.s.checkNotNullParameter(post, "$this$post");
                r4.a.addQuery$default(post, "ak", this.f1253a.getAk(), false, 4, null);
                r4.a.addQuery$default(post, "sn", this.f1253a.getSn(), false, 4, null);
                post.json(new Gson().toJson(this.f1254b));
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((r4.b) obj);
                return y5.w.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ChatPictureRequestBody chatPictureRequestBody, f6.p pVar, f6.l lVar, OverseasConfigModel overseasConfigModel, s sVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f1248h = chatPictureRequestBody;
            this.f1249i = pVar;
            this.f1250j = lVar;
            this.f1251k = overseasConfigModel;
            this.f1252l = sVar;
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
            return ((r) create(i0Var, cVar)).invokeSuspend(y5.w.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            r rVar = new r(this.f1248h, this.f1249i, this.f1250j, this.f1251k, this.f1252l, cVar);
            rVar.f1247g = obj;
            return rVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0247  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x01ed  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x023b -> B:5:0x023f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            int i8;
            String str;
            String str2;
            ChatPictureRequestBody.ChatOverseasPictureParams copy;
            List flatten;
            r rVar;
            i0 i0Var;
            Iterator it;
            s sVar;
            Collection collection;
            Text2ImageResult.RowDataResult data;
            boolean contains$default;
            boolean contains$default2;
            boolean contains$default3;
            List split$default;
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            int i9 = this.f1246f;
            if (i9 == 0) {
                y5.g.throwOnFailure(obj);
                i0 i0Var2 = (i0) this.f1247g;
                ChatPictureRequestBody chatPictureRequestBody = this.f1248h;
                ChatPictureRequestBody.ChatOverseasPictureParams chatOverseasPictureParams = chatPictureRequestBody.overseas;
                List<Text2ImageResult.TaskResult> list = null;
                i8 = 0;
                if ((chatOverseasPictureParams != null ? chatOverseasPictureParams.language : null) != null) {
                    String str3 = chatOverseasPictureParams != null ? chatOverseasPictureParams.language : null;
                    kotlin.jvm.internal.s.checkNotNull(str3);
                    Locale locale = Locale.ROOT;
                    String lowerCase = str3.toLowerCase(locale);
                    kotlin.jvm.internal.s.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    String lowerCase2 = "zh-HK".toLowerCase(locale);
                    kotlin.jvm.internal.s.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    contains$default = StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) lowerCase2, false, 2, (Object) null);
                    if (!contains$default) {
                        ChatPictureRequestBody.ChatOverseasPictureParams chatOverseasPictureParams2 = chatPictureRequestBody.overseas;
                        String str4 = chatOverseasPictureParams2 != null ? chatOverseasPictureParams2.language : null;
                        kotlin.jvm.internal.s.checkNotNull(str4);
                        String lowerCase3 = str4.toLowerCase(locale);
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        String lowerCase4 = "zh-TW".toLowerCase(locale);
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        contains$default2 = StringsKt__StringsKt.contains$default((CharSequence) lowerCase3, (CharSequence) lowerCase4, false, 2, (Object) null);
                        if (!contains$default2) {
                            ChatPictureRequestBody.ChatOverseasPictureParams chatOverseasPictureParams3 = chatPictureRequestBody.overseas;
                            String str5 = chatOverseasPictureParams3 != null ? chatOverseasPictureParams3.language : null;
                            kotlin.jvm.internal.s.checkNotNull(str5);
                            contains$default3 = StringsKt__StringsKt.contains$default((CharSequence) str5, (CharSequence) "-", false, 2, (Object) null);
                            if (contains$default3) {
                                ChatPictureRequestBody.ChatOverseasPictureParams chatOverseasPictureParams4 = chatPictureRequestBody.overseas;
                                String str6 = chatOverseasPictureParams4 != null ? chatOverseasPictureParams4.language : null;
                                kotlin.jvm.internal.s.checkNotNull(str6);
                                split$default = StringsKt__StringsKt.split$default((CharSequence) str6, new String[]{"-"}, false, 0, 6, (Object) null);
                                str = (String) CollectionsKt___CollectionsKt.first(split$default);
                            } else {
                                ChatPictureRequestBody.ChatOverseasPictureParams chatOverseasPictureParams5 = chatPictureRequestBody.overseas;
                                if (chatOverseasPictureParams5 != null) {
                                    str = chatOverseasPictureParams5.language;
                                }
                                str2 = null;
                            }
                            str2 = str;
                        }
                    }
                    str = "cht";
                    str2 = str;
                } else {
                    if (chatOverseasPictureParams != null) {
                        str = chatOverseasPictureParams.language;
                        str2 = str;
                    }
                    str2 = null;
                }
                ChatPictureRequestBody.ChatOverseasPictureParams chatOverseasPictureParams6 = this.f1248h.overseas;
                kotlin.jvm.internal.s.checkNotNull(chatOverseasPictureParams6);
                copy = chatOverseasPictureParams6.copy((r30 & 1) != 0 ? chatOverseasPictureParams6.prompt : null, (r30 & 2) != 0 ? chatOverseasPictureParams6.resizeWidth : null, (r30 & 4) != 0 ? chatOverseasPictureParams6.resizeHeight : null, (r30 & 8) != 0 ? chatOverseasPictureParams6.width : null, (r30 & 16) != 0 ? chatOverseasPictureParams6.height : null, (r30 & 32) != 0 ? chatOverseasPictureParams6.image_num : null, (r30 & 64) != 0 ? chatOverseasPictureParams6.image : null, (r30 & 128) != 0 ? chatOverseasPictureParams6.style : null, (r30 & 256) != 0 ? chatOverseasPictureParams6.url : null, (r30 & 512) != 0 ? chatOverseasPictureParams6.pdf_file : null, (r30 & 1024) != 0 ? chatOverseasPictureParams6.pdf_file_num : null, (r30 & 2048) != 0 ? chatOverseasPictureParams6.change_degree : null, (r30 & 4096) != 0 ? chatOverseasPictureParams6.language : str2, (r30 & 8192) != 0 ? chatOverseasPictureParams6.oversea : null);
                r4.b post$default = com.drake.net.a.post$default("https://swapi.yueqizhixiang.com/llm/txt2imgv3", null, new a(this.f1251k, copy), 2, null);
                NetConfig.INSTANCE.getRequestInterceptor();
                r4.d.setKType(post$default.getOkHttpRequest(), kotlin.jvm.internal.u.typeOf(String.class));
                Response execute = post$default.getOkHttpClient().newCall(post$default.buildRequest()).execute();
                try {
                    Object onConvert = r4.e.converter(execute.request()).onConvert(TypesJVMKt.getJavaType(kotlin.jvm.internal.u.typeOf(String.class)), execute);
                    if (onConvert == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    String str7 = (String) onConvert;
                    if (str7.length() == 0) {
                        this.f1249i.invoke(kotlin.coroutines.jvm.internal.a.boxInt(-111), "");
                    } else {
                        Text2ImageResult text2ImageResult = (Text2ImageResult) new Gson().fromJson(str7, Text2ImageResult.class);
                        if (text2ImageResult.isSuccess()) {
                            Text2ImageResult.RowResult rows = text2ImageResult.getRows();
                            if (rows != null && (data = rows.getData()) != null) {
                                list = data.getSub_task_result_list();
                            }
                            if (list == null) {
                                list = CollectionsKt__CollectionsKt.emptyList();
                            }
                            ArrayList arrayList = new ArrayList(kotlin.collections.r.collectionSizeOrDefault(list, 10));
                            Iterator<T> it2 = list.iterator();
                            while (it2.hasNext()) {
                                List<Text2ImageResult.TaskImageResult> final_image_list = ((Text2ImageResult.TaskResult) it2.next()).getFinal_image_list();
                                ArrayList arrayList2 = new ArrayList(kotlin.collections.r.collectionSizeOrDefault(final_image_list, 10));
                                for (Text2ImageResult.TaskImageResult taskImageResult : final_image_list) {
                                    arrayList2.add(new Pair(taskImageResult.valueKey(), taskImageResult.getImg_url()));
                                }
                                arrayList.add(arrayList2);
                            }
                            flatten = kotlin.collections.r.flatten(arrayList);
                            s sVar2 = this.f1252l;
                            ArrayList arrayList3 = new ArrayList(kotlin.collections.r.collectionSizeOrDefault(flatten, 10));
                            rVar = this;
                            i0Var = i0Var2;
                            it = flatten.iterator();
                            sVar = sVar2;
                            collection = arrayList3;
                            if (it.hasNext()) {
                            }
                        } else if (text2ImageResult.isErrorList()) {
                            this.f1249i.invoke(kotlin.coroutines.jvm.internal.a.boxInt(text2ImageResult.getErrorCode(-113)), text2ImageResult.getErrorMsg());
                        } else {
                            f6.p pVar = this.f1249i;
                            Integer boxInt = kotlin.coroutines.jvm.internal.a.boxInt(text2ImageResult.getErrorCode(-112));
                            String string = StringUtils.getString(R$string.task_generation_failed_please_try_again_later);
                            kotlin.jvm.internal.s.checkNotNullExpressionValue(string, "getString(R.string.task_…d_please_try_again_later)");
                            pVar.invoke(boxInt, string);
                        }
                    }
                    return y5.w.INSTANCE;
                } catch (NetException e8) {
                    throw e8;
                } catch (CancellationException e9) {
                    throw e9;
                } catch (Throwable th) {
                    throw new ConvertException(execute, "An unexpected error occurred in the converter", th, null, 8, null);
                }
            }
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i10 = this.f1245e;
            collection = (Collection) this.f1244d;
            Iterator it3 = (Iterator) this.f1243c;
            Collection collection2 = (Collection) this.f1242b;
            s sVar3 = (s) this.f1241a;
            i0 i0Var3 = (i0) this.f1247g;
            y5.g.throwOnFailure(obj);
            rVar = this;
            i8 = i10;
            sVar = sVar3;
            i0Var = i0Var3;
            Iterator it4 = it3;
            Collection collection3 = collection2;
            Object a8 = obj;
            collection.add((Pair) a8);
            collection = collection3;
            it = it4;
            if (it.hasNext()) {
                Object next = it.next();
                int i11 = i8 + 1;
                if (i8 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                Pair pair = (Pair) next;
                String str8 = ((String) pair.getFirst()) + '_' + i8;
                String str9 = (String) pair.getSecond();
                rVar.f1247g = i0Var;
                rVar.f1241a = sVar;
                rVar.f1242b = collection;
                rVar.f1243c = it;
                rVar.f1244d = collection;
                rVar.f1245e = i11;
                rVar.f1246f = 1;
                a8 = s.a(sVar, i0Var, str8, str9, null, rVar, 4, null);
                if (a8 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                it4 = it;
                i8 = i11;
                collection3 = collection;
                collection.add((Pair) a8);
                collection = collection3;
                it = it4;
                if (it.hasNext()) {
                    rVar.f1250j.invoke((List) collection);
                    return y5.w.INSTANCE;
                }
            }
        }
    }

    static {
        y5.f lazy;
        lazy = kotlin.b.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (f6.a) a.f1179a);
        f1178b = lazy;
    }

    public s() {
    }

    public /* synthetic */ s(kotlin.jvm.internal.o oVar) {
        this();
    }

    public final void b(NetChatBody body, IResultCallback black) {
        String str;
        String obj;
        String replace$default;
        ResponseBody body2;
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(black, "black");
        y5.w wVar = null;
        r4.b post$default = com.drake.net.a.post$default("/service/botwatch/api/thirdReq", null, new n(com.artillery.ctc.h.f791d.a().c().getAzureConfig(), body), 2, null);
        NetConfig netConfig = NetConfig.INSTANCE;
        netConfig.getRequestInterceptor();
        r4.d.setKType(post$default.getOkHttpRequest(), kotlin.jvm.internal.u.nullableTypeOf(String.class));
        Response execute = post$default.getOkHttpClient().newCall(post$default.buildRequest()).execute();
        try {
            NetChatBodyResult netChatBodyResult = (NetChatBodyResult) y.g.a((String) r4.e.converter(execute.request()).onConvert(TypesJVMKt.getJavaType(kotlin.jvm.internal.u.nullableTypeOf(String.class)), execute), NetChatBodyResult.class);
            String data = netChatBodyResult.getData();
            if (data == null || data.length() == 0) {
                black.onFail(90001, "data is NULL");
                return;
            }
            com.artillery.ctc.d.a("待解析数据:" + netChatBodyResult.getData(), null, 1, null);
            String a8 = y.e.a(netChatBodyResult.getData());
            com.artillery.ctc.d.a("解析数据:" + a8, null, 1, null);
            DirectChatBody realBody = (DirectChatBody) y.g.a(a8, DirectChatBody.class);
            Boolean bool = body.param.stream;
            str = "";
            if (bool != null && bool.booleanValue()) {
                kotlin.jvm.internal.s.checkNotNullExpressionValue(realBody, "realBody");
                String url = realBody.getUrl();
                r4.b post$default2 = com.drake.net.a.post$default(url != null ? url : "", null, new u(realBody), 2, null);
                netConfig.getRequestInterceptor();
                r4.d.setKType(post$default2.getOkHttpRequest(), kotlin.jvm.internal.u.nullableTypeOf(Response.class));
                Response execute2 = post$default2.getOkHttpClient().newCall(post$default2.buildRequest()).execute();
                try {
                    Response response = (Response) r4.e.converter(execute2.request()).onConvert(TypesJVMKt.getJavaType(kotlin.jvm.internal.u.nullableTypeOf(Response.class)), execute2);
                    if (response != null && (body2 = response.body()) != null) {
                        InputStream byteStream = body2.byteStream();
                        try {
                            TextStreamsKt.forEachLine(new BufferedReader(new InputStreamReader(byteStream)), new m(black, body));
                            y5.w wVar2 = y5.w.INSTANCE;
                            kotlin.io.b.closeFinally(byteStream, null);
                            wVar = y5.w.INSTANCE;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                kotlin.io.b.closeFinally(byteStream, th);
                                throw th2;
                            }
                        }
                    }
                    if (wVar == null) {
                        black.onFail(90002, "response body is NULL");
                        return;
                    }
                    return;
                } catch (NetException e8) {
                    throw e8;
                } catch (CancellationException e9) {
                    throw e9;
                } catch (Throwable th3) {
                    throw new ConvertException(execute2, "An unexpected error occurred in the converter", th3, null, 8, null);
                }
            }
            kotlin.jvm.internal.s.checkNotNullExpressionValue(realBody, "realBody");
            String url2 = realBody.getUrl();
            if (url2 == null) {
                url2 = "";
            }
            r4.b post$default3 = com.drake.net.a.post$default(url2, null, new u(realBody), 2, null);
            netConfig.getRequestInterceptor();
            r4.d.setKType(post$default3.getOkHttpRequest(), kotlin.jvm.internal.u.nullableTypeOf(String.class));
            Response execute3 = post$default3.getOkHttpClient().newCall(post$default3.buildRequest()).execute();
            try {
                String str2 = (String) r4.e.converter(execute3.request()).onConvert(TypesJVMKt.getJavaType(kotlin.jvm.internal.u.nullableTypeOf(String.class)), execute3);
                String str3 = str2 == null ? "" : str2;
                if (kotlin.text.t.startsWith$default(str3, "data:", false, 2, null)) {
                    replace$default = kotlin.text.t.replace$default(str3, "data:", "", false, 4, (Object) null);
                    obj = StringsKt__StringsKt.trim((CharSequence) replace$default).toString();
                } else {
                    obj = StringsKt__StringsKt.trim((CharSequence) str3).toString();
                }
                try {
                    JSONObject jSONObject = new JSONObject(obj);
                    String str4 = body.requestId;
                    if (str4 != null) {
                        str = str4;
                    }
                    jSONObject.put(MapBundleKey.MapObjKey.OBJ_QID, str);
                    black.onSuccess(jSONObject.toString());
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            } catch (NetException e11) {
                throw e11;
            } catch (CancellationException e12) {
                throw e12;
            } catch (Throwable th4) {
                throw new ConvertException(execute3, "An unexpected error occurred in the converter", th4, null, 8, null);
            }
        } catch (NetException e13) {
            throw e13;
        } catch (CancellationException e14) {
            throw e14;
        } catch (Throwable th5) {
            throw new ConvertException(execute, "An unexpected error occurred in the converter", th5, null, 8, null);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(2:19|(2:21|22)(2:23|(1:25)))|12|13|14))|28|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0030, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
    
        r12.printStackTrace();
        r13.invoke("");
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ChatRequestBody chatRequestBody, f6.l lVar, kotlin.coroutines.c cVar) {
        f fVar;
        Object coroutine_suspended;
        int i8;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i9 = fVar.f1196d;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                fVar.f1196d = i9 - Integer.MIN_VALUE;
                Object obj = fVar.f1194b;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = fVar.f1196d;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    com.artillery.ctc.d.a("OverseasGPT postChat->参数:" + y.g.a(chatRequestBody), null, 1, null);
                    OverseasConfigModel azureConfig = com.artillery.ctc.h.f791d.a().c().getAzureConfig();
                    if (azureConfig.isEmpty()) {
                        lVar.invoke("");
                        return y5.w.INSTANCE;
                    }
                    CoroutineDispatcher io2 = t0.getIO();
                    g gVar = new g(chatRequestBody, this, azureConfig, lVar, null);
                    fVar.f1193a = lVar;
                    fVar.f1196d = 1;
                    if (kotlinx.coroutines.g.withContext(io2, gVar, fVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lVar = (f6.l) fVar.f1193a;
                    y5.g.throwOnFailure(obj);
                }
                return y5.w.INSTANCE;
            }
        }
        fVar = new f(cVar);
        Object obj2 = fVar.f1194b;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = fVar.f1196d;
        if (i8 != 0) {
        }
        return y5.w.INSTANCE;
    }

    public final void a(NetChatBody body, IResultCallback black) {
        String thread_id;
        ResponseBody body2;
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.s.checkNotNullParameter(black, "black");
        y5.w wVar = null;
        r4.b post$default = com.drake.net.a.post$default("/service/botwatch/api/thirdReq", null, new l(com.artillery.ctc.h.f791d.a().c().getAzureConfig(), body), 2, null);
        NetConfig netConfig = NetConfig.INSTANCE;
        netConfig.getRequestInterceptor();
        r4.d.setKType(post$default.getOkHttpRequest(), kotlin.jvm.internal.u.nullableTypeOf(String.class));
        Response execute = post$default.getOkHttpClient().newCall(post$default.buildRequest()).execute();
        try {
            NetChatBodyResult netChatBodyResult = (NetChatBodyResult) y.g.a((String) r4.e.converter(execute.request()).onConvert(TypesJVMKt.getJavaType(kotlin.jvm.internal.u.nullableTypeOf(String.class)), execute), NetChatBodyResult.class);
            String data = netChatBodyResult.getData();
            if (data != null && data.length() != 0) {
                com.artillery.ctc.d.a("待解析数据:" + netChatBodyResult.getData(), null, 1, null);
                String a8 = y.e.a(netChatBodyResult.getData());
                com.artillery.ctc.d.a("解析数据:" + a8, null, 1, null);
                ChatOverseasSearchKey chatOverseasSearchKey = (ChatOverseasSearchKey) y.g.a(a8, ChatOverseasSearchKey.class);
                if (chatOverseasSearchKey == null) {
                    black.onFail(90002, "request error");
                    return;
                }
                com.artillery.ctc.a aVar = com.artillery.ctc.a.f674a;
                r4.b post$default2 = com.drake.net.a.post$default(aVar.b(chatOverseasSearchKey.getTenantId()), null, new k(chatOverseasSearchKey), 2, null);
                netConfig.getRequestInterceptor();
                r4.d.setKType(post$default2.getOkHttpRequest(), kotlin.jvm.internal.u.nullableTypeOf(String.class));
                Response execute2 = post$default2.getOkHttpClient().newCall(post$default2.buildRequest()).execute();
                try {
                    NetChatBodyTokenResult netChatBodyTokenResult = (NetChatBodyTokenResult) y.g.a((String) r4.e.converter(execute2.request()).onConvert(TypesJVMKt.getJavaType(kotlin.jvm.internal.u.nullableTypeOf(String.class)), execute2), NetChatBodyTokenResult.class);
                    String access_token = netChatBodyTokenResult.getAccess_token();
                    if (access_token != null && access_token.length() != 0) {
                        r4.b post$default3 = com.drake.net.a.post$default(aVar.a(chatOverseasSearchKey.getResourceName()), null, new j(chatOverseasSearchKey, netChatBodyTokenResult), 2, null);
                        netConfig.getRequestInterceptor();
                        r4.d.setKType(post$default3.getOkHttpRequest(), kotlin.jvm.internal.u.nullableTypeOf(String.class));
                        Response execute3 = post$default3.getOkHttpClient().newCall(post$default3.buildRequest()).execute();
                        try {
                            NetChatBodyCreatThreadResult netChatBodyCreatThreadResult = (NetChatBodyCreatThreadResult) y.g.a((String) r4.e.converter(execute3.request()).onConvert(TypesJVMKt.getJavaType(kotlin.jvm.internal.u.nullableTypeOf(String.class)), execute3), NetChatBodyCreatThreadResult.class);
                            String id = netChatBodyCreatThreadResult.getId();
                            if (id != null && id.length() != 0) {
                                r4.b post$default4 = com.drake.net.a.post$default(aVar.a(netChatBodyCreatThreadResult.getId(), chatOverseasSearchKey.getResourceName()), null, new i(chatOverseasSearchKey, netChatBodyTokenResult, body), 2, null);
                                netConfig.getRequestInterceptor();
                                r4.d.setKType(post$default4.getOkHttpRequest(), kotlin.jvm.internal.u.nullableTypeOf(String.class));
                                Response execute4 = post$default4.getOkHttpClient().newCall(post$default4.buildRequest()).execute();
                                try {
                                    NetChatBodyAddMessageResult netChatBodyAddMessageResult = (NetChatBodyAddMessageResult) y.g.a((String) r4.e.converter(execute4.request()).onConvert(TypesJVMKt.getJavaType(kotlin.jvm.internal.u.nullableTypeOf(String.class)), execute4), NetChatBodyAddMessageResult.class);
                                    String id2 = netChatBodyAddMessageResult.getId();
                                    if (id2 != null && id2.length() != 0 && (thread_id = netChatBodyAddMessageResult.getThread_id()) != null && thread_id.length() != 0) {
                                        Boolean bool = body.param.stream;
                                        boolean booleanValue = bool != null ? bool.booleanValue() : false;
                                        r4.b post$default5 = com.drake.net.a.post$default(aVar.b(netChatBodyAddMessageResult.getThread_id(), chatOverseasSearchKey.getResourceName()), null, new v(chatOverseasSearchKey.getApiVersion(), netChatBodyTokenResult.getToken_type(), netChatBodyTokenResult.getAccess_token(), chatOverseasSearchKey.getAgentId(), true), 2, null);
                                        netConfig.getRequestInterceptor();
                                        r4.d.setKType(post$default5.getOkHttpRequest(), kotlin.jvm.internal.u.nullableTypeOf(Response.class));
                                        Response execute5 = post$default5.getOkHttpClient().newCall(post$default5.buildRequest()).execute();
                                        try {
                                            Response response = (Response) r4.e.converter(execute5.request()).onConvert(TypesJVMKt.getJavaType(kotlin.jvm.internal.u.nullableTypeOf(Response.class)), execute5);
                                            if (response != null && (body2 = response.body()) != null) {
                                                InputStream byteStream = body2.byteStream();
                                                try {
                                                    TextStreamsKt.forEachLine(new BufferedReader(new InputStreamReader(byteStream)), new h(booleanValue, black, body));
                                                    y5.w wVar2 = y5.w.INSTANCE;
                                                    kotlin.io.b.closeFinally(byteStream, null);
                                                    wVar = y5.w.INSTANCE;
                                                } catch (Throwable th) {
                                                    try {
                                                        throw th;
                                                    } catch (Throwable th2) {
                                                        kotlin.io.b.closeFinally(byteStream, th);
                                                        throw th2;
                                                    }
                                                }
                                            }
                                            if (wVar == null) {
                                                black.onFail(90002, "response body is NULL");
                                                return;
                                            }
                                            return;
                                        } catch (NetException e8) {
                                            throw e8;
                                        } catch (CancellationException e9) {
                                            throw e9;
                                        } catch (Throwable th3) {
                                            throw new ConvertException(execute5, "An unexpected error occurred in the converter", th3, null, 8, null);
                                        }
                                    }
                                    black.onFail(90001, "data is NULL");
                                    return;
                                } catch (NetException e10) {
                                    throw e10;
                                } catch (CancellationException e11) {
                                    throw e11;
                                } catch (Throwable th4) {
                                    throw new ConvertException(execute4, "An unexpected error occurred in the converter", th4, null, 8, null);
                                }
                            }
                            black.onFail(90001, "data is NULL");
                            return;
                        } catch (NetException e12) {
                            throw e12;
                        } catch (CancellationException e13) {
                            throw e13;
                        } catch (Throwable th5) {
                            throw new ConvertException(execute3, "An unexpected error occurred in the converter", th5, null, 8, null);
                        }
                    }
                    black.onFail(90001, "data is NULL");
                    return;
                } catch (NetException e14) {
                    throw e14;
                } catch (CancellationException e15) {
                    throw e15;
                } catch (Throwable th6) {
                    throw new ConvertException(execute2, "An unexpected error occurred in the converter", th6, null, 8, null);
                }
            }
            black.onFail(90001, "data is NULL");
        } catch (NetException e16) {
            throw e16;
        } catch (CancellationException e17) {
            throw e17;
        } catch (Throwable th7) {
            throw new ConvertException(execute, "An unexpected error occurred in the converter", th7, null, 8, null);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(2:19|(2:21|22)(2:23|(1:25)))|12|13|14))|28|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002e, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        r12.printStackTrace();
        r12 = kotlin.coroutines.jvm.internal.a.boxInt(-110);
        r14 = com.artillery.ctc.uitls.StringUtils.getString(com.artillery.ctc.R$string.task_generation_failed_please_try_again_later);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(r14, "getString(R.string.task_…d_please_try_again_later)");
        r13.invoke(r12, r14);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ChatPictureRequestBody chatPictureRequestBody, f6.p pVar, f6.l lVar, kotlin.coroutines.c cVar) {
        q qVar;
        Object coroutine_suspended;
        int i8;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i9 = qVar.f1240d;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                qVar.f1240d = i9 - Integer.MIN_VALUE;
                Object obj = qVar.f1238b;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = qVar.f1240d;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    OverseasConfigModel azureConfig = com.artillery.ctc.h.f791d.a().c().getAzureConfig();
                    if (azureConfig.isEmpty()) {
                        pVar.invoke(kotlin.coroutines.jvm.internal.a.boxInt(Integer.MAX_VALUE), "");
                        return y5.w.INSTANCE;
                    }
                    CoroutineDispatcher io2 = t0.getIO();
                    r rVar = new r(chatPictureRequestBody, pVar, lVar, azureConfig, this, null);
                    qVar.f1237a = pVar;
                    qVar.f1240d = 1;
                    if (kotlinx.coroutines.g.withContext(io2, rVar, qVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = (f6.p) qVar.f1237a;
                    y5.g.throwOnFailure(obj);
                }
                return y5.w.INSTANCE;
            }
        }
        qVar = new q(cVar);
        Object obj2 = qVar.f1238b;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = qVar.f1240d;
        if (i8 != 0) {
        }
        return y5.w.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(2:19|(2:21|22)(2:23|(1:25)))|12|13|14))|28|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002e, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        r12.printStackTrace();
        r12 = kotlin.coroutines.jvm.internal.a.boxInt(-110);
        r14 = com.artillery.ctc.uitls.StringUtils.getString(com.artillery.ctc.R$string.task_generation_failed_please_try_again_later);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(r14, "getString(R.string.task_…d_please_try_again_later)");
        r13.invoke(r12, r14);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ChatPictureRequestBody chatPictureRequestBody, f6.p pVar, f6.l lVar, kotlin.coroutines.c cVar) {
        o oVar;
        Object coroutine_suspended;
        int i8;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i9 = oVar.f1222d;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                oVar.f1222d = i9 - Integer.MIN_VALUE;
                Object obj = oVar.f1220b;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = oVar.f1222d;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    OverseasConfigModel azureConfig = com.artillery.ctc.h.f791d.a().c().getAzureConfig();
                    if (azureConfig.isEmpty()) {
                        pVar.invoke(kotlin.coroutines.jvm.internal.a.boxInt(Integer.MAX_VALUE), "");
                        return y5.w.INSTANCE;
                    }
                    CoroutineDispatcher io2 = t0.getIO();
                    p pVar2 = new p(pVar, lVar, azureConfig, chatPictureRequestBody, this, null);
                    oVar.f1219a = pVar;
                    oVar.f1222d = 1;
                    if (kotlinx.coroutines.g.withContext(io2, pVar2, oVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = (f6.p) oVar.f1219a;
                    y5.g.throwOnFailure(obj);
                }
                return y5.w.INSTANCE;
            }
        }
        oVar = new o(cVar);
        Object obj2 = oVar.f1220b;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = oVar.f1222d;
        if (i8 != 0) {
        }
        return y5.w.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(i0 i0Var, String str, String str2, String str3, kotlin.coroutines.c cVar) {
        d dVar;
        Object coroutine_suspended;
        int i8;
        File filesDir;
        n0 async$default;
        Object obj;
        String str4;
        String str5 = str3;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i9 = dVar.f1190f;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                dVar.f1190f = i9 - Integer.MIN_VALUE;
                Object obj2 = dVar.f1188d;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = dVar.f1190f;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj2);
                    filesDir = y.d.a().getFilesDir();
                    async$default = kotlinx.coroutines.i.async$default(i0Var, t0.getIO().plus(f2.m1260SupervisorJob$default((l1) null, 1, (Object) null)), null, new c(str2, null, new e(filesDir, str5), null), 2, null);
                    NetDeferred netDeferred = new NetDeferred(async$default);
                    dVar.f1185a = str;
                    dVar.f1186b = str5;
                    dVar.f1187c = filesDir;
                    dVar.f1190f = 1;
                    Object await = netDeferred.await(dVar);
                    if (await == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = await;
                    str4 = str;
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    File file = (File) dVar.f1187c;
                    String str6 = (String) dVar.f1186b;
                    str4 = (String) dVar.f1185a;
                    y5.g.throwOnFailure(obj2);
                    filesDir = file;
                    str5 = str6;
                    obj = obj2;
                }
                return new Pair(str4, filesDir.getAbsolutePath() + File.separatorChar + str5);
            }
        }
        dVar = new d(cVar);
        Object obj22 = dVar.f1188d;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = dVar.f1190f;
        if (i8 != 0) {
        }
        return new Pair(str4, filesDir.getAbsolutePath() + File.separatorChar + str5);
    }

    public static /* synthetic */ Object a(s sVar, i0 i0Var, String str, String str2, String str3, kotlin.coroutines.c cVar, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str3 = a(sVar, "ai", (String) null, 2, (Object) null);
        }
        return sVar.a(i0Var, str, str2, str3, cVar);
    }

    public static /* synthetic */ String a(s sVar, String str, String str2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = "png";
        }
        return sVar.a(str, str2);
    }

    public final String a(String str, String str2) {
        String replace$default;
        String uuid = UUID.randomUUID().toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        replace$default = kotlin.text.t.replace$default(uuid, "-", "", false, 4, (Object) null);
        return str + '_' + replace$default + '.' + str2;
    }
}
