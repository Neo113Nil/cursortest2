package io.appmetrica.analytics.impl;

import android.content.Context;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/* renamed from: io.appmetrica.analytics.impl.u6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0872u6 {

    /* renamed from: a, reason: collision with root package name */
    public final C0540ha f8395a;

    /* renamed from: b, reason: collision with root package name */
    public final C0665m6 f8396b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f8397c;

    /* renamed from: d, reason: collision with root package name */
    public final C0514ga f8398d;

    public C0872u6(Context context) {
        this(context, new C0540ha(), new C0665m6(), C0514ga.a(context));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:3|(5:(10:5|(2:7|(1:9)(1:13))|14|15|16|18|19|20|98|25)(1:34)|18|19|20|98)|(1:11)|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Ah ah) {
        boolean mkdir;
        String str;
        E9 b3;
        PrintWriter printWriter;
        C0514ga c0514ga;
        File crashesDirectory = FileUtils.getCrashesDirectory(this.f8397c);
        this.f8396b.getClass();
        if (crashesDirectory == null) {
            return;
        }
        try {
            if (crashesDirectory.exists()) {
                if (!crashesDirectory.isDirectory()) {
                    if (!crashesDirectory.delete()) {
                        return;
                    } else {
                        mkdir = crashesDirectory.mkdir();
                    }
                }
                Gf gf = ah.f5757e.f6427a;
                str = gf.f6044a.getAsInteger("PROCESS_CFG_PROCESS_ID") + TokenBuilder.TOKEN_DELIMITER + gf.f6044a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
                b3 = this.f8398d.b(str);
                b3.f5956a.lock();
                b3.f5957b.a();
                this.f8395a.getClass();
                printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
                printWriter.write(new C0774qb(ah.f5753a, ah.f5757e, ah.f5756d).k());
                AbstractC0709no.a((Closeable) printWriter);
                b3.c();
                c0514ga = this.f8398d;
                synchronized (c0514ga) {
                    c0514ga.f7392b.remove(str);
                }
                return;
            }
            mkdir = crashesDirectory.mkdir();
            printWriter.write(new C0774qb(ah.f5753a, ah.f5757e, ah.f5756d).k());
            AbstractC0709no.a((Closeable) printWriter);
            b3.c();
            c0514ga = this.f8398d;
            synchronized (c0514ga) {
            }
        } catch (Throwable unused) {
            AbstractC0709no.a((Closeable) printWriter);
            b3.c();
            this.f8398d.a(str);
            return;
        }
        if (!mkdir) {
            return;
        }
        Gf gf2 = ah.f5757e.f6427a;
        str = gf2.f6044a.getAsInteger("PROCESS_CFG_PROCESS_ID") + TokenBuilder.TOKEN_DELIMITER + gf2.f6044a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
        b3 = this.f8398d.b(str);
        b3.f5956a.lock();
        b3.f5957b.a();
        this.f8395a.getClass();
        printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
    }

    public C0872u6(Context context, C0540ha c0540ha, C0665m6 c0665m6, C0514ga c0514ga) {
        this.f8397c = context;
        this.f8395a = c0540ha;
        this.f8396b = c0665m6;
        this.f8398d = c0514ga;
    }
}
