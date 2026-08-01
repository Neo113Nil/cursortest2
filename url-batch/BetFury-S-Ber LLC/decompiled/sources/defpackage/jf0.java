package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import com.trembin.nirefon.betfury.R;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class jf0 {
    public int a;
    public kz b;
    public int[][] c;
    public kz[] d;

    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        hf0 hf0Var;
        int attributeCount;
        int i;
        int i2;
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
                int[] iArr2 = c70.J;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, 0, 0);
                TypedValue peekValue = obtainAttributes.peekValue(0);
                if (peekValue != null) {
                    int i3 = peekValue.type;
                    if (i3 == 5) {
                        hf0Var = new hf0(if0.PIXELS, TypedValue.complexToDimensionPixelSize(peekValue.data, obtainAttributes.getResources().getDisplayMetrics()));
                    } else if (i3 == 6) {
                        hf0Var = new hf0(if0.PERCENT, peekValue.getFraction(1.0f, 1.0f));
                    }
                    obtainAttributes.recycle();
                    attributeCount = attributeSet.getAttributeCount();
                    int[] iArr3 = new int[attributeCount];
                    int i4 = 0;
                    for (i = 0; i < attributeCount; i++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i);
                        if (attributeNameResource != R.attr.widthChange) {
                            int i5 = i4 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr3[i4] = attributeNameResource;
                            i4 = i5;
                        }
                    }
                    int[] trimStateSet = StateSet.trimStateSet(iArr3, i4);
                    kz kzVar = new kz();
                    kzVar.f = hf0Var;
                    i2 = this.a;
                    if (i2 != 0 || trimStateSet.length == 0) {
                        this.b = kzVar;
                    }
                    iArr = this.c;
                    if (i2 >= iArr.length) {
                        int i6 = i2 + 10;
                        int[][] iArr4 = new int[i6][];
                        System.arraycopy(iArr, 0, iArr4, 0, i2);
                        this.c = iArr4;
                        kz[] kzVarArr = new kz[i6];
                        System.arraycopy(this.d, 0, kzVarArr, 0, i2);
                        this.d = kzVarArr;
                    }
                    int[][] iArr5 = this.c;
                    int i7 = this.a;
                    iArr5[i7] = trimStateSet;
                    this.d[i7] = kzVar;
                    this.a = i7 + 1;
                }
                hf0Var = null;
                obtainAttributes.recycle();
                attributeCount = attributeSet.getAttributeCount();
                int[] iArr32 = new int[attributeCount];
                int i42 = 0;
                while (i < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr32, i42);
                kz kzVar2 = new kz();
                kzVar2.f = hf0Var;
                i2 = this.a;
                if (i2 != 0) {
                }
                this.b = kzVar2;
                iArr = this.c;
                if (i2 >= iArr.length) {
                }
                int[][] iArr52 = this.c;
                int i72 = this.a;
                iArr52[i72] = trimStateSet2;
                this.d[i72] = kzVar2;
                this.a = i72 + 1;
            }
        }
    }
}
