package com.fortuneink.neonpad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.fortuneink.neonpad.databinding.ActivityHomeBinding;
import g.AbstractActivityC0158k;

/* loaded from: classes.dex */
public final class HomeActivity extends AbstractActivityC0158k {
    private final N0.b binding$delegate = new N0.d(new f(this, 0));

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActivityHomeBinding binding_delegate$lambda$0(HomeActivity homeActivity) {
        return ActivityHomeBinding.inflate(homeActivity.getLayoutInflater());
    }

    private final ActivityHomeBinding getBinding() {
        return (ActivityHomeBinding) ((N0.d) this.binding$delegate).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(HomeActivity homeActivity, View view) {
        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) DrawingActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(HomeActivity homeActivity, View view) {
        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) RulesActivity.class));
    }

    @Override // androidx.fragment.app.AbstractActivityC0064v, a.p, z.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(getBinding().getRoot());
        final int i = 0;
        getBinding().startButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.fortuneink.neonpad.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f1717b;

            {
                this.f1717b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        HomeActivity.onCreate$lambda$1(this.f1717b, view);
                        break;
                    default:
                        HomeActivity.onCreate$lambda$2(this.f1717b, view);
                        break;
                }
            }
        });
        final int i2 = 1;
        getBinding().rulesButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.fortuneink.neonpad.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f1717b;

            {
                this.f1717b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        HomeActivity.onCreate$lambda$1(this.f1717b, view);
                        break;
                    default:
                        HomeActivity.onCreate$lambda$2(this.f1717b, view);
                        break;
                }
            }
        });
    }
}
