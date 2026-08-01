package m;

import android.content.Context;
import android.view.View;
import com.winfour.winrandom.R;
import l.AbstractC0177u;
import l.C0179w;
import l.MenuC0169m;
import l.SubMenuC0156E;

/* renamed from: m.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0213g extends C0179w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3088l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0221k f3089m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0213g(C0221k c0221k, Context context, MenuC0169m menuC0169m, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC0169m, true);
        this.f3089m = c0221k;
        this.f2882f = 8388613;
        D.g gVar = c0221k.f3143w;
        this.f2884h = gVar;
        AbstractC0177u abstractC0177u = this.i;
        if (abstractC0177u != null) {
            abstractC0177u.g(gVar);
        }
    }

    @Override // l.C0179w
    public final void c() {
        switch (this.f3088l) {
            case 0:
                C0221k c0221k = this.f3089m;
                c0221k.f3140t = null;
                c0221k.getClass();
                super.c();
                break;
            default:
                C0221k c0221k2 = this.f3089m;
                MenuC0169m menuC0169m = c0221k2.f3125c;
                if (menuC0169m != null) {
                    menuC0169m.c(true);
                }
                c0221k2.f3139s = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0213g(C0221k c0221k, Context context, SubMenuC0156E subMenuC0156E, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC0156E, false);
        this.f3089m = c0221k;
        if (!subMenuC0156E.f2753A.f()) {
            View view2 = c0221k.i;
            this.f2881e = view2 == null ? (View) c0221k.f3129h : view2;
        }
        D.g gVar = c0221k.f3143w;
        this.f2884h = gVar;
        AbstractC0177u abstractC0177u = this.i;
        if (abstractC0177u != null) {
            abstractC0177u.g(gVar);
        }
    }
}
