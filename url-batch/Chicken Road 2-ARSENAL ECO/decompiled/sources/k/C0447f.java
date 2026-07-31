package k;

import android.content.Context;
import android.view.View;
import com.strategylink.Row.Five.R;

/* renamed from: k.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0447f extends j.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4989l = 1;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0450i f4990m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0447f(C0450i c0450i, Context context, j.j jVar, View view) {
        super(context, jVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f4990m = c0450i;
        this.f4849f = 8388613;
        a6.d dVar = c0450i.f5003A;
        this.f4851h = dVar;
        j.l lVar = this.f4852i;
        if (lVar != null) {
            lVar.j(dVar);
        }
    }

    @Override // j.n
    public final void c() {
        switch (this.f4989l) {
            case 0:
                C0450i c0450i = this.f4990m;
                c0450i.f5022x = null;
                c0450i.getClass();
                super.c();
                break;
            default:
                C0450i c0450i2 = this.f4990m;
                j.j jVar = c0450i2.f5006h;
                if (jVar != null) {
                    jVar.c(true);
                }
                c0450i2.f5021w = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0447f(C0450i c0450i, Context context, j.t tVar, View view) {
        super(context, tVar, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f4990m = c0450i;
        if ((tVar.f4874w.f4840x & 32) != 32) {
            View view2 = c0450i.f5011m;
            this.f4848e = view2 == null ? c0450i.f5010l : view2;
        }
        a6.d dVar = c0450i.f5003A;
        this.f4851h = dVar;
        j.l lVar = this.f4852i;
        if (lVar != null) {
            lVar.j(dVar);
        }
    }
}
