package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hoz extends hpa implements Serializable {
    private static final long serialVersionUID = 0;
    public final int a;

    public hoz(int i) {
        this.a = i;
    }

    @Override // defpackage.hpa
    public final int a() {
        return this.a;
    }

    @Override // defpackage.hpa
    public final int b() {
        return 32;
    }

    @Override // defpackage.hpa
    public final boolean c(hpa hpaVar) {
        return this.a == hpaVar.a();
    }

    @Override // defpackage.hpa
    public final byte[] d() {
        int i = this.a;
        return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
    }
}
