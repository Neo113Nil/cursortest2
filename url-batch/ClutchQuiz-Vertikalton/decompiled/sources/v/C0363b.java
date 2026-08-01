package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import q.AbstractC0317e;

/* renamed from: v.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0363b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3784a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3785b;

    /* renamed from: c, reason: collision with root package name */
    public int f3786c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public String f3787e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3788f;

    /* renamed from: g, reason: collision with root package name */
    public int f3789g;

    public C0363b(C0363b c0363b, Object obj) {
        c0363b.getClass();
        this.f3785b = c0363b.f3785b;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i = 0;
        boolean z2 = false;
        Object obj = null;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            int i3 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z2 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else {
                int i4 = 3;
                if (index == 3) {
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i4 = 4;
                    if (index == 2) {
                        obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i4 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i = 2;
                            } else {
                                if (index == 6) {
                                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    obj = obtainStyledAttributes.getString(index);
                                } else {
                                    i3 = 8;
                                    if (index == 8) {
                                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        obj = Integer.valueOf(resourceId);
                                    }
                                }
                                i = i3;
                            }
                        }
                        i = 7;
                    }
                }
                i = i4;
            }
        }
        if (str != null && obj != null) {
            C0363b c0363b = new C0363b();
            c0363b.f3785b = i;
            c0363b.f3784a = z2;
            c0363b.b(obj);
            hashMap.put(str, c0363b);
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (AbstractC0317e.a(this.f3785b)) {
            case 0:
            case 7:
                this.f3786c = ((Integer) obj).intValue();
                break;
            case 1:
                this.d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f3789g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f3787e = (String) obj;
                break;
            case 5:
                this.f3788f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.d = ((Float) obj).floatValue();
                break;
        }
    }
}
