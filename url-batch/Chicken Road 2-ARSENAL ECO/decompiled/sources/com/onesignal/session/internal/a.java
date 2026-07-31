package com.onesignal.session.internal;

import g3.InterfaceC0392a;
import k5.v;
import kotlin.jvm.internal.i;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.g;
import u0.AbstractC0676f;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public class a implements InterfaceC0392a {
    private final j3.b _outcomeController;

    /* renamed from: com.onesignal.session.internal.a$a, reason: collision with other inner class name */
    public static final class C0073a extends g implements InterfaceC0743l {
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0073a(String str, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$name = str;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return a.this.new C0073a(this.$name, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                j3.b bVar = a.this._outcomeController;
                String str = this.$name;
                this.label = 1;
                if (bVar.sendOutcomeEvent(str, this) == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((C0073a) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public static final class b extends g implements InterfaceC0743l {
        final /* synthetic */ String $name;
        final /* synthetic */ float $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, float f7, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$name = str;
            this.$value = f7;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return a.this.new b(this.$name, this.$value, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                j3.b bVar = a.this._outcomeController;
                String str = this.$name;
                float f7 = this.$value;
                this.label = 1;
                if (bVar.sendOutcomeEventWithValue(str, f7, this) == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((b) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public static final class c extends g implements InterfaceC0743l {
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$name = str;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return a.this.new c(this.$name, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                j3.b bVar = a.this._outcomeController;
                String str = this.$name;
                this.label = 1;
                if (bVar.sendUniqueOutcomeEvent(str, this) == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((c) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public a(j3.b _outcomeController) {
        i.e(_outcomeController, "_outcomeController");
        this._outcomeController = _outcomeController;
    }

    @Override // g3.InterfaceC0392a
    public void addOutcome(String name) {
        i.e(name, "name");
        com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "sendOutcome(name: " + name + ')');
        com.onesignal.common.threading.b.suspendifyOnIO(new C0073a(name, null));
    }

    @Override // g3.InterfaceC0392a
    public void addOutcomeWithValue(String name, float f7) {
        i.e(name, "name");
        com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "sendOutcomeWithValue(name: " + name + ", value: " + f7 + ')');
        com.onesignal.common.threading.b.suspendifyOnIO(new b(name, f7, null));
    }

    @Override // g3.InterfaceC0392a
    public void addUniqueOutcome(String name) {
        i.e(name, "name");
        com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "sendUniqueOutcome(name: " + name + ')');
        com.onesignal.common.threading.b.suspendifyOnIO(new c(name, null));
    }
}
