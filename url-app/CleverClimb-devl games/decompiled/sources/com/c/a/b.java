package com.c.a;

/* compiled from: FloatEvaluator.java */
/* loaded from: classes.dex */
public class b implements j<Number> {
    @Override // com.c.a.j
    public Float a(float f, Number number, Number number2) {
        float floatValue = number.floatValue();
        return Float.valueOf(floatValue + (f * (number2.floatValue() - floatValue)));
    }
}
