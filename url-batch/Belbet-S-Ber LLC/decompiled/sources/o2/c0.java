package o2;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import com.gdmhkmf.belbet.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c0 implements m {

    /* renamed from: a, reason: collision with root package name */
    public final int f2927a;

    /* renamed from: b, reason: collision with root package name */
    public final o f2928b;

    /* renamed from: c, reason: collision with root package name */
    public final int[][] f2929c;
    public final o[] d;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f2930e;

    /* renamed from: f, reason: collision with root package name */
    public final a0 f2931f;

    /* renamed from: g, reason: collision with root package name */
    public final a0 f2932g;
    public final a0 h;

    public c0(b0 b0Var) {
        this.f2927a = b0Var.f2921b;
        this.f2928b = (o) b0Var.f2922c;
        this.f2929c = (int[][]) b0Var.d;
        this.d = (o[]) b0Var.f2923e;
        this.f2930e = (a0) b0Var.f2924f;
        this.f2931f = (a0) b0Var.f2925g;
        this.f2932g = (a0) b0Var.h;
        this.h = (a0) b0Var.i;
    }

    public static void g(b0 b0Var, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
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
                int[] iArr = q1.a.f3161y;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                int resourceId = obtainAttributes.getResourceId(0, 0);
                int resourceId2 = obtainAttributes.getResourceId(1, 0);
                a aVar = new a(0);
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
                if (resourceId2 != 0) {
                    contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
                }
                o a5 = o.h(contextThemeWrapper.obtainStyledAttributes(q1.a.F), aVar).a();
                obtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i4 = 0; i4 < attributeCount; i4++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i5 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i5;
                    }
                }
                b0Var.a(StateSet.trimStateSet(iArr2, i), a5);
            }
        }
    }

    public static c0 h(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        AttributeSet asAttributeSet;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        b0 b0Var = new b0(0);
        b0Var.e();
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
            b0Var.e();
        }
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        if (xml.getName().equals("selector")) {
            g(b0Var, context, xml, asAttributeSet, context.getTheme());
        }
        xml.close();
        return b0Var.b();
    }

    @Override // o2.m
    public final o a(float f5) {
        return i().a(f5);
    }

    @Override // o2.m
    public final o b(int[] iArr) {
        int i;
        int i4;
        int[][] iArr2;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = -1;
            i4 = this.f2927a;
            iArr2 = this.f2929c;
            if (i6 >= i4) {
                i6 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i6], iArr)) {
                break;
            }
            i6++;
        }
        if (i6 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr2[i5], iArr3)) {
                    i = i5;
                    break;
                }
                i5++;
            }
            i6 = i;
        }
        o[] oVarArr = this.d;
        a0 a0Var = this.h;
        a0 a0Var2 = this.f2932g;
        a0 a0Var3 = this.f2931f;
        a0 a0Var4 = this.f2930e;
        if (a0Var4 == null && a0Var3 == null && a0Var2 == null && a0Var == null) {
            return oVarArr[i6];
        }
        n k4 = oVarArr[i6].k();
        if (a0Var4 != null) {
            k4.f2977e = a0Var4.c(iArr);
        }
        if (a0Var3 != null) {
            k4.f2978f = a0Var3.c(iArr);
        }
        if (a0Var2 != null) {
            k4.h = a0Var2.c(iArr);
        }
        if (a0Var != null) {
            k4.f2979g = a0Var.c(iArr);
        }
        return k4.a();
    }

    @Override // o2.m
    public final o[] c() {
        return this.d;
    }

    @Override // o2.m
    public final o d() {
        return i();
    }

    @Override // o2.m
    public final o e(k kVar) {
        return i().e(kVar);
    }

    @Override // o2.m
    public final boolean f() {
        a0 a0Var;
        a0 a0Var2;
        a0 a0Var3;
        a0 a0Var4;
        return this.f2927a > 1 || ((a0Var = this.f2930e) != null && a0Var.f2915a > 1) || (((a0Var2 = this.f2931f) != null && a0Var2.f2915a > 1) || (((a0Var3 = this.f2932g) != null && a0Var3.f2915a > 1) || ((a0Var4 = this.h) != null && a0Var4.f2915a > 1)));
    }

    public final o i() {
        o oVar = this.f2928b;
        a0 a0Var = this.h;
        a0 a0Var2 = this.f2932g;
        a0 a0Var3 = this.f2931f;
        a0 a0Var4 = this.f2930e;
        if (a0Var4 == null && a0Var3 == null && a0Var2 == null && a0Var == null) {
            return oVar;
        }
        n k4 = oVar.k();
        if (a0Var4 != null) {
            k4.f2977e = a0Var4.f2916b;
        }
        if (a0Var3 != null) {
            k4.f2978f = a0Var3.f2916b;
        }
        if (a0Var2 != null) {
            k4.h = a0Var2.f2916b;
        }
        if (a0Var != null) {
            k4.f2979g = a0Var.f2916b;
        }
        return k4.a();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [int[][], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Serializable, o2.o[]] */
    public final b0 j() {
        b0 b0Var = new b0(0);
        int i = this.f2927a;
        b0Var.f2921b = i;
        b0Var.f2922c = this.f2928b;
        int[][] iArr = this.f2929c;
        ?? r32 = new int[iArr.length][];
        b0Var.d = r32;
        o[] oVarArr = this.d;
        b0Var.f2923e = new o[oVarArr.length];
        System.arraycopy(iArr, 0, r32, 0, i);
        System.arraycopy(oVarArr, 0, (o[]) b0Var.f2923e, 0, b0Var.f2921b);
        b0Var.f2924f = this.f2930e;
        b0Var.f2925g = this.f2931f;
        b0Var.h = this.f2932g;
        b0Var.i = this.h;
        return b0Var;
    }
}
