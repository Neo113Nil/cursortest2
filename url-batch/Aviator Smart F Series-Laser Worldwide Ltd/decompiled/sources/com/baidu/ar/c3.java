package com.baidu.ar;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c3 extends b3 {

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<b3> f1886d;

    public c3() {
        a("DetectorGroup");
    }

    public void a(b3 b3Var) {
        if (this.f1886d == null) {
            this.f1886d = new ArrayList<>();
        }
        this.f1886d.add(b3Var);
    }

    public boolean b(String str) {
        Iterator<b3> it = this.f1886d.iterator();
        while (it.hasNext()) {
            if (it.next().a().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<b3> d() {
        return this.f1886d;
    }
}
