package J;

import V.v;
import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import h0.C0151a;
import h0.C0173x;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import z1.m;
import z1.o;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f624a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f625b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f626c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f627d;
    public final Object e;

    /* renamed from: f, reason: collision with root package name */
    public Object f628f;

    public d(o oVar, String str, m mVar, z1.e eVar, Map map) {
        this.f624a = 2;
        j1.h.e(oVar, "url");
        j1.h.e(str, "method");
        this.f626c = oVar;
        this.f625b = str;
        this.f627d = mVar;
        this.e = map;
    }

    public boolean a(int i) {
        ArrayList arrayList = (ArrayList) this.f627d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0151a c0151a = (C0151a) arrayList.get(i2);
            int i3 = c0151a.f2983a;
            if (i3 == 8) {
                if (e(c0151a.f2985c, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c0151a.f2984b;
                int i5 = c0151a.f2985c + i4;
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
        ArrayList arrayList = (ArrayList) this.f627d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0173x) this.e).a((C0151a) arrayList.get(i));
        }
        j(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f626c;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C0151a c0151a = (C0151a) arrayList2.get(i2);
            int i3 = c0151a.f2983a;
            C0173x c0173x = (C0173x) this.e;
            if (i3 == 1) {
                c0173x.a(c0151a);
                c0173x.d(c0151a.f2984b, c0151a.f2985c);
            } else if (i3 == 2) {
                c0173x.a(c0151a);
                int i4 = c0151a.f2984b;
                int i5 = c0151a.f2985c;
                RecyclerView recyclerView = c0173x.f3135a;
                recyclerView.O(i4, i5, true);
                recyclerView.f2022f0 = true;
                recyclerView.f2017c0.f2942c += i5;
            } else if (i3 == 4) {
                c0173x.a(c0151a);
                c0173x.c(c0151a.f2984b, c0151a.f2985c);
            } else if (i3 == 8) {
                c0173x.a(c0151a);
                c0173x.e(c0151a.f2984b, c0151a.f2985c);
            }
        }
        j(arrayList2);
    }

    public void c(C0151a c0151a) {
        int i;
        L.b bVar;
        int i2 = c0151a.f2983a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int k2 = k(c0151a.f2984b, i2);
        int i3 = c0151a.f2984b;
        int i4 = c0151a.f2983a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0151a);
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = c0151a.f2985c;
            bVar = (L.b) this.f625b;
            if (i5 >= i7) {
                break;
            }
            int k3 = k((i * i5) + c0151a.f2984b, c0151a.f2983a);
            int i8 = c0151a.f2983a;
            if (i8 == 2 ? k3 != k2 : !(i8 == 4 && k3 == k2 + 1)) {
                C0151a h2 = h(i8, k2, i6);
                d(h2, i3);
                bVar.c(h2);
                if (c0151a.f2983a == 4) {
                    i3 += i6;
                }
                i6 = 1;
                k2 = k3;
            } else {
                i6++;
            }
            i5++;
        }
        bVar.c(c0151a);
        if (i6 > 0) {
            C0151a h3 = h(c0151a.f2983a, k2, i6);
            d(h3, i3);
            bVar.c(h3);
        }
    }

    public void d(C0151a c0151a, int i) {
        C0173x c0173x = (C0173x) this.e;
        c0173x.a(c0151a);
        int i2 = c0151a.f2983a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0173x.c(i, c0151a.f2985c);
        } else {
            int i3 = c0151a.f2985c;
            RecyclerView recyclerView = c0173x.f3135a;
            recyclerView.O(i, i3, true);
            recyclerView.f2022f0 = true;
            recyclerView.f2017c0.f2942c += i3;
        }
    }

    public int e(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.f627d;
        int size = arrayList.size();
        while (i2 < size) {
            C0151a c0151a = (C0151a) arrayList.get(i2);
            int i3 = c0151a.f2983a;
            if (i3 == 8) {
                int i4 = c0151a.f2984b;
                if (i4 == i) {
                    i = c0151a.f2985c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0151a.f2985c <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c0151a.f2984b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c0151a.f2985c;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c0151a.f2985c;
                }
            }
            i2++;
        }
        return i;
    }

    public boolean f() {
        return ((ArrayList) this.f626c).size() > 0;
    }

    public v g() {
        v vVar = new v();
        vVar.f1308d = new LinkedHashMap();
        vVar.f1305a = (o) this.f626c;
        vVar.f1306b = (String) this.f625b;
        Map map = (Map) this.e;
        vVar.f1308d = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        vVar.f1307c = ((m) this.f627d).c();
        return vVar;
    }

    public C0151a h(int i, int i2, int i3) {
        C0151a c0151a = (C0151a) ((L.b) this.f625b).a();
        if (c0151a != null) {
            c0151a.f2983a = i;
            c0151a.f2984b = i2;
            c0151a.f2985c = i3;
            return c0151a;
        }
        C0151a c0151a2 = new C0151a();
        c0151a2.f2983a = i;
        c0151a2.f2984b = i2;
        c0151a2.f2985c = i3;
        return c0151a2;
    }

    public void i(C0151a c0151a) {
        ((ArrayList) this.f627d).add(c0151a);
        int i = c0151a.f2983a;
        C0173x c0173x = (C0173x) this.e;
        if (i == 1) {
            c0173x.d(c0151a.f2984b, c0151a.f2985c);
            return;
        }
        if (i == 2) {
            int i2 = c0151a.f2984b;
            int i3 = c0151a.f2985c;
            RecyclerView recyclerView = c0173x.f3135a;
            recyclerView.O(i2, i3, false);
            recyclerView.f2022f0 = true;
            return;
        }
        if (i == 4) {
            c0173x.c(c0151a.f2984b, c0151a.f2985c);
        } else if (i == 8) {
            c0173x.e(c0151a.f2984b, c0151a.f2985c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0151a);
        }
    }

    public void j(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0151a c0151a = (C0151a) arrayList.get(i);
            c0151a.getClass();
            ((L.b) this.f625b).c(c0151a);
        }
        arrayList.clear();
    }

    public int k(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.f627d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0151a c0151a = (C0151a) arrayList.get(size);
            int i5 = c0151a.f2983a;
            if (i5 == 8) {
                int i6 = c0151a.f2984b;
                int i7 = c0151a.f2985c;
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
                            c0151a.f2984b = i6 + 1;
                            c0151a.f2985c = i7 + 1;
                        } else if (i2 == 2) {
                            c0151a.f2984b = i6 - 1;
                            c0151a.f2985c = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c0151a.f2985c = i7 + 1;
                    } else if (i2 == 2) {
                        c0151a.f2985c = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c0151a.f2984b = i6 + 1;
                    } else if (i2 == 2) {
                        c0151a.f2984b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c0151a.f2984b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c0151a.f2985c;
                    } else if (i5 == 2) {
                        i += c0151a.f2985c;
                    }
                } else if (i2 == 1) {
                    c0151a.f2984b = i8 + 1;
                } else if (i2 == 2) {
                    c0151a.f2984b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0151a c0151a2 = (C0151a) arrayList.get(size2);
            int i9 = c0151a2.f2983a;
            L.b bVar = (L.b) this.f625b;
            if (i9 == 8) {
                int i10 = c0151a2.f2985c;
                if (i10 == c0151a2.f2984b || i10 < 0) {
                    arrayList.remove(size2);
                    bVar.c(c0151a2);
                }
            } else if (c0151a2.f2985c <= 0) {
                arrayList.remove(size2);
                bVar.c(c0151a2);
            }
        }
        return i;
    }

    public String toString() {
        switch (this.f624a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f625b) + ", mProviderPackage: " + ((String) this.f626c) + ", mQuery: " + ((String) this.f627d) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.f628f;
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
                sb2.append((String) this.f625b);
                sb2.append(", url=");
                sb2.append((o) this.f626c);
                m mVar = (m) this.f627d;
                if (mVar.size() != 0) {
                    sb2.append(", headers=[");
                    int i3 = 0;
                    for (Object obj : mVar) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            X0.l.l0();
                            throw null;
                        }
                        W0.d dVar = (W0.d) obj;
                        String str = (String) dVar.f1338a;
                        String str2 = (String) dVar.f1339b;
                        if (i3 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(str);
                        sb2.append(':');
                        sb2.append(str2);
                        i3 = i4;
                    }
                    sb2.append(']');
                }
                Map map = (Map) this.e;
                if (!map.isEmpty()) {
                    sb2.append(", tags=");
                    sb2.append(map);
                }
                sb2.append('}');
                String sb3 = sb2.toString();
                j1.h.d(sb3, "StringBuilder().apply(builderAction).toString()");
                return sb3;
        }
    }

    public d(String str, String str2, String str3, List list) {
        this.f624a = 0;
        str.getClass();
        this.f625b = str;
        str2.getClass();
        this.f626c = str2;
        this.f627d = str3;
        list.getClass();
        this.f628f = list;
        this.e = str + "-" + str2 + "-" + str3;
    }

    public d(C0173x c0173x) {
        this.f624a = 1;
        this.f625b = new L.b(30);
        this.f626c = new ArrayList();
        this.f627d = new ArrayList();
        this.e = c0173x;
        this.f628f = new C1.d(26, this);
    }
}
