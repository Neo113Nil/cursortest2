package com.baidu.mapapi.walknavi.model;

import android.app.Activity;
import android.view.View;
import com.baidu.mapapi.walknavi.WalkNavigateHelper;

/* loaded from: classes2.dex */
public class WalkLightNaviManager {

    /* renamed from: a, reason: collision with root package name */
    private com.baidu.mapapi.walknavi.controllers.b.a f7640a;

    /* renamed from: b, reason: collision with root package name */
    Activity f7641b;

    public WalkLightNaviManager(com.baidu.mapapi.walknavi.controllers.b.a aVar) {
        this.f7640a = aVar;
    }

    public void exitLightNavi(boolean z7) {
        if (z7) {
            return;
        }
        if (com.baidu.platform.comapi.walknavi.b.n().H() != null) {
            com.baidu.platform.comapi.walknavi.b.n().H().e();
        }
        if (this.f7640a != null && WalkNavigateHelper.getInstance().isInit()) {
            this.f7640a.o();
            this.f7640a.p();
        }
        com.baidu.platform.comapi.walknavi.b.n().c();
        com.baidu.platform.comapi.walknavi.b.n().Y();
        com.baidu.platform.comapi.walknavi.b.n().j0();
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.f7640a;
        if (aVar != null) {
            aVar.m();
            this.f7640a = null;
        }
        this.f7641b = null;
    }

    public View onCreate(Activity activity) {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.f7640a;
        if (aVar == null) {
            return null;
        }
        this.f7641b = activity;
        return aVar.b(activity);
    }

    public void pause() {
        com.baidu.platform.comapi.walknavi.b.n().W();
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.f7640a;
        if (aVar != null) {
            aVar.n();
        }
    }

    public void resume() {
        Activity activity = this.f7641b;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        com.baidu.platform.comapi.walknavi.b.n().c0();
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.f7640a;
        if (aVar != null) {
            aVar.q();
        }
    }

    public void switchLightToNormalWalkNavi() {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.f7640a;
        if (aVar != null) {
            aVar.d(true);
        }
        WalkNavigateHelper.getInstance().setIsSwitchNavi(true);
    }
}
