package P3;

import J1.c;
import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale;
import u0.C0675e;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final C0675e f1876a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1877b;

    public a(Context context, C0675e c0675e) {
        c cVar = new c(23, this);
        this.f1877b = context;
        this.f1876a = c0675e;
        c0675e.f5976c = cVar;
    }

    public static Locale a(String str) {
        Locale.Builder builder = new Locale.Builder();
        String[] split = str.replace('_', '-').split("-");
        builder.setLanguage(split[0]);
        int i7 = 1;
        if (split.length > 1 && split[1].length() == 4) {
            builder.setScript(split[1]);
            i7 = 2;
        }
        if (split.length > i7 && split[i7].length() >= 2 && split[i7].length() <= 3) {
            builder.setRegion(split[i7]);
        }
        return builder.build();
    }

    public final void b(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        int size = locales.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(locales.get(i8));
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        while (i7 < size2) {
            Object obj = arrayList.get(i7);
            i7++;
            Locale locale = (Locale) obj;
            locale.getLanguage();
            locale.getCountry();
            locale.getVariant();
            arrayList2.add(locale.getLanguage());
            arrayList2.add(locale.getCountry());
            arrayList2.add(locale.getScript());
            arrayList2.add(locale.getVariant());
        }
        ((B0.c) this.f1876a.f5975b).q("setLocale", arrayList2, null);
    }
}
