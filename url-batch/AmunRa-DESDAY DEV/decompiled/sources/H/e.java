package H;

import T.u;
import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import f0.C0090a;
import f0.C0114z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k0.y;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f197a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f198b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f199c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f200e;

    /* renamed from: f, reason: collision with root package name */
    public Object f201f;

    public e(k1.n nVar, String str, k1.l lVar, y yVar, Map map) {
        this.f197a = 2;
        Z0.d.e(nVar, "url");
        Z0.d.e(str, "method");
        this.f199c = nVar;
        this.f198b = str;
        this.d = lVar;
        this.f200e = map;
    }

    public boolean a(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0090a c0090a = (C0090a) arrayList.get(i2);
            int i3 = c0090a.f2092a;
            if (i3 == 8) {
                if (e(c0090a.f2094c, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c0090a.f2093b;
                int i5 = c0090a.f2094c + i4;
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
            ((C0114z) this.f200e).a((C0090a) arrayList.get(i));
        }
        j(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f199c;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C0090a c0090a = (C0090a) arrayList2.get(i2);
            int i3 = c0090a.f2092a;
            C0114z c0114z = (C0114z) this.f200e;
            if (i3 == 1) {
                c0114z.a(c0090a);
                c0114z.d(c0090a.f2093b, c0090a.f2094c);
            } else if (i3 == 2) {
                c0114z.a(c0090a);
                int i4 = c0090a.f2093b;
                int i5 = c0090a.f2094c;
                RecyclerView recyclerView = c0114z.f2252a;
                recyclerView.O(i4, i5, true);
                recyclerView.f1479f0 = true;
                recyclerView.f1474c0.f2059c += i5;
            } else if (i3 == 4) {
                c0114z.a(c0090a);
                c0114z.c(c0090a.f2093b, c0090a.f2094c);
            } else if (i3 == 8) {
                c0114z.a(c0090a);
                c0114z.e(c0090a.f2093b, c0090a.f2094c);
            }
        }
        j(arrayList2);
    }

    public void c(C0090a c0090a) {
        int i;
        J.b bVar;
        int i2 = c0090a.f2092a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int k2 = k(c0090a.f2093b, i2);
        int i3 = c0090a.f2093b;
        int i4 = c0090a.f2092a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0090a);
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = c0090a.f2094c;
            bVar = (J.b) this.f198b;
            if (i5 >= i7) {
                break;
            }
            int k3 = k((i * i5) + c0090a.f2093b, c0090a.f2092a);
            int i8 = c0090a.f2092a;
            if (i8 == 2 ? k3 != k2 : !(i8 == 4 && k3 == k2 + 1)) {
                C0090a h = h(i8, k2, i6);
                d(h, i3);
                bVar.c(h);
                if (c0090a.f2092a == 4) {
                    i3 += i6;
                }
                i6 = 1;
                k2 = k3;
            } else {
                i6++;
            }
            i5++;
        }
        bVar.c(c0090a);
        if (i6 > 0) {
            C0090a h2 = h(c0090a.f2092a, k2, i6);
            d(h2, i3);
            bVar.c(h2);
        }
    }

    public void d(C0090a c0090a, int i) {
        C0114z c0114z = (C0114z) this.f200e;
        c0114z.a(c0090a);
        int i2 = c0090a.f2092a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0114z.c(i, c0090a.f2094c);
        } else {
            int i3 = c0090a.f2094c;
            RecyclerView recyclerView = c0114z.f2252a;
            recyclerView.O(i, i3, true);
            recyclerView.f1479f0 = true;
            recyclerView.f1474c0.f2059c += i3;
        }
    }

    public int e(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            C0090a c0090a = (C0090a) arrayList.get(i2);
            int i3 = c0090a.f2092a;
            if (i3 == 8) {
                int i4 = c0090a.f2093b;
                if (i4 == i) {
                    i = c0090a.f2094c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0090a.f2094c <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c0090a.f2093b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c0090a.f2094c;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c0090a.f2094c;
                }
            }
            i2++;
        }
        return i;
    }

    public boolean f() {
        return ((ArrayList) this.f199c).size() > 0;
    }

    public u g() {
        u uVar = new u();
        uVar.d = new LinkedHashMap();
        uVar.f791a = (k1.n) this.f199c;
        uVar.f792b = (String) this.f198b;
        Map map = (Map) this.f200e;
        uVar.d = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        uVar.f793c = ((k1.l) this.d).c();
        return uVar;
    }

    public C0090a h(int i, int i2, int i3) {
        C0090a c0090a = (C0090a) ((J.b) this.f198b).a();
        if (c0090a != null) {
            c0090a.f2092a = i;
            c0090a.f2093b = i2;
            c0090a.f2094c = i3;
            return c0090a;
        }
        C0090a c0090a2 = new C0090a();
        c0090a2.f2092a = i;
        c0090a2.f2093b = i2;
        c0090a2.f2094c = i3;
        return c0090a2;
    }

    public void i(C0090a c0090a) {
        ((ArrayList) this.d).add(c0090a);
        int i = c0090a.f2092a;
        C0114z c0114z = (C0114z) this.f200e;
        if (i == 1) {
            c0114z.d(c0090a.f2093b, c0090a.f2094c);
            return;
        }
        if (i == 2) {
            int i2 = c0090a.f2093b;
            int i3 = c0090a.f2094c;
            RecyclerView recyclerView = c0114z.f2252a;
            recyclerView.O(i2, i3, false);
            recyclerView.f1479f0 = true;
            return;
        }
        if (i == 4) {
            c0114z.c(c0090a.f2093b, c0090a.f2094c);
        } else if (i == 8) {
            c0114z.e(c0090a.f2093b, c0090a.f2094c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0090a);
        }
    }

    public void j(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0090a c0090a = (C0090a) arrayList.get(i);
            c0090a.getClass();
            ((J.b) this.f198b).c(c0090a);
        }
        arrayList.clear();
    }

    public int k(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0090a c0090a = (C0090a) arrayList.get(size);
            int i5 = c0090a.f2092a;
            if (i5 == 8) {
                int i6 = c0090a.f2093b;
                int i7 = c0090a.f2094c;
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
                            c0090a.f2093b = i6 + 1;
                            c0090a.f2094c = i7 + 1;
                        } else if (i2 == 2) {
                            c0090a.f2093b = i6 - 1;
                            c0090a.f2094c = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c0090a.f2094c = i7 + 1;
                    } else if (i2 == 2) {
                        c0090a.f2094c = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c0090a.f2093b = i6 + 1;
                    } else if (i2 == 2) {
                        c0090a.f2093b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c0090a.f2093b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c0090a.f2094c;
                    } else if (i5 == 2) {
                        i += c0090a.f2094c;
                    }
                } else if (i2 == 1) {
                    c0090a.f2093b = i8 + 1;
                } else if (i2 == 2) {
                    c0090a.f2093b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0090a c0090a2 = (C0090a) arrayList.get(size2);
            int i9 = c0090a2.f2092a;
            J.b bVar = (J.b) this.f198b;
            if (i9 == 8) {
                int i10 = c0090a2.f2094c;
                if (i10 == c0090a2.f2093b || i10 < 0) {
                    arrayList.remove(size2);
                    bVar.c(c0090a2);
                }
            } else if (c0090a2.f2094c <= 0) {
                arrayList.remove(size2);
                bVar.c(c0090a2);
            }
        }
        return i;
    }

    public String toString() {
        switch (this.f197a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f198b) + ", mProviderPackage: " + ((String) this.f199c) + ", mQuery: " + ((String) this.d) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.f201f;
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
                sb2.append((String) this.f198b);
                sb2.append(", url=");
                sb2.append((k1.n) this.f199c);
                k1.l lVar = (k1.l) this.d;
                if (lVar.size() != 0) {
                    sb2.append(", headers=[");
                    Iterator it = lVar.iterator();
                    int i3 = 0;
                    while (true) {
                        R0.a aVar = (R0.a) it;
                        if (aVar.hasNext()) {
                            Object next = aVar.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                throw new ArithmeticException("Index overflow has happened.");
                            }
                            Q0.c cVar = (Q0.c) next;
                            String str = (String) cVar.f688a;
                            String str2 = (String) cVar.f689b;
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
                Map map = (Map) this.f200e;
                if (!map.isEmpty()) {
                    sb2.append(", tags=");
                    sb2.append(map);
                }
                sb2.append('}');
                String sb3 = sb2.toString();
                Z0.d.d(sb3, "StringBuilder().apply(builderAction).toString()");
                return sb3;
        }
    }

    public e(String str, String str2, String str3, List list) {
        this.f197a = 0;
        str.getClass();
        this.f198b = str;
        str2.getClass();
        this.f199c = str2;
        this.d = str3;
        list.getClass();
        this.f201f = list;
        this.f200e = str + "-" + str2 + "-" + str3;
    }

    public e(C0114z c0114z) {
        this.f197a = 1;
        this.f198b = new J.b(30);
        this.f199c = new ArrayList();
        this.d = new ArrayList();
        this.f200e = c0114z;
        this.f201f = new C.g(23, this);
    }
}
