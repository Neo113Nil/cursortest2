package v2;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final List f9792a;

    static {
        try {
            f9792a = m2.h.V(m2.h.R(Arrays.asList(new r2.b()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
