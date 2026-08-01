package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import com.awerser.monnit.betplay.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class g40 implements l20 {
    public final int a;
    public final n20 b;
    public final int[][] c;
    public final n20[] d;
    public final f40 e;
    public final f40 f;
    public final f40 g;
    public final f40 h;

    public g40(xo xoVar) {
        this.a = xoVar.b;
        this.b = (n20) xoVar.c;
        this.c = (int[][]) xoVar.d;
        this.d = (n20[]) xoVar.e;
        this.e = (f40) xoVar.f;
        this.f = (f40) xoVar.g;
        this.g = (f40) xoVar.h;
        this.h = (f40) xoVar.i;
    }

    public static void g(xo xoVar, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
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
                int[] iArr = ly.y;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                int resourceId = obtainAttributes.getResourceId(0, 0);
                int resourceId2 = obtainAttributes.getResourceId(1, 0);
                g gVar = new g(0.0f);
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
                if (resourceId2 != 0) {
                    contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
                }
                n20 a = n20.h(contextThemeWrapper.obtainStyledAttributes(ly.F), gVar).a();
                obtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                xoVar.a(StateSet.trimStateSet(iArr2, i), a);
            }
        }
    }

    public static g40 h(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        xo xoVar = new xo(1);
        xoVar.e();
        try {
            xml = context.getResources().getXml(resourceId);
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            xoVar.e();
        }
        try {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (xml.getName().equals("selector")) {
                g(xoVar, context, xml, asAttributeSet, context.getTheme());
            }
            xml.close();
            return xoVar.c();
        } catch (Throwable th) {
            if (xml != null) {
                try {
                    xml.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // defpackage.l20
    public final n20 a(float f) {
        return i().a(f);
    }

    @Override // defpackage.l20
    public final n20 b(int[] iArr) {
        int i;
        int i2;
        int[][] iArr2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = -1;
            i2 = this.a;
            iArr2 = this.c;
            if (i4 >= i2) {
                i4 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i4], iArr)) {
                break;
            }
            i4++;
        }
        if (i4 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr2[i3], iArr3)) {
                    i = i3;
                    break;
                }
                i3++;
            }
            i4 = i;
        }
        n20[] n20VarArr = this.d;
        f40 f40Var = this.h;
        f40 f40Var2 = this.g;
        f40 f40Var3 = this.f;
        f40 f40Var4 = this.e;
        if (f40Var4 == null && f40Var3 == null && f40Var2 == null && f40Var == null) {
            return n20VarArr[i4];
        }
        m20 k = n20VarArr[i4].k();
        if (f40Var4 != null) {
            k.e = f40Var4.c(iArr);
        }
        if (f40Var3 != null) {
            k.f = f40Var3.c(iArr);
        }
        if (f40Var2 != null) {
            k.h = f40Var2.c(iArr);
        }
        if (f40Var != null) {
            k.g = f40Var.c(iArr);
        }
        return k.a();
    }

    @Override // defpackage.l20
    public final n20[] c() {
        return this.d;
    }

    @Override // defpackage.l20
    public final n20 d() {
        return i();
    }

    @Override // defpackage.l20
    public final n20 e(i00 i00Var) {
        return i().e(i00Var);
    }

    @Override // defpackage.l20
    public final boolean f() {
        f40 f40Var;
        f40 f40Var2;
        f40 f40Var3;
        f40 f40Var4;
        return this.a > 1 || ((f40Var = this.e) != null && f40Var.a > 1) || (((f40Var2 = this.f) != null && f40Var2.a > 1) || (((f40Var3 = this.g) != null && f40Var3.a > 1) || ((f40Var4 = this.h) != null && f40Var4.a > 1)));
    }

    public final n20 i() {
        n20 n20Var = this.b;
        f40 f40Var = this.h;
        f40 f40Var2 = this.g;
        f40 f40Var3 = this.f;
        f40 f40Var4 = this.e;
        if (f40Var4 == null && f40Var3 == null && f40Var2 == null && f40Var == null) {
            return n20Var;
        }
        m20 k = n20Var.k();
        if (f40Var4 != null) {
            k.e = f40Var4.b;
        }
        if (f40Var3 != null) {
            k.f = f40Var3.b;
        }
        if (f40Var2 != null) {
            k.h = f40Var2.b;
        }
        if (f40Var != null) {
            k.g = f40Var.b;
        }
        return k.a();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [int[][], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Serializable, n20[]] */
    public final xo j() {
        xo xoVar = new xo(1);
        int i = this.a;
        xoVar.b = i;
        xoVar.c = this.b;
        int[][] iArr = this.c;
        ?? r3 = new int[iArr.length][];
        xoVar.d = r3;
        n20[] n20VarArr = this.d;
        xoVar.e = new n20[n20VarArr.length];
        System.arraycopy(iArr, 0, r3, 0, i);
        System.arraycopy(n20VarArr, 0, (n20[]) xoVar.e, 0, xoVar.b);
        xoVar.f = this.e;
        xoVar.g = this.f;
        xoVar.h = this.g;
        xoVar.i = this.h;
        return xoVar;
    }
}
