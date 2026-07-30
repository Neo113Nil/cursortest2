package com.baidu.mapsdkplatform.comapi.commonutils;

import android.text.TextUtils;
import com.baidu.mapapi.OpenLogUtil;
import com.baidu.platform.comapi.util.SysOSUtil;
import com.baidu.platform.comapi.util.j;
import com.baidu.platform.comjni.engine.NAEngine;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f7916a = true;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f7917b = false;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f7918a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f7919b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f7920c;

        a(c cVar, String str, String str2) {
            this.f7918a = cVar;
            this.f7919b = str;
            this.f7920c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            NAEngine.a(this.f7918a.ordinal(), this.f7919b, this.f7920c);
        }
    }

    /* renamed from: com.baidu.mapsdkplatform.comapi.commonutils.b$b, reason: collision with other inner class name */
    private enum EnumC0071b {
        eMonitorConsole(1),
        eMonitorNative(2),
        eMonitorNet(4);


        /* renamed from: e, reason: collision with root package name */
        private int f7926e;

        EnumC0071b(int i8) {
            this.f7926e = i8;
        }

        public int a() {
            return this.f7926e;
        }
    }

    public enum c {
        eNone,
        eMonitorVerbose,
        eMonitorDebug,
        eMonitorInfo,
        eMonitorWarn,
        eMonitorError,
        eMonitorRealTime
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private static final b f7935a = new b(null);
    }

    public enum e {
        SDK_MAP,
        Net,
        Engine
    }

    /* synthetic */ b(a aVar) {
        this();
    }

    public static b a() {
        return d.f7935a;
    }

    private void d() {
        NAEngine.a(new String[]{e.SDK_MAP.name(), e.Engine.name()});
    }

    public void b() {
        boolean isMapLogEnable = OpenLogUtil.isMapLogEnable();
        f7916a = isMapLogEnable;
        if (!isMapLogEnable || f7917b) {
            return;
        }
        String mapLogFilePath = OpenLogUtil.getMapLogFilePath();
        if (TextUtils.isEmpty(mapLogFilePath)) {
            mapLogFilePath = SysOSUtil.getInstance().getExternalFilesDir();
        }
        NAEngine.a(false);
        NAEngine.a(mapLogFilePath);
        NAEngine.b(EnumC0071b.eMonitorNative.a());
        NAEngine.a(c.eMonitorError.ordinal());
        d();
        NAEngine.a(true);
        f7917b = true;
    }

    public void c() {
        if (f7916a && f7917b) {
            f7917b = false;
            f7916a = false;
            NAEngine.a(false);
        }
    }

    private b() {
    }

    public void a(String str) {
        a(c.eMonitorRealTime, e.SDK_MAP.name(), str);
    }

    private void a(c cVar, String str, String str2) {
        if (f7916a) {
            j.c().submit(new a(cVar, str, str2));
        }
    }
}
