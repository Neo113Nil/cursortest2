package r0;

import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n.z0;

/* renamed from: r0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0926w implements InterfaceC0902Y {

    /* renamed from: d, reason: collision with root package name */
    public O0.k f8187d = O0.k.f3742e;

    /* renamed from: e, reason: collision with root package name */
    public float f8188e;

    /* renamed from: f, reason: collision with root package name */
    public float f8189f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0881C f8190g;

    public C0926w(C0881C c0881c) {
        this.f8190g = c0881c;
    }

    @Override // r0.InterfaceC0916m
    public final boolean D() {
        int i3 = this.f8190g.f8100d.f8562z.f8627c;
        return i3 == 4 || i3 == 2;
    }

    @Override // O0.b
    public final float a() {
        return this.f8188e;
    }

    @Override // r0.InterfaceC0916m
    public final O0.k getLayoutDirection() {
        return this.f8187d;
    }

    @Override // r0.InterfaceC0902Y
    public final List l0(Object obj, InterfaceC0426e interfaceC0426e) {
        C0881C c0881c = this.f8190g;
        c0881c.e();
        t0.E e3 = c0881c.f8100d;
        int i3 = e3.f8562z.f8627c;
        Object obj2 = null;
        if (!(i3 == 1 || i3 == 3 || i3 == 2 || i3 == 4)) {
            z0.o("subcompose can only be used inside the measure or layout blocks");
            throw null;
        }
        HashMap hashMap = c0881c.f8106j;
        Object obj3 = hashMap.get(obj);
        if (obj3 == null) {
            obj3 = (t0.E) c0881c.f8109m.remove(obj);
            if (obj3 != null) {
                int i4 = c0881c.f8114r;
                if (i4 <= 0) {
                    z0.o("Check failed.");
                    throw null;
                }
                c0881c.f8114r = i4 - 1;
            } else {
                obj3 = c0881c.j(obj);
                if (obj3 == null) {
                    int i5 = c0881c.f8103g;
                    t0.E e4 = new t0.E(2, 0, true);
                    e3.f8550n = true;
                    e3.x(i5, e4);
                    e3.f8550n = false;
                    obj3 = e4;
                }
            }
            hashMap.put(obj, obj3);
        }
        t0.E e5 = (t0.E) obj3;
        List p3 = e3.p();
        int i6 = c0881c.f8103g;
        if (i6 >= 0) {
            K.a aVar = (K.a) p3;
            if (i6 < aVar.f3208d.f3216f) {
                obj2 = aVar.get(i6);
            }
        }
        if (obj2 != e5) {
            int k3 = ((K.a) e3.p()).f3208d.k(e5);
            int i7 = c0881c.f8103g;
            if (k3 < i7) {
                throw new IllegalArgumentException(("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
            }
            if (i7 != k3) {
                e3.f8550n = true;
                e3.H(k3, i7, 1);
                e3.f8550n = false;
            }
        }
        c0881c.f8103g++;
        c0881c.h(e5, obj, interfaceC0426e);
        return (i3 == 1 || i3 == 3) ? e5.m() : e5.l();
    }

    @Override // r0.InterfaceC0887I
    public final InterfaceC0886H q(int i3, int i4, Map map, InterfaceC0424c interfaceC0424c) {
        if ((i3 & (-16777216)) == 0 && ((-16777216) & i4) == 0) {
            return new C0925v(i3, i4, map, this, this.f8190g, interfaceC0424c);
        }
        z0.o("Size(" + i3 + " x " + i4 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    @Override // O0.b
    public final float r() {
        return this.f8189f;
    }
}
