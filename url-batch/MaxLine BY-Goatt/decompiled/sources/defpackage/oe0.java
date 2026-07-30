package defpackage;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class oe0 implements Sequence, pe0 {
    public final Sequence a;
    public final int b;

    public oe0(Sequence sequence, int i) {
        sequence.getClass();
        this.a = sequence;
        this.b = i;
        if (i >= 0) {
            return;
        }
        ey.j("count must be non-negative, but was ", i, 46);
        throw null;
    }

    @Override // defpackage.pe0
    public final Sequence a(int i) {
        int i2 = this.b + i;
        return i2 < 0 ? new oe0(this, i) : new oe0(this.a, i2);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new i0(this);
    }
}
