package androidx.appcompat.view.menu;

import K.C0011l;
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
import com.playgen.securelock.R;
import f.a;
import k.C0163o;
import k.InterfaceC0174z;
import k.MenuC0161m;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0174z, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public C0163o f1179a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f1180b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f1181c;
    public TextView d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f1182e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f1183f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f1184g;
    public ImageView h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f1185j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1186k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f1187l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1188m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f1189n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1190o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f1191p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1192q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0011l r2 = C0011l.r(getContext(), attributeSet, a.f2004r, R.attr.listMenuViewStyle);
        this.f1185j = r2.h(5);
        TypedArray typedArray = (TypedArray) r2.f423c;
        this.f1186k = typedArray.getResourceId(1, -1);
        this.f1188m = typedArray.getBoolean(7, false);
        this.f1187l = context;
        this.f1189n = r2.h(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f1190o = obtainStyledAttributes.hasValue(0);
        r2.t();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1191p == null) {
            this.f1191p = LayoutInflater.from(getContext());
        }
        return this.f1191p;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f1184g;
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
    @Override // k.InterfaceC0174z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0163o c0163o) {
        boolean z2;
        String sb;
        boolean z3;
        this.f1179a = c0163o;
        int i = 0;
        setVisibility(c0163o.isVisible() ? 0 : 8);
        setTitle(c0163o.f2642e);
        setCheckable(c0163o.isCheckable());
        if (c0163o.f2649n.o()) {
            if ((c0163o.f2649n.n() ? c0163o.f2645j : c0163o.h) != 0) {
                z2 = true;
                c0163o.f2649n.n();
                if (z2) {
                    C0163o c0163o2 = this.f1179a;
                    if (c0163o2.f2649n.o()) {
                        if ((c0163o2.f2649n.n() ? c0163o2.f2645j : c0163o2.h) != 0) {
                            z3 = true;
                        }
                    }
                    z3 = false;
                }
                i = 8;
                if (i == 0) {
                    TextView textView = this.f1183f;
                    C0163o c0163o3 = this.f1179a;
                    char c2 = c0163o3.f2649n.n() ? c0163o3.f2645j : c0163o3.h;
                    if (c2 == 0) {
                        sb = "";
                    } else {
                        MenuC0161m menuC0161m = c0163o3.f2649n;
                        Resources resources = menuC0161m.f2612a.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(menuC0161m.f2612a).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i2 = menuC0161m.n() ? c0163o3.f2646k : c0163o3.i;
                        C0163o.c(i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                        C0163o.c(i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                        C0163o.c(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                        C0163o.c(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                        C0163o.c(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                        C0163o.c(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
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
                if (this.f1183f.getVisibility() != i) {
                    this.f1183f.setVisibility(i);
                }
                setIcon(c0163o.getIcon());
                setEnabled(c0163o.isEnabled());
                setSubMenuArrowVisible(c0163o.hasSubMenu());
                setContentDescription(c0163o.f2652q);
            }
        }
        z2 = false;
        c0163o.f2649n.n();
        if (z2) {
        }
        i = 8;
        if (i == 0) {
        }
        if (this.f1183f.getVisibility() != i) {
        }
        setIcon(c0163o.getIcon());
        setEnabled(c0163o.isEnabled());
        setSubMenuArrowVisible(c0163o.hasSubMenu());
        setContentDescription(c0163o.f2652q);
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

    @Override // k.InterfaceC0174z
    public C0163o getItemData() {
        return this.f1179a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f1185j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.d = textView;
        int i = this.f1186k;
        if (i != -1) {
            textView.setTextAppearance(this.f1187l, i);
        }
        this.f1183f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1184g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1189n);
        }
        this.h = (ImageView) findViewById(R.id.group_divider);
        this.i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f1180b != null && this.f1188m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1180b.getLayoutParams();
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
        if (!z2 && this.f1181c == null && this.f1182e == null) {
            return;
        }
        if ((this.f1179a.f2659x & 4) != 0) {
            if (this.f1181c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1181c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1181c;
            view = this.f1182e;
        } else {
            if (this.f1182e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1182e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1182e;
            view = this.f1181c;
        }
        if (z2) {
            compoundButton.setChecked(this.f1179a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f1182e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1181c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f1179a.f2659x & 4) != 0) {
            if (this.f1181c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1181c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1181c;
        } else {
            if (this.f1182e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1182e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1182e;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f1192q = z2;
        this.f1188m = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility((this.f1190o || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1179a.f2649n.getClass();
        boolean z2 = this.f1192q;
        if (z2 || this.f1188m) {
            ImageView imageView = this.f1180b;
            if (imageView == null && drawable == null && !this.f1188m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f1180b = imageView2;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1188m) {
                this.f1180b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f1180b;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1180b.getVisibility() != 0) {
                this.f1180b.setVisibility(0);
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
