package p0;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final List f1137a;

    static {
        try {
            Iterator it = Arrays.asList(new l0.b()).iterator();
            e0.h.e(it, "<this>");
            f1137a = i0.c.G(new i0.a(new i0.e(it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
