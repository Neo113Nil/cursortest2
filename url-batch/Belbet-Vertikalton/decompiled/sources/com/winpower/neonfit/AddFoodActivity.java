package com.winpower.neonfit;

import U0.a;
import W0.g;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.J;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.winpower.neonfit.AddFoodActivity;
import com.winpower.neonfit.R;
import com.winpower.neonfit.data.NutritionRepository;
import h.AbstractActivityC0132i;
import i1.InterfaceC0181a;
import r1.AbstractC0369t;

/* loaded from: classes.dex */
public final class AddFoodActivity extends AbstractActivityC0132i {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f2593A = 0;

    /* renamed from: y, reason: collision with root package name */
    public final g f2594y;

    /* renamed from: z, reason: collision with root package name */
    public final g f2595z;

    public AddFoodActivity() {
        final int i = 0;
        this.f2594y = new g(new InterfaceC0181a(this) { // from class: T0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddFoodActivity f1150b;

            {
                this.f1150b = this;
            }

            @Override // i1.InterfaceC0181a
            public final Object c() {
                AddFoodActivity addFoodActivity = this.f1150b;
                switch (i) {
                    case 0:
                        int i2 = AddFoodActivity.f2593A;
                        View inflate = addFoodActivity.getLayoutInflater().inflate(R.layout.activity_add_food, (ViewGroup) null, false);
                        int i3 = R.id.btnBack;
                        MaterialButton materialButton = (MaterialButton) H1.d.z(inflate, R.id.btnBack);
                        if (materialButton != null) {
                            i3 = R.id.btnSave;
                            MaterialButton materialButton2 = (MaterialButton) H1.d.z(inflate, R.id.btnSave);
                            if (materialButton2 != null) {
                                i3 = R.id.etCalories;
                                TextInputEditText textInputEditText = (TextInputEditText) H1.d.z(inflate, R.id.etCalories);
                                if (textInputEditText != null) {
                                    i3 = R.id.etCarbs;
                                    TextInputEditText textInputEditText2 = (TextInputEditText) H1.d.z(inflate, R.id.etCarbs);
                                    if (textInputEditText2 != null) {
                                        i3 = R.id.etFat;
                                        TextInputEditText textInputEditText3 = (TextInputEditText) H1.d.z(inflate, R.id.etFat);
                                        if (textInputEditText3 != null) {
                                            i3 = R.id.etName;
                                            TextInputEditText textInputEditText4 = (TextInputEditText) H1.d.z(inflate, R.id.etName);
                                            if (textInputEditText4 != null) {
                                                i3 = R.id.etProtein;
                                                TextInputEditText textInputEditText5 = (TextInputEditText) H1.d.z(inflate, R.id.etProtein);
                                                if (textInputEditText5 != null) {
                                                    return new U0.a((FrameLayout) inflate, materialButton, materialButton2, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = AddFoodActivity.f2593A;
                        return NutritionRepository.Companion.getInstance(addFoodActivity);
                }
            }
        });
        final int i2 = 1;
        this.f2595z = new g(new InterfaceC0181a(this) { // from class: T0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddFoodActivity f1150b;

            {
                this.f1150b = this;
            }

            @Override // i1.InterfaceC0181a
            public final Object c() {
                AddFoodActivity addFoodActivity = this.f1150b;
                switch (i2) {
                    case 0:
                        int i22 = AddFoodActivity.f2593A;
                        View inflate = addFoodActivity.getLayoutInflater().inflate(R.layout.activity_add_food, (ViewGroup) null, false);
                        int i3 = R.id.btnBack;
                        MaterialButton materialButton = (MaterialButton) H1.d.z(inflate, R.id.btnBack);
                        if (materialButton != null) {
                            i3 = R.id.btnSave;
                            MaterialButton materialButton2 = (MaterialButton) H1.d.z(inflate, R.id.btnSave);
                            if (materialButton2 != null) {
                                i3 = R.id.etCalories;
                                TextInputEditText textInputEditText = (TextInputEditText) H1.d.z(inflate, R.id.etCalories);
                                if (textInputEditText != null) {
                                    i3 = R.id.etCarbs;
                                    TextInputEditText textInputEditText2 = (TextInputEditText) H1.d.z(inflate, R.id.etCarbs);
                                    if (textInputEditText2 != null) {
                                        i3 = R.id.etFat;
                                        TextInputEditText textInputEditText3 = (TextInputEditText) H1.d.z(inflate, R.id.etFat);
                                        if (textInputEditText3 != null) {
                                            i3 = R.id.etName;
                                            TextInputEditText textInputEditText4 = (TextInputEditText) H1.d.z(inflate, R.id.etName);
                                            if (textInputEditText4 != null) {
                                                i3 = R.id.etProtein;
                                                TextInputEditText textInputEditText5 = (TextInputEditText) H1.d.z(inflate, R.id.etProtein);
                                                if (textInputEditText5 != null) {
                                                    return new U0.a((FrameLayout) inflate, materialButton, materialButton2, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = AddFoodActivity.f2593A;
                        return NutritionRepository.Companion.getInstance(addFoodActivity);
                }
            }
        });
    }

    @Override // h.AbstractActivityC0132i, b.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(t().f1229a);
        String stringExtra = getIntent().getStringExtra("extra_name");
        if (stringExtra != null) {
            t().f1234g.setText(stringExtra);
        }
        if (getIntent().hasExtra("extra_calories")) {
            t().f1232d.setText(String.valueOf(getIntent().getIntExtra("extra_calories", 0)));
        }
        if (getIntent().hasExtra("extra_protein")) {
            t().f1235h.setText(String.valueOf(getIntent().getFloatExtra("extra_protein", 0.0f)));
        }
        if (getIntent().hasExtra("extra_fat")) {
            t().f1233f.setText(String.valueOf(getIntent().getFloatExtra("extra_fat", 0.0f)));
        }
        if (getIntent().hasExtra("extra_carbs")) {
            t().e.setText(String.valueOf(getIntent().getFloatExtra("extra_carbs", 0.0f)));
        }
        final int i = 0;
        t().f1230b.setOnClickListener(new View.OnClickListener(this) { // from class: T0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddFoodActivity f1152b;

            {
                this.f1152b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String obj;
                Float l02;
                String obj2;
                Float l03;
                String obj3;
                Float l04;
                String obj4;
                Integer m02;
                String obj5;
                switch (i) {
                    case 0:
                        int i2 = AddFoodActivity.f2593A;
                        this.f1152b.finish();
                        break;
                    default:
                        int i3 = AddFoodActivity.f2593A;
                        AddFoodActivity addFoodActivity = this.f1152b;
                        Editable text = addFoodActivity.t().f1234g.getText();
                        String obj6 = (text == null || (obj5 = text.toString()) == null) ? null : q1.e.L0(obj5).toString();
                        if (obj6 == null) {
                            obj6 = "";
                        }
                        String str = obj6;
                        Editable text2 = addFoodActivity.t().f1232d.getText();
                        int intValue = (text2 == null || (obj4 = text2.toString()) == null || (m02 = q1.l.m0(obj4)) == null) ? 0 : m02.intValue();
                        Editable text3 = addFoodActivity.t().f1235h.getText();
                        float floatValue = (text3 == null || (obj3 = text3.toString()) == null || (l04 = q1.k.l0(obj3)) == null) ? 0.0f : l04.floatValue();
                        Editable text4 = addFoodActivity.t().f1233f.getText();
                        float floatValue2 = (text4 == null || (obj2 = text4.toString()) == null || (l03 = q1.k.l0(obj2)) == null) ? 0.0f : l03.floatValue();
                        Editable text5 = addFoodActivity.t().e.getText();
                        float floatValue3 = (text5 == null || (obj = text5.toString()) == null || (l02 = q1.k.l0(obj)) == null) ? 0.0f : l02.floatValue();
                        if (!q1.e.B0(str) && intValue > 0) {
                            AbstractC0369t.h(J.e(addFoodActivity), null, new c(addFoodActivity, str, intValue, floatValue, floatValue2, floatValue3, null), 3);
                            break;
                        } else {
                            addFoodActivity.t().f1234g.setError(addFoodActivity.getString(R.string.food_name));
                            break;
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        t().f1231c.setOnClickListener(new View.OnClickListener(this) { // from class: T0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddFoodActivity f1152b;

            {
                this.f1152b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String obj;
                Float l02;
                String obj2;
                Float l03;
                String obj3;
                Float l04;
                String obj4;
                Integer m02;
                String obj5;
                switch (i2) {
                    case 0:
                        int i22 = AddFoodActivity.f2593A;
                        this.f1152b.finish();
                        break;
                    default:
                        int i3 = AddFoodActivity.f2593A;
                        AddFoodActivity addFoodActivity = this.f1152b;
                        Editable text = addFoodActivity.t().f1234g.getText();
                        String obj6 = (text == null || (obj5 = text.toString()) == null) ? null : q1.e.L0(obj5).toString();
                        if (obj6 == null) {
                            obj6 = "";
                        }
                        String str = obj6;
                        Editable text2 = addFoodActivity.t().f1232d.getText();
                        int intValue = (text2 == null || (obj4 = text2.toString()) == null || (m02 = q1.l.m0(obj4)) == null) ? 0 : m02.intValue();
                        Editable text3 = addFoodActivity.t().f1235h.getText();
                        float floatValue = (text3 == null || (obj3 = text3.toString()) == null || (l04 = q1.k.l0(obj3)) == null) ? 0.0f : l04.floatValue();
                        Editable text4 = addFoodActivity.t().f1233f.getText();
                        float floatValue2 = (text4 == null || (obj2 = text4.toString()) == null || (l03 = q1.k.l0(obj2)) == null) ? 0.0f : l03.floatValue();
                        Editable text5 = addFoodActivity.t().e.getText();
                        float floatValue3 = (text5 == null || (obj = text5.toString()) == null || (l02 = q1.k.l0(obj)) == null) ? 0.0f : l02.floatValue();
                        if (!q1.e.B0(str) && intValue > 0) {
                            AbstractC0369t.h(J.e(addFoodActivity), null, new c(addFoodActivity, str, intValue, floatValue, floatValue2, floatValue3, null), 3);
                            break;
                        } else {
                            addFoodActivity.t().f1234g.setError(addFoodActivity.getString(R.string.food_name));
                            break;
                        }
                        break;
                }
            }
        });
    }

    public final a t() {
        return (a) this.f2594y.a();
    }
}
