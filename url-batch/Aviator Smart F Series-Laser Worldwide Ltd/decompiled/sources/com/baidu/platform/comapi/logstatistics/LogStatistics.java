package com.baidu.platform.comapi.logstatistics;

import com.baidu.platform.comapi.JNIInitializer;
import com.baidu.platform.comapi.util.JsonBuilder;
import com.baidu.platform.comapi.util.SysOSUtil;
import com.baidu.platform.comjni.base.logstatistics.NALogStatistics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class LogStatistics {
    private NALogStatistics mAppLog;
    private ArrayList<c> printers;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final LogStatistics f9350a = new LogStatistics();
    }

    public static LogStatistics getInstance() {
        return b.f9350a;
    }

    private boolean init() {
        if (this.mAppLog != null) {
            return true;
        }
        this.mAppLog = new NALogStatistics();
        return true;
    }

    public static void onAddLog(int i8, int i9, String str, String str2) {
        getInstance().print(new com.baidu.platform.comapi.logstatistics.b(i8, i9, str, str2));
    }

    public boolean addLog(int i8, int i9, String str, String str2) {
        if (this.mAppLog == null) {
            return false;
        }
        if (JNIInitializer.isDebug() || JNIInitializer.isBaseLineRelease()) {
            print(new com.baidu.platform.comapi.logstatistics.b(i8, i9, str, str2));
        }
        return this.mAppLog.a(i8, i9, SysOSUtil.getInstance().getNetType(), str, str2);
    }

    public void addLogWithMap(int i8, int i9, String str, Map<String, Object> map) {
        String str2;
        if (map == null || map.size() <= 0) {
            str2 = null;
        } else {
            JsonBuilder jsonBuilder = new JsonBuilder();
            jsonBuilder.object();
            for (String str3 : map.keySet()) {
                Object obj = map.get(str3);
                if (obj != null) {
                    jsonBuilder.key(str3).value(obj);
                }
            }
            jsonBuilder.endObject();
            str2 = jsonBuilder.getJson();
        }
        addLog(i8, i9, str, str2);
    }

    public void destroy() {
        NALogStatistics nALogStatistics = this.mAppLog;
        if (nALogStatistics != null) {
            nALogStatistics.dispose();
            this.mAppLog = null;
        }
    }

    public boolean print(com.baidu.platform.comapi.logstatistics.b bVar) {
        ArrayList<c> arrayList = this.printers;
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        Iterator<c> it = this.printers.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        return false;
    }

    public void registerPrinter(c cVar) {
        ArrayList<c> arrayList = this.printers;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.printers.add(cVar);
            }
        }
    }

    public boolean save() {
        NALogStatistics nALogStatistics = this.mAppLog;
        if (nALogStatistics != null) {
            return nALogStatistics.a();
        }
        return false;
    }

    public void unregisterPrinter(c cVar) {
        ArrayList<c> arrayList = this.printers;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.printers.remove(cVar);
            }
        }
    }

    private LogStatistics() {
        this.mAppLog = null;
        this.printers = new ArrayList<>();
        init();
    }
}
