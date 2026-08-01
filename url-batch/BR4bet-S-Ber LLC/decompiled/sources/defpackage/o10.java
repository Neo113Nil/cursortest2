package defpackage;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class o10 extends p30 {
    public final String f;
    public final long g;
    public final e10 h;

    public o10(String str, long j, e10 e10Var) {
        this.f = str;
        this.g = j;
        this.h = e10Var;
    }

    @Override // defpackage.p30
    public final long f() {
        return this.g;
    }

    @Override // defpackage.p30
    public final iw g() {
        String str = this.f;
        if (str != null) {
            Pattern pattern = iw.c;
            try {
                return b9.o(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.p30
    public final j9 h() {
        return this.h;
    }
}
