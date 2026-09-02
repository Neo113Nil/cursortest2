package C3;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;
import y3.C1577b;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final List f290a;

    static {
        try {
            f290a = v3.k.J(v3.k.H(Arrays.asList(new C1577b()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
