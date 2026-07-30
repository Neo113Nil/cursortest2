package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class tm extends RuntimeException {
    public tm(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
