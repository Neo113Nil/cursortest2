package com.baidu.mapapi.map;

import com.baidu.mapapi.model.LatLng;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class GradientLineOptions extends OverlayOptions {

    /* renamed from: a, reason: collision with root package name */
    private List<LatLng> f5798a;

    /* renamed from: b, reason: collision with root package name */
    private List<Integer> f5799b;

    /* renamed from: c, reason: collision with root package name */
    private List<Integer> f5800c;

    /* renamed from: d, reason: collision with root package name */
    private int f5801d = 5;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5802e = true;

    /* renamed from: f, reason: collision with root package name */
    private LineDirectionCross180 f5803f = LineDirectionCross180.NONE;

    public enum LineDirectionCross180 {
        NONE,
        FROM_EAST_TO_WEST,
        FROM_WEST_TO_EAST
    }

    public List<Integer> getColors() {
        return this.f5800c;
    }

    public List<Integer> getIndexs() {
        return this.f5799b;
    }

    public LineDirectionCross180 getLineDirectionCross180() {
        return this.f5803f;
    }

    @Override // com.baidu.mapapi.map.OverlayOptions
    Overlay getOverlay() {
        GradientLine gradientLine = new GradientLine();
        gradientLine.f5796j = this.f5801d;
        gradientLine.f6120d = this.f5802e;
        gradientLine.f5797k = this.f5803f;
        List<LatLng> list = this.f5798a;
        if (list == null || list.size() < 2) {
            throw new IllegalStateException("BDMapSDKException: when you add GradientLine, you must at least supply 2 points");
        }
        gradientLine.f5793g = this.f5798a;
        List<Integer> list2 = this.f5800c;
        if (list2 == null) {
            throw new IllegalStateException("BDMapSDKException: colors list can not be null");
        }
        if (list2.size() == 0) {
            throw new IllegalStateException("BDMapSDKException: colors list size can not be Equal to zero");
        }
        int[] iArr = new int[this.f5800c.size()];
        Iterator<Integer> it = this.f5800c.iterator();
        int i8 = 0;
        int i9 = 0;
        while (it.hasNext()) {
            iArr[i9] = it.next().intValue();
            i9++;
        }
        gradientLine.f5795i = iArr;
        List<Integer> list3 = this.f5799b;
        if (list3 == null) {
            throw new IllegalStateException("BDMapSDKException: Indexs list can not be null");
        }
        if (list3.size() == 0) {
            throw new IllegalStateException("BDMapSDKException: Indexs list size can not be Equal to zero");
        }
        int[] iArr2 = new int[this.f5799b.size()];
        Iterator<Integer> it2 = this.f5799b.iterator();
        while (it2.hasNext()) {
            iArr2[i8] = it2.next().intValue();
            i8++;
        }
        gradientLine.f5794h = iArr2;
        return gradientLine;
    }

    public List<LatLng> getPoints() {
        return this.f5798a;
    }

    public int getWidth() {
        return this.f5801d;
    }

    public boolean isVisible() {
        return this.f5802e;
    }

    public GradientLineOptions setColorIndex(List<Integer> list) {
        if (list == null) {
            throw new IllegalArgumentException("BDMapSDKException: indexs list can not be null");
        }
        if (list.contains(null)) {
            throw new IllegalArgumentException("BDMapSDKException: indexs list can not contains null");
        }
        if (list.size() == 0) {
            throw new IllegalStateException("BDMapSDKException: indexs list size can not be Equal to zero");
        }
        this.f5799b = list;
        return this;
    }

    public GradientLineOptions setColorsValues(List<Integer> list) {
        if (list == null) {
            throw new IllegalArgumentException("BDMapSDKException: colors list can not be null");
        }
        if (list.contains(null)) {
            throw new IllegalArgumentException("BDMapSDKException: colors list can not contains null");
        }
        if (list.size() == 0) {
            throw new IllegalStateException("BDMapSDKException: colors list list size can not be Equal to zero");
        }
        this.f5800c = list;
        return this;
    }

    public GradientLineOptions setLineDirectionCross180(LineDirectionCross180 lineDirectionCross180) {
        this.f5803f = lineDirectionCross180;
        return this;
    }

    public GradientLineOptions setPoints(List<LatLng> list) {
        if (list == null) {
            throw new IllegalArgumentException("BDMapSDKException: points list can not be null");
        }
        if (list.size() < 2) {
            throw new IllegalArgumentException("BDMapSDKException: points count can not less than 2");
        }
        if (list.contains(null)) {
            throw new IllegalArgumentException("BDMapSDKException: points list can not contains null");
        }
        this.f5798a = list;
        return this;
    }

    public GradientLineOptions setWidth(int i8) {
        if (i8 > 0) {
            this.f5801d = i8;
        }
        return this;
    }

    public GradientLineOptions visible(boolean z7) {
        this.f5802e = z7;
        return this;
    }
}
