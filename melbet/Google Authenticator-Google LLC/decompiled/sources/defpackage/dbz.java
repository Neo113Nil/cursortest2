package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dbz extends bms implements IInterface {
    private final /* synthetic */ int a;
    private final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbz(bst bstVar, int i, byte[] bArr) {
        super("com.google.android.gms.clearcut.sampler.IDeviceSamplerCallback");
        this.a = i;
        this.b = bstVar;
    }

    @Override // defpackage.bms
    protected final boolean A(int i, Parcel parcel, Parcel parcel2) {
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i != 2) {
                    return false;
                }
                ((cme) this.b).d(new dah(2));
                return true;
            }
            if (i != 2) {
                return false;
            }
            Status status = (Status) bmt.a(parcel, Status.CREATOR);
            cld cldVar = (cld) bmt.a(parcel, cld.CREATOR);
            bmt.b(parcel);
            ox.r(status, cldVar, (bst) this.b);
            return true;
        }
        switch (i) {
            case 1:
                Status status2 = (Status) bmt.a(parcel, Status.CREATOR);
                bmt.b(parcel);
                ox.r(status2, null, (bst) this.b);
                return true;
            case 2:
                Status status3 = (Status) bmt.a(parcel, Status.CREATOR);
                bmt.b(parcel);
                ox.r(status3, null, (bst) this.b);
                return true;
            case 3:
                Status status4 = (Status) bmt.a(parcel, Status.CREATOR);
                bmt.b(parcel);
                ox.r(status4, null, (bst) this.b);
                return true;
            case 4:
                Status status5 = (Status) bmt.a(parcel, Status.CREATOR);
                dbg dbgVar = (dbg) bmt.a(parcel, dbg.CREATOR);
                bmt.b(parcel);
                ox.r(status5, dbgVar, (bst) this.b);
                return true;
            case 5:
                Status status6 = (Status) bmt.a(parcel, Status.CREATOR);
                bmt.b(parcel);
                ox.r(status6, null, (bst) this.b);
                return true;
            case 6:
                Status status7 = (Status) bmt.a(parcel, Status.CREATOR);
                dbl dblVar = (dbl) bmt.a(parcel, dbl.CREATOR);
                bmt.b(parcel);
                ox.r(status7, dblVar, (bst) this.b);
                return true;
            case 7:
                Status status8 = (Status) bmt.a(parcel, Status.CREATOR);
                dbi dbiVar = (dbi) bmt.a(parcel, dbi.CREATOR);
                bmt.b(parcel);
                ox.r(status8, dbiVar, (bst) this.b);
                return true;
            case 8:
                Status status9 = (Status) bmt.a(parcel, Status.CREATOR);
                bmt.b(parcel);
                ox.r(status9, null, (bst) this.b);
                return true;
            case 9:
                Status status10 = (Status) bmt.a(parcel, Status.CREATOR);
                dbn dbnVar = (dbn) bmt.a(parcel, dbn.CREATOR);
                bmt.b(parcel);
                ox.r(status10, dbnVar, (bst) this.b);
                return true;
            case 10:
                Status status11 = (Status) bmt.a(parcel, Status.CREATOR);
                dbg dbgVar2 = (dbg) bmt.a(parcel, dbg.CREATOR);
                bmt.b(parcel);
                ox.r(status11, dbgVar2, (bst) this.b);
                return true;
            case 11:
                Status status12 = (Status) bmt.a(parcel, Status.CREATOR);
                parcel.readLong();
                bmt.b(parcel);
                ox.r(status12, null, (bst) this.b);
                return true;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Status status13 = (Status) bmt.a(parcel, Status.CREATOR);
                bmt.b(parcel);
                ox.r(status13, null, (bst) this.b);
                return true;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Status status14 = (Status) bmt.a(parcel, Status.CREATOR);
                dbp dbpVar = (dbp) bmt.a(parcel, dbp.CREATOR);
                bmt.b(parcel);
                ox.r(status14, dbpVar, (bst) this.b);
                return true;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Status status15 = (Status) bmt.a(parcel, Status.CREATOR);
                bmt.b(parcel);
                ox.r(status15, null, (bst) this.b);
                return true;
            case 15:
                Status status16 = (Status) bmt.a(parcel, Status.CREATOR);
                bmt.b(parcel);
                ox.r(status16, null, (bst) this.b);
                return true;
            case 16:
                Status status17 = (Status) bmt.a(parcel, Status.CREATOR);
                long readLong = parcel.readLong();
                bmt.b(parcel);
                ox.r(status17, Long.valueOf(readLong), (bst) this.b);
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbz(bst bstVar, int i) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.a = i;
        this.b = bstVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbz(cme cmeVar, int i) {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener");
        this.a = i;
        this.b = cmeVar;
    }
}
