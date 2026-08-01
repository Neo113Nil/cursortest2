package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NN implements View.OnClickListener {
    public static String[] A03 = {"5NPsaGxTntAZUh5vvPpYLifVDwpYE9gO", "yAdF8jFrPkVudWekKgJT40sKzU7M", "P84QernMh58Oht", "HVjKxCVNtxzSBN1ofjZs3kMRuF4TzLwS", "c9t8G7uI59pglLVDHXf1Cg7BVtBq", "zkFcC9XFE44gS7Ii7sdayH8FvB1qc1Nx", "mQLKSBYKXRgBaCP29rEHxwq0", "ifKB8OntsRJFcWFaLpGEPIeHfTRm85bo"};
    public float A00;
    public float A01;
    public View.OnClickListener A02;

    public NN(View.OnClickListener onClickListener) {
        this.A02 = onClickListener;
    }

    public final void A00(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r7 > r8) goto L17;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        if (K0.A02(this)) {
            return;
        }
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            int abs = Math.abs(width - height) / 2;
            if (width != height) {
                if (width > height) {
                    float f = this.A00;
                    if (f >= abs) {
                        int i = width - abs;
                        String[] strArr = A03;
                        String str = strArr[1];
                        String str2 = strArr[4];
                        int width2 = str.length();
                        if (width2 != str2.length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A03;
                        strArr2[1] = "IaFg43gDfmav4cpS3tfI5ukrEyaV";
                        strArr2[4] = "YCQU4nAsEaYrX5eT9av2YKK9p1Sz";
                    }
                }
                if (height <= width) {
                    return;
                }
                float f2 = this.A01;
                float f3 = abs;
                int width3 = A03[5].charAt(3);
                if (width3 != 66) {
                    A03[0] = "DOfOMptgN0kFoREvgd3Bxl9Eys2o9Nt4";
                    if (f2 < f3) {
                        return;
                    }
                } else {
                    String[] strArr3 = A03;
                    strArr3[1] = "SME7OxnBFewA4wdZ4tQVNxKrxX7o";
                    strArr3[4] = "dj4w34xtzstsWLpNapZgfCztNtRS";
                    if (f2 < f3) {
                        return;
                    }
                }
                if (f2 > height - abs) {
                    return;
                }
            }
            this.A02.onClick(view);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
