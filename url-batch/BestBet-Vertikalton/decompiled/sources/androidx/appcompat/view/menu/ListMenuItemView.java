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
import com.fortunequest.neontrack.R;
import f.a;
import k.C0192p;
import k.InterfaceC0171A;
import k.MenuC0189m;
import u0.C0372k;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0171A, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public C0192p f1642a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f1643b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f1644c;
    public TextView d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f1645e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f1646f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f1647g;
    public ImageView h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f1648j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1649k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f1650l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1651m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f1652n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1653o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f1654p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1655q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0372k j2 = C0372k.j(getContext(), attributeSet, a.f2528r, R.attr.listMenuViewStyle);
        this.f1648j = j2.d(5);
        TypedArray typedArray = (TypedArray) j2.f4191b;
        this.f1649k = typedArray.getResourceId(1, -1);
        this.f1651m = typedArray.getBoolean(7, false);
        this.f1650l = context;
        this.f1652n = j2.d(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f1653o = obtainStyledAttributes.hasValue(0);
        j2.l();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1654p == null) {
            this.f1654p = LayoutInflater.from(getContext());
        }
        return this.f1654p;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f1647g;
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
    @Override // k.InterfaceC0171A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0192p c0192p) {
        boolean z2;
        String sb;
        boolean z3;
        this.f1642a = c0192p;
        int i = 0;
        setVisibility(c0192p.isVisible() ? 0 : 8);
        setTitle(c0192p.f3194e);
        setCheckable(c0192p.isCheckable());
        if (c0192p.f3201n.o()) {
            if ((c0192p.f3201n.n() ? c0192p.f3197j : c0192p.h) != 0) {
                z2 = true;
                c0192p.f3201n.n();
                if (z2) {
                    C0192p c0192p2 = this.f1642a;
                    if (c0192p2.f3201n.o()) {
                        if ((c0192p2.f3201n.n() ? c0192p2.f3197j : c0192p2.h) != 0) {
                            z3 = true;
                        }
                    }
                    z3 = false;
                }
                i = 8;
                if (i == 0) {
                    TextView textView = this.f1646f;
                    C0192p c0192p3 = this.f1642a;
                    char c2 = c0192p3.f3201n.n() ? c0192p3.f3197j : c0192p3.h;
                    if (c2 == 0) {
                        sb = "";
                    } else {
                        MenuC0189m menuC0189m = c0192p3.f3201n;
                        Resources resources = menuC0189m.f3163a.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(menuC0189m.f3163a).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i2 = menuC0189m.n() ? c0192p3.f3198k : c0192p3.i;
                        C0192p.c(i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                        C0192p.c(i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                        C0192p.c(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                        C0192p.c(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                        C0192p.c(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                        C0192p.c(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
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
                if (this.f1646f.getVisibility() != i) {
                    this.f1646f.setVisibility(i);
                }
                setIcon(c0192p.getIcon());
                setEnabled(c0192p.isEnabled());
                setSubMenuArrowVisible(c0192p.hasSubMenu());
                setContentDescription(c0192p.f3204q);
            }
        }
        z2 = false;
        c0192p.f3201n.n();
        if (z2) {
        }
        i = 8;
        if (i == 0) {
        }
        if (this.f1646f.getVisibility() != i) {
        }
        setIcon(c0192p.getIcon());
        setEnabled(c0192p.isEnabled());
        setSubMenuArrowVisible(c0192p.hasSubMenu());
        setContentDescription(c0192p.f3204q);
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

    @Override // k.InterfaceC0171A
    public C0192p getItemData() {
        return this.f1642a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f1648j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.d = textView;
        int i = this.f1649k;
        if (i != -1) {
            textView.setTextAppearance(this.f1650l, i);
        }
        this.f1646f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1647g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1652n);
        }
        this.h = (ImageView) findViewById(R.id.group_divider);
        this.i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f1643b != null && this.f1651m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1643b.getLayoutParams();
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
        if (!z2 && this.f1644c == null && this.f1645e == null) {
            return;
        }
        if ((this.f1642a.f3211x & 4) != 0) {
            if (this.f1644c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1644c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1644c;
            view = this.f1645e;
        } else {
            if (this.f1645e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1645e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1645e;
            view = this.f1644c;
        }
        if (z2) {
            compoundButton.setChecked(this.f1642a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f1645e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1644c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f1642a.f3211x & 4) != 0) {
            if (this.f1644c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1644c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1644c;
        } else {
            if (this.f1645e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1645e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1645e;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f1655q = z2;
        this.f1651m = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility((this.f1653o || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1642a.f3201n.getClass();
        boolean z2 = this.f1655q;
        if (z2 || this.f1651m) {
            ImageView imageView = this.f1643b;
            if (imageView == null && drawable == null && !this.f1651m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f1643b = imageView2;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1651m) {
                this.f1643b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f1643b;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1643b.getVisibility() != 0) {
                this.f1643b.setVisibility(0);
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
