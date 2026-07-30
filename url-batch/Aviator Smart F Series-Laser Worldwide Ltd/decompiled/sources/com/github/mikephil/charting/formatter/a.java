package com.github.mikephil.charting.formatter;

import java.text.DecimalFormat;

/* loaded from: classes3.dex */
public class a extends g {
    protected int digits;
    protected DecimalFormat mFormat;

    public a(int i8) {
        this.digits = i8;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.mFormat = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    public int getDecimalDigits() {
        return this.digits;
    }

    @Override // com.github.mikephil.charting.formatter.g
    public String getFormattedValue(float f8) {
        return this.mFormat.format(f8);
    }
}
