package h1;

import M2.p;
import f1.X;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import z3.m;
import z3.v;

/* renamed from: h1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0651d extends p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public static final C0651d f6836d = new C0651d(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        v path = (v) obj;
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter((m) obj2, "<anonymous parameter 1>");
        Intrinsics.checkNotNullParameter(path, "path");
        String filePath = E1.i.i(path.f12038d.C(), true).f12038d.C();
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return new X(filePath);
    }
}
