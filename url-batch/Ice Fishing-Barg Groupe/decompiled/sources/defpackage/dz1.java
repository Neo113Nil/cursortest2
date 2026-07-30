package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class dz1 {
    public static ez1 PxuCJdSBwIXG(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            return new ez1();
        }
        ClassLoader classLoader = ez1.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        o41 o41Var = new o41(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            o41Var.put(str, bundle.get(str));
        }
        return new ez1(o41Var.lS5Rgt96tfkO());
    }
}
