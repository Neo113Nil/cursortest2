package E2;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: E2.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0384o extends C0383n {

    /* renamed from: c, reason: collision with root package name */
    private final boolean f621c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0384o(Q writer, boolean z4) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f621c = z4;
    }

    @Override // E2.C0383n
    public void m(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f621c) {
            super.m(value);
        } else {
            super.j(value);
        }
    }
}
