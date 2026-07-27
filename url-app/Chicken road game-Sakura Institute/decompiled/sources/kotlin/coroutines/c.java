package kotlin.coroutines;

import M2.p;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
final class c extends p implements Function2<String, CoroutineContext.Element, String> {

    /* renamed from: d, reason: collision with root package name */
    public static final c f7493d = new c(2);

    public c() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String h(String acc, CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(acc, "acc");
        Intrinsics.checkNotNullParameter(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }
}
