package androidx.appcompat.view.menu;

import A.z;
import B0.C0031i;
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
import c.AbstractC0165a;
import com.neptunesoft.languesbacdz.R;
import i.InterfaceC0218p;
import i.MenuC0211i;
import i.MenuItemC0212j;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0218p, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: e, reason: collision with root package name */
    public MenuItemC0212j f1347e;

    /* renamed from: f, reason: collision with root package name */
    public ImageView f1348f;

    /* renamed from: g, reason: collision with root package name */
    public RadioButton f1349g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f1350h;

    /* renamed from: i, reason: collision with root package name */
    public CheckBox f1351i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f1352j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f1353k;

    /* renamed from: l, reason: collision with root package name */
    public ImageView f1354l;

    /* renamed from: m, reason: collision with root package name */
    public LinearLayout f1355m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f1356n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1357o;

    /* renamed from: p, reason: collision with root package name */
    public final Context f1358p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1359q;

    /* renamed from: r, reason: collision with root package name */
    public final Drawable f1360r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f1361s;

    /* renamed from: t, reason: collision with root package name */
    public LayoutInflater f1362t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1363u;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0031i J = C0031i.J(getContext(), attributeSet, AbstractC0165a.f1976n, R.attr.listMenuViewStyle);
        this.f1356n = J.A(5);
        TypedArray typedArray = (TypedArray) J.f154f;
        this.f1357o = typedArray.getResourceId(1, -1);
        this.f1359q = typedArray.getBoolean(7, false);
        this.f1358p = context;
        this.f1360r = J.A(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f1361s = obtainStyledAttributes.hasValue(0);
        J.N();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1362t == null) {
            this.f1362t = LayoutInflater.from(getContext());
        }
        return this.f1362t;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f1353k;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1354l;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1354l.getLayoutParams();
        rect.top = this.f1354l.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0127  */
    @Override // i.InterfaceC0218p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(MenuItemC0212j menuItemC0212j) {
        boolean z2;
        String sb;
        this.f1347e = menuItemC0212j;
        int i2 = 0;
        setVisibility(menuItemC0212j.isVisible() ? 0 : 8);
        setTitle(menuItemC0212j.f2434e);
        setCheckable(menuItemC0212j.isCheckable());
        if (menuItemC0212j.f2443n.n()) {
            if ((menuItemC0212j.f2443n.m() ? menuItemC0212j.f2439j : menuItemC0212j.f2437h) != 0) {
                z2 = true;
                menuItemC0212j.f2443n.m();
                if (z2) {
                    MenuItemC0212j menuItemC0212j2 = this.f1347e;
                    if (menuItemC0212j2.f2443n.n()) {
                        boolean z3 = (menuItemC0212j2.f2443n.m() ? menuItemC0212j2.f2439j : menuItemC0212j2.f2437h) != 0;
                    }
                }
                i2 = 8;
                if (i2 == 0) {
                    TextView textView = this.f1352j;
                    MenuItemC0212j menuItemC0212j3 = this.f1347e;
                    char c2 = menuItemC0212j3.f2443n.m() ? menuItemC0212j3.f2439j : menuItemC0212j3.f2437h;
                    if (c2 == 0) {
                        sb = "";
                    } else {
                        MenuC0211i menuC0211i = menuItemC0212j3.f2443n;
                        Resources resources = menuC0211i.f2408a.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(menuC0211i.f2408a).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i3 = menuC0211i.m() ? menuItemC0212j3.f2440k : menuItemC0212j3.f2438i;
                        MenuItemC0212j.a(sb2, i3, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                        MenuItemC0212j.a(sb2, i3, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                        MenuItemC0212j.a(sb2, i3, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                        MenuItemC0212j.a(sb2, i3, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                        MenuItemC0212j.a(sb2, i3, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                        MenuItemC0212j.a(sb2, i3, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
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
                if (this.f1352j.getVisibility() != i2) {
                    this.f1352j.setVisibility(i2);
                }
                setIcon(menuItemC0212j.getIcon());
                setEnabled(menuItemC0212j.isEnabled());
                setSubMenuArrowVisible(menuItemC0212j.hasSubMenu());
                setContentDescription(menuItemC0212j.f2446q);
            }
        }
        z2 = false;
        menuItemC0212j.f2443n.m();
        if (z2) {
        }
        i2 = 8;
        if (i2 == 0) {
        }
        if (this.f1352j.getVisibility() != i2) {
        }
        setIcon(menuItemC0212j.getIcon());
        setEnabled(menuItemC0212j.isEnabled());
        setSubMenuArrowVisible(menuItemC0212j.hasSubMenu());
        setContentDescription(menuItemC0212j.f2446q);
    }

    @Override // i.InterfaceC0218p
    public MenuItemC0212j getItemData() {
        return this.f1347e;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Field field = z.f58a;
        setBackground(this.f1356n);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f1350h = textView;
        int i2 = this.f1357o;
        if (i2 != -1) {
            textView.setTextAppearance(this.f1358p, i2);
        }
        this.f1352j = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1353k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1360r);
        }
        this.f1354l = (ImageView) findViewById(R.id.group_divider);
        this.f1355m = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (this.f1348f != null && this.f1359q) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1348f.getLayoutParams();
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
        if (!z2 && this.f1349g == null && this.f1351i == null) {
            return;
        }
        if ((this.f1347e.f2452x & 4) != 0) {
            if (this.f1349g == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1349g = radioButton;
                LinearLayout linearLayout = this.f1355m;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1349g;
            view = this.f1351i;
        } else {
            if (this.f1351i == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1351i = checkBox;
                LinearLayout linearLayout2 = this.f1355m;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1351i;
            view = this.f1349g;
        }
        if (z2) {
            compoundButton.setChecked(this.f1347e.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f1351i;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1349g;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f1347e.f2452x & 4) != 0) {
            if (this.f1349g == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1349g = radioButton;
                LinearLayout linearLayout = this.f1355m;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1349g;
        } else {
            if (this.f1351i == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1351i = checkBox;
                LinearLayout linearLayout2 = this.f1355m;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1351i;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f1363u = z2;
        this.f1359q = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.f1354l;
        if (imageView != null) {
            imageView.setVisibility((this.f1361s || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1347e.f2443n.getClass();
        boolean z2 = this.f1363u;
        if (z2 || this.f1359q) {
            ImageView imageView = this.f1348f;
            if (imageView == null && drawable == null && !this.f1359q) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f1348f = imageView2;
                LinearLayout linearLayout = this.f1355m;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1359q) {
                this.f1348f.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f1348f;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1348f.getVisibility() != 0) {
                this.f1348f.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f1350h.getVisibility() != 8) {
                this.f1350h.setVisibility(8);
            }
        } else {
            this.f1350h.setText(charSequence);
            if (this.f1350h.getVisibility() != 0) {
                this.f1350h.setVisibility(0);
            }
        }
    }
}
