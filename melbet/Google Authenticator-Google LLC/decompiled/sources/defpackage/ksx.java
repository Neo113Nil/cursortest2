package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksx {
    public static final /* synthetic */ int a = 0;

    static {
        try {
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
    }

    public static String a(ksn ksnVar) {
        String obj = ksnVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
