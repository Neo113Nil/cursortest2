package com.onesignal.inAppMessages.internal.backend.impl;

import com.onesignal.common.g;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import n6.AbstractC0792z;
import o2.C0800b;
import org.json.JSONArray;
import org.json.JSONObject;
import r2.C0846a;

/* loaded from: classes.dex */
public final class a implements O2.b {
    private final A2.c _deviceService;
    private final C2.c _httpClient;
    private final R2.a _hydrator;
    private int htmlNetworkRequestAttemptCount;

    /* renamed from: com.onesignal.inAppMessages.internal.backend.impl.a$a, reason: collision with other inner class name */
    public static final class C0031a extends X5.c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C0031a(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.attemptFetchWithRetries(null, null, null, null, this);
        }
    }

    public static final class b extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.fetchInAppMessagesWithoutRywToken(null, null, null, this);
        }
    }

    public static final class c extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.getIAMData(null, null, null, this);
        }
    }

    public static final class d extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.getIAMPreviewData(null, null, this);
        }
    }

    public static final class e extends X5.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public e(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.listInAppMessages(null, null, null, null, this);
        }
    }

    public static final class f extends X5.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public f(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.listInAppMessagesIv(null, null, null, null, null, null, null, this);
        }
    }

    public static final class g extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public g(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendIAMClick(null, null, null, null, null, false, this);
        }
    }

    public static final class h extends JSONObject {
        public h(String str, a aVar, String str2, String str3, String str4, boolean z7) {
            put("app_id", str);
            put("device_type", aVar._deviceService.getDeviceType().getValue());
            put("player_id", str2);
            put("click_id", str3);
            put("variant_id", str4);
            if (z7) {
                put("first_click", true);
            }
        }
    }

    public static final class i extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public i(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendIAMImpression(null, null, null, null, this);
        }
    }

    public static final class j extends JSONObject {
        public j(String str, String str2, String str3, a aVar) {
            put("app_id", str);
            put("player_id", str2);
            put("variant_id", str3);
            put("device_type", aVar._deviceService.getDeviceType().getValue());
            put("first_impression", true);
        }
    }

    public static final class k extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public k(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendIAMPageImpression(null, null, null, null, null, this);
        }
    }

    public static final class l extends JSONObject {
        public l(String str, String str2, String str3, a aVar, String str4) {
            put("app_id", str);
            put("player_id", str2);
            put("variant_id", str3);
            put("device_type", aVar._deviceService.getDeviceType().getValue());
            put("page_id", str4);
        }
    }

    public a(C2.c _httpClient, A2.c _deviceService, R2.a _hydrator) {
        Intrinsics.checkNotNullParameter(_httpClient, "_httpClient");
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_hydrator, "_hydrator");
        this._httpClient = _httpClient;
        this._deviceService = _deviceService;
        this._hydrator = _hydrator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0168, code lost:
    
        if (n6.AbstractC0792z.d(r5, r1) == r3) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0168 -> B:17:0x016b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x017a -> B:17:0x016b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attemptFetchWithRetries(String str, C0800b c0800b, Function0<Long> function0, String str2, V5.b bVar) {
        C0031a c0031a;
        a aVar;
        int i2;
        Function0<Long> function02;
        String str3;
        int i5;
        int i7;
        C0031a c0031a2;
        a aVar2;
        String str4;
        C0800b c0800b2;
        JSONObject jSONObject;
        a aVar3;
        String str5;
        C0800b c0800b3;
        Function0<Long> function03;
        String str6;
        int i8;
        int i9;
        C2.a aVar4;
        Object obj;
        if (bVar instanceof C0031a) {
            c0031a = (C0031a) bVar;
            int i10 = c0031a.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0031a.label = i10 - Integer.MIN_VALUE;
                aVar = this;
                Object obj2 = c0031a.result;
                W5.a aVar5 = W5.a.f2787d;
                i2 = c0031a.label;
                if (i2 != 0) {
                    V6.b.P(obj2);
                    function02 = function0;
                    str3 = str2;
                    i5 = 0;
                    i7 = 0;
                    c0031a2 = c0031a;
                    aVar2 = aVar;
                    str4 = str;
                    c0800b2 = c0800b;
                    int i11 = i7;
                    int i12 = i5;
                    jSONObject = null;
                    a aVar6 = aVar2;
                    C0031a c0031a3 = c0031a2;
                    com.onesignal.core.internal.http.impl.e eVar = new com.onesignal.core.internal.http.impl.e(null, c0800b2.getRywToken(), i5 <= 0 ? new Integer(i5) : null, new Long(((Number) function02.invoke()).longValue()), str3, 1, null);
                    C2.c cVar = aVar6._httpClient;
                    c0031a3.L$0 = aVar6;
                    c0031a3.L$1 = str4;
                    c0031a3.L$2 = c0800b2;
                    c0031a3.L$3 = function02;
                    c0031a3.L$4 = str3;
                    c0031a3.I$0 = i12;
                    c0031a3.I$1 = i11;
                    c0031a3.label = 1;
                    obj = cVar.get(str4, eVar, c0031a3);
                    if (obj != aVar5) {
                    }
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        V6.b.P(obj2);
                        return obj2;
                    }
                    i9 = c0031a.I$1;
                    i8 = c0031a.I$0;
                    str6 = (String) c0031a.L$4;
                    function03 = (Function0) c0031a.L$3;
                    c0800b3 = (C0800b) c0031a.L$2;
                    str5 = (String) c0031a.L$1;
                    aVar3 = (a) c0031a.L$0;
                    V6.b.P(obj2);
                    char c7 = 2;
                    jSONObject = null;
                    String str7 = str6;
                    c0031a2 = c0031a;
                    c0800b2 = c0800b3;
                    aVar2 = aVar3;
                    str3 = str7;
                    Function0<Long> function04 = function03;
                    i7 = i9;
                    function02 = function04;
                    i5 = i8 + 1;
                    if (i5 <= i7) {
                        JSONObject jSONObject2 = jSONObject;
                        c0031a2.L$0 = jSONObject2;
                        c0031a2.L$1 = jSONObject2;
                        c0031a2.L$2 = jSONObject2;
                        c0031a2.L$3 = jSONObject2;
                        c0031a2.L$4 = jSONObject2;
                        c0031a2.label = 3;
                        Object fetchInAppMessagesWithoutRywToken = aVar2.fetchInAppMessagesWithoutRywToken(str5, function02, str3, c0031a2);
                        return fetchInAppMessagesWithoutRywToken == aVar5 ? aVar5 : fetchInAppMessagesWithoutRywToken;
                    }
                    str4 = str5;
                    int i112 = i7;
                    int i122 = i5;
                    jSONObject = null;
                    a aVar62 = aVar2;
                    C0031a c0031a32 = c0031a2;
                    com.onesignal.core.internal.http.impl.e eVar2 = new com.onesignal.core.internal.http.impl.e(null, c0800b2.getRywToken(), i5 <= 0 ? new Integer(i5) : null, new Long(((Number) function02.invoke()).longValue()), str3, 1, null);
                    C2.c cVar2 = aVar62._httpClient;
                    c0031a32.L$0 = aVar62;
                    c0031a32.L$1 = str4;
                    c0031a32.L$2 = c0800b2;
                    c0031a32.L$3 = function02;
                    c0031a32.L$4 = str3;
                    c0031a32.I$0 = i122;
                    c0031a32.I$1 = i112;
                    c0031a32.label = 1;
                    obj = cVar2.get(str4, eVar2, c0031a32);
                    if (obj != aVar5) {
                        str5 = str4;
                        c0800b3 = c0800b2;
                        function03 = function02;
                        c0031a = c0031a32;
                        i9 = i112;
                        obj2 = obj;
                        str6 = str3;
                        aVar3 = aVar62;
                        i8 = i122;
                        aVar4 = (C2.a) obj2;
                        if (aVar4.isSuccess()) {
                            String payload = aVar4.getPayload();
                            JSONObject jSONObject3 = payload != null ? new JSONObject(payload) : jSONObject;
                            return jSONObject3 != null ? aVar3.hydrateInAppMessages(jSONObject3) : jSONObject;
                        }
                        if (aVar4.getStatusCode() != 425 && aVar4.getStatusCode() != 429) {
                            if (com.onesignal.common.g.INSTANCE.getResponseStatusType(aVar4.getStatusCode()) == g.a.UNAUTHORIZED) {
                                throw new C0846a(aVar4.getStatusCode(), aVar4.getPayload(), aVar4.getRetryAfterSeconds());
                            }
                            aVar4.getStatusCode();
                            return jSONObject;
                        }
                        Integer retryLimit = aVar4.getRetryLimit();
                        if (retryLimit != null) {
                            i9 = retryLimit.intValue();
                        }
                        if (aVar4.getRetryAfterSeconds() != null) {
                            long intValue = r0.intValue() * 1000;
                            c0031a.L$0 = aVar3;
                            c0031a.L$1 = str5;
                            c0031a.L$2 = c0800b3;
                            c0031a.L$3 = function03;
                            c0031a.L$4 = str6;
                            c0031a.I$0 = i8;
                            c0031a.I$1 = i9;
                            c7 = 2;
                            c0031a.label = 2;
                        } else {
                            c7 = 2;
                        }
                        String str72 = str6;
                        c0031a2 = c0031a;
                        c0800b2 = c0800b3;
                        aVar2 = aVar3;
                        str3 = str72;
                        Function0<Long> function042 = function03;
                        i7 = i9;
                        function02 = function042;
                        i5 = i8 + 1;
                        if (i5 <= i7) {
                        }
                    }
                }
                i9 = c0031a.I$1;
                i8 = c0031a.I$0;
                str6 = (String) c0031a.L$4;
                function03 = (Function0) c0031a.L$3;
                c0800b3 = (C0800b) c0031a.L$2;
                str5 = (String) c0031a.L$1;
                aVar3 = (a) c0031a.L$0;
                V6.b.P(obj2);
                jSONObject = null;
                aVar4 = (C2.a) obj2;
                if (aVar4.isSuccess()) {
                }
            }
        }
        aVar = this;
        c0031a = aVar.new C0031a(bVar);
        Object obj22 = c0031a.result;
        W5.a aVar52 = W5.a.f2787d;
        i2 = c0031a.label;
        if (i2 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchInAppMessagesWithoutRywToken(String str, Function0<Long> function0, String str2, V5.b bVar) {
        b bVar2;
        int i2;
        a aVar;
        C2.a aVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i5 = bVar2.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bVar2.label = i5 - Integer.MIN_VALUE;
                Object obj = bVar2.result;
                W5.a aVar3 = W5.a.f2787d;
                i2 = bVar2.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    C2.c cVar = this._httpClient;
                    com.onesignal.core.internal.http.impl.e eVar = new com.onesignal.core.internal.http.impl.e(null, null, null, (Long) function0.invoke(), str2, 7, null);
                    bVar2.L$0 = this;
                    bVar2.label = 1;
                    obj = cVar.get(str, eVar, bVar2);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    aVar = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) bVar2.L$0;
                    V6.b.P(obj);
                }
                aVar2 = (C2.a) obj;
                if (aVar2.isSuccess()) {
                    if (com.onesignal.common.g.INSTANCE.getResponseStatusType(aVar2.getStatusCode()) != g.a.UNAUTHORIZED) {
                        return null;
                    }
                    throw new C0846a(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
                }
                String payload = aVar2.getPayload();
                JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
                if (jSONObject != null) {
                    return aVar.hydrateInAppMessages(jSONObject);
                }
                return null;
            }
        }
        bVar2 = new b(bVar);
        Object obj2 = bVar2.result;
        W5.a aVar32 = W5.a.f2787d;
        i2 = bVar2.label;
        if (i2 != 0) {
        }
        aVar2 = (C2.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }

    public static /* synthetic */ Object fetchInAppMessagesWithoutRywToken$default(a aVar, String str, Function0 function0, String str2, V5.b bVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        return aVar.fetchInAppMessagesWithoutRywToken(str, function0, str2, bVar);
    }

    private final String htmlPathForMessage(String str, String str2, String str3) {
        if (str2 == null) {
            com.onesignal.debug.internal.logging.b.error$default("Unable to find a variant for in-app message " + str, null, 2, null);
            return null;
        }
        return "in_app_messages/" + str + "/variants/" + str2 + "/html?app_id=" + str3;
    }

    private final List<com.onesignal.inAppMessages.internal.a> hydrateInAppMessages(JSONObject jSONObject) {
        if (!jSONObject.has("in_app_messages")) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("in_app_messages");
        R2.a aVar = this._hydrator;
        Intrinsics.b(jSONArray);
        return aVar.hydrateIAMMessages(jSONArray);
    }

    private final void printHttpErrorForInAppMessageRequest(String str, int i2, String str2) {
        com.onesignal.debug.internal.logging.b.info$default("Encountered a " + i2 + " error while attempting in-app message " + str + " request: " + str2, null, 2, null);
    }

    private final void printHttpSuccessForInAppMessageRequest(String str, String str2) {
        com.onesignal.debug.internal.logging.b.debug$default("Successful post for in-app message " + str + " request: " + str2, null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // O2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getIAMData(String str, String str2, String str3, V5.b bVar) {
        c cVar;
        int i2;
        a aVar;
        C2.a aVar2;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i5 = cVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                cVar.label = i5 - Integer.MIN_VALUE;
                c cVar2 = cVar;
                Object obj = cVar2.result;
                W5.a aVar3 = W5.a.f2787d;
                i2 = cVar2.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    String htmlPathForMessage = htmlPathForMessage(str2, str3, str);
                    if (htmlPathForMessage == null) {
                        return new O2.a(null, false);
                    }
                    C2.c cVar3 = this._httpClient;
                    cVar2.L$0 = this;
                    cVar2.label = 1;
                    obj = C2.b.get$default(cVar3, htmlPathForMessage, null, cVar2, 2, null);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    aVar = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) cVar2.L$0;
                    V6.b.P(obj);
                }
                aVar2 = (C2.a) obj;
                if (!aVar2.isSuccess()) {
                    aVar.htmlNetworkRequestAttemptCount = 0;
                    String payload = aVar2.getPayload();
                    Intrinsics.b(payload);
                    return new O2.a(aVar._hydrator.hydrateIAMMessageContent(new JSONObject(payload)), false);
                }
                aVar.printHttpErrorForInAppMessageRequest(com.onesignal.inAppMessages.internal.d.HTML, aVar2.getStatusCode(), aVar2.getPayload());
                com.onesignal.common.g gVar = com.onesignal.common.g.INSTANCE;
                if (gVar.getResponseStatusType(aVar2.getStatusCode()) != g.a.RETRYABLE || aVar.htmlNetworkRequestAttemptCount >= gVar.getMaxNetworkRequestAttemptCount()) {
                    aVar.htmlNetworkRequestAttemptCount = 0;
                    return new O2.a(null, false);
                }
                aVar.htmlNetworkRequestAttemptCount++;
                return new O2.a(null, true);
            }
        }
        cVar = new c(bVar);
        c cVar22 = cVar;
        Object obj2 = cVar22.result;
        W5.a aVar32 = W5.a.f2787d;
        i2 = cVar22.label;
        if (i2 != 0) {
        }
        aVar2 = (C2.a) obj2;
        if (!aVar2.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // O2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getIAMPreviewData(String str, String str2, V5.b bVar) {
        d dVar;
        int i2;
        a aVar;
        C2.a aVar2;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i5 = dVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                dVar.label = i5 - Integer.MIN_VALUE;
                d dVar2 = dVar;
                Object obj = dVar2.result;
                W5.a aVar3 = W5.a.f2787d;
                i2 = dVar2.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    C2.c cVar = this._httpClient;
                    dVar2.L$0 = this;
                    dVar2.label = 1;
                    obj = C2.b.get$default(cVar, "in_app_messages/device_preview?preview_id=" + str2 + "&app_id=" + str, null, dVar2, 2, null);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    aVar = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) dVar2.L$0;
                    V6.b.P(obj);
                }
                aVar2 = (C2.a) obj;
                if (aVar2.isSuccess()) {
                    aVar.printHttpErrorForInAppMessageRequest(com.onesignal.inAppMessages.internal.d.HTML, aVar2.getStatusCode(), aVar2.getPayload());
                    return null;
                }
                String payload = aVar2.getPayload();
                Intrinsics.b(payload);
                return aVar._hydrator.hydrateIAMMessageContent(new JSONObject(payload));
            }
        }
        dVar = new d(bVar);
        d dVar22 = dVar;
        Object obj2 = dVar22.result;
        W5.a aVar32 = W5.a.f2787d;
        i2 = dVar22.label;
        if (i2 != 0) {
        }
        aVar2 = (C2.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // O2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listInAppMessages(String str, String str2, C0800b c0800b, Function0<Long> function0, V5.b bVar) {
        e eVar;
        int i2;
        a aVar;
        if (bVar instanceof e) {
            eVar = (e) bVar;
            int i5 = eVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                eVar.label = i5 - Integer.MIN_VALUE;
                e eVar2 = eVar;
                Object obj = eVar2.result;
                W5.a aVar2 = W5.a.f2787d;
                i2 = eVar2.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    Long rywDelay = c0800b.getRywDelay();
                    long longValue = rywDelay != null ? rywDelay.longValue() : 500L;
                    eVar2.L$0 = this;
                    eVar2.L$1 = str;
                    eVar2.L$2 = str2;
                    eVar2.L$3 = c0800b;
                    eVar2.L$4 = function0;
                    eVar2.label = 1;
                    if (AbstractC0792z.d(longValue, eVar2) != aVar2) {
                        aVar = this;
                    }
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                    return obj;
                }
                function0 = (Function0) eVar2.L$4;
                c0800b = (C0800b) eVar2.L$3;
                str2 = (String) eVar2.L$2;
                str = (String) eVar2.L$1;
                aVar = (a) eVar2.L$0;
                V6.b.P(obj);
                C0800b c0800b2 = c0800b;
                Function0<Long> function02 = function0;
                eVar2.L$0 = null;
                eVar2.L$1 = null;
                eVar2.L$2 = null;
                eVar2.L$3 = null;
                eVar2.L$4 = null;
                eVar2.label = 2;
                Object attemptFetchWithRetries = aVar.attemptFetchWithRetries("apps/" + str + "/subscriptions/" + str2 + "/iams", c0800b2, function02, null, eVar2);
                return attemptFetchWithRetries != aVar2 ? aVar2 : attemptFetchWithRetries;
            }
        }
        eVar = new e(bVar);
        e eVar22 = eVar;
        Object obj2 = eVar22.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = eVar22.label;
        if (i2 != 0) {
        }
        C0800b c0800b22 = c0800b;
        Function0<Long> function022 = function0;
        eVar22.L$0 = null;
        eVar22.L$1 = null;
        eVar22.L$2 = null;
        eVar22.L$3 = null;
        eVar22.L$4 = null;
        eVar22.label = 2;
        Object attemptFetchWithRetries2 = aVar.attemptFetchWithRetries("apps/" + str + "/subscriptions/" + str2 + "/iams", c0800b22, function022, null, eVar22);
        if (attemptFetchWithRetries2 != aVar22) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // O2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listInAppMessagesIv(String str, String str2, String str3, String str4, C0800b c0800b, Function0<Long> function0, String str5, V5.b bVar) {
        f fVar;
        int i2;
        String str6;
        a aVar;
        if (bVar instanceof f) {
            fVar = (f) bVar;
            int i5 = fVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                fVar.label = i5 - Integer.MIN_VALUE;
                Object obj = fVar.result;
                W5.a aVar2 = W5.a.f2787d;
                i2 = fVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    String str7 = "apps/" + str + "/users/by/" + str2 + '/' + str3 + "/subscriptions/" + str4 + "/iams";
                    if (c0800b == null) {
                        fVar.label = 1;
                        Object fetchInAppMessagesWithoutRywToken = fetchInAppMessagesWithoutRywToken(str7, function0, str5, fVar);
                        if (fetchInAppMessagesWithoutRywToken != aVar2) {
                            return fetchInAppMessagesWithoutRywToken;
                        }
                    } else {
                        Long rywDelay = c0800b.getRywDelay();
                        long longValue = rywDelay != null ? rywDelay.longValue() : 500L;
                        fVar.L$0 = this;
                        fVar.L$1 = c0800b;
                        fVar.L$2 = function0;
                        fVar.L$3 = str5;
                        fVar.L$4 = str7;
                        fVar.label = 2;
                        if (AbstractC0792z.d(longValue, fVar) != aVar2) {
                            str6 = str7;
                            aVar = this;
                        }
                    }
                }
                if (i2 == 1) {
                    V6.b.P(obj);
                    return obj;
                }
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                    return obj;
                }
                String str8 = (String) fVar.L$4;
                str5 = (String) fVar.L$3;
                function0 = (Function0) fVar.L$2;
                c0800b = (C0800b) fVar.L$1;
                a aVar3 = (a) fVar.L$0;
                V6.b.P(obj);
                str6 = str8;
                aVar = aVar3;
                C0800b c0800b2 = c0800b;
                Function0<Long> function02 = function0;
                String str9 = str5;
                fVar.L$0 = null;
                fVar.L$1 = null;
                fVar.L$2 = null;
                fVar.L$3 = null;
                fVar.L$4 = null;
                fVar.label = 3;
                Object attemptFetchWithRetries = aVar.attemptFetchWithRetries(str6, c0800b2, function02, str9, fVar);
                return attemptFetchWithRetries != aVar2 ? aVar2 : attemptFetchWithRetries;
            }
        }
        fVar = new f(bVar);
        Object obj2 = fVar.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = fVar.label;
        if (i2 != 0) {
        }
        C0800b c0800b22 = c0800b;
        Function0<Long> function022 = function0;
        String str92 = str5;
        fVar.L$0 = null;
        fVar.L$1 = null;
        fVar.L$2 = null;
        fVar.L$3 = null;
        fVar.L$4 = null;
        fVar.label = 3;
        Object attemptFetchWithRetries2 = aVar.attemptFetchWithRetries(str6, c0800b22, function022, str92, fVar);
        if (attemptFetchWithRetries2 != aVar22) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // O2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendIAMClick(String str, String str2, String str3, String str4, String str5, boolean z7, V5.b bVar) {
        g gVar;
        int i2;
        a aVar;
        C2.a aVar2;
        if (bVar instanceof g) {
            gVar = (g) bVar;
            int i5 = gVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                gVar.label = i5 - Integer.MIN_VALUE;
                g gVar2 = gVar;
                Object obj = gVar2.result;
                W5.a aVar3 = W5.a.f2787d;
                i2 = gVar2.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    h hVar = new h(str, this, str2, str5, str3, z7);
                    C2.c cVar = this._httpClient;
                    String d7 = r4.f.d("in_app_messages/", str4, "/click");
                    gVar2.L$0 = this;
                    gVar2.label = 1;
                    obj = C2.b.post$default(cVar, d7, hVar, null, gVar2, 4, null);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    aVar = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) gVar2.L$0;
                    V6.b.P(obj);
                }
                aVar2 = (C2.a) obj;
                if (aVar2.isSuccess()) {
                    aVar.printHttpErrorForInAppMessageRequest("engagement", aVar2.getStatusCode(), aVar2.getPayload());
                    throw new C0846a(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
                }
                String payload = aVar2.getPayload();
                Intrinsics.b(payload);
                aVar.printHttpSuccessForInAppMessageRequest("engagement", payload);
                return Unit.f6114a;
            }
        }
        gVar = new g(bVar);
        g gVar22 = gVar;
        Object obj2 = gVar22.result;
        W5.a aVar32 = W5.a.f2787d;
        i2 = gVar22.label;
        if (i2 != 0) {
        }
        aVar2 = (C2.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // O2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendIAMImpression(String str, String str2, String str3, String str4, V5.b bVar) {
        i iVar;
        int i2;
        a aVar;
        C2.a aVar2;
        if (bVar instanceof i) {
            iVar = (i) bVar;
            int i5 = iVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                iVar.label = i5 - Integer.MIN_VALUE;
                i iVar2 = iVar;
                Object obj = iVar2.result;
                W5.a aVar3 = W5.a.f2787d;
                i2 = iVar2.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    j jVar = new j(str, str2, str3, this);
                    C2.c cVar = this._httpClient;
                    String d7 = r4.f.d("in_app_messages/", str4, "/impression");
                    iVar2.L$0 = this;
                    iVar2.label = 1;
                    obj = C2.b.post$default(cVar, d7, jVar, null, iVar2, 4, null);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    aVar = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) iVar2.L$0;
                    V6.b.P(obj);
                }
                aVar2 = (C2.a) obj;
                if (aVar2.isSuccess()) {
                    aVar.printHttpErrorForInAppMessageRequest("impression", aVar2.getStatusCode(), aVar2.getPayload());
                    throw new C0846a(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
                }
                String payload = aVar2.getPayload();
                Intrinsics.b(payload);
                aVar.printHttpSuccessForInAppMessageRequest("impression", payload);
                return Unit.f6114a;
            }
        }
        iVar = new i(bVar);
        i iVar22 = iVar;
        Object obj2 = iVar22.result;
        W5.a aVar32 = W5.a.f2787d;
        i2 = iVar22.label;
        if (i2 != 0) {
        }
        aVar2 = (C2.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // O2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendIAMPageImpression(String str, String str2, String str3, String str4, String str5, V5.b bVar) {
        k kVar;
        int i2;
        Object post$default;
        a aVar;
        C2.a aVar2;
        if (bVar instanceof k) {
            kVar = (k) bVar;
            int i5 = kVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                kVar.label = i5 - Integer.MIN_VALUE;
                k kVar2 = kVar;
                Object obj = kVar2.result;
                W5.a aVar3 = W5.a.f2787d;
                i2 = kVar2.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    l lVar = new l(str, str2, str3, this, str5);
                    C2.c cVar = this._httpClient;
                    String d7 = r4.f.d("in_app_messages/", str4, "/pageImpression");
                    kVar2.L$0 = this;
                    kVar2.label = 1;
                    post$default = C2.b.post$default(cVar, d7, lVar, null, kVar2, 4, null);
                    if (post$default == aVar3) {
                        return aVar3;
                    }
                    aVar = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a aVar4 = (a) kVar2.L$0;
                    V6.b.P(obj);
                    aVar = aVar4;
                    post$default = obj;
                }
                aVar2 = (C2.a) post$default;
                if (aVar2.isSuccess()) {
                    aVar.printHttpErrorForInAppMessageRequest("page impression", aVar2.getStatusCode(), aVar2.getPayload());
                    throw new C0846a(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
                }
                String payload = aVar2.getPayload();
                Intrinsics.b(payload);
                aVar.printHttpSuccessForInAppMessageRequest("page impression", payload);
                return Unit.f6114a;
            }
        }
        kVar = new k(bVar);
        k kVar22 = kVar;
        Object obj2 = kVar22.result;
        W5.a aVar32 = W5.a.f2787d;
        i2 = kVar22.label;
        if (i2 != 0) {
        }
        aVar2 = (C2.a) post$default;
        if (aVar2.isSuccess()) {
        }
    }
}
