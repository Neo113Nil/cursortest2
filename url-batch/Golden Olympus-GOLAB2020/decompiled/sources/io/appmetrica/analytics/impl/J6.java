package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/* loaded from: classes3.dex */
public final class J6 {

    /* renamed from: a, reason: collision with root package name */
    public final C3036va f37806a;

    /* renamed from: b, reason: collision with root package name */
    public final B6 f37807b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f37808c;

    /* renamed from: d, reason: collision with root package name */
    public final C3010ua f37809d;

    public J6(Context context) {
        this(context, new C3036va(), new B6(), C3010ua.a(context));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:3|(5:(10:5|(2:7|(1:9)(1:13))|14|15|16|18|19|20|98|25)(1:34)|18|19|20|98)|(1:11)|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Ih ih) {
        boolean mkdir;
        String str;
        S9 b4;
        PrintWriter printWriter;
        C3010ua c3010ua;
        File crashesDirectory = FileUtils.getCrashesDirectory(this.f37808c);
        this.f37807b.getClass();
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
                Pf pf = ih.f37767e.f38817a;
                str = pf.f38132a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + pf.f38132a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
                b4 = this.f37809d.b(str);
                b4.f38250a.lock();
                b4.f38251b.a();
                this.f37806a.getClass();
                printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
                printWriter.write(new Eb(ih.f37763a, ih.f37767e, ih.f37766d).k());
                AbstractC2713io.a((Closeable) printWriter);
                b4.c();
                c3010ua = this.f37809d;
                synchronized (c3010ua) {
                    c3010ua.f39933b.remove(str);
                }
                return;
            }
            mkdir = crashesDirectory.mkdir();
            printWriter.write(new Eb(ih.f37763a, ih.f37767e, ih.f37766d).k());
            AbstractC2713io.a((Closeable) printWriter);
            b4.c();
            c3010ua = this.f37809d;
            synchronized (c3010ua) {
            }
        } catch (Throwable unused) {
            AbstractC2713io.a((Closeable) printWriter);
            b4.c();
            this.f37809d.a(str);
            return;
        }
        if (!mkdir) {
            return;
        }
        Pf pf2 = ih.f37767e.f38817a;
        str = pf2.f38132a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + pf2.f38132a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
        b4 = this.f37809d.b(str);
        b4.f38250a.lock();
        b4.f38251b.a();
        this.f37806a.getClass();
        printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
    }

    public J6(Context context, C3036va c3036va, B6 b6, C3010ua c3010ua) {
        this.f37808c = context;
        this.f37806a = c3036va;
        this.f37807b = b6;
        this.f37809d = c3010ua;
    }
}
