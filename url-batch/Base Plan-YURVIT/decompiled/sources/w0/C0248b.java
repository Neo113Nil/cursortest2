package w0;

import B0.C0008i;
import N.P;
import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale;
import o0.C0211b;

/* renamed from: w0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0248b {

    /* renamed from: a, reason: collision with root package name */
    public final P f3099a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3100b;

    public C0248b(Context context, P p2) {
        C0211b c0211b = new C0211b(21, this);
        this.f3100b = context;
        this.f3099a = p2;
        p2.f699g = c0211b;
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
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(locales.get(i3));
        }
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
        ((C0008i) this.f3099a.f698f).B("setLocale", arrayList2, null);
    }
}
