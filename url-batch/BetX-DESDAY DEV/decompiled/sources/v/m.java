package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.luckyarcade.spinthrow.GameConfig;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f4422n;

    /* renamed from: a, reason: collision with root package name */
    public float f4423a;

    /* renamed from: b, reason: collision with root package name */
    public float f4424b;

    /* renamed from: c, reason: collision with root package name */
    public float f4425c;

    /* renamed from: d, reason: collision with root package name */
    public float f4426d;

    /* renamed from: e, reason: collision with root package name */
    public float f4427e;

    /* renamed from: f, reason: collision with root package name */
    public float f4428f;

    /* renamed from: g, reason: collision with root package name */
    public float f4429g;
    public int h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f4430j;

    /* renamed from: k, reason: collision with root package name */
    public float f4431k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4432l;

    /* renamed from: m, reason: collision with root package name */
    public float f4433m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4422n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (f4422n.get(index)) {
                case 1:
                    this.f4423a = obtainStyledAttributes.getFloat(index, this.f4423a);
                    break;
                case 2:
                    this.f4424b = obtainStyledAttributes.getFloat(index, this.f4424b);
                    break;
                case GameConfig.COMBO_EVERY /* 3 */:
                    this.f4425c = obtainStyledAttributes.getFloat(index, this.f4425c);
                    break;
                case 4:
                    this.f4426d = obtainStyledAttributes.getFloat(index, this.f4426d);
                    break;
                case 5:
                    this.f4427e = obtainStyledAttributes.getFloat(index, this.f4427e);
                    break;
                case 6:
                    this.f4428f = obtainStyledAttributes.getDimension(index, this.f4428f);
                    break;
                case 7:
                    this.f4429g = obtainStyledAttributes.getDimension(index, this.f4429g);
                    break;
                case 8:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.f4430j = obtainStyledAttributes.getDimension(index, this.f4430j);
                    break;
                case GameConfig.SCORE_PER_STICK /* 10 */:
                    this.f4431k = obtainStyledAttributes.getDimension(index, this.f4431k);
                    break;
                case 11:
                    this.f4432l = true;
                    this.f4433m = obtainStyledAttributes.getDimension(index, this.f4433m);
                    break;
                case 12:
                    this.h = n.f(obtainStyledAttributes, index, this.h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
