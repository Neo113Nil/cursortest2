package Y7;

import b8.q;
import com.google.android.gms.internal.ads.CL;
import java.util.ArrayList;
import java.util.HashSet;
import r7.C4985p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f4027a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4028b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f4029c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4030d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f4031e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f4032f = new ArrayList();

    public a(String str) {
        this.f4027a = str;
    }

    public static void a(a aVar, String str, q qVar) {
        C4985p c4985p = C4985p.f40358n;
        aVar.getClass();
        if (!aVar.f4029c.add(str)) {
            StringBuilder m8 = CL.m("Element with name '", str, "' is already registered in ");
            m8.append(aVar.f4027a);
            throw new IllegalArgumentException(m8.toString().toString());
        }
        aVar.f4028b.add(str);
        aVar.f4030d.add(qVar);
        aVar.f4031e.add(c4985p);
        aVar.f4032f.add(false);
    }
}
