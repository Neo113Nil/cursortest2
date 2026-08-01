package androidx.appcompat.view.menu;

import K.C0014l;
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
import com.playbag.tripgear.R;
import f.a;
import k.C0166o;
import k.InterfaceC0177z;
import k.MenuC0164m;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0177z, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public C0166o f1238a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f1239b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f1240c;
    public TextView d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f1241e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f1242f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f1243g;
    public ImageView h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f1244j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1245k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f1246l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1247m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f1248n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1249o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f1250p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1251q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0014l i = C0014l.i(getContext(), attributeSet, a.f2069r, R.attr.listMenuViewStyle);
        this.f1244j = i.c(5);
        TypedArray typedArray = (TypedArray) i.f475b;
        this.f1245k = typedArray.getResourceId(1, -1);
        this.f1247m = typedArray.getBoolean(7, false);
        this.f1246l = context;
        this.f1248n = i.c(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f1249o = obtainStyledAttributes.hasValue(0);
        i.k();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1250p == null) {
            this.f1250p = LayoutInflater.from(getContext());
        }
        return this.f1250p;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f1243g;
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
    @Override // k.InterfaceC0177z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0166o c0166o) {
        boolean z2;
        String sb;
        boolean z3;
        this.f1238a = c0166o;
        int i = 0;
        setVisibility(c0166o.isVisible() ? 0 : 8);
        setTitle(c0166o.f2715e);
        setCheckable(c0166o.isCheckable());
        if (c0166o.f2722n.o()) {
            if ((c0166o.f2722n.n() ? c0166o.f2718j : c0166o.h) != 0) {
                z2 = true;
                c0166o.f2722n.n();
                if (z2) {
                    C0166o c0166o2 = this.f1238a;
                    if (c0166o2.f2722n.o()) {
                        if ((c0166o2.f2722n.n() ? c0166o2.f2718j : c0166o2.h) != 0) {
                            z3 = true;
                        }
                    }
                    z3 = false;
                }
                i = 8;
                if (i == 0) {
                    TextView textView = this.f1242f;
                    C0166o c0166o3 = this.f1238a;
                    char c2 = c0166o3.f2722n.n() ? c0166o3.f2718j : c0166o3.h;
                    if (c2 == 0) {
                        sb = "";
                    } else {
                        MenuC0164m menuC0164m = c0166o3.f2722n;
                        Resources resources = menuC0164m.f2685a.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(menuC0164m.f2685a).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i2 = menuC0164m.n() ? c0166o3.f2719k : c0166o3.i;
                        C0166o.c(i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                        C0166o.c(i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                        C0166o.c(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                        C0166o.c(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                        C0166o.c(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                        C0166o.c(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
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
                if (this.f1242f.getVisibility() != i) {
                    this.f1242f.setVisibility(i);
                }
                setIcon(c0166o.getIcon());
                setEnabled(c0166o.isEnabled());
                setSubMenuArrowVisible(c0166o.hasSubMenu());
                setContentDescription(c0166o.f2725q);
            }
        }
        z2 = false;
        c0166o.f2722n.n();
        if (z2) {
        }
        i = 8;
        if (i == 0) {
        }
        if (this.f1242f.getVisibility() != i) {
        }
        setIcon(c0166o.getIcon());
        setEnabled(c0166o.isEnabled());
        setSubMenuArrowVisible(c0166o.hasSubMenu());
        setContentDescription(c0166o.f2725q);
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

    @Override // k.InterfaceC0177z
    public C0166o getItemData() {
        return this.f1238a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f1244j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.d = textView;
        int i = this.f1245k;
        if (i != -1) {
            textView.setTextAppearance(this.f1246l, i);
        }
        this.f1242f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1243g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1248n);
        }
        this.h = (ImageView) findViewById(R.id.group_divider);
        this.i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f1239b != null && this.f1247m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1239b.getLayoutParams();
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
        if (!z2 && this.f1240c == null && this.f1241e == null) {
            return;
        }
        if ((this.f1238a.f2732x & 4) != 0) {
            if (this.f1240c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1240c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1240c;
            view = this.f1241e;
        } else {
            if (this.f1241e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1241e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1241e;
            view = this.f1240c;
        }
        if (z2) {
            compoundButton.setChecked(this.f1238a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f1241e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1240c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f1238a.f2732x & 4) != 0) {
            if (this.f1240c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1240c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1240c;
        } else {
            if (this.f1241e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1241e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1241e;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f1251q = z2;
        this.f1247m = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility((this.f1249o || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1238a.f2722n.getClass();
        boolean z2 = this.f1251q;
        if (z2 || this.f1247m) {
            ImageView imageView = this.f1239b;
            if (imageView == null && drawable == null && !this.f1247m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f1239b = imageView2;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1247m) {
                this.f1239b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f1239b;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1239b.getVisibility() != 0) {
                this.f1239b.setVisibility(0);
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
