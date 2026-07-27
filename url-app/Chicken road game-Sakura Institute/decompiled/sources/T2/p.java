package T2;

import java.util.Iterator;
import kotlin.text.C0755b;

/* loaded from: classes.dex */
public final class p implements Iterable, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.text.c f4052d;

    public p(kotlin.text.c cVar) {
        this.f4052d = cVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0755b(this.f4052d);
    }
}
