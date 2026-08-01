package com.fortuneink.neonpad;

import com.fortuneink.neonpad.databinding.ActivityHomeBinding;
import com.fortuneink.neonpad.databinding.ActivityRulesBinding;
import g.AbstractActivityC0158k;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements W0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0158k f1719b;

    public /* synthetic */ f(AbstractActivityC0158k abstractActivityC0158k, int i) {
        this.f1718a = i;
        this.f1719b = abstractActivityC0158k;
    }

    @Override // W0.a
    public final Object a() {
        ActivityHomeBinding binding_delegate$lambda$0;
        ActivityRulesBinding binding_delegate$lambda$02;
        switch (this.f1718a) {
            case 0:
                binding_delegate$lambda$0 = HomeActivity.binding_delegate$lambda$0((HomeActivity) this.f1719b);
                return binding_delegate$lambda$0;
            default:
                binding_delegate$lambda$02 = RulesActivity.binding_delegate$lambda$0((RulesActivity) this.f1719b);
                return binding_delegate$lambda$02;
        }
    }
}
