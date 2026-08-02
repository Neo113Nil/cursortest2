package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cor implements ddc {
    private final cog a;
    private final int b;
    private final cno c;
    private final long d;
    private final long e;

    public cor(cog cogVar, int i, cno cnoVar, long j, long j2) {
        this.a = cogVar;
        this.b = i;
        this.c = cnoVar;
        this.d = j;
        this.e = j2;
    }

    public static cpw b(coc cocVar, cpo cpoVar, int i) {
        int[] iArr;
        int[] iArr2;
        cpv cpvVar = cpoVar.n;
        cpw cpwVar = cpvVar == null ? null : cpvVar.d;
        if (cpwVar == null || !cpwVar.b || ((iArr = cpwVar.d) != null ? !oy.n(iArr, i) : !((iArr2 = cpwVar.f) == null || !oy.n(iArr2, i))) || cocVar.j >= cpwVar.e) {
            return null;
        }
        return cpwVar;
    }

    @Override // defpackage.ddc
    public final void a(ddi ddiVar) {
        coc b;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        cog cogVar = this.a;
        if (cogVar.g()) {
            cre creVar = crd.a().a;
            if ((creVar == null || creVar.b) && (b = cogVar.b(this.c)) != null) {
                Object obj = b.b;
                if (obj instanceof cpo) {
                    long j3 = this.d;
                    int i6 = 0;
                    boolean z = j3 > 0;
                    cpo cpoVar = (cpo) obj;
                    int i7 = cpoVar.i;
                    if (creVar != null) {
                        z &= creVar.c;
                        boolean B = cpoVar.B();
                        i = creVar.d;
                        i3 = creVar.e;
                        i2 = creVar.a;
                        if (B && !cpoVar.n()) {
                            cpw b2 = b(b, cpoVar, this.b);
                            if (b2 == null) {
                                return;
                            }
                            boolean z2 = b2.c && j3 > 0;
                            i3 = b2.e;
                            z = z2;
                        }
                    } else {
                        i = 5000;
                        i2 = 0;
                        i3 = 100;
                    }
                    int i8 = -1;
                    if (ddiVar.f()) {
                        i5 = 0;
                    } else if (((ddm) ddiVar).c) {
                        i6 = -1;
                        i5 = 100;
                    } else {
                        Exception c = ddiVar.c();
                        if (c instanceof cmm) {
                            Status status = ((cmm) c).a;
                            i4 = status.f;
                            clg clgVar = status.i;
                            if (clgVar != null) {
                                i5 = i4;
                                i6 = clgVar.c;
                            }
                        } else {
                            i4 = 101;
                        }
                        i5 = i4;
                        i6 = -1;
                    }
                    if (z) {
                        long j4 = this.e;
                        long currentTimeMillis = System.currentTimeMillis();
                        i8 = (int) (SystemClock.elapsedRealtime() - j4);
                        j = j3;
                        j2 = currentTimeMillis;
                    } else {
                        j = 0;
                        j2 = 0;
                    }
                    Handler handler = cogVar.o;
                    handler.sendMessage(handler.obtainMessage(18, new cos(new cqy(this.b, i5, i6, j, j2, null, null, i7, i8), i2, i, i3)));
                }
            }
        }
    }
}
