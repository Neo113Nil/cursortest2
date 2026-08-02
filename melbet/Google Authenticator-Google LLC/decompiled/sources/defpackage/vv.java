package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vv {
    public static final vv a = b(new Locale[0]);
    private final vw b;

    private vv(vw vwVar) {
        this.b = vwVar;
    }

    public static vv b(Locale... localeArr) {
        return d(new LocaleList(localeArr));
    }

    public static vv c(String str) {
        if (str == null || str.isEmpty()) {
            return a;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(split[i]);
        }
        return b(localeArr);
    }

    public static vv d(LocaleList localeList) {
        return new vv(new vw(localeList));
    }

    public final int a() {
        int size;
        size = this.b.a.size();
        return size;
    }

    public final String e() {
        String languageTags;
        languageTags = this.b.a.toLanguageTags();
        return languageTags;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof vv) && this.b.equals(((vv) obj).b);
    }

    public final Locale f(int i) {
        Locale locale;
        locale = this.b.a.get(i);
        return locale;
    }

    public final boolean g() {
        boolean isEmpty;
        isEmpty = this.b.a.isEmpty();
        return isEmpty;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }
}
