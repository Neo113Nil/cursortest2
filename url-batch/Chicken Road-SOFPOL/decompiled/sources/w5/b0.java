package w5;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.snovikpovik.vuevnxsj.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f8069a;

    /* renamed from: b, reason: collision with root package name */
    public final n f8070b;

    /* renamed from: c, reason: collision with root package name */
    public final int[][] f8071c;

    /* renamed from: d, reason: collision with root package name */
    public final n[] f8072d;

    /* renamed from: e, reason: collision with root package name */
    public final z f8073e;

    /* renamed from: f, reason: collision with root package name */
    public final z f8074f;

    /* renamed from: g, reason: collision with root package name */
    public final z f8075g;

    /* renamed from: h, reason: collision with root package name */
    public final z f8076h;

    public b0(a0 a0Var) {
        this.f8069a = a0Var.f8059a;
        this.f8070b = a0Var.f8060b;
        this.f8071c = a0Var.f8061c;
        this.f8072d = a0Var.f8062d;
        this.f8073e = a0Var.f8063e;
        this.f8074f = a0Var.f8064f;
        this.f8075g = a0Var.f8065g;
        this.f8076h = a0Var.f8066h;
    }

    public static void a(a0 a0Var, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
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
                int[] iArr = f5.a.f2747m;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                n a8 = n.a(context, obtainAttributes.getResourceId(0, 0), obtainAttributes.getResourceId(1, 0), new a(0)).a();
                obtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i8 = 0; i8 < attributeCount; i8++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i8);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i9 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i8, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i9;
                    }
                }
                a0Var.a(StateSet.trimStateSet(iArr2, i), a8);
            }
        }
    }

    public static b0 b(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        a0 a0Var = new a0();
        a0Var.b();
        try {
            xml = context.getResources().getXml(resourceId);
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            a0Var.b();
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
                a(a0Var, context, xml, asAttributeSet, context.getTheme());
            }
            xml.close();
            if (a0Var.f8059a == 0) {
                return null;
            }
            return new b0(a0Var);
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

    public final n c() {
        n nVar = this.f8070b;
        z zVar = this.f8076h;
        z zVar2 = this.f8075g;
        z zVar3 = this.f8074f;
        z zVar4 = this.f8073e;
        if (zVar4 == null && zVar3 == null && zVar2 == null && zVar == null) {
            return nVar;
        }
        m f6 = nVar.f();
        if (zVar4 != null) {
            f6.f8131e = zVar4.f8187b;
        }
        if (zVar3 != null) {
            f6.f8132f = zVar3.f8187b;
        }
        if (zVar2 != null) {
            f6.f8134h = zVar2.f8187b;
        }
        if (zVar != null) {
            f6.f8133g = zVar.f8187b;
        }
        return f6.a();
    }

    public final boolean d() {
        z zVar;
        z zVar2;
        z zVar3;
        z zVar4;
        return this.f8069a > 1 || ((zVar = this.f8073e) != null && zVar.f8186a > 1) || (((zVar2 = this.f8074f) != null && zVar2.f8186a > 1) || (((zVar3 = this.f8075g) != null && zVar3.f8186a > 1) || ((zVar4 = this.f8076h) != null && zVar4.f8186a > 1)));
    }
}
