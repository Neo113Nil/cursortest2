package d5;

import Q4.n;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/* renamed from: d5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0333c {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f3963b = Logger.getLogger(C0333c.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final List f3964a;

    public C0333c(List list, G4.c cVar) {
        new n(f3963b);
        List list2 = (List) list.stream().map(new A4.b(27)).collect(Collectors.toList());
        this.f3964a = list2;
        if (list2.size() == 0) {
            throw new IllegalStateException("Callback with no instruments is not allowed");
        }
        list.stream().flatMap(new A4.b(28)).findAny().isPresent();
    }

    public final String toString() {
        return "CallbackRegistration{instrumentDescriptors=" + this.f3964a + "}";
    }
}
