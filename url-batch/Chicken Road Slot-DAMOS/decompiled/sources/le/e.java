package le;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final List f5970a;

    static {
        try {
            f5970a = de.n.d(de.k.b(Arrays.asList(new he.b()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
