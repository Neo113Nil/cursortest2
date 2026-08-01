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
import com.skydrop.fallring.R;
import f.a;
import k.C0160o;
import k.InterfaceC0171z;
import k.MenuC0158m;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0171z, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public C0160o f1121a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f1122b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f1123c;
    public TextView d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f1124e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f1125f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f1126g;
    public ImageView h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f1127j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1128k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f1129l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1130m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f1131n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1132o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f1133p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1134q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0012l r2 = C0012l.r(getContext(), attributeSet, a.f1940r, R.attr.listMenuViewStyle);
        this.f1127j = r2.h(5);
        TypedArray typedArray = (TypedArray) r2.f432c;
        this.f1128k = typedArray.getResourceId(1, -1);
        this.f1130m = typedArray.getBoolean(7, false);
        this.f1129l = context;
        this.f1131n = r2.h(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f1132o = obtainStyledAttributes.hasValue(0);
        r2.t();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1133p == null) {
            this.f1133p = LayoutInflater.from(getContext());
        }
        return this.f1133p;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f1126g;
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
    @Override // k.InterfaceC0171z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0160o c0160o) {
        boolean z2;
        String sb;
        boolean z3;
        this.f1121a = c0160o;
        int i = 0;
        setVisibility(c0160o.isVisible() ? 0 : 8);
        setTitle(c0160o.f2699e);
        setCheckable(c0160o.isCheckable());
        if (c0160o.f2706n.o()) {
            if ((c0160o.f2706n.n() ? c0160o.f2702j : c0160o.h) != 0) {
                z2 = true;
                c0160o.f2706n.n();
                if (z2) {
                    C0160o c0160o2 = this.f1121a;
                    if (c0160o2.f2706n.o()) {
                        if ((c0160o2.f2706n.n() ? c0160o2.f2702j : c0160o2.h) != 0) {
                            z3 = true;
                        }
                    }
                    z3 = false;
                }
                i = 8;
                if (i == 0) {
                    TextView textView = this.f1125f;
                    C0160o c0160o3 = this.f1121a;
                    char c2 = c0160o3.f2706n.n() ? c0160o3.f2702j : c0160o3.h;
                    if (c2 == 0) {
                        sb = "";
                    } else {
                        MenuC0158m menuC0158m = c0160o3.f2706n;
                        Resources resources = menuC0158m.f2669a.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(menuC0158m.f2669a).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i2 = menuC0158m.n() ? c0160o3.f2703k : c0160o3.i;
                        C0160o.c(i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                        C0160o.c(i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                        C0160o.c(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                        C0160o.c(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                        C0160o.c(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                        C0160o.c(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
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
                if (this.f1125f.getVisibility() != i) {
                    this.f1125f.setVisibility(i);
                }
                setIcon(c0160o.getIcon());
                setEnabled(c0160o.isEnabled());
                setSubMenuArrowVisible(c0160o.hasSubMenu());
                setContentDescription(c0160o.f2709q);
            }
        }
        z2 = false;
        c0160o.f2706n.n();
        if (z2) {
        }
        i = 8;
        if (i == 0) {
        }
        if (this.f1125f.getVisibility() != i) {
        }
        setIcon(c0160o.getIcon());
        setEnabled(c0160o.isEnabled());
        setSubMenuArrowVisible(c0160o.hasSubMenu());
        setContentDescription(c0160o.f2709q);
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

    @Override // k.InterfaceC0171z
    public C0160o getItemData() {
        return this.f1121a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f1127j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.d = textView;
        int i = this.f1128k;
        if (i != -1) {
            textView.setTextAppearance(this.f1129l, i);
        }
        this.f1125f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1126g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1131n);
        }
        this.h = (ImageView) findViewById(R.id.group_divider);
        this.i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f1122b != null && this.f1130m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1122b.getLayoutParams();
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
        if (!z2 && this.f1123c == null && this.f1124e == null) {
            return;
        }
        if ((this.f1121a.f2716x & 4) != 0) {
            if (this.f1123c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1123c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1123c;
            view = this.f1124e;
        } else {
            if (this.f1124e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1124e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1124e;
            view = this.f1123c;
        }
        if (z2) {
            compoundButton.setChecked(this.f1121a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f1124e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1123c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f1121a.f2716x & 4) != 0) {
            if (this.f1123c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1123c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1123c;
        } else {
            if (this.f1124e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1124e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1124e;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f1134q = z2;
        this.f1130m = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility((this.f1132o || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1121a.f2706n.getClass();
        boolean z2 = this.f1134q;
        if (z2 || this.f1130m) {
            ImageView imageView = this.f1122b;
            if (imageView == null && drawable == null && !this.f1130m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f1122b = imageView2;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1130m) {
                this.f1122b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f1122b;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1122b.getVisibility() != 0) {
                this.f1122b.setVisibility(0);
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
