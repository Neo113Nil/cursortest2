package s6;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;
import o6.C0806b;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final List f7824a;

    static {
        try {
            f7824a = l6.l.b(l6.j.a(Arrays.asList(new C0806b()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
