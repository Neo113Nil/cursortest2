package androidx.appcompat.view.menu;

import A0.f;
import E.A;
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
import com.fc.barca.football.R;
import g.AbstractC0328a;
import java.lang.reflect.Field;
import k.InterfaceC1072q;
import k.MenuC1065j;
import k.MenuItemC1066k;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC1072q, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public MenuItemC1066k f1977a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f1978b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f1979c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f1980d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f1981e;
    public TextView f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f1982g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f1983h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f1984i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f1985j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1986k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f1987l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1988m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f1989n;
    public final boolean o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f1990p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1991q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f K2 = f.K(getContext(), attributeSet, AbstractC0328a.f5001n, R.attr.listMenuViewStyle);
        this.f1985j = K2.C(5);
        TypedArray typedArray = (TypedArray) K2.f24c;
        this.f1986k = typedArray.getResourceId(1, -1);
        this.f1988m = typedArray.getBoolean(7, false);
        this.f1987l = context;
        this.f1989n = K2.C(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.o = obtainStyledAttributes.hasValue(0);
        K2.O();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1990p == null) {
            this.f1990p = LayoutInflater.from(getContext());
        }
        return this.f1990p;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f1982g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    @Override // k.InterfaceC1072q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(MenuItemC1066k menuItemC1066k) {
        boolean z;
        String sb;
        boolean z2;
        this.f1977a = menuItemC1066k;
        int i3 = 0;
        setVisibility(menuItemC1066k.isVisible() ? 0 : 8);
        setTitle(menuItemC1066k.f9622e);
        setCheckable(menuItemC1066k.isCheckable());
        if (menuItemC1066k.f9630n.n()) {
            if ((menuItemC1066k.f9630n.m() ? menuItemC1066k.f9626j : menuItemC1066k.f9624h) != 0) {
                z = true;
                menuItemC1066k.f9630n.m();
                if (z) {
                    MenuItemC1066k menuItemC1066k2 = this.f1977a;
                    if (menuItemC1066k2.f9630n.n()) {
                        if ((menuItemC1066k2.f9630n.m() ? menuItemC1066k2.f9626j : menuItemC1066k2.f9624h) != 0) {
                            z2 = true;
                        }
                    }
                    z2 = false;
                }
                i3 = 8;
                if (i3 == 0) {
                    TextView textView = this.f;
                    MenuItemC1066k menuItemC1066k3 = this.f1977a;
                    char c3 = menuItemC1066k3.f9630n.m() ? menuItemC1066k3.f9626j : menuItemC1066k3.f9624h;
                    if (c3 == 0) {
                        sb = "";
                    } else {
                        MenuC1065j menuC1065j = menuItemC1066k3.f9630n;
                        Resources resources = menuC1065j.f9597a.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(menuC1065j.f9597a).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i4 = menuC1065j.m() ? menuItemC1066k3.f9627k : menuItemC1066k3.f9625i;
                        MenuItemC1066k.a(sb2, i4, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                        MenuItemC1066k.a(sb2, i4, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                        MenuItemC1066k.a(sb2, i4, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                        MenuItemC1066k.a(sb2, i4, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                        MenuItemC1066k.a(sb2, i4, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                        MenuItemC1066k.a(sb2, i4, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                        if (c3 == '\b') {
                            sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        } else if (c3 == '\n') {
                            sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                        } else if (c3 != ' ') {
                            sb2.append(c3);
                        } else {
                            sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                        }
                        sb = sb2.toString();
                    }
                    textView.setText(sb);
                }
                if (this.f.getVisibility() != i3) {
                    this.f.setVisibility(i3);
                }
                setIcon(menuItemC1066k.getIcon());
                setEnabled(menuItemC1066k.isEnabled());
                setSubMenuArrowVisible(menuItemC1066k.hasSubMenu());
                setContentDescription(menuItemC1066k.f9632q);
            }
        }
        z = false;
        menuItemC1066k.f9630n.m();
        if (z) {
        }
        i3 = 8;
        if (i3 == 0) {
        }
        if (this.f.getVisibility() != i3) {
        }
        setIcon(menuItemC1066k.getIcon());
        setEnabled(menuItemC1066k.isEnabled());
        setSubMenuArrowVisible(menuItemC1066k.hasSubMenu());
        setContentDescription(menuItemC1066k.f9632q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1983h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1983h.getLayoutParams();
        rect.top = this.f1983h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // k.InterfaceC1072q
    public MenuItemC1066k getItemData() {
        return this.f1977a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Field field = A.f243a;
        setBackground(this.f1985j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f1980d = textView;
        int i3 = this.f1986k;
        if (i3 != -1) {
            textView.setTextAppearance(this.f1987l, i3);
        }
        this.f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1982g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1989n);
        }
        this.f1983h = (ImageView) findViewById(R.id.group_divider);
        this.f1984i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        if (this.f1978b != null && this.f1988m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1978b.getLayoutParams();
            int i5 = layoutParams.height;
            if (i5 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i5;
            }
        }
        super.onMeasure(i3, i4);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.f1979c == null && this.f1981e == null) {
            return;
        }
        if ((this.f1977a.f9638x & 4) != 0) {
            if (this.f1979c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1979c = radioButton;
                LinearLayout linearLayout = this.f1984i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1979c;
            view = this.f1981e;
        } else {
            if (this.f1981e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1981e = checkBox;
                LinearLayout linearLayout2 = this.f1984i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1981e;
            view = this.f1979c;
        }
        if (z) {
            compoundButton.setChecked(this.f1977a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f1981e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1979c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.f1977a.f9638x & 4) != 0) {
            if (this.f1979c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1979c = radioButton;
                LinearLayout linearLayout = this.f1984i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1979c;
        } else {
            if (this.f1981e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1981e = checkBox;
                LinearLayout linearLayout2 = this.f1984i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1981e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f1991q = z;
        this.f1988m = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f1983h;
        if (imageView != null) {
            imageView.setVisibility((this.o || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1977a.f9630n.getClass();
        boolean z = this.f1991q;
        if (z || this.f1988m) {
            ImageView imageView = this.f1978b;
            if (imageView == null && drawable == null && !this.f1988m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f1978b = imageView2;
                LinearLayout linearLayout = this.f1984i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1988m) {
                this.f1978b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f1978b;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1978b.getVisibility() != 0) {
                this.f1978b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f1980d.getVisibility() != 8) {
                this.f1980d.setVisibility(8);
            }
        } else {
            this.f1980d.setText(charSequence);
            if (this.f1980d.getVisibility() != 0) {
                this.f1980d.setVisibility(0);
            }
        }
    }
}
