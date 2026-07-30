package com.baidu.platform.comapi.walknavi.i;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.inner.MapBound;
import com.baidu.mapapi.walknavi.model.RouteGuideKind;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.h.m.d;
import com.baidu.platform.comapi.walknavi.segmentbrowse.widget.e;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static int f10100a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static int f10101b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f10102c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static int f10103d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static int f10104e = 99999;

    /* renamed from: f, reason: collision with root package name */
    public static b f10105f = b.FIRST_GUIDANCE;

    /* renamed from: g, reason: collision with root package name */
    private static HashMap<Integer, a> f10106g = new HashMap<>();

    public static void a(b bVar) {
        f10105f = bVar;
    }

    public static double b() {
        return 0.7d;
    }

    public static void c(int i8) {
        f10100a = i8;
        g(i8);
        p();
        j();
    }

    public static void d(int i8) {
        if (f10104e != 99999 || i8 == -1) {
            return;
        }
        f10104e = i8;
    }

    public static double e() {
        if (f10106g.get(Integer.valueOf(f10100a)) == null || f10106g.get(Integer.valueOf(f10100a)).g() < 0) {
            return -1.0d;
        }
        return b(f10106g.get(Integer.valueOf(f10100a)).g());
    }

    public static void f(int i8) {
        f10102c = i8;
    }

    public static int g() {
        return f10100a;
    }

    public static int h() {
        return f10104e;
    }

    public static int i() {
        if (k() == -1.0d) {
            return -1;
        }
        return (int) (k() * f10101b);
    }

    public static a j() {
        return a(f10100a, -1);
    }

    public static double k() {
        a a8 = a(f10100a, -1);
        if (a8 == null || a8.g() < 0) {
            return -1.0d;
        }
        return b(a8.g());
    }

    public static int l() {
        if (m() == -1.0d) {
            return -1;
        }
        return (int) (m() * f10101b);
    }

    public static double m() {
        a a8 = a(f10100a, -2);
        if (a8 == null || a8.g() < 0) {
            return -1.0d;
        }
        return b(a8.g());
    }

    public static int n() {
        return f10100a - 1;
    }

    public static int o() {
        if (q() == -1.0d) {
            return -1;
        }
        return (int) (q() * f10101b);
    }

    public static a p() {
        return a(f10100a, 1);
    }

    public static double q() {
        a a8 = a(f10100a, 1);
        if (a8 == null || a8.g() < 0) {
            return -1.0d;
        }
        return b(a8.g());
    }

    public static int r() {
        return f10100a + 1;
    }

    public static int s() {
        return f10102c;
    }

    public static b t() {
        return f10105f;
    }

    public static int u() {
        return f10103d;
    }

    public static void a(a aVar) {
        HashMap<Integer, a> hashMap = f10106g;
        if (hashMap != null) {
            hashMap.put(Integer.valueOf(g()), aVar);
        }
        p();
        j();
    }

    public static double b(int i8) {
        if (i8 <= 30 && i8 > 0) {
            return 1.0d;
        }
        if (i8 > 150 || i8 <= 30) {
            return i8 > 150 ? 2.0d : -1.0d;
        }
        return 1.5d;
    }

    public static a d() {
        return f10106g.get(Integer.valueOf(f10100a));
    }

    public static int f() {
        a d8 = d();
        if (d8 == null || d8.g() < 0) {
            return -1;
        }
        double g8 = d8.g();
        return c() - ((int) ((((g8 - s()) / g8) * (e() - b())) * f10101b));
    }

    public static void g(int i8) {
        if (f10103d != -1 || i8 == -1) {
            return;
        }
        f10103d = i8;
    }

    public static void e(int i8) {
        int d8 = com.baidu.platform.comapi.h.t.q.b.b().d();
        int c8 = com.baidu.platform.comapi.h.t.q.b.b().c();
        int m8 = com.baidu.platform.comapi.walknavi.b.n().H().m();
        MapBound b8 = com.baidu.platform.comapi.walknavi.b.n().b(i8);
        MapStatus d9 = com.baidu.platform.comapi.walknavi.b.n().t().d();
        if (d9 != null) {
            MapStatus.Builder builder = new MapStatus.Builder(d9);
            builder.rotate(0.0f);
            builder.overlook(0.0f);
            if (b8 != null) {
                float a8 = com.baidu.platform.comapi.walknavi.b.n().t().a(b8, d8, c8 - (m8 * 2));
                builder.target(CoordUtil.mc2ll(new GeoPoint((b8.getPtLB().getIntY() + b8.getPtRT().getIntY()) / 2, (b8.getPtLB().getIntX() + b8.getPtRT().getIntX()) / 2)));
                builder.zoom(a8);
                com.baidu.platform.comapi.h.g.a.b("setMapHighLightByUid: height:" + c8);
                com.baidu.platform.comapi.h.g.a.b("setMapHighLightByUid: topUIHeight:" + m8);
                com.baidu.platform.comapi.h.g.a.b("setMapHighLightByUid: width:" + d8);
                com.baidu.platform.comapi.h.g.a.b("setMapHighLightByUid: level:" + a8);
            }
            com.baidu.platform.comapi.walknavi.b.n().t().a(builder.build(), 500);
        }
        com.baidu.platform.comapi.walknavi.b.n().s().l(i8);
    }

    public static int c() {
        if (e() == -1.0d) {
            return -1;
        }
        return (int) (e() * f10101b);
    }

    public static int a(Context context) {
        Paint paint = new Paint();
        paint.setTextSize(com.baidu.platform.comapi.walknavi.segmentbrowse.widget.b.a(context, 17.0f));
        int measureText = (int) paint.measureText("任");
        double d8 = (f10101b * 0.7d) / measureText;
        com.baidu.platform.comapi.h.g.a.a("yang11", "singleCharwidth:" + measureText);
        com.baidu.platform.comapi.h.g.a.a("yang11", "num:" + d8);
        return (int) d8;
    }

    public static a a(int i8) {
        HashMap<Integer, a> hashMap = f10106g;
        if (hashMap == null || hashMap.size() < 1 || !f10106g.containsKey(Integer.valueOf(i8))) {
            return null;
        }
        com.baidu.platform.comapi.h.g.a.c("route hashmap", f10106g.toString());
        return f10106g.get(Integer.valueOf(i8));
    }

    public static a a(int i8, int i9) {
        HashMap<Integer, a> hashMap = f10106g;
        if (hashMap != null) {
            int i10 = i8 + i9;
            if (hashMap.containsKey(Integer.valueOf(i10))) {
                return f10106g.get(Integer.valueOf(i10));
            }
        }
        a aVar = new a();
        Bundle bundle = new Bundle();
        com.baidu.platform.comapi.h.g.a.c("uid******offset", "uid**" + i8 + TypedValues.CycleType.S_WAVE_OFFSET + i9);
        com.baidu.platform.comapi.walknavi.b.n().s().a(i8, i9, bundle);
        if (!bundle.containsKey("uid")) {
            return null;
        }
        aVar.f(bundle.getInt("uid"));
        aVar.c(e.a(bundle, "seg"));
        aVar.c(bundle.getString("usGuideText"));
        if (bundle.containsKey("floor")) {
            aVar.b(bundle.getString("floor"));
        }
        if (bundle.containsKey("building")) {
            aVar.a(bundle.getString("building"));
        }
        aVar.a(e.a(bundle, false));
        aVar.b(e.a(bundle));
        int i11 = bundle.getInt("nParagraphLength");
        if (bundle.containsKey("maneuverKind")) {
            String b8 = d.b(RouteGuideKind.values()[bundle.getInt("maneuverKind")]);
            if ((i11 == 0 && b8.equals("wn_dest.png")) || (i11 != 1 && b8.equals("wn_indoor_bianjie.png"))) {
                aVar.e(20);
                d(bundle.getInt("uid"));
            } else {
                aVar.e(i11);
            }
            aVar.d(b8);
        }
        com.baidu.platform.comapi.h.g.a.c("getRouteMessageModelByUid", "wroutemessagemodel" + aVar.toString());
        f10106g.put(Integer.valueOf(i8 + i9), aVar);
        return aVar;
    }

    public static void a() {
        f10100a = -1;
        f10103d = -1;
        f10104e = 99999;
        f10105f = b.FIRST_GUIDANCE;
        f10102c = -1;
        HashMap<Integer, a> hashMap = f10106g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
