package com.baidu.platform.comapi.h.n;

import android.text.TextUtils;
import com.baidu.entity.pb.WalkPlan;
import com.baidu.mapapi.bikenavi.controllers.BNavigatorWrapper;
import com.baidu.mapapi.map.MapLanguage;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.walknavi.adapter.IWRoutePlanListener;
import com.baidu.mapapi.walknavi.adapter.IWTTSPlayer;
import com.baidu.mapapi.walknavi.controllers.WNavigatorWrapper;
import com.baidu.mapapi.walknavi.model.WalkRoutePlanError;
import com.baidu.mapapi.walknavi.params.WalkNaviLaunchParam;
import com.baidu.mapapi.walknavi.params.WalkRouteNodeInfo;
import com.baidu.navisdk.tts.BNTTS;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.wnplatform.model.datastruct.WLocData;
import com.baidu.platform.comapi.wnplatform.tts.BaseTTSPlayer;
import com.google.android.exoplayer2.C;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static g f9179a;

    /* renamed from: b, reason: collision with root package name */
    private static IWTTSPlayer f9180b;

    /* renamed from: c, reason: collision with root package name */
    private static com.baidu.platform.comapi.wnplatform.tts.b f9181c = new c();

    /* renamed from: d, reason: collision with root package name */
    private e f9182d;

    /* renamed from: e, reason: collision with root package name */
    private f f9183e;

    class a implements com.baidu.platform.comapi.h.f.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WalkNaviLaunchParam f9184a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ IWRoutePlanListener f9185b;

        a(WalkNaviLaunchParam walkNaviLaunchParam, IWRoutePlanListener iWRoutePlanListener) {
            this.f9184a = walkNaviLaunchParam;
            this.f9185b = iWRoutePlanListener;
        }

        @Override // com.baidu.platform.comapi.h.f.b
        public void a(WLocData wLocData) {
            LatLng a8 = com.baidu.platform.comapi.walknavi.b.n().q().a(wLocData);
            if (a8 == null) {
                return;
            }
            com.baidu.platform.comapi.walknavi.b.n().q().b(this);
            WalkRouteNodeInfo walkRouteNodeInfo = new WalkRouteNodeInfo();
            walkRouteNodeInfo.setLocation(a8);
            this.f9184a.startNodeInfo(walkRouteNodeInfo);
            g.this.a(this.f9184a, this.f9185b, true);
        }
    }

    class b implements f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IWRoutePlanListener f9187a;

        b(IWRoutePlanListener iWRoutePlanListener) {
            this.f9187a = iWRoutePlanListener;
        }

        @Override // com.baidu.platform.comapi.h.n.f
        public void a() {
        }

        @Override // com.baidu.platform.comapi.h.n.f
        public void onRoutePlanStart() {
            this.f9187a.onRoutePlanStart();
        }

        @Override // com.baidu.platform.comapi.h.n.f
        public void onRoutePlanSuccess() {
            this.f9187a.onRoutePlanSuccess();
        }

        @Override // com.baidu.platform.comapi.h.n.f
        public void a(int i8) {
            switch (i8) {
                case -2147483641:
                    this.f9187a.onRoutePlanFail(WalkRoutePlanError.DISTANCE_TOO_CLOSE);
                    break;
                case -2147483640:
                    this.f9187a.onRoutePlanFail(WalkRoutePlanError.DISTANCE_MORE_THAN);
                    break;
                case 16777214:
                    this.f9187a.onRoutePlanFail(WalkRoutePlanError.FORWARD_AK_ERROR);
                    break;
                case 16777216:
                    this.f9187a.onRoutePlanFail(WalkRoutePlanError.SERVER_UNUSUAL);
                    break;
                case C.ENCODING_PCM_32BIT /* 805306368 */:
                    this.f9187a.onRoutePlanFail(WalkRoutePlanError.NET_ERR);
                    break;
                default:
                    this.f9187a.onRoutePlanFail(WalkRoutePlanError.PARSE_FAIL);
                    break;
            }
        }
    }

    static class c implements com.baidu.platform.comapi.wnplatform.tts.b {
        c() {
        }

        @Override // com.baidu.platform.comapi.wnplatform.tts.b
        public void a() {
        }

        @Override // com.baidu.platform.comapi.wnplatform.tts.b
        public int b() {
            if (BaseTTSPlayer.f10534a) {
                return 1;
            }
            try {
                return BNTTS.getTTSState();
            } catch (Throwable th) {
                th.getMessage();
                return 1;
            }
        }

        @Override // com.baidu.platform.comapi.wnplatform.tts.b
        public void release() {
        }

        @Override // com.baidu.platform.comapi.wnplatform.tts.b
        public int a(String str, boolean z7) {
            if (!BaseTTSPlayer.f10534a) {
                com.baidu.platform.comapi.h.j.a j8 = WNavigatorWrapper.getWNavigator().j();
                if (j8 != null && j8.e() == MapLanguage.ENGLISH) {
                    return 0;
                }
                try {
                    return BaseTTSPlayer.a(str, z7);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            if (g.f9180b != null) {
                return g.f9180b.playTTSText(str, z7);
            }
            return 0;
        }
    }

    public static g c() {
        if (f9179a == null) {
            synchronized (g.class) {
                try {
                    if (f9179a == null) {
                        f9179a = new g();
                    }
                } finally {
                }
            }
        }
        return f9179a;
    }

    public static void d() {
        if (WNavigatorWrapper.getWNavigator().S()) {
            WNavigatorWrapper.getWNavigator().l0();
        }
    }

    public void b() {
        if (f9180b != null) {
            f9180b = null;
        }
        if (this.f9182d != null) {
            com.baidu.platform.comapi.walknavi.b.n().b(this.f9182d);
            this.f9182d = null;
        }
        if (this.f9183e != null) {
            WNavigatorWrapper.getWNavigator().B().b(this.f9183e);
            this.f9183e = null;
        }
    }

    public void a(IWTTSPlayer iWTTSPlayer) {
        f9180b = iWTTSPlayer;
    }

    private boolean b(com.baidu.platform.comapi.walknavi.h.c cVar) {
        if (cVar.b("end_x") == null) {
            return false;
        }
        int length = cVar.b("end_x").length;
        int i8 = length + 1;
        int[] iArr = new int[i8];
        int[] iArr2 = new int[i8];
        int[] iArr3 = new int[i8];
        int[] iArr4 = new int[i8];
        String[] strArr = new String[i8];
        String[] strArr2 = new String[i8];
        String[] strArr3 = new String[i8];
        iArr[0] = cVar.getInt("start_x", 0);
        iArr2[0] = cVar.getInt("start_y", 0);
        iArr3[0] = cVar.getInt("start_cityid", 0);
        strArr[0] = cVar.getString("start_floor", "");
        strArr2[0] = cVar.getString("start_building", "");
        iArr4[0] = -1;
        strArr3[0] = cVar.getString("start_uid", "");
        int i9 = 0;
        while (i9 < length) {
            int i10 = i9 + 1;
            iArr[i10] = cVar.b("end_x")[i9];
            i9 = i10;
        }
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 + 1;
            iArr2[i12] = cVar.b("end_y")[i11];
            i11 = i12;
        }
        int i13 = 0;
        while (i13 < length) {
            int i14 = i13 + 1;
            iArr3[i14] = cVar.b("end_cityid")[i13];
            i13 = i14;
        }
        int i15 = 0;
        while (i15 < length) {
            i15++;
            iArr4[i15] = -2;
        }
        int i16 = 0;
        while (i16 < length) {
            i16++;
            strArr[i16] = "";
        }
        int i17 = 0;
        while (i17 < length) {
            i17++;
            strArr2[i17] = "";
        }
        if (cVar.a("end_uid") != null) {
            for (int i18 = 0; i18 < length; i18++) {
                if (cVar.a("end_uid")[i18] == null) {
                    strArr3[i18 + 1] = "";
                } else {
                    strArr3[i18 + 1] = cVar.a("end_uid")[i18];
                }
            }
        } else {
            strArr3[1] = "";
        }
        String[] a8 = cVar.a("end_floor");
        String[] a9 = cVar.a("end_building");
        if (a8 != null && length == a8.length) {
            for (int i19 = 0; i19 < length; i19++) {
                if (!TextUtils.isEmpty(a8[i19])) {
                    strArr[i19 + 1] = a8[i19];
                } else {
                    strArr[i19 + 1] = "";
                }
            }
        }
        if (a9 != null && length == a9.length) {
            for (int i20 = 0; i20 < length; i20++) {
                if (!TextUtils.isEmpty(a9[i20])) {
                    strArr2[i20 + 1] = a9[i20];
                } else {
                    strArr2[i20 + 1] = "";
                }
            }
        }
        return WNavigatorWrapper.getWNavigator().B().a(iArr, iArr2, iArr3, iArr4, strArr, strArr2, strArr3);
    }

    public void a(WalkNaviLaunchParam walkNaviLaunchParam, IWRoutePlanListener iWRoutePlanListener, boolean z7) {
        LatLng startPt;
        LatLng endPt;
        if (z7) {
            startPt = walkNaviLaunchParam.getStartNodeInfo().getLocation();
            endPt = walkNaviLaunchParam.getEndNodeInfo().getLocation();
        } else {
            startPt = walkNaviLaunchParam.getStartPt();
            endPt = walkNaviLaunchParam.getEndPt();
        }
        GeoPoint ll2mc = CoordUtil.ll2mc(startPt);
        GeoPoint ll2mc2 = CoordUtil.ll2mc(endPt);
        com.baidu.platform.comapi.walknavi.h.c create = WalkNaviLaunchParam.create();
        create.a(1);
        create.d(1);
        create.c(0);
        WNavigatorWrapper.getWNavigator().f(1);
        WNavigatorWrapper.getWNavigator().d(walkNaviLaunchParam.getExtraNaviMode());
        com.baidu.platform.comapi.walknavi.b.n().b(startPt);
        com.baidu.platform.comapi.walknavi.b.n().a(endPt);
        String uid = walkNaviLaunchParam.getStartNodeInfo() != null ? walkNaviLaunchParam.getStartNodeInfo().getUid() : null;
        String uid2 = walkNaviLaunchParam.getEndNodeInfo() != null ? walkNaviLaunchParam.getEndNodeInfo().getUid() : null;
        create.a((int) ll2mc.getLongitudeE6(), (int) ll2mc.getLatitudeE6(), 131, uid);
        create.b(0);
        create.a(new int[]{(int) ll2mc2.getLongitudeE6()}, new int[]{(int) ll2mc2.getLatitudeE6()}, new int[]{131}, new String[]{uid2});
        a(create, iWRoutePlanListener);
    }

    public void a(WalkNaviLaunchParam walkNaviLaunchParam, IWRoutePlanListener iWRoutePlanListener) {
        com.baidu.platform.comapi.walknavi.b.n().q().a(new a(walkNaviLaunchParam, iWRoutePlanListener));
    }

    public void a(WalkPlan walkPlan) {
        LatLng mc2ll = CoordUtil.mc2ll(new GeoPoint(walkPlan.getOption().getStart().getSpt(1), walkPlan.getOption().getStart().getSpt(0)));
        com.baidu.platform.comapi.walknavi.b.n().b(mc2ll);
        int size = walkPlan.getOption().getEndList().size() - 1;
        com.baidu.platform.comapi.walknavi.b.n().a(CoordUtil.mc2ll(new GeoPoint(walkPlan.getOption().getEnd(size).getSpt(1), walkPlan.getOption().getEnd(size).getSpt(0))));
        String floor = walkPlan.getOption().getStart().getFloor();
        String building = walkPlan.getOption().getStart().getBuilding();
        com.baidu.platform.comapi.wnplatform.model.e eVar = new com.baidu.platform.comapi.wnplatform.model.e();
        eVar.a(mc2ll);
        eVar.a(building);
        eVar.b(floor);
        com.baidu.platform.comapi.walknavi.b.n().a(eVar);
        GeoPoint ll2mc = CoordUtil.ll2mc(mc2ll);
        com.baidu.platform.comapi.walknavi.b.n().s().a((int) ll2mc.getLongitudeE6(), (int) ll2mc.getLatitudeE6(), 0, building, floor);
    }

    public com.baidu.platform.comapi.walknavi.h.c a(WalkPlan walkPlan, WalkNaviLaunchParam walkNaviLaunchParam) {
        com.baidu.platform.comapi.walknavi.h.c create = WalkNaviLaunchParam.create();
        create.a(1);
        create.d(walkNaviLaunchParam.getExtraNaviMode());
        create.c(0);
        create.a(walkPlan.getOption().getStart().getSpt(0), walkPlan.getOption().getStart().getSpt(1), walkPlan.getOption().getStartCity().getCode(), walkPlan.getOption().getStart().getFloor(), walkPlan.getOption().getStart().getBuilding(), "");
        int size = walkPlan.getOption().getEndList().size();
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        for (int i8 = 0; i8 < walkPlan.getOption().getEndList().size(); i8++) {
            iArr[i8] = walkPlan.getOption().getEnd(i8).getSpt(0);
            iArr2[i8] = walkPlan.getOption().getEnd(i8).getSpt(1);
            iArr3[i8] = walkPlan.getOption().getEndCity(0).getCode();
            strArr[i8] = walkPlan.getOption().getEnd(i8).getFloor();
            strArr2[i8] = walkPlan.getOption().getEnd(i8).getBuilding();
        }
        create.a(iArr, iArr2, iArr3, strArr, strArr2, (String[]) null);
        create.b(2);
        create.a(walkPlan.toByteArray());
        return create;
    }

    public boolean a(com.baidu.platform.comapi.walknavi.h.c cVar) {
        if (!b(cVar)) {
            return false;
        }
        WNavigatorWrapper.getWNavigator().a(f9181c);
        d();
        return true;
    }

    private void a(com.baidu.platform.comapi.walknavi.h.c cVar, IWRoutePlanListener iWRoutePlanListener) {
        WNavigatorWrapper.getWNavigator().a(0, 0);
        if (!b(cVar)) {
            iWRoutePlanListener.onRoutePlanFail(WalkRoutePlanError.PARSE_FAIL);
        }
        WNavigatorWrapper.getWNavigator().a(f9181c);
        if (this.f9183e == null) {
            this.f9183e = new b(iWRoutePlanListener);
        }
        WNavigatorWrapper.getWNavigator().B().a(this.f9183e);
        d();
        MapLanguage mapLanguage = MapLanguage.CHINESE;
        com.baidu.platform.comapi.h.j.a j8 = BNavigatorWrapper.getWNavigator().j();
        if (j8 != null) {
            mapLanguage = j8.e();
        }
        WNavigatorWrapper.getWNavigator().B().a(13, cVar.getInt("route_data_mode", 0), 0, cVar.getInt("vehicle", 0), cVar.c("route_buff"), mapLanguage, cVar.getString("road_prefer", "0"));
    }
}
