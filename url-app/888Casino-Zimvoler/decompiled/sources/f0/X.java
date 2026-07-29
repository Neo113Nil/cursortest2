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
public abstract class X {

    /* renamed from: s, reason: collision with root package name */
    public static final List f2006s = Collections.emptyList();

    /* renamed from: a, reason: collision with root package name */
    public final View f2007a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f2008b;

    /* renamed from: j, reason: collision with root package name */
    public int f2013j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f2021r;

    /* renamed from: c, reason: collision with root package name */
    public int f2009c = -1;
    public int d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f2010e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f2011f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f2012g = -1;
    public X h = null;
    public X i = null;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f2014k = null;

    /* renamed from: l, reason: collision with root package name */
    public final List f2015l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f2016m = 0;

    /* renamed from: n, reason: collision with root package name */
    public O f2017n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2018o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f2019p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f2020q = -1;

    public X(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f2007a = view;
    }

    public final void a(int i) {
        this.f2013j = i | this.f2013j;
    }

    public final int b() {
        int i = this.f2012g;
        return i == -1 ? this.f2009c : i;
    }

    public final List c() {
        ArrayList arrayList;
        return ((this.f2013j & 1024) != 0 || (arrayList = this.f2014k) == null || arrayList.size() == 0) ? f2006s : this.f2015l;
    }

    public final boolean d(int i) {
        return (i & this.f2013j) != 0;
    }

    public final boolean e() {
        View view = this.f2007a;
        return (view.getParent() == null || view.getParent() == this.f2021r) ? false : true;
    }

    public final boolean f() {
        return (this.f2013j & 1) != 0;
    }

    public final boolean g() {
        return (this.f2013j & 4) != 0;
    }

    public final boolean h() {
        if ((this.f2013j & 16) == 0) {
            WeakHashMap weakHashMap = K.T.f381a;
            if (!this.f2007a.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        return (this.f2013j & 8) != 0;
    }

    public final boolean j() {
        return this.f2017n != null;
    }

    public final boolean k() {
        return (this.f2013j & 256) != 0;
    }

    public final boolean l() {
        return (this.f2013j & 2) != 0;
    }

    public final void m(int i, boolean z2) {
        if (this.d == -1) {
            this.d = this.f2009c;
        }
        if (this.f2012g == -1) {
            this.f2012g = this.f2009c;
        }
        if (z2) {
            this.f2012g += i;
        }
        this.f2009c += i;
        View view = this.f2007a;
        if (view.getLayoutParams() != null) {
            ((J) view.getLayoutParams()).f1970c = true;
        }
    }

    public final void n() {
        this.f2013j = 0;
        this.f2009c = -1;
        this.d = -1;
        this.f2010e = -1L;
        this.f2012g = -1;
        this.f2016m = 0;
        this.h = null;
        this.i = null;
        ArrayList arrayList = this.f2014k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f2013j &= -1025;
        this.f2019p = 0;
        this.f2020q = -1;
        RecyclerView.j(this);
    }

    public final void o(boolean z2) {
        int i = this.f2016m;
        int i2 = z2 ? i - 1 : i + 1;
        this.f2016m = i2;
        if (i2 < 0) {
            this.f2016m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z2 && i2 == 1) {
            this.f2013j |= 16;
        } else if (z2 && i2 == 0) {
            this.f2013j &= -17;
        }
    }

    public final boolean p() {
        return (this.f2013j & 128) != 0;
    }

    public final boolean q() {
        return (this.f2013j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f2009c + " id=" + this.f2010e + ", oldPos=" + this.d + ", pLpos:" + this.f2012g);
        if (j()) {
            sb.append(" scrap ");
            sb.append(this.f2018o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (g()) {
            sb.append(" invalid");
        }
        if (!f()) {
            sb.append(" unbound");
        }
        if ((this.f2013j & 2) != 0) {
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
            sb.append(" not recyclable(" + this.f2016m + ")");
        }
        if ((this.f2013j & 512) != 0 || g()) {
            sb.append(" undefined adapter position");
        }
        if (this.f2007a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
