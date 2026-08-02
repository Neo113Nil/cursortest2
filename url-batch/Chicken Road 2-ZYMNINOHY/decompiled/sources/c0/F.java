package c0;

import E.AbstractC0005f;
import T.C0097o;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import l1.C1245B;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public int f5437a;

    /* renamed from: b, reason: collision with root package name */
    public int f5438b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5439c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5440d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5441e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f5442f;

    public F(C0097o c0097o, C0097o c0097o2, int i4, int i5, C0281n c0281n, U.j jVar) {
        this.f5439c = c0097o;
        this.f5440d = c0097o2;
        this.f5437a = i4;
        this.f5438b = i5;
        this.f5441e = c0281n;
        this.f5442f = jVar;
    }

    public static boolean a(F f4) {
        return Objects.equals(((C0097o) f4.f5439c).n, "audio/raw");
    }

    public void b(int i4) {
        RecyclerView recyclerView = (RecyclerView) this.f5442f;
        C1245B c1245b = recyclerView.f5156U;
        if (i4 < 0 || i4 >= c1245b.a()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i4 + "(" + i4 + "). Item count:" + c1245b.a() + recyclerView.h());
        }
        boolean z = c1245b.f14167c;
        ArrayList arrayList = (ArrayList) this.f5440d;
        ArrayList arrayList2 = (ArrayList) this.f5439c;
        if (arrayList2.size() > 0) {
            throw AbstractC0005f.g(0, arrayList2);
        }
        ArrayList arrayList3 = (ArrayList) recyclerView.f5165d.f203d;
        if (arrayList3.size() > 0) {
            RecyclerView.j((View) arrayList3.get(0));
            throw null;
        }
        if (arrayList.size() > 0) {
            throw AbstractC0005f.g(0, arrayList);
        }
        int k4 = recyclerView.f5163c.k(i4, 0);
        if (k4 >= 0) {
            throw null;
        }
        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i4 + "(offset:" + k4 + ").state:" + c1245b.a() + recyclerView.h());
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.f5440d;
        this.f5438b = this.f5437a;
        int size = arrayList.size() - 1;
        if (size < 0 || arrayList.size() <= this.f5438b) {
            return;
        }
        if (arrayList.get(size) != null) {
            throw new ClassCastException();
        }
        int[] iArr = RecyclerView.f5133h0;
        throw null;
    }

    public F(RecyclerView recyclerView) {
        this.f5442f = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f5439c = arrayList;
        this.f5440d = new ArrayList();
        Collections.unmodifiableList(arrayList);
        this.f5437a = 2;
        this.f5438b = 2;
    }
}
