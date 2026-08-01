package I;

import L.X;
import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import h0.C0113A;
import h0.C0119a;
import h0.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f319a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f320b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f321c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f322e;

    /* renamed from: f, reason: collision with root package name */
    public Object f323f;

    public d(s1.l lVar, String str, s1.j jVar, d0 d0Var, Map map) {
        this.f319a = 2;
        h1.d.e(lVar, "url");
        h1.d.e(str, "method");
        this.f321c = lVar;
        this.f320b = str;
        this.d = jVar;
        this.f322e = map;
    }

    public boolean a(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0119a c0119a = (C0119a) arrayList.get(i2);
            int i3 = c0119a.f2451a;
            if (i3 == 8) {
                if (e(c0119a.f2453c, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c0119a.f2452b;
                int i5 = c0119a.f2453c + i4;
                while (i4 < i5) {
                    if (e(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0113A) this.f322e).a((C0119a) arrayList.get(i));
        }
        j(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f321c;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C0119a c0119a = (C0119a) arrayList2.get(i2);
            int i3 = c0119a.f2451a;
            C0113A c0113a = (C0113A) this.f322e;
            if (i3 == 1) {
                c0113a.a(c0119a);
                c0113a.d(c0119a.f2452b, c0119a.f2453c);
            } else if (i3 == 2) {
                c0113a.a(c0119a);
                int i4 = c0119a.f2452b;
                int i5 = c0119a.f2453c;
                RecyclerView recyclerView = c0113a.f2382a;
                recyclerView.R(i4, i5, true);
                recyclerView.f1665h0 = true;
                recyclerView.f1659e0.f2435c += i5;
            } else if (i3 == 4) {
                c0113a.a(c0119a);
                c0113a.c(c0119a.f2452b, c0119a.f2453c);
            } else if (i3 == 8) {
                c0113a.a(c0119a);
                c0113a.e(c0119a.f2452b, c0119a.f2453c);
            }
        }
        j(arrayList2);
    }

    public void c(C0119a c0119a) {
        int i;
        K.b bVar;
        int i2 = c0119a.f2451a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int k2 = k(c0119a.f2452b, i2);
        int i3 = c0119a.f2452b;
        int i4 = c0119a.f2451a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0119a);
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = c0119a.f2453c;
            bVar = (K.b) this.f320b;
            if (i5 >= i7) {
                break;
            }
            int k3 = k((i * i5) + c0119a.f2452b, c0119a.f2451a);
            int i8 = c0119a.f2451a;
            if (i8 == 2 ? k3 != k2 : !(i8 == 4 && k3 == k2 + 1)) {
                C0119a h2 = h(i8, k2, i6);
                d(h2, i3);
                bVar.c(h2);
                if (c0119a.f2451a == 4) {
                    i3 += i6;
                }
                i6 = 1;
                k2 = k3;
            } else {
                i6++;
            }
            i5++;
        }
        bVar.c(c0119a);
        if (i6 > 0) {
            C0119a h3 = h(c0119a.f2451a, k2, i6);
            d(h3, i3);
            bVar.c(h3);
        }
    }

    public void d(C0119a c0119a, int i) {
        C0113A c0113a = (C0113A) this.f322e;
        c0113a.a(c0119a);
        int i2 = c0119a.f2451a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0113a.c(i, c0119a.f2453c);
        } else {
            int i3 = c0119a.f2453c;
            RecyclerView recyclerView = c0113a.f2382a;
            recyclerView.R(i, i3, true);
            recyclerView.f1665h0 = true;
            recyclerView.f1659e0.f2435c += i3;
        }
    }

    public int e(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            C0119a c0119a = (C0119a) arrayList.get(i2);
            int i3 = c0119a.f2451a;
            if (i3 == 8) {
                int i4 = c0119a.f2452b;
                if (i4 == i) {
                    i = c0119a.f2453c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0119a.f2453c <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c0119a.f2452b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c0119a.f2453c;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c0119a.f2453c;
                }
            }
            i2++;
        }
        return i;
    }

    public boolean f() {
        return ((ArrayList) this.f321c).size() > 0;
    }

    public S0.g g() {
        S0.g gVar = new S0.g();
        gVar.d = new LinkedHashMap();
        gVar.f822a = (s1.l) this.f321c;
        gVar.f823b = (String) this.f320b;
        Map map = (Map) this.f322e;
        gVar.d = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        gVar.f824c = ((s1.j) this.d).c();
        return gVar;
    }

    public C0119a h(int i, int i2, int i3) {
        C0119a c0119a = (C0119a) ((K.b) this.f320b).a();
        if (c0119a != null) {
            c0119a.f2451a = i;
            c0119a.f2452b = i2;
            c0119a.f2453c = i3;
            return c0119a;
        }
        C0119a c0119a2 = new C0119a();
        c0119a2.f2451a = i;
        c0119a2.f2452b = i2;
        c0119a2.f2453c = i3;
        return c0119a2;
    }

    public void i(C0119a c0119a) {
        ((ArrayList) this.d).add(c0119a);
        int i = c0119a.f2451a;
        C0113A c0113a = (C0113A) this.f322e;
        if (i == 1) {
            c0113a.d(c0119a.f2452b, c0119a.f2453c);
            return;
        }
        if (i == 2) {
            int i2 = c0119a.f2452b;
            int i3 = c0119a.f2453c;
            RecyclerView recyclerView = c0113a.f2382a;
            recyclerView.R(i2, i3, false);
            recyclerView.f1665h0 = true;
            return;
        }
        if (i == 4) {
            c0113a.c(c0119a.f2452b, c0119a.f2453c);
        } else if (i == 8) {
            c0113a.e(c0119a.f2452b, c0119a.f2453c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0119a);
        }
    }

    public void j(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0119a c0119a = (C0119a) arrayList.get(i);
            c0119a.getClass();
            ((K.b) this.f320b).c(c0119a);
        }
        arrayList.clear();
    }

    public int k(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0119a c0119a = (C0119a) arrayList.get(size);
            int i5 = c0119a.f2451a;
            if (i5 == 8) {
                int i6 = c0119a.f2452b;
                int i7 = c0119a.f2453c;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            c0119a.f2452b = i6 + 1;
                            c0119a.f2453c = i7 + 1;
                        } else if (i2 == 2) {
                            c0119a.f2452b = i6 - 1;
                            c0119a.f2453c = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c0119a.f2453c = i7 + 1;
                    } else if (i2 == 2) {
                        c0119a.f2453c = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c0119a.f2452b = i6 + 1;
                    } else if (i2 == 2) {
                        c0119a.f2452b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c0119a.f2452b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c0119a.f2453c;
                    } else if (i5 == 2) {
                        i += c0119a.f2453c;
                    }
                } else if (i2 == 1) {
                    c0119a.f2452b = i8 + 1;
                } else if (i2 == 2) {
                    c0119a.f2452b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0119a c0119a2 = (C0119a) arrayList.get(size2);
            int i9 = c0119a2.f2451a;
            K.b bVar = (K.b) this.f320b;
            if (i9 == 8) {
                int i10 = c0119a2.f2453c;
                if (i10 == c0119a2.f2452b || i10 < 0) {
                    arrayList.remove(size2);
                    bVar.c(c0119a2);
                }
            } else if (c0119a2.f2453c <= 0) {
                arrayList.remove(size2);
                bVar.c(c0119a2);
            }
        }
        return i;
    }

    public String toString() {
        switch (this.f319a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f320b) + ", mProviderPackage: " + ((String) this.f321c) + ", mQuery: " + ((String) this.d) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.f323f;
                    if (i >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(i);
                    for (int i2 = 0; i2 < list2.size(); i2++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i++;
                }
            case 1:
            default:
                return super.toString();
            case 2:
                StringBuilder sb2 = new StringBuilder("Request{method=");
                sb2.append((String) this.f320b);
                sb2.append(", url=");
                sb2.append((s1.l) this.f321c);
                s1.j jVar = (s1.j) this.d;
                if (jVar.size() != 0) {
                    sb2.append(", headers=[");
                    Iterator it = jVar.iterator();
                    int i3 = 0;
                    while (true) {
                        X x2 = (X) it;
                        if (x2.hasNext()) {
                            Object next = x2.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                throw new ArithmeticException("Index overflow has happened.");
                            }
                            V0.b bVar = (V0.b) next;
                            String str = (String) bVar.f939a;
                            String str2 = (String) bVar.f940b;
                            if (i3 > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(str);
                            sb2.append(':');
                            sb2.append(str2);
                            i3 = i4;
                        } else {
                            sb2.append(']');
                        }
                    }
                }
                Map map = (Map) this.f322e;
                if (!map.isEmpty()) {
                    sb2.append(", tags=");
                    sb2.append(map);
                }
                sb2.append('}');
                String sb3 = sb2.toString();
                h1.d.d(sb3, "StringBuilder().apply(builderAction).toString()");
                return sb3;
        }
    }

    public d(String str, String str2, String str3, List list) {
        this.f319a = 0;
        str.getClass();
        this.f320b = str;
        str2.getClass();
        this.f321c = str2;
        this.d = str3;
        list.getClass();
        this.f323f = list;
        this.f322e = str + "-" + str2 + "-" + str3;
    }

    public d(C0113A c0113a) {
        this.f319a = 1;
        this.f320b = new K.b(30);
        this.f321c = new ArrayList();
        this.d = new ArrayList();
        this.f322e = c0113a;
        this.f323f = new D.g(25, this);
    }
}
