package q2;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o2.a1;
import t2.AbstractC3429D;
import t2.G;
import t2.y;

/* loaded from: classes3.dex */
public final class j extends AbstractC3429D {

    /* renamed from: f, reason: collision with root package name */
    private final b f43482f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f43483g;

    public j(long j4, j jVar, b bVar, int i4) {
        super(j4, jVar, i4);
        this.f43482f = bVar;
        this.f43483g = new AtomicReferenceArray(c.f43455b * 2);
    }

    private final void E(int i4, Object obj) {
        z().set(i4 * 2, obj);
    }

    private final /* synthetic */ AtomicReferenceArray z() {
        return this.f43483g;
    }

    public final Object A(int i4) {
        return z().get(i4 * 2);
    }

    public final Object B(int i4) {
        return z().get((i4 * 2) + 1);
    }

    public final void C(int i4, boolean z4) {
        if (z4) {
            y().W0((this.f46203d * c.f43455b) + i4);
        }
        t();
    }

    public final Object D(int i4) {
        Object A4 = A(i4);
        w(i4);
        return A4;
    }

    public final void F(int i4, Object obj) {
        z().set((i4 * 2) + 1, obj);
    }

    public final void G(int i4, Object obj) {
        E(i4, obj);
    }

    @Override // t2.AbstractC3429D
    public int r() {
        return c.f43455b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0062, code lost:
    
        w(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0065, code lost:
    
        if (r0 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0067, code lost:
    
        r4 = y().f43435c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x006d, code lost:
    
        if (r4 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x006f, code lost:
    
        t2.y.b(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    @Override // t2.AbstractC3429D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void s(int i4, Throwable th, CoroutineContext coroutineContext) {
        Function1 function1;
        G g4;
        G g5;
        G g6;
        G g7;
        G g8;
        int i5 = c.f43455b;
        boolean z4 = i4 >= i5;
        if (z4) {
            i4 -= i5;
        }
        Object A4 = A(i4);
        while (true) {
            Object B4 = B(i4);
            if (!(B4 instanceof a1) && !(B4 instanceof v)) {
                g4 = c.f43463j;
                if (B4 == g4) {
                    break;
                }
                g5 = c.f43464k;
                if (B4 == g5) {
                    break;
                }
                g6 = c.f43460g;
                if (B4 != g6) {
                    g7 = c.f43459f;
                    if (B4 != g7) {
                        g8 = c.f43462i;
                        if (B4 == g8 || B4 == c.f43457d || B4 == c.z()) {
                            return;
                        }
                        throw new IllegalStateException(("unexpected state: " + B4).toString());
                    }
                } else {
                    continue;
                }
            } else {
                if (v(i4, B4, z4 ? c.f43463j : c.f43464k)) {
                    w(i4);
                    C(i4, !z4);
                    if (!z4 || (function1 = y().f43435c) == null) {
                        return;
                    }
                    y.b(function1, A4, coroutineContext);
                    return;
                }
            }
        }
    }

    public final boolean v(int i4, Object obj, Object obj2) {
        return i.a(z(), (i4 * 2) + 1, obj, obj2);
    }

    public final void w(int i4) {
        E(i4, null);
    }

    public final Object x(int i4, Object obj) {
        return z().getAndSet((i4 * 2) + 1, obj);
    }

    public final b y() {
        b bVar = this.f43482f;
        Intrinsics.checkNotNull(bVar);
        return bVar;
    }
}
