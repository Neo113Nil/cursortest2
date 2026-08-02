package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ag implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public ag(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new ah(parcel);
            case 1:
                return new af(parcel);
            case 2:
                return new bu(parcel);
            case 3:
                return new bz(parcel);
            case 4:
                return new cc(parcel);
            case 5:
                return new ResultReceiver(parcel);
            case 6:
                return new hj(parcel);
            case 7:
                return new im(parcel);
            case 8:
                return new kf(parcel);
            case 9:
                return new lx(parcel);
            case 10:
                return new ly(parcel);
            case 11:
                parcel.getClass();
                return new oa(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                parcel.getClass();
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                readParcelable.getClass();
                return new oj((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new abj(parcel);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new ahp(parcel);
            case 15:
                return new ahs(parcel);
            case 16:
                return new ahw(parcel);
            case 17:
                return new ahz(parcel);
            case 18:
                return new aik(parcel);
            case 19:
                return new aiy(parcel);
            default:
                return new aja(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ah[i];
            case 1:
                return new af[i];
            case 2:
                return new bu[i];
            case 3:
                return new bz[i];
            case 4:
                return new cc[i];
            case 5:
                return new ResultReceiver[i];
            case 6:
                return new hj[i];
            case 7:
                return new im[i];
            case 8:
                return new kf[i];
            case 9:
                return new lx[i];
            case 10:
                return new ly[i];
            case 11:
                return new oa[i];
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new oj[i];
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new abj[i];
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new ahp[i];
            case 15:
                return new ahs[i];
            case 16:
                return new ahw[i];
            case 17:
                return new ahz[i];
            case 18:
                return new aik[i];
            case 19:
                return new aiy[i];
            default:
                return new aja[i];
        }
    }
}
