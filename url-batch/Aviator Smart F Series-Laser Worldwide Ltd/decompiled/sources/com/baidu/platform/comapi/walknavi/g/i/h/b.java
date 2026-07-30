package com.baidu.platform.comapi.walknavi.g.i.h;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.ar.npc.ArBridge;
import com.baidu.platform.comapi.walknavi.g.i.h.e.c;
import com.baidu.platform.comapi.walknavi.g.i.k.i;
import java.io.File;
import java.io.FileFilter;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f10037a;

    /* renamed from: b, reason: collision with root package name */
    private c f10038b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0123b f10039c;

    /* renamed from: d, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.g.i.h.c f10040d;

    class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return file.getName().endsWith(".so");
        }
    }

    /* renamed from: com.baidu.platform.comapi.walknavi.g.i.h.b$b, reason: collision with other inner class name */
    public interface InterfaceC0123b {
        void a(boolean z7, boolean z8);

        void onDownloadProgress(int i8);
    }

    public b(Context context) {
        this.f10037a = context;
        this.f10040d = new com.baidu.platform.comapi.walknavi.g.i.h.c(context);
    }

    private void b(String str) {
        a();
        c cVar = new c(this.f10037a, str);
        this.f10038b = cVar;
        cVar.start();
    }

    public void a(InterfaceC0123b interfaceC0123b) {
        this.f10039c = interfaceC0123b;
    }

    public boolean c() {
        File[] a8;
        if (b()) {
            return true;
        }
        String c8 = this.f10040d.c();
        if (TextUtils.isEmpty(c8)) {
            return false;
        }
        File file = new File(b(this.f10037a), c8);
        if (!file.exists() || (a8 = a(new File(file, "res"))) == null || a8.length <= 0) {
            return false;
        }
        return b(a8);
    }

    public boolean d(String str) {
        if (TextUtils.isEmpty(str) || b()) {
            return false;
        }
        if (!TextUtils.equals(this.f10040d.a(), com.baidu.platform.comapi.walknavi.g.i.k.b.b())) {
            return true;
        }
        String c8 = this.f10040d.c();
        return TextUtils.isEmpty(c8) || !TextUtils.equals(c8, c(str));
    }

    public void e(String str) {
        if (com.baidu.platform.comapi.walknavi.g.i.h.a.a(this.f10039c)) {
            return;
        }
        if (b()) {
            a(true, false);
            return;
        }
        if (!TextUtils.equals(this.f10040d.a(), com.baidu.platform.comapi.walknavi.g.i.k.b.b())) {
            b(str);
            return;
        }
        String c8 = this.f10040d.c();
        String c9 = c(str);
        if (!TextUtils.isEmpty(c8) && TextUtils.equals(c8, c9)) {
            File file = new File(b(this.f10037a), c8);
            if (file.exists()) {
                File[] a8 = a(new File(file, "res"));
                if (a8 != null && a8.length > 0) {
                    a(b(a8), false);
                    return;
                }
                this.f10040d.b("");
            }
        }
        b(str);
    }

    private class c extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private Context f10042a;

        /* renamed from: b, reason: collision with root package name */
        private String f10043b;

        /* renamed from: c, reason: collision with root package name */
        private volatile boolean f10044c = false;

        class a implements c.InterfaceC0126c {

            /* renamed from: com.baidu.platform.comapi.walknavi.g.i.h.b$c$a$a, reason: collision with other inner class name */
            class RunnableC0124a implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ long f10047a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ long f10048b;

                RunnableC0124a(long j8, long j9) {
                    this.f10047a = j8;
                    this.f10048b = j9;
                }

                @Override // java.lang.Runnable
                public void run() {
                    b.this.a((int) ((this.f10047a * 100.0f) / this.f10048b));
                }
            }

            a() {
            }

            @Override // com.baidu.platform.comapi.walknavi.g.i.h.e.c.b
            public boolean a() {
                return c.this.b();
            }

            @Override // com.baidu.platform.comapi.walknavi.g.i.h.e.c.d
            public void a(long j8, long j9) {
                i.a(new RunnableC0124a(j8, j9));
            }
        }

        /* renamed from: com.baidu.platform.comapi.walknavi.g.i.h.b$c$b, reason: collision with other inner class name */
        class RunnableC0125b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f10050a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f10051b;

            RunnableC0125b(boolean z7, d dVar) {
                this.f10050a = z7;
                this.f10051b = dVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f10050a) {
                    b.this.f10040d.a(com.baidu.platform.comapi.walknavi.g.i.k.b.b());
                    b.this.f10040d.b(this.f10051b.f10054a);
                }
                if (c.this.b()) {
                    return;
                }
                b.this.a(this.f10050a, true);
            }
        }

        public c(Context context, String str) {
            this.f10042a = context;
            this.f10043b = str;
        }

        private boolean a(String str, File file) {
            return com.baidu.platform.comapi.walknavi.g.i.h.e.b.a(str, file, new a());
        }

        public boolean b() {
            return this.f10044c;
        }

        public void cancel() {
            this.f10044c = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            d dVar = new d();
            String str = this.f10043b;
            dVar.f10055b = str;
            dVar.f10054a = b.c(str);
            String str2 = dVar.f10055b;
            File file = new File(b.b(this.f10042a), dVar.f10054a);
            File file2 = new File(file, "res.zip");
            com.baidu.platform.comapi.walknavi.g.i.h.e.a.c(file2);
            boolean a8 = a(str2, file2);
            if (b()) {
                com.baidu.platform.comapi.walknavi.g.i.h.e.a.a(file);
            } else if (a8 && com.baidu.platform.comapi.walknavi.g.i.h.e.d.a(file2, file) && b.this.b(new File(file, "res"))) {
                a(true, dVar);
            } else {
                a(false, (d) null);
            }
        }

        private void a(boolean z7, d dVar) {
            i.a(new RunnableC0125b(z7, dVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(File file) {
        return b(a(file));
    }

    private boolean b(File[] fileArr) {
        if (!a(fileArr)) {
            return false;
        }
        if (fileArr != null) {
            for (File file : fileArr) {
                if (!c(file)) {
                    return false;
                }
            }
        }
        return b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z7, boolean z8) {
        InterfaceC0123b interfaceC0123b = this.f10039c;
        if (interfaceC0123b != null) {
            interfaceC0123b.a(z7, z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i8) {
        InterfaceC0123b interfaceC0123b = this.f10039c;
        if (interfaceC0123b != null) {
            interfaceC0123b.onDownloadProgress(i8);
        }
    }

    private boolean c(File file) {
        try {
            if (!file.exists()) {
                return false;
            }
            String absolutePath = file.getAbsolutePath();
            if (!com.baidu.platform.comapi.walknavi.g.i.h.a.a(absolutePath)) {
                return true;
            }
            System.load(absolutePath);
            return true;
        } catch (Throwable th) {
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("loadSoFile error: " + th.getMessage());
            return false;
        }
    }

    private File[] a(File file) {
        return file.listFiles(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static File b(Context context) {
        File file = new File(context.getFilesDir(), "baiduarsolib");
        com.baidu.platform.comapi.walknavi.g.i.h.e.a.c(file);
        return file;
    }

    public void a() {
        c cVar = this.f10038b;
        if (cVar != null) {
            cVar.cancel();
            this.f10038b = null;
        }
    }

    private static boolean a(File[] fileArr) {
        if (fileArr != null && fileArr.length == 1) {
            boolean z7 = false;
            for (File file : fileArr) {
                if ("libbaiduar.so".equals(file.getName())) {
                    z7 = true;
                }
            }
            if (z7) {
                return true;
            }
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("SoDownloader, Can not found libbaiduar.so");
            return false;
        }
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("SoDownloader, The number of files is not 1");
        return false;
    }

    private static boolean b() {
        try {
            return ArBridge.libraryHasLoaded();
        } catch (Throwable th) {
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("hasLoad() error: " + th.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(String str) {
        int lastIndexOf = str.lastIndexOf(47) + 1;
        int lastIndexOf2 = str.lastIndexOf(46);
        if (lastIndexOf2 != -1) {
            return str.substring(lastIndexOf, lastIndexOf2);
        }
        return str.substring(lastIndexOf);
    }
}
