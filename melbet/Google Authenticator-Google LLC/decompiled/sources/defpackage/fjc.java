package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.internal.NavigationMenuItemView;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fjc extends kr {
    public final ArrayList a = new ArrayList();
    public gf e;
    public boolean f;
    final /* synthetic */ fjj g;

    public fjc(fjj fjjVar) {
        this.g = fjjVar;
        t();
    }

    private final void v(int i, int i2) {
        while (i < i2) {
            ((fjg) this.a.get(i)).b = true;
            i++;
        }
    }

    private final void w(View view, int i, boolean z) {
        yq.l(view, new fjb(this, i, z));
    }

    @Override // defpackage.kr
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.kr
    public final int b(int i) {
        fje fjeVar = (fje) this.a.get(i);
        if (fjeVar instanceof fjf) {
            return 2;
        }
        if (fjeVar instanceof fjd) {
            return 3;
        }
        if (fjeVar instanceof fjg) {
            return ((fjg) fjeVar).a.hasSubMenu() ? 1 : 0;
        }
        throw new RuntimeException("Unknown item type.");
    }

    @Override // defpackage.kr
    public final long c(int i) {
        return i;
    }

    @Override // defpackage.kr
    public final /* synthetic */ lp d(ViewGroup viewGroup, int i) {
        if (i == 0) {
            fjj fjjVar = this.g;
            return new fji(fjjVar.f, viewGroup, fjjVar.C);
        }
        if (i == 1) {
            return new lp(this.g.f.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
        if (i == 2) {
            return new lp(this.g.f.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
        if (i != 3) {
            return null;
        }
        return new lp(this.g.b);
    }

    @Override // defpackage.kr
    public final /* bridge */ /* synthetic */ void k(lp lpVar, int i) {
        int b = b(i);
        if (b != 0) {
            if (b != 1) {
                if (b != 2) {
                    return;
                }
                fjf fjfVar = (fjf) this.a.get(i);
                View view = lpVar.a;
                fjj fjjVar = this.g;
                view.setPaddingRelative(fjjVar.s, fjfVar.a, fjjVar.t, fjfVar.b);
                return;
            }
            TextView textView = (TextView) lpVar.a;
            textView.setText(((fjg) this.a.get(i)).a.d);
            fjj fjjVar2 = this.g;
            textView.setTextAppearance(fjjVar2.g);
            textView.setPaddingRelative(fjjVar2.u, textView.getPaddingTop(), fjjVar2.v, textView.getPaddingBottom());
            ColorStateList colorStateList = fjjVar2.h;
            if (colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
            w(textView, i, true);
            return;
        }
        NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lpVar.a;
        fjj fjjVar3 = this.g;
        navigationMenuItemView.m = fjjVar3.l;
        navigationMenuItemView.n = navigationMenuItemView.m != null;
        gf gfVar = navigationMenuItemView.l;
        if (gfVar != null) {
            navigationMenuItemView.b(gfVar.getIcon());
        }
        int i2 = fjjVar3.i;
        CheckedTextView checkedTextView = navigationMenuItemView.j;
        checkedTextView.setTextAppearance(i2);
        ColorStateList colorStateList2 = fjjVar3.k;
        if (colorStateList2 != null) {
            checkedTextView.setTextColor(colorStateList2);
        }
        Drawable drawable = fjjVar3.m;
        navigationMenuItemView.setBackground(drawable != null ? drawable.getConstantState().newDrawable() : null);
        RippleDrawable rippleDrawable = fjjVar3.n;
        if (rippleDrawable != null) {
            navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
        }
        fjg fjgVar = (fjg) this.a.get(i);
        navigationMenuItemView.d = fjgVar.b;
        int i3 = fjjVar3.o;
        int i4 = fjjVar3.p;
        navigationMenuItemView.setPadding(i3, i4, i3, i4);
        checkedTextView.setCompoundDrawablePadding(fjjVar3.q);
        if (fjjVar3.w) {
            navigationMenuItemView.c = fjjVar3.r;
        }
        checkedTextView.setMaxLines(fjjVar3.y);
        gf gfVar2 = fjgVar.a;
        navigationMenuItemView.i = fjjVar3.j;
        navigationMenuItemView.f(gfVar2);
        w(navigationMenuItemView, i, false);
    }

    @Override // defpackage.kr
    public final /* bridge */ /* synthetic */ void n(lp lpVar) {
        if (lpVar instanceof fji) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lpVar.a;
            FrameLayout frameLayout = navigationMenuItemView.k;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            navigationMenuItemView.j.setCompoundDrawables(null, null, null, null);
        }
    }

    public final void t() {
        boolean z;
        boolean z2;
        if (this.f) {
            return;
        }
        boolean z3 = true;
        this.f = true;
        ArrayList arrayList = this.a;
        arrayList.clear();
        arrayList.add(new fjd());
        fjj fjjVar = this.g;
        int size = fjjVar.c.f().size();
        int i = -1;
        int i2 = 0;
        boolean z4 = false;
        int i3 = 0;
        while (i2 < size) {
            gf gfVar = (gf) fjjVar.c.f().get(i2);
            if (gfVar.isChecked()) {
                u(gfVar);
            }
            if (gfVar.isCheckable()) {
                gfVar.j(false);
            }
            if (gfVar.hasSubMenu()) {
                gw gwVar = gfVar.k;
                if (gwVar.hasVisibleItems()) {
                    if (i2 != 0) {
                        arrayList.add(new fjf(fjjVar.A, 0));
                    } else {
                        i2 = 0;
                    }
                    arrayList.add(new fjg(gfVar));
                    int size2 = arrayList.size();
                    int size3 = gwVar.size();
                    int i4 = 0;
                    boolean z5 = false;
                    while (i4 < size3) {
                        gf gfVar2 = (gf) gwVar.getItem(i4);
                        if (gfVar2.isVisible()) {
                            if (!z5 && gfVar2.getIcon() != null) {
                                z5 = z3;
                            }
                            if (gfVar2.isCheckable()) {
                                gfVar2.j(false);
                            }
                            if (gfVar2.isChecked()) {
                                u(gfVar2);
                            }
                            z2 = z3;
                            arrayList.add(new fjg(gfVar2));
                        } else {
                            z2 = z3;
                        }
                        i4++;
                        z3 = z2;
                    }
                    z = z3;
                    if (z5) {
                        v(size2, arrayList.size());
                    }
                } else {
                    z = z3;
                }
            } else {
                z = z3;
                int i5 = gfVar.b;
                if (i5 != i) {
                    i3 = arrayList.size();
                    z4 = gfVar.getIcon() != null ? z : false;
                    if (i2 != 0) {
                        int i6 = fjjVar.A;
                        arrayList.add(new fjf(i6, i6));
                        i3++;
                    } else {
                        i2 = 0;
                    }
                } else if (!z4 && gfVar.getIcon() != null) {
                    v(i3, arrayList.size());
                    z4 = z;
                }
                fjg fjgVar = new fjg(gfVar);
                fjgVar.b = z4;
                arrayList.add(fjgVar);
                i = i5;
            }
            i2++;
            z3 = z;
        }
        this.f = false;
    }

    public final void u(gf gfVar) {
        if (this.e == gfVar || !gfVar.isCheckable()) {
            return;
        }
        gf gfVar2 = this.e;
        if (gfVar2 != null) {
            gfVar2.setChecked(false);
        }
        this.e = gfVar;
        gfVar.setChecked(true);
    }
}
