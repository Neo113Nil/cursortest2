package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cxa {
    public static volatile boolean a = false;
    public static final int b;
    private static volatile boolean c = false;

    static {
        b = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
