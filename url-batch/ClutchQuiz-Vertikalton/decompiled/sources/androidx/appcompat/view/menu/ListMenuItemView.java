package androidx.appcompat.view.menu;

import K.C0012m;
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
import com.clutchquizarena.app.R;
import f.a;
import k.C0169o;
import k.InterfaceC0180z;
import k.MenuC0167m;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0180z, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public C0169o f1258a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f1259b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f1260c;
    public TextView d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f1261e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f1262f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f1263g;
    public ImageView h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f1264j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1265k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f1266l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1267m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f1268n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1269o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f1270p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1271q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0012m r2 = C0012m.r(getContext(), attributeSet, a.f2123r, R.attr.listMenuViewStyle);
        this.f1264j = r2.h(5);
        TypedArray typedArray = (TypedArray) r2.f423c;
        this.f1265k = typedArray.getResourceId(1, -1);
        this.f1267m = typedArray.getBoolean(7, false);
        this.f1266l = context;
        this.f1268n = r2.h(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f1269o = obtainStyledAttributes.hasValue(0);
        r2.t();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1270p == null) {
            this.f1270p = LayoutInflater.from(getContext());
        }
        return this.f1270p;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f1263g;
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
    @Override // k.InterfaceC0180z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0169o c0169o) {
        boolean z2;
        String sb;
        boolean z3;
        this.f1258a = c0169o;
        int i = 0;
        setVisibility(c0169o.isVisible() ? 0 : 8);
        setTitle(c0169o.f2776e);
        setCheckable(c0169o.isCheckable());
        if (c0169o.f2783n.o()) {
            if ((c0169o.f2783n.n() ? c0169o.f2779j : c0169o.h) != 0) {
                z2 = true;
                c0169o.f2783n.n();
                if (z2) {
                    C0169o c0169o2 = this.f1258a;
                    if (c0169o2.f2783n.o()) {
                        if ((c0169o2.f2783n.n() ? c0169o2.f2779j : c0169o2.h) != 0) {
                            z3 = true;
                        }
                    }
                    z3 = false;
                }
                i = 8;
                if (i == 0) {
                    TextView textView = this.f1262f;
                    C0169o c0169o3 = this.f1258a;
                    char c2 = c0169o3.f2783n.n() ? c0169o3.f2779j : c0169o3.h;
                    if (c2 == 0) {
                        sb = "";
                    } else {
                        MenuC0167m menuC0167m = c0169o3.f2783n;
                        Resources resources = menuC0167m.f2746a.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(menuC0167m.f2746a).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i2 = menuC0167m.n() ? c0169o3.f2780k : c0169o3.i;
                        C0169o.c(i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                        C0169o.c(i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                        C0169o.c(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                        C0169o.c(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                        C0169o.c(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                        C0169o.c(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
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
                if (this.f1262f.getVisibility() != i) {
                    this.f1262f.setVisibility(i);
                }
                setIcon(c0169o.getIcon());
                setEnabled(c0169o.isEnabled());
                setSubMenuArrowVisible(c0169o.hasSubMenu());
                setContentDescription(c0169o.f2786q);
            }
        }
        z2 = false;
        c0169o.f2783n.n();
        if (z2) {
        }
        i = 8;
        if (i == 0) {
        }
        if (this.f1262f.getVisibility() != i) {
        }
        setIcon(c0169o.getIcon());
        setEnabled(c0169o.isEnabled());
        setSubMenuArrowVisible(c0169o.hasSubMenu());
        setContentDescription(c0169o.f2786q);
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

    @Override // k.InterfaceC0180z
    public C0169o getItemData() {
        return this.f1258a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f1264j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.d = textView;
        int i = this.f1265k;
        if (i != -1) {
            textView.setTextAppearance(this.f1266l, i);
        }
        this.f1262f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1263g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1268n);
        }
        this.h = (ImageView) findViewById(R.id.group_divider);
        this.i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f1259b != null && this.f1267m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1259b.getLayoutParams();
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
        if (!z2 && this.f1260c == null && this.f1261e == null) {
            return;
        }
        if ((this.f1258a.f2793x & 4) != 0) {
            if (this.f1260c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1260c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1260c;
            view = this.f1261e;
        } else {
            if (this.f1261e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1261e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1261e;
            view = this.f1260c;
        }
        if (z2) {
            compoundButton.setChecked(this.f1258a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f1261e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1260c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f1258a.f2793x & 4) != 0) {
            if (this.f1260c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1260c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1260c;
        } else {
            if (this.f1261e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1261e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1261e;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f1271q = z2;
        this.f1267m = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility((this.f1269o || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1258a.f2783n.getClass();
        boolean z2 = this.f1271q;
        if (z2 || this.f1267m) {
            ImageView imageView = this.f1259b;
            if (imageView == null && drawable == null && !this.f1267m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f1259b = imageView2;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1267m) {
                this.f1259b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f1259b;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1259b.getVisibility() != 0) {
                this.f1259b.setVisibility(0);
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
