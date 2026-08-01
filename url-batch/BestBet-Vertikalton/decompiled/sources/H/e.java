package H;

import K.V;
import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import c1.AbstractC0091d;
import g0.C0137a;
import g0.C0160y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f481a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f482b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f483c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f484e;

    /* renamed from: f, reason: collision with root package name */
    public Object f485f;

    public e(z1.l lVar, String str, z1.j jVar, AbstractC0091d abstractC0091d, Map map) {
        this.f481a = 2;
        k1.e.e(lVar, "url");
        k1.e.e(str, "method");
        this.f483c = lVar;
        this.f482b = str;
        this.d = jVar;
        this.f484e = map;
    }

    public boolean a(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0137a c0137a = (C0137a) arrayList.get(i2);
            int i3 = c0137a.f2794a;
            if (i3 == 8) {
                if (e(c0137a.f2796c, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c0137a.f2795b;
                int i5 = c0137a.f2796c + i4;
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
            ((C0160y) this.f484e).a((C0137a) arrayList.get(i));
        }
        j(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f483c;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C0137a c0137a = (C0137a) arrayList2.get(i2);
            int i3 = c0137a.f2794a;
            C0160y c0160y = (C0160y) this.f484e;
            if (i3 == 1) {
                c0160y.a(c0137a);
                c0160y.d(c0137a.f2795b, c0137a.f2796c);
            } else if (i3 == 2) {
                c0160y.a(c0137a);
                int i4 = c0137a.f2795b;
                int i5 = c0137a.f2796c;
                RecyclerView recyclerView = c0160y.f2954a;
                recyclerView.R(i4, i5, true);
                recyclerView.f1981h0 = true;
                recyclerView.f1976e0.f2761c += i5;
            } else if (i3 == 4) {
                c0160y.a(c0137a);
                c0160y.c(c0137a.f2795b, c0137a.f2796c);
            } else if (i3 == 8) {
                c0160y.a(c0137a);
                c0160y.e(c0137a.f2795b, c0137a.f2796c);
            }
        }
        j(arrayList2);
    }

    public void c(C0137a c0137a) {
        int i;
        J.b bVar;
        int i2 = c0137a.f2794a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int k2 = k(c0137a.f2795b, i2);
        int i3 = c0137a.f2795b;
        int i4 = c0137a.f2794a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0137a);
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = c0137a.f2796c;
            bVar = (J.b) this.f482b;
            if (i5 >= i7) {
                break;
            }
            int k3 = k((i * i5) + c0137a.f2795b, c0137a.f2794a);
            int i8 = c0137a.f2794a;
            if (i8 == 2 ? k3 != k2 : !(i8 == 4 && k3 == k2 + 1)) {
                C0137a h = h(i8, k2, i6);
                d(h, i3);
                bVar.c(h);
                if (c0137a.f2794a == 4) {
                    i3 += i6;
                }
                i6 = 1;
                k2 = k3;
            } else {
                i6++;
            }
            i5++;
        }
        bVar.c(c0137a);
        if (i6 > 0) {
            C0137a h2 = h(c0137a.f2794a, k2, i6);
            d(h2, i3);
            bVar.c(h2);
        }
    }

    public void d(C0137a c0137a, int i) {
        C0160y c0160y = (C0160y) this.f484e;
        c0160y.a(c0137a);
        int i2 = c0137a.f2794a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0160y.c(i, c0137a.f2796c);
        } else {
            int i3 = c0137a.f2796c;
            RecyclerView recyclerView = c0160y.f2954a;
            recyclerView.R(i, i3, true);
            recyclerView.f1981h0 = true;
            recyclerView.f1976e0.f2761c += i3;
        }
    }

    public int e(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            C0137a c0137a = (C0137a) arrayList.get(i2);
            int i3 = c0137a.f2794a;
            if (i3 == 8) {
                int i4 = c0137a.f2795b;
                if (i4 == i) {
                    i = c0137a.f2796c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0137a.f2796c <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c0137a.f2795b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c0137a.f2796c;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c0137a.f2796c;
                }
            }
            i2++;
        }
        return i;
    }

    public boolean f() {
        return ((ArrayList) this.f483c).size() > 0;
    }

    public T0.m g() {
        T0.m mVar = new T0.m();
        mVar.d = new LinkedHashMap();
        mVar.f1073a = (z1.l) this.f483c;
        mVar.f1074b = (String) this.f482b;
        Map map = (Map) this.f484e;
        mVar.d = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        mVar.f1075c = ((z1.j) this.d).c();
        return mVar;
    }

    public C0137a h(int i, int i2, int i3) {
        C0137a c0137a = (C0137a) ((J.b) this.f482b).a();
        if (c0137a != null) {
            c0137a.f2794a = i;
            c0137a.f2795b = i2;
            c0137a.f2796c = i3;
            return c0137a;
        }
        C0137a c0137a2 = new C0137a();
        c0137a2.f2794a = i;
        c0137a2.f2795b = i2;
        c0137a2.f2796c = i3;
        return c0137a2;
    }

    public void i(C0137a c0137a) {
        ((ArrayList) this.d).add(c0137a);
        int i = c0137a.f2794a;
        C0160y c0160y = (C0160y) this.f484e;
        if (i == 1) {
            c0160y.d(c0137a.f2795b, c0137a.f2796c);
            return;
        }
        if (i == 2) {
            int i2 = c0137a.f2795b;
            int i3 = c0137a.f2796c;
            RecyclerView recyclerView = c0160y.f2954a;
            recyclerView.R(i2, i3, false);
            recyclerView.f1981h0 = true;
            return;
        }
        if (i == 4) {
            c0160y.c(c0137a.f2795b, c0137a.f2796c);
        } else if (i == 8) {
            c0160y.e(c0137a.f2795b, c0137a.f2796c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0137a);
        }
    }

    public void j(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0137a c0137a = (C0137a) arrayList.get(i);
            c0137a.getClass();
            ((J.b) this.f482b).c(c0137a);
        }
        arrayList.clear();
    }

    public int k(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0137a c0137a = (C0137a) arrayList.get(size);
            int i5 = c0137a.f2794a;
            if (i5 == 8) {
                int i6 = c0137a.f2795b;
                int i7 = c0137a.f2796c;
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
                            c0137a.f2795b = i6 + 1;
                            c0137a.f2796c = i7 + 1;
                        } else if (i2 == 2) {
                            c0137a.f2795b = i6 - 1;
                            c0137a.f2796c = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c0137a.f2796c = i7 + 1;
                    } else if (i2 == 2) {
                        c0137a.f2796c = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c0137a.f2795b = i6 + 1;
                    } else if (i2 == 2) {
                        c0137a.f2795b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c0137a.f2795b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c0137a.f2796c;
                    } else if (i5 == 2) {
                        i += c0137a.f2796c;
                    }
                } else if (i2 == 1) {
                    c0137a.f2795b = i8 + 1;
                } else if (i2 == 2) {
                    c0137a.f2795b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0137a c0137a2 = (C0137a) arrayList.get(size2);
            int i9 = c0137a2.f2794a;
            J.b bVar = (J.b) this.f482b;
            if (i9 == 8) {
                int i10 = c0137a2.f2796c;
                if (i10 == c0137a2.f2795b || i10 < 0) {
                    arrayList.remove(size2);
                    bVar.c(c0137a2);
                }
            } else if (c0137a2.f2796c <= 0) {
                arrayList.remove(size2);
                bVar.c(c0137a2);
            }
        }
        return i;
    }

    public String toString() {
        switch (this.f481a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f482b) + ", mProviderPackage: " + ((String) this.f483c) + ", mQuery: " + ((String) this.d) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.f485f;
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
                sb2.append((String) this.f482b);
                sb2.append(", url=");
                sb2.append((z1.l) this.f483c);
                z1.j jVar = (z1.j) this.d;
                if (jVar.size() != 0) {
                    sb2.append(", headers=[");
                    Iterator it = jVar.iterator();
                    int i3 = 0;
                    while (true) {
                        V v2 = (V) it;
                        if (v2.hasNext()) {
                            Object next = v2.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                throw new ArithmeticException("Index overflow has happened.");
                            }
                            X0.c cVar = (X0.c) next;
                            String str = (String) cVar.f1270a;
                            String str2 = (String) cVar.f1271b;
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
                Map map = (Map) this.f484e;
                if (!map.isEmpty()) {
                    sb2.append(", tags=");
                    sb2.append(map);
                }
                sb2.append('}');
                String sb3 = sb2.toString();
                k1.e.d(sb3, "StringBuilder().apply(builderAction).toString()");
                return sb3;
        }
    }

    public e(String str, String str2, String str3, List list) {
        this.f481a = 0;
        str.getClass();
        this.f482b = str;
        str2.getClass();
        this.f483c = str2;
        this.d = str3;
        list.getClass();
        this.f485f = list;
        this.f484e = str + "-" + str2 + "-" + str3;
    }

    public e(C0160y c0160y) {
        this.f481a = 1;
        this.f482b = new J.b(30);
        this.f483c = new ArrayList();
        this.d = new ArrayList();
        this.f484e = c0160y;
        this.f485f = new A0.c(27, this);
    }
}
