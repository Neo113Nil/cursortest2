package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ktx implements Iterable {
    final /* synthetic */ ktu a;

    public ktx(ktu ktuVar) {
        this.a = ktuVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new kua((ktz) this.a);
    }
}
