package b3;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1066a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f1067b;

    /* renamed from: c, reason: collision with root package name */
    public int f1068c;

    /* renamed from: d, reason: collision with root package name */
    public float f1069d;

    /* renamed from: e, reason: collision with root package name */
    public String f1070e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1071f;

    /* renamed from: g, reason: collision with root package name */
    public int f1072g;

    public b(b bVar, Object obj) {
        bVar.getClass();
        this.f1067b = bVar.f1067b;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.f1231d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i = 0;
        boolean z3 = false;
        Object obj = null;
        for (int i8 = 0; i8 < indexCount; i8++) {
            int index = obtainStyledAttributes.getIndex(i8);
            int i9 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z3 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else {
                int i10 = 3;
                if (index == 3) {
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i10 = 4;
                    if (index == 2) {
                        obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i10 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i = 2;
                            } else {
                                if (index == 6) {
                                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    obj = obtainStyledAttributes.getString(index);
                                } else {
                                    i9 = 8;
                                    if (index == 8) {
                                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        obj = Integer.valueOf(resourceId);
                                    }
                                }
                                i = i9;
                            }
                        }
                        i = 7;
                    }
                }
                i = i10;
            }
        }
        if (str != null && obj != null) {
            b bVar = new b();
            bVar.f1067b = i;
            bVar.f1066a = z3;
            bVar.b(obj);
            hashMap.put(str, bVar);
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (w2.e.a(this.f1067b)) {
            case 0:
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f1068c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f1069d = ((Float) obj).floatValue();
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                this.f1072g = ((Integer) obj).intValue();
                break;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                this.f1070e = (String) obj;
                break;
            case 5:
                this.f1071f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f1069d = ((Float) obj).floatValue();
                break;
        }
    }
}
