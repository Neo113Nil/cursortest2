package defpackage;

import android.os.Bundle;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.majelw.libystne.data.MaxLineDatabase_Impl;
import defpackage.aa2;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class dj implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ dj(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ds t;
        Object obj;
        boolean z = true;
        switch (this.m) {
            case 0:
                return (r01) ((kj) this.n).D.getValue();
            case 1:
                return io.a((io) this.n);
            case 2:
                return ((t21) this.n).b(":memory:");
            case 3:
                return Integer.valueOf(((List) this.n).size());
            case 4:
                ft0 ft0Var = (ft0) this.n;
                et0 et0Var = new et0(ft0Var.m, ft0Var.n, new at0(0), ft0Var.o);
                et0Var.setWriteAheadLoggingEnabled(ft0Var.q);
                return et0Var;
            case 5:
                MaxLineDatabase_Impl maxLineDatabase_Impl = ((z41) this.n).a;
                return Boolean.valueOf(!maxLineDatabase_Impl.g() || maxLineDatabase_Impl.h());
            case 6:
                return new pu1((ru1) this.n);
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                r72 r72Var = (r72) this.n;
                synchronized (r72Var.b) {
                    t = r72Var.t();
                    if (((o72) r72Var.t.getValue()).compareTo(o72.n) <= 0) {
                        Throwable th = r72Var.d;
                        CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                        cancellationException.initCause(th);
                        throw cancellationException;
                    }
                }
                if (t != null) {
                    aa2.a aVar = aa2.m;
                    ((fs) t).resumeWith(Unit.a);
                }
                return Unit.a;
            case 8:
                id2 id2Var = (id2) this.n;
                ce2 ce2Var = id2Var.m;
                Object obj2 = id2Var.p;
                if (obj2 != null) {
                    return ce2Var.i(id2Var, obj2);
                }
                lh.e("Value should be initialized");
                return null;
            case 9:
                od2 od2Var = (od2) this.n;
                mi1.c();
                Bundle o = iv1.o((Pair[]) Arrays.copyOf(new Pair[0], 0));
                od2Var.n.b(o);
                if (o.isEmpty()) {
                    return null;
                }
                return o;
            case 10:
                return z71.C((u53) this.n);
            case 11:
                zd2 zd2Var = (zd2) this.n;
                zd2Var.getLifecycle().a(new v72(0, zd2Var));
                return Unit.a;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                return this.n;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                ((Function0) this.n).invoke();
                return Unit.a;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                ck2 ck2Var = (ck2) this.n;
                lz1 lz1Var = ck2Var.o;
                if (((ql2) lz1Var.getValue()).a == 9205357640488583168L || ql2.e(((ql2) lz1Var.getValue()).a)) {
                    return null;
                }
                return ck2Var.m.b(((ql2) lz1Var.getValue()).a);
            default:
                hn2 hn2Var = (hn2) this.n;
                while (true) {
                    Object obj3 = hn2Var.g;
                    synchronized (obj3) {
                        try {
                            if (hn2Var.c) {
                                obj = obj3;
                            } else {
                                hn2Var.c = z;
                                try {
                                    eo1 eo1Var = hn2Var.f;
                                    Object[] objArr = eo1Var.m;
                                    int i = eo1Var.o;
                                    int i2 = 0;
                                    while (i2 < i) {
                                        gn2 gn2Var = (gn2) objArr[i2];
                                        un1 un1Var = gn2Var.g;
                                        Function1 function1 = gn2Var.a;
                                        Object[] objArr2 = un1Var.b;
                                        long[] jArr = un1Var.a;
                                        int length = jArr.length - 2;
                                        if (length >= 0) {
                                            int i3 = 0;
                                            while (true) {
                                                long j = jArr[i3];
                                                obj = obj3;
                                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                                                    for (int i5 = 0; i5 < i4; i5++) {
                                                        if ((j & 255) < 128) {
                                                            try {
                                                                function1.invoke(objArr2[(i3 << 3) + i5]);
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                hn2Var.c = false;
                                                                throw th;
                                                            }
                                                        }
                                                        j >>= 8;
                                                    }
                                                    if (i4 != 8) {
                                                    }
                                                }
                                                if (i3 != length) {
                                                    i3++;
                                                    obj3 = obj;
                                                }
                                            }
                                        } else {
                                            obj = obj3;
                                        }
                                        un1Var.b();
                                        i2++;
                                        obj3 = obj;
                                    }
                                    obj = obj3;
                                    try {
                                        hn2Var.c = false;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    obj = obj3;
                                }
                            }
                            Unit unit = Unit.a;
                            if (!hn2Var.b()) {
                                return Unit.a;
                            }
                            z = true;
                        } catch (Throwable th5) {
                            th = th5;
                            obj = obj3;
                        }
                    }
                }
        }
    }
}
