package com.bytedance.sdk.openadsdk.core.settings;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.cR;
import com.bytedance.sdk.openadsdk.core.settings.NB;
import com.bytedance.sdk.openadsdk.utils.ae;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: SettingsPropRepository.java */
/* loaded from: classes2.dex */
public abstract class bNS implements NB {
    private pvs Wyp;
    private final String yiw;
    private final ConcurrentHashMap<String, Object> vG = new ConcurrentHashMap<>();
    private final Object Jd = new Object();
    private final Object NB = new Object();
    private final CountDownLatch sUS = new CountDownLatch(1);
    private Properties so = new Properties();
    private volatile boolean Mxy = false;

    /* compiled from: SettingsPropRepository.java */
    public interface pvs {
        void icD();

        void pvs();
    }

    public bNS(String str, pvs pvsVar) {
        this.yiw = str;
        this.Wyp = pvsVar;
        ae.pvs(new com.bytedance.sdk.component.so.so("SetL_".concat(String.valueOf(str))) { // from class: com.bytedance.sdk.openadsdk.core.settings.bNS.1
            @Override // java.lang.Runnable
            public void run() {
                bNS.this.pvs(false);
            }
        });
    }

    public String pvs(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return str2;
        }
        NB();
        return this.so.getProperty(str, str2);
    }

    private void NB() {
        if (this.Mxy) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            this.sUS.await(ae.NB() ? 4 : 8, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            com.bytedance.sdk.component.utils.Ju.pvs("SdkSettings.Prop", "awaitLoadedLocked: ", e);
        }
    }

    public int pvs(String str, int i) {
        if (str != null && !str.isEmpty()) {
            NB();
            try {
                return Integer.parseInt(this.so.getProperty(str, String.valueOf(i)));
            } catch (NumberFormatException e) {
                com.bytedance.sdk.component.utils.Ju.pvs("SdkSettings.Prop", "", e);
            }
        }
        return i;
    }

    public long pvs(String str, long j) {
        if (str != null && !str.isEmpty()) {
            NB();
            try {
                return Long.parseLong(this.so.getProperty(str, String.valueOf(j)));
            } catch (NumberFormatException e) {
                com.bytedance.sdk.component.utils.Ju.pvs("SdkSettings.Prop", "", e);
            }
        }
        return j;
    }

    public float pvs(String str, float f) {
        if (str != null && !str.isEmpty()) {
            NB();
            try {
                return Float.parseFloat(this.so.getProperty(str, String.valueOf(f)));
            } catch (NumberFormatException e) {
                com.bytedance.sdk.component.utils.Ju.pvs("SdkSettings.Prop", "", e);
            }
        }
        return f;
    }

    public boolean pvs(String str, boolean z) {
        if (str != null && !str.isEmpty()) {
            NB();
            try {
                return Boolean.parseBoolean(this.so.getProperty(str, String.valueOf(z)));
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.Ju.pvs("SdkSettings.Prop", "", e);
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0103 A[Catch: all -> 0x0113, TryCatch #2 {, blocks: (B:4:0x0003, B:7:0x0009, B:10:0x000b, B:12:0x0016, B:21:0x004d, B:22:0x0052, B:23:0x00ff, B:25:0x0103, B:27:0x0107, B:28:0x010a, B:29:0x0111, B:44:0x0066, B:45:0x0069, B:49:0x0084, B:50:0x0087, B:51:0x008c, B:35:0x007c, B:36:0x007f, B:54:0x008d, B:56:0x0097, B:59:0x00a1, B:61:0x00b6, B:62:0x00c6, B:64:0x00cc, B:67:0x00de, B:72:0x00e6, B:80:0x00f1, B:81:0x00f4, B:42:0x005d, B:39:0x0073), top: B:3:0x0003, inners: #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pvs(boolean z) {
        pvs pvsVar;
        Object obj;
        synchronized (this.Jd) {
            if (!this.Mxy || z) {
                File sUS = sUS();
                if (sUS.exists()) {
                    Properties properties = new Properties();
                    FileInputStream fileInputStream = null;
                    try {
                        try {
                            FileInputStream fileInputStream2 = new FileInputStream(sUS);
                            try {
                                properties.load(fileInputStream2);
                                Object[] objArr = new Object[3];
                                Integer.valueOf(properties.size());
                                String str = "items from " + sUS.getAbsolutePath();
                                if (!properties.isEmpty()) {
                                    this.so = properties;
                                    this.vG.clear();
                                }
                                com.bytedance.sdk.openadsdk.utils.Wyp.pvs(fileInputStream2);
                                obj = this.Jd;
                            } catch (OutOfMemoryError unused) {
                                fileInputStream = fileInputStream2;
                                try {
                                    com.bytedance.sdk.component.utils.sUS.vG(sUS);
                                } catch (Throwable th) {
                                    com.bytedance.sdk.component.utils.Ju.pvs("SdkSettings.Prop", "delete: ", th);
                                }
                                if (fileInputStream != null) {
                                    com.bytedance.sdk.openadsdk.utils.Wyp.pvs(fileInputStream);
                                }
                                obj = this.Jd;
                                obj.notifyAll();
                                if (!this.Mxy) {
                                    pvsVar.pvs();
                                }
                                this.Mxy = true;
                                this.sUS.countDown();
                            } catch (Throwable th2) {
                                th = th2;
                                fileInputStream = fileInputStream2;
                                com.bytedance.sdk.component.utils.Ju.pvs("SdkSettings.Prop", "reload: ", th);
                                if (fileInputStream != null) {
                                    com.bytedance.sdk.openadsdk.utils.Wyp.pvs(fileInputStream);
                                }
                                obj = this.Jd;
                                obj.notifyAll();
                                if (!this.Mxy) {
                                }
                                this.Mxy = true;
                                this.sUS.countDown();
                            }
                        } catch (Throwable th3) {
                            if (fileInputStream != null) {
                                com.bytedance.sdk.openadsdk.utils.Wyp.pvs(fileInputStream);
                            }
                            this.Jd.notifyAll();
                            throw th3;
                        }
                    } catch (OutOfMemoryError unused2) {
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    obj.notifyAll();
                } else if (cR.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs()) && "tt_sdk_settings.prop".equals(this.yiw)) {
                    try {
                        boolean z2 = false;
                        SharedPreferences sharedPreferences = com.bytedance.sdk.openadsdk.core.mnm.pvs().getSharedPreferences("tt_sdk_settings", 0);
                        if (!sharedPreferences.getAll().isEmpty()) {
                            NB.pvs pvs2 = pvs();
                            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                                String key = entry.getKey();
                                Object value = entry.getValue();
                                if (key != null && !key.isEmpty() && value != null) {
                                    pvs2.pvs(key, value.toString());
                                    z2 = true;
                                }
                            }
                            if (z2) {
                                pvs2.pvs();
                            }
                            sharedPreferences.edit().clear().commit();
                        }
                    } catch (Exception unused3) {
                    }
                }
                if (!this.Mxy && (pvsVar = this.Wyp) != null) {
                    pvsVar.pvs();
                }
                this.Mxy = true;
                this.sUS.countDown();
            }
        }
    }

    private File sUS() {
        return new File(com.bytedance.sdk.openadsdk.core.mnm.pvs().getFilesDir(), this.yiw);
    }

    public NB.pvs pvs() {
        return new icD();
    }

    public <T> T pvs(String str, T t, NB.icD<T> icd) {
        T icD2;
        if (str != null && !str.isEmpty()) {
            if (this.vG.containsKey(str)) {
                try {
                    return (T) this.vG.get(str);
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.Ju.pvs("SdkSettings.Prop", "", e);
                    return t;
                }
            }
            NB();
            String property = this.so.getProperty(str, null);
            if (property != null && icd != null && (icD2 = icd.icD(property)) != null) {
                this.vG.put(str, icD2);
                return icD2;
            }
        }
        return t;
    }

    public boolean icD() {
        return this.Mxy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(Properties properties) {
        FileOutputStream fileOutputStream;
        synchronized (this.NB) {
            File sUS = sUS();
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream(sUS);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e) {
                e = e;
            }
            try {
                properties.store(fileOutputStream, (String) null);
                Object[] objArr = new Object[3];
                sUS.getAbsolutePath();
                com.bytedance.sdk.openadsdk.utils.Wyp.pvs(fileOutputStream);
            } catch (Exception e2) {
                e = e2;
                fileOutputStream2 = fileOutputStream;
                com.bytedance.sdk.component.utils.Ju.pvs("SdkSettings.Prop", "saveToLocal: ", e);
                if (fileOutputStream2 != null) {
                    com.bytedance.sdk.openadsdk.utils.Wyp.pvs(fileOutputStream2);
                }
                mnm.nS();
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    com.bytedance.sdk.openadsdk.utils.Wyp.pvs(fileOutputStream2);
                }
                throw th;
            }
        }
        mnm.nS();
    }

    public void vG() {
        File sUS = sUS();
        if (sUS.exists()) {
            sUS.delete();
        }
    }

    /* compiled from: SettingsPropRepository.java */
    public class icD implements NB.pvs {
        private final Map<String, Object> icD = new HashMap();
        private final Object vG = new Object();

        public icD() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.NB.pvs
        public void pvs() {
            Object obj;
            Object[] objArr = new Object[2];
            Properties properties = new Properties();
            synchronized (this.vG) {
                properties.putAll(bNS.this.so);
                boolean z = false;
                for (Map.Entry<String, Object> entry : this.icD.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value != this && value != null) {
                        if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(value)) {
                            properties.put(key, String.valueOf(value));
                            z = true;
                        }
                    }
                    if (properties.containsKey(key)) {
                        properties.remove(key);
                        z = true;
                    }
                }
                this.icD.clear();
                if (z) {
                    bNS.this.pvs(properties);
                    bNS.this.so = properties;
                    bNS.this.vG.clear();
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.NB.pvs
        public NB.pvs pvs(String str, String str2) {
            synchronized (this.vG) {
                this.icD.put(str, str2);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.NB.pvs
        public NB.pvs pvs(String str, int i) {
            synchronized (this.vG) {
                this.icD.put(str, Integer.valueOf(i));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.NB.pvs
        public NB.pvs pvs(String str, long j) {
            synchronized (this.vG) {
                this.icD.put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.NB.pvs
        public NB.pvs pvs(String str) {
            synchronized (this.vG) {
                this.icD.put(str, this);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.NB.pvs
        public NB.pvs pvs(String str, float f) {
            synchronized (this.vG) {
                this.icD.put(str, Float.valueOf(f));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.NB.pvs
        public NB.pvs pvs(String str, boolean z) {
            synchronized (this.vG) {
                this.icD.put(str, Boolean.valueOf(z));
            }
            return this;
        }
    }

    protected void Jd() {
        pvs pvsVar = this.Wyp;
        if (pvsVar != null) {
            pvsVar.icD();
        }
    }
}
