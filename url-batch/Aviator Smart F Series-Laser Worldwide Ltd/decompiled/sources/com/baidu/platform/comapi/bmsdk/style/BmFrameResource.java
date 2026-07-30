package com.baidu.platform.comapi.bmsdk.style;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class BmFrameResource extends BmDrawableResource {
    private BmFrameResource() {
        super(57, nativeCreate());
    }

    private void a(List<BmBitmapResource> list, int[] iArr, int i8) {
        if (list == null || list.size() == 0) {
            return;
        }
        long[] jArr = new long[list.size()];
        Iterator<BmBitmapResource> it = list.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            jArr[i9] = it.next().getNativeInstance();
            i9++;
        }
        nativeSetBitmapResources(getNativeInstance(), jArr, i9, iArr, iArr.length, i8);
    }

    private static native long nativeCreate();

    private static native boolean nativeSetBitmapResources(long j8, long[] jArr, int i8, int[] iArr, int i9, int i10);

    private static native long nativeSetInterval(long j8, int i8, int i9);

    private static native boolean nativeSetResIds(long j8, int[] iArr, int i8, int[] iArr2, int i9, int i10);

    public BmFrameResource(List<BmBitmapResource> list, int i8, int i9) {
        super(57, nativeCreate());
        a(list, i8, i9);
    }

    public BmFrameResource(List<BmBitmapResource> list, int[] iArr, int i8) {
        super(57, nativeCreate());
        a(list, iArr, i8);
    }

    private void a(List<BmBitmapResource> list, int i8, int i9) {
        if (list == null || list.size() == 0) {
            return;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = i8;
        }
        a(list, iArr, i9);
    }

    public void a(int i8, int i9) {
        if (i9 < 20 || i8 <= 0) {
            return;
        }
        nativeSetInterval(getNativeInstance(), i8, i9);
    }
}
