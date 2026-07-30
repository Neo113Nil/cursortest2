package q0;

import i.b0;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: o, reason: collision with root package name */
    public final c f7396o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7397p;

    public d(int i7, l lVar, q6.c cVar, q6.c cVar2, c cVar3) {
        super(i7, lVar, cVar, cVar2);
        this.f7396o = cVar3;
        cVar3.k();
    }

    @Override // q0.c, q0.g
    public final void c() {
        if (this.f7404c) {
            return;
        }
        super.c();
        if (this.f7397p) {
            return;
        }
        this.f7397p = true;
        this.f7396o.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0066 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:11:0x0020, B:13:0x0025, B:16:0x002a, B:21:0x0044, B:23:0x004c, B:24:0x005e, B:26:0x0066, B:27:0x006b, B:29:0x008c, B:30:0x00a2, B:31:0x00a9, B:34:0x00b2, B:35:0x00b3, B:44:0x00be, B:47:0x00d4, B:48:0x00c4, B:51:0x00e9, B:52:0x00ea, B:53:0x009f, B:54:0x0053, B:55:0x005b, B:33:0x00aa), top: B:10:0x0020, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:11:0x0020, B:13:0x0025, B:16:0x002a, B:21:0x0044, B:23:0x004c, B:24:0x005e, B:26:0x0066, B:27:0x006b, B:29:0x008c, B:30:0x00a2, B:31:0x00a9, B:34:0x00b2, B:35:0x00b3, B:44:0x00be, B:47:0x00d4, B:48:0x00c4, B:51:0x00e9, B:52:0x00ea, B:53:0x009f, B:54:0x0053, B:55:0x005b, B:33:0x00aa), top: B:10:0x0020, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:11:0x0020, B:13:0x0025, B:16:0x002a, B:21:0x0044, B:23:0x004c, B:24:0x005e, B:26:0x0066, B:27:0x006b, B:29:0x008c, B:30:0x00a2, B:31:0x00a9, B:34:0x00b2, B:35:0x00b3, B:44:0x00be, B:47:0x00d4, B:48:0x00c4, B:51:0x00e9, B:52:0x00ea, B:53:0x009f, B:54:0x0053, B:55:0x005b, B:33:0x00aa), top: B:10:0x0020, inners: #1 }] */
    @Override // q0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r v() {
        int i7;
        c cVar = this.f7396o;
        if (cVar.f7395m || cVar.f7404c) {
            return new h();
        }
        b0 b0Var = this.f7390h;
        int i8 = this.f7403b;
        HashMap c4 = b0Var != null ? n.c(cVar, this, cVar.e()) : null;
        Object obj = n.f7427b;
        synchronized (obj) {
            try {
                n.d(this);
                if (b0Var != null && b0Var.f4724d != 0) {
                    r y4 = y(this.f7396o.d(), c4, this.f7396o.e());
                    if (!y4.equals(i.f7406b)) {
                        return y4;
                    }
                    b0 w4 = this.f7396o.w();
                    if (w4 != null) {
                        w4.i(b0Var);
                    } else {
                        this.f7396o.A(b0Var);
                        this.f7390h = null;
                    }
                    if (this.f7396o.d() < i8) {
                        this.f7396o.u();
                    }
                    c cVar2 = this.f7396o;
                    cVar2.r(cVar2.e().g(i8).a(this.f7392j));
                    this.f7396o.z(i8);
                    c cVar3 = this.f7396o;
                    i7 = this.f7405d;
                    this.f7405d = -1;
                    if (i7 < 0) {
                        int[] iArr = cVar3.f7393k;
                        r6.k.f(iArr, "<this>");
                        int length = iArr.length;
                        int[] copyOf = Arrays.copyOf(iArr, length + 1);
                        copyOf[length] = i7;
                        cVar3.f7393k = copyOf;
                    } else {
                        cVar3.getClass();
                    }
                    c cVar4 = this.f7396o;
                    l lVar = this.f7392j;
                    cVar4.getClass();
                    synchronized (obj) {
                        cVar4.f7392j = cVar4.f7392j.w(lVar);
                        c cVar5 = this.f7396o;
                        int[] iArr2 = this.f7393k;
                        cVar5.getClass();
                        if (iArr2.length != 0) {
                            int[] iArr3 = cVar5.f7393k;
                            if (iArr3.length != 0) {
                                int length2 = iArr3.length;
                                int length3 = iArr2.length;
                                int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                                System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                                r6.k.c(copyOf2);
                                iArr2 = copyOf2;
                            }
                            cVar5.f7393k = iArr2;
                        }
                    }
                    this.f7395m = true;
                    if (!this.f7397p) {
                        this.f7397p = true;
                        this.f7396o.l();
                    }
                    return i.f7406b;
                }
                a();
                if (this.f7396o.d() < i8) {
                }
                c cVar22 = this.f7396o;
                cVar22.r(cVar22.e().g(i8).a(this.f7392j));
                this.f7396o.z(i8);
                c cVar32 = this.f7396o;
                i7 = this.f7405d;
                this.f7405d = -1;
                if (i7 < 0) {
                }
                c cVar42 = this.f7396o;
                l lVar2 = this.f7392j;
                cVar42.getClass();
                synchronized (obj) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
