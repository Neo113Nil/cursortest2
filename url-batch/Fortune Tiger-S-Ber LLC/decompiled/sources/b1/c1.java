package b1;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class c1 {

    /* renamed from: t, reason: collision with root package name */
    public static final List f746t = Collections.EMPTY_LIST;

    /* renamed from: a, reason: collision with root package name */
    public final View f747a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f748b;

    /* renamed from: j, reason: collision with root package name */
    public int f753j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f761r;

    /* renamed from: s, reason: collision with root package name */
    public e0 f762s;
    public int c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f749d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f750e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f751f = -1;
    public int g = -1;
    public c1 h = null;

    /* renamed from: i, reason: collision with root package name */
    public c1 f752i = null;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f754k = null;

    /* renamed from: l, reason: collision with root package name */
    public List f755l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f756m = 0;

    /* renamed from: n, reason: collision with root package name */
    public t0 f757n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f758o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f759p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f760q = -1;

    public c1(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f747a = view;
    }

    public final void a(int i4) {
        this.f753j = i4 | this.f753j;
    }

    public final int b() {
        int i4 = this.g;
        return i4 == -1 ? this.c : i4;
    }

    public final List c() {
        ArrayList arrayList;
        return ((this.f753j & 1024) != 0 || (arrayList = this.f754k) == null || arrayList.size() == 0) ? f746t : this.f755l;
    }

    public final boolean d() {
        View view = this.f747a;
        return (view.getParent() == null || view.getParent() == this.f761r) ? false : true;
    }

    public final boolean e() {
        return (this.f753j & 1) != 0;
    }

    public final boolean f() {
        return (this.f753j & 4) != 0;
    }

    public final boolean g() {
        if ((this.f753j & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = k0.j0.f2752a;
        return !this.f747a.hasTransientState();
    }

    public final boolean h() {
        return (this.f753j & 8) != 0;
    }

    public final boolean i() {
        return this.f757n != null;
    }

    public final boolean j() {
        return (this.f753j & 256) != 0;
    }

    public final boolean k() {
        return (this.f753j & 2) != 0;
    }

    public final void l(int i4, boolean z3) {
        if (this.f749d == -1) {
            this.f749d = this.c;
        }
        if (this.g == -1) {
            this.g = this.c;
        }
        if (z3) {
            this.g += i4;
        }
        this.c += i4;
        View view = this.f747a;
        if (view.getLayoutParams() != null) {
            ((o0) view.getLayoutParams()).c = true;
        }
    }

    public final void m() {
        this.f753j = 0;
        this.c = -1;
        this.f749d = -1;
        this.f750e = -1L;
        this.g = -1;
        this.f756m = 0;
        this.h = null;
        this.f752i = null;
        ArrayList arrayList = this.f754k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f753j &= -1025;
        this.f759p = 0;
        this.f760q = -1;
        RecyclerView.j(this);
    }

    public final void n(boolean z3) {
        int i4 = this.f756m;
        int i5 = z3 ? i4 - 1 : i4 + 1;
        this.f756m = i5;
        if (i5 < 0) {
            this.f756m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z3 && i5 == 1) {
            this.f753j |= 16;
        } else if (z3 && i5 == 0) {
            this.f753j &= -17;
        }
    }

    public final boolean o() {
        return (this.f753j & 128) != 0;
    }

    public final boolean p() {
        return (this.f753j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.f750e + ", oldPos=" + this.f749d + ", pLpos:" + this.g);
        if (i()) {
            sb.append(" scrap ");
            sb.append(this.f758o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (f()) {
            sb.append(" invalid");
        }
        if (!e()) {
            sb.append(" unbound");
        }
        if ((this.f753j & 2) != 0) {
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
            sb.append(" not recyclable(" + this.f756m + ")");
        }
        if ((this.f753j & 512) != 0 || f()) {
            sb.append(" undefined adapter position");
        }
        if (this.f747a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
