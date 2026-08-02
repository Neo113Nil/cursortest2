package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ao extends an {
    public final Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002b, code lost:
    
        if (r7 == defpackage.bd.g) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r7 == defpackage.bd.g) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ao(cm cmVar, boolean z, boolean z2) {
        super(cmVar);
        Object obj;
        az azVar;
        Object obj2;
        cmVar.getClass();
        boolean z3 = true;
        Object obj3 = null;
        if (cmVar.h == 2) {
            if (z) {
                az azVar2 = cmVar.a.U;
                if (azVar2 != null) {
                    obj = azVar2.j;
                }
                obj = null;
            }
            z3 = false;
            obj = null;
        } else {
            if (z) {
                az azVar3 = cmVar.a.U;
                if (azVar3 != null) {
                    obj = azVar3.i;
                }
                obj = null;
            }
            z3 = false;
            obj = null;
        }
        this.b = obj;
        if (z2 && z3 && (azVar = cmVar.a.U) != null && (obj2 = azVar.k) != bd.g) {
            obj3 = obj2;
        }
        this.c = obj3;
    }

    private final void c(Object obj) {
        if (obj == null) {
            return;
        }
        int i = cg.a;
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.a.a + " is not a valid framework Transition or AndroidX Transition");
    }

    public final void a() {
        c(this.b);
        c(this.c);
    }
}
