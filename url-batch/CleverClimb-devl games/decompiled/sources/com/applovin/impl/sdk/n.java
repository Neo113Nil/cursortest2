package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class n {

    /* renamed from: b, reason: collision with root package name */
    private final j f3320b;

    /* renamed from: c, reason: collision with root package name */
    private final p f3321c;

    /* renamed from: a, reason: collision with root package name */
    private final String f3319a = "FileManager";

    /* renamed from: d, reason: collision with root package name */
    private final Object f3322d = new Object();

    n(j jVar) {
        this.f3320b = jVar;
        this.f3321c = jVar.u();
    }

    private long a(long j) {
        return j / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    private void a(long j, Context context) {
        p pVar;
        String str;
        String str2;
        long c2 = c();
        if (c2 == -1) {
            pVar = this.f3321c;
            str = "FileManager";
            str2 = "Cache has no maximum size set; skipping drop...";
        } else if (a(j) > c2) {
            this.f3321c.a("FileManager", "Cache has exceeded maximum size; dropping...");
            g(context);
            this.f3320b.D().a(com.applovin.impl.sdk.c.g.f);
            return;
        } else {
            pVar = this.f3321c;
            str = "FileManager";
            str2 = "Cache is present but under size limit; not dropping...";
        }
        pVar.a(str, str2);
    }

    private boolean a() {
        return ((Boolean) this.f3320b.a(com.applovin.impl.sdk.b.b.bl)).booleanValue();
    }

    private long b() {
        long longValue = ((Long) this.f3320b.a(com.applovin.impl.sdk.b.b.bm)).longValue();
        if (longValue < 0 || !a()) {
            return -1L;
        }
        return longValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0042, code lost:
    
        if (r1 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean b(ByteArrayOutputStream byteArrayOutputStream, File file) {
        boolean z;
        FileOutputStream fileOutputStream;
        this.f3321c.a("FileManager", "Writing resource to filesystem: " + file.getName());
        synchronized (this.f3322d) {
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e) {
                e = e;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                byteArrayOutputStream.writeTo(fileOutputStream);
                z = true;
                try {
                    fileOutputStream.close();
                } catch (Exception unused) {
                }
            } catch (IOException e2) {
                e = e2;
                fileOutputStream2 = fileOutputStream;
                this.f3321c.b("FileManager", "Unable to write data to file.", e);
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream2 = fileOutputStream;
                this.f3321c.b("FileManager", "Unknown failure to write file.", th);
            }
        }
        return z;
        z = false;
        return z;
    }

    private boolean b(File file) {
        boolean delete;
        this.f3321c.a("FileManager", "Removing file " + file.getName() + " from filesystem...");
        synchronized (this.f3322d) {
            try {
                try {
                    delete = file.delete();
                } catch (Exception e) {
                    this.f3321c.b("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", e);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return delete;
    }

    private int c() {
        int intValue = ((Integer) this.f3320b.a(com.applovin.impl.sdk.b.b.bn)).intValue();
        if (intValue < 0 || !a()) {
            return -1;
        }
        return intValue;
    }

    private boolean d(Context context) {
        if (com.applovin.impl.sdk.e.d.a("android.permission.WRITE_EXTERNAL_STORAGE", context)) {
            return true;
        }
        if (com.applovin.impl.sdk.e.d.e() && !((Boolean) this.f3320b.a(com.applovin.impl.sdk.b.b.bq)).booleanValue()) {
            return true;
        }
        this.f3320b.u().c("FileManager", "Application lacks required WRITE_EXTERNAL_STORAGE manifest permission.");
        return false;
    }

    private File e(Context context) {
        return d(context) ? new File(context.getExternalFilesDir(null), "al") : new File(context.getCacheDir(), "al");
    }

    private long f(Context context) {
        long j;
        boolean z;
        long b2 = b();
        boolean z2 = b2 != -1;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        synchronized (this.f3322d) {
            j = 0;
            for (File file : a(context)) {
                if (!z2 || seconds - TimeUnit.MILLISECONDS.toSeconds(file.lastModified()) <= b2) {
                    z = false;
                } else {
                    this.f3321c.a("FileManager", "File " + file.getName() + " has expired, removing...");
                    b(file);
                    z = true;
                }
                if (z) {
                    this.f3320b.D().a(com.applovin.impl.sdk.c.g.e);
                } else {
                    j += file.length();
                }
            }
        }
        return j;
    }

    private void g(Context context) {
        synchronized (this.f3322d) {
            Iterator<File> it = a(context).iterator();
            while (it.hasNext()) {
                b(it.next());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.FileInputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ByteArrayOutputStream a(File file) {
        FileInputStream fileInputStream;
        if (file == null) {
            return null;
        }
        ?? r2 = "FileManager";
        this.f3321c.a("FileManager", "Reading resource from filesystem: " + file.getName());
        synchronized (this.f3322d) {
            try {
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = fileInputStream.read(bArr, 0, bArr.length);
                            if (read >= 0) {
                                try {
                                    try {
                                        byteArrayOutputStream.write(bArr, 0, read);
                                    } catch (Exception unused) {
                                        try {
                                            fileInputStream.close();
                                        } catch (Exception unused2) {
                                        }
                                        return null;
                                    }
                                } catch (Exception unused3) {
                                    byteArrayOutputStream.close();
                                    fileInputStream.close();
                                    return null;
                                }
                            } else {
                                try {
                                    break;
                                } catch (Exception unused4) {
                                }
                            }
                        }
                        fileInputStream.close();
                        return byteArrayOutputStream;
                    } catch (FileNotFoundException e) {
                        e = e;
                        this.f3321c.b("FileManager", "File not found. " + e);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception unused5) {
                            }
                        }
                        return null;
                    } catch (IOException e2) {
                        e = e2;
                        this.f3321c.a("FileManager", "Failed to read file: " + file.getName() + e);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception unused6) {
                            }
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        this.f3321c.b("FileManager", "Unknown failure to read file.", th);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception unused7) {
                            }
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (r2 != 0) {
                        try {
                            r2.close();
                        } catch (Exception unused8) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException e3) {
                e = e3;
                fileInputStream = null;
            } catch (IOException e4) {
                e = e4;
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0145 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0140 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v5, types: [com.applovin.impl.sdk.p] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.io.ByteArrayOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ByteArrayOutputStream a(String str, List<String> list, boolean z) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (z && !com.applovin.impl.sdk.e.l.a(str, list)) {
            this.f3321c.a("FileManager", "Domain is not whitelisted, skipping precache for url: " + str);
            return null;
        }
        if (((Boolean) this.f3320b.a(com.applovin.impl.sdk.b.b.dJ)).booleanValue() && !str.contains("https://")) {
            this.f3320b.u().c("FileManager", "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting...");
            str = str.replace("http://", "https://");
        }
        ?? r9 = this.f3321c;
        ?? r10 = "FileManager";
        ?? r1 = "Loading " + str + "...";
        r9.a("FileManager", r1);
        try {
            try {
                r9 = new ByteArrayOutputStream();
                try {
                    r10 = (HttpURLConnection) new URL(str).openConnection();
                } catch (IOException e) {
                    e = e;
                    r10 = 0;
                    r9 = r9;
                    inputStream = r10;
                    this.f3321c.b("FileManager", "Error loading " + str, e);
                    if (inputStream != null) {
                    }
                    if (r9 != 0) {
                    }
                    if (r10 != 0) {
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    r10 = 0;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = r1;
            }
            try {
                r10.setConnectTimeout(((Integer) this.f3320b.a(com.applovin.impl.sdk.b.b.dH)).intValue());
                r10.setReadTimeout(((Integer) this.f3320b.a(com.applovin.impl.sdk.b.b.dI)).intValue());
                r10.setDefaultUseCaches(true);
                r10.setUseCaches(true);
                r10.setAllowUserInteraction(false);
                r10.setInstanceFollowRedirects(true);
                int responseCode = r10.getResponseCode();
                if (responseCode >= 200 && responseCode < 300) {
                    inputStream = r10.getInputStream();
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr, 0, bArr.length);
                            if (read < 0) {
                                break;
                            }
                            try {
                                try {
                                    r9.write(bArr, 0, read);
                                } catch (Exception unused) {
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Exception unused2) {
                                        }
                                    }
                                    try {
                                        r9.close();
                                    } catch (Exception unused3) {
                                    }
                                    if (r10 != 0) {
                                        try {
                                            r10.disconnect();
                                        } catch (Exception unused4) {
                                        }
                                    }
                                    return null;
                                }
                            } catch (Exception unused5) {
                                r9.close();
                                if (inputStream != null) {
                                }
                                r9.close();
                                if (r10 != 0) {
                                }
                                return null;
                            }
                        }
                        this.f3321c.a("FileManager", "Loaded resource at " + str);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception unused6) {
                            }
                        }
                        try {
                            r9.close();
                        } catch (Exception unused7) {
                        }
                        if (r10 != 0) {
                            try {
                                r10.disconnect();
                            } catch (Exception unused8) {
                            }
                        }
                        return r9;
                    } catch (IOException e2) {
                        e = e2;
                        this.f3321c.b("FileManager", "Error loading " + str, e);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception unused9) {
                            }
                        }
                        if (r9 != 0) {
                            try {
                                r9.close();
                            } catch (Exception unused10) {
                            }
                        }
                        if (r10 != 0) {
                            try {
                                r10.disconnect();
                            } catch (Exception unused11) {
                            }
                        }
                        return null;
                    }
                }
                try {
                    r9.close();
                } catch (Exception unused12) {
                }
                if (r10 != 0) {
                    try {
                        r10.disconnect();
                    } catch (Exception unused13) {
                    }
                }
                return null;
            } catch (IOException e3) {
                e = e3;
                inputStream = null;
            } catch (Throwable th3) {
                th = th3;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (Exception unused14) {
                    }
                }
                if (r9 != 0) {
                    try {
                        r9.close();
                    } catch (Exception unused15) {
                    }
                }
                if (r10 == 0) {
                    throw th;
                }
                try {
                    r10.disconnect();
                    throw th;
                } catch (Exception unused16) {
                    throw th;
                }
            }
        } catch (IOException e4) {
            e = e4;
            r9 = 0;
            r10 = 0;
        } catch (Throwable th4) {
            th = th4;
            r9 = 0;
            r10 = 0;
        }
    }

    public File a(String str, Context context, boolean z) {
        File file;
        if (!com.applovin.impl.sdk.e.i.b(str)) {
            this.f3320b.u().a("FileManager", "Nothing to look up, skipping...");
            return null;
        }
        this.f3321c.a("FileManager", "Looking up cached resource: " + str);
        if (!d(context) && !z) {
            return null;
        }
        if (str.contains("icon")) {
            str = str.replace("/", "_").replace(".", "_");
        }
        synchronized (this.f3322d) {
            File e = e(context);
            file = new File(e, str);
            try {
                e.mkdirs();
            } catch (Exception unused) {
                return null;
            }
        }
        return file;
    }

    public String a(Context context, String str, String str2, List<String> list, boolean z, com.applovin.impl.sdk.c.e eVar) throws MalformedURLException {
        return a(context, str, str2, list, z, false, eVar);
    }

    public String a(Context context, String str, String str2, List<String> list, boolean z, boolean z2, com.applovin.impl.sdk.c.e eVar) throws MalformedURLException {
        if (!com.applovin.impl.sdk.e.i.b(str)) {
            this.f3320b.u().a("FileManager", "Nothing to cache, skipping...");
            return null;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        if (com.applovin.impl.sdk.e.i.b(lastPathSegment) && com.applovin.impl.sdk.e.i.b(str2)) {
            lastPathSegment = str2 + lastPathSegment;
        }
        File a2 = a(lastPathSegment, context, false);
        if (!a(a2, str, list, z, eVar)) {
            return null;
        }
        this.f3321c.a("FileManager", "Caching succeeded for file " + lastPathSegment);
        return z2 ? Uri.fromFile(a2).toString() : lastPathSegment;
    }

    public List<File> a(Context context) {
        List<File> asList;
        File e = e(context);
        if (!e.isDirectory()) {
            return new ArrayList(0);
        }
        synchronized (this.f3322d) {
            asList = Arrays.asList(e.listFiles());
        }
        return asList;
    }

    public boolean a(ByteArrayOutputStream byteArrayOutputStream, File file) {
        if (file == null) {
            return false;
        }
        this.f3321c.a("FileManager", "Caching " + file.getAbsolutePath() + "...");
        if (byteArrayOutputStream == null || byteArrayOutputStream.size() <= 0) {
            this.f3321c.c("FileManager", "No data for " + file.getAbsolutePath());
            return false;
        }
        if (b(byteArrayOutputStream, file)) {
            this.f3321c.a("FileManager", "Caching completed for " + file);
            return true;
        }
        this.f3321c.d("FileManager", "Unable to cache " + file.getAbsolutePath());
        return false;
    }

    public boolean a(File file, String str, List<String> list, com.applovin.impl.sdk.c.e eVar) {
        return a(file, str, list, true, eVar);
    }

    public boolean a(File file, String str, List<String> list, boolean z, com.applovin.impl.sdk.c.e eVar) {
        if (file == null || !file.exists() || file.isDirectory()) {
            ByteArrayOutputStream a2 = a(str, list, z);
            if (eVar != null && a2 != null) {
                eVar.a(a2.size());
            }
            return a(a2, file);
        }
        this.f3320b.u().a("FileManager", "File exists for " + str);
        if (eVar == null) {
            return true;
        }
        eVar.b(file.length());
        return true;
    }

    public boolean a(String str, Context context) {
        boolean b2;
        synchronized (this.f3322d) {
            b2 = b(str, context, false);
        }
        return b2;
    }

    public boolean b(Context context) {
        if (((Boolean) this.f3320b.a(com.applovin.impl.sdk.b.b.br)).booleanValue()) {
            try {
                a(".nomedia", context, false);
                File file = new File(e(context), ".nomedia");
                if (file.exists()) {
                    return true;
                }
                this.f3320b.u().a("FileManager", "Dropping .nomedia file at " + file.getAbsolutePath());
                return file.createNewFile();
            } catch (Exception e) {
                this.f3320b.u().a("FileManager", "Failed to create nomedia file", e);
            }
        }
        return false;
    }

    boolean b(String str, Context context, boolean z) {
        boolean z2;
        synchronized (this.f3322d) {
            File a2 = a(str, context, z);
            z2 = (a2 == null || !a2.exists() || a2.isDirectory()) ? false : true;
        }
        return z2;
    }

    public void c(Context context) {
        try {
            if (a()) {
                if (!this.f3320b.c()) {
                    this.f3321c.d("FileManager", "Cannot empty file cache after SDK has completed initialization and ad loads are in progress!");
                    return;
                }
                this.f3321c.a("FileManager", "Compacting cache...");
                synchronized (this.f3322d) {
                    a(f(context), context);
                }
            }
        } catch (Exception e) {
            this.f3321c.b("FileManager", "Caught exception while compacting cache!", e);
            this.f3320b.v().a((com.applovin.impl.sdk.b.b<?>) com.applovin.impl.sdk.b.b.bl, (Object) false);
            this.f3320b.v().a();
        }
    }
}
