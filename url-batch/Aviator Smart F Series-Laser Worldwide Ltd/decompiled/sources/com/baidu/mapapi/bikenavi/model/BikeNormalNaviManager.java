package com.baidu.mapapi.bikenavi.model;

import android.app.Activity;
import android.view.View;
import com.baidu.mapapi.bikenavi.BikeNavigateHelper;

/* loaded from: classes2.dex */
public class BikeNormalNaviManager {

    /* renamed from: a, reason: collision with root package name */
    private com.baidu.mapapi.bikenavi.controllers.a.a f5401a;

    /* renamed from: b, reason: collision with root package name */
    private Activity f5402b;

    public BikeNormalNaviManager(com.baidu.mapapi.bikenavi.controllers.a.a aVar) {
        this.f5401a = aVar;
    }

    public void exitNormalNavi(boolean z7) {
        if (z7) {
            com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5401a;
            if (aVar != null) {
                aVar.d(false);
            }
            BikeNavigateHelper.getInstance().setIsSwitchNavi(true);
            return;
        }
        if (com.baidu.platform.comapi.walknavi.b.n().H() != null) {
            com.baidu.platform.comapi.walknavi.b.n().H().e();
        }
        com.baidu.platform.comapi.walknavi.b.n().c();
        com.baidu.platform.comapi.walknavi.b.n().Y();
        com.baidu.platform.comapi.walknavi.b.n().j0();
        com.baidu.mapapi.bikenavi.controllers.a.a aVar2 = this.f5401a;
        if (aVar2 != null) {
            aVar2.k();
            this.f5401a = null;
        }
        this.f5402b = null;
    }

    public View onCreate(Activity activity) {
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5401a;
        if (aVar == null) {
            return null;
        }
        this.f5402b = activity;
        return aVar.a(activity);
    }

    public void pause() {
        com.baidu.platform.comapi.walknavi.b.n().W();
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5401a;
        if (aVar != null) {
            aVar.l();
        }
    }

    public void resume() {
        Activity activity = this.f5402b;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        com.baidu.platform.comapi.walknavi.b.n().c0();
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5401a;
        if (aVar != null) {
            aVar.m();
        }
    }
}
