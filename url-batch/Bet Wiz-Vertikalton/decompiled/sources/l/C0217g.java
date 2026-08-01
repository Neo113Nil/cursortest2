package l;

import android.content.Context;
import android.view.View;
import com.neonpulse.gridlogic.R;
import k.AbstractC0168u;
import k.C0170w;
import k.MenuC0160m;
import k.SubMenuC0147E;

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0217g extends C0170w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2972l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0225k f2973m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0217g(C0225k c0225k, Context context, MenuC0160m menuC0160m, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC0160m, true);
        this.f2973m = c0225k;
        this.f2726f = 8388613;
        C.g gVar = c0225k.f3012w;
        this.h = gVar;
        AbstractC0168u abstractC0168u = this.i;
        if (abstractC0168u != null) {
            abstractC0168u.g(gVar);
        }
    }

    @Override // k.C0170w
    public final void c() {
        switch (this.f2972l) {
            case 0:
                C0225k c0225k = this.f2973m;
                c0225k.f3009t = null;
                c0225k.getClass();
                super.c();
                break;
            default:
                C0225k c0225k2 = this.f2973m;
                MenuC0160m menuC0160m = c0225k2.f2995c;
                if (menuC0160m != null) {
                    menuC0160m.c(true);
                }
                c0225k2.f3008s = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0217g(C0225k c0225k, Context context, SubMenuC0147E subMenuC0147E, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC0147E, false);
        this.f2973m = c0225k;
        if (!subMenuC0147E.f2601A.f()) {
            View view2 = c0225k.i;
            this.f2725e = view2 == null ? (View) c0225k.h : view2;
        }
        C.g gVar = c0225k.f3012w;
        this.h = gVar;
        AbstractC0168u abstractC0168u = this.i;
        if (abstractC0168u != null) {
            abstractC0168u.g(gVar);
        }
    }
}
