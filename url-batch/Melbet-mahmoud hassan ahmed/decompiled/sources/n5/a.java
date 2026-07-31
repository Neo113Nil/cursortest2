package n5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import l5.f;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final f f19633a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f19634b;

    /* renamed from: c, reason: collision with root package name */
    @SuppressLint({"AppBundleLocaleChanges"})
    final f.b f19635c;

    /* renamed from: n5.a$a, reason: collision with other inner class name */
    class C0114a implements f.b {
        C0114a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
        @Override // l5.f.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String a(String str, String str2) {
            Locale locale;
            Context context = a.this.f19634b;
            if (str2 != null) {
                Locale b7 = a.b(str2);
                if (Build.VERSION.SDK_INT < 17) {
                    Resources resources = a.this.f19634b.getResources();
                    Configuration configuration = resources.getConfiguration();
                    locale = configuration.locale;
                    configuration.locale = b7;
                    resources.updateConfiguration(configuration, null);
                    int identifier = context.getResources().getIdentifier(str, "string", a.this.f19634b.getPackageName());
                    String string = identifier == 0 ? context.getResources().getString(identifier) : null;
                    if (str2 != null && Build.VERSION.SDK_INT < 17) {
                        Resources resources2 = a.this.f19634b.getResources();
                        Configuration configuration2 = resources2.getConfiguration();
                        configuration2.locale = locale;
                        resources2.updateConfiguration(configuration2, null);
                    }
                    return string;
                }
                Configuration configuration3 = new Configuration(a.this.f19634b.getResources().getConfiguration());
                configuration3.setLocale(b7);
                context = a.this.f19634b.createConfigurationContext(configuration3);
            }
            locale = null;
            int identifier2 = context.getResources().getIdentifier(str, "string", a.this.f19634b.getPackageName());
            if (identifier2 == 0) {
            }
            if (str2 != null) {
                Resources resources22 = a.this.f19634b.getResources();
                Configuration configuration22 = resources22.getConfiguration();
                configuration22.locale = locale;
                resources22.updateConfiguration(configuration22, null);
            }
            return string;
        }
    }

    public a(Context context, f fVar) {
        C0114a c0114a = new C0114a();
        this.f19635c = c0114a;
        this.f19634b = context;
        this.f19633a = fVar;
        fVar.c(c0114a);
    }

    public static Locale b(String str) {
        String str2;
        String[] split = str.replace('_', '-').split("-", -1);
        String str3 = split[0];
        String str4 = "";
        int i7 = 1;
        if (split.length <= 1 || split[1].length() != 4) {
            str2 = "";
        } else {
            str2 = split[1];
            i7 = 2;
        }
        if (split.length > i7 && split[i7].length() >= 2 && split[i7].length() <= 3) {
            str4 = split[i7];
        }
        return new Locale(str3, str4, str2);
    }

    public Locale c(List<Locale> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            ArrayList arrayList = new ArrayList();
            LocaleList locales = this.f19634b.getResources().getConfiguration().getLocales();
            int size = locales.size();
            for (int i8 = 0; i8 < size; i8++) {
                Locale locale = locales.get(i8);
                String language = locale.getLanguage();
                if (!locale.getScript().isEmpty()) {
                    language = language + "-" + locale.getScript();
                }
                if (!locale.getCountry().isEmpty()) {
                    language = language + "-" + locale.getCountry();
                }
                arrayList.add(new Locale.LanguageRange(language));
                arrayList.add(new Locale.LanguageRange(locale.getLanguage()));
                arrayList.add(new Locale.LanguageRange(locale.getLanguage() + "-*"));
            }
            Locale lookup = Locale.lookup(arrayList, list);
            if (lookup != null) {
                return lookup;
            }
        } else if (i7 >= 24) {
            LocaleList locales2 = this.f19634b.getResources().getConfiguration().getLocales();
            for (int i9 = 0; i9 < locales2.size(); i9++) {
                Locale locale2 = locales2.get(i9);
                for (Locale locale3 : list) {
                    if (locale2.equals(locale3)) {
                        return locale3;
                    }
                }
                for (Locale locale4 : list) {
                    if (locale2.getLanguage().equals(locale4.toLanguageTag())) {
                        return locale4;
                    }
                }
                for (Locale locale5 : list) {
                    if (locale2.getLanguage().equals(locale5.getLanguage())) {
                        return locale5;
                    }
                }
            }
        } else {
            Locale locale6 = this.f19634b.getResources().getConfiguration().locale;
            if (locale6 != null) {
                for (Locale locale7 : list) {
                    if (locale6.equals(locale7)) {
                        return locale7;
                    }
                }
                for (Locale locale8 : list) {
                    if (locale6.getLanguage().equals(locale8.toString())) {
                        return locale8;
                    }
                }
            }
        }
        return list.get(0);
    }

    public void d(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList locales = configuration.getLocales();
            int size = locales.size();
            for (int i7 = 0; i7 < size; i7++) {
                arrayList.add(locales.get(i7));
            }
        } else {
            arrayList.add(configuration.locale);
        }
        this.f19633a.b(arrayList);
    }
}
