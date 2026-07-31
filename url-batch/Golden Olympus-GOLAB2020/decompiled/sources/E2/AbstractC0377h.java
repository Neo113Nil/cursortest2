package E2;

import kotlin.Unit;
import kotlin.collections.C3218h;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: E2.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0377h {

    /* renamed from: a, reason: collision with root package name */
    private final C3218h f604a = new C3218h();

    /* renamed from: b, reason: collision with root package name */
    private int f605b;

    protected final void a(byte[] array) {
        int i4;
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (this) {
            try {
                int length = this.f605b + array.length;
                i4 = AbstractC0374e.f601a;
                if (length < i4) {
                    this.f605b += array.length / 2;
                    this.f604a.addLast(array);
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final byte[] b(int i4) {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f604a.q();
            if (bArr != null) {
                this.f605b -= bArr.length / 2;
            } else {
                bArr = null;
            }
        }
        return bArr == null ? new byte[i4] : bArr;
    }
}
