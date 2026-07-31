package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.Z;
import e.AbstractC2405a;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    private g f10311a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f10312b;

    /* renamed from: c, reason: collision with root package name */
    private RadioButton f10313c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f10314d;

    /* renamed from: e, reason: collision with root package name */
    private CheckBox f10315e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f10316f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f10317g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f10318h;

    /* renamed from: i, reason: collision with root package name */
    private LinearLayout f10319i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f10320j;

    /* renamed from: k, reason: collision with root package name */
    private int f10321k;

    /* renamed from: l, reason: collision with root package name */
    private Context f10322l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f10323m;

    /* renamed from: n, reason: collision with root package name */
    private Drawable f10324n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f10325o;

    /* renamed from: p, reason: collision with root package name */
    private LayoutInflater f10326p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f10327q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2405a.f36174A);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i4) {
        LinearLayout linearLayout = this.f10319i;
        if (linearLayout != null) {
            linearLayout.addView(view, i4);
        } else {
            addView(view, i4);
        }
    }

    private void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(e.g.f36329h, (ViewGroup) this, false);
        this.f10315e = checkBox;
        a(checkBox);
    }

    private void d() {
        ImageView imageView = (ImageView) getInflater().inflate(e.g.f36330i, (ViewGroup) this, false);
        this.f10312b = imageView;
        b(imageView, 0);
    }

    private void e() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(e.g.f36332k, (ViewGroup) this, false);
        this.f10313c = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f10326p == null) {
            this.f10326p = LayoutInflater.from(getContext());
        }
        return this.f10326p;
    }

    private void setSubMenuArrowVisible(boolean z4) {
        ImageView imageView = this.f10317g;
        if (imageView != null) {
            imageView.setVisibility(z4 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f10318h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f10318h.getLayoutParams();
        rect.top += this.f10318h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public void f(boolean z4, char c4) {
        int i4 = (z4 && this.f10311a.A()) ? 0 : 8;
        if (i4 == 0) {
            this.f10316f.setText(this.f10311a.h());
        }
        if (this.f10316f.getVisibility() != i4) {
            this.f10316f.setVisibility(i4);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f10311a;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void initialize(g gVar, int i4) {
        this.f10311a = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        f(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f10320j);
        TextView textView = (TextView) findViewById(e.f.f36292M);
        this.f10314d = textView;
        int i4 = this.f10321k;
        if (i4 != -1) {
            textView.setTextAppearance(this.f10322l, i4);
        }
        this.f10316f = (TextView) findViewById(e.f.f36285F);
        ImageView imageView = (ImageView) findViewById(e.f.f36288I);
        this.f10317g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f10324n);
        }
        this.f10318h = (ImageView) findViewById(e.f.f36313r);
        this.f10319i = (LinearLayout) findViewById(e.f.f36307l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        if (this.f10312b != null && this.f10323m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f10312b.getLayoutParams();
            int i6 = layoutParams.height;
            if (i6 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i6;
            }
        }
        super.onMeasure(i4, i5);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void setCheckable(boolean z4) {
        CompoundButton compoundButton;
        View view;
        if (!z4 && this.f10313c == null && this.f10315e == null) {
            return;
        }
        if (this.f10311a.m()) {
            if (this.f10313c == null) {
                e();
            }
            compoundButton = this.f10313c;
            view = this.f10315e;
        } else {
            if (this.f10315e == null) {
                c();
            }
            compoundButton = this.f10315e;
            view = this.f10313c;
        }
        if (z4) {
            compoundButton.setChecked(this.f10311a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f10315e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f10313c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z4) {
        CompoundButton compoundButton;
        if (this.f10311a.m()) {
            if (this.f10313c == null) {
                e();
            }
            compoundButton = this.f10313c;
        } else {
            if (this.f10315e == null) {
                c();
            }
            compoundButton = this.f10315e;
        }
        compoundButton.setChecked(z4);
    }

    public void setForceShowIcon(boolean z4) {
        this.f10327q = z4;
        this.f10323m = z4;
    }

    public void setGroupDividerEnabled(boolean z4) {
        ImageView imageView = this.f10318h;
        if (imageView != null) {
            imageView.setVisibility((this.f10325o || !z4) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z4 = this.f10311a.z() || this.f10327q;
        if (z4 || this.f10323m) {
            ImageView imageView = this.f10312b;
            if (imageView == null && drawable == null && !this.f10323m) {
                return;
            }
            if (imageView == null) {
                d();
            }
            if (drawable == null && !this.f10323m) {
                this.f10312b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f10312b;
            if (!z4) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f10312b.getVisibility() != 0) {
                this.f10312b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f10314d.getVisibility() != 8) {
                this.f10314d.setVisibility(8);
            }
        } else {
            this.f10314d.setText(charSequence);
            if (this.f10314d.getVisibility() != 0) {
                this.f10314d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet);
        Z v4 = Z.v(getContext(), attributeSet, e.j.f36444T1, i4, 0);
        this.f10320j = v4.g(e.j.f36452V1);
        this.f10321k = v4.n(e.j.f36448U1, -1);
        this.f10323m = v4.a(e.j.f36456W1, false);
        this.f10322l = context;
        this.f10324n = v4.g(e.j.f36460X1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, AbstractC2405a.f36210x, 0);
        this.f10325o = obtainStyledAttributes.hasValue(0);
        v4.x();
        obtainStyledAttributes.recycle();
    }
}
