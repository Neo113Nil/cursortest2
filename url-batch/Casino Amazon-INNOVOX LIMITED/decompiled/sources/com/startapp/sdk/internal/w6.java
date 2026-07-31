package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.EnabledConfig;
import com.startapp.sdk.adsbase.remoteconfig.EventTracerMetadata;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class w6 {

    /* renamed from: a, reason: collision with root package name */
    public final z2 f479a;
    public final Function2 b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;
    public final ArrayList j;

    public w6(z2 z2Var, final oa oaVar, final pa paVar, Function2 function2) {
        z2Var.getClass();
        paVar.getClass();
        function2.getClass();
        this.f479a = z2Var;
        this.b = function2;
        this.c = LazyKt.lazy(new Function0() { // from class: com.startapp.sdk.internal.w6$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(w6.a(oa.this, this));
            }
        });
        this.d = LazyKt.lazy(new Function0() { // from class: com.startapp.sdk.internal.w6$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(w6.d(oa.this));
            }
        });
        this.e = LazyKt.lazy(new Function0() { // from class: com.startapp.sdk.internal.w6$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w6.e(oa.this);
            }
        });
        this.f = LazyKt.lazy(new Function0() { // from class: com.startapp.sdk.internal.w6$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w6.c(oa.this);
            }
        });
        this.g = LazyKt.lazy(new Function0() { // from class: com.startapp.sdk.internal.w6$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w6.a(oa.this);
            }
        });
        this.h = LazyKt.lazy(new Function0() { // from class: com.startapp.sdk.internal.w6$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w6.b(oa.this);
            }
        });
        this.i = LazyKt.lazy(new Function0() { // from class: com.startapp.sdk.internal.w6$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w6.a(pa.this);
            }
        });
        this.j = new ArrayList();
    }

    public static final int d(oa oaVar) {
        int e;
        EventTracerMetadata eventTracerMetadata = (EventTracerMetadata) oaVar.a();
        if (eventTracerMetadata == null || (e = eventTracerMetadata.e()) < 1) {
            return Integer.MAX_VALUE;
        }
        return e;
    }

    public static final Set e(oa oaVar) {
        Set f;
        EventTracerMetadata eventTracerMetadata = (EventTracerMetadata) oaVar.a();
        return (eventTracerMetadata == null || (f = eventTracerMetadata.f()) == null) ? SetsKt.emptySet() : f;
    }

    public final void a(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        if (((Boolean) this.c.getValue()).booleanValue()) {
            synchronized (this.j) {
                ArrayList arrayList = this.j;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    x6 x6Var = (x6) obj3;
                    x6Var.getClass();
                    if (x6Var.c.a(obj)) {
                        arrayList2.add(obj3);
                    }
                }
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj4 = arrayList2.get(i);
                    i++;
                    x6 x6Var2 = (x6) obj4;
                    x6Var2.getClass();
                    if (x6Var2.c.a(obj)) {
                        v6 v6Var = x6Var2.c;
                        v6Var.getClass();
                        if (!v6Var.a(obj2)) {
                            v6Var.b.add(new v6(obj2));
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final void b(Object obj, lh lhVar) {
        lhVar.getClass();
        if (((Boolean) this.c.getValue()).booleanValue()) {
            synchronized (this.j) {
                ArrayList arrayList = this.j;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    x6 x6Var = (x6) obj2;
                    x6Var.getClass();
                    v6 v6Var = x6Var.c;
                    v6Var.getClass();
                    if (v6Var.f463a.get() == obj && Intrinsics.areEqual(x6Var.f491a, lhVar)) {
                        arrayList2.add(obj2);
                    }
                }
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj3 = arrayList2.get(i);
                    i++;
                    x6 x6Var2 = (x6) obj3;
                    Function2 function2 = new Function2() { // from class: com.startapp.sdk.internal.w6$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            return w6.a(w6.this, (List) obj4, (Map) obj5);
                        }
                    };
                    x6Var2.getClass();
                    v6 v6Var2 = x6Var2.c;
                    v6Var2.getClass();
                    if (v6Var2.f463a.get() == obj) {
                        function2.invoke(x6Var2.d, x6Var2.e);
                    }
                    this.j.remove(x6Var2);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final void c(Object obj, lh lhVar) {
        obj.getClass();
        lhVar.getClass();
        if (((Boolean) this.c.getValue()).booleanValue()) {
            synchronized (this.j) {
                ArrayList arrayList = this.j;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    x6 x6Var = (x6) obj2;
                    x6Var.getClass();
                    if (x6Var.c.a(obj)) {
                        arrayList2.add(obj2);
                    }
                }
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj3 = arrayList2.get(i);
                    i++;
                    x6 x6Var2 = (x6) obj3;
                    x6Var2.getClass();
                    if (x6Var2.c.a(obj)) {
                        x6Var2.d.add(new Pair(lhVar, Long.valueOf(x6Var2.b.a())));
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public static final String c(oa oaVar) {
        String a2;
        EventTracerMetadata eventTracerMetadata = (EventTracerMetadata) oaVar.a();
        if (eventTracerMetadata != null && (a2 = eventTracerMetadata.a()) != null) {
            if (a2.length() < 4) {
                a2 = null;
            }
            return a2 == null ? "=,:;" : a2;
        }
        return "=,:;";
    }

    public static final boolean a(oa oaVar, w6 w6Var) {
        EnabledConfig d;
        z2 z2Var = w6Var.f479a;
        EventTracerMetadata eventTracerMetadata = (EventTracerMetadata) oaVar.a();
        return (eventTracerMetadata == null || (d = eventTracerMetadata.d()) == null || !d.a(z2Var)) ? false : true;
    }

    public final void a(Object obj, lh lhVar) {
        lhVar.getClass();
        if (((Boolean) this.c.getValue()).booleanValue() && ((Set) this.e.getValue()).contains(lhVar.f323a)) {
            synchronized (this.j) {
                if (this.j.size() < ((Number) this.d.getValue()).intValue()) {
                    ArrayList arrayList = this.j;
                    if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj2 = arrayList.get(i);
                            i++;
                            x6 x6Var = (x6) obj2;
                            x6Var.getClass();
                            v6 v6Var = x6Var.c;
                            v6Var.getClass();
                            if (v6Var.f463a.get() == obj && Intrinsics.areEqual(x6Var.f491a, lhVar)) {
                                break;
                            }
                        }
                    }
                    ArrayList arrayList2 = this.j;
                    z2 z2Var = this.f479a;
                    x6 x6Var2 = new x6(obj, lhVar, z2Var);
                    if (x6Var2.c.a(obj)) {
                        x6Var2.d.add(new Pair(lhVar, Long.valueOf(z2Var.a())));
                    }
                    arrayList2.add(x6Var2);
                }
            }
        }
    }

    public static final void b(w6 w6Var, List list, Map map) {
        w6Var.getClass();
        if (list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = ((String) w6Var.f.getValue()).charAt(0);
        char charAt2 = ((String) w6Var.f.getValue()).charAt(1);
        char charAt3 = ((String) w6Var.f.getValue()).charAt(2);
        char charAt4 = ((String) w6Var.f.getValue()).charAt(3);
        Iterator it = list.iterator();
        long j = 0;
        String str = null;
        long j2 = 0;
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str2 = ((lh) pair.getFirst()).f323a;
            long longValue = ((Number) pair.getSecond()).longValue();
            if (str == null) {
                str = str2;
                j2 = longValue;
            } else {
                sb.append(str2);
                sb.append(charAt);
                sb.append(longValue - j);
                sb.append(charAt2);
            }
            j = longValue;
        }
        if (str == null) {
            return;
        }
        sb.append("total").append(charAt).append(j - j2).append(charAt4);
        for (Map.Entry entry : map.entrySet()) {
            lh lhVar = (lh) entry.getKey();
            List<Pair> list2 = (List) entry.getValue();
            sb.append(lhVar.f323a);
            char c = charAt3;
            for (Pair pair2 : list2) {
                String replace = new Regex((String) w6Var.g.getValue()).replace((CharSequence) pair2.getFirst(), (String) w6Var.h.getValue());
                long longValue2 = ((Number) pair2.getSecond()).longValue() - j2;
                sb.append(c);
                sb.append(replace);
                sb.append(charAt);
                sb.append(longValue2);
                c = charAt2;
            }
            sb.append(charAt4);
        }
        w6Var.b.invoke(str, sb.toString());
    }

    public final void a(y7 y7Var, HashMap hashMap) {
        if (((Boolean) this.c.getValue()).booleanValue()) {
            synchronized (this.j) {
                ArrayList arrayList = this.j;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    x6 x6Var = (x6) obj;
                    x6Var.getClass();
                    if (x6Var.c.a(y7Var)) {
                        arrayList2.add(obj);
                    }
                }
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    ((x6) obj2).a(y7Var, hashMap);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public static final String b(oa oaVar) {
        String c;
        EventTracerMetadata eventTracerMetadata = (EventTracerMetadata) oaVar.a();
        if (eventTracerMetadata != null && (c = eventTracerMetadata.c()) != null) {
            if (c.length() < 1) {
                c = null;
            }
            return c == null ? "_" : c;
        }
        return "_";
    }

    public static final Executor a(pa paVar) {
        return (Executor) paVar.a();
    }

    public static final Unit a(final w6 w6Var, final List list, final Map map) {
        list.getClass();
        map.getClass();
        Object value = w6Var.i.getValue();
        value.getClass();
        ((Executor) value).execute(new Runnable() { // from class: com.startapp.sdk.internal.w6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                w6.b(w6.this, list, map);
            }
        });
        return Unit.INSTANCE;
    }

    public static final String a(oa oaVar) {
        String b;
        EventTracerMetadata eventTracerMetadata = (EventTracerMetadata) oaVar.a();
        if (eventTracerMetadata != null && (b = eventTracerMetadata.b()) != null) {
            if (b.length() < 6) {
                b = null;
            }
            return b == null ? "[=,:;]" : b;
        }
        return "[=,:;]";
    }
}
