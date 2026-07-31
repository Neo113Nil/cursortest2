package p;

import e2.InterfaceC0426e;
import n0.C0700A;
import n0.C0711i;
import n0.EnumC0712j;

/* renamed from: p.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0798y extends X1.h implements InterfaceC0426e {

    /* renamed from: f, reason: collision with root package name */
    public C0711i f7805f;

    /* renamed from: g, reason: collision with root package name */
    public int f7806g;

    /* renamed from: h, reason: collision with root package name */
    public int f7807h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7808i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f2.u f7809j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f2.u f7810k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0798y(f2.u uVar, f2.u uVar2, V1.d dVar) {
        super(2, dVar);
        this.f7809j = uVar;
        this.f7810k = uVar2;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0798y) o((V1.d) obj2, (C0700A) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0798y c0798y = new C0798y(this.f7809j, this.f7810k, dVar);
        c0798y.f7808i = obj;
        return c0798y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0092, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3 A[EDGE_INSN: B:68:0x00c3->B:13:0x00c3 BREAK  A[LOOP:0: B:7:0x00b0->B:10:0x00c0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b2  */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00a4 -> B:6:0x00a7). Please report as a decompilation issue!!! */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        C0700A c0700a;
        int i3;
        Object obj2;
        int size;
        int i4;
        int size2;
        int i5;
        Object b3;
        Object obj3;
        Object obj4;
        W1.a aVar = W1.a.f4608d;
        int i6 = this.f7807h;
        int i7 = 1;
        int i8 = 2;
        C0711i c0711i = null;
        if (i6 == 0) {
            R1.a.e(obj);
            c0700a = (C0700A) this.f7808i;
            i3 = 0;
            if (i3 != 0) {
            }
        } else if (i6 == 1) {
            i3 = this.f7806g;
            c0700a = (C0700A) this.f7808i;
            R1.a.e(obj);
            obj2 = obj;
            C0711i c0711i2 = (C0711i) obj2;
            ?? r9 = c0711i2.f7292a;
            size = r9.size();
            i4 = 0;
            while (true) {
                if (i4 >= size) {
                }
                i4++;
            }
            ?? r92 = c0711i2.f7292a;
            size2 = r92.size();
            while (i5 < size2) {
            }
            EnumC0712j enumC0712j = EnumC0712j.f7297f;
            this.f7808i = c0700a;
            this.f7805f = c0711i2;
            this.f7806g = i3;
            this.f7807h = i8;
            b3 = c0700a.b(enumC0712j, this);
            if (b3 != aVar) {
            }
        } else {
            if (i6 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = this.f7806g;
            C0711i c0711i3 = this.f7805f;
            C0700A c0700a2 = (C0700A) this.f7808i;
            R1.a.e(obj);
            b3 = obj;
            ?? r5 = ((C0711i) b3).f7292a;
            int size3 = r5.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size3) {
                    break;
                }
                if (((n0.s) r5.get(i9)).b()) {
                    i3 = i7;
                    break;
                }
                i9++;
            }
            f2.u uVar = this.f7809j;
            boolean d3 = C.d(c0711i3, ((n0.s) uVar.f5832d).f7308a);
            f2.u uVar2 = this.f7810k;
            ?? r7 = c0711i3.f7292a;
            if (!d3) {
                int size4 = r7.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = r7.get(i10);
                    if (((n0.s) obj4).f7311d) {
                        break;
                    }
                    i10++;
                }
                n0.s sVar = (n0.s) obj4;
                if (sVar != null) {
                    uVar.f5832d = sVar;
                    uVar2.f5832d = sVar;
                } else {
                    i3 = i7;
                    c0700a = c0700a2;
                    c0711i = null;
                    if (i3 != 0) {
                        return R1.y.f4171a;
                    }
                    EnumC0712j enumC0712j2 = EnumC0712j.f7296e;
                    this.f7808i = c0700a;
                    this.f7805f = c0711i;
                    this.f7806g = i3;
                    this.f7807h = i7;
                    obj2 = c0700a.b(enumC0712j2, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                    C0711i c0711i22 = (C0711i) obj2;
                    ?? r93 = c0711i22.f7292a;
                    size = r93.size();
                    i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            i3 = i7;
                            break;
                        }
                        if (!n0.q.c((n0.s) r93.get(i4))) {
                            break;
                        }
                        i4++;
                    }
                    ?? r922 = c0711i22.f7292a;
                    size2 = r922.size();
                    for (i5 = 0; i5 < size2; i5++) {
                        n0.s sVar2 = (n0.s) r922.get(i5);
                        if (sVar2.b() || n0.q.g(sVar2, c0700a.f7256h.f7268z, c0700a.c())) {
                            break;
                        }
                    }
                    EnumC0712j enumC0712j3 = EnumC0712j.f7297f;
                    this.f7808i = c0700a;
                    this.f7805f = c0711i22;
                    this.f7806g = i3;
                    this.f7807h = i8;
                    b3 = c0700a.b(enumC0712j3, this);
                    if (b3 != aVar) {
                        return aVar;
                    }
                    c0700a2 = c0700a;
                    c0711i3 = c0711i22;
                    ?? r52 = ((C0711i) b3).f7292a;
                    int size32 = r52.size();
                    int i92 = 0;
                    while (true) {
                        if (i92 >= size32) {
                        }
                        i92++;
                    }
                    f2.u uVar3 = this.f7809j;
                    boolean d32 = C.d(c0711i3, ((n0.s) uVar3.f5832d).f7308a);
                    f2.u uVar22 = this.f7810k;
                    ?? r72 = c0711i3.f7292a;
                    if (!d32) {
                        int size5 = r72.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= size5) {
                                obj3 = null;
                                break;
                            }
                            obj3 = r72.get(i11);
                            if (n0.r.a(((n0.s) obj3).f7308a, ((n0.s) uVar3.f5832d).f7308a)) {
                                break;
                            }
                            i11++;
                        }
                        uVar22.f5832d = obj3;
                    }
                }
            }
            c0700a = c0700a2;
            i7 = 1;
            i8 = 2;
            c0711i = null;
            if (i3 != 0) {
            }
        }
    }
}
