package l;

import android.content.Context;
import android.view.View;
import com.fortuneink.neonpad.R;
import k.AbstractC0208u;
import k.C0210w;
import k.MenuC0200m;
import k.SubMenuC0187E;

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0260g extends C0210w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3365l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0268k f3366m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0260g(C0268k c0268k, Context context, MenuC0200m menuC0200m, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC0200m, true);
        this.f3366m = c0268k;
        this.f3126f = 8388613;
        B0.d dVar = c0268k.f3406w;
        this.h = dVar;
        AbstractC0208u abstractC0208u = this.i;
        if (abstractC0208u != null) {
            abstractC0208u.g(dVar);
        }
    }

    @Override // k.C0210w
    public final void c() {
        switch (this.f3365l) {
            case 0:
                C0268k c0268k = this.f3366m;
                c0268k.f3403t = null;
                c0268k.getClass();
                super.c();
                break;
            default:
                C0268k c0268k2 = this.f3366m;
                MenuC0200m menuC0200m = c0268k2.f3388c;
                if (menuC0200m != null) {
                    menuC0200m.c(true);
                }
                c0268k2.f3402s = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0260g(C0268k c0268k, Context context, SubMenuC0187E subMenuC0187E, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC0187E, false);
        this.f3366m = c0268k;
        if (!subMenuC0187E.f2992A.f()) {
            View view2 = c0268k.i;
            this.f3125e = view2 == null ? (View) c0268k.h : view2;
        }
        B0.d dVar = c0268k.f3406w;
        this.h = dVar;
        AbstractC0208u abstractC0208u = this.i;
        if (abstractC0208u != null) {
            abstractC0208u.g(dVar);
        }
    }
}
