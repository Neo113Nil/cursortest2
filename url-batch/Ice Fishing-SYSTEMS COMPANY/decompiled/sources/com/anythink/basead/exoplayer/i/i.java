package com.anythink.basead.exoplayer.i;

import com.anythink.basead.exoplayer.aa;
import com.anythink.basead.exoplayer.k.af;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f8138a;

    /* renamed from: b, reason: collision with root package name */
    public final aa[] f8139b;

    /* renamed from: c, reason: collision with root package name */
    public final g f8140c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8141d;

    public i(aa[] aaVarArr, f[] fVarArr, Object obj) {
        this.f8139b = aaVarArr;
        this.f8140c = new g(fVarArr);
        this.f8141d = obj;
        this.f8138a = aaVarArr.length;
    }

    public final boolean a(int i) {
        return this.f8139b[i] != null;
    }

    public final boolean a(i iVar) {
        if (iVar == null || iVar.f8140c.f8134a != this.f8140c.f8134a) {
            return false;
        }
        for (int i = 0; i < this.f8140c.f8134a; i++) {
            if (!a(iVar, i)) {
                return false;
            }
        }
        return true;
    }

    public final boolean a(i iVar, int i) {
        return iVar != null && af.a(this.f8139b[i], iVar.f8139b[i]) && af.a(this.f8140c.a(i), iVar.f8140c.a(i));
    }
}
