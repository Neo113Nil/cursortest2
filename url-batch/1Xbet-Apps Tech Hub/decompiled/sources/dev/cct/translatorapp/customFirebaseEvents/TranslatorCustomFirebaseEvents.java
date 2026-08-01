package dev.cct.translatorapp.customFirebaseEvents;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TranslatorCustomFirebaseEvents.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0016\u0018\u0000 (2\u00020\u0001:\u0001(B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0006J\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0019\u001a\u00020\u0006J\u0006\u0010\u001a\u001a\u00020\u0006J\u000e\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u001d\u001a\u00020\u0006J\u0006\u0010\u001e\u001a\u00020\u0006J\u0006\u0010\u001f\u001a\u00020\u0006J\u0006\u0010 \u001a\u00020\u0006J\u0006\u0010!\u001a\u00020\u0006J\u0006\u0010\"\u001a\u00020\u0006J\u0006\u0010#\u001a\u00020\u0006J\u0006\u0010$\u001a\u00020\u0006J\u0006\u0010%\u001a\u00020\u0006J\u0006\u0010&\u001a\u00020\u0006J\u0006\u0010'\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Ldev/cct/translatorapp/customFirebaseEvents/TranslatorCustomFirebaseEvents;", "", "firebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "(Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "deleteConversation", "", "exitDialogEvents", "floatingPro", "floatingTutorial", "homeConversation", "homeDictionary", "homeFloating", "homePhraseBook", "homeScreen", "homeSpeechToText", "homeToPremium", "inputLangC", "name", "", "inputLangT", "inputMicConversation", "langSTT", "micBtn", "micSTT", "offServices", "onServices", "outputLangC", "outputLangT", "outputMicConversation", "pasteBtn", "rewardedAdFloating", "settingAppLang", "settingAreaCal", "settingScreenM", "settingToPremium", "splashMain", "splashToAppLang", "splashToPremium", "translationBtn", "Companion", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TranslatorCustomFirebaseEvents {
    private static final String PARAMETER_NAME = "Click_Events";
    private static final String PARAMETER_SINGLE_EVENTS = "one_time";
    private final FirebaseAnalytics firebaseAnalytics;

    public TranslatorCustomFirebaseEvents(FirebaseAnalytics firebaseAnalytics) {
        Intrinsics.checkNotNullParameter(firebaseAnalytics, "firebaseAnalytics");
        this.firebaseAnalytics = firebaseAnalytics;
    }

    public final void homeScreen() {
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_SINGLE_EVENTS, "Home Screen");
        this.firebaseAnalytics.logEvent("translate_home", bundle);
    }

    public final void homeToPremium() {
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_NAME, "Home Screen");
        this.firebaseAnalytics.logEvent("home_to_premium", bundle);
    }

    public final void splashToPremium() {
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_NAME, "Splash Screen");
        this.firebaseAnalytics.logEvent("splash_to_premium", bundle);
    }

    public final void splashToAppLang() {
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_NAME, "Splash Screen");
        this.firebaseAnalytics.logEvent("splash_to_appLang", bundle);
    }

    public final void splashMain() {
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_NAME, "Splash Screen");
        this.firebaseAnalytics.logEvent("splash", bundle);
    }

    public final void homeConversation() {
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_NAME, "Home Screen");
        this.firebaseAnalytics.logEvent("conversation_home", bundle);
    }

    public final void homePhraseBook() {
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_NAME, "Home Screen");
        this.firebaseAnalytics.logEvent("phrase_home", bundle);
    }

    public final void homeSpeechToText() {
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_NAME, "Home Screen");
        this.firebaseAnalytics.logEvent("speech_home", bundle);
    }

    public final void homeDictionary() {
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_NAME, "Home Screen");
        this.firebaseAnalytics.logEvent("dictionary_home", bundle);
    }

    public final void homeFloating() {
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_NAME, "Home Screen");
        this.firebaseAnalytics.logEvent("floating_home", bundle);
    }

    public final void translationBtn() {
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_NAME, "Translation Screen");
        this.firebaseAnalytics.logEvent("translate_but", bundle);
    }

    public final void pasteBtn() {
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_NAME, "Translation Screen");
        this.firebaseAnalytics.logEvent("paste_but", bundle);
    }

    public final void micBtn() {
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_NAME, "Translation Screen");
        this.firebaseAnalytics.logEvent("mic_but", bundle);
    }

    public final void inputLangT(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_NAME, "Translation Screen");
        this.firebaseAnalytics.logEvent("trans_input_" + name, bundle);
    }

    public final void outputLangT(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_NAME, "Translation Screen");
        this.firebaseAnalytics.logEvent("trans_output_" + name, bundle);
    }

    public final void inputLangC(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_NAME, "Conversation Screen");
        this.firebaseAnalytics.logEvent("conver_input_" + name, bundle);
    }

    public final void outputLangC(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_NAME, "Conversation Screen");
        this.firebaseAnalytics.logEvent("conver_output_" + name, bundle);
    }

    public final void deleteConversation() {
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_NAME, "Conversation Screen");
        this.firebaseAnalytics.logEvent("delete_but", bundle);
    }

    public final void inputMicConversation() {
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_NAME, "Conversation Screen");
        this.firebaseAnalytics.logEvent("conver_input_mic", bundle);
    }

    public final void outputMicConversation() {
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_NAME, "Conversation Screen");
        this.firebaseAnalytics.logEvent("conver_output_mic", bundle);
    }

    public final void langSTT() {
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_NAME, "speech to text screen");
        this.firebaseAnalytics.logEvent("speech_mic", bundle);
    }

    public final void micSTT(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_NAME, "speech to text screen");
        this.firebaseAnalytics.logEvent("speech_lang_" + name, bundle);
    }

    public final void onServices() {
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_NAME, "Dictionary screen");
        this.firebaseAnalytics.logEvent("floating_on_but", bundle);
    }

    public final void offServices() {
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_NAME, "floating view screen");
        this.firebaseAnalytics.logEvent("floating_off_but", bundle);
    }

    public final void floatingTutorial() {
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_NAME, "floating view screen");
        this.firebaseAnalytics.logEvent("tutorial_but", bundle);
    }

    public final void floatingPro() {
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_NAME, "floating view screen");
        this.firebaseAnalytics.logEvent("pro_but", bundle);
    }

    public final void rewardedAdFloating() {
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_NAME, "floating view screen");
        this.firebaseAnalytics.logEvent("watchvideo_but", bundle);
    }

    public final void exitDialogEvents() {
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_NAME, "floating view screen");
        this.firebaseAnalytics.logEvent("exit_but", bundle);
    }

    public final void settingAppLang() {
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_NAME, "floating view screen");
        this.firebaseAnalytics.logEvent("app_languges", bundle);
    }

    public final void settingScreenM() {
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_NAME, "floating view screen");
        this.firebaseAnalytics.logEvent("screen_mirr_but", bundle);
    }

    public final void settingAreaCal() {
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_NAME, "setting screen");
        this.firebaseAnalytics.logEvent("areacal_but", bundle);
    }

    public final void settingToPremium() {
        Bundle bundle = new Bundle();
        bundle.getString(PARAMETER_NAME, "setting screen");
        this.firebaseAnalytics.logEvent("setting_premium", bundle);
    }
}
