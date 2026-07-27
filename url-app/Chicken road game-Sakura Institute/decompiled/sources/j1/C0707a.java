package j1;

import M2.p;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z2.C1439w;

/* renamed from: j1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0707a extends p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public static final C0707a f7143d = new C0707a(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(entry, "entry");
        Object value = entry.getValue();
        return "  " + ((C0710d) entry.getKey()).f7149a + " = " + (value instanceof byte[] ? C1439w.w((byte[]) value, ", ", "[", "]", null, 56) : String.valueOf(entry.getValue()));
    }
}
