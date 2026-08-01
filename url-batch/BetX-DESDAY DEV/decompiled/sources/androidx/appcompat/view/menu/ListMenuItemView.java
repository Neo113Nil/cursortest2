package androidx.appcompat.view.menu;

import T.r;
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
import com.luckyarcade.spinthrow.R;
import f.a;
import k.C0204o;
import k.InterfaceC0215z;
import k.MenuC0202m;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0215z, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public C0204o f967a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f968b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f969c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f970d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f971e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f972f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f973g;
    public ImageView h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f974j;

    /* renamed from: k, reason: collision with root package name */
    public final int f975k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f976l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f977m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f978n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f979o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f980p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f981q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        r r2 = r.r(getContext(), attributeSet, a.f2406r, R.attr.listMenuViewStyle);
        this.f974j = r2.h(5);
        TypedArray typedArray = (TypedArray) r2.f812c;
        this.f975k = typedArray.getResourceId(1, -1);
        this.f977m = typedArray.getBoolean(7, false);
        this.f976l = context;
        this.f978n = r2.h(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f979o = obtainStyledAttributes.hasValue(0);
        r2.t();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f980p == null) {
            this.f980p = LayoutInflater.from(getContext());
        }
        return this.f980p;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f973g;
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
    @Override // k.InterfaceC0215z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0204o c0204o) {
        boolean z2;
        String sb;
        boolean z3;
        this.f967a = c0204o;
        int i = 0;
        setVisibility(c0204o.isVisible() ? 0 : 8);
        setTitle(c0204o.f3093e);
        setCheckable(c0204o.isCheckable());
        if (c0204o.f3100n.o()) {
            if ((c0204o.f3100n.n() ? c0204o.f3096j : c0204o.h) != 0) {
                z2 = true;
                c0204o.f3100n.n();
                if (z2) {
                    C0204o c0204o2 = this.f967a;
                    if (c0204o2.f3100n.o()) {
                        if ((c0204o2.f3100n.n() ? c0204o2.f3096j : c0204o2.h) != 0) {
                            z3 = true;
                        }
                    }
                    z3 = false;
                }
                i = 8;
                if (i == 0) {
                    TextView textView = this.f972f;
                    C0204o c0204o3 = this.f967a;
                    char c2 = c0204o3.f3100n.n() ? c0204o3.f3096j : c0204o3.h;
                    if (c2 == 0) {
                        sb = "";
                    } else {
                        MenuC0202m menuC0202m = c0204o3.f3100n;
                        Resources resources = menuC0202m.f3061a.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(menuC0202m.f3061a).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i2 = menuC0202m.n() ? c0204o3.f3097k : c0204o3.i;
                        C0204o.c(i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                        C0204o.c(i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                        C0204o.c(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                        C0204o.c(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                        C0204o.c(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                        C0204o.c(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
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
                if (this.f972f.getVisibility() != i) {
                    this.f972f.setVisibility(i);
                }
                setIcon(c0204o.getIcon());
                setEnabled(c0204o.isEnabled());
                setSubMenuArrowVisible(c0204o.hasSubMenu());
                setContentDescription(c0204o.f3103q);
            }
        }
        z2 = false;
        c0204o.f3100n.n();
        if (z2) {
        }
        i = 8;
        if (i == 0) {
        }
        if (this.f972f.getVisibility() != i) {
        }
        setIcon(c0204o.getIcon());
        setEnabled(c0204o.isEnabled());
        setSubMenuArrowVisible(c0204o.hasSubMenu());
        setContentDescription(c0204o.f3103q);
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

    @Override // k.InterfaceC0215z
    public C0204o getItemData() {
        return this.f967a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f974j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f970d = textView;
        int i = this.f975k;
        if (i != -1) {
            textView.setTextAppearance(this.f976l, i);
        }
        this.f972f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f973g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f978n);
        }
        this.h = (ImageView) findViewById(R.id.group_divider);
        this.i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f968b != null && this.f977m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f968b.getLayoutParams();
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
        if (!z2 && this.f969c == null && this.f971e == null) {
            return;
        }
        if ((this.f967a.f3110x & 4) != 0) {
            if (this.f969c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f969c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f969c;
            view = this.f971e;
        } else {
            if (this.f971e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f971e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f971e;
            view = this.f969c;
        }
        if (z2) {
            compoundButton.setChecked(this.f967a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f971e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f969c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f967a.f3110x & 4) != 0) {
            if (this.f969c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f969c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f969c;
        } else {
            if (this.f971e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f971e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f971e;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f981q = z2;
        this.f977m = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility((this.f979o || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f967a.f3100n.getClass();
        boolean z2 = this.f981q;
        if (z2 || this.f977m) {
            ImageView imageView = this.f968b;
            if (imageView == null && drawable == null && !this.f977m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f968b = imageView2;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f977m) {
                this.f968b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f968b;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f968b.getVisibility() != 0) {
                this.f968b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f970d.getVisibility() != 8) {
                this.f970d.setVisibility(8);
            }
        } else {
            this.f970d.setText(charSequence);
            if (this.f970d.getVisibility() != 0) {
                this.f970d.setVisibility(0);
            }
        }
    }
}
