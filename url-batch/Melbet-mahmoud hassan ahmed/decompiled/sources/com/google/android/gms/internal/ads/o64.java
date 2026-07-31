package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Log;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
final class o64 implements v94, i54 {

    /* renamed from: b, reason: collision with root package name */
    private final Uri f9542b;

    /* renamed from: c, reason: collision with root package name */
    private final ia4 f9543c;

    /* renamed from: d, reason: collision with root package name */
    private final k64 f9544d;

    /* renamed from: e, reason: collision with root package name */
    private final rc4 f9545e;

    /* renamed from: f, reason: collision with root package name */
    private final ay1 f9546f;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f9548h;

    /* renamed from: j, reason: collision with root package name */
    private long f9550j;

    /* renamed from: m, reason: collision with root package name */
    private td4 f9553m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f9554n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ t64 f9555o;

    /* renamed from: g, reason: collision with root package name */
    private final md4 f9547g = new md4();

    /* renamed from: i, reason: collision with root package name */
    private boolean f9549i = true;

    /* renamed from: l, reason: collision with root package name */
    private long f9552l = -1;

    /* renamed from: a, reason: collision with root package name */
    private final long f9541a = k54.a();

    /* renamed from: k, reason: collision with root package name */
    private li1 f9551k = j(0);

    public o64(t64 t64Var, Uri uri, he1 he1Var, k64 k64Var, rc4 rc4Var, ay1 ay1Var) {
        this.f9555o = t64Var;
        this.f9542b = uri;
        this.f9543c = new ia4(he1Var);
        this.f9544d = k64Var;
        this.f9545e = rc4Var;
        this.f9546f = ay1Var;
    }

    static /* bridge */ /* synthetic */ void i(o64 o64Var, long j7, long j8) {
        o64Var.f9547g.f8503a = j7;
        o64Var.f9550j = j8;
        o64Var.f9549i = true;
        o64Var.f9554n = false;
    }

    private final li1 j(long j7) {
        jg1 jg1Var = new jg1();
        jg1Var.d(this.f9542b);
        jg1Var.c(j7);
        jg1Var.a(6);
        jg1Var.b(t64.Q);
        return jg1Var.e();
    }

    @Override // com.google.android.gms.internal.ads.i54
    public final void a(dr2 dr2Var) {
        long max = !this.f9554n ? this.f9550j : Math.max(this.f9555o.B(), this.f9550j);
        int i7 = dr2Var.i();
        td4 td4Var = this.f9553m;
        Objects.requireNonNull(td4Var);
        rd4.b(td4Var, dr2Var, i7);
        td4Var.a(max, 1, i7, 0, null);
        this.f9554n = true;
    }

    @Override // com.google.android.gms.internal.ads.v94
    public final void f() {
        this.f9548h = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095 A[Catch: all -> 0x020f, TryCatch #6 {all -> 0x020f, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:14:0x0040, B:19:0x008a, B:21:0x0095, B:22:0x00a1, B:24:0x00ab, B:25:0x00b7, B:27:0x00c1, B:28:0x00cd, B:30:0x00d7, B:31:0x00e9, B:33:0x00f3, B:35:0x00f9, B:40:0x0139, B:41:0x013f, B:43:0x014c, B:45:0x0156, B:46:0x0174, B:48:0x0194, B:49:0x0199, B:51:0x019d, B:93:0x0101, B:95:0x010b, B:96:0x0115, B:98:0x0110, B:101:0x011d, B:103:0x0127, B:104:0x0131, B:105:0x012c, B:114:0x004a, B:116:0x0056, B:117:0x0061, B:119:0x005b, B:122:0x006a, B:124:0x0076, B:125:0x0080, B:126:0x007b), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab A[Catch: all -> 0x020f, TryCatch #6 {all -> 0x020f, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:14:0x0040, B:19:0x008a, B:21:0x0095, B:22:0x00a1, B:24:0x00ab, B:25:0x00b7, B:27:0x00c1, B:28:0x00cd, B:30:0x00d7, B:31:0x00e9, B:33:0x00f3, B:35:0x00f9, B:40:0x0139, B:41:0x013f, B:43:0x014c, B:45:0x0156, B:46:0x0174, B:48:0x0194, B:49:0x0199, B:51:0x019d, B:93:0x0101, B:95:0x010b, B:96:0x0115, B:98:0x0110, B:101:0x011d, B:103:0x0127, B:104:0x0131, B:105:0x012c, B:114:0x004a, B:116:0x0056, B:117:0x0061, B:119:0x005b, B:122:0x006a, B:124:0x0076, B:125:0x0080, B:126:0x007b), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c1 A[Catch: all -> 0x020f, TryCatch #6 {all -> 0x020f, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:14:0x0040, B:19:0x008a, B:21:0x0095, B:22:0x00a1, B:24:0x00ab, B:25:0x00b7, B:27:0x00c1, B:28:0x00cd, B:30:0x00d7, B:31:0x00e9, B:33:0x00f3, B:35:0x00f9, B:40:0x0139, B:41:0x013f, B:43:0x014c, B:45:0x0156, B:46:0x0174, B:48:0x0194, B:49:0x0199, B:51:0x019d, B:93:0x0101, B:95:0x010b, B:96:0x0115, B:98:0x0110, B:101:0x011d, B:103:0x0127, B:104:0x0131, B:105:0x012c, B:114:0x004a, B:116:0x0056, B:117:0x0061, B:119:0x005b, B:122:0x006a, B:124:0x0076, B:125:0x0080, B:126:0x007b), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d7 A[Catch: all -> 0x020f, TryCatch #6 {all -> 0x020f, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:14:0x0040, B:19:0x008a, B:21:0x0095, B:22:0x00a1, B:24:0x00ab, B:25:0x00b7, B:27:0x00c1, B:28:0x00cd, B:30:0x00d7, B:31:0x00e9, B:33:0x00f3, B:35:0x00f9, B:40:0x0139, B:41:0x013f, B:43:0x014c, B:45:0x0156, B:46:0x0174, B:48:0x0194, B:49:0x0199, B:51:0x019d, B:93:0x0101, B:95:0x010b, B:96:0x0115, B:98:0x0110, B:101:0x011d, B:103:0x0127, B:104:0x0131, B:105:0x012c, B:114:0x004a, B:116:0x0056, B:117:0x0061, B:119:0x005b, B:122:0x006a, B:124:0x0076, B:125:0x0080, B:126:0x007b), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3 A[Catch: all -> 0x020f, TRY_LEAVE, TryCatch #6 {all -> 0x020f, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:14:0x0040, B:19:0x008a, B:21:0x0095, B:22:0x00a1, B:24:0x00ab, B:25:0x00b7, B:27:0x00c1, B:28:0x00cd, B:30:0x00d7, B:31:0x00e9, B:33:0x00f3, B:35:0x00f9, B:40:0x0139, B:41:0x013f, B:43:0x014c, B:45:0x0156, B:46:0x0174, B:48:0x0194, B:49:0x0199, B:51:0x019d, B:93:0x0101, B:95:0x010b, B:96:0x0115, B:98:0x0110, B:101:0x011d, B:103:0x0127, B:104:0x0131, B:105:0x012c, B:114:0x004a, B:116:0x0056, B:117:0x0061, B:119:0x005b, B:122:0x006a, B:124:0x0076, B:125:0x0080, B:126:0x007b), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0139 A[Catch: all -> 0x020f, TryCatch #6 {all -> 0x020f, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:14:0x0040, B:19:0x008a, B:21:0x0095, B:22:0x00a1, B:24:0x00ab, B:25:0x00b7, B:27:0x00c1, B:28:0x00cd, B:30:0x00d7, B:31:0x00e9, B:33:0x00f3, B:35:0x00f9, B:40:0x0139, B:41:0x013f, B:43:0x014c, B:45:0x0156, B:46:0x0174, B:48:0x0194, B:49:0x0199, B:51:0x019d, B:93:0x0101, B:95:0x010b, B:96:0x0115, B:98:0x0110, B:101:0x011d, B:103:0x0127, B:104:0x0131, B:105:0x012c, B:114:0x004a, B:116:0x0056, B:117:0x0061, B:119:0x005b, B:122:0x006a, B:124:0x0076, B:125:0x0080, B:126:0x007b), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014c A[Catch: all -> 0x020f, TryCatch #6 {all -> 0x020f, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:14:0x0040, B:19:0x008a, B:21:0x0095, B:22:0x00a1, B:24:0x00ab, B:25:0x00b7, B:27:0x00c1, B:28:0x00cd, B:30:0x00d7, B:31:0x00e9, B:33:0x00f3, B:35:0x00f9, B:40:0x0139, B:41:0x013f, B:43:0x014c, B:45:0x0156, B:46:0x0174, B:48:0x0194, B:49:0x0199, B:51:0x019d, B:93:0x0101, B:95:0x010b, B:96:0x0115, B:98:0x0110, B:101:0x011d, B:103:0x0127, B:104:0x0131, B:105:0x012c, B:114:0x004a, B:116:0x0056, B:117:0x0061, B:119:0x005b, B:122:0x006a, B:124:0x0076, B:125:0x0080, B:126:0x007b), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0194 A[Catch: all -> 0x020f, TryCatch #6 {all -> 0x020f, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:14:0x0040, B:19:0x008a, B:21:0x0095, B:22:0x00a1, B:24:0x00ab, B:25:0x00b7, B:27:0x00c1, B:28:0x00cd, B:30:0x00d7, B:31:0x00e9, B:33:0x00f3, B:35:0x00f9, B:40:0x0139, B:41:0x013f, B:43:0x014c, B:45:0x0156, B:46:0x0174, B:48:0x0194, B:49:0x0199, B:51:0x019d, B:93:0x0101, B:95:0x010b, B:96:0x0115, B:98:0x0110, B:101:0x011d, B:103:0x0127, B:104:0x0131, B:105:0x012c, B:114:0x004a, B:116:0x0056, B:117:0x0061, B:119:0x005b, B:122:0x006a, B:124:0x0076, B:125:0x0080, B:126:0x007b), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019d A[Catch: all -> 0x020f, TRY_LEAVE, TryCatch #6 {all -> 0x020f, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:14:0x0040, B:19:0x008a, B:21:0x0095, B:22:0x00a1, B:24:0x00ab, B:25:0x00b7, B:27:0x00c1, B:28:0x00cd, B:30:0x00d7, B:31:0x00e9, B:33:0x00f3, B:35:0x00f9, B:40:0x0139, B:41:0x013f, B:43:0x014c, B:45:0x0156, B:46:0x0174, B:48:0x0194, B:49:0x0199, B:51:0x019d, B:93:0x0101, B:95:0x010b, B:96:0x0115, B:98:0x0110, B:101:0x011d, B:103:0x0127, B:104:0x0131, B:105:0x012c, B:114:0x004a, B:116:0x0056, B:117:0x0061, B:119:0x005b, B:122:0x006a, B:124:0x0076, B:125:0x0080, B:126:0x007b), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x022e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[LOOP:0: B:2:0x0004->B:82:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ed A[EDGE_INSN: B:91:0x01ed->B:72:0x01ed BREAK  A[LOOP:1: B:53:0x01a8->B:64:0x01a8], SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.v94
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        boolean z6;
        int i7;
        List<String> list;
        String str;
        List<String> list2;
        String str2;
        List<String> list3;
        String str3;
        List<String> list4;
        boolean z7;
        List<String> list5;
        int i8;
        fc1 fc1Var;
        int i9;
        int i10;
        int i11;
        while (!this.f9548h) {
            int i12 = 0;
            try {
                long j7 = this.f9547g.f8503a;
                li1 j8 = j(j7);
                this.f9551k = j8;
                long k7 = this.f9543c.k(j8);
                this.f9552l = k7;
                if (k7 != -1) {
                    this.f9552l = k7 + j7;
                }
                t64 t64Var = this.f9555o;
                Map<String, List<String>> zza = this.f9543c.zza();
                List<String> list6 = zza.get("icy-br");
                if (list6 != null) {
                    String str4 = list6.get(0);
                    try {
                        i11 = Integer.parseInt(str4) * 1000;
                        if (i11 > 0) {
                            z6 = true;
                        } else {
                            try {
                                String valueOf = String.valueOf(str4);
                                Log.w("IcyHeaders", valueOf.length() != 0 ? "Invalid bitrate: ".concat(valueOf) : new String("Invalid bitrate: "));
                                z6 = false;
                                i11 = -1;
                            } catch (NumberFormatException unused) {
                                String valueOf2 = String.valueOf(str4);
                                Log.w("IcyHeaders", valueOf2.length() != 0 ? "Invalid bitrate header: ".concat(valueOf2) : new String("Invalid bitrate header: "));
                                i7 = i11;
                                z6 = false;
                                list = zza.get("icy-genre");
                                if (list == null) {
                                }
                                list2 = zza.get("icy-name");
                                if (list2 == null) {
                                }
                                list3 = zza.get("icy-url");
                                if (list3 == null) {
                                }
                                list4 = zza.get("icy-pub");
                                if (list4 == null) {
                                }
                                list5 = zza.get("icy-metaint");
                                if (list5 == null) {
                                }
                                t64Var.f12121t = z6 ? new ff4(i7, str, str2, str3, z7, i8) : null;
                                fc1Var = this.f9543c;
                                if (this.f9555o.f12121t != null) {
                                }
                                this.f9544d.e(fc1Var, this.f9542b, this.f9543c.zza(), j7, this.f9552l, this.f9545e);
                                if (this.f9555o.f12121t != null) {
                                }
                                if (this.f9549i) {
                                }
                                long j9 = j7;
                                i9 = 0;
                                while (true) {
                                    if (i9 != 0) {
                                    }
                                }
                                if (i9 != 1) {
                                }
                                n13.m(this.f9543c);
                                if (i12 != 0) {
                                }
                            }
                        }
                        i7 = i11;
                    } catch (NumberFormatException unused2) {
                        i11 = -1;
                    }
                } else {
                    z6 = false;
                    i7 = -1;
                }
                list = zza.get("icy-genre");
                if (list == null) {
                    str = list.get(0);
                    z6 = true;
                } else {
                    str = null;
                }
                list2 = zza.get("icy-name");
                if (list2 == null) {
                    str2 = list2.get(0);
                    z6 = true;
                } else {
                    str2 = null;
                }
                list3 = zza.get("icy-url");
                if (list3 == null) {
                    str3 = list3.get(0);
                    z6 = true;
                } else {
                    str3 = null;
                }
                list4 = zza.get("icy-pub");
                if (list4 == null) {
                    z7 = list4.get(0).equals("1");
                    z6 = true;
                } else {
                    z7 = false;
                }
                list5 = zza.get("icy-metaint");
                if (list5 == null) {
                    String str5 = list5.get(0);
                    try {
                        i10 = Integer.parseInt(str5);
                        if (i10 > 0) {
                            z6 = true;
                        } else {
                            try {
                                String valueOf3 = String.valueOf(str5);
                                Log.w("IcyHeaders", valueOf3.length() != 0 ? "Invalid metadata interval: ".concat(valueOf3) : new String("Invalid metadata interval: "));
                                i10 = -1;
                            } catch (NumberFormatException unused3) {
                                String valueOf4 = String.valueOf(str5);
                                Log.w("IcyHeaders", valueOf4.length() != 0 ? "Invalid metadata interval: ".concat(valueOf4) : new String("Invalid metadata interval: "));
                                i8 = i10;
                                t64Var.f12121t = z6 ? new ff4(i7, str, str2, str3, z7, i8) : null;
                                fc1Var = this.f9543c;
                                if (this.f9555o.f12121t != null) {
                                    fc1Var = new j54(this.f9543c, this.f9555o.f12121t.f5105k, this);
                                    td4 T = this.f9555o.T();
                                    this.f9553m = T;
                                    T.b(t64.R);
                                }
                                this.f9544d.e(fc1Var, this.f9542b, this.f9543c.zza(), j7, this.f9552l, this.f9545e);
                                if (this.f9555o.f12121t != null) {
                                }
                                if (this.f9549i) {
                                }
                                long j92 = j7;
                                i9 = 0;
                                while (true) {
                                    if (i9 != 0) {
                                    }
                                }
                                if (i9 != 1) {
                                }
                                n13.m(this.f9543c);
                                if (i12 != 0) {
                                }
                            }
                        }
                    } catch (NumberFormatException unused4) {
                        i10 = -1;
                    }
                    i8 = i10;
                } else {
                    i8 = -1;
                }
                t64Var.f12121t = z6 ? new ff4(i7, str, str2, str3, z7, i8) : null;
                fc1Var = this.f9543c;
                if (this.f9555o.f12121t != null && this.f9555o.f12121t.f5105k != -1) {
                    fc1Var = new j54(this.f9543c, this.f9555o.f12121t.f5105k, this);
                    td4 T2 = this.f9555o.T();
                    this.f9553m = T2;
                    T2.b(t64.R);
                }
                this.f9544d.e(fc1Var, this.f9542b, this.f9543c.zza(), j7, this.f9552l, this.f9545e);
                if (this.f9555o.f12121t != null) {
                    this.f9544d.c();
                }
                if (this.f9549i) {
                    this.f9544d.d(j7, this.f9550j);
                    this.f9549i = false;
                }
                long j922 = j7;
                i9 = 0;
                while (true) {
                    if (i9 != 0) {
                        break;
                    }
                    try {
                        if (this.f9548h) {
                            i9 = 0;
                            break;
                        }
                        try {
                            this.f9546f.a();
                            i9 = this.f9544d.f(this.f9547g);
                            long a7 = this.f9544d.a();
                            if (a7 > this.f9555o.f12113l + j922) {
                                this.f9546f.c();
                                this.f9555o.f12119r.post(this.f9555o.f12118q);
                                j922 = a7;
                            }
                        } catch (InterruptedException unused5) {
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        th = th;
                        i12 = i9;
                        if (i12 != 1 && this.f9544d.a() != -1) {
                            this.f9547g.f8503a = this.f9544d.a();
                        }
                        n13.m(this.f9543c);
                        throw th;
                    }
                }
                if (i9 != 1) {
                    if (this.f9544d.a() != -1) {
                        this.f9547g.f8503a = this.f9544d.a();
                    }
                    i12 = i9;
                }
                n13.m(this.f9543c);
                if (i12 != 0) {
                    return;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
