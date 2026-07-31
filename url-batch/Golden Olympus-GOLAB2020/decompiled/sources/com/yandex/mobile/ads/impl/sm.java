package com.yandex.mobile.ads.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* loaded from: classes3.dex */
final class sm {

    /* renamed from: a, reason: collision with root package name */
    public final int f31838a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31839b;

    /* renamed from: c, reason: collision with root package name */
    private final TreeSet<dy1> f31840c = new TreeSet<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<a> f31841d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private cz f31842e;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f31843a;

        /* renamed from: b, reason: collision with root package name */
        public final long f31844b;

        public a(long j4, long j5) {
            this.f31843a = j4;
            this.f31844b = j5;
        }
    }

    public sm(int i4, String str, cz czVar) {
        this.f31838a = i4;
        this.f31839b = str;
        this.f31842e = czVar;
    }

    public final void a(dy1 dy1Var) {
        this.f31840c.add(dy1Var);
    }

    public final dy1 b(long j4, long j5) {
        dy1 a4 = dy1.a(this.f31839b, j4);
        dy1 floor = this.f31840c.floor(a4);
        if (floor != null && floor.f30090c + floor.f30091d > j4) {
            return floor;
        }
        dy1 ceiling = this.f31840c.ceiling(a4);
        if (ceiling != null) {
            long j6 = ceiling.f30090c - j4;
            j5 = j5 == -1 ? j6 : Math.min(j6, j5);
        }
        return dy1.a(this.f31839b, j4, j5);
    }

    public final boolean c() {
        return this.f31840c.isEmpty();
    }

    public final boolean d() {
        return this.f31841d.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sm.class == obj.getClass()) {
            sm smVar = (sm) obj;
            if (this.f31838a == smVar.f31838a && this.f31839b.equals(smVar.f31839b) && this.f31840c.equals(smVar.f31840c) && this.f31842e.equals(smVar.f31842e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f31842e.hashCode() + C1842c3.a(this.f31839b, this.f31838a * 31, 31);
    }

    public final boolean a(rr rrVar) {
        this.f31842e = this.f31842e.a(rrVar);
        return !r2.equals(r0);
    }

    public final boolean c(long j4, long j5) {
        for (int i4 = 0; i4 < this.f31841d.size(); i4++) {
            a aVar = this.f31841d.get(i4);
            long j6 = aVar.f31844b;
            if (j6 == -1) {
                if (j4 >= aVar.f31843a) {
                    return true;
                }
            } else if (j5 == -1) {
                continue;
            } else {
                long j7 = aVar.f31843a;
                if (j7 <= j4 && j4 + j5 <= j7 + j6) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean d(long j4, long j5) {
        int i4;
        for (0; i4 < this.f31841d.size(); i4 + 1) {
            a aVar = this.f31841d.get(i4);
            long j6 = aVar.f31843a;
            if (j6 > j4) {
                i4 = (j5 != -1 && j4 + j5 <= j6) ? i4 + 1 : 0;
                return false;
            }
            long j7 = aVar.f31844b;
            if (j7 != -1 && j6 + j7 <= j4) {
            }
            return false;
        }
        this.f31841d.add(new a(j4, j5));
        return true;
    }

    public final long a(long j4, long j5) {
        if (j4 < 0) {
            throw new IllegalArgumentException();
        }
        if (j5 >= 0) {
            dy1 b4 = b(j4, j5);
            if (!b4.f30092e) {
                long j6 = b4.f30091d;
                return -Math.min(j6 != -1 ? j6 : Long.MAX_VALUE, j5);
            }
            long j7 = j4 + j5;
            long j8 = j7 >= 0 ? j7 : Long.MAX_VALUE;
            long j9 = b4.f30090c + b4.f30091d;
            if (j9 < j8) {
                for (dy1 dy1Var : this.f31840c.tailSet(b4, false)) {
                    long j10 = dy1Var.f30090c;
                    if (j10 > j9) {
                        break;
                    }
                    j9 = Math.max(j9, j10 + dy1Var.f30091d);
                    if (j9 >= j8) {
                        break;
                    }
                }
            }
            return Math.min(j9 - j4, j5);
        }
        throw new IllegalArgumentException();
    }

    public final TreeSet<dy1> b() {
        return this.f31840c;
    }

    public final cz a() {
        return this.f31842e;
    }

    public final boolean a(om omVar) {
        if (!this.f31840c.remove(omVar)) {
            return false;
        }
        File file = omVar.f30093f;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public final dy1 a(dy1 dy1Var, long j4, boolean z4) {
        if (this.f31840c.remove(dy1Var)) {
            File file = dy1Var.f30093f;
            file.getClass();
            if (z4) {
                File parentFile = file.getParentFile();
                parentFile.getClass();
                long j5 = dy1Var.f30090c;
                int i4 = this.f31838a;
                int i5 = dy1.f24997k;
                File file2 = new File(parentFile, i4 + "." + j5 + "." + j4 + ".v3.exo");
                if (file.renameTo(file2)) {
                    file = file2;
                } else {
                    ms0.d("CachedContent", "Failed to rename " + file + " to " + file2);
                }
            }
            dy1 a4 = dy1Var.a(file, j4);
            this.f31840c.add(a4);
            return a4;
        }
        throw new IllegalStateException();
    }

    public final void a(long j4) {
        for (int i4 = 0; i4 < this.f31841d.size(); i4++) {
            if (this.f31841d.get(i4).f31843a == j4) {
                this.f31841d.remove(i4);
                return;
            }
        }
        throw new IllegalStateException();
    }
}
