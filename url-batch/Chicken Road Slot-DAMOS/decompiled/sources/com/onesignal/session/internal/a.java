package com.onesignal.session.internal;

import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import nd.i;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class a implements nc.a {
    private final qc.b _outcomeController;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.session.internal.a$a, reason: collision with other inner class name */
    public static final class C0063a extends i implements Function1 {
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0063a(String str, ld.a aVar) {
            super(1, aVar);
            this.$name = str;
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return a.this.new C0063a(this.$name, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((C0063a) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                qc.b bVar = a.this._outcomeController;
                String str = this.$name;
                this.label = 1;
                if (bVar.sendOutcomeEvent(str, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
            }
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends i implements Function1 {
        final /* synthetic */ String $name;
        final /* synthetic */ float $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, float f3, ld.a aVar) {
            super(1, aVar);
            this.$name = str;
            this.$value = f3;
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return a.this.new b(this.$name, this.$value, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((b) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                qc.b bVar = a.this._outcomeController;
                String str = this.$name;
                float f3 = this.$value;
                this.label = 1;
                if (bVar.sendOutcomeEventWithValue(str, f3, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
            }
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends i implements Function1 {
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, ld.a aVar) {
            super(1, aVar);
            this.$name = str;
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return a.this.new c(this.$name, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((c) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                qc.b bVar = a.this._outcomeController;
                String str = this.$name;
                this.label = 1;
                if (bVar.sendUniqueOutcomeEvent(str, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
            }
            return Unit.f5554a;
        }
    }

    public a(qc.b bVar) {
        bVar.getClass();
        this._outcomeController = bVar;
    }

    @Override // nc.a
    public void addOutcome(String str) {
        str.getClass();
        com.onesignal.debug.internal.logging.b.log(ua.c.DEBUG, "sendOutcome(name: " + str + ')');
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new C0063a(str, null), 1, null);
    }

    @Override // nc.a
    public void addOutcomeWithValue(String str, float f3) {
        str.getClass();
        com.onesignal.debug.internal.logging.b.log(ua.c.DEBUG, "sendOutcomeWithValue(name: " + str + ", value: " + f3 + ')');
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new b(str, f3, null), 1, null);
    }

    @Override // nc.a
    public void addUniqueOutcome(String str) {
        str.getClass();
        com.onesignal.debug.internal.logging.b.log(ua.c.DEBUG, "sendUniqueOutcome(name: " + str + ')');
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new c(str, null), 1, null);
    }
}
