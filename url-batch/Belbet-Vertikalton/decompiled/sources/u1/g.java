package u1;

import V.q;
import b1.EnumC0098a;
import c1.AbstractC0106c;
import t1.i;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final q f4396a = new q("NONE", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final q f4397b = new q("PENDING", 1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:12:0x002e, B:14:0x0055, B:19:0x006a, B:21:0x0072, B:32:0x0046, B:34:0x004d), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r7v5, types: [t1.n] */
    /* JADX WARN: Type inference failed for: r7v7, types: [t1.n] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0084 -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, t1.b bVar, boolean z2, AbstractC0106c abstractC0106c) {
        d dVar;
        int i;
        t1.a aVar;
        t1.b bVar2;
        t1.a aVar2;
        c cVar2;
        Object b2;
        try {
            if (abstractC0106c instanceof d) {
                dVar = (d) abstractC0106c;
                int i2 = dVar.f4387f;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dVar.f4387f = i2 - Integer.MIN_VALUE;
                    Object obj = dVar.e;
                    EnumC0098a enumC0098a = EnumC0098a.f2223a;
                    i = dVar.f4387f;
                    if (i != 0) {
                        H1.d.i0(obj);
                        bVar.getClass();
                        aVar = new t1.a(bVar);
                        bVar = bVar;
                        dVar.f4383a = cVar;
                        dVar.f4384b = bVar;
                        dVar.f4385c = aVar;
                        dVar.f4386d = z2;
                        dVar.f4387f = 1;
                        b2 = aVar.b(dVar);
                        if (b2 == enumC0098a) {
                        }
                    } else if (i == 1) {
                        z2 = dVar.f4386d;
                        aVar2 = dVar.f4385c;
                        ?? r7 = dVar.f4384b;
                        cVar2 = dVar.f4383a;
                        H1.d.i0(obj);
                        bVar2 = r7;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z2 = dVar.f4386d;
                        aVar2 = dVar.f4385c;
                        ?? r72 = dVar.f4384b;
                        cVar2 = dVar.f4383a;
                        H1.d.i0(obj);
                        t1.b bVar3 = r72;
                        aVar = aVar2;
                        cVar = cVar2;
                        bVar = bVar3;
                        dVar.f4383a = cVar;
                        dVar.f4384b = bVar;
                        dVar.f4385c = aVar;
                        dVar.f4386d = z2;
                        dVar.f4387f = 1;
                        b2 = aVar.b(dVar);
                        if (b2 == enumC0098a) {
                            return enumC0098a;
                        }
                        cVar2 = cVar;
                        aVar2 = aVar;
                        obj = b2;
                        bVar2 = bVar;
                        if (((Boolean) obj).booleanValue()) {
                            if (z2) {
                                i.b(bVar2, null);
                            }
                            return W0.i.f1345a;
                        }
                        Object c2 = aVar2.c();
                        dVar.f4383a = cVar2;
                        dVar.f4384b = bVar2;
                        dVar.f4385c = aVar2;
                        dVar.f4386d = z2;
                        dVar.f4387f = 2;
                        bVar3 = bVar2;
                        if (cVar2.emit(c2, dVar) == enumC0098a) {
                            return enumC0098a;
                        }
                        aVar = aVar2;
                        cVar = cVar2;
                        bVar = bVar3;
                        dVar.f4383a = cVar;
                        dVar.f4384b = bVar;
                        dVar.f4385c = aVar;
                        dVar.f4386d = z2;
                        dVar.f4387f = 1;
                        b2 = aVar.b(dVar);
                        if (b2 == enumC0098a) {
                        }
                    }
                }
            }
            if (i != 0) {
            }
        } finally {
        }
        dVar = new d(abstractC0106c);
        Object obj2 = dVar.e;
        EnumC0098a enumC0098a2 = EnumC0098a.f2223a;
        i = dVar.f4387f;
    }
}
