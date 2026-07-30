package androidx.appcompat.view.menu;

import D0.j;
import I.T;
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
import com.icefishing.icefish.ice.fishing.s294s.R;
import h.AbstractC0454a;
import java.util.WeakHashMap;
import m.InterfaceC0672A;
import m.m;
import m.o;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0672A, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: d, reason: collision with root package name */
    public o f3121d;

    /* renamed from: e, reason: collision with root package name */
    public ImageView f3122e;

    /* renamed from: i, reason: collision with root package name */
    public RadioButton f3123i;

    /* renamed from: l, reason: collision with root package name */
    public TextView f3124l;

    /* renamed from: m, reason: collision with root package name */
    public CheckBox f3125m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f3126n;

    /* renamed from: o, reason: collision with root package name */
    public ImageView f3127o;

    /* renamed from: p, reason: collision with root package name */
    public ImageView f3128p;

    /* renamed from: q, reason: collision with root package name */
    public LinearLayout f3129q;

    /* renamed from: r, reason: collision with root package name */
    public final Drawable f3130r;

    /* renamed from: s, reason: collision with root package name */
    public final int f3131s;

    /* renamed from: t, reason: collision with root package name */
    public final Context f3132t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3133u;

    /* renamed from: v, reason: collision with root package name */
    public final Drawable f3134v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f3135w;

    /* renamed from: x, reason: collision with root package name */
    public LayoutInflater f3136x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f3137y;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j R4 = j.R(getContext(), attributeSet, AbstractC0454a.f5053r, R.attr.listMenuViewStyle);
        this.f3130r = R4.J(5);
        TypedArray typedArray = (TypedArray) R4.f331i;
        this.f3131s = typedArray.getResourceId(1, -1);
        this.f3133u = typedArray.getBoolean(7, false);
        this.f3132t = context;
        this.f3134v = R4.J(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f3135w = obtainStyledAttributes.hasValue(0);
        R4.W();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f3136x == null) {
            this.f3136x = LayoutInflater.from(getContext());
        }
        return this.f3136x;
    }

    private void setSubMenuArrowVisible(boolean z7) {
        ImageView imageView = this.f3127o;
        if (imageView != null) {
            imageView.setVisibility(z7 ? 0 : 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0121  */
    @Override // m.InterfaceC0672A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(o oVar) {
        boolean z7;
        String sb;
        boolean z8;
        this.f3121d = oVar;
        int i2 = 0;
        setVisibility(oVar.isVisible() ? 0 : 8);
        setTitle(oVar.f6444e);
        setCheckable(oVar.isCheckable());
        if (oVar.f6452n.o()) {
            if ((oVar.f6452n.n() ? oVar.j : oVar.f6447h) != 0) {
                z7 = true;
                oVar.f6452n.n();
                if (z7) {
                    o oVar2 = this.f3121d;
                    if (oVar2.f6452n.o()) {
                        if ((oVar2.f6452n.n() ? oVar2.j : oVar2.f6447h) != 0) {
                            z8 = true;
                        }
                    }
                    z8 = false;
                }
                i2 = 8;
                if (i2 == 0) {
                    TextView textView = this.f3126n;
                    o oVar3 = this.f3121d;
                    m mVar = oVar3.f6452n;
                    Context context = mVar.f6410a;
                    char c7 = mVar.n() ? oVar3.j : oVar3.f6447h;
                    if (c7 == 0) {
                        sb = "";
                    } else {
                        Resources resources = context.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i5 = mVar.n() ? oVar3.f6449k : oVar3.f6448i;
                        o.c(sb2, i5, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                        o.c(sb2, i5, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                        o.c(sb2, i5, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                        o.c(sb2, i5, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                        o.c(sb2, i5, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                        o.c(sb2, i5, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                        if (c7 == '\b') {
                            sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        } else if (c7 == '\n') {
                            sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                        } else if (c7 != ' ') {
                            sb2.append(c7);
                        } else {
                            sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                        }
                        sb = sb2.toString();
                    }
                    textView.setText(sb);
                }
                if (this.f3126n.getVisibility() != i2) {
                    this.f3126n.setVisibility(i2);
                }
                setIcon(oVar.getIcon());
                setEnabled(oVar.isEnabled());
                setSubMenuArrowVisible(oVar.hasSubMenu());
                setContentDescription(oVar.f6455q);
            }
        }
        z7 = false;
        oVar.f6452n.n();
        if (z7) {
        }
        i2 = 8;
        if (i2 == 0) {
        }
        if (this.f3126n.getVisibility() != i2) {
        }
        setIcon(oVar.getIcon());
        setEnabled(oVar.isEnabled());
        setSubMenuArrowVisible(oVar.hasSubMenu());
        setContentDescription(oVar.f6455q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f3128p;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f3128p.getLayoutParams();
        rect.top = this.f3128p.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // m.InterfaceC0672A
    public o getItemData() {
        return this.f3121d;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = T.f1153a;
        setBackground(this.f3130r);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f3124l = textView;
        int i2 = this.f3131s;
        if (i2 != -1) {
            textView.setTextAppearance(this.f3132t, i2);
        }
        this.f3126n = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f3127o = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f3134v);
        }
        this.f3128p = (ImageView) findViewById(R.id.group_divider);
        this.f3129q = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i5) {
        if (this.f3122e != null && this.f3133u) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f3122e.getLayoutParams();
            int i7 = layoutParams.height;
            if (i7 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i7;
            }
        }
        super.onMeasure(i2, i5);
    }

    public void setCheckable(boolean z7) {
        CompoundButton compoundButton;
        View view;
        if (!z7 && this.f3123i == null && this.f3125m == null) {
            return;
        }
        if ((this.f3121d.f6462x & 4) != 0) {
            if (this.f3123i == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f3123i = radioButton;
                LinearLayout linearLayout = this.f3129q;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f3123i;
            view = this.f3125m;
        } else {
            if (this.f3125m == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f3125m = checkBox;
                LinearLayout linearLayout2 = this.f3129q;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f3125m;
            view = this.f3123i;
        }
        if (z7) {
            compoundButton.setChecked(this.f3121d.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f3125m;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f3123i;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z7) {
        CompoundButton compoundButton;
        if ((this.f3121d.f6462x & 4) != 0) {
            if (this.f3123i == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f3123i = radioButton;
                LinearLayout linearLayout = this.f3129q;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f3123i;
        } else {
            if (this.f3125m == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f3125m = checkBox;
                LinearLayout linearLayout2 = this.f3129q;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f3125m;
        }
        compoundButton.setChecked(z7);
    }

    public void setForceShowIcon(boolean z7) {
        this.f3137y = z7;
        this.f3133u = z7;
    }

    public void setGroupDividerEnabled(boolean z7) {
        ImageView imageView = this.f3128p;
        if (imageView != null) {
            imageView.setVisibility((this.f3135w || !z7) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z7 = this.f3121d.f6452n.f6427s || this.f3137y;
        if (z7 || this.f3133u) {
            ImageView imageView = this.f3122e;
            if (imageView == null && drawable == null && !this.f3133u) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f3122e = imageView2;
                LinearLayout linearLayout = this.f3129q;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f3133u) {
                this.f3122e.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f3122e;
            if (!z7) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f3122e.getVisibility() != 0) {
                this.f3122e.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f3124l.getVisibility() != 8) {
                this.f3124l.setVisibility(8);
            }
        } else {
            this.f3124l.setText(charSequence);
            if (this.f3124l.getVisibility() != 0) {
                this.f3124l.setVisibility(0);
            }
        }
    }
}
