package y0;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final M2.p f11546a;

    /* renamed from: b, reason: collision with root package name */
    public final M2.p f11547b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11548c;

    /* JADX WARN: Multi-variable type inference failed */
    public g(Function0 function0, Function0 function02, boolean z4) {
        this.f11546a = (M2.p) function0;
        this.f11547b = (M2.p) function02;
        this.f11548c = z4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [M2.p, kotlin.jvm.functions.Function0] */
    public final Function0 a() {
        return this.f11547b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [M2.p, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r1v6, types: [M2.p, kotlin.jvm.functions.Function0] */
    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f11546a.invoke()).floatValue() + ", maxValue=" + ((Number) this.f11547b.invoke()).floatValue() + ", reverseScrolling=" + this.f11548c + ')';
    }
}
