package d;

import androidx.fragment.app.H;
import kotlin.collections.C0633l;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y implements c {

    /* renamed from: d, reason: collision with root package name */
    public final H f4613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0349A f4614e;

    public y(C0349A c0349a, H onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f4614e = c0349a;
        this.f4613d = onBackPressedCallback;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.n] */
    @Override // d.c
    public final void cancel() {
        C0349A c0349a = this.f4614e;
        C0633l c0633l = c0349a.f4560b;
        H h7 = this.f4613d;
        c0633l.remove(h7);
        if (Intrinsics.a(c0349a.f4561c, h7)) {
            h7.a();
            c0349a.f4561c = null;
        }
        h7.getClass();
        Intrinsics.checkNotNullParameter(this, "cancellable");
        h7.f3585b.remove(this);
        ?? r0 = h7.f3586c;
        if (r0 != 0) {
            r0.invoke();
        }
        h7.f3586c = null;
    }
}
