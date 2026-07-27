package com.onesignal.common.threading;

import D4.AbstractC0024y;
import D4.E;
import D4.InterfaceC0022w;
import I4.o;
import K4.d;
import com.onesignal.debug.internal.logging.Logging;
import e5.g;
import f4.v;
import k4.C1224j;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.j;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1430a;
import t4.InterfaceC1441l;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class ThreadUtilsKt$suspendifyOnMain$2 extends j implements InterfaceC1430a {
    final /* synthetic */ InterfaceC1441l $block;

    @e(c = "com.onesignal.common.threading.ThreadUtilsKt$suspendifyOnMain$2$1", f = "ThreadUtils.kt", l = {47}, m = "invokeSuspend")
    /* renamed from: com.onesignal.common.threading.ThreadUtilsKt$suspendifyOnMain$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends h implements InterfaceC1445p {
        final /* synthetic */ InterfaceC1441l $block;
        int label;

        @e(c = "com.onesignal.common.threading.ThreadUtilsKt$suspendifyOnMain$2$1$1", f = "ThreadUtils.kt", l = {48}, m = "invokeSuspend")
        /* renamed from: com.onesignal.common.threading.ThreadUtilsKt$suspendifyOnMain$2$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00001 extends h implements InterfaceC1445p {
            final /* synthetic */ InterfaceC1441l $block;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00001(InterfaceC1441l interfaceC1441l, InterfaceC1218d interfaceC1218d) {
                super(2, interfaceC1218d);
                this.$block = interfaceC1441l;
            }

            @Override // m4.AbstractC1293a
            public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
                return new C00001(this.$block, interfaceC1218d);
            }

            @Override // t4.InterfaceC1445p
            public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
                return ((C00001) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
            }

            @Override // m4.AbstractC1293a
            public final Object invokeSuspend(Object obj) {
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                int i2 = this.label;
                if (i2 == 0) {
                    g.y(obj);
                    InterfaceC1441l interfaceC1441l = this.$block;
                    this.label = 1;
                    if (interfaceC1441l.invoke(this) == enumC1260a) {
                        return enumC1260a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.y(obj);
                }
                return v.f5689a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC1441l interfaceC1441l, InterfaceC1218d interfaceC1218d) {
            super(2, interfaceC1218d);
            this.$block = interfaceC1441l;
        }

        @Override // m4.AbstractC1293a
        public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
            return new AnonymousClass1(this.$block, interfaceC1218d);
        }

        @Override // t4.InterfaceC1445p
        public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
            return ((AnonymousClass1) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
        }

        @Override // m4.AbstractC1293a
        public final Object invokeSuspend(Object obj) {
            EnumC1260a enumC1260a = EnumC1260a.f11058a;
            int i2 = this.label;
            if (i2 == 0) {
                g.y(obj);
                d dVar = E.f459a;
                E4.e eVar = o.f1316a;
                C00001 c00001 = new C00001(this.$block, null);
                this.label = 1;
                if (AbstractC0024y.w(eVar, c00001, this) == enumC1260a) {
                    return enumC1260a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.y(obj);
            }
            return v.f5689a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadUtilsKt$suspendifyOnMain$2(InterfaceC1441l interfaceC1441l) {
        super(0);
        this.$block = interfaceC1441l;
    }

    @Override // t4.InterfaceC1430a
    public /* bridge */ /* synthetic */ Object invoke() {
        m5invoke();
        return v.f5689a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5invoke() {
        try {
            AbstractC0024y.q(C1224j.f10720a, new AnonymousClass1(this.$block, null));
        } catch (Exception e3) {
            Logging.error("Exception on thread with switch to main", e3);
        }
    }
}
