package defpackage;

import java.lang.annotation.Annotation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imq {
    public static Object a(Object obj, Class cls) {
        boolean z;
        if (!(obj instanceof jrp)) {
            if (obj instanceof jrq) {
                return a(((jrq) obj).C(), cls);
            }
            throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), jrp.class, jrq.class));
        }
        if (obj instanceof jrs) {
            Annotation[] annotations = cls.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                if (annotations[i].annotationType().getCanonicalName().contentEquals("dagger.hilt.android.EarlyEntryPoint")) {
                    z = true;
                    break;
                }
                i++;
            }
            iwi.a(!z, "Interface, %s, annotated with @EarlyEntryPoint should be called with EarlyEntryPoints.get() rather than EntryPoints.get()", cls.getCanonicalName());
        }
        return cls.cast(obj);
    }
}
