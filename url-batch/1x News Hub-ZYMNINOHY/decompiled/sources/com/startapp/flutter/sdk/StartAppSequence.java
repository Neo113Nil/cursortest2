package com.startapp.flutter.sdk;

/* loaded from: classes.dex */
class StartAppSequence {
    private int value;

    public synchronized int next() {
        int i3;
        int i4 = this.value;
        if (i4 < Integer.MAX_VALUE) {
            i3 = i4 + 1;
            this.value = i3;
        } else {
            i3 = 0;
        }
        return i3;
    }
}
