package s;

import java.util.List;
import u.InterfaceC0919A;

/* renamed from: s.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0868k implements InterfaceC0919A {

    /* renamed from: a, reason: collision with root package name */
    public final C0866i f7390a;

    /* renamed from: b, reason: collision with root package name */
    public final u.y f7391b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7392c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f7393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u.y f7394e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7395f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7396g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ U.b f7397h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ U.c f7398i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f7399j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7400k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f7401l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f7402m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0880w f7403n;

    public C0868k(long j3, boolean z3, C0866i c0866i, u.y yVar, int i3, int i4, U.b bVar, U.c cVar, boolean z4, int i5, int i6, long j4, C0880w c0880w) {
        this.f7393d = z3;
        this.f7394e = yVar;
        this.f7395f = i3;
        this.f7396g = i4;
        this.f7397h = bVar;
        this.f7398i = cVar;
        this.f7399j = z4;
        this.f7400k = i5;
        this.f7401l = i6;
        this.f7402m = j4;
        this.f7403n = c0880w;
        this.f7390a = c0866i;
        this.f7391b = yVar;
        this.f7392c = I2.l.b(z3 ? M0.a.h(j3) : Integer.MAX_VALUE, z3 ? Integer.MAX_VALUE : M0.a.g(j3), 5);
    }

    public final C0872o a(long j3, int i3) {
        C0866i c0866i = this.f7390a;
        Object c3 = c0866i.c(i3);
        Object m3 = c0866i.f7372b.m(i3);
        List b2 = this.f7391b.b(j3, i3);
        int i4 = i3 == this.f7395f + (-1) ? 0 : this.f7396g;
        return new C0872o(i3, b2, this.f7393d, this.f7397h, this.f7398i, this.f7394e.f8101e.getLayoutDirection(), this.f7399j, this.f7400k, this.f7401l, i4, this.f7402m, c3, m3, this.f7403n.f7486m, j3);
    }
}
