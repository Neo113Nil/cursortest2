package l;

import android.content.Context;
import android.view.View;
import com.lasercut.dash.R;
import k.AbstractC0165u;
import k.C0167w;
import k.MenuC0157m;
import k.SubMenuC0144E;

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0234g extends C0167w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2986l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0244l f2987m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0234g(C0244l c0244l, Context context, MenuC0157m menuC0157m, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC0157m, true);
        this.f2987m = c0244l;
        this.f2750f = 8388613;
        C0242k c0242k = c0244l.f3027w;
        this.h = c0242k;
        AbstractC0165u abstractC0165u = this.i;
        if (abstractC0165u != null) {
            abstractC0165u.g(c0242k);
        }
    }

    @Override // k.C0167w
    public final void c() {
        switch (this.f2986l) {
            case 0:
                C0244l c0244l = this.f2987m;
                c0244l.f3024t = null;
                c0244l.getClass();
                super.c();
                break;
            default:
                C0244l c0244l2 = this.f2987m;
                MenuC0157m menuC0157m = c0244l2.f3010c;
                if (menuC0157m != null) {
                    menuC0157m.c(true);
                }
                c0244l2.f3023s = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0234g(C0244l c0244l, Context context, SubMenuC0144E subMenuC0144E, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC0144E, false);
        this.f2987m = c0244l;
        if (!subMenuC0144E.f2625A.f()) {
            View view2 = c0244l.i;
            this.f2749e = view2 == null ? (View) c0244l.h : view2;
        }
        C0242k c0242k = c0244l.f3027w;
        this.h = c0242k;
        AbstractC0165u abstractC0165u = this.i;
        if (abstractC0165u != null) {
            abstractC0165u.g(c0242k);
        }
    }
}
