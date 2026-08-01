package com.bykv.vk.openvk.component.video.pvs.icD.pvs;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.bykv.vk.openvk.component.video.pvs.icD.Jd;
import com.bykv.vk.openvk.component.video.pvs.icD.NB;
import com.bytedance.sdk.component.so.sUS;
import com.bytedance.sdk.component.so.so;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: DiskLruCache.java */
/* loaded from: classes.dex */
public class vG extends com.bykv.vk.openvk.component.video.pvs.icD.pvs.pvs {
    private final ReentrantReadWriteLock.ReadLock Jd;
    private final icD Mxy;
    private final ReentrantReadWriteLock.WriteLock NB;
    private final Runnable Wyp;
    private final LinkedHashMap<String, File> icD = new LinkedHashMap<>(0, 0.75f, true);
    public final File pvs;
    private final Handler qh;
    private final Set<pvs> sUS;
    private volatile float so;
    private final ReentrantReadWriteLock vG;
    private volatile long yiw;

    /* compiled from: DiskLruCache.java */
    public interface pvs {
        void pvs(String str);

        void pvs(Set<String> set);
    }

    public void pvs(pvs pvsVar) {
        if (pvsVar != null) {
            this.sUS.add(pvsVar);
        }
    }

    public vG(File file) throws IOException {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.vG = reentrantReadWriteLock;
        this.Jd = reentrantReadWriteLock.readLock();
        this.NB = reentrantReadWriteLock.writeLock();
        this.sUS = Collections.newSetFromMap(new ConcurrentHashMap());
        this.yiw = 104857600L;
        this.so = 0.5f;
        this.Mxy = new icD();
        this.Wyp = new Runnable() { // from class: com.bykv.vk.openvk.component.video.pvs.icD.pvs.vG.1
            @Override // java.lang.Runnable
            public void run() {
                sUS.icD(new so("cleanupCmd", 1) { // from class: com.bykv.vk.openvk.component.video.pvs.icD.pvs.vG.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        vG.this.icD(vG.this.yiw);
                    }
                });
            }
        };
        this.qh = new Handler(Looper.getMainLooper());
        if (file == null || !file.exists() || !file.isDirectory() || !file.canRead() || !file.canWrite()) {
            throw new IOException("dir error!  ".concat(String.valueOf(file == null ? " dir null" : "exists: " + file.exists() + ", isDirectory: " + file.isDirectory() + ", canRead: " + file.canRead() + ", canWrite: " + file.canWrite())));
        }
        this.pvs = file;
        sUS.icD(new so("DiskLruCache", 5) { // from class: com.bykv.vk.openvk.component.video.pvs.icD.pvs.vG.2
            @Override // java.lang.Runnable
            public void run() {
                vG.this.icD();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD() {
        this.NB.lock();
        try {
            File[] listFiles = this.pvs.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                final HashMap hashMap = new HashMap(listFiles.length);
                ArrayList arrayList = new ArrayList(listFiles.length);
                for (File file : listFiles) {
                    if (file.isFile()) {
                        arrayList.add(file);
                        hashMap.put(file, Long.valueOf(file.lastModified()));
                    }
                }
                Collections.sort(arrayList, new Comparator<File>() { // from class: com.bykv.vk.openvk.component.video.pvs.icD.pvs.vG.3
                    @Override // java.util.Comparator
                    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
                    public int compare(File file2, File file3) {
                        long longValue = ((Long) hashMap.get(file2)).longValue() - ((Long) hashMap.get(file3)).longValue();
                        if (longValue < 0) {
                            return -1;
                        }
                        return longValue > 0 ? 1 : 0;
                    }
                });
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    File file2 = (File) it.next();
                    this.icD.put(pvs(file2), file2);
                }
            }
            this.NB.unlock();
            vG();
        } catch (Throwable th) {
            this.NB.unlock();
            throw th;
        }
    }

    public void pvs(long j) {
        this.yiw = j;
        vG();
    }

    private void vG() {
        this.qh.removeCallbacks(this.Wyp);
        this.qh.postDelayed(this.Wyp, WorkRequest.MIN_BACKOFF_MILLIS);
    }

    public void pvs() {
        Jd.vG().Jd();
        Context pvs2 = NB.pvs();
        if (pvs2 != null) {
            com.bykv.vk.openvk.component.video.pvs.icD.icD.vG.pvs(pvs2).pvs(0);
        }
        this.qh.removeCallbacks(this.Wyp);
        sUS.icD(new so("clear", 1) { // from class: com.bykv.vk.openvk.component.video.pvs.icD.pvs.vG.4
            @Override // java.lang.Runnable
            public void run() {
                vG.this.icD(0L);
            }
        });
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.icD.pvs.pvs
    public void pvs(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.Mxy.pvs(str);
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.icD.pvs.pvs
    public void icD(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.Mxy.icD(str);
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.icD.pvs.pvs
    public File vG(String str) {
        this.Jd.lock();
        File file = this.icD.get(str);
        this.Jd.unlock();
        if (file != null) {
            return file;
        }
        File file2 = new File(this.pvs, str);
        this.NB.lock();
        this.icD.put(str, file2);
        this.NB.unlock();
        Iterator<pvs> it = this.sUS.iterator();
        while (it.hasNext()) {
            it.next().pvs(str);
        }
        vG();
        return file2;
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.icD.pvs.pvs
    public File Jd(String str) {
        if (!this.Jd.tryLock()) {
            return null;
        }
        File file = this.icD.get(str);
        this.Jd.unlock();
        return file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(long j) {
        HashSet hashSet;
        long j2;
        final HashSet hashSet2 = new HashSet();
        this.NB.lock();
        try {
            Iterator<Map.Entry<String, File>> it = this.icD.entrySet().iterator();
            j2 = 0;
            while (it.hasNext()) {
                j2 += it.next().getValue().length();
            }
        } catch (Throwable unused) {
            hashSet = null;
        }
        if (j2 > j) {
            long j3 = (long) (j * this.so);
            hashSet = new HashSet();
            try {
                for (Map.Entry<String, File> entry : this.icD.entrySet()) {
                    File value = entry.getValue();
                    if (value != null && value.exists()) {
                        if (!this.Mxy.vG(pvs(value))) {
                            long length = value.length();
                            File file = new File(value.getAbsolutePath() + "-tmp");
                            if (value.renameTo(file)) {
                                hashSet2.add(file);
                                j2 -= length;
                                hashSet.add(entry.getKey());
                            }
                        }
                    } else {
                        hashSet.add(entry.getKey());
                    }
                    if (j2 <= j3) {
                        break;
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    this.icD.remove((String) it2.next());
                }
            } catch (Throwable unused2) {
            }
            this.NB.unlock();
            Iterator<pvs> it3 = this.sUS.iterator();
            while (it3.hasNext()) {
                it3.next().pvs(hashSet);
            }
            sUS.icD(new so("trimSize", 1) { // from class: com.bykv.vk.openvk.component.video.pvs.icD.pvs.vG.5
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it4 = hashSet2.iterator();
                    while (it4.hasNext()) {
                        try {
                            ((File) it4.next()).delete();
                        } catch (Throwable unused3) {
                        }
                    }
                }
            });
            return;
        }
        this.NB.unlock();
    }

    private String pvs(File file) {
        return file.getName();
    }

    /* compiled from: DiskLruCache.java */
    private static final class icD {
        private final Map<String, Integer> pvs;

        private icD() {
            this.pvs = new HashMap();
        }

        synchronized void pvs(String str) {
            if (!TextUtils.isEmpty(str)) {
                Integer num = this.pvs.get(str);
                if (num == null) {
                    this.pvs.put(str, 1);
                    return;
                }
                this.pvs.put(str, Integer.valueOf(num.intValue() + 1));
            }
        }

        synchronized void icD(String str) {
            Integer num;
            if (!TextUtils.isEmpty(str) && (num = this.pvs.get(str)) != null) {
                if (num.intValue() == 1) {
                    this.pvs.remove(str);
                    return;
                }
                this.pvs.put(str, Integer.valueOf(num.intValue() - 1));
            }
        }

        synchronized boolean vG(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return this.pvs.containsKey(str);
        }
    }
}
