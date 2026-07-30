package com.baidu.ar;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class mc {

    /* renamed from: b, reason: collision with root package name */
    public static volatile mc f2829b;

    /* renamed from: a, reason: collision with root package name */
    public List<lc> f2830a = new ArrayList();

    public lc a(int i8) {
        List<lc> list = this.f2830a;
        if (list == null) {
            return null;
        }
        for (lc lcVar : list) {
            if (lcVar != null && lcVar.f2729f == i8) {
                return lcVar;
            }
        }
        return null;
    }

    public void b() {
        List<lc> list = this.f2830a;
        if (list != null) {
            for (lc lcVar : list) {
                if (lcVar != null) {
                    lcVar.b();
                }
            }
            this.f2830a.clear();
        }
        if (f2829b != null) {
            f2829b = null;
        }
    }

    public lc a(int i8, int i9, int i10) {
        List<lc> list = this.f2830a;
        if (list != null) {
            for (lc lcVar : list) {
                if (lcVar != null && lcVar.f2729f == i8) {
                    lcVar.a(i9, i10);
                    return lcVar;
                }
            }
        }
        lc lcVar2 = new lc();
        lcVar2.a(i8, i9, i10);
        List<lc> list2 = this.f2830a;
        if (list2 != null) {
            list2.add(lcVar2);
        }
        return lcVar2;
    }

    public static mc a() {
        if (f2829b == null) {
            synchronized (mc.class) {
                try {
                    if (f2829b == null) {
                        f2829b = new mc();
                    }
                } finally {
                }
            }
        }
        return f2829b;
    }
}
