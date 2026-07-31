package z3;

import android.content.Context;

/* loaded from: classes.dex */
public final class r implements l3.b {

    /* renamed from: a, reason: collision with root package name */
    private final l3.b f23708a;

    /* renamed from: b, reason: collision with root package name */
    private final l3.b f23709b;

    public r(Context context) {
        this.f23708a = new p(context, o3.f.f());
        this.f23709b = l.d(context);
    }

    public static /* synthetic */ j4.h b(r rVar, j4.h hVar) {
        if (hVar.m() || hVar.k()) {
            return hVar;
        }
        Exception i7 = hVar.i();
        if (!(i7 instanceof p3.b)) {
            return hVar;
        }
        int b7 = ((p3.b) i7).b();
        return (b7 == 43001 || b7 == 43002 || b7 == 43003 || b7 == 17) ? rVar.f23709b.a() : b7 == 43000 ? j4.k.b(new Exception("Failed to get app set ID due to an internal error. Please try again later.")) : b7 != 15 ? hVar : j4.k.b(new Exception("The operation to get app set ID timed out. Please try again later."));
    }

    @Override // l3.b
    public final j4.h<l3.c> a() {
        return this.f23708a.a().g(new j4.a() { // from class: z3.q
            @Override // j4.a
            public final Object a(j4.h hVar) {
                return r.b(r.this, hVar);
            }
        });
    }
}
