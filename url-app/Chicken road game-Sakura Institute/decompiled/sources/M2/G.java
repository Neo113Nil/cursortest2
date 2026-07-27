package M2;

/* loaded from: classes.dex */
public class G {
    public static String a(l lVar) {
        String obj = lVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
