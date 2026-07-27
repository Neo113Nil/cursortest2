package Y3;

import L3.n;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f3700b = Logger.getLogger(c.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final List f3701a;

    public c(List list, B3.c cVar) {
        new n(f3700b);
        List list2 = (List) list.stream().map(new A3.b(21)).collect(Collectors.toList());
        this.f3701a = list2;
        if (list2.size() == 0) {
            throw new IllegalStateException("Callback with no instruments is not allowed");
        }
        list.stream().flatMap(new A3.b(22)).findAny().isPresent();
    }

    public final String toString() {
        return "CallbackRegistration{instrumentDescriptors=" + this.f3701a + "}";
    }
}
