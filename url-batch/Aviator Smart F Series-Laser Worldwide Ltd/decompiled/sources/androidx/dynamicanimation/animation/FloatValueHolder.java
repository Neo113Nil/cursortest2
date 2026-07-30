package androidx.dynamicanimation.animation;

/* loaded from: classes.dex */
public class FloatValueHolder {
    private float mValue = 0.0f;

    public FloatValueHolder() {
    }

    public float getValue() {
        return this.mValue;
    }

    public void setValue(float f8) {
        this.mValue = f8;
    }

    public FloatValueHolder(float f8) {
        setValue(f8);
    }
}
