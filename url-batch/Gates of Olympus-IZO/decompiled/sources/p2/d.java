package p2;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final List f6771a;

    static {
        try {
            f6771a = g2.h.e0(g2.h.a0(Arrays.asList(new l2.b()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
