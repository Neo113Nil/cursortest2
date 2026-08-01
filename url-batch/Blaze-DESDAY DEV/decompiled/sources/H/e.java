package H;

import K.X;
import U.u;
import android.util.Base64;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import g0.C0111A;
import g0.C0117a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k0.AbstractC0180a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f276a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f277b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f278c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f279e;

    /* renamed from: f, reason: collision with root package name */
    public Object f280f;

    public e(r1.m mVar, String str, r1.k kVar, AbstractC0180a abstractC0180a, Map map) {
        this.f276a = 3;
        g1.d.e(mVar, "url");
        g1.d.e(str, "method");
        this.f278c = mVar;
        this.f277b = str;
        this.d = kVar;
        this.f279e = map;
    }

    public boolean a(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0117a c0117a = (C0117a) arrayList.get(i2);
            int i3 = c0117a.f2362a;
            if (i3 == 8) {
                if (e(c0117a.f2364c, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c0117a.f2363b;
                int i5 = c0117a.f2364c + i4;
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
            ((C0111A) this.f279e).a((C0117a) arrayList.get(i));
        }
        j(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f278c;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C0117a c0117a = (C0117a) arrayList2.get(i2);
            int i3 = c0117a.f2362a;
            C0111A c0111a = (C0111A) this.f279e;
            if (i3 == 1) {
                c0111a.a(c0117a);
                c0111a.d(c0117a.f2363b, c0117a.f2364c);
            } else if (i3 == 2) {
                c0111a.a(c0117a);
                int i4 = c0117a.f2363b;
                int i5 = c0117a.f2364c;
                RecyclerView recyclerView = c0111a.f2296a;
                recyclerView.R(i4, i5, true);
                recyclerView.f1601h0 = true;
                recyclerView.f1596e0.f2347c += i5;
            } else if (i3 == 4) {
                c0111a.a(c0117a);
                c0111a.c(c0117a.f2363b, c0117a.f2364c);
            } else if (i3 == 8) {
                c0111a.a(c0117a);
                c0111a.e(c0117a.f2363b, c0117a.f2364c);
            }
        }
        j(arrayList2);
    }

    public void c(C0117a c0117a) {
        int i;
        J.b bVar;
        int i2 = c0117a.f2362a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int k2 = k(c0117a.f2363b, i2);
        int i3 = c0117a.f2363b;
        int i4 = c0117a.f2362a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0117a);
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = c0117a.f2364c;
            bVar = (J.b) this.f277b;
            if (i5 >= i7) {
                break;
            }
            int k3 = k((i * i5) + c0117a.f2363b, c0117a.f2362a);
            int i8 = c0117a.f2362a;
            if (i8 == 2 ? k3 != k2 : !(i8 == 4 && k3 == k2 + 1)) {
                C0117a h = h(i8, k2, i6);
                d(h, i3);
                bVar.c(h);
                if (c0117a.f2362a == 4) {
                    i3 += i6;
                }
                i6 = 1;
                k2 = k3;
            } else {
                i6++;
            }
            i5++;
        }
        bVar.c(c0117a);
        if (i6 > 0) {
            C0117a h2 = h(c0117a.f2362a, k2, i6);
            d(h2, i3);
            bVar.c(h2);
        }
    }

    public void d(C0117a c0117a, int i) {
        C0111A c0111a = (C0111A) this.f279e;
        c0111a.a(c0117a);
        int i2 = c0117a.f2362a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0111a.c(i, c0117a.f2364c);
        } else {
            int i3 = c0117a.f2364c;
            RecyclerView recyclerView = c0111a.f2296a;
            recyclerView.R(i, i3, true);
            recyclerView.f1601h0 = true;
            recyclerView.f1596e0.f2347c += i3;
        }
    }

    public int e(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            C0117a c0117a = (C0117a) arrayList.get(i2);
            int i3 = c0117a.f2362a;
            if (i3 == 8) {
                int i4 = c0117a.f2363b;
                if (i4 == i) {
                    i = c0117a.f2364c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0117a.f2364c <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c0117a.f2363b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c0117a.f2364c;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c0117a.f2364c;
                }
            }
            i2++;
        }
        return i;
    }

    public boolean f() {
        return ((ArrayList) this.f278c).size() > 0;
    }

    public u g() {
        u uVar = new u();
        uVar.d = new LinkedHashMap();
        uVar.f883a = (r1.m) this.f278c;
        uVar.f884b = (String) this.f277b;
        Map map = (Map) this.f279e;
        uVar.d = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        uVar.f885c = ((r1.k) this.d).c();
        return uVar;
    }

    public C0117a h(int i, int i2, int i3) {
        C0117a c0117a = (C0117a) ((J.b) this.f277b).a();
        if (c0117a != null) {
            c0117a.f2362a = i;
            c0117a.f2363b = i2;
            c0117a.f2364c = i3;
            return c0117a;
        }
        C0117a c0117a2 = new C0117a();
        c0117a2.f2362a = i;
        c0117a2.f2363b = i2;
        c0117a2.f2364c = i3;
        return c0117a2;
    }

    public void i(C0117a c0117a) {
        ((ArrayList) this.d).add(c0117a);
        int i = c0117a.f2362a;
        C0111A c0111a = (C0111A) this.f279e;
        if (i == 1) {
            c0111a.d(c0117a.f2363b, c0117a.f2364c);
            return;
        }
        if (i == 2) {
            int i2 = c0117a.f2363b;
            int i3 = c0117a.f2364c;
            RecyclerView recyclerView = c0111a.f2296a;
            recyclerView.R(i2, i3, false);
            recyclerView.f1601h0 = true;
            return;
        }
        if (i == 4) {
            c0111a.c(c0117a.f2363b, c0117a.f2364c);
        } else if (i == 8) {
            c0111a.e(c0117a.f2363b, c0117a.f2364c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0117a);
        }
    }

    public void j(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0117a c0117a = (C0117a) arrayList.get(i);
            c0117a.getClass();
            ((J.b) this.f277b).c(c0117a);
        }
        arrayList.clear();
    }

    public int k(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0117a c0117a = (C0117a) arrayList.get(size);
            int i5 = c0117a.f2362a;
            if (i5 == 8) {
                int i6 = c0117a.f2363b;
                int i7 = c0117a.f2364c;
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
                            c0117a.f2363b = i6 + 1;
                            c0117a.f2364c = i7 + 1;
                        } else if (i2 == 2) {
                            c0117a.f2363b = i6 - 1;
                            c0117a.f2364c = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c0117a.f2364c = i7 + 1;
                    } else if (i2 == 2) {
                        c0117a.f2364c = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c0117a.f2363b = i6 + 1;
                    } else if (i2 == 2) {
                        c0117a.f2363b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c0117a.f2363b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c0117a.f2364c;
                    } else if (i5 == 2) {
                        i += c0117a.f2364c;
                    }
                } else if (i2 == 1) {
                    c0117a.f2363b = i8 + 1;
                } else if (i2 == 2) {
                    c0117a.f2363b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0117a c0117a2 = (C0117a) arrayList.get(size2);
            int i9 = c0117a2.f2362a;
            J.b bVar = (J.b) this.f277b;
            if (i9 == 8) {
                int i10 = c0117a2.f2364c;
                if (i10 == c0117a2.f2363b || i10 < 0) {
                    arrayList.remove(size2);
                    bVar.c(c0117a2);
                }
            } else if (c0117a2.f2364c <= 0) {
                arrayList.remove(size2);
                bVar.c(c0117a2);
            }
        }
        return i;
    }

    public String toString() {
        switch (this.f276a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f277b) + ", mProviderPackage: " + ((String) this.f278c) + ", mQuery: " + ((String) this.d) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.f280f;
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
            case 3:
                StringBuilder sb2 = new StringBuilder("Request{method=");
                sb2.append((String) this.f277b);
                sb2.append(", url=");
                sb2.append((r1.m) this.f278c);
                r1.k kVar = (r1.k) this.d;
                if (kVar.size() != 0) {
                    sb2.append(", headers=[");
                    Iterator it = kVar.iterator();
                    int i3 = 0;
                    while (true) {
                        X x2 = (X) it;
                        if (x2.hasNext()) {
                            Object next = x2.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                throw new ArithmeticException("Index overflow has happened.");
                            }
                            U0.c cVar = (U0.c) next;
                            String str = (String) cVar.f897a;
                            String str2 = (String) cVar.f898b;
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
                Map map = (Map) this.f279e;
                if (!map.isEmpty()) {
                    sb2.append(", tags=");
                    sb2.append(map);
                }
                sb2.append('}');
                String sb3 = sb2.toString();
                g1.d.d(sb3, "StringBuilder().apply(builderAction).toString()");
                return sb3;
            default:
                return super.toString();
        }
    }

    public e(LinearLayout linearLayout, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        this.f276a = 1;
        this.f277b = linearLayout;
        this.f278c = textView;
        this.d = imageView;
        this.f279e = textView2;
        this.f280f = textView3;
    }

    public e(String str, String str2, String str3, List list) {
        this.f276a = 0;
        str.getClass();
        this.f277b = str;
        str2.getClass();
        this.f278c = str2;
        this.d = str3;
        list.getClass();
        this.f280f = list;
        this.f279e = str + "-" + str2 + "-" + str3;
    }

    public e(C0111A c0111a) {
        this.f276a = 2;
        this.f277b = new J.b(30);
        this.f278c = new ArrayList();
        this.d = new ArrayList();
        this.f279e = c0111a;
        this.f280f = new C.g(24, this);
    }
}
