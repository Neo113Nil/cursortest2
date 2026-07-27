package p0;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import n.AbstractC0864b;
import z2.C1403G;

/* renamed from: p0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0987w implements InterfaceC0964Z {

    /* renamed from: d, reason: collision with root package name */
    public M0.k f9071d = M0.k.f3556e;

    /* renamed from: e, reason: collision with root package name */
    public float f9072e;

    /* renamed from: i, reason: collision with root package name */
    public float f9073i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0941B f9074j;

    public C0987w(C0941B c0941b) {
        this.f9074j = c0941b;
    }

    @Override // p0.InterfaceC0977m
    public final boolean A() {
        int i2 = this.f9074j.f8978d.f9584C.f9676c;
        return i2 == 4 || i2 == 2;
    }

    @Override // p0.InterfaceC0947H
    public final InterfaceC0946G b0(int i2, int i4, Map map, Function1 function1) {
        if ((i2 & (-16777216)) == 0 && ((-16777216) & i4) == 0) {
            return new C0986v(i2, i4, map, this, this.f9074j, function1);
        }
        AbstractC0864b.D("Size(" + i2 + " x " + i4 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    @Override // M0.b
    public final float e() {
        return this.f9072e;
    }

    @Override // p0.InterfaceC0977m
    public final M0.k getLayoutDirection() {
        return this.f9071d;
    }

    @Override // M0.b
    public final float q() {
        return this.f9073i;
    }

    @Override // p0.InterfaceC0964Z
    public final List v(Object obj, Function2 function2) {
        r0.E e4;
        C0941B c0941b = this.f9074j;
        c0941b.e();
        r0.E e5 = c0941b.f8978d;
        int i2 = e5.f9584C.f9676c;
        if (!(i2 == 1 || i2 == 3 || i2 == 2 || i2 == 4)) {
            AbstractC0864b.D("subcompose can only be used inside the measure or layout blocks");
            throw null;
        }
        HashMap hashMap = c0941b.f8984m;
        Object obj2 = hashMap.get(obj);
        Object obj3 = obj2;
        if (obj2 == null) {
            r0.E e6 = (r0.E) c0941b.f8987p.remove(obj);
            if (e6 != null) {
                int i4 = c0941b.f8992u;
                if (i4 <= 0) {
                    AbstractC0864b.D("Check failed.");
                    throw null;
                }
                c0941b.f8992u = i4 - 1;
                e4 = e6;
            } else {
                r0.E j4 = c0941b.j(obj);
                if (j4 == null) {
                    int i5 = c0941b.f8981j;
                    r0.E e7 = new r0.E(2, 0, true);
                    e5.f9604q = true;
                    e5.x(i5, e7);
                    e5.f9604q = false;
                    e4 = e7;
                } else {
                    e4 = j4;
                }
            }
            hashMap.put(obj, e4);
            obj3 = e4;
        }
        r0.E e8 = (r0.E) obj3;
        if (C1403G.s(c0941b.f8981j, e5.p()) != e8) {
            int j5 = ((I.a) e5.p()).f3324d.j(e8);
            int i6 = c0941b.f8981j;
            if (j5 < i6) {
                throw new IllegalArgumentException(("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
            }
            if (i6 != j5) {
                e5.f9604q = true;
                e5.H(j5, i6, 1);
                e5.f9604q = false;
            }
        }
        c0941b.f8981j++;
        c0941b.h(e8, obj, function2);
        return (i2 == 1 || i2 == 3) ? e8.m() : e8.l();
    }
}
