package com.baidu.mapapi.map;

import android.os.Bundle;
import android.util.Log;
import com.arthenica.ffmpegkit.x;
import com.baidu.mapapi.animation.Animation;
import com.baidu.mapapi.common.SysOSUtil;
import com.baidu.mapapi.map.PolylineOptions;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapsdkplatform.comapi.map.f;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.bmsdk.BmBaseLine;
import com.baidu.platform.comapi.bmsdk.BmDrawItem;
import com.baidu.platform.comapi.bmsdk.BmGeoElement;
import com.baidu.platform.comapi.bmsdk.BmGradientLine;
import com.baidu.platform.comapi.bmsdk.BmPolyline;
import com.baidu.platform.comapi.bmsdk.animation.BmAnimation;
import com.baidu.platform.comapi.bmsdk.style.BmBitmapResource;
import com.baidu.platform.comapi.bmsdk.style.BmLineStyle;
import com.baidu.platform.comapi.bmsdk.style.BmLineStyleOption;
import com.github.mikephil.charting.utils.i;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import io.reactivex.annotations.SchedulerSupport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class Polyline extends Overlay {
    int D;
    int E;
    private BmBaseLine J;
    private BmLineStyle K;
    private BmGeoElement L;
    Animation O;

    /* renamed from: g, reason: collision with root package name */
    int f6172g;

    /* renamed from: h, reason: collision with root package name */
    List<LatLng> f6173h;

    /* renamed from: i, reason: collision with root package name */
    int[] f6174i;

    /* renamed from: j, reason: collision with root package name */
    List<Integer> f6175j;

    /* renamed from: k, reason: collision with root package name */
    int[] f6176k;

    /* renamed from: l, reason: collision with root package name */
    List<Integer> f6177l;

    /* renamed from: r, reason: collision with root package name */
    BitmapDescriptor f6183r;

    /* renamed from: s, reason: collision with root package name */
    BmBitmapResource f6184s;

    /* renamed from: t, reason: collision with root package name */
    List<BitmapDescriptor> f6185t;

    /* renamed from: u, reason: collision with root package name */
    List<BmBitmapResource> f6186u;

    /* renamed from: m, reason: collision with root package name */
    float f6178m = 5.0f;

    /* renamed from: n, reason: collision with root package name */
    boolean f6179n = false;

    /* renamed from: o, reason: collision with root package name */
    boolean f6180o = false;

    /* renamed from: p, reason: collision with root package name */
    boolean f6181p = true;

    /* renamed from: q, reason: collision with root package name */
    boolean f6182q = true;

    /* renamed from: v, reason: collision with root package name */
    int f6187v = 0;

    /* renamed from: w, reason: collision with root package name */
    boolean f6188w = true;

    /* renamed from: x, reason: collision with root package name */
    ThinAndSmoothAlgorithm f6189x = ThinAndSmoothAlgorithm.DOUGLAS_PEUCKER;

    /* renamed from: y, reason: collision with root package name */
    float f6190y = 4.0f;

    /* renamed from: z, reason: collision with root package name */
    ThinAndSmoothAlgorithm f6191z = ThinAndSmoothAlgorithm.BEZIER_SMOOTH;
    float A = 16.0f;
    boolean B = false;
    boolean C = false;
    float F = 5.0f;
    int G = 1;
    boolean H = false;
    LineBloomDirection I = LineBloomDirection.BloomAround;
    private List<BmGeoElement> M = null;
    private List<BmLineStyle> N = null;
    PolylineOptions.LineCapType P = PolylineOptions.LineCapType.LineCapButt;
    PolylineOptions.LineJoinType Q = PolylineOptions.LineJoinType.LineJoinRound;
    PolylineOptions.LineDirectionCross180 R = PolylineOptions.LineDirectionCross180.NONE;
    PolylineOptions.LineBloomType S = PolylineOptions.LineBloomType.NONE;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6192a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f6193b;

        static {
            int[] iArr = new int[PolylineOptions.LineCapType.values().length];
            f6193b = iArr;
            try {
                iArr[PolylineOptions.LineCapType.LineCapButt.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6193b[PolylineOptions.LineCapType.LineCapRound.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6193b[PolylineOptions.LineCapType.LineCapSQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[PolylineOptions.LineJoinType.values().length];
            f6192a = iArr2;
            try {
                iArr2[PolylineOptions.LineJoinType.LineJoinBevel.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6192a[PolylineOptions.LineJoinType.LineJoinMiter.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6192a[PolylineOptions.LineJoinType.LineJoinRound.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    Polyline() {
        this.type = com.baidu.mapsdkplatform.comapi.map.d.polyline;
    }

    private static void a(int[] iArr, Bundle bundle) {
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        bundle.putIntArray("color_array", iArr);
        bundle.putInt(FileDownloadModel.TOTAL, 1);
    }

    private Bundle b(boolean z7, String str) {
        if (z7) {
            Bundle bundle = new Bundle();
            bundle.putInt(FileDownloadModel.TOTAL, 1);
            int i8 = this.f6187v;
            String str2 = i8 == 1 ? "CircleDashTexture.png" : i8 == 2 ? "lineDash_Rectangle.png" : "lineDashTexture.png";
            if (str == null) {
                str = str2;
            }
            BitmapDescriptor fromAsset = BitmapDescriptorFactory.fromAsset(str);
            if (fromAsset != null) {
                bundle.putBundle("texture_0", fromAsset.a());
            }
            return bundle;
        }
        Bundle bundle2 = new Bundle();
        int i9 = 0;
        for (int i10 = 0; i10 < this.f6185t.size(); i10++) {
            if (this.f6185t.get(i10) != null) {
                bundle2.putBundle("texture_" + String.valueOf(i9), this.f6185t.get(i10).a());
                i9++;
            }
        }
        bundle2.putInt(FileDownloadModel.TOTAL, i9);
        return bundle2;
    }

    private static void c(int[] iArr, Bundle bundle) {
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        bundle.putIntArray("color_indexs", iArr);
    }

    private static void d(int[] iArr, Bundle bundle) {
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        bundle.putIntArray("traffic_array", iArr);
    }

    public void cancelAnimation() {
        if (this.O == null || !OverlayUtil.isOverlayUpgrade()) {
            return;
        }
        this.O.bmAnimation.cancel();
        this.f6122f.b();
    }

    public int getBloomAlpha() {
        return this.E;
    }

    public int getBloomBlurTimes() {
        return this.G;
    }

    public float getBloomGradientASpeed() {
        return this.F;
    }

    public int getBloomWidth() {
        int i8 = this.D;
        return i8 == 0 ? (int) (this.f6178m * 2.0f) : i8;
    }

    public int getColor() {
        return this.f6172g;
    }

    public int[] getColorList() {
        return this.f6176k;
    }

    public int getDottedLineType() {
        return this.f6187v;
    }

    @Override // com.baidu.mapapi.map.Overlay
    public BmDrawItem getDrawItem() {
        return this.J;
    }

    public PolylineOptions.LineBloomType getLineBloomType() {
        return this.S;
    }

    public PolylineOptions.LineCapType getLineCapType() {
        return this.P;
    }

    public PolylineOptions.LineDirectionCross180 getLineDirectionCross180() {
        return this.R;
    }

    public PolylineOptions.LineJoinType getLineJoinType() {
        return this.Q;
    }

    public List<LatLng> getPoints() {
        return this.f6173h;
    }

    public BitmapDescriptor getTexture() {
        return this.f6183r;
    }

    public float getWidth() {
        return this.f6178m;
    }

    public boolean isClickable() {
        return this.f6182q;
    }

    public boolean isDottedLine() {
        return this.f6179n;
    }

    public boolean isFocus() {
        return this.f6180o;
    }

    public boolean isGeodesic() {
        return this.B;
    }

    public boolean isGradient() {
        return this.C;
    }

    public boolean isIsKeepScale() {
        return this.f6181p;
    }

    public boolean isThined() {
        return this.f6188w;
    }

    public void pauseAnimation() {
        if (this.O == null || !OverlayUtil.isOverlayUpgrade()) {
            return;
        }
        this.O.bmAnimation.pause();
        this.f6122f.b();
    }

    public void resumeAnimation() {
        if (this.O == null || !OverlayUtil.isOverlayUpgrade()) {
            return;
        }
        this.O.bmAnimation.resume();
        this.f6122f.b();
    }

    public void setAnimation(Animation animation) {
        BmAnimation bmAnimation;
        if (animation == null) {
            return;
        }
        this.O = animation;
        if (!OverlayUtil.isOverlayUpgrade() || (bmAnimation = this.O.bmAnimation) == null) {
            return;
        }
        this.J.a(bmAnimation);
        this.f6122f.b();
    }

    public void setBloomAlpha(int i8) {
        if (i8 > 255 || i8 < 0) {
            i8 = 255;
        }
        this.E = i8;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
        } else {
            this.J.b(i8);
            this.f6122f.b();
        }
    }

    public void setBloomBlurTimes(int i8) {
        if (i8 > 10) {
            i8 = 10;
        }
        if (i8 < 1) {
            i8 = 1;
        }
        this.G = i8;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
        } else {
            this.J.e(i8);
            this.f6122f.b();
        }
    }

    public void setBloomGradientASpeed(float f8) {
        if (f8 < 1.0f) {
            f8 = 1.0f;
        }
        if (f8 > 10.0f) {
            f8 = 10.0f;
        }
        this.F = f8;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
        } else {
            this.J.c(f8);
            this.f6122f.b();
        }
    }

    public void setBloomWidth(int i8) {
        if (i8 < 0) {
            i8 = 0;
        }
        this.D = i8;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
        } else {
            this.J.d(i8);
            this.f6122f.b();
        }
    }

    public void setClickable(boolean z7) {
        if (this.f6182q == z7) {
            return;
        }
        this.f6182q = z7;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
        } else {
            this.J.a(z7);
            this.f6122f.b();
        }
    }

    public void setColor(int i8) {
        BmLineStyle bmLineStyle;
        this.f6172g = i8;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        if (this.C || this.f6183r != null || this.f6185t != null || this.L == null || (bmLineStyle = this.K) == null) {
            return;
        }
        bmLineStyle.a(this.f6172g);
        this.f6122f.b();
    }

    public void setColorList(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("BDMapSDKException: colorList can not empty");
        }
        this.f6176k = iArr;
        if (OverlayUtil.isOverlayUpgrade() && this.f6183r == null && this.f6185t == null) {
            int i8 = 0;
            if (this.C) {
                this.f6177l.clear();
                int[] iArr2 = this.f6176k;
                int length = iArr2.length;
                while (i8 < length) {
                    this.f6177l.add(Integer.valueOf(iArr2[i8]));
                    i8++;
                }
                for (int size = this.f6177l.size(); size < this.f6173h.size(); size++) {
                    List<Integer> list = this.f6177l;
                    list.add(list.get(list.size() - 1));
                }
                this.L.a(1, this.f6177l);
                this.f6122f.b();
                return;
            }
            if (this.M == null || this.N == null) {
                return;
            }
            this.f6177l.clear();
            for (int i9 : this.f6176k) {
                this.f6177l.add(Integer.valueOf(i9));
            }
            for (int size2 = this.f6177l.size(); size2 < this.f6173h.size() - 1; size2++) {
                List<Integer> list2 = this.f6177l;
                list2.add(list2.get(list2.size() - 1));
            }
            while (i8 < this.N.size()) {
                this.N.get(i8).a(this.f6177l.get(i8).intValue());
                i8++;
            }
            this.f6122f.b();
        }
    }

    public void setDottedLine(boolean z7) {
        if (this.f6179n == z7) {
            return;
        }
        this.f6179n = z7;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        if (!this.C && this.f6183r == null && this.f6185t == null) {
            BmLineStyle bmLineStyle = this.K;
            if (bmLineStyle != null) {
                if (this.f6179n) {
                    setDottedBitmapResource(bmLineStyle, this.f6187v);
                    this.K.c(5);
                } else {
                    bmLineStyle.b(0);
                    this.K.a();
                }
            }
            List<BmLineStyle> list = this.N;
            if (list != null) {
                if (this.f6179n) {
                    for (BmLineStyle bmLineStyle2 : list) {
                        setDottedBitmapResource(bmLineStyle2, this.f6187v);
                        bmLineStyle2.c(5);
                    }
                } else {
                    for (int i8 = 0; i8 < this.N.size(); i8++) {
                        this.N.get(i8).b(0);
                        this.N.get(i8).a();
                    }
                }
            }
            this.f6122f.b();
        }
    }

    public void setDottedLineType(PolylineDottedLineType polylineDottedLineType) {
        this.f6187v = polylineDottedLineType.ordinal();
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        if (this.f6179n && !this.C && this.f6183r == null && this.f6185t == null) {
            BmLineStyle bmLineStyle = this.K;
            if (bmLineStyle != null) {
                setDottedBitmapResource(bmLineStyle, this.f6187v);
                this.K.c(5);
            }
            List<BmLineStyle> list = this.N;
            if (list != null) {
                for (BmLineStyle bmLineStyle2 : list) {
                    setDottedBitmapResource(bmLineStyle2, this.f6187v);
                    bmLineStyle2.c(5);
                }
            }
            this.f6122f.b();
        }
    }

    public void setFocus(boolean z7) {
        this.f6180o = z7;
        this.listener.d(this);
    }

    public void setGeodesic(boolean z7) {
        this.B = z7;
        this.listener.d(this);
    }

    public void setGradient(boolean z7) {
        this.C = z7;
        this.listener.d(this);
    }

    public void setIndexs(int[] iArr) {
        List<BmLineStyle> list;
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("BDMapSDKException: indexList can not empty");
        }
        this.f6174i = iArr;
        if (!OverlayUtil.isOverlayUpgrade() || this.f6185t == null || (list = this.N) == null || this.M == null) {
            return;
        }
        list.clear();
        this.M.clear();
        this.J.c();
        List<Integer> list2 = this.f6175j;
        if (list2 != null) {
            list2.clear();
        } else {
            this.f6175j = new ArrayList();
        }
        int size = this.f6173h.size() - 1;
        int i8 = 0;
        for (int i9 : iArr) {
            this.f6175j.add(Integer.valueOf(i9));
        }
        for (int length = iArr.length; length < size; length++) {
            this.f6175j.add(Integer.valueOf(iArr[iArr.length - 1]));
        }
        ArrayList arrayList = new ArrayList();
        Bundle bundle = new Bundle();
        a(this.f6173h, this.R, bundle);
        if (bundle.containsKey("x_array") && bundle.containsKey("y_array")) {
            double[] doubleArray = bundle.getDoubleArray("x_array");
            double[] doubleArray2 = bundle.getDoubleArray("y_array");
            for (int i10 = 0; i10 < doubleArray.length; i10++) {
                arrayList.add(new com.baidu.platform.comapi.bmsdk.b(doubleArray[i10], doubleArray2[i10]));
            }
        }
        int intValue = this.f6175j.get(0).intValue();
        while (i8 < size) {
            int i11 = i8;
            while (i11 < size && intValue == this.f6175j.get(i11).intValue()) {
                i11++;
            }
            ArrayList arrayList2 = new ArrayList();
            while (i8 <= i11) {
                arrayList2.add(arrayList.get(i8));
                i8++;
            }
            BmGeoElement bmGeoElement = new BmGeoElement();
            BmLineStyle bmLineStyle = new BmLineStyle();
            bmLineStyle.a(this.f6178m);
            bmLineStyle.a(new BmBitmapResource(this.f6185t.get(intValue).getBitmap()));
            bmGeoElement.a(bmLineStyle);
            bmGeoElement.a(arrayList2);
            this.M.add(bmGeoElement);
            this.J.a(bmGeoElement);
            this.N.add(bmLineStyle);
            if (i11 < size) {
                intValue = this.f6175j.get(i11).intValue();
            }
            i8 = i11;
        }
        this.f6122f.b();
    }

    public void setIsKeepScale(boolean z7) {
        this.f6181p = z7;
    }

    public void setLineBloomDirection(LineBloomDirection lineBloomDirection) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.I = lineBloomDirection;
            this.J.h(lineBloomDirection.ordinal());
            this.f6122f.b();
        }
    }

    public void setLineBloomType(PolylineOptions.LineBloomType lineBloomType) {
        this.S = lineBloomType;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
        } else {
            this.J.i(lineBloomType.ordinal());
            this.f6122f.b();
        }
    }

    public void setLineCapType(PolylineOptions.LineCapType lineCapType) {
        this.P = lineCapType;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        this.J.l(a(this.P));
        this.J.f(a(this.P));
        this.f6122f.b();
    }

    public void setLineDirectionCross180(PolylineOptions.LineDirectionCross180 lineDirectionCross180) {
        this.R = lineDirectionCross180;
    }

    public void setLineJoinType(PolylineOptions.LineJoinType lineJoinType) {
        this.Q = lineJoinType;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
        } else {
            if (isGeodesic()) {
                return;
            }
            this.J.g(a(this.Q));
            this.f6122f.b();
        }
    }

    public void setPoints(List<LatLng> list) {
        if (list == null) {
            throw new IllegalArgumentException("BDMapSDKException: points list can not be null");
        }
        if (list.size() < 2) {
            throw new IllegalArgumentException("BDMapSDKException: points count can not less than 2 or more than 10000");
        }
        if (list.contains(null)) {
            throw new IllegalArgumentException("BDMapSDKException: points list can not contains null");
        }
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.f6173h = list;
            this.listener.d(this);
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        a((this.B && list.size() == 2) ? f.b(list.get(0), list.get(1)) : list, arrayList, this.R);
        if (this.C) {
            if (list.size() > this.f6173h.size()) {
                for (int size = this.f6177l.size(); size < list.size(); size++) {
                    List<Integer> list2 = this.f6177l;
                    list2.add(list2.get(list2.size() - 1));
                }
                this.L.a(1, this.f6177l);
            }
            if (list.size() < this.f6173h.size()) {
                this.f6177l.subList(list.size(), this.f6177l.size()).clear();
                this.L.a(1, this.f6177l);
            }
            this.L.a(arrayList);
            this.f6173h = list;
            this.f6122f.b();
            return;
        }
        if (this.f6185t != null) {
            int size2 = list.size() - 1;
            if (list.size() > this.f6173h.size()) {
                for (int length = this.f6174i.length; length < size2; length++) {
                    List<Integer> list3 = this.f6175j;
                    int[] iArr = this.f6174i;
                    list3.add(Integer.valueOf(iArr[iArr.length - 1]));
                }
            }
            if (list.size() < this.f6173h.size()) {
                this.f6175j.subList(list.size(), this.f6175j.size()).clear();
                for (int size3 = list.size() - 1; size3 < this.M.size(); size3++) {
                    this.J.b(this.M.get(size3));
                }
                this.M.subList(list.size() - 1, this.M.size()).clear();
            }
            int intValue = this.f6175j.get(0).intValue();
            int i9 = 0;
            while (i8 < size2) {
                int i10 = i8;
                while (i10 < size2 && intValue == this.f6175j.get(i10).intValue()) {
                    i10++;
                }
                ArrayList arrayList2 = new ArrayList();
                while (i8 <= i10) {
                    arrayList2.add(arrayList.get(i8));
                    i8++;
                }
                int i11 = i9 + 1;
                this.M.get(i9).a(arrayList2);
                if (i10 < size2) {
                    intValue = this.f6175j.get(i10).intValue();
                }
                i8 = i10;
                i9 = i11;
            }
        } else if (this.f6176k != null) {
            if (list.size() > this.f6173h.size()) {
                for (int size4 = this.f6177l.size(); size4 < list.size() - 1; size4++) {
                    List<Integer> list4 = this.f6177l;
                    list4.add(list4.get(list4.size() - 1));
                }
            }
            if (list.size() < this.f6173h.size()) {
                this.f6177l.subList(list.size(), this.f6177l.size()).clear();
                for (int size5 = list.size() - 1; size5 < this.M.size(); size5++) {
                    this.J.b(this.M.get(size5));
                }
                this.M.subList(list.size() - 1, this.M.size()).clear();
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 1; i12 < list.size(); i12++) {
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(arrayList.get(i12 - 1));
                arrayList4.add(arrayList.get(i12));
                arrayList3.add(arrayList4);
            }
            while (i8 < arrayList3.size()) {
                if (i8 < this.f6173h.size() - 1) {
                    this.M.get(i8).a((List<com.baidu.platform.comapi.bmsdk.b>) arrayList3.get(i8));
                } else {
                    BmGeoElement bmGeoElement = new BmGeoElement();
                    bmGeoElement.a((List<com.baidu.platform.comapi.bmsdk.b>) arrayList3.get(i8));
                    this.M.add(bmGeoElement);
                    this.J.a(bmGeoElement);
                }
                i8++;
            }
        } else {
            this.L.a(arrayList);
        }
        this.f6173h = list;
        this.f6122f.b();
    }

    public void setSmoothAlgorithm(ThinAndSmoothAlgorithm thinAndSmoothAlgorithm) {
        this.f6191z = thinAndSmoothAlgorithm;
        if (OverlayUtil.isOverlayUpgrade()) {
            this.J.k(this.f6191z.getValue());
            this.f6122f.b();
        }
    }

    public void setSmoothFactor(float f8) {
        if (f8 > 0.0f) {
            this.A = f8;
        }
        if (OverlayUtil.isOverlayUpgrade()) {
            this.J.e(this.A);
            this.f6122f.b();
        }
    }

    public void setTexture(BitmapDescriptor bitmapDescriptor) {
        this.f6183r = bitmapDescriptor;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmBitmapResource bmBitmapResource = new BmBitmapResource(bitmapDescriptor.getBitmap());
        this.f6184s = bmBitmapResource;
        BmLineStyle bmLineStyle = this.K;
        if (bmLineStyle != null) {
            bmLineStyle.a(bmBitmapResource);
        }
        this.f6122f.b();
    }

    public void setTextureList(List<BitmapDescriptor> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("BDMapSDKException: textureList can not empty");
        }
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.f6185t = list;
            return;
        }
        if (this.f6185t != null) {
            List<BmBitmapResource> list2 = this.f6186u;
            if (list2 != null) {
                list2.clear();
            }
            if (this.f6186u == null) {
                this.f6186u = new ArrayList();
            }
            for (int i8 = 0; i8 < list.size(); i8++) {
                this.f6186u.add(new BmBitmapResource(list.get(i8).getBitmap()));
            }
            int i9 = 0;
            for (int i10 = 0; i10 < this.N.size(); i10++) {
                int intValue = this.f6175j.get(i9).intValue();
                this.N.get(i10).a(new BmBitmapResource(list.get(intValue).getBitmap()));
                while (i9 < this.f6175j.size() && intValue == this.f6175j.get(i9).intValue()) {
                    i9++;
                }
            }
            this.f6185t = list;
            this.f6122f.b();
        }
    }

    public void setThinAlgorithm(ThinAndSmoothAlgorithm thinAndSmoothAlgorithm) {
        this.f6189x = thinAndSmoothAlgorithm;
        if (OverlayUtil.isOverlayUpgrade()) {
            this.J.m(this.f6189x.getValue());
            this.f6122f.b();
        }
    }

    public void setThinFactor(float f8) {
        if (f8 > 0.0f) {
            this.f6190y = f8;
        }
        if (OverlayUtil.isOverlayUpgrade()) {
            this.J.f(this.f6190y);
            this.f6122f.b();
        }
    }

    public void setThined(boolean z7) {
        this.f6188w = z7;
        if (OverlayUtil.isOverlayUpgrade()) {
            return;
        }
        this.listener.d(this);
    }

    public void setTrackBackwardStyle(LineStyle lineStyle) {
        if (lineStyle != null && OverlayUtil.isOverlayUpgrade()) {
            this.L.a(new BmLineStyleOption(256, lineStyle.f5925a));
            this.f6122f.b();
        }
    }

    public void setTrackBackwardStyles(List<LineStyle> list) {
        if (list == null || list.isEmpty() || !OverlayUtil.isOverlayUpgrade() || this.M == null || list.size() != this.M.size()) {
            return;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.M.get(i8).a(new BmLineStyleOption(256, list.get(i8).f5925a));
        }
        this.f6122f.b();
    }

    public void setTrackForwardStyle(LineStyle lineStyle) {
        if (lineStyle != null && OverlayUtil.isOverlayUpgrade()) {
            this.L.a(new BmLineStyleOption(128, lineStyle.f5925a));
            this.f6122f.b();
        }
    }

    public void setTrackForwardStyles(List<LineStyle> list) {
        if (list == null || list.isEmpty() || !OverlayUtil.isOverlayUpgrade() || this.M == null || list.size() != this.M.size()) {
            return;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.M.get(i8).a(new BmLineStyleOption(128, list.get(i8).f5925a));
        }
        this.f6122f.b();
    }

    public void setWidth(int i8) {
        if (i8 > 0) {
            this.f6178m = i8;
            if (!OverlayUtil.isOverlayUpgrade()) {
                this.listener.d(this);
                return;
            }
            BmLineStyle bmLineStyle = this.K;
            if (bmLineStyle != null) {
                bmLineStyle.a(this.f6178m);
            }
            List<BmLineStyle> list = this.N;
            if (list != null) {
                Iterator<BmLineStyle> it = list.iterator();
                while (it.hasNext()) {
                    it.next().a(this.f6178m);
                }
            }
            this.f6122f.b();
        }
    }

    public void startAnimation() {
        if (this.O == null || !OverlayUtil.isOverlayUpgrade()) {
            return;
        }
        this.O.bmAnimation.start();
        this.f6122f.b();
    }

    @Override // com.baidu.mapapi.map.Overlay
    BmDrawItem toDrawItem() {
        int[] iArr;
        int[] iArr2;
        if (this.C) {
            this.J = new BmGradientLine();
        } else {
            this.J = new BmPolyline();
        }
        this.J.a(this);
        setDrawItem(this.J);
        super.toDrawItem();
        List<LatLng> list = this.f6173h;
        if (list == null || list.size() < 2) {
            throw new IllegalStateException("BDMapSDKException: when you add Polyline, you must at least supply 2 points");
        }
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        a((this.B && this.f6173h.size() == 2) ? f.b(this.f6173h.get(0), this.f6173h.get(1)) : this.f6173h, arrayList, this.R);
        this.J.c(this.H);
        this.J.g(a(this.Q));
        this.J.l(a(this.P));
        this.J.f(a(this.P));
        this.J.i(this.S.ordinal());
        this.J.d(this.D / 2.0f);
        this.J.h(this.I.ordinal());
        this.J.d(this.D / 2);
        this.J.b(this.E);
        this.J.e(this.G);
        this.J.c(this.F);
        this.J.j(this.R.ordinal());
        this.J.a(this.f6182q);
        if (this.C && (iArr2 = this.f6176k) != null && iArr2.length > 0) {
            BmGeoElement bmGeoElement = new BmGeoElement(0);
            this.L = bmGeoElement;
            bmGeoElement.a(arrayList);
            this.f6177l = new ArrayList();
            while (true) {
                int[] iArr3 = this.f6176k;
                if (i8 >= iArr3.length) {
                    break;
                }
                this.f6177l.add(Integer.valueOf(iArr3[i8]));
                i8++;
            }
            for (int size = this.f6177l.size(); size < this.f6173h.size(); size++) {
                List<Integer> list2 = this.f6177l;
                list2.add(list2.get(list2.size() - 1));
            }
            this.L.a(1, this.f6177l);
            BmLineStyle bmLineStyle = new BmLineStyle();
            this.K = bmLineStyle;
            bmLineStyle.a(this.f6178m);
            this.L.a(this.K);
            this.J.a(this.L);
            return this.J;
        }
        if (this.B) {
            this.f6188w = false;
            this.C = false;
        }
        if (this.f6188w) {
            this.J.m(this.f6189x.getValue());
            float f8 = this.f6190y;
            if (f8 > 0.0f) {
                this.J.f(f8);
            }
            if (this.S == PolylineOptions.LineBloomType.NONE) {
                this.J.k(this.f6191z.getValue());
                this.J.e(this.A);
            }
        }
        List<BitmapDescriptor> list3 = this.f6185t;
        if (list3 != null && !list3.isEmpty()) {
            this.M = new ArrayList();
            this.N = new ArrayList();
            this.f6186u = new ArrayList();
            int size2 = this.f6173h.size() - 1;
            this.f6175j = new ArrayList();
            int i9 = 0;
            while (true) {
                iArr = this.f6174i;
                if (i9 >= iArr.length) {
                    break;
                }
                this.f6175j.add(Integer.valueOf(iArr[i9]));
                i9++;
            }
            for (int length = iArr.length; length < size2; length++) {
                List<Integer> list4 = this.f6175j;
                int[] iArr4 = this.f6174i;
                list4.add(Integer.valueOf(iArr4[iArr4.length - 1]));
            }
            int intValue = this.f6175j.get(0).intValue();
            while (i8 < size2) {
                int i10 = i8;
                while (i10 < size2 && intValue == this.f6175j.get(i10).intValue()) {
                    i10++;
                }
                ArrayList arrayList2 = new ArrayList();
                while (i8 <= i10) {
                    arrayList2.add(arrayList.get(i8));
                    i8++;
                }
                BmGeoElement bmGeoElement2 = new BmGeoElement();
                BmLineStyle bmLineStyle2 = new BmLineStyle();
                bmLineStyle2.a(this.f6178m);
                BmBitmapResource bmBitmapResource = new BmBitmapResource(this.f6185t.get(intValue).getBitmap());
                this.f6186u.add(bmBitmapResource);
                bmLineStyle2.a(bmBitmapResource);
                bmGeoElement2.a(bmLineStyle2);
                bmGeoElement2.a(arrayList2);
                this.M.add(bmGeoElement2);
                this.J.a(bmGeoElement2);
                this.N.add(bmLineStyle2);
                if (i10 < size2) {
                    intValue = this.f6175j.get(i10).intValue();
                }
                i8 = i10;
            }
        } else if (this.f6176k != null) {
            this.f6177l = new ArrayList();
            int i11 = 0;
            while (true) {
                int[] iArr5 = this.f6176k;
                if (i11 >= iArr5.length) {
                    break;
                }
                this.f6177l.add(Integer.valueOf(iArr5[i11]));
                i11++;
            }
            for (int size3 = this.f6177l.size(); size3 < this.f6173h.size() - 1; size3++) {
                List<Integer> list5 = this.f6177l;
                list5.add(list5.get(list5.size() - 1));
            }
            ArrayList arrayList3 = new ArrayList();
            this.M = new ArrayList();
            this.N = new ArrayList();
            for (int i12 = 1; i12 < this.f6173h.size(); i12++) {
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(arrayList.get(i12 - 1));
                arrayList4.add(arrayList.get(i12));
                arrayList3.add(arrayList4);
            }
            while (i8 < arrayList3.size()) {
                BmGeoElement bmGeoElement3 = new BmGeoElement();
                BmLineStyle bmLineStyle3 = new BmLineStyle();
                bmLineStyle3.a(this.f6178m);
                if (this.f6179n) {
                    setDottedBitmapResource(bmLineStyle3, this.f6187v);
                    bmLineStyle3.c(5);
                }
                bmLineStyle3.a(this.f6177l.get(i8).intValue());
                bmGeoElement3.a(bmLineStyle3);
                bmGeoElement3.a((List<com.baidu.platform.comapi.bmsdk.b>) arrayList3.get(i8));
                this.M.add(bmGeoElement3);
                this.N.add(bmLineStyle3);
                this.J.a(bmGeoElement3);
                i8++;
            }
        } else {
            BmGeoElement bmGeoElement4 = new BmGeoElement(0);
            this.L = bmGeoElement4;
            bmGeoElement4.a(arrayList);
            BmLineStyle bmLineStyle4 = new BmLineStyle();
            this.K = bmLineStyle4;
            bmLineStyle4.a(this.f6178m);
            BitmapDescriptor bitmapDescriptor = this.f6183r;
            if (bitmapDescriptor != null) {
                BmBitmapResource bmBitmapResource2 = new BmBitmapResource(bitmapDescriptor.getBitmap());
                this.f6184s = bmBitmapResource2;
                this.K.a(bmBitmapResource2);
            } else {
                this.K.a(this.f6172g);
                if (this.f6179n) {
                    setDottedBitmapResource(this.K, this.f6187v);
                    this.K.c(5);
                }
            }
            this.L.a(this.K);
            this.J.a(this.L);
        }
        return this.J;
    }

    private static int a(PolylineOptions.LineJoinType lineJoinType) {
        int i8 = a.f6192a[lineJoinType.ordinal()];
        if (i8 == 1) {
            return 2048;
        }
        if (i8 != 2) {
            return i8 != 3 ? 2048 : 4096;
        }
        return 8192;
    }

    private static int a(PolylineOptions.LineCapType lineCapType) {
        int i8 = a.f6193b[lineCapType.ordinal()];
        if (i8 == 1) {
            return 2;
        }
        if (i8 != 2) {
            return i8 != 3 ? 2 : 8;
        }
        return 4;
    }

    @Override // com.baidu.mapapi.map.Overlay
    Bundle a(Bundle bundle) {
        super.a(bundle);
        List<LatLng> list = this.f6173h;
        if (list != null && list.size() >= 2) {
            GeoPoint ll2mc = CoordUtil.ll2mc(this.f6173h.get(0));
            bundle.putDouble("location_x", ll2mc.getLongitudeE6());
            bundle.putDouble("location_y", ll2mc.getLatitudeE6());
            bundle.putInt(x.KEY_WIDTH, (int) this.f6178m);
            bundle.putInt("isClickable", this.f6182q ? 1 : 0);
            bundle.putInt("lineBloomType", this.S.ordinal());
            bundle.putInt("lineBloomWidth", this.D);
            bundle.putInt("lineBloomAlpha", this.E);
            bundle.putFloat("lineBloomGradientASPeed", this.F);
            bundle.putInt("lineBloomBlurTimes", this.G);
            bundle.putInt("isHighPrecision", this.H ? 1 : 0);
            if (this.C) {
                return b(bundle);
            }
            if (this.B && this.f6173h.size() == 2) {
                this.f6173h = f.b(this.f6173h.get(0), this.f6173h.get(1));
            }
            a(this.f6173h, this.R, bundle);
            Overlay.d(this.f6172g, bundle);
            d(this.f6174i, bundle);
            a(this.f6176k, bundle);
            int[] iArr = this.f6174i;
            if (iArr != null && iArr.length > 0 && iArr.length > this.f6173h.size() - 1) {
                Log.e("baidumapsdk", "the size of textureIndexs is larger than the size of points");
            }
            bundle.putInt("dotline", this.f6179n ? 1 : 0);
            bundle.putInt("focus", this.f6180o ? 1 : 0);
            if (this.B) {
                this.f6188w = false;
                this.C = false;
            }
            bundle.putInt("isThined", this.f6188w ? 1 : 0);
            bundle.putInt("isGradient", this.C ? 1 : 0);
            bundle.putInt("lineJoinType", this.Q.ordinal());
            bundle.putInt("lineCapType", this.P.ordinal());
            bundle.putInt("lineDirectionCross180", this.R.ordinal());
            try {
                String str = "line_texture.png";
                if (this.f6183r != null) {
                    bundle.putInt(SchedulerSupport.CUSTOM, 1);
                    bundle.putBundle("image_info", a(false, (String) null));
                } else {
                    if (this.f6179n) {
                        bundle.putBundle("image_info", a(true, (String) null));
                        bundle.putInt("dotted_line_type", this.f6187v);
                    } else {
                        bundle.putBundle("image_info", a(true, "line_texture.png"));
                    }
                    bundle.putInt(SchedulerSupport.CUSTOM, 0);
                }
                if (this.f6185t != null) {
                    bundle.putInt("customlist", 1);
                    bundle.putBundle("image_info_list", b(false, (String) null));
                    bundle.putInt("dotline", 0);
                } else {
                    if (this.f6179n) {
                        str = null;
                    }
                    int[] iArr2 = this.f6176k;
                    if (iArr2 == null || iArr2.length <= 0) {
                        BitmapDescriptor bitmapDescriptor = this.f6183r;
                        if (bitmapDescriptor != null) {
                            bundle.putBundle("image_info", bitmapDescriptor.a());
                            bundle.putInt("dotline", 0);
                        } else {
                            bundle.putBundle("image_info", a(true, str));
                        }
                    } else {
                        bundle.putBundle("image_info_list", b(true, str));
                    }
                    bundle.putInt("customlist", 0);
                }
                bundle.putInt("keep", this.f6181p ? 1 : 0);
            } catch (Exception unused) {
                Log.e("baidumapsdk", "load texture resource failed!");
                bundle.putInt("dotline", 0);
            }
            return bundle;
        }
        throw new IllegalStateException("BDMapSDKException: when you add Polyline, you must at least supply 2 points");
    }

    public void setWidth(float f8) {
        if (f8 > 0.0f) {
            this.f6178m = (f8 * 310.0f) / SysOSUtil.getDensityDpi();
            if (OverlayUtil.isOverlayUpgrade()) {
                BmLineStyle bmLineStyle = this.K;
                if (bmLineStyle != null) {
                    bmLineStyle.a(this.f6178m);
                }
                List<BmLineStyle> list = this.N;
                if (list != null) {
                    Iterator<BmLineStyle> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().a(this.f6178m);
                    }
                }
                this.f6122f.b();
                return;
            }
            this.listener.d(this);
        }
    }

    private Bundle b(Bundle bundle) {
        int[] iArr = this.f6176k;
        if (iArr != null) {
            if (iArr.length != 0) {
                b(iArr, bundle);
                a(this.f6173h, this.R, bundle);
                int length = this.f6176k.length;
                int[] iArr2 = new int[length];
                for (int i8 = 0; i8 < length; i8++) {
                    iArr2[i8] = i8;
                }
                if (this.f6173h.size() == this.f6176k.length) {
                    iArr2[r2.length - 1] = r2.length - 2;
                }
                c(iArr2, bundle);
                return bundle;
            }
            throw new IllegalStateException("BDMapSDKException: colors array size can not be Equal to zero");
        }
        throw new IllegalStateException("BDMapSDKException: colors array can not be null");
    }

    private static void b(int[] iArr, Bundle bundle) {
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        bundle.putIntArray("color_array", iArr);
    }

    private Bundle a(boolean z7, String str) {
        if (z7) {
            int i8 = this.f6187v;
            String str2 = i8 == 1 ? "CircleDashTexture.png" : i8 == 2 ? "lineDash_Rectangle.png" : "lineDashTexture.png";
            if (str == null) {
                str = str2;
            }
            BitmapDescriptor fromAsset = BitmapDescriptorFactory.fromAsset(str);
            if (fromAsset != null) {
                return fromAsset.a();
            }
        }
        return this.f6183r.a();
    }

    private static void a(List<LatLng> list, PolylineOptions.LineDirectionCross180 lineDirectionCross180, Bundle bundle) {
        LatLng latLng;
        int size = list.size();
        double[] dArr = new double[size];
        double[] dArr2 = new double[size];
        for (int i8 = 0; i8 < size; i8++) {
            LatLng latLng2 = list.get(i8);
            if (lineDirectionCross180 == PolylineOptions.LineDirectionCross180.FROM_EAST_TO_WEST && latLng2.longitude < i.DOUBLE_EPSILON) {
                latLng = new LatLng(latLng2.latitude, latLng2.longitude + 360.0d);
            } else {
                if (lineDirectionCross180 == PolylineOptions.LineDirectionCross180.FROM_WEST_TO_EAST && latLng2.longitude > i.DOUBLE_EPSILON) {
                    latLng = new LatLng(latLng2.latitude, latLng2.longitude - 360.0d);
                }
                GeoPoint ll2mc = CoordUtil.ll2mc(latLng2);
                dArr[i8] = ll2mc.getLongitudeE6();
                dArr2[i8] = ll2mc.getLatitudeE6();
            }
            latLng2 = latLng;
            GeoPoint ll2mc2 = CoordUtil.ll2mc(latLng2);
            dArr[i8] = ll2mc2.getLongitudeE6();
            dArr2[i8] = ll2mc2.getLatitudeE6();
        }
        bundle.putDoubleArray("x_array", dArr);
        bundle.putDoubleArray("y_array", dArr2);
    }

    private static void a(List<LatLng> list, List<com.baidu.platform.comapi.bmsdk.b> list2, PolylineOptions.LineDirectionCross180 lineDirectionCross180) {
        LatLng latLng;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            LatLng latLng2 = list.get(i8);
            if (lineDirectionCross180 == PolylineOptions.LineDirectionCross180.FROM_EAST_TO_WEST && latLng2.longitude < i.DOUBLE_EPSILON) {
                latLng = new LatLng(latLng2.latitude, latLng2.longitude + 360.0d);
            } else {
                if (lineDirectionCross180 == PolylineOptions.LineDirectionCross180.FROM_WEST_TO_EAST && latLng2.longitude > i.DOUBLE_EPSILON) {
                    latLng = new LatLng(latLng2.latitude, latLng2.longitude - 360.0d);
                }
                GeoPoint ll2mc = CoordUtil.ll2mc(latLng2);
                list2.add(new com.baidu.platform.comapi.bmsdk.b(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6()));
            }
            latLng2 = latLng;
            GeoPoint ll2mc2 = CoordUtil.ll2mc(latLng2);
            list2.add(new com.baidu.platform.comapi.bmsdk.b(ll2mc2.getLongitudeE6(), ll2mc2.getLatitudeE6()));
        }
    }
}
