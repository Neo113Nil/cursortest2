package t4;

import P0.c;
import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale;
import l4.b;
import s4.q;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final c f8011a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f8012b;

    public a(Context context, c cVar) {
        b bVar = new b(21, this);
        this.f8012b = context;
        this.f8011a = cVar;
        cVar.f2190i = bVar;
    }

    public static Locale a(String str) {
        Locale.Builder builder = new Locale.Builder();
        String[] split = str.replace('_', '-').split("-");
        builder.setLanguage(split[0]);
        int i2 = 1;
        if (split.length > 1 && split[1].length() == 4) {
            builder.setScript(split[1]);
            i2 = 2;
        }
        if (split.length > i2 && split[i2].length() >= 2 && split[i2].length() <= 3) {
            builder.setRegion(split[i2]);
        }
        return builder.build();
    }

    public final void b(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        int size = locales.size();
        int i2 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(locales.get(i5));
        }
        c cVar = this.f8011a;
        cVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            i2++;
            Locale locale = (Locale) obj;
            locale.getLanguage();
            locale.getCountry();
            locale.getVariant();
            arrayList2.add(locale.getLanguage());
            arrayList2.add(locale.getCountry());
            arrayList2.add(locale.getScript());
            arrayList2.add(locale.getVariant());
        }
        ((q) cVar.f2189e).a("setLocale", arrayList2, null);
    }
}
