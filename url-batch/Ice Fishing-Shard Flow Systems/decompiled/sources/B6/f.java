package B6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends e {

    /* renamed from: i, reason: collision with root package name */
    public final boolean f221i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p writer, boolean z7) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f221i = z7;
    }

    @Override // B6.e
    public final void k(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f221i) {
            super.k(value);
        } else {
            h(value);
        }
    }
}
