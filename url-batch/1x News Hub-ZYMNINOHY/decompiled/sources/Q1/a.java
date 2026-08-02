package Q1;

import E1.AbstractActivityC0029e;
import P1.o;
import V0.e;
import android.content.res.Configuration;
import android.os.LocaleList;
import b0.C0178i;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final e f1281a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractActivityC0029e f1282b;

    public a(AbstractActivityC0029e abstractActivityC0029e, e eVar) {
        C0178i c0178i = new C0178i(22, this);
        this.f1282b = abstractActivityC0029e;
        this.f1281a = eVar;
        eVar.f1600c = c0178i;
    }

    public static Locale a(String str) {
        Locale.Builder builder = new Locale.Builder();
        String[] split = str.replace('_', '-').split(TokenBuilder.TOKEN_DELIMITER);
        builder.setLanguage(split[0]);
        int i3 = 1;
        if (split.length > 1 && split[1].length() == 4) {
            builder.setScript(split[1]);
            i3 = 2;
        }
        if (split.length > i3 && split[i3].length() >= 2 && split[i3].length() <= 3) {
            builder.setRegion(split[i3]);
        }
        return builder.build();
    }

    public final void b(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        int size = locales.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(locales.get(i3));
        }
        e eVar = this.f1281a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Locale locale = (Locale) it.next();
            locale.getLanguage();
            locale.getCountry();
            locale.getVariant();
            arrayList2.add(locale.getLanguage());
            arrayList2.add(locale.getCountry());
            arrayList2.add(locale.getScript());
            arrayList2.add(locale.getVariant());
        }
        ((o) eVar.f1599b).a("setLocale", arrayList2, null);
    }
}
