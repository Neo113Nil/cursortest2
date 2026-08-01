package defpackage;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class t70 extends x90 {
    public final String f;
    public final long g;
    public final j70 h;

    public t70(String str, long j, j70 j70Var) {
        this.f = str;
        this.g = j;
        this.h = j70Var;
    }

    @Override // defpackage.x90
    public final long i() {
        return this.g;
    }

    @Override // defpackage.x90
    public final l10 n() {
        String str = this.f;
        if (str != null) {
            Pattern pattern = l10.c;
            try {
                return n9.l(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.x90
    public final w9 r() {
        return this.h;
    }
}
