package b3;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final List f5652a;

    static {
        try {
            f5652a = T2.r.k(T2.n.b(Arrays.asList(new X2.b()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
