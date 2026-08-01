package g2;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import com.gglhk.bofio.fortunetiger.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b0 implements m {

    /* renamed from: a, reason: collision with root package name */
    public final int f1830a;

    /* renamed from: b, reason: collision with root package name */
    public final o f1831b;
    public final int[][] c;

    /* renamed from: d, reason: collision with root package name */
    public final o[] f1832d;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f1833e;

    /* renamed from: f, reason: collision with root package name */
    public final a0 f1834f;
    public final a0 g;
    public final a0 h;

    public b0(c3.l lVar) {
        this.f1830a = lVar.f1070b;
        this.f1831b = (o) lVar.c;
        this.c = (int[][]) lVar.f1071d;
        this.f1832d = (o[]) lVar.f1072e;
        this.f1833e = (a0) lVar.f1073f;
        this.f1834f = (a0) lVar.g;
        this.g = (a0) lVar.h;
        this.h = (a0) lVar.f1074i;
    }

    public static void f(c3.l lVar, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
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
                int[] iArr = l1.a.f2874t;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                int resourceId = obtainAttributes.getResourceId(0, 0);
                int resourceId2 = obtainAttributes.getResourceId(1, 0);
                a aVar = new a(0);
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
                if (resourceId2 != 0) {
                    contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
                }
                o a4 = o.g(contextThemeWrapper.obtainStyledAttributes(l1.a.A), aVar).a();
                obtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i4 = 0;
                for (int i5 = 0; i5 < attributeCount; i5++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i5);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i6 = i4 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i5, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i4] = attributeNameResource;
                        i4 = i6;
                    }
                }
                lVar.a(StateSet.trimStateSet(iArr2, i4), a4);
            }
        }
    }

    public static b0 g(Context context, TypedArray typedArray, int i4) {
        XmlResourceParser xml;
        AttributeSet asAttributeSet;
        int next;
        int resourceId = typedArray.getResourceId(i4, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        c3.l lVar = new c3.l(1);
        lVar.e();
        try {
            xml = context.getResources().getXml(resourceId);
            try {
                asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
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
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            lVar.e();
        }
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        if (xml.getName().equals("selector")) {
            f(lVar, context, xml, asAttributeSet, context.getTheme());
        }
        xml.close();
        return lVar.c();
    }

    @Override // g2.m
    public final o a(k kVar) {
        return h().a(kVar);
    }

    @Override // g2.m
    public final o b(float f4) {
        return h().b(f4);
    }

    @Override // g2.m
    public final o c(int[] iArr) {
        int i4;
        int i5;
        int[][] iArr2;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i4 = -1;
            i5 = this.f1830a;
            iArr2 = this.c;
            if (i7 >= i5) {
                i7 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i7], iArr)) {
                break;
            }
            i7++;
        }
        if (i7 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            while (true) {
                if (i6 >= i5) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr2[i6], iArr3)) {
                    i4 = i6;
                    break;
                }
                i6++;
            }
            i7 = i4;
        }
        o[] oVarArr = this.f1832d;
        a0 a0Var = this.h;
        a0 a0Var2 = this.g;
        a0 a0Var3 = this.f1834f;
        a0 a0Var4 = this.f1833e;
        if (a0Var4 == null && a0Var3 == null && a0Var2 == null && a0Var == null) {
            return oVarArr[i7];
        }
        n j4 = oVarArr[i7].j();
        if (a0Var4 != null) {
            j4.f1880e = a0Var4.c(iArr);
        }
        if (a0Var3 != null) {
            j4.f1881f = a0Var3.c(iArr);
        }
        if (a0Var2 != null) {
            j4.h = a0Var2.c(iArr);
        }
        if (a0Var != null) {
            j4.g = a0Var.c(iArr);
        }
        return j4.a();
    }

    @Override // g2.m
    public final o d() {
        return h();
    }

    @Override // g2.m
    public final boolean e() {
        a0 a0Var;
        a0 a0Var2;
        a0 a0Var3;
        a0 a0Var4;
        return this.f1830a > 1 || ((a0Var = this.f1833e) != null && a0Var.f1825a > 1) || (((a0Var2 = this.f1834f) != null && a0Var2.f1825a > 1) || (((a0Var3 = this.g) != null && a0Var3.f1825a > 1) || ((a0Var4 = this.h) != null && a0Var4.f1825a > 1)));
    }

    public final o h() {
        o oVar = this.f1831b;
        a0 a0Var = this.h;
        a0 a0Var2 = this.g;
        a0 a0Var3 = this.f1834f;
        a0 a0Var4 = this.f1833e;
        if (a0Var4 == null && a0Var3 == null && a0Var2 == null && a0Var == null) {
            return oVar;
        }
        n j4 = oVar.j();
        if (a0Var4 != null) {
            j4.f1880e = a0Var4.f1826b;
        }
        if (a0Var3 != null) {
            j4.f1881f = a0Var3.f1826b;
        }
        if (a0Var2 != null) {
            j4.h = a0Var2.f1826b;
        }
        if (a0Var != null) {
            j4.g = a0Var.f1826b;
        }
        return j4.a();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [int[][], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [g2.o[], java.io.Serializable] */
    public final c3.l i() {
        c3.l lVar = new c3.l(1);
        int i4 = this.f1830a;
        lVar.f1070b = i4;
        lVar.c = this.f1831b;
        int[][] iArr = this.c;
        ?? r3 = new int[iArr.length][];
        lVar.f1071d = r3;
        o[] oVarArr = this.f1832d;
        lVar.f1072e = new o[oVarArr.length];
        System.arraycopy(iArr, 0, r3, 0, i4);
        System.arraycopy(oVarArr, 0, (o[]) lVar.f1072e, 0, lVar.f1070b);
        lVar.f1073f = this.f1833e;
        lVar.g = this.f1834f;
        lVar.h = this.g;
        lVar.f1074i = this.h;
        return lVar;
    }
}
