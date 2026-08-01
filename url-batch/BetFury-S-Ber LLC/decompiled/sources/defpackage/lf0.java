package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class lf0 extends IOException {
    public final kn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf0(kn knVar) {
        super("stream was reset: " + knVar);
        knVar.getClass();
        this.f = knVar;
    }
}
