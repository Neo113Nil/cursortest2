package com.crrepa.band.my.device.ai.helper;

import android.os.Build;
import android.text.TextUtils;
import com.artillery.ctc.CtHelper;
import com.artillery.ctc.base.FunctionType;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.u;
import com.moyoung.dafit.module.common.utils.x0;
import f6.l;
import java.util.Arrays;
import java.util.Locale;
import y5.w;

/* loaded from: classes2.dex */
public class g {
    private static final String AI_CHANNEL = "67we45swch45dqt2";
    public static final String KEY_IS_HUAQIAO_MAC_AUTHORIZED = "is_mac_authorized";
    private static final String[] supportedLanguages = {u.LANGUAGE_AR, "bg", "bn", "bs", "cs", "da", u.LANGUAGE_DE, "el", "en", u.LANGUAGE_ES, "et", "fa", "fi", "fil", u.LANGUAGE_FR, u.LANGUAGE_KO, "ga", "gl", "hi", "hr", "hu", "id", u.LANGUAGE_IT, u.LANGUAGE_JA, "jv", "ka", "lo", "lt", "lv", "ms", "my", "nl", "pl", u.LANGUAGE_PT, "ro", u.LANGUAGE_RU, "sk", "sl", "sv", "th", "tr", u.LANGUAGE_TR, "uz", "vi", "zh"};

    public static String getAISupportedLanguageCode() {
        Locale locale;
        Locale.Category category;
        if (Build.VERSION.SDK_INT >= 24) {
            category = Locale.Category.DISPLAY;
            locale = Locale.getDefault(category);
        } else {
            locale = Locale.getDefault();
        }
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if (!x0.isNotEmpty(language) || !x0.isNotEmpty(country)) {
            return "en-US";
        }
        return language + "-" + country;
    }

    public static void initMagic() {
        String address = com.crrepa.band.my.ble.band.utils.a.getInstance().getAddress();
        if (TextUtils.isEmpty(address)) {
            return;
        }
        CtHelper.Companion companion = CtHelper.Companion;
        companion.get().setLogcatEnable(false);
        companion.get().initMagicWithParams(com.moyoung.dafit.module.common.utils.d.get(), address, AI_CHANNEL, FunctionType.AI, new l() { // from class: com.crrepa.band.my.device.ai.helper.e
            @Override // f6.l
            public final Object invoke(Object obj) {
                w lambda$initMagic$0;
                lambda$initMagic$0 = g.lambda$initMagic$0((String) obj);
                return lambda$initMagic$0;
            }
        }, new l() { // from class: com.crrepa.band.my.device.ai.helper.f
            @Override // f6.l
            public final Object invoke(Object obj) {
                w lambda$initMagic$1;
                lambda$initMagic$1 = g.lambda$initMagic$1((Integer) obj);
                return lambda$initMagic$1;
            }
        });
    }

    public static boolean isMacAuthorized() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getBoolean(KEY_IS_HUAQIAO_MAC_AUTHORIZED, false);
    }

    public static boolean isMacUnauthorized() {
        return !isMacAuthorized();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ w lambda$initMagic$0(String str) {
        saveMacAuthorized(false);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ w lambda$initMagic$1(Integer num) {
        saveMacAuthorized(true);
        queryLargeModelList();
        return null;
    }

    private static void queryLargeModelList() {
        AIProvider.saveLargeModelList(CtHelper.Companion.get().queryLargeModelList());
    }

    public static void saveMacAuthorized(boolean z7) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putBoolean(KEY_IS_HUAQIAO_MAC_AUTHORIZED, z7);
    }

    public static void showMacUnauthorizedTips() {
        r0.showShort(com.moyoung.dafit.module.common.utils.d.get(), R.string.ai_mac_unauthorized_tips);
        initMagic();
    }

    public static String getAISupportedLanguageCode(boolean z7) {
        if (z7 && u.isTraditional()) {
            return "cht";
        }
        String localeLanguage = u.getLocaleLanguage();
        return localeLanguage.equals("in") ? "id" : Arrays.asList(supportedLanguages).contains(localeLanguage) ? localeLanguage : "en";
    }
}
