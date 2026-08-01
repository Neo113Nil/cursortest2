package com.bytedance.sdk.component.sUS.pvs.NB;

import java.util.UUID;

/* compiled from: TTRunnable.java */
/* loaded from: classes.dex */
public abstract class NB implements Comparable<NB>, Runnable {
    private String vG;
    private int pvs = 5;
    private String icD = UUID.randomUUID().toString() + "-" + String.valueOf(System.nanoTime());

    public NB(String str) {
        this.vG = str;
    }

    public void pvs(int i) {
        this.pvs = i;
    }

    public int pvs() {
        return this.pvs;
    }

    @Override // java.lang.Comparable
    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
    public int compareTo(NB nb) {
        if (pvs() < nb.pvs()) {
            return 1;
        }
        return pvs() >= nb.pvs() ? -1 : 0;
    }
}
