package u;

import R1.y;
import a0.C0239d;
import android.graphics.Rect;
import android.view.View;
import e2.InterfaceC0422a;
import t0.AbstractC0993f;
import t0.InterfaceC0999l;
import t0.b0;

/* renamed from: u.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1083j implements InterfaceC1074a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0999l f9114d;

    public C1083j(InterfaceC0999l interfaceC0999l) {
        this.f9114d = interfaceC0999l;
    }

    @Override // u.InterfaceC1074a
    public final Object P(b0 b0Var, InterfaceC0422a interfaceC0422a, X1.c cVar) {
        View v3 = AbstractC0993f.v(this.f9114d);
        long N3 = b0Var.N(0L);
        C0239d c0239d = (C0239d) interfaceC0422a.b();
        C0239d h3 = c0239d != null ? c0239d.h(N3) : null;
        if (h3 != null) {
            v3.requestRectangleOnScreen(new Rect((int) h3.f4724a, (int) h3.f4725b, (int) h3.f4726c, (int) h3.f4727d), false);
        }
        return y.f4171a;
    }
}
