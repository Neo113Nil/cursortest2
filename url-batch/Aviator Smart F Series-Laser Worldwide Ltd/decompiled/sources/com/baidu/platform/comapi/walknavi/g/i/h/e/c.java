package com.baidu.platform.comapi.walknavi.g.i.h.e;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public class c {

    static class a implements InterfaceC0126c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f10056a;

        a(d dVar) {
            this.f10056a = dVar;
        }

        @Override // com.baidu.platform.comapi.walknavi.g.i.h.e.c.b
        public boolean a() {
            return false;
        }

        @Override // com.baidu.platform.comapi.walknavi.g.i.h.e.c.d
        public void a(long j8, long j9) {
            d dVar = this.f10056a;
            if (dVar != null) {
                dVar.a(j8, j9);
            }
        }
    }

    public interface b {
        boolean a();
    }

    /* renamed from: com.baidu.platform.comapi.walknavi.g.i.h.e.c$c, reason: collision with other inner class name */
    public interface InterfaceC0126c extends d, b {
    }

    public interface d {
        void a(long j8, long j9);
    }

    public static void a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    public static void a(InputStream inputStream, File file) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = com.baidu.platform.comapi.walknavi.g.i.h.e.a.d(file);
            try {
                a(inputStream, fileOutputStream);
                a(fileOutputStream);
            } catch (Throwable th) {
                th = th;
                a(fileOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }

    public static void a(InputStream inputStream, File file, long j8, d dVar) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = com.baidu.platform.comapi.walknavi.g.i.h.e.a.d(file);
            try {
                a(inputStream, fileOutputStream, j8, dVar);
                a(fileOutputStream);
            } catch (Throwable th) {
                th = th;
                a(fileOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }

    public static void a(InputStream inputStream, OutputStream outputStream, long j8, d dVar) {
        a(inputStream, outputStream, j8, (InterfaceC0126c) new a(dVar));
    }

    public static void a(InputStream inputStream, OutputStream outputStream, long j8, InterfaceC0126c interfaceC0126c) {
        byte[] bArr = new byte[1024];
        long j9 = 0;
        do {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            }
            outputStream.write(bArr, 0, read);
            j9 += read;
            if (interfaceC0126c != null) {
                interfaceC0126c.a(j9, j8);
            }
        } while (!interfaceC0126c.a());
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
