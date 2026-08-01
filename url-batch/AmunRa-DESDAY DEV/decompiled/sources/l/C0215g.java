package l;

import android.content.Context;
import android.view.View;
import com.visualfortune.eyerest.R;
import k.AbstractC0166u;
import k.C0168w;
import k.MenuC0158m;
import k.SubMenuC0145E;

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0215g extends C0168w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3065l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0223k f3066m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0215g(C0223k c0223k, Context context, MenuC0158m menuC0158m, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC0158m, true);
        this.f3066m = c0223k;
        this.f2667f = 8388613;
        C.g gVar = c0223k.f3105w;
        this.h = gVar;
        AbstractC0166u abstractC0166u = this.i;
        if (abstractC0166u != null) {
            abstractC0166u.g(gVar);
        }
    }

    @Override // k.C0168w
    public final void c() {
        switch (this.f3065l) {
            case 0:
                C0223k c0223k = this.f3066m;
                c0223k.f3102t = null;
                c0223k.getClass();
                super.c();
                break;
            default:
                C0223k c0223k2 = this.f3066m;
                MenuC0158m menuC0158m = c0223k2.f3088c;
                if (menuC0158m != null) {
                    menuC0158m.c(true);
                }
                c0223k2.f3101s = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0215g(C0223k c0223k, Context context, SubMenuC0145E subMenuC0145E, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC0145E, false);
        this.f3066m = c0223k;
        if (!subMenuC0145E.f2542A.f()) {
            View view2 = c0223k.i;
            this.f2666e = view2 == null ? (View) c0223k.h : view2;
        }
        C.g gVar = c0223k.f3105w;
        this.h = gVar;
        AbstractC0166u abstractC0166u = this.i;
        if (abstractC0166u != null) {
            abstractC0166u.g(gVar);
        }
    }
}
