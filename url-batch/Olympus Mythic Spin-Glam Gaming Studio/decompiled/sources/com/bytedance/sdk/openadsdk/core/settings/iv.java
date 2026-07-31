package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.settings.btk;
import com.bytedance.sdk.openadsdk.utils.mw;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.safedk.android.internal.partials.PangleFilesBridge;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public abstract class iv implements btk {
    private final zmn iv;
    private final String nps;
    private boolean rc;
    private final ConcurrentHashMap<String, Object> zn = new ConcurrentHashMap<>();
    private final Object fb = new Object();
    private final Object btk = new Object();
    private final CountDownLatch hhw = new CountDownLatch(1);
    private Properties zg = new Properties();
    private volatile boolean bvs = false;

    public interface zmn {
        void fs();

        void zmn();
    }

    protected abstract String zmn();

    public iv(zmn zmnVar) {
        String zmn2 = zmn();
        this.nps = zmn2;
        this.iv = zmnVar;
        nu.zmn(new com.bytedance.sdk.component.zg.fs.zn("SetL_" + zmn2) { // from class: com.bytedance.sdk.openadsdk.core.settings.iv.1
            @Override // java.lang.Runnable
            public void run() {
                iv.this.zmn(false);
            }
        });
    }

    public String zmn(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return str2;
        }
        hhw();
        return this.zg.getProperty(str, str2);
    }

    private void hhw() {
        if (this.rc && kgc.zmn() != null) {
            zmn(true);
        }
        if (this.bvs) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            this.hhw.await(nu.hhw() ? 4 : 8, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            iqz.zmn("SdkSettings.Prop", "awaitLoadedLocked: ", e);
        }
    }

    public int zmn(String str, int i) {
        if (str != null && !str.isEmpty()) {
            hhw();
            try {
                return Integer.parseInt(this.zg.getProperty(str, String.valueOf(i)));
            } catch (NumberFormatException e) {
                iqz.zmn("SdkSettings.Prop", "", e);
            }
        }
        return i;
    }

    public long zmn(String str, long j) {
        if (str != null && !str.isEmpty()) {
            hhw();
            try {
                return Long.parseLong(this.zg.getProperty(str, String.valueOf(j)));
            } catch (NumberFormatException e) {
                iqz.zmn("SdkSettings.Prop", "", e);
            }
        }
        return j;
    }

    public float zmn(String str, float f) {
        if (str != null && !str.isEmpty()) {
            hhw();
            try {
                return Float.parseFloat(this.zg.getProperty(str, String.valueOf(f)));
            } catch (NumberFormatException e) {
                iqz.zmn("SdkSettings.Prop", "", e);
            }
        }
        return f;
    }

    public boolean zmn(String str, boolean z) {
        if (str != null && !str.isEmpty()) {
            hhw();
            try {
                return Boolean.parseBoolean(this.zg.getProperty(str, String.valueOf(z)));
            } catch (Exception e) {
                iqz.zmn("SdkSettings.Prop", "", e);
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x009d A[Catch: all -> 0x000b, TryCatch #3 {all -> 0x000b, blocks: (B:4:0x0003, B:7:0x0009, B:10:0x000e, B:12:0x0015, B:14:0x001e, B:16:0x0024, B:25:0x0054, B:26:0x0059, B:40:0x0069, B:41:0x006c, B:45:0x0087, B:46:0x008a, B:47:0x008f, B:31:0x007f, B:32:0x0082, B:50:0x0092, B:52:0x009d, B:54:0x00a1, B:55:0x00a4, B:57:0x0090, B:38:0x0060, B:35:0x0076), top: B:3:0x0003, inners: #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zmn(boolean z) {
        boolean z2;
        zmn zmnVar;
        Object obj;
        synchronized (this.fb) {
            try {
                if (!this.bvs || z) {
                    if (kgc.zmn() != null) {
                        this.rc = false;
                        File nps = nps();
                        if (nps != null && nps.exists()) {
                            Properties properties = new Properties();
                            FileInputStream fileInputStream = null;
                            try {
                                try {
                                    FileInputStream fileInputStream2 = new FileInputStream(nps);
                                    try {
                                        properties.load(fileInputStream2);
                                        properties.size();
                                        new StringBuilder("items from ").append(nps.getAbsolutePath());
                                        if (!properties.isEmpty()) {
                                            this.zg = properties;
                                            this.zn.clear();
                                        }
                                        mw.zmn(fileInputStream2);
                                        obj = this.fb;
                                    } catch (OutOfMemoryError unused) {
                                        fileInputStream = fileInputStream2;
                                        try {
                                            com.bytedance.sdk.component.utils.nps.zn(nps);
                                        } catch (Throwable th) {
                                            iqz.zmn("SdkSettings.Prop", "delete: ", th);
                                        }
                                        if (fileInputStream != null) {
                                            mw.zmn(fileInputStream);
                                        }
                                        obj = this.fb;
                                        obj.notifyAll();
                                        z2 = this.bvs;
                                        this.hhw.countDown();
                                        this.bvs = true;
                                        if (!z2) {
                                            zmnVar.zmn();
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fileInputStream = fileInputStream2;
                                        iqz.zmn("SdkSettings.Prop", "reload: ", th);
                                        if (fileInputStream != null) {
                                            mw.zmn(fileInputStream);
                                        }
                                        obj = this.fb;
                                        obj.notifyAll();
                                        z2 = this.bvs;
                                        this.hhw.countDown();
                                        this.bvs = true;
                                        if (!z2) {
                                        }
                                    }
                                } catch (Throwable th3) {
                                    if (fileInputStream != null) {
                                        mw.zmn(fileInputStream);
                                    }
                                    this.fb.notifyAll();
                                    throw th3;
                                }
                            } catch (OutOfMemoryError unused2) {
                            } catch (Throwable th4) {
                                th = th4;
                            }
                            obj.notifyAll();
                        }
                    } else {
                        this.rc = true;
                    }
                    z2 = this.bvs;
                    this.hhw.countDown();
                    this.bvs = true;
                    if (!z2 && (zmnVar = this.iv) != null) {
                        zmnVar.zmn();
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    @Nullable
    private File nps() {
        Context zmn2 = kgc.zmn();
        if (zmn2 != null) {
            return new File(zmn2.getFilesDir(), this.nps);
        }
        return null;
    }

    public btk.zmn fs() {
        return new fs();
    }

    public <T> T zmn(String str, T t, btk.fs<T> fsVar) {
        T fs2;
        if (str != null && !str.isEmpty()) {
            T t2 = (T) this.zn.get(str);
            if (t2 != null) {
                return t2;
            }
            hhw();
            String property = this.zg.getProperty(str, null);
            if (property != null && fsVar != null && (fs2 = fsVar.fs(property)) != null) {
                this.zn.put(str, fs2);
                return fs2;
            }
        }
        return t;
    }

    public boolean zn() {
        return this.bvs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(Properties properties) {
        FileOutputStream fileOutputStreamCtor;
        synchronized (this.btk) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    fileOutputStreamCtor = PangleFilesBridge.fileOutputStreamCtor(nps());
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                properties.store(fileOutputStreamCtor, (String) null);
                mw.zmn(fileOutputStreamCtor);
            } catch (Exception e2) {
                e = e2;
                fileOutputStream = fileOutputStreamCtor;
                iqz.zmn("SdkSettings.Prop", "saveToLocal: ", e);
                if (fileOutputStream != null) {
                    mw.zmn(fileOutputStream);
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStreamCtor;
                if (fileOutputStream != null) {
                    mw.zmn(fileOutputStream);
                }
                throw th;
            }
        }
    }

    public void fb() {
        File nps = nps();
        if (nps == null || !nps.exists()) {
            return;
        }
        nps.delete();
    }

    public class fs implements btk.zmn {
        private final Map<String, Object> fs = new HashMap();
        private final Object zn = new Object();

        public fs() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.btk.zmn
        public void zmn() {
            Object obj;
            Properties properties = new Properties();
            synchronized (this.zn) {
                try {
                    properties.putAll(iv.this.zg);
                    boolean z = false;
                    for (Map.Entry<String, Object> entry : this.fs.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value != this && value != null) {
                            if (properties.containsKey(key) && (obj = properties.get(key)) != null && obj.equals(value)) {
                            }
                            properties.put(key, String.valueOf(value));
                            z = true;
                        }
                        if (properties.containsKey(key)) {
                            properties.remove(key);
                            z = true;
                        }
                    }
                    this.fs.clear();
                    if (z) {
                        iv.this.zmn(properties);
                        iv.this.zg = properties;
                        iv.this.zn.clear();
                        iv.this.rc = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.btk.zmn
        public btk.zmn zmn(String str, String str2) {
            synchronized (this.zn) {
                this.fs.put(str, str2);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.btk.zmn
        public btk.zmn zmn(String str, int i) {
            synchronized (this.zn) {
                this.fs.put(str, Integer.valueOf(i));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.btk.zmn
        public btk.zmn zmn(String str, long j) {
            synchronized (this.zn) {
                this.fs.put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.btk.zmn
        public btk.zmn zmn(String str) {
            synchronized (this.zn) {
                this.fs.put(str, this);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.btk.zmn
        public btk.zmn zmn(String str, float f) {
            synchronized (this.zn) {
                this.fs.put(str, Float.valueOf(f));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.btk.zmn
        public btk.zmn zmn(String str, boolean z) {
            synchronized (this.zn) {
                this.fs.put(str, Boolean.valueOf(z));
            }
            return this;
        }
    }

    protected void btk() {
        zmn zmnVar = this.iv;
        if (zmnVar != null) {
            zmnVar.fs();
        }
    }
}
