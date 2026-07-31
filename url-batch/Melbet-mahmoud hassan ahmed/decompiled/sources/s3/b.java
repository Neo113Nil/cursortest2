package s3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b {

    public static class a extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(@RecentlyNonNull String str, @RecentlyNonNull Parcel parcel) {
            super(r2.toString());
            int dataPosition = parcel.dataPosition();
            int dataSize = parcel.dataSize();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41);
            sb.append(str);
            sb.append(" Parcel: pos=");
            sb.append(dataPosition);
            sb.append(" size=");
            sb.append(dataSize);
        }
    }

    @RecentlyNonNull
    public static Bundle a(@RecentlyNonNull Parcel parcel, int i7) {
        int s7 = s(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (s7 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + s7);
        return readBundle;
    }

    @RecentlyNonNull
    public static byte[] b(@RecentlyNonNull Parcel parcel, int i7) {
        int s7 = s(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (s7 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + s7);
        return createByteArray;
    }

    @RecentlyNonNull
    public static int[] c(@RecentlyNonNull Parcel parcel, int i7) {
        int s7 = s(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (s7 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + s7);
        return createIntArray;
    }

    @RecentlyNonNull
    public static ArrayList<Integer> d(@RecentlyNonNull Parcel parcel, int i7) {
        int s7 = s(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (s7 == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i8 = 0; i8 < readInt; i8++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + s7);
        return arrayList;
    }

    @RecentlyNonNull
    public static <T extends Parcelable> T e(@RecentlyNonNull Parcel parcel, int i7, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int s7 = s(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (s7 == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + s7);
        return createFromParcel;
    }

    @RecentlyNonNull
    public static String f(@RecentlyNonNull Parcel parcel, int i7) {
        int s7 = s(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (s7 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + s7);
        return readString;
    }

    @RecentlyNonNull
    public static String[] g(@RecentlyNonNull Parcel parcel, int i7) {
        int s7 = s(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (s7 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + s7);
        return createStringArray;
    }

    @RecentlyNonNull
    public static ArrayList<String> h(@RecentlyNonNull Parcel parcel, int i7) {
        int s7 = s(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (s7 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + s7);
        return createStringArrayList;
    }

    @RecentlyNonNull
    public static <T> T[] i(@RecentlyNonNull Parcel parcel, int i7, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int s7 = s(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (s7 == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + s7);
        return tArr;
    }

    @RecentlyNonNull
    public static <T> ArrayList<T> j(@RecentlyNonNull Parcel parcel, int i7, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int s7 = s(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (s7 == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + s7);
        return createTypedArrayList;
    }

    public static void k(@RecentlyNonNull Parcel parcel, int i7) {
        if (parcel.dataPosition() == i7) {
            return;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(i7);
        throw new a(sb.toString(), parcel);
    }

    public static int l(int i7) {
        return (char) i7;
    }

    public static boolean m(@RecentlyNonNull Parcel parcel, int i7) {
        v(parcel, i7, 4);
        return parcel.readInt() != 0;
    }

    public static float n(@RecentlyNonNull Parcel parcel, int i7) {
        v(parcel, i7, 4);
        return parcel.readFloat();
    }

    public static int o(@RecentlyNonNull Parcel parcel) {
        return parcel.readInt();
    }

    @RecentlyNonNull
    public static IBinder p(@RecentlyNonNull Parcel parcel, int i7) {
        int s7 = s(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (s7 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + s7);
        return readStrongBinder;
    }

    public static int q(@RecentlyNonNull Parcel parcel, int i7) {
        v(parcel, i7, 4);
        return parcel.readInt();
    }

    public static long r(@RecentlyNonNull Parcel parcel, int i7) {
        v(parcel, i7, 8);
        return parcel.readLong();
    }

    public static int s(@RecentlyNonNull Parcel parcel, int i7) {
        return (i7 & (-65536)) != -65536 ? (char) (i7 >> 16) : parcel.readInt();
    }

    public static void t(@RecentlyNonNull Parcel parcel, int i7) {
        parcel.setDataPosition(parcel.dataPosition() + s(parcel, i7));
    }

    public static int u(@RecentlyNonNull Parcel parcel) {
        int o7 = o(parcel);
        int s7 = s(parcel, o7);
        int dataPosition = parcel.dataPosition();
        if (l(o7) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(o7));
            throw new a(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i7 = s7 + dataPosition;
        if (i7 >= dataPosition && i7 <= parcel.dataSize()) {
            return i7;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i7);
        throw new a(sb.toString(), parcel);
    }

    private static void v(Parcel parcel, int i7, int i8) {
        int s7 = s(parcel, i7);
        if (s7 == i8) {
            return;
        }
        String hexString = Integer.toHexString(s7);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i8);
        sb.append(" got ");
        sb.append(s7);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new a(sb.toString(), parcel);
    }
}
