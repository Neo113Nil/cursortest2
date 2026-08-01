package com.onesignal.inAppMessages.internal.backend.impl;

import com.onesignal.common.g;
import ge.a0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function0;
import n0.l;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements xa.b {
    private final ja.c _deviceService;
    private final ka.c _httpClient;
    private final ab.a _hydrator;
    private int htmlNetworkRequestAttemptCount;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.inAppMessages.internal.backend.impl.a$a, reason: collision with other inner class name */
    public static final class C0024a extends nd.c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C0024a(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.attemptFetchWithRetries(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.fetchInAppMessagesWithoutRywToken(null, null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.getIAMData(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class d extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.getIAMPreviewData(null, null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class e extends nd.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public e(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.listInAppMessages(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class f extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public f(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendIAMClick(null, null, null, null, null, false, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class g extends JSONObject {
        public g(String str, a aVar, String str2, String str3, String str4, boolean z10) {
            put("app_id", str);
            put("device_type", aVar._deviceService.getDeviceType().getValue());
            put("player_id", str2);
            put("click_id", str3);
            put("variant_id", str4);
            if (z10) {
                put("first_click", true);
            }
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class h extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public h(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendIAMImpression(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class i extends JSONObject {
        public i(String str, String str2, String str3, a aVar) {
            put("app_id", str);
            put("player_id", str2);
            put("variant_id", str3);
            put("device_type", aVar._deviceService.getDeviceType().getValue());
            put("first_impression", true);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class j extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public j(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendIAMPageImpression(null, null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class k extends JSONObject {
        public k(String str, String str2, String str3, a aVar, String str4) {
            put("app_id", str);
            put("player_id", str2);
            put("variant_id", str3);
            put("device_type", aVar._deviceService.getDeviceType().getValue());
            put("page_id", str4);
        }
    }

    public a(ka.c cVar, ja.c cVar2, ab.a aVar) {
        cVar.getClass();
        cVar2.getClass();
        aVar.getClass();
        this._httpClient = cVar;
        this._deviceService = cVar2;
        this._hydrator = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0124, code lost:
    
        if (ge.a0.i(r14, r1) == r3) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0107 -> B:17:0x0127). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0124 -> B:17:0x0127). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attemptFetchWithRetries(String str, w9.b bVar, Function0<Long> function0, ld.a aVar) {
        C0024a c0024a;
        a aVar2;
        int i3;
        Function0<Long> function02;
        int i10;
        int i11;
        C0024a c0024a2;
        a aVar3;
        String str2;
        w9.b bVar2;
        a aVar4;
        String str3;
        w9.b bVar3;
        Function0<Long> function03;
        int i12;
        ka.a aVar5;
        Object obj;
        if (aVar instanceof C0024a) {
            c0024a = (C0024a) aVar;
            int i13 = c0024a.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0024a.label = i13 - Integer.MIN_VALUE;
                aVar2 = this;
                Object obj2 = c0024a.result;
                md.a aVar6 = md.a.f6622d;
                i3 = c0024a.label;
                if (i3 != 0) {
                    cf.c.M(obj2);
                    function02 = function0;
                    i10 = 0;
                    i11 = 0;
                    c0024a2 = c0024a;
                    aVar3 = aVar2;
                    str2 = str;
                    bVar2 = bVar;
                    com.onesignal.core.internal.http.impl.d dVar = new com.onesignal.core.internal.http.impl.d(null, bVar2.getRywToken(), i10 <= 0 ? new Integer(i10) : null, new Long(((Number) function02.invoke()).longValue()), 1, null);
                    ka.c cVar = aVar3._httpClient;
                    c0024a2.L$0 = aVar3;
                    c0024a2.L$1 = str2;
                    c0024a2.L$2 = bVar2;
                    c0024a2.L$3 = function02;
                    c0024a2.I$0 = i10;
                    c0024a2.I$1 = i11;
                    c0024a2.label = 1;
                    obj = cVar.get(str2, dVar, c0024a2);
                    if (obj != aVar6) {
                    }
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            cf.c.M(obj2);
                            return obj2;
                        }
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i12 = c0024a.I$1;
                    i10 = c0024a.I$0;
                    function03 = (Function0) c0024a.L$3;
                    bVar3 = (w9.b) c0024a.L$2;
                    str3 = (String) c0024a.L$1;
                    aVar4 = (a) c0024a.L$0;
                    cf.c.M(obj2);
                    Function0<Long> function04 = function03;
                    c0024a2 = c0024a;
                    bVar2 = bVar3;
                    i11 = i12;
                    function02 = function04;
                    str2 = str3;
                    aVar3 = aVar4;
                    i10++;
                    if (i10 <= i11) {
                        c0024a2.L$0 = null;
                        c0024a2.L$1 = null;
                        c0024a2.L$2 = null;
                        c0024a2.L$3 = null;
                        c0024a2.label = 3;
                        Object fetchInAppMessagesWithoutRywToken = aVar3.fetchInAppMessagesWithoutRywToken(str2, function02, c0024a2);
                        return fetchInAppMessagesWithoutRywToken == aVar6 ? aVar6 : fetchInAppMessagesWithoutRywToken;
                    }
                    com.onesignal.core.internal.http.impl.d dVar2 = new com.onesignal.core.internal.http.impl.d(null, bVar2.getRywToken(), i10 <= 0 ? new Integer(i10) : null, new Long(((Number) function02.invoke()).longValue()), 1, null);
                    ka.c cVar2 = aVar3._httpClient;
                    c0024a2.L$0 = aVar3;
                    c0024a2.L$1 = str2;
                    c0024a2.L$2 = bVar2;
                    c0024a2.L$3 = function02;
                    c0024a2.I$0 = i10;
                    c0024a2.I$1 = i11;
                    c0024a2.label = 1;
                    obj = cVar2.get(str2, dVar2, c0024a2);
                    if (obj != aVar6) {
                        int i14 = i11;
                        bVar3 = bVar2;
                        c0024a = c0024a2;
                        function03 = function02;
                        i12 = i14;
                        aVar4 = aVar3;
                        str3 = str2;
                        obj2 = obj;
                        aVar5 = (ka.a) obj2;
                        if (aVar5.isSuccess()) {
                            String payload = aVar5.getPayload();
                            JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
                            if (jSONObject != null) {
                                return aVar4.hydrateInAppMessages(jSONObject);
                            }
                            return null;
                        }
                        if (aVar5.getStatusCode() != 425 && aVar5.getStatusCode() != 429) {
                            aVar5.getStatusCode();
                            return null;
                        }
                        Integer retryLimit = aVar5.getRetryLimit();
                        if (retryLimit != null) {
                            i12 = retryLimit.intValue();
                        }
                        if (aVar5.getRetryAfterSeconds() != null) {
                            long intValue = r0.intValue() * 1000;
                            c0024a.L$0 = aVar4;
                            c0024a.L$1 = str3;
                            c0024a.L$2 = bVar3;
                            c0024a.L$3 = function03;
                            c0024a.I$0 = i10;
                            c0024a.I$1 = i12;
                            c0024a.label = 2;
                        }
                        Function0<Long> function042 = function03;
                        c0024a2 = c0024a;
                        bVar2 = bVar3;
                        i11 = i12;
                        function02 = function042;
                        str2 = str3;
                        aVar3 = aVar4;
                        i10++;
                        if (i10 <= i11) {
                        }
                    }
                }
                i12 = c0024a.I$1;
                i10 = c0024a.I$0;
                function03 = (Function0) c0024a.L$3;
                bVar3 = (w9.b) c0024a.L$2;
                str3 = (String) c0024a.L$1;
                aVar4 = (a) c0024a.L$0;
                cf.c.M(obj2);
                aVar5 = (ka.a) obj2;
                if (aVar5.isSuccess()) {
                }
            }
        }
        aVar2 = this;
        c0024a = aVar2.new C0024a(aVar);
        Object obj22 = c0024a.result;
        md.a aVar62 = md.a.f6622d;
        i3 = c0024a.label;
        if (i3 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchInAppMessagesWithoutRywToken(String str, Function0<Long> function0, ld.a aVar) {
        b bVar;
        int i3;
        a aVar2;
        ka.a aVar3;
        if (aVar instanceof b) {
            bVar = (b) aVar;
            int i10 = bVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.label = i10 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                md.a aVar4 = md.a.f6622d;
                i3 = bVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    ka.c cVar = this._httpClient;
                    com.onesignal.core.internal.http.impl.d dVar = new com.onesignal.core.internal.http.impl.d(null, null, null, (Long) function0.invoke(), 7, null);
                    bVar.L$0 = this;
                    bVar.label = 1;
                    obj = cVar.get(str, dVar, bVar);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                    aVar2 = this;
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar2 = (a) bVar.L$0;
                    cf.c.M(obj);
                }
                aVar3 = (ka.a) obj;
                if (aVar3.isSuccess()) {
                    String payload = aVar3.getPayload();
                    JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
                    if (jSONObject != null) {
                        return aVar2.hydrateInAppMessages(jSONObject);
                    }
                }
                return null;
            }
        }
        bVar = new b(aVar);
        Object obj2 = bVar.result;
        md.a aVar42 = md.a.f6622d;
        i3 = bVar.label;
        if (i3 != 0) {
        }
        aVar3 = (ka.a) obj2;
        if (aVar3.isSuccess()) {
        }
        return null;
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
        ab.a aVar = this._hydrator;
        jSONArray.getClass();
        return aVar.hydrateIAMMessages(jSONArray);
    }

    private final void printHttpErrorForInAppMessageRequest(String str, int i3, String str2) {
        com.onesignal.debug.internal.logging.b.error$default("Encountered a " + i3 + " error while attempting in-app message " + str + " request: " + str2, null, 2, null);
    }

    private final void printHttpSuccessForInAppMessageRequest(String str, String str2) {
        com.onesignal.debug.internal.logging.b.debug$default("Successful post for in-app message " + str + " request: " + str2, null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // xa.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getIAMData(String str, String str2, String str3, ld.a aVar) {
        c cVar;
        int i3;
        a aVar2;
        ka.a aVar3;
        if (aVar instanceof c) {
            cVar = (c) aVar;
            int i10 = cVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.label = i10 - Integer.MIN_VALUE;
                c cVar2 = cVar;
                Object obj = cVar2.result;
                md.a aVar4 = md.a.f6622d;
                i3 = cVar2.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    String htmlPathForMessage = htmlPathForMessage(str2, str3, str);
                    if (htmlPathForMessage == null) {
                        return new xa.a(null, false);
                    }
                    ka.c cVar3 = this._httpClient;
                    cVar2.L$0 = this;
                    cVar2.label = 1;
                    obj = ka.b.get$default(cVar3, htmlPathForMessage, null, cVar2, 2, null);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                    aVar2 = this;
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar2 = (a) cVar2.L$0;
                    cf.c.M(obj);
                }
                aVar3 = (ka.a) obj;
                if (!aVar3.isSuccess()) {
                    aVar2.htmlNetworkRequestAttemptCount = 0;
                    String payload = aVar3.getPayload();
                    payload.getClass();
                    return new xa.a(aVar2._hydrator.hydrateIAMMessageContent(new JSONObject(payload)), false);
                }
                aVar2.printHttpErrorForInAppMessageRequest(com.onesignal.inAppMessages.internal.d.HTML, aVar3.getStatusCode(), aVar3.getPayload());
                com.onesignal.common.g gVar = com.onesignal.common.g.INSTANCE;
                if (gVar.getResponseStatusType(aVar3.getStatusCode()) != g.a.RETRYABLE || aVar2.htmlNetworkRequestAttemptCount >= gVar.getMaxNetworkRequestAttemptCount()) {
                    aVar2.htmlNetworkRequestAttemptCount = 0;
                    return new xa.a(null, false);
                }
                aVar2.htmlNetworkRequestAttemptCount++;
                return new xa.a(null, true);
            }
        }
        cVar = new c(aVar);
        c cVar22 = cVar;
        Object obj2 = cVar22.result;
        md.a aVar42 = md.a.f6622d;
        i3 = cVar22.label;
        if (i3 != 0) {
        }
        aVar3 = (ka.a) obj2;
        if (!aVar3.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // xa.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getIAMPreviewData(String str, String str2, ld.a aVar) {
        d dVar;
        int i3;
        a aVar2;
        ka.a aVar3;
        if (aVar instanceof d) {
            dVar = (d) aVar;
            int i10 = dVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.label = i10 - Integer.MIN_VALUE;
                d dVar2 = dVar;
                Object obj = dVar2.result;
                md.a aVar4 = md.a.f6622d;
                i3 = dVar2.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    ka.c cVar = this._httpClient;
                    dVar2.L$0 = this;
                    dVar2.label = 1;
                    obj = ka.b.get$default(cVar, "in_app_messages/device_preview?preview_id=" + str2 + "&app_id=" + str, null, dVar2, 2, null);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                    aVar2 = this;
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar2 = (a) dVar2.L$0;
                    cf.c.M(obj);
                }
                aVar3 = (ka.a) obj;
                if (aVar3.isSuccess()) {
                    aVar2.printHttpErrorForInAppMessageRequest(com.onesignal.inAppMessages.internal.d.HTML, aVar3.getStatusCode(), aVar3.getPayload());
                    return null;
                }
                String payload = aVar3.getPayload();
                payload.getClass();
                return aVar2._hydrator.hydrateIAMMessageContent(new JSONObject(payload));
            }
        }
        dVar = new d(aVar);
        d dVar22 = dVar;
        Object obj2 = dVar22.result;
        md.a aVar42 = md.a.f6622d;
        i3 = dVar22.label;
        if (i3 != 0) {
        }
        aVar3 = (ka.a) obj2;
        if (aVar3.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // xa.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listInAppMessages(String str, String str2, w9.b bVar, Function0<Long> function0, ld.a aVar) {
        e eVar;
        int i3;
        a aVar2;
        if (aVar instanceof e) {
            eVar = (e) aVar;
            int i10 = eVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.label = i10 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                md.a aVar3 = md.a.f6622d;
                i3 = eVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    Long rywDelay = bVar.getRywDelay();
                    long longValue = rywDelay != null ? rywDelay.longValue() : 500L;
                    eVar.L$0 = this;
                    eVar.L$1 = str;
                    eVar.L$2 = str2;
                    eVar.L$3 = bVar;
                    eVar.L$4 = function0;
                    eVar.label = 1;
                    if (a0.i(longValue, eVar) != aVar3) {
                        aVar2 = this;
                    }
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        cf.c.M(obj);
                        return obj;
                    }
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                function0 = (Function0) eVar.L$4;
                bVar = (w9.b) eVar.L$3;
                str2 = (String) eVar.L$2;
                str = (String) eVar.L$1;
                aVar2 = (a) eVar.L$0;
                cf.c.M(obj);
                eVar.L$0 = null;
                eVar.L$1 = null;
                eVar.L$2 = null;
                eVar.L$3 = null;
                eVar.L$4 = null;
                eVar.label = 2;
                Object attemptFetchWithRetries = aVar2.attemptFetchWithRetries("apps/" + str + "/subscriptions/" + str2 + "/iams", bVar, function0, eVar);
                return attemptFetchWithRetries != aVar3 ? aVar3 : attemptFetchWithRetries;
            }
        }
        eVar = new e(aVar);
        Object obj2 = eVar.result;
        md.a aVar32 = md.a.f6622d;
        i3 = eVar.label;
        if (i3 != 0) {
        }
        eVar.L$0 = null;
        eVar.L$1 = null;
        eVar.L$2 = null;
        eVar.L$3 = null;
        eVar.L$4 = null;
        eVar.label = 2;
        Object attemptFetchWithRetries2 = aVar2.attemptFetchWithRetries("apps/" + str + "/subscriptions/" + str2 + "/iams", bVar, function0, eVar);
        if (attemptFetchWithRetries2 != aVar32) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // xa.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendIAMClick(String str, String str2, String str3, String str4, String str5, boolean z10, ld.a aVar) {
        f fVar;
        int i3;
        a aVar2;
        ka.a aVar3;
        if (aVar instanceof f) {
            fVar = (f) aVar;
            int i10 = fVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.label = i10 - Integer.MIN_VALUE;
                f fVar2 = fVar;
                Object obj = fVar2.result;
                md.a aVar4 = md.a.f6622d;
                i3 = fVar2.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    g gVar = new g(str, this, str2, str5, str3, z10);
                    ka.c cVar = this._httpClient;
                    String g2 = l.g("in_app_messages/", str4, "/click");
                    fVar2.L$0 = this;
                    fVar2.label = 1;
                    obj = ka.b.post$default(cVar, g2, gVar, null, fVar2, 4, null);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                    aVar2 = this;
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar2 = (a) fVar2.L$0;
                    cf.c.M(obj);
                }
                aVar3 = (ka.a) obj;
                if (aVar3.isSuccess()) {
                    aVar2.printHttpErrorForInAppMessageRequest("engagement", aVar3.getStatusCode(), aVar3.getPayload());
                    throw new z9.a(aVar3.getStatusCode(), aVar3.getPayload(), aVar3.getRetryAfterSeconds());
                }
                String payload = aVar3.getPayload();
                payload.getClass();
                aVar2.printHttpSuccessForInAppMessageRequest("engagement", payload);
                return Unit.f5554a;
            }
        }
        fVar = new f(aVar);
        f fVar22 = fVar;
        Object obj2 = fVar22.result;
        md.a aVar42 = md.a.f6622d;
        i3 = fVar22.label;
        if (i3 != 0) {
        }
        aVar3 = (ka.a) obj2;
        if (aVar3.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // xa.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendIAMImpression(String str, String str2, String str3, String str4, ld.a aVar) {
        h hVar;
        int i3;
        a aVar2;
        ka.a aVar3;
        if (aVar instanceof h) {
            hVar = (h) aVar;
            int i10 = hVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.label = i10 - Integer.MIN_VALUE;
                h hVar2 = hVar;
                Object obj = hVar2.result;
                md.a aVar4 = md.a.f6622d;
                i3 = hVar2.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    i iVar = new i(str, str2, str3, this);
                    ka.c cVar = this._httpClient;
                    String g2 = l.g("in_app_messages/", str4, "/impression");
                    hVar2.L$0 = this;
                    hVar2.label = 1;
                    obj = ka.b.post$default(cVar, g2, iVar, null, hVar2, 4, null);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                    aVar2 = this;
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar2 = (a) hVar2.L$0;
                    cf.c.M(obj);
                }
                aVar3 = (ka.a) obj;
                if (aVar3.isSuccess()) {
                    aVar2.printHttpErrorForInAppMessageRequest("impression", aVar3.getStatusCode(), aVar3.getPayload());
                    throw new z9.a(aVar3.getStatusCode(), aVar3.getPayload(), aVar3.getRetryAfterSeconds());
                }
                String payload = aVar3.getPayload();
                payload.getClass();
                aVar2.printHttpSuccessForInAppMessageRequest("impression", payload);
                return Unit.f5554a;
            }
        }
        hVar = new h(aVar);
        h hVar22 = hVar;
        Object obj2 = hVar22.result;
        md.a aVar42 = md.a.f6622d;
        i3 = hVar22.label;
        if (i3 != 0) {
        }
        aVar3 = (ka.a) obj2;
        if (aVar3.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // xa.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendIAMPageImpression(String str, String str2, String str3, String str4, String str5, ld.a aVar) {
        j jVar;
        int i3;
        Object post$default;
        a aVar2;
        ka.a aVar3;
        if (aVar instanceof j) {
            jVar = (j) aVar;
            int i10 = jVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.label = i10 - Integer.MIN_VALUE;
                j jVar2 = jVar;
                Object obj = jVar2.result;
                md.a aVar4 = md.a.f6622d;
                i3 = jVar2.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    k kVar = new k(str, str2, str3, this, str5);
                    ka.c cVar = this._httpClient;
                    String g2 = l.g("in_app_messages/", str4, "/pageImpression");
                    jVar2.L$0 = this;
                    jVar2.label = 1;
                    post$default = ka.b.post$default(cVar, g2, kVar, null, jVar2, 4, null);
                    if (post$default == aVar4) {
                        return aVar4;
                    }
                    aVar2 = this;
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a aVar5 = (a) jVar2.L$0;
                    cf.c.M(obj);
                    aVar2 = aVar5;
                    post$default = obj;
                }
                aVar3 = (ka.a) post$default;
                if (aVar3.isSuccess()) {
                    aVar2.printHttpErrorForInAppMessageRequest("page impression", aVar3.getStatusCode(), aVar3.getPayload());
                    throw new z9.a(aVar3.getStatusCode(), aVar3.getPayload(), aVar3.getRetryAfterSeconds());
                }
                String payload = aVar3.getPayload();
                payload.getClass();
                aVar2.printHttpSuccessForInAppMessageRequest("page impression", payload);
                return Unit.f5554a;
            }
        }
        jVar = new j(aVar);
        j jVar22 = jVar;
        Object obj2 = jVar22.result;
        md.a aVar42 = md.a.f6622d;
        i3 = jVar22.label;
        if (i3 != 0) {
        }
        aVar3 = (ka.a) post$default;
        if (aVar3.isSuccess()) {
        }
    }
}
