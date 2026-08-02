package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bce implements bbv {
    private final bek a;

    public bce(bek bekVar) {
        this.a = bekVar;
    }

    @Override // defpackage.bbv
    public final /* bridge */ /* synthetic */ bbw a(Object obj) {
        return new bcf((InputStream) obj, this.a);
    }

    @Override // defpackage.bbv
    public final Class b() {
        return InputStream.class;
    }
}
