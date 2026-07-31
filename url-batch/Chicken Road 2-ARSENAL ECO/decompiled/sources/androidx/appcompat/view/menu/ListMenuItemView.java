package androidx.appcompat.view.menu;

import B0.c;
import D.D;
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
import com.strategylink.Row.Five.R;
import g.AbstractC0389a;
import j.j;
import j.k;
import j.q;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements q, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: f, reason: collision with root package name */
    public k f3233f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f3234g;

    /* renamed from: h, reason: collision with root package name */
    public RadioButton f3235h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f3236i;

    /* renamed from: j, reason: collision with root package name */
    public CheckBox f3237j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f3238k;

    /* renamed from: l, reason: collision with root package name */
    public ImageView f3239l;

    /* renamed from: m, reason: collision with root package name */
    public ImageView f3240m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f3241n;

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f3242o;

    /* renamed from: p, reason: collision with root package name */
    public final int f3243p;

    /* renamed from: q, reason: collision with root package name */
    public final Context f3244q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3245r;

    /* renamed from: s, reason: collision with root package name */
    public final Drawable f3246s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f3247t;

    /* renamed from: u, reason: collision with root package name */
    public LayoutInflater f3248u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3249v;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c r6 = c.r(getContext(), attributeSet, AbstractC0389a.f4267n, R.attr.listMenuViewStyle);
        this.f3242o = r6.m(5);
        TypedArray typedArray = (TypedArray) r6.f73i;
        this.f3243p = typedArray.getResourceId(1, -1);
        this.f3245r = typedArray.getBoolean(7, false);
        this.f3244q = context;
        this.f3246s = r6.m(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f3247t = obtainStyledAttributes.hasValue(0);
        r6.v();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f3248u == null) {
            this.f3248u = LayoutInflater.from(getContext());
        }
        return this.f3248u;
    }

    private void setSubMenuArrowVisible(boolean z5) {
        ImageView imageView = this.f3239l;
        if (imageView != null) {
            imageView.setVisibility(z5 ? 0 : 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0121  */
    @Override // j.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(k kVar) {
        boolean z5;
        String sb;
        boolean z6;
        this.f3233f = kVar;
        int i7 = 0;
        setVisibility(kVar.isVisible() ? 0 : 8);
        setTitle(kVar.f4821e);
        setCheckable(kVar.isCheckable());
        if (kVar.f4830n.n()) {
            if ((kVar.f4830n.m() ? kVar.f4826j : kVar.f4824h) != 0) {
                z5 = true;
                kVar.f4830n.m();
                if (z5) {
                    k kVar2 = this.f3233f;
                    if (kVar2.f4830n.n()) {
                        if ((kVar2.f4830n.m() ? kVar2.f4826j : kVar2.f4824h) != 0) {
                            z6 = true;
                        }
                    }
                    z6 = false;
                }
                i7 = 8;
                if (i7 == 0) {
                    TextView textView = this.f3238k;
                    k kVar3 = this.f3233f;
                    j jVar = kVar3.f4830n;
                    Context context = jVar.f4795a;
                    char c7 = jVar.m() ? kVar3.f4826j : kVar3.f4824h;
                    if (c7 == 0) {
                        sb = "";
                    } else {
                        Resources resources = context.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i8 = jVar.m() ? kVar3.f4827k : kVar3.f4825i;
                        k.a(sb2, i8, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                        k.a(sb2, i8, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                        k.a(sb2, i8, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                        k.a(sb2, i8, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                        k.a(sb2, i8, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                        k.a(sb2, i8, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
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
                if (this.f3238k.getVisibility() != i7) {
                    this.f3238k.setVisibility(i7);
                }
                setIcon(kVar.getIcon());
                setEnabled(kVar.isEnabled());
                setSubMenuArrowVisible(kVar.hasSubMenu());
                setContentDescription(kVar.f4833q);
            }
        }
        z5 = false;
        kVar.f4830n.m();
        if (z5) {
        }
        i7 = 8;
        if (i7 == 0) {
        }
        if (this.f3238k.getVisibility() != i7) {
        }
        setIcon(kVar.getIcon());
        setEnabled(kVar.isEnabled());
        setSubMenuArrowVisible(kVar.hasSubMenu());
        setContentDescription(kVar.f4833q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f3240m;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f3240m.getLayoutParams();
        rect.top = this.f3240m.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // j.q
    public k getItemData() {
        return this.f3233f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Field field = D.f240a;
        setBackground(this.f3242o);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f3236i = textView;
        int i7 = this.f3243p;
        if (i7 != -1) {
            textView.setTextAppearance(this.f3244q, i7);
        }
        this.f3238k = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f3239l = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f3246s);
        }
        this.f3240m = (ImageView) findViewById(R.id.group_divider);
        this.f3241n = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        if (this.f3234g != null && this.f3245r) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f3234g.getLayoutParams();
            int i9 = layoutParams.height;
            if (i9 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i9;
            }
        }
        super.onMeasure(i7, i8);
    }

    public void setCheckable(boolean z5) {
        CompoundButton compoundButton;
        View view;
        if (!z5 && this.f3235h == null && this.f3237j == null) {
            return;
        }
        if ((this.f3233f.f4840x & 4) != 0) {
            if (this.f3235h == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f3235h = radioButton;
                LinearLayout linearLayout = this.f3241n;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f3235h;
            view = this.f3237j;
        } else {
            if (this.f3237j == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f3237j = checkBox;
                LinearLayout linearLayout2 = this.f3241n;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f3237j;
            view = this.f3235h;
        }
        if (z5) {
            compoundButton.setChecked(this.f3233f.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f3237j;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f3235h;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z5) {
        CompoundButton compoundButton;
        if ((this.f3233f.f4840x & 4) != 0) {
            if (this.f3235h == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f3235h = radioButton;
                LinearLayout linearLayout = this.f3241n;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f3235h;
        } else {
            if (this.f3237j == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f3237j = checkBox;
                LinearLayout linearLayout2 = this.f3241n;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f3237j;
        }
        compoundButton.setChecked(z5);
    }

    public void setForceShowIcon(boolean z5) {
        this.f3249v = z5;
        this.f3245r = z5;
    }

    public void setGroupDividerEnabled(boolean z5) {
        ImageView imageView = this.f3240m;
        if (imageView != null) {
            imageView.setVisibility((this.f3247t || !z5) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        j jVar = this.f3233f.f4830n;
        boolean z5 = this.f3249v;
        if (z5 || this.f3245r) {
            ImageView imageView = this.f3234g;
            if (imageView == null && drawable == null && !this.f3245r) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f3234g = imageView2;
                LinearLayout linearLayout = this.f3241n;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f3245r) {
                this.f3234g.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f3234g;
            if (!z5) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f3234g.getVisibility() != 0) {
                this.f3234g.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f3236i.getVisibility() != 8) {
                this.f3236i.setVisibility(8);
            }
        } else {
            this.f3236i.setText(charSequence);
            if (this.f3236i.getVisibility() != 0) {
                this.f3236i.setVisibility(0);
            }
        }
    }
}
