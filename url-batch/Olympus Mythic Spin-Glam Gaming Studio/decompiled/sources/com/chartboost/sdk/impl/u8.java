package com.chartboost.sdk.impl;

import android.content.Context;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class u8 {
    public final AtomicReference a;
    public final v8 b;

    public u8(Context context, AtomicReference atomicReference) {
        v8 v8Var = new v8(context.getCacheDir());
        this.b = v8Var;
        this.a = atomicReference;
        try {
            long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(((sg) atomicReference.get()).p);
            File file = new File(v8Var.a, "templates");
            if (file.exists()) {
                a(file.listFiles(), currentTimeMillis);
                a(v8Var);
            }
        } catch (Exception e) {
            xb.b("Exception while cleaning up templates directory at " + this.b.f.getPath(), e);
            e.printStackTrace();
        }
    }

    public File[] c() {
        File b = b();
        if (b != null) {
            return b.listFiles();
        }
        return null;
    }

    public final void a(File[] fileArr, long j) {
        if (fileArr != null) {
            for (File file : fileArr) {
                if (file.isDirectory()) {
                    b(file.listFiles(), j);
                    a(file.listFiles(), file);
                }
            }
        }
    }

    public final void b(File[] fileArr, long j) {
        if (fileArr != null) {
            for (File file : fileArr) {
                if (file.lastModified() < j && !file.delete()) {
                    xb.b("Unable to delete " + file.getPath(), null);
                }
            }
        }
    }

    public JSONObject e() {
        String[] list;
        JSONObject jSONObject = new JSONObject();
        try {
            File file = a().a;
            for (String str : ((sg) this.a.get()).q) {
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
                    b3.a(jSONObject, str, jSONArray);
                }
            }
        } catch (Exception e) {
            xb.b("getWebViewCacheAssets: " + e, null);
        }
        return jSONObject;
    }

    public boolean c(File file) {
        return file != null && file.exists() && file.length() > 0;
    }

    public File d() {
        return this.b.i;
    }

    public void d(File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                int read = randomAccessFile.read();
                randomAccessFile.seek(0L);
                randomAccessFile.write(read);
                randomAccessFile.close();
            } finally {
            }
        } catch (FileNotFoundException e) {
            xb.b("File not found when attempting to touch", e);
        } catch (IOException e2) {
            xb.b("IOException when attempting to touch file", e2);
        }
    }

    public v8 a() {
        return this.b;
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
                xb.b("getFolderSize: " + e, null);
                return 0L;
            }
        }
        if (file != null) {
            return file.length();
        }
        return 0L;
    }

    public boolean a(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        return file.delete();
    }

    public final void a(File[] fileArr, File file) {
        if (fileArr == null || fileArr.length != 0 || file.delete()) {
            return;
        }
        xb.b("Unable to delete " + file.getPath(), null);
    }

    public File b() {
        return this.b.h;
    }

    public File a(File file, String str) {
        if (file == null || str == null) {
            return null;
        }
        File file2 = new File(file, str);
        if (!file2.exists() || file2.length() <= 0) {
            return null;
        }
        return file2;
    }

    public Boolean a(d0 d0Var) {
        Map d = d0Var.d();
        v8 a = a();
        if (a == null) {
            return Boolean.FALSE;
        }
        File file = a.a;
        for (u1 u1Var : d.values()) {
            File a2 = u1Var.a(file);
            if (a2 == null) {
                return Boolean.FALSE;
            }
            if (!a2.exists()) {
                xb.b("Asset does not exist: " + u1Var.b, null);
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    public final void a(v8 v8Var) {
        File file = new File(v8Var.a, ".adId");
        if (!file.exists() || file.delete()) {
            return;
        }
        xb.b("Unable to delete " + file.getPath(), null);
    }
}
