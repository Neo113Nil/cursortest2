package com.startapp.sdk.internal;

import b2.C0190d;
import b2.C0193g;
import b2.C0195i;
import b2.InterfaceC0189c;
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

/* loaded from: classes.dex */
public final class y6 implements x6 {

    /* renamed from: a, reason: collision with root package name */
    public final e3 f4800a;

    /* renamed from: b, reason: collision with root package name */
    public final l2.p f4801b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0189c f4802c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0189c f4803d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0189c f4804e;
    public final InterfaceC0189c f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0189c f4805g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0189c f4806h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0189c f4807i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f4808j;

    public y6(e3 clock, final hb metadataRef, ib executorRef, l2.p sendReport) {
        kotlin.jvm.internal.j.e(clock, "clock");
        kotlin.jvm.internal.j.e(metadataRef, "metadataRef");
        kotlin.jvm.internal.j.e(executorRef, "executorRef");
        kotlin.jvm.internal.j.e(sendReport, "sendReport");
        this.f4800a = clock;
        this.f4801b = sendReport;
        this.f4802c = new C0193g(new l2.a() { // from class: com.startapp.sdk.internal.H
            @Override // l2.a
            public final Object invoke() {
                return Boolean.valueOf(y6.a(hb.this, this));
            }
        });
        final int i3 = 0;
        this.f4803d = new C0193g(new l2.a() { // from class: com.startapp.sdk.internal.I
            @Override // l2.a
            public final Object invoke() {
                switch (i3) {
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
        final int i4 = 1;
        this.f4804e = new C0193g(new l2.a() { // from class: com.startapp.sdk.internal.I
            @Override // l2.a
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
        final int i5 = 2;
        this.f = new C0193g(new l2.a() { // from class: com.startapp.sdk.internal.I
            @Override // l2.a
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
        final int i6 = 3;
        this.f4805g = new C0193g(new l2.a() { // from class: com.startapp.sdk.internal.I
            @Override // l2.a
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
        final int i7 = 4;
        this.f4806h = new C0193g(new l2.a() { // from class: com.startapp.sdk.internal.I
            @Override // l2.a
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
        this.f4807i = new C0193g(new E2.n(1, executorRef));
        this.f4808j = new ArrayList();
    }

    public static final String a(hb metadataRef) {
        String b3;
        kotlin.jvm.internal.j.e(metadataRef, "$metadataRef");
        EventTracerMetadata eventTracerMetadata = (EventTracerMetadata) ((AtomicReference) metadataRef.f3932a.a()).get();
        if (eventTracerMetadata == null || (b3 = eventTracerMetadata.b()) == null) {
            return "[=,:;]";
        }
        if (b3.length() < 6) {
            b3 = null;
        }
        return b3 == null ? "[=,:;]" : b3;
    }

    public static final String b(hb metadataRef) {
        String c3;
        kotlin.jvm.internal.j.e(metadataRef, "$metadataRef");
        EventTracerMetadata eventTracerMetadata = (EventTracerMetadata) ((AtomicReference) metadataRef.f3932a.a()).get();
        if (eventTracerMetadata == null || (c3 = eventTracerMetadata.c()) == null) {
            return "_";
        }
        if (c3.length() < 1) {
            c3 = null;
        }
        return c3 == null ? "_" : c3;
    }

    public static final String c(hb metadataRef) {
        String a3;
        kotlin.jvm.internal.j.e(metadataRef, "$metadataRef");
        EventTracerMetadata eventTracerMetadata = (EventTracerMetadata) ((AtomicReference) metadataRef.f3932a.a()).get();
        if (eventTracerMetadata == null || (a3 = eventTracerMetadata.a()) == null) {
            return "=,:;";
        }
        if (a3.length() < 4) {
            a3 = null;
        }
        return a3 == null ? "=,:;" : a3;
    }

    public static final int d(hb metadataRef) {
        int e3;
        kotlin.jvm.internal.j.e(metadataRef, "$metadataRef");
        EventTracerMetadata eventTracerMetadata = (EventTracerMetadata) ((AtomicReference) metadataRef.f3932a.a()).get();
        if (eventTracerMetadata == null || (e3 = eventTracerMetadata.e()) < 1) {
            return Integer.MAX_VALUE;
        }
        return e3;
    }

    public static final Set e(hb metadataRef) {
        Set f;
        kotlin.jvm.internal.j.e(metadataRef, "$metadataRef");
        EventTracerMetadata eventTracerMetadata = (EventTracerMetadata) ((AtomicReference) metadataRef.f3932a.a()).get();
        return (eventTracerMetadata == null || (f = eventTracerMetadata.f()) == null) ? c2.o.f2639a : f;
    }

    public final void a(Object emitterObj, Object relativeEmitterObject) {
        kotlin.jvm.internal.j.e(emitterObj, "emitterObj");
        kotlin.jvm.internal.j.e(relativeEmitterObject, "relativeEmitterObject");
        if (((Boolean) ((C0193g) this.f4802c).a()).booleanValue()) {
            synchronized (this.f4808j) {
                try {
                    ArrayList arrayList = this.f4808j;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        z6 z6Var = (z6) next;
                        z6Var.getClass();
                        if (z6Var.f4862c.a(emitterObj)) {
                            arrayList2.add(next);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((z6) it2.next()).a(emitterObj, relativeEmitterObject);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void b(Object rootEmitterObj, ei startEvent) {
        kotlin.jvm.internal.j.e(rootEmitterObj, "rootEmitterObj");
        kotlin.jvm.internal.j.e(startEvent, "startEvent");
        if (((Boolean) ((C0193g) this.f4802c).a()).booleanValue()) {
            synchronized (this.f4808j) {
                try {
                    ArrayList arrayList = this.f4808j;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        z6 z6Var = (z6) next;
                        z6Var.getClass();
                        w6 w6Var = z6Var.f4862c;
                        w6Var.getClass();
                        if (w6Var.f4669a.get() == rootEmitterObj && kotlin.jvm.internal.j.a(z6Var.f4860a, startEvent)) {
                            arrayList2.add(next);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        z6 z6Var2 = (z6) it2.next();
                        z6Var2.getClass();
                        w6 w6Var2 = z6Var2.f4862c;
                        w6Var2.getClass();
                        if (w6Var2.f4669a.get() == rootEmitterObj) {
                            a(this, z6Var2.f4863d, z6Var2.f4864e);
                        }
                        this.f4808j.remove(z6Var2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(Object emitterObj, ei event) {
        kotlin.jvm.internal.j.e(emitterObj, "emitterObj");
        kotlin.jvm.internal.j.e(event, "event");
        if (((Boolean) ((C0193g) this.f4802c).a()).booleanValue()) {
            synchronized (this.f4808j) {
                try {
                    ArrayList arrayList = this.f4808j;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        z6 z6Var = (z6) next;
                        z6Var.getClass();
                        if (z6Var.f4862c.a(emitterObj)) {
                            arrayList2.add(next);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        z6 z6Var2 = (z6) it2.next();
                        z6Var2.getClass();
                        if (z6Var2.f4862c.a(emitterObj)) {
                            z6Var2.f4863d.add(new C0190d(event, Long.valueOf(z6Var2.f4861b.a())));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final boolean a(hb metadataRef, y6 this$0) {
        EnabledConfig d3;
        kotlin.jvm.internal.j.e(metadataRef, "$metadataRef");
        kotlin.jvm.internal.j.e(this$0, "this$0");
        e3 e3Var = this$0.f4800a;
        EventTracerMetadata eventTracerMetadata = (EventTracerMetadata) ((AtomicReference) metadataRef.f3932a.a()).get();
        return (eventTracerMetadata == null || (d3 = eventTracerMetadata.d()) == null || !d3.a(e3Var)) ? false : true;
    }

    public final boolean a(Object rootEmitterObj, ei startEvent) {
        kotlin.jvm.internal.j.e(rootEmitterObj, "rootEmitterObj");
        kotlin.jvm.internal.j.e(startEvent, "startEvent");
        boolean z = false;
        if (!((Boolean) ((C0193g) this.f4802c).a()).booleanValue() || !((Set) ((C0193g) this.f4804e).a()).contains(startEvent.f3761a)) {
            return false;
        }
        synchronized (this.f4808j) {
            try {
                if (this.f4808j.size() < ((Number) ((C0193g) this.f4803d).a()).intValue()) {
                    ArrayList arrayList = this.f4808j;
                    if (arrayList == null || !arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            z6 z6Var = (z6) it.next();
                            z6Var.getClass();
                            w6 w6Var = z6Var.f4862c;
                            w6Var.getClass();
                            if (w6Var.f4669a.get() == rootEmitterObj && kotlin.jvm.internal.j.a(z6Var.f4860a, startEvent)) {
                                break;
                            }
                        }
                    }
                    ArrayList arrayList2 = this.f4808j;
                    e3 e3Var = this.f4800a;
                    z6 z6Var2 = new z6(rootEmitterObj, startEvent, e3Var);
                    if (z6Var2.f4862c.a(rootEmitterObj)) {
                        z6Var2.f4863d.add(new C0190d(startEvent, Long.valueOf(e3Var.a())));
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
        kotlin.jvm.internal.j.e(this$0, "this$0");
        kotlin.jvm.internal.j.e(events, "$events");
        kotlin.jvm.internal.j.e(data, "$data");
        if (events.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = ((String) ((C0193g) this$0.f).a()).charAt(0);
        char charAt2 = ((String) ((C0193g) this$0.f).a()).charAt(1);
        char charAt3 = ((String) ((C0193g) this$0.f).a()).charAt(2);
        char charAt4 = ((String) ((C0193g) this$0.f).a()).charAt(3);
        Iterator it = events.iterator();
        long j3 = 0;
        String str = null;
        long j4 = 0;
        while (it.hasNext()) {
            C0190d c0190d = (C0190d) it.next();
            String str2 = ((ei) c0190d.f2547a).f3761a;
            long longValue = ((Number) c0190d.f2548b).longValue();
            if (str == null) {
                str = str2;
                j4 = longValue;
            } else {
                sb.append(str2);
                sb.append(charAt);
                sb.append(longValue - j3);
                sb.append(charAt2);
            }
            j3 = longValue;
        }
        if (str == null) {
            return;
        }
        sb.append("total");
        sb.append(charAt);
        sb.append(j3 - j4);
        sb.append(charAt4);
        Iterator it2 = data.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            ei eiVar = (ei) entry.getKey();
            List<C0190d> list = (List) entry.getValue();
            sb.append(eiVar.f3761a);
            char c3 = charAt3;
            for (C0190d c0190d2 : list) {
                CharSequence input = (CharSequence) c0190d2.f2547a;
                String pattern = (String) ((C0193g) this$0.f4805g).a();
                kotlin.jvm.internal.j.e(pattern, "pattern");
                Pattern compile = Pattern.compile(pattern);
                kotlin.jvm.internal.j.d(compile, "compile(...)");
                String replacement = (String) ((C0193g) this$0.f4806h).a();
                Iterator it3 = it2;
                kotlin.jvm.internal.j.e(input, "input");
                kotlin.jvm.internal.j.e(replacement, "replacement");
                String replaceAll = compile.matcher(input).replaceAll(replacement);
                kotlin.jvm.internal.j.d(replaceAll, "replaceAll(...)");
                long longValue2 = ((Number) c0190d2.f2548b).longValue() - j4;
                sb.append(c3);
                sb.append(replaceAll);
                sb.append(charAt);
                sb.append(longValue2);
                it2 = it3;
                c3 = charAt2;
            }
            sb.append(charAt4);
        }
        l2.p pVar = this$0.f4801b;
        String sb2 = sb.toString();
        kotlin.jvm.internal.j.d(sb2, "toString(...)");
        pVar.invoke(str, sb2);
    }

    public final void a(n8 emitterObj, HashMap keyValues) {
        kotlin.jvm.internal.j.e(emitterObj, "emitterObj");
        kotlin.jvm.internal.j.e(keyValues, "keyValues");
        if (((Boolean) ((C0193g) this.f4802c).a()).booleanValue()) {
            synchronized (this.f4808j) {
                try {
                    ArrayList arrayList = this.f4808j;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        z6 z6Var = (z6) next;
                        z6Var.getClass();
                        if (z6Var.f4862c.a(emitterObj)) {
                            arrayList2.add(next);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((z6) it2.next()).a(emitterObj, keyValues);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final Executor a(ib executorRef) {
        kotlin.jvm.internal.j.e(executorRef, "$executorRef");
        return (Executor) executorRef.a();
    }

    public static final C0195i a(y6 this$0, List events, Map data) {
        kotlin.jvm.internal.j.e(this$0, "this$0");
        kotlin.jvm.internal.j.e(events, "events");
        kotlin.jvm.internal.j.e(data, "data");
        Object a3 = ((C0193g) this$0.f4807i).a();
        kotlin.jvm.internal.j.d(a3, "getValue(...)");
        ((Executor) a3).execute(new A0.a(this$0, events, data, 6));
        return C0195i.f2555a;
    }
}
