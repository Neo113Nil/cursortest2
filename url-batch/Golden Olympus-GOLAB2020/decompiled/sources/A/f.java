package A;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class f implements e {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f7a;

    /* renamed from: b, reason: collision with root package name */
    private int f8b;

    public f(int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f7a = new Object[i4];
    }

    private final boolean c(Object obj) {
        int i4 = this.f8b;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.f7a[i5] == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // A.e
    public boolean a(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (c(instance)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i4 = this.f8b;
        Object[] objArr = this.f7a;
        if (i4 >= objArr.length) {
            return false;
        }
        objArr[i4] = instance;
        this.f8b = i4 + 1;
        return true;
    }

    @Override // A.e
    public Object b() {
        int i4 = this.f8b;
        if (i4 <= 0) {
            return null;
        }
        int i5 = i4 - 1;
        Object obj = this.f7a[i5];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.f7a[i5] = null;
        this.f8b--;
        return obj;
    }
}
