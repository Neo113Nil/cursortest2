package l;

import android.content.Context;
import android.view.View;
import com.luckyarcade.spinthrow.R;
import k.AbstractC0210u;
import k.C0212w;
import k.MenuC0202m;
import k.SubMenuC0189E;

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262g extends C0212w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3366l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0270k f3367m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0262g(C0270k c0270k, Context context, MenuC0202m menuC0202m, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC0202m, true);
        this.f3367m = c0270k;
        this.f3130f = 8388613;
        B0.d dVar = c0270k.f3409w;
        this.h = dVar;
        AbstractC0210u abstractC0210u = this.i;
        if (abstractC0210u != null) {
            abstractC0210u.g(dVar);
        }
    }

    @Override // k.C0212w
    public final void c() {
        switch (this.f3366l) {
            case 0:
                C0270k c0270k = this.f3367m;
                c0270k.f3406t = null;
                c0270k.getClass();
                super.c();
                break;
            default:
                C0270k c0270k2 = this.f3367m;
                MenuC0202m menuC0202m = c0270k2.f3391c;
                if (menuC0202m != null) {
                    menuC0202m.c(true);
                }
                c0270k2.f3405s = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0262g(C0270k c0270k, Context context, SubMenuC0189E subMenuC0189E, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC0189E, false);
        this.f3367m = c0270k;
        if (!subMenuC0189E.f2996A.f()) {
            View view2 = c0270k.i;
            this.f3129e = view2 == null ? (View) c0270k.h : view2;
        }
        B0.d dVar = c0270k.f3409w;
        this.h = dVar;
        AbstractC0210u abstractC0210u = this.i;
        if (abstractC0210u != null) {
            abstractC0210u.g(dVar);
        }
    }
}
