package b1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n extends nd.h implements Function2 {

    /* renamed from: e, reason: collision with root package name */
    public long[] f1012e;

    /* renamed from: i, reason: collision with root package name */
    public int f1013i;

    /* renamed from: r, reason: collision with root package name */
    public int f1014r;

    /* renamed from: s, reason: collision with root package name */
    public int f1015s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f1016t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ o f1017u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, ld.a aVar) {
        super(aVar);
        this.f1017u = oVar;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        n nVar = new n(this.f1017u, aVar);
        nVar.f1016t = obj;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((de.g) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00c3 -> B:7:0x00c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0081 -> B:20:0x0098). Please report as a decompilation issue!!! */
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        de.g gVar;
        long[] jArr;
        int length;
        int i3;
        de.g gVar2;
        int i10;
        de.g gVar3;
        int i11;
        o oVar = this.f1017u;
        long j = oVar.f1019d;
        long j3 = oVar.f1021i;
        long j10 = oVar.f1020e;
        md.a aVar = md.a.f6622d;
        int i12 = this.f1015s;
        if (i12 == 0) {
            cf.c.M(obj);
            gVar = (de.g) this.f1016t;
            jArr = oVar.f1022r;
            if (jArr != null) {
                length = jArr.length;
                i3 = 0;
            }
            if (j10 != 0) {
                gVar2 = gVar;
                i10 = 0;
                if (i10 >= 64) {
                }
            }
            if (j != 0) {
            }
            return Unit.f5554a;
        }
        if (i12 == 1) {
            length = this.f1014r;
            int i13 = this.f1013i;
            jArr = this.f1012e;
            gVar = (de.g) this.f1016t;
            cf.c.M(obj);
            i3 = i13 + 1;
        } else {
            if (i12 != 2) {
                if (i12 != 3) {
                    kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i11 = this.f1013i;
                gVar3 = (de.g) this.f1016t;
                cf.c.M(obj);
                i11++;
                if (i11 < 64) {
                    if (((1 << i11) & j) != 0) {
                        Long l10 = new Long(j3 + i11 + 64);
                        this.f1016t = gVar3;
                        this.f1012e = null;
                        this.f1013i = i11;
                        this.f1015s = 3;
                        gVar3.a(l10, this);
                        md.a aVar2 = md.a.f6622d;
                        return aVar;
                    }
                    i11++;
                    if (i11 < 64) {
                    }
                }
                return Unit.f5554a;
            }
            i10 = this.f1013i;
            gVar2 = (de.g) this.f1016t;
            cf.c.M(obj);
            i10++;
            if (i10 >= 64) {
                gVar = gVar2;
                if (j != 0) {
                    gVar3 = gVar;
                    i11 = 0;
                    if (i11 < 64) {
                    }
                }
                return Unit.f5554a;
            }
            if (((1 << i10) & j10) != 0) {
                Long l11 = new Long(j3 + i10);
                this.f1016t = gVar2;
                this.f1012e = null;
                this.f1013i = i10;
                this.f1015s = 2;
                gVar2.a(l11, this);
                md.a aVar3 = md.a.f6622d;
                return aVar;
            }
            i10++;
            if (i10 >= 64) {
            }
        }
        if (i3 < length) {
            Long l12 = new Long(jArr[i3]);
            this.f1016t = gVar;
            this.f1012e = jArr;
            this.f1013i = i3;
            this.f1014r = length;
            this.f1015s = 1;
            gVar.a(l12, this);
            return aVar;
        }
        if (j10 != 0) {
        }
        if (j != 0) {
        }
        return Unit.f5554a;
    }
}
