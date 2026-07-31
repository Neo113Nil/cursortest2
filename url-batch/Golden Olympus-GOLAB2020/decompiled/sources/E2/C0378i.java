package E2;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: E2.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0378i extends AbstractC0379j {

    /* renamed from: c, reason: collision with root package name */
    public static final C0378i f606c = new C0378i();

    private C0378i() {
    }

    public final void c(char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        a(array);
    }

    public final char[] d() {
        return super.b(UserVerificationMethods.USER_VERIFY_PATTERN);
    }
}
