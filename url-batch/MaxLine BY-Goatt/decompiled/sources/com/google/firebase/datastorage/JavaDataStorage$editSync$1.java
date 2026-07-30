package com.google.firebase.datastorage;

import defpackage.a50;
import defpackage.b50;
import defpackage.ca2;
import defpackage.d42;
import defpackage.lh;
import defpackage.n60;
import defpackage.n70;
import defpackage.o30;
import defpackage.on1;
import defpackage.pr2;
import defpackage.z32;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
@n70(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1", f = "JavaDataStorage.kt", l = {220}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class JavaDataStorage$editSync$1 extends pr2 implements Function2<a50, o30, Object> {
    final /* synthetic */ Function1<on1, Unit> $transform;
    int label;
    final /* synthetic */ JavaDataStorage this$0;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    @n70(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1$1", f = "JavaDataStorage.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.google.firebase.datastorage.JavaDataStorage$editSync$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends pr2 implements Function2<on1, o30, Object> {
        final /* synthetic */ Function1<on1, Unit> $transform;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super on1, Unit> function1, o30 o30Var) {
            super(2, o30Var);
            this.$transform = function1;
        }

        @Override // defpackage.hn
        public final o30 create(Object obj, o30 o30Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, o30Var);
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
            this.$transform.invoke((on1) this.L$0);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public JavaDataStorage$editSync$1(JavaDataStorage javaDataStorage, Function1<? super on1, Unit> function1, o30 o30Var) {
        super(2, o30Var);
        this.this$0 = javaDataStorage;
        this.$transform = function1;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        return new JavaDataStorage$editSync$1(this.this$0, this.$transform, o30Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a50 a50Var, o30 o30Var) {
        return ((JavaDataStorage$editSync$1) create(a50Var, o30Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        ThreadLocal threadLocal;
        ThreadLocal threadLocal2;
        ThreadLocal threadLocal3;
        n60 n60Var;
        b50 b50Var = b50.m;
        int i = this.label;
        try {
            if (i == 0) {
                ca2.b(obj);
                threadLocal2 = this.this$0.editLock;
                Object obj2 = threadLocal2.get();
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.b(obj2, bool)) {
                    lh.g("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    return null;
                }
                threadLocal3 = this.this$0.editLock;
                threadLocal3.set(bool);
                n60Var = this.this$0.dataStore;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, null);
                this.label = 1;
                obj = n60Var.a(new z32(anonymousClass1, null, 1), this);
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
            return (d42) obj;
        } finally {
            threadLocal = this.this$0.editLock;
            threadLocal.set(Boolean.FALSE);
        }
    }
}
