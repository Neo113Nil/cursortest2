package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fge extends yy {
    private final View b;
    private int c;
    private int d;
    private final int[] e = new int[2];

    public fge(View view) {
        this.b = view;
    }

    @Override // defpackage.yy
    public final void a(zz zzVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((brn) it.next()).J() & 8) != 0) {
                this.b.setTranslationY(fes.b(this.d, 0, r3.I()));
                return;
            }
        }
    }

    @Override // defpackage.yy
    public final void b(brn brnVar) {
        this.b.setTranslationY(0.0f);
    }

    @Override // defpackage.yy
    public final void c(brn brnVar) {
        View view = this.b;
        int[] iArr = this.e;
        view.getLocationOnScreen(iArr);
        this.c = iArr[1];
    }

    @Override // defpackage.yy
    public final void d(brn brnVar, yx yxVar) {
        View view = this.b;
        int[] iArr = this.e;
        view.getLocationOnScreen(iArr);
        int i = this.c - iArr[1];
        this.d = i;
        view.setTranslationY(i);
    }
}
