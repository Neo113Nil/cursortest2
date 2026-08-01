package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import r.AbstractC0293a;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f3959j;

    /* renamed from: a, reason: collision with root package name */
    public int f3960a;

    /* renamed from: b, reason: collision with root package name */
    public int f3961b;

    /* renamed from: c, reason: collision with root package name */
    public int f3962c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3963e;

    /* renamed from: f, reason: collision with root package name */
    public float f3964f;

    /* renamed from: g, reason: collision with root package name */
    public int f3965g;
    public String h;
    public int i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3959j = sparseIntArray;
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f3990f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (f3959j.get(index)) {
                case 1:
                    this.f3963e = obtainStyledAttributes.getFloat(index, this.f3963e);
                    break;
                case 2:
                    this.f3962c = obtainStyledAttributes.getInt(index, this.f3962c);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC0293a.f3393a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f3960a = o.f(obtainStyledAttributes, index, this.f3960a);
                    break;
                case 6:
                    this.f3961b = obtainStyledAttributes.getInteger(index, this.f3961b);
                    break;
                case 7:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 8:
                    this.f3965g = obtainStyledAttributes.getInteger(index, this.f3965g);
                    break;
                case 9:
                    this.f3964f = obtainStyledAttributes.getFloat(index, this.f3964f);
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
