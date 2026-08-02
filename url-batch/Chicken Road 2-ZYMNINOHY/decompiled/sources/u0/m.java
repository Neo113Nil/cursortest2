package u0;

import java.io.IOException;

/* loaded from: classes.dex */
public final class m extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m(Throwable th) {
        super(r0.toString(), th);
        String str;
        StringBuilder sb = new StringBuilder("Unexpected ");
        sb.append(th.getClass().getSimpleName());
        if (th.getMessage() != null) {
            str = ": " + th.getMessage();
        } else {
            str = "";
        }
        sb.append(str);
    }
}
