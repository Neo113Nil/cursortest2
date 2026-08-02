package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hsi implements Comparable {
    public final Object a;
    final int b;
    public final List c = new ArrayList();
    public int d;

    public hsi(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.b, ((hsi) obj).b);
    }
}
