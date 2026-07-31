package com.bytedance.sdk.component.zg.fs;

/* loaded from: classes11.dex */
public abstract class zn implements Comparable<zn>, Runnable {
    public static final int EIGHTH_PRIORITY = 8;
    public static final int FIFTH_PRIORITY = 5;
    public static final int FOURTH_PRIORITY = 4;
    public static final int MAX_PRIORITY = 10;
    public static final int MIN_PRIORITY = 1;
    public static final int NINTH_PRIORITY = 9;
    public static final int SECOND_PRIORITY = 2;
    public static final int SEVENTH_PRIORITY = 7;
    public static final int SIXTH_PRIORITY = 6;
    public static final int THIRD_PRIORITY = 3;
    private long btk;
    private long fb;
    private String fs;
    private long hhw;
    private int zmn;
    private Runnable zn;

    public zn(String str) {
        this.zmn = 5;
        this.fs = str;
    }

    public zn(String str, int i) {
        this.zmn = i;
        this.fs = str;
    }

    public zn(int i, String str, Runnable runnable) {
        this.zmn = i;
        this.fs = str;
        this.zn = runnable;
    }

    public zn(String str, Runnable runnable) {
        this.zmn = 5;
        this.fs = str;
        this.zn = runnable;
    }

    public void setPriority(int i) {
        this.zmn = i;
    }

    public int getPriority() {
        return this.zmn;
    }

    @Override // java.lang.Comparable
    public int compareTo(zn znVar) {
        if (getPriority() < znVar.getPriority()) {
            return 1;
        }
        return getPriority() >= znVar.getPriority() ? -1 : 0;
    }

    public String getName() {
        return this.fs;
    }

    public long getSubmitTimestamp() {
        return this.fb;
    }

    public void setSubmitTimestamp(long j) {
        this.fb = j;
    }

    public long getBeforeTimestamp() {
        return this.btk;
    }

    public void setBeforeTimestamp(long j) {
        this.btk = j;
    }

    public long getAfterTimestamp() {
        return this.hhw;
    }

    public void setAfterTimestamp(long j) {
        this.hhw = j;
    }

    public long getWaitTime() {
        return this.btk - this.fb;
    }

    public long getRunTime() {
        return this.hhw - this.btk;
    }

    public Runnable getTarget() {
        return this.zn;
    }

    public void setTarget(Runnable runnable) {
        this.zn = runnable;
    }
}
