package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.drawerlayout.widget.DrawerLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class boh implements xq {
    private final /* synthetic */ int a;

    public /* synthetic */ boh(int i) {
        this.a = i;
    }

    @Override // defpackage.xq
    public final zz a(View view, zz zzVar) {
        boolean z = false;
        z = false;
        switch (this.a) {
            case 0:
                vb f = zzVar.f(519);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.topMargin = f.c;
                view.setLayoutParams(marginLayoutParams);
                return zz.a;
            case 1:
                int i = DrawerLayout.e;
                DrawerLayout drawerLayout = (DrawerLayout) view;
                int i2 = zzVar.i().c;
                drawerLayout.c = zzVar;
                boolean z2 = i2 > 0;
                drawerLayout.d = z2;
                if (!z2 && drawerLayout.getBackground() == null) {
                    z = true;
                }
                drawerLayout.setWillNotDraw(z);
                drawerLayout.requestLayout();
                return zzVar.n();
            case 2:
                return a.u(view, zzVar);
            case 3:
                return a.u(view, zzVar);
            case 4:
                vb f2 = zzVar.f(519);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams2.topMargin = f2.c;
                view.setLayoutParams(marginLayoutParams2);
                return zz.a;
            case 5:
                vb f3 = zzVar.f(519);
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams3.bottomMargin = f3.e;
                int i3 = f3.b;
                xf k = zzVar.k();
                marginLayoutParams3.leftMargin = i3 + (k != null ? k.a() : 0);
                marginLayoutParams3.rightMargin = f3.d + (k != null ? k.b() : 0);
                view.setLayoutParams(marginLayoutParams3);
                return zz.a;
            case 6:
                return a.t(view, zzVar);
            case 7:
                return a.u(view, zzVar);
            case 8:
                vb f4 = zzVar.f(519);
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int i4 = f4.e;
                xf k2 = zzVar.k();
                marginLayoutParams4.bottomMargin = i4;
                marginLayoutParams4.leftMargin = f4.b + (k2 != null ? k2.a() : 0);
                marginLayoutParams4.rightMargin = f4.d + (k2 != null ? k2.b() : 0);
                view.setLayoutParams(marginLayoutParams4);
                return zz.a;
            case 9:
                return a.u(view, zzVar);
            case 10:
                return a.t(view, zzVar);
            default:
                return dya.a(view, zzVar);
        }
    }
}
