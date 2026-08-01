package com.bytedance.sdk.component.so;

import android.os.SystemClock;
import com.bytedance.sdk.component.utils.Ju;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: DelegateRunnable.java */
/* loaded from: classes.dex */
class icD implements Comparable, Runnable {
    private Thread Jd = null;
    private pvs icD;
    private so pvs;
    private long vG;

    public icD(so soVar, pvs pvsVar) {
        this.vG = 0L;
        this.pvs = soVar;
        this.icD = pvsVar;
        this.vG = SystemClock.uptimeMillis();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.lang.Runnable
    public void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = uptimeMillis - this.vG;
        this.Jd = Thread.currentThread();
        so soVar = this.pvs;
        if (soVar != null) {
            soVar.run();
        }
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        if (this.icD != null) {
            Jd.pvs();
        }
        if (Ju.pvs()) {
            Object[] objArr = new Object[8];
            pvs pvsVar = this.icD;
            if (pvsVar != null) {
                pvsVar.pvs();
            }
            Long.valueOf(j);
            Long.valueOf(uptimeMillis2);
            so soVar2 = this.pvs;
            if (soVar2 != null) {
                soVar2.getName();
            }
            String pvs = this.icD.pvs();
            pvs.hashCode();
            char c = 65535;
            switch (pvs.hashCode()) {
                case 3107:
                    if (pvs.equals("ad")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3366:
                    if (pvs.equals("io")) {
                        c = 1;
                        break;
                    }
                    break;
                case 107332:
                    if (pvs.equals("log")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3237136:
                    if (pvs.equals("init")) {
                        c = 3;
                        break;
                    }
                    break;
                case 212371911:
                    if (pvs.equals("computation")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            String str = AbstractJsonLexerKt.NULL;
            switch (c) {
                case 0:
                case 3:
                    if (uptimeMillis2 > 2000) {
                        pvs pvsVar2 = this.icD;
                        String pvs2 = pvsVar2 != null ? pvsVar2.pvs() : AbstractJsonLexerKt.NULL;
                        so soVar3 = this.pvs;
                        if (soVar3 != null) {
                            str = soVar3.getName();
                        }
                        pvs(pvs2, str, uptimeMillis2);
                        break;
                    }
                    break;
                case 1:
                    if (uptimeMillis2 > 5000) {
                        pvs pvsVar3 = this.icD;
                        String pvs3 = pvsVar3 != null ? pvsVar3.pvs() : AbstractJsonLexerKt.NULL;
                        so soVar4 = this.pvs;
                        if (soVar4 != null) {
                            str = soVar4.getName();
                        }
                        pvs(pvs3, str, uptimeMillis2);
                        break;
                    }
                    break;
                case 2:
                    if (uptimeMillis2 > 3000) {
                        pvs pvsVar4 = this.icD;
                        String pvs4 = pvsVar4 != null ? pvsVar4.pvs() : AbstractJsonLexerKt.NULL;
                        so soVar5 = this.pvs;
                        if (soVar5 != null) {
                            str = soVar5.getName();
                        }
                        pvs(pvs4, str, uptimeMillis2);
                        break;
                    }
                    break;
                case 4:
                    if (uptimeMillis2 > 1000) {
                        pvs pvsVar5 = this.icD;
                        String pvs5 = pvsVar5 != null ? pvsVar5.pvs() : AbstractJsonLexerKt.NULL;
                        so soVar6 = this.pvs;
                        if (soVar6 != null) {
                            str = soVar6.getName();
                        }
                        pvs(pvs5, str, uptimeMillis2);
                        break;
                    }
                    break;
            }
        }
    }

    private void pvs(String str, String str2, long j) {
        Ju.pvs("DelegateRunnable", "pool is " + str + "  name is " + str2 + "is timeout,cost " + j);
    }

    public so pvs() {
        return this.pvs;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof icD) {
            return this.pvs.compareTo(((icD) obj).pvs());
        }
        return 0;
    }

    public int hashCode() {
        return this.pvs.hashCode();
    }

    public boolean equals(Object obj) {
        so soVar;
        return (obj instanceof icD) && (soVar = this.pvs) != null && soVar.equals(((icD) obj).pvs());
    }
}
