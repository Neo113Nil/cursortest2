package H;

import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import e0.C0114a;
import e0.C0138z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f222b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f223c;

    /* renamed from: d, reason: collision with root package name */
    public final Serializable f224d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f225e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f226f;

    public e(String str, String str2, String str3, List list) {
        this.f221a = 0;
        str.getClass();
        this.f222b = str;
        str2.getClass();
        this.f223c = str2;
        this.f224d = str3;
        list.getClass();
        this.f226f = list;
        this.f225e = str + "-" + str2 + "-" + str3;
    }

    public boolean a(int i) {
        ArrayList arrayList = (ArrayList) this.f224d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0114a c0114a = (C0114a) arrayList.get(i2);
            int i3 = c0114a.f2192a;
            if (i3 == 8) {
                if (e(c0114a.f2194c, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c0114a.f2193b;
                int i5 = c0114a.f2194c + i4;
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
        ArrayList arrayList = (ArrayList) this.f224d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0138z) this.f225e).a((C0114a) arrayList.get(i));
        }
        i(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f223c;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C0114a c0114a = (C0114a) arrayList2.get(i2);
            int i3 = c0114a.f2192a;
            C0138z c0138z = (C0138z) this.f225e;
            if (i3 == 1) {
                c0138z.a(c0114a);
                c0138z.d(c0114a.f2193b, c0114a.f2194c);
            } else if (i3 == 2) {
                c0138z.a(c0114a);
                int i4 = c0114a.f2193b;
                int i5 = c0114a.f2194c;
                RecyclerView recyclerView = c0138z.f2374a;
                recyclerView.O(i4, i5, true);
                recyclerView.f1577f0 = true;
                recyclerView.f1571c0.f2154c += i5;
            } else if (i3 == 4) {
                c0138z.a(c0114a);
                c0138z.c(c0114a.f2193b, c0114a.f2194c);
            } else if (i3 == 8) {
                c0138z.a(c0114a);
                c0138z.e(c0114a.f2193b, c0114a.f2194c);
            }
        }
        i(arrayList2);
    }

    public void c(C0114a c0114a) {
        int i;
        J.b bVar;
        int i2 = c0114a.f2192a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int j2 = j(c0114a.f2193b, i2);
        int i3 = c0114a.f2193b;
        int i4 = c0114a.f2192a;
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
            int i7 = c0114a.f2194c;
            bVar = (J.b) this.f222b;
            if (i5 >= i7) {
                break;
            }
            int j3 = j((i * i5) + c0114a.f2193b, c0114a.f2192a);
            int i8 = c0114a.f2192a;
            if (i8 == 2 ? j3 != j2 : !(i8 == 4 && j3 == j2 + 1)) {
                C0114a g2 = g(i8, j2, i6);
                d(g2, i3);
                bVar.c(g2);
                if (c0114a.f2192a == 4) {
                    i3 += i6;
                }
                i6 = 1;
                j2 = j3;
            } else {
                i6++;
            }
            i5++;
        }
        bVar.c(c0114a);
        if (i6 > 0) {
            C0114a g3 = g(c0114a.f2192a, j2, i6);
            d(g3, i3);
            bVar.c(g3);
        }
    }

    public void d(C0114a c0114a, int i) {
        C0138z c0138z = (C0138z) this.f225e;
        c0138z.a(c0114a);
        int i2 = c0114a.f2192a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0138z.c(i, c0114a.f2194c);
        } else {
            int i3 = c0114a.f2194c;
            RecyclerView recyclerView = c0138z.f2374a;
            recyclerView.O(i, i3, true);
            recyclerView.f1577f0 = true;
            recyclerView.f1571c0.f2154c += i3;
        }
    }

    public int e(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.f224d;
        int size = arrayList.size();
        while (i2 < size) {
            C0114a c0114a = (C0114a) arrayList.get(i2);
            int i3 = c0114a.f2192a;
            if (i3 == 8) {
                int i4 = c0114a.f2193b;
                if (i4 == i) {
                    i = c0114a.f2194c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0114a.f2194c <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c0114a.f2193b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c0114a.f2194c;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c0114a.f2194c;
                }
            }
            i2++;
        }
        return i;
    }

    public boolean f() {
        return ((ArrayList) this.f223c).size() > 0;
    }

    public C0114a g(int i, int i2, int i3) {
        C0114a c0114a = (C0114a) ((J.b) this.f222b).a();
        if (c0114a != null) {
            c0114a.f2192a = i;
            c0114a.f2193b = i2;
            c0114a.f2194c = i3;
            return c0114a;
        }
        C0114a c0114a2 = new C0114a();
        c0114a2.f2192a = i;
        c0114a2.f2193b = i2;
        c0114a2.f2194c = i3;
        return c0114a2;
    }

    public void h(C0114a c0114a) {
        ((ArrayList) this.f224d).add(c0114a);
        int i = c0114a.f2192a;
        C0138z c0138z = (C0138z) this.f225e;
        if (i == 1) {
            c0138z.d(c0114a.f2193b, c0114a.f2194c);
            return;
        }
        if (i == 2) {
            int i2 = c0114a.f2193b;
            int i3 = c0114a.f2194c;
            RecyclerView recyclerView = c0138z.f2374a;
            recyclerView.O(i2, i3, false);
            recyclerView.f1577f0 = true;
            return;
        }
        if (i == 4) {
            c0138z.c(c0114a.f2193b, c0114a.f2194c);
        } else if (i == 8) {
            c0138z.e(c0114a.f2193b, c0114a.f2194c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0114a);
        }
    }

    public void i(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0114a c0114a = (C0114a) arrayList.get(i);
            c0114a.getClass();
            ((J.b) this.f222b).c(c0114a);
        }
        arrayList.clear();
    }

    public int j(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.f224d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0114a c0114a = (C0114a) arrayList.get(size);
            int i5 = c0114a.f2192a;
            if (i5 == 8) {
                int i6 = c0114a.f2193b;
                int i7 = c0114a.f2194c;
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
                            c0114a.f2193b = i6 + 1;
                            c0114a.f2194c = i7 + 1;
                        } else if (i2 == 2) {
                            c0114a.f2193b = i6 - 1;
                            c0114a.f2194c = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c0114a.f2194c = i7 + 1;
                    } else if (i2 == 2) {
                        c0114a.f2194c = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c0114a.f2193b = i6 + 1;
                    } else if (i2 == 2) {
                        c0114a.f2193b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c0114a.f2193b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c0114a.f2194c;
                    } else if (i5 == 2) {
                        i += c0114a.f2194c;
                    }
                } else if (i2 == 1) {
                    c0114a.f2193b = i8 + 1;
                } else if (i2 == 2) {
                    c0114a.f2193b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0114a c0114a2 = (C0114a) arrayList.get(size2);
            int i9 = c0114a2.f2192a;
            J.b bVar = (J.b) this.f222b;
            if (i9 == 8) {
                int i10 = c0114a2.f2194c;
                if (i10 == c0114a2.f2193b || i10 < 0) {
                    arrayList.remove(size2);
                    bVar.c(c0114a2);
                }
            } else if (c0114a2.f2194c <= 0) {
                arrayList.remove(size2);
                bVar.c(c0114a2);
            }
        }
        return i;
    }

    public String toString() {
        switch (this.f221a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f222b) + ", mProviderPackage: " + ((String) this.f223c) + ", mQuery: " + ((String) this.f224d) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.f226f;
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
            default:
                return super.toString();
        }
    }

    public e(C0138z c0138z) {
        this.f221a = 1;
        this.f222b = new J.b(30);
        this.f223c = new ArrayList();
        this.f224d = new ArrayList();
        this.f225e = c0138z;
        this.f226f = new B0.d(21, this);
    }
}
