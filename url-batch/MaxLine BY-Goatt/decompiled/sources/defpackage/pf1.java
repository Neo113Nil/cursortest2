package defpackage;

import defpackage.aa2;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class pf1 {
    public static final t52 a;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
    
        if ((r1 instanceof defpackage.t52) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        r1 = (defpackage.t52) r1;
     */
    static {
        Object ba2Var;
        try {
            aa2.a aVar = aa2.m;
            ClassLoader classLoader = zd2.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            annotations.getClass();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (annotations[i] instanceof fa0) {
                    break;
                } else {
                    i++;
                }
            }
            ba2Var = null;
        } catch (Throwable th) {
            aa2.a aVar2 = aa2.m;
            ba2Var = new ba2(th);
        }
        aa2.a aVar3 = aa2.m;
        t52 t52Var = (t52) (ba2Var instanceof ba2 ? null : ba2Var);
        if (t52Var == null) {
            t52Var = new bp2(new e4(15));
        }
        a = t52Var;
    }
}
