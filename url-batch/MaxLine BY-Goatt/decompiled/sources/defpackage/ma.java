package defpackage;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class ma implements yt0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ ma(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    @Override // defpackage.yt0
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.m;
        Object obj5 = this.n;
        switch (i) {
            case 0:
                na naVar = (na) obj5;
                j13 b = ((jp0) naVar.q).b((ip0) obj, (jq0) obj2, ((fq0) obj3).a, ((gq0) obj4).a);
                if (b instanceof i13) {
                    Object obj6 = ((i13) b).m;
                    obj6.getClass();
                    return (Typeface) obj6;
                }
                mh mhVar = new mh(b, naVar.v);
                naVar.v = mhVar;
                Object obj7 = mhVar.p;
                obj7.getClass();
                return (Typeface) obj7;
            case 1:
                int intValue = ((Integer) obj2).intValue();
                a00 a00Var = (a00) obj3;
                ((Integer) obj4).getClass();
                ((ly1) obj).getClass();
                ul2 ul2Var = (ul2) ((List) obj5).get(intValue);
                sl1 sl1Var = sl1.a;
                vl1 b2 = b.b(sl1Var, 1.0f);
                qw a = ow.a(s93.d, qb2.B, a00Var, 54);
                int D = iv1.D(a00Var);
                v02 l = a00Var.l();
                vl1 E = bd3.E(a00Var, b2);
                pz.b.getClass();
                o00 o00Var = oz.b;
                a00Var.b0();
                if (a00Var.S) {
                    a00Var.k(o00Var);
                } else {
                    a00Var.l0();
                }
                uj2.e(a00Var, a, oz.f);
                uj2.e(a00Var, l, oz.e);
                sc scVar = oz.g;
                if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                    q40.r(D, a00Var, D, scVar);
                }
                uj2.e(a00Var, E, oz.d);
                l41.g(o70.G(ul2Var.a, a00Var), b.h(sl1Var, 220.0f), null, null, 0.0f, a00Var, 432, 120);
                String f = uj2.f(ul2Var.b, a00Var);
                bp2 bp2Var = n13.a;
                yv2.b(f, a.k(sl1Var, 0.0f, 24.0f, 0.0f, 13), cw.h, 0L, null, 0L, new ut2(3), 0L, 0, false, 0, 0, ((l13) a00Var.j(bp2Var)).e, a00Var, 432, 0, 65016);
                yv2.b(uj2.f(ul2Var.c, a00Var), a.k(sl1Var, 0.0f, 12.0f, 0.0f, 13), cw.i, 0L, null, 0L, new ut2(3), 0L, 0, false, 0, 0, ((l13) a00Var.j(bp2Var)).j, a00Var, 432, 0, 65016);
                a00Var.q(true);
                return Unit.a;
            default:
                SQLiteCursorDriver sQLiteCursorDriver = (SQLiteCursorDriver) obj2;
                String str = (String) obj3;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                gt0 gt0Var = new gt0(sQLiteQuery);
                fr2 fr2Var = (fr2) ((at0) obj5).m;
                int length = fr2Var.p.length;
                for (int i2 = 1; i2 < length; i2++) {
                    int i3 = fr2Var.p[i2];
                    if (i3 == 1) {
                        gt0Var.d(fr2Var.q[i2], i2);
                    } else if (i3 == 2) {
                        gt0Var.a(fr2Var.r[i2], i2);
                    } else if (i3 == 3) {
                        String str2 = fr2Var.s[i2];
                        str2.getClass();
                        gt0Var.l(i2, str2);
                    } else if (i3 == 4) {
                        byte[] bArr = fr2Var.t[i2];
                        bArr.getClass();
                        gt0Var.D(i2, bArr);
                    } else if (i3 == 5) {
                        gt0Var.c(i2);
                    }
                }
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}
