package Z1;

import o1.u;

/* loaded from: classes.dex */
public final class e extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str) {
        super(str);
        u.d(str, "Detail message must not be empty");
    }
}
