package androidx.fragment.app;

import a.AbstractC0169a;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0216g extends AbstractC0169a {

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3731i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public P0.s f3732k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0216g(d0 operation, boolean z7) {
        super(operation);
        Intrinsics.checkNotNullParameter(operation, "operation");
        this.f3731i = z7;
    }

    public final P0.s I(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.j) {
            return this.f3732k;
        }
        throw null;
    }
}
