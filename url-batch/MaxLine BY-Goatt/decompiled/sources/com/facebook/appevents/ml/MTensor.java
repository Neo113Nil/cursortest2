package com.facebook.appevents.ml;

import defpackage.ch2;
import defpackage.t31;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class MTensor {
    public static final Companion Companion = new Companion(null);
    private int capacity;
    private float[] data;
    private int[] shape;

    public MTensor(int[] iArr) {
        iArr.getClass();
        this.shape = iArr;
        int capacity = Companion.getCapacity(iArr);
        this.capacity = capacity;
        this.data = new float[capacity];
    }

    public final float[] getData() {
        return this.data;
    }

    public final int getShape(int i) {
        return this.shape[i];
    }

    public final int getShapeSize() {
        return this.shape.length;
    }

    public final void reshape(int[] iArr) {
        iArr.getClass();
        this.shape = iArr;
        int capacity = Companion.getCapacity(iArr);
        float[] fArr = new float[capacity];
        System.arraycopy(this.data, 0, fArr, 0, Math.min(this.capacity, capacity));
        this.data = fArr;
        this.capacity = capacity;
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getCapacity(int[] iArr) {
            if (iArr.length == 0) {
                ch2.h("Empty array can't be reduced.");
                return 0;
            }
            int i = iArr[0];
            t31 it = new IntRange(1, iArr.length - 1, 1).iterator();
            while (it.o) {
                i *= iArr[it.nextInt()];
            }
            return i;
        }

        private Companion() {
        }
    }
}
