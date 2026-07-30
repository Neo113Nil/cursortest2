package q0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k extends j6.h implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public int[] f7412g;

    /* renamed from: h, reason: collision with root package name */
    public int f7413h;

    /* renamed from: i, reason: collision with root package name */
    public int f7414i;

    /* renamed from: j, reason: collision with root package name */
    public int f7415j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f7416k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f7417l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, h6.d dVar) {
        super(2, dVar);
        this.f7417l = lVar;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        k kVar = new k(this.f7417l, dVar);
        kVar.f7416k = obj;
        return kVar;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        return ((k) create((y6.g) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00be -> B:7:0x00bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0084 -> B:20:0x0098). Please report as a decompilation issue!!! */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j8;
        y6.g gVar;
        int[] iArr;
        int length;
        int i7;
        y6.g gVar2;
        int i8;
        y6.g gVar3;
        int i9;
        l lVar = this.f7417l;
        long j9 = lVar.f7419f;
        int i10 = lVar.f7421h;
        long j10 = lVar.f7420g;
        int i11 = this.f7415j;
        i6.a aVar = i6.a.f4956f;
        if (i11 == 0) {
            j8 = 0;
            d6.a.e(obj);
            gVar = (y6.g) this.f7416k;
            iArr = lVar.f7422i;
            if (iArr != null) {
                length = iArr.length;
                i7 = 0;
            }
            if (j10 != j8) {
                gVar2 = gVar;
                i8 = 0;
                if (i8 >= 64) {
                }
            }
            if (j9 != j8) {
            }
            return d6.z.f2639a;
        }
        if (i11 == 1) {
            length = this.f7414i;
            int i12 = this.f7413h;
            iArr = this.f7412g;
            j8 = 0;
            gVar = (y6.g) this.f7416k;
            d6.a.e(obj);
            i7 = i12 + 1;
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i13 = this.f7413h;
                gVar3 = (y6.g) this.f7416k;
                d6.a.e(obj);
                j8 = 0;
                i9 = i13 + 1;
                if (i9 < 64) {
                    if (((1 << i9) & j9) != j8) {
                        Integer num = new Integer(i9 + 64 + i10);
                        this.f7416k = gVar3;
                        this.f7412g = null;
                        this.f7413h = i9;
                        this.f7415j = 3;
                        gVar3.b(num, this);
                        return aVar;
                    }
                    i13 = i9;
                    i9 = i13 + 1;
                    if (i9 < 64) {
                    }
                }
                return d6.z.f2639a;
            }
            i8 = this.f7413h;
            gVar2 = (y6.g) this.f7416k;
            d6.a.e(obj);
            j8 = 0;
            i8++;
            if (i8 >= 64) {
                gVar = gVar2;
                if (j9 != j8) {
                    gVar3 = gVar;
                    i9 = 0;
                    if (i9 < 64) {
                    }
                }
                return d6.z.f2639a;
            }
            if (((1 << i8) & j10) != j8) {
                Integer num2 = new Integer(i10 + i8);
                this.f7416k = gVar2;
                this.f7412g = null;
                this.f7413h = i8;
                this.f7415j = 2;
                gVar2.b(num2, this);
                return aVar;
            }
            i8++;
            if (i8 >= 64) {
            }
        }
        if (i7 < length) {
            Integer num3 = new Integer(iArr[i7]);
            this.f7416k = gVar;
            this.f7412g = iArr;
            this.f7413h = i7;
            this.f7414i = length;
            this.f7415j = 1;
            gVar.b(num3, this);
            return aVar;
        }
        if (j10 != j8) {
        }
        if (j9 != j8) {
        }
        return d6.z.f2639a;
    }
}
