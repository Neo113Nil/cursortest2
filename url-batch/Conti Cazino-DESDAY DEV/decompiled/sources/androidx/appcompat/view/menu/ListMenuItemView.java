package androidx.appcompat.view.menu;

import K.C0012l;
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
import com.playminus.quickmatch.R;
import f.a;
import k.C0159o;
import k.InterfaceC0170z;
import k.MenuC0157m;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0170z, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public C0159o f1118a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f1119b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f1120c;
    public TextView d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f1121e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f1122f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f1123g;
    public ImageView h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f1124j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1125k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f1126l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1127m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f1128n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1129o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f1130p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1131q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0012l r2 = C0012l.r(getContext(), attributeSet, a.f1937r, R.attr.listMenuViewStyle);
        this.f1124j = r2.h(5);
        TypedArray typedArray = (TypedArray) r2.f432c;
        this.f1125k = typedArray.getResourceId(1, -1);
        this.f1127m = typedArray.getBoolean(7, false);
        this.f1126l = context;
        this.f1128n = r2.h(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f1129o = obtainStyledAttributes.hasValue(0);
        r2.t();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1130p == null) {
            this.f1130p = LayoutInflater.from(getContext());
        }
        return this.f1130p;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f1123g;
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
    @Override // k.InterfaceC0170z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0159o c0159o) {
        boolean z2;
        String sb;
        boolean z3;
        this.f1118a = c0159o;
        int i = 0;
        setVisibility(c0159o.isVisible() ? 0 : 8);
        setTitle(c0159o.f2715e);
        setCheckable(c0159o.isCheckable());
        if (c0159o.f2722n.o()) {
            if ((c0159o.f2722n.n() ? c0159o.f2718j : c0159o.h) != 0) {
                z2 = true;
                c0159o.f2722n.n();
                if (z2) {
                    C0159o c0159o2 = this.f1118a;
                    if (c0159o2.f2722n.o()) {
                        if ((c0159o2.f2722n.n() ? c0159o2.f2718j : c0159o2.h) != 0) {
                            z3 = true;
                        }
                    }
                    z3 = false;
                }
                i = 8;
                if (i == 0) {
                    TextView textView = this.f1122f;
                    C0159o c0159o3 = this.f1118a;
                    char c2 = c0159o3.f2722n.n() ? c0159o3.f2718j : c0159o3.h;
                    if (c2 == 0) {
                        sb = "";
                    } else {
                        MenuC0157m menuC0157m = c0159o3.f2722n;
                        Resources resources = menuC0157m.f2685a.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(menuC0157m.f2685a).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i2 = menuC0157m.n() ? c0159o3.f2719k : c0159o3.i;
                        C0159o.c(i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                        C0159o.c(i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                        C0159o.c(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                        C0159o.c(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                        C0159o.c(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                        C0159o.c(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
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
                if (this.f1122f.getVisibility() != i) {
                    this.f1122f.setVisibility(i);
                }
                setIcon(c0159o.getIcon());
                setEnabled(c0159o.isEnabled());
                setSubMenuArrowVisible(c0159o.hasSubMenu());
                setContentDescription(c0159o.f2725q);
            }
        }
        z2 = false;
        c0159o.f2722n.n();
        if (z2) {
        }
        i = 8;
        if (i == 0) {
        }
        if (this.f1122f.getVisibility() != i) {
        }
        setIcon(c0159o.getIcon());
        setEnabled(c0159o.isEnabled());
        setSubMenuArrowVisible(c0159o.hasSubMenu());
        setContentDescription(c0159o.f2725q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.h.getLayoutParams();
        rect.top = this.h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // k.InterfaceC0170z
    public C0159o getItemData() {
        return this.f1118a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f1124j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.d = textView;
        int i = this.f1125k;
        if (i != -1) {
            textView.setTextAppearance(this.f1126l, i);
        }
        this.f1122f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1123g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1128n);
        }
        this.h = (ImageView) findViewById(R.id.group_divider);
        this.i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f1119b != null && this.f1127m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1119b.getLayoutParams();
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
        if (!z2 && this.f1120c == null && this.f1121e == null) {
            return;
        }
        if ((this.f1118a.f2732x & 4) != 0) {
            if (this.f1120c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1120c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1120c;
            view = this.f1121e;
        } else {
            if (this.f1121e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1121e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1121e;
            view = this.f1120c;
        }
        if (z2) {
            compoundButton.setChecked(this.f1118a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f1121e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1120c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f1118a.f2732x & 4) != 0) {
            if (this.f1120c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1120c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1120c;
        } else {
            if (this.f1121e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1121e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1121e;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f1131q = z2;
        this.f1127m = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility((this.f1129o || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1118a.f2722n.getClass();
        boolean z2 = this.f1131q;
        if (z2 || this.f1127m) {
            ImageView imageView = this.f1119b;
            if (imageView == null && drawable == null && !this.f1127m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f1119b = imageView2;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1127m) {
                this.f1119b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f1119b;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1119b.getVisibility() != 0) {
                this.f1119b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.d.getVisibility() != 8) {
                this.d.setVisibility(8);
            }
        } else {
            this.d.setText(charSequence);
            if (this.d.getVisibility() != 0) {
                this.d.setVisibility(0);
            }
        }
    }
}
