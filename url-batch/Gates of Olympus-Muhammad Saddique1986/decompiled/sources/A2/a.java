package A2;

import S1.u;
import java.util.ArrayList;
import java.util.HashSet;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f223a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f224b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f225c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f226d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f227e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f228f;

    public a(String str) {
        f2.j.f(str, "serialName");
        this.f223a = str;
        this.f224b = new ArrayList();
        this.f225c = new HashSet();
        this.f226d = new ArrayList();
        this.f227e = new ArrayList();
        this.f228f = new ArrayList();
    }

    public static void a(a aVar, String str, SerialDescriptor serialDescriptor) {
        u uVar = u.f4320d;
        aVar.getClass();
        f2.j.f(serialDescriptor, "descriptor");
        if (aVar.f225c.add(str)) {
            aVar.f224b.add(str);
            aVar.f226d.add(serialDescriptor);
            aVar.f227e.add(uVar);
            aVar.f228f.add(false);
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + str + "' is already registered in " + aVar.f223a).toString());
    }
}
