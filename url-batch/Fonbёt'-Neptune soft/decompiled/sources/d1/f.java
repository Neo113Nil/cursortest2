package d1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final List f2073a;

    static {
        try {
            Iterator it = Arrays.asList(new Z0.b()).iterator();
            Q0.h.e(it, "<this>");
            f2073a = W0.c.S(new W0.a(new W0.e(it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
