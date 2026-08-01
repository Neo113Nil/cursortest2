package H;

import T.u;
import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import f0.C0091a;
import f0.C0115z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f257a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f258b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f259c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f260e;

    /* renamed from: f, reason: collision with root package name */
    public Object f261f;

    public e(p1.m mVar, String str, p1.k kVar, k0.k kVar2, Map map) {
        this.f257a = 2;
        e1.d.e(mVar, "url");
        e1.d.e(str, "method");
        this.f259c = mVar;
        this.f258b = str;
        this.d = kVar;
        this.f260e = map;
    }

    public boolean a(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0091a c0091a = (C0091a) arrayList.get(i2);
            int i3 = c0091a.f2160a;
            if (i3 == 8) {
                if (e(c0091a.f2162c, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c0091a.f2161b;
                int i5 = c0091a.f2162c + i4;
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
            ((C0115z) this.f260e).a((C0091a) arrayList.get(i));
        }
        j(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f259c;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C0091a c0091a = (C0091a) arrayList2.get(i2);
            int i3 = c0091a.f2160a;
            C0115z c0115z = (C0115z) this.f260e;
            if (i3 == 1) {
                c0115z.a(c0091a);
                c0115z.d(c0091a.f2161b, c0091a.f2162c);
            } else if (i3 == 2) {
                c0115z.a(c0091a);
                int i4 = c0091a.f2161b;
                int i5 = c0091a.f2162c;
                RecyclerView recyclerView = c0115z.f2320a;
                recyclerView.O(i4, i5, true);
                recyclerView.f1549f0 = true;
                recyclerView.f1544c0.f2127c += i5;
            } else if (i3 == 4) {
                c0115z.a(c0091a);
                c0115z.c(c0091a.f2161b, c0091a.f2162c);
            } else if (i3 == 8) {
                c0115z.a(c0091a);
                c0115z.e(c0091a.f2161b, c0091a.f2162c);
            }
        }
        j(arrayList2);
    }

    public void c(C0091a c0091a) {
        int i;
        J.b bVar;
        int i2 = c0091a.f2160a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int k2 = k(c0091a.f2161b, i2);
        int i3 = c0091a.f2161b;
        int i4 = c0091a.f2160a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0091a);
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = c0091a.f2162c;
            bVar = (J.b) this.f258b;
            if (i5 >= i7) {
                break;
            }
            int k3 = k((i * i5) + c0091a.f2161b, c0091a.f2160a);
            int i8 = c0091a.f2160a;
            if (i8 == 2 ? k3 != k2 : !(i8 == 4 && k3 == k2 + 1)) {
                C0091a h = h(i8, k2, i6);
                d(h, i3);
                bVar.c(h);
                if (c0091a.f2160a == 4) {
                    i3 += i6;
                }
                i6 = 1;
                k2 = k3;
            } else {
                i6++;
            }
            i5++;
        }
        bVar.c(c0091a);
        if (i6 > 0) {
            C0091a h2 = h(c0091a.f2160a, k2, i6);
            d(h2, i3);
            bVar.c(h2);
        }
    }

    public void d(C0091a c0091a, int i) {
        C0115z c0115z = (C0115z) this.f260e;
        c0115z.a(c0091a);
        int i2 = c0091a.f2160a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0115z.c(i, c0091a.f2162c);
        } else {
            int i3 = c0091a.f2162c;
            RecyclerView recyclerView = c0115z.f2320a;
            recyclerView.O(i, i3, true);
            recyclerView.f1549f0 = true;
            recyclerView.f1544c0.f2127c += i3;
        }
    }

    public int e(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            C0091a c0091a = (C0091a) arrayList.get(i2);
            int i3 = c0091a.f2160a;
            if (i3 == 8) {
                int i4 = c0091a.f2161b;
                if (i4 == i) {
                    i = c0091a.f2162c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0091a.f2162c <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c0091a.f2161b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c0091a.f2162c;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c0091a.f2162c;
                }
            }
            i2++;
        }
        return i;
    }

    public boolean f() {
        return ((ArrayList) this.f259c).size() > 0;
    }

    public u g() {
        u uVar = new u();
        uVar.d = new LinkedHashMap();
        uVar.f828a = (p1.m) this.f259c;
        uVar.f829b = (String) this.f258b;
        Map map = (Map) this.f260e;
        uVar.d = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        uVar.f830c = ((p1.k) this.d).c();
        return uVar;
    }

    public C0091a h(int i, int i2, int i3) {
        C0091a c0091a = (C0091a) ((J.b) this.f258b).a();
        if (c0091a != null) {
            c0091a.f2160a = i;
            c0091a.f2161b = i2;
            c0091a.f2162c = i3;
            return c0091a;
        }
        C0091a c0091a2 = new C0091a();
        c0091a2.f2160a = i;
        c0091a2.f2161b = i2;
        c0091a2.f2162c = i3;
        return c0091a2;
    }

    public void i(C0091a c0091a) {
        ((ArrayList) this.d).add(c0091a);
        int i = c0091a.f2160a;
        C0115z c0115z = (C0115z) this.f260e;
        if (i == 1) {
            c0115z.d(c0091a.f2161b, c0091a.f2162c);
            return;
        }
        if (i == 2) {
            int i2 = c0091a.f2161b;
            int i3 = c0091a.f2162c;
            RecyclerView recyclerView = c0115z.f2320a;
            recyclerView.O(i2, i3, false);
            recyclerView.f1549f0 = true;
            return;
        }
        if (i == 4) {
            c0115z.c(c0091a.f2161b, c0091a.f2162c);
        } else if (i == 8) {
            c0115z.e(c0091a.f2161b, c0091a.f2162c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0091a);
        }
    }

    public void j(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0091a c0091a = (C0091a) arrayList.get(i);
            c0091a.getClass();
            ((J.b) this.f258b).c(c0091a);
        }
        arrayList.clear();
    }

    public int k(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0091a c0091a = (C0091a) arrayList.get(size);
            int i5 = c0091a.f2160a;
            if (i5 == 8) {
                int i6 = c0091a.f2161b;
                int i7 = c0091a.f2162c;
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
                            c0091a.f2161b = i6 + 1;
                            c0091a.f2162c = i7 + 1;
                        } else if (i2 == 2) {
                            c0091a.f2161b = i6 - 1;
                            c0091a.f2162c = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c0091a.f2162c = i7 + 1;
                    } else if (i2 == 2) {
                        c0091a.f2162c = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c0091a.f2161b = i6 + 1;
                    } else if (i2 == 2) {
                        c0091a.f2161b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c0091a.f2161b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c0091a.f2162c;
                    } else if (i5 == 2) {
                        i += c0091a.f2162c;
                    }
                } else if (i2 == 1) {
                    c0091a.f2161b = i8 + 1;
                } else if (i2 == 2) {
                    c0091a.f2161b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0091a c0091a2 = (C0091a) arrayList.get(size2);
            int i9 = c0091a2.f2160a;
            J.b bVar = (J.b) this.f258b;
            if (i9 == 8) {
                int i10 = c0091a2.f2162c;
                if (i10 == c0091a2.f2161b || i10 < 0) {
                    arrayList.remove(size2);
                    bVar.c(c0091a2);
                }
            } else if (c0091a2.f2162c <= 0) {
                arrayList.remove(size2);
                bVar.c(c0091a2);
            }
        }
        return i;
    }

    public String toString() {
        switch (this.f257a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f258b) + ", mProviderPackage: " + ((String) this.f259c) + ", mQuery: " + ((String) this.d) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.f261f;
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
                sb2.append((String) this.f258b);
                sb2.append(", url=");
                sb2.append((p1.m) this.f259c);
                p1.k kVar = (p1.k) this.d;
                if (kVar.size() != 0) {
                    sb2.append(", headers=[");
                    Iterator it = kVar.iterator();
                    int i3 = 0;
                    while (true) {
                        W0.a aVar = (W0.a) it;
                        if (aVar.hasNext()) {
                            Object next = aVar.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                throw new ArithmeticException("Index overflow has happened.");
                            }
                            V0.c cVar = (V0.c) next;
                            String str = (String) cVar.f872a;
                            String str2 = (String) cVar.f873b;
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
                Map map = (Map) this.f260e;
                if (!map.isEmpty()) {
                    sb2.append(", tags=");
                    sb2.append(map);
                }
                sb2.append('}');
                String sb3 = sb2.toString();
                e1.d.d(sb3, "StringBuilder().apply(builderAction).toString()");
                return sb3;
        }
    }

    public e(String str, String str2, String str3, List list) {
        this.f257a = 0;
        str.getClass();
        this.f258b = str;
        str2.getClass();
        this.f259c = str2;
        this.d = str3;
        list.getClass();
        this.f261f = list;
        this.f260e = str + "-" + str2 + "-" + str3;
    }

    public e(C0115z c0115z) {
        this.f257a = 1;
        this.f258b = new J.b(30);
        this.f259c = new ArrayList();
        this.d = new ArrayList();
        this.f260e = c0115z;
        this.f261f = new C.g(23, this);
    }
}
