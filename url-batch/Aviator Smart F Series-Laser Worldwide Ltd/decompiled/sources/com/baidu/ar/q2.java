package com.baidu.ar;

/* loaded from: classes.dex */
public abstract class q2 extends r4 {
    public q2(t9 t9Var) {
        super(t9Var);
    }

    @Override // com.baidu.ar.r4
    public void g() {
        if (!d()) {
            throw new v7("Control frame cant have fin==false set");
        }
        if (b()) {
            throw new v7("Control frame cant have rsv1==true set");
        }
        if (e()) {
            throw new v7("Control frame cant have rsv2==true set");
        }
        if (c()) {
            throw new v7("Control frame cant have rsv3==true set");
        }
    }
}
