package X;

import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W7.a f3609a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.p f3610b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.r f3611c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D f3612d;

    public v(W7.a aVar, kotlin.jvm.internal.p pVar, kotlin.jvm.internal.r rVar, D d2) {
        this.f3609a = aVar;
        this.f3610b = pVar;
        this.f3611c = rVar;
        this.f3612d = d2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ae, B:30:0x00b6), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: all -> 0x00d5, TRY_LEAVE, TryCatch #1 {all -> 0x00d5, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d8, B:46:0x00df), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8 A[Catch: all -> 0x00d5, TRY_ENTER, TryCatch #1 {all -> 0x00d5, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d8, B:46:0x00df), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v2, types: [W7.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C0405e c0405e, AbstractC5219c abstractC5219c) {
        u uVar;
        int i;
        D d2;
        W7.d dVar;
        kotlin.jvm.internal.p pVar;
        kotlin.jvm.internal.r rVar;
        E7.p pVar2;
        W7.a aVar;
        W7.a aVar2;
        D d3;
        Object obj;
        kotlin.jvm.internal.r rVar2;
        try {
            if (abstractC5219c instanceof u) {
                uVar = (u) abstractC5219c;
                int i4 = uVar.f3601A;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    uVar.f3601A = i4 - Integer.MIN_VALUE;
                    Object obj2 = uVar.f3607y;
                    EnumC5179a enumC5179a = EnumC5179a.f41704n;
                    i = uVar.f3601A;
                    if (i != 0) {
                        com.bumptech.glide.f.r(obj2);
                        uVar.f3602n = c0405e;
                        W7.a aVar3 = this.f3609a;
                        uVar.f3603u = aVar3;
                        kotlin.jvm.internal.p pVar3 = this.f3610b;
                        uVar.f3604v = pVar3;
                        kotlin.jvm.internal.r rVar3 = this.f3611c;
                        uVar.f3605w = rVar3;
                        d2 = this.f3612d;
                        uVar.f3606x = d2;
                        uVar.f3601A = 1;
                        dVar = (W7.d) aVar3;
                        if (dVar.c(uVar) != enumC5179a) {
                            pVar = pVar3;
                            rVar = rVar3;
                            pVar2 = c0405e;
                        }
                        return enumC5179a;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = uVar.f3604v;
                            rVar2 = (kotlin.jvm.internal.r) uVar.f3603u;
                            aVar = (W7.a) uVar.f3602n;
                            try {
                                com.bumptech.glide.f.r(obj2);
                                rVar2.f38861n = obj;
                                rVar = rVar2;
                                Object obj3 = rVar.f38861n;
                                ((W7.d) aVar).d(null);
                                return obj3;
                            } catch (Throwable th) {
                                th = th;
                                ((W7.d) aVar).d(null);
                                throw th;
                            }
                        }
                        d3 = (D) uVar.f3604v;
                        rVar = (kotlin.jvm.internal.r) uVar.f3603u;
                        aVar2 = (W7.a) uVar.f3602n;
                        try {
                            com.bumptech.glide.f.r(obj2);
                            if (!kotlin.jvm.internal.h.a(obj2, rVar.f38861n)) {
                                aVar = aVar2;
                                Object obj32 = rVar.f38861n;
                                ((W7.d) aVar).d(null);
                                return obj32;
                            }
                            uVar.f3602n = aVar2;
                            uVar.f3603u = rVar;
                            uVar.f3604v = obj2;
                            uVar.f3601A = 3;
                            if (d3.j(obj2, uVar) != enumC5179a) {
                                obj = obj2;
                                rVar2 = rVar;
                                aVar = aVar2;
                                rVar2.f38861n = obj;
                                rVar = rVar2;
                                Object obj322 = rVar.f38861n;
                                ((W7.d) aVar).d(null);
                                return obj322;
                            }
                            return enumC5179a;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar = aVar2;
                            ((W7.d) aVar).d(null);
                            throw th;
                        }
                    }
                    D d9 = uVar.f3606x;
                    rVar = uVar.f3605w;
                    pVar = (kotlin.jvm.internal.p) uVar.f3604v;
                    ?? r72 = (W7.a) uVar.f3603u;
                    E7.p pVar4 = (E7.p) uVar.f3602n;
                    com.bumptech.glide.f.r(obj2);
                    d2 = d9;
                    pVar2 = pVar4;
                    dVar = r72;
                    if (!pVar.f38859n) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = rVar.f38861n;
                    uVar.f3602n = dVar;
                    uVar.f3603u = rVar;
                    uVar.f3604v = d2;
                    uVar.f3605w = null;
                    uVar.f3606x = null;
                    uVar.f3601A = 2;
                    Object invoke = pVar2.invoke(obj4, uVar);
                    if (invoke != enumC5179a) {
                        aVar2 = dVar;
                        obj2 = invoke;
                        d3 = d2;
                        if (!kotlin.jvm.internal.h.a(obj2, rVar.f38861n)) {
                        }
                    }
                    return enumC5179a;
                }
            }
            if (!pVar.f38859n) {
            }
        } catch (Throwable th3) {
            th = th3;
            aVar = dVar;
            ((W7.d) aVar).d(null);
            throw th;
        }
        uVar = new u(this, abstractC5219c);
        Object obj22 = uVar.f3607y;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = uVar.f3601A;
        if (i != 0) {
        }
    }
}
