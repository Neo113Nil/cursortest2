package com.baidu.platform.comapi.bmsdk;

import android.util.Log;
import com.baidu.platform.comapi.bmsdk.style.BmLineStyle;
import com.baidu.platform.comapi.bmsdk.style.BmLineStyleOption;
import com.baidu.platform.comapi.bmsdk.style.BmTrackStyle;
import com.github.mikephil.charting.utils.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class BmGeoElement extends BmObject {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f8890a = true;

    /* renamed from: b, reason: collision with root package name */
    private final int f8891b;

    /* renamed from: c, reason: collision with root package name */
    private BmLineStyle f8892c;

    /* renamed from: d, reason: collision with root package name */
    private BmTrackStyle f8893d;

    /* renamed from: e, reason: collision with root package name */
    private List<b> f8894e;

    /* renamed from: f, reason: collision with root package name */
    private String f8895f;

    /* renamed from: g, reason: collision with root package name */
    private int f8896g;

    public BmGeoElement() {
        super(70, nativeCreate(0));
        this.f8894e = new ArrayList();
        this.f8891b = 0;
    }

    private static native boolean nativeAddPoint(long j8, double d8, double d9, double d10);

    private static native boolean nativeAddStyleOption(long j8, long j9);

    private static native boolean nativeClearGradientColors(long j8);

    private static native long nativeCreate(int i8);

    private static native boolean nativeDelGradientColors(long j8, int i8);

    private static native boolean nativeRemoveStyleOption(long j8, long j9);

    private static native boolean nativeSetCoordChainHandle(long j8, long j9);

    private static native boolean nativeSetCoordChainType(long j8, int i8);

    private static native boolean nativeSetGradientColors(long j8, int i8, int[] iArr, int i9);

    private static native boolean nativeSetPoints(long j8, double[] dArr, int i8, int i9);

    private static native boolean nativeSetStyle(long j8, long j9);

    private static native boolean nativeSetTrackStyle(long j8, long j9);

    public void a(int i8) {
        this.f8896g = i8;
    }

    public boolean b(List<b> list) {
        double[] dArr;
        this.f8894e.clear();
        this.f8894e.addAll(list);
        int i8 = 0;
        if (list == null || list.size() <= 0) {
            dArr = null;
        } else {
            int size = list.size() * 3;
            dArr = new double[size];
            for (int i9 = 0; i9 < list.size(); i9++) {
                int i10 = i9 * 3;
                dArr[i10] = list.get(i9).f8938a;
                dArr[i10 + 1] = list.get(i9).f8939b;
                dArr[i10 + 2] = list.get(i9).f8940c;
                if (list.get(i9).f8940c < i.DOUBLE_EPSILON) {
                    return false;
                }
            }
            i8 = size;
        }
        if (f8890a || dArr != null) {
            return nativeSetPoints(getNativeInstance(), dArr, i8, 3);
        }
        throw new AssertionError();
    }

    @Override // com.baidu.platform.comapi.bmsdk.BmObject, java.lang.AutoCloseable
    public void close() {
        super.close();
        BmLineStyle bmLineStyle = this.f8892c;
        if (bmLineStyle != null) {
            try {
                bmLineStyle.close();
            } catch (Exception unused) {
                Log.e("BmLineStyle", "BmLineStyle close failed");
            }
            this.f8892c = null;
        }
        BmTrackStyle bmTrackStyle = this.f8893d;
        if (bmTrackStyle != null) {
            try {
                bmTrackStyle.close();
            } catch (Exception unused2) {
                Log.e("BmTrackStyle", "BmTrackStyle close failed");
            }
            this.f8893d = null;
        }
    }

    public void a(String str) {
        this.f8895f = str;
    }

    public BmGeoElement(int i8) {
        super(70, nativeCreate(i8));
        this.f8894e = new ArrayList();
        this.f8891b = i8;
    }

    public boolean a(BmLineStyle bmLineStyle) {
        if (bmLineStyle == null) {
            return false;
        }
        BmLineStyle bmLineStyle2 = this.f8892c;
        if (bmLineStyle2 != null && bmLineStyle2.getNativeInstance() != bmLineStyle.getNativeInstance()) {
            try {
                this.f8892c.close();
            } catch (Exception unused) {
                Log.e("BmLineStyle", "BmLineStyle close failed");
            }
        }
        this.f8892c = bmLineStyle;
        return nativeSetStyle(getNativeInstance(), bmLineStyle.getNativeInstance());
    }

    public boolean a(BmTrackStyle bmTrackStyle) {
        if (bmTrackStyle == null) {
            return false;
        }
        BmTrackStyle bmTrackStyle2 = this.f8893d;
        if (bmTrackStyle2 != null && bmTrackStyle2.getNativeInstance() != bmTrackStyle.getNativeInstance()) {
            try {
                this.f8893d.close();
            } catch (Exception unused) {
                Log.e("BmTrackStyle", "BmTrackStyle close failed");
            }
        }
        this.f8893d = bmTrackStyle;
        return nativeSetTrackStyle(getNativeInstance(), bmTrackStyle.getNativeInstance());
    }

    public boolean a(BmLineStyleOption bmLineStyleOption) {
        if (bmLineStyleOption == null) {
            return false;
        }
        return nativeAddStyleOption(getNativeInstance(), bmLineStyleOption.getNativeInstance());
    }

    public boolean a(List<b> list) {
        double[] dArr;
        this.f8894e.clear();
        this.f8894e.addAll(list);
        int i8 = 0;
        if (list == null || list.size() <= 0) {
            dArr = null;
        } else {
            int size = list.size() * 2;
            dArr = new double[size];
            while (i8 < list.size()) {
                int i9 = i8 * 2;
                dArr[i9] = list.get(i8).f8938a;
                dArr[i9 + 1] = list.get(i8).f8939b;
                i8++;
            }
            i8 = size;
        }
        return nativeSetPoints(getNativeInstance(), dArr, i8, 2);
    }

    public boolean a(int i8, List<Integer> list) {
        int[] iArr;
        int i9 = 0;
        if (list == null || list.size() <= 0) {
            iArr = null;
        } else {
            iArr = new int[list.size()];
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                iArr[i9] = com.baidu.platform.comapi.bmsdk.style.a.a(it.next().intValue());
                i9++;
            }
        }
        return nativeSetGradientColors(getNativeInstance(), i8, iArr, i9);
    }
}
