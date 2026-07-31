package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes6.dex */
public abstract class Key {
    public static int UNSET = -1;
    HashMap mCustomConstraints;
    int mFramePosition;
    int mTargetId;
    String mTargetString;
    protected int mType;

    public abstract void addValues(HashMap hashMap);

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public abstract Key mo2631clone();

    abstract void getAttributeNames(HashSet hashSet);

    abstract void load(Context context, AttributeSet attributeSet);

    public void setInterpolation(HashMap hashMap) {
    }

    public Key() {
        int i = UNSET;
        this.mFramePosition = i;
        this.mTargetId = i;
        this.mTargetString = null;
    }

    boolean matches(String str) {
        String str2 = this.mTargetString;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    float toFloat(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    int toInt(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }

    boolean toBoolean(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    public Key copy(Key key) {
        this.mFramePosition = key.mFramePosition;
        this.mTargetId = key.mTargetId;
        this.mTargetString = key.mTargetString;
        this.mType = key.mType;
        this.mCustomConstraints = key.mCustomConstraints;
        return this;
    }

    public Key setViewId(int i) {
        this.mTargetId = i;
        return this;
    }

    public void setFramePosition(int i) {
        this.mFramePosition = i;
    }
}
