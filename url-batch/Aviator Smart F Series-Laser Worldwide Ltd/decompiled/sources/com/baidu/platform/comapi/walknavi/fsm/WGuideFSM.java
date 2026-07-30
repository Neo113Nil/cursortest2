package com.baidu.platform.comapi.walknavi.fsm;

import android.util.Log;
import com.baidu.platform.comapi.walknavi.a;
import com.baidu.platform.comapi.walknavi.b;

/* loaded from: classes2.dex */
public class WGuideFSM extends a {

    /* renamed from: a, reason: collision with root package name */
    private String f9949a;

    /* renamed from: b, reason: collision with root package name */
    private String f9950b;

    /* renamed from: c, reason: collision with root package name */
    private String f9951c;

    public WGuideFSM() {
        setInitialState("Entry");
        this.f9951c = this.f9949a;
        FSMTable.initTransition();
    }

    private void a(String str, String str2) {
        try {
            Class<?> cls = Class.forName(RGState.PACKAGE_NAME + "." + RGState.CLASS_PREFIX + str);
            cls.getMethod(str2, new Class[0]).invoke(cls.newInstance(), new Object[0]);
        } catch (Exception e8) {
            Log.e(WGuideFSM.class.getName(), e8.toString());
        }
    }

    private String b(String str) {
        if ("BrowseMap".equals(str)) {
            return this.f9951c;
        }
        return null;
    }

    public static void restoreZoomLevel() {
        int i8 = com.baidu.platform.comapi.walknavi.d.a.f9924b;
        if (i8 < 15) {
            i8 = 15;
        } else if (i8 > 20) {
            i8 = 19;
        }
        com.baidu.platform.comapi.walknavi.d.a.f9924b = i8;
    }

    public static void saveZoomLevel() {
        int g8 = (int) b.n().t().g();
        if (g8 < 15) {
            g8 = 15;
        } else if (g8 > 20) {
            g8 = 19;
        }
        com.baidu.platform.comapi.walknavi.d.a.f9924b = g8;
    }

    public String getCurrentEvent() {
        return this.f9950b;
    }

    public String getCurrentState() {
        return this.f9949a;
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public boolean ready() {
        return true;
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public void release() {
        FSMTable.release();
    }

    public synchronized void run(String str) {
        try {
            String str2 = this.f9949a;
            String queryDestState = FSMTable.queryDestState(str2, str);
            if (queryDestState != null) {
                this.f9950b = str;
                if ("BACK".equals(queryDestState)) {
                    queryDestState = b(str2);
                }
                a(str2, RGState.METHOD_NAME_EXIT);
                a(queryDestState, RGState.METHOD_NAME_ENTER);
                a(queryDestState, RGState.METHOD_NAME_EXCUTE);
                this.f9949a = queryDestState;
                a(queryDestState);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void runCurrentState() {
        if (!this.f9949a.equalsIgnoreCase("Entry")) {
            a(this.f9949a, RGState.METHOD_NAME_EXCUTE);
        }
    }

    public synchronized void runEntryState() {
        try {
            if (b.n().u() == 4) {
                this.f9949a = "SegEntry";
            } else {
                this.f9949a = "Entry";
            }
            a(this.f9949a, RGState.METHOD_NAME_EXCUTE);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setInitialState(String str) {
        this.f9949a = str;
    }

    private void a(String str) {
        if ("North2D".equals(str)) {
            this.f9951c = "North2D";
        } else if ("Car3D".equals(str) || "Entry".equals(str)) {
            this.f9951c = "Car3D";
        }
    }
}
