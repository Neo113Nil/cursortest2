package g2;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import com.gglhk.bofio.fortunetiger.R;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public int f1825a;

    /* renamed from: b, reason: collision with root package name */
    public d f1826b;
    public int[][] c = new int[10][];

    /* renamed from: d, reason: collision with root package name */
    public d[] f1827d = new d[10];

    public static a0 b(d dVar) {
        a0 a0Var = new a0();
        a0Var.a(StateSet.WILD_CARD, dVar);
        return a0Var;
    }

    public final void a(int[] iArr, d dVar) {
        int i4 = this.f1825a;
        if (i4 == 0 || iArr.length == 0) {
            this.f1826b = dVar;
        }
        int[][] iArr2 = this.c;
        if (i4 >= iArr2.length) {
            int i5 = i4 + 10;
            int[][] iArr3 = new int[i5][];
            System.arraycopy(iArr2, 0, iArr3, 0, i4);
            this.c = iArr3;
            d[] dVarArr = new d[i5];
            System.arraycopy(this.f1827d, 0, dVarArr, 0, i4);
            this.f1827d = dVarArr;
        }
        int[][] iArr4 = this.c;
        int i6 = this.f1825a;
        iArr4[i6] = iArr;
        this.f1827d[i6] = dVar;
        this.f1825a = i6 + 1;
    }

    public final d c(int[] iArr) {
        int i4;
        int[][] iArr2 = this.c;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i4 = -1;
            if (i6 >= this.f1825a) {
                i6 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i6], iArr)) {
                break;
            }
            i6++;
        }
        if (i6 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.c;
            while (true) {
                if (i5 >= this.f1825a) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr4[i5], iArr3)) {
                    i4 = i5;
                    break;
                }
                i5++;
            }
            i6 = i4;
        }
        return i6 < 0 ? this.f1826b : this.f1827d[i6];
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
                int[] iArr = l1.a.A;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                d h = o.h(obtainAttributes, 5, new a(0.0f));
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
                a(StateSet.trimStateSet(iArr2, i4), h);
            }
        }
    }
}
