package com.bytedance.sdk.component;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* compiled from: TTPropHelper.java */
/* loaded from: classes.dex */
public class icD {
    private static pvs Ju = null;
    private static ArrayMap<File, icD> kj = null;
    private static boolean pvs = false;
    private static ArrayMap<String, File> qh;
    private Properties Jd;
    private final File Mxy;
    private volatile boolean NB;
    private final File Wyp;
    private final Object icD;
    private int sUS;
    private long so;
    private final Object vG;
    private long yiw;

    /* compiled from: TTPropHelper.java */
    public interface pvs {
        ExecutorService getExecutorService();
    }

    static /* synthetic */ int Mxy(icD icd) {
        int i = icd.sUS;
        icd.sUS = i - 1;
        return i;
    }

    static /* synthetic */ int NB(icD icd) {
        int i = icd.sUS;
        icd.sUS = i + 1;
        return i;
    }

    static /* synthetic */ long sUS(icD icd) {
        long j = icd.yiw;
        icd.yiw = 1 + j;
        return j;
    }

    public static void pvs(pvs pvsVar) {
        Ju = pvsVar;
    }

    public static icD pvs(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_prop";
        }
        synchronized (icD.class) {
            if (qh == null) {
                qh = new ArrayMap<>();
            }
            File file = qh.get(str);
            if (file == null) {
                file = new File(context.getFilesDir(), str);
                qh.put(str, file);
            }
            if (kj == null) {
                kj = new ArrayMap<>();
            }
            icD icd = kj.get(file);
            if (icd != null) {
                return icd;
            }
            icD icd2 = new icD(file);
            kj.put(file, icd2);
            return icd2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [com.bytedance.sdk.component.icD$1] */
    private icD(File file) {
        Object obj = new Object();
        this.icD = obj;
        this.vG = new Object();
        this.Jd = new Properties();
        this.NB = false;
        this.sUS = 0;
        this.Mxy = file;
        this.Wyp = pvs(file);
        synchronized (obj) {
            this.NB = false;
        }
        pvs pvsVar = Ju;
        if (pvsVar == null || pvsVar.getExecutorService() == null) {
            new Thread("TTPropHelper") { // from class: com.bytedance.sdk.component.icD.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    icD.this.pvs();
                }
            }.start();
        } else {
            Ju.getExecutorService().execute(new Runnable() { // from class: com.bytedance.sdk.component.icD.2
                @Override // java.lang.Runnable
                public void run() {
                    icD.this.pvs();
                }
            });
        }
    }

    static File pvs(File file) {
        return new File(file.getPath() + ".bak");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00b3 -> B:32:0x00bc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pvs() {
        FileInputStream fileInputStream;
        Throwable th;
        synchronized (this.icD) {
            if (this.NB) {
                if (pvs) {
                    Log.d("TTPropHelper", "reload: already loaded, ignore");
                }
                return;
            }
            if (this.Wyp.exists()) {
                this.Mxy.delete();
                this.Wyp.renameTo(this.Mxy);
            }
            if (pvs) {
                Log.d("TTPropHelper", "reload: " + this.Mxy.getAbsolutePath() + ", exist? " + this.Mxy.exists());
            }
            Properties properties = null;
            if (this.Mxy.exists()) {
                Properties properties2 = new Properties();
                try {
                    try {
                        fileInputStream = new FileInputStream(this.Mxy);
                    } catch (Throwable th2) {
                        fileInputStream = null;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    Log.w("TTPropHelper", th3.getMessage());
                }
                try {
                    properties2.load(fileInputStream);
                    if (pvs) {
                        Log.d("TTPropHelper", "reload: find " + properties2.size() + " ,items from " + this.Mxy.getAbsolutePath());
                    }
                    fileInputStream.close();
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        Log.e("TTPropHelper", "reload: ", th);
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        properties = properties2;
                        synchronized (this.icD) {
                        }
                    } catch (Throwable th5) {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th6) {
                                Log.w("TTPropHelper", th6.getMessage());
                            }
                        }
                        throw th5;
                    }
                }
                properties = properties2;
            }
            synchronized (this.icD) {
                if (properties != null) {
                    if (!properties.isEmpty()) {
                        this.Jd = properties;
                    }
                }
                this.NB = true;
                this.icD.notifyAll();
            }
        }
    }

    private void Jd() {
        while (!this.NB) {
            try {
                this.icD.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public String pvs(String str, String str2) {
        String property;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        synchronized (this.icD) {
            Jd();
            property = this.Jd.getProperty(str, str2);
        }
        return property;
    }

    public int pvs(String str, int i) {
        int parseInt;
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        synchronized (this.icD) {
            try {
                try {
                    Jd();
                    parseInt = Integer.parseInt(this.Jd.getProperty(str, String.valueOf(i)));
                } catch (NumberFormatException e) {
                    Log.e("TTPropHelper", e.getMessage());
                    return i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return parseInt;
    }

    public long pvs(String str, long j) {
        long parseLong;
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        synchronized (this.icD) {
            try {
                try {
                    Jd();
                    parseLong = Long.parseLong(this.Jd.getProperty(str, String.valueOf(j)));
                } catch (NumberFormatException e) {
                    Log.e("TTPropHelper", e.getMessage());
                    return j;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return parseLong;
    }

    public float pvs(String str, float f) {
        float parseFloat;
        if (TextUtils.isEmpty(str)) {
            return f;
        }
        synchronized (this.icD) {
            try {
                try {
                    Jd();
                    parseFloat = Float.parseFloat(this.Jd.getProperty(str, String.valueOf(f)));
                } catch (NumberFormatException e) {
                    Log.e("TTPropHelper", e.getMessage());
                    return f;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return parseFloat;
    }

    public boolean pvs(String str, boolean z) {
        boolean parseBoolean;
        if (TextUtils.isEmpty(str)) {
            return z;
        }
        synchronized (this.icD) {
            try {
                try {
                    Jd();
                    parseBoolean = Boolean.parseBoolean(this.Jd.getProperty(str, String.valueOf(z)));
                } catch (NumberFormatException e) {
                    Log.e("TTPropHelper", e.getMessage());
                    return z;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return parseBoolean;
    }

    public boolean pvs(String str) {
        boolean containsKey;
        synchronized (this.icD) {
            try {
                try {
                    Jd();
                    containsKey = this.Jd.containsKey(str);
                } catch (NumberFormatException e) {
                    Log.e("TTPropHelper", e.getMessage());
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return containsKey;
    }

    public vG icD() {
        return new vG();
    }

    /* compiled from: TTPropHelper.java */
    /* renamed from: com.bytedance.sdk.component.icD$icD, reason: collision with other inner class name */
    private static class C0049icD {
        volatile boolean Jd;
        boolean NB;
        final Properties icD;
        final long pvs;
        final CountDownLatch vG;

        private C0049icD(long j, Properties properties) {
            this.vG = new CountDownLatch(1);
            this.Jd = false;
            this.NB = false;
            this.pvs = j;
            this.icD = properties;
        }

        void pvs(boolean z, boolean z2) {
            this.NB = z;
            this.Jd = z2;
            this.vG.countDown();
        }
    }

    /* compiled from: TTPropHelper.java */
    public class vG implements SharedPreferences.Editor {
        private final Object icD = new Object();
        private final Map<String, Object> vG = new HashMap();
        private boolean Jd = false;

        public vG() {
        }

        @Override // android.content.SharedPreferences.Editor
        public /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
            return pvs(str, (Set<String>) set);
        }

        public vG pvs(String str, Set<String> set) {
            synchronized (this.icD) {
                this.vG.put(str, set == null ? null : new HashSet(set));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
        public vG putInt(String str, int i) {
            synchronized (this.icD) {
                this.vG.put(str, Integer.valueOf(i));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
        public vG putLong(String str, long j) {
            synchronized (this.icD) {
                this.vG.put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
        public vG putFloat(String str, float f) {
            synchronized (this.icD) {
                this.vG.put(str, Float.valueOf(f));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
        public vG putString(String str, String str2) {
            synchronized (this.icD) {
                this.vG.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
        public vG putBoolean(String str, boolean z) {
            synchronized (this.icD) {
                this.vG.put(str, Boolean.valueOf(z));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
        public vG remove(String str) {
            synchronized (this.icD) {
                this.vG.put(str, this);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
        public vG clear() {
            synchronized (this.icD) {
                this.Jd = true;
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            long currentTimeMillis = icD.pvs ? System.currentTimeMillis() : 0L;
            C0049icD icD = icD();
            icD.this.pvs(icD, true);
            try {
                icD.vG.await();
                if (icD.pvs) {
                    Log.d("TTPropHelper", icD.this.Mxy.getName() + ":" + icD.pvs + " committed after " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                }
                return icD.Jd;
            } catch (InterruptedException unused) {
                if (!icD.pvs) {
                    return false;
                }
                Log.d("TTPropHelper", icD.this.Mxy.getName() + ":" + icD.pvs + " committed after " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                return false;
            } catch (Throwable th) {
                if (icD.pvs) {
                    Log.d("TTPropHelper", icD.this.Mxy.getName() + ":" + icD.pvs + " committed after " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                }
                throw th;
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            icD.this.pvs(icD(), false);
        }

        private C0049icD icD() {
            Properties properties;
            long j;
            Object obj;
            boolean z;
            synchronized (icD.this.icD) {
                if (icD.this.sUS > 0) {
                    Properties properties2 = new Properties();
                    properties2.putAll(icD.this.Jd);
                    icD.this.Jd = properties2;
                }
                properties = icD.this.Jd;
                icD.NB(icD.this);
                synchronized (this.icD) {
                    boolean z2 = false;
                    if (this.Jd) {
                        if (properties.isEmpty()) {
                            z = false;
                        } else {
                            properties.clear();
                            z = true;
                        }
                        this.Jd = false;
                        z2 = z;
                    }
                    for (Map.Entry<String, Object> entry : this.vG.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value != this && value != null) {
                            if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(String.valueOf(value))) {
                                properties.put(key, String.valueOf(value));
                                z2 = true;
                            }
                        }
                        if (properties.containsKey(key)) {
                            properties.remove(key);
                            z2 = true;
                        }
                    }
                    this.vG.clear();
                    if (z2) {
                        icD.sUS(icD.this);
                    }
                    j = icD.this.yiw;
                }
            }
            return new C0049icD(j, properties);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(final C0049icD c0049icD, final boolean z) {
        boolean z2;
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.icD.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (icD.this.vG) {
                    try {
                        icD.this.icD(c0049icD, z);
                    } catch (OutOfMemoryError unused) {
                    }
                }
                synchronized (icD.this.icD) {
                    icD.Mxy(icD.this);
                }
            }
        };
        if (z) {
            synchronized (this.icD) {
                z2 = this.sUS == 1;
            }
            if (z2) {
                runnable.run();
                return;
            }
        }
        com.bytedance.sdk.component.vG.pvs(runnable, true ^ z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0129 A[Catch: all -> 0x01a5, TryCatch #4 {all -> 0x01a5, blocks: (B:38:0x0093, B:39:0x0095, B:56:0x0125, B:58:0x0129, B:59:0x0130, B:61:0x0139, B:62:0x0141, B:64:0x014d, B:103:0x01a3, B:104:0x01a4, B:55:0x0124, B:72:0x00ee, B:73:0x00f4, B:83:0x011d, B:99:0x01a1, B:98:0x0198, B:93:0x0192, B:79:0x0117, B:54:0x00e8), top: B:37:0x0093, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139 A[Catch: all -> 0x01a5, TryCatch #4 {all -> 0x01a5, blocks: (B:38:0x0093, B:39:0x0095, B:56:0x0125, B:58:0x0129, B:59:0x0130, B:61:0x0139, B:62:0x0141, B:64:0x014d, B:103:0x01a3, B:104:0x01a4, B:55:0x0124, B:72:0x00ee, B:73:0x00f4, B:83:0x011d, B:99:0x01a1, B:98:0x0198, B:93:0x0192, B:79:0x0117, B:54:0x00e8), top: B:37:0x0093, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014d A[Catch: all -> 0x01a5, TRY_LEAVE, TryCatch #4 {all -> 0x01a5, blocks: (B:38:0x0093, B:39:0x0095, B:56:0x0125, B:58:0x0129, B:59:0x0130, B:61:0x0139, B:62:0x0141, B:64:0x014d, B:103:0x01a3, B:104:0x01a4, B:55:0x0124, B:72:0x00ee, B:73:0x00f4, B:83:0x011d, B:99:0x01a1, B:98:0x0198, B:93:0x0192, B:79:0x0117, B:54:0x00e8), top: B:37:0x0093, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void icD(C0049icD c0049icD, boolean z) {
        long j;
        long j2;
        Throwable th;
        long j3;
        String str;
        String message;
        FileOutputStream fileOutputStream;
        boolean z2;
        long currentTimeMillis = pvs ? System.currentTimeMillis() : 0L;
        boolean exists = this.Mxy.exists();
        if (pvs) {
            j = System.currentTimeMillis();
            j2 = j;
        } else {
            j = 0;
            j2 = 0;
        }
        if (exists) {
            if (this.so >= c0049icD.pvs) {
                z2 = false;
            } else if (z) {
                z2 = true;
            } else {
                synchronized (this.icD) {
                    z2 = this.yiw == c0049icD.pvs;
                }
            }
            if (!z2) {
                c0049icD.pvs(false, true);
                return;
            }
            boolean exists2 = this.Wyp.exists();
            if (pvs) {
                j2 = System.currentTimeMillis();
            }
            if (!exists2) {
                if (!this.Mxy.renameTo(this.Wyp)) {
                    Log.e("TTPropHelper", "Couldn't rename file " + this.Mxy + " to backup file " + this.Wyp);
                    c0049icD.pvs(false, false);
                    return;
                }
            } else {
                this.Mxy.delete();
            }
        }
        try {
            synchronized (this.vG) {
                FileOutputStream fileOutputStream2 = null;
                try {
                    try {
                        fileOutputStream = new FileOutputStream(this.Mxy);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e) {
                    e = e;
                }
                try {
                    try {
                        j3 = pvs ? System.currentTimeMillis() : 0L;
                    } catch (Exception e2) {
                        e = e2;
                        fileOutputStream2 = fileOutputStream;
                        j3 = 0;
                        Log.e("TTPropHelper", "saveToLocal: ", e);
                        c0049icD.pvs(false, false);
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th3) {
                                str = "TTPropHelper";
                                message = th3.getMessage();
                                Log.w(str, message);
                                if (pvs) {
                                }
                                this.Wyp.delete();
                                if (pvs) {
                                }
                                this.so = c0049icD.pvs;
                                c0049icD.pvs(true, true);
                                if (pvs) {
                                }
                            }
                        }
                        if (pvs) {
                        }
                        this.Wyp.delete();
                        if (pvs) {
                        }
                        this.so = c0049icD.pvs;
                        c0049icD.pvs(true, true);
                        if (pvs) {
                        }
                    }
                    try {
                        c0049icD.icD.store(fileOutputStream, (String) null);
                        if (pvs) {
                            Log.d("TTPropHelper", "save: " + c0049icD.icD);
                            Log.d("TTPropHelper", "saveToLocal: save to" + this.Mxy.getAbsolutePath() + FirebaseAnalytics.Param.SUCCESS);
                        }
                    } catch (Exception e3) {
                        e = e3;
                        fileOutputStream2 = fileOutputStream;
                        Log.e("TTPropHelper", "saveToLocal: ", e);
                        c0049icD.pvs(false, false);
                        if (fileOutputStream2 != null) {
                        }
                        if (pvs) {
                        }
                        this.Wyp.delete();
                        if (pvs) {
                        }
                        this.so = c0049icD.pvs;
                        c0049icD.pvs(true, true);
                        if (pvs) {
                        }
                    }
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th4) {
                        str = "TTPropHelper";
                        message = th4.getMessage();
                        Log.w(str, message);
                        if (pvs) {
                        }
                        this.Wyp.delete();
                        if (pvs) {
                        }
                        this.so = c0049icD.pvs;
                        c0049icD.pvs(true, true);
                        if (pvs) {
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                            throw th;
                        } catch (Throwable th6) {
                            Log.w("TTPropHelper", th6.getMessage());
                            throw th;
                        }
                    }
                    throw th;
                }
            }
            long currentTimeMillis2 = pvs ? System.currentTimeMillis() : 0L;
            this.Wyp.delete();
            long currentTimeMillis3 = pvs ? System.currentTimeMillis() : 0L;
            this.so = c0049icD.pvs;
            c0049icD.pvs(true, true);
            if (pvs) {
                Log.d("TTPropHelper", "write: " + (j - currentTimeMillis) + "/" + (j2 - currentTimeMillis) + "/" + (j3 - currentTimeMillis) + "/" + (currentTimeMillis2 - currentTimeMillis) + "/" + (currentTimeMillis3 - currentTimeMillis));
            }
        } catch (Throwable th7) {
            Log.w("TTPropHelper", "writeToFile: Got exception:", th7);
            if (this.Mxy.exists() && !this.Mxy.delete()) {
                Log.e("TTPropHelper", "Couldn't clean up partially-written file " + this.Mxy);
            }
            c0049icD.pvs(false, false);
        }
    }
}
