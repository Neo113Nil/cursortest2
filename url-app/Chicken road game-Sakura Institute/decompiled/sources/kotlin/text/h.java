package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
/* loaded from: classes.dex */
final class h extends M2.p implements Function1<Integer, MatchGroup> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f7535d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar) {
        super(1);
        this.f7535d = iVar;
    }

    public final MatchGroup a(int i2) {
        return this.f7535d.h(i2);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).intValue());
    }
}
