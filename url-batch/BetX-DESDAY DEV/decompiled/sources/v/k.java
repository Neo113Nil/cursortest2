package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.luckyarcade.spinthrow.GameConfig;
import r.AbstractC0322a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f4410j;

    /* renamed from: a, reason: collision with root package name */
    public int f4411a;

    /* renamed from: b, reason: collision with root package name */
    public int f4412b;

    /* renamed from: c, reason: collision with root package name */
    public int f4413c;

    /* renamed from: d, reason: collision with root package name */
    public float f4414d;

    /* renamed from: e, reason: collision with root package name */
    public float f4415e;

    /* renamed from: f, reason: collision with root package name */
    public float f4416f;

    /* renamed from: g, reason: collision with root package name */
    public int f4417g;
    public String h;
    public int i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4410j = sparseIntArray;
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f4446f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (f4410j.get(index)) {
                case 1:
                    this.f4415e = obtainStyledAttributes.getFloat(index, this.f4415e);
                    break;
                case 2:
                    this.f4413c = obtainStyledAttributes.getInt(index, this.f4413c);
                    break;
                case GameConfig.COMBO_EVERY /* 3 */:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC0322a.f3966a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f4411a = n.f(obtainStyledAttributes, index, this.f4411a);
                    break;
                case 6:
                    this.f4412b = obtainStyledAttributes.getInteger(index, this.f4412b);
                    break;
                case 7:
                    this.f4414d = obtainStyledAttributes.getFloat(index, this.f4414d);
                    break;
                case 8:
                    this.f4417g = obtainStyledAttributes.getInteger(index, this.f4417g);
                    break;
                case 9:
                    this.f4416f = obtainStyledAttributes.getFloat(index, this.f4416f);
                    break;
                case GameConfig.SCORE_PER_STICK /* 10 */:
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
