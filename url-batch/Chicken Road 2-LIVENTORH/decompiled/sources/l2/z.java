package l2;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import com.oriondriftchasers.arordrft.R;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public int f2670a;

    /* renamed from: b, reason: collision with root package name */
    public d f2671b;

    /* renamed from: c, reason: collision with root package name */
    public int[][] f2672c = new int[10][];
    public d[] d = new d[10];

    public static z b(d dVar) {
        z zVar = new z();
        zVar.a(StateSet.WILD_CARD, dVar);
        return zVar;
    }

    public final void a(int[] iArr, d dVar) {
        int i = this.f2670a;
        if (i == 0 || iArr.length == 0) {
            this.f2671b = dVar;
        }
        int[][] iArr2 = this.f2672c;
        if (i >= iArr2.length) {
            int i4 = i + 10;
            int[][] iArr3 = new int[i4][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.f2672c = iArr3;
            d[] dVarArr = new d[i4];
            System.arraycopy(this.d, 0, dVarArr, 0, i);
            this.d = dVarArr;
        }
        int[][] iArr4 = this.f2672c;
        int i5 = this.f2670a;
        iArr4[i5] = iArr;
        this.d[i5] = dVar;
        this.f2670a = i5 + 1;
    }

    public final d c(int[] iArr) {
        int i;
        int[][] iArr2 = this.f2672c;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i = -1;
            if (i5 >= this.f2670a) {
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
            int[][] iArr4 = this.f2672c;
            while (true) {
                if (i4 >= this.f2670a) {
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
        return i5 < 0 ? this.f2671b : this.d[i5];
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
                int[] iArr = n1.a.D;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                d d = n.d(obtainAttributes, 5, new a(0.0f));
                obtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i4 = 0; i4 < attributeCount; i4++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                    if (attributeNameResource != R.attr.cornerSize) {
                        int i5 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i5;
                    }
                }
                a(StateSet.trimStateSet(iArr2, i), d);
            }
        }
    }
}
