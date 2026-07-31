package w5;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import com.snovikpovik.vuevnxsj.R;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public int f8186a;

    /* renamed from: b, reason: collision with root package name */
    public d f8187b;

    /* renamed from: c, reason: collision with root package name */
    public int[][] f8188c = new int[10][];

    /* renamed from: d, reason: collision with root package name */
    public d[] f8189d = new d[10];

    public static z b(d dVar) {
        z zVar = new z();
        zVar.a(StateSet.WILD_CARD, dVar);
        return zVar;
    }

    public final void a(int[] iArr, d dVar) {
        int i = this.f8186a;
        if (i == 0 || iArr.length == 0) {
            this.f8187b = dVar;
        }
        int[][] iArr2 = this.f8188c;
        if (i >= iArr2.length) {
            int i8 = i + 10;
            int[][] iArr3 = new int[i8][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.f8188c = iArr3;
            d[] dVarArr = new d[i8];
            System.arraycopy(this.f8189d, 0, dVarArr, 0, i);
            this.f8189d = dVarArr;
        }
        int[][] iArr4 = this.f8188c;
        int i9 = this.f8186a;
        iArr4[i9] = iArr;
        this.f8189d[i9] = dVar;
        this.f8186a = i9 + 1;
    }

    public final d c(int[] iArr) {
        int i;
        int[][] iArr2 = this.f8188c;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i = -1;
            if (i9 >= this.f8186a) {
                i9 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i9], iArr)) {
                break;
            }
            i9++;
        }
        if (i9 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.f8188c;
            while (true) {
                if (i8 >= this.f8186a) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr4[i8], iArr3)) {
                    i = i8;
                    break;
                }
                i8++;
            }
            i9 = i;
        }
        return i9 < 0 ? this.f8187b : this.f8189d[i9];
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
                int[] iArr = f5.a.f2753s;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                d c8 = n.c(obtainAttributes, 5, new a(0.0f));
                obtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i8 = 0; i8 < attributeCount; i8++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i8);
                    if (attributeNameResource != R.attr.cornerSize) {
                        int i9 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i8, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i9;
                    }
                }
                a(StateSet.trimStateSet(iArr2, i), c8);
            }
        }
    }
}
