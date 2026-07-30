package com.airbnb.lottie.model.content;

/* loaded from: classes.dex */
public class d {
    private final int[] colors;
    private final float[] positions;

    public d(float[] fArr, int[] iArr) {
        this.positions = fArr;
        this.colors = iArr;
    }

    public int[] getColors() {
        return this.colors;
    }

    public float[] getPositions() {
        return this.positions;
    }

    public int getSize() {
        return this.colors.length;
    }

    public void lerp(d dVar, d dVar2, float f8) {
        if (dVar.colors.length == dVar2.colors.length) {
            for (int i8 = 0; i8 < dVar.colors.length; i8++) {
                this.positions[i8] = com.airbnb.lottie.utils.i.lerp(dVar.positions[i8], dVar2.positions[i8], f8);
                this.colors[i8] = com.airbnb.lottie.utils.d.evaluate(f8, dVar.colors[i8], dVar2.colors[i8]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + dVar.colors.length + " vs " + dVar2.colors.length + ")");
    }
}
