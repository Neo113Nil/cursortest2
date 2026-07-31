package okhttp3.internal.ws;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.C3372e;

@Metadata
/* loaded from: classes3.dex */
public final class WebSocketProtocol {

    /* renamed from: a, reason: collision with root package name */
    public static final WebSocketProtocol f43222a = new WebSocketProtocol();

    private WebSocketProtocol() {
    }

    public final String a(int i4) {
        if (i4 < 1000 || i4 >= 5000) {
            return "Code must be in range [1000,5000): " + i4;
        }
        if ((1004 > i4 || i4 >= 1007) && (1015 > i4 || i4 >= 3000)) {
            return null;
        }
        return "Code " + i4 + " is reserved and may not be used.";
    }

    public final void b(C3372e.a cursor, byte[] key) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(key, "key");
        int length = key.length;
        int i4 = 0;
        do {
            byte[] bArr = cursor.f43266f;
            int i5 = cursor.f43267g;
            int i6 = cursor.f43268h;
            if (bArr != null) {
                while (i5 < i6) {
                    int i7 = i4 % length;
                    bArr[i5] = (byte) (bArr[i5] ^ key[i7]);
                    i5++;
                    i4 = i7 + 1;
                }
            }
        } while (cursor.n() != -1);
    }

    public final void c(int i4) {
        String a4 = a(i4);
        if (a4 == null) {
            return;
        }
        Intrinsics.checkNotNull(a4);
        throw new IllegalArgumentException(a4.toString());
    }
}
