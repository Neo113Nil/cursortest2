package x0;

import I.C0079n;
import P.O;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import m0.AbstractActivityC0264d;
import n0.d;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0332a {

    /* renamed from: a, reason: collision with root package name */
    public final O f3589a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractActivityC0264d f3590b;

    public C0332a(AbstractActivityC0264d abstractActivityC0264d, O o2) {
        d dVar = new d(20, this);
        this.f3590b = abstractActivityC0264d;
        this.f3589a = o2;
        o2.f876g = dVar;
    }

    public static Locale a(String str) {
        String str2;
        String[] split = str.replace('_', '-').split("-", -1);
        String str3 = split[0];
        String str4 = "";
        int i2 = 1;
        if (split.length <= 1 || split[1].length() != 4) {
            str2 = "";
        } else {
            str2 = split[1];
            i2 = 2;
        }
        if (split.length > i2 && split[i2].length() >= 2 && split[i2].length() <= 3) {
            str4 = split[i2];
        }
        return new Locale(str3, str4, str2);
    }

    public final void b(Configuration configuration) {
        LocaleList locales;
        int size;
        Locale locale;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            locales = configuration.getLocales();
            size = locales.size();
            for (int i2 = 0; i2 < size; i2++) {
                locale = locales.get(i2);
                arrayList.add(locale);
            }
        } else {
            arrayList.add(configuration.locale);
        }
        O o2 = this.f3589a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Locale locale2 = (Locale) it.next();
            locale2.getLanguage();
            locale2.getCountry();
            locale2.getVariant();
            arrayList2.add(locale2.getLanguage());
            arrayList2.add(locale2.getCountry());
            arrayList2.add(locale2.getScript());
            arrayList2.add(locale2.getVariant());
        }
        ((C0079n) o2.f875f).f("setLocale", arrayList2, null);
    }
}
