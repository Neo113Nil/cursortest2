package l;

import android.content.Context;
import android.view.View;
import com.snovikpovik.vuevnxsj.R;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f extends k.m {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4230l = 1;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f4231m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, Context context, k.i iVar2, View view) {
        super(context, iVar2, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f4231m = iVar;
        this.f4121f = 8388613;
        b1.b bVar = iVar.f4275y;
        this.f4123h = bVar;
        k.k kVar = this.i;
        if (kVar != null) {
            kVar.h(bVar);
        }
    }

    @Override // k.m
    public final void c() {
        switch (this.f4230l) {
            case 0:
                i iVar = this.f4231m;
                iVar.f4272v = null;
                iVar.getClass();
                super.c();
                break;
            default:
                i iVar2 = this.f4231m;
                k.i iVar3 = iVar2.f4257f;
                if (iVar3 != null) {
                    iVar3.c(true);
                }
                iVar2.f4271u = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, Context context, k.s sVar, View view) {
        super(context, sVar, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f4231m = iVar;
        if ((sVar.f4145w.f4111x & 32) != 32) {
            View view2 = iVar.f4261k;
            this.f4120e = view2 == null ? iVar.f4260j : view2;
        }
        b1.b bVar = iVar.f4275y;
        this.f4123h = bVar;
        k.k kVar = this.i;
        if (kVar != null) {
            kVar.h(bVar);
        }
    }
}
