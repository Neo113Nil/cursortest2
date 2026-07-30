package com.baidu.mapapi.walknavi.model;

import android.app.Activity;
import android.view.View;
import com.baidu.mapapi.walknavi.WalkNavigateHelper;

/* loaded from: classes2.dex */
public class WalkNormalNaviManager {

    /* renamed from: a, reason: collision with root package name */
    private com.baidu.mapapi.walknavi.controllers.b.a f7666a;

    /* renamed from: b, reason: collision with root package name */
    Activity f7667b;

    public WalkNormalNaviManager(com.baidu.mapapi.walknavi.controllers.b.a aVar) {
        this.f7666a = aVar;
    }

    public void exitNormalNavi(boolean z7) {
        if (z7) {
            com.baidu.mapapi.walknavi.controllers.b.a aVar = this.f7666a;
            if (aVar != null) {
                aVar.d(false);
            }
            WalkNavigateHelper.getInstance().setIsSwitchNavi(true);
            return;
        }
        if (com.baidu.platform.comapi.walknavi.b.n().H() != null) {
            com.baidu.platform.comapi.walknavi.b.n().H().e();
        }
        if (this.f7666a != null && WalkNavigateHelper.getInstance().isInit()) {
            this.f7666a.o();
            this.f7666a.p();
        }
        com.baidu.platform.comapi.walknavi.b.n().c();
        com.baidu.platform.comapi.walknavi.b.n().Y();
        com.baidu.platform.comapi.walknavi.b.n().j0();
        com.baidu.mapapi.walknavi.controllers.b.a aVar2 = this.f7666a;
        if (aVar2 != null) {
            aVar2.m();
            this.f7666a = null;
        }
        this.f7667b = null;
    }

    public View onCreate(Activity activity) {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.f7666a;
        if (aVar == null) {
            return null;
        }
        this.f7667b = activity;
        return aVar.b(activity);
    }

    public void pause() {
        com.baidu.platform.comapi.walknavi.b.n().W();
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.f7666a;
        if (aVar != null) {
            aVar.n();
        }
    }

    public void resume() {
        Activity activity = this.f7667b;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        com.baidu.platform.comapi.walknavi.b.n().c0();
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.f7666a;
        if (aVar != null) {
            aVar.q();
        }
    }
}
