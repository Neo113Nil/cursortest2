package e0;

import T.C0097o;
import W.J;
import a.AbstractC0124a;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;
import v2.I;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public final C0097o f8394a;

    /* renamed from: b, reason: collision with root package name */
    public final I f8395b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8396c;

    /* renamed from: d, reason: collision with root package name */
    public final List f8397d;

    /* renamed from: e, reason: collision with root package name */
    public final j f8398e;

    public m(C0097o c0097o, List list, s sVar, List list2) {
        AbstractC0124a.h(!list.isEmpty());
        this.f8394a = c0097o;
        this.f8395b = I.k(list);
        this.f8397d = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.f8398e = sVar.a(this);
        long j4 = sVar.f8415c;
        long j5 = sVar.f8414b;
        String str = J.f3263a;
        this.f8396c = J.U(j4, 1000000L, j5, RoundingMode.DOWN);
    }

    public abstract String b();

    public abstract d0.i c();

    public abstract j d();
}
