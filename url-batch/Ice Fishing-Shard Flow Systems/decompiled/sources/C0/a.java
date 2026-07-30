package C0;

import A0.i;
import A0.l;
import android.content.Context;
import kotlin.collections.A;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements B0.a {
    @Override // B0.a
    public final void a(i callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // B0.a
    public final void b(Context context, e0.c executor, i callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.accept(new l(A.f6115d));
    }
}
