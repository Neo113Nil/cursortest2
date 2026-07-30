package com.onesignal.session.internal;

import X5.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class a implements I3.a {
    private final L3.b _outcomeController;

    /* renamed from: com.onesignal.session.internal.a$a, reason: collision with other inner class name */
    public static final class C0073a extends j implements Function1 {
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0073a(String str, V5.b bVar) {
            super(1, bVar);
            this.$name = str;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return a.this.new C0073a(this.$name, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((C0073a) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                L3.b bVar = a.this._outcomeController;
                String str = this.$name;
                this.label = 1;
                if (bVar.sendOutcomeEvent(str, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            return Unit.f6114a;
        }
    }

    public static final class b extends j implements Function1 {
        final /* synthetic */ String $name;
        final /* synthetic */ float $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, float f7, V5.b bVar) {
            super(1, bVar);
            this.$name = str;
            this.$value = f7;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return a.this.new b(this.$name, this.$value, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((b) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                L3.b bVar = a.this._outcomeController;
                String str = this.$name;
                float f7 = this.$value;
                this.label = 1;
                if (bVar.sendOutcomeEventWithValue(str, f7, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            return Unit.f6114a;
        }
    }

    public static final class c extends j implements Function1 {
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, V5.b bVar) {
            super(1, bVar);
            this.$name = str;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return a.this.new c(this.$name, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((c) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                L3.b bVar = a.this._outcomeController;
                String str = this.$name;
                this.label = 1;
                if (bVar.sendUniqueOutcomeEvent(str, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            return Unit.f6114a;
        }
    }

    public a(L3.b _outcomeController) {
        Intrinsics.checkNotNullParameter(_outcomeController, "_outcomeController");
        this._outcomeController = _outcomeController;
    }

    @Override // I3.a
    public void addOutcome(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "sendOutcome(name: " + name + ')');
        com.onesignal.common.threading.b.suspendifyOnIO(new C0073a(name, null));
    }

    @Override // I3.a
    public void addOutcomeWithValue(String name, float f7) {
        Intrinsics.checkNotNullParameter(name, "name");
        com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "sendOutcomeWithValue(name: " + name + ", value: " + f7 + ')');
        com.onesignal.common.threading.b.suspendifyOnIO(new b(name, f7, null));
    }

    @Override // I3.a
    public void addUniqueOutcome(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "sendUniqueOutcome(name: " + name + ')');
        com.onesignal.common.threading.b.suspendifyOnIO(new c(name, null));
    }
}
