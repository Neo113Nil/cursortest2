package g2;

import android.content.Context;
import android.view.SubMenu;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class g extends k.m {
    public final int A;

    /* renamed from: z, reason: collision with root package name */
    public final Class f1747z;

    public g(Context context, Class cls, int i) {
        super(context);
        this.f1747z = cls;
        this.A = i;
    }

    @Override // k.m
    public final k.o a(int i, int i4, int i5, CharSequence charSequence) {
        int size = this.f2064f.size() + 1;
        int i6 = this.A;
        if (size <= i6) {
            w();
            k.o a2 = super.a(i, i4, i5, charSequence);
            v();
            return a2;
        }
        String simpleName = this.f1747z.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + i6 + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @Override // k.m, android.view.Menu
    public final SubMenu addSubMenu(int i, int i4, int i5, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f1747z.getSimpleName().concat(" does not support submenus"));
    }
}
