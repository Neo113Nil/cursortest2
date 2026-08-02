package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dzn extends ez {
    @Override // defpackage.ez
    public final /* bridge */ /* synthetic */ boolean a(Object obj, Object obj2) {
        jib jibVar = (jib) obj;
        jib jibVar2 = (jib) obj2;
        if (jibVar instanceof jic) {
            return ksp.b((jic) jibVar, jibVar2 instanceof jic ? (jic) jibVar2 : null);
        }
        if (jibVar instanceof jid) {
            return ksp.b((jid) jibVar, jibVar2 instanceof jid ? (jid) jibVar2 : null);
        }
        throw new koj();
    }

    @Override // defpackage.ez
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        jib jibVar = (jib) obj;
        jib jibVar2 = (jib) obj2;
        if (jibVar instanceof jic) {
            if (jibVar2 instanceof jic) {
                if (((jic) jibVar).a.b == ((jic) jibVar2).a.b) {
                    return true;
                }
            }
            return false;
        }
        if (!(jibVar instanceof jid)) {
            throw new koj();
        }
        if (!(jibVar2 instanceof jid)) {
            return false;
        }
        throw null;
    }
}
