package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata
/* loaded from: classes.dex */
final class x extends M2.p implements Function1<IntRange, String> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f7547d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String str) {
        super(1);
        this.f7547d = str;
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke(IntRange it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return y.I(this.f7547d, it);
    }
}
