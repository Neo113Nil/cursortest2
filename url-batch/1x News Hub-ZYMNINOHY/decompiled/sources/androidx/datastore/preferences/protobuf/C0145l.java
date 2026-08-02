package androidx.datastore.preferences.protobuf;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0145l extends IOException {
    public /* synthetic */ C0145l(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0145l(long j3, long j4, int i3, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat("Pos: " + j3 + ", limit: " + j4 + ", len: " + i3), indexOutOfBoundsException);
        Locale locale = Locale.US;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0145l(File file, File file2, String str) {
        super(r3);
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        sb.append(": ".concat(str));
        String sb2 = sb.toString();
        kotlin.jvm.internal.j.d(sb2, "toString(...)");
    }
}
