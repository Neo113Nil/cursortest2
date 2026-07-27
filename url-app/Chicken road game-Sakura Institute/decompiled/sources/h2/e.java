package h2;

import j2.AbstractC0720j;
import l2.h;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final e f6876d = new e(1, null, false);

    /* renamed from: e, reason: collision with root package name */
    public static final e f6877e = new e(2, null, false);

    /* renamed from: a, reason: collision with root package name */
    public final int f6878a;

    /* renamed from: b, reason: collision with root package name */
    public final h f6879b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6880c;

    public e(int i2, h hVar, boolean z4) {
        this.f6878a = i2;
        this.f6879b = hVar;
        this.f6880c = z4;
        AbstractC0720j.c(!z4 || i2 == 2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OperationSource{source=");
        int i2 = this.f6878a;
        sb.append(i2 != 1 ? i2 != 2 ? "null" : "Server" : "User");
        sb.append(", queryParams=");
        sb.append(this.f6879b);
        sb.append(", tagged=");
        sb.append(this.f6880c);
        sb.append('}');
        return sb.toString();
    }
}
