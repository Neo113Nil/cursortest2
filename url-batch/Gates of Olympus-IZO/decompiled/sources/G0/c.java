package G0;

import A2.l;
import B0.B;
import B0.C0007d;
import L1.h;
import android.graphics.Matrix;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import b0.AbstractC0259J;
import java.util.ArrayList;
import u0.C0997t;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final View f1531a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1532b;

    public c(View view) {
        this.f1531a = view;
        I2.d.E(h.f2706e, new l(6, this));
    }

    public c(View view, C0997t c0997t) {
        new c(view);
        Choreographer.getInstance();
        this.f1531a = view;
        new d(new C0007d("", null, null, null), B.f231b, null);
        int i3 = b.f1524g;
        new ArrayList();
        I2.d.E(h.f2706e, new l(7, this));
        new CursorAnchorInfo.Builder();
        AbstractC0259J.l();
        new Matrix();
    }
}
