package com.fortuneink.neonpad;

import K0.ViewOnClickListenerC0030a;
import android.os.Bundle;
import com.fortuneink.neonpad.databinding.ActivityRulesBinding;
import g.AbstractActivityC0158k;

/* loaded from: classes.dex */
public final class RulesActivity extends AbstractActivityC0158k {
    private final N0.b binding$delegate = new N0.d(new f(this, 1));

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActivityRulesBinding binding_delegate$lambda$0(RulesActivity rulesActivity) {
        return ActivityRulesBinding.inflate(rulesActivity.getLayoutInflater());
    }

    private final ActivityRulesBinding getBinding() {
        return (ActivityRulesBinding) ((N0.d) this.binding$delegate).a();
    }

    @Override // androidx.fragment.app.AbstractActivityC0064v, a.p, z.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(getBinding().getRoot());
        getBinding().backButton.setOnClickListener(new ViewOnClickListenerC0030a(3, this));
    }
}
