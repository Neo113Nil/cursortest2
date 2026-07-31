package Z;

import e2.InterfaceC0424c;
import t0.AbstractC0993f;
import t0.AbstractC1000m;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final p f4698b = new p();

    /* renamed from: c, reason: collision with root package name */
    public static final p f4699c = new p();

    /* renamed from: a, reason: collision with root package name */
    public final K.d f4700a = new K.d(new q[16]);

    /* JADX WARN: Code restructure failed: missing block: B:82:0x003b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(InterfaceC0424c interfaceC0424c) {
        if (this == f4698b) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this == f4699c) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        K.d dVar = this.f4700a;
        if (!dVar.m()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        int i3 = dVar.f3216f;
        if (i3 <= 0) {
            return false;
        }
        Object[] objArr = dVar.f3214d;
        int i4 = 0;
        boolean z3 = false;
        do {
            U.p pVar = ((U.p) ((q) objArr[i4])).f4489d;
            if (!pVar.f4501p) {
                throw new IllegalStateException("visitChildren called on an unattached node");
            }
            K.d dVar2 = new K.d(new U.p[16]);
            U.p pVar2 = pVar.f4494i;
            if (pVar2 == null) {
                AbstractC0993f.b(dVar2, pVar);
            } else {
                dVar2.b(pVar2);
            }
            while (true) {
                if (!dVar2.m()) {
                    break;
                }
                U.p pVar3 = (U.p) dVar2.o(dVar2.f3216f - 1);
                if ((pVar3.f4492g & 1024) == 0) {
                    AbstractC0993f.b(dVar2, pVar3);
                } else {
                    while (true) {
                        if (pVar3 == null) {
                            break;
                        }
                        if ((pVar3.f4491f & 1024) != 0) {
                            K.d dVar3 = null;
                            while (pVar3 != null) {
                                if (pVar3 instanceof t) {
                                    t tVar = (t) pVar3;
                                    if (tVar.y0().f4686a ? ((Boolean) interfaceC0424c.n(tVar)).booleanValue() : d.i(tVar, 7, interfaceC0424c)) {
                                        z3 = true;
                                        break;
                                    }
                                } else if (((pVar3.f4491f & 1024) != 0) && (pVar3 instanceof AbstractC1000m)) {
                                    int i5 = 0;
                                    for (U.p pVar4 = ((AbstractC1000m) pVar3).f8771r; pVar4 != null; pVar4 = pVar4.f4494i) {
                                        if ((pVar4.f4491f & 1024) != 0) {
                                            i5++;
                                            if (i5 == 1) {
                                                pVar3 = pVar4;
                                            } else {
                                                if (dVar3 == null) {
                                                    dVar3 = new K.d(new U.p[16]);
                                                }
                                                if (pVar3 != null) {
                                                    dVar3.b(pVar3);
                                                    pVar3 = null;
                                                }
                                                dVar3.b(pVar4);
                                            }
                                        }
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                pVar3 = AbstractC0993f.f(dVar3);
                            }
                        } else {
                            pVar3 = pVar3.f4494i;
                        }
                    }
                }
            }
            i4++;
        } while (i4 < i3);
        return z3;
    }
}
