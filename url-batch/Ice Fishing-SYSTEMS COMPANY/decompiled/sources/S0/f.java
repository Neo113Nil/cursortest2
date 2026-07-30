package S0;

import B1.z;
import O7.B;
import X.C0403c;
import X.C0405e;
import X.v;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Trace;
import android.provider.Settings;
import android.util.Log;
import android.webkit.WebView;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.AbstractC2581Ha;
import com.google.android.gms.internal.ads.AbstractC2720Pd;
import com.google.android.gms.internal.ads.AbstractC3212fg;
import com.google.android.gms.internal.ads.C2858Xf;
import com.google.android.gms.internal.ads.C3112dq;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import s1.InterfaceC4991d;
import t2.C;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static long f2893a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f2894b;

    /* renamed from: c, reason: collision with root package name */
    public static Context f2895c;

    public static void A(Parcel parcel, int i, int i4) {
        parcel.writeInt(i | (i4 << 16));
    }

    public static int B(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void C(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(List list, v vVar, AbstractC5219c abstractC5219c) {
        C0403c c0403c;
        int i;
        List list2;
        kotlin.jvm.internal.r rVar;
        Iterator it;
        Throwable th;
        if (abstractC5219c instanceof C0403c) {
            c0403c = (C0403c) abstractC5219c;
            int i4 = c0403c.f3553w;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0403c.f3553w = i4 - Integer.MIN_VALUE;
                Object obj = c0403c.f3552v;
                Object obj2 = EnumC5179a.f41704n;
                i = c0403c.f3553w;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    ArrayList arrayList = new ArrayList();
                    C0405e c0405e = new C0405e(list, arrayList, null);
                    c0403c.f3550n = arrayList;
                    c0403c.f3553w = 1;
                    if (vVar.a(c0405e, c0403c) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = c0403c.f3551u;
                        rVar = (kotlin.jvm.internal.r) c0403c.f3550n;
                        try {
                            com.bumptech.glide.f.r(obj);
                        } catch (Throwable th2) {
                            Object obj3 = rVar.f38861n;
                            if (obj3 == null) {
                                rVar.f38861n = th2;
                            } else {
                                com.bumptech.glide.d.b((Throwable) obj3, th2);
                            }
                        }
                        while (it.hasNext()) {
                            E7.l lVar = (E7.l) it.next();
                            c0403c.f3550n = rVar;
                            c0403c.f3551u = it;
                            c0403c.f3553w = 2;
                            if (lVar.invoke(c0403c) == obj2) {
                                return obj2;
                            }
                        }
                        th = (Throwable) rVar.f38861n;
                        if (th == null) {
                            return q7.v.f40183a;
                        }
                        throw th;
                    }
                    list2 = (List) c0403c.f3550n;
                    com.bumptech.glide.f.r(obj);
                }
                rVar = new kotlin.jvm.internal.r();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (Throwable) rVar.f38861n;
                if (th == null) {
                }
            }
        }
        c0403c = new C0403c(abstractC5219c);
        Object obj4 = c0403c.f3552v;
        Object obj22 = EnumC5179a.f41704n;
        i = c0403c.f3553w;
        if (i != 0) {
        }
        rVar = new kotlin.jvm.internal.r();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) rVar.f38861n;
        if (th == null) {
        }
    }

    public static t.k b(B b9) {
        return com.bumptech.glide.f.i(new F3.l(14, b9));
    }

    public static String c(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b9 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b9)));
        }
        return sb.toString();
    }

    public static void d(String str, boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void e(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] g(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static InvocationHandler h() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = WebView.getWebViewClassLoader();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, new Object[0]).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e6) {
                throw new RuntimeException(e6);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class i(K7.c cVar) {
        kotlin.jvm.internal.h.e(cVar, "<this>");
        Class a9 = ((kotlin.jvm.internal.c) cVar).a();
        if (a9.isPrimitive()) {
            String name = a9.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return a9;
    }

    public static int j(ArrayList arrayList, InputStream inputStream, C3112dq c3112dq) {
        if (inputStream != null) {
            if (!inputStream.markSupported()) {
                inputStream = new z(inputStream, c3112dq);
            }
            inputStream.mark(5242880);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                try {
                    int c4 = ((InterfaceC4991d) arrayList.get(i)).c(inputStream, c3112dq);
                    if (c4 != -1) {
                        return c4;
                    }
                } finally {
                    inputStream.reset();
                }
            }
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType k(ArrayList arrayList, InputStream inputStream, C3112dq c3112dq) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new z(inputStream, c3112dq);
        }
        inputStream.mark(5242880);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType d2 = ((InterfaceC4991d) arrayList.get(i)).d(inputStream);
                inputStream.reset();
                if (d2 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return d2;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ImageHeaderParser$ImageType l(ArrayList arrayList, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType a9 = ((InterfaceC4991d) arrayList.get(i)).a(byteBuffer);
                AtomicReference atomicReference = N1.b.f1952a;
                if (a9 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return a9;
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = N1.b.f1952a;
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static boolean m() {
        boolean isEnabled;
        try {
            if (f2894b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f2894b == null) {
                f2893a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f2894b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f2894b.invoke(null, Long.valueOf(f2893a))).booleanValue();
        } catch (Exception e6) {
            if (!(e6 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e6);
                return false;
            }
            Throwable cause = e6.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean n(String str) {
        return ("Connection".equalsIgnoreCase(str) || com.anythink.expressad.foundation.g.f.g.b.f19498c.equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static void q(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int B8 = B(parcel, i);
        parcel.writeBundle(bundle);
        C(parcel, B8);
    }

    public static void r(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int B8 = B(parcel, i);
        parcel.writeByteArray(bArr);
        C(parcel, B8);
    }

    public static void s(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int B8 = B(parcel, i);
        parcel.writeStrongBinder(iBinder);
        C(parcel, B8);
    }

    public static void t(Parcel parcel, int i, Parcelable parcelable, int i4) {
        if (parcelable == null) {
            return;
        }
        int B8 = B(parcel, i);
        parcelable.writeToParcel(parcel, i4);
        C(parcel, B8);
    }

    public static void u(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int B8 = B(parcel, i);
        parcel.writeString(str);
        C(parcel, B8);
    }

    public static void v(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int B8 = B(parcel, i);
        parcel.writeStringArray(strArr);
        C(parcel, B8);
    }

    public static void w(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int B8 = B(parcel, i);
        parcel.writeStringList(list);
        C(parcel, B8);
    }

    public static void x(Parcel parcel, int i, Parcelable[] parcelableArr, int i4) {
        if (parcelableArr == null) {
            return;
        }
        int B8 = B(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i4);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        C(parcel, B8);
    }

    public static void y(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int B8 = B(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            Parcelable parcelable = (Parcelable) list.get(i4);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        C(parcel, B8);
    }

    public static void z(Context context) {
        boolean z8;
        Object obj = u2.f.f41231b;
        if (((Boolean) AbstractC2581Ha.f25374a.r()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                    synchronized (u2.f.f41231b) {
                        z8 = u2.f.f41232c;
                    }
                    if (z8) {
                        return;
                    }
                    J3.a l9 = new C2858Xf(context).l();
                    int i = C.f40822b;
                    u2.i.e("Updating ad debug logging enablement.");
                    AbstractC2720Pd.g(l9, "AdDebugLogUpdater.updateEnablement", AbstractC3212fg.f30745h);
                }
            } catch (Exception e6) {
                u2.i.g("Fail to determine debug setting.", e6);
            }
        }
    }

    public abstract void o(Throwable th);

    public abstract void p(f4.p pVar);
}
