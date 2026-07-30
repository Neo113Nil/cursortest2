package f2;

import t1.u;

/* renamed from: f2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0398e extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0398e(String str) {
        super(str);
        u.d(str, "Detail message must not be empty");
    }
}
