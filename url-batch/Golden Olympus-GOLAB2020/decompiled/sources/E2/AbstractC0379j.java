package E2;

import kotlin.Unit;
import kotlin.collections.C3218h;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: E2.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0379j {

    /* renamed from: a, reason: collision with root package name */
    private final C3218h f607a = new C3218h();

    /* renamed from: b, reason: collision with root package name */
    private int f608b;

    protected final void a(char[] array) {
        int i4;
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (this) {
            try {
                int length = this.f608b + array.length;
                i4 = AbstractC0374e.f601a;
                if (length < i4) {
                    this.f608b += array.length;
                    this.f607a.addLast(array);
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final char[] b(int i4) {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) this.f607a.q();
            if (cArr != null) {
                this.f608b -= cArr.length;
            } else {
                cArr = null;
            }
        }
        return cArr == null ? new char[i4] : cArr;
    }
}
