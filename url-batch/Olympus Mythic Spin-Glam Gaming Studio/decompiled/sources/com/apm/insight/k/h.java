package com.apm.insight.k;

import android.content.Context;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.m;
import com.apm.insight.runtime.o;

/* compiled from: LaunchScanner.java */
/* loaded from: classes15.dex */
public final class h implements Runnable {
    private Context a;

    private h(Context context) {
        this.a = context;
    }

    public static boolean a() {
        return b.a().c() || !com.apm.insight.l.a.b(com.apm.insight.e.g());
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.apm.insight.b.f.a(this.a).a().f();
        } catch (Throwable unused) {
        }
        try {
            if (com.apm.insight.l.a.b(this.a)) {
                b.a().a(com.apm.insight.l.k.b(this.a));
            } else {
                NativeImpl.j();
            }
        } catch (Throwable th) {
            try {
                com.apm.insight.a.b(th);
                o.a().a(com.apm.insight.e.a().b(), com.apm.insight.entity.b.b());
                if (m.a().a() == null) {
                }
            } finally {
                o.a().a(com.apm.insight.e.a().b(), com.apm.insight.entity.b.b());
                if (m.a().a() != null) {
                    com.apm.insight.j.d.a(m.a().a(), this.a).a();
                }
            }
        }
    }

    public static void a(Context context) {
        m.a().a(new h(context), 0L);
    }
}
