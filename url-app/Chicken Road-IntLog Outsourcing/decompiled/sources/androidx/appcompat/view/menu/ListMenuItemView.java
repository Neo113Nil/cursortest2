package androidx.appcompat.view.menu;

import B4.i;
import E.G;
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
import com.chickyneer.roadway.R;
import g.AbstractC0444a;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.lang.reflect.Field;
import k.j;
import k.p;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements p, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public j f4092a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f4093b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f4094c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f4095d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f4096e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f4097f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f4098g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f4099h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f4100i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f4101j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4102k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f4103l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4104m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f4105n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f4106o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f4107p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4108q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i M5 = i.M(getContext(), attributeSet, AbstractC0444a.f5706n, R.attr.listMenuViewStyle);
        this.f4101j = M5.F(5);
        TypedArray typedArray = (TypedArray) M5.f312c;
        this.f4102k = typedArray.getResourceId(1, -1);
        this.f4104m = typedArray.getBoolean(7, false);
        this.f4103l = context;
        this.f4105n = M5.F(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f4106o = obtainStyledAttributes.hasValue(0);
        M5.P();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f4107p == null) {
            this.f4107p = LayoutInflater.from(getContext());
        }
        return this.f4107p;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f4098g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    @Override // k.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(j jVar) {
        boolean z;
        String sb;
        boolean z5;
        this.f4092a = jVar;
        int i2 = 0;
        setVisibility(jVar.isVisible() ? 0 : 8);
        setTitle(jVar.f10612e);
        setCheckable(jVar.isCheckable());
        if (jVar.f10621n.n()) {
            if ((jVar.f10621n.m() ? jVar.f10617j : jVar.f10615h) != 0) {
                z = true;
                jVar.f10621n.m();
                if (z) {
                    j jVar2 = this.f4092a;
                    if (jVar2.f10621n.n()) {
                        if ((jVar2.f10621n.m() ? jVar2.f10617j : jVar2.f10615h) != 0) {
                            z5 = true;
                        }
                    }
                    z5 = false;
                }
                i2 = 8;
                if (i2 == 0) {
                    TextView textView = this.f4097f;
                    j jVar3 = this.f4092a;
                    char c2 = jVar3.f10621n.m() ? jVar3.f10617j : jVar3.f10615h;
                    if (c2 == 0) {
                        sb = "";
                    } else {
                        k.i iVar = jVar3.f10621n;
                        Resources resources = iVar.f10586a.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(iVar.f10586a).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i3 = iVar.m() ? jVar3.f10618k : jVar3.f10616i;
                        j.a(sb2, i3, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                        j.a(sb2, i3, Base64Utils.IO_BUFFER_SIZE, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                        j.a(sb2, i3, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                        j.a(sb2, i3, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                        j.a(sb2, i3, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                        j.a(sb2, i3, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
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
                if (this.f4097f.getVisibility() != i2) {
                    this.f4097f.setVisibility(i2);
                }
                setIcon(jVar.getIcon());
                setEnabled(jVar.isEnabled());
                setSubMenuArrowVisible(jVar.hasSubMenu());
                setContentDescription(jVar.f10624q);
            }
        }
        z = false;
        jVar.f10621n.m();
        if (z) {
        }
        i2 = 8;
        if (i2 == 0) {
        }
        if (this.f4097f.getVisibility() != i2) {
        }
        setIcon(jVar.getIcon());
        setEnabled(jVar.isEnabled());
        setSubMenuArrowVisible(jVar.hasSubMenu());
        setContentDescription(jVar.f10624q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f4099h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4099h.getLayoutParams();
        rect.top = this.f4099h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // k.p
    public j getItemData() {
        return this.f4092a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Field field = G.f566a;
        setBackground(this.f4101j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f4095d = textView;
        int i2 = this.f4102k;
        if (i2 != -1) {
            textView.setTextAppearance(this.f4103l, i2);
        }
        this.f4097f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f4098g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f4105n);
        }
        this.f4099h = (ImageView) findViewById(R.id.group_divider);
        this.f4100i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (this.f4093b != null && this.f4104m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f4093b.getLayoutParams();
            int i6 = layoutParams.height;
            if (i6 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i6;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.f4094c == null && this.f4096e == null) {
            return;
        }
        if ((this.f4092a.f10631x & 4) != 0) {
            if (this.f4094c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f4094c = radioButton;
                LinearLayout linearLayout = this.f4100i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f4094c;
            view = this.f4096e;
        } else {
            if (this.f4096e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f4096e = checkBox;
                LinearLayout linearLayout2 = this.f4100i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f4096e;
            view = this.f4094c;
        }
        if (z) {
            compoundButton.setChecked(this.f4092a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f4096e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f4094c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.f4092a.f10631x & 4) != 0) {
            if (this.f4094c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f4094c = radioButton;
                LinearLayout linearLayout = this.f4100i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f4094c;
        } else {
            if (this.f4096e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f4096e = checkBox;
                LinearLayout linearLayout2 = this.f4100i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f4096e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f4108q = z;
        this.f4104m = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f4099h;
        if (imageView != null) {
            imageView.setVisibility((this.f4106o || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f4092a.f10621n.getClass();
        boolean z = this.f4108q;
        if (z || this.f4104m) {
            ImageView imageView = this.f4093b;
            if (imageView == null && drawable == null && !this.f4104m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f4093b = imageView2;
                LinearLayout linearLayout = this.f4100i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f4104m) {
                this.f4093b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f4093b;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f4093b.getVisibility() != 0) {
                this.f4093b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f4095d.getVisibility() != 8) {
                this.f4095d.setVisibility(8);
            }
        } else {
            this.f4095d.setText(charSequence);
            if (this.f4095d.getVisibility() != 0) {
                this.f4095d.setVisibility(0);
            }
        }
    }
}
