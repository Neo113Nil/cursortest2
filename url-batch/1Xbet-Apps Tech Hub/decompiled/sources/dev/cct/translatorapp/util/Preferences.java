package dev.cct.translatorapp.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.gms.ads.nativead.NativeAd;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Preferences.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b$\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010y\u001a\u0004\u0018\u00010?2\u0006\u0010z\u001a\u00020\u0006H\u0002J\u0010\u0010{\u001a\u00020\u00062\u0006\u0010|\u001a\u00020?H\u0002R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR(\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R$\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u0014R\u000e\u0010 \u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R$\u0010!\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014R\u000e\u0010$\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R$\u0010%\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010\u0012\"\u0004\b'\u0010\u0014R\u000e\u0010(\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R$\u0010+\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010\u0012\"\u0004\b-\u0010\u0014R\u000e\u0010.\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R$\u0010/\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001aR$\u00101\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001aR$\u00103\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010\u0018\"\u0004\b4\u0010\u001aR$\u00105\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010\u0018\"\u0004\b6\u0010\u001aR\u000e\u00107\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R$\u00109\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010\u0018\"\u0004\b:\u0010\u001aR$\u0010;\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010\u0018\"\u0004\b<\u0010\u001aR$\u0010=\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010\u0018\"\u0004\b>\u0010\u001aR(\u0010@\u001a\u0004\u0018\u00010?2\b\u0010\u0005\u001a\u0004\u0018\u00010?8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010D\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010\u0018\"\u0004\bE\u0010\u001aR$\u0010F\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010\u0018\"\u0004\bG\u0010\u001aR(\u0010H\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010\t\"\u0004\bJ\u0010\u000bR\u000e\u0010K\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R$\u0010L\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010\u0012\"\u0004\bN\u0010\u0014R\u000e\u0010O\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R$\u0010P\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010\u0012\"\u0004\bR\u0010\u0014R\u000e\u0010S\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R$\u0010T\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bU\u0010\u0012\"\u0004\bV\u0010\u0014R\u000e\u0010W\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020YX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010Z\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010\t\"\u0004\b\\\u0010\u000bR\u000e\u0010]\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R$\u0010_\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b`\u0010\u0012\"\u0004\ba\u0010\u0014R\u000e\u0010b\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R$\u0010c\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010\u0012\"\u0004\be\u0010\u0014R$\u0010f\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bg\u0010\u0012\"\u0004\bh\u0010\u0014R\u000e\u0010i\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R$\u0010j\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bk\u0010\u0012\"\u0004\bl\u0010\u0014R\u000e\u0010m\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R(\u0010n\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bo\u0010\t\"\u0004\bp\u0010\u000bR$\u0010q\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\br\u0010\u0012\"\u0004\bs\u0010\u0014R\u000e\u0010t\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R$\u0010u\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bv\u0010\u0012\"\u0004\bw\u0010\u0014R\u000e\u0010x\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006}"}, d2 = {"Ldev/cct/translatorapp/util/Preferences;", "", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "value", "", "appCurrentLang", "getAppCurrentLang", "()Ljava/lang/String;", "setAppCurrentLang", "(Ljava/lang/String;)V", "appLang", "getAppLang", "setAppLang", "", "appSelectedLang", "getAppSelectedLang", "()I", "setAppSelectedLang", "(I)V", "", "checkBillingStatus", "getCheckBillingStatus", "()Z", "setCheckBillingStatus", "(Z)V", "checkStatusWidget", "checkTutorialStatus", "conInputLang", "getConInputLang", "setConInputLang", "conInputLangKey", "conOutputLang", "getConOutputLang", "setConOutputLang", "conOutputLangKey", "count", "getCount", "setCount", "countKey", "currentLanguage", "firstTimeOpen", "inputLangWidget", "getInputLangWidget", "setInputLangWidget", "inputWidget", "isAdRequestNull", "setAdRequestNull", "isCheckLoadingV", "setCheckLoadingV", "isCollapsible", "setCollapsible", "isFirst", "setFirst", "isFirstKey", "isFirstTime", "isFirstTimeOpenAd", "setFirstTimeOpenAd", "isNoSelectedLang", "setNoSelectedLang", "isOpenTutorial", "setOpenTutorial", "Lcom/google/android/gms/ads/nativead/NativeAd;", "isPreviousNative", "()Lcom/google/android/gms/ads/nativead/NativeAd;", "setPreviousNative", "(Lcom/google/android/gms/ads/nativead/NativeAd;)V", "isShowRewardedAd", "setShowRewardedAd", "isWatchVideo", "setWatchVideo", "monthlyPrice", "getMonthlyPrice", "setMonthlyPrice", "nativeAdString", "outputLangWidget", "getOutputLangWidget", "setOutputLangWidget", "outputWidget", "phInputLang", "getPhInputLang", "setPhInputLang", "phInputLangKey", "phOutputLang", "getPhOutputLang", "setPhOutputLang", "phOutputLangKey", "preferences", "Landroid/content/SharedPreferences;", "quarterlyPrice", "getQuarterlyPrice", "setQuarterlyPrice", "selectedLang", "settingSelectedL", "settingSelectedLang", "getSettingSelectedLang", "setSettingSelectedLang", "speechLang", "speechToTextLang", "getSpeechToTextLang", "setSpeechToTextLang", "translateInput", "getTranslateInput", "setTranslateInput", "translateInputKey", "translateOutput", "getTranslateOutput", "setTranslateOutput", "translateOutputKey", "weeklyPrice", "getWeeklyPrice", "setWeeklyPrice", "widgetInputLang", "getWidgetInputLang", "setWidgetInputLang", "widgetInputLangKey", "widgetOutputLang", "getWidgetOutputLang", "setWidgetOutputLang", "widgetOutputLangKey", "deserializeNativeAd", "serializedData", "serializeNativeAd", "nativeAd", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Preferences {
    private final String checkStatusWidget;
    private final String checkTutorialStatus;
    private final String conInputLangKey;
    private final String conOutputLangKey;
    private final String countKey;
    private final String currentLanguage;
    private final String firstTimeOpen;
    private final String inputWidget;
    private final String isFirstKey;
    private final String isFirstTime;
    private final String nativeAdString;
    private final String outputWidget;
    private final String phInputLangKey;
    private final String phOutputLangKey;
    private final SharedPreferences preferences;
    private final String selectedLang;
    private final String settingSelectedL;
    private final String speechLang;
    private final String translateInputKey;
    private final String translateOutputKey;
    private final String widgetInputLangKey;
    private final String widgetOutputLangKey;

    public Preferences(Context mContext) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.selectedLang = "user_selected_lang";
        this.currentLanguage = "app_lang";
        this.settingSelectedL = "selected_lang";
        this.translateInputKey = "translate_input";
        this.translateOutputKey = "translate_output";
        this.speechLang = "speech_lang";
        this.phInputLangKey = "ph_input_lang";
        this.phOutputLangKey = "ph_output_lang";
        this.conInputLangKey = "con_input_lang";
        this.conOutputLangKey = "con_output_lang";
        this.widgetInputLangKey = "widget_input_lang";
        this.widgetOutputLangKey = "widget_output_lang";
        this.isFirstKey = "is_first";
        this.countKey = "app_open_count";
        this.inputWidget = "inputLangW";
        this.outputWidget = "outputLangW";
        this.checkStatusWidget = "check_widget_status";
        this.checkTutorialStatus = "check_widget_tutorials";
        this.nativeAdString = "native_ad_st";
        this.isFirstTime = "no_selection_ad";
        this.firstTimeOpen = "open_app_first";
        SharedPreferences sharedPreferences = mContext.getSharedPreferences("0", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "mContext.getSharedPrefer…    Context.MODE_PRIVATE)");
        this.preferences = sharedPreferences;
    }

    public final NativeAd isPreviousNative() {
        String string = this.preferences.getString(this.nativeAdString, null);
        if (string != null) {
            return deserializeNativeAd(string);
        }
        return null;
    }

    public final void setPreviousNative(NativeAd nativeAd) {
        if (nativeAd != null) {
            this.preferences.edit().putString(this.nativeAdString, serializeNativeAd(nativeAd)).apply();
        } else {
            this.preferences.edit().remove(this.nativeAdString).apply();
        }
    }

    public final int getInputLangWidget() {
        return this.preferences.getInt(this.inputWidget, 18);
    }

    public final void setInputLangWidget(int i) {
        this.preferences.edit().putInt(this.inputWidget, i).apply();
    }

    public final int getOutputLangWidget() {
        return this.preferences.getInt(this.outputWidget, 82);
    }

    public final void setOutputLangWidget(int i) {
        this.preferences.edit().putInt(this.outputWidget, i).apply();
    }

    public final int getTranslateInput() {
        return this.preferences.getInt(this.translateInputKey, 18);
    }

    public final void setTranslateInput(int i) {
        this.preferences.edit().putInt(this.translateInputKey, i).apply();
    }

    public final int getTranslateOutput() {
        return this.preferences.getInt(this.translateOutputKey, 75);
    }

    public final void setTranslateOutput(int i) {
        this.preferences.edit().putInt(this.translateOutputKey, i).apply();
    }

    public final int getSettingSelectedLang() {
        return this.preferences.getInt(this.settingSelectedL, 0);
    }

    public final void setSettingSelectedLang(int i) {
        this.preferences.edit().putInt(this.settingSelectedL, i).apply();
    }

    public final int getAppSelectedLang() {
        return this.preferences.getInt(this.selectedLang, 0);
    }

    public final void setAppSelectedLang(int i) {
        this.preferences.edit().putInt(this.selectedLang, i).apply();
    }

    public final String getAppLang() {
        return this.preferences.getString(this.currentLanguage, "en");
    }

    public final void setAppLang(String str) {
        this.preferences.edit().putString(this.currentLanguage, str).apply();
    }

    public final String getAppCurrentLang() {
        return this.preferences.getString("current_Language_name", "English");
    }

    public final void setAppCurrentLang(String str) {
        this.preferences.edit().putString("current_Language_name", str).apply();
    }

    public final int getSpeechToTextLang() {
        return this.preferences.getInt(this.speechLang, 18);
    }

    public final void setSpeechToTextLang(int i) {
        this.preferences.edit().putInt(this.speechLang, i).apply();
    }

    public final int getPhInputLang() {
        return this.preferences.getInt(this.phInputLangKey, 18);
    }

    public final void setPhInputLang(int i) {
        this.preferences.edit().putInt(this.phInputLangKey, i).apply();
    }

    public final int getPhOutputLang() {
        return this.preferences.getInt(this.phOutputLangKey, 75);
    }

    public final void setPhOutputLang(int i) {
        this.preferences.edit().putInt(this.phOutputLangKey, i).apply();
    }

    public final int getConInputLang() {
        return this.preferences.getInt(this.conInputLangKey, 18);
    }

    public final void setConInputLang(int i) {
        this.preferences.edit().putInt(this.conInputLangKey, i).apply();
    }

    public final int getConOutputLang() {
        return this.preferences.getInt(this.conOutputLangKey, 75);
    }

    public final void setConOutputLang(int i) {
        this.preferences.edit().putInt(this.conOutputLangKey, i).apply();
    }

    public final int getWidgetInputLang() {
        return this.preferences.getInt(this.widgetInputLangKey, 18);
    }

    public final void setWidgetInputLang(int i) {
        this.preferences.edit().putInt(this.widgetInputLangKey, i).apply();
    }

    public final int getWidgetOutputLang() {
        return this.preferences.getInt(this.widgetOutputLangKey, 82);
    }

    public final void setWidgetOutputLang(int i) {
        this.preferences.edit().putInt(this.widgetOutputLangKey, i).apply();
    }

    public final boolean isAdRequestNull() {
        return this.preferences.getBoolean("inters_request", false);
    }

    public final void setAdRequestNull(boolean z) {
        this.preferences.edit().putBoolean("inters_request", z).apply();
    }

    public final boolean isFirst() {
        return this.preferences.getBoolean(this.isFirstKey, true);
    }

    public final void setFirst(boolean z) {
        this.preferences.edit().putBoolean(this.isFirstKey, z).apply();
    }

    public final boolean isFirstTimeOpenAd() {
        return this.preferences.getBoolean(this.firstTimeOpen, true);
    }

    public final void setFirstTimeOpenAd(boolean z) {
        this.preferences.edit().putBoolean(this.firstTimeOpen, z).apply();
    }

    public final int getCount() {
        return this.preferences.getInt(this.countKey, 1);
    }

    public final void setCount(int i) {
        this.preferences.edit().putInt(this.countKey, i).apply();
    }

    public final boolean isCheckLoadingV() {
        return this.preferences.getBoolean("loadText", false);
    }

    public final void setCheckLoadingV(boolean z) {
        this.preferences.edit().putBoolean("loadText", z).apply();
    }

    public final boolean isShowRewardedAd() {
        return this.preferences.getBoolean("rewarded_floating", false);
    }

    public final void setShowRewardedAd(boolean z) {
        this.preferences.edit().putBoolean("rewarded_floating", z).apply();
    }

    public final boolean isWatchVideo() {
        return this.preferences.getBoolean(this.checkStatusWidget, false);
    }

    public final void setWatchVideo(boolean z) {
        this.preferences.edit().putBoolean(this.checkStatusWidget, z).apply();
    }

    public final boolean isNoSelectedLang() {
        return this.preferences.getBoolean(this.isFirstTime, true);
    }

    public final void setNoSelectedLang(boolean z) {
        this.preferences.edit().putBoolean(this.isFirstTime, z).apply();
    }

    public final boolean isOpenTutorial() {
        return this.preferences.getBoolean(this.checkTutorialStatus, true);
    }

    public final void setOpenTutorial(boolean z) {
        this.preferences.edit().putBoolean(this.checkTutorialStatus, z).apply();
    }

    public final boolean getCheckBillingStatus() {
        return this.preferences.getBoolean("purchase_status", false);
    }

    public final void setCheckBillingStatus(boolean z) {
        this.preferences.edit().putBoolean("purchase_status", z).apply();
    }

    public final String getWeeklyPrice() {
        return this.preferences.getString("weekly_Price", "");
    }

    public final void setWeeklyPrice(String str) {
        this.preferences.edit().putString("weekly_Price", str).apply();
    }

    public final String getMonthlyPrice() {
        return this.preferences.getString("monthly_Price", "");
    }

    public final void setMonthlyPrice(String str) {
        this.preferences.edit().putString("monthly_Price", str).apply();
    }

    public final String getQuarterlyPrice() {
        return this.preferences.getString("quarterly_Price", "");
    }

    public final void setQuarterlyPrice(String str) {
        this.preferences.edit().putString("quarterly_Price", str).apply();
    }

    public final boolean isCollapsible() {
        return this.preferences.getBoolean("collapsibleBanner", true);
    }

    public final void setCollapsible(boolean z) {
        this.preferences.edit().putBoolean("collapsibleBanner", z).apply();
    }

    private final String serializeNativeAd(NativeAd nativeAd) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new ObjectOutputStream(byteArrayOutputStream).writeObject(nativeAd);
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(byteArray…eArray(), Base64.DEFAULT)");
        return encodeToString;
    }

    private final NativeAd deserializeNativeAd(String serializedData) {
        try {
            Object readObject = new ObjectInputStream(new ByteArrayInputStream(Base64.decode(serializedData, 0))).readObject();
            Intrinsics.checkNotNull(readObject, "null cannot be cast to non-null type com.google.android.gms.ads.nativead.NativeAd");
            return (NativeAd) readObject;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
