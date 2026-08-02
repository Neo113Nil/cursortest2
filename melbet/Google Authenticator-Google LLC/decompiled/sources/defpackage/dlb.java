package defpackage;

import android.view.View;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dlb {
    public final cka a;

    public dlb(cka ckaVar) {
        this.a = ckaVar;
    }

    public final void a(View view, bqd bqdVar) {
        dks b = dla.b(view);
        if (b == null) {
            b(view, bqdVar);
            return;
        }
        long j = b.a().h;
        jkl jklVar = (jkl) bqdVar.b;
        if (j != ((dkx) jklVar.b).h) {
            throw new IllegalArgumentException("Disallowed Difference in CVE");
        }
        if (b.a().g != ((dkx) jklVar.b).g) {
            cka ckaVar = b.d;
            new dlc(ckaVar.f()).b(b);
            boolean z = b.b.c;
            if (z) {
                ckaVar.e(b);
            }
            jkl jklVar2 = b.c;
            if (jklVar2.a.M()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            jklVar2.b = jklVar2.p();
            if (z) {
                ckaVar.d(b);
            }
            b.b(bqdVar.d(this.a));
        }
    }

    public final void b(View view, bqd bqdVar) {
        fao.c();
        dks d = bqdVar.d(this.a);
        dks b = dla.b(view);
        if (b != null) {
            if (!b.c()) {
                b.b(d);
                return;
            } else if (b.d()) {
                dih.e(new IllegalStateException("CVE is already impressed and cannot be replaced."));
                return;
            } else {
                dih.e(new IllegalStateException("CVE is already attached and cannot be replaced."));
                return;
            }
        }
        dla dlaVar = new dla(view, d);
        d.b = dlaVar;
        View view2 = dlaVar.a;
        view2.setTag(R.id.ve_tag, dlaVar.b);
        if (dlaVar.h.f()) {
            view2.addOnAttachStateChangeListener(dlaVar);
            int i = yq.a;
            if (view2.isAttachedToWindow()) {
                dlaVar.onViewAttachedToWindow(view2);
            }
        }
    }
}
