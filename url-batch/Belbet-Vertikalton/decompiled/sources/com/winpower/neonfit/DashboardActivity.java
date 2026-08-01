package com.winpower.neonfit;

import C.b;
import T0.h;
import W0.g;
import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.J;
import com.google.android.material.button.MaterialButton;
import com.winpower.neonfit.AddFoodActivity;
import com.winpower.neonfit.DashboardActivity;
import com.winpower.neonfit.FoodLogActivity;
import com.winpower.neonfit.R;
import com.winpower.neonfit.SettingsActivity;
import com.winpower.neonfit.data.FoodPreset;
import com.winpower.neonfit.data.FoodPresets;
import com.winpower.neonfit.data.NutritionRepository;
import com.winpower.neonfit.ui.CalorieCoreView;
import com.winpower.neonfit.ui.MacroRingView;
import h.AbstractActivityC0132i;
import i1.InterfaceC0181a;
import r1.AbstractC0369t;
import y0.C0424c;
import y0.DialogC0426e;

/* loaded from: classes.dex */
public final class DashboardActivity extends AbstractActivityC0132i {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f2596A = 0;

    /* renamed from: y, reason: collision with root package name */
    public final g f2597y;

    /* renamed from: z, reason: collision with root package name */
    public final g f2598z;

    public DashboardActivity() {
        final int i = 0;
        this.f2597y = new g(new InterfaceC0181a(this) { // from class: T0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DashboardActivity f1160b;

            {
                this.f1160b = this;
            }

            @Override // i1.InterfaceC0181a
            public final Object c() {
                DashboardActivity dashboardActivity = this.f1160b;
                switch (i) {
                    case 0:
                        int i2 = DashboardActivity.f2596A;
                        View inflate = dashboardActivity.getLayoutInflater().inflate(R.layout.activity_dashboard, (ViewGroup) null, false);
                        int i3 = R.id.btnAddFood;
                        MaterialButton materialButton = (MaterialButton) H1.d.z(inflate, R.id.btnAddFood);
                        if (materialButton != null) {
                            i3 = R.id.btnBack;
                            MaterialButton materialButton2 = (MaterialButton) H1.d.z(inflate, R.id.btnBack);
                            if (materialButton2 != null) {
                                i3 = R.id.btnFoodLog;
                                MaterialButton materialButton3 = (MaterialButton) H1.d.z(inflate, R.id.btnFoodLog);
                                if (materialButton3 != null) {
                                    i3 = R.id.btnQuickAdd;
                                    MaterialButton materialButton4 = (MaterialButton) H1.d.z(inflate, R.id.btnQuickAdd);
                                    if (materialButton4 != null) {
                                        i3 = R.id.btnSettings;
                                        MaterialButton materialButton5 = (MaterialButton) H1.d.z(inflate, R.id.btnSettings);
                                        if (materialButton5 != null) {
                                            i3 = R.id.calorieCore;
                                            CalorieCoreView calorieCoreView = (CalorieCoreView) H1.d.z(inflate, R.id.calorieCore);
                                            if (calorieCoreView != null) {
                                                i3 = R.id.ringCarbs;
                                                MacroRingView macroRingView = (MacroRingView) H1.d.z(inflate, R.id.ringCarbs);
                                                if (macroRingView != null) {
                                                    i3 = R.id.ringFat;
                                                    MacroRingView macroRingView2 = (MacroRingView) H1.d.z(inflate, R.id.ringFat);
                                                    if (macroRingView2 != null) {
                                                        i3 = R.id.ringProtein;
                                                        MacroRingView macroRingView3 = (MacroRingView) H1.d.z(inflate, R.id.ringProtein);
                                                        if (macroRingView3 != null) {
                                                            i3 = R.id.tvCaloriesToday;
                                                            TextView textView = (TextView) H1.d.z(inflate, R.id.tvCaloriesToday);
                                                            if (textView != null) {
                                                                i3 = R.id.tvGoal;
                                                                TextView textView2 = (TextView) H1.d.z(inflate, R.id.tvGoal);
                                                                if (textView2 != null) {
                                                                    i3 = R.id.tvRemaining;
                                                                    TextView textView3 = (TextView) H1.d.z(inflate, R.id.tvRemaining);
                                                                    if (textView3 != null) {
                                                                        return new U0.b((FrameLayout) inflate, materialButton, materialButton2, materialButton3, materialButton4, materialButton5, calorieCoreView, macroRingView, macroRingView2, macroRingView3, textView, textView2, textView3);
                                                                    }
                                                                }
                                                            }
                                                        }
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
                        int i4 = DashboardActivity.f2596A;
                        return NutritionRepository.Companion.getInstance(dashboardActivity);
                }
            }
        });
        final int i2 = 1;
        this.f2598z = new g(new InterfaceC0181a(this) { // from class: T0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DashboardActivity f1160b;

            {
                this.f1160b = this;
            }

            @Override // i1.InterfaceC0181a
            public final Object c() {
                DashboardActivity dashboardActivity = this.f1160b;
                switch (i2) {
                    case 0:
                        int i22 = DashboardActivity.f2596A;
                        View inflate = dashboardActivity.getLayoutInflater().inflate(R.layout.activity_dashboard, (ViewGroup) null, false);
                        int i3 = R.id.btnAddFood;
                        MaterialButton materialButton = (MaterialButton) H1.d.z(inflate, R.id.btnAddFood);
                        if (materialButton != null) {
                            i3 = R.id.btnBack;
                            MaterialButton materialButton2 = (MaterialButton) H1.d.z(inflate, R.id.btnBack);
                            if (materialButton2 != null) {
                                i3 = R.id.btnFoodLog;
                                MaterialButton materialButton3 = (MaterialButton) H1.d.z(inflate, R.id.btnFoodLog);
                                if (materialButton3 != null) {
                                    i3 = R.id.btnQuickAdd;
                                    MaterialButton materialButton4 = (MaterialButton) H1.d.z(inflate, R.id.btnQuickAdd);
                                    if (materialButton4 != null) {
                                        i3 = R.id.btnSettings;
                                        MaterialButton materialButton5 = (MaterialButton) H1.d.z(inflate, R.id.btnSettings);
                                        if (materialButton5 != null) {
                                            i3 = R.id.calorieCore;
                                            CalorieCoreView calorieCoreView = (CalorieCoreView) H1.d.z(inflate, R.id.calorieCore);
                                            if (calorieCoreView != null) {
                                                i3 = R.id.ringCarbs;
                                                MacroRingView macroRingView = (MacroRingView) H1.d.z(inflate, R.id.ringCarbs);
                                                if (macroRingView != null) {
                                                    i3 = R.id.ringFat;
                                                    MacroRingView macroRingView2 = (MacroRingView) H1.d.z(inflate, R.id.ringFat);
                                                    if (macroRingView2 != null) {
                                                        i3 = R.id.ringProtein;
                                                        MacroRingView macroRingView3 = (MacroRingView) H1.d.z(inflate, R.id.ringProtein);
                                                        if (macroRingView3 != null) {
                                                            i3 = R.id.tvCaloriesToday;
                                                            TextView textView = (TextView) H1.d.z(inflate, R.id.tvCaloriesToday);
                                                            if (textView != null) {
                                                                i3 = R.id.tvGoal;
                                                                TextView textView2 = (TextView) H1.d.z(inflate, R.id.tvGoal);
                                                                if (textView2 != null) {
                                                                    i3 = R.id.tvRemaining;
                                                                    TextView textView3 = (TextView) H1.d.z(inflate, R.id.tvRemaining);
                                                                    if (textView3 != null) {
                                                                        return new U0.b((FrameLayout) inflate, materialButton, materialButton2, materialButton3, materialButton4, materialButton5, calorieCoreView, macroRingView, macroRingView2, macroRingView3, textView, textView2, textView3);
                                                                    }
                                                                }
                                                            }
                                                        }
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
                        int i4 = DashboardActivity.f2596A;
                        return NutritionRepository.Companion.getInstance(dashboardActivity);
                }
            }
        });
    }

    @Override // h.AbstractActivityC0132i, b.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(t().f1236a);
        t().j.setLabel(getString(R.string.protein));
        t().j.setRingColor(b.a(this, R.color.protein_ring));
        t().i.setLabel(getString(R.string.fat));
        t().i.setRingColor(b.a(this, R.color.fat_ring));
        t().f1242h.setLabel(getString(R.string.carbs));
        t().f1242h.setRingColor(b.a(this, R.color.carb_ring));
        final int i = 0;
        t().f1238c.setOnClickListener(new View.OnClickListener(this) { // from class: T0.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DashboardActivity f1162b;

            {
                this.f1162b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final DashboardActivity dashboardActivity = this.f1162b;
                switch (i) {
                    case 0:
                        int i2 = DashboardActivity.f2596A;
                        dashboardActivity.finish();
                        return;
                    case 1:
                        int i3 = DashboardActivity.f2596A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) AddFoodActivity.class));
                        return;
                    case 2:
                        int i4 = DashboardActivity.f2596A;
                        View inflate = dashboardActivity.getLayoutInflater().inflate(R.layout.bottom_sheet_quick_add, (ViewGroup) null, false);
                        LinearLayout linearLayout = (LinearLayout) H1.d.z(inflate, R.id.presetContainer);
                        if (linearLayout == null) {
                            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.presetContainer)));
                        }
                        LinearLayout linearLayout2 = (LinearLayout) inflate;
                        TypedValue typedValue = new TypedValue();
                        final DialogC0426e dialogC0426e = new DialogC0426e(dashboardActivity, dashboardActivity.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog);
                        dialogC0426e.j = true;
                        dialogC0426e.f4725k = true;
                        dialogC0426e.f4730p = new C0424c(dialogC0426e);
                        dialogC0426e.f().h(1);
                        dialogC0426e.f4728n = dialogC0426e.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
                        dialogC0426e.f4728n = dialogC0426e.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
                        dialogC0426e.setContentView(linearLayout2);
                        for (final FoodPreset foodPreset : FoodPresets.INSTANCE.getAll()) {
                            View inflate2 = dashboardActivity.getLayoutInflater().inflate(R.layout.item_preset_chip, (ViewGroup) linearLayout, false);
                            if (inflate2 == null) {
                                throw new NullPointerException("rootView");
                            }
                            TextView textView = (TextView) inflate2;
                            textView.setText(foodPreset.getName() + " — " + foodPreset.getCalories() + " kcal");
                            textView.setOnClickListener(new View.OnClickListener() { // from class: T0.f
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i5 = DashboardActivity.f2596A;
                                    DialogC0426e.this.dismiss();
                                    DashboardActivity dashboardActivity2 = dashboardActivity;
                                    Intent intent = new Intent(dashboardActivity2, (Class<?>) AddFoodActivity.class);
                                    FoodPreset foodPreset2 = foodPreset;
                                    intent.putExtra("extra_name", foodPreset2.getName());
                                    intent.putExtra("extra_calories", foodPreset2.getCalories());
                                    intent.putExtra("extra_protein", foodPreset2.getProtein());
                                    intent.putExtra("extra_fat", foodPreset2.getFat());
                                    intent.putExtra("extra_carbs", foodPreset2.getCarbs());
                                    dashboardActivity2.startActivity(intent);
                                }
                            });
                            linearLayout.addView(textView);
                        }
                        dialogC0426e.show();
                        return;
                    case 3:
                        int i5 = DashboardActivity.f2596A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) FoodLogActivity.class));
                        return;
                    default:
                        int i6 = DashboardActivity.f2596A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) SettingsActivity.class));
                        return;
                }
            }
        });
        final int i2 = 1;
        t().f1237b.setOnClickListener(new View.OnClickListener(this) { // from class: T0.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DashboardActivity f1162b;

            {
                this.f1162b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final DashboardActivity dashboardActivity = this.f1162b;
                switch (i2) {
                    case 0:
                        int i22 = DashboardActivity.f2596A;
                        dashboardActivity.finish();
                        return;
                    case 1:
                        int i3 = DashboardActivity.f2596A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) AddFoodActivity.class));
                        return;
                    case 2:
                        int i4 = DashboardActivity.f2596A;
                        View inflate = dashboardActivity.getLayoutInflater().inflate(R.layout.bottom_sheet_quick_add, (ViewGroup) null, false);
                        LinearLayout linearLayout = (LinearLayout) H1.d.z(inflate, R.id.presetContainer);
                        if (linearLayout == null) {
                            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.presetContainer)));
                        }
                        LinearLayout linearLayout2 = (LinearLayout) inflate;
                        TypedValue typedValue = new TypedValue();
                        final DialogC0426e dialogC0426e = new DialogC0426e(dashboardActivity, dashboardActivity.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog);
                        dialogC0426e.j = true;
                        dialogC0426e.f4725k = true;
                        dialogC0426e.f4730p = new C0424c(dialogC0426e);
                        dialogC0426e.f().h(1);
                        dialogC0426e.f4728n = dialogC0426e.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
                        dialogC0426e.f4728n = dialogC0426e.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
                        dialogC0426e.setContentView(linearLayout2);
                        for (final FoodPreset foodPreset : FoodPresets.INSTANCE.getAll()) {
                            View inflate2 = dashboardActivity.getLayoutInflater().inflate(R.layout.item_preset_chip, (ViewGroup) linearLayout, false);
                            if (inflate2 == null) {
                                throw new NullPointerException("rootView");
                            }
                            TextView textView = (TextView) inflate2;
                            textView.setText(foodPreset.getName() + " — " + foodPreset.getCalories() + " kcal");
                            textView.setOnClickListener(new View.OnClickListener() { // from class: T0.f
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i5 = DashboardActivity.f2596A;
                                    DialogC0426e.this.dismiss();
                                    DashboardActivity dashboardActivity2 = dashboardActivity;
                                    Intent intent = new Intent(dashboardActivity2, (Class<?>) AddFoodActivity.class);
                                    FoodPreset foodPreset2 = foodPreset;
                                    intent.putExtra("extra_name", foodPreset2.getName());
                                    intent.putExtra("extra_calories", foodPreset2.getCalories());
                                    intent.putExtra("extra_protein", foodPreset2.getProtein());
                                    intent.putExtra("extra_fat", foodPreset2.getFat());
                                    intent.putExtra("extra_carbs", foodPreset2.getCarbs());
                                    dashboardActivity2.startActivity(intent);
                                }
                            });
                            linearLayout.addView(textView);
                        }
                        dialogC0426e.show();
                        return;
                    case 3:
                        int i5 = DashboardActivity.f2596A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) FoodLogActivity.class));
                        return;
                    default:
                        int i6 = DashboardActivity.f2596A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) SettingsActivity.class));
                        return;
                }
            }
        });
        final int i3 = 2;
        t().e.setOnClickListener(new View.OnClickListener(this) { // from class: T0.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DashboardActivity f1162b;

            {
                this.f1162b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final DashboardActivity dashboardActivity = this.f1162b;
                switch (i3) {
                    case 0:
                        int i22 = DashboardActivity.f2596A;
                        dashboardActivity.finish();
                        return;
                    case 1:
                        int i32 = DashboardActivity.f2596A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) AddFoodActivity.class));
                        return;
                    case 2:
                        int i4 = DashboardActivity.f2596A;
                        View inflate = dashboardActivity.getLayoutInflater().inflate(R.layout.bottom_sheet_quick_add, (ViewGroup) null, false);
                        LinearLayout linearLayout = (LinearLayout) H1.d.z(inflate, R.id.presetContainer);
                        if (linearLayout == null) {
                            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.presetContainer)));
                        }
                        LinearLayout linearLayout2 = (LinearLayout) inflate;
                        TypedValue typedValue = new TypedValue();
                        final DialogC0426e dialogC0426e = new DialogC0426e(dashboardActivity, dashboardActivity.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog);
                        dialogC0426e.j = true;
                        dialogC0426e.f4725k = true;
                        dialogC0426e.f4730p = new C0424c(dialogC0426e);
                        dialogC0426e.f().h(1);
                        dialogC0426e.f4728n = dialogC0426e.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
                        dialogC0426e.f4728n = dialogC0426e.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
                        dialogC0426e.setContentView(linearLayout2);
                        for (final FoodPreset foodPreset : FoodPresets.INSTANCE.getAll()) {
                            View inflate2 = dashboardActivity.getLayoutInflater().inflate(R.layout.item_preset_chip, (ViewGroup) linearLayout, false);
                            if (inflate2 == null) {
                                throw new NullPointerException("rootView");
                            }
                            TextView textView = (TextView) inflate2;
                            textView.setText(foodPreset.getName() + " — " + foodPreset.getCalories() + " kcal");
                            textView.setOnClickListener(new View.OnClickListener() { // from class: T0.f
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i5 = DashboardActivity.f2596A;
                                    DialogC0426e.this.dismiss();
                                    DashboardActivity dashboardActivity2 = dashboardActivity;
                                    Intent intent = new Intent(dashboardActivity2, (Class<?>) AddFoodActivity.class);
                                    FoodPreset foodPreset2 = foodPreset;
                                    intent.putExtra("extra_name", foodPreset2.getName());
                                    intent.putExtra("extra_calories", foodPreset2.getCalories());
                                    intent.putExtra("extra_protein", foodPreset2.getProtein());
                                    intent.putExtra("extra_fat", foodPreset2.getFat());
                                    intent.putExtra("extra_carbs", foodPreset2.getCarbs());
                                    dashboardActivity2.startActivity(intent);
                                }
                            });
                            linearLayout.addView(textView);
                        }
                        dialogC0426e.show();
                        return;
                    case 3:
                        int i5 = DashboardActivity.f2596A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) FoodLogActivity.class));
                        return;
                    default:
                        int i6 = DashboardActivity.f2596A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) SettingsActivity.class));
                        return;
                }
            }
        });
        final int i4 = 3;
        t().f1239d.setOnClickListener(new View.OnClickListener(this) { // from class: T0.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DashboardActivity f1162b;

            {
                this.f1162b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final DashboardActivity dashboardActivity = this.f1162b;
                switch (i4) {
                    case 0:
                        int i22 = DashboardActivity.f2596A;
                        dashboardActivity.finish();
                        return;
                    case 1:
                        int i32 = DashboardActivity.f2596A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) AddFoodActivity.class));
                        return;
                    case 2:
                        int i42 = DashboardActivity.f2596A;
                        View inflate = dashboardActivity.getLayoutInflater().inflate(R.layout.bottom_sheet_quick_add, (ViewGroup) null, false);
                        LinearLayout linearLayout = (LinearLayout) H1.d.z(inflate, R.id.presetContainer);
                        if (linearLayout == null) {
                            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.presetContainer)));
                        }
                        LinearLayout linearLayout2 = (LinearLayout) inflate;
                        TypedValue typedValue = new TypedValue();
                        final DialogC0426e dialogC0426e = new DialogC0426e(dashboardActivity, dashboardActivity.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog);
                        dialogC0426e.j = true;
                        dialogC0426e.f4725k = true;
                        dialogC0426e.f4730p = new C0424c(dialogC0426e);
                        dialogC0426e.f().h(1);
                        dialogC0426e.f4728n = dialogC0426e.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
                        dialogC0426e.f4728n = dialogC0426e.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
                        dialogC0426e.setContentView(linearLayout2);
                        for (final FoodPreset foodPreset : FoodPresets.INSTANCE.getAll()) {
                            View inflate2 = dashboardActivity.getLayoutInflater().inflate(R.layout.item_preset_chip, (ViewGroup) linearLayout, false);
                            if (inflate2 == null) {
                                throw new NullPointerException("rootView");
                            }
                            TextView textView = (TextView) inflate2;
                            textView.setText(foodPreset.getName() + " — " + foodPreset.getCalories() + " kcal");
                            textView.setOnClickListener(new View.OnClickListener() { // from class: T0.f
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i5 = DashboardActivity.f2596A;
                                    DialogC0426e.this.dismiss();
                                    DashboardActivity dashboardActivity2 = dashboardActivity;
                                    Intent intent = new Intent(dashboardActivity2, (Class<?>) AddFoodActivity.class);
                                    FoodPreset foodPreset2 = foodPreset;
                                    intent.putExtra("extra_name", foodPreset2.getName());
                                    intent.putExtra("extra_calories", foodPreset2.getCalories());
                                    intent.putExtra("extra_protein", foodPreset2.getProtein());
                                    intent.putExtra("extra_fat", foodPreset2.getFat());
                                    intent.putExtra("extra_carbs", foodPreset2.getCarbs());
                                    dashboardActivity2.startActivity(intent);
                                }
                            });
                            linearLayout.addView(textView);
                        }
                        dialogC0426e.show();
                        return;
                    case 3:
                        int i5 = DashboardActivity.f2596A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) FoodLogActivity.class));
                        return;
                    default:
                        int i6 = DashboardActivity.f2596A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) SettingsActivity.class));
                        return;
                }
            }
        });
        final int i5 = 4;
        t().f1240f.setOnClickListener(new View.OnClickListener(this) { // from class: T0.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DashboardActivity f1162b;

            {
                this.f1162b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final DashboardActivity dashboardActivity = this.f1162b;
                switch (i5) {
                    case 0:
                        int i22 = DashboardActivity.f2596A;
                        dashboardActivity.finish();
                        return;
                    case 1:
                        int i32 = DashboardActivity.f2596A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) AddFoodActivity.class));
                        return;
                    case 2:
                        int i42 = DashboardActivity.f2596A;
                        View inflate = dashboardActivity.getLayoutInflater().inflate(R.layout.bottom_sheet_quick_add, (ViewGroup) null, false);
                        LinearLayout linearLayout = (LinearLayout) H1.d.z(inflate, R.id.presetContainer);
                        if (linearLayout == null) {
                            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.presetContainer)));
                        }
                        LinearLayout linearLayout2 = (LinearLayout) inflate;
                        TypedValue typedValue = new TypedValue();
                        final DialogC0426e dialogC0426e = new DialogC0426e(dashboardActivity, dashboardActivity.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog);
                        dialogC0426e.j = true;
                        dialogC0426e.f4725k = true;
                        dialogC0426e.f4730p = new C0424c(dialogC0426e);
                        dialogC0426e.f().h(1);
                        dialogC0426e.f4728n = dialogC0426e.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
                        dialogC0426e.f4728n = dialogC0426e.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
                        dialogC0426e.setContentView(linearLayout2);
                        for (final FoodPreset foodPreset : FoodPresets.INSTANCE.getAll()) {
                            View inflate2 = dashboardActivity.getLayoutInflater().inflate(R.layout.item_preset_chip, (ViewGroup) linearLayout, false);
                            if (inflate2 == null) {
                                throw new NullPointerException("rootView");
                            }
                            TextView textView = (TextView) inflate2;
                            textView.setText(foodPreset.getName() + " — " + foodPreset.getCalories() + " kcal");
                            textView.setOnClickListener(new View.OnClickListener() { // from class: T0.f
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i52 = DashboardActivity.f2596A;
                                    DialogC0426e.this.dismiss();
                                    DashboardActivity dashboardActivity2 = dashboardActivity;
                                    Intent intent = new Intent(dashboardActivity2, (Class<?>) AddFoodActivity.class);
                                    FoodPreset foodPreset2 = foodPreset;
                                    intent.putExtra("extra_name", foodPreset2.getName());
                                    intent.putExtra("extra_calories", foodPreset2.getCalories());
                                    intent.putExtra("extra_protein", foodPreset2.getProtein());
                                    intent.putExtra("extra_fat", foodPreset2.getFat());
                                    intent.putExtra("extra_carbs", foodPreset2.getCarbs());
                                    dashboardActivity2.startActivity(intent);
                                }
                            });
                            linearLayout.addView(textView);
                        }
                        dialogC0426e.show();
                        return;
                    case 3:
                        int i52 = DashboardActivity.f2596A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) FoodLogActivity.class));
                        return;
                    default:
                        int i6 = DashboardActivity.f2596A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) SettingsActivity.class));
                        return;
                }
            }
        });
        AbstractC0369t.h(J.e(this), null, new h(this, null), 3);
    }

    public final U0.b t() {
        return (U0.b) this.f2597y.a();
    }
}
