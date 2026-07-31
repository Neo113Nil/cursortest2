package E2;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: E2.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0376g extends AbstractC0377h {

    /* renamed from: c, reason: collision with root package name */
    public static final C0376g f603c = new C0376g();

    private C0376g() {
    }

    public final void c(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        a(array);
    }

    public final byte[] d() {
        return super.b(UserVerificationMethods.USER_VERIFY_NONE);
    }
}
