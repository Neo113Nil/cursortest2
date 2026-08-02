package f1;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.io.Serializable;
import java.util.ArrayList;
import l1.C1250G;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public int f8527a;

    /* renamed from: b, reason: collision with root package name */
    public int f8528b;

    /* renamed from: c, reason: collision with root package name */
    public int f8529c;

    /* renamed from: d, reason: collision with root package name */
    public final Serializable f8530d;

    /* renamed from: e, reason: collision with root package name */
    public Object f8531e;

    public E(int i4, int i5) {
        this(Integer.MIN_VALUE, i4, i5);
    }

    public void a() {
        int i4 = this.f8529c;
        this.f8529c = i4 == Integer.MIN_VALUE ? this.f8527a : i4 + this.f8528b;
        this.f8531e = ((String) this.f8530d) + this.f8529c;
    }

    public int b(int i4) {
        int i5 = this.f8528b;
        if (i5 != Integer.MIN_VALUE) {
            return i5;
        }
        if (((ArrayList) this.f8530d).size() == 0) {
            return i4;
        }
        View view = (View) ((ArrayList) this.f8530d).get(r3.size() - 1);
        C1250G c1250g = (C1250G) view.getLayoutParams();
        this.f8528b = ((StaggeredGridLayoutManager) this.f8531e).f5190j.b(view);
        c1250g.getClass();
        return this.f8528b;
    }

    public void c() {
        if (this.f8529c == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public E(int i4, int i5, int i6) {
        String str;
        if (i4 != Integer.MIN_VALUE) {
            str = i4 + "/";
        } else {
            str = "";
        }
        this.f8530d = str;
        this.f8527a = i5;
        this.f8528b = i6;
        this.f8529c = Integer.MIN_VALUE;
        this.f8531e = "";
    }

    public E(StaggeredGridLayoutManager staggeredGridLayoutManager, int i4) {
        this.f8531e = staggeredGridLayoutManager;
        this.f8530d = new ArrayList();
        this.f8527a = Integer.MIN_VALUE;
        this.f8528b = Integer.MIN_VALUE;
        this.f8529c = i4;
    }
}
