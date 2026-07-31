package E2;

import D2.AbstractC0348a;
import D2.C0349b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class N extends AbstractC0372c {

    /* renamed from: f, reason: collision with root package name */
    private final C0349b f536f;

    /* renamed from: g, reason: collision with root package name */
    private final int f537g;

    /* renamed from: h, reason: collision with root package name */
    private int f538h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(AbstractC0348a json, C0349b value) {
        super(json, value, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f536f = value;
        this.f537g = s0().size();
        this.f538h = -1;
    }

    @Override // C2.AbstractC0320l0
    protected String a0(A2.f descriptor, int i4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return String.valueOf(i4);
    }

    @Override // E2.AbstractC0372c
    protected D2.i e0(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return s0().get(Integer.parseInt(tag));
    }

    @Override // B2.c
    public int t(A2.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i4 = this.f538h;
        if (i4 >= this.f537g - 1) {
            return -1;
        }
        int i5 = i4 + 1;
        this.f538h = i5;
        return i5;
    }

    @Override // E2.AbstractC0372c
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public C0349b s0() {
        return this.f536f;
    }
}
