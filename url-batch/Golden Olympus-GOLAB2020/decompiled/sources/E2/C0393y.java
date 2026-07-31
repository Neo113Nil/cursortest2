package E2;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: E2.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0393y {

    /* renamed from: a, reason: collision with root package name */
    private final Map f625a = AbstractC0392x.a(16);

    /* renamed from: E2.y$a */
    public static final class a {
    }

    public final Object a(A2.f descriptor, a key) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Map map = (Map) this.f625a.get(descriptor);
        Object obj = map != null ? map.get(key) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final Object b(A2.f descriptor, a key, Function0 defaultValue) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Object a4 = a(descriptor, key);
        if (a4 != null) {
            return a4;
        }
        Object invoke = defaultValue.invoke();
        c(descriptor, key, invoke);
        return invoke;
    }

    public final void c(A2.f descriptor, a key, Object value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Map map = this.f625a;
        Object obj = map.get(descriptor);
        if (obj == null) {
            obj = AbstractC0392x.a(2);
            map.put(descriptor, obj);
        }
        ((Map) obj).put(key, value);
    }
}
