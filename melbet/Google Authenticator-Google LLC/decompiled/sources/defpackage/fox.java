package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.google.android.apps.authenticator2.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fox {
    public int a;
    public fog b;
    public int[][] c;
    public fog[] d;

    public fox(Context context, int i) {
        int next;
        int depth;
        b();
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            try {
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        if (xml.getName().equals("selector")) {
                            Resources.Theme theme = context.getTheme();
                            int depth2 = xml.getDepth() + 1;
                            while (true) {
                                int next2 = xml.next();
                                if (next2 == 1 || ((depth = xml.getDepth()) < depth2 && next2 == 3)) {
                                    break;
                                }
                                if (next2 == 2 && depth <= depth2 && xml.getName().equals("item")) {
                                    TypedArray obtainAttributes = theme == null ? context.getResources().obtainAttributes(asAttributeSet, foc.a) : theme.obtainStyledAttributes(asAttributeSet, foc.a, 0, 0);
                                    fog fogVar = new fog(fog.j(context, obtainAttributes.getResourceId(0, 0), obtainAttributes.getResourceId(1, 0)));
                                    obtainAttributes.recycle();
                                    int attributeCount = asAttributeSet.getAttributeCount();
                                    int[] iArr = new int[attributeCount];
                                    int i2 = 0;
                                    for (int i3 = 0; i3 < attributeCount; i3++) {
                                        int attributeNameResource = asAttributeSet.getAttributeNameResource(i3);
                                        if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                                            int i4 = i2 + 1;
                                            iArr[i2] = asAttributeSet.getAttributeBooleanValue(i3, false) ? attributeNameResource : -attributeNameResource;
                                            i2 = i4;
                                        }
                                    }
                                    int[] trimStateSet = StateSet.trimStateSet(iArr, i2);
                                    int i5 = this.a;
                                    if (i5 == 0 || trimStateSet.length == 0) {
                                        this.b = fogVar;
                                    }
                                    int[][] iArr2 = this.c;
                                    if (i5 >= iArr2.length) {
                                        int i6 = i5 + 10;
                                        int[][] iArr3 = new int[i6][];
                                        System.arraycopy(iArr2, 0, iArr3, 0, i5);
                                        this.c = iArr3;
                                        fog[] fogVarArr = new fog[i6];
                                        System.arraycopy(this.d, 0, fogVarArr, 0, i5);
                                        this.d = fogVarArr;
                                    }
                                    int[][] iArr4 = this.c;
                                    int i7 = this.a;
                                    iArr4[i7] = trimStateSet;
                                    this.d[i7] = fogVar;
                                    this.a = i7 + 1;
                                }
                            }
                        }
                        if (xml != null) {
                            xml.close();
                            return;
                        }
                        return;
                    }
                } while (next != 1);
                throw new XmlPullParserException("No start tag found");
            } finally {
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            b();
        }
    }

    private final void b() {
        this.b = new fog();
        this.c = new int[10][];
        this.d = new fog[10];
    }

    public final foy a() {
        if (this.a == 0) {
            return null;
        }
        return new foy(this);
    }

    public fox(foy foyVar) {
        int i = foyVar.a;
        this.a = i;
        this.b = foyVar.b;
        this.c = new int[foyVar.c.length][];
        this.d = new fog[foyVar.d.length];
        System.arraycopy(foyVar.c, 0, this.c, 0, i);
        System.arraycopy(foyVar.d, 0, this.d, 0, this.a);
    }
}
