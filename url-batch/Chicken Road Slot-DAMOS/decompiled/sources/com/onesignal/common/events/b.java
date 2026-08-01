package com.onesignal.common.events;

import ge.a0;
import ge.k0;
import ge.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import le.o;
import nd.i;
import ne.e;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class b implements d {
    private final List<Object> subscribers;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends i implements Function1 {
        final /* synthetic */ Function1<Object, Unit> $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1<Object, Unit> function1, ld.a aVar) {
            super(1, aVar);
            this.$callback = function1;
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return b.this.new a(this.$callback, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((a) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            List Q;
            md.a aVar = md.a.f6622d;
            if (this.label != 0) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            List list = b.this.subscribers;
            b bVar = b.this;
            synchronized (list) {
                Q = CollectionsKt.Q(bVar.subscribers);
            }
            Iterator it = Q.iterator();
            while (it.hasNext()) {
                this.$callback.invoke(it.next());
            }
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.common.events.b$b, reason: collision with other inner class name */
    public static final class C0004b extends nd.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0004b(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.suspendingFire(null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends i implements Function2 {
        final /* synthetic */ Function2<Object, ld.a, Object> $callback;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function2<Object, ? super ld.a, ? extends Object> function2, ld.a aVar) {
            super(2, aVar);
            this.$callback = function2;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return b.this.new c(this.$callback, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((c) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            List Q;
            Iterator it;
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                List list = b.this.subscribers;
                b bVar = b.this;
                synchronized (list) {
                    Q = CollectionsKt.Q(bVar.subscribers);
                }
                it = Q.iterator();
            } else {
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = (Iterator) this.L$0;
                cf.c.M(obj);
            }
            while (it.hasNext()) {
                Object next = it.next();
                Function2<Object, ld.a, Object> function2 = this.$callback;
                this.L$0 = it;
                this.label = 1;
                if (function2.invoke(next, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.f5554a;
        }
    }

    public b() {
        List<Object> synchronizedList = Collections.synchronizedList(new ArrayList());
        synchronizedList.getClass();
        this.subscribers = synchronizedList;
    }

    public final void fire(Function1<Object, Unit> function1) {
        List Q;
        function1.getClass();
        synchronized (this.subscribers) {
            Q = CollectionsKt.Q(this.subscribers);
        }
        Iterator it = Q.iterator();
        while (it.hasNext()) {
            function1.invoke(it.next());
        }
    }

    public final void fireOnMain(Function1<Object, Unit> function1) {
        function1.getClass();
        com.onesignal.common.threading.b.suspendifyOnMain(new a(function1, null));
    }

    @Override // com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        this.subscribers.getClass();
        return !r0.isEmpty();
    }

    @Override // com.onesignal.common.events.d
    public void subscribe(Object obj) {
        synchronized (this.subscribers) {
            this.subscribers.add(obj);
        }
    }

    public final void subscribeAll(b bVar) {
        bVar.getClass();
        synchronized (this.subscribers) {
            Iterator<Object> it = bVar.subscribers.iterator();
            while (it.hasNext()) {
                subscribe(it.next());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object suspendingFire(Function2<Object, ? super ld.a, ? extends Object> function2, ld.a aVar) {
        C0004b c0004b;
        int i3;
        List Q;
        Function2<Object, ? super ld.a, ? extends Object> function22;
        Iterator it;
        if (aVar instanceof C0004b) {
            c0004b = (C0004b) aVar;
            int i10 = c0004b.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0004b.label = i10 - Integer.MIN_VALUE;
                Object obj = c0004b.result;
                md.a aVar2 = md.a.f6622d;
                i3 = c0004b.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    synchronized (this.subscribers) {
                        Q = CollectionsKt.Q(this.subscribers);
                    }
                    function22 = function2;
                    it = Q.iterator();
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) c0004b.L$1;
                    Function2<Object, ? super ld.a, ? extends Object> function23 = (Function2) c0004b.L$0;
                    cf.c.M(obj);
                    function22 = function23;
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    c0004b.L$0 = function22;
                    c0004b.L$1 = it;
                    c0004b.label = 1;
                    if (function22.invoke(next, c0004b) == aVar2) {
                        return aVar2;
                    }
                }
                return Unit.f5554a;
            }
        }
        c0004b = new C0004b(aVar);
        Object obj2 = c0004b.result;
        md.a aVar22 = md.a.f6622d;
        i3 = c0004b.label;
        if (i3 != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.f5554a;
    }

    public final Object suspendingFireOnMain(Function2<Object, ? super ld.a, ? extends Object> function2, ld.a aVar) {
        e eVar = k0.f4372a;
        Object B = a0.B(o.f5995a, new c(function2, null), aVar);
        return B == md.a.f6622d ? B : Unit.f5554a;
    }

    @Override // com.onesignal.common.events.d
    public void unsubscribe(Object obj) {
        synchronized (this.subscribers) {
            this.subscribers.remove(obj);
        }
    }
}
