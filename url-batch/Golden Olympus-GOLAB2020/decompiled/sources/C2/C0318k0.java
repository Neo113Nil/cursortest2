package C2;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: C2.k0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0318k0 {

    /* renamed from: a, reason: collision with root package name */
    public volatile SoftReference f303a = new SoftReference(null);

    public final synchronized Object a(Function0 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Object obj = this.f303a.get();
        if (obj != null) {
            return obj;
        }
        Object invoke = factory.invoke();
        this.f303a = new SoftReference(invoke);
        return invoke;
    }
}
