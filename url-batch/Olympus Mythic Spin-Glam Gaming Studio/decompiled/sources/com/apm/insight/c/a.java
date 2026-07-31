package com.apm.insight.c;

import com.apm.insight.e;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: CommandWriter.java */
/* loaded from: classes5.dex */
public final class a {
    private static AtomicBoolean a = new AtomicBoolean(false);

    public static boolean a() {
        synchronized (a) {
            try {
                if (a.get()) {
                    return false;
                }
                a.set(true);
                return b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean b() {
        if (!com.apm.insight.runtime.a.g()) {
            return false;
        }
        try {
            File file = new File(e.h().getFilesDir(), "apminsight/crashCommand");
            file.mkdirs();
            new File(file, "0_" + System.currentTimeMillis()).createNewFile();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
