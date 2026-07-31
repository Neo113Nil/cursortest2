package A2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f55a;

    /* renamed from: b, reason: collision with root package name */
    private List f56b;

    /* renamed from: c, reason: collision with root package name */
    private final List f57c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f58d;

    /* renamed from: e, reason: collision with root package name */
    private final List f59e;

    /* renamed from: f, reason: collision with root package name */
    private final List f60f;

    /* renamed from: g, reason: collision with root package name */
    private final List f61g;

    public a(String serialName) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f55a = serialName;
        this.f56b = CollectionsKt.emptyList();
        this.f57c = new ArrayList();
        this.f58d = new HashSet();
        this.f59e = new ArrayList();
        this.f60f = new ArrayList();
        this.f61g = new ArrayList();
    }

    public static /* synthetic */ void b(a aVar, String str, f fVar, List list, boolean z4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i4 & 8) != 0) {
            z4 = false;
        }
        aVar.a(str, fVar, list, z4);
    }

    public final void a(String elementName, f descriptor, List annotations, boolean z4) {
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (this.f58d.add(elementName)) {
            this.f57c.add(elementName);
            this.f59e.add(descriptor);
            this.f60f.add(annotations);
            this.f61g.add(Boolean.valueOf(z4));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered in " + this.f55a).toString());
    }

    public final List c() {
        return this.f56b;
    }

    public final List d() {
        return this.f60f;
    }

    public final List e() {
        return this.f59e;
    }

    public final List f() {
        return this.f57c;
    }

    public final List g() {
        return this.f61g;
    }

    public final void h(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f56b = list;
    }
}
