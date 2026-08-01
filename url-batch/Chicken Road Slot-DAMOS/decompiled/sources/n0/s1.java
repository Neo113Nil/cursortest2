package n0;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public q f6809a;

    /* renamed from: b, reason: collision with root package name */
    public int f6810b;

    /* renamed from: c, reason: collision with root package name */
    public q0.b f6811c;

    /* renamed from: d, reason: collision with root package name */
    public Function2 f6812d;

    /* renamed from: e, reason: collision with root package name */
    public int f6813e;

    /* renamed from: f, reason: collision with root package name */
    public s.c0 f6814f;
    public s.h0 g;

    public s1(q qVar) {
        this.f6809a = qVar;
    }

    public final boolean a() {
        if (this.f6809a != null) {
            q0.b bVar = this.f6811c;
            if (bVar != null ? bVar.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final o0 b(Object obj) {
        o0 r9;
        q qVar = this.f6809a;
        return (qVar == null || (r9 = qVar.r(this, obj)) == null) ? o0.f6765d : r9;
    }

    public final void c() {
        q qVar = this.f6809a;
        if (qVar != null) {
            qVar.C = true;
            qVar.F.p();
        }
        this.f6809a = null;
        this.f6814f = null;
        this.g = null;
        this.f6812d = null;
    }

    public final void d(boolean z10) {
        int i3 = this.f6810b;
        this.f6810b = z10 ? i3 | 32 : i3 & (-33);
    }
}
