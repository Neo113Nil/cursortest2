package m7;

import e6.u;
import java.util.ArrayList;
import java.util.HashSet;
import kotlinx.serialization.descriptors.SerialDescriptor;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f6434a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f6435b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f6436c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f6437d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f6438e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f6439f;

    public a(String str) {
        k.f(str, "serialName");
        this.f6434a = str;
        this.f6435b = new ArrayList();
        this.f6436c = new HashSet();
        this.f6437d = new ArrayList();
        this.f6438e = new ArrayList();
        this.f6439f = new ArrayList();
    }

    public static void a(a aVar, String str, SerialDescriptor serialDescriptor) {
        aVar.getClass();
        k.f(serialDescriptor, "descriptor");
        if (aVar.f6436c.add(str)) {
            aVar.f6435b.add(str);
            aVar.f6437d.add(serialDescriptor);
            aVar.f6438e.add(u.f2826f);
            aVar.f6439f.add(false);
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + str + "' is already registered in " + aVar.f6434a).toString());
    }
}
