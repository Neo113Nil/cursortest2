package com.onesignal.session.internal;

import E7.l;
import com.bumptech.glide.f;
import q7.v;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.h;

/* loaded from: classes2.dex */
public class a implements F5.a {
    private final I5.b _outcomeController;

    /* renamed from: com.onesignal.session.internal.a$a, reason: collision with other inner class name */
    public static final class C0242a extends h implements l {
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0242a(String str, InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
            this.$name = str;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return a.this.new C0242a(this.$name, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                f.r(obj);
                I5.b bVar = a.this._outcomeController;
                String str = this.$name;
                this.label = 1;
                if (bVar.sendOutcomeEvent(str, this) == enumC5179a) {
                    return enumC5179a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.r(obj);
            }
            return v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((C0242a) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public static final class b extends h implements l {
        final /* synthetic */ String $name;
        final /* synthetic */ float $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, float f6, InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
            this.$name = str;
            this.$value = f6;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return a.this.new b(this.$name, this.$value, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                f.r(obj);
                I5.b bVar = a.this._outcomeController;
                String str = this.$name;
                float f6 = this.$value;
                this.label = 1;
                if (bVar.sendOutcomeEventWithValue(str, f6, this) == enumC5179a) {
                    return enumC5179a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.r(obj);
            }
            return v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((b) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public static final class c extends h implements l {
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
            this.$name = str;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return a.this.new c(this.$name, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                f.r(obj);
                I5.b bVar = a.this._outcomeController;
                String str = this.$name;
                this.label = 1;
                if (bVar.sendUniqueOutcomeEvent(str, this) == enumC5179a) {
                    return enumC5179a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.r(obj);
            }
            return v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((c) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public a(I5.b _outcomeController) {
        kotlin.jvm.internal.h.e(_outcomeController, "_outcomeController");
        this._outcomeController = _outcomeController;
    }

    @Override // F5.a
    public void addOutcome(String name) {
        kotlin.jvm.internal.h.e(name, "name");
        com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "sendOutcome(name: " + name + ')');
        com.onesignal.common.threading.c.suspendifyOnIO(new C0242a(name, null));
    }

    @Override // F5.a
    public void addOutcomeWithValue(String name, float f6) {
        kotlin.jvm.internal.h.e(name, "name");
        com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "sendOutcomeWithValue(name: " + name + ", value: " + f6 + ')');
        com.onesignal.common.threading.c.suspendifyOnIO(new b(name, f6, null));
    }

    @Override // F5.a
    public void addUniqueOutcome(String name) {
        kotlin.jvm.internal.h.e(name, "name");
        com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "sendUniqueOutcome(name: " + name + ')');
        com.onesignal.common.threading.c.suspendifyOnIO(new c(name, null));
    }
}
