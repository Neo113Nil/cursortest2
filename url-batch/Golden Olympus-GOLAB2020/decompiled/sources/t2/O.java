package t2;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import o2.S0;

/* loaded from: classes3.dex */
final class O {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f46218a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f46219b;

    /* renamed from: c, reason: collision with root package name */
    private final S0[] f46220c;

    /* renamed from: d, reason: collision with root package name */
    private int f46221d;

    public O(CoroutineContext coroutineContext, int i4) {
        this.f46218a = coroutineContext;
        this.f46219b = new Object[i4];
        this.f46220c = new S0[i4];
    }

    public final void a(S0 s02, Object obj) {
        Object[] objArr = this.f46219b;
        int i4 = this.f46221d;
        objArr[i4] = obj;
        S0[] s0Arr = this.f46220c;
        this.f46221d = i4 + 1;
        Intrinsics.checkNotNull(s02, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        s0Arr[i4] = s02;
    }

    public final void b(CoroutineContext coroutineContext) {
        int length = this.f46220c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i4 = length - 1;
            S0 s02 = this.f46220c[length];
            Intrinsics.checkNotNull(s02);
            s02.l(coroutineContext, this.f46219b[length]);
            if (i4 < 0) {
                return;
            } else {
                length = i4;
            }
        }
    }
}
