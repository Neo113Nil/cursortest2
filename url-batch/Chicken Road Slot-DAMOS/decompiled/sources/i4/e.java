package i4;

import a1.k;
import androidx.lifecycle.u;
import hd.l;
import hd.m;
import hd.n;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import n0.n2;
import n0.p1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final p1 f4646a;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
    
        if ((r1 instanceof n0.p1) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        r1 = (n0.p1) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r1 = null;
     */
    static {
        Object mVar;
        try {
            l lVar = n.f4511e;
            ClassLoader classLoader = u.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (annotations[i3] instanceof hd.a) {
                    break;
                } else {
                    i3++;
                }
            }
        } catch (Throwable th) {
            l lVar2 = n.f4511e;
            mVar = new m(th);
        }
        l lVar3 = n.f4511e;
        p1 p1Var = (p1) (mVar instanceof m ? null : mVar);
        if (p1Var == null) {
            p1Var = new n2(new k(10));
        }
        f4646a = p1Var;
    }
}
