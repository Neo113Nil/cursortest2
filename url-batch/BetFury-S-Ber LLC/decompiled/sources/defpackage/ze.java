package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ze {
    public boolean a = false;
    public ye b;
    public int c;
    public float d;
    public String e;
    public boolean f;
    public int g;

    public ze(ze zeVar, Object obj) {
        zeVar.getClass();
        this.b = zeVar.b;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        ye yeVar;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), x60.d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        ye yeVar2 = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                yeVar2 = ye.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    yeVar = ye.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    yeVar = ye.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 7) {
                    yeVar = ye.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    yeVar = ye.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    yeVar = ye.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == 6) {
                    yeVar = ye.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == 9) {
                    yeVar = ye.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == 8) {
                    yeVar = ye.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Object obj2 = valueOf;
                yeVar2 = yeVar;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            ze zeVar = new ze();
            zeVar.b = yeVar2;
            zeVar.a = z;
            zeVar.b(obj);
            hashMap.put(str, zeVar);
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (this.b) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.c = ((Integer) obj).intValue();
                break;
            case FLOAT_TYPE:
                this.d = ((Float) obj).floatValue();
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.g = ((Integer) obj).intValue();
                break;
            case STRING_TYPE:
                this.e = (String) obj;
                break;
            case BOOLEAN_TYPE:
                this.f = ((Boolean) obj).booleanValue();
                break;
            case DIMENSION_TYPE:
                this.d = ((Float) obj).floatValue();
                break;
        }
    }
}
