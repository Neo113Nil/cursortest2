package a1;

import java.util.List;
import k1.C4628a;

/* renamed from: a1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0420d implements InterfaceC0418b {

    /* renamed from: n, reason: collision with root package name */
    public final C4628a f4300n;

    /* renamed from: u, reason: collision with root package name */
    public float f4301u = -1.0f;

    public C0420d(List list) {
        this.f4300n = (C4628a) list.get(0);
    }

    @Override // a1.InterfaceC0418b
    public final boolean g(float f6) {
        if (this.f4301u == f6) {
            return true;
        }
        this.f4301u = f6;
        return false;
    }

    @Override // a1.InterfaceC0418b
    public final C4628a h() {
        return this.f4300n;
    }

    @Override // a1.InterfaceC0418b
    public final boolean i(float f6) {
        return !this.f4300n.c();
    }

    @Override // a1.InterfaceC0418b
    public final boolean isEmpty() {
        return false;
    }

    @Override // a1.InterfaceC0418b
    public final float m() {
        return this.f4300n.a();
    }

    @Override // a1.InterfaceC0418b
    public final float n() {
        return this.f4300n.b();
    }
}
