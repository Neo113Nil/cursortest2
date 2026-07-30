package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import defpackage.qy0;
import defpackage.ry0;
import kotlin.Metadata;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "radix", "checkRadix", "(I)I", "kotlin-stdlib"}, k = ry0.STRING_FIELD_NUMBER, mv = {2, 2, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 49, xs = "kotlin/text/CharsKt")
/* loaded from: classes.dex */
public class CharsKt__CharJVMKt {
    public static int checkRadix(int i) {
        if (2 <= i && i < 37) {
            return i;
        }
        StringBuilder n = qy0.n("radix ", i, " was not in valid range ");
        n.append(new IntRange(2, 36, 1));
        throw new IllegalArgumentException(n.toString());
    }
}
