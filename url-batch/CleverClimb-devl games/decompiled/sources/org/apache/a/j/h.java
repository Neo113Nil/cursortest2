package org.apache.a.j;

import java.io.IOException;
import org.apache.a.p;
import org.apache.a.q;
import org.apache.a.r;
import org.apache.a.t;

/* compiled from: ImmutableHttpProcessor.java */
/* loaded from: classes2.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    private final q[] f9986a;

    /* renamed from: b, reason: collision with root package name */
    private final t[] f9987b;

    public h(q[] qVarArr, t[] tVarArr) {
        if (qVarArr != null) {
            int length = qVarArr.length;
            this.f9986a = new q[length];
            for (int i = 0; i < length; i++) {
                this.f9986a[i] = qVarArr[i];
            }
        } else {
            this.f9986a = new q[0];
        }
        if (tVarArr != null) {
            int length2 = tVarArr.length;
            this.f9987b = new t[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                this.f9987b[i2] = tVarArr[i2];
            }
            return;
        }
        this.f9987b = new t[0];
    }

    @Override // org.apache.a.q
    public void a(p pVar, e eVar) throws IOException, org.apache.a.l {
        for (int i = 0; i < this.f9986a.length; i++) {
            this.f9986a[i].a(pVar, eVar);
        }
    }

    @Override // org.apache.a.t
    public void a(r rVar, e eVar) throws IOException, org.apache.a.l {
        for (int i = 0; i < this.f9987b.length; i++) {
            this.f9987b[i].a(rVar, eVar);
        }
    }
}
