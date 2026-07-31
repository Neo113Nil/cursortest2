package y4;

import c6.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import m0.r1;
import m0.u2;
import q6.i;
import x.t0;
import x4.f;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final r1 f8975a;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
    
        if ((r1 instanceof m0.r1) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        r1 = (m0.r1) r1;
     */
    static {
        Object l3;
        try {
            ClassLoader classLoader = f.class.getClassLoader();
            i.b(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            i.d(annotations, "getAnnotations(...)");
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
            l3 = null;
        } catch (Throwable th) {
            l3 = s6.a.l(th);
        }
        r1 r1Var = (r1) (l3 instanceof h ? null : l3);
        if (r1Var == null) {
            r1Var = new u2(new t0(3));
        }
        f8975a = r1Var;
    }
}
