package com.tapjoy.internal;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class ka {

    /* renamed from: a, reason: collision with root package name */
    static final Logger f8482a = Logger.getLogger(ka.class.getName());

    private ka() {
    }

    public static void a(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                try {
                    f8482a.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e);
                } catch (IOException e2) {
                    f8482a.log(Level.SEVERE, "IOException should not have been thrown.", (Throwable) e2);
                }
            }
        }
    }
}
