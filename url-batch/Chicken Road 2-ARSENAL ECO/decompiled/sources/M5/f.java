package M5;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final List f1593a;

    static {
        try {
            Iterator it = Arrays.asList(new I5.b()).iterator();
            kotlin.jvm.internal.i.e(it, "<this>");
            f1593a = E5.g.C(new E5.a(new E5.h(0, it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
