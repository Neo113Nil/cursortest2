package v0;

import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* renamed from: v0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0956A implements WebMessagePayloadBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    public final int f8128a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8129b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f8130c;

    public C0956A(String str) {
        this.f8128a = 0;
        this.f8129b = str;
        this.f8130c = null;
    }

    public final void a(int i2) {
        int i5 = this.f8128a;
        if (i5 != i2) {
            throw new IllegalStateException(C4.p.j("Expected ", ", but type is ", i2, i5));
        }
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public final byte[] getAsArrayBuffer() {
        a(1);
        byte[] bArr = this.f8130c;
        Objects.requireNonNull(bArr);
        return bArr;
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public final String getAsString() {
        a(0);
        return this.f8129b;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return new String[0];
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public final int getType() {
        return this.f8128a;
    }

    public C0956A(byte[] bArr) {
        this.f8128a = 1;
        this.f8129b = null;
        this.f8130c = bArr;
    }
}
