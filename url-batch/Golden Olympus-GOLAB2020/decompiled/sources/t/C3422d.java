package t;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import s.C3403c;
import s.i;

/* renamed from: t.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3422d {

    /* renamed from: b, reason: collision with root package name */
    public final C3423e f46066b;

    /* renamed from: c, reason: collision with root package name */
    public final b f46067c;

    /* renamed from: d, reason: collision with root package name */
    public C3422d f46068d;

    /* renamed from: g, reason: collision with root package name */
    s.i f46071g;

    /* renamed from: a, reason: collision with root package name */
    private HashSet f46065a = null;

    /* renamed from: e, reason: collision with root package name */
    public int f46069e = 0;

    /* renamed from: f, reason: collision with root package name */
    int f46070f = -1;

    /* renamed from: t.d$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f46072a;

        static {
            int[] iArr = new int[b.values().length];
            f46072a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46072a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46072a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46072a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46072a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46072a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46072a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f46072a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f46072a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: t.d$b */
    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C3422d(C3423e c3423e, b bVar) {
        this.f46066b = c3423e;
        this.f46067c = bVar;
    }

    public boolean a(C3422d c3422d, int i4, int i5, boolean z4) {
        if (c3422d == null) {
            k();
            return true;
        }
        if (!z4 && !j(c3422d)) {
            return false;
        }
        this.f46068d = c3422d;
        if (c3422d.f46065a == null) {
            c3422d.f46065a = new HashSet();
        }
        this.f46068d.f46065a.add(this);
        if (i4 > 0) {
            this.f46069e = i4;
        } else {
            this.f46069e = 0;
        }
        this.f46070f = i5;
        return true;
    }

    public int b() {
        C3422d c3422d;
        if (this.f46066b.M() == 8) {
            return 0;
        }
        return (this.f46070f <= -1 || (c3422d = this.f46068d) == null || c3422d.f46066b.M() != 8) ? this.f46069e : this.f46070f;
    }

    public final C3422d c() {
        switch (a.f46072a[this.f46067c.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f46066b.f46087D;
            case 3:
                return this.f46066b.f46085B;
            case 4:
                return this.f46066b.f46088E;
            case 5:
                return this.f46066b.f46086C;
            default:
                throw new AssertionError(this.f46067c.name());
        }
    }

    public C3423e d() {
        return this.f46066b;
    }

    public s.i e() {
        return this.f46071g;
    }

    public C3422d f() {
        return this.f46068d;
    }

    public b g() {
        return this.f46067c;
    }

    public boolean h() {
        HashSet hashSet = this.f46065a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C3422d) it.next()).c().i()) {
                return true;
            }
        }
        return false;
    }

    public boolean i() {
        return this.f46068d != null;
    }

    public boolean j(C3422d c3422d) {
        if (c3422d == null) {
            return false;
        }
        b g4 = c3422d.g();
        b bVar = this.f46067c;
        if (g4 == bVar) {
            return bVar != b.BASELINE || (c3422d.d().Q() && d().Q());
        }
        switch (a.f46072a[bVar.ordinal()]) {
            case 1:
                return (g4 == b.BASELINE || g4 == b.CENTER_X || g4 == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z4 = g4 == b.LEFT || g4 == b.RIGHT;
                return c3422d.d() instanceof g ? z4 || g4 == b.CENTER_X : z4;
            case 4:
            case 5:
                boolean z5 = g4 == b.TOP || g4 == b.BOTTOM;
                return c3422d.d() instanceof g ? z5 || g4 == b.CENTER_Y : z5;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f46067c.name());
        }
    }

    public void k() {
        HashSet hashSet;
        C3422d c3422d = this.f46068d;
        if (c3422d != null && (hashSet = c3422d.f46065a) != null) {
            hashSet.remove(this);
        }
        this.f46068d = null;
        this.f46069e = 0;
        this.f46070f = -1;
    }

    public void l(C3403c c3403c) {
        s.i iVar = this.f46071g;
        if (iVar == null) {
            this.f46071g = new s.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.d();
        }
    }

    public String toString() {
        return this.f46066b.p() + StringUtils.PROCESS_POSTFIX_DELIMITER + this.f46067c.toString();
    }
}
