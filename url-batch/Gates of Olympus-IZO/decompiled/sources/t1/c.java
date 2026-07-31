package t1;

import Z1.i;

/* loaded from: classes.dex */
public final class c implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f7982d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7983e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7984f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7985g;

    public c(int i3, int i4, String str, String str2) {
        this.f7982d = i3;
        this.f7983e = i4;
        this.f7984f = str;
        this.f7985g = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        i.f(cVar, "other");
        int i3 = this.f7982d - cVar.f7982d;
        return i3 == 0 ? this.f7983e - cVar.f7983e : i3;
    }
}
