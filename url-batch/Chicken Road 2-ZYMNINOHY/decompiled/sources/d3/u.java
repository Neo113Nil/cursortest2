package d3;

import c3.C0292d;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class u extends AbstractC0347t0 {
    public static Map A(C0292d pair) {
        kotlin.jvm.internal.i.e(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.f5724a, pair.f5725b);
        kotlin.jvm.internal.i.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static int z(int i4) {
        if (i4 < 0) {
            return i4;
        }
        if (i4 < 3) {
            return i4 + 1;
        }
        if (i4 < 1073741824) {
            return (int) ((i4 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
