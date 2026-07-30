package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class si implements qk0 {
    public final /* synthetic */ int a;
    public final Uri b;
    public final uw1 c;

    public /* synthetic */ si(Uri uri, uw1 uw1Var, int i) {
        this.a = i;
        this.b = uri;
        this.c = uw1Var;
    }

    @Override // defpackage.qk0
    public final Object a(o30 o30Var) {
        Integer f;
        Drawable drawable;
        int i = this.a;
        Uri uri = this.b;
        uw1 uw1Var = this.c;
        switch (i) {
            case 0:
                String A = zv.A(zv.r(1, uri.getPathSegments()), "/", null, null, null, 62);
                return new tn2(new qn2(new p62(o70.J(uw1Var.a.getAssets().open(A))), new u01(uw1Var.a, 0), new qi()), l.b(MimeTypeMap.getSingleton(), A), m60.o);
            default:
                String authority = uri.getAuthority();
                if (authority != null) {
                    if (up2.y(authority)) {
                        authority = null;
                    }
                    if (authority != null) {
                        String str = (String) zv.C(uri.getPathSegments());
                        if (str == null || (f = b.f(str)) == null) {
                            b71.v(uri, "Invalid android.resource URI: ");
                            return null;
                        }
                        int intValue = f.intValue();
                        Context context = uw1Var.a;
                        Resources resources = authority.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(intValue, typedValue, true);
                        CharSequence charSequence = typedValue.string;
                        String b = l.b(MimeTypeMap.getSingleton(), charSequence.subSequence(up2.z(charSequence, '/', 0, 6), charSequence.length()).toString());
                        if (!Intrinsics.b(b, "text/xml")) {
                            TypedValue typedValue2 = new TypedValue();
                            return new tn2(new qn2(new p62(o70.J(resources.openRawResource(intValue, typedValue2))), new u01(context, 0), new q92(typedValue2.density)), b, m60.o);
                        }
                        if (authority.equals(context.getPackageName())) {
                            drawable = j8.F(context, intValue);
                            if (drawable == null) {
                                b71.h(in1.k(intValue, "Invalid resource ID: "));
                                return null;
                            }
                        } else {
                            XmlResourceParser xml = resources.getXml(intValue);
                            int next = xml.next();
                            while (next != 2 && next != 1) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found.");
                            }
                            Resources.Theme theme = context.getTheme();
                            ThreadLocal threadLocal = t92.a;
                            drawable = resources.getDrawable(intValue, theme);
                            if (drawable == null) {
                                b71.h(in1.k(intValue, "Invalid resource ID: "));
                                return null;
                            }
                        }
                        boolean z = drawable instanceof VectorDrawable;
                        if (z) {
                            drawable = new BitmapDrawable(context.getResources(), yj1.s(drawable, uw1Var.b, uw1Var.d, uw1Var.e, uw1Var.f));
                        }
                        return new ge0(drawable, z, m60.o);
                    }
                }
                b71.v(uri, "Invalid android.resource URI: ");
                return null;
        }
    }
}
