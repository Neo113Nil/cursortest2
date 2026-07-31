package com.chartboost.sdk.impl;

import android.util.Base64;
import com.ironsource.C4701ic;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class sh {
    public final sd a;
    public final bc b;
    public final r1 c;

    public static final class a extends ContinuationImpl {
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return sh.this.a(null, null, null, null, null, this);
        }
    }

    public sh(sd networkClient, bc macroProcessor, r1 applicationComponent) {
        Intrinsics.checkNotNullParameter(networkClient, "networkClient");
        Intrinsics.checkNotNullParameter(macroProcessor, "macroProcessor");
        Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
        this.a = networkClient;
        this.b = macroProcessor;
        this.c = applicationComponent;
    }

    public /* synthetic */ sh(sd sdVar, bc bcVar, r1 r1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sdVar, bcVar, (i & 4) != 0 ? f4.b.a() : r1Var);
    }

    public final String a(String str, String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return str;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = str2.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            jSONObject.put("log_context", Base64.encodeToString(bytes, 2));
            return jSONObject.toString();
        } catch (Exception e) {
            xb.a("Could not inject log_context into body: " + e.getMessage(), (Throwable) null, 2, (Object) null);
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, qh qhVar, String str4, Continuation continuation) {
        a aVar;
        int i;
        String str5;
        String str6;
        qh qhVar2;
        wd wdVar;
        try {
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i2 = aVar.f;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.f = i2 - Integer.MIN_VALUE;
                    a aVar2 = aVar;
                    Object obj = aVar2.d;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = aVar2.f;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        str5 = this.b.a(str, qhVar, true, false);
                        if (str5 == null) {
                            str5 = str;
                        }
                        String a2 = (!StringsKt.equals(str2, "POST", true) || str3 == null) ? null : a(this.b.a(str3, qhVar, false, true), qhVar.a());
                        xb.a("Sending tracker: eventId=" + qhVar.b() + " METHOD=" + str2 + " URL=" + str5, (Throwable) null, 2, (Object) null);
                        if (a2 != null) {
                            xb.a("Processed BODY: " + a2, (Throwable) null, 2, (Object) null);
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("x-monetization-session-id", this.c.k().d());
                        String d = this.c.p().h().d();
                        if (d != null) {
                            linkedHashMap.put("x-monetization-idfv", d);
                        }
                        linkedHashMap.put("x-monetization-sdk-version", "9.12.1");
                        try {
                            if (StringsKt.equals(str2, C4701ic.a, true)) {
                                sd sdVar = this.a;
                                aVar2.b = qhVar;
                                aVar2.c = str5;
                                aVar2.f = 1;
                                Object a3 = sdVar.a(str5, linkedHashMap, aVar2);
                                if (a3 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                str6 = str5;
                                obj = a3;
                                qhVar2 = qhVar;
                                wdVar = (wd) obj;
                            } else if (StringsKt.equals(str2, "POST", true)) {
                                sd sdVar2 = this.a;
                                String str7 = a2 == null ? "" : a2;
                                aVar2.b = qhVar;
                                aVar2.c = str5;
                                aVar2.f = 2;
                                Object a4 = sdVar2.a(str5, str7, linkedHashMap, str4, aVar2);
                                if (a4 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                str6 = str5;
                                obj = a4;
                                qhVar2 = qhVar;
                                wdVar = (wd) obj;
                            } else {
                                xb.b("Unsupported HTTP method '" + str2 + "' for tracker: " + str5, (Throwable) null, 2, (Object) null);
                                return ki.d;
                            }
                        } catch (Exception e) {
                            e = e;
                            xb.b("Unable to fire tracker: " + str5 + ". Exception: " + e.getClass().getSimpleName() + " - " + e.getMessage(), e);
                            return ki.c;
                        }
                    } else if (i == 1) {
                        str6 = (String) aVar2.c;
                        qhVar2 = (qh) aVar2.b;
                        ResultKt.throwOnFailure(obj);
                        wdVar = (wd) obj;
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str6 = (String) aVar2.c;
                        qhVar2 = (qh) aVar2.b;
                        ResultKt.throwOnFailure(obj);
                        wdVar = (wd) obj;
                    }
                    if (!wdVar.f()) {
                        xb.a("Successfully sent tracker: eventId=" + qhVar2.b() + " URL=" + str6 + " Status=" + wdVar.e(), (Throwable) null, 2, (Object) null);
                        return ki.b;
                    }
                    String b = qhVar2.b();
                    int e2 = wdVar.e();
                    Throwable d2 = wdVar.d();
                    xb.b("Failed tracker: eventId=" + b + " URL=" + str6 + " Status=" + e2 + " Error: " + (d2 != null ? d2.getMessage() : null), (Throwable) null, 2, (Object) null);
                    return ki.c;
                }
            }
            if (i != 0) {
            }
            if (!wdVar.f()) {
            }
        } catch (Exception e3) {
            e = e3;
            str5 = str3;
        }
        aVar = new a(continuation);
        a aVar22 = aVar;
        Object obj2 = aVar22.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar22.f;
    }
}
