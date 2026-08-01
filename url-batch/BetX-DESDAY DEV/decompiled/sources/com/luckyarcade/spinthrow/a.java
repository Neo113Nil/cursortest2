package com.luckyarcade.spinthrow;

import android.view.View;
import g.AbstractActivityC0159k;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2066a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0159k f2067b;

    public /* synthetic */ a(AbstractActivityC0159k abstractActivityC0159k, int i) {
        this.f2066a = i;
        this.f2067b = abstractActivityC0159k;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2066a) {
            case 0:
                GameplayActivity.onCreate$lambda$2((GameplayActivity) this.f2067b, view);
                break;
            default:
                ((RulesActivity) this.f2067b).finish();
                break;
        }
    }
}
