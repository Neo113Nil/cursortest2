package com.onesignal.common.events;

import X5.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n6.AbstractC0792z;
import n6.F;
import n6.InterfaceC0789w;
import s6.n;
import u6.C0953e;

/* loaded from: classes.dex */
public class b implements d {
    private final List<Object> subscribers;

    public static final class a extends j implements Function1 {
        final /* synthetic */ Function1<Object, Unit> $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1<Object, Unit> function1, V5.b bVar) {
            super(1, bVar);
            this.$callback = function1;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return b.this.new a(this.$callback, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((a) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            List z7;
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            List list = b.this.subscribers;
            b bVar = b.this;
            synchronized (list) {
                z7 = CollectionsKt.z(bVar.subscribers);
            }
            Iterator it = z7.iterator();
            while (it.hasNext()) {
                this.$callback.invoke(it.next());
            }
            return Unit.f6114a;
        }
    }

    /* renamed from: com.onesignal.common.events.b$b, reason: collision with other inner class name */
    public static final class C0007b extends X5.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0007b(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.suspendingFire(null, this);
        }
    }

    public static final class c extends j implements Function2 {
        final /* synthetic */ Function2<Object, V5.b, Object> $callback;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function2<Object, ? super V5.b, ? extends Object> function2, V5.b bVar) {
            super(2, bVar);
            this.$callback = function2;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return b.this.new c(this.$callback, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            List z7;
            Iterator it;
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                List list = b.this.subscribers;
                b bVar = b.this;
                synchronized (list) {
                    z7 = CollectionsKt.z(bVar.subscribers);
                }
                it = z7.iterator();
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$0;
                V6.b.P(obj);
            }
            while (it.hasNext()) {
                Object next = it.next();
                Function2<Object, V5.b, Object> function2 = this.$callback;
                this.L$0 = it;
                this.label = 1;
                if (function2.invoke(next, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((c) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public b() {
        List<Object> synchronizedList = Collections.synchronizedList(new ArrayList());
        Intrinsics.checkNotNullExpressionValue(synchronizedList, "synchronizedList(...)");
        this.subscribers = synchronizedList;
    }

    public final void fire(Function1<Object, Unit> callback) {
        List z7;
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.subscribers) {
            z7 = CollectionsKt.z(this.subscribers);
        }
        Iterator it = z7.iterator();
        while (it.hasNext()) {
            callback.invoke(it.next());
        }
    }

    public final void fireOnMain(Function1<Object, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        com.onesignal.common.threading.b.suspendifyOnMain(new a(callback, null));
    }

    @Override // com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        List<Object> list = this.subscribers;
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list != null ? !list.isEmpty() : list.iterator().hasNext();
    }

    @Override // com.onesignal.common.events.d
    public void subscribe(Object obj) {
        synchronized (this.subscribers) {
            this.subscribers.add(obj);
        }
    }

    public final void subscribeAll(b from) {
        Intrinsics.checkNotNullParameter(from, "from");
        synchronized (this.subscribers) {
            try {
                Iterator<Object> it = from.subscribers.iterator();
                while (it.hasNext()) {
                    subscribe(it.next());
                }
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object suspendingFire(Function2<Object, ? super V5.b, ? extends Object> function2, V5.b bVar) {
        C0007b c0007b;
        int i2;
        List z7;
        Function2<Object, ? super V5.b, ? extends Object> function22;
        Iterator it;
        if (bVar instanceof C0007b) {
            c0007b = (C0007b) bVar;
            int i5 = c0007b.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0007b.label = i5 - Integer.MIN_VALUE;
                Object obj = c0007b.result;
                W5.a aVar = W5.a.f2787d;
                i2 = c0007b.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    synchronized (this.subscribers) {
                        z7 = CollectionsKt.z(this.subscribers);
                    }
                    function22 = function2;
                    it = z7.iterator();
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) c0007b.L$1;
                    Function2<Object, ? super V5.b, ? extends Object> function23 = (Function2) c0007b.L$0;
                    V6.b.P(obj);
                    function22 = function23;
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    c0007b.L$0 = function22;
                    c0007b.L$1 = it;
                    c0007b.label = 1;
                    if (function22.invoke(next, c0007b) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f6114a;
            }
        }
        c0007b = new C0007b(bVar);
        Object obj2 = c0007b.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = c0007b.label;
        if (i2 != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.f6114a;
    }

    public final Object suspendingFireOnMain(Function2<Object, ? super V5.b, ? extends Object> function2, V5.b bVar) {
        C0953e c0953e = F.f7011a;
        Object t6 = AbstractC0792z.t(n.f7850a, new c(function2, null), bVar);
        return t6 == W5.a.f2787d ? t6 : Unit.f6114a;
    }

    @Override // com.onesignal.common.events.d
    public void unsubscribe(Object obj) {
        synchronized (this.subscribers) {
            this.subscribers.remove(obj);
        }
    }
}
