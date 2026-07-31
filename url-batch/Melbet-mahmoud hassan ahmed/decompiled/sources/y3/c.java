package y3;

import android.os.Parcel;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final ClassLoader f23469a = c.class.getClassLoader();

    private c() {
    }

    public static void a(Parcel parcel, boolean z6) {
        parcel.writeInt(1);
    }

    public static boolean b(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
