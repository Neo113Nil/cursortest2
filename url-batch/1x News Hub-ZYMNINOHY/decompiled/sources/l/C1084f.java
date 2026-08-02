package l;

import android.content.Context;
import android.view.View;
import com.fc.barca.football.R;
import k.AbstractC1067l;
import k.C1069n;
import k.MenuC1065j;
import k.SubMenuC1075t;

/* renamed from: l.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1084f extends C1069n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9792l = 1;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1087i f9793m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1084f(C1087i c1087i, Context context, MenuC1065j menuC1065j, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC1065j, true);
        this.f9793m = c1087i;
        this.f = 8388613;
        b0.r rVar = c1087i.v;
        this.f9648h = rVar;
        AbstractC1067l abstractC1067l = this.f9649i;
        if (abstractC1067l != null) {
            abstractC1067l.h(rVar);
        }
    }

    @Override // k.C1069n
    public final void c() {
        switch (this.f9792l) {
            case 0:
                C1087i c1087i = this.f9793m;
                c1087i.f9833s = null;
                c1087i.getClass();
                super.c();
                break;
            default:
                C1087i c1087i2 = this.f9793m;
                MenuC1065j menuC1065j = c1087i2.f9819c;
                if (menuC1065j != null) {
                    menuC1065j.c(true);
                }
                c1087i2.f9832r = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1084f(C1087i c1087i, Context context, SubMenuC1075t subMenuC1075t, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC1075t, false);
        this.f9793m = c1087i;
        if ((subMenuC1075t.f9670x.f9638x & 32) != 32) {
            View view2 = c1087i.f9823h;
            this.f9646e = view2 == null ? c1087i.f9822g : view2;
        }
        b0.r rVar = c1087i.v;
        this.f9648h = rVar;
        AbstractC1067l abstractC1067l = this.f9649i;
        if (abstractC1067l != null) {
            abstractC1067l.h(rVar);
        }
    }
}
