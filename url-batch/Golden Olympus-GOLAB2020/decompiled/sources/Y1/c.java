package Y1;

import W1.s;
import W1.u;
import W1.w;
import W1.z;
import com.ironsource.b9;
import kotlin.collections.CollectionsKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class c extends b {
    public static String a(byte[] bArr) {
        String joinToString$default;
        return (bArr == null || (joinToString$default = CollectionsKt.joinToString$default(s.b(bArr), ", ", b9.i.f15550d, b9.i.f15552e, 0, null, null, 56, null)) == null) ? "null" : joinToString$default;
    }

    public static String b(int[] iArr) {
        String joinToString$default;
        return (iArr == null || (joinToString$default = CollectionsKt.joinToString$default(u.b(iArr), ", ", b9.i.f15550d, b9.i.f15552e, 0, null, null, 56, null)) == null) ? "null" : joinToString$default;
    }

    public static String c(short[] sArr) {
        String joinToString$default;
        return (sArr == null || (joinToString$default = CollectionsKt.joinToString$default(z.b(sArr), ", ", b9.i.f15550d, b9.i.f15552e, 0, null, null, 56, null)) == null) ? "null" : joinToString$default;
    }

    public static String d(long[] jArr) {
        String joinToString$default;
        return (jArr == null || (joinToString$default = CollectionsKt.joinToString$default(w.b(jArr), ", ", b9.i.f15550d, b9.i.f15552e, 0, null, null, 56, null)) == null) ? "null" : joinToString$default;
    }
}
