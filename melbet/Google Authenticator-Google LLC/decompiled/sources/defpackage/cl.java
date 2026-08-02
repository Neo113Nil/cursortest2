package defpackage;

import android.view.View;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cl extends cm {
    private final gam j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cl(int i, int i2, gam gamVar) {
        super(i, i2, (bd) r0);
        Object obj = gamVar.e;
        obj.getClass();
        this.j = gamVar;
    }

    @Override // defpackage.cm
    public final void a() {
        super.a();
        this.a.u = false;
        this.j.l();
    }

    @Override // defpackage.cm
    public final void b() {
        if (this.e) {
            return;
        }
        super.b();
        int i = this.i;
        if (i != 2) {
            if (i == 3) {
                Object obj = this.j.e;
                obj.getClass();
                View J = ((bd) obj).J();
                if (by.U(2)) {
                    Objects.toString(J.findFocus());
                    Objects.toString(J);
                    Objects.toString(obj);
                }
                J.clearFocus();
                return;
            }
            return;
        }
        gam gamVar = this.j;
        Object obj2 = gamVar.e;
        obj2.getClass();
        bd bdVar = (bd) obj2;
        View findFocus = bdVar.R.findFocus();
        if (findFocus != null) {
            bdVar.ai(findFocus);
            if (by.U(2)) {
                Objects.toString(findFocus);
                Objects.toString(obj2);
            }
        }
        View J2 = this.a.J();
        if (J2.getParent() == null) {
            if (by.U(2)) {
                Objects.toString(obj2);
                Objects.toString(J2);
            }
            gamVar.i();
            J2.setAlpha(0.0f);
        }
        if (J2.getAlpha() == 0.0f && J2.getVisibility() == 0) {
            if (by.U(2)) {
                Objects.toString(J2);
            }
            J2.setVisibility(4);
        }
        J2.setAlpha(bdVar.s());
        if (by.U(2)) {
            bdVar.s();
        }
    }
}
