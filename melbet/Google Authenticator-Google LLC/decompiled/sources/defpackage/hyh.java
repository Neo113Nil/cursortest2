package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hyh {
    public static final Logger a = Logger.getLogger(hyh.class.getName());
    private static final AtomicBoolean b = new AtomicBoolean(false);

    private hyh() {
    }

    public static boolean a() {
        return b.get();
    }
}
