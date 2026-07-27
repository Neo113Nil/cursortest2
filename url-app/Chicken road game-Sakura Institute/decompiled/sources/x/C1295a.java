package x;

import E2.i;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l0.AbstractC0819q;
import l0.C0800A;
import l0.C0811i;
import l0.EnumC0812j;
import l0.r;
import l0.s;
import o.R0;
import y2.AbstractC1343r;

/* renamed from: x.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1295a extends i implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public s f11390i;

    /* renamed from: j, reason: collision with root package name */
    public EnumC0812j f11391j;

    /* renamed from: k, reason: collision with root package name */
    public int f11392k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f11393l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1297c f11394m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1295a(C1297c c1297c, C2.a aVar) {
        super(2, aVar);
        this.f11394m = c1297c;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C1295a) j((C2.a) obj2, (C0800A) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C1295a c1295a = new C1295a(this.f11394m, aVar);
        c1295a.f11393l = obj;
        return c1295a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x014f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x015b  */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x014d -> B:7:0x0150). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00c5 -> B:29:0x00c8). Please report as a decompilation issue!!! */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        C0800A c0800a;
        Object b4;
        C0800A c0800a2;
        EnumC0812j enumC0812j;
        s sVar;
        Object a4;
        int size;
        int i2;
        List list;
        Object obj2;
        s sVar2;
        s sVar3;
        C0800A c0800a3;
        List list2;
        Object a5;
        int size2;
        int i4;
        Object obj3;
        s sVar4;
        D2.a aVar = D2.a.f2163d;
        int i5 = this.f11392k;
        C1297c c1297c = this.f11394m;
        EnumC0812j enumC0812j2 = EnumC0812j.f7910d;
        int i6 = 2;
        if (i5 == 0) {
            AbstractC1343r.b(obj);
            c0800a = (C0800A) this.f11393l;
            this.f11393l = c0800a;
            this.f11392k = 1;
            b4 = R0.b(c0800a, true, enumC0812j2, this);
            if (b4 == aVar) {
                return aVar;
            }
        } else if (i5 == 1) {
            c0800a = (C0800A) this.f11393l;
            AbstractC1343r.b(obj);
            b4 = obj;
        } else {
            if (i5 == 2) {
                enumC0812j = this.f11391j;
                sVar = this.f11390i;
                c0800a2 = (C0800A) this.f11393l;
                AbstractC1343r.b(obj);
                a4 = obj;
                ?? r7 = ((C0811i) a4).f7907a;
                size = r7.size();
                i2 = 0;
                list = r7;
                while (true) {
                    if (i2 >= size) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i2);
                    s sVar5 = (s) obj2;
                    if (!sVar5.b()) {
                        list2 = list;
                        if (r.a(sVar5.f7923a, sVar.f7923a) && sVar5.f7926d) {
                            break;
                        }
                    } else {
                        list2 = list;
                    }
                    i2++;
                    list = list2;
                }
                sVar2 = (s) obj2;
                if (sVar2 != null) {
                    if (sVar2.f7924b - sVar.f7924b < c0800a2.d().f()) {
                        if (Y.c.c(Y.c.g(sVar2.f7925c, sVar.f7925c)) <= c0800a2.d().b()) {
                            i6 = 2;
                            this.f11393l = c0800a2;
                            this.f11390i = sVar;
                            this.f11391j = enumC0812j;
                            this.f11392k = i6;
                            a4 = c0800a2.a(enumC0812j, this);
                            if (a4 == aVar) {
                                return aVar;
                            }
                            ?? r72 = ((C0811i) a4).f7907a;
                            size = r72.size();
                            i2 = 0;
                            list = r72;
                            while (true) {
                                if (i2 >= size) {
                                }
                                i2++;
                                list = list2;
                            }
                            sVar2 = (s) obj2;
                            if (sVar2 != null) {
                            }
                        }
                        if (sVar2 != null || !((Boolean) c1297c.f11398v.invoke()).booleanValue()) {
                            return Unit.f7487a;
                        }
                        sVar2.a();
                        sVar3 = sVar;
                        c0800a3 = c0800a2;
                        this.f11393l = c0800a3;
                        this.f11390i = sVar3;
                        this.f11391j = null;
                        this.f11392k = 3;
                        a5 = c0800a3.a(enumC0812j2, this);
                        if (a5 == aVar) {
                        }
                        ?? r5 = ((C0811i) a5).f7907a;
                        size2 = r5.size();
                        i4 = 0;
                        while (true) {
                            if (i4 >= size2) {
                            }
                            i4++;
                        }
                        sVar4 = (s) obj3;
                        if (sVar4 == null) {
                        }
                    }
                }
                sVar2 = null;
                if (sVar2 != null) {
                }
                return Unit.f7487a;
            }
            if (i5 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar3 = this.f11390i;
            c0800a3 = (C0800A) this.f11393l;
            AbstractC1343r.b(obj);
            a5 = obj;
            ?? r52 = ((C0811i) a5).f7907a;
            size2 = r52.size();
            i4 = 0;
            while (true) {
                if (i4 >= size2) {
                    obj3 = null;
                    break;
                }
                obj3 = r52.get(i4);
                s sVar6 = (s) obj3;
                if (!sVar6.b()) {
                    if (r.a(sVar6.f7923a, sVar3.f7923a) && sVar6.f7926d) {
                        break;
                    }
                }
                i4++;
            }
            sVar4 = (s) obj3;
            if (sVar4 == null) {
                return Unit.f7487a;
            }
            sVar4.a();
            this.f11393l = c0800a3;
            this.f11390i = sVar3;
            this.f11391j = null;
            this.f11392k = 3;
            a5 = c0800a3.a(enumC0812j2, this);
            if (a5 == aVar) {
                return aVar;
            }
            ?? r522 = ((C0811i) a5).f7907a;
            size2 = r522.size();
            i4 = 0;
            while (true) {
                if (i4 >= size2) {
                }
                i4++;
            }
            sVar4 = (s) obj3;
            if (sVar4 == null) {
            }
        }
        s sVar7 = (s) b4;
        if (!AbstractC0819q.e(sVar7.f7931i, 3) && !AbstractC0819q.e(sVar7.f7931i, 4)) {
            return Unit.f7487a;
        }
        long j4 = sVar7.f7925c;
        c0800a2 = c0800a;
        enumC0812j = (c1297c.f11399w || (Y.c.d(j4) >= 0.0f && Y.c.d(j4) < ((float) ((int) (c0800a.f7872l.f7876C >> 32))) && Y.c.e(j4) >= 0.0f && Y.c.e(j4) < ((float) ((int) (c0800a.f7872l.f7876C & 4294967295L))))) ? enumC0812j2 : EnumC0812j.f7911e;
        sVar = sVar7;
        this.f11393l = c0800a2;
        this.f11390i = sVar;
        this.f11391j = enumC0812j;
        this.f11392k = i6;
        a4 = c0800a2.a(enumC0812j, this);
        if (a4 == aVar) {
        }
        ?? r722 = ((C0811i) a4).f7907a;
        size = r722.size();
        i2 = 0;
        list = r722;
        while (true) {
            if (i2 >= size) {
            }
            i2++;
            list = list2;
        }
        sVar2 = (s) obj2;
        if (sVar2 != null) {
        }
        sVar2 = null;
        if (sVar2 != null) {
        }
        return Unit.f7487a;
    }
}
