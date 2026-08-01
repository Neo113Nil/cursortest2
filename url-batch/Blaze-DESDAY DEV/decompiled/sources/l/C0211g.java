package l;

import android.content.Context;
import android.view.View;
import com.winworm.neongrid.R;
import k.AbstractC0174u;
import k.C0176w;
import k.MenuC0166m;
import k.SubMenuC0153E;

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0211g extends C0176w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2936l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0219k f2937m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0211g(C0219k c0219k, Context context, MenuC0166m menuC0166m, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC0166m, true);
        this.f2937m = c0219k;
        this.f2778f = 8388613;
        C.g gVar = c0219k.f2976w;
        this.h = gVar;
        AbstractC0174u abstractC0174u = this.i;
        if (abstractC0174u != null) {
            abstractC0174u.g(gVar);
        }
    }

    @Override // k.C0176w
    public final void c() {
        switch (this.f2936l) {
            case 0:
                C0219k c0219k = this.f2937m;
                c0219k.f2973t = null;
                c0219k.getClass();
                super.c();
                break;
            default:
                C0219k c0219k2 = this.f2937m;
                MenuC0166m menuC0166m = c0219k2.f2959c;
                if (menuC0166m != null) {
                    menuC0166m.c(true);
                }
                c0219k2.f2972s = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0211g(C0219k c0219k, Context context, SubMenuC0153E subMenuC0153E, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC0153E, false);
        this.f2937m = c0219k;
        if (!subMenuC0153E.f2653A.f()) {
            View view2 = c0219k.i;
            this.f2777e = view2 == null ? (View) c0219k.h : view2;
        }
        C.g gVar = c0219k.f2976w;
        this.h = gVar;
        AbstractC0174u abstractC0174u = this.i;
        if (abstractC0174u != null) {
            abstractC0174u.g(gVar);
        }
    }
}
