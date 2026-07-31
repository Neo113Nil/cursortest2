package i;

import android.content.Context;
import android.view.View;
import com.crane.slab.beam.R;
import h.MenuC0143j;

/* renamed from: i.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0159f extends h.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2200l = 1;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0162i f2201m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0159f(C0162i c0162i, Context context, MenuC0143j menuC0143j, View view) {
        super(context, menuC0143j, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f2201m = c0162i;
        this.f2062f = 8388613;
        B0.E e2 = c0162i.f2247z;
        this.f2064h = e2;
        h.l lVar = this.f2065i;
        if (lVar != null) {
            lVar.b(e2);
        }
    }

    @Override // h.n
    public final void c() {
        switch (this.f2200l) {
            case 0:
                C0162i c0162i = this.f2201m;
                c0162i.f2244w = null;
                c0162i.getClass();
                super.c();
                break;
            default:
                C0162i c0162i2 = this.f2201m;
                MenuC0143j menuC0143j = c0162i2.f2229g;
                if (menuC0143j != null) {
                    menuC0143j.c(true);
                }
                c0162i2.f2243v = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0159f(C0162i c0162i, Context context, h.t tVar, View view) {
        super(context, tVar, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f2201m = c0162i;
        if ((tVar.f2087w.f2052x & 32) != 32) {
            View view2 = c0162i.f2234l;
            this.f2061e = view2 == null ? c0162i.f2233k : view2;
        }
        B0.E e2 = c0162i.f2247z;
        this.f2064h = e2;
        h.l lVar = this.f2065i;
        if (lVar != null) {
            lVar.b(e2);
        }
    }
}
