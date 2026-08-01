package androidx.appcompat.view.menu;

import A1.j;
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
import com.winfour.neondrop.R;
import f.AbstractC0084a;
import k.m;
import k.o;
import k.z;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements z, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public o f1326a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f1327b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f1328c;
    public TextView d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f1329e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f1330f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f1331g;
    public ImageView h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f1332j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1333k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f1334l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1335m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f1336n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1337o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f1338p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1339q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j t2 = j.t(getContext(), attributeSet, AbstractC0084a.f2141r, R.attr.listMenuViewStyle);
        this.f1332j = t2.j(5);
        TypedArray typedArray = (TypedArray) t2.f81c;
        this.f1333k = typedArray.getResourceId(1, -1);
        this.f1335m = typedArray.getBoolean(7, false);
        this.f1334l = context;
        this.f1336n = t2.j(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f1337o = obtainStyledAttributes.hasValue(0);
        t2.v();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1338p == null) {
            this.f1338p = LayoutInflater.from(getContext());
        }
        return this.f1338p;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f1331g;
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
    @Override // k.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(o oVar) {
        boolean z2;
        String sb;
        boolean z3;
        this.f1326a = oVar;
        int i = 0;
        setVisibility(oVar.isVisible() ? 0 : 8);
        setTitle(oVar.f2795e);
        setCheckable(oVar.isCheckable());
        if (oVar.f2802n.o()) {
            if ((oVar.f2802n.n() ? oVar.f2798j : oVar.h) != 0) {
                z2 = true;
                oVar.f2802n.n();
                if (z2) {
                    o oVar2 = this.f1326a;
                    if (oVar2.f2802n.o()) {
                        if ((oVar2.f2802n.n() ? oVar2.f2798j : oVar2.h) != 0) {
                            z3 = true;
                        }
                    }
                    z3 = false;
                }
                i = 8;
                if (i == 0) {
                    TextView textView = this.f1330f;
                    o oVar3 = this.f1326a;
                    char c2 = oVar3.f2802n.n() ? oVar3.f2798j : oVar3.h;
                    if (c2 == 0) {
                        sb = "";
                    } else {
                        m mVar = oVar3.f2802n;
                        Resources resources = mVar.f2765a.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(mVar.f2765a).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i2 = mVar.n() ? oVar3.f2799k : oVar3.i;
                        o.c(i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                        o.c(i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                        o.c(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                        o.c(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                        o.c(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                        o.c(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
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
                if (this.f1330f.getVisibility() != i) {
                    this.f1330f.setVisibility(i);
                }
                setIcon(oVar.getIcon());
                setEnabled(oVar.isEnabled());
                setSubMenuArrowVisible(oVar.hasSubMenu());
                setContentDescription(oVar.f2805q);
            }
        }
        z2 = false;
        oVar.f2802n.n();
        if (z2) {
        }
        i = 8;
        if (i == 0) {
        }
        if (this.f1330f.getVisibility() != i) {
        }
        setIcon(oVar.getIcon());
        setEnabled(oVar.isEnabled());
        setSubMenuArrowVisible(oVar.hasSubMenu());
        setContentDescription(oVar.f2805q);
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

    @Override // k.z
    public o getItemData() {
        return this.f1326a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f1332j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.d = textView;
        int i = this.f1333k;
        if (i != -1) {
            textView.setTextAppearance(this.f1334l, i);
        }
        this.f1330f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1331g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1336n);
        }
        this.h = (ImageView) findViewById(R.id.group_divider);
        this.i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f1327b != null && this.f1335m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1327b.getLayoutParams();
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
        if (!z2 && this.f1328c == null && this.f1329e == null) {
            return;
        }
        if ((this.f1326a.f2812x & 4) != 0) {
            if (this.f1328c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1328c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1328c;
            view = this.f1329e;
        } else {
            if (this.f1329e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1329e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1329e;
            view = this.f1328c;
        }
        if (z2) {
            compoundButton.setChecked(this.f1326a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f1329e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1328c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f1326a.f2812x & 4) != 0) {
            if (this.f1328c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1328c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1328c;
        } else {
            if (this.f1329e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1329e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1329e;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f1339q = z2;
        this.f1335m = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility((this.f1337o || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1326a.f2802n.getClass();
        boolean z2 = this.f1339q;
        if (z2 || this.f1335m) {
            ImageView imageView = this.f1327b;
            if (imageView == null && drawable == null && !this.f1335m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f1327b = imageView2;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1335m) {
                this.f1327b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f1327b;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1327b.getVisibility() != 0) {
                this.f1327b.setVisibility(0);
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
