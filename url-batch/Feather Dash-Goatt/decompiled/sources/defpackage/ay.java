package defpackage;

import java.io.FileInputStream;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ay extends fn {
    public Object h;
    public FileInputStream i;
    public /* synthetic */ Object j;
    public final /* synthetic */ cy k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(cy cyVar, fn fnVar) {
        super(fnVar);
        this.k = cyVar;
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return cy.a(this.k, this);
    }
}
