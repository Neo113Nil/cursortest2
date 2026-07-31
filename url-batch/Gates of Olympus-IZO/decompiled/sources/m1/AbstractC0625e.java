package m1;

import I.AbstractC0114p0;
import I.Y0;
import I2.l;
import Z1.i;
import androidx.lifecycle.InterfaceC0236v;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* renamed from: m1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0625e {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC0114p0 f5928a;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        if ((r1 instanceof I.AbstractC0114p0) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        r1 = (I.AbstractC0114p0) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r1 = null;
     */
    static {
        Object t3;
        try {
            ClassLoader classLoader = InterfaceC0236v.class.getClassLoader();
            i.c(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (annotations[i3] instanceof L1.c) {
                    break;
                } else {
                    i3++;
                }
            }
        } catch (Throwable th) {
            t3 = l.t(th);
        }
        AbstractC0114p0 abstractC0114p0 = (AbstractC0114p0) (t3 instanceof L1.l ? null : t3);
        if (abstractC0114p0 == null) {
            abstractC0114p0 = new Y0(C0624d.f5927e);
        }
        f5928a = abstractC0114p0;
    }
}
