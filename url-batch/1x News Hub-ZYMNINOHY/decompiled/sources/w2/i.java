package w2;

import K.C0053q;
import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;

/* loaded from: classes.dex */
public final class i implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0.e f10658a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0053q f10659b;

    public i(C0.e eVar, C0053q c0053q) {
        this.f10658a = eVar;
        this.f10659b = c0053q;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // w2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(e eVar, InterfaceC0300c interfaceC0300c) {
        h hVar;
        EnumC0317a enumC0317a;
        int i3;
        i iVar;
        s sVar;
        C0053q c0053q;
        x2.m mVar;
        Throwable th;
        x2.m mVar2;
        C0053q c0053q2;
        try {
            if (interfaceC0300c instanceof h) {
                hVar = (h) interfaceC0300c;
                int i4 = hVar.f10655e;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    hVar.f10655e = i4 - Integer.MIN_VALUE;
                    Object obj = hVar.f10654d;
                    enumC0317a = EnumC0317a.f4969a;
                    i3 = hVar.f10655e;
                    if (i3 != 0) {
                        android.support.v4.media.session.a.T(obj);
                        try {
                            C0.e eVar2 = this.f10658a;
                            hVar.f10656g = this;
                            hVar.f10657h = eVar;
                            hVar.f10655e = 1;
                            if (eVar2.n(eVar, hVar) != enumC0317a) {
                                iVar = this;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            iVar = this;
                            sVar = new s(th);
                            c0053q = iVar.f10659b;
                            hVar.f10656g = th;
                            hVar.f10657h = null;
                            hVar.f10655e = 2;
                            if (q.a(sVar, c0053q, th, hVar) != enumC0317a) {
                                return enumC0317a;
                            }
                            throw th;
                        }
                        return enumC0317a;
                    }
                    if (i3 != 1) {
                        if (i3 == 2) {
                            Throwable th3 = (Throwable) hVar.f10656g;
                            android.support.v4.media.session.a.T(obj);
                            throw th3;
                        }
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mVar2 = (x2.m) hVar.f10656g;
                        try {
                            android.support.v4.media.session.a.T(obj);
                            mVar2.h();
                            return C0195i.f2555a;
                        } catch (Throwable th4) {
                            th = th4;
                            mVar2.h();
                            throw th;
                        }
                    }
                    eVar = hVar.f10657h;
                    iVar = (i) hVar.f10656g;
                    try {
                        android.support.v4.media.session.a.T(obj);
                    } catch (Throwable th5) {
                        th = th5;
                        sVar = new s(th);
                        c0053q = iVar.f10659b;
                        hVar.f10656g = th;
                        hVar.f10657h = null;
                        hVar.f10655e = 2;
                        if (q.a(sVar, c0053q, th, hVar) != enumC0317a) {
                        }
                    }
                    d2.h hVar2 = hVar.f4981b;
                    kotlin.jvm.internal.j.b(hVar2);
                    mVar = new x2.m(eVar, hVar2);
                    c0053q2 = iVar.f10659b;
                    hVar.f10656g = mVar;
                    hVar.f10657h = null;
                    hVar.f10655e = 3;
                    if (c0053q2.i(mVar, null, hVar) != enumC0317a) {
                        mVar2 = mVar;
                        mVar2.h();
                        return C0195i.f2555a;
                    }
                    return enumC0317a;
                }
            }
            c0053q2 = iVar.f10659b;
            hVar.f10656g = mVar;
            hVar.f10657h = null;
            hVar.f10655e = 3;
            if (c0053q2.i(mVar, null, hVar) != enumC0317a) {
            }
            return enumC0317a;
        } catch (Throwable th6) {
            th = th6;
            mVar2 = mVar;
            mVar2.h();
            throw th;
        }
        hVar = new h(this, interfaceC0300c);
        Object obj2 = hVar.f10654d;
        enumC0317a = EnumC0317a.f4969a;
        i3 = hVar.f10655e;
        if (i3 != 0) {
        }
        d2.h hVar22 = hVar.f4981b;
        kotlin.jvm.internal.j.b(hVar22);
        mVar = new x2.m(eVar, hVar22);
    }
}
