package com.google.android.gms.stats;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.providers.PooledExecutorsProvider;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes.dex */
public class WakeLock {
    private static ScheduledExecutorService zzaeg;
    private static Configuration zzaeh = new zza();
    private final PowerManager.WakeLock zzadv;
    private WorkSource zzadw;
    private String zzadx;
    private final int zzady;
    private final String zzadz;
    private final String zzaea;
    private final String zzaeb;
    private boolean zzaec;
    private final Map<String, Integer[]> zzaed;
    private int zzaee;
    private AtomicInteger zzaef;
    private final Context zzjp;

    /* loaded from: classes2.dex */
    public interface Configuration {
        long getMaximumTimeout(String str, String str2);

        boolean isWorkChainsEnabled();
    }

    /* loaded from: classes2.dex */
    public class HeldLock {
        private boolean zzaek;
        private Future zzael;
        private final String zzaem;

        private HeldLock(String str) {
            this.zzaek = true;
            this.zzaem = str;
        }

        /* synthetic */ HeldLock(WakeLock wakeLock, String str, zza zzaVar) {
            this(str);
        }

        public void finalize() {
            if (this.zzaek) {
                String valueOf = String.valueOf(this.zzaem);
                Log.e("WakeLock", valueOf.length() != 0 ? "HeldLock finalized while still holding the WakeLock! Reason: ".concat(valueOf) : new String("HeldLock finalized while still holding the WakeLock! Reason: "));
                release(0);
            }
        }

        public void release() {
            release(0);
        }

        public synchronized void release(int i) {
            if (this.zzaek) {
                this.zzaek = false;
                if (this.zzael != null) {
                    this.zzael.cancel(false);
                    this.zzael = null;
                }
                WakeLock.this.zzc(this.zzaem, i);
            }
        }
    }

    public WakeLock(Context context, int i, @Nonnull String str) {
        this(context, i, str, null, context == null ? null : context.getPackageName());
    }

    public WakeLock(Context context, int i, @Nonnull String str, @Nullable String str2) {
        this(context, i, str, str2, context == null ? null : context.getPackageName());
    }

    @SuppressLint({"UnwrappedWakeLock"})
    public WakeLock(Context context, int i, @Nonnull String str, @Nullable String str2, @Nonnull String str3) {
        this(context, i, str, str2, str3, null);
    }

    @SuppressLint({"UnwrappedWakeLock"})
    public WakeLock(Context context, int i, @Nonnull String str, @Nullable String str2, @Nonnull String str3, @Nullable String str4) {
        WorkSource fromPackage;
        this.zzaec = true;
        this.zzaed = new HashMap();
        this.zzaef = new AtomicInteger(0);
        Preconditions.checkNotEmpty(str, "Wake lock name can NOT be empty");
        this.zzady = i;
        this.zzaea = str2;
        this.zzaeb = str4;
        this.zzjp = context.getApplicationContext();
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.zzadz = str;
        } else {
            String valueOf = String.valueOf("*gcore*:");
            String valueOf2 = String.valueOf(str);
            this.zzadz = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        this.zzadv = ((PowerManager) context.getSystemService("power")).newWakeLock(i, str);
        if (WorkSourceUtil.hasWorkSourcePermission(context)) {
            str3 = Strings.isEmptyOrWhitespace(str3) ? context.getPackageName() : str3;
            if (!zzaeh.isWorkChainsEnabled() || str3 == null || str4 == null) {
                fromPackage = WorkSourceUtil.fromPackage(context, str3);
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 42 + String.valueOf(str4).length());
                sb.append("Using experimental Pi WorkSource chains: ");
                sb.append(str3);
                sb.append(",");
                sb.append(str4);
                Log.d("WakeLock", sb.toString());
                this.zzadx = str3;
                fromPackage = WorkSourceUtil.fromPackageAndModuleExperimentalPi(context, str3, str4);
            }
            this.zzadw = fromPackage;
            addWorkSource(this.zzadw);
        }
        if (zzaeg == null) {
            zzaeg = PooledExecutorsProvider.getInstance().newSingleThreadScheduledExecutor();
        }
    }

    public static void setConfiguration(Configuration configuration) {
        zzaeh = configuration;
    }

    private final void zza(WorkSource workSource) {
        try {
            this.zzadv.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf("WakeLock", e.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (r0 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        com.google.android.gms.common.stats.WakeLockTracker.getInstance().registerEvent(r12.zzjp, com.google.android.gms.common.stats.StatsUtils.getEventKey(r12.zzadv, r5), 7, r12.zzadz, r5, r12.zzaeb, r12.zzady, zzdo(), r14);
        r12.zzaee++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0054, code lost:
    
        if (r12.zzaee == 0) goto L22;
     */
    @SuppressLint({"WakelockTimeout"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zza(String str, long j) {
        String zzn = zzn(str);
        synchronized (this) {
            boolean z = false;
            if ((!this.zzaed.isEmpty() || this.zzaee > 0) && !this.zzadv.isHeld()) {
                this.zzaed.clear();
                this.zzaee = 0;
            }
            if (this.zzaec) {
                Integer[] numArr = this.zzaed.get(zzn);
                if (numArr == null) {
                    this.zzaed.put(zzn, new Integer[]{1});
                    z = true;
                } else {
                    numArr[0] = Integer.valueOf(numArr[0].intValue() + 1);
                }
            }
            if (!this.zzaec) {
            }
        }
        this.zzadv.acquire();
        if (j > 0) {
            zzaeg.schedule(new zzb(this), j, TimeUnit.MILLISECONDS);
            if (PlatformVersion.isAtLeastIceCreamSandwich() || !this.zzaec) {
                return;
            }
            String valueOf = String.valueOf(this.zzadz);
            Log.wtf("WakeLock", valueOf.length() != 0 ? "Do not acquire with timeout on reference counted wakeLocks before ICS. wakelock: ".concat(valueOf) : new String("Do not acquire with timeout on reference counted wakeLocks before ICS. wakelock: "));
        }
    }

    private final void zzb(String str, int i) {
        if (this.zzaef.decrementAndGet() < 0) {
            Log.e("WakeLock", "release without a matched acquire!");
        }
        zzc(str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        com.google.android.gms.common.stats.WakeLockTracker.getInstance().registerEvent(r10.zzjp, com.google.android.gms.common.stats.StatsUtils.getEventKey(r10.zzadv, r5), 8, r10.zzadz, r5, r10.zzaeb, r10.zzady, zzdo());
        r10.zzaee--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
    
        if (r10.zzaee == 1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if (r0 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc(String str, int i) {
        String zzn = zzn(str);
        synchronized (this) {
            if (this.zzaec) {
                Integer[] numArr = this.zzaed.get(zzn);
                boolean z = false;
                if (numArr != null) {
                    if (numArr[0].intValue() == 1) {
                        this.zzaed.remove(zzn);
                        z = true;
                    } else {
                        numArr[0] = Integer.valueOf(numArr[0].intValue() - 1);
                    }
                }
            }
            if (!this.zzaec) {
            }
        }
        zzn(i);
    }

    private final List<String> zzdo() {
        List<String> names = WorkSourceUtil.getNames(this.zzadw);
        if (this.zzadx == null) {
            return names;
        }
        ArrayList arrayList = new ArrayList(names);
        arrayList.add(this.zzadx);
        return arrayList;
    }

    private final String zzn(String str) {
        return (!this.zzaec || TextUtils.isEmpty(str)) ? this.zzaea : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzn(int i) {
        if (this.zzadv.isHeld()) {
            try {
                if (Build.VERSION.SDK_INT < 21 || i <= 0) {
                    this.zzadv.release();
                } else {
                    this.zzadv.release(i);
                }
            } catch (RuntimeException e) {
                if (!e.getClass().equals(RuntimeException.class)) {
                    throw e;
                }
                Log.e("WakeLock", String.valueOf(this.zzadz).concat(" was already released!"), e);
            }
        }
    }

    public void acquire() {
        this.zzaef.incrementAndGet();
        zza((String) null, 0L);
    }

    public void acquire(long j) {
        this.zzaef.incrementAndGet();
        zza((String) null, j);
    }

    public void acquire(String str) {
        this.zzaef.incrementAndGet();
        zza(str, 0L);
    }

    public void acquire(String str, long j) {
        this.zzaef.incrementAndGet();
        zza(str, j);
    }

    public HeldLock acquireLock(long j, String str) {
        long min = Math.min(j, zzaeh.getMaximumTimeout(this.zzadz, str));
        HeldLock heldLock = new HeldLock(this, str, null);
        zza(str, 0L);
        heldLock.zzael = zzaeg.schedule(new zzc(new WeakReference(heldLock)), min, TimeUnit.MILLISECONDS);
        return heldLock;
    }

    public void addWorkSource(WorkSource workSource) {
        if (workSource == null || !WorkSourceUtil.hasWorkSourcePermission(this.zzjp)) {
            return;
        }
        if (this.zzadw != null) {
            this.zzadw.add(workSource);
        } else {
            this.zzadw = workSource;
        }
        zza(this.zzadw);
    }

    public PowerManager.WakeLock getWakeLock() {
        return this.zzadv;
    }

    public boolean isHeld() {
        return this.zzadv.isHeld();
    }

    public void release() {
        zzb(null, 0);
    }

    public void release(int i) {
        zzb(null, i);
    }

    public void release(String str) {
        zzb(str, 0);
    }

    public void release(String str, int i) {
        zzb(str, i);
    }

    public void removeWorkSource(WorkSource workSource) {
        if (workSource == null || !WorkSourceUtil.hasWorkSourcePermission(this.zzjp)) {
            return;
        }
        try {
            if (this.zzadw != null) {
                this.zzadw.remove(workSource);
            }
            zza(this.zzadw);
        } catch (ArrayIndexOutOfBoundsException e) {
            Log.e("WakeLock", e.toString());
        }
    }

    public void setReferenceCounted(boolean z) {
        this.zzadv.setReferenceCounted(z);
        this.zzaec = z;
    }

    public void setWorkSource(WorkSource workSource) {
        if (WorkSourceUtil.hasWorkSourcePermission(this.zzjp)) {
            zza(workSource);
            this.zzadw = workSource;
            this.zzadx = null;
        }
    }
}
