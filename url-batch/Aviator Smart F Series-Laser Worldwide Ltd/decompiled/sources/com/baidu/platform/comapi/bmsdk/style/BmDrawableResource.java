package com.baidu.platform.comapi.bmsdk.style;

import com.baidu.platform.comapi.bmsdk.BmObject;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class BmDrawableResource extends BmObject {

    /* renamed from: a, reason: collision with root package name */
    private static Object f8947a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static List<WeakReference<BmDrawableResource>> f8948b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private a f8949c;

    public interface a {
    }

    private BmDrawableResource() {
        super(55, 0L);
        this.f8949c = null;
    }

    private static native boolean nativeSetListener(long j8, boolean z7);

    protected BmDrawableResource(int i8, long j8) {
        super(i8, j8);
        this.f8949c = null;
    }
}
