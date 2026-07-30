package androidx.constraintlayout.core.motion;

import androidx.core.view.ViewCompat;
import com.baidu.mapapi.UIMsg;

/* loaded from: classes.dex */
public class CustomAttribute {
    private static final String TAG = "TransitionLayout";
    boolean mBooleanValue;
    private int mColorValue;
    private float mFloatValue;
    private int mIntegerValue;
    private boolean mMethod;
    String mName;
    private String mStringValue;
    private AttributeType mType;

    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public CustomAttribute(String str, AttributeType attributeType) {
        this.mMethod = false;
        this.mName = str;
        this.mType = attributeType;
    }

    private static int clamp(int i8) {
        int i9 = (i8 & (~(i8 >> 31))) + UIMsg.m_AppUI.V_WM_ADDLISTUPDATE;
        return (i9 & (i9 >> 31)) + 255;
    }

    public static int hsvToRgb(float f8, float f9, float f10) {
        float f11 = f8 * 6.0f;
        int i8 = (int) f11;
        float f12 = f11 - i8;
        float f13 = f10 * 255.0f;
        int i9 = (int) (((1.0f - f9) * f13) + 0.5f);
        int i10 = (int) (((1.0f - (f12 * f9)) * f13) + 0.5f);
        int i11 = (int) (((1.0f - ((1.0f - f12) * f9)) * f13) + 0.5f);
        int i12 = (int) (f13 + 0.5f);
        if (i8 == 0) {
            return ((i12 << 16) + (i11 << 8) + i9) | (-16777216);
        }
        if (i8 == 1) {
            return ((i10 << 16) + (i12 << 8) + i9) | (-16777216);
        }
        if (i8 == 2) {
            return ((i9 << 16) + (i12 << 8) + i11) | (-16777216);
        }
        if (i8 == 3) {
            return ((i9 << 16) + (i10 << 8) + i12) | (-16777216);
        }
        if (i8 == 4) {
            return ((i11 << 16) + (i9 << 8) + i12) | (-16777216);
        }
        if (i8 != 5) {
            return 0;
        }
        return ((i12 << 16) + (i9 << 8) + i10) | (-16777216);
    }

    public boolean diff(CustomAttribute customAttribute) {
        AttributeType attributeType;
        if (customAttribute == null || (attributeType = this.mType) != customAttribute.mType) {
            return false;
        }
        switch (attributeType) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                if (this.mIntegerValue == customAttribute.mIntegerValue) {
                }
                break;
            case FLOAT_TYPE:
                if (this.mFloatValue == customAttribute.mFloatValue) {
                }
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                if (this.mColorValue == customAttribute.mColorValue) {
                }
                break;
            case STRING_TYPE:
                if (this.mIntegerValue == customAttribute.mIntegerValue) {
                }
                break;
            case BOOLEAN_TYPE:
                if (this.mBooleanValue == customAttribute.mBooleanValue) {
                }
                break;
            case DIMENSION_TYPE:
                if (this.mFloatValue == customAttribute.mFloatValue) {
                }
                break;
        }
        return false;
    }

    public AttributeType getType() {
        return this.mType;
    }

    public float getValueToInterpolate() {
        switch (this.mType) {
            case INT_TYPE:
                return this.mIntegerValue;
            case FLOAT_TYPE:
                return this.mFloatValue;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case STRING_TYPE:
                throw new RuntimeException("Cannot interpolate String");
            case BOOLEAN_TYPE:
                return this.mBooleanValue ? 1.0f : 0.0f;
            case DIMENSION_TYPE:
                return this.mFloatValue;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        switch (this.mType) {
            case INT_TYPE:
                fArr[0] = this.mIntegerValue;
                return;
            case FLOAT_TYPE:
                fArr[0] = this.mFloatValue;
                return;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int i8 = (this.mColorValue >> 24) & 255;
                float pow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = i8 / 255.0f;
                return;
            case STRING_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case BOOLEAN_TYPE:
                fArr[0] = this.mBooleanValue ? 1.0f : 0.0f;
                return;
            case DIMENSION_TYPE:
                fArr[0] = this.mFloatValue;
                return;
            default:
                return;
        }
    }

    public boolean isContinuous() {
        int ordinal = this.mType.ordinal();
        return (ordinal == 4 || ordinal == 5 || ordinal == 7) ? false : true;
    }

    public int numberOfInterpolatedValues() {
        int ordinal = this.mType.ordinal();
        return (ordinal == 2 || ordinal == 3) ? 4 : 1;
    }

    public void setColorValue(int i8) {
        this.mColorValue = i8;
    }

    public void setFloatValue(float f8) {
        this.mFloatValue = f8;
    }

    public void setIntValue(int i8) {
        this.mIntegerValue = i8;
    }

    public void setStringValue(String str) {
        this.mStringValue = str;
    }

    public void setValue(float[] fArr) {
        switch (this.mType) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.mIntegerValue = (int) fArr[0];
                return;
            case FLOAT_TYPE:
                this.mFloatValue = fArr[0];
                return;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int hsvToRgb = hsvToRgb(fArr[0], fArr[1], fArr[2]);
                this.mColorValue = hsvToRgb;
                this.mColorValue = (clamp((int) (fArr[3] * 255.0f)) << 24) | (hsvToRgb & ViewCompat.MEASURED_SIZE_MASK);
                return;
            case STRING_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case BOOLEAN_TYPE:
                this.mBooleanValue = ((double) fArr[0]) > 0.5d;
                return;
            case DIMENSION_TYPE:
                this.mFloatValue = fArr[0];
                return;
            default:
                return;
        }
    }

    public CustomAttribute(String str, AttributeType attributeType, Object obj, boolean z7) {
        this.mName = str;
        this.mType = attributeType;
        this.mMethod = z7;
        setValue(obj);
    }

    public CustomAttribute(CustomAttribute customAttribute, Object obj) {
        this.mMethod = false;
        this.mName = customAttribute.mName;
        this.mType = customAttribute.mType;
        setValue(obj);
    }

    public void setValue(Object obj) {
        switch (this.mType) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.mIntegerValue = ((Integer) obj).intValue();
                break;
            case FLOAT_TYPE:
                this.mFloatValue = ((Float) obj).floatValue();
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.mColorValue = ((Integer) obj).intValue();
                break;
            case STRING_TYPE:
                this.mStringValue = (String) obj;
                break;
            case BOOLEAN_TYPE:
                this.mBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case DIMENSION_TYPE:
                this.mFloatValue = ((Float) obj).floatValue();
                break;
        }
    }
}
