package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/* renamed from: io.appmetrica.analytics.impl.u6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1023u6 {

    /* renamed from: a, reason: collision with root package name */
    public final C0691ha f9339a;

    /* renamed from: b, reason: collision with root package name */
    public final C0816m6 f9340b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f9341c;

    /* renamed from: d, reason: collision with root package name */
    public final C0665ga f9342d;

    public C1023u6(Context context) {
        this(context, new C0691ha(), new C0816m6(), C0665ga.a(context));
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
        E9 b6;
        PrintWriter printWriter;
        C0665ga c0665ga;
        File crashesDirectory = FileUtils.getCrashesDirectory(this.f9341c);
        this.f9340b.getClass();
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
                Gf gf = ah.f6534e.f7238a;
                str = gf.f6837a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + gf.f6837a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
                b6 = this.f9342d.b(str);
                b6.f6745a.lock();
                b6.f6746b.a();
                this.f9339a.getClass();
                printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
                printWriter.write(new C0925qb(ah.f6530a, ah.f6534e, ah.f6533d).k());
                AbstractC0860no.a((Closeable) printWriter);
                b6.c();
                c0665ga = this.f9342d;
                synchronized (c0665ga) {
                    c0665ga.f8266b.remove(str);
                }
                return;
            }
            mkdir = crashesDirectory.mkdir();
            printWriter.write(new C0925qb(ah.f6530a, ah.f6534e, ah.f6533d).k());
            AbstractC0860no.a((Closeable) printWriter);
            b6.c();
            c0665ga = this.f9342d;
            synchronized (c0665ga) {
            }
        } catch (Throwable unused) {
            AbstractC0860no.a((Closeable) printWriter);
            b6.c();
            this.f9342d.a(str);
            return;
        }
        if (!mkdir) {
            return;
        }
        Gf gf2 = ah.f6534e.f7238a;
        str = gf2.f6837a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + gf2.f6837a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
        b6 = this.f9342d.b(str);
        b6.f6745a.lock();
        b6.f6746b.a();
        this.f9339a.getClass();
        printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
    }

    public C1023u6(Context context, C0691ha c0691ha, C0816m6 c0816m6, C0665ga c0665ga) {
        this.f9341c = context;
        this.f9339a = c0691ha;
        this.f9340b = c0816m6;
        this.f9342d = c0665ga;
    }
}
