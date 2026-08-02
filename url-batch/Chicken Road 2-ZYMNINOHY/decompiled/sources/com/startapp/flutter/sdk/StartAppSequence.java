package com.startapp.flutter.sdk;

/* loaded from: classes.dex */
class StartAppSequence {
    private int value;

    public synchronized int next() {
        int i4;
        int i5 = this.value;
        if (i5 < Integer.MAX_VALUE) {
            i4 = i5 + 1;
            this.value = i4;
        } else {
            i4 = 0;
        }
        return i4;
    }
}
