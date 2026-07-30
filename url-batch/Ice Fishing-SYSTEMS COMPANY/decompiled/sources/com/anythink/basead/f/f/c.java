package com.anythink.basead.f.f;

import android.content.Context;
import com.anythink.core.common.d.u;
import com.anythink.core.common.h.bk;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.af;
import com.google.android.gms.internal.ads.CL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static volatile c f9114b;

    /* renamed from: c, reason: collision with root package name */
    private Object f9116c = new Object();

    /* renamed from: a, reason: collision with root package name */
    ConcurrentHashMap<String, ArrayList<String>> f9115a = new ConcurrentHashMap<>();

    private c() {
    }

    public static String a(String str, String str2) {
        return CL.j(str, str2);
    }

    public static c a() {
        if (f9114b == null) {
            synchronized (c.class) {
                try {
                    if (f9114b == null) {
                        f9114b = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f9114b;
    }

    public final void a(final Context context, final String str, final w wVar, final y yVar) {
        if (wVar.b() == 3 && (yVar instanceof bk) && ((bk) yVar).a() > 0) {
            com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.f.f.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (c.this.f9116c) {
                        bk bkVar = (bk) yVar;
                        ArrayList<String> arrayList = c.this.f9115a.get(str);
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                            try {
                                JSONArray jSONArray = new JSONArray(af.c(context, u.b.i, str, ""));
                                if (jSONArray.length() > 0) {
                                    for (int i = 0; i < jSONArray.length(); i++) {
                                        arrayList.add(jSONArray.optString(i));
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            c.this.f9115a.put(str, arrayList);
                        }
                        if (arrayList.size() >= bkVar.a()) {
                            arrayList.remove(arrayList.size() - 1);
                        }
                        arrayList.add(0, wVar.v());
                        af.b(context, u.b.i, str, new JSONArray((Collection) arrayList).toString());
                    }
                }
            }, 2);
        }
    }

    public final String[] a(Context context, String str) {
        ArrayList<String> arrayList = this.f9115a.get(str);
        if (arrayList == null) {
            try {
                JSONArray jSONArray = new JSONArray(af.c(context, u.b.i, str, ""));
                if (jSONArray.length() > 0) {
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            arrayList2.add(jSONArray.optString(i));
                        } catch (Exception unused) {
                        }
                    }
                    arrayList = arrayList2;
                }
            } catch (Exception unused2) {
            }
        }
        if (arrayList == null) {
            return null;
        }
        this.f9115a.put(str, arrayList);
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }
}
