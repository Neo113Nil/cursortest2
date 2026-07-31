package j4;

import androidx.lifecycle.u;
import c6.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import m0.r1;
import m0.u2;
import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final r1 f4019a;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        if ((r1 instanceof m0.r1) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        r1 = (m0.r1) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r1 = null;
     */
    static {
        Object l3;
        try {
            ClassLoader classLoader = u.class.getClassLoader();
            i.b(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (annotations[i] instanceof c6.a) {
                    break;
                } else {
                    i++;
                }
            }
        } catch (Throwable th) {
            l3 = s6.a.l(th);
        }
        r1 r1Var = (r1) (l3 instanceof h ? null : l3);
        if (r1Var == null) {
            r1Var = new u2(new c.e(17));
        }
        f4019a = r1Var;
    }
}
