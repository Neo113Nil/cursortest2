package com.baidu.ar;

/* loaded from: classes.dex */
public abstract class ue implements xe {

    /* renamed from: a, reason: collision with root package name */
    public ea f3416a;

    @Override // com.baidu.ar.xe
    public ea a(te teVar) {
        if (this.f3416a == null) {
            this.f3416a = new ea();
        }
        return this.f3416a;
    }

    @Override // com.baidu.ar.xe
    public void b(te teVar, q4 q4Var) {
    }

    @Override // com.baidu.ar.xe
    public qb a(te teVar, l3 l3Var, a2 a2Var) {
        return new b5();
    }

    @Override // com.baidu.ar.xe
    public void a(te teVar, a2 a2Var) {
    }

    @Override // com.baidu.ar.xe
    public void a(te teVar, a2 a2Var, pb pbVar) {
    }

    @Override // com.baidu.ar.xe
    public void a(te teVar, q4 q4Var) {
        teVar.a(new ga((ea) q4Var));
    }
}
