package com.baidu.mapapi.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.common.AppTools;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.navi.NaviParaOption;
import com.baidu.mapapi.navi.TruckNaviOption;
import com.baidu.mapapi.utils.poi.DispathcPoiData;
import com.baidu.mapapi.utils.poi.PoiParaOption;
import com.baidu.mapapi.utils.route.RouteParaOption;
import com.baidu.mapframework.open.aidl.IComOpenClient;
import com.baidu.mapframework.open.aidl.a;
import com.baidu.mapframework.open.aidl.b;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.github.mikephil.charting.utils.i;
import com.google.android.exoplayer2.C;
import com.google.android.gms.fitness.FitnessActivities;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {
    private static double A = 0.0d;
    private static double B = 0.0d;
    private static double C = 0.0d;
    private static double D = 0.0d;
    private static double E = 0.0d;
    private static int F = 0;
    private static boolean G = false;
    private static String H = null;
    private static int I = 0;
    private static int J = 0;
    private static int K = 0;
    private static int L = 0;
    private static int M = 0;

    /* renamed from: a, reason: collision with root package name */
    private static final String f7521a = "com.baidu.mapapi.utils.a";

    /* renamed from: b, reason: collision with root package name */
    private static com.baidu.mapframework.open.aidl.a f7522b = null;

    /* renamed from: c, reason: collision with root package name */
    private static IComOpenClient f7523c = null;

    /* renamed from: d, reason: collision with root package name */
    public static int f7524d = -1;

    /* renamed from: e, reason: collision with root package name */
    private static int f7525e;

    /* renamed from: f, reason: collision with root package name */
    private static String f7526f;

    /* renamed from: g, reason: collision with root package name */
    private static String f7527g;

    /* renamed from: h, reason: collision with root package name */
    private static String f7528h;

    /* renamed from: q, reason: collision with root package name */
    private static String f7537q;

    /* renamed from: r, reason: collision with root package name */
    private static RouteParaOption.EBusStrategyType f7538r;

    /* renamed from: y, reason: collision with root package name */
    private static Thread f7545y;

    /* renamed from: z, reason: collision with root package name */
    private static int f7546z;

    /* renamed from: i, reason: collision with root package name */
    private static List<DispathcPoiData> f7529i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private static LatLng f7530j = null;

    /* renamed from: k, reason: collision with root package name */
    private static LatLng f7531k = null;

    /* renamed from: l, reason: collision with root package name */
    private static String f7532l = null;

    /* renamed from: m, reason: collision with root package name */
    private static String f7533m = null;

    /* renamed from: n, reason: collision with root package name */
    private static String f7534n = null;

    /* renamed from: o, reason: collision with root package name */
    private static String f7535o = null;

    /* renamed from: p, reason: collision with root package name */
    private static String f7536p = null;

    /* renamed from: s, reason: collision with root package name */
    private static String f7539s = null;

    /* renamed from: t, reason: collision with root package name */
    private static String f7540t = null;

    /* renamed from: u, reason: collision with root package name */
    private static LatLng f7541u = null;

    /* renamed from: v, reason: collision with root package name */
    private static int f7542v = 0;

    /* renamed from: w, reason: collision with root package name */
    private static boolean f7543w = false;

    /* renamed from: x, reason: collision with root package name */
    private static boolean f7544x = false;
    static ServiceConnection N = new b();

    /* renamed from: com.baidu.mapapi.utils.a$a, reason: collision with other inner class name */
    static class BinderC0061a extends b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f7547a;

        BinderC0061a(int i8) {
            this.f7547a = i8;
        }

        @Override // com.baidu.mapframework.open.aidl.b
        public void a(IBinder iBinder) {
            Log.d(a.f7521a, "onClientReady");
            if (a.f7523c != null) {
                IComOpenClient unused = a.f7523c = null;
            }
            IComOpenClient unused2 = a.f7523c = IComOpenClient.a.b(iBinder);
            a.a(this.f7547a);
            boolean unused3 = a.f7543w = true;
        }
    }

    static class b implements ServiceConnection {

        /* renamed from: com.baidu.mapapi.utils.a$b$a, reason: collision with other inner class name */
        class BinderC0062a extends b.a {
            BinderC0062a() {
            }

            @Override // com.baidu.mapframework.open.aidl.b
            public void a(IBinder iBinder) {
                Log.d(a.f7521a, "onClientReady");
                if (a.f7523c != null) {
                    IComOpenClient unused = a.f7523c = null;
                }
                IComOpenClient unused2 = a.f7523c = IComOpenClient.a.b(iBinder);
                if (!a.f7543w) {
                    a.a(a.f7524d);
                }
                boolean unused3 = a.f7543w = true;
            }
        }

        b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (a.f7545y != null) {
                a.f7545y.interrupt();
            }
            Log.d(a.f7521a, "onServiceConnected " + componentName);
            try {
                if (a.f7522b != null) {
                    com.baidu.mapframework.open.aidl.a unused = a.f7522b = null;
                }
                com.baidu.mapframework.open.aidl.a unused2 = a.f7522b = a.AbstractBinderC0069a.b(iBinder);
                a.f7522b.a(new BinderC0062a());
            } catch (RemoteException e8) {
                Log.d(a.f7521a, "getComOpenClient ", e8);
                if (a.f7522b != null) {
                    com.baidu.mapframework.open.aidl.a unused3 = a.f7522b = null;
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d(a.f7521a, "onServiceDisconnected " + componentName);
            if (a.f7522b != null) {
                com.baidu.mapframework.open.aidl.a unused = a.f7522b = null;
                boolean unused2 = a.f7544x = false;
            }
        }
    }

    static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f7549a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f7550b;

        c(Context context, int i8) {
            this.f7549a = context;
            this.f7550b = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            long currentTimeMillis = System.currentTimeMillis();
            do {
                if (System.currentTimeMillis() - currentTimeMillis > C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS) {
                    a.j(this.f7549a);
                    a.a(this.f7550b, this.f7549a);
                }
            } while (!a.f7545y.isInterrupted());
        }
    }

    private static void f(Context context) {
        Thread thread = f7545y;
        if (thread != null) {
            thread.interrupt();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("baidumap://map/walknavi?");
        if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
            f7530j = CoordTrans.gcjToBaidu(f7530j);
            f7531k = CoordTrans.gcjToBaidu(f7531k);
        }
        if (f7530j == null || f7531k == null) {
            return;
        }
        sb.append("origin=");
        sb.append(f7530j.latitude);
        sb.append(SystemInfoUtil.COMMA);
        sb.append(f7530j.longitude);
        if (!TextUtils.isEmpty(f7532l)) {
            sb.append("&origin_uid=");
            sb.append(f7532l);
        }
        sb.append("&destination=");
        sb.append(f7531k.latitude);
        sb.append(SystemInfoUtil.COMMA);
        sb.append(f7531k.longitude);
        if (!TextUtils.isEmpty(f7533m)) {
            sb.append("&destination_uid=");
            sb.append(f7533m);
        }
        sb.append("&src=");
        sb.append("sdk_[" + f7526f + "]");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    private static void g(Context context) {
        Thread thread = f7545y;
        if (thread != null) {
            thread.interrupt();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("baidumap://map/walknavi?");
        if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
            f7530j = CoordTrans.gcjToBaidu(f7530j);
            f7531k = CoordTrans.gcjToBaidu(f7531k);
        }
        if (f7530j == null || f7531k == null) {
            return;
        }
        sb.append("origin=");
        sb.append(f7530j.latitude);
        sb.append(SystemInfoUtil.COMMA);
        sb.append(f7530j.longitude);
        if (!TextUtils.isEmpty(f7532l)) {
            sb.append("&origin_uid=");
            sb.append(f7532l);
        }
        sb.append("&destination=");
        sb.append(f7531k.latitude);
        sb.append(SystemInfoUtil.COMMA);
        sb.append(f7531k.longitude);
        if (!TextUtils.isEmpty(f7533m)) {
            sb.append("&destination_uid=");
            sb.append(f7533m);
        }
        sb.append("&mode=");
        sb.append("walking_ar");
        sb.append("&src=");
        sb.append("sdk_[" + f7526f + "]");
        Log.e("test", sb.toString());
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    private static void h(Context context) {
        Thread thread = f7545y;
        if (thread != null) {
            thread.interrupt();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("baidumap://map/place/detail?");
        sb.append("uid=");
        sb.append(f7539s);
        sb.append("&show_type=");
        sb.append("detail_page");
        sb.append("&src=");
        sb.append("sdk_[" + f7526f + "]");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    private static void i(Context context) {
        Thread thread = f7545y;
        if (thread != null) {
            thread.interrupt();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("baidumap://map/nearbysearch?");
        if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
            f7541u = CoordTrans.gcjToBaidu(f7541u);
        }
        sb.append("center=");
        sb.append(f7541u.latitude);
        sb.append(SystemInfoUtil.COMMA);
        sb.append(f7541u.longitude);
        sb.append("&query=");
        sb.append(f7540t);
        sb.append("&radius=");
        sb.append(f7542v);
        sb.append("&src=");
        sb.append("sdk_[" + f7526f + "]");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public static void j(Context context) {
        if (f7544x) {
            context.unbindService(N);
            f7544x = false;
        }
    }

    private static boolean k() {
        String str;
        String a8;
        try {
            str = f7521a;
            Log.d(str, "callDispatchTakeOutRouteRidingNavi");
            a8 = f7523c.a("map.android.baidu.mainmap");
        } catch (RemoteException e8) {
            Log.d(f7521a, "callDispatchTakeOut exception", e8);
        }
        if (a8 == null) {
            Log.d(str, "callDispatchTakeOut com not found");
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString("target", "bikenavi_page");
        Bundle bundle2 = new Bundle();
        bundle2.putString("coord_type", "bd09ll");
        StringBuffer stringBuffer = new StringBuffer();
        if (f7534n != null) {
            stringBuffer.append("name:" + f7534n + b5.b.VERTICAL);
        }
        CoordType coordType = SDKInitializer.getCoordType();
        CoordType coordType2 = CoordType.GCJ02;
        if (coordType == coordType2) {
            f7530j = CoordTrans.gcjToBaidu(f7530j);
        }
        stringBuffer.append(String.format("latlng:%f,%f", Double.valueOf(f7530j.latitude), Double.valueOf(f7530j.longitude)));
        if (!TextUtils.isEmpty(f7532l)) {
            stringBuffer.append(b5.b.VERTICAL);
            stringBuffer.append("origin_uid:");
            stringBuffer.append(f7532l);
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        if (f7535o != null) {
            stringBuffer2.append("name:" + f7535o + b5.b.VERTICAL);
        }
        if (SDKInitializer.getCoordType() == coordType2) {
            f7531k = CoordTrans.gcjToBaidu(f7531k);
        }
        stringBuffer2.append(String.format("latlng:%f,%f", Double.valueOf(f7531k.latitude), Double.valueOf(f7531k.longitude)));
        if (!TextUtils.isEmpty(f7533m)) {
            stringBuffer2.append(b5.b.VERTICAL);
            stringBuffer2.append("destination_uid:");
            stringBuffer2.append(f7533m);
        }
        bundle2.putString("origin", stringBuffer.toString());
        bundle2.putString(FirebaseAnalytics.Param.DESTINATION, stringBuffer2.toString());
        bundle.putBundle("base_params", bundle2);
        Bundle bundle3 = new Bundle();
        bundle3.putString("launch_from", "sdk_[" + f7526f + "]");
        bundle.putBundle("ext_params", bundle3);
        return f7523c.a("map.android.baidu.mainmap", a8, bundle);
    }

    private static boolean l() {
        String str;
        String a8;
        try {
            str = f7521a;
            Log.d(str, "callDispatchTakeOutRouteNavi");
            a8 = f7523c.a("map.android.baidu.mainmap");
        } catch (Exception e8) {
            Log.d(f7521a, "callDispatchTakeOut exception", e8);
        }
        if (a8 == null) {
            Log.d(str, "callDispatchTakeOut com not found");
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString("target", "walknavi_page");
        Bundle bundle2 = new Bundle();
        bundle2.putString("coord_type", "bd09ll");
        StringBuffer stringBuffer = new StringBuffer();
        if (f7534n != null) {
            stringBuffer.append("name:" + f7534n + b5.b.VERTICAL);
        }
        CoordType coordType = SDKInitializer.getCoordType();
        CoordType coordType2 = CoordType.GCJ02;
        if (coordType == coordType2) {
            f7530j = CoordTrans.gcjToBaidu(f7530j);
        }
        stringBuffer.append(String.format("latlng:%f,%f", Double.valueOf(f7530j.latitude), Double.valueOf(f7530j.longitude)));
        if (!TextUtils.isEmpty(f7532l)) {
            stringBuffer.append(b5.b.VERTICAL);
            stringBuffer.append("origin_uid:");
            stringBuffer.append(f7532l);
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        if (f7535o != null) {
            stringBuffer2.append("name:" + f7535o + b5.b.VERTICAL);
        }
        if (SDKInitializer.getCoordType() == coordType2) {
            f7531k = CoordTrans.gcjToBaidu(f7531k);
        }
        stringBuffer2.append(String.format("latlng:%f,%f", Double.valueOf(f7531k.latitude), Double.valueOf(f7531k.longitude)));
        if (!TextUtils.isEmpty(f7533m)) {
            stringBuffer2.append(b5.b.VERTICAL);
            stringBuffer2.append("destination_uid:");
            stringBuffer2.append(f7533m);
        }
        bundle2.putString("origin", stringBuffer.toString());
        bundle2.putString(FirebaseAnalytics.Param.DESTINATION, stringBuffer2.toString());
        bundle.putBundle("base_params", bundle2);
        Bundle bundle3 = new Bundle();
        bundle3.putString("launch_from", "sdk_[" + f7526f + "]");
        bundle.putBundle("ext_params", bundle3);
        return f7523c.a("map.android.baidu.mainmap", a8, bundle);
    }

    public static String m() {
        return AppTools.getBaiduMapToken();
    }

    private static void c(Context context, int i8) {
        Thread thread = f7545y;
        if (thread != null) {
            thread.interrupt();
        }
        if (i8 == 101) {
            i8 = 3;
        }
        if (i8 == 102) {
            i8 = 4;
        }
        String[] strArr = {"driving", "transit", FitnessActivities.WALKING, "neweng", "truck"};
        StringBuilder sb = new StringBuilder();
        sb.append("baidumap://map/direction?");
        sb.append("origin=");
        if (f7530j != null && SDKInitializer.getCoordType() == CoordType.GCJ02) {
            f7530j = CoordTrans.gcjToBaidu(f7530j);
        }
        if (!TextUtils.isEmpty(f7534n) && f7530j != null) {
            sb.append("name:");
            sb.append(f7534n);
            sb.append("|latlng:");
            sb.append(f7530j.latitude);
            sb.append(SystemInfoUtil.COMMA);
            sb.append(f7530j.longitude);
        } else if (TextUtils.isEmpty(f7534n)) {
            LatLng latLng = f7530j;
            if (latLng != null) {
                sb.append(latLng.latitude);
                sb.append(SystemInfoUtil.COMMA);
                sb.append(f7530j.longitude);
            }
        } else {
            sb.append(f7534n);
        }
        if (!TextUtils.isEmpty(f7532l)) {
            sb.append("&origin_uid=");
            sb.append(f7532l);
        }
        sb.append("&destination=");
        if (f7531k != null && SDKInitializer.getCoordType() == CoordType.GCJ02) {
            f7531k = CoordTrans.gcjToBaidu(f7531k);
        }
        if (!TextUtils.isEmpty(f7535o) && f7531k != null) {
            sb.append("name:");
            sb.append(f7535o);
            sb.append("|latlng:");
            sb.append(f7531k.latitude);
            sb.append(SystemInfoUtil.COMMA);
            sb.append(f7531k.longitude);
        } else if (TextUtils.isEmpty(f7535o)) {
            LatLng latLng2 = f7531k;
            if (latLng2 != null) {
                sb.append(latLng2.latitude);
                sb.append(SystemInfoUtil.COMMA);
                sb.append(f7531k.longitude);
            }
        } else {
            sb.append(f7535o);
        }
        if (!TextUtils.isEmpty(f7533m)) {
            sb.append("&destination_uid=");
            sb.append(f7533m);
        }
        sb.append("&mode=");
        sb.append(strArr[i8]);
        sb.append("&target=");
        sb.append("1");
        sb.append("&src=");
        sb.append("sdk_[" + f7526f + "]");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    private static void d(Context context) {
        Thread thread = f7545y;
        if (thread != null) {
            thread.interrupt();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("baidumap://map/bikenavi?");
        if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
            f7530j = CoordTrans.gcjToBaidu(f7530j);
            f7531k = CoordTrans.gcjToBaidu(f7531k);
        }
        if (f7530j == null || f7531k == null) {
            return;
        }
        sb.append("origin=");
        sb.append(f7530j.latitude);
        sb.append(SystemInfoUtil.COMMA);
        sb.append(f7530j.longitude);
        if (!TextUtils.isEmpty(f7532l)) {
            sb.append("&origin_uid=");
            sb.append(f7532l);
        }
        sb.append("&destination=");
        sb.append(f7531k.latitude);
        sb.append(SystemInfoUtil.COMMA);
        sb.append(f7531k.longitude);
        if (!TextUtils.isEmpty(f7533m)) {
            sb.append("&destination_uid=");
            sb.append(f7533m);
        }
        sb.append("&src=");
        sb.append("sdk_[" + f7526f + "]");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    private static void e(Context context) {
        Thread thread = f7545y;
        if (thread != null) {
            thread.interrupt();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("baidumap://map/navi?");
        if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
            f7530j = CoordTrans.gcjToBaidu(f7530j);
            f7531k = CoordTrans.gcjToBaidu(f7531k);
        }
        sb.append("origin=");
        sb.append(f7530j.latitude);
        sb.append(SystemInfoUtil.COMMA);
        sb.append(f7530j.longitude);
        if (!TextUtils.isEmpty(f7532l)) {
            sb.append("&origin_uid=");
            sb.append(f7532l);
        }
        sb.append("&location=");
        sb.append(f7531k.latitude);
        sb.append(SystemInfoUtil.COMMA);
        sb.append(f7531k.longitude);
        if (!TextUtils.isEmpty(f7533m)) {
            sb.append("&destination_uid=");
            sb.append(f7533m);
        }
        sb.append("&src=");
        sb.append("sdk_[" + f7526f + "]");
        if (!TextUtils.isEmpty(f7536p)) {
            sb.append("&viaPoints=");
            sb.append(f7536p);
        }
        sb.append("&type=");
        sb.append(f7537q);
        sb.append("&mode=");
        sb.append("driving");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    private static boolean j() {
        String str;
        String a8;
        try {
            str = f7521a;
            Log.d(str, "callDispatchTakeOutRouteNavi");
            a8 = f7523c.a("map.android.baidu.mainmap");
        } catch (RemoteException e8) {
            Log.d(f7521a, "callDispatchTakeOut exception", e8);
        }
        if (a8 == null) {
            Log.d(str, "callDispatchTakeOut com not found");
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString("target", "navigation_page");
        Bundle bundle2 = new Bundle();
        bundle2.putString("coord_type", "bd09ll");
        StringBuffer stringBuffer = new StringBuffer();
        if (f7534n != null) {
            stringBuffer.append("name:" + f7534n + b5.b.VERTICAL);
        }
        CoordType coordType = SDKInitializer.getCoordType();
        CoordType coordType2 = CoordType.GCJ02;
        if (coordType == coordType2) {
            f7530j = CoordTrans.gcjToBaidu(f7530j);
        }
        stringBuffer.append(String.format("latlng:%f,%f", Double.valueOf(f7530j.latitude), Double.valueOf(f7530j.longitude)));
        if (!TextUtils.isEmpty(f7532l)) {
            stringBuffer.append(b5.b.VERTICAL);
            stringBuffer.append("origin_uid:");
            stringBuffer.append(f7532l);
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        if (f7535o != null) {
            stringBuffer2.append("name:" + f7535o + b5.b.VERTICAL);
        }
        if (SDKInitializer.getCoordType() == coordType2) {
            f7531k = CoordTrans.gcjToBaidu(f7531k);
        }
        stringBuffer2.append(String.format("latlng:%f,%f", Double.valueOf(f7531k.latitude), Double.valueOf(f7531k.longitude)));
        if (!TextUtils.isEmpty(f7533m)) {
            stringBuffer2.append(b5.b.VERTICAL);
            stringBuffer2.append("destination_uid:");
            stringBuffer2.append(f7533m);
        }
        bundle2.putString("origin", stringBuffer.toString());
        bundle2.putString(FirebaseAnalytics.Param.DESTINATION, stringBuffer2.toString());
        if (!TextUtils.isEmpty(f7536p)) {
            bundle2.putString("viaPoints", f7536p);
        }
        if (!TextUtils.isEmpty(f7537q)) {
            bundle2.putString("type", f7537q);
        }
        bundle.putBundle("base_params", bundle2);
        Bundle bundle3 = new Bundle();
        bundle3.putString("launch_from", "sdk_[" + f7526f + "]");
        bundle.putBundle("ext_params", bundle3);
        return f7523c.a("map.android.baidu.mainmap", a8, bundle);
    }

    public static boolean b(Context context, int i8) {
        try {
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        if (!com.baidu.platform.comapi.g.a.c(context)) {
            Log.d(f7521a, "package sign verify failed");
            return false;
        }
        f7543w = false;
        switch (i8) {
            case 0:
                f7524d = 0;
                break;
            case 1:
                f7524d = 1;
                break;
            case 2:
                f7524d = 2;
                break;
            case 3:
                f7524d = 3;
                break;
            case 4:
                f7524d = 4;
                break;
            case 5:
                f7524d = 5;
                break;
            case 6:
                f7524d = 6;
                break;
            case 7:
                f7524d = 7;
                break;
            case 8:
                f7524d = 8;
                break;
            case 9:
                f7524d = 9;
                break;
            default:
                switch (i8) {
                    case 101:
                        f7524d = 101;
                        break;
                    case 102:
                        f7524d = 102;
                        break;
                    case 103:
                        f7524d = 103;
                        break;
                    case 104:
                        f7524d = 104;
                        break;
                }
        }
        if (i8 == 9) {
            f7544x = false;
        }
        com.baidu.mapframework.open.aidl.a aVar = f7522b;
        if (aVar == null || !f7544x) {
            a(context, i8);
        } else {
            if (f7523c != null) {
                f7543w = true;
                return a(i8);
            }
            aVar.a(new BinderC0061a(i8));
        }
        return true;
    }

    public static boolean a(RouteParaOption routeParaOption, Context context, int i8) {
        b(routeParaOption, context, i8);
        return b(context, i8);
    }

    public static boolean a(PoiParaOption poiParaOption, Context context, int i8) {
        b(poiParaOption, context, i8);
        return b(context, i8);
    }

    public static boolean a(NaviParaOption naviParaOption, Context context, int i8) {
        b(naviParaOption, context, i8);
        return b(context, i8);
    }

    private static void b(Context context) {
        Thread thread = f7545y;
        if (thread != null) {
            thread.interrupt();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("baidumap://map/navi?");
        if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
            f7530j = CoordTrans.gcjToBaidu(f7530j);
            f7531k = CoordTrans.gcjToBaidu(f7531k);
        }
        sb.append("origin=");
        sb.append(f7530j.latitude);
        sb.append(SystemInfoUtil.COMMA);
        sb.append(f7530j.longitude);
        if (!TextUtils.isEmpty(f7532l)) {
            sb.append("&origin_uid=");
            sb.append(f7532l);
        }
        sb.append("&location=");
        sb.append(f7531k.latitude);
        sb.append(SystemInfoUtil.COMMA);
        sb.append(f7531k.longitude);
        if (!TextUtils.isEmpty(f7533m)) {
            sb.append("&destination_uid=");
            sb.append(f7533m);
        }
        sb.append("&src=");
        sb.append("sdk_[" + f7526f + "]");
        if (!TextUtils.isEmpty(f7536p)) {
            sb.append("&viaPoints=");
            sb.append(f7536p);
        }
        sb.append("&type=");
        sb.append(f7537q);
        sb.append("&mode=");
        sb.append("neweng");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public static boolean a(List<DispathcPoiData> list, Context context, int i8) {
        a(list, context);
        return b(context, i8);
    }

    private static boolean h() {
        try {
            String str = f7521a;
            Log.d(str, "callDispatchTakeOutPoiNearbySearch");
            String a8 = f7523c.a("map.android.baidu.mainmap");
            if (a8 != null) {
                Bundle bundle = new Bundle();
                bundle.putString("target", "poi_search_page");
                Bundle bundle2 = new Bundle();
                String str2 = f7540t;
                if (str2 != null) {
                    bundle2.putString("search_key", str2);
                } else {
                    bundle2.putString("search_key", "");
                }
                LatLng latLng = f7541u;
                if (latLng != null) {
                    bundle2.putInt("center_pt_x", (int) CoordUtil.ll2mc(latLng).getLongitudeE6());
                    bundle2.putInt("center_pt_y", (int) CoordUtil.ll2mc(f7541u).getLatitudeE6());
                } else {
                    bundle2.putString("search_key", "");
                }
                int i8 = f7542v;
                if (i8 != 0) {
                    bundle2.putInt("search_radius", i8);
                } else {
                    bundle2.putInt("search_radius", 1000);
                }
                bundle2.putBoolean("is_direct_search", true);
                bundle2.putBoolean("is_direct_area_search", true);
                bundle.putBundle("base_params", bundle2);
                Bundle bundle3 = new Bundle();
                bundle3.putString("launch_from", "sdk_[" + f7526f + "]");
                bundle.putBundle("ext_params", bundle3);
                return f7523c.a("map.android.baidu.mainmap", a8, bundle);
            }
            Log.d(str, "callDispatchTakeOut com not found");
            return false;
        } catch (RemoteException e8) {
            Log.d(f7521a, "callDispatchTakeOut exception", e8);
            return false;
        }
    }

    public static boolean a(int i8) {
        if (i8 != 101 && i8 != 102) {
            switch (i8) {
                case 0:
                case 1:
                case 2:
                    break;
                case 3:
                    return g();
                case 4:
                    return h();
                case 5:
                    return j();
                case 6:
                    return f();
                case 7:
                    return l();
                case 8:
                    return k();
                default:
                    return false;
            }
        }
        return i();
    }

    private static boolean i() {
        String str;
        String a8;
        try {
            str = f7521a;
            Log.d(str, "callDispatchTakeOutRoute");
            a8 = f7523c.a("map.android.baidu.mainmap");
        } catch (RemoteException e8) {
            Log.d(f7521a, "callDispatchTakeOut exception", e8);
        }
        if (a8 != null) {
            Bundle bundle = new Bundle();
            bundle.putString("target", "route_search_page");
            Bundle bundle2 = new Bundle();
            if (f7525e == 102) {
                f7525e = 7;
            }
            bundle2.putInt("route_type", f7525e);
            bundle2.putInt("bus_strategy", f7538r.ordinal());
            bundle2.putInt("cross_city_bus_strategy", 5);
            if (f7530j != null) {
                bundle2.putInt("start_type", 1);
                bundle2.putInt("start_longitude", (int) CoordUtil.ll2mc(f7530j).getLongitudeE6());
                bundle2.putInt("start_latitude", (int) CoordUtil.ll2mc(f7530j).getLatitudeE6());
            } else {
                bundle2.putInt("start_type", 2);
                bundle2.putInt("start_longitude", 0);
                bundle2.putInt("start_latitude", 0);
            }
            String str2 = f7534n;
            if (str2 != null) {
                bundle2.putString("start_keyword", str2);
            } else {
                bundle2.putString("start_keyword", "地图上的点");
            }
            bundle2.putString("start_uid", f7532l);
            if (f7531k != null) {
                bundle2.putInt("end_type", 1);
                bundle2.putInt("end_longitude", (int) CoordUtil.ll2mc(f7531k).getLongitudeE6());
                bundle2.putInt("end_latitude", (int) CoordUtil.ll2mc(f7531k).getLatitudeE6());
            } else {
                bundle2.putInt("end_type", 2);
                bundle2.putInt("end_longitude", 0);
                bundle2.putInt("end_latitude", 0);
            }
            String str3 = f7535o;
            if (str3 != null) {
                bundle2.putString("end_keyword", str3);
            } else {
                bundle2.putString("end_keyword", "地图上的点");
            }
            bundle2.putString("end_uid", f7533m);
            bundle.putBundle("base_params", bundle2);
            Bundle bundle3 = new Bundle();
            bundle3.putString("launch_from", "sdk_[" + f7526f + "]");
            bundle.putBundle("ext_params", bundle3);
            return f7523c.a("map.android.baidu.mainmap", a8, bundle);
        }
        Log.d(str, "callDispatchTakeOut com not found");
        return false;
    }

    public static void a(int i8, Context context) {
        if (i8 != 0 && i8 != 1 && i8 != 2) {
            if (i8 == 3) {
                h(context);
                return;
            }
            if (i8 == 4) {
                i(context);
                return;
            }
            if (i8 == 5) {
                e(context);
                return;
            }
            if (i8 == 7) {
                f(context);
                return;
            }
            if (i8 == 8) {
                d(context);
                return;
            }
            if (i8 != 9) {
                switch (i8) {
                    case 103:
                        b(context);
                        break;
                    case 104:
                        c(context);
                        break;
                }
            }
            g(context);
            return;
        }
        c(context, i8);
    }

    private static boolean f() {
        List<DispathcPoiData> list = f7529i;
        if (list != null && list.size() > 0) {
            try {
                String str = f7521a;
                Log.d(str, "callDispatchPoiToBaiduMap");
                String a8 = f7523c.a("map.android.baidu.mainmap");
                if (a8 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("target", "favorite_page");
                    Bundle bundle2 = new Bundle();
                    JSONArray jSONArray = new JSONArray();
                    int i8 = 0;
                    for (int i9 = 0; i9 < f7529i.size(); i9++) {
                        if (f7529i.get(i9).name != null && !f7529i.get(i9).name.equals("") && f7529i.get(i9).pt != null) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("name", f7529i.get(i9).name);
                                GeoPoint ll2mc = CoordUtil.ll2mc(f7529i.get(i9).pt);
                                jSONObject.put(MapBundleKey.MapObjKey.OBJ_SL_PTX, ll2mc.getLongitudeE6());
                                jSONObject.put(MapBundleKey.MapObjKey.OBJ_SL_PTY, ll2mc.getLatitudeE6());
                                jSONObject.put("addr", f7529i.get(i9).addr);
                                jSONObject.put("uid", f7529i.get(i9).uid);
                                i8++;
                                jSONArray.put(jSONObject);
                            } catch (JSONException e8) {
                                e8.printStackTrace();
                            }
                        }
                    }
                    if (i8 == 0) {
                        return false;
                    }
                    bundle2.putString("data", jSONArray.toString());
                    bundle2.putString(TypedValues.TransitionType.S_FROM, f7527g);
                    bundle2.putString("pkg", f7526f);
                    bundle2.putString("cls", f7528h);
                    bundle2.putInt("count", i8);
                    bundle.putBundle("base_params", bundle2);
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("launch_from", "sdk_[" + f7526f + "]");
                    bundle.putBundle("ext_params", bundle3);
                    return f7523c.a("map.android.baidu.mainmap", a8, bundle);
                }
                Log.d(str, "callDispatchPoiToBaiduMap com not found");
            } catch (RemoteException e9) {
                Log.d(f7521a, "callDispatchPoiToBaiduMap exception", e9);
            }
        }
        return false;
    }

    private static boolean g() {
        try {
            String str = f7521a;
            Log.d(str, "callDispatchTakeOutPoiDetials");
            String a8 = f7523c.a("map.android.baidu.mainmap");
            if (a8 != null) {
                Bundle bundle = new Bundle();
                bundle.putString("target", "request_poi_detail_page");
                Bundle bundle2 = new Bundle();
                String str2 = f7539s;
                if (str2 != null) {
                    bundle2.putString("uid", str2);
                } else {
                    bundle2.putString("uid", "");
                }
                bundle.putBundle("base_params", bundle2);
                Bundle bundle3 = new Bundle();
                bundle3.putString("launch_from", "sdk_[" + f7526f + "]");
                bundle.putBundle("ext_params", bundle3);
                return f7523c.a("map.android.baidu.mainmap", a8, bundle);
            }
            Log.d(str, "callDispatchTakeOut com not found");
            return false;
        } catch (RemoteException e8) {
            Log.d(f7521a, "callDispatchTakeOut exception", e8);
            return false;
        }
    }

    private static void a(Context context, int i8) {
        Intent intent = new Intent();
        String m8 = m();
        if (m8 == null) {
            return;
        }
        intent.putExtra("api_token", m8);
        intent.setAction("com.baidu.map.action.OPEN_SERVICE");
        intent.setPackage("com.baidu.BaiduMap");
        if (i8 != 9) {
            f7544x = context.bindService(intent, N, 1);
        }
        if (f7544x) {
            Thread thread = new Thread(new c(context, i8));
            f7545y = thread;
            thread.setDaemon(true);
            f7545y.start();
            return;
        }
        Log.e("baidumapsdk", "bind service failed，call openapi");
        a(i8, context);
    }

    private static void b(RouteParaOption routeParaOption, Context context, int i8) {
        f7534n = null;
        f7530j = null;
        f7535o = null;
        f7531k = null;
        f7532l = null;
        f7533m = null;
        f7526f = context.getPackageName();
        if (routeParaOption.getStartPoint() != null) {
            f7530j = routeParaOption.getStartPoint();
        }
        if (routeParaOption.getEndPoint() != null) {
            f7531k = routeParaOption.getEndPoint();
        }
        if (routeParaOption.getStartName() != null) {
            f7534n = routeParaOption.getStartName();
        }
        if (routeParaOption.getEndName() != null) {
            f7535o = routeParaOption.getEndName();
        }
        if (!TextUtils.isEmpty(routeParaOption.getStartPoiId())) {
            f7532l = routeParaOption.getStartPoiId();
        }
        if (!TextUtils.isEmpty(routeParaOption.getEndPoiId())) {
            f7533m = routeParaOption.getEndPoiId();
        }
        if (routeParaOption.getBusStrategyType() != null) {
            f7538r = routeParaOption.getBusStrategyType();
        }
        if (i8 == 0) {
            f7525e = 0;
            return;
        }
        if (i8 == 1) {
            f7525e = 1;
            return;
        }
        if (i8 == 2) {
            f7525e = 2;
        } else if (i8 == 101) {
            f7525e = 101;
        } else {
            if (i8 != 102) {
                return;
            }
            f7525e = 102;
        }
    }

    private static void c(Context context) {
        Thread thread = f7545y;
        if (thread != null) {
            thread.interrupt();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("baidumap://map/truck/navigation?");
        if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
            f7531k = CoordTrans.gcjToBaidu(f7531k);
        }
        sb.append("location=");
        sb.append(f7531k.latitude);
        sb.append(SystemInfoUtil.COMMA);
        sb.append(f7531k.longitude);
        if (!TextUtils.isEmpty(f7532l)) {
            sb.append("&origin_uid=");
            sb.append(f7532l);
        }
        if (!TextUtils.isEmpty(f7533m)) {
            sb.append("&destination_uid=");
            sb.append(f7533m);
        }
        sb.append("&src=");
        sb.append("sdk_[" + f7526f + "]");
        if (!TextUtils.isEmpty(f7536p)) {
            sb.append("&viaPoints=");
            sb.append(f7536p);
        }
        sb.append("&type=");
        sb.append(f7537q);
        int i8 = f7546z;
        if (i8 > 0 && i8 <= 4) {
            sb.append("&truck_type=");
            sb.append(f7546z);
            double d8 = A;
            if (d8 > i.DOUBLE_EPSILON && d8 <= 10.0d) {
                sb.append("&height=");
                sb.append(A);
                double d9 = B;
                if (d9 > i.DOUBLE_EPSILON && d9 <= 5.0d) {
                    sb.append("&width=");
                    sb.append(B);
                    double d10 = C;
                    if (d10 > i.DOUBLE_EPSILON && d10 <= 100.0d) {
                        sb.append("&weight=");
                        sb.append(C);
                        double d11 = D;
                        if (d11 > i.DOUBLE_EPSILON && d11 <= 25.0d) {
                            sb.append("&length=");
                            sb.append(D);
                            double d12 = E;
                            if (d12 >= i.DOUBLE_EPSILON && d12 <= 100.0d) {
                                sb.append("&axle_weight=");
                                sb.append(E);
                            }
                            int i9 = F;
                            if (i9 > 1 && i9 <= 8) {
                                sb.append("&axle_count=");
                                sb.append(F);
                                if (G) {
                                    sb.append("&is_trailer=");
                                    sb.append(1);
                                } else {
                                    sb.append("&is_trailer=");
                                    sb.append(0);
                                }
                                if (!TextUtils.isEmpty(H)) {
                                    if (H.length() != 7 && H.length() != 8) {
                                        throw new IllegalArgumentException("BDMapSDKException: plateNumber error Please fill in the correct license plate");
                                    }
                                    sb.append("&plate_number=");
                                    sb.append(H);
                                    int i10 = I;
                                    if (i10 >= 0 && i10 <= 4) {
                                        sb.append("&plate_color=");
                                        sb.append(I);
                                    }
                                    if (J > 0) {
                                        sb.append("&displacement=");
                                        sb.append(J);
                                    }
                                    int i11 = K;
                                    if (i11 > 0 && i11 <= 4) {
                                        sb.append("&power_type=");
                                        sb.append(K);
                                        int i12 = L;
                                        if (i12 >= 0 && i12 <= 6) {
                                            sb.append("&emission_limit=");
                                            sb.append(L);
                                            int i13 = M;
                                            if (i13 > 0 && i13 <= 100) {
                                                sb.append("&load_weight=");
                                                sb.append(M);
                                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
                                                intent.setFlags(268435456);
                                                context.startActivity(intent);
                                                return;
                                            }
                                            throw new IllegalArgumentException("BDMapSDKException: loadWeight Must be between 1 and 100");
                                        }
                                        throw new IllegalArgumentException("BDMapSDKException: emissionLimit Must be between 0 and 6");
                                    }
                                    throw new IllegalArgumentException("BDMapSDKException: powerType Must be between 1 and 4");
                                }
                                throw new IllegalArgumentException("BDMapSDKException: plateNumber Can not be null");
                            }
                            throw new IllegalArgumentException("BDMapSDKException: axleCount Must be between 2 and 8");
                        }
                        throw new IllegalArgumentException("BDMapSDKException: length Must be between 1 and 25");
                    }
                    throw new IllegalArgumentException("BDMapSDKException: weight Must be between 1 and 100");
                }
                throw new IllegalArgumentException("BDMapSDKException: width Must be between 1 and 5");
            }
            throw new IllegalArgumentException("BDMapSDKException: height Must be between 1 and 10");
        }
        throw new IllegalArgumentException("BDMapSDKException: truckType Must be between 1 and 4");
    }

    private static void a(TruckNaviOption truckNaviOption) {
        f7546z = 0;
        A = i.DOUBLE_EPSILON;
        B = i.DOUBLE_EPSILON;
        C = i.DOUBLE_EPSILON;
        D = i.DOUBLE_EPSILON;
        E = i.DOUBLE_EPSILON;
        F = 0;
        G = false;
        H = null;
        I = 0;
        J = 0;
        K = 0;
        L = 0;
        M = 0;
        if (truckNaviOption.getNaviRoutePolicy() != null) {
            f7537q = truckNaviOption.getNaviRoutePolicy();
        }
        JSONArray wayPoint = truckNaviOption.getWayPoint();
        if (wayPoint != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("viaPoints", wayPoint);
                try {
                    f7536p = URLEncoder.encode(jSONObject.toString(), "utf-8");
                } catch (UnsupportedEncodingException e8) {
                    e8.printStackTrace();
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        f7546z = truckNaviOption.getTruckType();
        A = truckNaviOption.getHeight();
        B = truckNaviOption.getWidth();
        C = truckNaviOption.getWeight();
        D = truckNaviOption.getLength();
        E = truckNaviOption.getAxleWeight();
        F = truckNaviOption.getAxleCount();
        G = truckNaviOption.getIsTrailer();
        H = truckNaviOption.getPlateNumber();
        I = truckNaviOption.getPlateColor();
        J = truckNaviOption.getDisplacement();
        K = truckNaviOption.getPowerType();
        L = truckNaviOption.getEmissionLimit();
        M = truckNaviOption.getLoadWeight();
    }

    private static void b(PoiParaOption poiParaOption, Context context, int i8) {
        f7539s = null;
        f7540t = null;
        f7541u = null;
        f7542v = 0;
        f7526f = context.getPackageName();
        if (poiParaOption.getUid() != null) {
            f7539s = poiParaOption.getUid();
        }
        if (poiParaOption.getKey() != null) {
            f7540t = poiParaOption.getKey();
        }
        if (poiParaOption.getCenter() != null) {
            f7541u = poiParaOption.getCenter();
        }
        if (poiParaOption.getRadius() != 0) {
            f7542v = poiParaOption.getRadius();
        }
    }

    private static void b(NaviParaOption naviParaOption, Context context, int i8) {
        f7526f = context.getPackageName();
        f7534n = null;
        f7530j = null;
        f7535o = null;
        f7531k = null;
        f7536p = null;
        f7532l = null;
        f7533m = null;
        if (naviParaOption.getStartPoint() != null) {
            f7530j = naviParaOption.getStartPoint();
        }
        if (naviParaOption.getEndPoint() != null) {
            f7531k = naviParaOption.getEndPoint();
        }
        if (naviParaOption.getStartName() != null) {
            f7534n = naviParaOption.getStartName();
        }
        if (naviParaOption.getEndName() != null) {
            f7535o = naviParaOption.getEndName();
        }
        if (!TextUtils.isEmpty(naviParaOption.getStartUid())) {
            f7532l = naviParaOption.getStartUid();
        }
        if (!TextUtils.isEmpty(naviParaOption.getEndUid())) {
            f7533m = naviParaOption.getEndUid();
        }
        if (naviParaOption.getNaviRoutePolicy() != null) {
            f7537q = naviParaOption.getNaviRoutePolicy();
        }
        JSONArray wayPoint = naviParaOption.getWayPoint();
        if (wayPoint != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("viaPoints", wayPoint);
                try {
                    f7536p = URLEncoder.encode(jSONObject.toString(), "utf-8");
                } catch (UnsupportedEncodingException e8) {
                    e8.printStackTrace();
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        if (naviParaOption instanceof TruckNaviOption) {
            a((TruckNaviOption) naviParaOption);
        }
    }

    private static void a(List<DispathcPoiData> list, Context context) {
        f7526f = context.getPackageName();
        f7527g = a(context);
        f7528h = "";
        List<DispathcPoiData> list2 = f7529i;
        if (list2 != null) {
            list2.clear();
        }
        Iterator<DispathcPoiData> it = list.iterator();
        while (it.hasNext()) {
            f7529i.add(it.next());
        }
    }

    public static String a(Context context) {
        PackageManager packageManager;
        ApplicationInfo applicationInfo = null;
        try {
            packageManager = context.getPackageManager();
            try {
                applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            packageManager = null;
        }
        return (String) packageManager.getApplicationLabel(applicationInfo);
    }
}
