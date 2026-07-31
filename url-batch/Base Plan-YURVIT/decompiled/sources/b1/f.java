package b1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final List f1746a;

    static {
        try {
            Iterator it = Arrays.asList(new X0.b()).iterator();
            P0.h.e(it, "<this>");
            f1746a = U0.e.O(new U0.a(new E0.m(1, it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
