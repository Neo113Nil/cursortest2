package com.apm.insight.b;

import android.content.Context;
import androidx.annotation.NonNull;

/* compiled from: CrashANRHandler.java */
/* loaded from: classes15.dex */
public class f {
    private static volatile f a;
    private static g c;
    private final b b;

    public static f a(Context context) {
        if (a == null) {
            synchronized (f.class) {
                try {
                    if (a == null) {
                        a = new f(context);
                    }
                } finally {
                }
            }
        }
        return a;
    }

    private f(@NonNull Context context) {
        this.b = new b(context);
        g gVar = new g();
        c = gVar;
        gVar.a();
    }

    public final b a() {
        return this.b;
    }

    public static g b() {
        return c;
    }

    public final void c() {
        this.b.a();
    }

    public final void d() {
        this.b.b();
    }
}
