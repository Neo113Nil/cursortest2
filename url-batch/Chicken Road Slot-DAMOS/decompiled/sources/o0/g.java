package o0;

import a2.b1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import s.h0;
import s.i0;
import s.s;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g extends nd.h implements Function2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7320e;

    /* renamed from: i, reason: collision with root package name */
    public long[] f7321i;

    /* renamed from: r, reason: collision with root package name */
    public int f7322r;

    /* renamed from: s, reason: collision with root package name */
    public int f7323s;

    /* renamed from: t, reason: collision with root package name */
    public int f7324t;

    /* renamed from: u, reason: collision with root package name */
    public int f7325u;

    /* renamed from: v, reason: collision with root package name */
    public long f7326v;

    /* renamed from: w, reason: collision with root package name */
    public int f7327w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f7328x;

    /* renamed from: y, reason: collision with root package name */
    public Object f7329y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f7330z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, ld.a aVar, int i3) {
        super(aVar);
        this.f7320e = i3;
        this.f7330z = obj;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        switch (this.f7320e) {
            case 0:
                g gVar = new g((h) this.f7330z, aVar, 0);
                gVar.f7328x = obj;
                return gVar;
            case 1:
                g gVar2 = new g((s.g) this.f7330z, aVar, 1);
                gVar2.f7328x = obj;
                return gVar2;
            case 2:
                g gVar3 = new g((s.g) this.f7330z, aVar, 2);
                gVar3.f7328x = obj;
                return gVar3;
            default:
                g gVar4 = new g((b1) this.f7330z, aVar, 3);
                gVar4.f7328x = obj;
                return gVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        de.g gVar = (de.g) obj;
        ld.a aVar = (ld.a) obj2;
        switch (this.f7320e) {
        }
        return ((g) create(gVar, aVar)).invokeSuspend(Unit.f5554a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0083  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0087 -> B:7:0x00a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006d -> B:16:0x00b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006f -> B:8:0x0081). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0121 -> B:30:0x0141). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0108 -> B:38:0x014a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x010a -> B:31:0x011b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x01ba -> B:52:0x01e8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x01a0 -> B:60:0x01f2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01a2 -> B:53:0x01b4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0265 -> B:75:0x0226). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x024e -> B:77:0x025f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x0291 -> B:85:0x0292). Please report as a decompilation issue!!! */
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        de.g gVar;
        Object[] objArr;
        long[] jArr;
        int length;
        int i3;
        long j;
        de.g gVar2;
        s.g gVar3;
        long[] jArr2;
        int length2;
        int i10;
        long j3;
        de.g gVar4;
        Object[] objArr2;
        long[] jArr3;
        int length3;
        int i11;
        long j10;
        long j11;
        long j12;
        char c10;
        long j13;
        de.g gVar5;
        Object[] objArr3;
        long[] jArr4;
        int length4;
        int i12;
        long j14;
        int i13 = this.f7320e;
        Object obj2 = this.f7330z;
        int i14 = 1;
        switch (i13) {
            case 0:
                md.a aVar = md.a.f6622d;
                int i15 = this.f7327w;
                if (i15 == 0) {
                    cf.c.M(obj);
                    gVar = (de.g) this.f7328x;
                    i0 i0Var = ((h) obj2).f7331d;
                    objArr = i0Var.f8320b;
                    jArr = i0Var.f8319a;
                    length = jArr.length - 2;
                    if (length >= 0) {
                        i3 = 0;
                        j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        }
                    }
                } else if (i15 != 1) {
                    kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    int i16 = this.f7325u;
                    int i17 = this.f7324t;
                    long j15 = this.f7326v;
                    i3 = this.f7323s;
                    int i18 = this.f7322r;
                    long[] jArr5 = this.f7321i;
                    Object[] objArr4 = (Object[]) this.f7329y;
                    de.g gVar6 = (de.g) this.f7328x;
                    cf.c.M(obj);
                    j15 >>= 8;
                    i16++;
                    if (i16 < i17) {
                        if (i17 == 8) {
                            length = i18;
                            jArr = jArr5;
                            objArr = objArr4;
                            gVar = gVar6;
                            if (i3 != length) {
                                i3++;
                                j = jArr[i3];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                    gVar6 = gVar;
                                    i16 = 0;
                                    jArr5 = jArr;
                                    i18 = length;
                                    i17 = 8 - ((~(i3 - length)) >>> 31);
                                    objArr4 = objArr;
                                    j15 = j;
                                    if (i16 < i17) {
                                        if ((j15 & 255) < 128) {
                                            Object obj3 = objArr4[(i3 << 3) + i16];
                                            this.f7328x = gVar6;
                                            this.f7329y = objArr4;
                                            this.f7321i = jArr5;
                                            this.f7322r = i18;
                                            this.f7323s = i3;
                                            this.f7326v = j15;
                                            this.f7324t = i17;
                                            this.f7325u = i16;
                                            this.f7327w = 1;
                                            gVar6.a(obj3, this);
                                            md.a aVar2 = md.a.f6622d;
                                            break;
                                        }
                                        j15 >>= 8;
                                        i16++;
                                        if (i16 < i17) {
                                        }
                                    }
                                } else if (i3 != length) {
                                }
                            }
                        }
                        break;
                    }
                }
            case 1:
                md.a aVar3 = md.a.f6622d;
                int i19 = this.f7327w;
                if (i19 == 0) {
                    cf.c.M(obj);
                    gVar2 = (de.g) this.f7328x;
                    gVar3 = (s.g) obj2;
                    jArr2 = gVar3.f8308e.f8312a;
                    length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        i10 = 0;
                        j3 = jArr2[i10];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        }
                        if (i10 != length2) {
                        }
                    }
                } else if (i19 != 1) {
                    kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    int i20 = this.f7325u;
                    int i21 = this.f7324t;
                    long j16 = this.f7326v;
                    int i22 = this.f7323s;
                    int i23 = this.f7322r;
                    long[] jArr6 = this.f7321i;
                    s.g gVar7 = (s.g) this.f7329y;
                    de.g gVar8 = (de.g) this.f7328x;
                    cf.c.M(obj);
                    j16 >>= 8;
                    i20 += i14;
                    if (i20 < i21) {
                        if (i21 == 8) {
                            i10 = i22;
                            length2 = i23;
                            jArr2 = jArr6;
                            gVar3 = gVar7;
                            gVar2 = gVar8;
                            if (i10 != length2) {
                                i10++;
                                i14 = 1;
                                j3 = jArr2[i10];
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    gVar8 = gVar2;
                                    i20 = 0;
                                    jArr6 = jArr2;
                                    i21 = 8 - ((~(i10 - length2)) >>> 31);
                                    gVar7 = gVar3;
                                    i23 = length2;
                                    i22 = i10;
                                    j16 = j3;
                                    if (i20 < i21) {
                                        if ((j16 & 255) < 128) {
                                            int i24 = (i22 << 3) + i20;
                                            h0 h0Var = gVar7.f8308e;
                                            s sVar = new s(0, h0Var.f8313b[i24], h0Var.f8314c[i24]);
                                            this.f7328x = gVar8;
                                            this.f7329y = gVar7;
                                            this.f7321i = jArr6;
                                            this.f7322r = i23;
                                            this.f7323s = i22;
                                            this.f7326v = j16;
                                            this.f7324t = i21;
                                            this.f7325u = i20;
                                            this.f7327w = 1;
                                            gVar8.a(sVar, this);
                                            md.a aVar4 = md.a.f6622d;
                                            break;
                                        }
                                        j16 >>= 8;
                                        i20 += i14;
                                        if (i20 < i21) {
                                        }
                                    }
                                }
                                if (i10 != length2) {
                                }
                            }
                        }
                        break;
                    }
                }
            case 2:
                md.a aVar5 = md.a.f6622d;
                int i25 = this.f7327w;
                if (i25 == 0) {
                    cf.c.M(obj);
                    gVar4 = (de.g) this.f7328x;
                    h0 h0Var2 = ((s.g) obj2).f8308e;
                    objArr2 = h0Var2.f8313b;
                    jArr3 = h0Var2.f8312a;
                    length3 = jArr3.length - 2;
                    if (length3 >= 0) {
                        i11 = 0;
                        j10 = jArr3[i11];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        }
                        if (i11 != length3) {
                        }
                    }
                } else if (i25 != 1) {
                    kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    int i26 = this.f7325u;
                    int i27 = this.f7324t;
                    long j17 = this.f7326v;
                    i11 = this.f7323s;
                    int i28 = this.f7322r;
                    long[] jArr7 = this.f7321i;
                    Object[] objArr5 = (Object[]) this.f7329y;
                    de.g gVar9 = (de.g) this.f7328x;
                    cf.c.M(obj);
                    j17 >>= 8;
                    i26++;
                    if (i26 < i27) {
                        if (i27 == 8) {
                            length3 = i28;
                            jArr3 = jArr7;
                            objArr2 = objArr5;
                            gVar4 = gVar9;
                            if (i11 != length3) {
                                i11++;
                                j10 = jArr3[i11];
                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    gVar9 = gVar4;
                                    i26 = 0;
                                    jArr7 = jArr3;
                                    i28 = length3;
                                    i27 = 8 - ((~(i11 - length3)) >>> 31);
                                    objArr5 = objArr2;
                                    j17 = j10;
                                    if (i26 < i27) {
                                        if ((j17 & 255) < 128) {
                                            Object obj4 = objArr5[(i11 << 3) + i26];
                                            this.f7328x = gVar9;
                                            this.f7329y = objArr5;
                                            this.f7321i = jArr7;
                                            this.f7322r = i28;
                                            this.f7323s = i11;
                                            this.f7326v = j17;
                                            this.f7324t = i27;
                                            this.f7325u = i26;
                                            this.f7327w = 1;
                                            gVar9.a(obj4, this);
                                            md.a aVar6 = md.a.f6622d;
                                            break;
                                        }
                                        j17 >>= 8;
                                        i26++;
                                        if (i26 < i27) {
                                        }
                                    }
                                }
                                if (i11 != length3) {
                                }
                            }
                        }
                        break;
                    }
                }
            default:
                md.a aVar7 = md.a.f6622d;
                int i29 = this.f7327w;
                if (i29 == 0) {
                    j11 = 128;
                    j12 = 255;
                    c10 = 7;
                    j13 = -9187201950435737472L;
                    cf.c.M(obj);
                    gVar5 = (de.g) this.f7328x;
                    h0 h0Var3 = (h0) ((b1) obj2).f59e;
                    objArr3 = h0Var3.f8314c;
                    jArr4 = h0Var3.f8312a;
                    length4 = jArr4.length - 2;
                    if (length4 >= 0) {
                        i12 = 0;
                        j14 = jArr4[i12];
                        if ((((~j14) << c10) & j14 & j13) != j13) {
                        }
                        if (i12 != length4) {
                        }
                    }
                } else if (i29 != 1) {
                    kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    int i30 = this.f7325u;
                    int i31 = this.f7324t;
                    j11 = 128;
                    long j18 = this.f7326v;
                    int i32 = this.f7323s;
                    j12 = 255;
                    int i33 = this.f7322r;
                    long[] jArr8 = this.f7321i;
                    c10 = 7;
                    Object[] objArr6 = (Object[]) this.f7329y;
                    j13 = -9187201950435737472L;
                    de.g gVar10 = (de.g) this.f7328x;
                    cf.c.M(obj);
                    j18 >>= 8;
                    i30++;
                    if (i30 < i31) {
                        if (i31 == 8) {
                            jArr4 = jArr8;
                            gVar5 = gVar10;
                            length4 = i33;
                            objArr3 = objArr6;
                            i12 = i32;
                            if (i12 != length4) {
                                i12++;
                                j14 = jArr4[i12];
                                if ((((~j14) << c10) & j14 & j13) != j13) {
                                    int i34 = 8 - ((~(i12 - length4)) >>> 31);
                                    gVar10 = gVar5;
                                    int i35 = length4;
                                    jArr8 = jArr4;
                                    j18 = j14;
                                    i31 = i34;
                                    i30 = 0;
                                    i32 = i12;
                                    objArr6 = objArr3;
                                    i33 = i35;
                                    if (i30 < i31) {
                                        if ((j18 & j12) < j11) {
                                            Object obj5 = objArr6[(i32 << 3) + i30];
                                            this.f7328x = gVar10;
                                            this.f7329y = objArr6;
                                            this.f7321i = jArr8;
                                            this.f7322r = i33;
                                            this.f7323s = i32;
                                            this.f7326v = j18;
                                            this.f7324t = i31;
                                            this.f7325u = i30;
                                            this.f7327w = 1;
                                            gVar10.a(obj5, this);
                                            md.a aVar8 = md.a.f6622d;
                                            break;
                                        }
                                        j18 >>= 8;
                                        i30++;
                                        if (i30 < i31) {
                                        }
                                    }
                                }
                                if (i12 != length4) {
                                }
                            }
                        }
                        break;
                    }
                }
        }
        return Unit.f5554a;
    }
}
