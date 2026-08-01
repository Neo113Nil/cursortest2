package l2;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import com.oriondriftchasers.arordrft.R;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2575a;

    /* renamed from: b, reason: collision with root package name */
    public a0.a f2576b;

    /* renamed from: c, reason: collision with root package name */
    public int[][] f2577c;
    public a0.a[] d;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        c0 c0Var;
        int attributeCount;
        int i;
        int i4;
        int[][] iArr;
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
                int[] iArr2 = n1.a.G;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, 0, 0);
                TypedValue peekValue = obtainAttributes.peekValue(0);
                if (peekValue != null) {
                    int i5 = peekValue.type;
                    if (i5 == 5) {
                        c0Var = new c0(2, TypedValue.complexToDimensionPixelSize(peekValue.data, obtainAttributes.getResources().getDisplayMetrics()));
                    } else if (i5 == 6) {
                        c0Var = new c0(1, peekValue.getFraction(1.0f, 1.0f));
                    }
                    obtainAttributes.recycle();
                    attributeCount = attributeSet.getAttributeCount();
                    int[] iArr3 = new int[attributeCount];
                    int i6 = 0;
                    for (i = 0; i < attributeCount; i++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i);
                        if (attributeNameResource != R.attr.widthChange) {
                            int i7 = i6 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr3[i6] = attributeNameResource;
                            i6 = i7;
                        }
                    }
                    int[] trimStateSet = StateSet.trimStateSet(iArr3, i6);
                    a0.a aVar = new a0.a(19, false);
                    aVar.f81g = c0Var;
                    i4 = this.f2575a;
                    if (i4 != 0 || trimStateSet.length == 0) {
                        this.f2576b = aVar;
                    }
                    iArr = this.f2577c;
                    if (i4 >= iArr.length) {
                        int i8 = i4 + 10;
                        int[][] iArr4 = new int[i8][];
                        System.arraycopy(iArr, 0, iArr4, 0, i4);
                        this.f2577c = iArr4;
                        a0.a[] aVarArr = new a0.a[i8];
                        System.arraycopy(this.d, 0, aVarArr, 0, i4);
                        this.d = aVarArr;
                    }
                    int[][] iArr5 = this.f2577c;
                    int i9 = this.f2575a;
                    iArr5[i9] = trimStateSet;
                    this.d[i9] = aVar;
                    this.f2575a = i9 + 1;
                }
                c0Var = null;
                obtainAttributes.recycle();
                attributeCount = attributeSet.getAttributeCount();
                int[] iArr32 = new int[attributeCount];
                int i62 = 0;
                while (i < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr32, i62);
                a0.a aVar2 = new a0.a(19, false);
                aVar2.f81g = c0Var;
                i4 = this.f2575a;
                if (i4 != 0) {
                }
                this.f2576b = aVar2;
                iArr = this.f2577c;
                if (i4 >= iArr.length) {
                }
                int[][] iArr52 = this.f2577c;
                int i92 = this.f2575a;
                iArr52[i92] = trimStateSet2;
                this.d[i92] = aVar2;
                this.f2575a = i92 + 1;
            }
        }
    }
}
