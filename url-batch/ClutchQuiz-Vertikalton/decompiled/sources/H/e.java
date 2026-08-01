package H;

import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import f0.C0095a;
import f0.C0118y;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f220b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f221c;
    public final Serializable d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f222e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f223f;

    public e(String str, String str2, String str3, List list) {
        this.f219a = 0;
        str.getClass();
        this.f220b = str;
        str2.getClass();
        this.f221c = str2;
        this.d = str3;
        list.getClass();
        this.f223f = list;
        this.f222e = str + "-" + str2 + "-" + str3;
    }

    public boolean a(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0095a c0095a = (C0095a) arrayList.get(i2);
            int i3 = c0095a.f2212a;
            if (i3 == 8) {
                if (e(c0095a.f2214c, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c0095a.f2213b;
                int i5 = c0095a.f2214c + i4;
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
            ((C0118y) this.f222e).a((C0095a) arrayList.get(i));
        }
        i(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f221c;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C0095a c0095a = (C0095a) arrayList2.get(i2);
            int i3 = c0095a.f2212a;
            C0118y c0118y = (C0118y) this.f222e;
            if (i3 == 1) {
                c0118y.a(c0095a);
                c0118y.d(c0095a.f2213b, c0095a.f2214c);
            } else if (i3 == 2) {
                c0118y.a(c0095a);
                int i4 = c0095a.f2213b;
                int i5 = c0095a.f2214c;
                RecyclerView recyclerView = c0118y.f2367a;
                recyclerView.O(i4, i5, true);
                recyclerView.f1591f0 = true;
                recyclerView.f1586c0.f2177c += i5;
            } else if (i3 == 4) {
                c0118y.a(c0095a);
                c0118y.c(c0095a.f2213b, c0095a.f2214c);
            } else if (i3 == 8) {
                c0118y.a(c0095a);
                c0118y.e(c0095a.f2213b, c0095a.f2214c);
            }
        }
        i(arrayList2);
    }

    public void c(C0095a c0095a) {
        int i;
        J.b bVar;
        int i2 = c0095a.f2212a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int j2 = j(c0095a.f2213b, i2);
        int i3 = c0095a.f2213b;
        int i4 = c0095a.f2212a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0095a);
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = c0095a.f2214c;
            bVar = (J.b) this.f220b;
            if (i5 >= i7) {
                break;
            }
            int j3 = j((i * i5) + c0095a.f2213b, c0095a.f2212a);
            int i8 = c0095a.f2212a;
            if (i8 == 2 ? j3 != j2 : !(i8 == 4 && j3 == j2 + 1)) {
                C0095a g2 = g(i8, j2, i6);
                d(g2, i3);
                bVar.c(g2);
                if (c0095a.f2212a == 4) {
                    i3 += i6;
                }
                i6 = 1;
                j2 = j3;
            } else {
                i6++;
            }
            i5++;
        }
        bVar.c(c0095a);
        if (i6 > 0) {
            C0095a g3 = g(c0095a.f2212a, j2, i6);
            d(g3, i3);
            bVar.c(g3);
        }
    }

    public void d(C0095a c0095a, int i) {
        C0118y c0118y = (C0118y) this.f222e;
        c0118y.a(c0095a);
        int i2 = c0095a.f2212a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0118y.c(i, c0095a.f2214c);
        } else {
            int i3 = c0095a.f2214c;
            RecyclerView recyclerView = c0118y.f2367a;
            recyclerView.O(i, i3, true);
            recyclerView.f1591f0 = true;
            recyclerView.f1586c0.f2177c += i3;
        }
    }

    public int e(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            C0095a c0095a = (C0095a) arrayList.get(i2);
            int i3 = c0095a.f2212a;
            if (i3 == 8) {
                int i4 = c0095a.f2213b;
                if (i4 == i) {
                    i = c0095a.f2214c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0095a.f2214c <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c0095a.f2213b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c0095a.f2214c;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c0095a.f2214c;
                }
            }
            i2++;
        }
        return i;
    }

    public boolean f() {
        return ((ArrayList) this.f221c).size() > 0;
    }

    public C0095a g(int i, int i2, int i3) {
        C0095a c0095a = (C0095a) ((J.b) this.f220b).a();
        if (c0095a != null) {
            c0095a.f2212a = i;
            c0095a.f2213b = i2;
            c0095a.f2214c = i3;
            return c0095a;
        }
        C0095a c0095a2 = new C0095a();
        c0095a2.f2212a = i;
        c0095a2.f2213b = i2;
        c0095a2.f2214c = i3;
        return c0095a2;
    }

    public void h(C0095a c0095a) {
        ((ArrayList) this.d).add(c0095a);
        int i = c0095a.f2212a;
        C0118y c0118y = (C0118y) this.f222e;
        if (i == 1) {
            c0118y.d(c0095a.f2213b, c0095a.f2214c);
            return;
        }
        if (i == 2) {
            int i2 = c0095a.f2213b;
            int i3 = c0095a.f2214c;
            RecyclerView recyclerView = c0118y.f2367a;
            recyclerView.O(i2, i3, false);
            recyclerView.f1591f0 = true;
            return;
        }
        if (i == 4) {
            c0118y.c(c0095a.f2213b, c0095a.f2214c);
        } else if (i == 8) {
            c0118y.e(c0095a.f2213b, c0095a.f2214c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0095a);
        }
    }

    public void i(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0095a c0095a = (C0095a) arrayList.get(i);
            c0095a.getClass();
            ((J.b) this.f220b).c(c0095a);
        }
        arrayList.clear();
    }

    public int j(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0095a c0095a = (C0095a) arrayList.get(size);
            int i5 = c0095a.f2212a;
            if (i5 == 8) {
                int i6 = c0095a.f2213b;
                int i7 = c0095a.f2214c;
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
                            c0095a.f2213b = i6 + 1;
                            c0095a.f2214c = i7 + 1;
                        } else if (i2 == 2) {
                            c0095a.f2213b = i6 - 1;
                            c0095a.f2214c = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c0095a.f2214c = i7 + 1;
                    } else if (i2 == 2) {
                        c0095a.f2214c = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c0095a.f2213b = i6 + 1;
                    } else if (i2 == 2) {
                        c0095a.f2213b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c0095a.f2213b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c0095a.f2214c;
                    } else if (i5 == 2) {
                        i += c0095a.f2214c;
                    }
                } else if (i2 == 1) {
                    c0095a.f2213b = i8 + 1;
                } else if (i2 == 2) {
                    c0095a.f2213b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0095a c0095a2 = (C0095a) arrayList.get(size2);
            int i9 = c0095a2.f2212a;
            J.b bVar = (J.b) this.f220b;
            if (i9 == 8) {
                int i10 = c0095a2.f2214c;
                if (i10 == c0095a2.f2213b || i10 < 0) {
                    arrayList.remove(size2);
                    bVar.c(c0095a2);
                }
            } else if (c0095a2.f2214c <= 0) {
                arrayList.remove(size2);
                bVar.c(c0095a2);
            }
        }
        return i;
    }

    public String toString() {
        switch (this.f219a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f220b) + ", mProviderPackage: " + ((String) this.f221c) + ", mQuery: " + ((String) this.d) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.f223f;
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

    public e(C0118y c0118y) {
        this.f219a = 1;
        this.f220b = new J.b(30);
        this.f221c = new ArrayList();
        this.d = new ArrayList();
        this.f222e = c0118y;
        this.f223f = new A0.h(22, this);
    }
}
