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
    private static final int f3498j = R.id.io_start_navigation_bar;

    /* renamed from: k, reason: collision with root package name */
    private static final int f3499k = R.id.io_start_navigation_bar_title;

    /* renamed from: l, reason: collision with root package name */
    private static final int f3500l = R.id.io_start_navigation_bar_close;

    /* renamed from: m, reason: collision with root package name */
    private static final int f3501m = R.id.io_start_navigation_bar_external;

    /* renamed from: n, reason: collision with root package name */
    private static final int f3502n = R.id.io_start_navigation_bar_back;
    private static final int o = R.id.io_start_navigation_bar_forward;

    /* renamed from: p, reason: collision with root package name */
    private static final int f3503p = R.id.io_start_navigation_bar_title_url;

    /* renamed from: q, reason: collision with root package name */
    private static final int f3504q = Color.rgb(78, 86, 101);

    /* renamed from: r, reason: collision with root package name */
    private static final int f3505r = Color.rgb(148, 155, 166);

    /* renamed from: a, reason: collision with root package name */
    private RelativeLayout f3506a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f3507b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f3508c;

    /* renamed from: d, reason: collision with root package name */
    private ImageView f3509d;

    /* renamed from: e, reason: collision with root package name */
    private ImageView f3510e;
    private TextView f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f3511g;

    /* renamed from: h, reason: collision with root package name */
    private Boolean f3512h;

    /* renamed from: i, reason: collision with root package name */
    private HashMap f3513i;

    public NavigationBarLayout(Context context) {
        super(context);
        this.f3512h = Boolean.FALSE;
    }

    public final void a(WebView webView) {
        if (this.f3512h.booleanValue()) {
            if (webView.canGoBack()) {
                this.f3510e.setImageBitmap(((qd) this.f3513i.get("BACK_DARK")).f4368a);
                this.f3510e.setEnabled(true);
            } else {
                this.f3510e.setImageBitmap(((qd) this.f3513i.get("BACK")).f4368a);
                this.f3510e.setEnabled(false);
            }
            if (webView.canGoForward()) {
                this.f3508c.setImageBitmap(((qd) this.f3513i.get("FORWARD_DARK")).f4368a);
                this.f3508c.setEnabled(true);
            } else {
                this.f3508c.setImageBitmap(((qd) this.f3513i.get("FORWARD")).f4368a);
                this.f3508c.setEnabled(false);
            }
            if (webView.getTitle() != null) {
                this.f.setText(webView.getTitle());
                return;
            }
            return;
        }
        if (webView.canGoBack()) {
            this.f3510e.setImageBitmap(((qd) this.f3513i.get("BACK_DARK")).f4368a);
            addView(this.f3510e, ii.a(getContext(), new int[]{6, 0, 0, 0}, new int[]{15, 9}));
            View view = this.f3508c;
            int i3 = f3502n;
            RelativeLayout.LayoutParams a3 = ii.a(getContext(), new int[]{9, 0, 0, 0}, new int[]{15});
            a3.addRule(1, i3);
            addView(view, a3);
            removeView(this.f3506a);
            this.f3506a.removeView(this.f3511g);
            this.f3506a.removeView(this.f);
            this.f3506a.addView(this.f, ii.a(getContext(), new int[]{0, 0, 0, 0}, new int[]{14}));
            RelativeLayout relativeLayout = this.f3506a;
            TextView textView = this.f3511g;
            int i4 = f3499k;
            RelativeLayout.LayoutParams a4 = ii.a(getContext(), new int[]{0, 0, 0, 0}, new int[]{14});
            a4.addRule(3, i4);
            relativeLayout.addView(textView, a4);
            int i5 = o;
            RelativeLayout.LayoutParams a5 = ii.a(getContext(), new int[]{16, 0, 16, 0}, new int[]{15});
            a5.addRule(1, i5);
            a5.addRule(0, f3501m);
            addView(this.f3506a, a5);
            this.f3512h = Boolean.TRUE;
        }
    }

    public final TextView b() {
        return this.f3511g;
    }

    public final void c() {
        Typeface typeface = Typeface.DEFAULT;
        Context context = getContext();
        int i3 = f3504q;
        int i4 = f3499k;
        TextView textView = new TextView(context);
        textView.setTypeface(typeface, 1);
        textView.setTextSize(1, 16.46f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(i3);
        textView.setId(i4);
        this.f = textView;
        Context context2 = getContext();
        int i5 = f3505r;
        int i6 = f3503p;
        TextView textView2 = new TextView(context2);
        textView2.setTypeface(typeface, 1);
        textView2.setTextSize(1, 12.12f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setTextColor(i5);
        textView2.setId(i6);
        this.f3511g = textView2;
        this.f.setText("Loading…");
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.f3506a = relativeLayout;
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f3506a.addView(this.f, ii.a(getContext(), new int[]{0, 0, 0, 0}, new int[0]));
        RelativeLayout relativeLayout2 = this.f3506a;
        TextView textView3 = this.f3511g;
        RelativeLayout.LayoutParams a3 = ii.a(getContext(), new int[]{0, 0, 0, 0}, new int[0]);
        a3.addRule(3, i4);
        relativeLayout2.addView(textView3, a3);
        for (qd qdVar : this.f3513i.values()) {
            Context context3 = getContext();
            String str = qdVar.f4371d;
            Bitmap b3 = f2.b(context3, str);
            if (b3 == null) {
                b3 = f2.b(context3, str);
            }
            if (b3 != null) {
                qdVar.f4368a = Bitmap.createScaledBitmap(b3, ii.a(getContext(), qdVar.f4369b), ii.a(getContext(), qdVar.f4370c), true);
            }
        }
        Context context4 = getContext();
        Bitmap bitmap = ((qd) this.f3513i.get("X")).f4368a;
        int i7 = f3500l;
        ImageView imageView = new ImageView(context4);
        imageView.setImageBitmap(bitmap);
        imageView.setId(i7);
        this.f3507b = imageView;
        Context context5 = getContext();
        Bitmap bitmap2 = ((qd) this.f3513i.get("BROWSER")).f4368a;
        int i8 = f3501m;
        ImageView imageView2 = new ImageView(context5);
        imageView2.setImageBitmap(bitmap2);
        imageView2.setId(i8);
        this.f3509d = imageView2;
        Context context6 = getContext();
        Bitmap bitmap3 = ((qd) this.f3513i.get("BACK")).f4368a;
        int i9 = f3502n;
        ImageView imageView3 = new ImageView(context6);
        imageView3.setImageBitmap(bitmap3);
        imageView3.setId(i9);
        this.f3510e = imageView3;
        Context context7 = getContext();
        Bitmap bitmap4 = ((qd) this.f3513i.get("FORWARD")).f4368a;
        int i10 = o;
        ImageView imageView4 = new ImageView(context7);
        imageView4.setImageBitmap(bitmap4);
        imageView4.setId(i10);
        this.f3508c = imageView4;
        int a4 = ii.a(getContext(), 10);
        this.f3508c.setPadding(a4, a4, a4, a4);
        this.f3508c.setEnabled(false);
        this.f3510e.setPadding(a4, a4, a4, a4);
        addView(this.f3507b, ii.a(getContext(), new int[]{0, 0, 16, 0}, new int[]{15, 11}));
        View view = this.f3509d;
        RelativeLayout.LayoutParams a5 = ii.a(getContext(), new int[]{0, 0, 17, 0}, new int[]{15});
        a5.addRule(0, i7);
        addView(view, a5);
        View view2 = this.f3506a;
        RelativeLayout.LayoutParams a6 = ii.a(getContext(), new int[]{16, 6, 16, 0}, new int[]{9});
        a6.addRule(0, i8);
        addView(view2, a6);
    }

    public final void d() {
        setDescendantFocusability(262144);
        setBackgroundColor(Color.parseColor("#e9e9e9"));
        setLayoutParams(new RelativeLayout.LayoutParams(-1, ii.a(getContext(), 60)));
        setId(f3498j);
        HashMap hashMap = new HashMap();
        hashMap.put("BACK", new qd(14, 22, "back_.png"));
        hashMap.put("BACK_DARK", new qd(14, 22, "back_dark.png"));
        hashMap.put("FORWARD", new qd(14, 22, "forward_.png"));
        hashMap.put("FORWARD_DARK", new qd(14, 22, "forward_dark.png"));
        hashMap.put("X", new qd(23, 23, "x_dark.png"));
        hashMap.put("BROWSER", new qd(28, 28, "browser_icon_dark.png"));
        this.f3513i = hashMap;
    }

    public final void e() {
        this.f3513i = null;
    }

    public void setButtonsListener(View.OnClickListener onClickListener) {
        this.f3507b.setOnClickListener(onClickListener);
        this.f3510e.setOnClickListener(onClickListener);
        this.f3508c.setOnClickListener(onClickListener);
        this.f3509d.setOnClickListener(onClickListener);
    }

    public final TextView a() {
        return this.f;
    }
}
