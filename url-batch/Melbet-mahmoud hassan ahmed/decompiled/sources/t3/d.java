package t3;

import android.content.Context;
import j4.h;
import j4.i;
import p3.a;
import p3.e;
import q3.l;
import q3.n;
import r3.r;
import r3.t;
import r3.u;

/* loaded from: classes.dex */
public final class d extends p3.e<u> implements t {

    /* renamed from: k, reason: collision with root package name */
    private static final a.g<e> f22279k;

    /* renamed from: l, reason: collision with root package name */
    private static final a.AbstractC0120a<e, u> f22280l;

    /* renamed from: m, reason: collision with root package name */
    private static final p3.a<u> f22281m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f22282n = 0;

    static {
        a.g<e> gVar = new a.g<>();
        f22279k = gVar;
        c cVar = new c();
        f22280l = cVar;
        f22281m = new p3.a<>("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, u uVar) {
        super(context, f22281m, uVar, e.a.f20126c);
    }

    @Override // r3.t
    public final h<Void> b(final r rVar) {
        n.a a7 = n.a();
        a7.d(a4.d.f211a);
        a7.c(false);
        a7.b(new l(rVar) { // from class: t3.b

            /* renamed from: a, reason: collision with root package name */
            private final r f22278a;

            {
                this.f22278a = rVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // q3.l
            public final void a(Object obj, Object obj2) {
                r rVar2 = this.f22278a;
                int i7 = d.f22282n;
                ((a) ((e) obj).C()).B3(rVar2);
                ((i) obj2).c(null);
            }
        });
        return d(a7.a());
    }
}
