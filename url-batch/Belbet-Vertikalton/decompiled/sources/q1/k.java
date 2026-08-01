package q1;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class k extends j {
    public static Float l0(String str) {
        try {
            j1.k kVar = d.f4007a;
            kVar.getClass();
            if (((Pattern) kVar.f3185b).matcher(str).matches()) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
