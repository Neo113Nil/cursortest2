package io.appmetrica.analytics.impl;

import android.content.Context;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/* renamed from: io.appmetrica.analytics.impl.o6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0397o6 {

    /* renamed from: a, reason: collision with root package name */
    public final C0068ba f1408a;
    public final C0193g6 b;
    public final Context c;
    public final C0042aa d;

    public C0397o6(Context context) {
        this(context, new C0068ba(), new C0193g6(), C0042aa.a(context));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:3|(5:(10:5|(2:7|(1:9)(1:13))|14|15|16|18|19|20|9b|25)(1:34)|18|19|20|9b)|(1:11)|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a6, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0607wh c0607wh) {
        boolean mkdir;
        String str;
        C0649y9 b;
        PrintWriter printWriter;
        C0042aa c0042aa;
        File crashesDirectory = FileUtils.getCrashesDirectory(this.c);
        this.b.getClass();
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
                Cf cf = c0607wh.e.f884a;
                str = cf.f798a.getAsInteger("PROCESS_CFG_PROCESS_ID") + TokenBuilder.TOKEN_DELIMITER + cf.f798a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
                b = this.d.b(str);
                b.f1581a.lock();
                b.b.a();
                this.f1408a.getClass();
                printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
                printWriter.write(new C0301kb(c0607wh.f1550a, c0607wh.e, c0607wh.d).k());
                mo.a((Closeable) printWriter);
                b.c();
                c0042aa = this.d;
                synchronized (c0042aa) {
                    c0042aa.b.remove(str);
                }
                return;
            }
            mkdir = crashesDirectory.mkdir();
            printWriter.write(new C0301kb(c0607wh.f1550a, c0607wh.e, c0607wh.d).k());
            mo.a((Closeable) printWriter);
            b.c();
            c0042aa = this.d;
            synchronized (c0042aa) {
            }
        } catch (Throwable unused) {
            mo.a((Closeable) printWriter);
            b.c();
            this.d.a(str);
            return;
        }
        if (!mkdir) {
            return;
        }
        Cf cf2 = c0607wh.e.f884a;
        str = cf2.f798a.getAsInteger("PROCESS_CFG_PROCESS_ID") + TokenBuilder.TOKEN_DELIMITER + cf2.f798a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
        b = this.d.b(str);
        b.f1581a.lock();
        b.b.a();
        this.f1408a.getClass();
        printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
    }

    public C0397o6(Context context, C0068ba c0068ba, C0193g6 c0193g6, C0042aa c0042aa) {
        this.c = context;
        this.f1408a = c0068ba;
        this.b = c0193g6;
        this.d = c0042aa;
    }
}
