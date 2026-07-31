package u;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class y implements r0.C {

    /* renamed from: d, reason: collision with root package name */
    public final C0951t f8100d;

    /* renamed from: e, reason: collision with root package name */
    public final r0.Q f8101e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0953v f8102f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f8103g = new HashMap();

    public y(C0951t c0951t, r0.Q q2) {
        this.f8100d = c0951t;
        this.f8101e = q2;
        this.f8102f = (InterfaceC0953v) c0951t.f8091b.b();
    }

    @Override // r0.C
    public final boolean B() {
        return this.f8101e.B();
    }

    @Override // M0.b
    public final long C(long j3) {
        return this.f8101e.C(j3);
    }

    @Override // M0.b
    public final long D(float f3) {
        return this.f8101e.D(f3);
    }

    @Override // M0.b
    public final float F(float f3) {
        return this.f8101e.F(f3);
    }

    @Override // M0.b
    public final float G(long j3) {
        return this.f8101e.G(j3);
    }

    @Override // r0.C
    public final r0.B I(int i3, int i4, Map map, Y1.c cVar) {
        return this.f8101e.I(i3, i4, map, cVar);
    }

    @Override // M0.b
    public final long R(float f3) {
        return this.f8101e.R(f3);
    }

    @Override // r0.C
    public final r0.B Y(int i3, int i4, Map map, Y1.c cVar) {
        return this.f8101e.Y(i3, i4, map, cVar);
    }

    @Override // M0.b
    public final float Z(int i3) {
        return this.f8101e.Z(i3);
    }

    @Override // M0.b
    public final float a() {
        return this.f8101e.a();
    }

    @Override // M0.b
    public final float a0(long j3) {
        return this.f8101e.a0(j3);
    }

    public final List b(long j3, int i3) {
        HashMap hashMap = this.f8103g;
        List list = (List) hashMap.get(Integer.valueOf(i3));
        if (list != null) {
            return list;
        }
        InterfaceC0953v interfaceC0953v = this.f8102f;
        Object c3 = interfaceC0953v.c(i3);
        List X2 = this.f8101e.X(c3, this.f8100d.a(c3, i3, interfaceC0953v.d(i3)));
        int size = X2.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(((r0.z) X2.get(i4)).b(j3));
        }
        hashMap.put(Integer.valueOf(i3), arrayList);
        return arrayList;
    }

    @Override // M0.b
    public final float c0(float f3) {
        return this.f8101e.c0(f3);
    }

    @Override // r0.C
    public final M0.j getLayoutDirection() {
        return this.f8101e.getLayoutDirection();
    }

    @Override // M0.b
    public final int k(float f3) {
        return this.f8101e.k(f3);
    }

    @Override // M0.b
    public final float p() {
        return this.f8101e.p();
    }
}
