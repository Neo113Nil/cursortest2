package E2;

import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* renamed from: E2.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0394z implements V {

    /* renamed from: a, reason: collision with root package name */
    private final C0382m f626a;

    public C0394z(InputStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        this.f626a = new C0382m(stream, Charsets.UTF_8);
    }

    @Override // E2.V
    public int a(char[] buffer, int i4, int i5) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        return this.f626a.d(buffer, i4, i5);
    }

    public final void b() {
        this.f626a.e();
    }
}
