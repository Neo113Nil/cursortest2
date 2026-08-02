package j;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2903a;

    public /* synthetic */ P(int i2) {
        this.f2903a = i2;
    }

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f2903a) {
            case 0:
                try {
                    break;
                } catch (Exception e2) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                    return null;
                }
            case 1:
                try {
                    Resources resources = context.getResources();
                    S.e eVar = new S.e(context);
                    eVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                    break;
                } catch (Exception e3) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e3);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    S.q qVar = new S.q();
                    qVar.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    break;
                } catch (Exception e4) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e4);
                    return null;
                }
        }
        return null;
    }
}
