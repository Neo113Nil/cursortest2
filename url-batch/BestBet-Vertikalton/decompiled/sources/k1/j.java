package k1;

/* loaded from: classes.dex */
public final class j {
    public static String a(d dVar) {
        String obj = dVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
