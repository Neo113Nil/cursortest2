package g1;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class q1 {

    /* renamed from: t, reason: collision with root package name */
    public static final List f1767t = Collections.EMPTY_LIST;

    /* renamed from: a, reason: collision with root package name */
    public final View f1768a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f1769b;

    /* renamed from: j, reason: collision with root package name */
    public int f1774j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f1782r;

    /* renamed from: s, reason: collision with root package name */
    public q0 f1783s;

    /* renamed from: c, reason: collision with root package name */
    public int f1770c = -1;
    public int d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f1771e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f1772f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f1773g = -1;
    public q1 h = null;
    public q1 i = null;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f1775k = null;

    /* renamed from: l, reason: collision with root package name */
    public List f1776l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f1777m = 0;

    /* renamed from: n, reason: collision with root package name */
    public g1 f1778n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1779o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f1780p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f1781q = -1;

    public q1(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f1768a = view;
    }

    public final void a(int i) {
        this.f1774j = i | this.f1774j;
    }

    public final int b() {
        int i = this.f1773g;
        return i == -1 ? this.f1770c : i;
    }

    public final List c() {
        ArrayList arrayList;
        return ((this.f1774j & 1024) != 0 || (arrayList = this.f1775k) == null || arrayList.size() == 0) ? f1767t : this.f1776l;
    }

    public final boolean d() {
        View view = this.f1768a;
        return (view.getParent() == null || view.getParent() == this.f1782r) ? false : true;
    }

    public final boolean e() {
        return (this.f1774j & 1) != 0;
    }

    public final boolean f() {
        return (this.f1774j & 4) != 0;
    }

    public final boolean g() {
        if ((this.f1774j & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = n0.p0.f2816a;
        return !this.f1768a.hasTransientState();
    }

    public final boolean h() {
        return (this.f1774j & 8) != 0;
    }

    public final boolean i() {
        return this.f1778n != null;
    }

    public final boolean j() {
        return (this.f1774j & 256) != 0;
    }

    public final boolean k() {
        return (this.f1774j & 2) != 0;
    }

    public final void l(int i, boolean z4) {
        if (this.d == -1) {
            this.d = this.f1770c;
        }
        if (this.f1773g == -1) {
            this.f1773g = this.f1770c;
        }
        if (z4) {
            this.f1773g += i;
        }
        this.f1770c += i;
        View view = this.f1768a;
        if (view.getLayoutParams() != null) {
            ((b1) view.getLayoutParams()).f1619c = true;
        }
    }

    public final void m() {
        if (RecyclerView.G0 && j()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.f1774j = 0;
        this.f1770c = -1;
        this.d = -1;
        this.f1771e = -1L;
        this.f1773g = -1;
        this.f1777m = 0;
        this.h = null;
        this.i = null;
        ArrayList arrayList = this.f1775k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f1774j &= -1025;
        this.f1780p = 0;
        this.f1781q = -1;
        RecyclerView.l(this);
    }

    public final void n(boolean z4) {
        int i = this.f1777m;
        int i4 = z4 ? i - 1 : i + 1;
        this.f1777m = i4;
        if (i4 < 0) {
            this.f1777m = 0;
            if (RecyclerView.G0) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z4 && i4 == 1) {
            this.f1774j |= 16;
        } else if (z4 && i4 == 0) {
            this.f1774j &= -17;
        }
        if (RecyclerView.H0) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z4 + ":" + this);
        }
    }

    public final boolean o() {
        return (this.f1774j & 128) != 0;
    }

    public final boolean p() {
        return (this.f1774j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f1770c + " id=" + this.f1771e + ", oldPos=" + this.d + ", pLpos:" + this.f1773g);
        if (i()) {
            sb.append(" scrap ");
            sb.append(this.f1779o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (f()) {
            sb.append(" invalid");
        }
        if (!e()) {
            sb.append(" unbound");
        }
        if ((this.f1774j & 2) != 0) {
            sb.append(" update");
        }
        if (h()) {
            sb.append(" removed");
        }
        if (o()) {
            sb.append(" ignored");
        }
        if (j()) {
            sb.append(" tmpDetached");
        }
        if (!g()) {
            sb.append(" not recyclable(" + this.f1777m + ")");
        }
        if ((this.f1774j & 512) != 0 || f()) {
            sb.append(" undefined adapter position");
        }
        if (this.f1768a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
