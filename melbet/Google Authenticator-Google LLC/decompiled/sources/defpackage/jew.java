package defpackage;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jew implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int R = oy.R(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        Point[] pointArr = null;
        jeo jeoVar = null;
        jer jerVar = null;
        jes jesVar = null;
        jeu jeuVar = null;
        jet jetVar = null;
        jep jepVar = null;
        jel jelVar = null;
        jem jemVar = null;
        jen jenVar = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < R) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = oy.P(parcel, readInt);
                    break;
                case 2:
                    str = oy.Z(parcel, readInt);
                    break;
                case 3:
                    str2 = oy.Z(parcel, readInt);
                    break;
                case 4:
                    bArr = oy.ag(parcel, readInt);
                    break;
                case 5:
                    pointArr = (Point[]) oy.ai(parcel, readInt, Point.CREATOR);
                    break;
                case 6:
                    i2 = oy.P(parcel, readInt);
                    break;
                case 7:
                    jeoVar = (jeo) oy.V(parcel, readInt, jeo.CREATOR);
                    break;
                case '\b':
                    jerVar = (jer) oy.V(parcel, readInt, jer.CREATOR);
                    break;
                case '\t':
                    jesVar = (jes) oy.V(parcel, readInt, jes.CREATOR);
                    break;
                case '\n':
                    jeuVar = (jeu) oy.V(parcel, readInt, jeu.CREATOR);
                    break;
                case 11:
                    jetVar = (jet) oy.V(parcel, readInt, jet.CREATOR);
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    jepVar = (jep) oy.V(parcel, readInt, jep.CREATOR);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    jelVar = (jel) oy.V(parcel, readInt, jel.CREATOR);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    jemVar = (jem) oy.V(parcel, readInt, jem.CREATOR);
                    break;
                case 15:
                    jenVar = (jen) oy.V(parcel, readInt, jen.CREATOR);
                    break;
                default:
                    oy.ae(parcel, readInt);
                    break;
            }
        }
        oy.ad(parcel, R);
        return new jev(i, str, str2, bArr, pointArr, i2, jeoVar, jerVar, jesVar, jeuVar, jetVar, jepVar, jelVar, jemVar, jenVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new jev[i];
    }
}
