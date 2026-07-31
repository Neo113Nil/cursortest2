package com.bytedance.sdk.component.hhw.zmn.btk;

import java.util.UUID;

/* loaded from: classes15.dex */
public abstract class btk implements Comparable<btk>, Runnable {
    private String zn;
    private int zmn = 5;
    private String fs = UUID.randomUUID().toString() + "-" + String.valueOf(System.nanoTime());

    public btk(String str) {
        this.zn = str;
    }

    public void zmn(int i) {
        this.zmn = i;
    }

    public int zmn() {
        return this.zmn;
    }

    @Override // java.lang.Comparable
    /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
    public int compareTo(btk btkVar) {
        if (zmn() < btkVar.zmn()) {
            return 1;
        }
        return zmn() >= btkVar.zmn() ? -1 : 0;
    }
}
