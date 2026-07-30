package com.baidu.location.e;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static String f5202a = "loc.map.baidu.com";

    /* renamed from: b, reason: collision with root package name */
    public static String f5203b = "https://loc.map.baidu.com/sdk.php";

    /* renamed from: c, reason: collision with root package name */
    public static String f5204c = "https://loc.map.baidu.com/cfgs/loc/commcfgs";

    /* renamed from: d, reason: collision with root package name */
    public static String f5205d = "https://loc.map.baidu.com/cfgs/indoorloc/indoorroadnet";

    /* renamed from: e, reason: collision with root package name */
    public static String f5206e = "https://aispace.baidu.com/cfgs/indoorloc/indoorbldgrects";

    /* renamed from: f, reason: collision with root package name */
    public static String f5207f = "https://parking.baidu.com/parking/api/parkingdata/getcarportlistforlocation?";

    /* renamed from: g, reason: collision with root package name */
    public static String f5208g = "https://daup.map.baidu.com/cltr/rcvr";

    /* renamed from: h, reason: collision with root package name */
    public static String f5209h = "https://ofloc.map.baidu.com/locnu";

    /* renamed from: i, reason: collision with root package name */
    public static String f5210i = "https://ofloc.map.baidu.com/LocBrokerService/do_loc_map_match";

    /* renamed from: j, reason: collision with root package name */
    public static String f5211j = "https://ofloc.map.baidu.com/PlanarStartService/detect_parking_exits";

    /* renamed from: k, reason: collision with root package name */
    public static String f5212k = "https://loc.map.baidu.com/cc.php";

    public static void a() {
        for (Field field : e.class.getDeclaredFields()) {
            if (field.getType().equals(String.class) && Modifier.isStatic(field.getModifiers())) {
                try {
                    field.set(null, field.get(null).toString().replace("//" + f5202a, "//cnloc.map.baidu.com"));
                } catch (Exception unused) {
                }
            }
        }
    }
}
