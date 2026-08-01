package w1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final List f4471a;

    static {
        try {
            Iterator it = Arrays.asList(new s1.b()).iterator();
            j1.h.e(it, "<this>");
            f4471a = p1.e.h0(new p1.a(new X0.r(2, it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
