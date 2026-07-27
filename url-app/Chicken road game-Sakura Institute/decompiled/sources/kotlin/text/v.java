package kotlin.text;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
final class v extends M2.p implements Function2<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ char[] f7543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f7544e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(char[] cArr, boolean z4) {
        super(2);
        this.f7543d = cArr;
        this.f7544e = z4;
    }

    public final Pair<Integer, Integer> a(CharSequence $receiver, int i2) {
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        int w4 = y.w($receiver, this.f7543d, i2, this.f7544e);
        if (w4 < 0) {
            return null;
        }
        return new Pair<>(Integer.valueOf(w4), 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object h(Object obj, Object obj2) {
        return a((CharSequence) obj, ((Number) obj2).intValue());
    }
}
