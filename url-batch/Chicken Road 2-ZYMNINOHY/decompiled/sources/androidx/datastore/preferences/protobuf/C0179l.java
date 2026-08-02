package androidx.datastore.preferences.protobuf;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0179l extends IOException {
    public /* synthetic */ C0179l(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0179l(long j4, long j5, int i4, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat("Pos: " + j4 + ", limit: " + j5 + ", len: " + i4), indexOutOfBoundsException);
        Locale locale = Locale.US;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0179l(File file, File file2, String str) {
        super(r3);
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        sb.append(": ".concat(str));
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "toString(...)");
    }
}
