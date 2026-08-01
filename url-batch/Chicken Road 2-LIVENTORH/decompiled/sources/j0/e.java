package j0;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final e f1890b = new e(new f(new LocaleList(new Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final f f1891a;

    public e(f fVar) {
        this.f1891a = fVar;
    }

    public static e a(String str) {
        if (str == null || str.isEmpty()) {
            return f1890b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = split[i];
            int i4 = d.f1889a;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return new e(new f(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f1891a.equals(((e) obj).f1891a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1891a.f1892a.hashCode();
    }

    public final String toString() {
        return this.f1891a.f1892a.toString();
    }
}
