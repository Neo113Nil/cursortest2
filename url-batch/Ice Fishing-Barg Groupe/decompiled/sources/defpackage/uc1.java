package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class uc1 {
    public static String PxuCJdSBwIXG(Class cls) {
        LinkedHashMap linkedHashMap = vc1.lS5Rgt96tfkO;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            sc1 sc1Var = (sc1) cls.getAnnotation(sc1.class);
            str = sc1Var != null ? sc1Var.value() : null;
            if (str == null || str.length() <= 0) {
                u9.e9gEMXR7LXtO("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                return null;
            }
            linkedHashMap.put(cls, str);
        }
        str.getClass();
        return str;
    }
}
