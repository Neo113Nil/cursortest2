package K3;

import B1.C0259a;
import B1.C0260b;
import B1.C0261c;
import B1.C0264f;
import B1.C0265g;
import B1.D;
import B1.H;
import B1.o;
import B1.s;
import B2.N;
import B2.z;
import D.y;
import M7.j;
import a.AbstractC0415a;
import android.animation.TimeInterpolator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.emoji2.text.p;
import androidx.emoji2.text.q;
import com.bumptech.glide.l;
import com.bumptech.glide.load.data.k;
import com.google.android.gms.internal.ads.AbstractC3212fg;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C3112dq;
import com.google.android.gms.internal.ads.C3226fu;
import com.google.android.gms.internal.ads.C3381io;
import com.google.android.gms.internal.ads.C4287ze;
import com.google.android.gms.internal.ads.CL;
import g1.C4523c;
import i8.m;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import l7.C4707a;
import m.Z0;
import m.b1;
import o7.AbstractC4840a;
import q2.O;
import q2.d1;
import q7.C4946o;
import q7.C4948q;
import r7.AbstractC4979j;
import r7.r;
import r7.t;
import s7.C5006f;
import s7.C5009i;
import t0.AbstractC5051n;
import t2.w;
import u1.u;
import v1.InterfaceC5117a;
import w2.C5161i;
import y1.C5221A;
import y1.C5223C;
import y1.C5230e;
import y1.C5233h;
import y1.C5234i;
import z1.C5268b;

/* loaded from: classes2.dex */
public abstract class b {
    public static Set A(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return r.f40360n;
        }
        if (length == 1) {
            Set singleton = Collections.singleton(objArr[0]);
            kotlin.jvm.internal.h.d(singleton, "singleton(...)");
            return singleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(t.z(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static void B(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            Z0.a(view, charSequence);
            return;
        }
        b1 b1Var = b1.f39380D;
        if (b1Var != null && b1Var.f39385n == view) {
            b1.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new b1(view, charSequence);
            return;
        }
        b1 b1Var2 = b1.f39381E;
        if (b1Var2 != null && b1Var2.f39385n == view) {
            b1Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static void C(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + x(parcel, i));
    }

    public static final C4946o D(String str) {
        int i;
        p8.g.e(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char charAt = str.charAt(0);
        if (kotlin.jvm.internal.h.f(charAt, 48) < 0) {
            i = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int i9 = 119304647;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            int i10 = i4 ^ Integer.MIN_VALUE;
            if (Integer.compare(i10, i9 ^ Integer.MIN_VALUE) > 0) {
                if (i9 != 119304647) {
                    return null;
                }
                i9 = (int) (((-1) & 4294967295L) / (4294967295L & 10));
                if (Integer.compare(i10, i9 ^ Integer.MIN_VALUE) > 0) {
                    return null;
                }
            }
            int i11 = i4 * 10;
            int i12 = digit + i11;
            if (Integer.compare(i12 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i++;
            i4 = i12;
        }
        return new C4946o(i4);
    }

    public static final C4948q E(String str) {
        int i;
        long j9;
        kotlin.jvm.internal.h.e(str, "<this>");
        int i4 = 10;
        p8.g.e(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        char charAt = str.charAt(0);
        int i9 = 1;
        if (kotlin.jvm.internal.h.f(charAt, 48) >= 0) {
            i = 0;
        } else {
            if (length == 1 || charAt != '+') {
                return null;
            }
            i = 1;
        }
        long j10 = 10;
        long j11 = 0;
        long j12 = 512409557603043100L;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), i4);
            if (digit < 0) {
                return null;
            }
            int i10 = length;
            long j13 = j11 ^ Long.MIN_VALUE;
            int i11 = i;
            if (Long.compare(j13, j12 ^ Long.MIN_VALUE) <= 0) {
                j9 = j10;
            } else {
                if (j12 != 512409557603043100L) {
                    return null;
                }
                if (j10 >= 0) {
                    long j14 = (Long.MAX_VALUE / j10) << i9;
                    j9 = j10;
                    j12 = j14 + ((((-1) - (j14 * j10)) ^ Long.MIN_VALUE) >= (j10 ^ Long.MIN_VALUE) ? i9 : 0);
                } else if (Long.MAX_VALUE < (j10 ^ Long.MIN_VALUE)) {
                    j9 = j10;
                    j12 = 0;
                } else {
                    j12 = 1;
                    j9 = j10;
                }
                if (Long.compare(j13, j12 ^ Long.MIN_VALUE) > 0) {
                    return null;
                }
            }
            long j15 = j11 * j9;
            long j16 = (digit & 4294967295L) + j15;
            if (Long.compare(j16 ^ Long.MIN_VALUE, j15 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i = i11 + 1;
            j11 = j16;
            length = i10;
            j10 = j9;
            i4 = 10;
            i9 = 1;
        }
        return new C4948q(j11);
    }

    public static int F(Parcel parcel) {
        int readInt = parcel.readInt();
        int x3 = x(parcel, readInt);
        char c4 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c4 != 20293) {
            throw new B0.c("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i = x3 + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        throw new B0.c(y.n(new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i).length()), "Size read is invalid start=", dataPosition, " end=", i), parcel);
    }

    public static Object G(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            u2.i.d("Unexpected exception.", th);
            C4287ze.a(context).e("StrictModeUtil.runWithLaxStrictMode", th);
            return null;
        }
    }

    public static void H(Parcel parcel, int i, int i4) {
        int x3 = x(parcel, i);
        if (x3 == i4) {
            return;
        }
        String hexString = Integer.toHexString(x3);
        int length = String.valueOf(i4).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(x3).length() + 4 + 1);
        AbstractC5051n.i(sb, "Expected size ", i4, " got ", x3);
        throw new B0.c(y.o(sb, " (0x", hexString, ")"), parcel);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String I(String str) {
        char c4;
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str.hashCode()) {
            case 1743582862:
                if (str.equals("requester_type_0")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case 1743582863:
                if (str.equals("requester_type_1")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case 1743582864:
                if (str.equals("requester_type_2")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case 1743582865:
                if (str.equals("requester_type_3")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case 1743582866:
                if (str.equals("requester_type_4")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case 1743582867:
                if (str.equals("requester_type_5")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            case 1743582868:
                if (str.equals("requester_type_6")) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            case 1743582869:
                if (str.equals("requester_type_7")) {
                    c4 = 7;
                    break;
                }
                c4 = 65535;
                break;
            case 1743582870:
                if (str.equals("requester_type_8")) {
                    c4 = '\b';
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        switch (c4) {
            case 0:
                return "0";
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case '\b':
                return "8";
            default:
                return str;
        }
    }

    public static String J(d1 d1Var) {
        Bundle bundle;
        return (d1Var == null || (bundle = d1Var.f40031v) == null) ? "unspecified" : bundle.getString("query_info_type");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int K(Bundle bundle) {
        char c4;
        Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("query_info_type");
        if (!TextUtils.isEmpty(string)) {
            switch (string.hashCode()) {
                case 1743582862:
                    if (string.equals("requester_type_0")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1743582863:
                    if (string.equals("requester_type_1")) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1743582864:
                    if (string.equals("requester_type_2")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1743582865:
                    if (string.equals("requester_type_3")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1743582866:
                    if (string.equals("requester_type_4")) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1743582867:
                    if (string.equals("requester_type_5")) {
                        c4 = 5;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1743582868:
                    if (string.equals("requester_type_6")) {
                        c4 = 6;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1743582869:
                    if (string.equals("requester_type_7")) {
                        c4 = 7;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1743582870:
                    if (string.equals("requester_type_8")) {
                        c4 = '\b';
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                    return 1;
                case 1:
                    return 3;
                case 2:
                    return 4;
                case 3:
                    return 5;
                case 4:
                    return 6;
                case 5:
                    return 7;
                case 6:
                    return 8;
                case 7:
                    return 9;
                case '\b':
                    return 10;
            }
        }
        return 2;
    }

    public static void L(C3381io c3381io, String str, Pair... pairArr) {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31533Q7)).booleanValue()) {
            AbstractC3212fg.f30738a.execute(new z(c3381io, str, pairArr, 2));
        }
    }

    public static int M(C3226fu c3226fu) {
        if (c3226fu.f30915s) {
            return 2;
        }
        d1 d1Var = c3226fu.f30901d;
        O o9 = d1Var.f40018L;
        String str = d1Var.f40023Q;
        if (o9 == null && str == null) {
            return 1;
        }
        if (o9 == null || str == null) {
            return o9 != null ? 3 : 4;
        }
        return 5;
    }

    public static C5009i a(C5009i c5009i) {
        C5006f c5006f = c5009i.f40524n;
        c5006f.c();
        return c5006f.f40508B > 0 ? c5009i : C5009i.f40523u;
    }

    public static final void b(I1.b bVar, String name, String value) {
        kotlin.jvm.internal.h.e(bVar, "<this>");
        kotlin.jvm.internal.h.e(name, "name");
        kotlin.jvm.internal.h.e(value, "value");
        ArrayList arrayList = bVar.f1246n;
        arrayList.add(name);
        arrayList.add(j.h0(value).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static q c(Context context) {
        ProviderInfo providerInfo;
        N n9;
        ApplicationInfo applicationInfo;
        L2.i cVar = Build.VERSION.SDK_INT >= 28 ? new androidx.emoji2.text.c(11) : new L2.i(11);
        PackageManager packageManager = context.getPackageManager();
        S0.f.f(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] s3 = cVar.s(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : s3) {
                    arrayList.add(signature.toByteArray());
                }
                n9 = new N(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e6) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e6);
            }
            if (n9 != null) {
                return null;
            }
            return new q(new p(context, n9));
        }
        n9 = null;
        if (n9 != null) {
        }
    }

    public static C4707a d(Map attributes) {
        kotlin.jvm.internal.h.e(attributes, "attributes");
        C4707a c4707a = C4707a.f39080c;
        c4707a.getClass();
        I1.f fVar = new I1.f(2);
        fVar.f(c4707a.f39082b);
        String str = c4707a.f39081a;
        if (str == null) {
            str = null;
        }
        g6.e eVar = AbstractC4840a.f39730a;
        if (eVar != null && !eVar.f37932b.isEmpty()) {
            fVar.d(eVar, "OneSignalDeviceSDK");
        }
        for (Map.Entry entry : attributes.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str2 != null && str3 != null) {
                fVar.e(str2, str3);
            }
        }
        return C4707a.a(fVar.b(), str);
    }

    public static l e(com.bumptech.glide.c cVar, ArrayList arrayList) {
        s1.j c0264f;
        s1.j c0259a;
        int i;
        Resources resources;
        String str;
        String str2;
        InterfaceC5117a interfaceC5117a = cVar.f23530n;
        com.bumptech.glide.i iVar = cVar.f23532v;
        Context applicationContext = iVar.getApplicationContext();
        C4523c c4523c = iVar.f23555h;
        l lVar = new l();
        B1.l lVar2 = new B1.l();
        I1.b bVar = lVar.f23568g;
        synchronized (bVar) {
            bVar.f1246n.add(lVar2);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 27) {
            s sVar = new s();
            I1.b bVar2 = lVar.f23568g;
            synchronized (bVar2) {
                bVar2.f1246n.add(sVar);
            }
        }
        Resources resources2 = applicationContext.getResources();
        ArrayList e6 = lVar.e();
        C3112dq c3112dq = cVar.f23533w;
        F1.a aVar = new F1.a(applicationContext, e6, interfaceC5117a, c3112dq);
        H h9 = new H(interfaceC5117a, new L2.i(2));
        o oVar = new o(lVar.e(), resources2.getDisplayMetrics(), interfaceC5117a, c3112dq);
        if (i4 < 28 || !((Map) c4523c.f37856u).containsKey(com.bumptech.glide.d.class)) {
            c0264f = new C0264f(oVar, 0);
            c0259a = new C0259a(2, oVar, c3112dq);
        } else {
            c0259a = new C0265g(1);
            c0264f = new C0265g(0);
        }
        Class<InputStream> cls = InputStream.class;
        if (i4 >= 28) {
            i = i4;
            resources = resources2;
            int i9 = 1;
            lVar.d("Animation", InputStream.class, Drawable.class, new D1.a(new S0.l(i9, e6, c3112dq), i9));
            lVar.d("Animation", ByteBuffer.class, Drawable.class, new D1.a(new S0.l(1, e6, c3112dq), 0));
        } else {
            i = i4;
            resources = resources2;
        }
        D1.c cVar2 = new D1.c(applicationContext);
        C0260b c0260b = new C0260b(c3112dq);
        G1.a aVar2 = new G1.a((byte) 0, 0);
        G1.e eVar = new G1.e(1);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        lVar.b(ByteBuffer.class, new C5221A(5));
        lVar.b(InputStream.class, new h8.d(15, c3112dq));
        lVar.d("Bitmap", ByteBuffer.class, Bitmap.class, c0264f);
        lVar.d("Bitmap", InputStream.class, Bitmap.class, c0259a);
        String str3 = Build.FINGERPRINT;
        Class<ParcelFileDescriptor> cls2 = ParcelFileDescriptor.class;
        if ("robolectric".equals(str3)) {
            str = str3;
            str2 = "Animation";
        } else {
            str = str3;
            str2 = "Animation";
            lVar.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C0264f(oVar, 1));
        }
        lVar.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new H(interfaceC5117a, new L2.i(1)));
        lVar.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, h9);
        C5221A c5221a = C5221A.f41812u;
        lVar.a(Bitmap.class, Bitmap.class, c5221a);
        lVar.d("Bitmap", Bitmap.class, Bitmap.class, new D(0));
        lVar.c(Bitmap.class, c0260b);
        Resources resources3 = resources;
        lVar.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C0259a(resources3, c0264f));
        lVar.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C0259a(resources3, c0259a));
        lVar.d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C0259a(resources3, h9));
        lVar.c(BitmapDrawable.class, new S0.c(1, interfaceC5117a, c0260b));
        String str4 = str2;
        lVar.d(str4, InputStream.class, F1.b.class, new F1.h(e6, aVar, c3112dq));
        lVar.d(str4, ByteBuffer.class, F1.b.class, aVar);
        lVar.c(F1.b.class, new W3.e(3));
        lVar.a(r1.d.class, r1.d.class, c5221a);
        lVar.d("Bitmap", r1.d.class, Bitmap.class, new C0261c(interfaceC5117a));
        lVar.d("legacy_append", Uri.class, Drawable.class, cVar2);
        lVar.d("legacy_append", Uri.class, Bitmap.class, new C0259a(1, cVar2, interfaceC5117a));
        lVar.h(new C1.a(0));
        lVar.a(File.class, ByteBuffer.class, new C5221A(6));
        lVar.a(File.class, InputStream.class, new C5233h(4, new C5221A(9)));
        lVar.d("legacy_append", File.class, File.class, new D(2));
        lVar.a(File.class, ParcelFileDescriptor.class, new C5233h(4, new C5221A(8)));
        lVar.a(File.class, File.class, c5221a);
        lVar.h(new k(c3112dq));
        if (!"robolectric".equals(str)) {
            lVar.h(new C1.a(2));
        }
        androidx.emoji2.text.l lVar3 = new androidx.emoji2.text.l(applicationContext, 2);
        U2.b bVar3 = new U2.b(applicationContext);
        C5230e c5230e = new C5230e(applicationContext, 0);
        Class cls3 = Integer.TYPE;
        lVar.a(cls3, InputStream.class, lVar3);
        lVar.a(Integer.class, InputStream.class, lVar3);
        lVar.a(cls3, AssetFileDescriptor.class, bVar3);
        lVar.a(Integer.class, AssetFileDescriptor.class, bVar3);
        lVar.a(cls3, Drawable.class, c5230e);
        lVar.a(Integer.class, Drawable.class, c5230e);
        lVar.a(Uri.class, InputStream.class, new androidx.emoji2.text.l(applicationContext, 3));
        lVar.a(Uri.class, AssetFileDescriptor.class, new C5230e(applicationContext, 1));
        m mVar = new m(resources3);
        G1.b bVar4 = new G1.b(resources3);
        h8.d dVar = new h8.d(14, resources3);
        lVar.a(Integer.class, Uri.class, mVar);
        lVar.a(cls3, Uri.class, mVar);
        lVar.a(Integer.class, AssetFileDescriptor.class, bVar4);
        lVar.a(cls3, AssetFileDescriptor.class, bVar4);
        lVar.a(Integer.class, InputStream.class, dVar);
        lVar.a(cls3, InputStream.class, dVar);
        lVar.a(String.class, InputStream.class, new h8.d(13));
        lVar.a(Uri.class, InputStream.class, new h8.d(13));
        lVar.a(String.class, InputStream.class, new C5221A(13));
        lVar.a(String.class, ParcelFileDescriptor.class, new C5221A(12));
        lVar.a(String.class, AssetFileDescriptor.class, new C5221A(11));
        lVar.a(Uri.class, InputStream.class, new u(applicationContext.getAssets()));
        lVar.a(Uri.class, AssetFileDescriptor.class, new w(4, applicationContext.getAssets()));
        lVar.a(Uri.class, InputStream.class, new androidx.emoji2.text.l(applicationContext, 4));
        lVar.a(Uri.class, InputStream.class, new Z1.j(applicationContext, 2));
        if (i >= 29) {
            lVar.a(Uri.class, InputStream.class, new C5268b(8, applicationContext, cls));
            lVar.a(Uri.class, ParcelFileDescriptor.class, new C5268b(8, applicationContext, cls2));
        }
        boolean containsKey = ((Map) c4523c.f37856u).containsKey(com.bumptech.glide.h.class);
        lVar.a(Uri.class, InputStream.class, new C5223C(contentResolver, containsKey, 2));
        lVar.a(Uri.class, ParcelFileDescriptor.class, new C5223C(contentResolver, containsKey, 1));
        lVar.a(Uri.class, AssetFileDescriptor.class, new C5223C(contentResolver, containsKey, 0));
        lVar.a(Uri.class, InputStream.class, new C5221A(14));
        lVar.a(URL.class, InputStream.class, new C5161i());
        lVar.a(Uri.class, File.class, new Z1.j(applicationContext, 1));
        lVar.a(C5234i.class, InputStream.class, new w(5));
        lVar.a(byte[].class, ByteBuffer.class, new C5221A(2));
        lVar.a(byte[].class, InputStream.class, new C5221A(4));
        lVar.a(Uri.class, Uri.class, c5221a);
        lVar.a(Drawable.class, Drawable.class, c5221a);
        lVar.d("legacy_append", Drawable.class, Drawable.class, new D(1));
        lVar.i(Bitmap.class, BitmapDrawable.class, new G1.b(resources3));
        lVar.i(Bitmap.class, byte[].class, aVar2);
        lVar.i(Drawable.class, byte[].class, new Y2.e(interfaceC5117a, aVar2, eVar, 4));
        lVar.i(F1.b.class, byte[].class, eVar);
        H h10 = new H(interfaceC5117a, new W3.e(1));
        lVar.d("legacy_append", ByteBuffer.class, Bitmap.class, h10);
        lVar.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C0259a(resources3, h10));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw y.h(it);
        }
        return lVar;
    }

    public static Bundle f(Parcel parcel, int i) {
        int x3 = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x3 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + x3);
        return readBundle;
    }

    public static byte[] g(Parcel parcel, int i) {
        int x3 = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x3 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + x3);
        return createByteArray;
    }

    public static Parcelable h(Parcel parcel, int i, Parcelable.Creator creator) {
        int x3 = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x3 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + x3);
        return parcelable;
    }

    public static String i(Parcel parcel, int i) {
        int x3 = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x3 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + x3);
        return readString;
    }

    public static String[] j(Parcel parcel, int i) {
        int x3 = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x3 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + x3);
        return createStringArray;
    }

    public static ArrayList k(Parcel parcel, int i) {
        int x3 = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x3 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + x3);
        return createStringArrayList;
    }

    public static Object[] l(Parcel parcel, int i, Parcelable.Creator creator) {
        int x3 = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x3 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + x3);
        return createTypedArray;
    }

    public static void m(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new B0.c(y.j(i, "Overread allowed size end=", new StringBuilder(String.valueOf(i).length() + 26)), parcel);
        }
    }

    public static float n(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static String o(byte[] bArr) {
        int a9;
        J6.c cVar = new J6.c(bArr, 0);
        boolean z8 = false;
        while (!z8) {
            int i = cVar.f1406c;
            int i4 = cVar.f1405b;
            if (i == i4) {
                cVar.f1407d = 0;
                a9 = 0;
            } else {
                a9 = cVar.a();
                cVar.f1407d = a9;
                if ((a9 >>> 3) == 0) {
                    throw new IOException("Invalid tag: " + cVar.f1407d);
                }
            }
            if (a9 != 0) {
                byte[] bArr2 = cVar.f1404a;
                if (a9 == 18) {
                    int a10 = cVar.a();
                    if (a10 > 0) {
                        int i9 = cVar.f1406c;
                        if (a10 <= i4 - i9) {
                            String str = new String(bArr2, i9, a10, StandardCharsets.UTF_8);
                            cVar.f1406c += a10;
                            return str;
                        }
                    }
                    if (a10 == 0) {
                        return "";
                    }
                    if (a10 <= 0) {
                        throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    }
                    throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                int i10 = a9 & 7;
                if (i10 == 0) {
                    if (i4 - cVar.f1406c >= 10) {
                        for (int i11 = 0; i11 < 10; i11++) {
                            int i12 = cVar.f1406c;
                            cVar.f1406c = i12 + 1;
                            if (bArr2[i12] >= 0) {
                                break;
                            }
                        }
                        throw new IOException("CodedInputStream encountered a malformed varint.");
                    }
                    for (int i13 = 0; i13 < 10; i13++) {
                        int i14 = cVar.f1406c;
                        if (i14 == i4) {
                            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                        cVar.f1406c = i14 + 1;
                        if (bArr2[i14] >= 0) {
                            break;
                        }
                    }
                    throw new IOException("CodedInputStream encountered a malformed varint.");
                }
                if (i10 == 1) {
                    cVar.b(8);
                } else if (i10 == 2) {
                    cVar.b(cVar.a());
                } else {
                    if (i10 != 5) {
                        throw new IOException(CL.i(a9, "Invalid wire type: "));
                    }
                    cVar.b(4);
                }
            } else {
                z8 = true;
            }
        }
        return "";
    }

    public static final void p(String name) {
        kotlin.jvm.internal.h.e(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = name.length();
        for (int i = 0; i < length; i++) {
            char charAt = name.charAt(i);
            if ('!' > charAt || charAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                p8.g.e(16);
                String num = Integer.toString(charAt, 16);
                kotlin.jvm.internal.h.d(num, "toString(...)");
                if (num.length() < 2) {
                    num = "0".concat(num);
                }
                sb.append(num);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in header name: ");
                sb.append(name);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final void q(String value, String name) {
        kotlin.jvm.internal.h.e(value, "value");
        kotlin.jvm.internal.h.e(name, "name");
        int length = value.length();
        for (int i = 0; i < length; i++) {
            char charAt = value.charAt(i);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                p8.g.e(16);
                String num = Integer.toString(charAt, 16);
                kotlin.jvm.internal.h.d(num, "toString(...)");
                if (num.length() < 2) {
                    num = "0".concat(num);
                }
                sb.append(num);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in ");
                sb.append(name);
                sb.append(" value");
                sb.append(f8.c.i(name) ? "" : ": ".concat(value));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static boolean r(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static Set s(Set set, Set elements) {
        kotlin.jvm.internal.h.e(set, "<this>");
        kotlin.jvm.internal.h.e(elements, "elements");
        if (elements.isEmpty()) {
            return AbstractC4979j.V(set);
        }
        if (!(elements instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(elements);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!elements.contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static boolean t(Parcel parcel, int i) {
        H(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static IBinder u(Parcel parcel, int i) {
        int x3 = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x3 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + x3);
        return readStrongBinder;
    }

    public static int v(Parcel parcel, int i) {
        H(parcel, i, 4);
        return parcel.readInt();
    }

    public static long w(Parcel parcel, int i) {
        H(parcel, i, 8);
        return parcel.readLong();
    }

    public static int x(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static int y(Context context, int i, int i4) {
        TypedValue z8 = AbstractC0415a.z(context, i);
        return (z8 == null || z8.type != 16) ? i4 : z8.data;
    }

    public static TimeInterpolator z(Context context, int i, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!r(valueOf, "cubic-bezier") && !r(valueOf, com.anythink.expressad.a.f17761K)) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (r(valueOf, "cubic-bezier")) {
            String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
            if (split.length == 4) {
                return Q.a.b(n(split, 0), n(split, 1), n(split, 2), n(split, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        }
        if (!r(valueOf, com.anythink.expressad.a.f17761K)) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        String substring = valueOf.substring(5, valueOf.length() - 1);
        Path path = new Path();
        try {
            G.i.b(AbstractC0415a.k(substring), path);
            return Q.a.c(path);
        } catch (RuntimeException e6) {
            throw new RuntimeException("Error in parsing ".concat(substring), e6);
        }
    }
}
