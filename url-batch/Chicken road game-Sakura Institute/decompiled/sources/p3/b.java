package p3;

import androidx.lifecycle.v;
import d6.c;
import d6.l;
import g0.m1;
import g0.n2;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final m1 f7197a;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        if ((r1 instanceof g0.m1) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        r1 = (g0.m1) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r1 = null;
     */
    static {
        Object b9;
        try {
            ClassLoader classLoader = v.class.getClassLoader();
            k.c(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                } else if (annotations[i7] instanceof c) {
                    break;
                } else {
                    i7++;
                }
            }
        } catch (Throwable th) {
            b9 = d6.a.b(th);
        }
        m1 m1Var = (m1) (b9 instanceof l ? null : b9);
        if (m1Var == null) {
            m1Var = new n2(a.f7196g);
        }
        f7197a = m1Var;
    }
}
