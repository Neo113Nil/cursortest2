package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import com.moontiko.really.admiralcasino.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class a70 implements d50 {
    public final int a;
    public final f50 b;
    public final int[][] c;
    public final f50[] d;
    public final z60 e;
    public final z60 f;
    public final z60 g;
    public final z60 h;

    public a70(tq tqVar) {
        this.a = tqVar.b;
        this.b = (f50) tqVar.c;
        this.c = (int[][]) tqVar.d;
        this.d = (f50[]) tqVar.e;
        this.e = (z60) tqVar.f;
        this.f = (z60) tqVar.g;
        this.g = (z60) tqVar.h;
        this.h = (z60) tqVar.i;
    }

    public static void g(tq tqVar, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
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
                int[] iArr = y00.A;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                int resourceId = obtainAttributes.getResourceId(0, 0);
                int resourceId2 = obtainAttributes.getResourceId(1, 0);
                g gVar = new g(0.0f);
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
                if (resourceId2 != 0) {
                    contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
                }
                f50 a = f50.h(contextThemeWrapper.obtainStyledAttributes(y00.H), gVar).a();
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
                tqVar.a(StateSet.trimStateSet(iArr2, i), a);
            }
        }
    }

    public static a70 h(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        tq tqVar = new tq(1);
        tqVar.e();
        try {
            xml = context.getResources().getXml(resourceId);
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            tqVar.e();
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
                g(tqVar, context, xml, asAttributeSet, context.getTheme());
            }
            xml.close();
            return tqVar.c();
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

    @Override // defpackage.d50
    public final f50 a(float f) {
        return i().a(f);
    }

    @Override // defpackage.d50
    public final f50 b(int[] iArr) {
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
        f50[] f50VarArr = this.d;
        z60 z60Var = this.h;
        z60 z60Var2 = this.g;
        z60 z60Var3 = this.f;
        z60 z60Var4 = this.e;
        if (z60Var4 == null && z60Var3 == null && z60Var2 == null && z60Var == null) {
            return f50VarArr[i4];
        }
        e50 k = f50VarArr[i4].k();
        if (z60Var4 != null) {
            k.e = z60Var4.c(iArr);
        }
        if (z60Var3 != null) {
            k.f = z60Var3.c(iArr);
        }
        if (z60Var2 != null) {
            k.h = z60Var2.c(iArr);
        }
        if (z60Var != null) {
            k.g = z60Var.c(iArr);
        }
        return k.a();
    }

    @Override // defpackage.d50
    public final f50[] c() {
        return this.d;
    }

    @Override // defpackage.d50
    public final f50 d() {
        return i();
    }

    @Override // defpackage.d50
    public final f50 e(w20 w20Var) {
        return i().e(w20Var);
    }

    @Override // defpackage.d50
    public final boolean f() {
        z60 z60Var;
        z60 z60Var2;
        z60 z60Var3;
        z60 z60Var4;
        return this.a > 1 || ((z60Var = this.e) != null && z60Var.a > 1) || (((z60Var2 = this.f) != null && z60Var2.a > 1) || (((z60Var3 = this.g) != null && z60Var3.a > 1) || ((z60Var4 = this.h) != null && z60Var4.a > 1)));
    }

    public final f50 i() {
        f50 f50Var = this.b;
        z60 z60Var = this.h;
        z60 z60Var2 = this.g;
        z60 z60Var3 = this.f;
        z60 z60Var4 = this.e;
        if (z60Var4 == null && z60Var3 == null && z60Var2 == null && z60Var == null) {
            return f50Var;
        }
        e50 k = f50Var.k();
        if (z60Var4 != null) {
            k.e = z60Var4.b;
        }
        if (z60Var3 != null) {
            k.f = z60Var3.b;
        }
        if (z60Var2 != null) {
            k.h = z60Var2.b;
        }
        if (z60Var != null) {
            k.g = z60Var.b;
        }
        return k.a();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [int[][], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [f50[], java.io.Serializable] */
    public final tq j() {
        tq tqVar = new tq(1);
        int i = this.a;
        tqVar.b = i;
        tqVar.c = this.b;
        int[][] iArr = this.c;
        ?? r3 = new int[iArr.length][];
        tqVar.d = r3;
        f50[] f50VarArr = this.d;
        tqVar.e = new f50[f50VarArr.length];
        System.arraycopy(iArr, 0, r3, 0, i);
        System.arraycopy(f50VarArr, 0, (f50[]) tqVar.e, 0, tqVar.b);
        tqVar.f = this.e;
        tqVar.g = this.f;
        tqVar.h = this.g;
        tqVar.i = this.h;
        return tqVar;
    }
}
