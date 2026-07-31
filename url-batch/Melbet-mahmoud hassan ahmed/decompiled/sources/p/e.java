package p;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    private static final e f19929b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    private g f19930a;

    private e(g gVar) {
        this.f19930a = gVar;
    }

    public static e a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? d(new LocaleList(localeArr)) : new e(new f(localeArr));
    }

    static Locale b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else {
            if (!str.contains("_")) {
                return new Locale(str);
            }
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    public static e d(LocaleList localeList) {
        return new e(new h(localeList));
    }

    public Locale c(int i7) {
        return this.f19930a.get(i7);
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && this.f19930a.equals(((e) obj).f19930a);
    }

    public int hashCode() {
        return this.f19930a.hashCode();
    }

    public String toString() {
        return this.f19930a.toString();
    }
}
