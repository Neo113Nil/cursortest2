package com.github.mikephil.charting.formatter;

import java.text.DecimalFormat;

/* loaded from: classes3.dex */
public class c extends g {
    protected int mDecimalDigits;
    protected DecimalFormat mFormat;

    public c(int i8) {
        setup(i8);
    }

    public int getDecimalDigits() {
        return this.mDecimalDigits;
    }

    @Override // com.github.mikephil.charting.formatter.g
    public String getFormattedValue(float f8) {
        return this.mFormat.format(f8);
    }

    public void setup(int i8) {
        this.mDecimalDigits = i8;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.mFormat = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }
}
