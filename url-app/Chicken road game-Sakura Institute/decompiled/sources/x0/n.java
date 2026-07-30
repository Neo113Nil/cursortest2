package x0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final n f9624b = new n();

    /* renamed from: c, reason: collision with root package name */
    public static final n f9625c = new n();

    /* renamed from: a, reason: collision with root package name */
    public final i0.d f9626a = new i0.d(new o[16]);

    /* JADX WARN: Code restructure failed: missing block: B:81:0x003b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(q6.c cVar) {
        if (this == f9624b) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this == f9625c) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        i0.d dVar = this.f9626a;
        if (!dVar.m()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        int i7 = dVar.f4842h;
        if (i7 <= 0) {
            return false;
        }
        Object[] objArr = dVar.f4840f;
        int i8 = 0;
        boolean z8 = false;
        do {
            s0.n nVar = ((s0.n) ((o) objArr[i8])).f8104f;
            if (!nVar.f8116r) {
                throw new IllegalStateException("visitChildren called on an unattached node");
            }
            i0.d dVar2 = new i0.d(new s0.n[16]);
            s0.n nVar2 = nVar.f8109k;
            if (nVar2 == null) {
                r1.f.b(dVar2, nVar);
            } else {
                dVar2.b(nVar2);
            }
            while (true) {
                if (!dVar2.m()) {
                    break;
                }
                s0.n nVar3 = (s0.n) dVar2.o(dVar2.f4842h - 1);
                if ((nVar3.f8107i & 1024) == 0) {
                    r1.f.b(dVar2, nVar3);
                } else {
                    while (true) {
                        if (nVar3 == null) {
                            break;
                        }
                        if ((nVar3.f8106h & 1024) != 0) {
                            i0.d dVar3 = null;
                            while (nVar3 != null) {
                                if (nVar3 instanceof r) {
                                    r rVar = (r) nVar3;
                                    if (rVar.A0().f9612a ? ((Boolean) cVar.f(rVar)).booleanValue() : d.i(rVar, 7, cVar)) {
                                        z8 = true;
                                        break;
                                    }
                                } else if (((nVar3.f8106h & 1024) != 0) && (nVar3 instanceof r1.m)) {
                                    int i9 = 0;
                                    for (s0.n nVar4 = ((r1.m) nVar3).f7853t; nVar4 != null; nVar4 = nVar4.f8109k) {
                                        if ((nVar4.f8106h & 1024) != 0) {
                                            i9++;
                                            if (i9 == 1) {
                                                nVar3 = nVar4;
                                            } else {
                                                if (dVar3 == null) {
                                                    dVar3 = new i0.d(new s0.n[16]);
                                                }
                                                if (nVar3 != null) {
                                                    dVar3.b(nVar3);
                                                    nVar3 = null;
                                                }
                                                dVar3.b(nVar4);
                                            }
                                        }
                                    }
                                    if (i9 == 1) {
                                    }
                                }
                                nVar3 = r1.f.f(dVar3);
                            }
                        } else {
                            nVar3 = nVar3.f8109k;
                        }
                    }
                }
            }
            i8++;
        } while (i8 < i7);
        return z8;
    }
}
