package u;

import x1.u1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final float f7095a = ((float) 0.125d) / 18;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0169 -> B:11:0x016f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(q1.r rVar, long j7, int i, b6.j0 j0Var, i6.a aVar) {
        p pVar;
        int i8;
        q1.r rVar2;
        float d8;
        q6.r rVar3;
        i1 i1Var;
        p6.e eVar;
        q6.r rVar4;
        q1.r rVar5;
        q6.r rVar6;
        int size;
        int i9;
        q1.k kVar;
        q1.k kVar2;
        q1.k kVar3;
        Object obj;
        int i10;
        Object a8;
        if (aVar instanceof p) {
            pVar = (p) aVar;
            int i11 = pVar.f7056n;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                pVar.f7056n = i11 - Integer.MIN_VALUE;
                Object obj2 = pVar.f7055m;
                i8 = pVar.f7056n;
                int i12 = 1;
                q1.k kVar4 = null;
                h6.a aVar2 = h6.a.f3204d;
                if (i8 != 0) {
                    s6.a.K(obj2);
                    rVar2 = rVar;
                    if (c(rVar2.i.f6032v, j7)) {
                        return null;
                    }
                    d8 = d(rVar2.d(), i);
                    rVar3 = new q6.r();
                    rVar3.f6204d = j7;
                    i1Var = new i1(0L, j0.f7028e);
                    eVar = j0Var;
                    pVar.f7050g = eVar;
                    pVar.f7051h = rVar2;
                    pVar.i = rVar3;
                    pVar.f7052j = i1Var;
                    pVar.f7053k = kVar4;
                    pVar.f7054l = d8;
                    pVar.f7056n = i12;
                    a8 = rVar2.a(q1.g.f5989e, pVar);
                    if (a8 != aVar2) {
                    }
                    return aVar2;
                }
                if (i8 == 1) {
                    float f6 = pVar.f7054l;
                    i1Var = pVar.f7052j;
                    q6.r rVar7 = pVar.i;
                    rVar5 = pVar.f7051h;
                    p6.e eVar2 = pVar.f7050g;
                    s6.a.K(obj2);
                    rVar4 = rVar7;
                    d8 = f6;
                    eVar = eVar2;
                    rVar6 = rVar4;
                    q1.f fVar = (q1.f) obj2;
                    ?? r13 = fVar.f5986a;
                    size = r13.size();
                    int i13 = 0;
                    i9 = 0;
                    while (true) {
                        if (i9 < size) {
                        }
                        i9 = i10 + 1;
                        kVar4 = kVar;
                    }
                    kVar3 = kVar2;
                    if (kVar3 != null) {
                        return kVar;
                    }
                    if (h0.a.l(kVar3)) {
                    }
                    pVar.f7050g = eVar;
                    pVar.f7051h = rVar2;
                    pVar.i = rVar3;
                    pVar.f7052j = i1Var;
                    pVar.f7053k = kVar4;
                    pVar.f7054l = d8;
                    pVar.f7056n = i12;
                    a8 = rVar2.a(q1.g.f5989e, pVar);
                    if (a8 != aVar2) {
                    }
                    return aVar2;
                }
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                float f8 = pVar.f7054l;
                q1.k kVar5 = pVar.f7053k;
                i1 i1Var2 = pVar.f7052j;
                q6.r rVar8 = pVar.i;
                q1.r rVar9 = pVar.f7051h;
                p6.e eVar3 = pVar.f7050g;
                s6.a.K(obj2);
                rVar6 = rVar8;
                rVar5 = rVar9;
                char c8 = 2;
                kVar = null;
                long j8 = 0;
                float f9 = f8;
                eVar = eVar3;
                if (!kVar5.b()) {
                    return kVar;
                }
                i1Var = i1Var2;
                d8 = f9;
                kVar4 = kVar;
                i12 = 1;
                rVar2 = rVar5;
                rVar3 = rVar6;
                pVar.f7050g = eVar;
                pVar.f7051h = rVar2;
                pVar.i = rVar3;
                pVar.f7052j = i1Var;
                pVar.f7053k = kVar4;
                pVar.f7054l = d8;
                pVar.f7056n = i12;
                a8 = rVar2.a(q1.g.f5989e, pVar);
                if (a8 != aVar2) {
                    rVar4 = rVar3;
                    rVar5 = rVar2;
                    obj2 = a8;
                    rVar6 = rVar4;
                    q1.f fVar2 = (q1.f) obj2;
                    ?? r132 = fVar2.f5986a;
                    size = r132.size();
                    int i132 = 0;
                    i9 = 0;
                    while (true) {
                        if (i9 < size) {
                            kVar = kVar4;
                            kVar2 = kVar;
                            break;
                        }
                        kVar2 = r132.get(i9);
                        kVar = kVar4;
                        i10 = i9;
                        if (m.a.s(((q1.k) kVar2).f5994a, rVar6.f6204d)) {
                            break;
                        }
                        i9 = i10 + 1;
                        kVar4 = kVar;
                    }
                    kVar3 = kVar2;
                    if (kVar3 != null || kVar3.b()) {
                        return kVar;
                    }
                    if (h0.a.l(kVar3)) {
                        long a9 = i1Var.a(kVar3, d8);
                        if ((9223372034707292159L & a9) != 9205357640488583168L) {
                            eVar.g(kVar3, new Float(Float.intBitsToFloat((int) (a9 >> 32))));
                            if (kVar3.b()) {
                                return kVar3;
                            }
                            i1Var.f7024b = 0L;
                            rVar2 = rVar5;
                            rVar3 = rVar6;
                            kVar4 = kVar;
                            i12 = 1;
                        } else {
                            j8 = 0;
                            pVar.f7050g = eVar;
                            pVar.f7051h = rVar5;
                            pVar.i = rVar6;
                            pVar.f7052j = i1Var;
                            pVar.f7053k = kVar3;
                            pVar.f7054l = d8;
                            c8 = 2;
                            pVar.f7056n = 2;
                            if (rVar5.a(q1.g.f5990f, pVar) != aVar2) {
                                float f10 = d8;
                                i1Var2 = i1Var;
                                kVar5 = kVar3;
                                f9 = f10;
                                if (!kVar5.b()) {
                                }
                            }
                        }
                    } else {
                        ?? r22 = fVar2.f5986a;
                        int size2 = r22.size();
                        while (true) {
                            if (i132 >= size2) {
                                obj = kVar;
                                break;
                            }
                            obj = r22.get(i132);
                            if (((q1.k) obj).f5997d) {
                                break;
                            }
                            i132++;
                        }
                        q1.k kVar6 = (q1.k) obj;
                        if (kVar6 == null) {
                            return kVar;
                        }
                        rVar6.f6204d = kVar6.f5994a;
                        rVar2 = rVar5;
                        rVar3 = rVar6;
                        kVar4 = kVar;
                        i12 = 1;
                    }
                    pVar.f7050g = eVar;
                    pVar.f7051h = rVar2;
                    pVar.i = rVar3;
                    pVar.f7052j = i1Var;
                    pVar.f7053k = kVar4;
                    pVar.f7054l = d8;
                    pVar.f7056n = i12;
                    a8 = rVar2.a(q1.g.f5989e, pVar);
                    if (a8 != aVar2) {
                    }
                }
                return aVar2;
            }
        }
        pVar = new p(aVar);
        Object obj22 = pVar.f7055m;
        i8 = pVar.f7056n;
        int i122 = 1;
        q1.k kVar42 = null;
        h6.a aVar22 = h6.a.f3204d;
        if (i8 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f0, code lost:
    
        if (r0 == 0.0f) goto L56;
     */
    /* JADX WARN: Path cross not found for [B:40:0x00ab, B:52:0x00ce], limit reached: 70 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0079 -> B:10:0x007e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(q1.r rVar, long j7, a0.t tVar, i6.a aVar) {
        s sVar;
        int i;
        q1.r rVar2;
        long j8;
        j0 j0Var;
        s sVar2;
        p6.c cVar;
        q1.k kVar;
        q6.r rVar3;
        j0 j0Var2;
        q1.r rVar4;
        Object a8;
        h6.a aVar2;
        Object obj;
        float intBitsToFloat;
        Object obj2;
        if (aVar instanceof s) {
            sVar = (s) aVar;
            int i8 = sVar.f7091m;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                sVar.f7091m = i8 - Integer.MIN_VALUE;
                Object obj3 = sVar.f7090l;
                i = sVar.f7091m;
                if (i != 0) {
                    s6.a.K(obj3);
                    rVar2 = rVar;
                    j8 = j7;
                    if (!c(rVar2.i.f6032v, j8)) {
                        j0Var = j0.f7028e;
                        sVar2 = sVar;
                        cVar = tVar;
                        rVar3 = new q6.r();
                        rVar3.f6204d = j8;
                        rVar4 = rVar2;
                        j0Var2 = j0Var;
                        sVar2.f7086g = cVar;
                        sVar2.f7087h = rVar2;
                        sVar2.i = j0Var2;
                        sVar2.f7088j = rVar4;
                        sVar2.f7089k = rVar3;
                        sVar2.f7091m = 1;
                        a8 = rVar4.a(q1.g.f5989e, sVar2);
                        aVar2 = h6.a.f3204d;
                        if (a8 == aVar2) {
                        }
                    }
                    kVar = null;
                    return Boolean.valueOf(kVar != null);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q6.r rVar5 = sVar.f7089k;
                rVar4 = sVar.f7088j;
                j0Var2 = sVar.i;
                q1.r rVar6 = sVar.f7087h;
                p6.c cVar2 = sVar.f7086g;
                s6.a.K(obj3);
                sVar2 = sVar;
                cVar = cVar2;
                rVar3 = rVar5;
                q1.f fVar = (q1.f) obj3;
                ?? r10 = fVar.f5986a;
                int size = r10.size();
                int i9 = 0;
                while (true) {
                    if (i9 < size) {
                        obj = null;
                        break;
                    }
                    obj = r10.get(i9);
                    if (m.a.s(((q1.k) obj).f5994a, rVar3.f6204d)) {
                        break;
                    }
                    i9++;
                }
                q1.k kVar2 = (q1.k) obj;
                if (kVar2 == null) {
                    if (h0.a.l(kVar2)) {
                        ?? r02 = fVar.f5986a;
                        int size2 = r02.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size2) {
                                obj2 = null;
                                break;
                            }
                            obj2 = r02.get(i10);
                            if (((q1.k) obj2).f5997d) {
                                break;
                            }
                            i10++;
                        }
                        q1.k kVar3 = (q1.k) obj2;
                        if (kVar3 != null) {
                            rVar3.f6204d = kVar3.f5994a;
                            rVar2 = rVar6;
                            sVar2.f7086g = cVar;
                            sVar2.f7087h = rVar2;
                            sVar2.i = j0Var2;
                            sVar2.f7088j = rVar4;
                            sVar2.f7089k = rVar3;
                            sVar2.f7091m = 1;
                            a8 = rVar4.a(q1.g.f5989e, sVar2);
                            aVar2 = h6.a.f3204d;
                            if (a8 == aVar2) {
                                return aVar2;
                            }
                            rVar6 = rVar2;
                            obj3 = a8;
                            q1.f fVar2 = (q1.f) obj3;
                            ?? r102 = fVar2.f5986a;
                            int size3 = r102.size();
                            int i92 = 0;
                            while (true) {
                                if (i92 < size3) {
                                }
                                i92++;
                            }
                            q1.k kVar22 = (q1.k) obj;
                            if (kVar22 == null) {
                                kVar22 = null;
                            }
                        }
                    } else {
                        long R = h0.a.R(kVar22, true);
                        if (j0Var2 != null) {
                            intBitsToFloat = Float.intBitsToFloat((int) (j0Var2 == j0.f7027d ? R & 4294967295L : R >> 32));
                        } else {
                            intBitsToFloat = e1.b.c(R);
                        }
                    }
                }
                if (kVar22 != null && !kVar22.b()) {
                    if (h0.a.l(kVar22)) {
                        kVar = kVar22;
                        return Boolean.valueOf(kVar != null);
                    }
                    cVar.i(kVar22);
                    rVar2 = rVar6;
                    j0Var = j0Var2;
                    j8 = kVar22.f5994a;
                    rVar3 = new q6.r();
                    rVar3.f6204d = j8;
                    rVar4 = rVar2;
                    j0Var2 = j0Var;
                    sVar2.f7086g = cVar;
                    sVar2.f7087h = rVar2;
                    sVar2.i = j0Var2;
                    sVar2.f7088j = rVar4;
                    sVar2.f7089k = rVar3;
                    sVar2.f7091m = 1;
                    a8 = rVar4.a(q1.g.f5989e, sVar2);
                    aVar2 = h6.a.f3204d;
                    if (a8 == aVar2) {
                    }
                }
                kVar = null;
                return Boolean.valueOf(kVar != null);
            }
        }
        sVar = new s(aVar);
        Object obj32 = sVar.f7090l;
        i = sVar.f7091m;
        if (i != 0) {
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final boolean c(q1.f fVar, long j7) {
        Object obj;
        ?? r62 = fVar.f5986a;
        int size = r62.size();
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = r62.get(i);
            if (m.a.s(((q1.k) obj).f5994a, j7)) {
                break;
            }
            i++;
        }
        q1.k kVar = (q1.k) obj;
        if (kVar != null && kVar.f5997d) {
            z3 = true;
        }
        return true ^ z3;
    }

    public static final float d(u1 u1Var, int i) {
        return i == 2 ? u1Var.b() * f7095a : u1Var.b();
    }
}
