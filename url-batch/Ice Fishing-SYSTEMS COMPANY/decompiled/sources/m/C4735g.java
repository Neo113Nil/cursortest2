package m;

import android.content.Context;
import android.view.View;
import com.icefishing.icefishingliveapp.C5284R;
import l.SubMenuC4672D;

/* renamed from: m.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4735g extends l.v {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f39417l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C4743k f39418m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4735g(C4743k c4743k, Context context, l.l lVar, View view) {
        super(C5284R.attr.actionOverflowMenuStyle, context, view, lVar, true);
        this.f39418m = c4743k;
        this.f39017f = 8388613;
        h8.d dVar = c4743k.f39442P;
        this.f39019h = dVar;
        l.t tVar = this.i;
        if (tVar != null) {
            tVar.g(dVar);
        }
    }

    @Override // l.v
    public final void c() {
        switch (this.f39417l) {
            case 0:
                C4743k c4743k = this.f39418m;
                c4743k.f39439M = null;
                c4743k.getClass();
                super.c();
                break;
            default:
                C4743k c4743k2 = this.f39418m;
                l.l lVar = c4743k2.f39445v;
                if (lVar != null) {
                    lVar.c(true);
                }
                c4743k2.f39438L = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4735g(C4743k c4743k, Context context, SubMenuC4672D subMenuC4672D, View view) {
        super(C5284R.attr.actionOverflowMenuStyle, context, view, subMenuC4672D, false);
        this.f39418m = c4743k;
        if ((subMenuC4672D.f38883T.f38987Q & 32) != 32) {
            View view2 = c4743k.f39429B;
            this.f39016e = view2 == null ? (View) c4743k.f39428A : view2;
        }
        h8.d dVar = c4743k.f39442P;
        this.f39019h = dVar;
        l.t tVar = this.i;
        if (tVar != null) {
            tVar.g(dVar);
        }
    }
}
