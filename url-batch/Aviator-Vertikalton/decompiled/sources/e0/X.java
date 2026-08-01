package e0;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: s, reason: collision with root package name */
    public static final List f2167s = Collections.emptyList();

    /* renamed from: a, reason: collision with root package name */
    public final View f2168a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f2169b;

    /* renamed from: j, reason: collision with root package name */
    public int f2175j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f2183r;

    /* renamed from: c, reason: collision with root package name */
    public int f2170c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f2171d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f2172e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f2173f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f2174g = -1;
    public X h = null;
    public X i = null;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f2176k = null;

    /* renamed from: l, reason: collision with root package name */
    public final List f2177l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f2178m = 0;

    /* renamed from: n, reason: collision with root package name */
    public O f2179n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2180o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f2181p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f2182q = -1;

    public X(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f2168a = view;
    }

    public final void a(int i) {
        this.f2175j = i | this.f2175j;
    }

    public final int b() {
        int i = this.f2174g;
        return i == -1 ? this.f2170c : i;
    }

    public final List c() {
        ArrayList arrayList;
        return ((this.f2175j & 1024) != 0 || (arrayList = this.f2176k) == null || arrayList.size() == 0) ? f2167s : this.f2177l;
    }

    public final boolean d(int i) {
        return (i & this.f2175j) != 0;
    }

    public final boolean e() {
        View view = this.f2168a;
        return (view.getParent() == null || view.getParent() == this.f2183r) ? false : true;
    }

    public final boolean f() {
        return (this.f2175j & 1) != 0;
    }

    public final boolean g() {
        return (this.f2175j & 4) != 0;
    }

    public final boolean h() {
        if ((this.f2175j & 16) == 0) {
            WeakHashMap weakHashMap = K.X.f418a;
            if (!this.f2168a.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        return (this.f2175j & 8) != 0;
    }

    public final boolean j() {
        return this.f2179n != null;
    }

    public final boolean k() {
        return (this.f2175j & 256) != 0;
    }

    public final boolean l() {
        return (this.f2175j & 2) != 0;
    }

    public final void m(int i, boolean z2) {
        if (this.f2171d == -1) {
            this.f2171d = this.f2170c;
        }
        if (this.f2174g == -1) {
            this.f2174g = this.f2170c;
        }
        if (z2) {
            this.f2174g += i;
        }
        this.f2170c += i;
        View view = this.f2168a;
        if (view.getLayoutParams() != null) {
            ((J) view.getLayoutParams()).f2125c = true;
        }
    }

    public final void n() {
        this.f2175j = 0;
        this.f2170c = -1;
        this.f2171d = -1;
        this.f2172e = -1L;
        this.f2174g = -1;
        this.f2178m = 0;
        this.h = null;
        this.i = null;
        ArrayList arrayList = this.f2176k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f2175j &= -1025;
        this.f2181p = 0;
        this.f2182q = -1;
        RecyclerView.j(this);
    }

    public final void o(boolean z2) {
        int i = this.f2178m;
        int i2 = z2 ? i - 1 : i + 1;
        this.f2178m = i2;
        if (i2 < 0) {
            this.f2178m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z2 && i2 == 1) {
            this.f2175j |= 16;
        } else if (z2 && i2 == 0) {
            this.f2175j &= -17;
        }
    }

    public final boolean p() {
        return (this.f2175j & 128) != 0;
    }

    public final boolean q() {
        return (this.f2175j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f2170c + " id=" + this.f2172e + ", oldPos=" + this.f2171d + ", pLpos:" + this.f2174g);
        if (j()) {
            sb.append(" scrap ");
            sb.append(this.f2180o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (g()) {
            sb.append(" invalid");
        }
        if (!f()) {
            sb.append(" unbound");
        }
        if ((this.f2175j & 2) != 0) {
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
            sb.append(" not recyclable(" + this.f2178m + ")");
        }
        if ((this.f2175j & 512) != 0 || g()) {
            sb.append(" undefined adapter position");
        }
        if (this.f2168a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
