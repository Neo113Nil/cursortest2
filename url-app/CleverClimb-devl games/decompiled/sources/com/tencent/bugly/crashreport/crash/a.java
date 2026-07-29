package com.tencent.bugly.crashreport.crash;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public final class a implements Comparable<a> {

    /* renamed from: a, reason: collision with root package name */
    public long f8623a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f8624b = -1;

    /* renamed from: c, reason: collision with root package name */
    public String f8625c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8626d = false;
    public boolean e = false;
    public int f = 0;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(a aVar) {
        a aVar2 = aVar;
        if (aVar2 == null) {
            return 1;
        }
        long j = this.f8624b - aVar2.f8624b;
        if (j <= 0) {
            return j < 0 ? -1 : 0;
        }
        return 1;
    }
}
