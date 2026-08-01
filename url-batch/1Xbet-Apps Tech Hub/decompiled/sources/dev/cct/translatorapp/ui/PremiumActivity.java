package dev.cct.translatorapp.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.Billing.BillingClass;
import dev.cct.translatorapp.databinding.ActivityPremiumBinding;
import dev.cct.translatorapp.util.ExtensionFunction;
import dev.cct.translatorapp.util.Preferences;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: PremiumActivity.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0002J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\u0012\u0010\u001a\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J(\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0002J\b\u0010%\u001a\u00020\u0010H\u0002J(\u0010&\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0002J\b\u0010'\u001a\u00020\u0010H\u0003R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Ldev/cct/translatorapp/ui/PremiumActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "billingStatus", "Ldev/cct/translatorapp/Billing/BillingClass;", "binding", "Ldev/cct/translatorapp/databinding/ActivityPremiumBinding;", "getBinding", "()Ldev/cct/translatorapp/databinding/ActivityPremiumBinding;", "setBinding", "(Ldev/cct/translatorapp/databinding/ActivityPremiumBinding;)V", "isMonthlySelected", "", "isQuarterlySelected", "isWeeklySelected", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "initListeners", "languageChange", "context", "locale", "Ljava/util/Locale;", "navigateIndex", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "selectPackage", "selectedLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "imageView", "Landroid/widget/ImageView;", "textView1", "Landroid/widget/TextView;", "textView2", "showPriceWithSubscription", "unselectPackage", "updatePaymentPolicy", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PremiumActivity extends AppCompatActivity {
    private BillingClass billingStatus;
    public ActivityPremiumBinding binding;
    private boolean isMonthlySelected = true;
    private boolean isQuarterlySelected = true;
    private boolean isWeeklySelected;

    public final ActivityPremiumBinding getBinding() {
        ActivityPremiumBinding activityPremiumBinding = this.binding;
        if (activityPremiumBinding != null) {
            return activityPremiumBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void setBinding(ActivityPremiumBinding activityPremiumBinding) {
        Intrinsics.checkNotNullParameter(activityPremiumBinding, "<set-?>");
        this.binding = activityPremiumBinding;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context newBase) {
        Intrinsics.checkNotNullParameter(newBase, "newBase");
        String string = newBase.getSharedPreferences(newBase.getPackageName(), 0).getString("code", "en");
        Intrinsics.checkNotNull(string);
        Locale locale = new Locale(string);
        Locale.setDefault(locale);
        super.attachBaseContext(languageChange(newBase, locale));
    }

    private final Context languageChange(Context context, Locale locale) {
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        LocaleList localeList = new LocaleList(locale);
        LocaleList.setDefault(localeList);
        configuration.setLocales(localeList);
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        Intrinsics.checkNotNullExpressionValue(createConfigurationContext, "tempContext.createConfig…ionContext(configuration)");
        return createConfigurationContext;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityPremiumBinding inflate = ActivityPremiumBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        setBinding(inflate);
        setContentView(getBinding().getRoot());
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        this.billingStatus = new BillingClass(this);
        initListeners();
        showPriceWithSubscription();
        updatePaymentPolicy();
    }

    private final void updatePaymentPolicy() {
        PremiumActivity premiumActivity = this;
        getBinding().textView12.setText(StringsKt.trimIndent(getString(R.string.guidSubPlan) + "\n   a) " + getString(R.string.weekly) + " = " + new Preferences(premiumActivity).getWeeklyPrice() + " ," + getString(R.string.noFreeTrailSub) + " \n   b) " + getString(R.string.monthly) + " = " + new Preferences(premiumActivity).getMonthlyPrice() + " ," + getString(R.string.withFreeTrail) + " \n   c) " + getString(R.string.quarterly) + " = " + new Preferences(premiumActivity).getQuarterlyPrice() + " \n\n" + getString(R.string.subscriptionDetail)));
    }

    private final void showPriceWithSubscription() {
        PremiumActivity premiumActivity = this;
        getBinding().weeklyPriceTv.setText(new Preferences(premiumActivity).getWeeklyPrice());
        getBinding().monthlyPriceTv.setText(new Preferences(premiumActivity).getMonthlyPrice());
        getBinding().quarterlyPriceTv.setText(new Preferences(premiumActivity).getQuarterlyPrice());
    }

    private final void navigateIndex() {
        startActivity(new Intent(this, (Class<?>) HomeScreenActivity.class).addFlags(32768).addFlags(268435456).setFlags(268435456));
        finish();
    }

    private final void initListeners() {
        getBinding().cancel.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.PremiumActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PremiumActivity.initListeners$lambda$0(PremiumActivity.this, view);
            }
        });
        final ActivityPremiumBinding binding = getBinding();
        binding.crossPremium.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.PremiumActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PremiumActivity.initListeners$lambda$6$lambda$1(PremiumActivity.this, view);
            }
        });
        binding.weeklyLayout.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.PremiumActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PremiumActivity.initListeners$lambda$6$lambda$2(PremiumActivity.this, binding, view);
            }
        });
        binding.monthlyLayout.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.PremiumActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PremiumActivity.initListeners$lambda$6$lambda$3(PremiumActivity.this, binding, view);
            }
        });
        binding.quarterlyLayout.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.PremiumActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PremiumActivity.initListeners$lambda$6$lambda$4(PremiumActivity.this, binding, view);
            }
        });
        binding.subBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.PremiumActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PremiumActivity.initListeners$lambda$6$lambda$5(PremiumActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$0(PremiumActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://play.google.com/store/account/subscriptions"));
        this$0.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$6$lambda$1(PremiumActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ExtensionFunction.INSTANCE.openActivity(this$0, HomeScreenActivity.class);
        this$0.overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$6$lambda$2(PremiumActivity this$0, ActivityPremiumBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        this$0.isWeeklySelected = true;
        this$0.isMonthlySelected = false;
        this$0.isQuarterlySelected = false;
        ConstraintLayout weeklyLayout = this_with.weeklyLayout;
        Intrinsics.checkNotNullExpressionValue(weeklyLayout, "weeklyLayout");
        ImageView selectWeekly = this_with.selectWeekly;
        Intrinsics.checkNotNullExpressionValue(selectWeekly, "selectWeekly");
        TextView weeklyTv = this_with.weeklyTv;
        Intrinsics.checkNotNullExpressionValue(weeklyTv, "weeklyTv");
        TextView weeklyPriceTv = this_with.weeklyPriceTv;
        Intrinsics.checkNotNullExpressionValue(weeklyPriceTv, "weeklyPriceTv");
        this$0.selectPackage(weeklyLayout, selectWeekly, weeklyTv, weeklyPriceTv);
        ConstraintLayout monthlyLayout = this_with.monthlyLayout;
        Intrinsics.checkNotNullExpressionValue(monthlyLayout, "monthlyLayout");
        ImageView selectMonthly = this_with.selectMonthly;
        Intrinsics.checkNotNullExpressionValue(selectMonthly, "selectMonthly");
        TextView monthlyTv = this_with.monthlyTv;
        Intrinsics.checkNotNullExpressionValue(monthlyTv, "monthlyTv");
        TextView monthlyPriceTv = this_with.monthlyPriceTv;
        Intrinsics.checkNotNullExpressionValue(monthlyPriceTv, "monthlyPriceTv");
        this$0.unselectPackage(monthlyLayout, selectMonthly, monthlyTv, monthlyPriceTv);
        ConstraintLayout quarterlyLayout = this_with.quarterlyLayout;
        Intrinsics.checkNotNullExpressionValue(quarterlyLayout, "quarterlyLayout");
        ImageView selectQuarterly = this_with.selectQuarterly;
        Intrinsics.checkNotNullExpressionValue(selectQuarterly, "selectQuarterly");
        TextView quarterlyTv = this_with.quarterlyTv;
        Intrinsics.checkNotNullExpressionValue(quarterlyTv, "quarterlyTv");
        TextView quarterlyPriceTv = this_with.quarterlyPriceTv;
        Intrinsics.checkNotNullExpressionValue(quarterlyPriceTv, "quarterlyPriceTv");
        this$0.unselectPackage(quarterlyLayout, selectQuarterly, quarterlyTv, quarterlyPriceTv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$6$lambda$3(PremiumActivity this$0, ActivityPremiumBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        this$0.isWeeklySelected = false;
        this$0.isMonthlySelected = true;
        this$0.isQuarterlySelected = false;
        ConstraintLayout monthlyLayout = this_with.monthlyLayout;
        Intrinsics.checkNotNullExpressionValue(monthlyLayout, "monthlyLayout");
        ImageView selectMonthly = this_with.selectMonthly;
        Intrinsics.checkNotNullExpressionValue(selectMonthly, "selectMonthly");
        TextView monthlyTv = this_with.monthlyTv;
        Intrinsics.checkNotNullExpressionValue(monthlyTv, "monthlyTv");
        TextView monthlyPriceTv = this_with.monthlyPriceTv;
        Intrinsics.checkNotNullExpressionValue(monthlyPriceTv, "monthlyPriceTv");
        this$0.selectPackage(monthlyLayout, selectMonthly, monthlyTv, monthlyPriceTv);
        ConstraintLayout weeklyLayout = this_with.weeklyLayout;
        Intrinsics.checkNotNullExpressionValue(weeklyLayout, "weeklyLayout");
        ImageView selectWeekly = this_with.selectWeekly;
        Intrinsics.checkNotNullExpressionValue(selectWeekly, "selectWeekly");
        TextView weeklyTv = this_with.weeklyTv;
        Intrinsics.checkNotNullExpressionValue(weeklyTv, "weeklyTv");
        TextView weeklyPriceTv = this_with.weeklyPriceTv;
        Intrinsics.checkNotNullExpressionValue(weeklyPriceTv, "weeklyPriceTv");
        this$0.unselectPackage(weeklyLayout, selectWeekly, weeklyTv, weeklyPriceTv);
        ConstraintLayout quarterlyLayout = this_with.quarterlyLayout;
        Intrinsics.checkNotNullExpressionValue(quarterlyLayout, "quarterlyLayout");
        ImageView selectQuarterly = this_with.selectQuarterly;
        Intrinsics.checkNotNullExpressionValue(selectQuarterly, "selectQuarterly");
        TextView quarterlyTv = this_with.quarterlyTv;
        Intrinsics.checkNotNullExpressionValue(quarterlyTv, "quarterlyTv");
        TextView quarterlyPriceTv = this_with.quarterlyPriceTv;
        Intrinsics.checkNotNullExpressionValue(quarterlyPriceTv, "quarterlyPriceTv");
        this$0.unselectPackage(quarterlyLayout, selectQuarterly, quarterlyTv, quarterlyPriceTv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$6$lambda$4(PremiumActivity this$0, ActivityPremiumBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        this$0.isWeeklySelected = false;
        this$0.isMonthlySelected = false;
        this$0.isQuarterlySelected = true;
        ConstraintLayout quarterlyLayout = this_with.quarterlyLayout;
        Intrinsics.checkNotNullExpressionValue(quarterlyLayout, "quarterlyLayout");
        ImageView selectQuarterly = this_with.selectQuarterly;
        Intrinsics.checkNotNullExpressionValue(selectQuarterly, "selectQuarterly");
        TextView quarterlyTv = this_with.quarterlyTv;
        Intrinsics.checkNotNullExpressionValue(quarterlyTv, "quarterlyTv");
        TextView quarterlyPriceTv = this_with.quarterlyPriceTv;
        Intrinsics.checkNotNullExpressionValue(quarterlyPriceTv, "quarterlyPriceTv");
        this$0.selectPackage(quarterlyLayout, selectQuarterly, quarterlyTv, quarterlyPriceTv);
        ConstraintLayout monthlyLayout = this_with.monthlyLayout;
        Intrinsics.checkNotNullExpressionValue(monthlyLayout, "monthlyLayout");
        ImageView selectMonthly = this_with.selectMonthly;
        Intrinsics.checkNotNullExpressionValue(selectMonthly, "selectMonthly");
        TextView monthlyTv = this_with.monthlyTv;
        Intrinsics.checkNotNullExpressionValue(monthlyTv, "monthlyTv");
        TextView monthlyPriceTv = this_with.monthlyPriceTv;
        Intrinsics.checkNotNullExpressionValue(monthlyPriceTv, "monthlyPriceTv");
        this$0.unselectPackage(monthlyLayout, selectMonthly, monthlyTv, monthlyPriceTv);
        ConstraintLayout weeklyLayout = this_with.weeklyLayout;
        Intrinsics.checkNotNullExpressionValue(weeklyLayout, "weeklyLayout");
        ImageView selectWeekly = this_with.selectWeekly;
        Intrinsics.checkNotNullExpressionValue(selectWeekly, "selectWeekly");
        TextView weeklyTv = this_with.weeklyTv;
        Intrinsics.checkNotNullExpressionValue(weeklyTv, "weeklyTv");
        TextView weeklyPriceTv = this_with.weeklyPriceTv;
        Intrinsics.checkNotNullExpressionValue(weeklyPriceTv, "weeklyPriceTv");
        this$0.unselectPackage(weeklyLayout, selectWeekly, weeklyTv, weeklyPriceTv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$6$lambda$5(PremiumActivity this$0, View view) {
        BillingClass billingClass;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isWeeklySelected) {
            BillingClass billingClass2 = this$0.billingStatus;
            if (billingClass2 != null) {
                billingClass2.setBillingPackage(2);
                return;
            }
            return;
        }
        if (this$0.isMonthlySelected) {
            BillingClass billingClass3 = this$0.billingStatus;
            if (billingClass3 != null) {
                billingClass3.setBillingPackage(1);
                return;
            }
            return;
        }
        if (!this$0.isQuarterlySelected || (billingClass = this$0.billingStatus) == null) {
            return;
        }
        billingClass.setBillingPackage(0);
    }

    private final void selectPackage(ConstraintLayout selectedLayout, ImageView imageView, TextView textView1, TextView textView2) {
        PremiumActivity premiumActivity = this;
        selectedLayout.setBackground(ContextCompat.getDrawable(premiumActivity, R.drawable.premium_package_design));
        selectedLayout.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(premiumActivity, R.color.white)));
        imageView.setImageResource(R.drawable.selected_icon);
        textView1.setTextColor(ContextCompat.getColor(premiumActivity, R.color.light_black));
        textView2.setTextColor(ContextCompat.getColor(premiumActivity, R.color.light_black));
    }

    private final void unselectPackage(ConstraintLayout selectedLayout, ImageView imageView, TextView textView1, TextView textView2) {
        selectedLayout.setBackgroundTintList(null);
        PremiumActivity premiumActivity = this;
        selectedLayout.setBackground(ContextCompat.getDrawable(premiumActivity, R.drawable.premium_package_design));
        imageView.setImageResource(R.drawable.unselected);
        textView1.setTextColor(ContextCompat.getColor(premiumActivity, R.color.white));
        textView2.setTextColor(ContextCompat.getColor(premiumActivity, R.color.white));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ExtensionFunction.INSTANCE.openActivity(this, HomeScreenActivity.class);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }
}
