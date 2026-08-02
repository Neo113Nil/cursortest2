package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cwo extends bms implements IInterface {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwo(bst bstVar, int i) {
        super("com.google.android.gms.auth.account.data.IGetStringValueCallback");
        this.b = i;
        this.a = bstVar;
    }

    @Override // defpackage.bms
    protected final boolean A(int i, Parcel parcel, Parcel parcel2) {
        int i2 = this.b;
        if (i2 == 0) {
            if (i != 1) {
                return false;
            }
            byte[] createByteArray = parcel.createByteArray();
            bmt.b(parcel);
            ((cme) this.a).d(new cwa(createByteArray, 0));
            return true;
        }
        if (i2 == 1) {
            if (i != 2) {
                return false;
            }
            Status status = (Status) bmt.a(parcel, Status.CREATOR);
            String readString = parcel.readString();
            bmt.b(parcel);
            ox.r(status, readString, (bst) this.a);
            return true;
        }
        if (i2 == 2) {
            if (i != 1) {
                return false;
            }
            byte[] createByteArray2 = parcel.createByteArray();
            bmt.b(parcel);
            ((cme) this.a).d(new cwa(createByteArray2, 2));
            return true;
        }
        if (i2 == 3) {
            if (i != 1) {
                return false;
            }
            Status status2 = (Status) bmt.a(parcel, Status.CREATOR);
            cxo cxoVar = (cxo) bmt.a(parcel, cxo.CREATOR);
            cmn cmnVar = (cmn) bmt.a(parcel, cmn.CREATOR);
            bmt.b(parcel);
            ox.t(status2, status2.c() ? cxoVar.a : null, (bst) this.a, cmnVar);
            return true;
        }
        if (i2 == 4) {
            if (i != 2) {
                return false;
            }
            byte[] createByteArray3 = parcel.createByteArray();
            bmt.b(parcel);
            ((cme) this.a).d(new cwa(createByteArray3, 4));
            return true;
        }
        if (i != 2) {
            return false;
        }
        Status status3 = (Status) bmt.a(parcel, Status.CREATOR);
        byte[] createByteArray4 = parcel.createByteArray();
        bmt.b(parcel);
        if (!status3.c()) {
            ox.r(status3, null, (bst) this.a);
            return true;
        }
        try {
            ox.r(status3, (euh) jkp.v(euh.a, createByteArray4, jkd.a), (bst) this.a);
            return true;
        } catch (jld e) {
            ((bst) this.a).b(e);
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwo(cme cmeVar, int i) {
        super("com.google.android.gms.inappreach.internal.IOnAccountHealthAlertsListener");
        this.b = i;
        this.a = cmeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwo(cme cmeVar, int i, byte[] bArr) {
        super("com.google.android.gms.inappreach.internal.IOnAccountMessagesListener");
        this.b = i;
        this.a = cmeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwo(bst bstVar, int i, byte[] bArr) {
        super("com.google.android.gms.mdisync.internal.IMdiSyncCallbacks");
        this.b = i;
        this.a = bstVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwo(bst bstVar, int i, char[] cArr) {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
        this.b = i;
        this.a = bstVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwo(cme cmeVar, int i, char[] cArr) {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
        this.b = i;
        this.a = cmeVar;
    }
}
