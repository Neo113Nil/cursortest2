package l;

import android.content.Context;
import android.view.View;
import com.playgen.securelock.R;
import k.AbstractC0169u;
import k.C0171w;
import k.MenuC0161m;
import k.SubMenuC0148E;

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0218g extends C0171w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2918l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0226k f2919m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0218g(C0226k c0226k, Context context, MenuC0161m menuC0161m, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC0161m, true);
        this.f2919m = c0226k;
        this.f2677f = 8388613;
        C.g gVar = c0226k.f2959w;
        this.h = gVar;
        AbstractC0169u abstractC0169u = this.i;
        if (abstractC0169u != null) {
            abstractC0169u.g(gVar);
        }
    }

    @Override // k.C0171w
    public final void c() {
        switch (this.f2918l) {
            case 0:
                C0226k c0226k = this.f2919m;
                c0226k.f2956t = null;
                c0226k.getClass();
                super.c();
                break;
            default:
                C0226k c0226k2 = this.f2919m;
                MenuC0161m menuC0161m = c0226k2.f2942c;
                if (menuC0161m != null) {
                    menuC0161m.c(true);
                }
                c0226k2.f2955s = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0218g(C0226k c0226k, Context context, SubMenuC0148E subMenuC0148E, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC0148E, false);
        this.f2919m = c0226k;
        if (!subMenuC0148E.f2552A.f()) {
            View view2 = c0226k.i;
            this.f2676e = view2 == null ? (View) c0226k.h : view2;
        }
        C.g gVar = c0226k.f2959w;
        this.h = gVar;
        AbstractC0169u abstractC0169u = this.i;
        if (abstractC0169u != null) {
            abstractC0169u.g(gVar);
        }
    }
}
