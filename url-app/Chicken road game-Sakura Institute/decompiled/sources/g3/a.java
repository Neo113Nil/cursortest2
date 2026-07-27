package g3;

import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import z2.C1405I;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f6776a;

    /* renamed from: b, reason: collision with root package name */
    public C1405I f6777b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6778c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f6779d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f6780e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f6781f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f6782g;

    public a(String serialName) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f6776a = serialName;
        this.f6777b = C1405I.f11931d;
        this.f6778c = new ArrayList();
        this.f6779d = new HashSet();
        this.f6780e = new ArrayList();
        this.f6781f = new ArrayList();
        this.f6782g = new ArrayList();
    }

    public static void a(a aVar, String elementName, SerialDescriptor descriptor) {
        C1405I annotations = C1405I.f11931d;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (aVar.f6779d.add(elementName)) {
            aVar.f6778c.add(elementName);
            aVar.f6780e.add(descriptor);
            aVar.f6781f.add(annotations);
            aVar.f6782g.add(false);
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered in " + aVar.f6776a).toString());
    }
}
