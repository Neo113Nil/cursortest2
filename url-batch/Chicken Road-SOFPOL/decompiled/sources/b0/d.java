package b0;

import a7.u;
import android.view.View;
import c5.x;
import c6.m;
import c7.p;
import d7.g;
import i0.h;
import i6.i;
import java.util.List;
import m0.q1;
import m0.y1;
import u.e1;
import u.i0;
import x.v0;
import x1.m1;
import y3.b0;
import y3.j;
import y3.l0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d extends i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1037h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public Object f1038j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1039k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, g6.c cVar, int i) {
        super(2, cVar);
        this.f1037h = i;
        this.f1039k = obj;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f1037h) {
            case 0:
                return ((d) l((g6.c) obj2, (u) obj)).p(m.f1757a);
            case 1:
                return ((d) l((g6.c) obj2, (u) obj)).p(m.f1757a);
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                return ((d) l((g6.c) obj2, (u) obj)).p(m.f1757a);
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                return ((d) l((g6.c) obj2, (p) obj)).p(m.f1757a);
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                return ((d) l((g6.c) obj2, (g) obj)).p(m.f1757a);
            case 5:
                return ((d) l((g6.c) obj2, obj)).p(m.f1757a);
            case 6:
                return ((d) l((g6.c) obj2, (u) obj)).p(m.f1757a);
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((d) l((g6.c) obj2, (u) obj)).p(m.f1757a);
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                return ((d) l((g6.c) obj2, (u) obj)).p(m.f1757a);
            case v0.f8304b /* 9 */:
                return ((d) l((g6.c) obj2, (u) obj)).p(m.f1757a);
            case v0.f8306d /* 10 */:
                return ((d) l((g6.c) obj2, (u) obj)).p(m.f1757a);
            case 11:
                return ((d) l((g6.c) obj2, (u) obj)).p(m.f1757a);
            case 12:
                return ((d) l((g6.c) obj2, (u) obj)).p(m.f1757a);
            case 13:
                return ((d) l((g6.c) obj2, (u) obj)).p(m.f1757a);
            case 14:
                return ((d) l((g6.c) obj2, (u) obj)).p(m.f1757a);
            case v0.f8308f /* 15 */:
                ((d) l((g6.c) obj2, (u) obj)).p(m.f1757a);
                return h6.a.f3204d;
            case 16:
                return ((d) l((g6.c) obj2, (j) obj)).p(m.f1757a);
            case 17:
                return ((d) l((g6.c) obj2, (u) obj)).p(m.f1757a);
            case 18:
                return ((d) l((g6.c) obj2, (u) obj)).p(m.f1757a);
            case 19:
                return ((d) l((g6.c) obj2, (l0) obj)).p(m.f1757a);
            default:
                return ((d) l((g6.c) obj2, (u) obj)).p(m.f1757a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [i6.i, p6.e] */
    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        switch (this.f1037h) {
            case 0:
                return new d((f) this.f1038j, (a) this.f1039k, cVar, 0);
            case 1:
                return new d((c.d) this.f1039k, cVar, 1);
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                return new d((c2.e) this.f1038j, (Runnable) this.f1039k, cVar, 2);
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                d dVar = new d((e7.e) this.f1039k, cVar, 3);
                dVar.f1038j = obj;
                return dVar;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                d dVar2 = new d((e7.f) this.f1039k, cVar, 4);
                dVar2.f1038j = obj;
                return dVar2;
            case 5:
                d dVar3 = new d((g) this.f1039k, cVar, 5);
                dVar3.f1038j = obj;
                return dVar3;
            case 6:
                d dVar4 = new d((i0.a) this.f1039k, cVar, 6);
                dVar4.f1038j = obj;
                return dVar4;
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new d((h) this.f1038j, (r.j) this.f1039k, cVar, 7);
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                return new d((d7.f) this.f1038j, (q1) this.f1039k, cVar, 8);
            case v0.f8304b /* 9 */:
                return new d((v.j) this.f1038j, (v.f) this.f1039k, cVar, 9);
            case v0.f8306d /* 10 */:
                return new d((v.j) this.f1038j, (v.g) this.f1039k, cVar, 10);
            case 11:
                d dVar5 = new d((c7.g) this.f1039k, cVar, 11);
                dVar5.f1038j = obj;
                return dVar5;
            case 12:
                d dVar6 = new d((i0) this.f1039k, cVar, 12);
                dVar6.f1038j = obj;
                return dVar6;
            case 13:
                return new d((e1) this.f1038j, (p6.e) this.f1039k, cVar, 13);
            case 14:
                return new d((y1) this.f1038j, (View) this.f1039k, cVar, 14);
            case v0.f8308f /* 15 */:
                return new d((d7.l0) this.f1038j, (m1) this.f1039k, cVar, 15);
            case 16:
                d dVar7 = new d((List) this.f1039k, cVar, 16);
                dVar7.f1038j = obj;
                return dVar7;
            case 17:
                return new d((b0) this.f1038j, (l0) this.f1039k, cVar, 17);
            case 18:
                return new d((p6.e) this.f1038j, (y3.c) this.f1039k, cVar);
            case 19:
                d dVar8 = new d((b0) this.f1039k, cVar, 19);
                dVar8.f1038j = obj;
                return dVar8;
            default:
                return new d((x) this.f1039k, cVar, 20);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0293 A[Catch: all -> 0x026f, TryCatch #3 {all -> 0x026f, blocks: (B:154:0x026b, B:155:0x0289, B:157:0x0293, B:161:0x02a2, B:170:0x027d), top: B:149:0x0261 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Type inference failed for: r0v134, types: [i6.i, p6.e] */
    /* JADX WARN: Type inference failed for: r2v47, types: [i6.i, p6.e] */
    /* JADX WARN: Type inference failed for: r2v48, types: [i6.i, p6.e] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0062 -> B:8:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x02c8 -> B:143:0x0289). Please report as a decompilation issue!!! */
    @Override // i6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object p(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 1434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.d.p(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, g6.c cVar, int i) {
        super(2, cVar);
        this.f1037h = i;
        this.f1038j = obj;
        this.f1039k = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(p6.e eVar, y3.c cVar, g6.c cVar2) {
        super(2, cVar2);
        this.f1037h = 18;
        this.f1038j = (i) eVar;
        this.f1039k = cVar;
    }
}
