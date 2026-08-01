package com.winpower.neonfit;

import U0.f;
import W0.g;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.J;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textfield.TextInputEditText;
import com.winpower.neonfit.R;
import com.winpower.neonfit.SettingsActivity;
import com.winpower.neonfit.data.NutritionRepository;
import com.winpower.neonfit.data.UserPreferences;
import h.AbstractActivityC0132i;
import i1.InterfaceC0181a;
import r1.AbstractC0369t;

/* loaded from: classes.dex */
public final class SettingsActivity extends AbstractActivityC0132i {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f2610A = 0;

    /* renamed from: y, reason: collision with root package name */
    public final g f2611y;

    /* renamed from: z, reason: collision with root package name */
    public final g f2612z;

    public SettingsActivity() {
        final int i = 0;
        this.f2611y = new g(new InterfaceC0181a(this) { // from class: T0.p

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f1189b;

            {
                this.f1189b = this;
            }

            @Override // i1.InterfaceC0181a
            public final Object c() {
                SettingsActivity settingsActivity = this.f1189b;
                switch (i) {
                    case 0:
                        int i2 = SettingsActivity.f2610A;
                        View inflate = settingsActivity.getLayoutInflater().inflate(R.layout.activity_settings, (ViewGroup) null, false);
                        int i3 = R.id.btnBack;
                        MaterialButton materialButton = (MaterialButton) H1.d.z(inflate, R.id.btnBack);
                        if (materialButton != null) {
                            i3 = R.id.btnResetToday;
                            MaterialButton materialButton2 = (MaterialButton) H1.d.z(inflate, R.id.btnResetToday);
                            if (materialButton2 != null) {
                                i3 = R.id.btnSave;
                                MaterialButton materialButton3 = (MaterialButton) H1.d.z(inflate, R.id.btnSave);
                                if (materialButton3 != null) {
                                    i3 = R.id.etCalorieGoal;
                                    TextInputEditText textInputEditText = (TextInputEditText) H1.d.z(inflate, R.id.etCalorieGoal);
                                    if (textInputEditText != null) {
                                        i3 = R.id.etCarbGoal;
                                        TextInputEditText textInputEditText2 = (TextInputEditText) H1.d.z(inflate, R.id.etCarbGoal);
                                        if (textInputEditText2 != null) {
                                            i3 = R.id.etFatGoal;
                                            TextInputEditText textInputEditText3 = (TextInputEditText) H1.d.z(inflate, R.id.etFatGoal);
                                            if (textInputEditText3 != null) {
                                                i3 = R.id.etProteinGoal;
                                                TextInputEditText textInputEditText4 = (TextInputEditText) H1.d.z(inflate, R.id.etProteinGoal);
                                                if (textInputEditText4 != null) {
                                                    i3 = R.id.switchCelebrate;
                                                    SwitchMaterial switchMaterial = (SwitchMaterial) H1.d.z(inflate, R.id.switchCelebrate);
                                                    if (switchMaterial != null) {
                                                        return new U0.f((FrameLayout) inflate, materialButton, materialButton2, materialButton3, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, switchMaterial);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = SettingsActivity.f2610A;
                        return NutritionRepository.Companion.getInstance(settingsActivity);
                }
            }
        });
        final int i2 = 1;
        this.f2612z = new g(new InterfaceC0181a(this) { // from class: T0.p

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f1189b;

            {
                this.f1189b = this;
            }

            @Override // i1.InterfaceC0181a
            public final Object c() {
                SettingsActivity settingsActivity = this.f1189b;
                switch (i2) {
                    case 0:
                        int i22 = SettingsActivity.f2610A;
                        View inflate = settingsActivity.getLayoutInflater().inflate(R.layout.activity_settings, (ViewGroup) null, false);
                        int i3 = R.id.btnBack;
                        MaterialButton materialButton = (MaterialButton) H1.d.z(inflate, R.id.btnBack);
                        if (materialButton != null) {
                            i3 = R.id.btnResetToday;
                            MaterialButton materialButton2 = (MaterialButton) H1.d.z(inflate, R.id.btnResetToday);
                            if (materialButton2 != null) {
                                i3 = R.id.btnSave;
                                MaterialButton materialButton3 = (MaterialButton) H1.d.z(inflate, R.id.btnSave);
                                if (materialButton3 != null) {
                                    i3 = R.id.etCalorieGoal;
                                    TextInputEditText textInputEditText = (TextInputEditText) H1.d.z(inflate, R.id.etCalorieGoal);
                                    if (textInputEditText != null) {
                                        i3 = R.id.etCarbGoal;
                                        TextInputEditText textInputEditText2 = (TextInputEditText) H1.d.z(inflate, R.id.etCarbGoal);
                                        if (textInputEditText2 != null) {
                                            i3 = R.id.etFatGoal;
                                            TextInputEditText textInputEditText3 = (TextInputEditText) H1.d.z(inflate, R.id.etFatGoal);
                                            if (textInputEditText3 != null) {
                                                i3 = R.id.etProteinGoal;
                                                TextInputEditText textInputEditText4 = (TextInputEditText) H1.d.z(inflate, R.id.etProteinGoal);
                                                if (textInputEditText4 != null) {
                                                    i3 = R.id.switchCelebrate;
                                                    SwitchMaterial switchMaterial = (SwitchMaterial) H1.d.z(inflate, R.id.switchCelebrate);
                                                    if (switchMaterial != null) {
                                                        return new U0.f((FrameLayout) inflate, materialButton, materialButton2, materialButton3, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, switchMaterial);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = SettingsActivity.f2610A;
                        return NutritionRepository.Companion.getInstance(settingsActivity);
                }
            }
        });
    }

    @Override // h.AbstractActivityC0132i, b.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(t().f1254a);
        UserPreferences userPreferences = ((NutritionRepository) this.f2612z.a()).getUserPreferences();
        t().e.setText(String.valueOf(userPreferences.getDailyCalorieGoal()));
        t().f1260h.setText(String.valueOf(userPreferences.getProteinGoal()));
        t().f1259g.setText(String.valueOf(userPreferences.getFatGoal()));
        t().f1258f.setText(String.valueOf(userPreferences.getCarbGoal()));
        t().i.setChecked(userPreferences.getCelebrateCrash());
        final int i = 0;
        t().f1255b.setOnClickListener(new View.OnClickListener(this) { // from class: T0.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f1191b;

            {
                this.f1191b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String obj;
                Integer m02;
                String obj2;
                Integer m03;
                String obj3;
                Integer m04;
                String obj4;
                Integer m05;
                SettingsActivity settingsActivity = this.f1191b;
                switch (i) {
                    case 0:
                        int i2 = SettingsActivity.f2610A;
                        settingsActivity.finish();
                        break;
                    case 1:
                        int i3 = SettingsActivity.f2610A;
                        UserPreferences userPreferences2 = ((NutritionRepository) settingsActivity.f2612z.a()).getUserPreferences();
                        Editable text = settingsActivity.t().e.getText();
                        userPreferences2.setDailyCalorieGoal((text == null || (obj4 = text.toString()) == null || (m05 = q1.l.m0(obj4)) == null) ? userPreferences2.getDailyCalorieGoal() : m05.intValue());
                        Editable text2 = settingsActivity.t().f1260h.getText();
                        userPreferences2.setProteinGoal((text2 == null || (obj3 = text2.toString()) == null || (m04 = q1.l.m0(obj3)) == null) ? userPreferences2.getProteinGoal() : m04.intValue());
                        Editable text3 = settingsActivity.t().f1259g.getText();
                        userPreferences2.setFatGoal((text3 == null || (obj2 = text3.toString()) == null || (m03 = q1.l.m0(obj2)) == null) ? userPreferences2.getFatGoal() : m03.intValue());
                        Editable text4 = settingsActivity.t().f1258f.getText();
                        userPreferences2.setCarbGoal((text4 == null || (obj = text4.toString()) == null || (m02 = q1.l.m0(obj)) == null) ? userPreferences2.getCarbGoal() : m02.intValue());
                        userPreferences2.setCelebrateCrash(settingsActivity.t().i.isChecked());
                        settingsActivity.finish();
                        break;
                    default:
                        int i4 = SettingsActivity.f2610A;
                        settingsActivity.getClass();
                        AbstractC0369t.h(J.e(settingsActivity), null, new r(settingsActivity, null), 3);
                        break;
                }
            }
        });
        final int i2 = 1;
        t().f1257d.setOnClickListener(new View.OnClickListener(this) { // from class: T0.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f1191b;

            {
                this.f1191b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String obj;
                Integer m02;
                String obj2;
                Integer m03;
                String obj3;
                Integer m04;
                String obj4;
                Integer m05;
                SettingsActivity settingsActivity = this.f1191b;
                switch (i2) {
                    case 0:
                        int i22 = SettingsActivity.f2610A;
                        settingsActivity.finish();
                        break;
                    case 1:
                        int i3 = SettingsActivity.f2610A;
                        UserPreferences userPreferences2 = ((NutritionRepository) settingsActivity.f2612z.a()).getUserPreferences();
                        Editable text = settingsActivity.t().e.getText();
                        userPreferences2.setDailyCalorieGoal((text == null || (obj4 = text.toString()) == null || (m05 = q1.l.m0(obj4)) == null) ? userPreferences2.getDailyCalorieGoal() : m05.intValue());
                        Editable text2 = settingsActivity.t().f1260h.getText();
                        userPreferences2.setProteinGoal((text2 == null || (obj3 = text2.toString()) == null || (m04 = q1.l.m0(obj3)) == null) ? userPreferences2.getProteinGoal() : m04.intValue());
                        Editable text3 = settingsActivity.t().f1259g.getText();
                        userPreferences2.setFatGoal((text3 == null || (obj2 = text3.toString()) == null || (m03 = q1.l.m0(obj2)) == null) ? userPreferences2.getFatGoal() : m03.intValue());
                        Editable text4 = settingsActivity.t().f1258f.getText();
                        userPreferences2.setCarbGoal((text4 == null || (obj = text4.toString()) == null || (m02 = q1.l.m0(obj)) == null) ? userPreferences2.getCarbGoal() : m02.intValue());
                        userPreferences2.setCelebrateCrash(settingsActivity.t().i.isChecked());
                        settingsActivity.finish();
                        break;
                    default:
                        int i4 = SettingsActivity.f2610A;
                        settingsActivity.getClass();
                        AbstractC0369t.h(J.e(settingsActivity), null, new r(settingsActivity, null), 3);
                        break;
                }
            }
        });
        final int i3 = 2;
        t().f1256c.setOnClickListener(new View.OnClickListener(this) { // from class: T0.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f1191b;

            {
                this.f1191b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String obj;
                Integer m02;
                String obj2;
                Integer m03;
                String obj3;
                Integer m04;
                String obj4;
                Integer m05;
                SettingsActivity settingsActivity = this.f1191b;
                switch (i3) {
                    case 0:
                        int i22 = SettingsActivity.f2610A;
                        settingsActivity.finish();
                        break;
                    case 1:
                        int i32 = SettingsActivity.f2610A;
                        UserPreferences userPreferences2 = ((NutritionRepository) settingsActivity.f2612z.a()).getUserPreferences();
                        Editable text = settingsActivity.t().e.getText();
                        userPreferences2.setDailyCalorieGoal((text == null || (obj4 = text.toString()) == null || (m05 = q1.l.m0(obj4)) == null) ? userPreferences2.getDailyCalorieGoal() : m05.intValue());
                        Editable text2 = settingsActivity.t().f1260h.getText();
                        userPreferences2.setProteinGoal((text2 == null || (obj3 = text2.toString()) == null || (m04 = q1.l.m0(obj3)) == null) ? userPreferences2.getProteinGoal() : m04.intValue());
                        Editable text3 = settingsActivity.t().f1259g.getText();
                        userPreferences2.setFatGoal((text3 == null || (obj2 = text3.toString()) == null || (m03 = q1.l.m0(obj2)) == null) ? userPreferences2.getFatGoal() : m03.intValue());
                        Editable text4 = settingsActivity.t().f1258f.getText();
                        userPreferences2.setCarbGoal((text4 == null || (obj = text4.toString()) == null || (m02 = q1.l.m0(obj)) == null) ? userPreferences2.getCarbGoal() : m02.intValue());
                        userPreferences2.setCelebrateCrash(settingsActivity.t().i.isChecked());
                        settingsActivity.finish();
                        break;
                    default:
                        int i4 = SettingsActivity.f2610A;
                        settingsActivity.getClass();
                        AbstractC0369t.h(J.e(settingsActivity), null, new r(settingsActivity, null), 3);
                        break;
                }
            }
        });
    }

    public final f t() {
        return (f) this.f2611y.a();
    }
}
