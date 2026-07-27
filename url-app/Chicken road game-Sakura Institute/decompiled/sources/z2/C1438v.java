package z2;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
/* renamed from: z2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1438v extends M2.p implements Function0<Iterator<Object>> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object[] f11961d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1438v(Object[] objArr) {
        super(0);
        this.f11961d = objArr;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Iterator<Object> invoke() {
        return M2.J.f(this.f11961d);
    }
}
