package org.greenrobot.eventbus;

import java.io.PrintStream;
import java.util.logging.Level;

/* loaded from: classes5.dex */
public interface f {

    public static class a {
        public static f get() {
            return m7.a.areAvailable() ? m7.a.get().logger : new b();
        }
    }

    public static class b implements f {
        @Override // org.greenrobot.eventbus.f
        public void log(Level level, String str) {
            System.out.println("[" + level + "] " + str);
        }

        @Override // org.greenrobot.eventbus.f
        public void log(Level level, String str, Throwable th) {
            PrintStream printStream = System.out;
            printStream.println("[" + level + "] " + str);
            th.printStackTrace(printStream);
        }
    }

    void log(Level level, String str);

    void log(Level level, String str, Throwable th);
}
