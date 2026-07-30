package T;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class a extends p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public static final a f2549d = new a(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(entry, "entry");
        Object value = entry.getValue();
        return "  " + ((d) entry.getKey()).f2555a + " = " + (value instanceof byte[] ? kotlin.collections.p.n((byte[]) value, ", ", null, 56) : String.valueOf(entry.getValue()));
    }
}
