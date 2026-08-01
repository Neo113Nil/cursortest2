package dev.cct.translatorapp.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.customFirebaseEvents.TranslatorCustomFirebaseEvents;
import dev.cct.translatorapp.databinding.ActivitySettingBinding;
import dev.cct.translatorapp.util.ExtensionFunction;
import dev.cct.translatorapp.util.ExtensionFunctionKt;
import dev.cct.translatorapp.util.Preferences;
import io.ktor.http.LinkHeader;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SettingActivity.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\fH\u0002J\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\fH\u0017J\u0012\u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Ldev/cct/translatorapp/ui/SettingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Ldev/cct/translatorapp/databinding/ActivitySettingBinding;", "getBinding", "()Ldev/cct/translatorapp/databinding/ActivitySettingBinding;", "setBinding", "(Ldev/cct/translatorapp/databinding/ActivitySettingBinding;)V", "clickEventsFirebase", "Ldev/cct/translatorapp/customFirebaseEvents/TranslatorCustomFirebaseEvents;", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "initListeners", "languageChange", "context", "locale", "Ljava/util/Locale;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SettingActivity extends AppCompatActivity {
    public ActivitySettingBinding binding;
    private TranslatorCustomFirebaseEvents clickEventsFirebase;

    public final ActivitySettingBinding getBinding() {
        ActivitySettingBinding activitySettingBinding = this.binding;
        if (activitySettingBinding != null) {
            return activitySettingBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void setBinding(ActivitySettingBinding activitySettingBinding) {
        Intrinsics.checkNotNullParameter(activitySettingBinding, "<set-?>");
        this.binding = activitySettingBinding;
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
        ActivitySettingBinding inflate = ActivitySettingBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        setBinding(inflate);
        setContentView(getBinding().getRoot());
        SettingActivity settingActivity = this;
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(settingActivity);
        Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "getInstance(this)");
        this.clickEventsFirebase = new TranslatorCustomFirebaseEvents(firebaseAnalytics);
        getBinding().currentLangTv.setText(getString(ExtensionFunctionKt.getAppLanguageList().get(new Preferences(settingActivity).getAppSelectedLang()).getLang()));
        if (new Preferences(settingActivity).getCheckBillingStatus()) {
            getBinding().mirroringLayout.setVisibility(8);
            getBinding().areaCalLayout.setVisibility(8);
        }
        initListeners();
        getBinding().webToosTermsTv.setSelected(true);
    }

    private final void initListeners() {
        ActivitySettingBinding binding = getBinding();
        binding.favoriteLayout.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.SettingActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.initListeners$lambda$14$lambda$0(SettingActivity.this, view);
            }
        });
        binding.historyGroup.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.SettingActivity$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.initListeners$lambda$14$lambda$1(SettingActivity.this, view);
            }
        });
        binding.speechLayout.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.SettingActivity$$ExternalSyntheticLambda10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.initListeners$lambda$14$lambda$2(SettingActivity.this, view);
            }
        });
        binding.appLangGroup.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.SettingActivity$$ExternalSyntheticLambda11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.initListeners$lambda$14$lambda$3(SettingActivity.this, view);
            }
        });
        binding.WidgetLayout.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.SettingActivity$$ExternalSyntheticLambda12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.initListeners$lambda$14$lambda$4(SettingActivity.this, view);
            }
        });
        binding.startTrialImg.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.SettingActivity$$ExternalSyntheticLambda13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.initListeners$lambda$14$lambda$5(SettingActivity.this, view);
            }
        });
        binding.backFromSetting.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.SettingActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.initListeners$lambda$14$lambda$6(SettingActivity.this, view);
            }
        });
        binding.shareAppLayout.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.SettingActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.initListeners$lambda$14$lambda$7(SettingActivity.this, view);
            }
        });
        binding.rateUsLayout.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.SettingActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.initListeners$lambda$14$lambda$8(SettingActivity.this, view);
            }
        });
        binding.policyLayout.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.SettingActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.initListeners$lambda$14$lambda$9(SettingActivity.this, view);
            }
        });
        binding.moreAppsLayout.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.SettingActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.initListeners$lambda$14$lambda$10(SettingActivity.this, view);
            }
        });
        binding.mirroringLayout.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.SettingActivity$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.initListeners$lambda$14$lambda$11(SettingActivity.this, view);
            }
        });
        binding.areaCalLayout.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.SettingActivity$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.initListeners$lambda$14$lambda$12(SettingActivity.this, view);
            }
        });
        binding.webToolsLayout.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.SettingActivity$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.initListeners$lambda$14$lambda$13(SettingActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$14$lambda$0(SettingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ExtensionFunction.INSTANCE.openActivity(this$0, FavoriteActivity.class);
        this$0.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$14$lambda$1(SettingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ExtensionFunction.INSTANCE.openActivity(this$0, HistoryActivity.class);
        this$0.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$14$lambda$2(SettingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) SpeechToTextActivity.class);
        intent.putExtra(LinkHeader.Parameters.Type, "fromSetting");
        this$0.startActivity(intent);
        this$0.finish();
        this$0.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$14$lambda$3(SettingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) LanguageActivity.class);
        intent.putExtra(LinkHeader.Parameters.Type, "fromSetting");
        this$0.startActivity(intent);
        this$0.finish();
        this$0.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        TranslatorCustomFirebaseEvents translatorCustomFirebaseEvents = this$0.clickEventsFirebase;
        if (translatorCustomFirebaseEvents != null) {
            translatorCustomFirebaseEvents.settingAppLang();
        }
        LanguageActivity.INSTANCE.setFromSettingScreen(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$14$lambda$4(SettingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) WidgetActivity.class);
        intent.putExtra(LinkHeader.Parameters.Type, "fromSetting");
        this$0.startActivity(intent);
        this$0.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$14$lambda$5(SettingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TranslatorCustomFirebaseEvents translatorCustomFirebaseEvents = this$0.clickEventsFirebase;
        if (translatorCustomFirebaseEvents != null) {
            translatorCustomFirebaseEvents.settingToPremium();
        }
        ExtensionFunction.INSTANCE.openActivity(this$0, PremiumActivity.class);
        this$0.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$14$lambda$6(SettingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
        this$0.overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$14$lambda$7(SettingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", "Install Now: https://play.google.com/store/apps/details?id=com.translator.alllanguagetranslations.ath&pcampaignid=web_share");
        this$0.startActivity(Intent.createChooser(intent, null));
        this$0.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$14$lambda$8(SettingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ExtensionFunction.INSTANCE.openLink(this$0, "https://play.google.com/store/apps/details?id=com.translator.alllanguagetranslations.ath&pcampaignid=web_share");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$14$lambda$9(SettingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ExtensionFunction.INSTANCE.openLink(this$0, "https://appstechhub.blogspot.com/2022/04/privacy-policy-of-apps-tech-hub.html");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$14$lambda$10(SettingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ExtensionFunction.INSTANCE.openLink(this$0, "https://play.google.com/store/apps/developer?id=Apps+Tech+Hub");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$14$lambda$11(SettingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TranslatorCustomFirebaseEvents translatorCustomFirebaseEvents = this$0.clickEventsFirebase;
        if (translatorCustomFirebaseEvents != null) {
            translatorCustomFirebaseEvents.settingScreenM();
        }
        ExtensionFunction.INSTANCE.openLink(this$0, "https://play.google.com/store/apps/details?id=com.screenmirroring.mirror.castontv");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$14$lambda$12(SettingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TranslatorCustomFirebaseEvents translatorCustomFirebaseEvents = this$0.clickEventsFirebase;
        if (translatorCustomFirebaseEvents != null) {
            translatorCustomFirebaseEvents.settingAreaCal();
        }
        ExtensionFunction.INSTANCE.openLink(this$0, "https://play.google.com/store/apps/details?id=pixler.gps.area.measurement");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$14$lambda$13(SettingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ExtensionFunction.INSTANCE.openLink(this$0, "https://play.google.com/store/apps/details?id=com.ta.web.tool.scan.accounts");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @Deprecated(message = "Deprecated in Java")
    public void onBackPressed() {
        finish();
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }
}
