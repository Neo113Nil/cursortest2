package kotlin.coroutines;

import M2.p;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
final class h extends p implements Function2<CoroutineContext, CoroutineContext.Element, CoroutineContext> {

    /* renamed from: d, reason: collision with root package name */
    public static final h f7497d = new h(2);

    public h() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CoroutineContext h(CoroutineContext acc, CoroutineContext.Element element) {
        d dVar;
        Intrinsics.checkNotNullParameter(acc, "acc");
        Intrinsics.checkNotNullParameter(element, "element");
        CoroutineContext w4 = acc.w(element.getKey());
        i iVar = i.f7498d;
        if (w4 == iVar) {
            return element;
        }
        C2.b bVar = e.f7496f;
        e eVar = (e) w4.k(bVar);
        if (eVar == null) {
            dVar = new d(w4, element);
        } else {
            CoroutineContext w5 = w4.w(bVar);
            if (w5 == iVar) {
                return new d(element, eVar);
            }
            dVar = new d(new d(w5, element), eVar);
        }
        return dVar;
    }
}
