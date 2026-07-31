package N;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f650a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f651b;

    /* renamed from: c, reason: collision with root package name */
    public int f652c;

    /* renamed from: d, reason: collision with root package name */
    public int f653d;

    /* renamed from: e, reason: collision with root package name */
    public B f654e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f655f;

    public C(RecyclerView recyclerView) {
        this.f655f = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f650a = arrayList;
        this.f651b = new ArrayList();
        Collections.unmodifiableList(arrayList);
        this.f652c = 2;
        this.f653d = 2;
    }

    public final void a(int i2) {
        RecyclerView recyclerView = this.f655f;
        F f2 = recyclerView.b0;
        if (i2 < 0 || i2 >= f2.a()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i2 + "(" + i2 + "). Item count:" + f2.a() + recyclerView.h());
        }
        boolean z2 = f2.f659c;
        ArrayList arrayList = this.f650a;
        if (arrayList.size() > 0) {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
        ArrayList arrayList2 = (ArrayList) recyclerView.f1689h.f86h;
        if (arrayList2.size() > 0) {
            RecyclerView.j((View) arrayList2.get(0));
            throw null;
        }
        ArrayList arrayList3 = this.f651b;
        if (arrayList3.size() > 0) {
            arrayList3.get(0).getClass();
            throw new ClassCastException();
        }
        int t = recyclerView.f1687g.t(i2, 0);
        if (t >= 0) {
            throw null;
        }
        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i2 + "(offset:" + t + ").state:" + f2.a() + recyclerView.h());
    }

    public final void b() {
        this.f653d = this.f652c;
        ArrayList arrayList = this.f651b;
        int size = arrayList.size() - 1;
        if (size < 0 || arrayList.size() <= this.f653d) {
            return;
        }
        if (arrayList.get(size) != null) {
            throw new ClassCastException();
        }
        int[] iArr = RecyclerView.f1655l0;
        throw null;
    }
}
