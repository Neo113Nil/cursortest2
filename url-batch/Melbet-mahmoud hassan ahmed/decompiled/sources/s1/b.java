package s1;

import android.net.Uri;
import java.io.InputStream;
import java.util.List;
import n2.j0;
import s1.a;

/* loaded from: classes.dex */
public final class b<T extends a<T>> implements j0.a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final j0.a<? extends T> f21606a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f21607b;

    public b(j0.a<? extends T> aVar, List<c> list) {
        this.f21606a = aVar;
        this.f21607b = list;
    }

    @Override // n2.j0.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public T a(Uri uri, InputStream inputStream) {
        T a7 = this.f21606a.a(uri, inputStream);
        List<c> list = this.f21607b;
        return (list == null || list.isEmpty()) ? a7 : (T) a7.a(this.f21607b);
    }
}
