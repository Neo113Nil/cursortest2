package q0;

import a.AbstractC0124a;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.io.IOException;

/* renamed from: q0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1365g extends IOException {
    public C1365g(int i4) {
        this(i4, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1365g(int i4, long j4, long j5) {
        super(r0.toString());
        String str;
        StringBuilder sb = new StringBuilder("Illegal clipping: ");
        if (i4 != 0) {
            if (i4 == 1) {
                str = "not seekable to start";
            } else if (i4 != 2) {
                str = CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE;
            } else {
                AbstractC0124a.t((j4 == -9223372036854775807L || j5 == -9223372036854775807L) ? false : true);
                str = "start exceeds end. Start time: " + j4 + ", End time: " + j5;
            }
        } else {
            str = "invalid period count";
        }
        sb.append(str);
    }
}
