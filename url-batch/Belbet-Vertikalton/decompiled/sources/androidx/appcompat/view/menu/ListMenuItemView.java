package androidx.appcompat.view.menu;

import I0.h;
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
import com.winpower.neonfit.R;
import g.AbstractC0122a;
import m.C0231o;
import m.InterfaceC0242z;
import m.MenuC0229m;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0242z, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public C0231o f1687a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f1688b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f1689c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f1690d;
    public CheckBox e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f1691f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f1692g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f1693h;
    public LinearLayout i;
    public final Drawable j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1694k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f1695l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1696m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f1697n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1698o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f1699p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1700q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h r2 = h.r(getContext(), attributeSet, AbstractC0122a.f2709r, R.attr.listMenuViewStyle);
        this.j = r2.h(5);
        TypedArray typedArray = (TypedArray) r2.f592c;
        this.f1694k = typedArray.getResourceId(1, -1);
        this.f1696m = typedArray.getBoolean(7, false);
        this.f1695l = context;
        this.f1697n = r2.h(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f1698o = obtainStyledAttributes.hasValue(0);
        r2.t();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1699p == null) {
            this.f1699p = LayoutInflater.from(getContext());
        }
        return this.f1699p;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f1692g;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    @Override // m.InterfaceC0242z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0231o c0231o) {
        boolean z2;
        String sb;
        boolean z3;
        this.f1687a = c0231o;
        int i = 0;
        setVisibility(c0231o.isVisible() ? 0 : 8);
        setTitle(c0231o.e);
        setCheckable(c0231o.isCheckable());
        if (c0231o.f3385n.o()) {
            if ((c0231o.f3385n.n() ? c0231o.j : c0231o.f3381h) != 0) {
                z2 = true;
                c0231o.f3385n.n();
                if (z2) {
                    C0231o c0231o2 = this.f1687a;
                    if (c0231o2.f3385n.o()) {
                        if ((c0231o2.f3385n.n() ? c0231o2.j : c0231o2.f3381h) != 0) {
                            z3 = true;
                        }
                    }
                    z3 = false;
                }
                i = 8;
                if (i == 0) {
                    TextView textView = this.f1691f;
                    C0231o c0231o3 = this.f1687a;
                    char c2 = c0231o3.f3385n.n() ? c0231o3.j : c0231o3.f3381h;
                    if (c2 == 0) {
                        sb = "";
                    } else {
                        MenuC0229m menuC0229m = c0231o3.f3385n;
                        Resources resources = menuC0229m.f3348a.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(menuC0229m.f3348a).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i2 = menuC0229m.n() ? c0231o3.f3382k : c0231o3.i;
                        C0231o.c(i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                        C0231o.c(i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                        C0231o.c(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                        C0231o.c(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                        C0231o.c(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                        C0231o.c(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
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
                if (this.f1691f.getVisibility() != i) {
                    this.f1691f.setVisibility(i);
                }
                setIcon(c0231o.getIcon());
                setEnabled(c0231o.isEnabled());
                setSubMenuArrowVisible(c0231o.hasSubMenu());
                setContentDescription(c0231o.f3388q);
            }
        }
        z2 = false;
        c0231o.f3385n.n();
        if (z2) {
        }
        i = 8;
        if (i == 0) {
        }
        if (this.f1691f.getVisibility() != i) {
        }
        setIcon(c0231o.getIcon());
        setEnabled(c0231o.isEnabled());
        setSubMenuArrowVisible(c0231o.hasSubMenu());
        setContentDescription(c0231o.f3388q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1693h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1693h.getLayoutParams();
        rect.top = this.f1693h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // m.InterfaceC0242z
    public C0231o getItemData() {
        return this.f1687a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f1690d = textView;
        int i = this.f1694k;
        if (i != -1) {
            textView.setTextAppearance(this.f1695l, i);
        }
        this.f1691f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1692g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1697n);
        }
        this.f1693h = (ImageView) findViewById(R.id.group_divider);
        this.i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f1688b != null && this.f1696m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1688b.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (!z2 && this.f1689c == null && this.e == null) {
            return;
        }
        if ((this.f1687a.f3395x & 4) != 0) {
            if (this.f1689c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1689c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1689c;
            view = this.e;
        } else {
            if (this.e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.e;
            view = this.f1689c;
        }
        if (z2) {
            compoundButton.setChecked(this.f1687a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1689c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f1687a.f3395x & 4) != 0) {
            if (this.f1689c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1689c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1689c;
        } else {
            if (this.e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.e;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f1700q = z2;
        this.f1696m = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.f1693h;
        if (imageView != null) {
            imageView.setVisibility((this.f1698o || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1687a.f3385n.getClass();
        boolean z2 = this.f1700q;
        if (z2 || this.f1696m) {
            ImageView imageView = this.f1688b;
            if (imageView == null && drawable == null && !this.f1696m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f1688b = imageView2;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1696m) {
                this.f1688b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f1688b;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1688b.getVisibility() != 0) {
                this.f1688b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f1690d.getVisibility() != 8) {
                this.f1690d.setVisibility(8);
            }
        } else {
            this.f1690d.setText(charSequence);
            if (this.f1690d.getVisibility() != 0) {
                this.f1690d.setVisibility(0);
            }
        }
    }
}
