package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class zc0 implements Iterable, pw {
    public final /* synthetic */ ij f;

    public zc0(ij ijVar) {
        this.f = ijVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new hj(this.f);
    }
}
