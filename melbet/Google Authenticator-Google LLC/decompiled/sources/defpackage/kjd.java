package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kjd implements kmo {
    private InputStream a;

    public kjd(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.kmo
    public final InputStream e() {
        InputStream inputStream = this.a;
        this.a = null;
        return inputStream;
    }
}
