package kotlin.text;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f5614a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5615b;

    /* renamed from: c, reason: collision with root package name */
    public final p f5616c;

    public c(CharSequence charSequence, int i3, p pVar) {
        this.f5614a = charSequence;
        this.f5615b = i3;
        this.f5616c = pVar;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new b(this);
    }
}
