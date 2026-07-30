package defpackage;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yl0<T> implements Sequence<T> {
    public final ps2 a;
    public final de2 b;

    public yl0(ps2 ps2Var, de2 de2Var) {
        this.a = ps2Var;
        this.b = de2Var;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new xl0(this);
    }
}
