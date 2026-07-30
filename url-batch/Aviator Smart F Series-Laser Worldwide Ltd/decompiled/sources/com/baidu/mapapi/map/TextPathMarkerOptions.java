package com.baidu.mapapi.map;

import android.graphics.Typeface;
import com.baidu.mapapi.model.LatLng;
import java.util.List;

/* loaded from: classes2.dex */
public class TextPathMarkerOptions extends OverlayOptions {

    /* renamed from: a, reason: collision with root package name */
    private String f6324a;

    /* renamed from: b, reason: collision with root package name */
    private int f6325b;

    /* renamed from: c, reason: collision with root package name */
    private int f6326c;

    /* renamed from: d, reason: collision with root package name */
    private int f6327d;

    /* renamed from: e, reason: collision with root package name */
    private int f6328e;

    /* renamed from: f, reason: collision with root package name */
    private Typeface f6329f;

    /* renamed from: g, reason: collision with root package name */
    private List<LatLng> f6330g;

    /* renamed from: h, reason: collision with root package name */
    int f6331h;

    @Override // com.baidu.mapapi.map.OverlayOptions
    Overlay getOverlay() {
        TextPathMarker textPathMarker = new TextPathMarker();
        List<LatLng> list = this.f6330g;
        if (list == null || list.size() < 2) {
            throw new IllegalStateException("BDMapSDKException: when you add polyline, you must at least supply 2 points");
        }
        textPathMarker.f6314g = this.f6324a;
        textPathMarker.f6319l = this.f6326c;
        textPathMarker.f6318k = this.f6325b;
        textPathMarker.f6320m = this.f6327d;
        textPathMarker.f6321n = this.f6328e;
        textPathMarker.f6322o = this.f6329f;
        textPathMarker.f6323p = this.f6330g;
        textPathMarker.f6119c = this.f6331h;
        return textPathMarker;
    }

    public List<LatLng> getPoints() {
        return this.f6330g;
    }

    public String getText() {
        return this.f6324a;
    }

    public int getTextBorderColor() {
        return this.f6327d;
    }

    public int getTextBorderWidth() {
        return this.f6328e;
    }

    public int getTextColor() {
        return this.f6325b;
    }

    public Typeface getTextFontOption() {
        return this.f6329f;
    }

    public int getTextSize() {
        return this.f6326c;
    }

    public int getZIndex() {
        return this.f6331h;
    }

    public TextPathMarkerOptions points(List<LatLng> list) {
        this.f6330g = list;
        return this;
    }

    public TextPathMarkerOptions text(String str) {
        this.f6324a = str;
        return this;
    }

    public TextPathMarkerOptions textBorderColor(int i8) {
        this.f6327d = i8;
        return this;
    }

    public TextPathMarkerOptions textBorderWidth(int i8) {
        this.f6328e = i8;
        return this;
    }

    public TextPathMarkerOptions textColor(int i8) {
        this.f6325b = i8;
        return this;
    }

    public TextPathMarkerOptions textFontOption(Typeface typeface) {
        this.f6329f = typeface;
        return this;
    }

    public TextPathMarkerOptions textSize(int i8) {
        this.f6326c = i8;
        return this;
    }

    public TextPathMarkerOptions zIndex(int i8) {
        this.f6331h = i8;
        return this;
    }
}
