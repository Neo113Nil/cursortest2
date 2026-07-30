package a1;

import java.util.List;
import k1.C4628a;

/* renamed from: a1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0419c implements InterfaceC0418b {

    /* renamed from: n, reason: collision with root package name */
    public final List f4296n;

    /* renamed from: v, reason: collision with root package name */
    public C4628a f4298v = null;

    /* renamed from: w, reason: collision with root package name */
    public float f4299w = -1.0f;

    /* renamed from: u, reason: collision with root package name */
    public C4628a f4297u = a(0.0f);

    public C0419c(List list) {
        this.f4296n = list;
    }

    public final C4628a a(float f6) {
        List list = this.f4296n;
        C4628a c4628a = (C4628a) list.get(list.size() - 1);
        if (f6 >= c4628a.b()) {
            return c4628a;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            C4628a c4628a2 = (C4628a) list.get(size);
            if (this.f4297u != c4628a2 && f6 >= c4628a2.b() && f6 < c4628a2.a()) {
                return c4628a2;
            }
        }
        return (C4628a) list.get(0);
    }

    @Override // a1.InterfaceC0418b
    public final boolean g(float f6) {
        C4628a c4628a = this.f4298v;
        C4628a c4628a2 = this.f4297u;
        if (c4628a == c4628a2 && this.f4299w == f6) {
            return true;
        }
        this.f4298v = c4628a2;
        this.f4299w = f6;
        return false;
    }

    @Override // a1.InterfaceC0418b
    public final C4628a h() {
        return this.f4297u;
    }

    @Override // a1.InterfaceC0418b
    public final boolean i(float f6) {
        C4628a c4628a = this.f4297u;
        if (f6 >= c4628a.b() && f6 < c4628a.a()) {
            return !this.f4297u.c();
        }
        this.f4297u = a(f6);
        return true;
    }

    @Override // a1.InterfaceC0418b
    public final boolean isEmpty() {
        return false;
    }

    @Override // a1.InterfaceC0418b
    public final float m() {
        return ((C4628a) this.f4296n.get(r0.size() - 1)).a();
    }

    @Override // a1.InterfaceC0418b
    public final float n() {
        return ((C4628a) this.f4296n.get(0)).b();
    }
}
