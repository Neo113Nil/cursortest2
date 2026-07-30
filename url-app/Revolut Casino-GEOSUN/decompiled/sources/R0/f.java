package R0;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final List f904a;

    static {
        try {
            Iterator it = Arrays.asList(new N0.b()).iterator();
            F0.i.e(it, "<this>");
            f904a = K0.c.P(new K0.a(new K0.e(it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
