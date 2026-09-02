package f1;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class b1 {

    /* renamed from: t, reason: collision with root package name */
    public static final List f1308t = Collections.EMPTY_LIST;

    /* renamed from: a, reason: collision with root package name */
    public final View f1309a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f1310b;

    /* renamed from: j, reason: collision with root package name */
    public int f1316j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f1324r;

    /* renamed from: s, reason: collision with root package name */
    public d0 f1325s;

    /* renamed from: c, reason: collision with root package name */
    public int f1311c = -1;
    public int d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f1312e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f1313f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f1314g = -1;

    /* renamed from: h, reason: collision with root package name */
    public b1 f1315h = null;
    public b1 i = null;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f1317k = null;

    /* renamed from: l, reason: collision with root package name */
    public List f1318l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f1319m = 0;

    /* renamed from: n, reason: collision with root package name */
    public s0 f1320n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1321o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f1322p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f1323q = -1;

    public b1(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f1309a = view;
    }

    public final void a(int i) {
        this.f1316j = i | this.f1316j;
    }

    public final int b() {
        int i = this.f1314g;
        return i == -1 ? this.f1311c : i;
    }

    public final List c() {
        ArrayList arrayList;
        return ((this.f1316j & 1024) != 0 || (arrayList = this.f1317k) == null || arrayList.size() == 0) ? f1308t : this.f1318l;
    }

    public final boolean d() {
        View view = this.f1309a;
        return (view.getParent() == null || view.getParent() == this.f1324r) ? false : true;
    }

    public final boolean e() {
        return (this.f1316j & 1) != 0;
    }

    public final boolean f() {
        return (this.f1316j & 4) != 0;
    }

    public final boolean g() {
        if ((this.f1316j & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = n0.l0.f2757a;
        return !this.f1309a.hasTransientState();
    }

    public final boolean h() {
        return (this.f1316j & 8) != 0;
    }

    public final boolean i() {
        return this.f1320n != null;
    }

    public final boolean j() {
        return (this.f1316j & 256) != 0;
    }

    public final boolean k() {
        return (this.f1316j & 2) != 0;
    }

    public final void l(int i, boolean z3) {
        if (this.d == -1) {
            this.d = this.f1311c;
        }
        if (this.f1314g == -1) {
            this.f1314g = this.f1311c;
        }
        if (z3) {
            this.f1314g += i;
        }
        this.f1311c += i;
        View view = this.f1309a;
        if (view.getLayoutParams() != null) {
            ((n0) view.getLayoutParams()).f1462c = true;
        }
    }

    public final void m() {
        this.f1316j = 0;
        this.f1311c = -1;
        this.d = -1;
        this.f1312e = -1L;
        this.f1314g = -1;
        this.f1319m = 0;
        this.f1315h = null;
        this.i = null;
        ArrayList arrayList = this.f1317k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f1316j &= -1025;
        this.f1322p = 0;
        this.f1323q = -1;
        RecyclerView.j(this);
    }

    public final void n(boolean z3) {
        int i = this.f1319m;
        int i4 = z3 ? i - 1 : i + 1;
        this.f1319m = i4;
        if (i4 < 0) {
            this.f1319m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z3 && i4 == 1) {
            this.f1316j |= 16;
        } else if (z3 && i4 == 0) {
            this.f1316j &= -17;
        }
    }

    public final boolean o() {
        return (this.f1316j & 128) != 0;
    }

    public final boolean p() {
        return (this.f1316j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f1311c + " id=" + this.f1312e + ", oldPos=" + this.d + ", pLpos:" + this.f1314g);
        if (i()) {
            sb.append(" scrap ");
            sb.append(this.f1321o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (f()) {
            sb.append(" invalid");
        }
        if (!e()) {
            sb.append(" unbound");
        }
        if ((this.f1316j & 2) != 0) {
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
            sb.append(" not recyclable(" + this.f1319m + ")");
        }
        if ((this.f1316j & 512) != 0 || f()) {
            sb.append(" undefined adapter position");
        }
        if (this.f1309a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
