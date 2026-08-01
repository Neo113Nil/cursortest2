package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import com.trembin.nirefon.betfury.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class gf0 implements ed0 {
    public final int a;
    public final gd0 b;
    public final int[][] c;
    public final gd0[] d;
    public final ff0 e;
    public final ff0 f;
    public final ff0 g;
    public final ff0 h;

    public gf0(nu nuVar) {
        this.a = nuVar.b;
        this.b = (gd0) nuVar.c;
        this.c = (int[][]) nuVar.d;
        this.d = (gd0[]) nuVar.e;
        this.e = (ff0) nuVar.f;
        this.f = (ff0) nuVar.g;
        this.g = (ff0) nuVar.h;
        this.h = (ff0) nuVar.i;
    }

    public static void g(nu nuVar, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
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
                int[] iArr = c70.z;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                int resourceId = obtainAttributes.getResourceId(0, 0);
                int resourceId2 = obtainAttributes.getResourceId(1, 0);
                g gVar = new g(0.0f);
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
                if (resourceId2 != 0) {
                    contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
                }
                gd0 a = gd0.h(contextThemeWrapper.obtainStyledAttributes(c70.G), gVar).a();
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
                nuVar.a(StateSet.trimStateSet(iArr2, i), a);
            }
        }
    }

    public static gf0 h(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        nu nuVar = new nu(1);
        nuVar.e();
        try {
            xml = context.getResources().getXml(resourceId);
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            nuVar.e();
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
                g(nuVar, context, xml, asAttributeSet, context.getTheme());
            }
            xml.close();
            return nuVar.c();
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

    @Override // defpackage.ed0
    public final gd0 a(float f) {
        return i().a(f);
    }

    @Override // defpackage.ed0
    public final gd0 b(int[] iArr) {
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
        gd0[] gd0VarArr = this.d;
        ff0 ff0Var = this.h;
        ff0 ff0Var2 = this.g;
        ff0 ff0Var3 = this.f;
        ff0 ff0Var4 = this.e;
        if (ff0Var4 == null && ff0Var3 == null && ff0Var2 == null && ff0Var == null) {
            return gd0VarArr[i4];
        }
        fd0 k = gd0VarArr[i4].k();
        if (ff0Var4 != null) {
            k.e = ff0Var4.c(iArr);
        }
        if (ff0Var3 != null) {
            k.f = ff0Var3.c(iArr);
        }
        if (ff0Var2 != null) {
            k.h = ff0Var2.c(iArr);
        }
        if (ff0Var != null) {
            k.g = ff0Var.c(iArr);
        }
        return k.a();
    }

    @Override // defpackage.ed0
    public final gd0[] c() {
        return this.d;
    }

    @Override // defpackage.ed0
    public final gd0 d() {
        return i();
    }

    @Override // defpackage.ed0
    public final gd0 e(e90 e90Var) {
        return i().e(e90Var);
    }

    @Override // defpackage.ed0
    public final boolean f() {
        ff0 ff0Var;
        ff0 ff0Var2;
        ff0 ff0Var3;
        ff0 ff0Var4;
        return this.a > 1 || ((ff0Var = this.e) != null && ff0Var.a > 1) || (((ff0Var2 = this.f) != null && ff0Var2.a > 1) || (((ff0Var3 = this.g) != null && ff0Var3.a > 1) || ((ff0Var4 = this.h) != null && ff0Var4.a > 1)));
    }

    public final gd0 i() {
        gd0 gd0Var = this.b;
        ff0 ff0Var = this.h;
        ff0 ff0Var2 = this.g;
        ff0 ff0Var3 = this.f;
        ff0 ff0Var4 = this.e;
        if (ff0Var4 == null && ff0Var3 == null && ff0Var2 == null && ff0Var == null) {
            return gd0Var;
        }
        fd0 k = gd0Var.k();
        if (ff0Var4 != null) {
            k.e = ff0Var4.b;
        }
        if (ff0Var3 != null) {
            k.f = ff0Var3.b;
        }
        if (ff0Var2 != null) {
            k.h = ff0Var2.b;
        }
        if (ff0Var != null) {
            k.g = ff0Var.b;
        }
        return k.a();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [int[][], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [gd0[], java.io.Serializable] */
    public final nu j() {
        nu nuVar = new nu(1);
        int i = this.a;
        nuVar.b = i;
        nuVar.c = this.b;
        int[][] iArr = this.c;
        ?? r3 = new int[iArr.length][];
        nuVar.d = r3;
        gd0[] gd0VarArr = this.d;
        nuVar.e = new gd0[gd0VarArr.length];
        System.arraycopy(iArr, 0, r3, 0, i);
        System.arraycopy(gd0VarArr, 0, (gd0[]) nuVar.e, 0, nuVar.b);
        nuVar.f = this.e;
        nuVar.g = this.f;
        nuVar.h = this.g;
        nuVar.i = this.h;
        return nuVar;
    }
}
