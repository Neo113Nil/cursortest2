package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import com.google.android.libraries.material.speeddial.expandable.ExpandableFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dmq {
    public final int a;
    public final Rect b;
    public final float c;
    public final float d;

    public dmq(FloatingActionButton floatingActionButton) {
        ColorStateList colorStateList = ((ExpandableFloatingActionButton) floatingActionButton).a;
        this.a = colorStateList != null ? colorStateList.getColorForState(floatingActionButton.getDrawableState(), colorStateList.getDefaultColor()) : 0;
        Rect rect = new Rect(0, 0, floatingActionButton.getWidth(), floatingActionButton.getHeight());
        int[] iArr = new int[2];
        floatingActionButton.getLocationInWindow(iArr);
        rect.offsetTo(iArr[0], iArr[1]);
        rect.offset((int) (-floatingActionButton.getTranslationX()), (int) (-floatingActionButton.getTranslationY()));
        this.b = rect;
        floatingActionButton.h(new Rect());
        this.c = r0.width() / 2.0f;
        int i = yq.a;
        this.d = floatingActionButton.getElevation();
    }
}
