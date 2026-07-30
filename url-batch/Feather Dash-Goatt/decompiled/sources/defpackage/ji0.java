package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class ji0 {
    public static final m01 a;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
    
        if ((r1 instanceof defpackage.m01) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        r1 = (defpackage.m01) r1;
     */
    static {
        Object j31Var;
        try {
            i31 i31Var = k31.d;
            ClassLoader classLoader = e61.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            annotations.getClass();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (annotations[i] instanceof sr) {
                    break;
                } else {
                    i++;
                }
            }
            j31Var = null;
        } catch (Throwable th) {
            i31 i31Var2 = k31.d;
            j31Var = new j31(th);
        }
        i31 i31Var3 = k31.d;
        m01 m01Var = (m01) (j31Var instanceof j31 ? null : j31Var);
        if (m01Var == null) {
            m01Var = new ke1(new dd(10));
        }
        a = m01Var;
    }
}
