package com.baidu.mapapi.bikenavi.model;

import android.app.Activity;
import android.view.View;
import com.baidu.mapapi.bikenavi.BikeNavigateHelper;

/* loaded from: classes2.dex */
public class BikeLightNaviManager {

    /* renamed from: a, reason: collision with root package name */
    private com.baidu.mapapi.bikenavi.controllers.a.a f5399a;

    /* renamed from: b, reason: collision with root package name */
    Activity f5400b;

    public BikeLightNaviManager(com.baidu.mapapi.bikenavi.controllers.a.a aVar) {
        this.f5399a = aVar;
    }

    public void exitLightNavi(boolean z7) {
        if (z7) {
            return;
        }
        if (com.baidu.platform.comapi.walknavi.b.n().H() != null) {
            com.baidu.platform.comapi.walknavi.b.n().H().e();
        }
        com.baidu.platform.comapi.walknavi.b.n().c();
        com.baidu.platform.comapi.walknavi.b.n().Y();
        com.baidu.platform.comapi.walknavi.b.n().j0();
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5399a;
        if (aVar != null) {
            aVar.k();
            this.f5399a = null;
        }
        this.f5400b = null;
    }

    public View onCreate(Activity activity) {
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5399a;
        if (aVar == null) {
            return null;
        }
        this.f5400b = activity;
        return aVar.a(activity);
    }

    public void pause() {
        com.baidu.platform.comapi.walknavi.b.n().W();
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5399a;
        if (aVar != null) {
            aVar.l();
        }
    }

    public void resume() {
        Activity activity = this.f5400b;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        com.baidu.platform.comapi.walknavi.b.n().c0();
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5399a;
        if (aVar != null) {
            aVar.m();
        }
    }

    public void switchLightToNormalBikeNavi() {
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5399a;
        if (aVar != null) {
            aVar.d(true);
        }
        BikeNavigateHelper.getInstance().setIsSwitchNavi(true);
    }
}
