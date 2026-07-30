package m5;

import o5.j;
import q5.h;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final d f6427d = new d(1, null, false);

    /* renamed from: e, reason: collision with root package name */
    public static final d f6428e = new d(2, null, false);

    /* renamed from: a, reason: collision with root package name */
    public final int f6429a;

    /* renamed from: b, reason: collision with root package name */
    public final h f6430b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6431c;

    public d(int i7, h hVar, boolean z8) {
        this.f6429a = i7;
        this.f6430b = hVar;
        this.f6431c = z8;
        j.c(!z8 || i7 == 2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OperationSource{source=");
        int i7 = this.f6429a;
        sb.append(i7 != 1 ? i7 != 2 ? "null" : "Server" : "User");
        sb.append(", queryParams=");
        sb.append(this.f6430b);
        sb.append(", tagged=");
        sb.append(this.f6431c);
        sb.append('}');
        return sb.toString();
    }
}
