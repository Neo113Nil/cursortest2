package com.luckyarcade.spinthrow;

import com.luckyarcade.spinthrow.databinding.ActivityGameplayBinding;
import com.luckyarcade.spinthrow.databinding.ActivityRulesBinding;
import g.AbstractActivityC0159k;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements W0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2068a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0159k f2069b;

    public /* synthetic */ b(AbstractActivityC0159k abstractActivityC0159k, int i) {
        this.f2068a = i;
        this.f2069b = abstractActivityC0159k;
    }

    @Override // W0.a
    public final Object a() {
        ActivityGameplayBinding binding_delegate$lambda$0;
        ActivityRulesBinding binding_delegate$lambda$02;
        switch (this.f2068a) {
            case 0:
                binding_delegate$lambda$0 = GameplayActivity.binding_delegate$lambda$0((GameplayActivity) this.f2069b);
                return binding_delegate$lambda$0;
            default:
                binding_delegate$lambda$02 = RulesActivity.binding_delegate$lambda$0((RulesActivity) this.f2069b);
                return binding_delegate$lambda$02;
        }
    }
}
