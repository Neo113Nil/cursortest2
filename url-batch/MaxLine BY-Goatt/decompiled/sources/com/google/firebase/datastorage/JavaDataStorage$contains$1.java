package com.google.firebase.datastorage;

import defpackage.a50;
import defpackage.b42;
import defpackage.b50;
import defpackage.ca2;
import defpackage.d42;
import defpackage.iv1;
import defpackage.lh;
import defpackage.n60;
import defpackage.n70;
import defpackage.o30;
import defpackage.on1;
import defpackage.pr2;
import defpackage.xm0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
@n70(c = "com.google.firebase.datastorage.JavaDataStorage$contains$1", f = "JavaDataStorage.kt", l = {124}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class JavaDataStorage$contains$1 extends pr2 implements Function2<a50, o30, Object> {
    final /* synthetic */ b42 $key;
    int label;
    final /* synthetic */ JavaDataStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaDataStorage$contains$1(JavaDataStorage javaDataStorage, b42 b42Var, o30 o30Var) {
        super(2, o30Var);
        this.this$0 = javaDataStorage;
        this.$key = b42Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        return new JavaDataStorage$contains$1(this.this$0, this.$key, o30Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a50 a50Var, o30 o30Var) {
        return ((JavaDataStorage$contains$1) create(a50Var, o30Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        n60 n60Var;
        boolean z;
        b50 b50Var = b50.m;
        int i = this.label;
        if (i == 0) {
            ca2.b(obj);
            n60Var = this.this$0.dataStore;
            xm0 f = n60Var.f();
            this.label = 1;
            obj = iv1.B(f, this);
            if (obj == b50Var) {
                return b50Var;
            }
        } else {
            if (i != 1) {
                lh.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ca2.b(obj);
        }
        d42 d42Var = (d42) obj;
        if (d42Var != null) {
            b42 b42Var = this.$key;
            b42Var.getClass();
            z = ((on1) d42Var).a.containsKey(b42Var);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
