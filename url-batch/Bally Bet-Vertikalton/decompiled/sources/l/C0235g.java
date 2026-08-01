package l;

import android.content.Context;
import android.view.View;
import com.skydrop.fallring.R;
import k.AbstractC0166u;
import k.C0168w;
import k.MenuC0158m;
import k.SubMenuC0145E;

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0235g extends C0168w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2970l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0243k f2971m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0235g(C0243k c0243k, Context context, MenuC0158m menuC0158m, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC0158m, true);
        this.f2971m = c0243k;
        this.f2734f = 8388613;
        B0.d dVar = c0243k.f3010w;
        this.h = dVar;
        AbstractC0166u abstractC0166u = this.i;
        if (abstractC0166u != null) {
            abstractC0166u.g(dVar);
        }
    }

    @Override // k.C0168w
    public final void c() {
        switch (this.f2970l) {
            case 0:
                C0243k c0243k = this.f2971m;
                c0243k.f3007t = null;
                c0243k.getClass();
                super.c();
                break;
            default:
                C0243k c0243k2 = this.f2971m;
                MenuC0158m menuC0158m = c0243k2.f2993c;
                if (menuC0158m != null) {
                    menuC0158m.c(true);
                }
                c0243k2.f3006s = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0235g(C0243k c0243k, Context context, SubMenuC0145E subMenuC0145E, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC0145E, false);
        this.f2971m = c0243k;
        if (!subMenuC0145E.f2609A.f()) {
            View view2 = c0243k.i;
            this.f2733e = view2 == null ? (View) c0243k.h : view2;
        }
        B0.d dVar = c0243k.f3010w;
        this.h = dVar;
        AbstractC0166u abstractC0166u = this.i;
        if (abstractC0166u != null) {
            abstractC0166u.g(dVar);
        }
    }
}
