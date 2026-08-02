package E0;

import T.G;

/* loaded from: classes.dex */
public final class d extends G {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, int i4) {
        super(str, null, false, 1);
        switch (i4) {
            case 1:
                super("Missing required field: ".concat(str), null, true, 4);
                break;
            default:
                break;
        }
    }
}
