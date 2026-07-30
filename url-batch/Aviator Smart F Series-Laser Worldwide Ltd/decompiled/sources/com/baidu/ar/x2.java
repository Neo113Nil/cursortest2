package com.baidu.ar;

/* loaded from: classes.dex */
public class x2 implements y5 {
    @Override // com.baidu.ar.y5
    public y5 a() {
        return new x2();
    }

    @Override // com.baidu.ar.y5
    public String b() {
        return "";
    }

    @Override // com.baidu.ar.y5
    public String c() {
        return "";
    }

    @Override // com.baidu.ar.y5
    public void d() {
    }

    public boolean equals(Object obj) {
        return this == obj || (obj != null && x2.class == obj.getClass());
    }

    public int hashCode() {
        return x2.class.hashCode();
    }

    @Override // com.baidu.ar.y5
    public String toString() {
        return x2.class.getSimpleName();
    }

    @Override // com.baidu.ar.y5
    public void a(q4 q4Var) {
        if (q4Var.b() || q4Var.e() || q4Var.c()) {
            throw new v7("bad rsv RSV1: " + q4Var.b() + " RSV2: " + q4Var.e() + " RSV3: " + q4Var.c());
        }
    }

    @Override // com.baidu.ar.y5
    public void b(q4 q4Var) {
    }

    @Override // com.baidu.ar.y5
    public void c(q4 q4Var) {
    }

    @Override // com.baidu.ar.y5
    public boolean a(String str) {
        return true;
    }

    @Override // com.baidu.ar.y5
    public boolean b(String str) {
        return true;
    }
}
