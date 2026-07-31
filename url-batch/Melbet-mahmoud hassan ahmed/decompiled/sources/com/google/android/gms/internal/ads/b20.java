package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public final class b20 {

    /* renamed from: a, reason: collision with root package name */
    private final List<y10> f3161a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f3162b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f3163c;

    public b20(boolean z6, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f3162b = linkedHashMap;
        this.f3163c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final y10 f() {
        return new y10(y2.t.a().a(), null, null);
    }

    public final a20 a() {
        a20 a20Var;
        boolean booleanValue = ((Boolean) sw.c().b(m10.f8290r1)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.f3163c) {
            for (y10 y10Var : this.f3161a) {
                long a7 = y10Var.a();
                String c7 = y10Var.c();
                y10 b7 = y10Var.b();
                if (b7 != null && a7 > 0) {
                    long a8 = a7 - b7.a();
                    sb.append(c7);
                    sb.append('.');
                    sb.append(a8);
                    sb.append(',');
                    if (booleanValue) {
                        if (hashMap.containsKey(Long.valueOf(b7.a()))) {
                            StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(b7.a()));
                            sb2.append('+');
                            sb2.append(c7);
                        } else {
                            hashMap.put(Long.valueOf(b7.a()), new StringBuilder(c7));
                        }
                    }
                }
            }
            this.f3161a.clear();
            String str = null;
            if (!TextUtils.isEmpty(null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (booleanValue) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append('.');
                    sb3.append(y2.t.a().b() + (((Long) entry.getKey()).longValue() - y2.t.a().a()));
                    sb3.append(',');
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                str = sb3.toString();
            }
            a20Var = new a20(sb.toString(), str);
        }
        return a20Var;
    }

    public final Map<String, String> b() {
        Map<String, String> map;
        synchronized (this.f3163c) {
            y2.t.p().f();
            map = this.f3162b;
        }
        return map;
    }

    public final void c(b20 b20Var) {
        synchronized (this.f3163c) {
        }
    }

    public final void d(String str, String str2) {
        r10 f7;
        if (TextUtils.isEmpty(str2) || (f7 = y2.t.p().f()) == null) {
            return;
        }
        synchronized (this.f3163c) {
            x10 a7 = f7.a(str);
            Map<String, String> map = this.f3162b;
            map.put(str, a7.a(map.get(str), str2));
        }
    }

    public final boolean e(y10 y10Var, long j7, String... strArr) {
        synchronized (this.f3163c) {
            for (int i7 = 0; i7 <= 0; i7++) {
                this.f3161a.add(new y10(j7, strArr[i7], y10Var));
            }
        }
        return true;
    }
}
