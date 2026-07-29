package com.facebook.ads.internal.j;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final List<a> f5171a = new ArrayList();

    public static String a() {
        synchronized (f5171a) {
            if (f5171a.isEmpty()) {
                return "";
            }
            ArrayList arrayList = new ArrayList(f5171a);
            f5171a.clear();
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put(((a) it.next()).a());
            }
            return jSONArray.toString();
        }
    }

    public static void a(a aVar) {
        synchronized (f5171a) {
            f5171a.add(aVar);
        }
    }
}
