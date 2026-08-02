package defpackage;

import android.util.Property;
import android.view.ViewGroup;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dmo extends Property {
    public static final Property a = new dmo();

    private dmo() {
        super(Float.class, "contentFade");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Float f = (Float) ((ViewGroup) obj).getTag(R.id.mtrl_content_fade);
        return f != null ? f : Float.valueOf(1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        Float f = (Float) obj2;
        float floatValue = f.floatValue();
        viewGroup.setTag(R.id.mtrl_content_fade, f);
        boolean z = viewGroup instanceof dmn;
        ViewGroup viewGroup2 = viewGroup;
        if (z) {
            viewGroup2 = ((dmn) viewGroup).a();
        }
        int childCount = viewGroup2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup2.getChildAt(i).setAlpha(floatValue);
        }
    }
}
