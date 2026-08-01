package H;

import T.u;
import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import f0.C0087a;
import f0.C0111z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k0.z;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f273a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f274b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f275c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f276e;

    /* renamed from: f, reason: collision with root package name */
    public Object f277f;

    public e(m1.m mVar, String str, m1.k kVar, z zVar, Map map) {
        this.f273a = 2;
        b1.d.e(mVar, "url");
        b1.d.e(str, "method");
        this.f275c = mVar;
        this.f274b = str;
        this.d = kVar;
        this.f276e = map;
    }

    public boolean a(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0087a c0087a = (C0087a) arrayList.get(i2);
            int i3 = c0087a.f2135a;
            if (i3 == 8) {
                if (e(c0087a.f2137c, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c0087a.f2136b;
                int i5 = c0087a.f2137c + i4;
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
            ((C0111z) this.f276e).a((C0087a) arrayList.get(i));
        }
        j(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f275c;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C0087a c0087a = (C0087a) arrayList2.get(i2);
            int i3 = c0087a.f2135a;
            C0111z c0111z = (C0111z) this.f276e;
            if (i3 == 1) {
                c0111z.a(c0087a);
                c0111z.d(c0087a.f2136b, c0087a.f2137c);
            } else if (i3 == 2) {
                c0111z.a(c0087a);
                int i4 = c0087a.f2136b;
                int i5 = c0087a.f2137c;
                RecyclerView recyclerView = c0111z.f2295a;
                recyclerView.O(i4, i5, true);
                recyclerView.f1521f0 = true;
                recyclerView.f1516c0.f2102c += i5;
            } else if (i3 == 4) {
                c0111z.a(c0087a);
                c0111z.c(c0087a.f2136b, c0087a.f2137c);
            } else if (i3 == 8) {
                c0111z.a(c0087a);
                c0111z.e(c0087a.f2136b, c0087a.f2137c);
            }
        }
        j(arrayList2);
    }

    public void c(C0087a c0087a) {
        int i;
        J.b bVar;
        int i2 = c0087a.f2135a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int k2 = k(c0087a.f2136b, i2);
        int i3 = c0087a.f2136b;
        int i4 = c0087a.f2135a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0087a);
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = c0087a.f2137c;
            bVar = (J.b) this.f274b;
            if (i5 >= i7) {
                break;
            }
            int k3 = k((i * i5) + c0087a.f2136b, c0087a.f2135a);
            int i8 = c0087a.f2135a;
            if (i8 == 2 ? k3 != k2 : !(i8 == 4 && k3 == k2 + 1)) {
                C0087a h = h(i8, k2, i6);
                d(h, i3);
                bVar.c(h);
                if (c0087a.f2135a == 4) {
                    i3 += i6;
                }
                i6 = 1;
                k2 = k3;
            } else {
                i6++;
            }
            i5++;
        }
        bVar.c(c0087a);
        if (i6 > 0) {
            C0087a h2 = h(c0087a.f2135a, k2, i6);
            d(h2, i3);
            bVar.c(h2);
        }
    }

    public void d(C0087a c0087a, int i) {
        C0111z c0111z = (C0111z) this.f276e;
        c0111z.a(c0087a);
        int i2 = c0087a.f2135a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0111z.c(i, c0087a.f2137c);
        } else {
            int i3 = c0087a.f2137c;
            RecyclerView recyclerView = c0111z.f2295a;
            recyclerView.O(i, i3, true);
            recyclerView.f1521f0 = true;
            recyclerView.f1516c0.f2102c += i3;
        }
    }

    public int e(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            C0087a c0087a = (C0087a) arrayList.get(i2);
            int i3 = c0087a.f2135a;
            if (i3 == 8) {
                int i4 = c0087a.f2136b;
                if (i4 == i) {
                    i = c0087a.f2137c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0087a.f2137c <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c0087a.f2136b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c0087a.f2137c;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c0087a.f2137c;
                }
            }
            i2++;
        }
        return i;
    }

    public boolean f() {
        return ((ArrayList) this.f275c).size() > 0;
    }

    public u g() {
        u uVar = new u();
        uVar.d = new LinkedHashMap();
        uVar.f816a = (m1.m) this.f275c;
        uVar.f817b = (String) this.f274b;
        Map map = (Map) this.f276e;
        uVar.d = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        uVar.f818c = ((m1.k) this.d).c();
        return uVar;
    }

    public C0087a h(int i, int i2, int i3) {
        C0087a c0087a = (C0087a) ((J.b) this.f274b).a();
        if (c0087a != null) {
            c0087a.f2135a = i;
            c0087a.f2136b = i2;
            c0087a.f2137c = i3;
            return c0087a;
        }
        C0087a c0087a2 = new C0087a();
        c0087a2.f2135a = i;
        c0087a2.f2136b = i2;
        c0087a2.f2137c = i3;
        return c0087a2;
    }

    public void i(C0087a c0087a) {
        ((ArrayList) this.d).add(c0087a);
        int i = c0087a.f2135a;
        C0111z c0111z = (C0111z) this.f276e;
        if (i == 1) {
            c0111z.d(c0087a.f2136b, c0087a.f2137c);
            return;
        }
        if (i == 2) {
            int i2 = c0087a.f2136b;
            int i3 = c0087a.f2137c;
            RecyclerView recyclerView = c0111z.f2295a;
            recyclerView.O(i2, i3, false);
            recyclerView.f1521f0 = true;
            return;
        }
        if (i == 4) {
            c0111z.c(c0087a.f2136b, c0087a.f2137c);
        } else if (i == 8) {
            c0111z.e(c0087a.f2136b, c0087a.f2137c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0087a);
        }
    }

    public void j(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0087a c0087a = (C0087a) arrayList.get(i);
            c0087a.getClass();
            ((J.b) this.f274b).c(c0087a);
        }
        arrayList.clear();
    }

    public int k(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0087a c0087a = (C0087a) arrayList.get(size);
            int i5 = c0087a.f2135a;
            if (i5 == 8) {
                int i6 = c0087a.f2136b;
                int i7 = c0087a.f2137c;
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
                            c0087a.f2136b = i6 + 1;
                            c0087a.f2137c = i7 + 1;
                        } else if (i2 == 2) {
                            c0087a.f2136b = i6 - 1;
                            c0087a.f2137c = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c0087a.f2137c = i7 + 1;
                    } else if (i2 == 2) {
                        c0087a.f2137c = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c0087a.f2136b = i6 + 1;
                    } else if (i2 == 2) {
                        c0087a.f2136b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c0087a.f2136b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c0087a.f2137c;
                    } else if (i5 == 2) {
                        i += c0087a.f2137c;
                    }
                } else if (i2 == 1) {
                    c0087a.f2136b = i8 + 1;
                } else if (i2 == 2) {
                    c0087a.f2136b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0087a c0087a2 = (C0087a) arrayList.get(size2);
            int i9 = c0087a2.f2135a;
            J.b bVar = (J.b) this.f274b;
            if (i9 == 8) {
                int i10 = c0087a2.f2137c;
                if (i10 == c0087a2.f2136b || i10 < 0) {
                    arrayList.remove(size2);
                    bVar.c(c0087a2);
                }
            } else if (c0087a2.f2137c <= 0) {
                arrayList.remove(size2);
                bVar.c(c0087a2);
            }
        }
        return i;
    }

    public String toString() {
        switch (this.f273a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f274b) + ", mProviderPackage: " + ((String) this.f275c) + ", mQuery: " + ((String) this.d) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.f277f;
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
                sb2.append((String) this.f274b);
                sb2.append(", url=");
                sb2.append((m1.m) this.f275c);
                m1.k kVar = (m1.k) this.d;
                if (kVar.size() != 0) {
                    sb2.append(", headers=[");
                    Iterator it = kVar.iterator();
                    int i3 = 0;
                    while (true) {
                        T0.a aVar = (T0.a) it;
                        if (aVar.hasNext()) {
                            Object next = aVar.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                throw new ArithmeticException("Index overflow has happened.");
                            }
                            S0.b bVar = (S0.b) next;
                            String str = (String) bVar.f768a;
                            String str2 = (String) bVar.f769b;
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
                Map map = (Map) this.f276e;
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
        this.f273a = 0;
        str.getClass();
        this.f274b = str;
        str2.getClass();
        this.f275c = str2;
        this.d = str3;
        list.getClass();
        this.f277f = list;
        this.f276e = str + "-" + str2 + "-" + str3;
    }

    public e(C0111z c0111z) {
        this.f273a = 1;
        this.f274b = new J.b(30);
        this.f275c = new ArrayList();
        this.d = new ArrayList();
        this.f276e = c0111z;
        this.f277f = new C.h(23, this);
    }
}
