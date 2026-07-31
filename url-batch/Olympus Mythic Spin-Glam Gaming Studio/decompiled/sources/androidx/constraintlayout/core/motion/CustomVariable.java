package androidx.constraintlayout.core.motion;

import com.pubmatic.sdk.video.POBVastError;

/* loaded from: classes13.dex */
public class CustomVariable {
    boolean mBooleanValue;
    private float mFloatValue;
    private int mIntegerValue;
    String mName;
    private String mStringValue;
    private int mType;

    public static String colorString(int i) {
        return "#" + ("00000000" + Integer.toHexString(i)).substring(r2.length() - 8);
    }

    public String toString() {
        String str = this.mName + ':';
        switch (this.mType) {
            case POBVastError.UNDEFINED_ERROR /* 900 */:
                return str + this.mIntegerValue;
            case EVENT_TYPE_EXTENDED_WATERFALL_STARTED_VALUE:
                return str + this.mFloatValue;
            case EVENT_TYPE_EXTENDED_AD_UNIT_LOADED_VALUE:
                return str + colorString(this.mIntegerValue);
            case EVENT_TYPE_EXTENDED_AD_UNIT_FINISHED_VALUE:
                return str + this.mStringValue;
            case EVENT_TYPE_EXTENDED_WATERFALL_FINISHED_VALUE:
                return str + Boolean.valueOf(this.mBooleanValue);
            case EVENT_TYPE_EXTENDED_AD_UNIT_EXPIRED_VALUE:
                return str + this.mFloatValue;
            default:
                return str + "????";
        }
    }

    public int numberOfInterpolatedValues() {
        return this.mType != 902 ? 1 : 4;
    }

    public void getValuesToInterpolate(float[] fArr) {
        switch (this.mType) {
            case POBVastError.UNDEFINED_ERROR /* 900 */:
                fArr[0] = this.mIntegerValue;
                return;
            case EVENT_TYPE_EXTENDED_WATERFALL_STARTED_VALUE:
                fArr[0] = this.mFloatValue;
                return;
            case EVENT_TYPE_EXTENDED_AD_UNIT_LOADED_VALUE:
                int i = (this.mIntegerValue >> 24) & 255;
                float pow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = i / 255.0f;
                return;
            case EVENT_TYPE_EXTENDED_AD_UNIT_FINISHED_VALUE:
                throw new RuntimeException("Cannot interpolate String");
            case EVENT_TYPE_EXTENDED_WATERFALL_FINISHED_VALUE:
                fArr[0] = this.mBooleanValue ? 1.0f : 0.0f;
                return;
            case EVENT_TYPE_EXTENDED_AD_UNIT_EXPIRED_VALUE:
                fArr[0] = this.mFloatValue;
                return;
            default:
                return;
        }
    }
}
