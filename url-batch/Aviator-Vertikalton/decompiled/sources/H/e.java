package H;

import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import e0.C0113a;
import e0.C0137z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f222a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f223b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f224c;

    /* renamed from: d, reason: collision with root package name */
    public final Serializable f225d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f226e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f227f;

    public e(String str, String str2, String str3, List list) {
        this.f222a = 0;
        str.getClass();
        this.f223b = str;
        str2.getClass();
        this.f224c = str2;
        this.f225d = str3;
        list.getClass();
        this.f227f = list;
        this.f226e = str + "-" + str2 + "-" + str3;
    }

    public boolean a(int i) {
        ArrayList arrayList = (ArrayList) this.f225d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0113a c0113a = (C0113a) arrayList.get(i2);
            int i3 = c0113a.f2188a;
            if (i3 == 8) {
                if (e(c0113a.f2190c, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c0113a.f2189b;
                int i5 = c0113a.f2190c + i4;
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
        ArrayList arrayList = (ArrayList) this.f225d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0137z) this.f226e).a((C0113a) arrayList.get(i));
        }
        i(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f224c;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C0113a c0113a = (C0113a) arrayList2.get(i2);
            int i3 = c0113a.f2188a;
            C0137z c0137z = (C0137z) this.f226e;
            if (i3 == 1) {
                c0137z.a(c0113a);
                c0137z.d(c0113a.f2189b, c0113a.f2190c);
            } else if (i3 == 2) {
                c0137z.a(c0113a);
                int i4 = c0113a.f2189b;
                int i5 = c0113a.f2190c;
                RecyclerView recyclerView = c0137z.f2370a;
                recyclerView.O(i4, i5, true);
                recyclerView.f1576f0 = true;
                recyclerView.f1570c0.f2150c += i5;
            } else if (i3 == 4) {
                c0137z.a(c0113a);
                c0137z.c(c0113a.f2189b, c0113a.f2190c);
            } else if (i3 == 8) {
                c0137z.a(c0113a);
                c0137z.e(c0113a.f2189b, c0113a.f2190c);
            }
        }
        i(arrayList2);
    }

    public void c(C0113a c0113a) {
        int i;
        J.b bVar;
        int i2 = c0113a.f2188a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int j2 = j(c0113a.f2189b, i2);
        int i3 = c0113a.f2189b;
        int i4 = c0113a.f2188a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0113a);
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = c0113a.f2190c;
            bVar = (J.b) this.f223b;
            if (i5 >= i7) {
                break;
            }
            int j3 = j((i * i5) + c0113a.f2189b, c0113a.f2188a);
            int i8 = c0113a.f2188a;
            if (i8 == 2 ? j3 != j2 : !(i8 == 4 && j3 == j2 + 1)) {
                C0113a g2 = g(i8, j2, i6);
                d(g2, i3);
                bVar.c(g2);
                if (c0113a.f2188a == 4) {
                    i3 += i6;
                }
                i6 = 1;
                j2 = j3;
            } else {
                i6++;
            }
            i5++;
        }
        bVar.c(c0113a);
        if (i6 > 0) {
            C0113a g3 = g(c0113a.f2188a, j2, i6);
            d(g3, i3);
            bVar.c(g3);
        }
    }

    public void d(C0113a c0113a, int i) {
        C0137z c0137z = (C0137z) this.f226e;
        c0137z.a(c0113a);
        int i2 = c0113a.f2188a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0137z.c(i, c0113a.f2190c);
        } else {
            int i3 = c0113a.f2190c;
            RecyclerView recyclerView = c0137z.f2370a;
            recyclerView.O(i, i3, true);
            recyclerView.f1576f0 = true;
            recyclerView.f1570c0.f2150c += i3;
        }
    }

    public int e(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.f225d;
        int size = arrayList.size();
        while (i2 < size) {
            C0113a c0113a = (C0113a) arrayList.get(i2);
            int i3 = c0113a.f2188a;
            if (i3 == 8) {
                int i4 = c0113a.f2189b;
                if (i4 == i) {
                    i = c0113a.f2190c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0113a.f2190c <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c0113a.f2189b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c0113a.f2190c;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c0113a.f2190c;
                }
            }
            i2++;
        }
        return i;
    }

    public boolean f() {
        return ((ArrayList) this.f224c).size() > 0;
    }

    public C0113a g(int i, int i2, int i3) {
        C0113a c0113a = (C0113a) ((J.b) this.f223b).a();
        if (c0113a != null) {
            c0113a.f2188a = i;
            c0113a.f2189b = i2;
            c0113a.f2190c = i3;
            return c0113a;
        }
        C0113a c0113a2 = new C0113a();
        c0113a2.f2188a = i;
        c0113a2.f2189b = i2;
        c0113a2.f2190c = i3;
        return c0113a2;
    }

    public void h(C0113a c0113a) {
        ((ArrayList) this.f225d).add(c0113a);
        int i = c0113a.f2188a;
        C0137z c0137z = (C0137z) this.f226e;
        if (i == 1) {
            c0137z.d(c0113a.f2189b, c0113a.f2190c);
            return;
        }
        if (i == 2) {
            int i2 = c0113a.f2189b;
            int i3 = c0113a.f2190c;
            RecyclerView recyclerView = c0137z.f2370a;
            recyclerView.O(i2, i3, false);
            recyclerView.f1576f0 = true;
            return;
        }
        if (i == 4) {
            c0137z.c(c0113a.f2189b, c0113a.f2190c);
        } else if (i == 8) {
            c0137z.e(c0113a.f2189b, c0113a.f2190c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0113a);
        }
    }

    public void i(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0113a c0113a = (C0113a) arrayList.get(i);
            c0113a.getClass();
            ((J.b) this.f223b).c(c0113a);
        }
        arrayList.clear();
    }

    public int j(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.f225d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0113a c0113a = (C0113a) arrayList.get(size);
            int i5 = c0113a.f2188a;
            if (i5 == 8) {
                int i6 = c0113a.f2189b;
                int i7 = c0113a.f2190c;
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
                            c0113a.f2189b = i6 + 1;
                            c0113a.f2190c = i7 + 1;
                        } else if (i2 == 2) {
                            c0113a.f2189b = i6 - 1;
                            c0113a.f2190c = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c0113a.f2190c = i7 + 1;
                    } else if (i2 == 2) {
                        c0113a.f2190c = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c0113a.f2189b = i6 + 1;
                    } else if (i2 == 2) {
                        c0113a.f2189b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c0113a.f2189b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c0113a.f2190c;
                    } else if (i5 == 2) {
                        i += c0113a.f2190c;
                    }
                } else if (i2 == 1) {
                    c0113a.f2189b = i8 + 1;
                } else if (i2 == 2) {
                    c0113a.f2189b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0113a c0113a2 = (C0113a) arrayList.get(size2);
            int i9 = c0113a2.f2188a;
            J.b bVar = (J.b) this.f223b;
            if (i9 == 8) {
                int i10 = c0113a2.f2190c;
                if (i10 == c0113a2.f2189b || i10 < 0) {
                    arrayList.remove(size2);
                    bVar.c(c0113a2);
                }
            } else if (c0113a2.f2190c <= 0) {
                arrayList.remove(size2);
                bVar.c(c0113a2);
            }
        }
        return i;
    }

    public String toString() {
        switch (this.f222a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f223b) + ", mProviderPackage: " + ((String) this.f224c) + ", mQuery: " + ((String) this.f225d) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.f227f;
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

    public e(C0137z c0137z) {
        this.f222a = 1;
        this.f223b = new J.b(30);
        this.f224c = new ArrayList();
        this.f225d = new ArrayList();
        this.f226e = c0137z;
        this.f227f = new B0.d(23, this);
    }
}
