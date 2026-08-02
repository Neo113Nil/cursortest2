package defpackage;

import android.util.Property;
import android.view.ViewGroup;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dmp extends Property {
    public static final Property a = new dmp();

    private dmp() {
        super(Float.class, "contentSpread");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Float f = (Float) ((ViewGroup) obj).getTag(R.id.mtrl_content_spread);
        return f != null ? f : Float.valueOf(1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        Float f = (Float) obj2;
        float floatValue = f.floatValue();
        viewGroup.setTag(R.id.mtrl_content_spread, f);
        boolean z = viewGroup instanceof dmn;
        ViewGroup viewGroup2 = viewGroup;
        if (z) {
            viewGroup2 = ((dmn) viewGroup).a();
        }
        float width = viewGroup2.getWidth();
        int childCount = viewGroup2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup2.getChildAt(i).setTranslationX(((-1.0f) + floatValue) * ((r4.getLeft() + (r4.getWidth() / 2.0f)) - (width / 2.0f)));
        }
    }
}
