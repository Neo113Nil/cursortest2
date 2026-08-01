package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3434a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3435b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public float f3436d;

    /* renamed from: e, reason: collision with root package name */
    public String f3437e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3438f;
    public int g;

    public b(b bVar, Object obj) {
        bVar.getClass();
        this.f3435b = bVar.f3435b;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f3570d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i4 = 0;
        boolean z3 = false;
        Object obj = null;
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = obtainStyledAttributes.getIndex(i5);
            int i6 = 1;
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
                i4 = 6;
            } else {
                int i7 = 3;
                if (index == 3) {
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i7 = 4;
                    if (index == 2) {
                        obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i7 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i4 = 2;
                            } else {
                                if (index == 6) {
                                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    obj = obtainStyledAttributes.getString(index);
                                } else {
                                    i6 = 8;
                                    if (index == 8) {
                                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        obj = Integer.valueOf(resourceId);
                                    }
                                }
                                i4 = i6;
                            }
                        }
                        i4 = 7;
                    }
                }
                i4 = i7;
            }
        }
        if (str != null && obj != null) {
            b bVar = new b();
            bVar.f3435b = i4;
            bVar.f3434a = z3;
            bVar.b(obj);
            hashMap.put(str, bVar);
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (q.e.a(this.f3435b)) {
            case 0:
            case 7:
                this.c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f3436d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f3437e = (String) obj;
                break;
            case 5:
                this.f3438f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f3436d = ((Float) obj).floatValue();
                break;
        }
    }
}
