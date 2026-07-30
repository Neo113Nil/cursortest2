package defpackage;

import java.io.IOException;
import java.util.Locale;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nm3 extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm3(long j, long j2, int i, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat("Pos: " + j + ", limit: " + j2 + ", len: " + i), indexOutOfBoundsException);
        Locale locale = Locale.US;
    }

    public nm3(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
