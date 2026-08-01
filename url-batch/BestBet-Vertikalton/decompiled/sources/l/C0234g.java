package l;

import android.content.Context;
import android.view.View;
import com.fortunequest.neontrack.R;
import k.AbstractC0198v;
import k.C0191o;
import k.C0200x;
import k.MenuC0189m;
import k.SubMenuC0176F;

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0234g extends C0200x {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3387l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0242k f3388m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0234g(C0242k c0242k, Context context, MenuC0189m menuC0189m, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC0189m, true);
        this.f3388m = c0242k;
        this.f3229f = 8388613;
        C0191o c0191o = c0242k.f3427w;
        this.h = c0191o;
        AbstractC0198v abstractC0198v = this.i;
        if (abstractC0198v != null) {
            abstractC0198v.g(c0191o);
        }
    }

    @Override // k.C0200x
    public final void c() {
        switch (this.f3387l) {
            case 0:
                C0242k c0242k = this.f3388m;
                c0242k.f3424t = null;
                c0242k.getClass();
                super.c();
                break;
            default:
                C0242k c0242k2 = this.f3388m;
                MenuC0189m menuC0189m = c0242k2.f3410c;
                if (menuC0189m != null) {
                    menuC0189m.c(true);
                }
                c0242k2.f3423s = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0234g(C0242k c0242k, Context context, SubMenuC0176F subMenuC0176F, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC0176F, false);
        this.f3388m = c0242k;
        if (!subMenuC0176F.f3103A.f()) {
            View view2 = c0242k.i;
            this.f3228e = view2 == null ? (View) c0242k.h : view2;
        }
        C0191o c0191o = c0242k.f3427w;
        this.h = c0191o;
        AbstractC0198v abstractC0198v = this.i;
        if (abstractC0198v != null) {
            abstractC0198v.g(c0191o);
        }
    }
}
