package K5;

import A.j;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import x5.n;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f1467b = Logger.getLogger(c.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final List f1468a;

    public c(List list, j jVar) {
        new n(f1467b);
        List list2 = (List) list.stream().map(new C4.a(9)).collect(Collectors.toList());
        this.f1468a = list2;
        if (list2.size() == 0) {
            throw new IllegalStateException("Callback with no instruments is not allowed");
        }
        list.stream().flatMap(new C4.a(10)).findAny().isPresent();
    }

    public final String toString() {
        return "CallbackRegistration{instrumentDescriptors=" + this.f1468a + "}";
    }
}
