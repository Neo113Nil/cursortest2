package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.derinko.gbini.n1casino.R;
import defpackage.a6;
import defpackage.du;
import defpackage.mt;
import defpackage.pt;
import defpackage.wx;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements du, AbsListView.SelectionBoundsAdjuster {
    public pt f;
    public ImageView g;
    public RadioButton h;
    public TextView i;
    public CheckBox j;
    public TextView k;
    public ImageView l;
    public ImageView m;
    public LinearLayout n;
    public final Drawable o;
    public final int p;
    public final Context q;
    public boolean r;
    public final Drawable s;
    public final boolean t;
    public LayoutInflater u;
    public boolean v;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a6 u = a6.u(R.attr.listMenuViewStyle, 0, getContext(), attributeSet, wx.r);
        this.o = u.k(5);
        TypedArray typedArray = (TypedArray) u.b;
        this.p = typedArray.getResourceId(1, -1);
        this.r = typedArray.getBoolean(7, false);
        this.q = context;
        this.s = u.k(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.t = obtainStyledAttributes.hasValue(0);
        u.w();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.u == null) {
            this.u = LayoutInflater.from(getContext());
        }
        return this.u;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.l;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.m;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.m.getLayoutParams();
        rect.top = this.m.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    @Override // defpackage.du
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(pt ptVar) {
        boolean z;
        String sb;
        boolean z2;
        this.f = ptVar;
        boolean isVisible = ptVar.isVisible();
        mt mtVar = ptVar.n;
        int i = 0;
        setVisibility(isVisible ? 0 : 8);
        setTitle(ptVar.e);
        setCheckable(ptVar.isCheckable());
        if (mtVar.o()) {
            if ((mtVar.n() ? ptVar.j : ptVar.h) != 0) {
                z = true;
                mtVar.n();
                if (z) {
                    pt ptVar2 = this.f;
                    mt mtVar2 = ptVar2.n;
                    if (mtVar2.o()) {
                        if ((mtVar2.n() ? ptVar2.j : ptVar2.h) != 0) {
                            z2 = true;
                        }
                    }
                    z2 = false;
                }
                i = 8;
                if (i == 0) {
                    TextView textView = this.k;
                    pt ptVar3 = this.f;
                    mt mtVar3 = ptVar3.n;
                    Context context = mtVar3.a;
                    char c = mtVar3.n() ? ptVar3.j : ptVar3.h;
                    if (c == 0) {
                        sb = "";
                    } else {
                        Resources resources = context.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i2 = mtVar3.n() ? ptVar3.k : ptVar3.i;
                        pt.c(i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                        pt.c(i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                        pt.c(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                        pt.c(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                        pt.c(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                        pt.c(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
                        if (c == '\b') {
                            sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        } else if (c == '\n') {
                            sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                        } else if (c != ' ') {
                            sb2.append(c);
                        } else {
                            sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                        }
                        sb = sb2.toString();
                    }
                    textView.setText(sb);
                }
                if (this.k.getVisibility() != i) {
                    this.k.setVisibility(i);
                }
                setIcon(ptVar.getIcon());
                setEnabled(ptVar.isEnabled());
                setSubMenuArrowVisible(ptVar.hasSubMenu());
                setContentDescription(ptVar.q);
            }
        }
        z = false;
        mtVar.n();
        if (z) {
        }
        i = 8;
        if (i == 0) {
        }
        if (this.k.getVisibility() != i) {
        }
        setIcon(ptVar.getIcon());
        setEnabled(ptVar.isEnabled());
        setSubMenuArrowVisible(ptVar.hasSubMenu());
        setContentDescription(ptVar.q);
    }

    @Override // defpackage.du
    public pt getItemData() {
        return this.f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.o);
        TextView textView = (TextView) findViewById(R.id.title);
        this.i = textView;
        int i = this.p;
        if (i != -1) {
            textView.setTextAppearance(this.q, i);
        }
        this.k = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.l = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.s);
        }
        this.m = (ImageView) findViewById(R.id.group_divider);
        this.n = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.g != null && this.r) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.g.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.h == null && this.j == null) {
            return;
        }
        if ((this.f.x & 4) != 0) {
            if (this.h == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.h = radioButton;
                LinearLayout linearLayout = this.n;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.h;
            view = this.j;
        } else {
            if (this.j == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.j = checkBox;
                LinearLayout linearLayout2 = this.n;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.j;
            view = this.h;
        }
        if (z) {
            compoundButton.setChecked(this.f.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.j;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.h;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.f.x & 4) != 0) {
            if (this.h == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.h = radioButton;
                LinearLayout linearLayout = this.n;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.h;
        } else {
            if (this.j == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.j = checkBox;
                LinearLayout linearLayout2 = this.n;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.j;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.v = z;
        this.r = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.m;
        if (imageView != null) {
            imageView.setVisibility((this.t || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        mt mtVar = this.f.n;
        boolean z = this.v;
        if (z || this.r) {
            ImageView imageView = this.g;
            if (imageView == null && drawable == null && !this.r) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.g = imageView2;
                LinearLayout linearLayout = this.n;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.r) {
                this.g.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.g;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.g.getVisibility() != 0) {
                this.g.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.i;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.i.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.i.getVisibility() != 0) {
                this.i.setVisibility(0);
            }
        }
    }
}
