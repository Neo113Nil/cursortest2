package androidx.appcompat.view.menu;

import a1.n;
import android.R;
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
import i.a;
import l.i;
import l.j;
import l.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements p, AbsListView.SelectionBoundsAdjuster {
    public boolean A;
    public final Drawable B;
    public final boolean C;
    public LayoutInflater D;
    public boolean E;

    /* renamed from: d, reason: collision with root package name */
    public j f382d;

    /* renamed from: e, reason: collision with root package name */
    public ImageView f383e;

    /* renamed from: i, reason: collision with root package name */
    public RadioButton f384i;

    /* renamed from: r, reason: collision with root package name */
    public TextView f385r;

    /* renamed from: s, reason: collision with root package name */
    public CheckBox f386s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f387t;

    /* renamed from: u, reason: collision with root package name */
    public ImageView f388u;

    /* renamed from: v, reason: collision with root package name */
    public ImageView f389v;

    /* renamed from: w, reason: collision with root package name */
    public LinearLayout f390w;

    /* renamed from: x, reason: collision with root package name */
    public final Drawable f391x;

    /* renamed from: y, reason: collision with root package name */
    public final int f392y;

    /* renamed from: z, reason: collision with root package name */
    public final Context f393z;

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet);
        n z10 = n.z(getContext(), attributeSet, a.f4551n, i3);
        this.f391x = z10.r(5);
        TypedArray typedArray = (TypedArray) z10.f40e;
        this.f392y = typedArray.getResourceId(1, -1);
        this.A = typedArray.getBoolean(7, false);
        this.f393z = context;
        this.B = z10.r(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, com.appsflyer.R.attr.dropDownListViewStyle, 0);
        this.C = obtainStyledAttributes.hasValue(0);
        z10.D();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.D == null) {
            this.D = LayoutInflater.from(getContext());
        }
        return this.D;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f388u;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f389v;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f389v.getLayoutParams();
        rect.top = this.f389v.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    @Override // l.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(j jVar) {
        boolean z10;
        String sb2;
        boolean z11;
        this.f382d = jVar;
        boolean isVisible = jVar.isVisible();
        i iVar = jVar.f5694n;
        int i3 = 0;
        setVisibility(isVisible ? 0 : 8);
        setTitle(jVar.f5687e);
        setCheckable(jVar.isCheckable());
        if (iVar.n()) {
            if ((iVar.m() ? jVar.j : jVar.f5689h) != 0) {
                z10 = true;
                iVar.m();
                if (z10) {
                    j jVar2 = this.f382d;
                    i iVar2 = jVar2.f5694n;
                    if (iVar2.n()) {
                        if ((iVar2.m() ? jVar2.j : jVar2.f5689h) != 0) {
                            z11 = true;
                        }
                    }
                    z11 = false;
                }
                i3 = 8;
                if (i3 == 0) {
                    TextView textView = this.f387t;
                    j jVar3 = this.f382d;
                    i iVar3 = jVar3.f5694n;
                    Context context = iVar3.f5665a;
                    char c10 = iVar3.m() ? jVar3.j : jVar3.f5689h;
                    if (c10 == 0) {
                        sb2 = "";
                    } else {
                        Resources resources = context.getResources();
                        StringBuilder sb3 = new StringBuilder();
                        if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                            sb3.append(resources.getString(com.appsflyer.R.string.abc_prepend_shortcut_label));
                        }
                        int i10 = iVar3.m() ? jVar3.f5691k : jVar3.f5690i;
                        j.a(i10, 65536, resources.getString(com.appsflyer.R.string.abc_menu_meta_shortcut_label), sb3);
                        j.a(i10, 4096, resources.getString(com.appsflyer.R.string.abc_menu_ctrl_shortcut_label), sb3);
                        j.a(i10, 2, resources.getString(com.appsflyer.R.string.abc_menu_alt_shortcut_label), sb3);
                        j.a(i10, 1, resources.getString(com.appsflyer.R.string.abc_menu_shift_shortcut_label), sb3);
                        j.a(i10, 4, resources.getString(com.appsflyer.R.string.abc_menu_sym_shortcut_label), sb3);
                        j.a(i10, 8, resources.getString(com.appsflyer.R.string.abc_menu_function_shortcut_label), sb3);
                        if (c10 == '\b') {
                            sb3.append(resources.getString(com.appsflyer.R.string.abc_menu_delete_shortcut_label));
                        } else if (c10 == '\n') {
                            sb3.append(resources.getString(com.appsflyer.R.string.abc_menu_enter_shortcut_label));
                        } else if (c10 != ' ') {
                            sb3.append(c10);
                        } else {
                            sb3.append(resources.getString(com.appsflyer.R.string.abc_menu_space_shortcut_label));
                        }
                        sb2 = sb3.toString();
                    }
                    textView.setText(sb2);
                }
                if (this.f387t.getVisibility() != i3) {
                    this.f387t.setVisibility(i3);
                }
                setIcon(jVar.getIcon());
                setEnabled(jVar.isEnabled());
                setSubMenuArrowVisible(jVar.hasSubMenu());
                setContentDescription(jVar.f5697q);
            }
        }
        z10 = false;
        iVar.m();
        if (z10) {
        }
        i3 = 8;
        if (i3 == 0) {
        }
        if (this.f387t.getVisibility() != i3) {
        }
        setIcon(jVar.getIcon());
        setEnabled(jVar.isEnabled());
        setSubMenuArrowVisible(jVar.hasSubMenu());
        setContentDescription(jVar.f5697q);
    }

    @Override // l.p
    public j getItemData() {
        return this.f382d;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f391x);
        TextView textView = (TextView) findViewById(com.appsflyer.R.id.title);
        this.f385r = textView;
        int i3 = this.f392y;
        if (i3 != -1) {
            textView.setTextAppearance(this.f393z, i3);
        }
        this.f387t = (TextView) findViewById(com.appsflyer.R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(com.appsflyer.R.id.submenuarrow);
        this.f388u = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.B);
        }
        this.f389v = (ImageView) findViewById(com.appsflyer.R.id.group_divider);
        this.f390w = (LinearLayout) findViewById(com.appsflyer.R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        if (this.f383e != null && this.A) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f383e.getLayoutParams();
            int i11 = layoutParams.height;
            if (i11 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i11;
            }
        }
        super.onMeasure(i3, i10);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f384i == null && this.f386s == null) {
            return;
        }
        if ((this.f382d.f5704x & 4) != 0) {
            if (this.f384i == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(com.appsflyer.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f384i = radioButton;
                LinearLayout linearLayout = this.f390w;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f384i;
            view = this.f386s;
        } else {
            if (this.f386s == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(com.appsflyer.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f386s = checkBox;
                LinearLayout linearLayout2 = this.f390w;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f386s;
            view = this.f384i;
        }
        if (z10) {
            compoundButton.setChecked(this.f382d.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f386s;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f384i;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if ((this.f382d.f5704x & 4) != 0) {
            if (this.f384i == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(com.appsflyer.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f384i = radioButton;
                LinearLayout linearLayout = this.f390w;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f384i;
        } else {
            if (this.f386s == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(com.appsflyer.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f386s = checkBox;
                LinearLayout linearLayout2 = this.f390w;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f386s;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.E = z10;
        this.A = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f389v;
        if (imageView != null) {
            imageView.setVisibility((this.C || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        i iVar = this.f382d.f5694n;
        boolean z10 = this.E;
        if (z10 || this.A) {
            ImageView imageView = this.f383e;
            if (imageView == null && drawable == null && !this.A) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(com.appsflyer.R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f383e = imageView2;
                LinearLayout linearLayout = this.f390w;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.A) {
                this.f383e.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f383e;
            if (!z10) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f383e.getVisibility() != 0) {
                this.f383e.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.f385r;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.f385r.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.f385r.getVisibility() != 0) {
                this.f385r.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.appsflyer.R.attr.listMenuViewStyle);
    }
}
