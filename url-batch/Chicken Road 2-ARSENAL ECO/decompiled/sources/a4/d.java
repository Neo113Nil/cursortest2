package a4;

import M5.v;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final v f3138a = new v("suppress_instrumentation", 2);

    public static void a(String str, boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException(str);
        }
    }

    public static String b(String str, String str2) {
        final String replace = str.toLowerCase(Locale.ROOT).replace("-", ".");
        final int i7 = 0;
        String str3 = (String) ((Properties) System.getProperties().clone()).entrySet().stream().filter(new Predicate() { // from class: a4.b
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                switch (i7) {
                    case 0:
                        return replace.equals(entry.getKey().toString().toLowerCase(Locale.ROOT).replace("-", "."));
                    default:
                        return replace.equals(((String) entry.getKey()).toLowerCase(Locale.ROOT).replace("_", "."));
                }
            }
        }).map(new A4.b(25)).findFirst().orElse(null);
        if (str3 != null) {
            return str3;
        }
        final int i8 = 1;
        return (String) System.getenv().entrySet().stream().filter(new Predicate() { // from class: a4.b
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                switch (i8) {
                    case 0:
                        return replace.equals(entry.getKey().toString().toLowerCase(Locale.ROOT).replace("-", "."));
                    default:
                        return replace.equals(((String) entry.getKey()).toLowerCase(Locale.ROOT).replace("_", "."));
                }
            }
        }).map(new A4.b(26)).findFirst().orElse(str2);
    }

    public static Object c(Object obj, String str) {
        try {
            return Class.forName(str).getDeclaredMethod("getNoop", null).invoke(null, null);
        } catch (Exception unused) {
            return obj;
        }
    }
}
