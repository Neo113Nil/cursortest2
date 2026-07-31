package com.onesignal.common.events;

import H5.AbstractC0165z;
import H5.F;
import H5.InterfaceC0163x;
import M5.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k5.v;
import kotlin.jvm.internal.i;
import l5.AbstractC0506j;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import q5.g;
import u0.AbstractC0676f;
import x5.InterfaceC0743l;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public class b implements d {
    private final List<Object> subscribers;

    public static final class a extends g implements InterfaceC0743l {
        final /* synthetic */ InterfaceC0743l $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC0743l interfaceC0743l, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$callback = interfaceC0743l;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return b.this.new a(this.$callback, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            List P6;
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            List list = b.this.subscribers;
            b bVar = b.this;
            synchronized (list) {
                P6 = AbstractC0506j.P(bVar.subscribers);
            }
            Iterator it = P6.iterator();
            while (it.hasNext()) {
                this.$callback.invoke(it.next());
            }
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((a) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    /* renamed from: com.onesignal.common.events.b$b, reason: collision with other inner class name */
    public static final class C0007b extends AbstractC0607c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0007b(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.suspendingFire(null, this);
        }
    }

    public static final class c extends g implements InterfaceC0747p {
        final /* synthetic */ InterfaceC0747p $callback;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC0747p interfaceC0747p, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$callback = interfaceC0747p;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return b.this.new c(this.$callback, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((c) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            List P6;
            Iterator it;
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                List list = b.this.subscribers;
                b bVar = b.this;
                synchronized (list) {
                    P6 = AbstractC0506j.P(bVar.subscribers);
                }
                it = P6.iterator();
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$0;
                AbstractC0676f.w(obj);
            }
            while (it.hasNext()) {
                Object next = it.next();
                InterfaceC0747p interfaceC0747p = this.$callback;
                this.L$0 = it;
                this.label = 1;
                if (interfaceC0747p.invoke(next, this) == enumC0580a) {
                    return enumC0580a;
                }
            }
            return v.f5219a;
        }
    }

    public b() {
        List<Object> synchronizedList = Collections.synchronizedList(new ArrayList());
        i.d(synchronizedList, "synchronizedList(...)");
        this.subscribers = synchronizedList;
    }

    public final void fire(InterfaceC0743l callback) {
        List P6;
        i.e(callback, "callback");
        synchronized (this.subscribers) {
            P6 = AbstractC0506j.P(this.subscribers);
        }
        Iterator it = P6.iterator();
        while (it.hasNext()) {
            callback.invoke(it.next());
        }
    }

    public final void fireOnMain(InterfaceC0743l callback) {
        i.e(callback, "callback");
        com.onesignal.common.threading.b.suspendifyOnMain(new a(callback, null));
    }

    @Override // com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        i.e(this.subscribers, "<this>");
        return !r0.isEmpty();
    }

    @Override // com.onesignal.common.events.d
    public void subscribe(Object obj) {
        synchronized (this.subscribers) {
            this.subscribers.add(obj);
        }
    }

    public final void subscribeAll(b from) {
        i.e(from, "from");
        synchronized (this.subscribers) {
            Iterator<Object> it = from.subscribers.iterator();
            while (it.hasNext()) {
                subscribe(it.next());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object suspendingFire(InterfaceC0747p interfaceC0747p, InterfaceC0564d interfaceC0564d) {
        C0007b c0007b;
        int i7;
        List P6;
        InterfaceC0747p interfaceC0747p2;
        Iterator it;
        if (interfaceC0564d instanceof C0007b) {
            c0007b = (C0007b) interfaceC0564d;
            int i8 = c0007b.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0007b.label = i8 - Integer.MIN_VALUE;
                Object obj = c0007b.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = c0007b.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    synchronized (this.subscribers) {
                        P6 = AbstractC0506j.P(this.subscribers);
                    }
                    interfaceC0747p2 = interfaceC0747p;
                    it = P6.iterator();
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) c0007b.L$1;
                    InterfaceC0747p interfaceC0747p3 = (InterfaceC0747p) c0007b.L$0;
                    AbstractC0676f.w(obj);
                    interfaceC0747p2 = interfaceC0747p3;
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    c0007b.L$0 = interfaceC0747p2;
                    c0007b.L$1 = it;
                    c0007b.label = 1;
                    if (interfaceC0747p2.invoke(next, c0007b) == enumC0580a) {
                        return enumC0580a;
                    }
                }
                return v.f5219a;
            }
        }
        c0007b = new C0007b(interfaceC0564d);
        Object obj2 = c0007b.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = c0007b.label;
        if (i7 != 0) {
        }
        while (it.hasNext()) {
        }
        return v.f5219a;
    }

    public final Object suspendingFireOnMain(InterfaceC0747p interfaceC0747p, InterfaceC0564d interfaceC0564d) {
        O5.d dVar = F.f1027a;
        Object t6 = AbstractC0165z.t(o.f1618a, new c(interfaceC0747p, null), interfaceC0564d);
        return t6 == EnumC0580a.f5697f ? t6 : v.f5219a;
    }

    @Override // com.onesignal.common.events.d
    public void unsubscribe(Object obj) {
        synchronized (this.subscribers) {
            this.subscribers.remove(obj);
        }
    }
}
