package defpackage;

import android.view.View;
import com.google.android.material.internal.CheckableImageButton;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class cv implements hb, q40 {
    public final /* synthetic */ Object f;

    public /* synthetic */ cv(Object obj) {
        this.f = obj;
    }

    @Override // defpackage.hb
    public void a() {
        CheckableImageButton checkableImageButton = ((df0) this.f).i;
        gk0.T(checkableImageButton, checkableImageButton.getContentDescription());
    }

    @Override // defpackage.q40
    public dp0 i(View view, dp0 dp0Var) {
        zg0 zg0Var = (zg0) this.f;
        ArrayList arrayList = zg0Var.b;
        ap0 ap0Var = dp0Var.a;
        fv b = fv.b(ap0Var.h(519), ap0Var.h(64));
        fv b2 = fv.b(ap0Var.i(519), ap0Var.i(64));
        if (!b.equals(zg0Var.c) || !b2.equals(zg0Var.d)) {
            zg0Var.c = b;
            zg0Var.d = b2;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                s60 s60Var = (s60) arrayList.get(size);
                s60Var.c = b;
                s60Var.d = b2;
                s60Var.c();
            }
        }
        return dp0Var;
    }
}
