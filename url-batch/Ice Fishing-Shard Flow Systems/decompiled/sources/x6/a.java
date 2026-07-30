package x6;

import A6.q;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.collections.A;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f8413a;

    /* renamed from: b, reason: collision with root package name */
    public A f8414b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f8415c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f8416d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f8417e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f8418f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f8419g;

    public a(String serialName) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f8413a = serialName;
        this.f8414b = A.f6115d;
        this.f8415c = new ArrayList();
        this.f8416d = new HashSet();
        this.f8417e = new ArrayList();
        this.f8418f = new ArrayList();
        this.f8419g = new ArrayList();
    }

    public static void a(a aVar, String elementName, q descriptor) {
        A annotations = A.f6115d;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (aVar.f8416d.add(elementName)) {
            aVar.f8415c.add(elementName);
            aVar.f8417e.add(descriptor);
            aVar.f8418f.add(annotations);
            aVar.f8419g.add(false);
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered in " + aVar.f8413a).toString());
    }
}
