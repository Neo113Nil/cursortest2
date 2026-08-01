package dev.cct.translatorapp.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.LanguageListModel;
import dev.cct.translatorapp.dataModel.LanguageModel;
import dev.cct.translatorapp.dataModel.PhrasebookModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExtensionFunction.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0010\u001a\u00020\u0011*\u00020\u0012\u001a\n\u0010\u0013\u001a\u00020\u0011*\u00020\u0014\u001a\n\u0010\u0015\u001a\u00020\u0011*\u00020\u0012\u001a\u0016\u0010\u0016\u001a\u00020\u0011*\u00020\u00172\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0019\u001a\n\u0010\u001a\u001a\u00020\u0011*\u00020\u0012\"*\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\"*\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0001j\b\u0012\u0004\u0012\u00020\t`\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0005\"\u0004\b\u000b\u0010\u0007\"*\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0001j\b\u0012\u0004\u0012\u00020\r`\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0005\"\u0004\b\u000f\u0010\u0007¨\u0006\u001b"}, d2 = {"appLanguageList", "Ljava/util/ArrayList;", "Ldev/cct/translatorapp/dataModel/LanguageModel;", "Lkotlin/collections/ArrayList;", "getAppLanguageList", "()Ljava/util/ArrayList;", "setAppLanguageList", "(Ljava/util/ArrayList;)V", "categoryList", "Ldev/cct/translatorapp/dataModel/PhrasebookModel;", "getCategoryList", "setCategoryList", "translateLangList", "Ldev/cct/translatorapp/LanguageListModel;", "getTranslateLangList", "setTranslateLangList", "hide", "", "Landroid/view/View;", "hideNavigationBar", "Landroid/app/Activity;", "invisible", "openActivity", "Landroid/content/Context;", "activityClass", "Ljava/lang/Class;", "show", "Translator_1.0.32_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExtensionFunctionKt {
    private static ArrayList<LanguageModel> appLanguageList = CollectionsKt.arrayListOf(new LanguageModel(R.drawable.united_states, R.string.english, "United states", "en"), new LanguageModel(R.drawable.united_kingdom, R.string.english, "United Kingdom", "en_gb"), new LanguageModel(R.drawable.spain, R.string.spanish, "Española", "es"), new LanguageModel(R.drawable.saudi_arabia, R.string.arabic, "عربي", "ar"), new LanguageModel(R.drawable.indonesia, R.string.indonesian, "Bahasa Indonesia", "in"), new LanguageModel(R.drawable.russia, R.string.russian, "Русский", "ru"), new LanguageModel(R.drawable.france, R.string.french, "Français", "fr"), new LanguageModel(R.drawable.china, R.string.chinese, "中文", "zh"), new LanguageModel(R.drawable.vietnam, R.string.vietnamese, "Tiếng Việt", "vi"), new LanguageModel(R.drawable.portugal, R.string.portuguese, "Português", "pt"), new LanguageModel(R.drawable.japan, R.string.japanese, "日本語", "ja"), new LanguageModel(R.drawable.turkey, R.string.turkish, "Türkçe", "tr"), new LanguageModel(R.drawable.south_korea, R.string.korean, "한국어", "ko"), new LanguageModel(R.drawable.philippines, R.string.filipino, "Filipino", "fil"), new LanguageModel(R.drawable.iran, R.string.persian, "فارسی", "fa"));
    private static ArrayList<LanguageListModel> translateLangList = CollectionsKt.arrayListOf(new LanguageListModel(R.string.choose_language, "", ""), new LanguageListModel(R.string.afrikaans, "Afrikaans", "af"), new LanguageListModel(R.string.Albanian, "Shqip", "sq"), new LanguageListModel(R.string.arabic, "العربية", "ar"), new LanguageListModel(R.string.Armenian, "Հայերեն", "hy"), new LanguageListModel(R.string.Azerbaijani, "Azərbaycan dili", "az"), new LanguageListModel(R.string.Basque, "Euskara", "eu"), new LanguageListModel(R.string.Belarusian, "Беларуская", "be"), new LanguageListModel(R.string.Bengali, "বাংলা", "bn"), new LanguageListModel(R.string.Bosnian, "Bosanski", "bs"), new LanguageListModel(R.string.Bulgarian, "Български", "bg"), new LanguageListModel(R.string.chinese, "简体中文", "zh-CN"), new LanguageListModel(R.string.ChineseTraditional, "繁體中文", "zh-TW"), new LanguageListModel(R.string.Corsican, "Corsu", "co"), new LanguageListModel(R.string.Croatian, "Hrvatski", "hr"), new LanguageListModel(R.string.Czech, "Čeština", "cs"), new LanguageListModel(R.string.Danish, "Dansk", "da"), new LanguageListModel(R.string.Dutch, "Nederlands", "nl"), new LanguageListModel(R.string.english, "English", "en"), new LanguageListModel(R.string.Esperanto, "Esperanto", "eo"), new LanguageListModel(R.string.Estonian, "Eesti", "et"), new LanguageListModel(R.string.Finnish, "Suomi", "fi"), new LanguageListModel(R.string.french, "Français", "fr"), new LanguageListModel(R.string.Frisian, "Frysk", "fy"), new LanguageListModel(R.string.Galician, "Galego", "gl"), new LanguageListModel(R.string.Georgian, "ქართული", "ka"), new LanguageListModel(R.string.German, "Deutsch", "de"), new LanguageListModel(R.string.Greek, "Ελληνικά", "ht"), new LanguageListModel(R.string.Gujarati, "ગુજરાતી", "gu"), new LanguageListModel(R.string.Hawaiian, "ʻŌlelo Hawaiʻi", "iw"), new LanguageListModel(R.string.Hebrew, "עברית", "he"), new LanguageListModel(R.string.Hindi, "हिन्दी", "hi"), new LanguageListModel(R.string.Hmong, "Hmong", "hmn"), new LanguageListModel(R.string.Hungarian, "Magyar", "hu"), new LanguageListModel(R.string.Icelandic, "Íslenska", "is"), new LanguageListModel(R.string.indonesian, "Bahasa Indonesia", FacebookMediationAdapter.KEY_ID), new LanguageListModel(R.string.Irish, "Gaeilge", "ga"), new LanguageListModel(R.string.Italian, "Italiano", "it"), new LanguageListModel(R.string.japanese, "日本語", "ja"), new LanguageListModel(R.string.Javanese, "Jawa", "jw"), new LanguageListModel(R.string.Kannada, "ಕನ್ನಡ", "kn"), new LanguageListModel(R.string.Kazakh, "Қазақ тілі", "kk"), new LanguageListModel(R.string.korean, "한국어", "ko"), new LanguageListModel(R.string.Kurdish, "Kurdî", "ku"), new LanguageListModel(R.string.Kyrgyz, "Кыргызча", "ky"), new LanguageListModel(R.string.Lao, "ລາວ", "lo"), new LanguageListModel(R.string.Latin, "Latina", "la"), new LanguageListModel(R.string.Latvian, "Latviešu", "lv"), new LanguageListModel(R.string.Lithuanian, "Lietuvių", "lt"), new LanguageListModel(R.string.Luxembourgish, "Lëtzebuergesch", "lb"), new LanguageListModel(R.string.Macedonian, "Македонски", "mk"), new LanguageListModel(R.string.Malagasy, "Malagasy", "mg"), new LanguageListModel(R.string.Malay, "Bahasa Melayu", "ms"), new LanguageListModel(R.string.Malayalam, "മലയാളം", "ml"), new LanguageListModel(R.string.Maori, "Māori", "mi"), new LanguageListModel(R.string.Marathi, "मराठी", "mr"), new LanguageListModel(R.string.Mongolian, "Монгол", "mn"), new LanguageListModel(R.string.Nepali, "नेपाली", "ne"), new LanguageListModel(R.string.Norwegian, "Norsk", "no"), new LanguageListModel(R.string.Pashto, "پښتو", "ps"), new LanguageListModel(R.string.persian, "فارسی", "fa"), new LanguageListModel(R.string.Polish, "Polski", "pl"), new LanguageListModel(R.string.portuguese, "Português", "pt"), new LanguageListModel(R.string.Punjabi, "ਪੰਜਾਬੀ", "pa"), new LanguageListModel(R.string.Romanian, "Română", "ro"), new LanguageListModel(R.string.russian, "Русский", "ru"), new LanguageListModel(R.string.Samoan, "Gagana Samoa", "sm"), new LanguageListModel(R.string.Serbian, "Српски", "sr"), new LanguageListModel(R.string.Sesotho, "Sesotho", "st"), new LanguageListModel(R.string.Shona, "Shona", "sn"), new LanguageListModel(R.string.Sindhi, "سنڌي", "sd"), new LanguageListModel(R.string.Sinhala, "සිංහල", "si"), new LanguageListModel(R.string.Slovak, "Slovenčina", "sk"), new LanguageListModel(R.string.Slovenian, "Slovenščina", "sl"), new LanguageListModel(R.string.Somali, "Soomaali", "so"), new LanguageListModel(R.string.Spanish, "Español", "es"), new LanguageListModel(R.string.Swahili, "Kiswahili", "sw"), new LanguageListModel(R.string.Swedish, "Svenska", "sv"), new LanguageListModel(R.string.Tajik, "Тоҷикӣ", "tg"), new LanguageListModel(R.string.Tamil, "தமிழ்", "ta"), new LanguageListModel(R.string.Telugu, "తెలుగు", "te"), new LanguageListModel(R.string.Thai, "ไทย", "th"), new LanguageListModel(R.string.Turkish, "Türkçe", "tr"), new LanguageListModel(R.string.Ukrainian, "Українська", "uk"), new LanguageListModel(R.string.Urdu, "اردو", "ur"), new LanguageListModel(R.string.Uzbek, "Oʻzbekcha", "uz"), new LanguageListModel(R.string.Vietnamese, "Tiếng Việt", "vi"), new LanguageListModel(R.string.Xhosa, "isiXhosa", "xh"), new LanguageListModel(R.string.Yiddish, "ייִדיש", "yi"), new LanguageListModel(R.string.Yoruba, "Yorùbá", "yo"), new LanguageListModel(R.string.Zulu, "isiZulu", "zu"));
    private static ArrayList<PhrasebookModel> categoryList = CollectionsKt.arrayListOf(new PhrasebookModel(R.drawable.essential_icon, "Essentials", "general_p.json"), new PhrasebookModel(R.drawable.traveling_icon, "Travelling", "travelling_p.json"), new PhrasebookModel(R.drawable.market_icon, "In the Market", "market_p.json"), new PhrasebookModel(R.drawable.time___date_icon, "Time and Date", "datetime_p.json"), new PhrasebookModel(R.drawable.hospital_icon, "In Hospital", "hospital_p.json"), new PhrasebookModel(R.drawable.technology_icon, "Technology", "technology_p.json"), new PhrasebookModel(R.drawable.airport_icon, "On Airport", "airport_p.json"), new PhrasebookModel(R.drawable.emergency_icon, "Emergency", "emergency_p.json"), new PhrasebookModel(R.drawable.police_station_icon, "Police Station", "policestation_p.json"), new PhrasebookModel(R.drawable.meal_icon, "Meal Time", "meal_p.json"), new PhrasebookModel(R.drawable.public_ofc, "Public Offices", "public_p.json"));

    public static final ArrayList<LanguageModel> getAppLanguageList() {
        return appLanguageList;
    }

    public static final void setAppLanguageList(ArrayList<LanguageModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        appLanguageList = arrayList;
    }

    public static final ArrayList<LanguageListModel> getTranslateLangList() {
        return translateLangList;
    }

    public static final void setTranslateLangList(ArrayList<LanguageListModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        translateLangList = arrayList;
    }

    public static final ArrayList<PhrasebookModel> getCategoryList() {
        return categoryList;
    }

    public static final void setCategoryList(ArrayList<PhrasebookModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        categoryList = arrayList;
    }

    public static final void openActivity(Context context, Class<?> activityClass) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(activityClass, "activityClass");
        context.startActivity(new Intent(context, activityClass));
    }

    public static final void hideNavigationBar(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        activity.getWindow().getDecorView().setSystemUiVisibility(4098);
    }

    public static final void hide(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(8);
    }

    public static final void invisible(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(4);
    }

    public static final void show(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(0);
    }
}
