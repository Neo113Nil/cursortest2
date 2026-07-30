package com.baidu.mapapi;

import com.baidu.mapsdkplatform.comapi.util.d;

/* loaded from: classes2.dex */
public class PermissionUtils {

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final PermissionUtils f5318a = new PermissionUtils();
    }

    public static PermissionUtils getInstance() {
        return b.f5318a;
    }

    public int getAdvancedPermission() {
        return d.b().a();
    }

    public boolean isBWNaviInfoAuthorized() {
        return d.b().c();
    }

    public boolean isBWNaviMultiMapAuthorized() {
        return d.b().d();
    }

    public boolean isBWNaviTrafficLightAuthorized() {
        return d.b().e();
    }

    public boolean isEnglishMapAuthorized() {
        return d.b().f();
    }

    public boolean isEnglishWalkBikeNaviAuthorized() {
        return d.b().g();
    }

    public boolean isIndoorNaviAuthorized() {
        return d.b().h();
    }

    public boolean isIntegralRoutePlanAuthorized() {
        return d.b().i();
    }

    public boolean isWalkARNaviAuthorized() {
        return d.b().j();
    }

    private PermissionUtils() {
    }
}
