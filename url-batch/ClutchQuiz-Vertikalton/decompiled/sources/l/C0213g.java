package l;

import android.content.Context;
import android.view.View;
import com.clutchquizarena.app.R;
import k.AbstractC0175u;
import k.C0177w;
import k.MenuC0167m;
import k.SubMenuC0154E;

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0213g extends C0177w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2966l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0221k f2967m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0213g(C0221k c0221k, Context context, MenuC0167m menuC0167m, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC0167m, true);
        this.f2967m = c0221k;
        this.f2811f = 8388613;
        A0.h hVar = c0221k.f3006w;
        this.h = hVar;
        AbstractC0175u abstractC0175u = this.i;
        if (abstractC0175u != null) {
            abstractC0175u.g(hVar);
        }
    }

    @Override // k.C0177w
    public final void c() {
        switch (this.f2966l) {
            case 0:
                C0221k c0221k = this.f2967m;
                c0221k.f3003t = null;
                c0221k.getClass();
                super.c();
                break;
            default:
                C0221k c0221k2 = this.f2967m;
                MenuC0167m menuC0167m = c0221k2.f2989c;
                if (menuC0167m != null) {
                    menuC0167m.c(true);
                }
                c0221k2.f3002s = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0213g(C0221k c0221k, Context context, SubMenuC0154E subMenuC0154E, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC0154E, false);
        this.f2967m = c0221k;
        if (!subMenuC0154E.f2686A.f()) {
            View view2 = c0221k.i;
            this.f2810e = view2 == null ? (View) c0221k.h : view2;
        }
        A0.h hVar = c0221k.f3006w;
        this.h = hVar;
        AbstractC0175u abstractC0175u = this.i;
        if (abstractC0175u != null) {
            abstractC0175u.g(hVar);
        }
    }
}
