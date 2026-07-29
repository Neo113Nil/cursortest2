package com.tencent.bugly.proguard;

import android.content.Context;
import com.facebook.ads.AudienceNetworkActivity;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    protected HashMap<String, HashMap<String, byte[]>> f8693a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    protected String f8694b;

    /* renamed from: c, reason: collision with root package name */
    i f8695c;

    /* renamed from: d, reason: collision with root package name */
    private HashMap<String, Object> f8696d;

    public static ag a(int i) {
        if (i == 1) {
            return new af();
        }
        if (i == 3) {
            return new ae();
        }
        return null;
    }

    a() {
        new HashMap();
        this.f8696d = new HashMap<>();
        this.f8694b = "GBK";
        this.f8695c = new i();
    }

    public void a(String str) {
        this.f8694b = str;
    }

    public static aq a(UserInfoBean userInfoBean) {
        if (userInfoBean == null) {
            return null;
        }
        aq aqVar = new aq();
        aqVar.f8730a = userInfoBean.e;
        aqVar.e = userInfoBean.j;
        aqVar.f8733d = userInfoBean.f8573c;
        aqVar.f8732c = userInfoBean.f8574d;
        aqVar.g = com.tencent.bugly.crashreport.common.info.a.b().i();
        aqVar.h = userInfoBean.o == 1;
        switch (userInfoBean.f8572b) {
            case 1:
                aqVar.f8731b = (byte) 1;
                break;
            case 2:
                aqVar.f8731b = (byte) 4;
                break;
            case 3:
                aqVar.f8731b = (byte) 2;
                break;
            case 4:
                aqVar.f8731b = (byte) 3;
                break;
            default:
                if (userInfoBean.f8572b >= 10 && userInfoBean.f8572b < 20) {
                    aqVar.f8731b = (byte) userInfoBean.f8572b;
                    break;
                } else {
                    x.e("unknown uinfo type %d ", Integer.valueOf(userInfoBean.f8572b));
                    return null;
                }
        }
        aqVar.f = new HashMap();
        if (userInfoBean.p >= 0) {
            Map<String, String> map = aqVar.f;
            StringBuilder sb = new StringBuilder();
            sb.append(userInfoBean.p);
            map.put("C01", sb.toString());
        }
        if (userInfoBean.q >= 0) {
            Map<String, String> map2 = aqVar.f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(userInfoBean.q);
            map2.put("C02", sb2.toString());
        }
        if (userInfoBean.r != null && userInfoBean.r.size() > 0) {
            for (Map.Entry<String, String> entry : userInfoBean.r.entrySet()) {
                aqVar.f.put("C03_" + entry.getKey(), entry.getValue());
            }
        }
        if (userInfoBean.s != null && userInfoBean.s.size() > 0) {
            for (Map.Entry<String, String> entry2 : userInfoBean.s.entrySet()) {
                aqVar.f.put("C04_" + entry2.getKey(), entry2.getValue());
            }
        }
        Map<String, String> map3 = aqVar.f;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(!userInfoBean.l);
        map3.put("A36", sb3.toString());
        Map<String, String> map4 = aqVar.f;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(userInfoBean.g);
        map4.put("F02", sb4.toString());
        Map<String, String> map5 = aqVar.f;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(userInfoBean.h);
        map5.put("F03", sb5.toString());
        aqVar.f.put("F04", userInfoBean.j);
        Map<String, String> map6 = aqVar.f;
        StringBuilder sb6 = new StringBuilder();
        sb6.append(userInfoBean.i);
        map6.put("F05", sb6.toString());
        aqVar.f.put("F06", userInfoBean.m);
        Map<String, String> map7 = aqVar.f;
        StringBuilder sb7 = new StringBuilder();
        sb7.append(userInfoBean.k);
        map7.put("F10", sb7.toString());
        x.c("summary type %d vm:%d", Byte.valueOf(aqVar.f8731b), Integer.valueOf(aqVar.f.size()));
        return aqVar;
    }

    public static String a(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < arrayList.size(); i++) {
            String str = arrayList.get(i);
            if (str.equals("java.lang.Integer") || str.equals("int")) {
                str = "int32";
            } else if (str.equals("java.lang.Boolean") || str.equals("boolean")) {
                str = "bool";
            } else if (str.equals("java.lang.Byte") || str.equals("byte")) {
                str = "char";
            } else if (str.equals("java.lang.Double") || str.equals("double")) {
                str = "double";
            } else if (str.equals("java.lang.Float") || str.equals("float")) {
                str = "float";
            } else if (str.equals("java.lang.Long") || str.equals("long")) {
                str = "int64";
            } else if (str.equals("java.lang.Short") || str.equals("short")) {
                str = "short";
            } else {
                if (str.equals("java.lang.Character")) {
                    throw new IllegalArgumentException("can not support java.lang.Character");
                }
                if (str.equals("java.lang.String")) {
                    str = "string";
                } else if (str.equals("java.util.List")) {
                    str = "list";
                } else if (str.equals("java.util.Map")) {
                    str = "map";
                }
            }
            arrayList.set(i, str);
        }
        Collections.reverse(arrayList);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            String str2 = arrayList.get(i2);
            if (str2.equals("list")) {
                int i3 = i2 - 1;
                arrayList.set(i3, "<" + arrayList.get(i3));
                arrayList.set(0, arrayList.get(0) + ">");
            } else if (str2.equals("map")) {
                int i4 = i2 - 1;
                arrayList.set(i4, "<" + arrayList.get(i4) + ",");
                arrayList.set(0, arrayList.get(0) + ">");
            } else if (str2.equals("Array")) {
                int i5 = i2 - 1;
                arrayList.set(i5, "<" + arrayList.get(i5));
                arrayList.set(0, arrayList.get(0) + ">");
            }
        }
        Collections.reverse(arrayList);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
        }
        return stringBuffer.toString();
    }

    public <T> void a(String str, T t) {
        if (str == null) {
            throw new IllegalArgumentException("put key can not is null");
        }
        if (t == null) {
            throw new IllegalArgumentException("put value can not is null");
        }
        if (t instanceof Set) {
            throw new IllegalArgumentException("can not support Set");
        }
        j jVar = new j();
        jVar.a(this.f8694b);
        jVar.a(t, 0);
        byte[] a2 = l.a(jVar.a());
        HashMap<String, byte[]> hashMap = new HashMap<>(1);
        ArrayList<String> arrayList = new ArrayList<>(1);
        a(arrayList, t);
        hashMap.put(a(arrayList), a2);
        this.f8696d.remove(str);
        this.f8693a.put(str, hashMap);
    }

    public static ar a(List<UserInfoBean> list, int i) {
        com.tencent.bugly.crashreport.common.info.a b2;
        if (list == null || list.size() == 0 || (b2 = com.tencent.bugly.crashreport.common.info.a.b()) == null) {
            return null;
        }
        b2.t();
        ar arVar = new ar();
        arVar.f8735b = b2.f8601d;
        arVar.f8736c = b2.h();
        ArrayList<aq> arrayList = new ArrayList<>();
        Iterator<UserInfoBean> it = list.iterator();
        while (it.hasNext()) {
            aq a2 = a(it.next());
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        arVar.f8737d = arrayList;
        arVar.e = new HashMap();
        arVar.e.put("A7", b2.f);
        arVar.e.put("A6", b2.s());
        arVar.e.put("A5", b2.r());
        Map<String, String> map = arVar.e;
        StringBuilder sb = new StringBuilder();
        sb.append(b2.p());
        map.put("A2", sb.toString());
        Map<String, String> map2 = arVar.e;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b2.p());
        map2.put("A1", sb2.toString());
        arVar.e.put("A24", b2.h);
        Map<String, String> map3 = arVar.e;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(b2.q());
        map3.put("A17", sb3.toString());
        arVar.e.put("A15", b2.w());
        Map<String, String> map4 = arVar.e;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(b2.x());
        map4.put("A13", sb4.toString());
        arVar.e.put("F08", b2.v);
        arVar.e.put("F09", b2.w);
        Map<String, String> E = b2.E();
        if (E != null && E.size() > 0) {
            for (Map.Entry<String, String> entry : E.entrySet()) {
                arVar.e.put("C04_" + entry.getKey(), entry.getValue());
            }
        }
        switch (i) {
            case 1:
                arVar.f8734a = (byte) 1;
                return arVar;
            case 2:
                arVar.f8734a = (byte) 2;
                return arVar;
            default:
                x.e("unknown up type %d ", Integer.valueOf(i));
                return null;
        }
    }

    public static <T extends k> T a(byte[] bArr, Class<T> cls) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            T newInstance = cls.newInstance();
            i iVar = new i(bArr);
            iVar.a(AudienceNetworkActivity.WEBVIEW_ENCODING);
            newInstance.a(iVar);
            return newInstance;
        } catch (Throwable th) {
            if (!x.b(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    public static am a(Context context, int i, byte[] bArr) {
        com.tencent.bugly.crashreport.common.info.a b2 = com.tencent.bugly.crashreport.common.info.a.b();
        StrategyBean c2 = com.tencent.bugly.crashreport.common.strategy.a.a().c();
        if (b2 == null || c2 == null) {
            x.e("Can not create request pkg for parameters is invalid.", new Object[0]);
            return null;
        }
        try {
            am amVar = new am();
            synchronized (b2) {
                amVar.f8716a = 1;
                amVar.f8717b = b2.f();
                amVar.f8718c = b2.f8600c;
                amVar.f8719d = b2.j;
                amVar.e = b2.l;
                b2.getClass();
                amVar.f = "2.6.5";
                amVar.g = i;
                amVar.h = bArr == null ? "".getBytes() : bArr;
                amVar.i = b2.g;
                amVar.j = b2.h;
                amVar.k = new HashMap();
                amVar.l = b2.e();
                amVar.m = c2.p;
                amVar.o = b2.h();
                amVar.p = com.tencent.bugly.crashreport.common.info.b.e(context);
                amVar.q = System.currentTimeMillis();
                amVar.r = b2.k();
                amVar.s = b2.j();
                amVar.t = b2.m();
                amVar.u = b2.l();
                amVar.v = b2.n();
                amVar.w = amVar.p;
                b2.getClass();
                amVar.n = "com.tencent.bugly";
                amVar.k.put("A26", b2.y());
                Map<String, String> map = amVar.k;
                StringBuilder sb = new StringBuilder();
                sb.append(b2.z);
                map.put("F11", sb.toString());
                Map<String, String> map2 = amVar.k;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(b2.y);
                map2.put("F12", sb2.toString());
                amVar.k.put("G1", b2.u());
                if (b2.B) {
                    amVar.k.put("G2", b2.K());
                    amVar.k.put("G3", b2.L());
                    amVar.k.put("G4", b2.M());
                    amVar.k.put("G5", b2.N());
                    amVar.k.put("G6", b2.O());
                    amVar.k.put("G7", Long.toString(b2.P()));
                }
                amVar.k.put("D3", b2.k);
                if (com.tencent.bugly.b.f8565b != null) {
                    for (com.tencent.bugly.a aVar : com.tencent.bugly.b.f8565b) {
                        if (aVar.versionKey != null && aVar.version != null) {
                            amVar.k.put(aVar.versionKey, aVar.version);
                        }
                    }
                }
                amVar.k.put("G15", z.b("G15", ""));
                amVar.k.put("D4", z.b("D4", "0"));
            }
            u a2 = u.a();
            if (a2 != null && !a2.f8784a && bArr != null) {
                amVar.h = z.a(amVar.h, 2, 1, c2.u);
                if (amVar.h == null) {
                    x.e("reqPkg sbuffer error!", new Object[0]);
                    return null;
                }
            }
            Map<String, String> D = b2.D();
            if (D != null) {
                for (Map.Entry<String, String> entry : D.entrySet()) {
                    amVar.k.put(entry.getKey(), entry.getValue());
                }
            }
            return amVar;
        } catch (Throwable th) {
            if (!x.b(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    private void a(ArrayList<String> arrayList, Object obj) {
        if (obj.getClass().isArray()) {
            if (!obj.getClass().getComponentType().toString().equals("byte")) {
                throw new IllegalArgumentException("only byte[] is supported");
            }
            if (Array.getLength(obj) > 0) {
                arrayList.add("java.util.List");
                a(arrayList, Array.get(obj, 0));
                return;
            } else {
                arrayList.add("Array");
                arrayList.add("?");
                return;
            }
        }
        if (obj instanceof Array) {
            throw new IllegalArgumentException("can not support Array, please use List");
        }
        if (obj instanceof List) {
            arrayList.add("java.util.List");
            List list = (List) obj;
            if (list.size() > 0) {
                a(arrayList, list.get(0));
                return;
            } else {
                arrayList.add("?");
                return;
            }
        }
        if (obj instanceof Map) {
            arrayList.add("java.util.Map");
            Map map = (Map) obj;
            if (map.size() > 0) {
                Object next = map.keySet().iterator().next();
                Object obj2 = map.get(next);
                arrayList.add(next.getClass().getName());
                a(arrayList, obj2);
                return;
            }
            arrayList.add("?");
            arrayList.add("?");
            return;
        }
        arrayList.add(obj.getClass().getName());
    }

    public byte[] a() {
        j jVar = new j(0);
        jVar.a(this.f8694b);
        jVar.a((Map) this.f8693a, 0);
        return l.a(jVar.a());
    }

    public void a(byte[] bArr) {
        this.f8695c.a(bArr);
        this.f8695c.a(this.f8694b);
        HashMap hashMap = new HashMap(1);
        HashMap hashMap2 = new HashMap(1);
        hashMap2.put("", new byte[0]);
        hashMap.put("", hashMap2);
        this.f8693a = this.f8695c.a((Map) hashMap, 0, false);
    }

    public static byte[] a(Object obj) {
        try {
            d dVar = new d();
            dVar.b();
            dVar.a(AudienceNetworkActivity.WEBVIEW_ENCODING);
            dVar.b(1);
            dVar.b("RqdServer");
            dVar.c("sync");
            dVar.a(ProductAction.ACTION_DETAIL, (String) obj);
            return dVar.a();
        } catch (Throwable th) {
            if (x.b(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    public static an a(byte[] bArr, boolean z) {
        if (bArr != null) {
            try {
                d dVar = new d();
                dVar.b();
                dVar.a(AudienceNetworkActivity.WEBVIEW_ENCODING);
                dVar.a(bArr);
                Object b2 = dVar.b(ProductAction.ACTION_DETAIL, new an());
                an anVar = an.class.isInstance(b2) ? (an) an.class.cast(b2) : null;
                if (!z && anVar != null && anVar.f8722c != null && anVar.f8722c.length > 0) {
                    x.c("resp buf %d", Integer.valueOf(anVar.f8722c.length));
                    anVar.f8722c = z.b(anVar.f8722c, 2, 1, StrategyBean.f8607d);
                    if (anVar.f8722c == null) {
                        x.e("resp sbuffer error!", new Object[0]);
                        return null;
                    }
                }
                return anVar;
            } catch (Throwable th) {
                if (!x.b(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    public static byte[] a(k kVar) {
        try {
            j jVar = new j();
            jVar.a(AudienceNetworkActivity.WEBVIEW_ENCODING);
            kVar.a(jVar);
            return jVar.b();
        } catch (Throwable th) {
            if (x.b(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }
}
