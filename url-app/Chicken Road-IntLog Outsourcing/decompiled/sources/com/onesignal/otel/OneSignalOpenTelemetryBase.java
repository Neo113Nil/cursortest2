package com.onesignal.otel;

import B0.f;
import I3.d;
import J3.c;
import M3.o;
import com.onesignal.otel.attributes.OtelFieldsPerEvent;
import com.onesignal.otel.attributes.OtelFieldsTopLevel;
import e5.g;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import k4.C1225k;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public abstract class OneSignalOpenTelemetryBase implements IOtelOpenTelemetry {
    public static final Companion Companion = new Companion(null);
    private static final long FORCE_FLUSH_TIMEOUT_SECONDS = 10;
    private final Object lock;
    private final OtelFieldsPerEvent osPerEventFields;
    private final OtelFieldsTopLevel osTopLevelFields;
    private d sdkCachedValue;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public OneSignalOpenTelemetryBase(OtelFieldsTopLevel osTopLevelFields, OtelFieldsPerEvent osPerEventFields) {
        i.e(osTopLevelFields, "osTopLevelFields");
        i.e(osPerEventFields, "osPerEventFields");
        this.osTopLevelFields = osTopLevelFields;
        this.osPerEventFields = osPerEventFields;
        this.lock = new Object();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0072 A[PHI: r6
      0x0072: PHI (r6v7 java.lang.Object) = (r6v6 java.lang.Object), (r6v1 java.lang.Object) binds: [B:17:0x006f, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object forceFlush$suspendImpl(OneSignalOpenTelemetryBase oneSignalOpenTelemetryBase, InterfaceC1218d interfaceC1218d) {
        OneSignalOpenTelemetryBase$forceFlush$1 oneSignalOpenTelemetryBase$forceFlush$1;
        int i2;
        if (interfaceC1218d instanceof OneSignalOpenTelemetryBase$forceFlush$1) {
            oneSignalOpenTelemetryBase$forceFlush$1 = (OneSignalOpenTelemetryBase$forceFlush$1) interfaceC1218d;
            int i3 = oneSignalOpenTelemetryBase$forceFlush$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oneSignalOpenTelemetryBase$forceFlush$1.label = i3 - Integer.MIN_VALUE;
                Object obj = oneSignalOpenTelemetryBase$forceFlush$1.result;
                Object obj2 = EnumC1260a.f11058a;
                i2 = oneSignalOpenTelemetryBase$forceFlush$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    oneSignalOpenTelemetryBase$forceFlush$1.label = 1;
                    obj = oneSignalOpenTelemetryBase.getSdk(oneSignalOpenTelemetryBase$forceFlush$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        g.y(obj);
                    }
                    g.y(obj);
                }
                o oVar = ((d) obj).f1278d.f1271a;
                oneSignalOpenTelemetryBase$forceFlush$1.L$0 = oVar;
                oneSignalOpenTelemetryBase$forceFlush$1.label = 2;
                C1225k c1225k = new C1225k(f.F(oneSignalOpenTelemetryBase$forceFlush$1));
                c e3 = oVar.f1982a.f1964d.e();
                e3.c(FORCE_FLUSH_TIMEOUT_SECONDS, TimeUnit.SECONDS);
                c1225k.resumeWith(e3);
                obj = c1225k.a();
                return obj != obj2 ? obj2 : obj;
            }
        }
        oneSignalOpenTelemetryBase$forceFlush$1 = new OneSignalOpenTelemetryBase$forceFlush$1(oneSignalOpenTelemetryBase, interfaceC1218d);
        Object obj3 = oneSignalOpenTelemetryBase$forceFlush$1.result;
        Object obj22 = EnumC1260a.f11058a;
        i2 = oneSignalOpenTelemetryBase$forceFlush$1.label;
        if (i2 != 0) {
        }
        o oVar2 = ((d) obj3).f1278d.f1271a;
        oneSignalOpenTelemetryBase$forceFlush$1.L$0 = oVar2;
        oneSignalOpenTelemetryBase$forceFlush$1.label = 2;
        C1225k c1225k2 = new C1225k(f.F(oneSignalOpenTelemetryBase$forceFlush$1));
        c e32 = oVar2.f1982a.f1964d.e();
        e32.c(FORCE_FLUSH_TIMEOUT_SECONDS, TimeUnit.SECONDS);
        c1225k2.resumeWith(e32);
        obj3 = c1225k2.a();
        if (obj3 != obj22) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object getLogger$suspendImpl(OneSignalOpenTelemetryBase oneSignalOpenTelemetryBase, InterfaceC1218d interfaceC1218d) {
        OneSignalOpenTelemetryBase$getLogger$1 oneSignalOpenTelemetryBase$getLogger$1;
        int i2;
        if (interfaceC1218d instanceof OneSignalOpenTelemetryBase$getLogger$1) {
            oneSignalOpenTelemetryBase$getLogger$1 = (OneSignalOpenTelemetryBase$getLogger$1) interfaceC1218d;
            int i3 = oneSignalOpenTelemetryBase$getLogger$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oneSignalOpenTelemetryBase$getLogger$1.label = i3 - Integer.MIN_VALUE;
                Object obj = oneSignalOpenTelemetryBase$getLogger$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = oneSignalOpenTelemetryBase$getLogger$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    oneSignalOpenTelemetryBase$getLogger$1.L$0 = oneSignalOpenTelemetryBase;
                    oneSignalOpenTelemetryBase$getLogger$1.label = 1;
                    obj = oneSignalOpenTelemetryBase.getSdk(oneSignalOpenTelemetryBase$getLogger$1);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oneSignalOpenTelemetryBase = (OneSignalOpenTelemetryBase) oneSignalOpenTelemetryBase$getLogger$1.L$0;
                    g.y(obj);
                }
                return OneSignalOpenTelemetryKt.setAllAttributes(((d) obj).f1278d.f1271a.a("loggerBuilder").build().a(), oneSignalOpenTelemetryBase.osPerEventFields.getAttributes());
            }
        }
        oneSignalOpenTelemetryBase$getLogger$1 = new OneSignalOpenTelemetryBase$getLogger$1(oneSignalOpenTelemetryBase, interfaceC1218d);
        Object obj2 = oneSignalOpenTelemetryBase$getLogger$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = oneSignalOpenTelemetryBase$getLogger$1.label;
        if (i2 != 0) {
        }
        return OneSignalOpenTelemetryKt.setAllAttributes(((d) obj2).f1278d.f1271a.a("loggerBuilder").build().a(), oneSignalOpenTelemetryBase.osPerEventFields.getAttributes());
    }

    @Override // com.onesignal.otel.IOtelOpenTelemetry
    public Object forceFlush(InterfaceC1218d interfaceC1218d) {
        return forceFlush$suspendImpl(this, interfaceC1218d);
    }

    @Override // com.onesignal.otel.IOtelOpenTelemetry
    public Object getLogger(InterfaceC1218d interfaceC1218d) {
        return getLogger$suspendImpl(this, interfaceC1218d);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getSdk(InterfaceC1218d interfaceC1218d) {
        OneSignalOpenTelemetryBase$getSdk$1 oneSignalOpenTelemetryBase$getSdk$1;
        int i2;
        OneSignalOpenTelemetryBase oneSignalOpenTelemetryBase;
        if (interfaceC1218d instanceof OneSignalOpenTelemetryBase$getSdk$1) {
            oneSignalOpenTelemetryBase$getSdk$1 = (OneSignalOpenTelemetryBase$getSdk$1) interfaceC1218d;
            int i3 = oneSignalOpenTelemetryBase$getSdk$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oneSignalOpenTelemetryBase$getSdk$1.label = i3 - Integer.MIN_VALUE;
                Object obj = oneSignalOpenTelemetryBase$getSdk$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = oneSignalOpenTelemetryBase$getSdk$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    OtelFieldsTopLevel otelFieldsTopLevel = this.osTopLevelFields;
                    oneSignalOpenTelemetryBase$getSdk$1.L$0 = this;
                    oneSignalOpenTelemetryBase$getSdk$1.label = 1;
                    obj = otelFieldsTopLevel.getAttributes(oneSignalOpenTelemetryBase$getSdk$1);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                    oneSignalOpenTelemetryBase = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oneSignalOpenTelemetryBase = (OneSignalOpenTelemetryBase) oneSignalOpenTelemetryBase$getSdk$1.L$0;
                    g.y(obj);
                }
                Map<String, String> map = (Map) obj;
                synchronized (oneSignalOpenTelemetryBase.lock) {
                    d dVar = oneSignalOpenTelemetryBase.sdkCachedValue;
                    if (dVar != null) {
                        return dVar;
                    }
                    d sdkInstance = oneSignalOpenTelemetryBase.getSdkInstance(map);
                    oneSignalOpenTelemetryBase.sdkCachedValue = sdkInstance;
                    return sdkInstance;
                }
            }
        }
        oneSignalOpenTelemetryBase$getSdk$1 = new OneSignalOpenTelemetryBase$getSdk$1(this, interfaceC1218d);
        Object obj2 = oneSignalOpenTelemetryBase$getSdk$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = oneSignalOpenTelemetryBase$getSdk$1.label;
        if (i2 != 0) {
        }
        Map<String, String> map2 = (Map) obj2;
        synchronized (oneSignalOpenTelemetryBase.lock) {
        }
    }

    public abstract d getSdkInstance(Map<String, String> map);

    @Override // com.onesignal.otel.IOtelOpenTelemetry
    public void shutdown() {
        synchronized (this.lock) {
            try {
                d dVar = this.sdkCachedValue;
                if (dVar != null) {
                    dVar.shutdown();
                }
            } catch (Throwable unused) {
            }
            this.sdkCachedValue = null;
        }
    }
}
