package com.baidu.ar;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class w1 implements j6, s3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3598a = false;

    @Override // com.baidu.ar.s3
    public List<Integer> a() {
        return Arrays.asList(103, 104);
    }

    @Override // com.baidu.ar.j6
    public boolean b() {
        return this.f3598a;
    }

    public void c() {
        d();
    }

    public void d() {
        this.f3598a = false;
    }

    @Override // com.baidu.ar.s3
    public void a(int i8, int i9, HashMap<String, Object> hashMap) {
        if (i8 != 104) {
            return;
        }
        this.f3598a = true;
    }

    public void a(r3 r3Var) {
        r3Var.a(this);
    }
}
