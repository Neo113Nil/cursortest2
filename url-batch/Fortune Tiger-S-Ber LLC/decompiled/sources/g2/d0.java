package g2;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import com.gglhk.bofio.fortunetiger.R;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public int f1838a;

    /* renamed from: b, reason: collision with root package name */
    public a2.e f1839b;
    public int[][] c;

    /* renamed from: d, reason: collision with root package name */
    public a2.e[] f1840d;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        c0 c0Var;
        int attributeCount;
        int i4;
        int i5;
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
                int[] iArr2 = l1.a.D;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, 0, 0);
                TypedValue peekValue = obtainAttributes.peekValue(0);
                if (peekValue != null) {
                    int i6 = peekValue.type;
                    if (i6 == 5) {
                        c0Var = new c0(2, TypedValue.complexToDimensionPixelSize(peekValue.data, obtainAttributes.getResources().getDisplayMetrics()));
                    } else if (i6 == 6) {
                        c0Var = new c0(1, peekValue.getFraction(1.0f, 1.0f));
                    }
                    obtainAttributes.recycle();
                    attributeCount = attributeSet.getAttributeCount();
                    int[] iArr3 = new int[attributeCount];
                    int i7 = 0;
                    for (i4 = 0; i4 < attributeCount; i4++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                        if (attributeNameResource != R.attr.widthChange) {
                            int i8 = i7 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr3[i7] = attributeNameResource;
                            i7 = i8;
                        }
                    }
                    int[] trimStateSet = StateSet.trimStateSet(iArr3, i7);
                    a2.e eVar = new a2.e(14, false);
                    eVar.g = c0Var;
                    i5 = this.f1838a;
                    if (i5 != 0 || trimStateSet.length == 0) {
                        this.f1839b = eVar;
                    }
                    iArr = this.c;
                    if (i5 >= iArr.length) {
                        int i9 = i5 + 10;
                        int[][] iArr4 = new int[i9][];
                        System.arraycopy(iArr, 0, iArr4, 0, i5);
                        this.c = iArr4;
                        a2.e[] eVarArr = new a2.e[i9];
                        System.arraycopy(this.f1840d, 0, eVarArr, 0, i5);
                        this.f1840d = eVarArr;
                    }
                    int[][] iArr5 = this.c;
                    int i10 = this.f1838a;
                    iArr5[i10] = trimStateSet;
                    this.f1840d[i10] = eVar;
                    this.f1838a = i10 + 1;
                }
                c0Var = null;
                obtainAttributes.recycle();
                attributeCount = attributeSet.getAttributeCount();
                int[] iArr32 = new int[attributeCount];
                int i72 = 0;
                while (i4 < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr32, i72);
                a2.e eVar2 = new a2.e(14, false);
                eVar2.g = c0Var;
                i5 = this.f1838a;
                if (i5 != 0) {
                }
                this.f1839b = eVar2;
                iArr = this.c;
                if (i5 >= iArr.length) {
                }
                int[][] iArr52 = this.c;
                int i102 = this.f1838a;
                iArr52[i102] = trimStateSet2;
                this.f1840d[i102] = eVar2;
                this.f1838a = i102 + 1;
            }
        }
    }
}
