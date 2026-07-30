package k3;

import java.util.Map;
import r6.k;
import r6.l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public static final a f5346g = new a(1);

    @Override // q6.c
    public final Object f(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        k.f(entry, "entry");
        Object value = entry.getValue();
        return "  " + ((d) entry.getKey()).f5353a + " = " + (value instanceof byte[] ? e6.k.h0((byte[]) value, ", ", null, 56) : String.valueOf(entry.getValue()));
    }
}
