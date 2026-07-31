package F;

import n2.InterfaceC0701g;
import q.C0766a;
import q.C0767b;
import q.C0768c;
import q.C0769d;
import q.C0770e;
import q.C0771f;

/* renamed from: F.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0050l implements InterfaceC0701g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S.t f1290e;

    public /* synthetic */ C0050l(S.t tVar, int i3) {
        this.f1289d = i3;
        this.f1290e = tVar;
    }

    @Override // n2.InterfaceC0701g
    public final Object emit(Object obj, P1.d dVar) {
        switch (this.f1289d) {
            case 0:
                q.h hVar = (q.h) obj;
                boolean z3 = hVar instanceof C0771f;
                S.t tVar = this.f1290e;
                if (z3) {
                    tVar.add(hVar);
                } else if (hVar instanceof q.g) {
                    tVar.remove(((q.g) hVar).f6816a);
                } else if (hVar instanceof C0769d) {
                    tVar.add(hVar);
                } else if (hVar instanceof C0770e) {
                    tVar.remove(((C0770e) hVar).f6815a);
                } else if (hVar instanceof q.l) {
                    tVar.add(hVar);
                } else if (hVar instanceof q.m) {
                    tVar.remove(((q.m) hVar).f6820a);
                } else if (hVar instanceof q.k) {
                    tVar.remove(((q.k) hVar).f6818a);
                }
                break;
            case 1:
                q.h hVar2 = (q.h) obj;
                boolean z4 = hVar2 instanceof C0771f;
                S.t tVar2 = this.f1290e;
                if (z4) {
                    tVar2.add(hVar2);
                } else if (hVar2 instanceof q.g) {
                    tVar2.remove(((q.g) hVar2).f6816a);
                } else if (hVar2 instanceof C0769d) {
                    tVar2.add(hVar2);
                } else if (hVar2 instanceof C0770e) {
                    tVar2.remove(((C0770e) hVar2).f6815a);
                } else if (hVar2 instanceof q.l) {
                    tVar2.add(hVar2);
                } else if (hVar2 instanceof q.m) {
                    tVar2.remove(((q.m) hVar2).f6820a);
                } else if (hVar2 instanceof q.k) {
                    tVar2.remove(((q.k) hVar2).f6818a);
                } else if (hVar2 instanceof C0767b) {
                    tVar2.add(hVar2);
                } else if (hVar2 instanceof C0768c) {
                    tVar2.remove(((C0768c) hVar2).f6814a);
                } else if (hVar2 instanceof C0766a) {
                    tVar2.remove(((C0766a) hVar2).f6813a);
                }
                break;
            default:
                q.h hVar3 = (q.h) obj;
                boolean z5 = hVar3 instanceof C0771f;
                S.t tVar3 = this.f1290e;
                if (z5) {
                    tVar3.add(hVar3);
                } else if (hVar3 instanceof q.g) {
                    tVar3.remove(((q.g) hVar3).f6816a);
                } else if (hVar3 instanceof C0769d) {
                    tVar3.add(hVar3);
                } else if (hVar3 instanceof C0770e) {
                    tVar3.remove(((C0770e) hVar3).f6815a);
                } else if (hVar3 instanceof q.l) {
                    tVar3.add(hVar3);
                } else if (hVar3 instanceof q.m) {
                    tVar3.remove(((q.m) hVar3).f6820a);
                } else if (hVar3 instanceof q.k) {
                    tVar3.remove(((q.k) hVar3).f6818a);
                } else if (hVar3 instanceof C0767b) {
                    tVar3.add(hVar3);
                } else if (hVar3 instanceof C0768c) {
                    tVar3.remove(((C0768c) hVar3).f6814a);
                } else if (hVar3 instanceof C0766a) {
                    tVar3.remove(((C0766a) hVar3).f6813a);
                }
                break;
        }
        return L1.z.f2729a;
    }
}
