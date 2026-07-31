package androidx.appcompat.view.menu;

import B0.C0008i;
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
import com.crane.slab.beam.R;
import d.AbstractC0119a;
import h.MenuC0143j;
import h.MenuItemC0144k;
import h.q;
import java.lang.reflect.Field;
import y.x;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements q, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: e, reason: collision with root package name */
    public MenuItemC0144k f1189e;

    /* renamed from: f, reason: collision with root package name */
    public ImageView f1190f;

    /* renamed from: g, reason: collision with root package name */
    public RadioButton f1191g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f1192h;

    /* renamed from: i, reason: collision with root package name */
    public CheckBox f1193i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f1194j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f1195k;

    /* renamed from: l, reason: collision with root package name */
    public ImageView f1196l;

    /* renamed from: m, reason: collision with root package name */
    public LinearLayout f1197m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f1198n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1199o;

    /* renamed from: p, reason: collision with root package name */
    public final Context f1200p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1201q;

    /* renamed from: r, reason: collision with root package name */
    public final Drawable f1202r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f1203s;
    public LayoutInflater t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1204u;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0008i D2 = C0008i.D(getContext(), attributeSet, AbstractC0119a.f1800n, R.attr.listMenuViewStyle);
        this.f1198n = D2.v(5);
        TypedArray typedArray = (TypedArray) D2.f84f;
        this.f1199o = typedArray.getResourceId(1, -1);
        this.f1201q = typedArray.getBoolean(7, false);
        this.f1200p = context;
        this.f1202r = D2.v(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f1203s = obtainStyledAttributes.hasValue(0);
        D2.G();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.t == null) {
            this.t = LayoutInflater.from(getContext());
        }
        return this.t;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f1195k;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0121  */
    @Override // h.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(MenuItemC0144k menuItemC0144k) {
        boolean z2;
        String sb;
        boolean z3;
        this.f1189e = menuItemC0144k;
        int i2 = 0;
        setVisibility(menuItemC0144k.isVisible() ? 0 : 8);
        setTitle(menuItemC0144k.f2034e);
        setCheckable(menuItemC0144k.isCheckable());
        if (menuItemC0144k.f2043n.n()) {
            if ((menuItemC0144k.f2043n.m() ? menuItemC0144k.f2039j : menuItemC0144k.f2037h) != 0) {
                z2 = true;
                menuItemC0144k.f2043n.m();
                if (z2) {
                    MenuItemC0144k menuItemC0144k2 = this.f1189e;
                    if (menuItemC0144k2.f2043n.n()) {
                        if ((menuItemC0144k2.f2043n.m() ? menuItemC0144k2.f2039j : menuItemC0144k2.f2037h) != 0) {
                            z3 = true;
                        }
                    }
                    z3 = false;
                }
                i2 = 8;
                if (i2 == 0) {
                    TextView textView = this.f1194j;
                    MenuItemC0144k menuItemC0144k3 = this.f1189e;
                    MenuC0143j menuC0143j = menuItemC0144k3.f2043n;
                    Context context = menuC0143j.f2009a;
                    char c2 = menuC0143j.m() ? menuItemC0144k3.f2039j : menuItemC0144k3.f2037h;
                    if (c2 == 0) {
                        sb = "";
                    } else {
                        Resources resources = context.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i3 = menuC0143j.m() ? menuItemC0144k3.f2040k : menuItemC0144k3.f2038i;
                        MenuItemC0144k.a(sb2, i3, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                        MenuItemC0144k.a(sb2, i3, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                        MenuItemC0144k.a(sb2, i3, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                        MenuItemC0144k.a(sb2, i3, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                        MenuItemC0144k.a(sb2, i3, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                        MenuItemC0144k.a(sb2, i3, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                        if (c2 == '\b') {
                            sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        } else if (c2 == '\n') {
                            sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                        } else if (c2 != ' ') {
                            sb2.append(c2);
                        } else {
                            sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                        }
                        sb = sb2.toString();
                    }
                    textView.setText(sb);
                }
                if (this.f1194j.getVisibility() != i2) {
                    this.f1194j.setVisibility(i2);
                }
                setIcon(menuItemC0144k.getIcon());
                setEnabled(menuItemC0144k.isEnabled());
                setSubMenuArrowVisible(menuItemC0144k.hasSubMenu());
                setContentDescription(menuItemC0144k.f2046q);
            }
        }
        z2 = false;
        menuItemC0144k.f2043n.m();
        if (z2) {
        }
        i2 = 8;
        if (i2 == 0) {
        }
        if (this.f1194j.getVisibility() != i2) {
        }
        setIcon(menuItemC0144k.getIcon());
        setEnabled(menuItemC0144k.isEnabled());
        setSubMenuArrowVisible(menuItemC0144k.hasSubMenu());
        setContentDescription(menuItemC0144k.f2046q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1196l;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1196l.getLayoutParams();
        rect.top = this.f1196l.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // h.q
    public MenuItemC0144k getItemData() {
        return this.f1189e;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Field field = x.f3160a;
        setBackground(this.f1198n);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f1192h = textView;
        int i2 = this.f1199o;
        if (i2 != -1) {
            textView.setTextAppearance(this.f1200p, i2);
        }
        this.f1194j = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1195k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1202r);
        }
        this.f1196l = (ImageView) findViewById(R.id.group_divider);
        this.f1197m = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (this.f1190f != null && this.f1201q) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1190f.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (!z2 && this.f1191g == null && this.f1193i == null) {
            return;
        }
        if ((this.f1189e.f2052x & 4) != 0) {
            if (this.f1191g == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1191g = radioButton;
                LinearLayout linearLayout = this.f1197m;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1191g;
            view = this.f1193i;
        } else {
            if (this.f1193i == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1193i = checkBox;
                LinearLayout linearLayout2 = this.f1197m;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1193i;
            view = this.f1191g;
        }
        if (z2) {
            compoundButton.setChecked(this.f1189e.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f1193i;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1191g;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f1189e.f2052x & 4) != 0) {
            if (this.f1191g == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1191g = radioButton;
                LinearLayout linearLayout = this.f1197m;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1191g;
        } else {
            if (this.f1193i == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1193i = checkBox;
                LinearLayout linearLayout2 = this.f1197m;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1193i;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f1204u = z2;
        this.f1201q = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.f1196l;
        if (imageView != null) {
            imageView.setVisibility((this.f1203s || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        MenuC0143j menuC0143j = this.f1189e.f2043n;
        boolean z2 = this.f1204u;
        if (z2 || this.f1201q) {
            ImageView imageView = this.f1190f;
            if (imageView == null && drawable == null && !this.f1201q) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f1190f = imageView2;
                LinearLayout linearLayout = this.f1197m;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1201q) {
                this.f1190f.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f1190f;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1190f.getVisibility() != 0) {
                this.f1190f.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f1192h.getVisibility() != 8) {
                this.f1192h.setVisibility(8);
            }
        } else {
            this.f1192h.setText(charSequence);
            if (this.f1192h.getVisibility() != 0) {
                this.f1192h.setVisibility(0);
            }
        }
    }
}
