package com.bytedance.sdk.component;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import com.safedk.android.internal.partials.PangleFilesBridge;
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
import org.jetbrains.annotations.NotNull;

/* loaded from: classes11.dex */
public class fs {
    private static boolean fs;

    @GuardedBy
    private static ArrayMap<String, File> klz;
    private static ArrayMap<File, fs> mw;
    protected static zmn zmn;

    @GuardedBy
    private Properties btk;

    @GuardedBy
    private long bvs;
    private final Object fb;
    private volatile boolean hhw;
    private final File iv;

    @GuardedBy
    private int nps;
    private final File rc;

    @GuardedBy
    private long zg;
    private final Object zn;

    public interface zmn {
        HandlerThread zmn(String str, int i);

        ExecutorService zmn();
    }

    static /* synthetic */ int btk(fs fsVar) {
        int i = fsVar.nps;
        fsVar.nps = i + 1;
        return i;
    }

    static /* synthetic */ int bvs(fs fsVar) {
        int i = fsVar.nps;
        fsVar.nps = i - 1;
        return i;
    }

    static /* synthetic */ long hhw(fs fsVar) {
        long j = fsVar.zg;
        fsVar.zg = 1 + j;
        return j;
    }

    public static void zmn(@NotNull zmn zmnVar) {
        zmn = zmnVar;
    }

    @RequiresApi
    public static fs zmn(@NotNull Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_prop";
        }
        synchronized (fs.class) {
            try {
                if (klz == null) {
                    klz = new ArrayMap<>();
                }
                File file = klz.get(str);
                if (file == null) {
                    file = new File(context.getFilesDir(), str);
                    klz.put(str, file);
                }
                if (mw == null) {
                    mw = new ArrayMap<>();
                }
                fs fsVar = mw.get(file);
                if (fsVar != null) {
                    return fsVar;
                }
                fs fsVar2 = new fs(file);
                mw.put(file, fsVar2);
                return fsVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private fs(File file) {
        Object obj = new Object();
        this.zn = obj;
        this.fb = new Object();
        this.btk = new Properties();
        this.hhw = false;
        this.nps = 0;
        this.iv = file;
        this.rc = zmn(file);
        synchronized (obj) {
            this.hhw = false;
        }
        zmn zmnVar = zmn;
        if (zmnVar == null || zmnVar.zmn() == null) {
            new Thread("TTPropHelper") { // from class: com.bytedance.sdk.component.fs.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    fs.this.zmn();
                }
            }.start();
        } else {
            zmn.zmn().execute(new Runnable() { // from class: com.bytedance.sdk.component.fs.2
                @Override // java.lang.Runnable
                public void run() {
                    fs.this.zmn();
                }
            });
        }
    }

    static File zmn(File file) {
        return new File(file.getPath() + ".bak");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00d2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00a1 -> B:30:0x00bb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zmn() {
        FileInputStream fileInputStream;
        Throwable th;
        synchronized (this.zn) {
            try {
                if (this.hhw) {
                    if (fs) {
                        Log.d("TTPropHelper", "reload: already loaded, ignore");
                    }
                    return;
                }
                if (this.rc.exists()) {
                    this.iv.delete();
                    this.rc.renameTo(this.iv);
                }
                if (fs) {
                    Log.d("TTPropHelper", "reload: " + this.iv.getAbsolutePath() + ", exist? " + this.iv.exists());
                }
                Properties properties = null;
                if (this.iv.exists()) {
                    Properties properties2 = new Properties();
                    try {
                        try {
                            fileInputStream = new FileInputStream(this.iv);
                        } catch (Throwable th2) {
                            Log.w("TTPropHelper", th2.getMessage());
                        }
                        try {
                            properties2.load(fileInputStream);
                            if (fs) {
                                Log.d("TTPropHelper", "reload: find " + properties2.size() + " ,items from " + this.iv.getAbsolutePath());
                            }
                            fileInputStream.close();
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                Log.e("TTPropHelper", "reload: ", th);
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                properties = properties2;
                                synchronized (this.zn) {
                                }
                            } catch (Throwable th4) {
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th5) {
                                        Log.w("TTPropHelper", th5.getMessage());
                                    }
                                }
                                throw th4;
                            }
                        }
                    } catch (Throwable th6) {
                        fileInputStream = null;
                        th = th6;
                    }
                    properties = properties2;
                }
                synchronized (this.zn) {
                    if (properties != null) {
                        try {
                            if (!properties.isEmpty()) {
                                this.btk = properties;
                            }
                        } catch (Throwable th7) {
                            throw th7;
                        }
                    }
                    this.hhw = true;
                    this.zn.notifyAll();
                }
            } catch (Throwable th8) {
                throw th8;
            }
        }
    }

    private void fb() {
        while (!this.hhw) {
            try {
                this.zn.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public String zmn(String str, String str2) {
        String property;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        synchronized (this.zn) {
            fb();
            property = this.btk.getProperty(str, str2);
        }
        return property;
    }

    public int zmn(String str, int i) {
        int parseInt;
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        synchronized (this.zn) {
            try {
                try {
                    fb();
                    parseInt = Integer.parseInt(this.btk.getProperty(str, String.valueOf(i)));
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

    public long zmn(String str, long j) {
        long parseLong;
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        synchronized (this.zn) {
            try {
                try {
                    fb();
                    parseLong = Long.parseLong(this.btk.getProperty(str, String.valueOf(j)));
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

    public boolean zmn(String str, boolean z) {
        boolean parseBoolean;
        if (TextUtils.isEmpty(str)) {
            return z;
        }
        synchronized (this.zn) {
            try {
                try {
                    fb();
                    parseBoolean = Boolean.parseBoolean(this.btk.getProperty(str, String.valueOf(z)));
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

    public zn fs() {
        return new zn();
    }

    /* renamed from: com.bytedance.sdk.component.fs$fs, reason: collision with other inner class name */
    private static class C0129fs {
        boolean btk;

        @GuardedBy
        volatile boolean fb;
        final Properties fs;
        final long zmn;
        final CountDownLatch zn;

        private C0129fs(long j, Properties properties) {
            this.zn = new CountDownLatch(1);
            this.fb = false;
            this.btk = false;
            this.zmn = j;
            this.fs = properties;
        }

        void zmn(boolean z, boolean z2) {
            this.btk = z;
            this.fb = z2;
            this.zn.countDown();
        }
    }

    public class zn implements SharedPreferences.Editor {
        private final Object fs = new Object();

        @GuardedBy
        private final Map<String, Object> zn = new HashMap();

        @GuardedBy
        private boolean fb = false;

        public zn() {
        }

        @Override // android.content.SharedPreferences.Editor
        public /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
            return zmn(str, (Set<String>) set);
        }

        public zn zmn(String str, Set<String> set) {
            synchronized (this.fs) {
                this.zn.put(str, set == null ? null : new HashSet(set));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public zn putInt(String str, int i) {
            synchronized (this.fs) {
                this.zn.put(str, Integer.valueOf(i));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public zn putLong(String str, long j) {
            synchronized (this.fs) {
                this.zn.put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public zn putFloat(String str, float f) {
            synchronized (this.fs) {
                this.zn.put(str, Float.valueOf(f));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public zn putString(String str, String str2) {
            synchronized (this.fs) {
                this.zn.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public zn putBoolean(String str, boolean z) {
            synchronized (this.fs) {
                this.zn.put(str, Boolean.valueOf(z));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public zn remove(String str) {
            synchronized (this.fs) {
                this.zn.put(str, this);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public zn clear() {
            synchronized (this.fs) {
                this.fb = true;
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            long currentTimeMillis = fs.fs ? System.currentTimeMillis() : 0L;
            C0129fs fs = fs();
            fs.this.zmn(fs, true);
            try {
                fs.zn.await();
                if (fs.fs) {
                    Log.d("TTPropHelper", fs.this.iv.getName() + ":" + fs.zmn + " committed after " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                }
                return fs.fb;
            } catch (InterruptedException unused) {
                if (!fs.fs) {
                    return false;
                }
                Log.d("TTPropHelper", fs.this.iv.getName() + ":" + fs.zmn + " committed after " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                return false;
            } catch (Throwable th) {
                if (fs.fs) {
                    Log.d("TTPropHelper", fs.this.iv.getName() + ":" + fs.zmn + " committed after " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                }
                throw th;
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            fs.this.zmn(fs(), false);
        }

        private C0129fs fs() {
            Properties properties;
            long j;
            Object obj;
            boolean z;
            synchronized (fs.this.zn) {
                try {
                    if (fs.this.nps > 0) {
                        Properties properties2 = new Properties();
                        properties2.putAll(fs.this.btk);
                        fs.this.btk = properties2;
                    }
                    properties = fs.this.btk;
                    fs.btk(fs.this);
                    synchronized (this.fs) {
                        try {
                            boolean z2 = false;
                            if (this.fb) {
                                if (properties.isEmpty()) {
                                    z = false;
                                } else {
                                    properties.clear();
                                    z = true;
                                }
                                this.fb = false;
                                z2 = z;
                            }
                            for (Map.Entry<String, Object> entry : this.zn.entrySet()) {
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
                            this.zn.clear();
                            if (z2) {
                                fs.hhw(fs.this);
                            }
                            j = fs.this.zg;
                        } finally {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return new C0129fs(j, properties);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(final C0129fs c0129fs, final boolean z) {
        boolean z2;
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.fs.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (fs.this.fb) {
                    try {
                        fs.this.fs(c0129fs, z);
                    } catch (OutOfMemoryError unused) {
                    }
                }
                synchronized (fs.this.zn) {
                    fs.bvs(fs.this);
                }
            }
        };
        if (z) {
            synchronized (this.zn) {
                z2 = this.nps == 1;
            }
            if (z2) {
                runnable.run();
                return;
            }
        }
        com.bytedance.sdk.component.zn.zmn(runnable, true ^ z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0127 A[Catch: all -> 0x012c, TryCatch #8 {all -> 0x012c, blocks: (B:38:0x0090, B:39:0x0092, B:57:0x0123, B:59:0x0127, B:60:0x0130, B:62:0x0139, B:63:0x0141, B:65:0x014d, B:108:0x0199, B:109:0x019a, B:54:0x00ef, B:56:0x0122, B:74:0x00f5, B:75:0x00fb, B:85:0x011b, B:98:0x0198, B:97:0x018f), top: B:37:0x0090, inners: #2, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0139 A[Catch: all -> 0x012c, TryCatch #8 {all -> 0x012c, blocks: (B:38:0x0090, B:39:0x0092, B:57:0x0123, B:59:0x0127, B:60:0x0130, B:62:0x0139, B:63:0x0141, B:65:0x014d, B:108:0x0199, B:109:0x019a, B:54:0x00ef, B:56:0x0122, B:74:0x00f5, B:75:0x00fb, B:85:0x011b, B:98:0x0198, B:97:0x018f), top: B:37:0x0090, inners: #2, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014d A[Catch: all -> 0x012c, TRY_LEAVE, TryCatch #8 {all -> 0x012c, blocks: (B:38:0x0090, B:39:0x0092, B:57:0x0123, B:59:0x0127, B:60:0x0130, B:62:0x0139, B:63:0x0141, B:65:0x014d, B:108:0x0199, B:109:0x019a, B:54:0x00ef, B:56:0x0122, B:74:0x00f5, B:75:0x00fb, B:85:0x011b, B:98:0x0198, B:97:0x018f), top: B:37:0x0090, inners: #2, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.String] */
    @GuardedBy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void fs(C0129fs c0129fs, boolean z) {
        long j;
        long j2;
        Throwable th;
        long j3;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        String str;
        String message;
        boolean z2;
        long currentTimeMillis = fs ? System.currentTimeMillis() : 0L;
        boolean exists = this.iv.exists();
        if (fs) {
            j = System.currentTimeMillis();
            j2 = j;
        } else {
            j = 0;
            j2 = 0;
        }
        if (exists) {
            if (this.bvs >= c0129fs.zmn) {
                z2 = false;
            } else if (z) {
                z2 = true;
            } else {
                synchronized (this.zn) {
                    z2 = this.zg == c0129fs.zmn;
                }
            }
            if (!z2) {
                c0129fs.zmn(false, true);
                return;
            }
            boolean exists2 = this.rc.exists();
            if (fs) {
                j2 = System.currentTimeMillis();
            }
            if (!exists2) {
                if (!this.iv.renameTo(this.rc)) {
                    Log.e("TTPropHelper", "Couldn't rename file " + this.iv + " to backup file " + this.rc);
                    c0129fs.zmn(false, false);
                    return;
                }
            } else {
                this.iv.delete();
            }
        }
        try {
            synchronized (this.fb) {
                FileOutputStream fileOutputStream3 = null;
                FileOutputStream fileOutputStream4 = null;
                FileOutputStream fileOutputStream5 = null;
                try {
                    try {
                        FileOutputStream fileOutputStreamCtor = PangleFilesBridge.fileOutputStreamCtor(this.iv);
                        try {
                            try {
                                j3 = fs ? System.currentTimeMillis() : 0L;
                                try {
                                    c0129fs.fs.store(fileOutputStreamCtor, (String) null);
                                    if (fs) {
                                        Log.d("TTPropHelper", "save: " + c0129fs.fs);
                                        Log.d("TTPropHelper", "saveToLocal: save to" + this.iv.getAbsolutePath() + "success");
                                        fileOutputStream4 = "success";
                                    }
                                    try {
                                        fileOutputStreamCtor.close();
                                        fileOutputStream3 = fileOutputStream4;
                                    } catch (Throwable th2) {
                                        str = "TTPropHelper";
                                        message = th2.getMessage();
                                        Log.w(str, message);
                                        if (fs) {
                                        }
                                        this.rc.delete();
                                        if (fs) {
                                        }
                                        this.bvs = c0129fs.zmn;
                                        c0129fs.zmn(true, true);
                                        if (fs) {
                                        }
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    fileOutputStream2 = fileOutputStreamCtor;
                                    Log.e("TTPropHelper", "saveToLocal: ", e);
                                    c0129fs.zmn(false, false);
                                    fileOutputStream3 = fileOutputStream2;
                                    if (fileOutputStream2 != null) {
                                        try {
                                            fileOutputStream2.close();
                                            fileOutputStream3 = fileOutputStream2;
                                        } catch (Throwable th3) {
                                            str = "TTPropHelper";
                                            message = th3.getMessage();
                                            Log.w(str, message);
                                            if (fs) {
                                            }
                                            this.rc.delete();
                                            if (fs) {
                                            }
                                            this.bvs = c0129fs.zmn;
                                            c0129fs.zmn(true, true);
                                            if (fs) {
                                            }
                                        }
                                    }
                                    if (fs) {
                                    }
                                    this.rc.delete();
                                    if (fs) {
                                    }
                                    this.bvs = c0129fs.zmn;
                                    c0129fs.zmn(true, true);
                                    if (fs) {
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                fileOutputStream = fileOutputStreamCtor;
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                        throw th;
                                    } catch (Throwable th5) {
                                        Log.w("TTPropHelper", th5.getMessage());
                                        throw th;
                                    }
                                }
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            fileOutputStream5 = fileOutputStreamCtor;
                            j3 = 0;
                            fileOutputStream2 = fileOutputStream5;
                            Log.e("TTPropHelper", "saveToLocal: ", e);
                            c0129fs.zmn(false, false);
                            fileOutputStream3 = fileOutputStream2;
                            if (fileOutputStream2 != null) {
                            }
                            if (fs) {
                            }
                            this.rc.delete();
                            if (fs) {
                            }
                            this.bvs = c0129fs.zmn;
                            c0129fs.zmn(true, true);
                            if (fs) {
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        fileOutputStream = fileOutputStream3;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
            long currentTimeMillis2 = fs ? System.currentTimeMillis() : 0L;
            this.rc.delete();
            long currentTimeMillis3 = fs ? System.currentTimeMillis() : 0L;
            this.bvs = c0129fs.zmn;
            c0129fs.zmn(true, true);
            if (fs) {
                Log.d("TTPropHelper", "write: " + (j - currentTimeMillis) + "/" + (j2 - currentTimeMillis) + "/" + (j3 - currentTimeMillis) + "/" + (currentTimeMillis2 - currentTimeMillis) + "/" + (currentTimeMillis3 - currentTimeMillis));
            }
        } catch (Throwable th7) {
            Log.w("TTPropHelper", "writeToFile: Got exception:", th7);
            if (this.iv.exists() && !this.iv.delete()) {
                Log.e("TTPropHelper", "Couldn't clean up partially-written file " + this.iv);
            }
            c0129fs.zmn(false, false);
        }
    }
}
