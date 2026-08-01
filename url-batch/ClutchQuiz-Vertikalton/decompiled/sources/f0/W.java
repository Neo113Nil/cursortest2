package f0;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class W {

    /* renamed from: s, reason: collision with root package name */
    public static final List f2192s = Collections.emptyList();

    /* renamed from: a, reason: collision with root package name */
    public final View f2193a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f2194b;

    /* renamed from: j, reason: collision with root package name */
    public int f2199j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f2207r;

    /* renamed from: c, reason: collision with root package name */
    public int f2195c = -1;
    public int d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f2196e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f2197f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f2198g = -1;
    public W h = null;
    public W i = null;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f2200k = null;

    /* renamed from: l, reason: collision with root package name */
    public final List f2201l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f2202m = 0;

    /* renamed from: n, reason: collision with root package name */
    public N f2203n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2204o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f2205p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f2206q = -1;

    public W(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f2193a = view;
    }

    public final void a(int i) {
        this.f2199j = i | this.f2199j;
    }

    public final int b() {
        int i = this.f2198g;
        return i == -1 ? this.f2195c : i;
    }

    public final List c() {
        ArrayList arrayList;
        return ((this.f2199j & 1024) != 0 || (arrayList = this.f2200k) == null || arrayList.size() == 0) ? f2192s : this.f2201l;
    }

    public final boolean d(int i) {
        return (i & this.f2199j) != 0;
    }

    public final boolean e() {
        View view = this.f2193a;
        return (view.getParent() == null || view.getParent() == this.f2207r) ? false : true;
    }

    public final boolean f() {
        return (this.f2199j & 1) != 0;
    }

    public final boolean g() {
        return (this.f2199j & 4) != 0;
    }

    public final boolean h() {
        if ((this.f2199j & 16) == 0) {
            WeakHashMap weakHashMap = K.S.f365a;
            if (!this.f2193a.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        return (this.f2199j & 8) != 0;
    }

    public final boolean j() {
        return this.f2203n != null;
    }

    public final boolean k() {
        return (this.f2199j & 256) != 0;
    }

    public final boolean l() {
        return (this.f2199j & 2) != 0;
    }

    public final void m(int i, boolean z2) {
        if (this.d == -1) {
            this.d = this.f2195c;
        }
        if (this.f2198g == -1) {
            this.f2198g = this.f2195c;
        }
        if (z2) {
            this.f2198g += i;
        }
        this.f2195c += i;
        View view = this.f2193a;
        if (view.getLayoutParams() != null) {
            ((I) view.getLayoutParams()).f2156c = true;
        }
    }

    public final void n() {
        this.f2199j = 0;
        this.f2195c = -1;
        this.d = -1;
        this.f2196e = -1L;
        this.f2198g = -1;
        this.f2202m = 0;
        this.h = null;
        this.i = null;
        ArrayList arrayList = this.f2200k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f2199j &= -1025;
        this.f2205p = 0;
        this.f2206q = -1;
        RecyclerView.j(this);
    }

    public final void o(boolean z2) {
        int i = this.f2202m;
        int i2 = z2 ? i - 1 : i + 1;
        this.f2202m = i2;
        if (i2 < 0) {
            this.f2202m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z2 && i2 == 1) {
            this.f2199j |= 16;
        } else if (z2 && i2 == 0) {
            this.f2199j &= -17;
        }
    }

    public final boolean p() {
        return (this.f2199j & 128) != 0;
    }

    public final boolean q() {
        return (this.f2199j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f2195c + " id=" + this.f2196e + ", oldPos=" + this.d + ", pLpos:" + this.f2198g);
        if (j()) {
            sb.append(" scrap ");
            sb.append(this.f2204o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (g()) {
            sb.append(" invalid");
        }
        if (!f()) {
            sb.append(" unbound");
        }
        if ((this.f2199j & 2) != 0) {
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
            sb.append(" not recyclable(" + this.f2202m + ")");
        }
        if ((this.f2199j & 512) != 0 || g()) {
            sb.append(" undefined adapter position");
        }
        if (this.f2193a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
