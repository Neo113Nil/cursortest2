package a7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class v0 extends q6.g implements p6.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f308l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(int i, Object obj, Class cls, String str, String str2, int i8, int i9, int i10) {
        super(i, obj, cls, str, str2, i8, i9);
        this.f308l = i10;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        int i;
        switch (this.f308l) {
            case 0:
                ((w0) this.f6189e).l((Throwable) obj);
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                t.u uVar = (t.u) this.f6189e;
                o.a0 a0Var = uVar.E;
                if (booleanValue) {
                    uVar.x0();
                } else {
                    if (uVar.f6860t != null) {
                        Object[] objArr = a0Var.f5413c;
                        long[] jArr = a0Var.f5411a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i8 = 0;
                            while (true) {
                                long j7 = jArr[i8];
                                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i9 = 8;
                                    int i10 = 8 - ((~(i8 - length)) >>> 31);
                                    int i11 = 0;
                                    while (i11 < i10) {
                                        if ((255 & j7) < 128) {
                                            i = i9;
                                            x.n(uVar.f0(), null, new t.e(uVar, (v.l) objArr[(i8 << 3) + i11], null, 0), 3);
                                        } else {
                                            i = i9;
                                        }
                                        j7 >>= i;
                                        i11++;
                                        i9 = i;
                                    }
                                    if (i10 != i9) {
                                    }
                                }
                                if (i8 != length) {
                                    i8++;
                                }
                            }
                        }
                    }
                    a0Var.a();
                }
                break;
        }
        return c6.m.f1757a;
    }
}
