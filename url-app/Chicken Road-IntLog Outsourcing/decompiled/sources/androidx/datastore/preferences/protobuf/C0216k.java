package androidx.datastore.preferences.protobuf;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0216k extends IOException {
    public /* synthetic */ C0216k(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0216k(long j2, long j6, int i2, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat("Pos: " + j2 + ", limit: " + j6 + ", len: " + i2), indexOutOfBoundsException);
        Locale locale = Locale.US;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0216k(File file, File file2, String str) {
        super(r3);
        kotlin.jvm.internal.i.e(file, "file");
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": ".concat(str));
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "toString(...)");
    }
}
