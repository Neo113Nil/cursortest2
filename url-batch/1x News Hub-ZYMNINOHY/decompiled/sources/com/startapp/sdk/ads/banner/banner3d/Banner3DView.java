package com.startapp.sdk.ads.banner.banner3d;

import E1.AbstractC0033i;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.sdk.ads.banner.banner3d.Banner3DSize;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.internal.d1;
import com.startapp.sdk.internal.ii;
import com.startapp.sdk.json.RatingBar;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.startapp.startappsdk.R;

/* loaded from: classes.dex */
public class Banner3DView extends RelativeLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final int f2999g = R.id.io_start_banner_photo;

    /* renamed from: h, reason: collision with root package name */
    public static final int f3000h = R.id.io_start_banner_title;

    /* renamed from: i, reason: collision with root package name */
    public static final int f3001i = R.id.io_start_banner_description;

    /* renamed from: j, reason: collision with root package name */
    public static final int f3002j = R.id.io_start_banner_download;

    /* renamed from: k, reason: collision with root package name */
    public static final int f3003k = R.id.io_start_banner_rating;

    /* renamed from: a, reason: collision with root package name */
    private TextView f3004a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f3005b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f3006c;

    /* renamed from: d, reason: collision with root package name */
    private RatingBar f3007d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f3008e;
    private final Point f;

    public enum Template {
        /* JADX INFO: Fake field, exist only in values array */
        XS,
        S,
        M,
        L,
        XL
    }

    public Banner3DView(Context context) {
        super(context);
        a();
    }

    private void a() {
        Context context = getContext();
        Template template = Template.S;
        int i3 = this.f.x;
        Banner3DSize.Size size = Banner3DSize.Size.SMALL;
        if (i3 > size.getSize().getWidth() || this.f.y > size.getSize().getHeight()) {
            template = Template.M;
        }
        int i4 = this.f.x;
        Banner3DSize.Size size2 = Banner3DSize.Size.MEDIUM;
        if (i4 > size2.getSize().getWidth() || this.f.y > size2.getSize().getHeight()) {
            template = Template.L;
        }
        int i5 = this.f.x;
        Banner3DSize.Size size3 = Banner3DSize.Size.LARGE;
        if (i5 > size3.getSize().getWidth() || this.f.y > size3.getSize().getHeight()) {
            template = Template.XL;
        }
        setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{AdsCommonMetaData.k().p(), AdsCommonMetaData.k().o()}));
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        int a3 = ii.a(context, 2);
        int round = Math.round(TypedValue.applyDimension(1, 3, context.getResources().getDisplayMetrics()));
        Math.round(TypedValue.applyDimension(1, 4, context.getResources().getDisplayMetrics()));
        int round2 = Math.round(TypedValue.applyDimension(1, 5, context.getResources().getDisplayMetrics()));
        int round3 = Math.round(TypedValue.applyDimension(1, 6, context.getResources().getDisplayMetrics()));
        int round4 = Math.round(TypedValue.applyDimension(1, 8, context.getResources().getDisplayMetrics()));
        Math.round(TypedValue.applyDimension(1, 10, context.getResources().getDisplayMetrics()));
        int round5 = Math.round(TypedValue.applyDimension(1, 20, context.getResources().getDisplayMetrics()));
        Math.round(TypedValue.applyDimension(1, 84, context.getResources().getDisplayMetrics()));
        int round6 = Math.round(TypedValue.applyDimension(1, 90, context.getResources().getDisplayMetrics()));
        setPadding(round2, 0, round2, 0);
        setTag(this);
        ImageView imageView = new ImageView(context);
        this.f3006c = imageView;
        int i6 = f2999g;
        imageView.setId(i6);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(round6, round6);
        layoutParams.addRule(15);
        this.f3006c.setLayoutParams(layoutParams);
        TextView textView = new TextView(context);
        this.f3004a = textView;
        int i7 = f3000h;
        textView.setId(i7);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(17, i6);
        layoutParams2.addRule(14);
        this.f3004a.setLayoutParams(layoutParams2);
        this.f3004a.setTextColor(AdsCommonMetaData.k().q().intValue());
        this.f3004a.setGravity(8388611);
        this.f3004a.setBackgroundColor(0);
        int ordinal = template.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            this.f3004a.setTextSize(17.0f);
            this.f3004a.setPadding(round, 0, 0, a3);
            layoutParams2.width = ii.a(getContext(), (int) (this.f.x * 0.55d));
        } else if (ordinal == 2) {
            this.f3004a.setTextSize(17.0f);
            this.f3004a.setPadding(round, 0, 0, a3);
            layoutParams2.width = ii.a(getContext(), (int) (this.f.x * 0.65d));
        } else if (ordinal == 3 || ordinal == 4) {
            this.f3004a.setTextSize(22.0f);
            this.f3004a.setPadding(round, 0, 0, round2);
        }
        this.f3004a.setSingleLine(true);
        this.f3004a.setEllipsize(TextUtils.TruncateAt.END);
        ii.a(this.f3004a, AdsCommonMetaData.k().r());
        TextView textView2 = new TextView(context);
        this.f3005b = textView2;
        int i8 = f3001i;
        textView2.setId(i8);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(17, i6);
        layoutParams3.addRule(3, i7);
        layoutParams3.setMargins(0, 0, 0, round2);
        this.f3005b.setLayoutParams(layoutParams3);
        this.f3005b.setTextColor(AdsCommonMetaData.k().l().intValue());
        this.f3005b.setTextSize(18.0f);
        this.f3005b.setMaxLines(2);
        this.f3005b.setLines(2);
        this.f3005b.setSingleLine(false);
        this.f3005b.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f3005b.setHorizontallyScrolling(true);
        this.f3005b.setPadding(round, 0, 0, 0);
        RatingBar ratingBar = new RatingBar(getContext());
        this.f3007d = ratingBar;
        ratingBar.setId(f3003k);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        int ordinal2 = template.ordinal();
        if (ordinal2 == 0 || ordinal2 == 1 || ordinal2 == 2) {
            layoutParams4.addRule(17, i6);
            layoutParams4.addRule(8, i6);
        } else if (ordinal2 == 3 || ordinal2 == 4) {
            layoutParams4.addRule(17, i7);
            layoutParams3.width = ii.a(getContext(), (int) (this.f.x * 0.6d));
        }
        layoutParams4.setMargins(round, round4, round, 0);
        this.f3007d.setLayoutParams(layoutParams4);
        this.f3008e = new TextView(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        int ordinal3 = template.ordinal();
        if (ordinal3 == 0 || ordinal3 == 1 || ordinal3 == 2) {
            this.f3008e.setTextSize(13.0f);
            layoutParams5.addRule(17, i7);
            layoutParams5.addRule(15);
        } else if (ordinal3 == 3) {
            layoutParams5.addRule(17, i8);
            layoutParams5.addRule(15);
            layoutParams5.setMargins(round5, 0, 0, 0);
            this.f3008e.setTextSize(26.0f);
        } else if (ordinal3 == 4) {
            layoutParams5.addRule(17, i8);
            layoutParams5.addRule(15);
            layoutParams5.setMargins(round5 * 7, 0, 0, 0);
            this.f3008e.setTextSize(26.0f);
        }
        this.f3008e.setPadding(round3, round3, round3, round3);
        this.f3008e.setLayoutParams(layoutParams5);
        setButtonText(false);
        this.f3008e.setTextColor(-1);
        this.f3008e.setTypeface(null, 1);
        this.f3008e.setId(f3002j);
        this.f3008e.setShadowLayer(2.5f, -3.0f, 3.0f, -9013642);
        this.f3008e.setBackgroundDrawable(new d1(new RoundRectShape(new float[]{10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f}, null, null)));
        addView(this.f3006c);
        addView(this.f3004a);
        int ordinal4 = template.ordinal();
        if (ordinal4 == 0 || ordinal4 == 1 || ordinal4 == 2) {
            addView(this.f3008e);
        } else if (ordinal4 == 3 || ordinal4 == 4) {
            addView(this.f3008e);
            addView(this.f3005b);
        }
        addView(this.f3007d);
    }

    public void setButtonText(boolean z) {
        if (z) {
            this.f3008e.setText("OPEN");
        } else {
            this.f3008e.setText("DOWNLOAD");
        }
    }

    public void setDescription(String str) {
        if (str != null) {
            if (str.compareTo("") != 0) {
                String[] a3 = a(str);
                String str2 = a3[0];
                String str3 = a3[1];
                String str4 = str3 != null ? a(str3)[0] : "";
                if (str.length() >= 110) {
                    str4 = AbstractC0033i.s(str4, "...");
                }
                this.f3005b.setText(str2 + IOUtils.LINE_SEPARATOR_UNIX + str4);
            }
        }
    }

    public void setImage(Bitmap bitmap) {
        this.f3006c.setImageBitmap(bitmap);
    }

    public void setRating(float f) {
        try {
            this.f3007d.setRating(f);
        } catch (NullPointerException unused) {
        }
    }

    public void setText(String str) {
        this.f3004a.setText(str);
    }

    public void setImage(int i3, int i4, int i5) {
        this.f3006c.setImageResource(i3);
        ViewGroup.LayoutParams layoutParams = this.f3006c.getLayoutParams();
        layoutParams.width = i4;
        layoutParams.height = i5;
        this.f3006c.setLayoutParams(layoutParams);
    }

    public Banner3DView(Context context, Point point) {
        super(context);
        this.f = point;
        a();
    }

    public Banner3DView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public void setImage(Bitmap bitmap, int i3, int i4) {
        this.f3006c.setImageBitmap(bitmap);
        ViewGroup.LayoutParams layoutParams = this.f3006c.getLayoutParams();
        layoutParams.width = i3;
        layoutParams.height = i4;
        this.f3006c.setLayoutParams(layoutParams);
    }

    public Banner3DView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        a();
    }

    private static String[] a(String str) {
        boolean z;
        String[] strArr = new String[2];
        if (str.length() > 55) {
            char[] charArray = str.substring(0, 55).toCharArray();
            int length = charArray.length;
            int i3 = length - 1;
            int i4 = length - 2;
            while (true) {
                if (i4 <= 0) {
                    z = false;
                    break;
                }
                if (charArray[i4] == ' ') {
                    z = true;
                    i3 = i4;
                    break;
                }
                i4--;
            }
            int i5 = z ? i3 : 55;
            strArr[0] = str.substring(0, i5);
            strArr[1] = str.substring(i5 + 1);
            return strArr;
        }
        strArr[0] = str;
        strArr[1] = null;
        return strArr;
    }
}
