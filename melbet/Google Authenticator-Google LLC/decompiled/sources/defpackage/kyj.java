package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyj {
    public static final kxf a;

    static {
        Handler createAsync;
        createAsync = Handler.createAsync(Looper.getMainLooper());
        int i = kyi.a;
        a = new kyg(createAsync, "main", false);
    }
}
