package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class em extends we {
    public final ue t;

    public em(int i, ue ueVar) {
        super(i);
        this.t = ueVar;
        if (ueVar == ue.d) {
            dd0.k("This implementation does not support suspension for senders, use ", a21.a(we.class).a(), " instead");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        dd0.g("Buffered channel capacity must be at least 1, but ", i, " was specified");
        throw null;
    }

    public final Object M(Object obj, boolean z) {
        if (this.t != ue.g) {
            return I(obj);
        }
        Object s = super.s(obj);
        return (!(s instanceof og) || (s instanceof ng)) ? s : Unit.a;
    }

    @Override // defpackage.we, defpackage.c91
    public final Object e(dn dnVar, Object obj) {
        if (M(obj, true) instanceof ng) {
            throw t();
        }
        return Unit.a;
    }

    @Override // defpackage.we, defpackage.c91
    public final Object s(Object obj) {
        return M(obj, false);
    }

    @Override // defpackage.we
    public final boolean z() {
        return this.t == ue.e;
    }
}
