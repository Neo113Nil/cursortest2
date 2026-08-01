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
public abstract class a0 {

    /* renamed from: t, reason: collision with root package name */
    public static final List f2454t = Collections.emptyList();

    /* renamed from: a, reason: collision with root package name */
    public final View f2455a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f2456b;

    /* renamed from: j, reason: collision with root package name */
    public int f2462j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f2470r;

    /* renamed from: s, reason: collision with root package name */
    public AbstractC0114B f2471s;

    /* renamed from: c, reason: collision with root package name */
    public int f2457c = -1;
    public int d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f2458e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f2459f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f2460g = -1;

    /* renamed from: h, reason: collision with root package name */
    public a0 f2461h = null;
    public a0 i = null;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f2463k = null;

    /* renamed from: l, reason: collision with root package name */
    public final List f2464l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f2465m = 0;

    /* renamed from: n, reason: collision with root package name */
    public P f2466n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2467o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f2468p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f2469q = -1;

    public a0(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f2455a = view;
    }

    public final void a(int i) {
        this.f2462j = i | this.f2462j;
    }

    public final int b() {
        int i = this.f2460g;
        return i == -1 ? this.f2457c : i;
    }

    public final List c() {
        ArrayList arrayList;
        return ((this.f2462j & 1024) != 0 || (arrayList = this.f2463k) == null || arrayList.size() == 0) ? f2454t : this.f2464l;
    }

    public final boolean d(int i) {
        return (i & this.f2462j) != 0;
    }

    public final boolean e() {
        View view = this.f2455a;
        return (view.getParent() == null || view.getParent() == this.f2470r) ? false : true;
    }

    public final boolean f() {
        return (this.f2462j & 1) != 0;
    }

    public final boolean g() {
        return (this.f2462j & 4) != 0;
    }

    public final boolean h() {
        if ((this.f2462j & 16) == 0) {
            WeakHashMap weakHashMap = L.T.f490a;
            if (!this.f2455a.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        return (this.f2462j & 8) != 0;
    }

    public final boolean j() {
        return this.f2466n != null;
    }

    public final boolean k() {
        return (this.f2462j & 256) != 0;
    }

    public final boolean l() {
        return (this.f2462j & 2) != 0;
    }

    public final void m(int i, boolean z2) {
        if (this.d == -1) {
            this.d = this.f2457c;
        }
        if (this.f2460g == -1) {
            this.f2460g = this.f2457c;
        }
        if (z2) {
            this.f2460g += i;
        }
        this.f2457c += i;
        View view = this.f2455a;
        if (view.getLayoutParams() != null) {
            ((K) view.getLayoutParams()).f2411c = true;
        }
    }

    public final void n() {
        if (RecyclerView.f1626x0 && k()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.f2462j = 0;
        this.f2457c = -1;
        this.d = -1;
        this.f2458e = -1L;
        this.f2460g = -1;
        this.f2465m = 0;
        this.f2461h = null;
        this.i = null;
        ArrayList arrayList = this.f2463k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f2462j &= -1025;
        this.f2468p = 0;
        this.f2469q = -1;
        RecyclerView.l(this);
    }

    public final void o(boolean z2) {
        int i = this.f2465m;
        int i2 = z2 ? i - 1 : i + 1;
        this.f2465m = i2;
        if (i2 < 0) {
            this.f2465m = 0;
            if (RecyclerView.f1626x0) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z2 && i2 == 1) {
            this.f2462j |= 16;
        } else if (z2 && i2 == 0) {
            this.f2462j &= -17;
        }
        if (RecyclerView.f1627y0) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z2 + ":" + this);
        }
    }

    public final boolean p() {
        return (this.f2462j & 128) != 0;
    }

    public final boolean q() {
        return (this.f2462j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f2457c + " id=" + this.f2458e + ", oldPos=" + this.d + ", pLpos:" + this.f2460g);
        if (j()) {
            sb.append(" scrap ");
            sb.append(this.f2467o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (g()) {
            sb.append(" invalid");
        }
        if (!f()) {
            sb.append(" unbound");
        }
        if ((this.f2462j & 2) != 0) {
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
            sb.append(" not recyclable(" + this.f2465m + ")");
        }
        if ((this.f2462j & 512) != 0 || g()) {
            sb.append(" undefined adapter position");
        }
        if (this.f2455a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
