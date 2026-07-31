package f2;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f2.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2422e extends ByteArrayOutputStream {
    public C2422e(int i4) {
        super(i4);
    }

    public final byte[] m() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        Intrinsics.checkNotNullExpressionValue(buf, "buf");
        return buf;
    }
}
