package z2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
/* renamed from: z2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1417a extends M2.p implements Function1<Object, CharSequence> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC1418b f11936d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1417a(AbstractC1418b abstractC1418b) {
        super(1);
        this.f11936d = abstractC1418b;
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CharSequence invoke(Object obj) {
        return obj == this.f11936d ? "(this Collection)" : String.valueOf(obj);
    }
}
