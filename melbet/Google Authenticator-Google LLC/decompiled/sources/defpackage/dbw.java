package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.util.Pair;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dbw extends cms {
    public static final /* synthetic */ int k = 0;

    static {
        Pair.create(new dih(), dih.w(null));
    }

    public dbw(Context context) {
        super(context, null, dbs.a, cmk.a, cmr.a);
    }

    private static ddi s() {
        return dih.v(new cmm(new Status(16, null, null, null)));
    }

    public final ddi a(dbx[] dbxVarArr) {
        if (!p(11021000)) {
            return s();
        }
        cpa cpaVar = new cpa();
        cpaVar.a = new czj(dbxVarArr, 2);
        return super.i(0, cpaVar.a());
    }

    public final ddi b(String str) {
        cpa cpaVar = new cpa();
        cpaVar.a = new czj(str, 3);
        return super.i(0, cpaVar.a());
    }

    public final ddi c(etm etmVar) {
        etmVar.getClass();
        cpa cpaVar = new cpa();
        cpaVar.a = new czj(etmVar, 4);
        cpaVar.b = new cli[]{dbm.a};
        cpaVar.b(false);
        return super.i(0, cpaVar.a());
    }

    public final ddi d() {
        cpa cpaVar = new cpa();
        cpaVar.a = new czc(3);
        cpaVar.b = new cli[]{dbm.i};
        cpaVar.b(false);
        return super.i(0, cpaVar.a());
    }

    public final /* synthetic */ ddi e(String str, byte[] bArr, ddi ddiVar) {
        if (ddiVar.f()) {
            return ddiVar;
        }
        if (!p(11925000)) {
            return s();
        }
        cpa cpaVar = new cpa();
        cpaVar.a = new cik(str, (Object) bArr, 13);
        return super.i(0, cpaVar.a());
    }

    public final ddi f(final String str, final int i, final String[] strArr, final byte[] bArr) {
        cpa cpaVar = new cpa();
        cpaVar.a = new cox() { // from class: dbu
            @Override // defpackage.cox
            public final void a(Object obj, Object obj2) {
                int i2 = dbw.k;
                dbz dbzVar = new dbz((bst) obj2, 0);
                dca dcaVar = (dca) ((dcb) obj).v();
                Parcel a = dcaVar.a();
                bmt.d(a, dbzVar);
                a.writeString(str);
                a.writeInt(i);
                a.writeStringArray(strArr);
                a.writeByteArray(bArr);
                dcaVar.c(1, a);
            }
        };
        return super.i(0, cpaVar.a());
    }

    public final ddi o(String str, iad iadVar) {
        cpa cpaVar = new cpa();
        cpaVar.a = new cik((Object) str, (Object) iadVar, 16);
        cpaVar.b = new cli[]{dbm.h};
        cpaVar.b(false);
        return super.i(0, cpaVar.a());
    }

    public final boolean p(int i) {
        return clm.d.l(this.a, i) == 0;
    }

    public final ddi q(String str) {
        if (!p(12451000)) {
            return s();
        }
        cpa cpaVar = new cpa();
        cpaVar.a = new cik(str, 15);
        return super.i(0, cpaVar.a());
    }

    public final ddi r(String str, String str2) {
        cpa cpaVar = new cpa();
        cpaVar.a = new cik(str, (Object) str2, 12);
        return super.i(0, cpaVar.a());
    }
}
