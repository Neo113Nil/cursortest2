package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Pg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0743Pg extends RelativeLayout {
    public static String[] A03 = {"Z7YDROQZDOzGgLZ6JRzm0VB6SZj4zDor", "PEDxZ1hmcJv2HtokqPZuboN03zqPqfuu", "ZN3aiXgGzfL", "UoQOzdqMFdmvRVk6jZTbQbhJ01APWmUd", "BWydKlRDXGFiivyHlYlBLR13h8bygoZy", "calSGpe10AH6YV6oPZJsWkhcYoOFDSm8", "CqyCvSup05V", "6oqVw1T1HmkJfSZKyFG8rr7XXeYSScI0"};
    public C02876j A00;
    public WeakReference<InterfaceC0742Pf> A01;
    public final QW A02;

    /* JADX WARN: Multi-variable type inference failed */
    public C0743Pg(YA ya, QW qw) {
        super(ya);
        this.A02 = qw;
        LV.A0J((View) qw);
        addView(qw.getView(), new RelativeLayout.LayoutParams(-1, -1));
    }

    public final void A00(PX px) {
        addView(px, new RelativeLayout.LayoutParams(-1, -1));
        this.A00 = (C02876j) px;
    }

    public final void A01(PX px) {
        LV.A0J(px);
        this.A00 = null;
    }

    public final boolean A02() {
        return this.A02.A8S();
    }

    public int getCurrentPosition() {
        return this.A02.getCurrentPosition();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ((View) this.A02).layout(0, 0, getWidth(), getHeight());
        C02876j c02876j = this.A00;
        if (c02876j != null) {
            c02876j.layout(0, 0, getWidth(), getHeight());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a4, code lost:
    
        if (r6 > r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a6, code lost:
    
        r4 = (r0 * r8) / r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00aa, code lost:
    
        if (r6 > r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e0, code lost:
    
        if (r5 == Integer.MIN_VALUE) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e2, code lost:
    
        if (r0 <= r6) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e4, code lost:
    
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e7, code lost:
    
        if (r5 == Integer.MIN_VALUE) goto L43;
     */
    @Override // android.widget.RelativeLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        boolean z = false;
        int videoWidth = this.A02.getVideoWidth();
        int heightSpecSize = this.A02.getVideoHeight();
        int defaultSize = getDefaultSize(videoWidth, i);
        int height = getDefaultSize(heightSpecSize, i2);
        if (videoWidth > 0 && heightSpecSize > 0) {
            z = true;
            int widthSpecMode = View.MeasureSpec.getMode(i);
            String[] strArr = A03;
            String str = strArr[5];
            String str2 = strArr[4];
            int mVideoWidth = str.charAt(24);
            if (mVideoWidth == str2.charAt(24)) {
                throw new RuntimeException();
            }
            A03[1] = "CDDJeYuNvDEJubiWpvjZnzRFdpaPIWUA";
            int widthSpecSize = View.MeasureSpec.getSize(i);
            int mVideoHeight = View.MeasureSpec.getMode(i2);
            int mVideoWidth2 = View.MeasureSpec.getSize(i2);
            if (widthSpecMode != 1073741824 || mVideoHeight != 1073741824) {
                if (widthSpecMode == 1073741824) {
                    defaultSize = widthSpecSize;
                    height = (defaultSize * heightSpecSize) / videoWidth;
                    if (mVideoHeight == Integer.MIN_VALUE && height > mVideoWidth2) {
                        height = mVideoWidth2;
                    }
                } else if (mVideoHeight == 1073741824) {
                    height = mVideoWidth2;
                    defaultSize = (height * videoWidth) / heightSpecSize;
                    String[] strArr2 = A03;
                    String str3 = strArr2[7];
                    String str4 = strArr2[0];
                    int mVideoHeight2 = str3.charAt(1);
                    int mVideoWidth3 = str4.charAt(1);
                    if (mVideoHeight2 != mVideoWidth3) {
                        String[] strArr3 = A03;
                        strArr3[7] = "6OY3VkVRTo9gTvB5T4EFQBtDC7FaIDf0";
                        strArr3[0] = "lXHmnICBdoyL7DjWTMRRGmshSxtLnfI6";
                    }
                } else {
                    defaultSize = videoWidth;
                    height = heightSpecSize;
                    if (mVideoHeight == Integer.MIN_VALUE && height > mVideoWidth2) {
                        height = mVideoWidth2;
                        defaultSize = (height * videoWidth) / heightSpecSize;
                    }
                    if (widthSpecMode == Integer.MIN_VALUE && defaultSize > widthSpecSize) {
                        defaultSize = widthSpecSize;
                        height = (defaultSize * heightSpecSize) / videoWidth;
                    }
                }
            } else {
                defaultSize = widthSpecSize;
                height = mVideoWidth2;
                int mVideoWidth4 = defaultSize * heightSpecSize;
                if (videoWidth * height < mVideoWidth4) {
                    defaultSize = (height * videoWidth) / heightSpecSize;
                } else {
                    int i3 = videoWidth * height;
                    int i4 = defaultSize * heightSpecSize;
                    if (A03[3].charAt(9) != 104) {
                        A03[3] = "fC7LLJ1Dm89Wzyv9Y7CU7RKyEHK0kUw2";
                    }
                }
            }
        }
        setMeasuredDimension(defaultSize, height);
        int mVideoWidth5 = A03[3].charAt(9);
        if (mVideoWidth5 != 104) {
            A03[1] = "jUvlMuc6V7f2FSIr4bukaecFyxTPY1HC";
            if (!z) {
                return;
            }
        } else if (!z) {
            return;
        }
        WeakReference<InterfaceC0742Pf> weakReference = this.A01;
        if (weakReference != null && weakReference.get() != null) {
            this.A01.get().ADP();
        }
    }

    public void setViewImplInflationListener(InterfaceC0742Pf interfaceC0742Pf) {
        this.A01 = new WeakReference<>(interfaceC0742Pf);
    }
}
