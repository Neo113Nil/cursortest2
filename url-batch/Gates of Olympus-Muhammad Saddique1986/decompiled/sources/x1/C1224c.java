package x1;

import f2.j;

/* renamed from: x1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1224c implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f10308d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10309e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10310f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10311g;

    public C1224c(int i3, int i4, String str, String str2) {
        this.f10308d = i3;
        this.f10309e = i4;
        this.f10310f = str;
        this.f10311g = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1224c c1224c = (C1224c) obj;
        j.f(c1224c, "other");
        int i3 = this.f10308d - c1224c.f10308d;
        return i3 == 0 ? this.f10309e - c1224c.f10309e : i3;
    }
}
