package defpackage;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class bz extends a10 {
    public final String f;
    public final long g;
    public final ry h;

    public bz(String str, long j, ry ryVar) {
        this.f = str;
        this.g = j;
        this.h = ryVar;
    }

    @Override // defpackage.a10
    public final long m() {
        return this.g;
    }

    @Override // defpackage.a10
    public final wt n() {
        String str = this.f;
        if (str != null) {
            Pattern pattern = wt.c;
            try {
                return j8.n(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.a10
    public final r8 o() {
        return this.h;
    }
}
