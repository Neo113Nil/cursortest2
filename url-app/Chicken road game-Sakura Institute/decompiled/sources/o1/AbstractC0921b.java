package o1;

import G.AbstractC0217p0;
import G.Y0;
import androidx.lifecycle.InterfaceC0481v;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1341p;
import y2.AbstractC1343r;
import y2.C1342q;
import y2.InterfaceC1329d;

/* renamed from: o1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0921b {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC0217p0 f8914a;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
    
        if ((r1 instanceof G.AbstractC0217p0) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        r1 = (G.AbstractC0217p0) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r1 = null;
     */
    static {
        Object a4;
        try {
            AbstractC1341p.a aVar = AbstractC1341p.f11673d;
            ClassLoader classLoader = InterfaceC0481v.class.getClassLoader();
            Intrinsics.c(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (annotations[i2] instanceof InterfaceC1329d) {
                    break;
                } else {
                    i2++;
                }
            }
        } catch (Throwable th) {
            AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
            a4 = AbstractC1343r.a(th);
        }
        AbstractC1341p.a aVar3 = AbstractC1341p.f11673d;
        AbstractC0217p0 abstractC0217p0 = (AbstractC0217p0) (a4 instanceof C1342q ? null : a4);
        if (abstractC0217p0 == null) {
            abstractC0217p0 = new Y0(C0920a.f8913d);
        }
        f8914a = abstractC0217p0;
    }
}
