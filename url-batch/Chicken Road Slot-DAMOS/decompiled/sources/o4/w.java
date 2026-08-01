package o4;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n0.j1;
import n0.m2;
import s.b0;
import v.z0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0 f7532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n4.x f7533e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n4.h f7534i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b0 f7535r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m2 f7536s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f7537t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(z0 z0Var, n4.x xVar, n4.h hVar, b0 b0Var, m2 m2Var, i iVar, ld.a aVar) {
        super(2, aVar);
        this.f7532d = z0Var;
        this.f7533e = xVar;
        this.f7534i = hVar;
        this.f7535r = b0Var;
        this.f7536s = m2Var;
        this.f7537t = iVar;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        return new w(this.f7532d, this.f7533e, this.f7534i, this.f7535r, this.f7536s, this.f7537t, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((ge.x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        char c10;
        md.a aVar = md.a.f6622d;
        cf.c.M(obj);
        z0 z0Var = this.f7532d;
        Object l10 = z0Var.f9917a.l();
        j1 j1Var = z0Var.f9920d;
        if (Intrinsics.a(l10, j1Var.getValue()) && (this.f7533e.f7130b.h() == null || Intrinsics.a(j1Var.getValue(), this.f7534i))) {
            Iterator it = ((List) this.f7536s.getValue()).iterator();
            while (it.hasNext()) {
                this.f7537t.b().c((n4.h) it.next());
            }
            b0 b0Var = this.f7535r;
            long[] jArr = b0Var.f8267a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    char c11 = 7;
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i3 - length)) >>> 31);
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j & 255) < 128) {
                                int i12 = (i3 << 3) + i11;
                                Object obj2 = b0Var.f8268b[i12];
                                c10 = c11;
                                float f3 = b0Var.f8269c[i12];
                                if (!Intrinsics.a((String) obj2, ((n4.h) j1Var.getValue()).f7067t)) {
                                    b0Var.f8271e--;
                                    long[] jArr2 = b0Var.f8267a;
                                    int i13 = b0Var.f8270d;
                                    int i14 = i12 >> 3;
                                    int i15 = (i12 & 7) << 3;
                                    long j3 = (jArr2[i14] & (~(255 << i15))) | (254 << i15);
                                    jArr2[i14] = j3;
                                    jArr2[(((i12 - 7) & i13) + (i13 & 7)) >> 3] = j3;
                                    b0Var.f8268b[i12] = null;
                                }
                            } else {
                                c10 = c11;
                            }
                            j >>= 8;
                            i11++;
                            c11 = c10;
                        }
                        if (i10 != 8) {
                            break;
                        }
                    }
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return Unit.f5554a;
    }
}
