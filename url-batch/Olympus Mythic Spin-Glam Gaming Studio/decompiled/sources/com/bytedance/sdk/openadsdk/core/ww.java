package com.bytedance.sdk.openadsdk.core;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class ww {
    private static volatile ww zmn;
    private Map<String, Map<String, String>> fs = new ConcurrentHashMap();

    private ww() {
    }

    public static ww zmn() {
        if (zmn == null) {
            synchronized (ww.class) {
                try {
                    if (zmn == null) {
                        zmn = new ww();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    public void zmn(String str, String str2, String str3) {
        Map<String, Map<String, String>> map = this.fs;
        if (map == null) {
            return;
        }
        Map<String, String> map2 = map.get(str);
        if (map2 != null) {
            map2.put(str2, str3);
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put(str2, str3);
        this.fs.put(str, concurrentHashMap);
    }

    public String zmn(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.fs;
        if (map2 == null || !map2.containsKey(str) || (map = this.fs.get(str)) == null) {
            return null;
        }
        return map.get(str2);
    }

    public boolean fs(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.fs;
        if (map2 == null || !map2.containsKey(str) || (map = this.fs.get(str)) == null) {
            return false;
        }
        return map.containsKey(str2);
    }

    public boolean zn(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.fs;
        if (map2 == null || !map2.containsKey(str) || (map = this.fs.get(str)) == null) {
            return false;
        }
        map.remove(str2);
        return true;
    }

    public void zmn(String str) {
        Map<String, Map<String, String>> map = this.fs;
        if (map != null && map.containsKey(str)) {
            Map<String, String> map2 = this.fs.get(str);
            if (map2 != null) {
                map2.clear();
            }
            this.fs.remove(str);
        }
    }
}
