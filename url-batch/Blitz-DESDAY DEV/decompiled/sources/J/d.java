package J;

import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import h0.C0114a;
import h0.C0138z;
import h0.a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f357a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f358b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f359c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f360e;

    /* renamed from: f, reason: collision with root package name */
    public Object f361f;

    public d(r1.l lVar, String str, r1.j jVar, a0 a0Var, Map map) {
        this.f357a = 2;
        g1.d.e(lVar, "url");
        g1.d.e(str, "method");
        this.f359c = lVar;
        this.f358b = str;
        this.d = jVar;
        this.f360e = map;
    }

    public boolean a(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0114a c0114a = (C0114a) arrayList.get(i2);
            int i3 = c0114a.f2447a;
            if (i3 == 8) {
                if (e(c0114a.f2449c, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c0114a.f2448b;
                int i5 = c0114a.f2449c + i4;
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
            ((C0138z) this.f360e).a((C0114a) arrayList.get(i));
        }
        j(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f359c;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C0114a c0114a = (C0114a) arrayList2.get(i2);
            int i3 = c0114a.f2447a;
            C0138z c0138z = (C0138z) this.f360e;
            if (i3 == 1) {
                c0138z.a(c0114a);
                c0138z.d(c0114a.f2448b, c0114a.f2449c);
            } else if (i3 == 2) {
                c0138z.a(c0114a);
                int i4 = c0114a.f2448b;
                int i5 = c0114a.f2449c;
                RecyclerView recyclerView = c0138z.f2611a;
                recyclerView.O(i4, i5, true);
                recyclerView.f1651f0 = true;
                recyclerView.f1646c0.f2414c += i5;
            } else if (i3 == 4) {
                c0138z.a(c0114a);
                c0138z.c(c0114a.f2448b, c0114a.f2449c);
            } else if (i3 == 8) {
                c0138z.a(c0114a);
                c0138z.e(c0114a.f2448b, c0114a.f2449c);
            }
        }
        j(arrayList2);
    }

    public void c(C0114a c0114a) {
        int i;
        L.b bVar;
        int i2 = c0114a.f2447a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int k2 = k(c0114a.f2448b, i2);
        int i3 = c0114a.f2448b;
        int i4 = c0114a.f2447a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0114a);
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = c0114a.f2449c;
            bVar = (L.b) this.f358b;
            if (i5 >= i7) {
                break;
            }
            int k3 = k((i * i5) + c0114a.f2448b, c0114a.f2447a);
            int i8 = c0114a.f2447a;
            if (i8 == 2 ? k3 != k2 : !(i8 == 4 && k3 == k2 + 1)) {
                C0114a h = h(i8, k2, i6);
                d(h, i3);
                bVar.c(h);
                if (c0114a.f2447a == 4) {
                    i3 += i6;
                }
                i6 = 1;
                k2 = k3;
            } else {
                i6++;
            }
            i5++;
        }
        bVar.c(c0114a);
        if (i6 > 0) {
            C0114a h2 = h(c0114a.f2447a, k2, i6);
            d(h2, i3);
            bVar.c(h2);
        }
    }

    public void d(C0114a c0114a, int i) {
        C0138z c0138z = (C0138z) this.f360e;
        c0138z.a(c0114a);
        int i2 = c0114a.f2447a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0138z.c(i, c0114a.f2449c);
        } else {
            int i3 = c0114a.f2449c;
            RecyclerView recyclerView = c0138z.f2611a;
            recyclerView.O(i, i3, true);
            recyclerView.f1651f0 = true;
            recyclerView.f1646c0.f2414c += i3;
        }
    }

    public int e(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            C0114a c0114a = (C0114a) arrayList.get(i2);
            int i3 = c0114a.f2447a;
            if (i3 == 8) {
                int i4 = c0114a.f2448b;
                if (i4 == i) {
                    i = c0114a.f2449c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0114a.f2449c <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c0114a.f2448b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c0114a.f2449c;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c0114a.f2449c;
                }
            }
            i2++;
        }
        return i;
    }

    public boolean f() {
        return ((ArrayList) this.f359c).size() > 0;
    }

    public T0.g g() {
        T0.g gVar = new T0.g();
        gVar.d = new LinkedHashMap();
        gVar.f824a = (r1.l) this.f359c;
        gVar.f825b = (String) this.f358b;
        Map map = (Map) this.f360e;
        gVar.d = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        gVar.f826c = ((r1.j) this.d).c();
        return gVar;
    }

    public C0114a h(int i, int i2, int i3) {
        C0114a c0114a = (C0114a) ((L.b) this.f358b).a();
        if (c0114a != null) {
            c0114a.f2447a = i;
            c0114a.f2448b = i2;
            c0114a.f2449c = i3;
            return c0114a;
        }
        C0114a c0114a2 = new C0114a();
        c0114a2.f2447a = i;
        c0114a2.f2448b = i2;
        c0114a2.f2449c = i3;
        return c0114a2;
    }

    public void i(C0114a c0114a) {
        ((ArrayList) this.d).add(c0114a);
        int i = c0114a.f2447a;
        C0138z c0138z = (C0138z) this.f360e;
        if (i == 1) {
            c0138z.d(c0114a.f2448b, c0114a.f2449c);
            return;
        }
        if (i == 2) {
            int i2 = c0114a.f2448b;
            int i3 = c0114a.f2449c;
            RecyclerView recyclerView = c0138z.f2611a;
            recyclerView.O(i2, i3, false);
            recyclerView.f1651f0 = true;
            return;
        }
        if (i == 4) {
            c0138z.c(c0114a.f2448b, c0114a.f2449c);
        } else if (i == 8) {
            c0138z.e(c0114a.f2448b, c0114a.f2449c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0114a);
        }
    }

    public void j(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0114a c0114a = (C0114a) arrayList.get(i);
            c0114a.getClass();
            ((L.b) this.f358b).c(c0114a);
        }
        arrayList.clear();
    }

    public int k(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0114a c0114a = (C0114a) arrayList.get(size);
            int i5 = c0114a.f2447a;
            if (i5 == 8) {
                int i6 = c0114a.f2448b;
                int i7 = c0114a.f2449c;
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
                            c0114a.f2448b = i6 + 1;
                            c0114a.f2449c = i7 + 1;
                        } else if (i2 == 2) {
                            c0114a.f2448b = i6 - 1;
                            c0114a.f2449c = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c0114a.f2449c = i7 + 1;
                    } else if (i2 == 2) {
                        c0114a.f2449c = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c0114a.f2448b = i6 + 1;
                    } else if (i2 == 2) {
                        c0114a.f2448b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c0114a.f2448b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c0114a.f2449c;
                    } else if (i5 == 2) {
                        i += c0114a.f2449c;
                    }
                } else if (i2 == 1) {
                    c0114a.f2448b = i8 + 1;
                } else if (i2 == 2) {
                    c0114a.f2448b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0114a c0114a2 = (C0114a) arrayList.get(size2);
            int i9 = c0114a2.f2447a;
            L.b bVar = (L.b) this.f358b;
            if (i9 == 8) {
                int i10 = c0114a2.f2449c;
                if (i10 == c0114a2.f2448b || i10 < 0) {
                    arrayList.remove(size2);
                    bVar.c(c0114a2);
                }
            } else if (c0114a2.f2449c <= 0) {
                arrayList.remove(size2);
                bVar.c(c0114a2);
            }
        }
        return i;
    }

    public String toString() {
        switch (this.f357a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f358b) + ", mProviderPackage: " + ((String) this.f359c) + ", mQuery: " + ((String) this.d) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.f361f;
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
                sb2.append((String) this.f358b);
                sb2.append(", url=");
                sb2.append((r1.l) this.f359c);
                r1.j jVar = (r1.j) this.d;
                if (jVar.size() != 0) {
                    sb2.append(", headers=[");
                    Iterator it = jVar.iterator();
                    int i3 = 0;
                    while (true) {
                        X0.b bVar = (X0.b) it;
                        if (bVar.hasNext()) {
                            Object next = bVar.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                throw new ArithmeticException("Index overflow has happened.");
                            }
                            W0.c cVar = (W0.c) next;
                            String str = (String) cVar.f950a;
                            String str2 = (String) cVar.f951b;
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
                Map map = (Map) this.f360e;
                if (!map.isEmpty()) {
                    sb2.append(", tags=");
                    sb2.append(map);
                }
                sb2.append('}');
                String sb3 = sb2.toString();
                g1.d.d(sb3, "StringBuilder().apply(builderAction).toString()");
                return sb3;
        }
    }

    public d(String str, String str2, String str3, List list) {
        this.f357a = 0;
        str.getClass();
        this.f358b = str;
        str2.getClass();
        this.f359c = str2;
        this.d = str3;
        list.getClass();
        this.f361f = list;
        this.f360e = str + "-" + str2 + "-" + str3;
    }

    public d(C0138z c0138z) {
        this.f357a = 1;
        this.f358b = new L.b(30);
        this.f359c = new ArrayList();
        this.d = new ArrayList();
        this.f360e = c0138z;
        this.f361f = new E.g(25, this);
    }
}
