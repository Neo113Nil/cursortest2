package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class KE extends AbstractC0964aB implements View.OnClickListener {
    public static byte[] A0D;
    public static String[] A0E = {"zJy5N3L509NIqOAGCBmq2SY7W4xK8HwT", "H2", ExifInterface.LONGITUDE_EAST, "vMyDxD7xbIgTd", "0bWjMiKAxESivC84rSJqWsF4vTTr4zpm", "NIsgbM1VoVKu1UXdUm6ipB03AExBFzGo", "hF", "2iAtRdiONhZPMieR3MSLVzPYox5YjbDW"};
    public static final int A0F;
    public int A00;
    public int A01;
    public Bitmap A02;
    public Paint A03;
    public Rect A04;
    public C1159dL A05;
    public C0856Wd A06;
    public KG A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public final a5 A0B;
    public final Map<String, String> A0C;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 121);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0D = new byte[]{-30, -21, -24, -30, -22, -34, -14, -18, -12, -15, -30, -28, -23, -27, -80, -16, -24, -10, -10, -24, -15, -22, -24, -11, 40, 38, Ascii.CAN, 37, Ascii.SYN, Ascii.US, Ascii.FS, Ascii.SYN, Ascii.RS};
    }

    static {
        A04();
        A0F = (int) (AbstractC0862Wl.A02 * 24.0f);
    }

    public KE(C1159dL c1159dL, AbstractC1434hy abstractC1434hy, C0622My c0622My, US us, InterfaceC0890Xn interfaceC0890Xn, C1232eX c1232eX, XH xh, InterfaceC0872Wv interfaceC0872Wv) {
        this(c1159dL, abstractC1434hy.A0r(), c0622My, abstractC1434hy.A20().A0J().A06(), us, interfaceC0890Xn, c1232eX, xh, abstractC1434hy.A21(), interfaceC0872Wv);
        this.A0B.A08(abstractC1434hy);
    }

    public KE(C1159dL c1159dL, String str, C0622My c0622My, US us, InterfaceC0890Xn interfaceC0890Xn, C1232eX c1232eX, XH xh, N3 n3) {
        this(c1159dL, str, c0622My, false, us, interfaceC0890Xn, c1232eX, xh, n3);
    }

    public KE(C1159dL c1159dL, String str, C0622My c0622My, boolean z, US us, InterfaceC0890Xn interfaceC0890Xn, C1232eX c1232eX, XH xh, N3 n3) {
        super(c1159dL, c0622My);
        this.A0C = new HashMap();
        this.A05 = c1159dL;
        this.A0A = z;
        this.A0B = new a5(c1159dL, str, c1232eX, xh, us, n3, interfaceC0890Xn);
        setOnClickListener(this);
        XP.A0E(1001, this);
    }

    public KE(C1159dL c1159dL, String str, C0622My c0622My, boolean z, US us, InterfaceC0890Xn interfaceC0890Xn, C1232eX c1232eX, XH xh, N3 n3, InterfaceC0872Wv interfaceC0872Wv) {
        super(c1159dL, c0622My);
        this.A0C = new HashMap();
        this.A05 = c1159dL;
        this.A0A = z;
        this.A0B = new a5(c1159dL, str, c1232eX, xh, us, n3, interfaceC0890Xn, interfaceC0872Wv);
        setOnClickListener(this);
        XP.A0E(1001, this);
    }

    public static Bitmap A00(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    private void A02() {
        if (this.A0A && this.A09 != null) {
            this.A02 = A00(XY.A03(this.A05, this.A09.contains(A01(12, 12, 10)) ? XX.MESSENGER : XX.WHATSAPP));
            this.A03 = new Paint();
            setPadding(A0F, 0, A0F, 0);
        }
    }

    private void A03() {
        if (this.A06 != null) {
            C0856Wd c0856Wd = this.A06;
            if (A0E[0].charAt(27) != 'K') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[6] = "Jn";
            strArr[1] = "nM";
            c0856Wd.A06();
        }
        if (this.A07 != null) {
            this.A07.A04();
        }
    }

    public static boolean A05(AbstractC1434hy abstractC1434hy) {
        return ((long) abstractC1434hy.A1w()) > 0 && abstractC1434hy.A1u() >= 0;
    }

    public final ME A0E(String str) {
        if (TextUtils.isEmpty(this.A08) || TextUtils.isEmpty(this.A09)) {
            return ME.A09;
        }
        A03();
        this.A0C.put(A01(0, 12, 6), str);
        return this.A0B.A05(this.A08, this.A09, this.A0C);
    }

    public final boolean A0F(AbstractC1434hy abstractC1434hy, AbstractC0889Xm abstractC0889Xm) {
        if (this.A06 != null || !A05(abstractC1434hy) || abstractC1434hy.A24().A01() == null || abstractC1434hy.A24().A00() == null) {
            return false;
        }
        this.A07 = new KG(abstractC1434hy.A1u(), abstractC1434hy.A1w(), abstractC1434hy.A1v(), abstractC1434hy.A24().A01(), abstractC1434hy.A24().A00(), abstractC0889Xm, this);
        this.A06 = new C0856Wd(abstractC1434hy.A1w(), this.A07);
        this.A06.A07();
        return true;
    }

    public a5 getCtaActionHelper() {
        return this.A0B;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            A0E(A01(24, 9, 58));
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A03();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A02 != null) {
            this.A04 = new Rect(0, 0, this.A02.getWidth(), this.A02.getHeight());
            this.A01 = this.A02.getWidth();
            this.A00 = 12;
            int shift = (this.A01 + this.A00) / 2;
            canvas.save();
            canvas.translate(shift, 0.0f);
        }
        super.onDraw(canvas);
        if (this.A02 != null) {
            float width = (getWidth() / 2.0f) - ((getPaint().measureText((String) getText()) + 10.0f) / 2.0f);
            float textWidth = this.A01;
            float f = width - textWidth;
            float textWidth2 = this.A00;
            int i = (int) (f - textWidth2);
            int top = (getHeight() / 2) - (this.A01 / 2);
            int left = this.A01;
            Rect destRect = new Rect(i, top, left + i, this.A01 + top);
            canvas.drawBitmap(this.A02, this.A04, destRect, this.A03);
            canvas.restore();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            A03();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (!z) {
            A03();
        }
    }

    public void setCreativeAsCtaLoggingHelper(C0858Wh c0858Wh) {
        this.A0B.A09(c0858Wh);
    }

    public void setCta(C0623Mz c0623Mz, String str, Map<String, String> extraData) {
        setCta(c0623Mz, str, extraData, null);
    }

    public void setCta(C0623Mz c0623Mz, String str, Map<String, String> extraData, InterfaceC0872Wv interfaceC0872Wv, InterfaceC0959a4 interfaceC0959a4) {
        setCta(c0623Mz, str, extraData, interfaceC0959a4);
        this.A0B.A0A(interfaceC0872Wv);
    }

    public void setCta(C0623Mz c0623Mz, String str, Map<String, String> extraData, InterfaceC0959a4 interfaceC0959a4) {
        this.A08 = str;
        this.A09 = c0623Mz.A05();
        this.A0C.putAll(extraData);
        this.A0B.A0B(interfaceC0959a4);
        String A04 = c0623Mz.A04();
        if (!TextUtils.isEmpty(A04)) {
            String buttonText = this.A09;
            if (!TextUtils.isEmpty(buttonText)) {
                setText(A04);
                A02();
                return;
            }
        }
        setVisibility(8);
    }

    public void setIsInAppBrowser(boolean z) {
        this.A0B.A0C(z);
    }
}
