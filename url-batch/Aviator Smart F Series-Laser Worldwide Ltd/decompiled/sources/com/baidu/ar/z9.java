package com.baidu.ar;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class z9 {

    /* renamed from: a, reason: collision with root package name */
    public x3 f3813a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList<t3> f3814b;

    /* renamed from: c, reason: collision with root package name */
    public int f3815c;

    /* renamed from: d, reason: collision with root package name */
    public int f3816d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3817e;

    /* renamed from: f, reason: collision with root package name */
    public List<String> f3818f;

    /* renamed from: g, reason: collision with root package name */
    public a f3819g;

    public interface a {
        void a(int i8);
    }

    public z9(x3 x3Var, int i8, int i9) {
        this.f3813a = x3Var;
        i8 = i8 <= 0 ? 20 : i8;
        this.f3815c = i8;
        this.f3816d = i9 < i8 ? i8 : i9;
        this.f3814b = new ArrayList<>(this.f3815c);
        this.f3817e = false;
        this.f3818f = null;
        this.f3819g = null;
    }

    public int a() {
        int size = this.f3814b.size();
        if (size > 0) {
            synchronized (this.f3813a) {
                this.f3813a.addAll(this.f3814b);
            }
            this.f3814b.clear();
            a aVar = this.f3819g;
            if (aVar != null) {
                aVar.a(size);
            }
        }
        return size;
    }

    public boolean b(t3 t3Var) {
        if (!this.f3817e) {
            if (this.f3814b.size() >= this.f3816d) {
                return false;
            }
            this.f3814b.add(t3Var);
            return true;
        }
        if (!a(t3Var)) {
            return false;
        }
        this.f3814b.add(t3Var);
        if (this.f3814b.size() >= this.f3815c) {
            a();
        }
        return true;
    }

    public void a(a aVar) {
        this.f3819g = aVar;
    }

    public boolean b(String str) {
        return !this.f3817e || a(str);
    }

    public void a(List<String> list) {
        ArrayList<t3> arrayList;
        this.f3818f = list;
        this.f3817e = true;
        if (this.f3814b.isEmpty()) {
            return;
        }
        List<String> list2 = this.f3818f;
        if (list2 == null || list2.isEmpty()) {
            this.f3814b.clear();
            return;
        }
        int size = this.f3814b.size() - 1;
        while (true) {
            arrayList = this.f3814b;
            if (size < 0) {
                break;
            }
            if (!this.f3818f.contains(arrayList.get(size).b())) {
                this.f3818f.remove(size);
            }
            size--;
        }
        if (arrayList.size() >= this.f3815c) {
            a();
        }
    }

    public final boolean a(t3 t3Var) {
        return a(t3Var.b());
    }

    public boolean a(String str) {
        List<String> list = this.f3818f;
        return list != null && list.contains(str);
    }
}
