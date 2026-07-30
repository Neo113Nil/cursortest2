package com.baidu.platform.comapi.h.e;

import android.os.Bundle;
import android.text.TextUtils;
import cn.hutool.core.text.l;
import com.baidu.mapapi.map.MapLanguage;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.basestruct.Point;
import com.baidu.platform.comapi.h.h.c;
import com.baidu.platform.comapi.h.h.d;
import com.baidu.platform.comapi.h.n.i;
import com.baidu.platform.comapi.location.CoordinateUtil;
import com.baidu.platform.comapi.walknavi.b;
import com.baidu.platform.comapi.wnplatform.model.OverLookingMode;
import com.baidu.platform.comjni.bikenavi.JNIGuidanceControl;
import com.crrepa.b1.g;
import com.google.protobuf.micro.MessageMicro;
import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public class a extends com.baidu.platform.comapi.walknavi.a {

    /* renamed from: a, reason: collision with root package name */
    private JNIGuidanceControl f9047a;

    /* renamed from: b, reason: collision with root package name */
    private long f9048b;

    /* renamed from: c, reason: collision with root package name */
    private int f9049c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9050d;

    /* renamed from: e, reason: collision with root package name */
    int f9051e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9052f = false;

    /* renamed from: g, reason: collision with root package name */
    private String f9053g;

    /* renamed from: h, reason: collision with root package name */
    private String f9054h;

    /* renamed from: i, reason: collision with root package name */
    private Point f9055i;

    public a() {
        this.f9047a = null;
        this.f9048b = 0L;
        this.f9049c = 0;
        this.f9050d = false;
        long c8 = b.n().i().c();
        this.f9048b = c8;
        if (c8 != 0) {
            this.f9047a = new JNIGuidanceControl();
        }
        this.f9050d = false;
        this.f9049c = 0;
    }

    public boolean a(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr) {
        if (this.f9047a == null) {
            return false;
        }
        int length = iArr.length;
        this.f9051e = length;
        String[] strArr2 = new String[length];
        String[] strArr3 = new String[length];
        for (int i8 = 0; i8 < length; i8++) {
            strArr2[i8] = "";
        }
        for (int i9 = 0; i9 < length; i9++) {
            strArr3[i9] = "";
        }
        if (strArr != null && strArr.length > 0) {
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (strArr[i10] == null) {
                    strArr[i10] = "";
                }
            }
        }
        return this.f9047a.setNaviNodes(this.f9048b, iArr, iArr2, iArr3, iArr4, strArr2, strArr3, strArr, null);
    }

    public boolean b(int[] iArr, int[] iArr2, int[] iArr3) {
        if (this.f9047a == null) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("x", iArr);
        bundle.putIntArray("y", iArr2);
        bundle.putIntArray("serial", iArr3);
        return this.f9047a.getViaNaviNodes(this.f9048b, bundle);
    }

    public Point c() {
        return this.f9055i;
    }

    public com.baidu.platform.comapi.h.h.a d(int i8) {
        byte[] GetProtobufResult;
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl == null || (GetProtobufResult = jNIGuidanceControl.GetProtobufResult(this.f9048b, i8)) == null) {
            return null;
        }
        try {
            List<MessageMicro> a8 = d.a(GetProtobufResult);
            if (a8.size() >= 1) {
                return new c(0, 31, a8);
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    public byte[] e() {
        return null;
    }

    public Bundle f(int i8) {
        com.baidu.platform.comapi.h.g.a.c("WNaviGuidance.getRoutePlanResult", "" + i8);
        Bundle bundle = new Bundle();
        if (this.f9047a.getRouteResult(this.f9048b, i8, bundle)) {
            return bundle;
        }
        return null;
    }

    public String g() {
        return this.f9053g;
    }

    public String h() {
        return this.f9054h;
    }

    public boolean i(Bundle bundle) {
        com.baidu.platform.comapi.h.g.a.c("WNaviGuidance.getGPSMatchResult", "" + bundle.toString());
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            return jNIGuidanceControl.getGPSMatchResult(this.f9048b, bundle);
        }
        return false;
    }

    public int j() {
        return this.f9051e;
    }

    public boolean k(int i8) {
        com.baidu.platform.comapi.h.g.a.c("WNaviGuidance.setRotateMode", "" + i8);
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            return jNIGuidanceControl.setRotateMode(this.f9048b, i8);
        }
        return false;
    }

    public boolean l(Bundle bundle) {
        com.baidu.platform.comapi.h.g.a.c("WNaviGuidance.getRouteIDInfo", "" + bundle.toString());
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            return jNIGuidanceControl.getRouteIDInfo(this.f9048b, bundle);
        }
        return false;
    }

    public Bundle[] m() {
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl == null) {
            return null;
        }
        return jNIGuidanceControl.getRouteSegments(this.f9048b);
    }

    public GeoPoint n() {
        int i8;
        GeoPoint geoPoint = new GeoPoint(0, 0);
        int[] iArr = {0};
        int[] iArr2 = {0};
        if (!a(iArr, iArr2) || (i8 = iArr[0]) == 0 || iArr2[0] == 0) {
            return b.n().q().c();
        }
        geoPoint.setLongitudeE6(i8);
        geoPoint.setLatitudeE6(iArr2[0]);
        return geoPoint;
    }

    public Point o() {
        int i8;
        Point point = new Point(0, 0);
        int[] iArr = {0};
        int[] iArr2 = {0};
        if (b(iArr, iArr2) && (i8 = iArr[0]) != 0 && iArr2[0] != 0) {
            point.setIntX(i8);
            point.setIntY(iArr2[0]);
        }
        return point;
    }

    public boolean p() {
        return this.f9050d;
    }

    public int q() {
        return 0;
    }

    public boolean r() {
        com.baidu.platform.comapi.h.g.a.c("WNaviGuidance.isBrowseStatus", "");
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            return jNIGuidanceControl.isBrowseStatus(this.f9048b);
        }
        return false;
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public boolean ready() {
        return true;
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public void release() {
        c(true);
        this.f9047a = null;
        this.f9055i = null;
        this.f9049c = 0;
    }

    public boolean s() {
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            return jNIGuidanceControl.isEngineIndoorNaviDefine(this.f9048b);
        }
        return false;
    }

    public boolean t() {
        return this.f9052f;
    }

    public boolean u() {
        com.baidu.platform.comapi.h.g.a.c("WNaviGuidance.pauseRouteGuide", "");
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            return jNIGuidanceControl.pauseRouteGuide(this.f9048b);
        }
        return false;
    }

    public void v() {
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            jNIGuidanceControl.registerGetLaunchSystemTime(this.f9048b);
        }
    }

    public void w() {
        com.baidu.platform.comapi.h.g.a.c("WNaviGuidance.resumeReRouteCalcRoute", "");
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            jNIGuidanceControl.resumeReRouteCalcRoute(this.f9048b);
        }
    }

    public boolean x() {
        com.baidu.platform.comapi.h.g.a.c("WNaviGuidance.resumeRouteGuide", "");
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            return jNIGuidanceControl.resumeRouteGuide(this.f9048b);
        }
        return false;
    }

    public boolean y() {
        com.baidu.platform.comapi.h.g.a.c("WNaviGuidance.startRouteGuide", "");
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl == null) {
            return false;
        }
        this.f9050d = true;
        return jNIGuidanceControl.startRouteGuide(this.f9048b);
    }

    public boolean z() {
        com.baidu.platform.comapi.h.g.a.c("WNaviGuidance.stopRouteGuide", "");
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            return jNIGuidanceControl.stopRouteGuide(this.f9048b);
        }
        return false;
    }

    public void c(boolean z7) {
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            jNIGuidanceControl.setBrowseStatus(this.f9048b, z7);
        }
    }

    public Bundle e(int i8) {
        com.baidu.platform.comapi.h.g.a.c("WNaviGuidance.getParagraphBound", "");
        Bundle bundle = new Bundle();
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            jNIGuidanceControl.getParagraphBound(this.f9048b, i8, bundle);
        }
        return bundle;
    }

    public void g(Bundle bundle) {
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            jNIGuidanceControl.getTravelData(this.f9048b, bundle);
        }
    }

    public void h(int i8) {
        com.baidu.platform.comapi.h.g.a.c("WNaviGuidance.setGuideTextMaxWordCnt", "");
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            jNIGuidanceControl.setGuideTextMaxWordCnt(this.f9048b, i8);
        }
    }

    public void j(Bundle bundle) {
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            jNIGuidanceControl.getMatchRouteInfo(this.f9048b, bundle);
        }
    }

    public boolean m(Bundle bundle) {
        com.baidu.platform.comapi.h.g.a.c("WNaviGuidance.getSimpleGuideInfo", "" + bundle.toString());
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            return jNIGuidanceControl.getSimpleMapInfo(this.f9048b, bundle);
        }
        return false;
    }

    public void c(int i8) {
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            jNIGuidanceControl.setNaviType(this.f9048b, i8);
        }
    }

    public void g(int i8) {
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            jNIGuidanceControl.setGuidanceSpeed(this.f9048b, i8);
        }
    }

    public boolean i(int i8) {
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            return jNIGuidanceControl.setLocateMode(this.f9048b, i8);
        }
        return false;
    }

    public void j(int i8) {
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            jNIGuidanceControl.setNaviMode(this.f9048b, i8);
        }
    }

    public int k(Bundle bundle) {
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl == null) {
            return -1;
        }
        return jNIGuidanceControl.getRealTimeInfo(this.f9048b, bundle);
    }

    public com.baidu.platform.comapi.h.h.a l() {
        byte[] routeDataBuffer;
        com.baidu.platform.comapi.h.g.a.c("WNaviGuidance.getRouteDataBuffer()", "");
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl == null || (routeDataBuffer = jNIGuidanceControl.getRouteDataBuffer(this.f9048b)) == null) {
            return null;
        }
        try {
            List<MessageMicro> a8 = d.a(routeDataBuffer);
            if (a8.size() >= 1) {
                return new c(0, 31, a8);
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    public Bundle f() {
        com.baidu.platform.comapi.h.g.a.c("WNaviGuidance.getFirstParagraph", "");
        Bundle bundle = new Bundle();
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            jNIGuidanceControl.getFirstParagraph(this.f9048b, bundle);
        }
        return bundle;
    }

    public boolean h(Bundle bundle) {
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            return jNIGuidanceControl.getCurViaPoiPanoImage(this.f9048b, bundle);
        }
        return false;
    }

    public Bundle[] i() {
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl == null) {
            return null;
        }
        return jNIGuidanceControl.getLightInfos(this.f9048b);
    }

    public Bundle k() {
        com.baidu.platform.comapi.h.g.a.c("WNaviGuidance.getNaviRouteBoundWithNoMargin", "");
        Bundle bundle = new Bundle();
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl == null || !jNIGuidanceControl.getNaviRouteBoundWithNoMargin(this.f9048b, bundle)) {
            return null;
        }
        return bundle;
    }

    public int d() {
        com.baidu.platform.comapi.h.g.a.c("WNaviGuidance.getCurCorrectDirection", "");
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            return (int) jNIGuidanceControl.getCurCorrectDirection(this.f9048b);
        }
        return 0;
    }

    public void e(boolean z7) {
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            jNIGuidanceControl.setViewAllStatus(this.f9048b, z7);
        }
    }

    public boolean b(int[] iArr, int[] iArr2) {
        com.baidu.platform.comapi.h.g.a.c("WNaviGuidance.getShowPointMc", "" + iArr.toString() + l.SPACE + iArr2.toString());
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            return jNIGuidanceControl.getCarPointMC(this.f9048b, iArr, iArr2);
        }
        return false;
    }

    public boolean d(boolean z7) {
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            return jNIGuidanceControl.setShowLight(this.f9048b, z7);
        }
        return false;
    }

    public void f(boolean z7) {
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            jNIGuidanceControl.supportIndoorNavi(this.f9048b, z7);
        }
    }

    public boolean b(String str) {
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            return jNIGuidanceControl.setNetStatistics(this.f9048b, str);
        }
        return false;
    }

    public void l(int i8) {
        com.baidu.platform.comapi.h.g.a.c("WNaviGuidance.setRouteStepFocus", "");
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            jNIGuidanceControl.setParagraphFocus(this.f9048b, i8);
        }
    }

    public void b() {
        com.baidu.platform.comapi.h.g.a.c("WNaviGuidance.PrepareRouteGuide", "");
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            jNIGuidanceControl.prepareRouteGuide(this.f9048b);
        }
    }

    public boolean a(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr, String[] strArr2, String[] strArr3) {
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl == null) {
            return false;
        }
        this.f9051e = iArr.length;
        return jNIGuidanceControl.setNaviNodes(this.f9048b, iArr, iArr2, iArr3, iArr4, strArr, strArr2, strArr3, null);
    }

    public void b(boolean z7) {
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            jNIGuidanceControl.needShowPoiPanoImage(this.f9048b, z7);
        }
    }

    public boolean a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (this.f9047a == null) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("type", iArr3);
        bundle.putIntArray("x", iArr);
        bundle.putIntArray("y", iArr2);
        return this.f9047a.getTrafficFacilities(this.f9048b, bundle);
    }

    public int a(int i8, int i9, int i10, int i11, byte[] bArr, MapLanguage mapLanguage, String str) {
        com.baidu.platform.comapi.h.g.a.c("WNaviGuidance.calcRoute_rtBusData", "" + bArr);
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            return jNIGuidanceControl.calcRoute(this.f9048b, i8, i9, i10, i11, bArr, (mapLanguage == null ? MapLanguage.CHINESE : mapLanguage).ordinal(), str);
        }
        return 0;
    }

    public int a(String str) {
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            return jNIGuidanceControl.SearchRoutePlan(this.f9048b, str);
        }
        return 0;
    }

    public void a(double d8, double d9, double d10, double d11, double d12, double d13) {
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            jNIGuidanceControl.updateSensor(this.f9048b, d8, d9, d10, d11, d12, d13);
        }
    }

    public boolean a(int[] iArr, int[] iArr2) {
        com.baidu.platform.comapi.h.g.a.c("WNaviGuidance.getShowPoint", "" + iArr.toString() + l.SPACE + iArr2.toString());
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            return jNIGuidanceControl.getCarPoint(this.f9048b, iArr, iArr2);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(double d8, double d9, float f8, float f9, float f10, float f11, String str, String str2, int i8, int i9, int i10, int i11, String str3, int i12) {
        int i13;
        int i14;
        Point point;
        this.f9053g = str;
        if (this.f9047a == null) {
            return false;
        }
        int i15 = i10 == 1 ? 1 : 0;
        if (i11 != 61 && i11 == 161) {
            if (TextUtils.equals(g.f10873s, str3)) {
                i13 = 2;
            } else if (TextUtils.equals("ml", str3)) {
                i13 = 4;
            } else if (TextUtils.equals("cl", str3)) {
                i13 = 8;
            }
            boolean triggerGPSDataChange = this.f9047a.triggerGPSDataChange(this.f9048b, d8, d9, f8, f9, f10, f11, str, str2, i8, i9, i15, i13, i12, 0.0f);
            Bundle bundle = new Bundle();
            b.n().s().j(bundle);
            i14 = bundle.getInt("status");
            if (i14 != 4) {
                point = b.n().s().o();
            } else {
                point = new Point(bundle.getDouble("x"), bundle.getDouble("y"));
            }
            if (!(b.n().H() instanceof com.baidu.platform.comapi.walknavi.k.b)) {
                a(point, f10, i14);
            }
            return triggerGPSDataChange;
        }
        i13 = 1;
        boolean triggerGPSDataChange2 = this.f9047a.triggerGPSDataChange(this.f9048b, d8, d9, f8, f9, f10, f11, str, str2, i8, i9, i15, i13, i12, 0.0f);
        Bundle bundle2 = new Bundle();
        b.n().s().j(bundle2);
        i14 = bundle2.getInt("status");
        if (i14 != 4) {
        }
        if (!(b.n().H() instanceof com.baidu.platform.comapi.walknavi.k.b)) {
        }
        return triggerGPSDataChange2;
    }

    public boolean a(int i8, int i9, Bundle bundle) {
        com.baidu.platform.comapi.h.g.a.c("WNaviGuidance.getStepGuideText", "");
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            return jNIGuidanceControl.getGuideParagraph(this.f9048b, i8, i9, bundle);
        }
        return false;
    }

    public void a(int i8, int i9, int i10, String str, String str2) {
        com.baidu.platform.comapi.h.g.a.c("WNaviGuidance.setVehiclePos", l.SPACE + i8 + l.SPACE + i9 + l.SPACE + i10);
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            jNIGuidanceControl.setVehiclePos(this.f9048b, i8, i9, i10, str, str2);
        }
    }

    public boolean a(OverLookingMode overLookingMode) {
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            return jNIGuidanceControl.setOriNaviOverlooking(this.f9048b, overLookingMode.getValue());
        }
        return false;
    }

    public void a(String str, String str2) {
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            jNIGuidanceControl.showFloor(this.f9048b, str, str2);
        }
    }

    public void a(boolean z7) {
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            jNIGuidanceControl.showNPCModel(this.f9048b, z7);
        }
    }

    public void a(int i8, int i9) {
        JNIGuidanceControl jNIGuidanceControl = this.f9047a;
        if (jNIGuidanceControl != null) {
            jNIGuidanceControl.setARRouteResID(this.f9048b, i8, i9);
        }
    }

    private void a(Point point, float f8, int i8) {
        Point c8;
        if (point != null) {
            b.n().b("feedAr !!!" + point.getIntX() + b5.b.VERTICAL + point.getIntY() + "gpsacc:" + ((int) f8));
        }
        if (com.baidu.platform.comapi.h.a.a().b() == null) {
            return;
        }
        int i9 = this.f9049c;
        if (i9 < 3) {
            this.f9049c = i9 + 1;
            Point a8 = i.b().a();
            if (a8.getIntX() != 0 && a8.getIntY() != 0) {
                this.f9055i = a8;
                float[] fArr = {(float) a8.getDoubleX(), (float) a8.getDoubleY()};
                b.n().b("updateLocation !!!" + ((int) fArr[0]) + b5.b.VERTICAL + ((int) fArr[1]) + "first:");
                com.baidu.platform.comapi.h.a.a().b().updateLocation(fArr, 1, false);
                return;
            }
        }
        if (point != null && point.getIntX() != 0 && point.getIntY() != 0) {
            Point bd09mcTogcj02ll = CoordinateUtil.bd09mcTogcj02ll(point.getIntX(), point.getIntY());
            this.f9055i = bd09mcTogcj02ll;
            float[] fArr2 = {(float) bd09mcTogcj02ll.getDoubleX(), (float) this.f9055i.getDoubleY()};
            b.n().b("updateLocation !!!" + ((int) this.f9055i.getDoubleX()) + b5.b.VERTICAL + ((int) this.f9055i.getDoubleY()) + "onSetUp:" + com.baidu.platform.comapi.walknavi.widget.d.a.f10381a);
            com.baidu.platform.comapi.h.a.a().b().updateLocation(fArr2, 1, i8 == 4);
        }
        if (this.f9055i == null || (c8 = i.b().c()) == null) {
            return;
        }
        int a9 = (int) com.baidu.platform.comjni.tools.a.a(CoordinateUtil.gcj02Tobd09mc(this.f9055i.getDoubleX(), this.f9055i.getDoubleY()), c8);
        b.n().b("under enter:" + a9);
    }
}
