package c;

import W2.B;
import W2.r0;
import Y2.l;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;

/* renamed from: c.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0526f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5709a;

    /* renamed from: b, reason: collision with root package name */
    public final Y2.e f5710b = l.a(-2, 4, Y2.a.f4398d);

    /* renamed from: c, reason: collision with root package name */
    public final r0 f5711c;

    public C0526f(b3.c cVar, boolean z4, Function2 function2) {
        this.f5709a = z4;
        this.f5711c = B.m(cVar, null, null, new C0525e(function2, this, null), 3);
    }

    public final void a() {
        this.f5710b.g(new CancellationException("onBack cancelled"), true);
        this.f5711c.a(null);
    }
}
