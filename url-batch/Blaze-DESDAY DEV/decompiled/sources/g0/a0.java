package g0;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: t, reason: collision with root package name */
    public static final List f2365t = Collections.emptyList();

    /* renamed from: a, reason: collision with root package name */
    public final View f2366a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f2367b;

    /* renamed from: j, reason: collision with root package name */
    public int f2372j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f2380r;

    /* renamed from: s, reason: collision with root package name */
    public AbstractC0112B f2381s;

    /* renamed from: c, reason: collision with root package name */
    public int f2368c = -1;
    public int d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f2369e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f2370f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f2371g = -1;
    public a0 h = null;
    public a0 i = null;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f2373k = null;

    /* renamed from: l, reason: collision with root package name */
    public final List f2374l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f2375m = 0;

    /* renamed from: n, reason: collision with root package name */
    public P f2376n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2377o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f2378p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f2379q = -1;

    public a0(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f2366a = view;
    }

    public final void a(int i) {
        this.f2372j = i | this.f2372j;
    }

    public final int b() {
        int i = this.f2371g;
        return i == -1 ? this.f2368c : i;
    }

    public final List c() {
        ArrayList arrayList;
        return ((this.f2372j & 1024) != 0 || (arrayList = this.f2373k) == null || arrayList.size() == 0) ? f2365t : this.f2374l;
    }

    public final boolean d(int i) {
        return (i & this.f2372j) != 0;
    }

    public final boolean e() {
        View view = this.f2366a;
        return (view.getParent() == null || view.getParent() == this.f2380r) ? false : true;
    }

    public final boolean f() {
        return (this.f2372j & 1) != 0;
    }

    public final boolean g() {
        return (this.f2372j & 4) != 0;
    }

    public final boolean h() {
        if ((this.f2372j & 16) == 0) {
            WeakHashMap weakHashMap = K.T.f440a;
            if (!this.f2366a.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        return (this.f2372j & 8) != 0;
    }

    public final boolean j() {
        return this.f2376n != null;
    }

    public final boolean k() {
        return (this.f2372j & 256) != 0;
    }

    public final boolean l() {
        return (this.f2372j & 2) != 0;
    }

    public final void m(int i, boolean z2) {
        if (this.d == -1) {
            this.d = this.f2368c;
        }
        if (this.f2371g == -1) {
            this.f2371g = this.f2368c;
        }
        if (z2) {
            this.f2371g += i;
        }
        this.f2368c += i;
        View view = this.f2366a;
        if (view.getLayoutParams() != null) {
            ((K) view.getLayoutParams()).f2324c = true;
        }
    }

    public final void n() {
        if (RecyclerView.f1564x0 && k()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.f2372j = 0;
        this.f2368c = -1;
        this.d = -1;
        this.f2369e = -1L;
        this.f2371g = -1;
        this.f2375m = 0;
        this.h = null;
        this.i = null;
        ArrayList arrayList = this.f2373k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f2372j &= -1025;
        this.f2378p = 0;
        this.f2379q = -1;
        RecyclerView.l(this);
    }

    public final void o(boolean z2) {
        int i = this.f2375m;
        int i2 = z2 ? i - 1 : i + 1;
        this.f2375m = i2;
        if (i2 < 0) {
            this.f2375m = 0;
            if (RecyclerView.f1564x0) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z2 && i2 == 1) {
            this.f2372j |= 16;
        } else if (z2 && i2 == 0) {
            this.f2372j &= -17;
        }
        if (RecyclerView.f1565y0) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z2 + ":" + this);
        }
    }

    public final boolean p() {
        return (this.f2372j & 128) != 0;
    }

    public final boolean q() {
        return (this.f2372j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f2368c + " id=" + this.f2369e + ", oldPos=" + this.d + ", pLpos:" + this.f2371g);
        if (j()) {
            sb.append(" scrap ");
            sb.append(this.f2377o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (g()) {
            sb.append(" invalid");
        }
        if (!f()) {
            sb.append(" unbound");
        }
        if ((this.f2372j & 2) != 0) {
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
            sb.append(" not recyclable(" + this.f2375m + ")");
        }
        if ((this.f2372j & 512) != 0 || g()) {
            sb.append(" undefined adapter position");
        }
        if (this.f2366a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
