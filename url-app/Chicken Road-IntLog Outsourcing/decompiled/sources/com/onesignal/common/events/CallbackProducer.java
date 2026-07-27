package com.onesignal.common.events;

import D4.AbstractC0024y;
import D4.E;
import I4.o;
import K4.d;
import com.onesignal.common.threading.ThreadUtilsKt;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import t4.InterfaceC1441l;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public class CallbackProducer<THandler> implements ICallbackNotifier<THandler> {
    private THandler callback;

    public final void fire(InterfaceC1441l callback) {
        i.e(callback, "callback");
        THandler thandler = this.callback;
        if (thandler != null) {
            i.b(thandler);
            callback.invoke(thandler);
        }
    }

    public final void fireOnMain(InterfaceC1441l callback) {
        i.e(callback, "callback");
        ThreadUtilsKt.suspendifyOnMain(new CallbackProducer$fireOnMain$1(this, callback, null));
    }

    @Override // com.onesignal.common.events.ICallbackNotifier
    public boolean getHasCallback() {
        return this.callback != null;
    }

    @Override // com.onesignal.common.events.ICallbackNotifier
    public void set(THandler thandler) {
        this.callback = thandler;
    }

    public final Object suspendingFire(InterfaceC1445p interfaceC1445p, InterfaceC1218d interfaceC1218d) {
        THandler thandler = this.callback;
        v vVar = v.f5689a;
        if (thandler != null) {
            i.b(thandler);
            Object invoke = interfaceC1445p.invoke(thandler, interfaceC1218d);
            if (invoke == EnumC1260a.f11058a) {
                return invoke;
            }
        }
        return vVar;
    }

    public final Object suspendingFireOnMain(InterfaceC1445p interfaceC1445p, InterfaceC1218d interfaceC1218d) {
        THandler thandler = this.callback;
        v vVar = v.f5689a;
        if (thandler != null) {
            d dVar = E.f459a;
            Object w3 = AbstractC0024y.w(o.f1316a, new CallbackProducer$suspendingFireOnMain$2(interfaceC1445p, this, null), interfaceC1218d);
            if (w3 == EnumC1260a.f11058a) {
                return w3;
            }
        }
        return vVar;
    }
}
