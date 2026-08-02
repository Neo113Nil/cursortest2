package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxl implements krt {
    private final /* synthetic */ int c;
    public static final kxl b = new kxl(1);
    public static final kxl a = new kxl(0);

    public kxl(int i) {
        this.c = i;
    }

    @Override // defpackage.krt
    public final /* synthetic */ Object a(Object obj) {
        if (this.c == 0) {
            return Boolean.valueOf(obj instanceof kqx);
        }
        View view = (View) obj;
        view.getClass();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            return new yt(viewGroup, 1).a();
        }
        return null;
    }
}
