package y;

import R1.y;
import X1.h;
import a0.C0238c;
import e2.InterfaceC0426e;
import java.util.List;
import n0.C0700A;
import n0.C0711i;
import n0.EnumC0712j;
import n0.q;
import n0.r;
import n0.s;
import p.U0;

/* renamed from: y.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1227a extends h implements InterfaceC0426e {

    /* renamed from: f, reason: collision with root package name */
    public s f10366f;

    /* renamed from: g, reason: collision with root package name */
    public EnumC0712j f10367g;

    /* renamed from: h, reason: collision with root package name */
    public int f10368h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f10369i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1229c f10370j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1227a(C1229c c1229c, V1.d dVar) {
        super(2, dVar);
        this.f10370j = c1229c;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C1227a) o((V1.d) obj2, (C0700A) obj)).q(y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C1227a c1227a = new C1227a(this.f10370j, dVar);
        c1227a.f10369i = obj;
        return c1227a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x018a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0158 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0164  */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0156 -> B:7:0x0159). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00c6 -> B:28:0x00c9). Please report as a decompilation issue!!! */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        C0700A c0700a;
        Object b3;
        C0700A c0700a2;
        EnumC0712j enumC0712j;
        s sVar;
        Object b4;
        int size;
        int i3;
        List list;
        C0700A c0700a3;
        Object obj2;
        s sVar2;
        C0700A c0700a4;
        s sVar3;
        Object b5;
        int size2;
        int i4;
        Object obj3;
        s sVar4;
        W1.a aVar = W1.a.f4608d;
        int i5 = this.f10368h;
        C1229c c1229c = this.f10370j;
        y yVar = y.f4171a;
        EnumC0712j enumC0712j2 = EnumC0712j.f7295d;
        int i6 = 2;
        if (i5 == 0) {
            R1.a.e(obj);
            c0700a = (C0700A) this.f10369i;
            this.f10369i = c0700a;
            this.f10368h = 1;
            b3 = U0.b(c0700a, true, enumC0712j2, this);
            if (b3 == aVar) {
                return aVar;
            }
        } else if (i5 == 1) {
            c0700a = (C0700A) this.f10369i;
            R1.a.e(obj);
            b3 = obj;
        } else {
            if (i5 == 2) {
                enumC0712j = this.f10367g;
                sVar = this.f10366f;
                c0700a2 = (C0700A) this.f10369i;
                R1.a.e(obj);
                b4 = obj;
                ?? r8 = ((C0711i) b4).f7292a;
                size = r8.size();
                i3 = 0;
                list = r8;
                while (true) {
                    if (i3 >= size) {
                        c0700a3 = c0700a2;
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    s sVar5 = (s) obj2;
                    List list2 = list;
                    if (!sVar5.b()) {
                        c0700a3 = c0700a2;
                        if (r.a(sVar5.f7308a, sVar.f7308a) && sVar5.f7311d) {
                            break;
                        }
                    } else {
                        c0700a3 = c0700a2;
                    }
                    i3++;
                    c0700a2 = c0700a3;
                    list = list2;
                }
                sVar2 = (s) obj2;
                if (sVar2 != null) {
                    if (sVar2.f7309b - sVar.f7309b < c0700a3.e().f()) {
                        if (C0238c.c(C0238c.g(sVar2.f7310c, sVar.f7310c)) <= c0700a3.e().b()) {
                            c0700a2 = c0700a3;
                            i6 = 2;
                            this.f10369i = c0700a2;
                            this.f10366f = sVar;
                            this.f10367g = enumC0712j;
                            this.f10368h = i6;
                            b4 = c0700a2.b(enumC0712j, this);
                            if (b4 == aVar) {
                                return aVar;
                            }
                            ?? r82 = ((C0711i) b4).f7292a;
                            size = r82.size();
                            i3 = 0;
                            list = r82;
                            while (true) {
                                if (i3 >= size) {
                                }
                                i3++;
                                c0700a2 = c0700a3;
                                list = list2;
                            }
                            sVar2 = (s) obj2;
                            if (sVar2 != null) {
                            }
                        }
                        if (sVar2 != null || !((Boolean) c1229c.f10374s.b()).booleanValue()) {
                            return yVar;
                        }
                        sVar2.a();
                        c0700a4 = c0700a3;
                        sVar3 = sVar;
                        this.f10369i = c0700a4;
                        this.f10366f = sVar3;
                        this.f10367g = null;
                        this.f10368h = 3;
                        b5 = c0700a4.b(enumC0712j2, this);
                        if (b5 == aVar) {
                        }
                        ?? r6 = ((C0711i) b5).f7292a;
                        size2 = r6.size();
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
                return yVar;
            }
            if (i5 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar3 = this.f10366f;
            c0700a4 = (C0700A) this.f10369i;
            R1.a.e(obj);
            b5 = obj;
            ?? r62 = ((C0711i) b5).f7292a;
            size2 = r62.size();
            i4 = 0;
            while (true) {
                if (i4 >= size2) {
                    obj3 = null;
                    break;
                }
                obj3 = r62.get(i4);
                s sVar6 = (s) obj3;
                if (!sVar6.b()) {
                    if (r.a(sVar6.f7308a, sVar3.f7308a) && sVar6.f7311d) {
                        break;
                    }
                }
                i4++;
            }
            sVar4 = (s) obj3;
            if (sVar4 == null) {
                return yVar;
            }
            sVar4.a();
            this.f10369i = c0700a4;
            this.f10366f = sVar3;
            this.f10367g = null;
            this.f10368h = 3;
            b5 = c0700a4.b(enumC0712j2, this);
            if (b5 == aVar) {
                return aVar;
            }
            ?? r622 = ((C0711i) b5).f7292a;
            size2 = r622.size();
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
        s sVar7 = (s) b3;
        if (!q.e(sVar7.f7316i, 3) && !q.e(sVar7.f7316i, 4)) {
            return yVar;
        }
        long j3 = sVar7.f7310c;
        c0700a2 = c0700a;
        enumC0712j = (c1229c.f10375t || ((C0238c.d(j3) > 0.0f ? 1 : (C0238c.d(j3) == 0.0f ? 0 : -1)) >= 0 && (C0238c.d(j3) > ((float) ((int) (c0700a.f7256h.f7268z >> 32))) ? 1 : (C0238c.d(j3) == ((float) ((int) (c0700a.f7256h.f7268z >> 32))) ? 0 : -1)) < 0 && (C0238c.e(j3) > 0.0f ? 1 : (C0238c.e(j3) == 0.0f ? 0 : -1)) >= 0 && (C0238c.e(j3) > ((float) ((int) (c0700a.f7256h.f7268z & 4294967295L))) ? 1 : (C0238c.e(j3) == ((float) ((int) (c0700a.f7256h.f7268z & 4294967295L))) ? 0 : -1)) < 0)) ? enumC0712j2 : EnumC0712j.f7296e;
        sVar = sVar7;
        this.f10369i = c0700a2;
        this.f10366f = sVar;
        this.f10367g = enumC0712j;
        this.f10368h = i6;
        b4 = c0700a2.b(enumC0712j, this);
        if (b4 == aVar) {
        }
        ?? r822 = ((C0711i) b4).f7292a;
        size = r822.size();
        i3 = 0;
        list = r822;
        while (true) {
            if (i3 >= size) {
            }
            i3++;
            c0700a2 = c0700a3;
            list = list2;
        }
        sVar2 = (s) obj2;
        if (sVar2 != null) {
        }
        sVar2 = null;
        if (sVar2 != null) {
        }
        return yVar;
    }
}
