package s2;

/* loaded from: classes.dex */
public abstract class l extends k {
    public static Double Q(String str) {
        kotlin.jvm.internal.j.e(str, "<this>");
        try {
            e eVar = f.f10330a;
            eVar.getClass();
            if (eVar.f10329a.matcher(str).matches()) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
