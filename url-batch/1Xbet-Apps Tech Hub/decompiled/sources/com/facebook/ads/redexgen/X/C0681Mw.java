package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.List;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.Mw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0681Mw extends LinearLayout {
    public static byte[] A0A;
    public static String[] A0B = {"knq4crm7fvqQP", "POuWJNR6FFtqsTvB6KeDXgsqVDDrfXB5", "10LYd3PkBnL3JTlwXO74lkb8laVhyfxM", "yGvyB2PsIdOlgSHN7xWAdIyeKrkcUuSJ", "30OsfDGqNeLBXhmKwxFpv8WuoKRgKdOB", "v4mwmIuaROl", "LuFvPWZsJ2RrZ", "py7QobRXpH9AZVstdVJJOkEIejHuBaN9"};
    public static final int A0C;
    public static final int A0D;
    public static final Uri A0E;
    public static final View.OnTouchListener A0F;
    public ImageView A00;
    public ImageView A01;
    public ImageView A02;
    public ImageView A03;
    public InterfaceC0680Mv A04;
    public N2 A05;
    public String A06;
    public boolean A07;
    public final WebView A08;
    public final N6 A09;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 39);
            String[] strArr = A0B;
            if (strArr[3].charAt(13) == strArr[1].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[6] = "2vQcPj1ELj1bu";
            strArr2[0] = "7aOELiI6quiDs";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0A = new byte[]{80, 115, 113, 121, Ascii.ESC, 52, 55, 43, Base64.padSymbol, 39, Ascii.SO, 19, Ascii.SYN, 0, 19, 5, Ascii.SO, 49, 36, 47, 97, 47, 32, 53, 40, 55, 36, 97, 35, 51, 46, 54, 50, 36, 51, 5, 6, Ascii.VT, 17, 16, 94, 6, 8, 5, 10, Ascii.SI, Ascii.DC2, Ascii.GS, Ascii.ETB, 1, Ascii.FS, Ascii.SUB, Ascii.ETB, 93, Ascii.SUB, Ascii.GS, 7, Ascii.SYN, Ascii.GS, 7, 93, Ascii.DC2, 16, 7, Ascii.SUB, Ascii.FS, Ascii.GS, 93, 37, 58, 54, 36, Ascii.ESC, Ascii.ETB, Ascii.NAK, 86, Ascii.EM, Ascii.SYN, Ascii.FS, 10, Ascii.ETB, 17, Ascii.FS, 86, Ascii.ESC, 16, 10, Ascii.ETB, Ascii.NAK, Ascii.GS, 80, 76, 76, 72, 2, Ascii.ETB, Ascii.ETB, 79, 79, 79, Ascii.SYN, 94, 89, 91, 93, 90, 87, 87, 83, Ascii.SYN, 91, 87, 85};
    }

    static {
        A07();
        A0C = Color.rgb(224, 224, 224);
        A0E = C0611Kc.A00(A05(90, 23, 31));
        A0F = new ViewOnTouchListenerC0675Mq();
        A0D = Color.argb(34, 0, 0, 0);
    }

    public C0681Mw(YA ya, WebView webView) {
        super(ya);
        this.A09 = new TL(this);
        this.A08 = webView;
        this.A07 = IQ.A06(ya);
        A08(ya);
    }

    private void A08(YA ya) {
        float density = 50.0f * getResources().getDisplayMetrics().density;
        int i = (int) density;
        LV.A0M(this, -1);
        setGravity(16);
        ImageView imageView = new ImageView(ya);
        this.A01 = imageView;
        imageView.setContentDescription(A05(4, 5, 127));
        ViewGroup.LayoutParams closeButtonParams = new LinearLayout.LayoutParams(i, i);
        this.A01.setScaleType(ImageView.ScaleType.CENTER);
        this.A01.setImageBitmap(C0637Le.A01(EnumC0636Ld.BROWSER_CLOSE));
        ImageView imageView2 = this.A01;
        View.OnTouchListener onTouchListener = A0F;
        imageView2.setOnTouchListener(onTouchListener);
        this.A01.setOnClickListener(new ViewOnClickListenerC0676Mr(this));
        addView(this.A01, closeButtonParams);
        if (this.A07) {
            ImageView imageView3 = new ImageView(ya);
            this.A00 = imageView3;
            imageView3.setEnabled(false);
            this.A00.setAlpha(0.3f);
            this.A00.setContentDescription(A05(0, 4, 53));
            ViewGroup.LayoutParams closeButtonParams2 = new LinearLayout.LayoutParams(i, i);
            this.A00.setScaleType(ImageView.ScaleType.CENTER);
            this.A00.setImageBitmap(C0637Le.A01(EnumC0636Ld.BACK_ARROW));
            this.A00.setOnTouchListener(onTouchListener);
            this.A00.setOnClickListener(new ViewOnClickListenerC0677Ms(this));
            addView(this.A00, closeButtonParams2);
        }
        this.A05 = new N2(ya);
        LinearLayout.LayoutParams closeButtonParams3 = new LinearLayout.LayoutParams(0, -2);
        float density2 = this.A07 ? 0.5f : 1.0f;
        closeButtonParams3.weight = density2;
        this.A05.setGravity(17);
        addView(this.A05, closeButtonParams3);
        if (this.A07) {
            ImageView imageView4 = new ImageView(ya);
            this.A02 = imageView4;
            imageView4.setEnabled(false);
            this.A02.setAlpha(0.3f);
            this.A02.setContentDescription(A05(9, 7, 70));
            ViewGroup.LayoutParams closeButtonParams4 = new LinearLayout.LayoutParams(i, i);
            this.A02.setScaleType(ImageView.ScaleType.CENTER);
            this.A02.setImageBitmap(C0637Le.A02(EnumC0636Ld.BACK_ARROW));
            this.A02.setOnTouchListener(onTouchListener);
            this.A02.setOnClickListener(new ViewOnClickListenerC0678Mt(this));
            addView(this.A02, closeButtonParams4);
        }
        this.A03 = new ImageView(ya);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        this.A03.setContentDescription(A05(16, 19, 102));
        this.A03.setScaleType(ImageView.ScaleType.CENTER);
        this.A03.setOnTouchListener(onTouchListener);
        this.A03.setOnClickListener(new ViewOnClickListenerC0679Mu(this, ya));
        addView(this.A03, layoutParams);
        setupDefaultNativeBrowser(ya);
    }

    public N6 getBrowserNavigationListener() {
        return this.A09;
    }

    public void setListener(InterfaceC0680Mv interfaceC0680Mv) {
        this.A04 = interfaceC0680Mv;
    }

    public void setTitle(String str) {
        this.A05.setTitle(str);
    }

    public void setUrl(String str) {
        this.A06 = str;
        if (TextUtils.isEmpty(str) || A05(35, 11, 67).equals(str)) {
            this.A05.setSubtitle(null);
            this.A03.setEnabled(false);
            this.A03.setColorFilter(new PorterDuffColorFilter(A0C, PorterDuff.Mode.SRC_IN));
        } else {
            this.A05.setSubtitle(str);
            this.A03.setEnabled(true);
            this.A03.setColorFilter((ColorFilter) null);
        }
    }

    private void setupDefaultNativeBrowser(YA ya) {
        Bitmap A01;
        List<ResolveInfo> queryIntentActivities = ya.getPackageManager().queryIntentActivities(new Intent(A05(46, 26, 84), A0E), 65536);
        if (queryIntentActivities.size() == 0) {
            this.A03.setVisibility(8);
            A01 = null;
        } else {
            if (queryIntentActivities.size() == 1) {
                if (A05(72, 18, 95).equals(queryIntentActivities.get(0).activityInfo.packageName)) {
                    EnumC0636Ld enumC0636Ld = EnumC0636Ld.BROWSER_LAUNCH_CHROME;
                    if (A0B[5].length() == 31) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0B;
                    strArr[6] = "ER9o4D5KfsgKq";
                    strArr[0] = "PVCMoHz4n3Ffn";
                    A01 = C0637Le.A01(enumC0636Ld);
                }
            }
            A01 = C0637Le.A01(EnumC0636Ld.BROWSER_LAUNCH_NATIVE);
        }
        this.A03.setImageBitmap(A01);
    }
}
