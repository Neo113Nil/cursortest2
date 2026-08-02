package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iwc {
    public static Object a(Object obj, Class cls) {
        if (obj instanceof jpu) {
            obj = ((jpu) obj).c();
        }
        iwi.a(obj instanceof jrr, "Host %s is not a Hilt one.", obj.getClass().getName());
        jrq b = ((jrr) obj).b();
        iwi.a(b instanceof jqi, "Host %s is not a screen host.", b.getClass().getName());
        return imq.a(((jqi) b).f(), cls);
    }
}
