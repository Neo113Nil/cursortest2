package com.chartboost.sdk.Libraries;

import android.content.Context;
import com.chartboost.sdk.impl.bh;
import com.chartboost.sdk.impl.s;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final File f3583a;

    /* renamed from: b, reason: collision with root package name */
    public final File f3584b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference<com.chartboost.sdk.Model.e> f3585c;

    /* renamed from: d, reason: collision with root package name */
    private final g f3586d;
    private final AtomicReference<g> e;
    private s f;

    public f(s sVar, Context context, AtomicReference<com.chartboost.sdk.Model.e> atomicReference) {
        g[] gVarArr;
        File[] listFiles;
        g[] gVarArr2;
        f fVar = this;
        fVar.f = sVar;
        fVar.f3586d = new g(context.getCacheDir());
        fVar.e = new AtomicReference<>();
        fVar.f3585c = atomicReference;
        try {
            File b2 = sVar.b();
            if (b2 != null) {
                fVar.e.set(new g(b2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        fVar.f3584b = new File(fVar.f3586d.f3587a, "track");
        fVar.f3583a = new File(fVar.f3586d.f3587a, com.umeng.analytics.pro.b.ac);
        g[] gVarArr3 = {fVar.f3586d, fVar.e.get()};
        int length = gVarArr3.length;
        int i = 0;
        while (i < length) {
            g gVar = gVarArr3[i];
            try {
                boolean z = gVar == fVar.f3586d;
                if (gVar == null || !(z || a())) {
                    gVarArr = gVarArr3;
                } else {
                    long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(atomicReference.get().w);
                    File file = new File(gVar.f3587a, "templates");
                    if (file.exists() && (listFiles = file.listFiles()) != null) {
                        int length2 = listFiles.length;
                        int i2 = 0;
                        while (i2 < length2) {
                            File file2 = listFiles[i2];
                            if (file2.isDirectory()) {
                                File[] listFiles2 = file2.listFiles();
                                if (listFiles2 != null) {
                                    int length3 = listFiles2.length;
                                    int i3 = 0;
                                    while (i3 < length3) {
                                        File file3 = listFiles2[i3];
                                        if (!z) {
                                            if (file3.lastModified() < currentTimeMillis) {
                                            }
                                            gVarArr = gVarArr3;
                                            i3++;
                                            gVarArr3 = gVarArr;
                                        }
                                        if (!file3.delete()) {
                                            StringBuilder sb = new StringBuilder();
                                            gVarArr = gVarArr3;
                                            try {
                                                sb.append("Unable to delete ");
                                                sb.append(file3.getPath());
                                                CBLogging.b("FileCache", sb.toString());
                                                i3++;
                                                gVarArr3 = gVarArr;
                                            } catch (Exception e2) {
                                                e = e2;
                                                CBLogging.a("FileCache", "Exception while cleaning up templates directory at " + gVar.f.getPath(), e);
                                                e.printStackTrace();
                                                i++;
                                                gVarArr3 = gVarArr;
                                                fVar = this;
                                            }
                                        }
                                        gVarArr = gVarArr3;
                                        i3++;
                                        gVarArr3 = gVarArr;
                                    }
                                }
                                gVarArr2 = gVarArr3;
                                File[] listFiles3 = file2.listFiles();
                                if (listFiles3 != null && listFiles3.length == 0 && !file2.delete()) {
                                    CBLogging.b("FileCache", "Unable to delete " + file2.getPath());
                                }
                            } else {
                                gVarArr2 = gVarArr3;
                            }
                            i2++;
                            gVarArr3 = gVarArr2;
                        }
                    }
                    gVarArr = gVarArr3;
                    File file4 = new File(gVar.f3587a, ".adId");
                    if (file4.exists() && ((z || file4.lastModified() < currentTimeMillis) && !file4.delete())) {
                        CBLogging.b("FileCache", "Unable to delete " + file4.getPath());
                    }
                }
            } catch (Exception e3) {
                e = e3;
                gVarArr = gVarArr3;
            }
            i++;
            gVarArr3 = gVarArr;
            fVar = this;
        }
    }

    public synchronized byte[] a(File file) {
        byte[] bArr;
        if (file == null) {
            return null;
        }
        try {
            bArr = bh.b(file);
        } catch (Exception e) {
            CBLogging.a("FileCache", "Error loading cache from disk", e);
            com.chartboost.sdk.Tracking.a.a(getClass(), "readByteArrayFromDisk", e);
            bArr = null;
        }
        return bArr;
    }

    public String a(String str) {
        File file = new File(d().g, str);
        if (file.exists()) {
            return file.getPath();
        }
        return null;
    }

    public boolean a() {
        try {
            String c2 = this.f.c();
            if (c2 != null && c2.equals("mounted")) {
                if (!com.chartboost.sdk.i.n) {
                    return true;
                }
            }
        } catch (Exception e) {
            com.chartboost.sdk.Tracking.a.a(getClass(), "isExternalStorageAvailable", e);
        }
        CBLogging.e("FileCache", "External Storage unavailable");
        return false;
    }

    public boolean b(String str) {
        if (d().f3590d == null || str == null) {
            return false;
        }
        return new File(d().f3590d, str).exists();
    }

    public JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        String[] list = d().g.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(".nomedia") && !str.endsWith(".tmp")) {
                    jSONArray.put(str);
                }
            }
        }
        return jSONArray;
    }

    public JSONObject c() {
        String[] list;
        JSONObject jSONObject = new JSONObject();
        try {
            File file = d().f3587a;
            for (String str : this.f3585c.get().x) {
                if (!str.equals("templates")) {
                    File file2 = new File(file, str);
                    JSONArray jSONArray = new JSONArray();
                    if (file2.exists() && (list = file2.list()) != null) {
                        for (String str2 : list) {
                            if (!str2.equals(".nomedia") && !str2.endsWith(".tmp")) {
                                jSONArray.put(str2);
                            }
                        }
                    }
                    e.a(jSONObject, str, jSONArray);
                }
            }
        } catch (Exception e) {
            com.chartboost.sdk.Tracking.a.a(getClass(), "getWebViewCacheAssets", e);
        }
        return jSONObject;
    }

    public g d() {
        if (a()) {
            g gVar = this.e.get();
            if (gVar == null) {
                try {
                    File b2 = this.f.b();
                    if (b2 != null) {
                        this.e.compareAndSet(null, new g(b2));
                        gVar = this.e.get();
                    }
                } catch (Exception e) {
                    com.chartboost.sdk.Tracking.a.a(getClass(), "currentLocations", e);
                }
            }
            if (gVar != null) {
                return gVar;
            }
        }
        return this.f3586d;
    }

    public long b(File file) {
        long j = 0;
        if (file != null) {
            try {
                if (file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles == null) {
                        return 0L;
                    }
                    for (File file2 : listFiles) {
                        j += b(file2);
                    }
                    return j;
                }
            } catch (Exception e) {
                com.chartboost.sdk.Tracking.a.a(f.class, "getFolderSize", e);
                return 0L;
            }
        }
        if (file != null) {
            return file.length();
        }
        return 0L;
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        g gVar = this.e.get();
        if (gVar != null) {
            e.a(jSONObject, ".chartboost-external-folder-size", Long.valueOf(b(gVar.f3587a)));
        }
        e.a(jSONObject, ".chartboost-internal-folder-size", Long.valueOf(b(this.f3586d.f3587a)));
        File file = d().f3587a;
        String[] list = file.list();
        if (list != null && list.length > 0) {
            for (String str : list) {
                File file2 = new File(file, str);
                JSONObject jSONObject2 = new JSONObject();
                e.a(jSONObject2, file2.getName() + "-size", Long.valueOf(b(file2)));
                String[] list2 = file2.list();
                if (list2 != null) {
                    e.a(jSONObject2, "count", Integer.valueOf(list2.length));
                }
                e.a(jSONObject, file2.getName(), jSONObject2);
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (r0 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002e, code lost:
    
        if (r0 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(File file) {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                try {
                    randomAccessFile = new RandomAccessFile(file, "rw");
                } catch (Throwable th) {
                    th = th;
                }
            } catch (FileNotFoundException e) {
                e = e;
            } catch (IOException e2) {
                e = e2;
            }
            try {
                randomAccessFile.seek(0L);
                int read = randomAccessFile.read();
                randomAccessFile.seek(0L);
                randomAccessFile.write(read);
                randomAccessFile.close();
            } catch (FileNotFoundException e3) {
                e = e3;
                randomAccessFile2 = randomAccessFile;
                CBLogging.a("FileCache", "File not found when attempting to touch", e);
            } catch (IOException e4) {
                e = e4;
                randomAccessFile2 = randomAccessFile;
                CBLogging.a("FileCache", "IOException when attempting to touch file", e);
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile2 = randomAccessFile;
                if (randomAccessFile2 != null) {
                    try {
                        randomAccessFile2.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (IOException unused2) {
        }
    }
}
