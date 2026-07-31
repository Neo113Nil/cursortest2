package D2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: D2.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0350c {

    /* renamed from: a, reason: collision with root package name */
    private final List f376a = new ArrayList();

    public final boolean a(i element) {
        Intrinsics.checkNotNullParameter(element, "element");
        this.f376a.add(element);
        return true;
    }

    public final C0349b b() {
        return new C0349b(this.f376a);
    }
}
