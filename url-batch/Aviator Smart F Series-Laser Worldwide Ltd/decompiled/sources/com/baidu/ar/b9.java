package com.baidu.ar;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class b9 {

    /* renamed from: c, reason: collision with root package name */
    public static volatile b9 f1782c;

    /* renamed from: a, reason: collision with root package name */
    public int f1783a = -1;

    /* renamed from: b, reason: collision with root package name */
    public Set<q3> f1784b = new HashSet();

    public static b9 b() {
        if (f1782c == null) {
            synchronized (b9.class) {
                try {
                    if (f1782c == null) {
                        f1782c = new b9();
                    }
                } finally {
                }
            }
        }
        return f1782c;
    }

    public void a() {
        h.a("MultEngineManager", "clearListeners");
        this.f1784b.clear();
    }

    public boolean c() {
        return this.f1783a == 2;
    }

    public void d() {
        h.a("MultEngineManager", "release");
        this.f1783a = -1;
        a();
    }

    public void a(int i8) {
        this.f1783a = i8;
        h.a("MultEngineManager", "setupEngine sdkType:" + i8 + cn.hutool.core.text.l.SPACE + this.f1784b.size());
        Set<q3> set = this.f1784b;
        if (set == null || set.isEmpty()) {
            return;
        }
        for (q3 q3Var : this.f1784b) {
            if (q3Var != null) {
                q3Var.onEngineCreate(i8);
            }
        }
    }
}
