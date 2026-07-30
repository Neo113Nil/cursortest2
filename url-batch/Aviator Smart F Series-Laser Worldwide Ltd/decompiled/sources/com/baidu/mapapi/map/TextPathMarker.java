package com.baidu.mapapi.map;

import android.graphics.Typeface;
import android.os.Bundle;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.bmsdk.BmDrawItem;
import com.baidu.platform.comapi.bmsdk.BmGeoElement;
import com.baidu.platform.comapi.bmsdk.BmTextPathMarker;
import com.baidu.platform.comapi.bmsdk.style.BmTextStyle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class TextPathMarker extends Overlay {

    /* renamed from: g, reason: collision with root package name */
    String f6314g;

    /* renamed from: h, reason: collision with root package name */
    private BmTextStyle f6315h;

    /* renamed from: i, reason: collision with root package name */
    private BmGeoElement f6316i;

    /* renamed from: j, reason: collision with root package name */
    private BmTextPathMarker f6317j;

    /* renamed from: k, reason: collision with root package name */
    int f6318k;

    /* renamed from: l, reason: collision with root package name */
    int f6319l;

    /* renamed from: m, reason: collision with root package name */
    int f6320m;

    /* renamed from: n, reason: collision with root package name */
    int f6321n;

    /* renamed from: o, reason: collision with root package name */
    Typeface f6322o;

    /* renamed from: p, reason: collision with root package name */
    List<LatLng> f6323p;

    TextPathMarker() {
        this.type = com.baidu.mapsdkplatform.comapi.map.d.textPath;
    }

    @Override // com.baidu.mapapi.map.Overlay
    Bundle a(Bundle bundle) {
        bundle.putString("id", this.f6117a);
        bundle.putInt("type", this.type.ordinal());
        bundle.putInt("visibility", this.f6120d ? 1 : 0);
        bundle.putInt("z_index", this.f6119c);
        return null;
    }

    public List<LatLng> getPoints() {
        return this.f6323p;
    }

    public String getText() {
        return this.f6314g;
    }

    public int getTextBorderColor() {
        return this.f6320m;
    }

    public int getTextBorderWidth() {
        return this.f6321n;
    }

    public int getTextColor() {
        return this.f6318k;
    }

    public Typeface getTextFontOption() {
        return this.f6322o;
    }

    public int getTextSize() {
        return this.f6319l;
    }

    @Override // com.baidu.mapapi.map.Overlay
    public int getZIndex() {
        return this.f6119c;
    }

    public void setPoints(List<LatLng> list) {
        if (!OverlayUtil.isOverlayUpgrade() || list == null || list.size() < 2) {
            return;
        }
        this.f6323p = list;
        ArrayList arrayList = new ArrayList();
        for (int i8 = 1; i8 < list.size(); i8++) {
            GeoPoint ll2mc = CoordUtil.ll2mc(list.get(i8 - 1));
            GeoPoint ll2mc2 = CoordUtil.ll2mc(list.get(i8));
            com.baidu.platform.comapi.bmsdk.b bVar = new com.baidu.platform.comapi.bmsdk.b(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6());
            com.baidu.platform.comapi.bmsdk.b bVar2 = new com.baidu.platform.comapi.bmsdk.b(ll2mc2.getLongitudeE6(), ll2mc2.getLatitudeE6());
            arrayList.add(bVar);
            arrayList.add(bVar2);
        }
        this.f6316i.a(arrayList);
        this.f6122f.b();
    }

    public void setText(String str) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.f6314g = str;
            this.f6317j.a(str);
            this.f6122f.b();
        }
    }

    public void setTextBorderColor(int i8) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.f6320m = i8;
            this.f6315h.a(i8);
            this.f6122f.b();
        }
    }

    public void setTextBorderWidth(int i8) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.f6321n = i8;
            this.f6315h.b(i8);
            this.f6122f.b();
        }
    }

    public void setTextColor(int i8) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.f6318k = i8;
            this.f6315h.d(i8);
            this.f6122f.b();
        }
    }

    public void setTextFontOption(Typeface typeface) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.f6322o = typeface;
            this.f6315h.c(typeface.getStyle());
            this.f6122f.b();
        }
    }

    public void setTextSize(int i8) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.f6319l = i8;
            this.f6315h.e(i8);
            this.f6122f.b();
        }
    }

    public void setZIndex(short s7) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.f6119c = s7;
            this.f6317j.d(s7);
            this.f6122f.b();
        }
    }

    @Override // com.baidu.mapapi.map.Overlay
    BmDrawItem toDrawItem() {
        List<LatLng> list = this.f6323p;
        if (list == null || list.size() < 2) {
            return null;
        }
        if (this.f6317j == null) {
            this.f6317j = new BmTextPathMarker();
        }
        if (this.f6315h == null) {
            this.f6315h = new BmTextStyle();
        }
        if (this.f6316i == null) {
            this.f6316i = new BmGeoElement(0);
        }
        super.toDrawItem();
        setDrawItem(this.f6317j);
        this.f6317j.a(this.f6314g);
        this.f6317j.d(this.f6119c);
        this.f6315h.d(this.f6318k);
        this.f6315h.a(this.f6320m);
        this.f6315h.b(this.f6321n);
        Typeface typeface = this.f6322o;
        if (typeface != null) {
            this.f6315h.c(typeface.getStyle());
        } else {
            this.f6315h.c(Typeface.DEFAULT.getStyle());
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 1; i8 < this.f6323p.size(); i8++) {
            GeoPoint ll2mc = CoordUtil.ll2mc(this.f6323p.get(i8 - 1));
            GeoPoint ll2mc2 = CoordUtil.ll2mc(this.f6323p.get(i8));
            com.baidu.platform.comapi.bmsdk.b bVar = new com.baidu.platform.comapi.bmsdk.b(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6());
            com.baidu.platform.comapi.bmsdk.b bVar2 = new com.baidu.platform.comapi.bmsdk.b(ll2mc2.getLongitudeE6(), ll2mc2.getLatitudeE6());
            arrayList.add(bVar);
            arrayList.add(bVar2);
        }
        this.f6317j.a(this.f6315h);
        this.f6316i.a(arrayList);
        this.f6317j.a(this.f6316i);
        this.f6122f.b();
        return this.f6317j;
    }
}
