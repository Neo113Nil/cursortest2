package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pa {
    public final Resources a;
    public final int b;
    public final /* synthetic */ pb c;

    public pa(pb pbVar, Resources resources, boolean z, boolean z2, boolean z3, boolean z4) {
        this.c = pbVar;
        this.a = resources;
        int i = 0;
        if (z4 && pj.c(33023)) {
            i = 1;
        }
        if (pj.d(33023)) {
            i = z ? i | 4 : i;
            i = z2 ? i | 8 : i;
            if (z3) {
                i |= 2;
            }
        }
        this.b = i;
    }
}
