package re;

import java.util.ArrayList;
import java.util.HashSet;
import kotlin.collections.j0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f8229a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f8230b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f8231c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8232d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f8233e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f8234f = new ArrayList();

    public a(String str) {
        this.f8229a = str;
    }

    public static void a(a aVar, String str, e eVar) {
        j0 j0Var = j0.f5574d;
        aVar.getClass();
        eVar.getClass();
        j0Var.getClass();
        if (!aVar.f8231c.add(str)) {
            StringBuilder q3 = v4.a.q("Element with name '", str, "' is already registered in ");
            q3.append(aVar.f8229a);
            throw new IllegalArgumentException(q3.toString().toString());
        }
        aVar.f8230b.add(str);
        aVar.f8232d.add(eVar);
        aVar.f8233e.add(j0Var);
        aVar.f8234f.add(false);
    }
}
