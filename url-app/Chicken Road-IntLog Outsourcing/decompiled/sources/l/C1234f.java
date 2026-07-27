package l;

import android.content.Context;
import android.view.View;
import com.chickyneer.roadway.R;

/* renamed from: l.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1234f extends k.m {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f10856l = 1;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1237i f10857m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1234f(C1237i c1237i, Context context, k.i iVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, iVar, true);
        this.f10857m = c1237i;
        this.f10640f = 8388613;
        U.e eVar = c1237i.f10889v;
        this.f10642h = eVar;
        k.k kVar = this.f10643i;
        if (kVar != null) {
            kVar.h(eVar);
        }
    }

    @Override // k.m
    public final void c() {
        switch (this.f10856l) {
            case 0:
                C1237i c1237i = this.f10857m;
                c1237i.f10886s = null;
                c1237i.getClass();
                super.c();
                break;
            default:
                C1237i c1237i2 = this.f10857m;
                k.i iVar = c1237i2.f10870c;
                if (iVar != null) {
                    iVar.c(true);
                }
                c1237i2.f10885r = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1234f(C1237i c1237i, Context context, k.s sVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, sVar, false);
        this.f10857m = c1237i;
        if (!sVar.f10666w.d()) {
            View view2 = c1237i.f10875h;
            this.f10639e = view2 == null ? c1237i.f10874g : view2;
        }
        U.e eVar = c1237i.f10889v;
        this.f10642h = eVar;
        k.k kVar = this.f10643i;
        if (kVar != null) {
            kVar.h(eVar);
        }
    }
}
