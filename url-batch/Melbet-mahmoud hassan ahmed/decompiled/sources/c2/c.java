package c2;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import m4.q;

/* loaded from: classes.dex */
public final class c {
    public q<b> a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return o2.c.b(b.f1823x, (ArrayList) o2.a.e(readBundle.getParcelableArrayList("c")));
    }
}
