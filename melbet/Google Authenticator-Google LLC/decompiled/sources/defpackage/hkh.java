package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hkh extends hjy {
    private static final hku b = new hku();

    @Deprecated
    public static hkh l(String str) {
        return new hkh(hmu.d(str.replace('/', '.')));
    }

    @Override // defpackage.hjy
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final hkf a(Level level) {
        boolean j = j(level);
        hmu.n(h(), level, j);
        return !j ? b : new hkg(this, level);
    }
}
