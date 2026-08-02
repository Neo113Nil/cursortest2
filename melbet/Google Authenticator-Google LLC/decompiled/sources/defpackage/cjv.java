package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cjv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int R = oy.R(parcel);
        ckr ckrVar = null;
        byte[] bArr = null;
        int[] iArr = null;
        String[] strArr = null;
        int[] iArr2 = null;
        byte[][] bArr2 = null;
        dbl[] dblVarArr = null;
        ckp ckpVar = null;
        String[] strArr2 = null;
        ckj ckjVar = null;
        ckd ckdVar = null;
        byte[] bArr3 = null;
        Long l = null;
        int i = 0;
        boolean z = true;
        while (parcel.dataPosition() < R) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    ckrVar = (ckr) oy.V(parcel, readInt, ckr.CREATOR);
                    break;
                case 3:
                    bArr = oy.ag(parcel, readInt);
                    break;
                case 4:
                    iArr = oy.ah(parcel, readInt);
                    break;
                case 5:
                    strArr = oy.aj(parcel, readInt);
                    break;
                case 6:
                    iArr2 = oy.ah(parcel, readInt);
                    break;
                case 7:
                    bArr2 = oy.ak(parcel, readInt);
                    break;
                case '\b':
                    z = oy.af(parcel, readInt);
                    break;
                case '\t':
                    dblVarArr = (dbl[]) oy.ai(parcel, readInt, dbl.CREATOR);
                    break;
                case '\n':
                default:
                    oy.ae(parcel, readInt);
                    break;
                case 11:
                    ckpVar = (ckp) oy.V(parcel, readInt, ckp.CREATOR);
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    strArr2 = oy.aj(parcel, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    i = oy.P(parcel, readInt);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    ckjVar = (ckj) oy.V(parcel, readInt, ckj.CREATOR);
                    break;
                case 15:
                    ckdVar = (ckd) oy.V(parcel, readInt, ckd.CREATOR);
                    break;
                case 16:
                    bArr3 = oy.ag(parcel, readInt);
                    break;
                case 17:
                    l = oy.Y(parcel, readInt);
                    break;
            }
        }
        oy.ad(parcel, R);
        return new cju(ckrVar, bArr, iArr, strArr, iArr2, bArr2, z, dblVarArr, ckpVar, strArr2, i, ckjVar, ckdVar, bArr3, l);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new cju[i];
    }
}
