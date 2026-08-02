package io.appmetrica.analytics.impl;

import android.content.Context;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/* renamed from: io.appmetrica.analytics.impl.n6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0813n6 {

    /* renamed from: a, reason: collision with root package name */
    public final C0481aa f12392a;

    /* renamed from: b, reason: collision with root package name */
    public final C0606f6 f12393b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f12394c;

    /* renamed from: d, reason: collision with root package name */
    public final Z9 f12395d;

    public C0813n6(Context context) {
        this(context, new C0481aa(), new C0606f6(), Z9.a(context));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:3|(5:(10:5|(2:7|(1:9)(1:13))|14|15|16|18|19|20|98|25)(1:34)|18|19|20|98)|(1:11)|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C1031vh c1031vh) {
        boolean mkdir;
        String str;
        C1075x9 b4;
        PrintWriter printWriter;
        Z9 z9;
        File crashesDirectory = FileUtils.getCrashesDirectory(this.f12394c);
        this.f12393b.getClass();
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
                Bf bf = c1031vh.f12897e.f10355a;
                str = bf.f10112a.getAsInteger("PROCESS_CFG_PROCESS_ID") + TokenBuilder.TOKEN_DELIMITER + bf.f10112a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
                b4 = this.f12395d.b(str);
                b4.f13020a.lock();
                b4.f13021b.a();
                this.f12392a.getClass();
                printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
                printWriter.write(new C0714jb(c1031vh.f12893a, c1031vh.f12897e, c1031vh.f12896d).k());
                AbstractC0779lo.a((Closeable) printWriter);
                b4.c();
                z9 = this.f12395d;
                synchronized (z9) {
                    z9.f11364b.remove(str);
                }
                return;
            }
            mkdir = crashesDirectory.mkdir();
            printWriter.write(new C0714jb(c1031vh.f12893a, c1031vh.f12897e, c1031vh.f12896d).k());
            AbstractC0779lo.a((Closeable) printWriter);
            b4.c();
            z9 = this.f12395d;
            synchronized (z9) {
            }
        } catch (Throwable unused) {
            AbstractC0779lo.a((Closeable) printWriter);
            b4.c();
            this.f12395d.a(str);
            return;
        }
        if (!mkdir) {
            return;
        }
        Bf bf2 = c1031vh.f12897e.f10355a;
        str = bf2.f10112a.getAsInteger("PROCESS_CFG_PROCESS_ID") + TokenBuilder.TOKEN_DELIMITER + bf2.f10112a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
        b4 = this.f12395d.b(str);
        b4.f13020a.lock();
        b4.f13021b.a();
        this.f12392a.getClass();
        printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
    }

    public C0813n6(Context context, C0481aa c0481aa, C0606f6 c0606f6, Z9 z9) {
        this.f12394c = context;
        this.f12392a = c0481aa;
        this.f12393b = c0606f6;
        this.f12395d = z9;
    }
}
