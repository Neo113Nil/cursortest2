package H5;

import android.os.Parcel;

/* loaded from: classes.dex */
public class r extends RuntimeException {
    public r(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
