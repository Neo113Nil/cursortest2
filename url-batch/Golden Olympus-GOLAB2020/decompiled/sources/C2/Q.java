package C2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Q extends C0343x0 {

    /* renamed from: m, reason: collision with root package name */
    private final boolean f242m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(String name, L generatedSerializer) {
        super(name, generatedSerializer, 1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(generatedSerializer, "generatedSerializer");
        this.f242m = true;
    }

    @Override // C2.C0343x0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        A2.f fVar = (A2.f) obj;
        if (!Intrinsics.areEqual(a(), fVar.a())) {
            return false;
        }
        Q q4 = (Q) obj;
        if (!q4.isInline() || !Arrays.equals(p(), q4.p()) || f() != fVar.f()) {
            return false;
        }
        int f4 = f();
        for (int i4 = 0; i4 < f4; i4++) {
            if (!Intrinsics.areEqual(i(i4).a(), fVar.i(i4).a()) || !Intrinsics.areEqual(i(i4).e(), fVar.i(i4).e())) {
                return false;
            }
        }
        return true;
    }

    @Override // C2.C0343x0
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // C2.C0343x0, A2.f
    public boolean isInline() {
        return this.f242m;
    }
}
