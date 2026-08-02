package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class acr implements acb {
    public static final acq a = new ach();
    public static final acq b = new aci();
    public static final acq c = new acj();
    public static final acq d = new ack();
    public static final acq e = new acl();
    public static final acq f = new acm();
    public static final acq g = new acn();
    public static final acq h = new acg();
    final Object l;
    final acs m;
    public float q;
    public float i = 0.0f;
    float j = Float.MAX_VALUE;
    boolean k = false;
    public boolean n = false;
    public final float o = Float.MAX_VALUE;
    public final float p = -3.4028235E38f;
    private long t = 0;
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();

    public acr(Object obj, acs acsVar) {
        this.l = obj;
        this.m = acsVar;
        float f2 = 0.1f;
        if (acsVar != e && acsVar != f && acsVar != g) {
            if (acsVar == h) {
                f2 = 0.00390625f;
            } else {
                f2 = 0.002f;
                if (acsVar != c && acsVar != d) {
                    f2 = 1.0f;
                }
            }
        }
        this.q = f2;
    }

    private static void j(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // defpackage.acb
    public final void a(long j) {
        long j2 = this.t;
        if (j2 == 0) {
            this.t = j;
            d(this.j);
            return;
        }
        long j3 = j - j2;
        this.t = j;
        float f2 = acf.a().e;
        boolean f3 = f(f2 == 0.0f ? 2147483647L : (long) (j3 / f2));
        float min = Math.min(this.j, Float.MAX_VALUE);
        this.j = min;
        float max = Math.max(min, -3.4028235E38f);
        this.j = max;
        d(max);
        if (f3) {
            c(false);
        }
    }

    public void b() {
        throw null;
    }

    public final void c(boolean z) {
        int i = 0;
        this.n = false;
        acf a2 = acf.a();
        a2.a.remove(this);
        ArrayList arrayList = a2.b;
        int indexOf = arrayList.indexOf(this);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
            a2.d = true;
        }
        this.t = 0L;
        this.k = false;
        while (true) {
            ArrayList arrayList2 = this.r;
            if (i >= arrayList2.size()) {
                j(arrayList2);
                return;
            } else {
                if (arrayList2.get(i) != null) {
                    ((acp) arrayList2.get(i)).a(this);
                }
                i++;
            }
        }
    }

    final void d(float f2) {
        this.m.b(this.l, f2);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.s;
            if (i >= arrayList.size()) {
                j(arrayList);
                return;
            } else {
                if (arrayList.get(i) != null) {
                    throw null;
                }
                i++;
            }
        }
    }

    public void e() {
        throw null;
    }

    public abstract boolean f(long j);

    public final void g(acp acpVar) {
        ArrayList arrayList = this.r;
        if (arrayList.contains(acpVar)) {
            return;
        }
        arrayList.add(acpVar);
    }

    public final void h(float f2) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.q = f2;
    }

    public final void i(float f2) {
        this.j = f2;
        this.k = true;
    }
}
