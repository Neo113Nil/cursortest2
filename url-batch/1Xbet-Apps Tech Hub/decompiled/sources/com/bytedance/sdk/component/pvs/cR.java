package com.bytedance.sdk.component.pvs;

/* compiled from: JsBridgeException.java */
/* loaded from: classes.dex */
class cR extends Exception {
    int pvs;

    cR(int i) {
        this.pvs = i;
    }

    cR(int i, String str) {
        super(str);
        this.pvs = i;
    }
}
