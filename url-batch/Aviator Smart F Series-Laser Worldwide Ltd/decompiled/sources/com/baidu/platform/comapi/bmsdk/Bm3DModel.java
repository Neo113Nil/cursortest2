package com.baidu.platform.comapi.bmsdk;

import com.baidu.mapapi.map.BM3DModel;
import com.baidu.platform.comapi.bmsdk.ui.BmBaseUI;
import com.baidu.platform.comapi.bmsdk.ui.BmRichView;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class Bm3DModel extends BmDrawItem {

    /* renamed from: i, reason: collision with root package name */
    private a f8860i;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<BmRichView> f8861j;

    /* renamed from: k, reason: collision with root package name */
    private String f8862k;

    /* renamed from: l, reason: collision with root package name */
    private BM3DModel f8863l;

    public Bm3DModel() {
        super(20, nativeCreate());
        this.f8861j = new ArrayList<>();
        this.f8862k = "";
        this.f8860i = new a();
    }

    private static native boolean nativeAddRichView(long j8, long j9);

    private static native boolean nativeClearRichViews(long j8);

    private static native long nativeCreate();

    private static native boolean nativeLoad(long j8, String str, int i8);

    private static native boolean nativeLoadByPath(long j8, String str, String str2, int i8);

    private static native boolean nativeRemoveRichView(long j8, long j9);

    private static native boolean nativeSetAlwaysShowFront(long j8, boolean z7);

    private static native boolean nativeSetAnimationIndex(long j8, int i8);

    private static native boolean nativeSetAnimationIsEnable(long j8, boolean z7);

    private static native boolean nativeSetAnimationRepeatCount(long j8, int i8);

    private static native boolean nativeSetAnimationSpeed(long j8, float f8);

    private static native boolean nativeSetBuildingId(long j8, String str);

    private static native boolean nativeSetCollisionBehavior(long j8, int i8);

    private static native boolean nativeSetCollisionPriority(long j8, int i8);

    private static native boolean nativeSetFloorId(long j8, String str);

    private static native boolean nativeSetOffset(long j8, double d8, double d9, double d10);

    private static native boolean nativeSetPosition(long j8, double d8, double d9, double d10);

    private static native boolean nativeSetRotation(long j8, float f8, float f9, float f10);

    private static native boolean nativeSetScale(long j8, float f8);

    private static native boolean nativeSetScaleByLevel(long j8, boolean z7);

    public void a(BM3DModel bM3DModel) {
        this.f8863l = bM3DModel;
    }

    public boolean b(float f8) {
        return nativeSetAnimationSpeed(this.nativeInstance, f8);
    }

    public boolean c(float f8) {
        this.f8860i.a(f8);
        return nativeSetScale(this.nativeInstance, f8);
    }

    public boolean d(boolean z7) {
        return nativeSetAnimationIsEnable(this.nativeInstance, z7);
    }

    public boolean e(boolean z7) {
        return nativeSetScaleByLevel(this.nativeInstance, z7);
    }

    public boolean f(int i8) {
        return nativeSetAnimationRepeatCount(this.nativeInstance, i8);
    }

    public boolean a(String str, String str2, int i8) {
        return nativeLoadByPath(this.nativeInstance, str, str2, i8);
    }

    public BmBaseUI b(long j8) {
        if (j8 == 0) {
            return null;
        }
        Iterator<BmRichView> it = this.f8861j.iterator();
        while (it.hasNext()) {
            BmBaseUI a8 = it.next().a(j8);
            if (a8 != null) {
                return a8;
            }
        }
        return null;
    }

    public boolean e(int i8) {
        return nativeSetAnimationIndex(this.nativeInstance, i8);
    }

    public boolean a(b bVar) {
        this.f8860i.a(bVar);
        return nativeSetPosition(this.nativeInstance, bVar.f8938a, bVar.f8939b, bVar.f8940c);
    }

    public boolean c(boolean z7) {
        return nativeSetAlwaysShowFront(this.nativeInstance, z7);
    }

    public boolean a(double d8, double d9, double d10) {
        return nativeSetOffset(this.nativeInstance, d8, d9, d10);
    }

    public boolean a(float f8, float f9, float f10) {
        this.f8860i.a(f8, f9, f10);
        return nativeSetRotation(this.nativeInstance, f8, f9, f10);
    }
}
