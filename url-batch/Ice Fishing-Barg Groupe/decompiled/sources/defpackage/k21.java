package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class k21 {
    public static final gr1 PxuCJdSBwIXG;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002f, code lost:
    
        r2 = r2.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        if ((r2 instanceof defpackage.gr1) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0037, code lost:
    
        r2 = (defpackage.gr1) r2;
     */
    static {
        Object uv1Var;
        try {
            ClassLoader classLoader = qz1.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            annotations.getClass();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (annotations[i] instanceof ny) {
                    break;
                } else {
                    i++;
                }
            }
            uv1Var = null;
        } catch (Throwable th) {
            uv1Var = new uv1(th);
        }
        gr1 gr1Var = (gr1) (uv1Var instanceof uv1 ? null : uv1Var);
        if (gr1Var == null) {
            gr1Var = new t92(new j21(0));
        }
        PxuCJdSBwIXG = gr1Var;
    }
}
