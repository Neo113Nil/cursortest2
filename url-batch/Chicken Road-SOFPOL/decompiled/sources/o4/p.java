package o4;

import androidx.lifecycle.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public final y f5674a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5675b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f5676c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5677d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f5678e = new LinkedHashMap();

    public p(y yVar, String str) {
        this.f5674a = yVar;
        this.f5675b = str;
    }

    public o a() {
        o b8 = b();
        b8.getClass();
        l.n nVar = b8.f5671e;
        Iterator it = this.f5676c.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            q6.i.e(str, "argumentName");
            q6.i.e(null, "argument");
            throw null;
        }
        ArrayList arrayList = this.f5677d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            final m mVar = (m) obj;
            q6.i.e(mVar, "navDeepLink");
            nVar.getClass();
            final int i8 = 0;
            ArrayList N = h0.a.N((LinkedHashMap) nVar.f4351d, new p6.c() { // from class: r4.h
                @Override // p6.c
                public final Object i(Object obj2) {
                    boolean contains;
                    String str2 = (String) obj2;
                    switch (i8) {
                        case 0:
                            q6.i.e(str2, "key");
                            contains = mVar.c().contains(str2);
                            break;
                        default:
                            q6.i.e(str2, "key");
                            contains = mVar.c().contains(str2);
                            break;
                    }
                    return Boolean.valueOf(!contains);
                }
            });
            if (!N.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + mVar.f5653a + " can't be used to open destination " + ((o) nVar.f4349b) + ".\nFollowing required arguments are missing: " + N).toString());
            }
            ((ArrayList) nVar.f4350c).add(mVar);
        }
        Iterator it2 = this.f5678e.entrySet().iterator();
        if (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            ((Number) entry2.getKey()).intValue();
            if (entry2.getValue() != null) {
                throw new ClassCastException();
            }
            q6.i.e(null, "action");
            throw null;
        }
        String str2 = this.f5675b;
        if (str2 != null) {
            nVar.getClass();
            if (y6.j.e0(str2)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String concat = "android-app://androidx.navigation/".concat(str2);
            q6.i.e(concat, "uriPattern");
            final m mVar2 = new m(concat);
            final int i9 = 1;
            ArrayList N2 = h0.a.N((LinkedHashMap) nVar.f4351d, new p6.c() { // from class: r4.h
                @Override // p6.c
                public final Object i(Object obj2) {
                    boolean contains;
                    String str22 = (String) obj2;
                    switch (i9) {
                        case 0:
                            q6.i.e(str22, "key");
                            contains = mVar2.c().contains(str22);
                            break;
                        default:
                            q6.i.e(str22, "key");
                            contains = mVar2.c().contains(str22);
                            break;
                    }
                    return Boolean.valueOf(!contains);
                }
            });
            if (!N2.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + str2 + "\" for destination " + ((o) nVar.f4349b) + ". Following required arguments are missing: " + N2).toString());
            }
            nVar.f4353f = a.a.r(new m0(12, concat));
            nVar.f4348a = concat.hashCode();
            nVar.f4352e = str2;
        }
        return b8;
    }

    public o b() {
        return this.f5674a.a();
    }
}
