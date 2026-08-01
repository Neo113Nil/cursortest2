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
import com.fortuneink.neonpad.R;
import f.a;
import k.C0202o;
import k.InterfaceC0213z;
import k.MenuC0200m;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0213z, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public C0202o f966a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f967b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f968c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f969d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f970e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f971f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f972g;
    public ImageView h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f973j;

    /* renamed from: k, reason: collision with root package name */
    public final int f974k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f975l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f976m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f977n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f978o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f979p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f980q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        r r2 = r.r(getContext(), attributeSet, a.f2402r, R.attr.listMenuViewStyle);
        this.f973j = r2.h(5);
        TypedArray typedArray = (TypedArray) r2.f811c;
        this.f974k = typedArray.getResourceId(1, -1);
        this.f976m = typedArray.getBoolean(7, false);
        this.f975l = context;
        this.f977n = r2.h(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f978o = obtainStyledAttributes.hasValue(0);
        r2.t();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f979p == null) {
            this.f979p = LayoutInflater.from(getContext());
        }
        return this.f979p;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f972g;
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
    @Override // k.InterfaceC0213z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0202o c0202o) {
        boolean z2;
        String sb;
        boolean z3;
        this.f966a = c0202o;
        int i = 0;
        setVisibility(c0202o.isVisible() ? 0 : 8);
        setTitle(c0202o.f3089e);
        setCheckable(c0202o.isCheckable());
        if (c0202o.f3096n.o()) {
            if ((c0202o.f3096n.n() ? c0202o.f3092j : c0202o.h) != 0) {
                z2 = true;
                c0202o.f3096n.n();
                if (z2) {
                    C0202o c0202o2 = this.f966a;
                    if (c0202o2.f3096n.o()) {
                        if ((c0202o2.f3096n.n() ? c0202o2.f3092j : c0202o2.h) != 0) {
                            z3 = true;
                        }
                    }
                    z3 = false;
                }
                i = 8;
                if (i == 0) {
                    TextView textView = this.f971f;
                    C0202o c0202o3 = this.f966a;
                    char c2 = c0202o3.f3096n.n() ? c0202o3.f3092j : c0202o3.h;
                    if (c2 == 0) {
                        sb = "";
                    } else {
                        MenuC0200m menuC0200m = c0202o3.f3096n;
                        Resources resources = menuC0200m.f3057a.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(menuC0200m.f3057a).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i2 = menuC0200m.n() ? c0202o3.f3093k : c0202o3.i;
                        C0202o.c(i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                        C0202o.c(i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                        C0202o.c(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                        C0202o.c(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                        C0202o.c(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                        C0202o.c(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
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
                if (this.f971f.getVisibility() != i) {
                    this.f971f.setVisibility(i);
                }
                setIcon(c0202o.getIcon());
                setEnabled(c0202o.isEnabled());
                setSubMenuArrowVisible(c0202o.hasSubMenu());
                setContentDescription(c0202o.f3099q);
            }
        }
        z2 = false;
        c0202o.f3096n.n();
        if (z2) {
        }
        i = 8;
        if (i == 0) {
        }
        if (this.f971f.getVisibility() != i) {
        }
        setIcon(c0202o.getIcon());
        setEnabled(c0202o.isEnabled());
        setSubMenuArrowVisible(c0202o.hasSubMenu());
        setContentDescription(c0202o.f3099q);
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

    @Override // k.InterfaceC0213z
    public C0202o getItemData() {
        return this.f966a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f973j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f969d = textView;
        int i = this.f974k;
        if (i != -1) {
            textView.setTextAppearance(this.f975l, i);
        }
        this.f971f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f972g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f977n);
        }
        this.h = (ImageView) findViewById(R.id.group_divider);
        this.i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f967b != null && this.f976m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f967b.getLayoutParams();
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
        if (!z2 && this.f968c == null && this.f970e == null) {
            return;
        }
        if ((this.f966a.f3106x & 4) != 0) {
            if (this.f968c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f968c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f968c;
            view = this.f970e;
        } else {
            if (this.f970e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f970e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f970e;
            view = this.f968c;
        }
        if (z2) {
            compoundButton.setChecked(this.f966a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f970e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f968c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f966a.f3106x & 4) != 0) {
            if (this.f968c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f968c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f968c;
        } else {
            if (this.f970e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f970e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f970e;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f980q = z2;
        this.f976m = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility((this.f978o || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f966a.f3096n.getClass();
        boolean z2 = this.f980q;
        if (z2 || this.f976m) {
            ImageView imageView = this.f967b;
            if (imageView == null && drawable == null && !this.f976m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f967b = imageView2;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f976m) {
                this.f967b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f967b;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f967b.getVisibility() != 0) {
                this.f967b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f969d.getVisibility() != 8) {
                this.f969d.setVisibility(8);
            }
        } else {
            this.f969d.setText(charSequence);
            if (this.f969d.getVisibility() != 0) {
                this.f969d.setVisibility(0);
            }
        }
    }
}
