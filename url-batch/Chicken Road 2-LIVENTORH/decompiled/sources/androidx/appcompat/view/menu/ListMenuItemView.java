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
import androidx.emoji2.text.t;
import com.oriondriftchasers.arordrft.R;
import f.a;
import k.m;
import k.o;
import k.z;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements z, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: f, reason: collision with root package name */
    public o f135f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f136g;

    /* renamed from: h, reason: collision with root package name */
    public RadioButton f137h;
    public TextView i;

    /* renamed from: j, reason: collision with root package name */
    public CheckBox f138j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f139k;

    /* renamed from: l, reason: collision with root package name */
    public ImageView f140l;

    /* renamed from: m, reason: collision with root package name */
    public ImageView f141m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f142n;

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f143o;

    /* renamed from: p, reason: collision with root package name */
    public final int f144p;

    /* renamed from: q, reason: collision with root package name */
    public final Context f145q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f146r;

    /* renamed from: s, reason: collision with root package name */
    public final Drawable f147s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f148t;

    /* renamed from: u, reason: collision with root package name */
    public LayoutInflater f149u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f150v;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        t w3 = t.w(getContext(), attributeSet, a.f1255r, R.attr.listMenuViewStyle);
        this.f143o = w3.n(5);
        TypedArray typedArray = (TypedArray) w3.f356c;
        this.f144p = typedArray.getResourceId(1, -1);
        this.f146r = typedArray.getBoolean(7, false);
        this.f145q = context;
        this.f147s = w3.n(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f148t = obtainStyledAttributes.hasValue(0);
        w3.y();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f149u == null) {
            this.f149u = LayoutInflater.from(getContext());
        }
        return this.f149u;
    }

    private void setSubMenuArrowVisible(boolean z3) {
        ImageView imageView = this.f140l;
        if (imageView != null) {
            imageView.setVisibility(z3 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f141m;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f141m.getLayoutParams();
        rect.top = this.f141m.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    @Override // k.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(o oVar) {
        boolean z3;
        String sb;
        boolean z4;
        this.f135f = oVar;
        boolean isVisible = oVar.isVisible();
        m mVar = oVar.f2096n;
        int i = 0;
        setVisibility(isVisible ? 0 : 8);
        setTitle(oVar.f2088e);
        setCheckable(oVar.isCheckable());
        if (mVar.o()) {
            if ((mVar.n() ? oVar.f2092j : oVar.f2091h) != 0) {
                z3 = true;
                mVar.n();
                if (z3) {
                    o oVar2 = this.f135f;
                    m mVar2 = oVar2.f2096n;
                    if (mVar2.o()) {
                        if ((mVar2.n() ? oVar2.f2092j : oVar2.f2091h) != 0) {
                            z4 = true;
                        }
                    }
                    z4 = false;
                }
                i = 8;
                if (i == 0) {
                    TextView textView = this.f139k;
                    o oVar3 = this.f135f;
                    m mVar3 = oVar3.f2096n;
                    Context context = mVar3.f2060a;
                    char c4 = mVar3.n() ? oVar3.f2092j : oVar3.f2091h;
                    if (c4 == 0) {
                        sb = "";
                    } else {
                        Resources resources = context.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i4 = mVar3.n() ? oVar3.f2093k : oVar3.i;
                        o.c(i4, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                        o.c(i4, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                        o.c(i4, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                        o.c(i4, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                        o.c(i4, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                        o.c(i4, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
                        if (c4 == '\b') {
                            sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        } else if (c4 == '\n') {
                            sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                        } else if (c4 != ' ') {
                            sb2.append(c4);
                        } else {
                            sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                        }
                        sb = sb2.toString();
                    }
                    textView.setText(sb);
                }
                if (this.f139k.getVisibility() != i) {
                    this.f139k.setVisibility(i);
                }
                setIcon(oVar.getIcon());
                setEnabled(oVar.isEnabled());
                setSubMenuArrowVisible(oVar.hasSubMenu());
                setContentDescription(oVar.f2099q);
            }
        }
        z3 = false;
        mVar.n();
        if (z3) {
        }
        i = 8;
        if (i == 0) {
        }
        if (this.f139k.getVisibility() != i) {
        }
        setIcon(oVar.getIcon());
        setEnabled(oVar.isEnabled());
        setSubMenuArrowVisible(oVar.hasSubMenu());
        setContentDescription(oVar.f2099q);
    }

    @Override // k.z
    public o getItemData() {
        return this.f135f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f143o);
        TextView textView = (TextView) findViewById(R.id.title);
        this.i = textView;
        int i = this.f144p;
        if (i != -1) {
            textView.setTextAppearance(this.f145q, i);
        }
        this.f139k = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f140l = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f147s);
        }
        this.f141m = (ImageView) findViewById(R.id.group_divider);
        this.f142n = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        if (this.f136g != null && this.f146r) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f136g.getLayoutParams();
            int i5 = layoutParams.height;
            if (i5 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i5;
            }
        }
        super.onMeasure(i, i4);
    }

    public void setCheckable(boolean z3) {
        CompoundButton compoundButton;
        View view;
        if (!z3 && this.f137h == null && this.f138j == null) {
            return;
        }
        if ((this.f135f.f2106x & 4) != 0) {
            if (this.f137h == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f137h = radioButton;
                LinearLayout linearLayout = this.f142n;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f137h;
            view = this.f138j;
        } else {
            if (this.f138j == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f138j = checkBox;
                LinearLayout linearLayout2 = this.f142n;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f138j;
            view = this.f137h;
        }
        if (z3) {
            compoundButton.setChecked(this.f135f.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f138j;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f137h;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z3) {
        CompoundButton compoundButton;
        if ((this.f135f.f2106x & 4) != 0) {
            if (this.f137h == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f137h = radioButton;
                LinearLayout linearLayout = this.f142n;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f137h;
        } else {
            if (this.f138j == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f138j = checkBox;
                LinearLayout linearLayout2 = this.f142n;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f138j;
        }
        compoundButton.setChecked(z3);
    }

    public void setForceShowIcon(boolean z3) {
        this.f150v = z3;
        this.f146r = z3;
    }

    public void setGroupDividerEnabled(boolean z3) {
        ImageView imageView = this.f141m;
        if (imageView != null) {
            imageView.setVisibility((this.f148t || !z3) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        m mVar = this.f135f.f2096n;
        boolean z3 = this.f150v;
        if (z3 || this.f146r) {
            ImageView imageView = this.f136g;
            if (imageView == null && drawable == null && !this.f146r) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f136g = imageView2;
                LinearLayout linearLayout = this.f142n;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f146r) {
                this.f136g.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f136g;
            if (!z3) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f136g.getVisibility() != 0) {
                this.f136g.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.i.getVisibility() != 8) {
                this.i.setVisibility(8);
            }
        } else {
            this.i.setText(charSequence);
            if (this.i.getVisibility() != 0) {
                this.i.setVisibility(0);
            }
        }
    }
}
