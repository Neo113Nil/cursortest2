package com.anythink.core.common.n.b;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f15741a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f15742b;

    /* renamed from: c, reason: collision with root package name */
    String f15743c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f15744d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f15745e;

    /* renamed from: f, reason: collision with root package name */
    private final int f15746f;

    /* renamed from: g, reason: collision with root package name */
    private final int f15747g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f15748h;
    private final boolean i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f15749j;

    /* renamed from: k, reason: collision with root package name */
    private final int f15750k;

    /* renamed from: l, reason: collision with root package name */
    private final int f15751l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f15752m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f15753n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f15754o;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f15755a;

        /* renamed from: b, reason: collision with root package name */
        boolean f15756b;

        /* renamed from: c, reason: collision with root package name */
        int f15757c = -1;

        /* renamed from: d, reason: collision with root package name */
        int f15758d = -1;

        /* renamed from: e, reason: collision with root package name */
        int f15759e = -1;

        /* renamed from: f, reason: collision with root package name */
        boolean f15760f;

        /* renamed from: g, reason: collision with root package name */
        boolean f15761g;

        /* renamed from: h, reason: collision with root package name */
        boolean f15762h;

        private a a(int i, TimeUnit timeUnit) {
            if (i < 0) {
                throw new IllegalArgumentException("maxAge < 0: ".concat(String.valueOf(i)));
            }
            long seconds = timeUnit.toSeconds(i);
            this.f15757c = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
            return this;
        }

        private a b() {
            this.f15755a = true;
            return this;
        }

        private a c() {
            this.f15756b = true;
            return this;
        }

        private a d() {
            this.f15760f = true;
            return this;
        }

        private a e() {
            this.f15761g = true;
            return this;
        }

        private a f() {
            this.f15762h = true;
            return this;
        }

        private a b(int i, TimeUnit timeUnit) {
            if (i < 0) {
                throw new IllegalArgumentException("minFresh < 0: ".concat(String.valueOf(i)));
            }
            long seconds = timeUnit.toSeconds(i);
            this.f15759e = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
            return this;
        }

        private a a(TimeUnit timeUnit) {
            long seconds = timeUnit.toSeconds(2147483647L);
            this.f15758d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
            return this;
        }

        public final d a() {
            return new d(this);
        }
    }

    static {
        a aVar = new a();
        aVar.f15755a = true;
        f15741a = aVar.a();
        a aVar2 = new a();
        aVar2.f15760f = true;
        long seconds = TimeUnit.SECONDS.toSeconds(2147483647L);
        aVar2.f15758d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
        f15742b = aVar2.a();
    }

    private d(boolean z8, boolean z9, int i, int i4, boolean z10, boolean z11, boolean z12, int i9, int i10, boolean z13, boolean z14, boolean z15, String str) {
        this.f15744d = z8;
        this.f15745e = z9;
        this.f15746f = i;
        this.f15747g = i4;
        this.f15748h = z10;
        this.i = z11;
        this.f15749j = z12;
        this.f15750k = i9;
        this.f15751l = i10;
        this.f15752m = z13;
        this.f15753n = z14;
        this.f15754o = z15;
        this.f15743c = str;
    }

    private int j() {
        return this.f15747g;
    }

    private boolean k() {
        return this.f15753n;
    }

    private boolean l() {
        return this.f15754o;
    }

    private String m() {
        StringBuilder sb = new StringBuilder();
        if (this.f15744d) {
            sb.append("no-cache, ");
        }
        if (this.f15745e) {
            sb.append("no-store, ");
        }
        if (this.f15746f != -1) {
            sb.append("max-age=");
            sb.append(this.f15746f);
            sb.append(", ");
        }
        if (this.f15747g != -1) {
            sb.append("s-maxage=");
            sb.append(this.f15747g);
            sb.append(", ");
        }
        if (this.f15748h) {
            sb.append("private, ");
        }
        if (this.i) {
            sb.append("public, ");
        }
        if (this.f15749j) {
            sb.append("must-revalidate, ");
        }
        if (this.f15750k != -1) {
            sb.append("max-stale=");
            sb.append(this.f15750k);
            sb.append(", ");
        }
        if (this.f15751l != -1) {
            sb.append("min-fresh=");
            sb.append(this.f15751l);
            sb.append(", ");
        }
        if (this.f15752m) {
            sb.append("only-if-cached, ");
        }
        if (this.f15753n) {
            sb.append("no-transform, ");
        }
        if (this.f15754o) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    public final boolean a() {
        return this.f15744d;
    }

    public final boolean b() {
        return this.f15745e;
    }

    public final int c() {
        return this.f15746f;
    }

    public final boolean d() {
        return this.f15748h;
    }

    public final boolean e() {
        return this.i;
    }

    public final boolean f() {
        return this.f15749j;
    }

    public final int g() {
        return this.f15750k;
    }

    public final int h() {
        return this.f15751l;
    }

    public final boolean i() {
        return this.f15752m;
    }

    public final String toString() {
        String sb;
        String str = this.f15743c;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f15744d) {
            sb2.append("no-cache, ");
        }
        if (this.f15745e) {
            sb2.append("no-store, ");
        }
        if (this.f15746f != -1) {
            sb2.append("max-age=");
            sb2.append(this.f15746f);
            sb2.append(", ");
        }
        if (this.f15747g != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.f15747g);
            sb2.append(", ");
        }
        if (this.f15748h) {
            sb2.append("private, ");
        }
        if (this.i) {
            sb2.append("public, ");
        }
        if (this.f15749j) {
            sb2.append("must-revalidate, ");
        }
        if (this.f15750k != -1) {
            sb2.append("max-stale=");
            sb2.append(this.f15750k);
            sb2.append(", ");
        }
        if (this.f15751l != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.f15751l);
            sb2.append(", ");
        }
        if (this.f15752m) {
            sb2.append("only-if-cached, ");
        }
        if (this.f15753n) {
            sb2.append("no-transform, ");
        }
        if (this.f15754o) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            sb = "";
        } else {
            sb2.delete(sb2.length() - 2, sb2.length());
            sb = sb2.toString();
        }
        this.f15743c = sb;
        return sb;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d a(u uVar) {
        int i;
        int i4;
        String str;
        u uVar2 = uVar;
        int a9 = uVar2.a();
        int i9 = 0;
        boolean z8 = true;
        String str2 = null;
        boolean z9 = false;
        boolean z10 = false;
        int i10 = -1;
        int i11 = -1;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        int i12 = -1;
        int i13 = -1;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        while (i9 < a9) {
            String a10 = uVar2.a(i9);
            String b9 = uVar2.b(i9);
            if (a10.equalsIgnoreCase("Cache-Control")) {
                if (str2 == null) {
                    str2 = b9;
                    i = 0;
                    while (i < b9.length()) {
                        int a11 = com.anythink.core.common.n.b.a.c.e.a(b9, i, "=,;");
                        String trim = b9.substring(i, a11).trim();
                        if (a11 == b9.length() || b9.charAt(a11) == ',' || b9.charAt(a11) == ';') {
                            i4 = a11 + 1;
                            str = null;
                        } else {
                            int a12 = com.anythink.core.common.n.b.a.c.e.a(b9, a11 + 1);
                            if (a12 >= b9.length() || b9.charAt(a12) != '\"') {
                                i4 = com.anythink.core.common.n.b.a.c.e.a(b9, a12, ",;");
                                str = b9.substring(a12, i4).trim();
                            } else {
                                int i14 = a12 + 1;
                                int a13 = com.anythink.core.common.n.b.a.c.e.a(b9, i14, "\"");
                                str = b9.substring(i14, a13);
                                i4 = a13 + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(trim)) {
                            i = i4;
                            z9 = true;
                        } else if ("no-store".equalsIgnoreCase(trim)) {
                            i = i4;
                            z10 = true;
                        } else {
                            if ("max-age".equalsIgnoreCase(trim)) {
                                i10 = com.anythink.core.common.n.b.a.c.e.b(str, -1);
                            } else if ("s-maxage".equalsIgnoreCase(trim)) {
                                i11 = com.anythink.core.common.n.b.a.c.e.b(str, -1);
                            } else if ("private".equalsIgnoreCase(trim)) {
                                i = i4;
                                z11 = true;
                            } else if ("public".equalsIgnoreCase(trim)) {
                                i = i4;
                                z12 = true;
                            } else if ("must-revalidate".equalsIgnoreCase(trim)) {
                                i = i4;
                                z13 = true;
                            } else if ("max-stale".equalsIgnoreCase(trim)) {
                                i12 = com.anythink.core.common.n.b.a.c.e.b(str, Integer.MAX_VALUE);
                            } else if ("min-fresh".equalsIgnoreCase(trim)) {
                                i13 = com.anythink.core.common.n.b.a.c.e.b(str, -1);
                            } else if ("only-if-cached".equalsIgnoreCase(trim)) {
                                i = i4;
                                z14 = true;
                            } else if ("no-transform".equalsIgnoreCase(trim)) {
                                i = i4;
                                z15 = true;
                            } else if ("immutable".equalsIgnoreCase(trim)) {
                                z16 = true;
                            }
                            i = i4;
                        }
                    }
                    i9++;
                    uVar2 = uVar;
                }
            } else if (!a10.equalsIgnoreCase("Pragma")) {
                i9++;
                uVar2 = uVar;
            }
            z8 = false;
            i = 0;
            while (i < b9.length()) {
            }
            i9++;
            uVar2 = uVar;
        }
        return new d(z9, z10, i10, i11, z11, z12, z13, i12, i13, z14, z15, z16, !z8 ? null : str2);
    }

    public d(a aVar) {
        this.f15744d = aVar.f15755a;
        this.f15745e = aVar.f15756b;
        this.f15746f = aVar.f15757c;
        this.f15747g = -1;
        this.f15748h = false;
        this.i = false;
        this.f15749j = false;
        this.f15750k = aVar.f15758d;
        this.f15751l = aVar.f15759e;
        this.f15752m = aVar.f15760f;
        this.f15753n = aVar.f15761g;
        this.f15754o = aVar.f15762h;
    }
}
