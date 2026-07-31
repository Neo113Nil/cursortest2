package u2;

import M1.u;
import java.util.ArrayList;
import java.util.HashSet;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f8521a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f8522b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f8523c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8524d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f8525e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f8526f;

    public a(String str) {
        Z1.i.f(str, "serialName");
        this.f8521a = str;
        this.f8522b = new ArrayList();
        this.f8523c = new HashSet();
        this.f8524d = new ArrayList();
        this.f8525e = new ArrayList();
        this.f8526f = new ArrayList();
    }

    public static void a(a aVar, String str, SerialDescriptor serialDescriptor) {
        u uVar = u.f2803d;
        aVar.getClass();
        Z1.i.f(serialDescriptor, "descriptor");
        if (aVar.f8523c.add(str)) {
            aVar.f8522b.add(str);
            aVar.f8524d.add(serialDescriptor);
            aVar.f8525e.add(uVar);
            aVar.f8526f.add(false);
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + str + "' is already registered in " + aVar.f8521a).toString());
    }
}
