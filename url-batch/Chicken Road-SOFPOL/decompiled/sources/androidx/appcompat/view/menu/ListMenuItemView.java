package androidx.appcompat.view.menu;

import a0.g1;
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
import com.snovikpovik.vuevnxsj.R;
import h.a;
import k.i;
import k.j;
import k.p;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements p, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: d, reason: collision with root package name */
    public j f342d;

    /* renamed from: e, reason: collision with root package name */
    public ImageView f343e;

    /* renamed from: f, reason: collision with root package name */
    public RadioButton f344f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f345g;

    /* renamed from: h, reason: collision with root package name */
    public CheckBox f346h;
    public TextView i;

    /* renamed from: j, reason: collision with root package name */
    public ImageView f347j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f348k;

    /* renamed from: l, reason: collision with root package name */
    public LinearLayout f349l;

    /* renamed from: m, reason: collision with root package name */
    public final Drawable f350m;

    /* renamed from: n, reason: collision with root package name */
    public final int f351n;

    /* renamed from: o, reason: collision with root package name */
    public final Context f352o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f353p;

    /* renamed from: q, reason: collision with root package name */
    public final Drawable f354q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f355r;

    /* renamed from: s, reason: collision with root package name */
    public LayoutInflater f356s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f357t;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g1 E = g1.E(getContext(), attributeSet, a.f3062o, R.attr.listMenuViewStyle);
        this.f350m = E.q(5);
        TypedArray typedArray = (TypedArray) E.f85c;
        this.f351n = typedArray.getResourceId(1, -1);
        this.f353p = typedArray.getBoolean(7, false);
        this.f352o = context;
        this.f354q = E.q(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f355r = obtainStyledAttributes.hasValue(0);
        E.G();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f356s == null) {
            this.f356s = LayoutInflater.from(getContext());
        }
        return this.f356s;
    }

    private void setSubMenuArrowVisible(boolean z3) {
        ImageView imageView = this.f347j;
        if (imageView != null) {
            imageView.setVisibility(z3 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f348k;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f348k.getLayoutParams();
        rect.top = this.f348k.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    @Override // k.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(j jVar) {
        boolean z3;
        String sb;
        boolean z7;
        this.f342d = jVar;
        boolean isVisible = jVar.isVisible();
        i iVar = jVar.f4101n;
        int i = 0;
        setVisibility(isVisible ? 0 : 8);
        setTitle(jVar.f4093e);
        setCheckable(jVar.isCheckable());
        if (iVar.n()) {
            if ((iVar.m() ? jVar.f4097j : jVar.f4096h) != 0) {
                z3 = true;
                iVar.m();
                if (z3) {
                    j jVar2 = this.f342d;
                    i iVar2 = jVar2.f4101n;
                    if (iVar2.n()) {
                        if ((iVar2.m() ? jVar2.f4097j : jVar2.f4096h) != 0) {
                            z7 = true;
                        }
                    }
                    z7 = false;
                }
                i = 8;
                if (i == 0) {
                    TextView textView = this.i;
                    j jVar3 = this.f342d;
                    i iVar3 = jVar3.f4101n;
                    Context context = iVar3.f4070a;
                    char c8 = iVar3.m() ? jVar3.f4097j : jVar3.f4096h;
                    if (c8 == 0) {
                        sb = "";
                    } else {
                        Resources resources = context.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i8 = iVar3.m() ? jVar3.f4098k : jVar3.i;
                        j.a(i8, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                        j.a(i8, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                        j.a(i8, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                        j.a(i8, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                        j.a(i8, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                        j.a(i8, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
                        if (c8 == '\b') {
                            sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        } else if (c8 == '\n') {
                            sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                        } else if (c8 != ' ') {
                            sb2.append(c8);
                        } else {
                            sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                        }
                        sb = sb2.toString();
                    }
                    textView.setText(sb);
                }
                if (this.i.getVisibility() != i) {
                    this.i.setVisibility(i);
                }
                setIcon(jVar.getIcon());
                setEnabled(jVar.isEnabled());
                setSubMenuArrowVisible(jVar.hasSubMenu());
                setContentDescription(jVar.f4104q);
            }
        }
        z3 = false;
        iVar.m();
        if (z3) {
        }
        i = 8;
        if (i == 0) {
        }
        if (this.i.getVisibility() != i) {
        }
        setIcon(jVar.getIcon());
        setEnabled(jVar.isEnabled());
        setSubMenuArrowVisible(jVar.hasSubMenu());
        setContentDescription(jVar.f4104q);
    }

    @Override // k.p
    public j getItemData() {
        return this.f342d;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f350m);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f345g = textView;
        int i = this.f351n;
        if (i != -1) {
            textView.setTextAppearance(this.f352o, i);
        }
        this.i = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f347j = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f354q);
        }
        this.f348k = (ImageView) findViewById(R.id.group_divider);
        this.f349l = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i8) {
        if (this.f343e != null && this.f353p) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f343e.getLayoutParams();
            int i9 = layoutParams.height;
            if (i9 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i9;
            }
        }
        super.onMeasure(i, i8);
    }

    public void setCheckable(boolean z3) {
        CompoundButton compoundButton;
        View view;
        if (!z3 && this.f344f == null && this.f346h == null) {
            return;
        }
        if ((this.f342d.f4111x & 4) != 0) {
            if (this.f344f == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f344f = radioButton;
                LinearLayout linearLayout = this.f349l;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f344f;
            view = this.f346h;
        } else {
            if (this.f346h == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f346h = checkBox;
                LinearLayout linearLayout2 = this.f349l;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f346h;
            view = this.f344f;
        }
        if (z3) {
            compoundButton.setChecked(this.f342d.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f346h;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f344f;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z3) {
        CompoundButton compoundButton;
        if ((this.f342d.f4111x & 4) != 0) {
            if (this.f344f == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f344f = radioButton;
                LinearLayout linearLayout = this.f349l;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f344f;
        } else {
            if (this.f346h == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f346h = checkBox;
                LinearLayout linearLayout2 = this.f349l;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f346h;
        }
        compoundButton.setChecked(z3);
    }

    public void setForceShowIcon(boolean z3) {
        this.f357t = z3;
        this.f353p = z3;
    }

    public void setGroupDividerEnabled(boolean z3) {
        ImageView imageView = this.f348k;
        if (imageView != null) {
            imageView.setVisibility((this.f355r || !z3) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        i iVar = this.f342d.f4101n;
        boolean z3 = this.f357t;
        if (z3 || this.f353p) {
            ImageView imageView = this.f343e;
            if (imageView == null && drawable == null && !this.f353p) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f343e = imageView2;
                LinearLayout linearLayout = this.f349l;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f353p) {
                this.f343e.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f343e;
            if (!z3) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f343e.getVisibility() != 0) {
                this.f343e.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f345g.getVisibility() != 8) {
                this.f345g.setVisibility(8);
            }
        } else {
            this.f345g.setText(charSequence);
            if (this.f345g.getVisibility() != 0) {
                this.f345g.setVisibility(0);
            }
        }
    }
}
