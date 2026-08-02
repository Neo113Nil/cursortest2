package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class sy implements so {
    public int c;
    public sd d;
    protected int j;
    boe l;
    public final sr e = new sr(this);
    public int f = 0;
    public boolean g = false;
    public final sq h = new sq(this);
    public final sq i = new sq(this);
    protected int k = 1;

    public sy(sd sdVar) {
        this.d = sdVar;
    }

    protected static final void j(sq sqVar, sq sqVar2, int i) {
        sqVar.k.add(sqVar2);
        sqVar.e = i;
        sqVar2.j.add(sqVar);
    }

    protected static final sq k(sc scVar) {
        sc scVar2 = scVar.e;
        if (scVar2 == null) {
            return null;
        }
        int i = scVar2.i;
        sd sdVar = scVar2.d;
        int i2 = i - 1;
        if (i2 == 1) {
            return sdVar.h.h;
        }
        if (i2 == 2) {
            return sdVar.i.h;
        }
        if (i2 == 3) {
            return sdVar.h.i;
        }
        if (i2 == 4) {
            return sdVar.i.i;
        }
        if (i2 != 5) {
            return null;
        }
        return sdVar.i.a;
    }

    protected static final sq l(sc scVar, int i) {
        sc scVar2 = scVar.e;
        if (scVar2 == null) {
            return null;
        }
        sd sdVar = scVar2.d;
        sy syVar = i == 0 ? sdVar.h : sdVar.i;
        int i2 = scVar2.i - 1;
        if (i2 == 1 || i2 == 2) {
            return syVar.h;
        }
        if (i2 == 3 || i2 == 4) {
            return syVar.i;
        }
        return null;
    }

    public long a() {
        if (this.e.i) {
            return r2.f;
        }
        return 0L;
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract boolean e();

    @Override // defpackage.so
    public void f() {
        throw null;
    }

    protected final int h(int i, int i2) {
        sd sdVar = this.d;
        if (i2 == 0) {
            int i3 = sdVar.x;
            int max = Math.max(sdVar.w, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            int i4 = sdVar.A;
            int max2 = Math.max(sdVar.z, i);
            if (i4 > 0) {
                max2 = Math.min(i4, i);
            }
            if (max2 != i) {
                return max2;
            }
        }
        return i;
    }

    protected final void i(sq sqVar, sq sqVar2, int i, sr srVar) {
        List list = sqVar.k;
        list.add(sqVar2);
        list.add(this.e);
        sqVar.g = i;
        sqVar.h = srVar;
        sqVar2.j.add(sqVar);
        srVar.j.add(sqVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if (r10.c == 3) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void m(sc scVar, sc scVar2, int i) {
        sy syVar;
        sy syVar2;
        sq k = k(scVar);
        sq k2 = k(scVar2);
        if (k.i && k2.i) {
            int b = k.f + scVar.b();
            int b2 = k2.f - scVar2.b();
            sr srVar = this.e;
            int i2 = b2 - b;
            if (!srVar.i && this.j == 3) {
                int i3 = this.c;
                if (i3 != 0) {
                    int i4 = 1;
                    if (i3 != 1) {
                        int i5 = 0;
                        if (i3 == 2) {
                            sd sdVar = this.d;
                            sd sdVar2 = sdVar.V;
                            if (sdVar2 != null) {
                                if (i == 0) {
                                    syVar = sdVar2.h;
                                    i4 = 0;
                                } else {
                                    syVar = sdVar2.i;
                                    i5 = 1;
                                }
                                if (syVar.e.i) {
                                    srVar.c(h((int) ((r15.f * (i4 == 0 ? sdVar.y : sdVar.B)) + 0.5f), i4));
                                    i = i4;
                                } else {
                                    i = i5;
                                }
                            }
                        } else if (i3 == 3) {
                            sd sdVar3 = this.d;
                            sv svVar = sdVar3.h;
                            if (svVar.j == 3 && svVar.c == 3) {
                                sw swVar = sdVar3.i;
                                if (swVar.j == 3) {
                                }
                            }
                            if (i == 0) {
                                i = 0;
                                syVar2 = sdVar3.i;
                            } else {
                                i = 1;
                                i5 = 1;
                                syVar2 = svVar;
                            }
                            if (syVar2.e.i) {
                                float f = sdVar3.Y;
                                srVar.c(i5 == 1 ? (int) ((r6.f / f) + 0.5f) : (int) ((f * r6.f) + 0.5f));
                            }
                        }
                    } else {
                        srVar.c(Math.min(h(srVar.m, i), i2));
                    }
                } else {
                    srVar.c(h(i2, i));
                }
            }
            if (srVar.i) {
                if (srVar.f == i2) {
                    this.h.c(b);
                    this.i.c(b2);
                    return;
                }
                sd sdVar4 = this.d;
                float f2 = i == 0 ? sdVar4.af : sdVar4.ag;
                if (k == k2) {
                    b = k.f;
                    b2 = k2.f;
                    f2 = 0.5f;
                }
                sq sqVar = this.h;
                sqVar.c((int) (b + 0.5f + (((b2 - b) - r4) * f2)));
                this.i.c(sqVar.f + srVar.f);
            }
        }
    }
}
