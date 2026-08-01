package com.bytedance.sdk.component.so;

/* compiled from: TTRunnable.java */
/* loaded from: classes.dex */
public abstract class so implements Comparable<so>, Runnable {
    private String icD;
    private int pvs;

    public so(String str, int i) {
        this.pvs = 0;
        this.pvs = i == 0 ? 5 : i;
        this.icD = str;
    }

    public so(String str) {
        this.pvs = 5;
        this.icD = str;
    }

    public void setPriority(int i) {
        this.pvs = i;
    }

    public int getPriority() {
        return this.pvs;
    }

    @Override // java.lang.Comparable
    public int compareTo(so soVar) {
        if (getPriority() < soVar.getPriority()) {
            return 1;
        }
        return getPriority() >= soVar.getPriority() ? -1 : 0;
    }

    public String getName() {
        return this.icD;
    }
}
