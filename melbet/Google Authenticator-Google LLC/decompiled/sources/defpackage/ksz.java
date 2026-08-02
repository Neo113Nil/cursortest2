package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ksz extends kte {
    public abstract Random a();

    @Override // defpackage.kte
    public final int b() {
        return a().nextInt(2147418112);
    }
}
