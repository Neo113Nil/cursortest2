package z2;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z2.AbstractC1423g;

@Metadata
/* renamed from: z2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1426j extends M2.p implements Function1<Map.Entry<Object, Object>, CharSequence> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC1423g f11950d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1426j(AbstractC1423g abstractC1423g) {
        super(1);
        this.f11950d = abstractC1423g;
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CharSequence invoke(Map.Entry<Object, Object> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AbstractC1423g.a aVar = AbstractC1423g.f11944i;
        AbstractC1423g abstractC1423g = this.f11950d;
        abstractC1423g.getClass();
        StringBuilder sb = new StringBuilder();
        Object key = it.getKey();
        sb.append(key == abstractC1423g ? "(this Map)" : String.valueOf(key));
        sb.append('=');
        Object value = it.getValue();
        sb.append(value != abstractC1423g ? String.valueOf(value) : "(this Map)");
        return sb.toString();
    }
}
