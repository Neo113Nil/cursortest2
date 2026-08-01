package H;

import T.u;
import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import f0.C0092a;
import f0.C0116z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f205b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f206c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f207e;

    /* renamed from: f, reason: collision with root package name */
    public Object f208f;

    public e(m1.l lVar, String str, m1.j jVar, k0.k kVar, Map map) {
        this.f204a = 2;
        b1.d.e(lVar, "url");
        b1.d.e(str, "method");
        this.f206c = lVar;
        this.f205b = str;
        this.d = jVar;
        this.f207e = map;
    }

    public boolean a(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0092a c0092a = (C0092a) arrayList.get(i2);
            int i3 = c0092a.f2093a;
            if (i3 == 8) {
                if (e(c0092a.f2095c, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c0092a.f2094b;
                int i5 = c0092a.f2095c + i4;
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
            ((C0116z) this.f207e).a((C0092a) arrayList.get(i));
        }
        j(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f206c;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C0092a c0092a = (C0092a) arrayList2.get(i2);
            int i3 = c0092a.f2093a;
            C0116z c0116z = (C0116z) this.f207e;
            if (i3 == 1) {
                c0116z.a(c0092a);
                c0116z.d(c0092a.f2094b, c0092a.f2095c);
            } else if (i3 == 2) {
                c0116z.a(c0092a);
                int i4 = c0092a.f2094b;
                int i5 = c0092a.f2095c;
                RecyclerView recyclerView = c0116z.f2253a;
                recyclerView.O(i4, i5, true);
                recyclerView.f1504f0 = true;
                recyclerView.f1499c0.f2060c += i5;
            } else if (i3 == 4) {
                c0116z.a(c0092a);
                c0116z.c(c0092a.f2094b, c0092a.f2095c);
            } else if (i3 == 8) {
                c0116z.a(c0092a);
                c0116z.e(c0092a.f2094b, c0092a.f2095c);
            }
        }
        j(arrayList2);
    }

    public void c(C0092a c0092a) {
        int i;
        J.b bVar;
        int i2 = c0092a.f2093a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int k2 = k(c0092a.f2094b, i2);
        int i3 = c0092a.f2094b;
        int i4 = c0092a.f2093a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0092a);
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = c0092a.f2095c;
            bVar = (J.b) this.f205b;
            if (i5 >= i7) {
                break;
            }
            int k3 = k((i * i5) + c0092a.f2094b, c0092a.f2093a);
            int i8 = c0092a.f2093a;
            if (i8 == 2 ? k3 != k2 : !(i8 == 4 && k3 == k2 + 1)) {
                C0092a h = h(i8, k2, i6);
                d(h, i3);
                bVar.c(h);
                if (c0092a.f2093a == 4) {
                    i3 += i6;
                }
                i6 = 1;
                k2 = k3;
            } else {
                i6++;
            }
            i5++;
        }
        bVar.c(c0092a);
        if (i6 > 0) {
            C0092a h2 = h(c0092a.f2093a, k2, i6);
            d(h2, i3);
            bVar.c(h2);
        }
    }

    public void d(C0092a c0092a, int i) {
        C0116z c0116z = (C0116z) this.f207e;
        c0116z.a(c0092a);
        int i2 = c0092a.f2093a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0116z.c(i, c0092a.f2095c);
        } else {
            int i3 = c0092a.f2095c;
            RecyclerView recyclerView = c0116z.f2253a;
            recyclerView.O(i, i3, true);
            recyclerView.f1504f0 = true;
            recyclerView.f1499c0.f2060c += i3;
        }
    }

    public int e(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            C0092a c0092a = (C0092a) arrayList.get(i2);
            int i3 = c0092a.f2093a;
            if (i3 == 8) {
                int i4 = c0092a.f2094b;
                if (i4 == i) {
                    i = c0092a.f2095c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0092a.f2095c <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c0092a.f2094b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c0092a.f2095c;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c0092a.f2095c;
                }
            }
            i2++;
        }
        return i;
    }

    public boolean f() {
        return ((ArrayList) this.f206c).size() > 0;
    }

    public u g() {
        u uVar = new u();
        uVar.d = new LinkedHashMap();
        uVar.f801a = (m1.l) this.f206c;
        uVar.f802b = (String) this.f205b;
        Map map = (Map) this.f207e;
        uVar.d = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        uVar.f803c = ((m1.j) this.d).c();
        return uVar;
    }

    public C0092a h(int i, int i2, int i3) {
        C0092a c0092a = (C0092a) ((J.b) this.f205b).a();
        if (c0092a != null) {
            c0092a.f2093a = i;
            c0092a.f2094b = i2;
            c0092a.f2095c = i3;
            return c0092a;
        }
        C0092a c0092a2 = new C0092a();
        c0092a2.f2093a = i;
        c0092a2.f2094b = i2;
        c0092a2.f2095c = i3;
        return c0092a2;
    }

    public void i(C0092a c0092a) {
        ((ArrayList) this.d).add(c0092a);
        int i = c0092a.f2093a;
        C0116z c0116z = (C0116z) this.f207e;
        if (i == 1) {
            c0116z.d(c0092a.f2094b, c0092a.f2095c);
            return;
        }
        if (i == 2) {
            int i2 = c0092a.f2094b;
            int i3 = c0092a.f2095c;
            RecyclerView recyclerView = c0116z.f2253a;
            recyclerView.O(i2, i3, false);
            recyclerView.f1504f0 = true;
            return;
        }
        if (i == 4) {
            c0116z.c(c0092a.f2094b, c0092a.f2095c);
        } else if (i == 8) {
            c0116z.e(c0092a.f2094b, c0092a.f2095c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0092a);
        }
    }

    public void j(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0092a c0092a = (C0092a) arrayList.get(i);
            c0092a.getClass();
            ((J.b) this.f205b).c(c0092a);
        }
        arrayList.clear();
    }

    public int k(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0092a c0092a = (C0092a) arrayList.get(size);
            int i5 = c0092a.f2093a;
            if (i5 == 8) {
                int i6 = c0092a.f2094b;
                int i7 = c0092a.f2095c;
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
                            c0092a.f2094b = i6 + 1;
                            c0092a.f2095c = i7 + 1;
                        } else if (i2 == 2) {
                            c0092a.f2094b = i6 - 1;
                            c0092a.f2095c = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c0092a.f2095c = i7 + 1;
                    } else if (i2 == 2) {
                        c0092a.f2095c = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c0092a.f2094b = i6 + 1;
                    } else if (i2 == 2) {
                        c0092a.f2094b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c0092a.f2094b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c0092a.f2095c;
                    } else if (i5 == 2) {
                        i += c0092a.f2095c;
                    }
                } else if (i2 == 1) {
                    c0092a.f2094b = i8 + 1;
                } else if (i2 == 2) {
                    c0092a.f2094b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0092a c0092a2 = (C0092a) arrayList.get(size2);
            int i9 = c0092a2.f2093a;
            J.b bVar = (J.b) this.f205b;
            if (i9 == 8) {
                int i10 = c0092a2.f2095c;
                if (i10 == c0092a2.f2094b || i10 < 0) {
                    arrayList.remove(size2);
                    bVar.c(c0092a2);
                }
            } else if (c0092a2.f2095c <= 0) {
                arrayList.remove(size2);
                bVar.c(c0092a2);
            }
        }
        return i;
    }

    public String toString() {
        switch (this.f204a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f205b) + ", mProviderPackage: " + ((String) this.f206c) + ", mQuery: " + ((String) this.d) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.f208f;
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
                sb2.append((String) this.f205b);
                sb2.append(", url=");
                sb2.append((m1.l) this.f206c);
                m1.j jVar = (m1.j) this.d;
                if (jVar.size() != 0) {
                    sb2.append(", headers=[");
                    Iterator it = jVar.iterator();
                    int i3 = 0;
                    while (true) {
                        T0.a aVar = (T0.a) it;
                        if (aVar.hasNext()) {
                            Object next = aVar.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                throw new ArithmeticException("Index overflow has happened.");
                            }
                            S0.c cVar = (S0.c) next;
                            String str = (String) cVar.f752a;
                            String str2 = (String) cVar.f753b;
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
                Map map = (Map) this.f207e;
                if (!map.isEmpty()) {
                    sb2.append(", tags=");
                    sb2.append(map);
                }
                sb2.append('}');
                String sb3 = sb2.toString();
                b1.d.d(sb3, "StringBuilder().apply(builderAction).toString()");
                return sb3;
        }
    }

    public e(String str, String str2, String str3, List list) {
        this.f204a = 0;
        str.getClass();
        this.f205b = str;
        str2.getClass();
        this.f206c = str2;
        this.d = str3;
        list.getClass();
        this.f208f = list;
        this.f207e = str + "-" + str2 + "-" + str3;
    }

    public e(C0116z c0116z) {
        this.f204a = 1;
        this.f205b = new J.b(30);
        this.f206c = new ArrayList();
        this.d = new ArrayList();
        this.f207e = c0116z;
        this.f208f = new C.g(24, this);
    }
}
