package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bcf implements bbw {
    public final bin a;

    public bcf(InputStream inputStream, bek bekVar) {
        bin binVar = new bin(inputStream, bekVar);
        this.a = binVar;
        binVar.mark(5242880);
    }

    @Override // defpackage.bbw
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.bbw
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InputStream a() {
        bin binVar = this.a;
        binVar.reset();
        return binVar;
    }
}
