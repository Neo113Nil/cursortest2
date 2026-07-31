package Q4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public final class i implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final List f2026a;

    public i(ArrayList arrayList) {
        this.f2026a = arrayList;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Iterator it = this.f2026a.iterator();
        if (!it.hasNext()) {
            return null;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "ScopeConfiguratorImpl{", "}");
        stringJoiner.add("conditions=" + ((String) this.f2026a.stream().map(new A4.b(17)).collect(Collectors.joining(",", "[", "]"))));
        return stringJoiner.toString();
    }
}
