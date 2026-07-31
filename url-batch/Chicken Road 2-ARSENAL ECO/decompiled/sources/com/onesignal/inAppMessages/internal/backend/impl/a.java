package com.onesignal.inAppMessages.internal.backend.impl;

import H5.AbstractC0165z;
import W4.o;
import a2.C0224a;
import com.onesignal.common.g;
import java.util.List;
import k5.v;
import m2.C0522a;
import m2.InterfaceC0523b;
import o5.InterfaceC0564d;
import org.json.JSONArray;
import org.json.JSONObject;
import p2.C0578a;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class a implements InterfaceC0523b {
    private final Y1.c _deviceService;
    private final a2.c _httpClient;
    private final C0578a _hydrator;
    private int htmlNetworkRequestAttemptCount;

    /* renamed from: com.onesignal.inAppMessages.internal.backend.impl.a$a, reason: collision with other inner class name */
    public static final class C0031a extends AbstractC0607c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C0031a(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.attemptFetchWithRetries(null, null, null, null, this);
        }
    }

    public static final class b extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.fetchInAppMessagesWithoutRywToken(null, null, null, this);
        }
    }

    public static final class c extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.getIAMData(null, null, null, this);
        }
    }

    public static final class d extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.getIAMPreviewData(null, null, this);
        }
    }

    public static final class e extends AbstractC0607c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public e(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.listInAppMessages(null, null, null, null, this);
        }
    }

    public static final class f extends AbstractC0607c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public f(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.listInAppMessagesIv(null, null, null, null, null, null, null, this);
        }
    }

    public static final class g extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public g(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendIAMClick(null, null, null, null, null, false, this);
        }
    }

    public static final class h extends JSONObject {
        public h(String str, a aVar, String str2, String str3, String str4, boolean z5) {
            put("app_id", str);
            put("device_type", aVar._deviceService.getDeviceType().getValue());
            put("player_id", str2);
            put("click_id", str3);
            put("variant_id", str4);
            if (z5) {
                put("first_click", true);
            }
        }
    }

    public static final class i extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public i(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
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

    public static final class k extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public k(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
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

    public a(a2.c _httpClient, Y1.c _deviceService, C0578a _hydrator) {
        kotlin.jvm.internal.i.e(_httpClient, "_httpClient");
        kotlin.jvm.internal.i.e(_deviceService, "_deviceService");
        kotlin.jvm.internal.i.e(_hydrator, "_hydrator");
        this._httpClient = _httpClient;
        this._deviceService = _deviceService;
        this._hydrator = _hydrator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0168, code lost:
    
        if (H5.AbstractC0165z.d(r5, r1) == r3) goto L63;
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
    public final Object attemptFetchWithRetries(String str, M1.b bVar, InterfaceC0732a interfaceC0732a, String str2, InterfaceC0564d interfaceC0564d) {
        C0031a c0031a;
        a aVar;
        int i7;
        InterfaceC0732a interfaceC0732a2;
        String str3;
        int i8;
        int i9;
        C0031a c0031a2;
        a aVar2;
        String str4;
        M1.b bVar2;
        JSONObject jSONObject;
        a aVar3;
        String str5;
        M1.b bVar3;
        InterfaceC0732a interfaceC0732a3;
        String str6;
        int i10;
        int i11;
        C0224a c0224a;
        Object obj;
        if (interfaceC0564d instanceof C0031a) {
            c0031a = (C0031a) interfaceC0564d;
            int i12 = c0031a.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c0031a.label = i12 - Integer.MIN_VALUE;
                aVar = this;
                Object obj2 = c0031a.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = c0031a.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj2);
                    interfaceC0732a2 = interfaceC0732a;
                    str3 = str2;
                    i8 = 0;
                    i9 = 0;
                    c0031a2 = c0031a;
                    aVar2 = aVar;
                    str4 = str;
                    bVar2 = bVar;
                    int i13 = i9;
                    int i14 = i8;
                    jSONObject = null;
                    a aVar4 = aVar2;
                    C0031a c0031a3 = c0031a2;
                    com.onesignal.core.internal.http.impl.e eVar = new com.onesignal.core.internal.http.impl.e(null, bVar2.getRywToken(), i8 <= 0 ? new Integer(i8) : null, new Long(((Number) interfaceC0732a2.invoke()).longValue()), str3, 1, null);
                    a2.c cVar = aVar4._httpClient;
                    c0031a3.L$0 = aVar4;
                    c0031a3.L$1 = str4;
                    c0031a3.L$2 = bVar2;
                    c0031a3.L$3 = interfaceC0732a2;
                    c0031a3.L$4 = str3;
                    c0031a3.I$0 = i14;
                    c0031a3.I$1 = i13;
                    c0031a3.label = 1;
                    obj = cVar.get(str4, eVar, c0031a3);
                    if (obj != enumC0580a) {
                    }
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0676f.w(obj2);
                        return obj2;
                    }
                    i11 = c0031a.I$1;
                    i10 = c0031a.I$0;
                    str6 = (String) c0031a.L$4;
                    interfaceC0732a3 = (InterfaceC0732a) c0031a.L$3;
                    bVar3 = (M1.b) c0031a.L$2;
                    str5 = (String) c0031a.L$1;
                    aVar3 = (a) c0031a.L$0;
                    AbstractC0676f.w(obj2);
                    char c7 = 2;
                    jSONObject = null;
                    String str7 = str6;
                    c0031a2 = c0031a;
                    bVar2 = bVar3;
                    aVar2 = aVar3;
                    str3 = str7;
                    InterfaceC0732a interfaceC0732a4 = interfaceC0732a3;
                    i9 = i11;
                    interfaceC0732a2 = interfaceC0732a4;
                    i8 = i10 + 1;
                    if (i8 <= i9) {
                        JSONObject jSONObject2 = jSONObject;
                        c0031a2.L$0 = jSONObject2;
                        c0031a2.L$1 = jSONObject2;
                        c0031a2.L$2 = jSONObject2;
                        c0031a2.L$3 = jSONObject2;
                        c0031a2.L$4 = jSONObject2;
                        c0031a2.label = 3;
                        Object fetchInAppMessagesWithoutRywToken = aVar2.fetchInAppMessagesWithoutRywToken(str5, interfaceC0732a2, str3, c0031a2);
                        return fetchInAppMessagesWithoutRywToken == enumC0580a ? enumC0580a : fetchInAppMessagesWithoutRywToken;
                    }
                    str4 = str5;
                    int i132 = i9;
                    int i142 = i8;
                    jSONObject = null;
                    a aVar42 = aVar2;
                    C0031a c0031a32 = c0031a2;
                    com.onesignal.core.internal.http.impl.e eVar2 = new com.onesignal.core.internal.http.impl.e(null, bVar2.getRywToken(), i8 <= 0 ? new Integer(i8) : null, new Long(((Number) interfaceC0732a2.invoke()).longValue()), str3, 1, null);
                    a2.c cVar2 = aVar42._httpClient;
                    c0031a32.L$0 = aVar42;
                    c0031a32.L$1 = str4;
                    c0031a32.L$2 = bVar2;
                    c0031a32.L$3 = interfaceC0732a2;
                    c0031a32.L$4 = str3;
                    c0031a32.I$0 = i142;
                    c0031a32.I$1 = i132;
                    c0031a32.label = 1;
                    obj = cVar2.get(str4, eVar2, c0031a32);
                    if (obj != enumC0580a) {
                        str5 = str4;
                        bVar3 = bVar2;
                        interfaceC0732a3 = interfaceC0732a2;
                        c0031a = c0031a32;
                        i11 = i132;
                        obj2 = obj;
                        str6 = str3;
                        aVar3 = aVar42;
                        i10 = i142;
                        c0224a = (C0224a) obj2;
                        if (c0224a.isSuccess()) {
                            String payload = c0224a.getPayload();
                            JSONObject jSONObject3 = payload != null ? new JSONObject(payload) : jSONObject;
                            return jSONObject3 != null ? aVar3.hydrateInAppMessages(jSONObject3) : jSONObject;
                        }
                        if (c0224a.getStatusCode() != 425 && c0224a.getStatusCode() != 429) {
                            if (com.onesignal.common.g.INSTANCE.getResponseStatusType(c0224a.getStatusCode()) == g.a.UNAUTHORIZED) {
                                throw new P1.a(c0224a.getStatusCode(), c0224a.getPayload(), c0224a.getRetryAfterSeconds());
                            }
                            c0224a.getStatusCode();
                            return jSONObject;
                        }
                        Integer retryLimit = c0224a.getRetryLimit();
                        if (retryLimit != null) {
                            i11 = retryLimit.intValue();
                        }
                        if (c0224a.getRetryAfterSeconds() != null) {
                            long intValue = r0.intValue() * 1000;
                            c0031a.L$0 = aVar3;
                            c0031a.L$1 = str5;
                            c0031a.L$2 = bVar3;
                            c0031a.L$3 = interfaceC0732a3;
                            c0031a.L$4 = str6;
                            c0031a.I$0 = i10;
                            c0031a.I$1 = i11;
                            c7 = 2;
                            c0031a.label = 2;
                        } else {
                            c7 = 2;
                        }
                        String str72 = str6;
                        c0031a2 = c0031a;
                        bVar2 = bVar3;
                        aVar2 = aVar3;
                        str3 = str72;
                        InterfaceC0732a interfaceC0732a42 = interfaceC0732a3;
                        i9 = i11;
                        interfaceC0732a2 = interfaceC0732a42;
                        i8 = i10 + 1;
                        if (i8 <= i9) {
                        }
                    }
                }
                i11 = c0031a.I$1;
                i10 = c0031a.I$0;
                str6 = (String) c0031a.L$4;
                interfaceC0732a3 = (InterfaceC0732a) c0031a.L$3;
                bVar3 = (M1.b) c0031a.L$2;
                str5 = (String) c0031a.L$1;
                aVar3 = (a) c0031a.L$0;
                AbstractC0676f.w(obj2);
                jSONObject = null;
                c0224a = (C0224a) obj2;
                if (c0224a.isSuccess()) {
                }
            }
        }
        aVar = this;
        c0031a = aVar.new C0031a(interfaceC0564d);
        Object obj22 = c0031a.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = c0031a.label;
        if (i7 != 0) {
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
    public final Object fetchInAppMessagesWithoutRywToken(String str, InterfaceC0732a interfaceC0732a, String str2, InterfaceC0564d interfaceC0564d) {
        b bVar;
        int i7;
        a aVar;
        C0224a c0224a;
        if (interfaceC0564d instanceof b) {
            bVar = (b) interfaceC0564d;
            int i8 = bVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.label = i8 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = bVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    a2.c cVar = this._httpClient;
                    com.onesignal.core.internal.http.impl.e eVar = new com.onesignal.core.internal.http.impl.e(null, null, null, (Long) interfaceC0732a.invoke(), str2, 7, null);
                    bVar.L$0 = this;
                    bVar.label = 1;
                    obj = cVar.get(str, eVar, bVar);
                    if (obj == enumC0580a) {
                        return enumC0580a;
                    }
                    aVar = this;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) bVar.L$0;
                    AbstractC0676f.w(obj);
                }
                c0224a = (C0224a) obj;
                if (c0224a.isSuccess()) {
                    if (com.onesignal.common.g.INSTANCE.getResponseStatusType(c0224a.getStatusCode()) != g.a.UNAUTHORIZED) {
                        return null;
                    }
                    throw new P1.a(c0224a.getStatusCode(), c0224a.getPayload(), c0224a.getRetryAfterSeconds());
                }
                String payload = c0224a.getPayload();
                JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
                if (jSONObject != null) {
                    return aVar.hydrateInAppMessages(jSONObject);
                }
                return null;
            }
        }
        bVar = new b(interfaceC0564d);
        Object obj2 = bVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = bVar.label;
        if (i7 != 0) {
        }
        c0224a = (C0224a) obj2;
        if (c0224a.isSuccess()) {
        }
    }

    public static /* synthetic */ Object fetchInAppMessagesWithoutRywToken$default(a aVar, String str, InterfaceC0732a interfaceC0732a, String str2, InterfaceC0564d interfaceC0564d, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            str2 = null;
        }
        return aVar.fetchInAppMessagesWithoutRywToken(str, interfaceC0732a, str2, interfaceC0564d);
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
        C0578a c0578a = this._hydrator;
        kotlin.jvm.internal.i.b(jSONArray);
        return c0578a.hydrateIAMMessages(jSONArray);
    }

    private final void printHttpErrorForInAppMessageRequest(String str, int i7, String str2) {
        com.onesignal.debug.internal.logging.b.info$default("Encountered a " + i7 + " error while attempting in-app message " + str + " request: " + str2, null, 2, null);
    }

    private final void printHttpSuccessForInAppMessageRequest(String str, String str2) {
        com.onesignal.debug.internal.logging.b.debug$default("Successful post for in-app message " + str + " request: " + str2, null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // m2.InterfaceC0523b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getIAMData(String str, String str2, String str3, InterfaceC0564d interfaceC0564d) {
        c cVar;
        int i7;
        a aVar;
        C0224a c0224a;
        if (interfaceC0564d instanceof c) {
            cVar = (c) interfaceC0564d;
            int i8 = cVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar.label = i8 - Integer.MIN_VALUE;
                c cVar2 = cVar;
                Object obj = cVar2.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = cVar2.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    String htmlPathForMessage = htmlPathForMessage(str2, str3, str);
                    if (htmlPathForMessage == null) {
                        return new C0522a(null, false);
                    }
                    a2.c cVar3 = this._httpClient;
                    cVar2.L$0 = this;
                    cVar2.label = 1;
                    obj = a2.b.get$default(cVar3, htmlPathForMessage, null, cVar2, 2, null);
                    if (obj == enumC0580a) {
                        return enumC0580a;
                    }
                    aVar = this;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) cVar2.L$0;
                    AbstractC0676f.w(obj);
                }
                c0224a = (C0224a) obj;
                if (!c0224a.isSuccess()) {
                    aVar.htmlNetworkRequestAttemptCount = 0;
                    String payload = c0224a.getPayload();
                    kotlin.jvm.internal.i.b(payload);
                    return new C0522a(aVar._hydrator.hydrateIAMMessageContent(new JSONObject(payload)), false);
                }
                aVar.printHttpErrorForInAppMessageRequest(com.onesignal.inAppMessages.internal.d.HTML, c0224a.getStatusCode(), c0224a.getPayload());
                com.onesignal.common.g gVar = com.onesignal.common.g.INSTANCE;
                if (gVar.getResponseStatusType(c0224a.getStatusCode()) != g.a.RETRYABLE || aVar.htmlNetworkRequestAttemptCount >= gVar.getMaxNetworkRequestAttemptCount()) {
                    aVar.htmlNetworkRequestAttemptCount = 0;
                    return new C0522a(null, false);
                }
                aVar.htmlNetworkRequestAttemptCount++;
                return new C0522a(null, true);
            }
        }
        cVar = new c(interfaceC0564d);
        c cVar22 = cVar;
        Object obj2 = cVar22.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = cVar22.label;
        if (i7 != 0) {
        }
        c0224a = (C0224a) obj2;
        if (!c0224a.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // m2.InterfaceC0523b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getIAMPreviewData(String str, String str2, InterfaceC0564d interfaceC0564d) {
        d dVar;
        int i7;
        a aVar;
        C0224a c0224a;
        if (interfaceC0564d instanceof d) {
            dVar = (d) interfaceC0564d;
            int i8 = dVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                dVar.label = i8 - Integer.MIN_VALUE;
                d dVar2 = dVar;
                Object obj = dVar2.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = dVar2.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    a2.c cVar = this._httpClient;
                    dVar2.L$0 = this;
                    dVar2.label = 1;
                    obj = a2.b.get$default(cVar, "in_app_messages/device_preview?preview_id=" + str2 + "&app_id=" + str, null, dVar2, 2, null);
                    if (obj == enumC0580a) {
                        return enumC0580a;
                    }
                    aVar = this;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) dVar2.L$0;
                    AbstractC0676f.w(obj);
                }
                c0224a = (C0224a) obj;
                if (c0224a.isSuccess()) {
                    aVar.printHttpErrorForInAppMessageRequest(com.onesignal.inAppMessages.internal.d.HTML, c0224a.getStatusCode(), c0224a.getPayload());
                    return null;
                }
                String payload = c0224a.getPayload();
                kotlin.jvm.internal.i.b(payload);
                return aVar._hydrator.hydrateIAMMessageContent(new JSONObject(payload));
            }
        }
        dVar = new d(interfaceC0564d);
        d dVar22 = dVar;
        Object obj2 = dVar22.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = dVar22.label;
        if (i7 != 0) {
        }
        c0224a = (C0224a) obj2;
        if (c0224a.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // m2.InterfaceC0523b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listInAppMessages(String str, String str2, M1.b bVar, InterfaceC0732a interfaceC0732a, InterfaceC0564d interfaceC0564d) {
        e eVar;
        int i7;
        a aVar;
        if (interfaceC0564d instanceof e) {
            eVar = (e) interfaceC0564d;
            int i8 = eVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                eVar.label = i8 - Integer.MIN_VALUE;
                e eVar2 = eVar;
                Object obj = eVar2.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = eVar2.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    Long rywDelay = bVar.getRywDelay();
                    long longValue = rywDelay != null ? rywDelay.longValue() : 500L;
                    eVar2.L$0 = this;
                    eVar2.L$1 = str;
                    eVar2.L$2 = str2;
                    eVar2.L$3 = bVar;
                    eVar2.L$4 = interfaceC0732a;
                    eVar2.label = 1;
                    if (AbstractC0165z.d(longValue, eVar2) != enumC0580a) {
                        aVar = this;
                    }
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                    return obj;
                }
                interfaceC0732a = (InterfaceC0732a) eVar2.L$4;
                bVar = (M1.b) eVar2.L$3;
                str2 = (String) eVar2.L$2;
                str = (String) eVar2.L$1;
                aVar = (a) eVar2.L$0;
                AbstractC0676f.w(obj);
                M1.b bVar2 = bVar;
                InterfaceC0732a interfaceC0732a2 = interfaceC0732a;
                eVar2.L$0 = null;
                eVar2.L$1 = null;
                eVar2.L$2 = null;
                eVar2.L$3 = null;
                eVar2.L$4 = null;
                eVar2.label = 2;
                Object attemptFetchWithRetries = aVar.attemptFetchWithRetries("apps/" + str + "/subscriptions/" + str2 + "/iams", bVar2, interfaceC0732a2, null, eVar2);
                return attemptFetchWithRetries != enumC0580a ? enumC0580a : attemptFetchWithRetries;
            }
        }
        eVar = new e(interfaceC0564d);
        e eVar22 = eVar;
        Object obj2 = eVar22.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = eVar22.label;
        if (i7 != 0) {
        }
        M1.b bVar22 = bVar;
        InterfaceC0732a interfaceC0732a22 = interfaceC0732a;
        eVar22.L$0 = null;
        eVar22.L$1 = null;
        eVar22.L$2 = null;
        eVar22.L$3 = null;
        eVar22.L$4 = null;
        eVar22.label = 2;
        Object attemptFetchWithRetries2 = aVar.attemptFetchWithRetries("apps/" + str + "/subscriptions/" + str2 + "/iams", bVar22, interfaceC0732a22, null, eVar22);
        if (attemptFetchWithRetries2 != enumC0580a2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // m2.InterfaceC0523b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listInAppMessagesIv(String str, String str2, String str3, String str4, M1.b bVar, InterfaceC0732a interfaceC0732a, String str5, InterfaceC0564d interfaceC0564d) {
        f fVar;
        int i7;
        String str6;
        a aVar;
        if (interfaceC0564d instanceof f) {
            fVar = (f) interfaceC0564d;
            int i8 = fVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                fVar.label = i8 - Integer.MIN_VALUE;
                Object obj = fVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = fVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    String str7 = "apps/" + str + "/users/by/" + str2 + '/' + str3 + "/subscriptions/" + str4 + "/iams";
                    if (bVar == null) {
                        fVar.label = 1;
                        Object fetchInAppMessagesWithoutRywToken = fetchInAppMessagesWithoutRywToken(str7, interfaceC0732a, str5, fVar);
                        if (fetchInAppMessagesWithoutRywToken != enumC0580a) {
                            return fetchInAppMessagesWithoutRywToken;
                        }
                    } else {
                        Long rywDelay = bVar.getRywDelay();
                        long longValue = rywDelay != null ? rywDelay.longValue() : 500L;
                        fVar.L$0 = this;
                        fVar.L$1 = bVar;
                        fVar.L$2 = interfaceC0732a;
                        fVar.L$3 = str5;
                        fVar.L$4 = str7;
                        fVar.label = 2;
                        if (AbstractC0165z.d(longValue, fVar) != enumC0580a) {
                            str6 = str7;
                            aVar = this;
                        }
                    }
                }
                if (i7 == 1) {
                    AbstractC0676f.w(obj);
                    return obj;
                }
                if (i7 != 2) {
                    if (i7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                    return obj;
                }
                String str8 = (String) fVar.L$4;
                str5 = (String) fVar.L$3;
                interfaceC0732a = (InterfaceC0732a) fVar.L$2;
                bVar = (M1.b) fVar.L$1;
                a aVar2 = (a) fVar.L$0;
                AbstractC0676f.w(obj);
                str6 = str8;
                aVar = aVar2;
                M1.b bVar2 = bVar;
                InterfaceC0732a interfaceC0732a2 = interfaceC0732a;
                String str9 = str5;
                fVar.L$0 = null;
                fVar.L$1 = null;
                fVar.L$2 = null;
                fVar.L$3 = null;
                fVar.L$4 = null;
                fVar.label = 3;
                Object attemptFetchWithRetries = aVar.attemptFetchWithRetries(str6, bVar2, interfaceC0732a2, str9, fVar);
                return attemptFetchWithRetries != enumC0580a ? enumC0580a : attemptFetchWithRetries;
            }
        }
        fVar = new f(interfaceC0564d);
        Object obj2 = fVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = fVar.label;
        if (i7 != 0) {
        }
        M1.b bVar22 = bVar;
        InterfaceC0732a interfaceC0732a22 = interfaceC0732a;
        String str92 = str5;
        fVar.L$0 = null;
        fVar.L$1 = null;
        fVar.L$2 = null;
        fVar.L$3 = null;
        fVar.L$4 = null;
        fVar.label = 3;
        Object attemptFetchWithRetries2 = aVar.attemptFetchWithRetries(str6, bVar22, interfaceC0732a22, str92, fVar);
        if (attemptFetchWithRetries2 != enumC0580a2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // m2.InterfaceC0523b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendIAMClick(String str, String str2, String str3, String str4, String str5, boolean z5, InterfaceC0564d interfaceC0564d) {
        g gVar;
        int i7;
        a aVar;
        C0224a c0224a;
        if (interfaceC0564d instanceof g) {
            gVar = (g) interfaceC0564d;
            int i8 = gVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                gVar.label = i8 - Integer.MIN_VALUE;
                g gVar2 = gVar;
                Object obj = gVar2.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = gVar2.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    h hVar = new h(str, this, str2, str5, str3, z5);
                    a2.c cVar = this._httpClient;
                    String e4 = o.e("in_app_messages/", str4, "/click");
                    gVar2.L$0 = this;
                    gVar2.label = 1;
                    obj = a2.b.post$default(cVar, e4, hVar, null, gVar2, 4, null);
                    if (obj == enumC0580a) {
                        return enumC0580a;
                    }
                    aVar = this;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) gVar2.L$0;
                    AbstractC0676f.w(obj);
                }
                c0224a = (C0224a) obj;
                if (c0224a.isSuccess()) {
                    aVar.printHttpErrorForInAppMessageRequest("engagement", c0224a.getStatusCode(), c0224a.getPayload());
                    throw new P1.a(c0224a.getStatusCode(), c0224a.getPayload(), c0224a.getRetryAfterSeconds());
                }
                String payload = c0224a.getPayload();
                kotlin.jvm.internal.i.b(payload);
                aVar.printHttpSuccessForInAppMessageRequest("engagement", payload);
                return v.f5219a;
            }
        }
        gVar = new g(interfaceC0564d);
        g gVar22 = gVar;
        Object obj2 = gVar22.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = gVar22.label;
        if (i7 != 0) {
        }
        c0224a = (C0224a) obj2;
        if (c0224a.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // m2.InterfaceC0523b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendIAMImpression(String str, String str2, String str3, String str4, InterfaceC0564d interfaceC0564d) {
        i iVar;
        int i7;
        a aVar;
        C0224a c0224a;
        if (interfaceC0564d instanceof i) {
            iVar = (i) interfaceC0564d;
            int i8 = iVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                iVar.label = i8 - Integer.MIN_VALUE;
                i iVar2 = iVar;
                Object obj = iVar2.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = iVar2.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    j jVar = new j(str, str2, str3, this);
                    a2.c cVar = this._httpClient;
                    String e4 = o.e("in_app_messages/", str4, "/impression");
                    iVar2.L$0 = this;
                    iVar2.label = 1;
                    obj = a2.b.post$default(cVar, e4, jVar, null, iVar2, 4, null);
                    if (obj == enumC0580a) {
                        return enumC0580a;
                    }
                    aVar = this;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) iVar2.L$0;
                    AbstractC0676f.w(obj);
                }
                c0224a = (C0224a) obj;
                if (c0224a.isSuccess()) {
                    aVar.printHttpErrorForInAppMessageRequest("impression", c0224a.getStatusCode(), c0224a.getPayload());
                    throw new P1.a(c0224a.getStatusCode(), c0224a.getPayload(), c0224a.getRetryAfterSeconds());
                }
                String payload = c0224a.getPayload();
                kotlin.jvm.internal.i.b(payload);
                aVar.printHttpSuccessForInAppMessageRequest("impression", payload);
                return v.f5219a;
            }
        }
        iVar = new i(interfaceC0564d);
        i iVar22 = iVar;
        Object obj2 = iVar22.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = iVar22.label;
        if (i7 != 0) {
        }
        c0224a = (C0224a) obj2;
        if (c0224a.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // m2.InterfaceC0523b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendIAMPageImpression(String str, String str2, String str3, String str4, String str5, InterfaceC0564d interfaceC0564d) {
        k kVar;
        int i7;
        Object post$default;
        a aVar;
        C0224a c0224a;
        if (interfaceC0564d instanceof k) {
            kVar = (k) interfaceC0564d;
            int i8 = kVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                kVar.label = i8 - Integer.MIN_VALUE;
                k kVar2 = kVar;
                Object obj = kVar2.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = kVar2.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    l lVar = new l(str, str2, str3, this, str5);
                    a2.c cVar = this._httpClient;
                    String e4 = o.e("in_app_messages/", str4, "/pageImpression");
                    kVar2.L$0 = this;
                    kVar2.label = 1;
                    post$default = a2.b.post$default(cVar, e4, lVar, null, kVar2, 4, null);
                    if (post$default == enumC0580a) {
                        return enumC0580a;
                    }
                    aVar = this;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a aVar2 = (a) kVar2.L$0;
                    AbstractC0676f.w(obj);
                    aVar = aVar2;
                    post$default = obj;
                }
                c0224a = (C0224a) post$default;
                if (c0224a.isSuccess()) {
                    aVar.printHttpErrorForInAppMessageRequest("page impression", c0224a.getStatusCode(), c0224a.getPayload());
                    throw new P1.a(c0224a.getStatusCode(), c0224a.getPayload(), c0224a.getRetryAfterSeconds());
                }
                String payload = c0224a.getPayload();
                kotlin.jvm.internal.i.b(payload);
                aVar.printHttpSuccessForInAppMessageRequest("page impression", payload);
                return v.f5219a;
            }
        }
        kVar = new k(interfaceC0564d);
        k kVar22 = kVar;
        Object obj2 = kVar22.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = kVar22.label;
        if (i7 != 0) {
        }
        c0224a = (C0224a) post$default;
        if (c0224a.isSuccess()) {
        }
    }
}
