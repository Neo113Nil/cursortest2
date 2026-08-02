package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akr extends kra implements krx {
    Object a;
    Object b;
    Object c;
    int d;
    int e;
    int f;
    int g;
    final /* synthetic */ ajm[] h;
    final /* synthetic */ akt i;
    final /* synthetic */ ald j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akr(ajm[] ajmVarArr, akt aktVar, ald aldVar, kqj kqjVar) {
        super(2, kqjVar);
        this.h = ajmVarArr;
        this.i = aktVar;
        this.j = aldVar;
    }

    @Override // defpackage.krx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akr) c((aky) obj, (kqj) obj2)).b(kow.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
    
        if (((defpackage.akt) r6).d(r11, r5, r10) != r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0084, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
    
        if (((defpackage.akt) r6).c(r11, r5, r10) != r0) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0085 -> B:7:0x0086). Please report as a decompilation issue!!! */
    @Override // defpackage.kqu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj) {
        int i;
        Object obj2;
        Object obj3;
        ald aldVar;
        int i2;
        int i3;
        int i4;
        ald aldVar2;
        kqp kqpVar = kqp.a;
        int i5 = this.g;
        if (i5 != 0) {
            i2 = this.f;
            if (i5 != 1) {
                i3 = this.e;
                i4 = this.d;
                Object obj4 = this.c;
                obj3 = this.b;
                obj2 = this.a;
                aldVar2 = obj4;
            } else {
                i3 = this.e;
                i4 = this.d;
                Object obj5 = this.c;
                obj3 = this.b;
                obj2 = this.a;
                aldVar2 = obj5;
            }
            ixc.Y(obj);
            aldVar = aldVar2;
            i = i4;
            i3++;
            if (i3 >= i2) {
                int i6 = i + 1;
                int ordinal = ((ajm[]) obj2)[i3].ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        this.a = obj2;
                        this.b = obj3;
                        this.c = aldVar;
                        this.d = i6;
                        this.e = i3;
                        this.f = i2;
                        this.g = 1;
                        int i7 = akt.h;
                    } else {
                        if (ordinal != 2) {
                            throw new koj();
                        }
                        this.a = obj2;
                        this.b = obj3;
                        this.c = aldVar;
                        this.d = i6;
                        this.e = i3;
                        this.f = i2;
                        this.g = 2;
                        int i8 = akt.h;
                    }
                    i3++;
                    if (i3 >= i2) {
                        return kow.a;
                    }
                }
                i = i6;
                i3++;
                if (i3 >= i2) {
                }
            }
        } else {
            ixc.Y(obj);
            ajm[] ajmVarArr = this.h;
            akt aktVar = this.i;
            ald aldVar3 = this.j;
            int length = ajmVarArr.length;
            i = 0;
            obj2 = ajmVarArr;
            obj3 = aktVar;
            aldVar = aldVar3;
            i2 = length;
            i3 = 0;
            if (i3 >= i2) {
            }
        }
    }

    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        return new akr(this.h, this.i, this.j, kqjVar);
    }
}
