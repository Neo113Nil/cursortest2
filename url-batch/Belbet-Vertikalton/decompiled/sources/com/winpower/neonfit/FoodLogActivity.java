package com.winpower.neonfit;

import Q0.ViewOnClickListenerC0030a;
import T0.k;
import U0.c;
import W0.g;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.J;
import com.google.android.material.button.MaterialButton;
import com.winpower.neonfit.FoodLogActivity;
import com.winpower.neonfit.R;
import com.winpower.neonfit.data.NutritionRepository;
import h.AbstractActivityC0132i;
import i1.InterfaceC0181a;
import r1.AbstractC0369t;

/* loaded from: classes.dex */
public final class FoodLogActivity extends AbstractActivityC0132i {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f2599A = 0;

    /* renamed from: y, reason: collision with root package name */
    public final g f2600y;

    /* renamed from: z, reason: collision with root package name */
    public final g f2601z;

    public FoodLogActivity() {
        final int i = 0;
        this.f2600y = new g(new InterfaceC0181a(this) { // from class: T0.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FoodLogActivity f1171b;

            {
                this.f1171b = this;
            }

            @Override // i1.InterfaceC0181a
            public final Object c() {
                FoodLogActivity foodLogActivity = this.f1171b;
                switch (i) {
                    case 0:
                        int i2 = FoodLogActivity.f2599A;
                        View inflate = foodLogActivity.getLayoutInflater().inflate(R.layout.activity_food_log, (ViewGroup) null, false);
                        int i3 = R.id.btnBack;
                        MaterialButton materialButton = (MaterialButton) H1.d.z(inflate, R.id.btnBack);
                        if (materialButton != null) {
                            i3 = R.id.logContainer;
                            LinearLayout linearLayout = (LinearLayout) H1.d.z(inflate, R.id.logContainer);
                            if (linearLayout != null) {
                                i3 = R.id.tvEmpty;
                                TextView textView = (TextView) H1.d.z(inflate, R.id.tvEmpty);
                                if (textView != null) {
                                    return new U0.c((FrameLayout) inflate, materialButton, linearLayout, textView);
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = FoodLogActivity.f2599A;
                        return NutritionRepository.Companion.getInstance(foodLogActivity);
                }
            }
        });
        final int i2 = 1;
        this.f2601z = new g(new InterfaceC0181a(this) { // from class: T0.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FoodLogActivity f1171b;

            {
                this.f1171b = this;
            }

            @Override // i1.InterfaceC0181a
            public final Object c() {
                FoodLogActivity foodLogActivity = this.f1171b;
                switch (i2) {
                    case 0:
                        int i22 = FoodLogActivity.f2599A;
                        View inflate = foodLogActivity.getLayoutInflater().inflate(R.layout.activity_food_log, (ViewGroup) null, false);
                        int i3 = R.id.btnBack;
                        MaterialButton materialButton = (MaterialButton) H1.d.z(inflate, R.id.btnBack);
                        if (materialButton != null) {
                            i3 = R.id.logContainer;
                            LinearLayout linearLayout = (LinearLayout) H1.d.z(inflate, R.id.logContainer);
                            if (linearLayout != null) {
                                i3 = R.id.tvEmpty;
                                TextView textView = (TextView) H1.d.z(inflate, R.id.tvEmpty);
                                if (textView != null) {
                                    return new U0.c((FrameLayout) inflate, materialButton, linearLayout, textView);
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = FoodLogActivity.f2599A;
                        return NutritionRepository.Companion.getInstance(foodLogActivity);
                }
            }
        });
    }

    @Override // h.AbstractActivityC0132i, b.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(t().f1246a);
        t().f1247b.setOnClickListener(new ViewOnClickListenerC0030a(3, this));
        AbstractC0369t.h(J.e(this), null, new k(this, null), 3);
    }

    public final c t() {
        return (c) this.f2600y.a();
    }
}
