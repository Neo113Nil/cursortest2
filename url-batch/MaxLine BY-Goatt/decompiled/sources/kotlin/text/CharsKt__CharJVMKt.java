package kotlin.text;

import defpackage.in1;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class CharsKt__CharJVMKt {
    public static int checkRadix(int i) {
        if (2 <= i && i < 37) {
            return i;
        }
        StringBuilder n = in1.n(i, "radix ", " was not in valid range ");
        n.append(new IntRange(2, 36, 1));
        throw new IllegalArgumentException(n.toString());
    }
}
