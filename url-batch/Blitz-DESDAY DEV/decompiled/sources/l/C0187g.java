package l;

import android.content.Context;
import android.view.View;
import com.winfour.neondrop.R;
import k.SubMenuC0162E;

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0187g extends k.w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2991l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0195k f2992m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0187g(C0195k c0195k, Context context, k.m mVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, mVar, true);
        this.f2992m = c0195k;
        this.f2830f = 8388613;
        E.g gVar = c0195k.f3032w;
        this.h = gVar;
        k.u uVar = this.i;
        if (uVar != null) {
            uVar.g(gVar);
        }
    }

    @Override // k.w
    public final void c() {
        switch (this.f2991l) {
            case 0:
                C0195k c0195k = this.f2992m;
                c0195k.f3029t = null;
                c0195k.getClass();
                super.c();
                break;
            default:
                C0195k c0195k2 = this.f2992m;
                k.m mVar = c0195k2.f3015c;
                if (mVar != null) {
                    mVar.c(true);
                }
                c0195k2.f3028s = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0187g(C0195k c0195k, Context context, SubMenuC0162E subMenuC0162E, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC0162E, false);
        this.f2992m = c0195k;
        if (!subMenuC0162E.f2705A.f()) {
            View view2 = c0195k.i;
            this.f2829e = view2 == null ? (View) c0195k.h : view2;
        }
        E.g gVar = c0195k.f3032w;
        this.h = gVar;
        k.u uVar = this.i;
        if (uVar != null) {
            uVar.g(gVar);
        }
    }
}
