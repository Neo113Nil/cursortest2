package w1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final List f4494a;

    static {
        try {
            Iterator it = Arrays.asList(new t1.b()).iterator();
            k1.e.e(it, "<this>");
            f4494a = q1.f.w(new q1.a(new Y0.q(2, it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
