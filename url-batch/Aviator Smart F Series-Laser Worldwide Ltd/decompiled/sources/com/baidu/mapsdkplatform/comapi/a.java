package com.baidu.mapsdkplatform.comapi;

import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import com.baidu.mapapi.JNIInitializer;
import com.baidu.mapapi.VersionInfo;
import com.baidu.mapapi.common.BaiduMapSDKException;
import com.baidu.mapsdkplatform.comapi.util.PermissionCheck;
import com.baidu.mapsdkplatform.comapi.util.SysUpdateObservable;
import com.baidu.mapsdkplatform.comapi.util.g;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class a implements PermissionCheck.d {

    /* renamed from: a, reason: collision with root package name */
    private static a f7906a;

    /* renamed from: b, reason: collision with root package name */
    private Context f7907b;

    /* renamed from: c, reason: collision with root package name */
    private d f7908c;

    /* renamed from: d, reason: collision with root package name */
    private int f7909d;

    /* renamed from: e, reason: collision with root package name */
    private CopyOnWriteArrayList<c> f7910e = new CopyOnWriteArrayList<>();

    static {
        NativeLoader.getInstance().loadLibrary(VersionInfo.getKitName());
        com.baidu.mapsdkplatform.comjni.tools.a.a();
    }

    private a() {
    }

    public static a e() {
        if (f7906a == null) {
            f7906a = new a();
        }
        return f7906a;
    }

    public void a(Context context) {
        this.f7907b = context;
    }

    public void b(c cVar) {
        if (cVar != null) {
            this.f7910e.add(cVar);
        }
    }

    public void c() {
        int i8 = this.f7909d - 1;
        this.f7909d = i8;
        if (i8 == 0) {
            b();
            Iterator<c> it = this.f7910e.iterator();
            while (it.hasNext()) {
                this.f7910e.remove(it.next());
            }
            g.v();
        }
    }

    public Context d() {
        if (this.f7907b == null) {
            this.f7907b = JNIInitializer.getCachedContext();
        }
        return this.f7907b;
    }

    public void f() {
        if (this.f7909d == 0) {
            if (this.f7907b == null) {
                Context cachedContext = JNIInitializer.getCachedContext();
                this.f7907b = cachedContext;
                if (cachedContext == null) {
                    Log.e("BDMapSDK", "BDMapSDKException: you have not supplyed the global app context info from SDKInitializer.initialize(Context) function.");
                    return;
                }
            }
            this.f7908c = new d();
            a();
            SysUpdateObservable.getInstance().updateNetworkInfo(this.f7907b);
        }
        this.f7909d++;
    }

    public boolean g() {
        if (this.f7907b == null) {
            Context cachedContext = JNIInitializer.getCachedContext();
            this.f7907b = cachedContext;
            if (cachedContext == null) {
                Log.e("BDMapSDK", "BDMapSDKException: you have not supplyed the global app context info from SDKInitializer.initialize(Context) function.");
                return false;
            }
        }
        g.e(this.f7907b);
        if (b.b()) {
            PermissionCheck.setPrivacyMode(true);
        } else {
            PermissionCheck.setPrivacyMode(false);
        }
        g.b(this.f7907b);
        com.baidu.mapsdkplatform.comapi.util.d.b().a(this.f7907b);
        g.w();
        PermissionCheck.init(this.f7907b);
        PermissionCheck.setPermissionCheckResultListener(this);
        PermissionCheck.permissionCheck();
        if (b.b()) {
            return true;
        }
        throw new BaiduMapSDKException("not agree privacyMode, please invoke SDKInitializer.setAgreePrivacy(Context, boolean) function");
    }

    private void b() {
        Context context;
        d dVar = this.f7908c;
        if (dVar == null || (context = this.f7907b) == null) {
            return;
        }
        context.unregisterReceiver(dVar);
    }

    public void a(c cVar) {
        if (cVar != null) {
            this.f7910e.remove(cVar);
        }
    }

    private void a() {
        d dVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        Context context = this.f7907b;
        if (context == null || (dVar = this.f7908c) == null) {
            return;
        }
        context.registerReceiver(dVar, intentFilter);
    }

    @Override // com.baidu.mapsdkplatform.comapi.util.PermissionCheck.d
    public void a(PermissionCheck.c cVar) {
        if (cVar == null) {
            return;
        }
        if (cVar.f8232a == 0) {
            g.F = cVar.f8236e;
            Iterator<c> it = this.f7910e.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next != null) {
                    next.a(g.F);
                }
            }
            g.a(cVar.f8233b, cVar.f8234c);
        } else {
            Log.e("baidumapsdk", "Authentication Error\n" + cVar.toString());
        }
        int i8 = cVar.f8232a;
        if (i8 == PermissionCheck.f8228m || i8 == PermissionCheck.f8227l || i8 == PermissionCheck.f8229n || i8 == PermissionCheck.f8230o || i8 == PermissionCheck.f8231p) {
            return;
        }
        com.baidu.mapsdkplatform.comapi.util.d.b().c(cVar.f8237f);
        com.baidu.mapsdkplatform.comapi.util.d.b().d(cVar.f8238g);
    }
}
