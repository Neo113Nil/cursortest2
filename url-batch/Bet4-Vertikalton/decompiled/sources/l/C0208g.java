package l;

import android.content.Context;
import android.view.View;
import com.playbag.tripgear.R;
import k.AbstractC0172u;
import k.C0174w;
import k.MenuC0164m;
import k.SubMenuC0151E;

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0208g extends C0174w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2911l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0216k f2912m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0208g(C0216k c0216k, Context context, MenuC0164m menuC0164m, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC0164m, true);
        this.f2912m = c0216k;
        this.f2750f = 8388613;
        C.g gVar = c0216k.f2951w;
        this.h = gVar;
        AbstractC0172u abstractC0172u = this.i;
        if (abstractC0172u != null) {
            abstractC0172u.g(gVar);
        }
    }

    @Override // k.C0174w
    public final void c() {
        switch (this.f2911l) {
            case 0:
                C0216k c0216k = this.f2912m;
                c0216k.f2948t = null;
                c0216k.getClass();
                super.c();
                break;
            default:
                C0216k c0216k2 = this.f2912m;
                MenuC0164m menuC0164m = c0216k2.f2934c;
                if (menuC0164m != null) {
                    menuC0164m.c(true);
                }
                c0216k2.f2947s = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0208g(C0216k c0216k, Context context, SubMenuC0151E subMenuC0151E, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC0151E, false);
        this.f2912m = c0216k;
        if (!subMenuC0151E.f2625A.f()) {
            View view2 = c0216k.i;
            this.f2749e = view2 == null ? (View) c0216k.h : view2;
        }
        C.g gVar = c0216k.f2951w;
        this.h = gVar;
        AbstractC0172u abstractC0172u = this.i;
        if (abstractC0172u != null) {
            abstractC0172u.g(gVar);
        }
    }
}
