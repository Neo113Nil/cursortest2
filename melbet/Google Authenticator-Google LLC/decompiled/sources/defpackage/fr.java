package defpackage;

import android.support.v7.view.menu.ActionMenuItemView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fr extends jt {
    final /* synthetic */ ActionMenuItemView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.a = actionMenuItemView;
    }

    @Override // defpackage.jt
    public final gt a() {
        hf hfVar;
        kee keeVar = this.a.c;
        if (keeVar == null || (hfVar = ((hk) keeVar.a).k) == null) {
            return null;
        }
        return hfVar.a();
    }

    @Override // defpackage.jt
    public final boolean b() {
        gt a;
        ActionMenuItemView actionMenuItemView = this.a;
        gc gcVar = actionMenuItemView.b;
        return gcVar != null && gcVar.b(actionMenuItemView.a) && (a = a()) != null && a.x();
    }
}
