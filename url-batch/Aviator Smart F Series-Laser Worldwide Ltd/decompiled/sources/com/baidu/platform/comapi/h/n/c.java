package com.baidu.platform.comapi.h.n;

import com.baidu.entity.pb.WalkPlan;
import com.baidu.mapapi.bikenavi.adapter.IBRoutePlanListener;
import com.baidu.mapapi.bikenavi.adapter.IBTTSPlayer;
import com.baidu.mapapi.bikenavi.controllers.BNavigatorWrapper;
import com.baidu.mapapi.bikenavi.model.BikeRoutePlanError;
import com.baidu.mapapi.bikenavi.params.BikeNaviLaunchParam;
import com.baidu.mapapi.bikenavi.params.BikeRouteNodeInfo;
import com.baidu.mapapi.map.MapLanguage;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.navisdk.tts.BNTTS;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.wnplatform.model.datastruct.WLocData;
import com.baidu.platform.comapi.wnplatform.tts.BaseTTSPlayer;
import com.google.android.exoplayer2.C;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static c f9170a;

    /* renamed from: b, reason: collision with root package name */
    private static IBTTSPlayer f9171b;

    /* renamed from: c, reason: collision with root package name */
    private static com.baidu.platform.comapi.wnplatform.tts.b f9172c = new C0110c();

    /* renamed from: d, reason: collision with root package name */
    private f f9173d;

    class a implements com.baidu.platform.comapi.h.f.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ BikeNaviLaunchParam f9174a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ IBRoutePlanListener f9175b;

        a(BikeNaviLaunchParam bikeNaviLaunchParam, IBRoutePlanListener iBRoutePlanListener) {
            this.f9174a = bikeNaviLaunchParam;
            this.f9175b = iBRoutePlanListener;
        }

        @Override // com.baidu.platform.comapi.h.f.b
        public void a(WLocData wLocData) {
            LatLng a8 = com.baidu.platform.comapi.walknavi.b.n().q().a(wLocData);
            if (a8 == null) {
                return;
            }
            com.baidu.platform.comapi.walknavi.b.n().q().b(this);
            BikeRouteNodeInfo bikeRouteNodeInfo = new BikeRouteNodeInfo();
            bikeRouteNodeInfo.setLocation(a8);
            this.f9174a.startNodeInfo(bikeRouteNodeInfo);
            c.this.a(this.f9174a, this.f9175b);
        }
    }

    class b implements f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IBRoutePlanListener f9177a;

        b(IBRoutePlanListener iBRoutePlanListener) {
            this.f9177a = iBRoutePlanListener;
        }

        @Override // com.baidu.platform.comapi.h.n.f
        public void a() {
        }

        @Override // com.baidu.platform.comapi.h.n.f
        public void onRoutePlanStart() {
            this.f9177a.onRoutePlanStart();
        }

        @Override // com.baidu.platform.comapi.h.n.f
        public void onRoutePlanSuccess() {
            this.f9177a.onRoutePlanSuccess();
        }

        @Override // com.baidu.platform.comapi.h.n.f
        public void a(int i8) {
            switch (i8) {
                case -2147483641:
                    this.f9177a.onRoutePlanFail(BikeRoutePlanError.DISTANCE_TOO_CLOSE);
                    break;
                case -2147483640:
                    this.f9177a.onRoutePlanFail(BikeRoutePlanError.DISTANCE_MORE_THAN);
                    break;
                case 16777214:
                    this.f9177a.onRoutePlanFail(BikeRoutePlanError.FORWARD_AK_ERROR);
                    break;
                case 16777216:
                    this.f9177a.onRoutePlanFail(BikeRoutePlanError.SERVER_UNUSUAL);
                    break;
                case C.ENCODING_PCM_32BIT /* 805306368 */:
                    this.f9177a.onRoutePlanFail(BikeRoutePlanError.NET_ERR);
                    break;
                default:
                    this.f9177a.onRoutePlanFail(BikeRoutePlanError.PARSE_FAIL);
                    break;
            }
        }
    }

    /* renamed from: com.baidu.platform.comapi.h.n.c$c, reason: collision with other inner class name */
    static class C0110c implements com.baidu.platform.comapi.wnplatform.tts.b {
        C0110c() {
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
                com.baidu.platform.comapi.h.j.a j8 = com.baidu.platform.comapi.walknavi.b.n().j();
                if (j8 != null && j8.e() == MapLanguage.ENGLISH) {
                    return 0;
                }
                try {
                    return BaseTTSPlayer.a(str, z7);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            if (c.f9171b != null) {
                return c.f9171b.playTTSText(str, z7);
            }
            return 0;
        }
    }

    public static c c() {
        if (f9170a == null) {
            synchronized (c.class) {
                try {
                    if (f9170a == null) {
                        f9170a = new c();
                    }
                } finally {
                }
            }
        }
        return f9170a;
    }

    public static void d() {
        if (BNavigatorWrapper.getWNavigator().S()) {
            BNavigatorWrapper.getWNavigator().l0();
        }
    }

    public void b() {
        if (f9171b != null) {
            f9171b = null;
        }
        if (this.f9173d != null) {
            BNavigatorWrapper.getWNavigator().B().b(this.f9173d);
            this.f9173d = null;
        }
    }

    public void a(IBTTSPlayer iBTTSPlayer) {
        f9171b = iBTTSPlayer;
    }

    public void b(BikeNaviLaunchParam bikeNaviLaunchParam, IBRoutePlanListener iBRoutePlanListener) {
        com.baidu.platform.comapi.walknavi.b.n().q().a(new a(bikeNaviLaunchParam, iBRoutePlanListener));
    }

    public void a(BikeNaviLaunchParam bikeNaviLaunchParam, IBRoutePlanListener iBRoutePlanListener) {
        com.baidu.platform.comapi.wnplatform.model.e eVar = new com.baidu.platform.comapi.wnplatform.model.e();
        eVar.a(bikeNaviLaunchParam.getStartNodeInfo().getLocation());
        GeoPoint ll2mc = CoordUtil.ll2mc(bikeNaviLaunchParam.getStartNodeInfo().getLocation());
        com.baidu.platform.comapi.walknavi.b.n().b(bikeNaviLaunchParam.getStartNodeInfo().getLocation());
        com.baidu.platform.comapi.walknavi.b.n().a(eVar);
        GeoPoint ll2mc2 = CoordUtil.ll2mc(bikeNaviLaunchParam.getEndNodeInfo().getLocation());
        com.baidu.platform.comapi.walknavi.h.a create = BikeNaviLaunchParam.create();
        if (bikeNaviLaunchParam.getVehicle() == 1) {
            create.c(bikeNaviLaunchParam.getVehicle());
        }
        create.a(1);
        BNavigatorWrapper.getWNavigator().f(1);
        BNavigatorWrapper.getWNavigator().d(bikeNaviLaunchParam.getExtraNaviMode());
        com.baidu.platform.comapi.walknavi.b.n().a(bikeNaviLaunchParam.getEndNodeInfo().getLocation());
        create.a((int) ll2mc.getLongitudeE6(), (int) ll2mc.getLatitudeE6(), 131, bikeNaviLaunchParam.getStartNodeInfo().getUid());
        create.b(0);
        create.a(new int[]{(int) ll2mc2.getLongitudeE6()}, new int[]{(int) ll2mc2.getLatitudeE6()}, new int[]{131}, new String[]{bikeNaviLaunchParam.getEndNodeInfo().getUid()});
        create.d(bikeNaviLaunchParam.mRoadPrefer);
        b(create, iBRoutePlanListener);
    }

    public void b(com.baidu.platform.comapi.walknavi.h.a aVar, IBRoutePlanListener iBRoutePlanListener) {
        a(aVar, iBRoutePlanListener);
    }

    private boolean b(com.baidu.platform.comapi.walknavi.h.a aVar) {
        int i8 = aVar.getInt("vehicle", 0);
        if (i8 == 0) {
            BNavigatorWrapper.getWNavigator().a(1, 1);
        } else if (i8 == 1) {
            BNavigatorWrapper.getWNavigator().a(2, 1);
        }
        if (aVar.b("end_x") == null) {
            return false;
        }
        int length = aVar.b("end_x").length;
        int i9 = length + 1;
        int[] iArr = new int[i9];
        int[] iArr2 = new int[i9];
        int[] iArr3 = new int[i9];
        int[] iArr4 = new int[i9];
        String[] strArr = new String[i9];
        iArr[0] = aVar.getInt("start_x", 0);
        iArr2[0] = aVar.getInt("start_y", 0);
        iArr3[0] = aVar.getInt("start_cityid", 0);
        iArr4[0] = -1;
        strArr[0] = aVar.getString("start_uid", "");
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            iArr[i11] = aVar.b("end_x")[i10];
            i10 = i11;
        }
        int i12 = 0;
        while (i12 < length) {
            int i13 = i12 + 1;
            iArr2[i13] = aVar.b("end_y")[i12];
            i12 = i13;
        }
        int i14 = 0;
        while (i14 < length) {
            int i15 = i14 + 1;
            iArr3[i15] = aVar.b("end_cityid")[i14];
            i14 = i15;
        }
        int i16 = 0;
        while (i16 < length) {
            i16++;
            iArr4[i16] = i16;
        }
        String[] a8 = aVar.a("end_uid");
        if (a8 != null) {
            int i17 = 0;
            while (i17 < length) {
                int i18 = i17 + 1;
                strArr[i18] = a8[i17];
                i17 = i18;
            }
        }
        return BNavigatorWrapper.getWNavigator().B().a(iArr, iArr2, iArr3, iArr4, strArr);
    }

    private void a(com.baidu.platform.comapi.walknavi.h.a aVar, IBRoutePlanListener iBRoutePlanListener) {
        if (aVar == null) {
            return;
        }
        b(aVar);
        BNavigatorWrapper.getWNavigator().a(f9172c);
        if (this.f9173d == null) {
            this.f9173d = new b(iBRoutePlanListener);
        }
        BNavigatorWrapper.getWNavigator().B().a(this.f9173d);
        d();
        MapLanguage mapLanguage = MapLanguage.CHINESE;
        com.baidu.platform.comapi.h.j.a j8 = BNavigatorWrapper.getWNavigator().j();
        if (j8 != null) {
            mapLanguage = j8.e();
        }
        BNavigatorWrapper.getWNavigator().B().a(14, aVar.getInt("route_data_mode", 0), 0, aVar.getInt("vehicle", 0), aVar.c("route_buff"), mapLanguage, aVar.getString("road_prefer", "0"));
    }

    public com.baidu.platform.comapi.walknavi.h.a a(WalkPlan walkPlan, BikeNaviLaunchParam bikeNaviLaunchParam) {
        com.baidu.platform.comapi.walknavi.h.b create = BikeRouteNodeInfo.create();
        create.a(1);
        create.e(bikeNaviLaunchParam.getExtraNaviMode());
        create.d(1);
        create.c(bikeNaviLaunchParam.getVehicle());
        create.a(walkPlan.getOption().getStart().getSpt(0), walkPlan.getOption().getStart().getSpt(1), walkPlan.getOption().getStartCity().getCode(), walkPlan.getOption().getStart().getFloor(), walkPlan.getOption().getStart().getBuilding(), "");
        int size = walkPlan.getOption().getEndList().size();
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        String[] strArr3 = new String[size];
        for (int i8 = 0; i8 < walkPlan.getOption().getEndList().size(); i8++) {
            iArr[i8] = walkPlan.getOption().getEnd(i8).getSpt(0);
            iArr2[i8] = walkPlan.getOption().getEnd(i8).getSpt(1);
            iArr3[i8] = walkPlan.getOption().getEndCity(0).getCode();
            strArr[i8] = walkPlan.getOption().getEnd(i8).getFloor();
            strArr2[i8] = walkPlan.getOption().getEnd(i8).getBuilding();
            strArr3[i8] = walkPlan.getOption().getEnd(i8).getUid();
        }
        create.a(iArr, iArr2, iArr3, strArr, strArr2, strArr3);
        create.b(2);
        create.a(walkPlan.toByteArray());
        return create;
    }

    public boolean a(com.baidu.platform.comapi.walknavi.h.a aVar) {
        if (!b(aVar)) {
            return false;
        }
        BNavigatorWrapper.getWNavigator().a(f9172c);
        d();
        return true;
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
}
