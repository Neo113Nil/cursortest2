package com.baidu.mshield.b.a;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap<String, String> f8313a = new HashMap<>();

    public static String a(Context context) {
        return com.baidu.sec.privacy.e.a.a(context).b();
    }

    public static String b() {
        return a("arv");
    }

    public static String c(Context context) {
        try {
            String a8 = a(context);
            String a9 = com.baidu.sec.privacy.f.g.a("ro.build.display.id", "");
            if (TextUtils.isEmpty(a8)) {
                return a9;
            }
            if (a8.equalsIgnoreCase("HUAWEI")) {
                return com.baidu.sec.privacy.f.g.a("ro.build.version.emui", a9);
            }
            if (a8.equalsIgnoreCase("XIAOMI")) {
                return com.baidu.sec.privacy.f.g.a("ro.build.version.incremental", a9);
            }
            if (a8.equalsIgnoreCase("OPPO")) {
                return com.baidu.sec.privacy.f.g.a("ro.build.version.opporom", a9);
            }
            if (a8.equalsIgnoreCase("VIVO")) {
                return com.baidu.sec.privacy.f.g.a("ro.vivo.rom.version", a9);
            }
            if (a8.equalsIgnoreCase("BBK")) {
                return com.baidu.sec.privacy.f.g.a("ro.build.version.bbk", a9);
            }
            if (a8.equalsIgnoreCase("MEIZU")) {
                return com.baidu.sec.privacy.f.g.a("ro.build.version.incremental", a9);
            }
            if (a8.equalsIgnoreCase("SAMSUNG")) {
                return a9;
            }
            if (a8.equalsIgnoreCase("GiONEE")) {
                return a9;
            }
            if (a8.equalsIgnoreCase("ZTE")) {
                String a10 = com.baidu.sec.privacy.f.g.a("ro.build.rom.id", a9);
                if (!a9.equals(a10)) {
                    return a10;
                }
                String a11 = com.baidu.sec.privacy.f.g.a("apps.setting.product.release", a9);
                return a9.equals(a11) ? com.baidu.sec.privacy.f.g.a("ro.bliss.display.version", a9) : a11;
            }
            if (!a8.equalsIgnoreCase("LeMobile") && !a8.equalsIgnoreCase("Letv")) {
                if (a8.equalsIgnoreCase("LENOVO")) {
                    String a12 = a();
                    if (!TextUtils.isEmpty(a12)) {
                        if (a12.equalsIgnoreCase("Lenovo A5800-D")) {
                            return com.baidu.sec.privacy.f.g.a("ro.build.cmccdisplay.id", a9);
                        }
                        if (a12.equalsIgnoreCase("Lenovo K900")) {
                            return com.baidu.sec.privacy.f.g.a("ro.build.version.incremental", a9);
                        }
                    }
                } else {
                    if (a8.equalsIgnoreCase("YuLong")) {
                        return a9;
                    }
                    if (a8.equalsIgnoreCase("OnePlus")) {
                        return com.baidu.sec.privacy.f.g.a("ro.rom.version", a9);
                    }
                    if (a8.equalsIgnoreCase("QiKU")) {
                        return com.baidu.sec.privacy.f.g.a("ro.build.uiversion", a9);
                    }
                    if (a8.equalsIgnoreCase("nubia")) {
                        return com.baidu.sec.privacy.f.g.a("ro.build.rom.id", a9);
                    }
                    if (a8.equalsIgnoreCase("motorola")) {
                        return a9;
                    }
                    if (a8.equalsIgnoreCase("HTC")) {
                        return com.baidu.sec.privacy.f.g.a("ro.build.sense.version", a9);
                    }
                    if (a8.equalsIgnoreCase("ZUK")) {
                        return com.baidu.sec.privacy.f.g.a("ro.build.version.incremental", a9);
                    }
                    if (a8.equalsIgnoreCase("K-Touch")) {
                        return com.baidu.sec.privacy.f.g.a("ro.yunos.version", a9);
                    }
                    if (a8.equalsIgnoreCase("MeiTu")) {
                        return com.baidu.sec.privacy.f.g.a("ro.build.version.meios", a9);
                    }
                    if (a8.equalsIgnoreCase("DOOV")) {
                        return com.baidu.sec.privacy.f.g.a("ro.fota.version", a9);
                    }
                    if (a8.equalsIgnoreCase("hisense")) {
                        String a13 = a();
                        if (!TextUtils.isEmpty(a13)) {
                            if (a13.equalsIgnoreCase("hisense e76")) {
                                return com.baidu.sec.privacy.f.g.a("ro.hs.ui.style", a9);
                            }
                            if (a13.equalsIgnoreCase("hisense e51-m")) {
                                return com.baidu.sec.privacy.f.g.a("hw.cabl.version", a9);
                            }
                        }
                    } else {
                        if (a8.equalsIgnoreCase("Changhong")) {
                            return com.baidu.sec.privacy.f.g.a("ro.fota.version", a9);
                        }
                        if (a8.equalsIgnoreCase("smartisan")) {
                            return com.baidu.sec.privacy.f.g.a("ro.smartisan.version", a9);
                        }
                        if (a8.equalsIgnoreCase("NM")) {
                            return com.baidu.sec.privacy.f.g.a("ro.xh.display.version", a9);
                        }
                        if (a8.equalsIgnoreCase("HONOR")) {
                            return com.baidu.sec.privacy.f.g.a("ro.build.version.emui", a9);
                        }
                        if (a8.equalsIgnoreCase("REALME")) {
                            return com.baidu.sec.privacy.f.g.a("ro.build.version.opporom", a9);
                        }
                    }
                }
                return a9;
            }
            return com.baidu.sec.privacy.f.g.a("ro.letv.release.version", a9);
        } catch (Throwable th) {
            com.baidu.sec.privacy.f.c.a(th);
            return "";
        }
    }

    public static String a() {
        return a("mod");
    }

    public static String b(Context context) {
        String a8;
        try {
            a8 = a(context);
        } catch (Throwable th) {
            com.baidu.sec.privacy.f.c.a(th);
        }
        if (TextUtils.isEmpty(a8)) {
            return "";
        }
        if (a8.equalsIgnoreCase("HUAWEI")) {
            return "EmotionUI";
        }
        if (a8.equalsIgnoreCase("HONOR")) {
            return "MagicUI";
        }
        if (a8.equalsIgnoreCase("XIAOMI")) {
            return com.baidu.sec.privacy.f.g.a("ro.miui.ui.version.name", "MIUI");
        }
        if (a8.equalsIgnoreCase("OPPO")) {
            return "ColorOS";
        }
        if (a8.equalsIgnoreCase("VIVO")) {
            return com.baidu.sec.privacy.f.g.a("ro.vivo.os.name", "Funtouch");
        }
        if (a8.equalsIgnoreCase("BBK")) {
            return "BBK";
        }
        if (a8.equalsIgnoreCase("MEIZU")) {
            return com.baidu.sec.privacy.f.g.a("ro.build.user", "Flyme");
        }
        if (a8.equalsIgnoreCase("samsung")) {
            return "SAMSUNG";
        }
        if (a8.equalsIgnoreCase("GiONEE")) {
            return com.baidu.sec.privacy.f.g.a("ro.build.display.id", "Amigo");
        }
        if (!a8.equalsIgnoreCase("ZTE")) {
            return (a8.equalsIgnoreCase("LeMobile") || a8.equalsIgnoreCase("Letv")) ? "EUI" : a8.equalsIgnoreCase("LENOVO") ? "LENOVO" : a8.equalsIgnoreCase("YuLong") ? "COOLUI" : a8.equalsIgnoreCase("OnePlus") ? "H2OS" : a8.equalsIgnoreCase("QiKU") ? "QIKU" : a8.equalsIgnoreCase("nubia") ? com.baidu.sec.privacy.f.g.a("ro.build.nubia.rom.name", "NUBIAUI") : a8.equalsIgnoreCase("motorola") ? "MOTOROLA" : a8.equalsIgnoreCase("HTC") ? "HTC Sense" : a8.equalsIgnoreCase("ZUK") ? "ZUI" : a8.equalsIgnoreCase("coolpad") ? "COOLPAD" : a8.equalsIgnoreCase("360") ? com.baidu.sec.privacy.f.g.a("ro.build.uiversion", "360") : a8.equalsIgnoreCase("K-Touch") ? "KTOUCH" : a8.equalsIgnoreCase("MeiTu") ? com.baidu.sec.privacy.f.g.a("ro.build.user", "MEITU") : a8.equalsIgnoreCase("DOOV") ? com.baidu.sec.privacy.f.g.a("ro.fota.oem", "DOOV") : a8.equalsIgnoreCase("TCL") ? "TCL" : a8.equalsIgnoreCase("Yota Devices Limited") ? "Yota" : a8.equalsIgnoreCase("lge") ? com.baidu.sec.privacy.f.g.a("ro.build.product", "LGE") : a8.equalsIgnoreCase("hisense") ? "VISION" : a8.equalsIgnoreCase("Changhong") ? "CHANGHONG" : a8.equalsIgnoreCase("Sony") ? "Sony" : a8.equalsIgnoreCase("smartisan") ? "smartisan" : a8.equalsIgnoreCase("NM") ? "newman" : a8.equalsIgnoreCase("REALME") ? "realmeUI" : "";
        }
        String a9 = a();
        return (TextUtils.isEmpty(a9) || !a9.equalsIgnoreCase("X9180")) ? com.baidu.sec.privacy.f.g.a("ro.build.nubia.rom.name", "ZTE") : "Bliss";
    }

    public static String a(String str) {
        try {
            HashMap<String, String> hashMap = f8313a;
            if (hashMap.size() <= 0) {
                return "";
            }
            synchronized (hashMap) {
                try {
                    if (!hashMap.containsKey(str)) {
                        return "";
                    }
                    return hashMap.get(str);
                } finally {
                }
            }
        } catch (Throwable th) {
            com.baidu.sec.privacy.f.c.a(th);
            return "";
        }
    }

    public static void a(HashMap<String, String> hashMap) {
        if (hashMap != null) {
            HashMap<String, String> hashMap2 = f8313a;
            synchronized (hashMap2) {
                hashMap2.putAll(hashMap);
            }
        }
    }

    public static void b(HashMap<String, String> hashMap) {
        if (hashMap != null) {
            try {
                if (hashMap.size() == 0) {
                    return;
                }
                synchronized (f8313a) {
                    try {
                        for (String str : hashMap.keySet()) {
                            f8313a.put(str, hashMap.get(str));
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                com.baidu.sec.privacy.f.c.a(th);
            }
        }
    }
}
