package Q;

import i.C0661B;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Q.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0270f extends C0269e {

    /* renamed from: o, reason: collision with root package name */
    public final C0269e f3845o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3846p;

    public C0270f(int i2, o oVar, Function1 function1, Function1 function12, C0269e c0269e) {
        super(i2, oVar, function1, function12);
        this.f3845o = c0269e;
        c0269e.k();
    }

    @Override // Q.C0269e, Q.AbstractC0274j
    public final void c() {
        if (this.f3855c) {
            return;
        }
        super.c();
        if (this.f3846p) {
            return;
        }
        this.f3846p = true;
        this.f3845o.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006c A[Catch: all -> 0x005e, TryCatch #1 {all -> 0x005e, blocks: (B:11:0x0021, B:13:0x0026, B:16:0x002b, B:21:0x0045, B:23:0x004d, B:24:0x0064, B:26:0x006c, B:27:0x0071, B:29:0x0092, B:30:0x00a8, B:31:0x00af, B:34:0x00ba, B:35:0x00bb, B:44:0x00c6, B:47:0x00e6, B:48:0x00cc, B:51:0x00fa, B:52:0x00fb, B:53:0x00a5, B:54:0x0056, B:55:0x0061, B:33:0x00b0), top: B:10:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092 A[Catch: all -> 0x005e, TryCatch #1 {all -> 0x005e, blocks: (B:11:0x0021, B:13:0x0026, B:16:0x002b, B:21:0x0045, B:23:0x004d, B:24:0x0064, B:26:0x006c, B:27:0x0071, B:29:0x0092, B:30:0x00a8, B:31:0x00af, B:34:0x00ba, B:35:0x00bb, B:44:0x00c6, B:47:0x00e6, B:48:0x00cc, B:51:0x00fa, B:52:0x00fb, B:53:0x00a5, B:54:0x0056, B:55:0x0061, B:33:0x00b0), top: B:10:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a5 A[Catch: all -> 0x005e, TryCatch #1 {all -> 0x005e, blocks: (B:11:0x0021, B:13:0x0026, B:16:0x002b, B:21:0x0045, B:23:0x004d, B:24:0x0064, B:26:0x006c, B:27:0x0071, B:29:0x0092, B:30:0x00a8, B:31:0x00af, B:34:0x00ba, B:35:0x00bb, B:44:0x00c6, B:47:0x00e6, B:48:0x00cc, B:51:0x00fa, B:52:0x00fb, B:53:0x00a5, B:54:0x0056, B:55:0x0061, B:33:0x00b0), top: B:10:0x0021, inners: #0 }] */
    @Override // Q.C0269e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w v() {
        int i2;
        C0269e c0269e = this.f3845o;
        if (c0269e.f3844m || c0269e.f3855c) {
            return new k();
        }
        C0661B elements = this.f3839h;
        int i4 = this.f3854b;
        HashMap c4 = elements != null ? q.c(c0269e, this, c0269e.e()) : null;
        Object obj = q.f3878b;
        synchronized (obj) {
            try {
                q.d(this);
                if (elements != null && elements.f6887d != 0) {
                    w y4 = y(this.f3845o.d(), c4, this.f3845o.e());
                    if (!y4.equals(l.f3857c)) {
                        return y4;
                    }
                    C0661B w4 = this.f3845o.w();
                    if (w4 != null) {
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        w4.i(elements);
                    } else {
                        this.f3845o.A(elements);
                        this.f3839h = null;
                    }
                    if (this.f3845o.d() < i4) {
                        this.f3845o.u();
                    }
                    C0269e c0269e2 = this.f3845o;
                    c0269e2.r(c0269e2.e().h(i4).e(this.f3841j));
                    this.f3845o.z(i4);
                    C0269e c0269e3 = this.f3845o;
                    i2 = this.f3856d;
                    this.f3856d = -1;
                    if (i2 < 0) {
                        int[] iArr = c0269e3.f3842k;
                        Intrinsics.checkNotNullParameter(iArr, "<this>");
                        int length = iArr.length;
                        int[] copyOf = Arrays.copyOf(iArr, length + 1);
                        copyOf[length] = i2;
                        c0269e3.f3842k = copyOf;
                    } else {
                        c0269e3.getClass();
                    }
                    C0269e c0269e4 = this.f3845o;
                    o oVar = this.f3841j;
                    c0269e4.getClass();
                    synchronized (obj) {
                        c0269e4.f3841j = c0269e4.f3841j.w(oVar);
                        Unit unit = Unit.f7487a;
                        C0269e c0269e5 = this.f3845o;
                        int[] elements2 = this.f3842k;
                        c0269e5.getClass();
                        if (elements2.length != 0) {
                            int[] iArr2 = c0269e5.f3842k;
                            if (iArr2.length != 0) {
                                Intrinsics.checkNotNullParameter(iArr2, "<this>");
                                Intrinsics.checkNotNullParameter(elements2, "elements");
                                int length2 = iArr2.length;
                                int length3 = elements2.length;
                                int[] copyOf2 = Arrays.copyOf(iArr2, length2 + length3);
                                System.arraycopy(elements2, 0, copyOf2, length2, length3);
                                Intrinsics.c(copyOf2);
                                elements2 = copyOf2;
                            }
                            c0269e5.f3842k = elements2;
                        }
                    }
                    this.f3844m = true;
                    if (!this.f3846p) {
                        this.f3846p = true;
                        this.f3845o.l();
                    }
                    return l.f3857c;
                }
                a();
                if (this.f3845o.d() < i4) {
                }
                C0269e c0269e22 = this.f3845o;
                c0269e22.r(c0269e22.e().h(i4).e(this.f3841j));
                this.f3845o.z(i4);
                C0269e c0269e32 = this.f3845o;
                i2 = this.f3856d;
                this.f3856d = -1;
                if (i2 < 0) {
                }
                C0269e c0269e42 = this.f3845o;
                o oVar2 = this.f3841j;
                c0269e42.getClass();
                synchronized (obj) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
