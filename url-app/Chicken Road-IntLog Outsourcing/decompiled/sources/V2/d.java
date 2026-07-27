package V2;

import G0.C0051a;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0051a f3235a = new C0051a("suppress_instrumentation", 3);

    public static void a(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static String b(String str, String str2) {
        final String replace = str.toLowerCase(Locale.ROOT).replace("-", ".");
        final int i2 = 0;
        String str3 = (String) ((Properties) System.getProperties().clone()).entrySet().stream().filter(new Predicate() { // from class: V2.b
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                switch (i2) {
                    case 0:
                        return replace.equals(entry.getKey().toString().toLowerCase(Locale.ROOT).replace("-", "."));
                    default:
                        return replace.equals(((String) entry.getKey()).toLowerCase(Locale.ROOT).replace("_", "."));
                }
            }
        }).map(new A3.b(19)).findFirst().orElse(null);
        if (str3 != null) {
            return str3;
        }
        final int i3 = 1;
        return (String) System.getenv().entrySet().stream().filter(new Predicate() { // from class: V2.b
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                switch (i3) {
                    case 0:
                        return replace.equals(entry.getKey().toString().toLowerCase(Locale.ROOT).replace("-", "."));
                    default:
                        return replace.equals(((String) entry.getKey()).toLowerCase(Locale.ROOT).replace("_", "."));
                }
            }
        }).map(new A3.b(20)).findFirst().orElse(str2);
    }

    public static Object c(Object obj, String str) {
        try {
            return Class.forName(str).getDeclaredMethod("getNoop", null).invoke(null, null);
        } catch (Exception unused) {
            return obj;
        }
    }
}
