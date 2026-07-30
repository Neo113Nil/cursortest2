package com.baidu.platform.comapi.h.t;

import android.text.TextUtils;
import com.baidu.ar.marker.model.SegmentTypeCons;
import com.baidu.entity.pb.WalkPlan;
import com.baidu.mapapi.map.MapLanguage;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.platform.comapi.basestruct.Point;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static ArrayList<a> f9274a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f9275b = false;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public Point f9276a;

        /* renamed from: b, reason: collision with root package name */
        public String f9277b;

        /* renamed from: c, reason: collision with root package name */
        public int f9278c;

        /* renamed from: d, reason: collision with root package name */
        public int f9279d;

        /* renamed from: e, reason: collision with root package name */
        public String f9280e;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public String f9281a;

        /* renamed from: b, reason: collision with root package name */
        public String f9282b;

        /* renamed from: c, reason: collision with root package name */
        public int f9283c;

        /* renamed from: d, reason: collision with root package name */
        public String f9284d;

        /* renamed from: e, reason: collision with root package name */
        public ArrayList<Point> f9285e;
    }

    public static String a(WalkPlan walkPlan) {
        return (walkPlan == null || !walkPlan.hasOption() || walkPlan.getOption().getEndCount() <= 0 || walkPlan.getOption().getEnd(walkPlan.getOption().getEndCount() + (-1)) == null) ? "" : walkPlan.getOption().getEnd(walkPlan.getOption().getEndCount() - 1).getFloor();
    }

    private static void a(WalkPlan walkPlan, int i8) {
        if (walkPlan == null || i8 >= walkPlan.getRoutesCount()) {
            return;
        }
        boolean z7 = !walkPlan.getArGuideList().isEmpty();
        WalkPlan.Routes routes = walkPlan.getRoutes(i8);
        f9274a = new ArrayList<>();
        for (int i9 = 0; i9 < routes.getLegsCount(); i9++) {
            WalkPlan.Routes.Legs legs = routes.getLegs(i9);
            for (int i10 = 0; i10 < legs.getStepsCount(); i10++) {
                WalkPlan.Routes.Legs.Steps steps = legs.getSteps(i10);
                ArrayList<Point> arrayList = com.baidu.platform.comapi.basestruct.a.a(steps.getSpathList()).f8794d.get(0);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    a aVar = new a();
                    aVar.f9276a = arrayList.get(i11);
                    aVar.f9277b = a(i9, i10, i11);
                    aVar.f9280e = steps.getName();
                    if (!z7 && i11 == arrayList.size() - 1) {
                        aVar.f9278c = 2;
                        aVar.f9279d = steps.getDistance();
                    }
                    f9274a.add(aVar);
                }
            }
        }
        int size = f9274a.size();
        if (size > 0) {
            if (TextUtils.isEmpty(a(walkPlan))) {
                f9274a.get(size - 1).f9278c = 101;
            } else {
                f9274a.get(size - 1).f9278c = 102;
            }
        }
    }

    public static String a(int i8, int i9, int i10) {
        return i8 + "-" + i9 + "-" + i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList<b> a(WalkPlan walkPlan, int i8, MapLanguage mapLanguage) {
        WalkPlan.Routes routes;
        ArrayList<b> arrayList = new ArrayList<>();
        a(walkPlan, i8);
        f9275b = false;
        if (walkPlan != null && i8 < walkPlan.getRoutesCount()) {
            List<WalkPlan.ARGuide> arGuideList = walkPlan.getArGuideList();
            int i9 = 0;
            boolean z7 = false;
            for (int i10 = 0; i10 < arGuideList.size(); i10++) {
                WalkPlan.ARGuide aRGuide = arGuideList.get(i10);
                int legIdx = aRGuide.getLegIdx();
                if (i8 == aRGuide.getRouteIdx()) {
                    List<WalkPlan.ARGuide.GuideV1.BaseInfo> baseInfoList = aRGuide.getGuideV1().getBaseInfoList();
                    for (int i11 = 0; i11 < baseInfoList.size(); i11++) {
                        WalkPlan.ARGuide.GuideV1.BaseInfo baseInfo = baseInfoList.get(i11);
                        int stepIdx = baseInfo.getStepIdx();
                        int spIdx = baseInfo.getSpIdx();
                        int modelType = baseInfo.getModelType();
                        if (modelType == 14) {
                            if (i8 < walkPlan.getRoutesCount() && (routes = walkPlan.getRoutes(i8)) != null && legIdx < routes.getLegsCount()) {
                                WalkPlan.Routes.Legs legs = routes.getLegs(legIdx);
                                for (int i12 = i9; i12 <= stepIdx; i12++) {
                                    if (i12 < legs.getStepsCount() && legs.getSteps(i12).getDistance() > 100) {
                                        f9275b = true;
                                    }
                                }
                            }
                            z7 = false;
                        }
                        if (z7) {
                            modelType = 0;
                        }
                        if (modelType == 4) {
                            i9 = stepIdx;
                            z7 = true;
                        }
                        if (modelType > 0 && modelType <= 14 && stepIdx >= 0 && spIdx >= 0) {
                            a(a(legIdx, stepIdx, spIdx), modelType);
                        }
                    }
                }
            }
            int i13 = 0;
            for (int i14 = 0; i14 < f9274a.size(); i14++) {
                a aVar = f9274a.get(i14);
                if (aVar.f9278c > 0) {
                    b bVar = new b();
                    a(bVar, aVar.f9278c);
                    if (SegmentTypeCons.SEGMENT_KAKE_TURN.equals(bVar.f9282b)) {
                        int i15 = i14 + 1;
                        String str = i15 < f9274a.size() ? f9274a.get(i15).f9280e : "";
                        if (TextUtils.isEmpty(str)) {
                            bVar.f9281a = "无名路";
                            if (MapLanguage.ENGLISH == mapLanguage) {
                                bVar.f9281a = "Nameless Road";
                            }
                            bVar.f9285e = a(f9274a.subList(i13, i14 + 1));
                            if (!arGuideList.isEmpty()) {
                                bVar.f9283c = aVar.f9279d;
                            } else {
                                bVar.f9283c = a(bVar.f9285e);
                            }
                            arrayList.add(bVar);
                            i13 = i14;
                        } else {
                            bVar.f9281a = str;
                        }
                    }
                    bVar.f9285e = a(f9274a.subList(i13, i14 + 1));
                    if (!arGuideList.isEmpty()) {
                    }
                    arrayList.add(bVar);
                    i13 = i14;
                }
            }
        }
        return arrayList;
    }

    private static int a(ArrayList<Point> arrayList) {
        int i8 = 0;
        int i9 = 0;
        while (i8 < arrayList.size() && i8 != arrayList.size() - 1) {
            Point point = arrayList.get(i8);
            i8++;
            i9 += (int) CoordUtil.getDistance(point, arrayList.get(i8));
        }
        return i9;
    }

    private static ArrayList<Point> a(List<a> list) {
        ArrayList<Point> arrayList = new ArrayList<>();
        for (int i8 = 0; i8 < list.size(); i8++) {
            arrayList.add(list.get(i8).f9276a);
        }
        return arrayList;
    }

    private static void a(b bVar, int i8) {
        if (i8 == 1 || i8 == 2 || i8 == 7) {
            bVar.f9282b = SegmentTypeCons.SEGMENT_KAKE_TURN;
            return;
        }
        if (i8 == 3) {
            bVar.f9282b = SegmentTypeCons.SEGMENT_ENTER_FOOT_BRIDGE;
            return;
        }
        if (i8 == 4) {
            bVar.f9282b = SegmentTypeCons.SEGMENT_ENTER_TUNNEL;
            return;
        }
        if (i8 == 14) {
            bVar.f9282b = SegmentTypeCons.SEGMENT_OUT_TUNNEL;
            return;
        }
        if (i8 != 5 && i8 != 6 && i8 != 8 && i8 != 9 && i8 != 10 && i8 != 11 && i8 != 12 && i8 != 13) {
            if (i8 == 101) {
                bVar.f9282b = SegmentTypeCons.SEGMENT_TERMINAL;
                return;
            } else {
                if (i8 == 102) {
                    bVar.f9282b = SegmentTypeCons.SEGMENT_TERMINAL_GUIDE;
                    return;
                }
                return;
            }
        }
        bVar.f9282b = SegmentTypeCons.SEGMENT_GO_CROSS;
        if (i8 == 8) {
            bVar.f9284d = SegmentTypeCons.SEGMENT_DIRECTIONTYPE_TURN_LEFT;
            return;
        }
        if (i8 == 9) {
            bVar.f9284d = SegmentTypeCons.SEGMENT_DIRECTIONTYPE_TURN_RIGHT;
            return;
        }
        if (i8 == 10) {
            bVar.f9284d = SegmentTypeCons.SEGMENT_DIRECTIONTYPE_TURN_LEFT_FRONT;
            return;
        }
        if (i8 == 11) {
            bVar.f9284d = SegmentTypeCons.SEGMENT_DIRECTIONTYPE_TURN_LEFT_BACK;
            return;
        }
        if (i8 == 12) {
            bVar.f9284d = SegmentTypeCons.SEGMENT_DIRECTIONTYPE_TURN_RIGHT_FRONT;
        } else if (i8 == 13) {
            bVar.f9284d = SegmentTypeCons.SEGMENT_DIRECTIONTYPE_TURN_RIGHT_BACK;
        } else {
            bVar.f9284d = "";
        }
    }

    private static void a(String str, int i8) {
        for (int i9 = 0; i9 < f9274a.size(); i9++) {
            if (str.equals(f9274a.get(i9).f9277b)) {
                f9274a.get(i9).f9278c = i8;
                return;
            }
        }
    }
}
