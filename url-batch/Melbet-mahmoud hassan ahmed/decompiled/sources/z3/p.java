package z3;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import p3.a;
import p3.e;

/* loaded from: classes.dex */
public final class p extends p3.e<a.d.c> implements l3.b {

    /* renamed from: m, reason: collision with root package name */
    private static final a.g<d> f23702m;

    /* renamed from: n, reason: collision with root package name */
    private static final a.AbstractC0120a<d, a.d.c> f23703n;

    /* renamed from: o, reason: collision with root package name */
    private static final p3.a<a.d.c> f23704o;

    /* renamed from: k, reason: collision with root package name */
    private final Context f23705k;

    /* renamed from: l, reason: collision with root package name */
    private final o3.f f23706l;

    static {
        a.g<d> gVar = new a.g<>();
        f23702m = gVar;
        n nVar = new n();
        f23703n = nVar;
        f23704o = new p3.a<>("AppSet.API", nVar, gVar);
    }

    p(Context context, o3.f fVar) {
        super(context, f23704o, a.d.f20113a, e.a.f20126c);
        this.f23705k = context;
        this.f23706l = fVar;
    }

    @Override // l3.b
    public final j4.h<l3.c> a() {
        return this.f23706l.h(this.f23705k, 212800000) == 0 ? e(q3.n.a().d(l3.h.f18599a).b(new q3.l() { // from class: z3.m
            /* JADX WARN: Multi-variable type inference failed */
            @Override // q3.l
            public final void a(Object obj, Object obj2) {
                ((g) ((d) obj).C()).O0(new l3.d(null, null), new o(p.this, (j4.i) obj2));
            }
        }).c(false).e(27601).a()) : j4.k.b(new p3.b(new Status(17)));
    }
}
