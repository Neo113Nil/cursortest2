package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Parcel;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.google.android.gms.internal.consent_sdk.C4344i2;
import com.icefishing.icefishingliveapp.GzopActiongamesActivity;
import com.icefishing.icefishingliveapp.GzopAdventuregamesActivity;
import com.icefishing.icefishingliveapp.GzopArcadegamesActivity;
import com.icefishing.icefishingliveapp.GzopPuzzleLogicActivity;
import com.icefishing.icefishingliveapp.GzopSportsRacinggamesActivity;
import com.icefishing.icefishingliveapp.GzopStretegygamesActivity;
import com.icefishing.icefishingliveapp.MainActivity;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class CL {
    public static float a(float f6, float f9, float f10, float f11) {
        return ((f6 - f9) * f10) + f11;
    }

    public static int b(int i, int i4) {
        return String.valueOf(i).length() + i4;
    }

    public static int c(int i, int i4, int i9) {
        return C4344i2.i(i) + i4 + i9;
    }

    public static int d(int i, int i4, int i9, int i10) {
        return XK.j(i) + i4 + i9 + i10;
    }

    public static J1.a e(String str, com.bumptech.glide.p pVar) {
        return pVar.k(Uri.parse(str)).o();
    }

    public static V2.a f(Parcel parcel) {
        V2.a u02 = V2.b.u0(parcel.readStrongBinder());
        parcel.recycle();
        return u02;
    }

    public static com.bumptech.glide.p g(com.bumptech.glide.n nVar, ImageView imageView, GzopAdventuregamesActivity gzopAdventuregamesActivity) {
        nVar.E(imageView);
        return com.bumptech.glide.c.c(gzopAdventuregamesActivity.getApplicationContext());
    }

    public static com.bumptech.glide.p h(com.bumptech.glide.n nVar, ImageView imageView, MainActivity mainActivity) {
        nVar.E(imageView);
        return com.bumptech.glide.c.c(mainActivity.getApplicationContext());
    }

    public static String i(int i, String str) {
        return str + i;
    }

    public static String j(String str, String str2) {
        return str + str2;
    }

    public static String k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static StringBuilder l(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder m(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder n(StringBuilder sb, String str, String str2, StringBuffer stringBuffer, String str3) {
        sb.append(str);
        sb.append(str2);
        stringBuffer.append(sb.toString());
        return new StringBuilder(str3);
    }

    public static /* synthetic */ void o(int i, String str) {
        if (i == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = kotlin.jvm.internal.h.class.getName();
            int i4 = 0;
            while (!stackTrace[i4].getClassName().equals(name)) {
                i4++;
            }
            while (stackTrace[i4].getClassName().equals(name)) {
                i4++;
            }
            StackTraceElement stackTraceElement = stackTrace[i4];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + com.anythink.core.common.d.j.f12535z + stackTraceElement.getMethodName() + ", parameter " + str);
            kotlin.jvm.internal.h.i(nullPointerException, kotlin.jvm.internal.h.class.getName());
            throw nullPointerException;
        }
    }

    public static void p(GzopActiongamesActivity gzopActiongamesActivity, int i, View view) {
        view.startAnimation(AnimationUtils.loadAnimation(gzopActiongamesActivity.getApplicationContext(), i));
    }

    public static void q(GzopAdventuregamesActivity gzopAdventuregamesActivity, int i, View view) {
        view.startAnimation(AnimationUtils.loadAnimation(gzopAdventuregamesActivity.getApplicationContext(), i));
    }

    public static void r(GzopArcadegamesActivity gzopArcadegamesActivity, int i, View view) {
        view.startAnimation(AnimationUtils.loadAnimation(gzopArcadegamesActivity.getApplicationContext(), i));
    }

    public static void s(GzopPuzzleLogicActivity gzopPuzzleLogicActivity, int i, View view) {
        view.startAnimation(AnimationUtils.loadAnimation(gzopPuzzleLogicActivity.getApplicationContext(), i));
    }

    public static void t(GzopSportsRacinggamesActivity gzopSportsRacinggamesActivity, int i, View view) {
        view.startAnimation(AnimationUtils.loadAnimation(gzopSportsRacinggamesActivity.getApplicationContext(), i));
    }

    public static void u(GzopStretegygamesActivity gzopStretegygamesActivity, int i, View view) {
        view.startAnimation(AnimationUtils.loadAnimation(gzopStretegygamesActivity.getApplicationContext(), i));
    }

    public static void v(r4.c cVar, Class cls, Class cls2, Class cls3, Class cls4) {
        cVar.register(cls).provides(cls2);
        cVar.register(cls3).provides(cls4);
    }

    public static int w(int i, int i4, int i9, int i10) {
        return C4344i2.i(i) + i4 + i9 + i10;
    }

    public static /* synthetic */ String x(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String y(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "MEMORY_CACHE" : "RESOURCE_DISK_CACHE" : "DATA_DISK_CACHE" : "REMOTE" : "LOCAL";
    }
}
