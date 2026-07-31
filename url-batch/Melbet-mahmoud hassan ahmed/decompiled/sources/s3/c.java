package s3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.List;

/* loaded from: classes.dex */
public class c {
    public static int a(@RecentlyNonNull Parcel parcel) {
        return s(parcel, 20293);
    }

    public static void b(@RecentlyNonNull Parcel parcel, int i7) {
        t(parcel, i7);
    }

    public static void c(@RecentlyNonNull Parcel parcel, int i7, boolean z6) {
        r(parcel, i7, 4);
        parcel.writeInt(z6 ? 1 : 0);
    }

    public static void d(@RecentlyNonNull Parcel parcel, int i7, @RecentlyNonNull Bundle bundle, boolean z6) {
        if (bundle == null) {
            if (z6) {
                r(parcel, i7, 0);
            }
        } else {
            int s7 = s(parcel, i7);
            parcel.writeBundle(bundle);
            t(parcel, s7);
        }
    }

    public static void e(@RecentlyNonNull Parcel parcel, int i7, @RecentlyNonNull byte[] bArr, boolean z6) {
        if (bArr == null) {
            if (z6) {
                r(parcel, i7, 0);
            }
        } else {
            int s7 = s(parcel, i7);
            parcel.writeByteArray(bArr);
            t(parcel, s7);
        }
    }

    public static void f(@RecentlyNonNull Parcel parcel, int i7, float f7) {
        r(parcel, i7, 4);
        parcel.writeFloat(f7);
    }

    public static void g(@RecentlyNonNull Parcel parcel, int i7, @RecentlyNonNull IBinder iBinder, boolean z6) {
        if (iBinder == null) {
            if (z6) {
                r(parcel, i7, 0);
            }
        } else {
            int s7 = s(parcel, i7);
            parcel.writeStrongBinder(iBinder);
            t(parcel, s7);
        }
    }

    public static void h(@RecentlyNonNull Parcel parcel, int i7, int i8) {
        r(parcel, i7, 4);
        parcel.writeInt(i8);
    }

    public static void i(@RecentlyNonNull Parcel parcel, int i7, @RecentlyNonNull int[] iArr, boolean z6) {
        if (iArr == null) {
            if (z6) {
                r(parcel, i7, 0);
            }
        } else {
            int s7 = s(parcel, i7);
            parcel.writeIntArray(iArr);
            t(parcel, s7);
        }
    }

    public static void j(@RecentlyNonNull Parcel parcel, int i7, @RecentlyNonNull List<Integer> list, boolean z6) {
        if (list == null) {
            if (z6) {
                r(parcel, i7, 0);
                return;
            }
            return;
        }
        int s7 = s(parcel, i7);
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            parcel.writeInt(list.get(i8).intValue());
        }
        t(parcel, s7);
    }

    public static void k(@RecentlyNonNull Parcel parcel, int i7, long j7) {
        r(parcel, i7, 8);
        parcel.writeLong(j7);
    }

    public static void l(@RecentlyNonNull Parcel parcel, int i7, @RecentlyNonNull Parcelable parcelable, int i8, boolean z6) {
        if (parcelable == null) {
            if (z6) {
                r(parcel, i7, 0);
            }
        } else {
            int s7 = s(parcel, i7);
            parcelable.writeToParcel(parcel, i8);
            t(parcel, s7);
        }
    }

    public static void m(@RecentlyNonNull Parcel parcel, int i7, @RecentlyNonNull String str, boolean z6) {
        if (str == null) {
            if (z6) {
                r(parcel, i7, 0);
            }
        } else {
            int s7 = s(parcel, i7);
            parcel.writeString(str);
            t(parcel, s7);
        }
    }

    public static void n(@RecentlyNonNull Parcel parcel, int i7, @RecentlyNonNull String[] strArr, boolean z6) {
        if (strArr == null) {
            if (z6) {
                r(parcel, i7, 0);
            }
        } else {
            int s7 = s(parcel, i7);
            parcel.writeStringArray(strArr);
            t(parcel, s7);
        }
    }

    public static void o(@RecentlyNonNull Parcel parcel, int i7, @RecentlyNonNull List<String> list, boolean z6) {
        if (list == null) {
            if (z6) {
                r(parcel, i7, 0);
            }
        } else {
            int s7 = s(parcel, i7);
            parcel.writeStringList(list);
            t(parcel, s7);
        }
    }

    public static <T extends Parcelable> void p(@RecentlyNonNull Parcel parcel, int i7, @RecentlyNonNull T[] tArr, int i8, boolean z6) {
        if (tArr == null) {
            if (z6) {
                r(parcel, i7, 0);
                return;
            }
            return;
        }
        int s7 = s(parcel, i7);
        parcel.writeInt(tArr.length);
        for (T t6 : tArr) {
            if (t6 == null) {
                parcel.writeInt(0);
            } else {
                u(parcel, t6, i8);
            }
        }
        t(parcel, s7);
    }

    public static <T extends Parcelable> void q(@RecentlyNonNull Parcel parcel, int i7, @RecentlyNonNull List<T> list, boolean z6) {
        if (list == null) {
            if (z6) {
                r(parcel, i7, 0);
                return;
            }
            return;
        }
        int s7 = s(parcel, i7);
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            T t6 = list.get(i8);
            if (t6 == null) {
                parcel.writeInt(0);
            } else {
                u(parcel, t6, 0);
            }
        }
        t(parcel, s7);
    }

    private static void r(Parcel parcel, int i7, int i8) {
        parcel.writeInt(i7 | (i8 << 16));
    }

    private static int s(Parcel parcel, int i7) {
        parcel.writeInt(i7 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void t(Parcel parcel, int i7) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i7 - 4);
        parcel.writeInt(dataPosition - i7);
        parcel.setDataPosition(dataPosition);
    }

    private static <T extends Parcelable> void u(Parcel parcel, T t6, int i7) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t6.writeToParcel(parcel, i7);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
