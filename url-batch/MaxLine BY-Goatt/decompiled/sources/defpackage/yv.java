package defpackage;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yv implements Sequence {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ yv(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return ((Iterable) this.b).iterator();
            case 1:
                return new be1(this);
            case 2:
                return (Iterator) this.b;
            default:
                return new ae1((CharSequence) this.b);
        }
    }
}
