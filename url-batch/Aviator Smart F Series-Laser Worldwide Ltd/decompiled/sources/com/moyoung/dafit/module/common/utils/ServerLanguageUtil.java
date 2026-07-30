package com.moyoung.dafit.module.common.utils;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.moyoung.dafit.module.common.network.model.ServerLanguageBean;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public class ServerLanguageUtil {
    public static final String DEFAULT_SERVER_LANGUAGE_CODE_JSON = "[{\"code\":\"en\",\"text\":\"English\",\"cmd\":0},{\"code\":\"zh-CN\",\"text\":\"\\u7b80\\u4f53\\u4e2d\\u6587\",\"cmd\":1},{\"code\":\"ja\",\"text\":\"\\u65e5\\u672c\\u8a9e\",\"cmd\":2},{\"code\":\"ko\",\"text\":\"\\ud55c\\uad6d\\uc5b4\",\"cmd\":3},{\"code\":\"de\",\"text\":\"Deutsch\",\"cmd\":4},{\"code\":\"fr\",\"text\":\"Fran\\u00e7ais\",\"cmd\":5},{\"code\":\"es\",\"text\":\"Espa\\u00f1ol\",\"cmd\":6},{\"code\":\"ar\",\"text\":\"\\u0627\\u0644\\u0639\\u0631\\u0628\\u064a\\u0629\",\"cmd\":7},{\"code\":\"ru\",\"text\":\"\\u0420\\u0443\\u0441\\u0441\\u043a\\u0438\\u0439\",\"cmd\":8},{\"code\":\"zh-TW\",\"text\":\"\\u7e41\\u9ad4\\u4e2d\\u6587\",\"cmd\":9},{\"code\":\"uk\",\"text\":\"\\u0423\\u043a\\u0440\\u0430\\u0457\\u043d\\u0441\\u044c\\u043a\\u0430\",\"cmd\":10},{\"code\":\"it\",\"text\":\"Italiano\",\"cmd\":11},{\"code\":\"pt\",\"text\":\"Portugu\\u00eas\",\"cmd\":12},{\"code\":\"nl\",\"text\":\"Nederlands\",\"cmd\":13},{\"code\":\"pl\",\"text\":\"Polski\",\"cmd\":14},{\"code\":\"sv\",\"text\":\"Svenska\",\"cmd\":15},{\"code\":\"fi\",\"text\":\"Suomalainen\",\"cmd\":16},{\"code\":\"da\",\"text\":\"Dansk\",\"cmd\":17},{\"code\":\"nb\",\"text\":\"Norsk\",\"cmd\":18},{\"code\":\"hu\",\"text\":\"Magyar\",\"cmd\":19},{\"code\":\"cs\",\"text\":\"\\u010cesky\",\"cmd\":20},{\"code\":\"bg\",\"text\":\"\\u0431\\u044a\\u043b\\u0433\\u0430\\u0440\\u0441\\u043a\\u0438\",\"cmd\":21},{\"code\":\"ro\",\"text\":\"Rom\\u00e2nesc\",\"cmd\":22},{\"code\":\"sk\",\"text\":\"Slovenski\",\"cmd\":23},{\"code\":\"lv\",\"text\":\"Latvie\\u0161u\",\"cmd\":24},{\"code\":\"id\",\"text\":\"Indonesia\",\"cmd\":25},{\"code\":\"th\",\"text\":\"\\u0e44\\u0e17\\u0e22\",\"cmd\":26},{\"code\":\"tr\",\"text\":\"T\\u00fcrk\\u00e7e\",\"cmd\":27},{\"code\":\"vi\",\"text\":\"Ti\\u1ebfng Vi\\u1ec7t\",\"cmd\":28},{\"code\":\"hi\",\"text\":\"Hind\\u012b\",\"cmd\":29},{\"code\":\"ps\",\"text\":\"\\u067e\\u069a\\u062a\\u0648\",\"cmd\":30},{\"code\":\"lt\",\"text\":\"Lietuvi\\u0161kai\",\"cmd\":31},{\"code\":\"ee\",\"text\":\"Eesti\",\"cmd\":32},{\"code\":\"sl\",\"text\":\"Slovensko\",\"cmd\":33},{\"code\":\"hr\",\"text\":\"Hrvatski\",\"cmd\":34},{\"code\":\"el\",\"text\":\"\\u0395\\u03bb\\u03bb\\u03b7\\u03bd\\u03b9\\u03ba\\u03ac\",\"cmd\":35},{\"code\":\"fil\",\"text\":\"Pilipino\",\"cmd\":36},{\"code\":\"he\",\"text\":\"\\u05e2\\u05d1\\u05e8\\u05d9\\u05ea\",\"cmd\":37},{\"code\":\"ms\",\"text\":\"Melayu\",\"cmd\":38},{\"code\":\"sr\",\"text\":\"Srpski\",\"cmd\":39},{\"code\":\"fa\",\"text\":\"\\u0641\\u0627\\u0631\\u0633\\u06cc\",\"cmd\":40},{\"code\":\"mn\",\"text\":\"\\u041c\\u043e\\u043d\\u0433\\u043e\\u043b \\u0445\\u044d\\u043b\",\"cmd\":41},{\"code\":\"mm\",\"text\":\"Burma\",\"cmd\":42},{\"code\":\"ka\",\"text\":\"\\u10e5\\u10d0\\u10e0\\u10d7\\u10e3\\u10da\\u10d8 \\u10d3\\u10d0\\u10db\\u10ec\\u10d4\\u10e0\\u10da\\u10dd\\u10d1\\u10d0\",\"cmd\":43}]";
    public static final String KEY_SERVER_LANGUAGE_CODE_JSON = "key_server_language_code_json";
    public static String serverLanguageJson;

    public static String getRequestLanguage() {
        String systemLanguageForServer = getSystemLanguageForServer();
        List<ServerLanguageBean> serverLanguageList = getServerLanguageList();
        if (serverLanguageList == null || serverLanguageList.size() == 0) {
            return Locale.ENGLISH.getLanguage();
        }
        Iterator<ServerLanguageBean> it = serverLanguageList.iterator();
        while (it.hasNext()) {
            if (systemLanguageForServer.equals(it.next().getCode())) {
                return systemLanguageForServer;
            }
        }
        return Locale.ENGLISH.getLanguage();
    }

    @Nullable
    private static List<ServerLanguageBean> getServerLanguageList() {
        if (TextUtils.isEmpty(serverLanguageJson)) {
            serverLanguageJson = com.moyoung.dafit.module.common.network.provider.g.getInstance().getString(KEY_SERVER_LANGUAGE_CODE_JSON, DEFAULT_SERVER_LANGUAGE_CODE_JSON);
        }
        return (List) new Gson().fromJson(serverLanguageJson, new TypeToken<List<ServerLanguageBean>>() { // from class: com.moyoung.dafit.module.common.utils.ServerLanguageUtil.1
        }.getType());
    }

    private static String getSystemLanguageForServer() {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        if (!"zh".equals(language)) {
            return language;
        }
        String country = locale.getCountry();
        return ("HK".equals(country) || "TW".equals(country)) ? "zh-TW" : "zh-CN";
    }
}
