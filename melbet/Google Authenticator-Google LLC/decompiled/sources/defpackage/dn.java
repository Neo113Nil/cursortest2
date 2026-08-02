package defpackage;

import android.content.Context;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dn implements ct {
    final /* synthetic */ dy a;

    public dn(dy dyVar) {
        this.a = dyVar;
    }

    @Override // defpackage.ct
    public final Context a() {
        return this.a.s();
    }

    @Override // defpackage.ct
    public final void b(int i) {
        cs b = this.a.b();
        if (b != null) {
            b.g(i);
        }
    }

    @Override // defpackage.ct
    public final void c() {
        byo t = byo.t(a(), null, new int[]{R.attr.homeAsUpIndicator});
        t.j(0);
        t.n();
    }
}
