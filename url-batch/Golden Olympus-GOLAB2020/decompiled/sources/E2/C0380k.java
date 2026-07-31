package E2;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: E2.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0380k extends AbstractC0379j {

    /* renamed from: c, reason: collision with root package name */
    public static final C0380k f609c = new C0380k();

    private C0380k() {
    }

    public final void c(char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length == 16384) {
            a(array);
            return;
        }
        throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + array.length).toString());
    }

    public final char[] d() {
        return super.b(16384);
    }
}
