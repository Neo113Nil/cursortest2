package defpackage;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class my extends k00 {
    public final String f;
    public final long g;
    public final cy h;

    public my(String str, long j, cy cyVar) {
        this.f = str;
        this.g = j;
        this.h = cyVar;
    }

    @Override // defpackage.k00
    public final long m() {
        return this.g;
    }

    @Override // defpackage.k00
    public final ht n() {
        String str = this.f;
        if (str != null) {
            Pattern pattern = ht.c;
            try {
                return jw.s(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.k00
    public final w8 o() {
        return this.h;
    }
}
