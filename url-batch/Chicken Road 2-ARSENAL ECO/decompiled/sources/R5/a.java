package R5;

import U5.p;
import java.util.ArrayList;
import java.util.HashSet;
import l5.C0512p;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2141a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2142b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f2143c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2144d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2145e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2146f = new ArrayList();

    public a(String str) {
        this.f2141a = str;
    }

    public static void a(a aVar, String str, p pVar) {
        aVar.getClass();
        if (aVar.f2143c.add(str)) {
            aVar.f2142b.add(str);
            aVar.f2144d.add(pVar);
            aVar.f2145e.add(C0512p.f5303f);
            aVar.f2146f.add(false);
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + str + "' is already registered in " + aVar.f2141a).toString());
    }
}
