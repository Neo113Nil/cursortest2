package com.google.firebase.datastorage;

import defpackage.a50;
import defpackage.b42;
import defpackage.b50;
import defpackage.ca2;
import defpackage.lh;
import defpackage.n60;
import defpackage.n70;
import defpackage.o30;
import defpackage.on1;
import defpackage.pr2;
import defpackage.z32;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
@n70(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1", f = "JavaDataStorage.kt", l = {145}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class JavaDataStorage$putSync$1 extends pr2 implements Function2<a50, o30, Object> {
    final /* synthetic */ b42 $key;
    final /* synthetic */ T $value;
    int label;
    final /* synthetic */ JavaDataStorage this$0;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    @n70(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1$1", f = "JavaDataStorage.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.google.firebase.datastorage.JavaDataStorage$putSync$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends pr2 implements Function2<on1, o30, Object> {
        final /* synthetic */ b42 $key;
        final /* synthetic */ T $value;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b42 b42Var, T t, o30 o30Var) {
            super(2, o30Var);
            this.$key = b42Var;
            this.$value = t;
        }

        @Override // defpackage.hn
        public final o30 create(Object obj, o30 o30Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$key, this.$value, o30Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(on1 on1Var, o30 o30Var) {
            return ((AnonymousClass1) create(on1Var, o30Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.hn
        public final Object invokeSuspend(Object obj) {
            b50 b50Var = b50.m;
            if (this.label != 0) {
                lh.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ca2.b(obj);
            ((on1) this.L$0).c(this.$key, this.$value);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaDataStorage$putSync$1(JavaDataStorage javaDataStorage, b42 b42Var, T t, o30 o30Var) {
        super(2, o30Var);
        this.this$0 = javaDataStorage;
        this.$key = b42Var;
        this.$value = t;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        return new JavaDataStorage$putSync$1(this.this$0, this.$key, this.$value, o30Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a50 a50Var, o30 o30Var) {
        return ((JavaDataStorage$putSync$1) create(a50Var, o30Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        n60 n60Var;
        b50 b50Var = b50.m;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ca2.b(obj);
                return obj;
            }
            lh.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ca2.b(obj);
        n60Var = this.this$0.dataStore;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$key, this.$value, null);
        this.label = 1;
        Object a = n60Var.a(new z32(anonymousClass1, null, 1), this);
        return a == b50Var ? b50Var : a;
    }
}
