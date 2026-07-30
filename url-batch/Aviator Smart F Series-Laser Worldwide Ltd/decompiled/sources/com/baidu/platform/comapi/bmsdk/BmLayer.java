package com.baidu.platform.comapi.bmsdk;

import android.os.Bundle;
import android.text.TextUtils;
import com.baidu.platform.comapi.bmsdk.ui.BmBaseUI;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class BmLayer extends BmObject {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<BmDrawItem> f8902a;

    /* renamed from: b, reason: collision with root package name */
    private c f8903b;

    /* renamed from: c, reason: collision with root package name */
    private long f8904c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f8905d;

    public BmLayer() {
        super(1, nativeCreate());
        this.f8902a = new ArrayList<>();
        this.f8903b = null;
        this.f8904c = 0L;
        this.f8905d = new Object();
    }

    private static native boolean nativeAddDrawItem(long j8, long j9);

    private static native boolean nativeAddDrawItemAbove(long j8, long j9, long j10);

    private static native boolean nativeAddDrawItemBelow(long j8, long j9, long j10);

    private static native boolean nativeAddDrawItemByZIndex(long j8, long j9, int i8);

    private static native boolean nativeClearDrawItems(long j8);

    private static native boolean nativeCommitUpdate(long j8);

    private static native long nativeCreate();

    private static native Bundle nativeGetDrawItemRect(long j8, int i8, int i9, int i10, int i11);

    private static native long nativeGetLayerId(long j8);

    private static native boolean nativeHandleClick(long j8, int i8, int i9, int i10, long[] jArr);

    private static native boolean nativeRemoveDrawItem(long j8, long j9);

    private static native boolean nativeSDKHandleClick(long j8, int i8, int i9, int i10, long[] jArr, Bundle bundle);

    private static native boolean nativeSetClickable(long j8, boolean z7);

    private static native boolean nativeSetCollideByArea(long j8, boolean z7);

    private static native boolean nativeSetCollisionBaseMap(long j8, boolean z7);

    private static native boolean nativeSetShowLevel(long j8, int i8, int i9);

    private static native boolean nativeSetVisibility(long j8, int i8);

    private static native boolean nativeUpdateDrawItemZIndex(long j8, long j9, int i8);

    public void a(c cVar) {
        this.f8903b = cVar;
    }

    public boolean b() {
        return nativeCommitUpdate(this.nativeInstance);
    }

    public long c() {
        if (this.f8904c == 0) {
            this.f8904c = nativeGetLayerId(this.nativeInstance);
        }
        return this.f8904c;
    }

    public boolean a(BmDrawItem bmDrawItem, int i8) {
        synchronized (this.f8905d) {
            this.f8902a.add(bmDrawItem);
        }
        return nativeAddDrawItemByZIndex(this.nativeInstance, bmDrawItem.getNativeInstance(), i8);
    }

    public BmLayer(boolean z7) {
        super(1, nativeCreate());
        this.f8902a = new ArrayList<>();
        this.f8903b = null;
        this.f8904c = 0L;
        this.f8905d = new Object();
        nativeSetCollisionBaseMap(this.nativeInstance, z7);
    }

    public boolean a(String str, BmDrawItem bmDrawItem) {
        long j8;
        synchronized (this.f8905d) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    int size = this.f8902a.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        if (str.equals(this.f8902a.get(i8).getName())) {
                            j8 = this.f8902a.get(i8).getNativeInstance();
                            this.f8902a.add(i8 + 1, bmDrawItem);
                            break;
                        }
                    }
                }
                j8 = 0;
                if (j8 == 0) {
                    this.f8902a.add(bmDrawItem);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nativeAddDrawItemAbove(getNativeInstance(), j8, bmDrawItem.getNativeInstance());
    }

    public boolean a(BmDrawItem bmDrawItem) {
        if (bmDrawItem == null) {
            return false;
        }
        synchronized (this.f8905d) {
            try {
                if (!this.f8902a.contains(bmDrawItem)) {
                    return false;
                }
                this.f8902a.remove(bmDrawItem);
                return nativeRemoveDrawItem(this.nativeInstance, bmDrawItem.getNativeInstance());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a() {
        synchronized (this.f8905d) {
            this.f8902a.clear();
        }
        return nativeClearDrawItems(this.nativeInstance);
    }

    public BmDrawItem a(String str) {
        synchronized (this.f8905d) {
            try {
                Iterator<BmDrawItem> it = this.f8902a.iterator();
                while (it.hasNext()) {
                    BmDrawItem next = it.next();
                    if (!str.isEmpty() && next.getName().equals(str)) {
                        return next;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a(BmDrawItem bmDrawItem, short s7) {
        return nativeUpdateDrawItemZIndex(this.nativeInstance, bmDrawItem.getNativeInstance(), s7);
    }

    public BmDrawItem a(int i8, int i9, int i10) {
        long[] jArr = {0, 0, -1};
        if (!nativeSDKHandleClick(this.nativeInstance, i8, i9, i10, jArr, new Bundle()) || this.f8903b == null) {
            return null;
        }
        long j8 = jArr[0];
        if (j8 == 0) {
            return null;
        }
        synchronized (this.f8905d) {
            for (int i11 = 0; i11 < this.f8902a.size(); i11++) {
                try {
                    BmDrawItem bmDrawItem = this.f8902a.get(i11);
                    if (bmDrawItem.nativeInstance == j8) {
                        return bmDrawItem;
                    }
                } finally {
                }
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:10:0x0028, B:12:0x0030, B:16:0x003e, B:18:0x0045, B:20:0x0049, B:21:0x0060, B:23:0x0068, B:24:0x0072, B:26:0x007a, B:30:0x008c, B:31:0x0092, B:36:0x009a, B:37:0x00a0, B:38:0x0053, B:40:0x0057, B:14:0x00a6, B:32:0x00aa), top: B:9:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:10:0x0028, B:12:0x0030, B:16:0x003e, B:18:0x0045, B:20:0x0049, B:21:0x0060, B:23:0x0068, B:24:0x0072, B:26:0x007a, B:30:0x008c, B:31:0x0092, B:36:0x009a, B:37:0x00a0, B:38:0x0053, B:40:0x0057, B:14:0x00a6, B:32:0x00aa), top: B:9:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(int i8, int i9, int i10, boolean z7, boolean z8) {
        BmBaseUI bmBaseUI;
        long[] jArr = {0, 0, -1};
        Bundle bundle = new Bundle();
        boolean nativeSDKHandleClick = nativeSDKHandleClick(this.nativeInstance, i8, i9, i10, jArr, bundle);
        if (nativeSDKHandleClick && this.f8903b != null) {
            int i11 = 0;
            long j8 = jArr[0];
            if (j8 != 0) {
                synchronized (this.f8905d) {
                    while (true) {
                        try {
                            if (i11 >= this.f8902a.size()) {
                                break;
                            }
                            BmDrawItem bmDrawItem = this.f8902a.get(i11);
                            if (bmDrawItem.nativeInstance == j8) {
                                long j9 = jArr[1];
                                if (j9 != 0) {
                                    if (bmDrawItem instanceof BmBaseMarker) {
                                        bmBaseUI = ((BmBaseMarker) bmDrawItem).b(j9);
                                    } else if (bmDrawItem instanceof Bm3DModel) {
                                        bmBaseUI = ((Bm3DModel) bmDrawItem).b(j9);
                                    }
                                    if (bundle.containsKey("hole_index")) {
                                        bmDrawItem.a(bundle.getInt("hole_index"));
                                    }
                                    if (bundle.containsKey("multipoint_index")) {
                                        ((BmMultiPoint) bmDrawItem).e(bundle.getInt("multipoint_index"));
                                    }
                                    if (z7) {
                                        if (bmBaseUI != null) {
                                            this.f8903b.a(bmDrawItem, bmBaseUI);
                                        } else {
                                            this.f8903b.a(bmDrawItem);
                                        }
                                    } else if (z8) {
                                        if (bmBaseUI != null) {
                                            this.f8903b.a(bmDrawItem, bmBaseUI);
                                        } else {
                                            this.f8903b.a(bmDrawItem);
                                        }
                                    }
                                }
                                bmBaseUI = null;
                                if (bundle.containsKey("hole_index")) {
                                }
                                if (bundle.containsKey("multipoint_index")) {
                                }
                                if (z7) {
                                }
                            } else {
                                i11++;
                            }
                        } finally {
                        }
                    }
                }
            }
        }
        return nativeSDKHandleClick;
    }
}
