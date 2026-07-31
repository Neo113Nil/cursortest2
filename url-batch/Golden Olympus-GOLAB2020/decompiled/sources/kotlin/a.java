package kotlin;

import W1.C1231a;
import a2.AbstractC1241b;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f41028a;

    static {
        Result.Companion companion = Result.Companion;
        f41028a = Result.m243constructorimpl(AbstractC1241b.f());
    }

    public static final Object b(C1231a c1231a, Object obj) {
        Intrinsics.checkNotNullParameter(c1231a, "<this>");
        return new b(c1231a.a(), obj).b();
    }
}
