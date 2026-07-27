package X;

import kotlin.jvm.functions.Function1;
import r0.AbstractC1065f;
import r0.AbstractC1073n;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final p f4344b = new p();

    /* renamed from: c, reason: collision with root package name */
    public static final p f4345c = new p();

    /* renamed from: a, reason: collision with root package name */
    public final I.d f4346a = new I.d(new q[16]);

    /* JADX WARN: Code restructure failed: missing block: B:82:0x003b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Function1 function1) {
        if (this == f4344b) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this == f4345c) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        I.d dVar = this.f4346a;
        if (!dVar.l()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        int i2 = dVar.f3332i;
        if (i2 <= 0) {
            return false;
        }
        Object[] objArr = dVar.f3330d;
        int i4 = 0;
        boolean z4 = false;
        do {
            S.n nVar = ((S.n) ((q) objArr[i4])).f3978d;
            if (!nVar.f3990s) {
                throw new IllegalStateException("visitChildren called on an unattached node");
            }
            I.d dVar2 = new I.d(new S.n[16]);
            S.n nVar2 = nVar.f3983l;
            if (nVar2 == null) {
                AbstractC1065f.b(dVar2, nVar);
            } else {
                dVar2.b(nVar2);
            }
            while (true) {
                if (!dVar2.l()) {
                    break;
                }
                S.n nVar3 = (S.n) dVar2.n(dVar2.f3332i - 1);
                if ((nVar3.f3981j & 1024) == 0) {
                    AbstractC1065f.b(dVar2, nVar3);
                } else {
                    while (true) {
                        if (nVar3 == null) {
                            break;
                        }
                        if ((nVar3.f3980i & 1024) != 0) {
                            I.d dVar3 = null;
                            while (nVar3 != null) {
                                if (nVar3 instanceof t) {
                                    t tVar = (t) nVar3;
                                    if (tVar.B0().f4332a ? ((Boolean) function1.invoke(tVar)).booleanValue() : d.i(tVar, 7, function1)) {
                                        z4 = true;
                                        break;
                                    }
                                } else if (((nVar3.f3980i & 1024) != 0) && (nVar3 instanceof AbstractC1073n)) {
                                    int i5 = 0;
                                    for (S.n nVar4 = ((AbstractC1073n) nVar3).f9826u; nVar4 != null; nVar4 = nVar4.f3983l) {
                                        if ((nVar4.f3980i & 1024) != 0) {
                                            i5++;
                                            if (i5 == 1) {
                                                nVar3 = nVar4;
                                            } else {
                                                if (dVar3 == null) {
                                                    dVar3 = new I.d(new S.n[16]);
                                                }
                                                if (nVar3 != null) {
                                                    dVar3.b(nVar3);
                                                    nVar3 = null;
                                                }
                                                dVar3.b(nVar4);
                                            }
                                        }
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                nVar3 = AbstractC1065f.f(dVar3);
                            }
                        } else {
                            nVar3 = nVar3.f3983l;
                        }
                    }
                }
            }
            i4++;
        } while (i4 < i2);
        return z4;
    }
}
