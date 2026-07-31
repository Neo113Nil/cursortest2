package q3;

import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.Map;
import java.util.Set;
import p3.a;
import r3.c;

/* loaded from: classes.dex */
final class c0 implements c.InterfaceC0129c, n0 {

    /* renamed from: a, reason: collision with root package name */
    private final a.f f20233a;

    /* renamed from: b, reason: collision with root package name */
    private final b<?> f20234b;

    /* renamed from: c, reason: collision with root package name */
    private r3.i f20235c = null;

    /* renamed from: d, reason: collision with root package name */
    private Set<Scope> f20236d = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f20237e = false;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ e f20238f;

    public c0(e eVar, a.f fVar, b<?> bVar) {
        this.f20238f = eVar;
        this.f20233a = fVar;
        this.f20234b = bVar;
    }

    static /* synthetic */ boolean e(c0 c0Var, boolean z6) {
        c0Var.f20237e = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        r3.i iVar;
        if (!this.f20237e || (iVar = this.f20235c) == null) {
            return;
        }
        this.f20233a.e(iVar, this.f20236d);
    }

    @Override // q3.n0
    public final void a(o3.b bVar) {
        Map map;
        map = this.f20238f.f20255q;
        z zVar = (z) map.get(this.f20234b);
        if (zVar != null) {
            zVar.o(bVar);
        }
    }

    @Override // q3.n0
    public final void b(r3.i iVar, Set<Scope> set) {
        if (iVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            a(new o3.b(4));
        } else {
            this.f20235c = iVar;
            this.f20236d = set;
            h();
        }
    }

    @Override // r3.c.InterfaceC0129c
    public final void c(o3.b bVar) {
        this.f20238f.f20259u.post(new b0(this, bVar));
    }
}
