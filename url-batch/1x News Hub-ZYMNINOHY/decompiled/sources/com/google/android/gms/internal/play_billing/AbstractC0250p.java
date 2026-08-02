package com.google.android.gms.internal.play_billing;

import E1.AbstractC0033i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* renamed from: com.google.android.gms.internal.play_billing.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0250p {

    /* renamed from: a, reason: collision with root package name */
    public static final Collector f2905a;

    static {
        final int i3 = 0;
        final int i4 = 0;
        final int i5 = 1;
        final int i6 = 1;
        f2905a = Collector.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.l
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i3) {
                    case 0:
                        return new C0276y();
                    case 1:
                        return new G();
                    default:
                        return new E();
                }
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.o
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i4) {
                    case 0:
                        ((C0276y) obj).a(obj2);
                        return;
                    case 1:
                        G g3 = (G) obj;
                        g3.getClass();
                        obj2.getClass();
                        g3.a(obj2);
                        return;
                    default:
                        E e3 = (E) obj;
                        O o = (O) obj2;
                        e3.getClass();
                        if (o.f2771a.equals(o.f2772b)) {
                            throw new IllegalArgumentException(AbstractC0216d1.f("range must not be empty, but was %s", o));
                        }
                        e3.f2725a.add(o);
                        return;
                }
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.m
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (i5) {
                    case 0:
                        E e3 = (E) obj;
                        e3.getClass();
                        Iterator it = ((E) obj2).f2725a.iterator();
                        while (it.hasNext()) {
                            O o = (O) it.next();
                            if (o.f2771a.equals(o.f2772b)) {
                                throw new IllegalArgumentException(AbstractC0216d1.f("range must not be empty, but was %s", o));
                            }
                            e3.f2725a.add(o);
                        }
                        return e3;
                    case 1:
                        C0276y c0276y = (C0276y) obj;
                        C0276y c0276y2 = (C0276y) obj2;
                        Object[] objArr = c0276y2.f2944a;
                        int i7 = c0276y2.f2945b;
                        for (int i8 = 0; i8 < i7; i8++) {
                            c0276y.getClass();
                            if (objArr[i8] == null) {
                                throw new NullPointerException(AbstractC0033i.h(i8, "at index "));
                            }
                        }
                        c0276y.c(i7);
                        System.arraycopy(objArr, 0, c0276y.f2944a, c0276y.f2945b, i7);
                        c0276y.f2945b += i7;
                        return c0276y;
                    default:
                        G g3 = (G) obj;
                        G g4 = (G) obj2;
                        Object[] objArr2 = g4.f2944a;
                        int i9 = g4.f2945b;
                        for (int i10 = 0; i10 < i9; i10++) {
                            g3.getClass();
                            if (objArr2[i10] == null) {
                                throw new NullPointerException(AbstractC0033i.h(i10, "at index "));
                            }
                        }
                        g3.c(i9);
                        System.arraycopy(objArr2, 0, g3.f2944a, g3.f2945b, i9);
                        g3.f2945b += i9;
                        return g3;
                }
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.n
            /* JADX WARN: Removed duplicated region for block: B:76:0x0132  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x0136 A[SYNTHETIC] */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                int length;
                int b3;
                O o;
                switch (i6) {
                    case 0:
                        ArrayList arrayList = ((E) obj).f2725a;
                        int size = arrayList.size();
                        AbstractC0216d1.h(size, "initialCapacity");
                        Object[] objArr = new Object[size];
                        Collections.sort(arrayList, M.f2762c);
                        Iterator it = arrayList.iterator();
                        J j3 = it instanceof J ? (J) it : new J(it);
                        int i7 = 0;
                        while (j3.hasNext()) {
                            O o3 = (O) j3.next();
                            while (j3.hasNext()) {
                                if (!j3.f2751b) {
                                    j3.f2752c = j3.f2750a.next();
                                    j3.f2751b = true;
                                }
                                O o4 = (O) j3.f2752c;
                                if (o3.f2771a.a(o4.f2772b) <= 0) {
                                    AbstractC0267v abstractC0267v = o4.f2771a;
                                    AbstractC0267v abstractC0267v2 = o3.f2772b;
                                    if (abstractC0267v.a(abstractC0267v2) <= 0) {
                                        AbstractC0267v abstractC0267v3 = o3.f2771a;
                                        int a3 = abstractC0267v3.a(abstractC0267v);
                                        AbstractC0267v abstractC0267v4 = o4.f2772b;
                                        int a4 = abstractC0267v2.a(abstractC0267v4);
                                        if (a3 >= 0 && a4 <= 0) {
                                            o = o3;
                                        } else if (a3 > 0 || a4 < 0) {
                                            if (a3 >= 0) {
                                                abstractC0267v = abstractC0267v3;
                                            }
                                            if (a4 <= 0) {
                                                abstractC0267v4 = abstractC0267v2;
                                            }
                                            if (!(abstractC0267v.a(abstractC0267v4) <= 0)) {
                                                throw new IllegalArgumentException(AbstractC0216d1.f("intersection is undefined for disconnected ranges %s and %s", o3, o4));
                                            }
                                            o = new O(abstractC0267v, abstractC0267v4);
                                        } else {
                                            o = o4;
                                        }
                                        if (!o.f2771a.equals(o.f2772b)) {
                                            throw new IllegalArgumentException(AbstractC0216d1.f("Overlapping ranges not permitted but found %s overlapping %s", o3, o4));
                                        }
                                        O o5 = (O) j3.next();
                                        int a5 = abstractC0267v3.a(o5.f2771a);
                                        int a6 = abstractC0267v2.a(o5.f2772b);
                                        if (a5 > 0 || a6 < 0) {
                                            if (a5 < 0 || a6 > 0) {
                                                if (a5 > 0) {
                                                    abstractC0267v3 = o5.f2771a;
                                                }
                                                if (a6 < 0) {
                                                    o3 = o5;
                                                }
                                                o5 = new O(abstractC0267v3, o3.f2772b);
                                            }
                                            o3 = o5;
                                        }
                                    }
                                }
                                o3.getClass();
                                length = objArr.length;
                                int i8 = i7 + 1;
                                b3 = AbstractC0270w.b(length, i8);
                                if (b3 <= length) {
                                    objArr = Arrays.copyOf(objArr, b3);
                                }
                                objArr[i7] = o3;
                                i7 = i8;
                            }
                            o3.getClass();
                            length = objArr.length;
                            int i82 = i7 + 1;
                            b3 = AbstractC0270w.b(length, i82);
                            if (b3 <= length) {
                            }
                            objArr[i7] = o3;
                            i7 = i82;
                        }
                        Q j4 = C.j(i7, objArr);
                        if (j4.isEmpty()) {
                            return F.f2728b;
                        }
                        if (j4.f2776d == 1) {
                            C0279z l3 = j4.l(0);
                            Object next = l3.next();
                            if (l3.hasNext()) {
                                StringBuilder sb = new StringBuilder("expected one element but was: <");
                                sb.append(next);
                                for (int i9 = 0; i9 < 4 && l3.hasNext(); i9++) {
                                    sb.append(", ");
                                    sb.append(l3.next());
                                }
                                if (l3.hasNext()) {
                                    sb.append(", ...");
                                }
                                sb.append('>');
                                throw new IllegalArgumentException(sb.toString());
                            }
                            if (((O) next).equals(O.f2770c)) {
                                return F.f2729c;
                            }
                        }
                        return new F(j4);
                    case 1:
                        C0276y c0276y = (C0276y) obj;
                        c0276y.f2946c = true;
                        return C.j(c0276y.f2945b, c0276y.f2944a);
                    default:
                        G g3 = (G) obj;
                        int i10 = g3.f2945b;
                        if (i10 == 0) {
                            return X.f2810i;
                        }
                        if (i10 == 1) {
                            Object obj2 = g3.f2944a[0];
                            Objects.requireNonNull(obj2);
                            return new Z(obj2);
                        }
                        H j5 = H.j(i10, g3.f2944a);
                        g3.f2945b = j5.size();
                        g3.f2946c = true;
                        return j5;
                }
            }
        }, new Collector.Characteristics[0]);
        final int i7 = 1;
        final int i8 = 1;
        final int i9 = 2;
        final int i10 = 2;
        Collector.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.l
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i7) {
                    case 0:
                        return new C0276y();
                    case 1:
                        return new G();
                    default:
                        return new E();
                }
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.o
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i8) {
                    case 0:
                        ((C0276y) obj).a(obj2);
                        return;
                    case 1:
                        G g3 = (G) obj;
                        g3.getClass();
                        obj2.getClass();
                        g3.a(obj2);
                        return;
                    default:
                        E e3 = (E) obj;
                        O o = (O) obj2;
                        e3.getClass();
                        if (o.f2771a.equals(o.f2772b)) {
                            throw new IllegalArgumentException(AbstractC0216d1.f("range must not be empty, but was %s", o));
                        }
                        e3.f2725a.add(o);
                        return;
                }
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.m
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (i9) {
                    case 0:
                        E e3 = (E) obj;
                        e3.getClass();
                        Iterator it = ((E) obj2).f2725a.iterator();
                        while (it.hasNext()) {
                            O o = (O) it.next();
                            if (o.f2771a.equals(o.f2772b)) {
                                throw new IllegalArgumentException(AbstractC0216d1.f("range must not be empty, but was %s", o));
                            }
                            e3.f2725a.add(o);
                        }
                        return e3;
                    case 1:
                        C0276y c0276y = (C0276y) obj;
                        C0276y c0276y2 = (C0276y) obj2;
                        Object[] objArr = c0276y2.f2944a;
                        int i72 = c0276y2.f2945b;
                        for (int i82 = 0; i82 < i72; i82++) {
                            c0276y.getClass();
                            if (objArr[i82] == null) {
                                throw new NullPointerException(AbstractC0033i.h(i82, "at index "));
                            }
                        }
                        c0276y.c(i72);
                        System.arraycopy(objArr, 0, c0276y.f2944a, c0276y.f2945b, i72);
                        c0276y.f2945b += i72;
                        return c0276y;
                    default:
                        G g3 = (G) obj;
                        G g4 = (G) obj2;
                        Object[] objArr2 = g4.f2944a;
                        int i92 = g4.f2945b;
                        for (int i102 = 0; i102 < i92; i102++) {
                            g3.getClass();
                            if (objArr2[i102] == null) {
                                throw new NullPointerException(AbstractC0033i.h(i102, "at index "));
                            }
                        }
                        g3.c(i92);
                        System.arraycopy(objArr2, 0, g3.f2944a, g3.f2945b, i92);
                        g3.f2945b += i92;
                        return g3;
                }
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.n
            /* JADX WARN: Removed duplicated region for block: B:76:0x0132  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x0136 A[SYNTHETIC] */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                int length;
                int b3;
                O o;
                switch (i10) {
                    case 0:
                        ArrayList arrayList = ((E) obj).f2725a;
                        int size = arrayList.size();
                        AbstractC0216d1.h(size, "initialCapacity");
                        Object[] objArr = new Object[size];
                        Collections.sort(arrayList, M.f2762c);
                        Iterator it = arrayList.iterator();
                        J j3 = it instanceof J ? (J) it : new J(it);
                        int i72 = 0;
                        while (j3.hasNext()) {
                            O o3 = (O) j3.next();
                            while (j3.hasNext()) {
                                if (!j3.f2751b) {
                                    j3.f2752c = j3.f2750a.next();
                                    j3.f2751b = true;
                                }
                                O o4 = (O) j3.f2752c;
                                if (o3.f2771a.a(o4.f2772b) <= 0) {
                                    AbstractC0267v abstractC0267v = o4.f2771a;
                                    AbstractC0267v abstractC0267v2 = o3.f2772b;
                                    if (abstractC0267v.a(abstractC0267v2) <= 0) {
                                        AbstractC0267v abstractC0267v3 = o3.f2771a;
                                        int a3 = abstractC0267v3.a(abstractC0267v);
                                        AbstractC0267v abstractC0267v4 = o4.f2772b;
                                        int a4 = abstractC0267v2.a(abstractC0267v4);
                                        if (a3 >= 0 && a4 <= 0) {
                                            o = o3;
                                        } else if (a3 > 0 || a4 < 0) {
                                            if (a3 >= 0) {
                                                abstractC0267v = abstractC0267v3;
                                            }
                                            if (a4 <= 0) {
                                                abstractC0267v4 = abstractC0267v2;
                                            }
                                            if (!(abstractC0267v.a(abstractC0267v4) <= 0)) {
                                                throw new IllegalArgumentException(AbstractC0216d1.f("intersection is undefined for disconnected ranges %s and %s", o3, o4));
                                            }
                                            o = new O(abstractC0267v, abstractC0267v4);
                                        } else {
                                            o = o4;
                                        }
                                        if (!o.f2771a.equals(o.f2772b)) {
                                            throw new IllegalArgumentException(AbstractC0216d1.f("Overlapping ranges not permitted but found %s overlapping %s", o3, o4));
                                        }
                                        O o5 = (O) j3.next();
                                        int a5 = abstractC0267v3.a(o5.f2771a);
                                        int a6 = abstractC0267v2.a(o5.f2772b);
                                        if (a5 > 0 || a6 < 0) {
                                            if (a5 < 0 || a6 > 0) {
                                                if (a5 > 0) {
                                                    abstractC0267v3 = o5.f2771a;
                                                }
                                                if (a6 < 0) {
                                                    o3 = o5;
                                                }
                                                o5 = new O(abstractC0267v3, o3.f2772b);
                                            }
                                            o3 = o5;
                                        }
                                    }
                                }
                                o3.getClass();
                                length = objArr.length;
                                int i82 = i72 + 1;
                                b3 = AbstractC0270w.b(length, i82);
                                if (b3 <= length) {
                                    objArr = Arrays.copyOf(objArr, b3);
                                }
                                objArr[i72] = o3;
                                i72 = i82;
                            }
                            o3.getClass();
                            length = objArr.length;
                            int i822 = i72 + 1;
                            b3 = AbstractC0270w.b(length, i822);
                            if (b3 <= length) {
                            }
                            objArr[i72] = o3;
                            i72 = i822;
                        }
                        Q j4 = C.j(i72, objArr);
                        if (j4.isEmpty()) {
                            return F.f2728b;
                        }
                        if (j4.f2776d == 1) {
                            C0279z l3 = j4.l(0);
                            Object next = l3.next();
                            if (l3.hasNext()) {
                                StringBuilder sb = new StringBuilder("expected one element but was: <");
                                sb.append(next);
                                for (int i92 = 0; i92 < 4 && l3.hasNext(); i92++) {
                                    sb.append(", ");
                                    sb.append(l3.next());
                                }
                                if (l3.hasNext()) {
                                    sb.append(", ...");
                                }
                                sb.append('>');
                                throw new IllegalArgumentException(sb.toString());
                            }
                            if (((O) next).equals(O.f2770c)) {
                                return F.f2729c;
                            }
                        }
                        return new F(j4);
                    case 1:
                        C0276y c0276y = (C0276y) obj;
                        c0276y.f2946c = true;
                        return C.j(c0276y.f2945b, c0276y.f2944a);
                    default:
                        G g3 = (G) obj;
                        int i102 = g3.f2945b;
                        if (i102 == 0) {
                            return X.f2810i;
                        }
                        if (i102 == 1) {
                            Object obj2 = g3.f2944a[0];
                            Objects.requireNonNull(obj2);
                            return new Z(obj2);
                        }
                        H j5 = H.j(i102, g3.f2944a);
                        g3.f2945b = j5.size();
                        g3.f2946c = true;
                        return j5;
                }
            }
        }, new Collector.Characteristics[0]);
        final int i11 = 2;
        final int i12 = 2;
        final int i13 = 0;
        final int i14 = 0;
        Collector.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.l
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i11) {
                    case 0:
                        return new C0276y();
                    case 1:
                        return new G();
                    default:
                        return new E();
                }
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.o
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i12) {
                    case 0:
                        ((C0276y) obj).a(obj2);
                        return;
                    case 1:
                        G g3 = (G) obj;
                        g3.getClass();
                        obj2.getClass();
                        g3.a(obj2);
                        return;
                    default:
                        E e3 = (E) obj;
                        O o = (O) obj2;
                        e3.getClass();
                        if (o.f2771a.equals(o.f2772b)) {
                            throw new IllegalArgumentException(AbstractC0216d1.f("range must not be empty, but was %s", o));
                        }
                        e3.f2725a.add(o);
                        return;
                }
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.m
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (i13) {
                    case 0:
                        E e3 = (E) obj;
                        e3.getClass();
                        Iterator it = ((E) obj2).f2725a.iterator();
                        while (it.hasNext()) {
                            O o = (O) it.next();
                            if (o.f2771a.equals(o.f2772b)) {
                                throw new IllegalArgumentException(AbstractC0216d1.f("range must not be empty, but was %s", o));
                            }
                            e3.f2725a.add(o);
                        }
                        return e3;
                    case 1:
                        C0276y c0276y = (C0276y) obj;
                        C0276y c0276y2 = (C0276y) obj2;
                        Object[] objArr = c0276y2.f2944a;
                        int i72 = c0276y2.f2945b;
                        for (int i82 = 0; i82 < i72; i82++) {
                            c0276y.getClass();
                            if (objArr[i82] == null) {
                                throw new NullPointerException(AbstractC0033i.h(i82, "at index "));
                            }
                        }
                        c0276y.c(i72);
                        System.arraycopy(objArr, 0, c0276y.f2944a, c0276y.f2945b, i72);
                        c0276y.f2945b += i72;
                        return c0276y;
                    default:
                        G g3 = (G) obj;
                        G g4 = (G) obj2;
                        Object[] objArr2 = g4.f2944a;
                        int i92 = g4.f2945b;
                        for (int i102 = 0; i102 < i92; i102++) {
                            g3.getClass();
                            if (objArr2[i102] == null) {
                                throw new NullPointerException(AbstractC0033i.h(i102, "at index "));
                            }
                        }
                        g3.c(i92);
                        System.arraycopy(objArr2, 0, g3.f2944a, g3.f2945b, i92);
                        g3.f2945b += i92;
                        return g3;
                }
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.n
            /* JADX WARN: Removed duplicated region for block: B:76:0x0132  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x0136 A[SYNTHETIC] */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                int length;
                int b3;
                O o;
                switch (i14) {
                    case 0:
                        ArrayList arrayList = ((E) obj).f2725a;
                        int size = arrayList.size();
                        AbstractC0216d1.h(size, "initialCapacity");
                        Object[] objArr = new Object[size];
                        Collections.sort(arrayList, M.f2762c);
                        Iterator it = arrayList.iterator();
                        J j3 = it instanceof J ? (J) it : new J(it);
                        int i72 = 0;
                        while (j3.hasNext()) {
                            O o3 = (O) j3.next();
                            while (j3.hasNext()) {
                                if (!j3.f2751b) {
                                    j3.f2752c = j3.f2750a.next();
                                    j3.f2751b = true;
                                }
                                O o4 = (O) j3.f2752c;
                                if (o3.f2771a.a(o4.f2772b) <= 0) {
                                    AbstractC0267v abstractC0267v = o4.f2771a;
                                    AbstractC0267v abstractC0267v2 = o3.f2772b;
                                    if (abstractC0267v.a(abstractC0267v2) <= 0) {
                                        AbstractC0267v abstractC0267v3 = o3.f2771a;
                                        int a3 = abstractC0267v3.a(abstractC0267v);
                                        AbstractC0267v abstractC0267v4 = o4.f2772b;
                                        int a4 = abstractC0267v2.a(abstractC0267v4);
                                        if (a3 >= 0 && a4 <= 0) {
                                            o = o3;
                                        } else if (a3 > 0 || a4 < 0) {
                                            if (a3 >= 0) {
                                                abstractC0267v = abstractC0267v3;
                                            }
                                            if (a4 <= 0) {
                                                abstractC0267v4 = abstractC0267v2;
                                            }
                                            if (!(abstractC0267v.a(abstractC0267v4) <= 0)) {
                                                throw new IllegalArgumentException(AbstractC0216d1.f("intersection is undefined for disconnected ranges %s and %s", o3, o4));
                                            }
                                            o = new O(abstractC0267v, abstractC0267v4);
                                        } else {
                                            o = o4;
                                        }
                                        if (!o.f2771a.equals(o.f2772b)) {
                                            throw new IllegalArgumentException(AbstractC0216d1.f("Overlapping ranges not permitted but found %s overlapping %s", o3, o4));
                                        }
                                        O o5 = (O) j3.next();
                                        int a5 = abstractC0267v3.a(o5.f2771a);
                                        int a6 = abstractC0267v2.a(o5.f2772b);
                                        if (a5 > 0 || a6 < 0) {
                                            if (a5 < 0 || a6 > 0) {
                                                if (a5 > 0) {
                                                    abstractC0267v3 = o5.f2771a;
                                                }
                                                if (a6 < 0) {
                                                    o3 = o5;
                                                }
                                                o5 = new O(abstractC0267v3, o3.f2772b);
                                            }
                                            o3 = o5;
                                        }
                                    }
                                }
                                o3.getClass();
                                length = objArr.length;
                                int i822 = i72 + 1;
                                b3 = AbstractC0270w.b(length, i822);
                                if (b3 <= length) {
                                    objArr = Arrays.copyOf(objArr, b3);
                                }
                                objArr[i72] = o3;
                                i72 = i822;
                            }
                            o3.getClass();
                            length = objArr.length;
                            int i8222 = i72 + 1;
                            b3 = AbstractC0270w.b(length, i8222);
                            if (b3 <= length) {
                            }
                            objArr[i72] = o3;
                            i72 = i8222;
                        }
                        Q j4 = C.j(i72, objArr);
                        if (j4.isEmpty()) {
                            return F.f2728b;
                        }
                        if (j4.f2776d == 1) {
                            C0279z l3 = j4.l(0);
                            Object next = l3.next();
                            if (l3.hasNext()) {
                                StringBuilder sb = new StringBuilder("expected one element but was: <");
                                sb.append(next);
                                for (int i92 = 0; i92 < 4 && l3.hasNext(); i92++) {
                                    sb.append(", ");
                                    sb.append(l3.next());
                                }
                                if (l3.hasNext()) {
                                    sb.append(", ...");
                                }
                                sb.append('>');
                                throw new IllegalArgumentException(sb.toString());
                            }
                            if (((O) next).equals(O.f2770c)) {
                                return F.f2729c;
                            }
                        }
                        return new F(j4);
                    case 1:
                        C0276y c0276y = (C0276y) obj;
                        c0276y.f2946c = true;
                        return C.j(c0276y.f2945b, c0276y.f2944a);
                    default:
                        G g3 = (G) obj;
                        int i102 = g3.f2945b;
                        if (i102 == 0) {
                            return X.f2810i;
                        }
                        if (i102 == 1) {
                            Object obj2 = g3.f2944a[0];
                            Objects.requireNonNull(obj2);
                            return new Z(obj2);
                        }
                        H j5 = H.j(i102, g3.f2944a);
                        g3.f2945b = j5.size();
                        g3.f2946c = true;
                        return j5;
                }
            }
        }, new Collector.Characteristics[0]);
    }
}
