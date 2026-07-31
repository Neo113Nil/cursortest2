package t;

import java.util.List;
import u.InterfaceC0919A;

/* loaded from: classes.dex */
public final class k implements InterfaceC0919A {

    /* renamed from: a, reason: collision with root package name */
    public final h f7601a;

    /* renamed from: b, reason: collision with root package name */
    public final u.y f7602b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7603c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u.y f7604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f7605e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f7606f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7607g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7608h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f7609i;

    public k(h hVar, u.y yVar, int i3, y yVar2, boolean z3, int i4, int i5, long j3) {
        this.f7604d = yVar;
        this.f7605e = yVar2;
        this.f7606f = z3;
        this.f7607g = i4;
        this.f7608h = i5;
        this.f7609i = j3;
        this.f7601a = hVar;
        this.f7602b = yVar;
        this.f7603c = i3;
    }

    public final q a(int i3, long j3, int i4, int i5, int i6) {
        int i7;
        h hVar = this.f7601a;
        Object c3 = hVar.c(i3);
        Object m3 = hVar.f7587b.m(i3);
        List b2 = this.f7602b.b(j3, i3);
        if (M0.a.f(j3)) {
            i7 = M0.a.j(j3);
        } else {
            if (!M0.a.e(j3)) {
                throw new IllegalArgumentException("does not have fixed height");
            }
            i7 = M0.a.i(j3);
        }
        int i8 = i7;
        M0.j layoutDirection = this.f7604d.f8101e.getLayoutDirection();
        androidx.compose.foundation.lazy.layout.a aVar = this.f7605e.f7698k;
        return new q(i3, c3, i8, i6, this.f7606f, layoutDirection, this.f7607g, this.f7608h, b2, this.f7609i, m3, aVar, j3, i4, i5);
    }
}
