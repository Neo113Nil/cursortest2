package u3;

import java.util.List;
import kotlin.collections.C3218h;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final int f46387a;

    /* renamed from: b, reason: collision with root package name */
    private final C3218h f46388b = new C3218h();

    public a(int i4) {
        this.f46387a = i4;
    }

    public final List a() {
        List list;
        synchronized (this.f46388b) {
            list = CollectionsKt.toList(this.f46388b);
        }
        return list;
    }
}
