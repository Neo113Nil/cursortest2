package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hto extends htm {
    @Override // defpackage.htm
    public final int a(htp htpVar) {
        int i;
        synchronized (htpVar) {
            i = htpVar.remainingField - 1;
            htpVar.remainingField = i;
        }
        return i;
    }

    @Override // defpackage.htm
    public final void b(htp htpVar, Set set) {
        synchronized (htpVar) {
            if (htpVar.seenExceptionsField == null) {
                htpVar.seenExceptionsField = set;
            }
        }
    }
}
