package defpackage;

import android.os.Parcel;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ixa {
    public static void a() {
        jxh.a().c();
    }

    public static int b(Parcel parcel, kbq kbqVar) {
        int i = kbqVar.o.r;
        String str = kbqVar.p;
        if (str != null && str.length() > 1000) {
            str = str.substring(0, 1000);
        }
        int i2 = i << 16;
        if (str == null) {
            return i2;
        }
        int i3 = i2 | 32;
        parcel.writeString(str);
        return i3;
    }

    public static void c(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(0);
        parcel.writeInt(i);
        parcel.setDataPosition(dataPosition);
    }

    public static boolean d(int i, int i2) {
        return (i & i2) != 0;
    }

    public static final kuq e(Map map) {
        return new kuq(her.i(map));
    }
}
