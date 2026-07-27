package k4;

import f4.C0431h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l4.EnumC1260a;

/* renamed from: k4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1225k implements InterfaceC1218d, m4.d {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10721b = AtomicReferenceFieldUpdater.newUpdater(C1225k.class, Object.class, "result");

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1218d f10722a;
    private volatile Object result;

    public C1225k(InterfaceC1218d interfaceC1218d) {
        EnumC1260a enumC1260a = EnumC1260a.f11059b;
        this.f10722a = interfaceC1218d;
        this.result = enumC1260a;
    }

    public final Object a() {
        Object obj = this.result;
        EnumC1260a enumC1260a = EnumC1260a.f11059b;
        if (obj == enumC1260a) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10721b;
            EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC1260a, enumC1260a2)) {
                if (atomicReferenceFieldUpdater.get(this) != enumC1260a) {
                    obj = this.result;
                }
            }
            return EnumC1260a.f11058a;
        }
        if (obj == EnumC1260a.f11060c) {
            return EnumC1260a.f11058a;
        }
        if (obj instanceof C0431h) {
            throw ((C0431h) obj).f5670a;
        }
        return obj;
    }

    @Override // m4.d
    public final m4.d getCallerFrame() {
        InterfaceC1218d interfaceC1218d = this.f10722a;
        if (interfaceC1218d instanceof m4.d) {
            return (m4.d) interfaceC1218d;
        }
        return null;
    }

    @Override // k4.InterfaceC1218d
    public final InterfaceC1223i getContext() {
        return this.f10722a.getContext();
    }

    @Override // k4.InterfaceC1218d
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC1260a enumC1260a = EnumC1260a.f11059b;
            if (obj2 == enumC1260a) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10721b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC1260a, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != enumC1260a) {
                        break;
                    }
                }
                return;
            }
            EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
            if (obj2 != enumC1260a2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f10721b;
            EnumC1260a enumC1260a3 = EnumC1260a.f11060c;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, enumC1260a2, enumC1260a3)) {
                if (atomicReferenceFieldUpdater2.get(this) != enumC1260a2) {
                    break;
                }
            }
            this.f10722a.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f10722a;
    }
}
