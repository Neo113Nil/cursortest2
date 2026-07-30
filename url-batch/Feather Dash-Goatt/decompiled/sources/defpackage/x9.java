package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class x9 implements Sequence {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ x9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new t((Object[]) obj);
            case 1:
                return ((IntRange) obj).iterator();
            case 2:
                return new oh0(this);
            default:
                return (Iterator) obj;
        }
    }
}
