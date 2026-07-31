package C2;

import g2.AbstractC2429a;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* renamed from: C2.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0344y implements I0 {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f356a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f357b;

    public C0344y(Function1 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f356a = compute;
        this.f357b = new ConcurrentHashMap();
    }

    @Override // C2.I0
    public InterfaceC3527b a(m2.c key) {
        Object putIfAbsent;
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentHashMap concurrentHashMap = this.f357b;
        Class a4 = AbstractC2429a.a(key);
        Object obj = concurrentHashMap.get(a4);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(a4, (obj = new C0321m((InterfaceC3527b) this.f356a.invoke(key))))) != null) {
            obj = putIfAbsent;
        }
        return ((C0321m) obj).f306a;
    }
}
