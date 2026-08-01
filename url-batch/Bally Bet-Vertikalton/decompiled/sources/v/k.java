package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import r.AbstractC0294a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f3984j;

    /* renamed from: a, reason: collision with root package name */
    public int f3985a;

    /* renamed from: b, reason: collision with root package name */
    public int f3986b;

    /* renamed from: c, reason: collision with root package name */
    public int f3987c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3988e;

    /* renamed from: f, reason: collision with root package name */
    public float f3989f;

    /* renamed from: g, reason: collision with root package name */
    public int f3990g;
    public String h;
    public int i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3984j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f4015f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (f3984j.get(index)) {
                case 1:
                    this.f3988e = obtainStyledAttributes.getFloat(index, this.f3988e);
                    break;
                case 2:
                    this.f3987c = obtainStyledAttributes.getInt(index, this.f3987c);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC0294a.f3557a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f3985a = n.f(obtainStyledAttributes, index, this.f3985a);
                    break;
                case 6:
                    this.f3986b = obtainStyledAttributes.getInteger(index, this.f3986b);
                    break;
                case 7:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 8:
                    this.f3990g = obtainStyledAttributes.getInteger(index, this.f3990g);
                    break;
                case 9:
                    this.f3989f = obtainStyledAttributes.getFloat(index, this.f3989f);
                    break;
                case 10:
                    int i2 = obtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        this.i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i2 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.h = string;
                        if (string.indexOf("/") > 0) {
                            this.i = obtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        obtainStyledAttributes.getInteger(index, this.i);
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
