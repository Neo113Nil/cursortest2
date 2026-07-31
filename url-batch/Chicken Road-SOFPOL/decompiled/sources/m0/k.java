package m0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k extends i6.h implements p6.e {

    /* renamed from: f, reason: collision with root package name */
    public int f4979f;

    /* renamed from: g, reason: collision with root package name */
    public int f4980g;

    /* renamed from: h, reason: collision with root package name */
    public int f4981h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f4982j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l f4983k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, g6.c cVar) {
        super(cVar);
        this.f4983k = lVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        return ((k) l((g6.c) obj2, (x6.f) obj)).p(c6.m.f1757a);
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        k kVar = new k(this.f4983k, cVar);
        kVar.f4982j = obj;
        return kVar;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        x6.f fVar;
        int i;
        int i8;
        int i9;
        String str;
        int i10;
        int i11;
        String str2;
        l lVar = this.f4983k;
        o.e0 e0Var = lVar.f4998d;
        o.w wVar = lVar.f5000f;
        int i12 = this.i;
        if (i12 == 0) {
            s6.a.K(obj);
            fVar = (x6.f) this.f4982j;
            i = 0;
            i8 = 0;
            i9 = 0;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.f4981h;
            i8 = this.f4980g;
            i9 = this.f4979f;
            fVar = (x6.f) this.f4982j;
            s6.a.K(obj);
        }
        if (i9 >= Math.min(lVar.f5001g, wVar.f5560b)) {
            return c6.m.f1757a;
        }
        int i13 = i9 + 1;
        int b8 = wVar.b(i9);
        switch (b8) {
            case 0:
                str = "up";
                break;
            case 1:
                Object e8 = e0Var.e(i8);
                i8++;
                str = "down " + e8;
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                str = "remove " + wVar.b(i13) + ' ' + wVar.b(i9 + 2);
                i13 = i9 + 3;
                break;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                str = "move " + wVar.b(i13) + ' ' + wVar.b(i9 + 2) + ' ' + wVar.b(i9 + 3);
                i13 = i9 + 4;
                break;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                str = "clear";
                break;
            case 5:
                i10 = i9 + 2;
                int b9 = wVar.b(i13);
                i11 = i8 + 1;
                str2 = "insertBottomUp " + b9 + ' ' + e0Var.e(i8);
                int i14 = i10;
                str = str2;
                i13 = i14;
                i8 = i11;
                break;
            case 6:
                i10 = i9 + 2;
                int b10 = wVar.b(i13);
                i11 = i8 + 1;
                str2 = "insertTopDown " + b10 + ' ' + e0Var.e(i8);
                int i142 = i10;
                str = str2;
                i13 = i142;
                i8 = i11;
                break;
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                int i15 = i8 + 1;
                Object e9 = e0Var.e(i8);
                q6.i.c(e9, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                q6.v.c(2, e9);
                i8 += 2;
                str = "apply " + ((p6.e) e9) + ' ' + e0Var.e(i15);
                break;
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                str = "reuse " + lVar.f4999e.e(i);
                i++;
                break;
            default:
                str = a0.q.h("unknown op: ", b8);
                break;
        }
        this.f4982j = fVar;
        this.f4979f = i13;
        this.f4980g = i8;
        this.f4981h = i;
        this.i = 1;
        fVar.b(i9 + ": " + str, this);
        return h6.a.f3204d;
    }
}
