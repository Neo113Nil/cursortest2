package x5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.stream.Collectors;

/* renamed from: x5.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1020j implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final List f8391a;

    public C1020j(ArrayList arrayList) {
        this.f8391a = arrayList;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Iterator it = this.f8391a.iterator();
        if (!it.hasNext()) {
            return null;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "ScopeConfiguratorImpl{", "}");
        stringJoiner.add("conditions=" + ((String) this.f8391a.stream().map(new C1013c(1)).collect(Collectors.joining(",", "[", "]"))));
        return stringJoiner.toString();
    }
}
