package o5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k5.C0478h;
import p5.EnumC0580a;

/* renamed from: o5.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0571k implements InterfaceC0564d, q5.d {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5621g = AtomicReferenceFieldUpdater.newUpdater(C0571k.class, Object.class, "result");

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0564d f5622f;
    private volatile Object result;

    public C0571k(InterfaceC0564d interfaceC0564d) {
        EnumC0580a enumC0580a = EnumC0580a.f5698g;
        this.f5622f = interfaceC0564d;
        this.result = enumC0580a;
    }

    public final Object a() {
        Object obj = this.result;
        EnumC0580a enumC0580a = EnumC0580a.f5698g;
        if (obj == enumC0580a) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5621g;
            EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC0580a, enumC0580a2)) {
                if (atomicReferenceFieldUpdater.get(this) != enumC0580a) {
                    obj = this.result;
                }
            }
            return EnumC0580a.f5697f;
        }
        if (obj == EnumC0580a.f5699h) {
            return EnumC0580a.f5697f;
        }
        if (obj instanceof C0478h) {
            throw ((C0478h) obj).f5200f;
        }
        return obj;
    }

    @Override // q5.d
    public final q5.d getCallerFrame() {
        InterfaceC0564d interfaceC0564d = this.f5622f;
        if (interfaceC0564d instanceof q5.d) {
            return (q5.d) interfaceC0564d;
        }
        return null;
    }

    @Override // o5.InterfaceC0564d
    public final InterfaceC0569i getContext() {
        return this.f5622f.getContext();
    }

    @Override // o5.InterfaceC0564d
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC0580a enumC0580a = EnumC0580a.f5698g;
            if (obj2 == enumC0580a) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5621g;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC0580a, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != enumC0580a) {
                        break;
                    }
                }
                return;
            }
            EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
            if (obj2 != enumC0580a2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5621g;
            EnumC0580a enumC0580a3 = EnumC0580a.f5699h;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, enumC0580a2, enumC0580a3)) {
                if (atomicReferenceFieldUpdater2.get(this) != enumC0580a2) {
                    break;
                }
            }
            this.f5622f.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f5622f;
    }
}
