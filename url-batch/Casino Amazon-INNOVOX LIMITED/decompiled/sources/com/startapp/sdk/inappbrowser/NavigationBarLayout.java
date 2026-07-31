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
import com.startapp.sdk.internal.ph;
import com.startapp.sdk.internal.yc;
import com.startapp.sdk.internal.z1;
import com.startapp.startappsdk.R;
import java.util.HashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class NavigationBarLayout extends RelativeLayout {
    private static final int j = R.id.io_start_navigation_bar;
    private static final int k = R.id.io_start_navigation_bar_title;
    private static final int l = R.id.io_start_navigation_bar_close;
    private static final int m = R.id.io_start_navigation_bar_external;
    private static final int n = R.id.io_start_navigation_bar_back;
    private static final int o = R.id.io_start_navigation_bar_forward;
    private static final int p = R.id.io_start_navigation_bar_title_url;
    private static final int q = Color.rgb(78, 86, 101);
    private static final int r = Color.rgb(148, 155, 166);

    /* renamed from: a, reason: collision with root package name */
    private RelativeLayout f162a;
    private ImageView b;
    private ImageView c;
    private ImageView d;
    private ImageView e;
    private TextView f;
    private TextView g;
    private Boolean h;
    private HashMap i;

    public NavigationBarLayout(Context context) {
        super(context);
        this.h = Boolean.FALSE;
    }

    public final void a(WebView webView) {
        if (this.h.booleanValue()) {
            boolean canGoBack = webView.canGoBack();
            ImageView imageView = this.e;
            HashMap hashMap = this.i;
            if (canGoBack) {
                imageView.setImageBitmap(((yc) hashMap.get("BACK_DARK")).f509a);
                this.e.setEnabled(true);
            } else {
                imageView.setImageBitmap(((yc) hashMap.get("BACK")).f509a);
                this.e.setEnabled(false);
            }
            boolean canGoForward = webView.canGoForward();
            ImageView imageView2 = this.c;
            HashMap hashMap2 = this.i;
            if (canGoForward) {
                imageView2.setImageBitmap(((yc) hashMap2.get("FORWARD_DARK")).f509a);
                this.c.setEnabled(true);
            } else {
                imageView2.setImageBitmap(((yc) hashMap2.get("FORWARD")).f509a);
                this.c.setEnabled(false);
            }
            if (webView.getTitle() != null) {
                this.f.setText(webView.getTitle());
                return;
            }
            return;
        }
        if (webView.canGoBack()) {
            this.e.setImageBitmap(((yc) this.i.get("BACK_DARK")).f509a);
            addView(this.e, ph.a(getContext(), new int[]{6, 0, 0, 0}, new int[]{15, 9}));
            View view = this.c;
            int i = n;
            RelativeLayout.LayoutParams a2 = ph.a(getContext(), new int[]{9, 0, 0, 0}, new int[]{15});
            a2.addRule(1, i);
            addView(view, a2);
            removeView(this.f162a);
            this.f162a.removeView(this.g);
            this.f162a.removeView(this.f);
            this.f162a.addView(this.f, ph.a(getContext(), new int[]{0, 0, 0, 0}, new int[]{14}));
            RelativeLayout relativeLayout = this.f162a;
            TextView textView = this.g;
            int i2 = k;
            RelativeLayout.LayoutParams a3 = ph.a(getContext(), new int[]{0, 0, 0, 0}, new int[]{14});
            a3.addRule(3, i2);
            relativeLayout.addView(textView, a3);
            int i3 = o;
            RelativeLayout.LayoutParams a4 = ph.a(getContext(), new int[]{16, 0, 16, 0}, new int[]{15});
            a4.addRule(1, i3);
            a4.addRule(0, m);
            addView(this.f162a, a4);
            this.h = Boolean.TRUE;
        }
    }

    public final TextView b() {
        return this.g;
    }

    public final void c() {
        Typeface typeface = Typeface.DEFAULT;
        Context context = getContext();
        int i = q;
        int i2 = k;
        TextView textView = new TextView(context);
        textView.setTypeface(typeface, 1);
        textView.setTextSize(1, 16.46f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(i);
        textView.setId(i2);
        this.f = textView;
        Context context2 = getContext();
        int i3 = r;
        int i4 = p;
        TextView textView2 = new TextView(context2);
        textView2.setTypeface(typeface, 1);
        textView2.setTextSize(1, 12.12f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setTextColor(i3);
        textView2.setId(i4);
        this.g = textView2;
        this.f.setText("Loading…");
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.f162a = relativeLayout;
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f162a.addView(this.f, ph.a(getContext(), new int[]{0, 0, 0, 0}, new int[0]));
        RelativeLayout relativeLayout2 = this.f162a;
        TextView textView3 = this.g;
        RelativeLayout.LayoutParams a2 = ph.a(getContext(), new int[]{0, 0, 0, 0}, new int[0]);
        a2.addRule(3, i2);
        relativeLayout2.addView(textView3, a2);
        for (yc ycVar : this.i.values()) {
            Context context3 = getContext();
            String str = ycVar.d;
            Bitmap b = z1.b(context3, str);
            if (b == null) {
                b = z1.b(context3, str);
            }
            if (b != null) {
                ycVar.f509a = Bitmap.createScaledBitmap(b, ph.a(getContext(), ycVar.b), ph.a(getContext(), ycVar.c), true);
            }
        }
        Context context4 = getContext();
        Bitmap bitmap = ((yc) this.i.get("X")).f509a;
        int i5 = l;
        ImageView imageView = new ImageView(context4);
        imageView.setImageBitmap(bitmap);
        imageView.setId(i5);
        this.b = imageView;
        Context context5 = getContext();
        Bitmap bitmap2 = ((yc) this.i.get("BROWSER")).f509a;
        int i6 = m;
        ImageView imageView2 = new ImageView(context5);
        imageView2.setImageBitmap(bitmap2);
        imageView2.setId(i6);
        this.d = imageView2;
        Context context6 = getContext();
        Bitmap bitmap3 = ((yc) this.i.get("BACK")).f509a;
        int i7 = n;
        ImageView imageView3 = new ImageView(context6);
        imageView3.setImageBitmap(bitmap3);
        imageView3.setId(i7);
        this.e = imageView3;
        Context context7 = getContext();
        Bitmap bitmap4 = ((yc) this.i.get("FORWARD")).f509a;
        int i8 = o;
        ImageView imageView4 = new ImageView(context7);
        imageView4.setImageBitmap(bitmap4);
        imageView4.setId(i8);
        this.c = imageView4;
        int a3 = ph.a(getContext(), 10);
        this.c.setPadding(a3, a3, a3, a3);
        this.c.setEnabled(false);
        this.e.setPadding(a3, a3, a3, a3);
        addView(this.b, ph.a(getContext(), new int[]{0, 0, 16, 0}, new int[]{15, 11}));
        View view = this.d;
        RelativeLayout.LayoutParams a4 = ph.a(getContext(), new int[]{0, 0, 17, 0}, new int[]{15});
        a4.addRule(0, i5);
        addView(view, a4);
        View view2 = this.f162a;
        RelativeLayout.LayoutParams a5 = ph.a(getContext(), new int[]{16, 6, 16, 0}, new int[]{9});
        a5.addRule(0, i6);
        addView(view2, a5);
    }

    public final void d() {
        setDescendantFocusability(262144);
        setBackgroundColor(Color.parseColor("#e9e9e9"));
        setLayoutParams(new RelativeLayout.LayoutParams(-1, ph.a(getContext(), 60)));
        setId(j);
        HashMap hashMap = new HashMap();
        hashMap.put("BACK", new yc(14, 22, "back_.png"));
        hashMap.put("BACK_DARK", new yc(14, 22, "back_dark.png"));
        hashMap.put("FORWARD", new yc(14, 22, "forward_.png"));
        hashMap.put("FORWARD_DARK", new yc(14, 22, "forward_dark.png"));
        hashMap.put("X", new yc(23, 23, "x_dark.png"));
        hashMap.put("BROWSER", new yc(28, 28, "browser_icon_dark.png"));
        this.i = hashMap;
    }

    public final void e() {
        this.i = null;
    }

    public void setButtonsListener(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
        this.e.setOnClickListener(onClickListener);
        this.c.setOnClickListener(onClickListener);
        this.d.setOnClickListener(onClickListener);
    }

    public final TextView a() {
        return this.f;
    }
}
