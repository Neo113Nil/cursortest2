package f7;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final List f2770a;

    static {
        try {
            f2770a = x6.g.c0(x6.g.a0(Arrays.asList(new b7.b()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
