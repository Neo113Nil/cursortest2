package defpackage;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dmz extends Property {
    public static final Property a = new dmz();

    private dmz() {
        super(PointF.class, "translation");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        View view = (View) obj;
        return new PointF(view.getTranslationX(), view.getTranslationY());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        PointF pointF = (PointF) obj2;
        view.setTranslationX(pointF.x);
        view.setTranslationY(pointF.y);
    }
}
