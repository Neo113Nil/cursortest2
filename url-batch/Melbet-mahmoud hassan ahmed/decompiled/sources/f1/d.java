package f1;

import android.net.Uri;
import java.util.Map;
import o2.a0;
import r0.n2;
import w0.e0;
import w0.l;
import w0.m;
import w0.n;
import w0.q;
import w0.r;

/* loaded from: classes.dex */
public class d implements l {

    /* renamed from: d, reason: collision with root package name */
    public static final r f16117d = new r() { // from class: f1.c
        @Override // w0.r
        public final l[] a() {
            l[] f7;
            f7 = d.f();
            return f7;
        }

        @Override // w0.r
        public /* synthetic */ l[] b(Uri uri, Map map) {
            return q.a(this, uri, map);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private n f16118a;

    /* renamed from: b, reason: collision with root package name */
    private i f16119b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16120c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l[] f() {
        return new l[]{new d()};
    }

    private static a0 g(a0 a0Var) {
        a0Var.O(0);
        return a0Var;
    }

    private boolean i(m mVar) {
        i hVar;
        f fVar = new f();
        if (fVar.a(mVar, true) && (fVar.f16127b & 2) == 2) {
            int min = Math.min(fVar.f16134i, 8);
            a0 a0Var = new a0(min);
            mVar.n(a0Var.d(), 0, min);
            if (b.p(g(a0Var))) {
                hVar = new b();
            } else if (j.r(g(a0Var))) {
                hVar = new j();
            } else if (h.p(g(a0Var))) {
                hVar = new h();
            }
            this.f16119b = hVar;
            return true;
        }
        return false;
    }

    @Override // w0.l
    public void a() {
    }

    @Override // w0.l
    public void b(long j7, long j8) {
        i iVar = this.f16119b;
        if (iVar != null) {
            iVar.m(j7, j8);
        }
    }

    @Override // w0.l
    public void d(n nVar) {
        this.f16118a = nVar;
    }

    @Override // w0.l
    public int e(m mVar, w0.a0 a0Var) {
        o2.a.h(this.f16118a);
        if (this.f16119b == null) {
            if (!i(mVar)) {
                throw n2.a("Failed to determine bitstream type", null);
            }
            mVar.h();
        }
        if (!this.f16120c) {
            e0 d7 = this.f16118a.d(0, 1);
            this.f16118a.j();
            this.f16119b.d(this.f16118a, d7);
            this.f16120c = true;
        }
        return this.f16119b.g(mVar, a0Var);
    }

    @Override // w0.l
    public boolean h(m mVar) {
        try {
            return i(mVar);
        } catch (n2 unused) {
            return false;
        }
    }
}
