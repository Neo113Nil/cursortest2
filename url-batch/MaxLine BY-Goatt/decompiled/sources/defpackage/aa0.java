package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class aa0 implements Sequence {
    public final CharSequence a;
    public final int b;
    public final Function2 c;

    public aa0(CharSequence charSequence, int i, Function2 function2) {
        charSequence.getClass();
        this.a = charSequence;
        this.b = i;
        this.c = function2;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new z90(this);
    }
}
