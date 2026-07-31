package okhttp3.internal.http2;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes3.dex */
public final class Settings {

    /* renamed from: c, reason: collision with root package name */
    public static final Companion f43083c = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private int f43084a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f43085b = new int[10];

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final int a(int i4) {
        return this.f43085b[i4];
    }

    public final int b() {
        if ((this.f43084a & 2) != 0) {
            return this.f43085b[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.f43084a & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            return this.f43085b[7];
        }
        return 65535;
    }

    public final int d() {
        if ((this.f43084a & 16) != 0) {
            return this.f43085b[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int e(int i4) {
        return (this.f43084a & 32) != 0 ? this.f43085b[5] : i4;
    }

    public final boolean f(int i4) {
        return ((1 << i4) & this.f43084a) != 0;
    }

    public final void g(Settings other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i4 = 0; i4 < 10; i4++) {
            if (other.f(i4)) {
                h(i4, other.a(i4));
            }
        }
    }

    public final Settings h(int i4, int i5) {
        if (i4 >= 0) {
            int[] iArr = this.f43085b;
            if (i4 < iArr.length) {
                this.f43084a = (1 << i4) | this.f43084a;
                iArr[i4] = i5;
            }
        }
        return this;
    }

    public final int i() {
        return Integer.bitCount(this.f43084a);
    }
}
