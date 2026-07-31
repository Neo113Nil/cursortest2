package S;

import e2.InterfaceC0424c;
import j.C0519A;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class f extends C0221e {

    /* renamed from: o, reason: collision with root package name */
    public final C0221e f4210o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4211p;

    public f(int i3, n nVar, InterfaceC0424c interfaceC0424c, InterfaceC0424c interfaceC0424c2, C0221e c0221e) {
        super(i3, nVar, interfaceC0424c, interfaceC0424c2);
        this.f4210o = c0221e;
        c0221e.k();
    }

    @Override // S.C0221e, S.i
    public final void c() {
        if (this.f4218c) {
            return;
        }
        super.c();
        if (this.f4211p) {
            return;
        }
        this.f4211p = true;
        this.f4210o.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0066 A[Catch: all -> 0x0058, TryCatch #1 {all -> 0x0058, blocks: (B:11:0x0020, B:13:0x0025, B:16:0x002a, B:21:0x0044, B:23:0x004c, B:24:0x005e, B:26:0x0066, B:27:0x006b, B:29:0x008c, B:30:0x00a2, B:31:0x00a9, B:34:0x00b2, B:35:0x00b3, B:44:0x00be, B:47:0x00d4, B:48:0x00c4, B:51:0x00e9, B:52:0x00ea, B:53:0x009f, B:54:0x0050, B:55:0x005b, B:33:0x00aa), top: B:10:0x0020, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c A[Catch: all -> 0x0058, TryCatch #1 {all -> 0x0058, blocks: (B:11:0x0020, B:13:0x0025, B:16:0x002a, B:21:0x0044, B:23:0x004c, B:24:0x005e, B:26:0x0066, B:27:0x006b, B:29:0x008c, B:30:0x00a2, B:31:0x00a9, B:34:0x00b2, B:35:0x00b3, B:44:0x00be, B:47:0x00d4, B:48:0x00c4, B:51:0x00e9, B:52:0x00ea, B:53:0x009f, B:54:0x0050, B:55:0x005b, B:33:0x00aa), top: B:10:0x0020, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f A[Catch: all -> 0x0058, TryCatch #1 {all -> 0x0058, blocks: (B:11:0x0020, B:13:0x0025, B:16:0x002a, B:21:0x0044, B:23:0x004c, B:24:0x005e, B:26:0x0066, B:27:0x006b, B:29:0x008c, B:30:0x00a2, B:31:0x00a9, B:34:0x00b2, B:35:0x00b3, B:44:0x00be, B:47:0x00d4, B:48:0x00c4, B:51:0x00e9, B:52:0x00ea, B:53:0x009f, B:54:0x0050, B:55:0x005b, B:33:0x00aa), top: B:10:0x0020, inners: #0 }] */
    @Override // S.C0221e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u v() {
        int i3;
        C0221e c0221e = this.f4210o;
        if (c0221e.f4209m || c0221e.f4218c) {
            return new j();
        }
        C0519A c0519a = this.f4204h;
        int i4 = this.f4217b;
        HashMap c2 = c0519a != null ? p.c(c0221e, this, c0221e.e()) : null;
        Object obj = p.f4241b;
        synchronized (obj) {
            try {
                p.d(this);
                if (c0519a != null && c0519a.f6250d != 0) {
                    u y3 = y(this.f4210o.d(), c2, this.f4210o.e());
                    if (!y3.equals(k.f4220b)) {
                        return y3;
                    }
                    C0519A w2 = this.f4210o.w();
                    if (w2 != null) {
                        w2.i(c0519a);
                    } else {
                        this.f4210o.A(c0519a);
                        this.f4204h = null;
                    }
                    if (this.f4210o.d() < i4) {
                        this.f4210o.u();
                    }
                    C0221e c0221e2 = this.f4210o;
                    c0221e2.r(c0221e2.e().c(i4).b(this.f4206j));
                    this.f4210o.z(i4);
                    C0221e c0221e3 = this.f4210o;
                    i3 = this.f4219d;
                    this.f4219d = -1;
                    if (i3 < 0) {
                        int[] iArr = c0221e3.f4207k;
                        f2.j.f(iArr, "<this>");
                        int length = iArr.length;
                        int[] copyOf = Arrays.copyOf(iArr, length + 1);
                        copyOf[length] = i3;
                        c0221e3.f4207k = copyOf;
                    } else {
                        c0221e3.getClass();
                    }
                    C0221e c0221e4 = this.f4210o;
                    n nVar = this.f4206j;
                    c0221e4.getClass();
                    synchronized (obj) {
                        c0221e4.f4206j = c0221e4.f4206j.i(nVar);
                        C0221e c0221e5 = this.f4210o;
                        int[] iArr2 = this.f4207k;
                        c0221e5.getClass();
                        if (iArr2.length != 0) {
                            int[] iArr3 = c0221e5.f4207k;
                            if (iArr3.length != 0) {
                                int length2 = iArr3.length;
                                int length3 = iArr2.length;
                                int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                                System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                                f2.j.c(copyOf2);
                                iArr2 = copyOf2;
                            }
                            c0221e5.f4207k = iArr2;
                        }
                    }
                    this.f4209m = true;
                    if (!this.f4211p) {
                        this.f4211p = true;
                        this.f4210o.l();
                    }
                    return k.f4220b;
                }
                a();
                if (this.f4210o.d() < i4) {
                }
                C0221e c0221e22 = this.f4210o;
                c0221e22.r(c0221e22.e().c(i4).b(this.f4206j));
                this.f4210o.z(i4);
                C0221e c0221e32 = this.f4210o;
                i3 = this.f4219d;
                this.f4219d = -1;
                if (i3 < 0) {
                }
                C0221e c0221e42 = this.f4210o;
                n nVar2 = this.f4206j;
                c0221e42.getClass();
                synchronized (obj) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
