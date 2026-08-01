package n;

import android.content.Context;
import android.view.View;
import com.winpower.neonfit.R;
import m.AbstractC0237u;
import m.C0239w;
import m.MenuC0229m;
import m.SubMenuC0216E;

/* renamed from: n.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0274g extends C0239w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3615l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0282k f3616m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0274g(C0282k c0282k, Context context, MenuC0229m menuC0229m, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC0229m, true);
        this.f3616m = c0282k;
        this.f3414f = 8388613;
        C1.d dVar = c0282k.f3669w;
        this.f3416h = dVar;
        AbstractC0237u abstractC0237u = this.i;
        if (abstractC0237u != null) {
            abstractC0237u.i(dVar);
        }
    }

    @Override // m.C0239w
    public final void c() {
        switch (this.f3615l) {
            case 0:
                C0282k c0282k = this.f3616m;
                c0282k.f3666t = null;
                c0282k.getClass();
                super.c();
                break;
            default:
                C0282k c0282k2 = this.f3616m;
                MenuC0229m menuC0229m = c0282k2.f3652c;
                if (menuC0229m != null) {
                    menuC0229m.c(true);
                }
                c0282k2.f3665s = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0274g(C0282k c0282k, Context context, SubMenuC0216E subMenuC0216E, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC0216E, false);
        this.f3616m = c0282k;
        if (!subMenuC0216E.f3288A.f()) {
            View view2 = c0282k.i;
            this.e = view2 == null ? (View) c0282k.f3656h : view2;
        }
        C1.d dVar = c0282k.f3669w;
        this.f3416h = dVar;
        AbstractC0237u abstractC0237u = this.i;
        if (abstractC0237u != null) {
            abstractC0237u.i(dVar);
        }
    }
}
