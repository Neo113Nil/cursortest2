package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class ba extends q5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2166d = 2;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2167e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(da daVar, b7.f fVar) {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
        this.f2167e = fVar;
    }

    @Override // com.google.android.gms.internal.measurement.q5
    public final boolean C(int i3, Parcel parcel, Parcel parcel2) {
        switch (this.f2166d) {
            case 0:
                if (i3 == 2) {
                    Status status = (Status) r5.a(parcel, Status.CREATOR);
                    byte[] createByteArray = parcel.createByteArray();
                    r5.d(parcel);
                    w7.g gVar = (w7.g) this.f2167e;
                    if (status.f2119d <= 0) {
                        try {
                            c1 c1Var = c1.f2180a;
                            int i10 = q0.f2690a;
                            a.a.b0(status, zb.v(createByteArray, c1.f2181b), gVar);
                        } catch (v1 e2) {
                            gVar.f10117a.m(e2);
                        }
                    } else {
                        a.a.b0(status, null, gVar);
                    }
                    break;
                }
                break;
            case 1:
                w7.g gVar2 = (w7.g) this.f2167e;
                switch (i3) {
                    case 1:
                        Status status2 = (Status) r5.a(parcel, Status.CREATOR);
                        r5.d(parcel);
                        a.a.b0(status2, null, gVar2);
                        break;
                    case 2:
                        Status status3 = (Status) r5.a(parcel, Status.CREATOR);
                        r5.d(parcel);
                        a.a.b0(status3, null, gVar2);
                        break;
                    case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                        Status status4 = (Status) r5.a(parcel, Status.CREATOR);
                        r5.d(parcel);
                        a.a.b0(status4, null, gVar2);
                        break;
                    case a4.j.LONG_FIELD_NUMBER /* 4 */:
                        Status status5 = (Status) r5.a(parcel, Status.CREATOR);
                        t9 t9Var = (t9) r5.a(parcel, t9.CREATOR);
                        r5.d(parcel);
                        a.a.b0(status5, t9Var, gVar2);
                        break;
                    case a4.j.STRING_FIELD_NUMBER /* 5 */:
                        Status status6 = (Status) r5.a(parcel, Status.CREATOR);
                        r5.d(parcel);
                        a.a.b0(status6, null, gVar2);
                        break;
                    case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        Status status7 = (Status) r5.a(parcel, Status.CREATOR);
                        v9 v9Var = (v9) r5.a(parcel, v9.CREATOR);
                        r5.d(parcel);
                        a.a.b0(status7, v9Var, gVar2);
                        break;
                    case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        Status status8 = (Status) r5.a(parcel, Status.CREATOR);
                        u9 u9Var = (u9) r5.a(parcel, u9.CREATOR);
                        r5.d(parcel);
                        a.a.b0(status8, u9Var, gVar2);
                        break;
                    case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                        Status status9 = (Status) r5.a(parcel, Status.CREATOR);
                        r5.d(parcel);
                        a.a.b0(status9, null, gVar2);
                        break;
                    case 9:
                        Status status10 = (Status) r5.a(parcel, Status.CREATOR);
                        w9 w9Var = (w9) r5.a(parcel, w9.CREATOR);
                        r5.d(parcel);
                        a.a.b0(status10, w9Var, gVar2);
                        break;
                    case 10:
                        Status status11 = (Status) r5.a(parcel, Status.CREATOR);
                        t9 t9Var2 = (t9) r5.a(parcel, t9.CREATOR);
                        r5.d(parcel);
                        a.a.b0(status11, t9Var2, gVar2);
                        break;
                    case RequestError.STOP_TRACKING /* 11 */:
                        Status status12 = (Status) r5.a(parcel, Status.CREATOR);
                        parcel.readLong();
                        r5.d(parcel);
                        a.a.b0(status12, null, gVar2);
                        break;
                    case 12:
                        Status status13 = (Status) r5.a(parcel, Status.CREATOR);
                        r5.d(parcel);
                        a.a.b0(status13, null, gVar2);
                        break;
                    case 13:
                        Status status14 = (Status) r5.a(parcel, Status.CREATOR);
                        y9 y9Var = (y9) r5.a(parcel, y9.CREATOR);
                        r5.d(parcel);
                        a.a.b0(status14, y9Var, gVar2);
                        break;
                    case 14:
                        Status status15 = (Status) r5.a(parcel, Status.CREATOR);
                        r5.d(parcel);
                        a.a.b0(status15, null, gVar2);
                        break;
                    case 15:
                        Status status16 = (Status) r5.a(parcel, Status.CREATOR);
                        r5.d(parcel);
                        a.a.b0(status16, null, gVar2);
                        break;
                    case 16:
                        Status status17 = (Status) r5.a(parcel, Status.CREATOR);
                        long readLong = parcel.readLong();
                        r5.d(parcel);
                        a.a.b0(status17, Long.valueOf(readLong), gVar2);
                        break;
                }
                break;
            default:
                if (i3 == 2) {
                    byte[] createByteArray2 = parcel.createByteArray();
                    r5.d(parcel);
                    v5 v5Var = new v5(this, createByteArray2);
                    b7.f fVar = (b7.f) this.f2167e;
                    fVar.f1285a.execute(new f8.j0(3, fVar, v5Var));
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(da daVar, w7.g gVar) {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
        this.f2167e = gVar;
    }

    public ba(w7.g gVar) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.f2167e = gVar;
    }
}
