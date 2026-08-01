package h0;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class V {

    /* renamed from: s, reason: collision with root package name */
    public static final List f2957s = Collections.emptyList();

    /* renamed from: a, reason: collision with root package name */
    public final View f2958a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f2959b;
    public int j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f2972r;

    /* renamed from: c, reason: collision with root package name */
    public int f2960c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f2961d = -1;
    public long e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f2962f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f2963g = -1;

    /* renamed from: h, reason: collision with root package name */
    public V f2964h = null;
    public V i = null;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f2965k = null;

    /* renamed from: l, reason: collision with root package name */
    public final List f2966l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f2967m = 0;

    /* renamed from: n, reason: collision with root package name */
    public C0147M f2968n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2969o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f2970p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f2971q = -1;

    public V(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f2958a = view;
    }

    public final void a(int i) {
        this.j = i | this.j;
    }

    public final int b() {
        int i = this.f2963g;
        return i == -1 ? this.f2960c : i;
    }

    public final List c() {
        ArrayList arrayList;
        return ((this.j & 1024) != 0 || (arrayList = this.f2965k) == null || arrayList.size() == 0) ? f2957s : this.f2966l;
    }

    public final boolean d(int i) {
        return (i & this.j) != 0;
    }

    public final boolean e() {
        View view = this.f2958a;
        return (view.getParent() == null || view.getParent() == this.f2972r) ? false : true;
    }

    public final boolean f() {
        return (this.j & 1) != 0;
    }

    public final boolean g() {
        return (this.j & 4) != 0;
    }

    public final boolean h() {
        if ((this.j & 16) == 0) {
            WeakHashMap weakHashMap = M.P.f711a;
            if (!this.f2958a.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        return (this.j & 8) != 0;
    }

    public final boolean j() {
        return this.f2968n != null;
    }

    public final boolean k() {
        return (this.j & 256) != 0;
    }

    public final boolean l() {
        return (this.j & 2) != 0;
    }

    public final void m(int i, boolean z2) {
        if (this.f2961d == -1) {
            this.f2961d = this.f2960c;
        }
        if (this.f2963g == -1) {
            this.f2963g = this.f2960c;
        }
        if (z2) {
            this.f2963g += i;
        }
        this.f2960c += i;
        View view = this.f2958a;
        if (view.getLayoutParams() != null) {
            ((C0142H) view.getLayoutParams()).f2918c = true;
        }
    }

    public final void n() {
        this.j = 0;
        this.f2960c = -1;
        this.f2961d = -1;
        this.e = -1L;
        this.f2963g = -1;
        this.f2967m = 0;
        this.f2964h = null;
        this.i = null;
        ArrayList arrayList = this.f2965k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.j &= -1025;
        this.f2970p = 0;
        this.f2971q = -1;
        RecyclerView.j(this);
    }

    public final void o(boolean z2) {
        int i = this.f2967m;
        int i2 = z2 ? i - 1 : i + 1;
        this.f2967m = i2;
        if (i2 < 0) {
            this.f2967m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z2 && i2 == 1) {
            this.j |= 16;
        } else if (z2 && i2 == 0) {
            this.j &= -17;
        }
    }

    public final boolean p() {
        return (this.j & 128) != 0;
    }

    public final boolean q() {
        return (this.j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f2960c + " id=" + this.e + ", oldPos=" + this.f2961d + ", pLpos:" + this.f2963g);
        if (j()) {
            sb.append(" scrap ");
            sb.append(this.f2969o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (g()) {
            sb.append(" invalid");
        }
        if (!f()) {
            sb.append(" unbound");
        }
        if ((this.j & 2) != 0) {
            sb.append(" update");
        }
        if (i()) {
            sb.append(" removed");
        }
        if (p()) {
            sb.append(" ignored");
        }
        if (k()) {
            sb.append(" tmpDetached");
        }
        if (!h()) {
            sb.append(" not recyclable(" + this.f2967m + ")");
        }
        if ((this.j & 512) != 0 || g()) {
            sb.append(" undefined adapter position");
        }
        if (this.f2958a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
