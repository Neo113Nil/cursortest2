package X;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public long f3559b = -9223372036854775807L;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3558a = new ArrayList();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f3559b, ((s) obj).f3559b);
    }
}
