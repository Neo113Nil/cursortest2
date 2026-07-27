package androidx.lifecycle;

import M2.C0256h;
import kotlin.jvm.internal.Intrinsics;
import p1.C0993c;

/* loaded from: classes.dex */
public class W implements V {

    /* renamed from: a, reason: collision with root package name */
    public static W f5461a;

    @Override // androidx.lifecycle.V
    public T a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return m3.z.j(modelClass);
    }

    @Override // androidx.lifecycle.V
    public T b(Class modelClass, C0993c extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return a(modelClass);
    }

    @Override // androidx.lifecycle.V
    public final T c(C0256h modelClass, C0993c extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return b(u3.l.g0(modelClass), extras);
    }
}
