package com.startapp.sdk.internal;

import c3.C0292d;
import c3.C0295g;
import c3.C0297i;
import c3.InterfaceC0291c;
import com.startapp.sdk.adsbase.remoteconfig.EnabledConfig;
import com.startapp.sdk.adsbase.remoteconfig.EventTracerMetadata;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class y6 implements x6 {

    /* renamed from: a, reason: collision with root package name */
    public final e3 f7947a;

    /* renamed from: b, reason: collision with root package name */
    public final o3.p f7948b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0291c f7949c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0291c f7950d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0291c f7951e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0291c f7952f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0291c f7953g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0291c f7954h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0291c f7955i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f7956j;

    public y6(e3 clock, final hb metadataRef, ib executorRef, o3.p sendReport) {
        kotlin.jvm.internal.i.e(clock, "clock");
        kotlin.jvm.internal.i.e(metadataRef, "metadataRef");
        kotlin.jvm.internal.i.e(executorRef, "executorRef");
        kotlin.jvm.internal.i.e(sendReport, "sendReport");
        this.f7947a = clock;
        this.f7948b = sendReport;
        this.f7949c = new C0295g(new InterfaceC1328a() { // from class: com.startapp.sdk.internal.J
            @Override // o3.InterfaceC1328a
            public final Object invoke() {
                return Boolean.valueOf(y6.a(hb.this, this));
            }
        });
        final int i4 = 0;
        this.f7950d = new C0295g(new InterfaceC1328a() { // from class: com.startapp.sdk.internal.K
            @Override // o3.InterfaceC1328a
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return Integer.valueOf(y6.d(metadataRef));
                    case 1:
                        return y6.e(metadataRef);
                    case 2:
                        return y6.c(metadataRef);
                    case 3:
                        return y6.a(metadataRef);
                    default:
                        return y6.b(metadataRef);
                }
            }
        });
        final int i5 = 1;
        this.f7951e = new C0295g(new InterfaceC1328a() { // from class: com.startapp.sdk.internal.K
            @Override // o3.InterfaceC1328a
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return Integer.valueOf(y6.d(metadataRef));
                    case 1:
                        return y6.e(metadataRef);
                    case 2:
                        return y6.c(metadataRef);
                    case 3:
                        return y6.a(metadataRef);
                    default:
                        return y6.b(metadataRef);
                }
            }
        });
        final int i6 = 2;
        this.f7952f = new C0295g(new InterfaceC1328a() { // from class: com.startapp.sdk.internal.K
            @Override // o3.InterfaceC1328a
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return Integer.valueOf(y6.d(metadataRef));
                    case 1:
                        return y6.e(metadataRef);
                    case 2:
                        return y6.c(metadataRef);
                    case 3:
                        return y6.a(metadataRef);
                    default:
                        return y6.b(metadataRef);
                }
            }
        });
        final int i7 = 3;
        this.f7953g = new C0295g(new InterfaceC1328a() { // from class: com.startapp.sdk.internal.K
            @Override // o3.InterfaceC1328a
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return Integer.valueOf(y6.d(metadataRef));
                    case 1:
                        return y6.e(metadataRef);
                    case 2:
                        return y6.c(metadataRef);
                    case 3:
                        return y6.a(metadataRef);
                    default:
                        return y6.b(metadataRef);
                }
            }
        });
        final int i8 = 4;
        this.f7954h = new C0295g(new InterfaceC1328a() { // from class: com.startapp.sdk.internal.K
            @Override // o3.InterfaceC1328a
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        return Integer.valueOf(y6.d(metadataRef));
                    case 1:
                        return y6.e(metadataRef);
                    case 2:
                        return y6.c(metadataRef);
                    case 3:
                        return y6.a(metadataRef);
                    default:
                        return y6.b(metadataRef);
                }
            }
        });
        this.f7955i = new C0295g(new X3.m(1, executorRef));
        this.f7956j = new ArrayList();
    }

    public static final String a(hb metadataRef) {
        String b4;
        kotlin.jvm.internal.i.e(metadataRef, "$metadataRef");
        EventTracerMetadata eventTracerMetadata = (EventTracerMetadata) ((AtomicReference) metadataRef.f7057a.a()).get();
        if (eventTracerMetadata == null || (b4 = eventTracerMetadata.b()) == null) {
            return "[=,:;]";
        }
        if (b4.length() < 6) {
            b4 = null;
        }
        return b4 == null ? "[=,:;]" : b4;
    }

    public static final String b(hb metadataRef) {
        String c4;
        kotlin.jvm.internal.i.e(metadataRef, "$metadataRef");
        EventTracerMetadata eventTracerMetadata = (EventTracerMetadata) ((AtomicReference) metadataRef.f7057a.a()).get();
        if (eventTracerMetadata == null || (c4 = eventTracerMetadata.c()) == null) {
            return "_";
        }
        if (c4.length() < 1) {
            c4 = null;
        }
        return c4 == null ? "_" : c4;
    }

    public static final String c(hb metadataRef) {
        String a3;
        kotlin.jvm.internal.i.e(metadataRef, "$metadataRef");
        EventTracerMetadata eventTracerMetadata = (EventTracerMetadata) ((AtomicReference) metadataRef.f7057a.a()).get();
        if (eventTracerMetadata == null || (a3 = eventTracerMetadata.a()) == null) {
            return "=,:;";
        }
        if (a3.length() < 4) {
            a3 = null;
        }
        return a3 == null ? "=,:;" : a3;
    }

    public static final int d(hb metadataRef) {
        int e4;
        kotlin.jvm.internal.i.e(metadataRef, "$metadataRef");
        EventTracerMetadata eventTracerMetadata = (EventTracerMetadata) ((AtomicReference) metadataRef.f7057a.a()).get();
        if (eventTracerMetadata == null || (e4 = eventTracerMetadata.e()) < 1) {
            return Integer.MAX_VALUE;
        }
        return e4;
    }

    public static final Set e(hb metadataRef) {
        Set f4;
        kotlin.jvm.internal.i.e(metadataRef, "$metadataRef");
        EventTracerMetadata eventTracerMetadata = (EventTracerMetadata) ((AtomicReference) metadataRef.f7057a.a()).get();
        return (eventTracerMetadata == null || (f4 = eventTracerMetadata.f()) == null) ? d3.s.f8335a : f4;
    }

    public final void a(Object emitterObj, Object relativeEmitterObject) {
        kotlin.jvm.internal.i.e(emitterObj, "emitterObj");
        kotlin.jvm.internal.i.e(relativeEmitterObject, "relativeEmitterObject");
        if (((Boolean) ((C0295g) this.f7949c).a()).booleanValue()) {
            synchronized (this.f7956j) {
                try {
                    ArrayList arrayList = this.f7956j;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i4 = 0;
                    int i5 = 0;
                    while (i5 < size) {
                        Object obj = arrayList.get(i5);
                        i5++;
                        z6 z6Var = (z6) obj;
                        z6Var.getClass();
                        if (z6Var.f8012c.a(emitterObj)) {
                            arrayList2.add(obj);
                        }
                    }
                    int size2 = arrayList2.size();
                    while (i4 < size2) {
                        Object obj2 = arrayList2.get(i4);
                        i4++;
                        ((z6) obj2).a(emitterObj, relativeEmitterObject);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void b(Object rootEmitterObj, ei startEvent) {
        kotlin.jvm.internal.i.e(rootEmitterObj, "rootEmitterObj");
        kotlin.jvm.internal.i.e(startEvent, "startEvent");
        if (((Boolean) ((C0295g) this.f7949c).a()).booleanValue()) {
            synchronized (this.f7956j) {
                try {
                    ArrayList arrayList = this.f7956j;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i4 = 0;
                    int i5 = 0;
                    while (i5 < size) {
                        Object obj = arrayList.get(i5);
                        i5++;
                        z6 z6Var = (z6) obj;
                        z6Var.getClass();
                        w6 w6Var = z6Var.f8012c;
                        w6Var.getClass();
                        if (w6Var.f7814a.get() == rootEmitterObj && kotlin.jvm.internal.i.a(z6Var.f8010a, startEvent)) {
                            arrayList2.add(obj);
                        }
                    }
                    int size2 = arrayList2.size();
                    while (i4 < size2) {
                        Object obj2 = arrayList2.get(i4);
                        i4++;
                        z6 z6Var2 = (z6) obj2;
                        z6Var2.getClass();
                        w6 w6Var2 = z6Var2.f8012c;
                        w6Var2.getClass();
                        if (w6Var2.f7814a.get() == rootEmitterObj) {
                            a(this, z6Var2.f8013d, z6Var2.f8014e);
                        }
                        this.f7956j.remove(z6Var2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(Object emitterObj, ei event) {
        kotlin.jvm.internal.i.e(emitterObj, "emitterObj");
        kotlin.jvm.internal.i.e(event, "event");
        if (((Boolean) ((C0295g) this.f7949c).a()).booleanValue()) {
            synchronized (this.f7956j) {
                try {
                    ArrayList arrayList = this.f7956j;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i4 = 0;
                    int i5 = 0;
                    while (i5 < size) {
                        Object obj = arrayList.get(i5);
                        i5++;
                        z6 z6Var = (z6) obj;
                        z6Var.getClass();
                        if (z6Var.f8012c.a(emitterObj)) {
                            arrayList2.add(obj);
                        }
                    }
                    int size2 = arrayList2.size();
                    while (i4 < size2) {
                        Object obj2 = arrayList2.get(i4);
                        i4++;
                        z6 z6Var2 = (z6) obj2;
                        z6Var2.getClass();
                        if (z6Var2.f8012c.a(emitterObj)) {
                            z6Var2.f8013d.add(new C0292d(event, Long.valueOf(z6Var2.f8011b.a())));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final boolean a(hb metadataRef, y6 this$0) {
        EnabledConfig d4;
        kotlin.jvm.internal.i.e(metadataRef, "$metadataRef");
        kotlin.jvm.internal.i.e(this$0, "this$0");
        e3 e3Var = this$0.f7947a;
        EventTracerMetadata eventTracerMetadata = (EventTracerMetadata) ((AtomicReference) metadataRef.f7057a.a()).get();
        return (eventTracerMetadata == null || (d4 = eventTracerMetadata.d()) == null || !d4.a(e3Var)) ? false : true;
    }

    public final boolean a(Object rootEmitterObj, ei startEvent) {
        kotlin.jvm.internal.i.e(rootEmitterObj, "rootEmitterObj");
        kotlin.jvm.internal.i.e(startEvent, "startEvent");
        boolean z = false;
        if (!((Boolean) ((C0295g) this.f7949c).a()).booleanValue() || !((Set) ((C0295g) this.f7951e).a()).contains(startEvent.f6876a)) {
            return false;
        }
        synchronized (this.f7956j) {
            try {
                if (this.f7956j.size() < ((Number) ((C0295g) this.f7950d).a()).intValue()) {
                    ArrayList arrayList = this.f7956j;
                    if (arrayList == null || !arrayList.isEmpty()) {
                        int size = arrayList.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj = arrayList.get(i4);
                            i4++;
                            z6 z6Var = (z6) obj;
                            z6Var.getClass();
                            w6 w6Var = z6Var.f8012c;
                            w6Var.getClass();
                            if (w6Var.f7814a.get() == rootEmitterObj && kotlin.jvm.internal.i.a(z6Var.f8010a, startEvent)) {
                                break;
                            }
                        }
                    }
                    ArrayList arrayList2 = this.f7956j;
                    e3 e3Var = this.f7947a;
                    z6 z6Var2 = new z6(rootEmitterObj, startEvent, e3Var);
                    if (z6Var2.f8012c.a(rootEmitterObj)) {
                        z6Var2.f8013d.add(new C0292d(startEvent, Long.valueOf(e3Var.a())));
                    }
                    if (arrayList2.add(z6Var2)) {
                        z = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public static final void b(y6 this$0, List events, Map data) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(events, "$events");
        kotlin.jvm.internal.i.e(data, "$data");
        if (events.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = ((String) ((C0295g) this$0.f7952f).a()).charAt(0);
        char charAt2 = ((String) ((C0295g) this$0.f7952f).a()).charAt(1);
        char charAt3 = ((String) ((C0295g) this$0.f7952f).a()).charAt(2);
        char charAt4 = ((String) ((C0295g) this$0.f7952f).a()).charAt(3);
        Iterator it = events.iterator();
        long j4 = 0;
        String str = null;
        long j5 = 0;
        while (it.hasNext()) {
            C0292d c0292d = (C0292d) it.next();
            String str2 = ((ei) c0292d.f5724a).f6876a;
            long longValue = ((Number) c0292d.f5725b).longValue();
            if (str == null) {
                str = str2;
                j5 = longValue;
            } else {
                sb.append(str2);
                sb.append(charAt);
                sb.append(longValue - j4);
                sb.append(charAt2);
            }
            j4 = longValue;
        }
        if (str == null) {
            return;
        }
        sb.append("total");
        sb.append(charAt);
        sb.append(j4 - j5);
        sb.append(charAt4);
        Iterator it2 = data.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            ei eiVar = (ei) entry.getKey();
            List<C0292d> list = (List) entry.getValue();
            sb.append(eiVar.f6876a);
            char c4 = charAt3;
            for (C0292d c0292d2 : list) {
                CharSequence input = (CharSequence) c0292d2.f5724a;
                String pattern = (String) ((C0295g) this$0.f7953g).a();
                kotlin.jvm.internal.i.e(pattern, "pattern");
                Pattern compile = Pattern.compile(pattern);
                kotlin.jvm.internal.i.d(compile, "compile(...)");
                String replacement = (String) ((C0295g) this$0.f7954h).a();
                Iterator it3 = it2;
                kotlin.jvm.internal.i.e(input, "input");
                kotlin.jvm.internal.i.e(replacement, "replacement");
                String replaceAll = compile.matcher(input).replaceAll(replacement);
                kotlin.jvm.internal.i.d(replaceAll, "replaceAll(...)");
                long longValue2 = ((Number) c0292d2.f5725b).longValue() - j5;
                sb.append(c4);
                sb.append(replaceAll);
                sb.append(charAt);
                sb.append(longValue2);
                it2 = it3;
                c4 = charAt2;
            }
            sb.append(charAt4);
        }
        o3.p pVar = this$0.f7948b;
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "toString(...)");
        pVar.invoke(str, sb2);
    }

    public final void a(n8 emitterObj, HashMap keyValues) {
        kotlin.jvm.internal.i.e(emitterObj, "emitterObj");
        kotlin.jvm.internal.i.e(keyValues, "keyValues");
        if (((Boolean) ((C0295g) this.f7949c).a()).booleanValue()) {
            synchronized (this.f7956j) {
                try {
                    ArrayList arrayList = this.f7956j;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i4 = 0;
                    int i5 = 0;
                    while (i5 < size) {
                        Object obj = arrayList.get(i5);
                        i5++;
                        z6 z6Var = (z6) obj;
                        z6Var.getClass();
                        if (z6Var.f8012c.a(emitterObj)) {
                            arrayList2.add(obj);
                        }
                    }
                    int size2 = arrayList2.size();
                    while (i4 < size2) {
                        Object obj2 = arrayList2.get(i4);
                        i4++;
                        ((z6) obj2).a(emitterObj, keyValues);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final Executor a(ib executorRef) {
        kotlin.jvm.internal.i.e(executorRef, "$executorRef");
        return (Executor) executorRef.a();
    }

    public static final C0297i a(y6 this$0, List events, Map data) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(events, "events");
        kotlin.jvm.internal.i.e(data, "data");
        Object a3 = ((C0295g) this$0.f7955i).a();
        kotlin.jvm.internal.i.d(a3, "getValue(...)");
        ((Executor) a3).execute(new Q1.a(this$0, events, data, 9));
        return C0297i.f5732a;
    }
}
