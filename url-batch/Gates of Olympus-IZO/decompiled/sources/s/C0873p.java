package s;

import I.C0089d;
import I.C0096g0;
import u.C0920B;

/* renamed from: s.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0873p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7451a;

    /* renamed from: b, reason: collision with root package name */
    public final C0096g0 f7452b;

    /* renamed from: c, reason: collision with root package name */
    public final C0096g0 f7453c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7454d;

    /* renamed from: e, reason: collision with root package name */
    public Object f7455e;

    /* renamed from: f, reason: collision with root package name */
    public final C0920B f7456f;

    public C0873p(int i3, int i4, int i5) {
        this.f7451a = i5;
        switch (i5) {
            case 1:
                this.f7452b = C0089d.I(i3);
                this.f7453c = C0089d.I(i4);
                this.f7456f = new C0920B(i3, 90, 200);
                break;
            default:
                this.f7452b = C0089d.I(i3);
                this.f7453c = C0089d.I(i4);
                this.f7456f = new C0920B(i3, 30, 100);
                break;
        }
    }

    public final void a(int i3, int i4) {
        switch (this.f7451a) {
            case 0:
                if (i3 >= 0.0f) {
                    this.f7452b.h(i3);
                    this.f7456f.b(i3);
                    this.f7453c.h(i4);
                    return;
                } else {
                    throw new IllegalArgumentException(("Index should be non-negative (" + i3 + ')').toString());
                }
            default:
                if (i3 >= 0.0f) {
                    this.f7452b.h(i3);
                    this.f7456f.b(i3);
                    this.f7453c.h(i4);
                    return;
                } else {
                    throw new IllegalArgumentException(("Index should be non-negative (" + i3 + ')').toString());
                }
        }
    }
}
