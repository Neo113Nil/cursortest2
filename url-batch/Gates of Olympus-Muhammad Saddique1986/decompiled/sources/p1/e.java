package p1;

import I.AbstractC0168p0;
import I.X0;
import R1.k;
import androidx.lifecycle.InterfaceC0292v;
import f2.j;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC0168p0 f7832a;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        if ((r1 instanceof I.AbstractC0168p0) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        r1 = (I.AbstractC0168p0) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r1 = null;
     */
    static {
        Object b3;
        try {
            ClassLoader classLoader = InterfaceC0292v.class.getClassLoader();
            j.c(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (annotations[i3] instanceof R1.c) {
                    break;
                } else {
                    i3++;
                }
            }
        } catch (Throwable th) {
            b3 = R1.a.b(th);
        }
        AbstractC0168p0 abstractC0168p0 = (AbstractC0168p0) (b3 instanceof k ? null : b3);
        if (abstractC0168p0 == null) {
            abstractC0168p0 = new X0(d.f7831e);
        }
        f7832a = abstractC0168p0;
    }
}
