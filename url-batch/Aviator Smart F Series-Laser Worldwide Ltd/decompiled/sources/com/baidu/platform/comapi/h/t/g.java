package com.baidu.platform.comapi.h.t;

import android.text.TextUtils;
import com.baidu.entity.pb.IndoorNavi;
import com.baidu.entity.pb.WalkPlan;
import com.baidu.mapapi.map.MapLanguage;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f9263a = {"m", "km", "米", "公里"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f9264b = {"min", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "分钟", "小时"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f9265c = {"min", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "day", "分钟", "小时", "天"};

    public enum a {
        EN(0),
        ZH(1);


        /* renamed from: d, reason: collision with root package name */
        private int f9269d;

        a(int i8) {
            this.f9269d = i8;
        }

        public int a() {
            return this.f9269d;
        }
    }

    public static void a(int i8, MapLanguage mapLanguage, StringBuffer stringBuffer) {
        a(i8, mapLanguage == MapLanguage.CHINESE ? a.ZH : a.EN, stringBuffer);
    }

    public static int b() {
        if (!c()) {
            return 0;
        }
        WalkPlan N = com.baidu.platform.comapi.walknavi.b.n().N();
        int a8 = a(N);
        if (N != null && N.hasOption() && N.getOption().hasStart()) {
            String floor = N.getOption().getStart().getFloor();
            String building = N.getOption().getStart().getBuilding();
            if (!TextUtils.isEmpty(floor) && !TextUtils.isEmpty(building) && (a8 == 2 || a8 == 3)) {
                return 1;
            }
        }
        return 2;
    }

    public static boolean c() {
        WalkPlan N = com.baidu.platform.comapi.walknavi.b.n().N();
        return (N == null || N.getIndoorNavisCount() == 0) ? false : true;
    }

    public static boolean d() {
        WalkPlan N = com.baidu.platform.comapi.walknavi.b.n().N();
        return (N == null || N.getRoutesCount() != 0 || N.getIndoorNavisCount() == 0) ? false : true;
    }

    public static boolean e() {
        int a8 = a();
        return a8 == 1 || a8 == 2 || a8 == 3;
    }

    public static void a(int i8, a aVar, StringBuffer stringBuffer) {
        int a8 = aVar.a();
        if (a8 != 0) {
            a8++;
        }
        if (i8 < 1000) {
            if (stringBuffer != null) {
                stringBuffer.append(String.format("%d%s", Integer.valueOf(i8), f9263a[a8]));
                return;
            }
            return;
        }
        String str = i8 % 1000 == 0 ? "%.0f%s" : "%.1f%s";
        if (stringBuffer != null) {
            int i9 = i8 / 1000;
            if (i9 >= 100) {
                stringBuffer.append(String.format("%d%s", Integer.valueOf(i9), f9263a[a8 + 1]));
            } else {
                stringBuffer.append(String.format(str, Double.valueOf(i8 / 1000.0d), f9263a[a8 + 1]));
            }
        }
    }

    public static String c(WalkPlan walkPlan) {
        String str = new String("");
        return (walkPlan == null || !walkPlan.hasOption() || walkPlan.getOption().getEndCount() <= 0 || walkPlan.getOption().getEnd(walkPlan.getOption().getEndCount() + (-1)) == null || !walkPlan.getOption().getEnd(walkPlan.getOption().getEndCount() + (-1)).hasFloor()) ? str : walkPlan.getOption().getEnd(walkPlan.getOption().getEndCount() - 1).getFloor();
    }

    public static void a(int i8, int i9, StringBuffer stringBuffer) {
        if (stringBuffer != null) {
            if (i8 < 60) {
                stringBuffer.append(i9 == 2 ? "少于1分钟" : "less than 1 minute");
                return;
            }
            int i10 = (i8 / 3600) % 24;
            int i11 = (i8 / 60) % 60;
            if (i8 < 3600) {
                stringBuffer.append(i11);
                stringBuffer.append(f9265c[i9 + 1]);
                return;
            }
            if (i8 < 86400) {
                stringBuffer.append(i10);
                stringBuffer.append(f9265c[i9 + 2]);
                if (i11 > 0) {
                    stringBuffer.append(i11);
                    stringBuffer.append(i9 == 2 ? "分" : "min");
                    return;
                }
                return;
            }
            stringBuffer.append(i8 / 86400);
            String[] strArr = f9265c;
            stringBuffer.append(strArr[i9 + 3]);
            if (i10 > 0) {
                stringBuffer.append(i10);
                stringBuffer.append(strArr[i9 + 2]);
            }
        }
    }

    public static List<com.baidu.platform.comapi.h.n.j.a> b(WalkPlan walkPlan) {
        if (walkPlan == null) {
            return null;
        }
        int routesCount = walkPlan.getRoutesCount();
        ArrayList arrayList = new ArrayList(routesCount);
        for (int i8 = 0; i8 < routesCount; i8++) {
            com.baidu.platform.comapi.h.n.j.a a8 = a(walkPlan, i8);
            if (a8 != null) {
                arrayList.add(a8);
            }
        }
        return arrayList;
    }

    private static WalkPlan.Routes b(WalkPlan walkPlan, int i8) {
        if (walkPlan == null) {
            return null;
        }
        int routesCount = walkPlan.getRoutesCount();
        if (i8 < 0 || i8 >= routesCount) {
            return null;
        }
        return walkPlan.getRoutes(i8);
    }

    public static String a(int i8, MapLanguage mapLanguage) {
        return a(i8, mapLanguage == MapLanguage.CHINESE ? 2 : -1);
    }

    public static String a(int i8, int i9) {
        StringBuffer stringBuffer = new StringBuffer();
        a(i8, i9, stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(WalkPlan walkPlan) {
        char c8;
        char c9;
        if (d()) {
            if (walkPlan.getIndoorNavisCount() != 0) {
                return 3;
            }
        } else {
            int A = com.baidu.platform.comapi.walknavi.b.n().A();
            WalkPlan.Routes routes = (walkPlan == null || walkPlan.getRoutesCount() <= 0 || A >= walkPlan.getRoutesCount()) ? null : walkPlan.getRoutes(A);
            if (routes != null) {
                c8 = 0;
                c9 = 0;
                for (int i8 = 0; i8 < routes.getLegsCount(); i8++) {
                    WalkPlan.Routes.Legs.LegLinked legLinked = routes.getLegs(i8).getLegLinked();
                    if (legLinked != null && legLinked.hasPrev()) {
                        if (c8 == 0) {
                            c8 = 1;
                        } else {
                            c9 = 1;
                        }
                    }
                    if (legLinked != null && legLinked.hasNext()) {
                        if (c8 == 0) {
                            c8 = 2;
                        } else {
                            c9 = 2;
                        }
                    }
                }
                if (c8 != 2) {
                    return c9 == 1 ? 4 : 1;
                }
                if (c8 == 1) {
                    return c9 == 2 ? 3 : 2;
                }
                return 0;
            }
        }
        c8 = 0;
        c9 = 0;
        if (c8 != 2) {
        }
    }

    public static com.baidu.platform.comapi.h.n.j.a a(WalkPlan walkPlan, int i8) {
        List<WalkPlan.Routes.Legs> legsList;
        WalkPlan.Routes b8 = b(walkPlan, i8);
        if (b8 == null || (legsList = b8.getLegsList()) == null) {
            return null;
        }
        WalkPlan.Routes.OtherInfo otherinfo = b8.getOtherinfo();
        int lightNum = (otherinfo == null || !otherinfo.hasLightNum()) ? 0 : otherinfo.getLightNum();
        ArrayList arrayList = new ArrayList();
        LatLng D = com.baidu.platform.comapi.walknavi.b.n().D();
        if (D != null) {
            arrayList.add(D);
        }
        Iterator<WalkPlan.Routes.Legs> it = legsList.iterator();
        int i9 = 0;
        int i10 = 0;
        while (it.hasNext()) {
            WalkPlan.Routes.Legs next = it.next();
            if (next.hasDuration()) {
                i9 += next.getDuration();
            }
            if (next.hasDistance()) {
                i10 += next.getDistance();
            }
            List<WalkPlan.Routes.Legs.Steps> stepsList = next.getStepsList();
            if (stepsList != null) {
                for (WalkPlan.Routes.Legs.Steps steps : stepsList) {
                    int spathCount = (steps.getSpathCount() - 5) >> 1;
                    double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
                    double d9 = 0.0d;
                    int i11 = 0;
                    while (i11 < spathCount) {
                        int i12 = i11 << 1;
                        d9 += steps.getSpath(i12 + 5);
                        d8 += steps.getSpath(i12 + 6);
                        arrayList.add(CoordUtil.mc2ll(new GeoPoint(d8, d9)));
                        i11++;
                        it = it;
                    }
                }
            }
            it = it;
        }
        LatLng h8 = com.baidu.platform.comapi.walknavi.b.n().h();
        if (h8 != null) {
            arrayList.add(h8);
        }
        com.baidu.platform.comapi.h.n.j.a aVar = new com.baidu.platform.comapi.h.n.j.a();
        aVar.a(i10);
        aVar.b(i9);
        aVar.d(i8);
        aVar.a(arrayList);
        aVar.c(lightNum);
        return aVar;
    }

    public static int a() {
        WalkPlan N = com.baidu.platform.comapi.walknavi.b.n().N();
        if (N == null || N.getIndoorNavisCount() == 0) {
            return -1;
        }
        List<IndoorNavi> indoorNavisList = N.getIndoorNavisList();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < indoorNavisList.size(); i11++) {
            IndoorNavi indoorNavi = indoorNavisList.get(i11);
            if (indoorNavi.getRoutesCount() != 0) {
                int locLevel = indoorNavi.getRoutes(0).getLocLevel();
                if (locLevel == 1) {
                    i8++;
                } else if (locLevel == 2) {
                    i9++;
                } else if (locLevel == 3) {
                    i10++;
                }
            }
        }
        return i9 + i10 == indoorNavisList.size() ? i10 == indoorNavisList.size() ? 3 : 2 : i8 == indoorNavisList.size() ? 1 : -1;
    }
}
