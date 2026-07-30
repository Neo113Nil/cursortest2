package androidx.constraintlayout.core.dsl;

import com.baidu.ar.util.SystemInfoUtil;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class Ref {
    private String mId;
    private float mPostMargin;
    private float mPreMargin;
    private float mWeight;

    Ref(String str) {
        this.mWeight = Float.NaN;
        this.mPreMargin = Float.NaN;
        this.mPostMargin = Float.NaN;
        this.mId = str;
    }

    public static void addStringToReferences(String str, ArrayList<Ref> arrayList) {
        Object obj;
        if (str == null || str.length() == 0) {
            return;
        }
        Object[] objArr = new Object[4];
        StringBuilder sb = new StringBuilder();
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt != ' ' && charAt != '\'') {
                if (charAt == ',') {
                    if (i8 < 3) {
                        objArr[i8] = sb.toString();
                        sb.setLength(0);
                        i8++;
                    }
                    if (i9 == 1 && (obj = objArr[0]) != null) {
                        arrayList.add(new Ref(obj.toString()));
                        objArr[0] = null;
                        i8 = 0;
                    }
                } else if (charAt == '[') {
                    i9++;
                } else if (charAt != ']') {
                    sb.append(charAt);
                } else if (i9 > 0) {
                    i9--;
                    objArr[i8] = sb.toString();
                    sb.setLength(0);
                    Object obj2 = objArr[0];
                    if (obj2 != null) {
                        arrayList.add(new Ref(obj2.toString(), parseFloat(objArr[1]), parseFloat(objArr[2]), parseFloat(objArr[3])));
                        Arrays.fill(objArr, (Object) null);
                        i8 = 0;
                    }
                }
            }
        }
    }

    public static float parseFloat(Object obj) {
        try {
            return Float.parseFloat(obj.toString());
        } catch (Exception unused) {
            return Float.NaN;
        }
    }

    public static Ref parseStringToRef(String str) {
        String[] split = str.replaceAll("[\\[\\]\\']", "").split(SystemInfoUtil.COMMA);
        if (split.length == 0) {
            return null;
        }
        Object[] objArr = new Object[4];
        for (int i8 = 0; i8 < split.length && i8 < 4; i8++) {
            objArr[i8] = split[i8];
        }
        return new Ref(objArr[0].toString().replace("'", ""), parseFloat(objArr[1]), parseFloat(objArr[2]), parseFloat(objArr[3]));
    }

    public String getId() {
        return this.mId;
    }

    public float getPostMargin() {
        return this.mPostMargin;
    }

    public float getPreMargin() {
        return this.mPreMargin;
    }

    public float getWeight() {
        return this.mWeight;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setPostMargin(float f8) {
        this.mPostMargin = f8;
    }

    public void setPreMargin(float f8) {
        this.mPreMargin = f8;
    }

    public void setWeight(float f8) {
        this.mWeight = f8;
    }

    public String toString() {
        String str = this.mId;
        if (str == null || str.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z7 = (Float.isNaN(this.mWeight) && Float.isNaN(this.mPreMargin) && Float.isNaN(this.mPostMargin)) ? false : true;
        if (z7) {
            sb.append("[");
        }
        sb.append("'");
        sb.append(this.mId);
        sb.append("'");
        if (!Float.isNaN(this.mPostMargin)) {
            sb.append(SystemInfoUtil.COMMA);
            sb.append(!Float.isNaN(this.mWeight) ? this.mWeight : 0.0f);
            sb.append(SystemInfoUtil.COMMA);
            sb.append(Float.isNaN(this.mPreMargin) ? 0.0f : this.mPreMargin);
            sb.append(SystemInfoUtil.COMMA);
            sb.append(this.mPostMargin);
        } else if (!Float.isNaN(this.mPreMargin)) {
            sb.append(SystemInfoUtil.COMMA);
            sb.append(Float.isNaN(this.mWeight) ? 0.0f : this.mWeight);
            sb.append(SystemInfoUtil.COMMA);
            sb.append(this.mPreMargin);
        } else if (!Float.isNaN(this.mWeight)) {
            sb.append(SystemInfoUtil.COMMA);
            sb.append(this.mWeight);
        }
        if (z7) {
            sb.append("]");
        }
        sb.append(SystemInfoUtil.COMMA);
        return sb.toString();
    }

    Ref(String str, float f8) {
        this.mPreMargin = Float.NaN;
        this.mPostMargin = Float.NaN;
        this.mId = str;
        this.mWeight = f8;
    }

    Ref(String str, float f8, float f9) {
        this.mPostMargin = Float.NaN;
        this.mId = str;
        this.mWeight = f8;
        this.mPreMargin = f9;
    }

    Ref(String str, float f8, float f9, float f10) {
        this.mId = str;
        this.mWeight = f8;
        this.mPreMargin = f9;
        this.mPostMargin = f10;
    }
}
