package defpackage;

import java.util.Iterator;
import kotlin.sequences.Sequence;
import kotlin.text.d;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class lr implements Sequence {
    public final CharSequence a;
    public final int b;
    public final d c;

    public lr(CharSequence charSequence, int i, d dVar) {
        this.a = charSequence;
        this.b = i;
        this.c = dVar;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new kr(this);
    }
}
