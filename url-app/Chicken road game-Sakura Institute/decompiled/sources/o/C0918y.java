package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l0.AbstractC0819q;
import l0.C0800A;
import l0.C0811i;
import l0.EnumC0812j;
import y2.AbstractC1343r;

/* renamed from: o.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0918y extends E2.i implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public C0811i f8904i;

    /* renamed from: j, reason: collision with root package name */
    public int f8905j;

    /* renamed from: k, reason: collision with root package name */
    public int f8906k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f8907l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ M2.E f8908m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ M2.E f8909n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0918y(M2.E e4, M2.E e5, C2.a aVar) {
        super(2, aVar);
        this.f8908m = e4;
        this.f8909n = e5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0918y) j((C2.a) obj2, (C0800A) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0918y c0918y = new C0918y(this.f8908m, this.f8909n, aVar);
        c0918y.f8907l = obj;
        return c0918y;
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
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        C0800A c0800a;
        int i2;
        Object obj2;
        int size;
        int i4;
        int size2;
        int i5;
        Object a4;
        Object obj3;
        Object obj4;
        D2.a aVar = D2.a.f2163d;
        int i6 = this.f8906k;
        int i7 = 1;
        int i8 = 2;
        C0811i c0811i = null;
        if (i6 == 0) {
            AbstractC1343r.b(obj);
            c0800a = (C0800A) this.f8907l;
            i2 = 0;
            if (i2 != 0) {
            }
        } else if (i6 == 1) {
            i2 = this.f8905j;
            c0800a = (C0800A) this.f8907l;
            AbstractC1343r.b(obj);
            obj2 = obj;
            C0811i c0811i2 = (C0811i) obj2;
            ?? r9 = c0811i2.f7907a;
            size = r9.size();
            i4 = 0;
            while (true) {
                if (i4 >= size) {
                }
                i4++;
            }
            ?? r92 = c0811i2.f7907a;
            size2 = r92.size();
            while (i5 < size2) {
            }
            EnumC0812j enumC0812j = EnumC0812j.f7912i;
            this.f8907l = c0800a;
            this.f8904i = c0811i2;
            this.f8905j = i2;
            this.f8906k = i8;
            a4 = c0800a.a(enumC0812j, this);
            if (a4 != aVar) {
            }
        } else {
            if (i6 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = this.f8905j;
            C0811i c0811i3 = this.f8904i;
            C0800A c0800a2 = (C0800A) this.f8907l;
            AbstractC1343r.b(obj);
            a4 = obj;
            ?? r5 = ((C0811i) a4).f7907a;
            int size3 = r5.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size3) {
                    break;
                }
                if (((l0.s) r5.get(i9)).b()) {
                    i2 = i7;
                    break;
                }
                i9++;
            }
            M2.E e4 = this.f8908m;
            boolean d4 = AbstractC0870C.d(c0811i3, ((l0.s) e4.f3580d).f7923a);
            M2.E e5 = this.f8909n;
            ?? r7 = c0811i3.f7907a;
            if (!d4) {
                int size4 = r7.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = r7.get(i10);
                    if (((l0.s) obj4).f7926d) {
                        break;
                    }
                    i10++;
                }
                l0.s sVar = (l0.s) obj4;
                if (sVar != null) {
                    e4.f3580d = sVar;
                    e5.f3580d = sVar;
                } else {
                    i2 = i7;
                    c0800a = c0800a2;
                    c0811i = null;
                    if (i2 != 0) {
                        return Unit.f7487a;
                    }
                    EnumC0812j enumC0812j2 = EnumC0812j.f7911e;
                    this.f8907l = c0800a;
                    this.f8904i = c0811i;
                    this.f8905j = i2;
                    this.f8906k = i7;
                    obj2 = c0800a.a(enumC0812j2, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                    C0811i c0811i22 = (C0811i) obj2;
                    ?? r93 = c0811i22.f7907a;
                    size = r93.size();
                    i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            i2 = i7;
                            break;
                        }
                        if (!AbstractC0819q.c((l0.s) r93.get(i4))) {
                            break;
                        }
                        i4++;
                    }
                    ?? r922 = c0811i22.f7907a;
                    size2 = r922.size();
                    for (i5 = 0; i5 < size2; i5++) {
                        l0.s sVar2 = (l0.s) r922.get(i5);
                        if (sVar2.b() || AbstractC0819q.g(sVar2, c0800a.f7872l.f7876C, c0800a.b())) {
                            break;
                        }
                    }
                    EnumC0812j enumC0812j3 = EnumC0812j.f7912i;
                    this.f8907l = c0800a;
                    this.f8904i = c0811i22;
                    this.f8905j = i2;
                    this.f8906k = i8;
                    a4 = c0800a.a(enumC0812j3, this);
                    if (a4 != aVar) {
                        return aVar;
                    }
                    c0800a2 = c0800a;
                    c0811i3 = c0811i22;
                    ?? r52 = ((C0811i) a4).f7907a;
                    int size32 = r52.size();
                    int i92 = 0;
                    while (true) {
                        if (i92 >= size32) {
                        }
                        i92++;
                    }
                    M2.E e42 = this.f8908m;
                    boolean d42 = AbstractC0870C.d(c0811i3, ((l0.s) e42.f3580d).f7923a);
                    M2.E e52 = this.f8909n;
                    ?? r72 = c0811i3.f7907a;
                    if (!d42) {
                        int size5 = r72.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= size5) {
                                obj3 = null;
                                break;
                            }
                            obj3 = r72.get(i11);
                            if (l0.r.a(((l0.s) obj3).f7923a, ((l0.s) e42.f3580d).f7923a)) {
                                break;
                            }
                            i11++;
                        }
                        e52.f3580d = obj3;
                    }
                }
            }
            c0800a = c0800a2;
            i7 = 1;
            i8 = 2;
            c0811i = null;
            if (i2 != 0) {
            }
        }
    }
}
