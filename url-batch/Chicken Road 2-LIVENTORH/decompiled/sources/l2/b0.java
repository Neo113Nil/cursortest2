package l2;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.oriondriftchasers.arordrft.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f2565a;

    /* renamed from: b, reason: collision with root package name */
    public final n f2566b;

    /* renamed from: c, reason: collision with root package name */
    public final int[][] f2567c;
    public final n[] d;

    /* renamed from: e, reason: collision with root package name */
    public final z f2568e;

    /* renamed from: f, reason: collision with root package name */
    public final z f2569f;

    /* renamed from: g, reason: collision with root package name */
    public final z f2570g;

    /* renamed from: h, reason: collision with root package name */
    public final z f2571h;

    public b0(a0 a0Var) {
        this.f2565a = a0Var.f2556a;
        this.f2566b = a0Var.f2557b;
        this.f2567c = a0Var.f2558c;
        this.d = a0Var.d;
        this.f2568e = a0Var.f2559e;
        this.f2569f = a0Var.f2560f;
        this.f2570g = a0Var.f2561g;
        this.f2571h = a0Var.f2562h;
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
                int[] iArr = n1.a.f2828u;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                n a2 = n.a(context, obtainAttributes.getResourceId(0, 0), obtainAttributes.getResourceId(1, 0)).a();
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
                a0Var.a(StateSet.trimStateSet(iArr2, i), a2);
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
            if (a0Var.f2556a == 0) {
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
        n nVar = this.f2566b;
        z zVar = this.f2571h;
        z zVar2 = this.f2570g;
        z zVar3 = this.f2569f;
        z zVar4 = this.f2568e;
        if (zVar4 == null && zVar3 == null && zVar2 == null && zVar == null) {
            return nVar;
        }
        m g4 = nVar.g();
        if (zVar4 != null) {
            g4.f2621e = zVar4.f2671b;
        }
        if (zVar3 != null) {
            g4.f2622f = zVar3.f2671b;
        }
        if (zVar2 != null) {
            g4.f2624h = zVar2.f2671b;
        }
        if (zVar != null) {
            g4.f2623g = zVar.f2671b;
        }
        return g4.a();
    }

    public final boolean d() {
        z zVar;
        z zVar2;
        z zVar3;
        z zVar4;
        return this.f2565a > 1 || ((zVar = this.f2568e) != null && zVar.f2670a > 1) || (((zVar2 = this.f2569f) != null && zVar2.f2670a > 1) || (((zVar3 = this.f2570g) != null && zVar3.f2670a > 1) || ((zVar4 = this.f2571h) != null && zVar4.f2670a > 1)));
    }
}
