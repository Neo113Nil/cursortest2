package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hln extends hll {
    public static hln l(String str) {
        return new hln(hmu.d(str));
    }

    @Override // defpackage.hjy
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final hlk a(Level level) {
        boolean j = j(level);
        hmu.n(h(), level, j);
        return !j ? b : new hlm(this, level);
    }
}
