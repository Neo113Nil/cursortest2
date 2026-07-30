package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tf1 {
    public static final tf1 b = new tf1(new vf1(new LocaleList(new Locale[0])));
    public final vf1 a;

    public tf1(vf1 vf1Var) {
        this.a = vf1Var;
    }

    public static tf1 a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(split[i]);
        }
        return new tf1(new vf1(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tf1) {
            return this.a.equals(((tf1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
