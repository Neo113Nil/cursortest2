package d7;

import android.os.Parcel;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends RuntimeException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(String str, Parcel parcel) {
        super(r2.toString());
        int dataPosition = parcel.dataPosition();
        int dataSize = parcel.dataSize();
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(dataPosition).length() + 6 + String.valueOf(dataSize).length());
        sb2.append(str);
        sb2.append(" Parcel: pos=");
        sb2.append(dataPosition);
        sb2.append(" size=");
        sb2.append(dataSize);
    }
}
