package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class io implements vl {
    public final qo f;
    public final /* synthetic */ no g;

    public io(no noVar, qo qoVar) {
        this.g = noVar;
        this.f = qoVar;
    }

    @Override // defpackage.vl
    public final Object a() {
        no noVar = this.g;
        qo qoVar = this.f;
        try {
        } catch (IOException e) {
            noVar.m(2, 2, e);
        } catch (Throwable th) {
            noVar.m(3, 3, null);
            y70.b(qoVar);
            throw th;
        }
        if (!qoVar.m(true, this)) {
            throw new IOException("Required SETTINGS preface not received");
        }
        while (qoVar.m(false, this)) {
        }
        noVar.m(1, 9, null);
        y70.b(qoVar);
        return vg.m;
    }
}
