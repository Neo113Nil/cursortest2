package x2;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import t2.AbstractC3429D;
import t2.G;

/* renamed from: x2.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3520f extends AbstractC3429D {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f46709f;

    public C3520f(long j4, C3520f c3520f, int i4) {
        super(j4, c3520f, i4);
        int i5;
        i5 = AbstractC3519e.f46708f;
        this.f46709f = new AtomicReferenceArray(i5);
    }

    @Override // t2.AbstractC3429D
    public int r() {
        int i4;
        i4 = AbstractC3519e.f46708f;
        return i4;
    }

    @Override // t2.AbstractC3429D
    public void s(int i4, Throwable th, CoroutineContext coroutineContext) {
        G g4;
        g4 = AbstractC3519e.f46707e;
        v().set(i4, g4);
        t();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f46203d + ", hashCode=" + hashCode() + ']';
    }

    public final /* synthetic */ AtomicReferenceArray v() {
        return this.f46709f;
    }
}
