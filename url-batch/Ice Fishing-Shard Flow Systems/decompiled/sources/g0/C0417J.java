package g0;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* renamed from: g0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0417J {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4883a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f4884b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f4885c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public final int f4886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f4887e;

    public C0417J(StaggeredGridLayoutManager staggeredGridLayoutManager, int i2) {
        this.f4887e = staggeredGridLayoutManager;
        this.f4886d = i2;
    }

    public final int a(int i2) {
        int i5 = this.f4885c;
        if (i5 != Integer.MIN_VALUE) {
            return i5;
        }
        if (this.f4883a.size() == 0) {
            return i2;
        }
        View view = (View) this.f4883a.get(r3.size() - 1);
        C0414G c0414g = (C0414G) view.getLayoutParams();
        this.f4885c = this.f4887e.j.b(view);
        c0414g.getClass();
        return this.f4885c;
    }
}
