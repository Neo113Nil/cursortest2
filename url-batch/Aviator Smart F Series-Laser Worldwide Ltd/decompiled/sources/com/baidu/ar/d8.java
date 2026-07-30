package com.baidu.ar;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class d8 {

    /* renamed from: a, reason: collision with root package name */
    public x3 f2041a;

    /* renamed from: b, reason: collision with root package name */
    public int f2042b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2043c;

    /* renamed from: d, reason: collision with root package name */
    public h6 f2044d;

    public d8(x3 x3Var, int i8, h6 h6Var, boolean z7) {
        if (x3Var == null || h6Var == null) {
            throw null;
        }
        this.f2041a = x3Var;
        this.f2044d = h6Var;
        this.f2042b = i8 <= 0 ? 10 : i8;
        this.f2043c = z7;
    }

    public List<List<t3>> a() {
        synchronized (this.f2041a) {
            try {
                ArrayList arrayList = new ArrayList();
                if (this.f2041a.isEmpty()) {
                    return arrayList;
                }
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = new HashMap();
                int size = this.f2041a.size();
                ArrayList arrayList3 = new ArrayList();
                for (int i8 = 0; i8 < size; i8++) {
                    t3 t3Var = this.f2041a.get(i8);
                    String d8 = t3Var.d();
                    if (!hashMap.containsKey(d8)) {
                        if (a(t3Var)) {
                            arrayList3.add(Integer.valueOf(i8));
                        } else {
                            hashMap.put(d8, 1);
                            arrayList2.add(t3Var);
                            if (arrayList2.size() == this.f2042b) {
                                arrayList.add(arrayList2);
                                arrayList2 = new ArrayList();
                            }
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.add(arrayList2);
                }
                if (!arrayList3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList(arrayList3.size());
                    for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                        arrayList4.add(this.f2041a.remove(((Integer) arrayList3.get(size2)).intValue()));
                    }
                    for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
                        this.f2041a.a((t3) arrayList4.get(size3));
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b() {
        return !this.f2041a.isEmpty();
    }

    public void c() {
        if (this.f2043c) {
            synchronized (this.f2041a) {
                this.f2041a.b();
            }
        }
    }

    public void a(int i8) {
        synchronized (this.f2041a) {
            this.f2041a.a(i8);
        }
    }

    public void a(Context context, List<t3> list) {
        if (list.size() == 0) {
            return;
        }
        if (list.size() == 1) {
            this.f2044d.a(context, list.get(0));
        } else {
            this.f2044d.a(context, list);
        }
    }

    public final boolean a(t3 t3Var) {
        Object c8 = t3Var.c("_db_period");
        if (c8 != null && (c8 instanceof Number)) {
            if (System.currentTimeMillis() - t3Var.c() < ((Number) c8).longValue()) {
                return true;
            }
        }
        return false;
    }
}
