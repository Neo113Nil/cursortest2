package com.startapp.sdk.inappbrowser;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.sdk.internal.f2;
import com.startapp.sdk.internal.ii;
import com.startapp.sdk.internal.qd;
import com.startapp.startappsdk.R;
import java.util.HashMap;

/* loaded from: classes.dex */
public class NavigationBarLayout extends RelativeLayout {

    /* renamed from: j, reason: collision with root package name */
    private static final int f6594j = R.id.io_start_navigation_bar;

    /* renamed from: k, reason: collision with root package name */
    private static final int f6595k = R.id.io_start_navigation_bar_title;

    /* renamed from: l, reason: collision with root package name */
    private static final int f6596l = R.id.io_start_navigation_bar_close;

    /* renamed from: m, reason: collision with root package name */
    private static final int f6597m = R.id.io_start_navigation_bar_external;
    private static final int n = R.id.io_start_navigation_bar_back;
    private static final int o = R.id.io_start_navigation_bar_forward;

    /* renamed from: p, reason: collision with root package name */
    private static final int f6598p = R.id.io_start_navigation_bar_title_url;

    /* renamed from: q, reason: collision with root package name */
    private static final int f6599q = Color.rgb(78, 86, 101);

    /* renamed from: r, reason: collision with root package name */
    private static final int f6600r = Color.rgb(148, 155, 166);

    /* renamed from: a, reason: collision with root package name */
    private RelativeLayout f6601a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f6602b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f6603c;

    /* renamed from: d, reason: collision with root package name */
    private ImageView f6604d;

    /* renamed from: e, reason: collision with root package name */
    private ImageView f6605e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f6606f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f6607g;

    /* renamed from: h, reason: collision with root package name */
    private Boolean f6608h;

    /* renamed from: i, reason: collision with root package name */
    private HashMap f6609i;

    public NavigationBarLayout(Context context) {
        super(context);
        this.f6608h = Boolean.FALSE;
    }

    public final void a(WebView webView) {
        if (this.f6608h.booleanValue()) {
            if (webView.canGoBack()) {
                this.f6605e.setImageBitmap(((qd) this.f6609i.get("BACK_DARK")).f7505a);
                this.f6605e.setEnabled(true);
            } else {
                this.f6605e.setImageBitmap(((qd) this.f6609i.get("BACK")).f7505a);
                this.f6605e.setEnabled(false);
            }
            if (webView.canGoForward()) {
                this.f6603c.setImageBitmap(((qd) this.f6609i.get("FORWARD_DARK")).f7505a);
                this.f6603c.setEnabled(true);
            } else {
                this.f6603c.setImageBitmap(((qd) this.f6609i.get("FORWARD")).f7505a);
                this.f6603c.setEnabled(false);
            }
            if (webView.getTitle() != null) {
                this.f6606f.setText(webView.getTitle());
                return;
            }
            return;
        }
        if (webView.canGoBack()) {
            this.f6605e.setImageBitmap(((qd) this.f6609i.get("BACK_DARK")).f7505a);
            addView(this.f6605e, ii.a(getContext(), new int[]{6, 0, 0, 0}, new int[]{15, 9}));
            View view = this.f6603c;
            int i4 = n;
            RelativeLayout.LayoutParams a3 = ii.a(getContext(), new int[]{9, 0, 0, 0}, new int[]{15});
            a3.addRule(1, i4);
            addView(view, a3);
            removeView(this.f6601a);
            this.f6601a.removeView(this.f6607g);
            this.f6601a.removeView(this.f6606f);
            this.f6601a.addView(this.f6606f, ii.a(getContext(), new int[]{0, 0, 0, 0}, new int[]{14}));
            RelativeLayout relativeLayout = this.f6601a;
            TextView textView = this.f6607g;
            int i5 = f6595k;
            RelativeLayout.LayoutParams a4 = ii.a(getContext(), new int[]{0, 0, 0, 0}, new int[]{14});
            a4.addRule(3, i5);
            relativeLayout.addView(textView, a4);
            int i6 = o;
            RelativeLayout.LayoutParams a5 = ii.a(getContext(), new int[]{16, 0, 16, 0}, new int[]{15});
            a5.addRule(1, i6);
            a5.addRule(0, f6597m);
            addView(this.f6601a, a5);
            this.f6608h = Boolean.TRUE;
        }
    }

    public final TextView b() {
        return this.f6607g;
    }

    public final void c() {
        Typeface typeface = Typeface.DEFAULT;
        Context context = getContext();
        int i4 = f6599q;
        int i5 = f6595k;
        TextView textView = new TextView(context);
        textView.setTypeface(typeface, 1);
        textView.setTextSize(1, 16.46f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(i4);
        textView.setId(i5);
        this.f6606f = textView;
        Context context2 = getContext();
        int i6 = f6600r;
        int i7 = f6598p;
        TextView textView2 = new TextView(context2);
        textView2.setTypeface(typeface, 1);
        textView2.setTextSize(1, 12.12f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setTextColor(i6);
        textView2.setId(i7);
        this.f6607g = textView2;
        this.f6606f.setText("Loading…");
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.f6601a = relativeLayout;
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f6601a.addView(this.f6606f, ii.a(getContext(), new int[]{0, 0, 0, 0}, new int[0]));
        RelativeLayout relativeLayout2 = this.f6601a;
        TextView textView3 = this.f6607g;
        RelativeLayout.LayoutParams a3 = ii.a(getContext(), new int[]{0, 0, 0, 0}, new int[0]);
        a3.addRule(3, i5);
        relativeLayout2.addView(textView3, a3);
        for (qd qdVar : this.f6609i.values()) {
            Context context3 = getContext();
            String str = qdVar.f7508d;
            Bitmap b4 = f2.b(context3, str);
            if (b4 == null) {
                b4 = f2.b(context3, str);
            }
            if (b4 != null) {
                qdVar.f7505a = Bitmap.createScaledBitmap(b4, ii.a(getContext(), qdVar.f7506b), ii.a(getContext(), qdVar.f7507c), true);
            }
        }
        Context context4 = getContext();
        Bitmap bitmap = ((qd) this.f6609i.get("X")).f7505a;
        int i8 = f6596l;
        ImageView imageView = new ImageView(context4);
        imageView.setImageBitmap(bitmap);
        imageView.setId(i8);
        this.f6602b = imageView;
        Context context5 = getContext();
        Bitmap bitmap2 = ((qd) this.f6609i.get("BROWSER")).f7505a;
        int i9 = f6597m;
        ImageView imageView2 = new ImageView(context5);
        imageView2.setImageBitmap(bitmap2);
        imageView2.setId(i9);
        this.f6604d = imageView2;
        Context context6 = getContext();
        Bitmap bitmap3 = ((qd) this.f6609i.get("BACK")).f7505a;
        int i10 = n;
        ImageView imageView3 = new ImageView(context6);
        imageView3.setImageBitmap(bitmap3);
        imageView3.setId(i10);
        this.f6605e = imageView3;
        Context context7 = getContext();
        Bitmap bitmap4 = ((qd) this.f6609i.get("FORWARD")).f7505a;
        int i11 = o;
        ImageView imageView4 = new ImageView(context7);
        imageView4.setImageBitmap(bitmap4);
        imageView4.setId(i11);
        this.f6603c = imageView4;
        int a4 = ii.a(getContext(), 10);
        this.f6603c.setPadding(a4, a4, a4, a4);
        this.f6603c.setEnabled(false);
        this.f6605e.setPadding(a4, a4, a4, a4);
        addView(this.f6602b, ii.a(getContext(), new int[]{0, 0, 16, 0}, new int[]{15, 11}));
        View view = this.f6604d;
        RelativeLayout.LayoutParams a5 = ii.a(getContext(), new int[]{0, 0, 17, 0}, new int[]{15});
        a5.addRule(0, i8);
        addView(view, a5);
        View view2 = this.f6601a;
        RelativeLayout.LayoutParams a6 = ii.a(getContext(), new int[]{16, 6, 16, 0}, new int[]{9});
        a6.addRule(0, i9);
        addView(view2, a6);
    }

    public final void d() {
        setDescendantFocusability(262144);
        setBackgroundColor(Color.parseColor("#e9e9e9"));
        setLayoutParams(new RelativeLayout.LayoutParams(-1, ii.a(getContext(), 60)));
        setId(f6594j);
        HashMap hashMap = new HashMap();
        hashMap.put("BACK", new qd(14, 22, "back_.png"));
        hashMap.put("BACK_DARK", new qd(14, 22, "back_dark.png"));
        hashMap.put("FORWARD", new qd(14, 22, "forward_.png"));
        hashMap.put("FORWARD_DARK", new qd(14, 22, "forward_dark.png"));
        hashMap.put("X", new qd(23, 23, "x_dark.png"));
        hashMap.put("BROWSER", new qd(28, 28, "browser_icon_dark.png"));
        this.f6609i = hashMap;
    }

    public final void e() {
        this.f6609i = null;
    }

    public void setButtonsListener(View.OnClickListener onClickListener) {
        this.f6602b.setOnClickListener(onClickListener);
        this.f6605e.setOnClickListener(onClickListener);
        this.f6603c.setOnClickListener(onClickListener);
        this.f6604d.setOnClickListener(onClickListener);
    }

    public final TextView a() {
        return this.f6606f;
    }
}
