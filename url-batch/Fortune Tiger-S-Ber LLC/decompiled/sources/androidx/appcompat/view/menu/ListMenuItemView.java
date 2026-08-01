package androidx.appcompat.view.menu;

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
import androidx.emoji2.text.s;
import com.gglhk.bofio.fortunetiger.R;
import e.a;
import j.m;
import j.o;
import j.z;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements z, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: f, reason: collision with root package name */
    public o f160f;
    public ImageView g;
    public RadioButton h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f161i;

    /* renamed from: j, reason: collision with root package name */
    public CheckBox f162j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f163k;

    /* renamed from: l, reason: collision with root package name */
    public ImageView f164l;

    /* renamed from: m, reason: collision with root package name */
    public ImageView f165m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f166n;

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f167o;

    /* renamed from: p, reason: collision with root package name */
    public final int f168p;

    /* renamed from: q, reason: collision with root package name */
    public final Context f169q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f170r;

    /* renamed from: s, reason: collision with root package name */
    public final Drawable f171s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f172t;

    /* renamed from: u, reason: collision with root package name */
    public LayoutInflater f173u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f174v;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s r3 = s.r(R.attr.listMenuViewStyle, 0, getContext(), attributeSet, a.f1509r);
        this.f167o = r3.i(5);
        TypedArray typedArray = (TypedArray) r3.c;
        this.f168p = typedArray.getResourceId(1, -1);
        this.f170r = typedArray.getBoolean(7, false);
        this.f169q = context;
        this.f171s = r3.i(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f172t = obtainStyledAttributes.hasValue(0);
        r3.t();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f173u == null) {
            this.f173u = LayoutInflater.from(getContext());
        }
        return this.f173u;
    }

    private void setSubMenuArrowVisible(boolean z3) {
        ImageView imageView = this.f164l;
        if (imageView != null) {
            imageView.setVisibility(z3 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f165m;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f165m.getLayoutParams();
        rect.top = this.f165m.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    @Override // j.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(o oVar) {
        boolean z3;
        String sb;
        boolean z4;
        this.f160f = oVar;
        boolean isVisible = oVar.isVisible();
        m mVar = oVar.f2221n;
        int i4 = 0;
        setVisibility(isVisible ? 0 : 8);
        setTitle(oVar.f2214e);
        setCheckable(oVar.isCheckable());
        if (mVar.o()) {
            if ((mVar.n() ? oVar.f2217j : oVar.h) != 0) {
                z3 = true;
                mVar.n();
                if (z3) {
                    o oVar2 = this.f160f;
                    m mVar2 = oVar2.f2221n;
                    if (mVar2.o()) {
                        if ((mVar2.n() ? oVar2.f2217j : oVar2.h) != 0) {
                            z4 = true;
                        }
                    }
                    z4 = false;
                }
                i4 = 8;
                if (i4 == 0) {
                    TextView textView = this.f163k;
                    o oVar3 = this.f160f;
                    m mVar3 = oVar3.f2221n;
                    Context context = mVar3.f2189a;
                    char c = mVar3.n() ? oVar3.f2217j : oVar3.h;
                    if (c == 0) {
                        sb = "";
                    } else {
                        Resources resources = context.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i5 = mVar3.n() ? oVar3.f2218k : oVar3.f2216i;
                        o.c(i5, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                        o.c(i5, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                        o.c(i5, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                        o.c(i5, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                        o.c(i5, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                        o.c(i5, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
                        if (c == '\b') {
                            sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        } else if (c == '\n') {
                            sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                        } else if (c != ' ') {
                            sb2.append(c);
                        } else {
                            sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                        }
                        sb = sb2.toString();
                    }
                    textView.setText(sb);
                }
                if (this.f163k.getVisibility() != i4) {
                    this.f163k.setVisibility(i4);
                }
                setIcon(oVar.getIcon());
                setEnabled(oVar.isEnabled());
                setSubMenuArrowVisible(oVar.hasSubMenu());
                setContentDescription(oVar.f2224q);
            }
        }
        z3 = false;
        mVar.n();
        if (z3) {
        }
        i4 = 8;
        if (i4 == 0) {
        }
        if (this.f163k.getVisibility() != i4) {
        }
        setIcon(oVar.getIcon());
        setEnabled(oVar.isEnabled());
        setSubMenuArrowVisible(oVar.hasSubMenu());
        setContentDescription(oVar.f2224q);
    }

    @Override // j.z
    public o getItemData() {
        return this.f160f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f167o);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f161i = textView;
        int i4 = this.f168p;
        if (i4 != -1) {
            textView.setTextAppearance(this.f169q, i4);
        }
        this.f163k = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f164l = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f171s);
        }
        this.f165m = (ImageView) findViewById(R.id.group_divider);
        this.f166n = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        if (this.g != null && this.f170r) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.g.getLayoutParams();
            int i6 = layoutParams.height;
            if (i6 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i6;
            }
        }
        super.onMeasure(i4, i5);
    }

    public void setCheckable(boolean z3) {
        CompoundButton compoundButton;
        View view;
        if (!z3 && this.h == null && this.f162j == null) {
            return;
        }
        if ((this.f160f.f2231x & 4) != 0) {
            if (this.h == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.h = radioButton;
                LinearLayout linearLayout = this.f166n;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.h;
            view = this.f162j;
        } else {
            if (this.f162j == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f162j = checkBox;
                LinearLayout linearLayout2 = this.f166n;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f162j;
            view = this.h;
        }
        if (z3) {
            compoundButton.setChecked(this.f160f.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f162j;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.h;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z3) {
        CompoundButton compoundButton;
        if ((this.f160f.f2231x & 4) != 0) {
            if (this.h == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.h = radioButton;
                LinearLayout linearLayout = this.f166n;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.h;
        } else {
            if (this.f162j == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f162j = checkBox;
                LinearLayout linearLayout2 = this.f166n;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f162j;
        }
        compoundButton.setChecked(z3);
    }

    public void setForceShowIcon(boolean z3) {
        this.f174v = z3;
        this.f170r = z3;
    }

    public void setGroupDividerEnabled(boolean z3) {
        ImageView imageView = this.f165m;
        if (imageView != null) {
            imageView.setVisibility((this.f172t || !z3) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        m mVar = this.f160f.f2221n;
        boolean z3 = this.f174v;
        if (z3 || this.f170r) {
            ImageView imageView = this.g;
            if (imageView == null && drawable == null && !this.f170r) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.g = imageView2;
                LinearLayout linearLayout = this.f166n;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f170r) {
                this.g.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.g;
            if (!z3) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.g.getVisibility() != 0) {
                this.g.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f161i.getVisibility() != 8) {
                this.f161i.setVisibility(8);
            }
        } else {
            this.f161i.setText(charSequence);
            if (this.f161i.getVisibility() != 0) {
                this.f161i.setVisibility(0);
            }
        }
    }
}
