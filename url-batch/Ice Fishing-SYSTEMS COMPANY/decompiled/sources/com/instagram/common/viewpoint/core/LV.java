package com.instagram.common.viewpoint.core;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network/classes2.dex */
public final class LV extends AbstractC1485ay {
    public static byte[] A0F;
    public static String[] A0G = {"X5ywJXgSTO8PHmyyLHkjy", "LJCQW", "068uN", "say", "rTIjgGKqeW39zjdqZS0Aqu4tLxC", "Qrp", "m8T4zYbfVU3hLt0iEDnj", "pXMACVxBUOAUm1D"};
    public static final String A0H;
    public float A00;
    public Y2 A01;
    public AbstractC1783fo A02;
    public C1784fp A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Path A07;
    public final RectF A08;
    public final C1839gi A09;
    public final WeakReference<InterfaceC1488b1> A0A;
    public final AtomicBoolean A0B;
    public final AtomicBoolean A0C;
    public final AtomicInteger A0D;
    public final AtomicReference<String> A0E;

    public static String A02(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 52);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0F = new byte[]{91, 126, 89, 117, 116, 110, 104, 117, 118};
    }

    static {
        A04();
        A0H = LV.class.getSimpleName();
    }

    public LV(C1839gi c1839gi, WeakReference<InterfaceC1488b1> weakReference, int i, String str) {
        this(c1839gi, weakReference, i, false);
        if (C1289Up.A1z(c1839gi)) {
            c1839gi.A02().A0B().AKo(this, str == null ? A02(0, 0, 91) : str, false, true);
            this.A06 = true;
        }
    }

    public LV(C1839gi c1839gi, WeakReference<InterfaceC1488b1> weakReference, int i, boolean z8) {
        super(c1839gi);
        this.A0B = new AtomicBoolean();
        this.A0C = new AtomicBoolean(true);
        this.A07 = new Path();
        this.A08 = new RectF();
        this.A0D = new AtomicInteger(5000);
        this.A0E = new AtomicReference<>();
        this.A01 = new Y2();
        this.A05 = true;
        this.A06 = false;
        this.A09 = c1839gi;
        this.A04 = z8;
        this.A0A = weakReference;
        this.A02 = new C1062Lq(this);
        this.A03 = new C1784fp(this, i, new WeakReference(this.A02), this.A09);
        setWebChromeClient(A0G());
        setWebViewClient(A0H());
        getSettings().setSupportZoom(false);
        getSettings().setCacheMode(1);
        addJavascriptInterface(new C1487b0(this, weakReference.get(), this.A03, this.A0B, this.A0C, this.A09), A02(0, 9, 46));
    }

    private final boolean A05() {
        return this.A0B.get();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1485ay
    public final WebChromeClient A0G() {
        return new C1489b2();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1485ay
    public final WebViewClient A0H() {
        return new C1490b3(this.A09, this.A0A, new WeakReference(this.A03), new WeakReference(this.A01), new WeakReference(this.A0C), new WeakReference(this), this.A0D, this.A0E, this.A04);
    }

    public final void A0K() {
        this.A09.A0F().AKq();
        this.A0B.set(true);
        new Handler(Looper.getMainLooper()).post(new C1053Lh(this.A03));
    }

    public final void A0L(int i, int i4) {
        if (this.A03 != null) {
            this.A03.A0W(i);
            this.A03.A0X(i4);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1485ay, android.webkit.WebView
    public final void destroy() {
        if (this.A06) {
            this.A09.A02().A0B().AKU(this);
        }
        if (this.A03 != null) {
            this.A03.A0V();
            this.A03 = null;
        }
        YB.A0J(this);
        this.A02 = null;
        this.A01 = null;
        AbstractC1491b4.A03(this);
        super.destroy();
    }

    public Y2 getTouchDataRecorder() {
        return this.A01;
    }

    public C1784fp getViewabilityChecker() {
        return this.A03;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A00 > 0.0f) {
            this.A08.set(0.0f, 0.0f, getWidth(), getHeight());
            String[] strArr = A0G;
            if (strArr[1].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[1] = "xZYpx";
            strArr2[2] = "aqsn9";
            this.A07.reset();
            this.A07.addRoundRect(this.A08, this.A00, this.A00, Path.Direction.CW);
            canvas.clipPath(this.A07);
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.A01.A06(this.A09, motionEvent, this, this);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.A0A.get() != null) {
            this.A0A.get();
        }
        if (this.A03 == null) {
            return;
        }
        C1839gi c1839gi = this.A09;
        String[] strArr = A0G;
        if (strArr[6].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[6] = "5ON080OOKwQwIFP5OG7h";
        strArr2[0] = "JBDgk0gsadULglMDLs8S8";
        c1839gi.A0F().AL4(i);
        if (i == 0 && A05()) {
            this.A03.A0U();
        } else {
            if (i != 8) {
                return;
            }
            this.A03.A0V();
        }
    }

    public void setBlockLocalFileAccessOutsideCache(boolean z8) {
        this.A04 = z8;
    }

    public void setCheckAssetsByJavascriptBridge(boolean z8) {
        this.A0C.set(z8);
    }

    public void setCornerRadius(float f6) {
        this.A00 = f6;
        invalidate();
    }

    public void setLogMultipleImpressions(boolean z8) {
        this.A05 = z8;
    }

    public void setRequestId(String str) {
        this.A0E.set(str);
    }

    public void setWebViewTimeoutInMillis(int i) {
        if (i >= 0) {
            this.A0D.set(i);
        }
    }
}
