package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface hic extends Collection {
    int a(Object obj, int i);

    int b(Object obj);

    @Override // java.util.Collection, defpackage.hic
    boolean contains(Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection collection);

    int d(Object obj, int i);

    boolean h(Object obj, int i);

    Set i();

    Set j();

    @Override // java.util.Collection, defpackage.hic
    boolean remove(Object obj);

    @Override // java.util.Collection, defpackage.hic
    int size();
}
