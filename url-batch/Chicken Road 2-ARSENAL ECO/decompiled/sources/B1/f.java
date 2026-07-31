package B1;

import U0.t;

/* loaded from: classes.dex */
public final class f extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str) {
        super(str);
        t.d(str, "Detail message must not be empty");
    }
}
