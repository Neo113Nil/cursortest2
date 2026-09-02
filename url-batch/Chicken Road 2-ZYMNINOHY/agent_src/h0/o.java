package h0;

import T.C0097o;
import T.O;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class o extends p {

    /* renamed from: l, reason: collision with root package name */
    public static final o f9156l;

    /* renamed from: d, reason: collision with root package name */
    public final List f9157d;

    /* renamed from: e, reason: collision with root package name */
    public final List f9158e;

    /* renamed from: f, reason: collision with root package name */
    public final List f9159f;

    /* renamed from: g, reason: collision with root package name */
    public final List f9160g;

    /* renamed from: h, reason: collision with root package name */
    public final C0097o f9161h;

    /* renamed from: i, reason: collision with root package name */
    public final List f9162i;

    /* renamed from: j, reason: collision with root package name */
    public final Map f9163j;

    /* renamed from: k, reason: collision with root package name */
    public final List f9164k;

    static {
        List list = Collections.EMPTY_LIST;
        f9156l = new o("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public o(String str, List list, List list2, List list3, List list4, List list5, List list6, C0097o c0097o, List list7, boolean z, Map map, List list8) {
        super(str, list, z);
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < list2.size(); i4++) {
            Uri uri = ((n) list2.get(i4)).f9150a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.f9157d = Collections.unmodifiableList(arrayList);
        this.f9158e = Collections.unmodifiableList(list2);
        Collections.unmodifiableList(list3);
        this.f9159f = Collections.unmodifiableList(list4);
        this.f9160g = Collections.unmodifiableList(list5);
        Collections.unmodifiableList(list6);
        this.f9161h = c0097o;
        this.f9162i = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f9163j = Collections.unmodifiableMap(map);
        this.f9164k = Collections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            Uri uri = ((m) list.get(i4)).f9147a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(List list, int i4, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i5 = 0; i5 < list.size(); i5++) {
            Object obj = list.get(i5);
            int i6 = 0;
            while (true) {
                if (i6 < list2.size()) {
                    O o = (O) list2.get(i6);
                    if (o.f2679b == i4 && o.f2680c == i5) {
                        arrayList.add(obj);
                        break;
                    }
                    i6++;
                }
            }
        }
        return arrayList;
    }

    @Override // l0.InterfaceC1243a
    public final Object a(List list) {
        ArrayList c4 = c(this.f9158e, 0, list);
        List list2 = Collections.EMPTY_LIST;
        return new o(this.f9165a, this.f9166b, c4, list2, c(this.f9159f, 1, list), c(this.f9160g, 2, list), list2, this.f9161h, this.f9162i, this.f9167c, this.f9163j, this.f9164k);
    }
}
