package w5;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import com.snovikpovik.vuevnxsj.R;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public int f8080a;

    /* renamed from: b, reason: collision with root package name */
    public q3.k f8081b;

    /* renamed from: c, reason: collision with root package name */
    public int[][] f8082c;

    /* renamed from: d, reason: collision with root package name */
    public q3.k[] f8083d;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        c0 c0Var;
        int attributeCount;
        int i;
        int i8;
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
                int[] iArr2 = f5.a.f2756v;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, 0, 0);
                TypedValue peekValue = obtainAttributes.peekValue(0);
                if (peekValue != null) {
                    int i9 = peekValue.type;
                    if (i9 == 5) {
                        c0Var = new c0(2, TypedValue.complexToDimensionPixelSize(peekValue.data, obtainAttributes.getResources().getDisplayMetrics()));
                    } else if (i9 == 6) {
                        c0Var = new c0(1, peekValue.getFraction(1.0f, 1.0f));
                    }
                    obtainAttributes.recycle();
                    attributeCount = attributeSet.getAttributeCount();
                    int[] iArr3 = new int[attributeCount];
                    int i10 = 0;
                    for (i = 0; i < attributeCount; i++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i);
                        if (attributeNameResource != R.attr.widthChange) {
                            int i11 = i10 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr3[i10] = attributeNameResource;
                            i10 = i11;
                        }
                    }
                    int[] trimStateSet = StateSet.trimStateSet(iArr3, i10);
                    q3.k kVar = new q3.k(15);
                    kVar.f6119e = c0Var;
                    i8 = this.f8080a;
                    if (i8 != 0 || trimStateSet.length == 0) {
                        this.f8081b = kVar;
                    }
                    iArr = this.f8082c;
                    if (i8 >= iArr.length) {
                        int i12 = i8 + 10;
                        int[][] iArr4 = new int[i12][];
                        System.arraycopy(iArr, 0, iArr4, 0, i8);
                        this.f8082c = iArr4;
                        q3.k[] kVarArr = new q3.k[i12];
                        System.arraycopy(this.f8083d, 0, kVarArr, 0, i8);
                        this.f8083d = kVarArr;
                    }
                    int[][] iArr5 = this.f8082c;
                    int i13 = this.f8080a;
                    iArr5[i13] = trimStateSet;
                    this.f8083d[i13] = kVar;
                    this.f8080a = i13 + 1;
                }
                c0Var = null;
                obtainAttributes.recycle();
                attributeCount = attributeSet.getAttributeCount();
                int[] iArr32 = new int[attributeCount];
                int i102 = 0;
                while (i < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr32, i102);
                q3.k kVar2 = new q3.k(15);
                kVar2.f6119e = c0Var;
                i8 = this.f8080a;
                if (i8 != 0) {
                }
                this.f8081b = kVar2;
                iArr = this.f8082c;
                if (i8 >= iArr.length) {
                }
                int[][] iArr52 = this.f8082c;
                int i132 = this.f8080a;
                iArr52[i132] = trimStateSet2;
                this.f8083d[i132] = kVar2;
                this.f8080a = i132 + 1;
            }
        }
    }
}
