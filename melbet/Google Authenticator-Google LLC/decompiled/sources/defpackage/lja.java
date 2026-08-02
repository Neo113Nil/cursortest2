package defpackage;

import android.content.Context;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lja {
    private static final String a = "lja";
    private static liz b;

    private lja() {
    }

    public static liz a(Context context, liw liwVar) {
        liz lizVar;
        synchronized (lja.class) {
            if (b == null && Build.VERSION.SDK_INT >= 30 && ljb.b(context, liwVar)) {
                try {
                    b = new lkg();
                } catch (Exception e) {
                    jav.c(a, "Exception creating an instance of CronetLoggerImpl", e);
                }
            }
            if (b == null) {
                b = new lju();
            }
            lizVar = b;
        }
        return lizVar;
    }
}
