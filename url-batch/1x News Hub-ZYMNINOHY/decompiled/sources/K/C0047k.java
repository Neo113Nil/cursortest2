package K;

import e2.EnumC0317a;
import f2.AbstractC0326c;

/* renamed from: K.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0047k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B2.a f786a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.o f787b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.q f788c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N f789d;

    public C0047k(B2.a aVar, kotlin.jvm.internal.o oVar, kotlin.jvm.internal.q qVar, N n3) {
        this.f786a = aVar;
        this.f787b = oVar;
        this.f788c = qVar;
        this.f789d = n3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ae, B:30:0x00b6), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d9, B:46:0x00e0), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d9 A[Catch: all -> 0x00d6, TRY_ENTER, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d9, B:46:0x00e0), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v2, types: [B2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C0043g c0043g, AbstractC0326c abstractC0326c) {
        C0046j c0046j;
        int i3;
        N n3;
        B2.d dVar;
        kotlin.jvm.internal.o oVar;
        kotlin.jvm.internal.q qVar;
        l2.p pVar;
        B2.a aVar;
        B2.a aVar2;
        N n4;
        Object obj;
        kotlin.jvm.internal.q qVar2;
        try {
            if (abstractC0326c instanceof C0046j) {
                c0046j = (C0046j) abstractC0326c;
                int i4 = c0046j.f784k;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0046j.f784k = i4 - Integer.MIN_VALUE;
                    Object obj2 = c0046j.f782i;
                    EnumC0317a enumC0317a = EnumC0317a.f4969a;
                    i3 = c0046j.f784k;
                    if (i3 != 0) {
                        android.support.v4.media.session.a.T(obj2);
                        c0046j.f778d = c0043g;
                        B2.a aVar3 = this.f786a;
                        c0046j.f779e = aVar3;
                        kotlin.jvm.internal.o oVar2 = this.f787b;
                        c0046j.f = oVar2;
                        kotlin.jvm.internal.q qVar3 = this.f788c;
                        c0046j.f780g = qVar3;
                        n3 = this.f789d;
                        c0046j.f781h = n3;
                        c0046j.f784k = 1;
                        dVar = (B2.d) aVar3;
                        if (dVar.c(c0046j) != enumC0317a) {
                            oVar = oVar2;
                            qVar = qVar3;
                            pVar = c0043g;
                        }
                        return enumC0317a;
                    }
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = c0046j.f;
                            qVar2 = (kotlin.jvm.internal.q) c0046j.f779e;
                            aVar = (B2.a) c0046j.f778d;
                            try {
                                android.support.v4.media.session.a.T(obj2);
                                qVar2.f9692a = obj;
                                qVar = qVar2;
                                Object obj3 = qVar.f9692a;
                                ((B2.d) aVar).e(null);
                                return obj3;
                            } catch (Throwable th) {
                                th = th;
                                ((B2.d) aVar).e(null);
                                throw th;
                            }
                        }
                        n4 = (N) c0046j.f;
                        qVar = (kotlin.jvm.internal.q) c0046j.f779e;
                        aVar2 = (B2.a) c0046j.f778d;
                        try {
                            android.support.v4.media.session.a.T(obj2);
                            if (!kotlin.jvm.internal.j.a(obj2, qVar.f9692a)) {
                                aVar = aVar2;
                                Object obj32 = qVar.f9692a;
                                ((B2.d) aVar).e(null);
                                return obj32;
                            }
                            c0046j.f778d = aVar2;
                            c0046j.f779e = qVar;
                            c0046j.f = obj2;
                            c0046j.f784k = 3;
                            if (n4.j(obj2, false, c0046j) != enumC0317a) {
                                obj = obj2;
                                qVar2 = qVar;
                                aVar = aVar2;
                                qVar2.f9692a = obj;
                                qVar = qVar2;
                                Object obj322 = qVar.f9692a;
                                ((B2.d) aVar).e(null);
                                return obj322;
                            }
                            return enumC0317a;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar = aVar2;
                            ((B2.d) aVar).e(null);
                            throw th;
                        }
                    }
                    N n5 = c0046j.f781h;
                    qVar = c0046j.f780g;
                    oVar = (kotlin.jvm.internal.o) c0046j.f;
                    ?? r7 = (B2.a) c0046j.f779e;
                    l2.p pVar2 = (l2.p) c0046j.f778d;
                    android.support.v4.media.session.a.T(obj2);
                    n3 = n5;
                    pVar = pVar2;
                    dVar = r7;
                    if (!oVar.f9690a) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = qVar.f9692a;
                    c0046j.f778d = dVar;
                    c0046j.f779e = qVar;
                    c0046j.f = n3;
                    c0046j.f780g = null;
                    c0046j.f781h = null;
                    c0046j.f784k = 2;
                    Object invoke = pVar.invoke(obj4, c0046j);
                    if (invoke != enumC0317a) {
                        aVar2 = dVar;
                        obj2 = invoke;
                        n4 = n3;
                        if (!kotlin.jvm.internal.j.a(obj2, qVar.f9692a)) {
                        }
                    }
                    return enumC0317a;
                }
            }
            if (!oVar.f9690a) {
            }
        } catch (Throwable th3) {
            th = th3;
            aVar = dVar;
            ((B2.d) aVar).e(null);
            throw th;
        }
        c0046j = new C0046j(this, abstractC0326c);
        Object obj22 = c0046j.f782i;
        EnumC0317a enumC0317a2 = EnumC0317a.f4969a;
        i3 = c0046j.f784k;
        if (i3 != 0) {
        }
    }
}
