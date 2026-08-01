package o2;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import com.gdmhkmf.belbet.R;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2915a;

    /* renamed from: b, reason: collision with root package name */
    public d f2916b;

    /* renamed from: c, reason: collision with root package name */
    public int[][] f2917c = new int[10][];
    public d[] d = new d[10];

    public static a0 b(d dVar) {
        a0 a0Var = new a0();
        a0Var.a(StateSet.WILD_CARD, dVar);
        return a0Var;
    }

    public final void a(int[] iArr, d dVar) {
        int i = this.f2915a;
        if (i == 0 || iArr.length == 0) {
            this.f2916b = dVar;
        }
        int[][] iArr2 = this.f2917c;
        if (i >= iArr2.length) {
            int i4 = i + 10;
            int[][] iArr3 = new int[i4][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.f2917c = iArr3;
            d[] dVarArr = new d[i4];
            System.arraycopy(this.d, 0, dVarArr, 0, i);
            this.d = dVarArr;
        }
        int[][] iArr4 = this.f2917c;
        int i5 = this.f2915a;
        iArr4[i5] = iArr;
        this.d[i5] = dVar;
        this.f2915a = i5 + 1;
    }

    public final d c(int[] iArr) {
        int i;
        int[][] iArr2 = this.f2917c;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i = -1;
            if (i5 >= this.f2915a) {
                i5 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i5], iArr)) {
                break;
            }
            i5++;
        }
        if (i5 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.f2917c;
            while (true) {
                if (i4 >= this.f2915a) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr4[i4], iArr3)) {
                    i = i4;
                    break;
                }
                i4++;
            }
            i5 = i;
        }
        return i5 < 0 ? this.f2916b : this.d[i5];
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = q1.a.F;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                d i = o.i(obtainAttributes, 5, new a(0.0f));
                obtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i4 = 0;
                for (int i5 = 0; i5 < attributeCount; i5++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i5);
                    if (attributeNameResource != R.attr.cornerSize) {
                        int i6 = i4 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i5, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i4] = attributeNameResource;
                        i4 = i6;
                    }
                }
                a(StateSet.trimStateSet(iArr2, i4), i);
            }
        }
    }
}
