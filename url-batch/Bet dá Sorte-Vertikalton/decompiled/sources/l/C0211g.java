package l;

import android.content.Context;
import android.view.View;
import com.glasspulse.glasspulse.R;
import k.AbstractC0165u;
import k.C0167w;
import k.MenuC0157m;
import k.SubMenuC0144E;

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0211g extends C0167w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2951l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0219k f2952m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0211g(C0219k c0219k, Context context, MenuC0157m menuC0157m, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC0157m, true);
        this.f2952m = c0219k;
        this.f2713f = 8388613;
        C.h hVar = c0219k.f2991w;
        this.h = hVar;
        AbstractC0165u abstractC0165u = this.i;
        if (abstractC0165u != null) {
            abstractC0165u.g(hVar);
        }
    }

    @Override // k.C0167w
    public final void c() {
        switch (this.f2951l) {
            case 0:
                C0219k c0219k = this.f2952m;
                c0219k.f2988t = null;
                c0219k.getClass();
                super.c();
                break;
            default:
                C0219k c0219k2 = this.f2952m;
                MenuC0157m menuC0157m = c0219k2.f2974c;
                if (menuC0157m != null) {
                    menuC0157m.c(true);
                }
                c0219k2.f2987s = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0211g(C0219k c0219k, Context context, SubMenuC0144E subMenuC0144E, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC0144E, false);
        this.f2952m = c0219k;
        if (!subMenuC0144E.f2588A.f()) {
            View view2 = c0219k.i;
            this.f2712e = view2 == null ? (View) c0219k.h : view2;
        }
        C.h hVar = c0219k.f2991w;
        this.h = hVar;
        AbstractC0165u abstractC0165u = this.i;
        if (abstractC0165u != null) {
            abstractC0165u.g(hVar);
        }
    }
}
