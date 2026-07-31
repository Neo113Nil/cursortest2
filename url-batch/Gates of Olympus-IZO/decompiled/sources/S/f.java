package S;

import j.C0475A;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class f extends e {

    /* renamed from: o, reason: collision with root package name */
    public final e f3203o;
    public boolean p;

    public f(int i3, n nVar, Y1.c cVar, Y1.c cVar2, e eVar) {
        super(i3, nVar, cVar, cVar2);
        this.f3203o = eVar;
        eVar.k();
    }

    @Override // S.e, S.i
    public final void c() {
        if (this.f3210c) {
            return;
        }
        super.c();
        if (this.p) {
            return;
        }
        this.p = true;
        this.f3203o.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0066 A[Catch: all -> 0x0058, TryCatch #1 {all -> 0x0058, blocks: (B:11:0x0020, B:13:0x0025, B:16:0x002a, B:21:0x0044, B:23:0x004c, B:24:0x005e, B:26:0x0066, B:27:0x006b, B:29:0x008c, B:30:0x00a2, B:31:0x00a9, B:34:0x00b2, B:35:0x00b3, B:44:0x00be, B:47:0x00d4, B:48:0x00c4, B:51:0x00e9, B:52:0x00ea, B:53:0x009f, B:54:0x0050, B:55:0x005b, B:33:0x00aa), top: B:10:0x0020, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c A[Catch: all -> 0x0058, TryCatch #1 {all -> 0x0058, blocks: (B:11:0x0020, B:13:0x0025, B:16:0x002a, B:21:0x0044, B:23:0x004c, B:24:0x005e, B:26:0x0066, B:27:0x006b, B:29:0x008c, B:30:0x00a2, B:31:0x00a9, B:34:0x00b2, B:35:0x00b3, B:44:0x00be, B:47:0x00d4, B:48:0x00c4, B:51:0x00e9, B:52:0x00ea, B:53:0x009f, B:54:0x0050, B:55:0x005b, B:33:0x00aa), top: B:10:0x0020, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f A[Catch: all -> 0x0058, TryCatch #1 {all -> 0x0058, blocks: (B:11:0x0020, B:13:0x0025, B:16:0x002a, B:21:0x0044, B:23:0x004c, B:24:0x005e, B:26:0x0066, B:27:0x006b, B:29:0x008c, B:30:0x00a2, B:31:0x00a9, B:34:0x00b2, B:35:0x00b3, B:44:0x00be, B:47:0x00d4, B:48:0x00c4, B:51:0x00e9, B:52:0x00ea, B:53:0x009f, B:54:0x0050, B:55:0x005b, B:33:0x00aa), top: B:10:0x0020, inners: #0 }] */
    @Override // S.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u v() {
        int i3;
        e eVar = this.f3203o;
        if (eVar.f3202m || eVar.f3210c) {
            return new j();
        }
        C0475A c0475a = this.f3197h;
        int i4 = this.f3209b;
        HashMap c3 = c0475a != null ? q.c(eVar, this, eVar.e()) : null;
        Object obj = q.f3235b;
        synchronized (obj) {
            try {
                q.d(this);
                if (c0475a != null && c0475a.f5132d != 0) {
                    u y3 = y(this.f3203o.d(), c3, this.f3203o.e());
                    if (!y3.equals(k.f3212b)) {
                        return y3;
                    }
                    C0475A w3 = this.f3203o.w();
                    if (w3 != null) {
                        w3.i(c0475a);
                    } else {
                        this.f3203o.A(c0475a);
                        this.f3197h = null;
                    }
                    if (this.f3203o.d() < i4) {
                        this.f3203o.u();
                    }
                    e eVar2 = this.f3203o;
                    eVar2.r(eVar2.e().c(i4).b(this.f3199j));
                    this.f3203o.z(i4);
                    e eVar3 = this.f3203o;
                    i3 = this.f3211d;
                    this.f3211d = -1;
                    if (i3 < 0) {
                        int[] iArr = eVar3.f3200k;
                        Z1.i.f(iArr, "<this>");
                        int length = iArr.length;
                        int[] copyOf = Arrays.copyOf(iArr, length + 1);
                        copyOf[length] = i3;
                        eVar3.f3200k = copyOf;
                    } else {
                        eVar3.getClass();
                    }
                    e eVar4 = this.f3203o;
                    n nVar = this.f3199j;
                    eVar4.getClass();
                    synchronized (obj) {
                        eVar4.f3199j = eVar4.f3199j.i(nVar);
                        e eVar5 = this.f3203o;
                        int[] iArr2 = this.f3200k;
                        eVar5.getClass();
                        if (iArr2.length != 0) {
                            int[] iArr3 = eVar5.f3200k;
                            if (iArr3.length != 0) {
                                int length2 = iArr3.length;
                                int length3 = iArr2.length;
                                int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                                System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                                Z1.i.c(copyOf2);
                                iArr2 = copyOf2;
                            }
                            eVar5.f3200k = iArr2;
                        }
                    }
                    this.f3202m = true;
                    if (!this.p) {
                        this.p = true;
                        this.f3203o.l();
                    }
                    return k.f3212b;
                }
                a();
                if (this.f3203o.d() < i4) {
                }
                e eVar22 = this.f3203o;
                eVar22.r(eVar22.e().c(i4).b(this.f3199j));
                this.f3203o.z(i4);
                e eVar32 = this.f3203o;
                i3 = this.f3211d;
                this.f3211d = -1;
                if (i3 < 0) {
                }
                e eVar42 = this.f3203o;
                n nVar2 = this.f3199j;
                eVar42.getClass();
                synchronized (obj) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
