package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class l40 {
    public final rv a;
    public final int[] b;
    public final String[] c;
    public final Set d;

    public l40(rv rvVar, int[] iArr, String[] strArr) {
        Set singleton;
        rvVar.getClass();
        iArr.getClass();
        strArr.getClass();
        this.a = rvVar;
        this.b = iArr;
        this.c = strArr;
        if (iArr.length != strArr.length) {
            s9.u("Check failed.");
            throw null;
        }
        if (strArr.length == 0) {
            singleton = ym.f;
        } else {
            singleton = Collections.singleton(strArr[0]);
            singleton.getClass();
        }
        this.d = singleton;
    }
}
