package defpackage;

import android.app.AppOpsManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.hardware.biometrics.BiometricManager;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oy {
    public static void A(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int q = q(parcel, i);
        parcel.writeByteArray(bArr);
        r(parcel, q);
    }

    public static void B(Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int q = q(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        r(parcel, q);
    }

    public static void C(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int q = q(parcel, i);
        parcel.writeStrongBinder(iBinder);
        r(parcel, q);
    }

    public static void D(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int q = q(parcel, i);
        parcel.writeIntArray(iArr);
        r(parcel, q);
    }

    public static void E(Parcel parcel, int i, Integer num) {
        if (num == null) {
            return;
        }
        parcel.writeInt(i | 262144);
        parcel.writeInt(num.intValue());
    }

    public static void F(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int q = q(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeLong(((Long) list.get(i2)).longValue());
        }
        r(parcel, q);
    }

    public static void G(Parcel parcel, int i, Long l) {
        if (l == null) {
            return;
        }
        parcel.writeInt(i | 524288);
        parcel.writeLong(l.longValue());
    }

    public static void H(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int q = q(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        r(parcel, q);
    }

    public static void I(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int q = q(parcel, i);
        parcel.writeString(str);
        r(parcel, q);
    }

    public static void J(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int q = q(parcel, i);
        parcel.writeStringArray(strArr);
        r(parcel, q);
    }

    public static void K(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int q = q(parcel, i);
        parcel.writeStringList(list);
        r(parcel, q);
    }

    public static void L(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int q = q(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                x(parcel, parcelable, i2);
            }
        }
        r(parcel, q);
    }

    public static void M(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int q = q(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                x(parcel, parcelable, 0);
            }
        }
        r(parcel, q);
    }

    public static double N(Parcel parcel, int i) {
        ay(parcel, i, 8);
        return parcel.readDouble();
    }

    public static float O(Parcel parcel, int i) {
        ay(parcel, i, 4);
        return parcel.readFloat();
    }

    public static int P(Parcel parcel, int i) {
        ay(parcel, i, 4);
        return parcel.readInt();
    }

    public static int Q(Parcel parcel, int i) {
        int readInt = (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
        if (readInt < 0 || parcel.dataPosition() + readInt > parcel.dataSize()) {
            throw new crj(a.Y(readInt, "Invalid field size: "), parcel);
        }
        return readInt;
    }

    public static int R(Parcel parcel) {
        int readInt = parcel.readInt();
        int Q = Q(parcel, readInt);
        char c = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new crj("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i = Q + dataPosition;
        if (i < dataPosition || i > parcel.dataSize()) {
            throw new crj(a.af(i, dataPosition, "Size read is invalid start=", " end="), parcel);
        }
        return i;
    }

    public static long S(Parcel parcel, int i) {
        ay(parcel, i, 8);
        return parcel.readLong();
    }

    public static Bundle T(Parcel parcel, int i) {
        int Q = Q(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Q == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + Q);
        return readBundle;
    }

    public static IBinder U(Parcel parcel, int i) {
        int Q = Q(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Q == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + Q);
        return readStrongBinder;
    }

    public static Parcelable V(Parcel parcel, int i, Parcelable.Creator creator) {
        int Q = Q(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Q == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + Q);
        return parcelable;
    }

    public static Boolean W(Parcel parcel, int i) {
        int Q = Q(parcel, i);
        if (Q == 0) {
            return null;
        }
        az(parcel, Q, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Integer X(Parcel parcel, int i) {
        int Q = Q(parcel, i);
        if (Q == 0) {
            return null;
        }
        az(parcel, Q, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static Long Y(Parcel parcel, int i) {
        int Q = Q(parcel, i);
        if (Q == 0) {
            return null;
        }
        az(parcel, Q, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static String Z(Parcel parcel, int i) {
        int Q = Q(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Q == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + Q);
        return readString;
    }

    public static BiometricManager.Strings a(BiometricManager biometricManager, int i) {
        BiometricManager.Strings strings;
        strings = biometricManager.getStrings(33023);
        return strings;
    }

    public static ArrayList aa(Parcel parcel, int i) {
        int Q = Q(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Q == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(dataPosition + Q);
        return arrayList;
    }

    public static ArrayList ab(Parcel parcel, int i) {
        int Q = Q(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Q == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + Q);
        return createStringArrayList;
    }

    public static ArrayList ac(Parcel parcel, int i, Parcelable.Creator creator) {
        int Q = Q(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Q == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + Q);
        return createTypedArrayList;
    }

    public static void ad(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new crj(a.Y(i, "Overread allowed size end="), parcel);
        }
    }

    public static void ae(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + Q(parcel, i));
    }

    public static boolean af(Parcel parcel, int i) {
        ay(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte[] ag(Parcel parcel, int i) {
        int Q = Q(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Q == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + Q);
        return createByteArray;
    }

    public static int[] ah(Parcel parcel, int i) {
        int Q = Q(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Q == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + Q);
        return createIntArray;
    }

    public static Object[] ai(Parcel parcel, int i, Parcelable.Creator creator) {
        int Q = Q(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Q == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + Q);
        return createTypedArray;
    }

    public static String[] aj(Parcel parcel, int i) {
        int Q = Q(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Q == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + Q);
        return createStringArray;
    }

    public static byte[][] ak(Parcel parcel, int i) {
        int Q = Q(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Q == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + Q);
        return bArr;
    }

    public static void al(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void am(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void an(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static void ao(String str) {
        if (csp.b()) {
            throw new IllegalStateException(str);
        }
    }

    public static void ap(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void aq(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    public static void ar(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void as(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void at(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void au(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    public static ddi av(cmz cmzVar) {
        bst bstVar = new bst();
        cmzVar.c(new cqz(cmzVar, bstVar, 0));
        return (ddi) bstVar.a;
    }

    public static final String aw(List list, Object obj) {
        StringBuilder sb = new StringBuilder(100);
        sb.append(obj.getClass().getSimpleName());
        sb.append('{');
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) list.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public static final void ax(String str, Object obj, List list) {
        list.add(str + "=" + String.valueOf(obj));
    }

    private static void ay(Parcel parcel, int i, int i2) {
        int Q = Q(parcel, i);
        if (Q == i2) {
            return;
        }
        throw new crj("Expected size " + i2 + " got " + Q + " (0x" + Integer.toHexString(Q) + ")", parcel);
    }

    private static void az(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        throw new crj("Expected size " + i2 + " got " + i + " (0x" + Integer.toHexString(i) + ")", parcel);
    }

    public static CharSequence b(BiometricManager.Strings strings) {
        CharSequence buttonLabel;
        buttonLabel = strings.getButtonLabel();
        return buttonLabel;
    }

    public static CharSequence c(BiometricManager.Strings strings) {
        CharSequence promptMessage;
        promptMessage = strings.getPromptMessage();
        return promptMessage;
    }

    public static FingerprintManager d(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }

    public static boolean e(Context context) {
        return Build.VERSION.SDK_INT >= 29 && context != null && context.getPackageManager() != null && context.getPackageManager().hasSystemFeature("android.hardware.biometrics.face");
    }

    public static boolean f(Context context) {
        return (context == null || context.getPackageManager() == null || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) ? false : true;
    }

    public static boolean g(Context context) {
        return Build.VERSION.SDK_INT >= 29 && context != null && context.getPackageManager() != null && context.getPackageManager().hasSystemFeature("android.hardware.biometrics.iris");
    }

    public static KeyguardManager h(Context context) {
        return (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    public static boolean i(Context context) {
        KeyguardManager h = h(context);
        if (h == null) {
            return false;
        }
        return h.isDeviceSecure();
    }

    public static List j(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    public static void k(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static int l(Context context, String str) {
        int m;
        String opPackageName;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String permissionToOp = AppOpsManager.permissionToOp(str);
        if (permissionToOp == null) {
            return 0;
        }
        if (packageName == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            packageName = packagesForUid[0];
        }
        int myUid2 = Process.myUid();
        String packageName2 = context.getPackageName();
        if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
            m = ox.m(context, permissionToOp, packageName);
        } else if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
            m = ox.n(appOpsManager, permissionToOp, Binder.getCallingUid(), packageName);
            if (m == 0) {
                opPackageName = context.getOpPackageName();
                m = ox.n(appOpsManager, permissionToOp, myUid, opPackageName);
            }
        } else {
            m = ox.m(context, permissionToOp, packageName);
        }
        return m != 0 ? -2 : 0;
    }

    public static Object m(Intent intent, String str, Class cls) {
        Object parcelableExtra;
        if (Build.VERSION.SDK_INT >= 34) {
            parcelableExtra = intent.getParcelableExtra(str, cls);
            return parcelableExtra;
        }
        Parcelable parcelableExtra2 = intent.getParcelableExtra(str);
        if (cls.isInstance(parcelableExtra2)) {
            return parcelableExtra2;
        }
        return null;
    }

    public static boolean n(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static crk o(byte[] bArr, Parcelable.Creator creator) {
        at(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        crk crkVar = (crk) creator.createFromParcel(obtain);
        obtain.recycle();
        return crkVar;
    }

    public static byte[] p(crk crkVar) {
        Parcel obtain = Parcel.obtain();
        crkVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static int q(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void r(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static void s(Parcel parcel, int i, boolean z) {
        parcel.writeInt(i | 262144);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void t(Parcel parcel, int i, double d) {
        parcel.writeInt(i | 524288);
        parcel.writeDouble(d);
    }

    public static void u(Parcel parcel, int i, float f) {
        parcel.writeInt(i | 262144);
        parcel.writeFloat(f);
    }

    public static void v(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | 262144);
        parcel.writeInt(i2);
    }

    public static void w(Parcel parcel, int i, long j) {
        parcel.writeInt(i | 524288);
        parcel.writeLong(j);
    }

    public static void x(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static void y(Parcel parcel, int i, Boolean bool) {
        if (bool == null) {
            return;
        }
        parcel.writeInt(i | 262144);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void z(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int q = q(parcel, i);
        parcel.writeBundle(bundle);
        r(parcel, q);
    }
}
