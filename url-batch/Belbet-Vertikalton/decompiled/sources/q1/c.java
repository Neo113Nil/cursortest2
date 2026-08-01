package q1;

import i1.p;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements p1.d {

    /* renamed from: a, reason: collision with root package name */
    public final String f4003a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4004b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4005c;

    /* renamed from: d, reason: collision with root package name */
    public final j1.i f4006d;

    /* JADX WARN: Multi-variable type inference failed */
    public c(String str, int i, int i2, p pVar) {
        j1.h.e(str, "input");
        this.f4003a = str;
        this.f4004b = i;
        this.f4005c = i2;
        this.f4006d = (j1.i) pVar;
    }

    @Override // p1.d
    public final Iterator iterator() {
        return new b(this);
    }
}
