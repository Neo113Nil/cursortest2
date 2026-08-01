package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import com.derinko.gbini.n1casino.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class x30 implements b20 {
    public final int a;
    public final d20 b;
    public final int[][] c;
    public final d20[] d;
    public final w30 e;
    public final w30 f;
    public final w30 g;
    public final w30 h;

    public x30(io ioVar) {
        this.a = ioVar.b;
        this.b = (d20) ioVar.c;
        this.c = (int[][]) ioVar.d;
        this.d = (d20[]) ioVar.e;
        this.e = (w30) ioVar.f;
        this.f = (w30) ioVar.g;
        this.g = (w30) ioVar.h;
        this.h = (w30) ioVar.i;
    }

    public static void g(io ioVar, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
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
                int[] iArr = vx.x;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                int resourceId = obtainAttributes.getResourceId(0, 0);
                int resourceId2 = obtainAttributes.getResourceId(1, 0);
                g gVar = new g(0.0f);
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
                if (resourceId2 != 0) {
                    contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
                }
                d20 a = d20.h(contextThemeWrapper.obtainStyledAttributes(vx.E), gVar).a();
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
                ioVar.a(StateSet.trimStateSet(iArr2, i), a);
            }
        }
    }

    public static x30 h(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        io ioVar = new io(1);
        ioVar.e();
        try {
            xml = context.getResources().getXml(resourceId);
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            ioVar.e();
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
                g(ioVar, context, xml, asAttributeSet, context.getTheme());
            }
            xml.close();
            return ioVar.c();
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

    @Override // defpackage.b20
    public final d20 a(float f) {
        return i().a(f);
    }

    @Override // defpackage.b20
    public final d20 b(int[] iArr) {
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
        d20[] d20VarArr = this.d;
        w30 w30Var = this.h;
        w30 w30Var2 = this.g;
        w30 w30Var3 = this.f;
        w30 w30Var4 = this.e;
        if (w30Var4 == null && w30Var3 == null && w30Var2 == null && w30Var == null) {
            return d20VarArr[i4];
        }
        c20 k = d20VarArr[i4].k();
        if (w30Var4 != null) {
            k.e = w30Var4.c(iArr);
        }
        if (w30Var3 != null) {
            k.f = w30Var3.c(iArr);
        }
        if (w30Var2 != null) {
            k.h = w30Var2.c(iArr);
        }
        if (w30Var != null) {
            k.g = w30Var.c(iArr);
        }
        return k.a();
    }

    @Override // defpackage.b20
    public final d20[] c() {
        return this.d;
    }

    @Override // defpackage.b20
    public final d20 d() {
        return i();
    }

    @Override // defpackage.b20
    public final d20 e(tz tzVar) {
        return i().e(tzVar);
    }

    @Override // defpackage.b20
    public final boolean f() {
        w30 w30Var;
        w30 w30Var2;
        w30 w30Var3;
        w30 w30Var4;
        return this.a > 1 || ((w30Var = this.e) != null && w30Var.a > 1) || (((w30Var2 = this.f) != null && w30Var2.a > 1) || (((w30Var3 = this.g) != null && w30Var3.a > 1) || ((w30Var4 = this.h) != null && w30Var4.a > 1)));
    }

    public final d20 i() {
        d20 d20Var = this.b;
        w30 w30Var = this.h;
        w30 w30Var2 = this.g;
        w30 w30Var3 = this.f;
        w30 w30Var4 = this.e;
        if (w30Var4 == null && w30Var3 == null && w30Var2 == null && w30Var == null) {
            return d20Var;
        }
        c20 k = d20Var.k();
        if (w30Var4 != null) {
            k.e = w30Var4.b;
        }
        if (w30Var3 != null) {
            k.f = w30Var3.b;
        }
        if (w30Var2 != null) {
            k.h = w30Var2.b;
        }
        if (w30Var != null) {
            k.g = w30Var.b;
        }
        return k.a();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [int[][], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [d20[], java.io.Serializable] */
    public final io j() {
        io ioVar = new io(1);
        int i = this.a;
        ioVar.b = i;
        ioVar.c = this.b;
        int[][] iArr = this.c;
        ?? r3 = new int[iArr.length][];
        ioVar.d = r3;
        d20[] d20VarArr = this.d;
        ioVar.e = new d20[d20VarArr.length];
        System.arraycopy(iArr, 0, r3, 0, i);
        System.arraycopy(d20VarArr, 0, (d20[]) ioVar.e, 0, ioVar.b);
        ioVar.f = this.e;
        ioVar.g = this.f;
        ioVar.h = this.g;
        ioVar.i = this.h;
        return ioVar;
    }
}
