package x;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import t.AbstractC0382a;

/* loaded from: classes.dex */
public final class k {
    public static final SparseIntArray j;

    /* renamed from: a, reason: collision with root package name */
    public int f4674a;

    /* renamed from: b, reason: collision with root package name */
    public int f4675b;

    /* renamed from: c, reason: collision with root package name */
    public int f4676c;

    /* renamed from: d, reason: collision with root package name */
    public float f4677d;
    public float e;

    /* renamed from: f, reason: collision with root package name */
    public float f4678f;

    /* renamed from: g, reason: collision with root package name */
    public int f4679g;

    /* renamed from: h, reason: collision with root package name */
    public String f4680h;
    public int i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        j = sparseIntArray;
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f4706f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (j.get(index)) {
                case 1:
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                    break;
                case 2:
                    this.f4676c = obtainStyledAttributes.getInt(index, this.f4676c);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC0382a.f4143a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f4674a = n.f(obtainStyledAttributes, index, this.f4674a);
                    break;
                case 6:
                    this.f4675b = obtainStyledAttributes.getInteger(index, this.f4675b);
                    break;
                case 7:
                    this.f4677d = obtainStyledAttributes.getFloat(index, this.f4677d);
                    break;
                case 8:
                    this.f4679g = obtainStyledAttributes.getInteger(index, this.f4679g);
                    break;
                case 9:
                    this.f4678f = obtainStyledAttributes.getFloat(index, this.f4678f);
                    break;
                case 10:
                    int i2 = obtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        this.i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i2 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.f4680h = string;
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
