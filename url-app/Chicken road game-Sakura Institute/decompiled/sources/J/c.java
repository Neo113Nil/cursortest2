package J;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public interface c extends List, Collection, N2.a {
    K.f a();

    @Override // java.util.List
    c add(int i2, Object obj);

    @Override // java.util.List, java.util.Collection
    c add(Object obj);

    @Override // java.util.List, java.util.Collection
    c addAll(Collection collection);

    c l(int i2);

    c o(K.b bVar);

    @Override // java.util.List
    c set(int i2, Object obj);
}
