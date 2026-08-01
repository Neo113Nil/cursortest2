package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Locale;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(long j, long j3, int i3, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat("Pos: " + j + ", limit: " + j3 + ", len: " + i3), indexOutOfBoundsException);
        Locale locale = Locale.US;
    }

    public /* synthetic */ k(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
