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
public abstract class c0 {

    /* renamed from: t, reason: collision with root package name */
    public static final List f2338t = Collections.emptyList();

    /* renamed from: a, reason: collision with root package name */
    public final View f2339a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f2340b;

    /* renamed from: j, reason: collision with root package name */
    public int f2345j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f2353r;

    /* renamed from: s, reason: collision with root package name */
    public AbstractC0112D f2354s;

    /* renamed from: c, reason: collision with root package name */
    public int f2341c = -1;
    public int d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f2342e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f2343f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f2344g = -1;
    public c0 h = null;
    public c0 i = null;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f2346k = null;

    /* renamed from: l, reason: collision with root package name */
    public List f2347l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f2348m = 0;

    /* renamed from: n, reason: collision with root package name */
    public S f2349n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2350o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f2351p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f2352q = -1;

    public c0(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f2339a = view;
    }

    public final void a(int i) {
        this.f2345j = i | this.f2345j;
    }

    public final int b() {
        RecyclerView recyclerView;
        AbstractC0112D adapter;
        int I2;
        if (this.f2354s == null || (recyclerView = this.f2353r) == null || (adapter = recyclerView.getAdapter()) == null || (I2 = this.f2353r.I(this)) == -1 || this.f2354s != adapter) {
            return -1;
        }
        return I2;
    }

    public final int c() {
        int i = this.f2344g;
        return i == -1 ? this.f2341c : i;
    }

    public final List d() {
        ArrayList arrayList;
        return ((this.f2345j & 1024) != 0 || (arrayList = this.f2346k) == null || arrayList.size() == 0) ? f2338t : this.f2347l;
    }

    public final boolean e(int i) {
        return (i & this.f2345j) != 0;
    }

    public final boolean f() {
        View view = this.f2339a;
        return (view.getParent() == null || view.getParent() == this.f2353r) ? false : true;
    }

    public final boolean g() {
        return (this.f2345j & 1) != 0;
    }

    public final boolean h() {
        return (this.f2345j & 4) != 0;
    }

    public final boolean i() {
        if ((this.f2345j & 16) == 0) {
            WeakHashMap weakHashMap = K.T.f423a;
            if (!this.f2339a.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        return (this.f2345j & 8) != 0;
    }

    public final boolean k() {
        return this.f2349n != null;
    }

    public final boolean l() {
        return (this.f2345j & 256) != 0;
    }

    public final boolean m() {
        return (this.f2345j & 2) != 0;
    }

    public final void n(int i, boolean z2) {
        if (this.d == -1) {
            this.d = this.f2341c;
        }
        if (this.f2344g == -1) {
            this.f2344g = this.f2341c;
        }
        if (z2) {
            this.f2344g += i;
        }
        this.f2341c += i;
        View view = this.f2339a;
        if (view.getLayoutParams() != null) {
            ((M) view.getLayoutParams()).f2289c = true;
        }
    }

    public final void o() {
        if (RecyclerView.z0 && l()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.f2345j = 0;
        this.f2341c = -1;
        this.d = -1;
        this.f2342e = -1L;
        this.f2344g = -1;
        this.f2348m = 0;
        this.h = null;
        this.i = null;
        ArrayList arrayList = this.f2346k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f2345j &= -1025;
        this.f2351p = 0;
        this.f2352q = -1;
        RecyclerView.l(this);
    }

    public final void p(boolean z2) {
        int i = this.f2348m;
        int i2 = z2 ? i - 1 : i + 1;
        this.f2348m = i2;
        if (i2 < 0) {
            this.f2348m = 0;
            if (RecyclerView.z0) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z2 && i2 == 1) {
            this.f2345j |= 16;
        } else if (z2 && i2 == 0) {
            this.f2345j &= -17;
        }
        if (RecyclerView.f1528A0) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z2 + ":" + this);
        }
    }

    public final boolean q() {
        return (this.f2345j & 128) != 0;
    }

    public final boolean r() {
        return (this.f2345j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f2341c + " id=" + this.f2342e + ", oldPos=" + this.d + ", pLpos:" + this.f2344g);
        if (k()) {
            sb.append(" scrap ");
            sb.append(this.f2350o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (h()) {
            sb.append(" invalid");
        }
        if (!g()) {
            sb.append(" unbound");
        }
        if ((this.f2345j & 2) != 0) {
            sb.append(" update");
        }
        if (j()) {
            sb.append(" removed");
        }
        if (q()) {
            sb.append(" ignored");
        }
        if (l()) {
            sb.append(" tmpDetached");
        }
        if (!i()) {
            sb.append(" not recyclable(" + this.f2348m + ")");
        }
        if ((this.f2345j & 512) != 0 || h()) {
            sb.append(" undefined adapter position");
        }
        if (this.f2339a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
