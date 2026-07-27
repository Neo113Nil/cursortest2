package com.onesignal.otel;

import L3.j;
import Q2.a;
import Q2.c;
import W2.e;
import W2.i;
import e5.g;
import f4.v;
import java.time.Instant;
import java.util.Locale;
import k4.InterfaceC1218d;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class OtelLoggingHelper {
    public static final OtelLoggingHelper INSTANCE = new OtelLoggingHelper();

    private OtelLoggingHelper() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object logToOtel(IOtelOpenTelemetryRemote iOtelOpenTelemetryRemote, String str, String str2, String str3, String str4, String str5, InterfaceC1218d interfaceC1218d) {
        OtelLoggingHelper$logToOtel$1 otelLoggingHelper$logToOtel$1;
        int i2;
        i iVar;
        c cVar;
        i iVar2;
        Instant now;
        if (interfaceC1218d instanceof OtelLoggingHelper$logToOtel$1) {
            otelLoggingHelper$logToOtel$1 = (OtelLoggingHelper$logToOtel$1) interfaceC1218d;
            int i3 = otelLoggingHelper$logToOtel$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                otelLoggingHelper$logToOtel$1.label = i3 - Integer.MIN_VALUE;
                Object obj = otelLoggingHelper$logToOtel$1.result;
                Object obj2 = EnumC1260a.f11058a;
                i2 = otelLoggingHelper$logToOtel$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    String upperCase = str.toUpperCase(Locale.ROOT);
                    kotlin.jvm.internal.i.d(upperCase, "toUpperCase(...)");
                    int hashCode = upperCase.hashCode();
                    i iVar3 = i.INFO;
                    switch (hashCode) {
                        case 2251950:
                            upperCase.equals("INFO");
                            iVar = iVar3;
                            break;
                        case 2656902:
                            if (upperCase.equals("WARN")) {
                                iVar = i.WARN;
                                break;
                            }
                            iVar = iVar3;
                            break;
                        case 64921139:
                            if (upperCase.equals("DEBUG")) {
                                iVar = i.DEBUG;
                                break;
                            }
                            iVar = iVar3;
                            break;
                        case 66247144:
                            if (upperCase.equals("ERROR")) {
                                iVar = i.ERROR;
                                break;
                            }
                            iVar = iVar3;
                            break;
                        case 66665700:
                            if (upperCase.equals("FATAL")) {
                                iVar = i.FATAL;
                                break;
                            }
                            iVar = iVar3;
                            break;
                        case 1069090146:
                            if (upperCase.equals("VERBOSE")) {
                                iVar = i.TRACE;
                                break;
                            }
                            iVar = iVar3;
                            break;
                        default:
                            iVar = iVar3;
                            break;
                    }
                    j jVar = new j(1);
                    jVar.f("log.message", str2);
                    jVar.f("log.level", str);
                    if (str3 != null) {
                        jVar.f("exception.type", str3);
                    }
                    if (str4 != null) {
                        jVar.f("exception.message", str4);
                    }
                    if (str5 != null) {
                        jVar.f("exception.stacktrace", str5);
                    }
                    a b6 = jVar.b();
                    otelLoggingHelper$logToOtel$1.L$0 = str2;
                    otelLoggingHelper$logToOtel$1.L$1 = iVar;
                    otelLoggingHelper$logToOtel$1.L$2 = b6;
                    otelLoggingHelper$logToOtel$1.label = 1;
                    Object logger = iOtelOpenTelemetryRemote.getLogger(otelLoggingHelper$logToOtel$1);
                    if (logger == obj2) {
                        return obj2;
                    }
                    i iVar4 = iVar;
                    obj = logger;
                    cVar = b6;
                    iVar2 = iVar4;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = (c) otelLoggingHelper$logToOtel$1.L$2;
                    iVar2 = (i) otelLoggingHelper$logToOtel$1.L$1;
                    str2 = (String) otelLoggingHelper$logToOtel$1.L$0;
                    g.y(obj);
                }
                e eVar = (e) obj;
                eVar.a(cVar);
                eVar.e(iVar2);
                eVar.b(str2);
                now = Instant.now();
                eVar.d(now);
                eVar.c();
                return v.f5689a;
            }
        }
        otelLoggingHelper$logToOtel$1 = new OtelLoggingHelper$logToOtel$1(this, interfaceC1218d);
        Object obj3 = otelLoggingHelper$logToOtel$1.result;
        Object obj22 = EnumC1260a.f11058a;
        i2 = otelLoggingHelper$logToOtel$1.label;
        if (i2 != 0) {
        }
        e eVar2 = (e) obj3;
        eVar2.a(cVar);
        eVar2.e(iVar2);
        eVar2.b(str2);
        now = Instant.now();
        eVar2.d(now);
        eVar2.c();
        return v.f5689a;
    }
}
