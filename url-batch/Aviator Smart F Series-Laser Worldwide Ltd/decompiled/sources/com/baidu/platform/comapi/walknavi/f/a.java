package com.baidu.platform.comapi.walknavi.f;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import com.baidu.platform.comapi.map.MapController;
import com.baidu.platform.comapi.map.MapTextureView;
import com.baidu.platform.comjni.map.basemap.AppBaseMap;

/* loaded from: classes2.dex */
public class a extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9939a = "com.baidu.platform.comapi.walknavi.f.a";

    /* renamed from: b, reason: collision with root package name */
    private Context f9940b;

    /* renamed from: c, reason: collision with root package name */
    b f9941c;

    /* renamed from: d, reason: collision with root package name */
    MapTextureView f9942d;

    public a(Context context) {
        super(context);
        this.f9941c = null;
        this.f9940b = context;
        a();
    }

    private void a() {
    }

    public void b() {
        MapController controller;
        MapTextureView mapTextureView = this.f9942d;
        if (mapTextureView == null || (controller = mapTextureView.getController()) == null) {
            return;
        }
        controller.onPause();
    }

    public void c() {
        MapController controller;
        MapTextureView mapTextureView = this.f9942d;
        if (mapTextureView == null || (controller = mapTextureView.getController()) == null) {
            return;
        }
        controller.onResume();
    }

    public MapTextureView getMapView() {
        return this.f9942d;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        AppBaseMap baseMap;
        super.onAttachedToWindow();
        try {
            b bVar = new b(this.f9940b);
            this.f9941c = bVar;
            MapTextureView a8 = bVar.a();
            this.f9942d = a8;
            a8.setFPS(15);
            MapController controller = this.f9942d.getController();
            if (this.f9942d == null || controller == null || (baseMap = controller.getBaseMap()) == null) {
                return;
            }
            com.baidu.platform.comapi.walknavi.b.n().a(baseMap.GetId());
            a(this.f9942d);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f9941c;
        if (bVar != null) {
            bVar.b();
        }
        com.baidu.platform.comapi.walknavi.b.n().i0();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void a(MapTextureView mapTextureView) {
        addView(mapTextureView, new FrameLayout.LayoutParams(-1, -1));
    }
}
