package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ctp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int R = oy.R(parcel);
        String str = null;
        Bundle bundle = null;
        String str2 = null;
        ApplicationErrorReport applicationErrorReport = null;
        String str3 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str4 = null;
        ArrayList arrayList = null;
        ctw ctwVar = null;
        ctr ctrVar = null;
        Bitmap bitmap = null;
        String str5 = null;
        String str6 = null;
        ctj ctjVar = null;
        String str7 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        long j = 0;
        while (parcel.dataPosition() < R) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = oy.Z(parcel, readInt);
                    break;
                case 3:
                    bundle = oy.T(parcel, readInt);
                    break;
                case 4:
                default:
                    oy.ae(parcel, readInt);
                    break;
                case 5:
                    str2 = oy.Z(parcel, readInt);
                    break;
                case 6:
                    applicationErrorReport = (ApplicationErrorReport) oy.V(parcel, readInt, ApplicationErrorReport.CREATOR);
                    break;
                case 7:
                    str3 = oy.Z(parcel, readInt);
                    break;
                case '\b':
                    bitmapTeleporter = (BitmapTeleporter) oy.V(parcel, readInt, BitmapTeleporter.CREATOR);
                    break;
                case '\t':
                    str4 = oy.Z(parcel, readInt);
                    break;
                case '\n':
                    arrayList = oy.ac(parcel, readInt, ctq.CREATOR);
                    break;
                case 11:
                    z = oy.af(parcel, readInt);
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    ctwVar = (ctw) oy.V(parcel, readInt, ctw.CREATOR);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    ctrVar = (ctr) oy.V(parcel, readInt, ctr.CREATOR);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    z2 = oy.af(parcel, readInt);
                    break;
                case 15:
                    bitmap = (Bitmap) oy.V(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 16:
                    str5 = oy.Z(parcel, readInt);
                    break;
                case 17:
                    z3 = oy.af(parcel, readInt);
                    break;
                case 18:
                    j = oy.S(parcel, readInt);
                    break;
                case 19:
                    z4 = oy.af(parcel, readInt);
                    break;
                case 20:
                    str6 = oy.Z(parcel, readInt);
                    break;
                case 21:
                    ctjVar = (ctj) oy.V(parcel, readInt, ctj.CREATOR);
                    break;
                case 22:
                    str7 = oy.Z(parcel, readInt);
                    break;
            }
        }
        oy.ad(parcel, R);
        return new cto(str, bundle, str2, applicationErrorReport, str3, bitmapTeleporter, str4, arrayList, z, ctwVar, ctrVar, z2, bitmap, str5, z3, j, z4, str6, ctjVar, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new cto[i];
    }
}
