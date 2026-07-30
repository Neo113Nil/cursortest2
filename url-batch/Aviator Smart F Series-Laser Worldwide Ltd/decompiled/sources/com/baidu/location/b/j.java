package com.baidu.location.b;

import android.location.Location;
import android.os.Bundle;
import com.baidu.location.e.c;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static String f4731a = "NULL";

    /* renamed from: b, reason: collision with root package name */
    private boolean f4732b = false;

    /* renamed from: c, reason: collision with root package name */
    private long f4733c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f4734d = -1;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final j f4735a = new j();
    }

    private String b(Location location) {
        StringBuilder sb = new StringBuilder();
        sb.append(location.getAccuracy());
        sb.append(b5.b.VERTICAL);
        sb.append(com.baidu.location.c.f.f5014d);
        sb.append(b5.b.VERTICAL);
        Bundle extras = location.getExtras();
        if (extras == null || !extras.containsKey("meanCn0")) {
            sb.append(-1);
        } else {
            sb.append(extras.get("meanCn0"));
        }
        sb.append(b5.b.VERTICAL);
        if (extras == null || !extras.containsKey("SourceType")) {
            sb.append(-1);
        } else {
            sb.append(extras.get("SourceType"));
        }
        sb.append(b5.b.VERTICAL);
        sb.append(f4731a);
        return sb.toString();
    }

    private void d() {
        String a8 = c.i.a().a(c.i.d.GPS_CHECKER_STATUS);
        if (a8 != null && f.a(a8, e.b().f4653v2) == 0) {
            this.f4732b = true;
        }
    }

    public int a(Location location) {
        if (location == null) {
            return -1;
        }
        this.f4733c = System.currentTimeMillis() / 1000;
        if (!b()) {
            d();
        }
        int a8 = b() ? a(b(location)) : -1;
        this.f4734d = a8;
        return a8;
    }

    public void c() {
        f.b();
        this.f4732b = false;
        f4731a = "";
        this.f4733c = -1L;
        this.f4734d = -1;
    }

    private int a(String str) {
        return f.a(str);
    }

    public boolean b() {
        return this.f4732b;
    }

    public static j a() {
        return a.f4735a;
    }

    public void a(ArrayList<ArrayList<Float>> arrayList) {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        if (arrayList.size() == 0) {
            sb = "NULL";
        } else {
            Iterator<ArrayList<Float>> it = arrayList.iterator();
            boolean z7 = true;
            while (it.hasNext()) {
                ArrayList<Float> next = it.next();
                if (next.size() == 6) {
                    if (z7) {
                        z7 = false;
                    } else {
                        sb2.append(";");
                    }
                    sb2.append(String.format("%.1f,", next.get(2)));
                    sb2.append(String.format("%.0f", next.get(3)));
                }
            }
            sb = sb2.toString();
        }
        f4731a = sb;
    }
}
