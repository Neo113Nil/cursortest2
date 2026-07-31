package com.bytedance.sdk.component.nps.zn;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes14.dex */
public class zn {
    private static final zn zmn = new zn();
    private final Object fs = new Object();
    private volatile List<String> zn = new ArrayList();
    private final ConcurrentHashMap<String, Integer> fb = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Long> btk = new ConcurrentHashMap<>();
    private volatile boolean hhw = false;
    private volatile int nps = 10;
    private volatile long zg = 1800000;

    private zn() {
    }

    public static zn zmn() {
        return zmn;
    }

    public void zmn(btk btkVar) {
        if (this.hhw == btkVar.zmn && this.nps == btkVar.fs && this.zg == btkVar.zn) {
            return;
        }
        this.hhw = btkVar.zmn;
        this.nps = btkVar.fs;
        this.zg = btkVar.zn;
        String.format("Config updated: enable=%b, K=%d, Cooldown=%dms", Boolean.valueOf(this.hhw), Integer.valueOf(this.nps), Long.valueOf(this.zg));
    }

    private String zmn(String str) {
        if (str == null) {
            return null;
        }
        try {
            Uri parse = Uri.parse(str);
            String host = parse.getHost();
            String path = parse.getPath();
            if (host != null && path != null) {
                if (path.isEmpty()) {
                    path = "/";
                }
                return host + path;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private String zmn(String str, String str2, List<String> list) {
        if (str.equals(zmn(str2))) {
            return str2;
        }
        for (String str3 : list) {
            if (str.equals(zmn(str3))) {
                return str3;
            }
        }
        return null;
    }

    public List<String> zmn(String str, List<String> list) {
        if (list == null || list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            return arrayList;
        }
        if (!this.hhw) {
            return fs(str, list);
        }
        String zmn2 = zmn(str);
        if (zmn2 == null) {
            return fs(str, list);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        List<String> list2 = this.zn;
        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            String zmn3 = zmn(it.next(), str, list);
            if (zmn3 != null && !arrayList2.contains(zmn3)) {
                arrayList2.add(zmn3);
            }
        }
        for (String str2 : list) {
            if (!list2.contains(zmn(str2)) && !arrayList2.contains(str2)) {
                arrayList3.add(str2);
            }
        }
        if (!arrayList2.isEmpty() && !arrayList3.isEmpty()) {
            arrayList2.addAll(1, arrayList3);
        } else if (arrayList2.isEmpty() && !arrayList3.isEmpty()) {
            arrayList2.addAll(arrayList3);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(arrayList2);
        linkedHashSet.add(str);
        linkedHashSet.addAll(list);
        ArrayList arrayList4 = new ArrayList(linkedHashSet);
        Long l = this.btk.get(zmn2);
        long currentTimeMillis = System.currentTimeMillis();
        if ((l == null || currentTimeMillis >= l.longValue()) && arrayList4.remove(str)) {
            arrayList4.add(0, str);
        }
        arrayList4.toString();
        return arrayList4;
    }

    public void zmn(String str, String str2, boolean z) {
        if ((z || com.bytedance.sdk.component.nps.zmn.nps()) && this.hhw && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String zmn2 = zmn(str);
            String zmn3 = zmn(str2);
            if (zmn2 == null || zmn3 == null) {
                return;
            }
            boolean equals = str.equals(str2);
            synchronized (this.fs) {
                try {
                    ArrayList arrayList = new ArrayList(this.zn);
                    boolean z2 = false;
                    if (equals) {
                        if (z) {
                            this.fb.remove(zmn3);
                            this.btk.remove(zmn3);
                            z2 = zmn(arrayList, zmn3);
                        } else {
                            long currentTimeMillis = System.currentTimeMillis();
                            Long l = this.btk.get(zmn3);
                            if (l != null && currentTimeMillis < l.longValue()) {
                                z2 = fs(arrayList, zmn3);
                            } else {
                                Integer num = this.fb.get(zmn3);
                                int intValue = (num == null ? 0 : num.intValue()) + 1;
                                this.fb.put(zmn3, Integer.valueOf(intValue));
                                if (intValue >= this.nps) {
                                    this.btk.put(zmn3, Long.valueOf(currentTimeMillis + this.zg));
                                    z2 = fs(arrayList, zmn3);
                                    this.fb.remove(zmn3);
                                }
                            }
                        }
                    } else if (z) {
                        Long l2 = this.btk.get(zmn3);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (l2 != null && l2.longValue() > currentTimeMillis2) {
                            z2 = zmn(arrayList, zmn2);
                        }
                    } else {
                        z2 = fs(arrayList, zmn2);
                    }
                    if (z2) {
                        while (arrayList.size() > 15) {
                            arrayList.remove(arrayList.size() - 1);
                        }
                        this.zn = arrayList;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private List<String> fs(String str, List<String> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    private boolean zmn(List<String> list, String str) {
        if (!list.isEmpty() && list.get(0).equals(str)) {
            return false;
        }
        list.remove(str);
        list.add(0, str);
        return true;
    }

    private boolean fs(List<String> list, String str) {
        if (!list.contains(str)) {
            list.add(str);
            return true;
        }
        if (list.get(list.size() - 1).equals(str)) {
            return false;
        }
        list.remove(str);
        list.add(str);
        return true;
    }
}
