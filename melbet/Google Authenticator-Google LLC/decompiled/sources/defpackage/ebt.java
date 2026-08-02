package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ebt {
    public static final String a = "ebt";

    private ebt() {
    }

    public static Drawable a(Context context, boolean z, int i) {
        return c(context, context.getColor(true != z ? R.color.google_grey900 : R.color.google_white), i);
    }

    public static Drawable b(Context context, int i) {
        return c(context, context.getResources().getColor(R.color.google_grey900), i);
    }

    private static Drawable c(Context context, int i, int i2) {
        Drawable ac = dih.ac(context, R.drawable.badge_exclamation_vd, i);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        dih.af(shapeDrawable, i2);
        return new LayerDrawable(new Drawable[]{shapeDrawable, ac});
    }
}
