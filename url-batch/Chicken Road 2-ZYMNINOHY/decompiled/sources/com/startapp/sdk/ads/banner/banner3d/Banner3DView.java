package com.startapp.sdk.ads.banner.banner3d;

import E.AbstractC0005f;
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
    public static final int f6075g = R.id.io_start_banner_photo;

    /* renamed from: h, reason: collision with root package name */
    public static final int f6076h = R.id.io_start_banner_title;

    /* renamed from: i, reason: collision with root package name */
    public static final int f6077i = R.id.io_start_banner_description;

    /* renamed from: j, reason: collision with root package name */
    public static final int f6078j = R.id.io_start_banner_download;

    /* renamed from: k, reason: collision with root package name */
    public static final int f6079k = R.id.io_start_banner_rating;

    /* renamed from: a, reason: collision with root package name */
    private TextView f6080a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f6081b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f6082c;

    /* renamed from: d, reason: collision with root package name */
    private RatingBar f6083d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f6084e;

    /* renamed from: f, reason: collision with root package name */
    private final Point f6085f;

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
        int i4 = this.f6085f.x;
        Banner3DSize.Size size = Banner3DSize.Size.SMALL;
        if (i4 > size.getSize().getWidth() || this.f6085f.y > size.getSize().getHeight()) {
            template = Template.M;
        }
        int i5 = this.f6085f.x;
        Banner3DSize.Size size2 = Banner3DSize.Size.MEDIUM;
        if (i5 > size2.getSize().getWidth() || this.f6085f.y > size2.getSize().getHeight()) {
            template = Template.L;
        }
        int i6 = this.f6085f.x;
        Banner3DSize.Size size3 = Banner3DSize.Size.LARGE;
        if (i6 > size3.getSize().getWidth() || this.f6085f.y > size3.getSize().getHeight()) {
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
        this.f6082c = imageView;
        int i7 = f6075g;
        imageView.setId(i7);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(round6, round6);
        layoutParams.addRule(15);
        this.f6082c.setLayoutParams(layoutParams);
        TextView textView = new TextView(context);
        this.f6080a = textView;
        int i8 = f6076h;
        textView.setId(i8);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(17, i7);
        layoutParams2.addRule(14);
        this.f6080a.setLayoutParams(layoutParams2);
        this.f6080a.setTextColor(AdsCommonMetaData.k().q().intValue());
        this.f6080a.setGravity(8388611);
        this.f6080a.setBackgroundColor(0);
        int ordinal = template.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            this.f6080a.setTextSize(17.0f);
            this.f6080a.setPadding(round, 0, 0, a3);
            layoutParams2.width = ii.a(getContext(), (int) (this.f6085f.x * 0.55d));
        } else if (ordinal == 2) {
            this.f6080a.setTextSize(17.0f);
            this.f6080a.setPadding(round, 0, 0, a3);
            layoutParams2.width = ii.a(getContext(), (int) (this.f6085f.x * 0.65d));
        } else if (ordinal == 3 || ordinal == 4) {
            this.f6080a.setTextSize(22.0f);
            this.f6080a.setPadding(round, 0, 0, round2);
        }
        this.f6080a.setSingleLine(true);
        this.f6080a.setEllipsize(TextUtils.TruncateAt.END);
        ii.a(this.f6080a, AdsCommonMetaData.k().r());
        TextView textView2 = new TextView(context);
        this.f6081b = textView2;
        int i9 = f6077i;
        textView2.setId(i9);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(17, i7);
        layoutParams3.addRule(3, i8);
        layoutParams3.setMargins(0, 0, 0, round2);
        this.f6081b.setLayoutParams(layoutParams3);
        this.f6081b.setTextColor(AdsCommonMetaData.k().l().intValue());
        this.f6081b.setTextSize(18.0f);
        this.f6081b.setMaxLines(2);
        this.f6081b.setLines(2);
        this.f6081b.setSingleLine(false);
        this.f6081b.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f6081b.setHorizontallyScrolling(true);
        this.f6081b.setPadding(round, 0, 0, 0);
        RatingBar ratingBar = new RatingBar(getContext());
        this.f6083d = ratingBar;
        ratingBar.setId(f6079k);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        int ordinal2 = template.ordinal();
        if (ordinal2 == 0 || ordinal2 == 1 || ordinal2 == 2) {
            layoutParams4.addRule(17, i7);
            layoutParams4.addRule(8, i7);
        } else if (ordinal2 == 3 || ordinal2 == 4) {
            layoutParams4.addRule(17, i8);
            layoutParams3.width = ii.a(getContext(), (int) (this.f6085f.x * 0.6d));
        }
        layoutParams4.setMargins(round, round4, round, 0);
        this.f6083d.setLayoutParams(layoutParams4);
        this.f6084e = new TextView(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        int ordinal3 = template.ordinal();
        if (ordinal3 == 0 || ordinal3 == 1 || ordinal3 == 2) {
            this.f6084e.setTextSize(13.0f);
            layoutParams5.addRule(17, i8);
            layoutParams5.addRule(15);
        } else if (ordinal3 == 3) {
            layoutParams5.addRule(17, i9);
            layoutParams5.addRule(15);
            layoutParams5.setMargins(round5, 0, 0, 0);
            this.f6084e.setTextSize(26.0f);
        } else if (ordinal3 == 4) {
            layoutParams5.addRule(17, i9);
            layoutParams5.addRule(15);
            layoutParams5.setMargins(round5 * 7, 0, 0, 0);
            this.f6084e.setTextSize(26.0f);
        }
        this.f6084e.setPadding(round3, round3, round3, round3);
        this.f6084e.setLayoutParams(layoutParams5);
        setButtonText(false);
        this.f6084e.setTextColor(-1);
        this.f6084e.setTypeface(null, 1);
        this.f6084e.setId(f6078j);
        this.f6084e.setShadowLayer(2.5f, -3.0f, 3.0f, -9013642);
        this.f6084e.setBackgroundDrawable(new d1(new RoundRectShape(new float[]{10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f}, null, null)));
        addView(this.f6082c);
        addView(this.f6080a);
        int ordinal4 = template.ordinal();
        if (ordinal4 == 0 || ordinal4 == 1 || ordinal4 == 2) {
            addView(this.f6084e);
        } else if (ordinal4 == 3 || ordinal4 == 4) {
            addView(this.f6084e);
            addView(this.f6081b);
        }
        addView(this.f6083d);
    }

    public void setButtonText(boolean z) {
        if (z) {
            this.f6084e.setText("OPEN");
        } else {
            this.f6084e.setText("DOWNLOAD");
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
                    str4 = AbstractC0005f.z(str4, "...");
                }
                this.f6081b.setText(str2 + IOUtils.LINE_SEPARATOR_UNIX + str4);
            }
        }
    }

    public void setImage(Bitmap bitmap) {
        this.f6082c.setImageBitmap(bitmap);
    }

    public void setRating(float f4) {
        try {
            this.f6083d.setRating(f4);
        } catch (NullPointerException unused) {
        }
    }

    public void setText(String str) {
        this.f6080a.setText(str);
    }

    public void setImage(int i4, int i5, int i6) {
        this.f6082c.setImageResource(i4);
        ViewGroup.LayoutParams layoutParams = this.f6082c.getLayoutParams();
        layoutParams.width = i5;
        layoutParams.height = i6;
        this.f6082c.setLayoutParams(layoutParams);
    }

    public Banner3DView(Context context, Point point) {
        super(context);
        this.f6085f = point;
        a();
    }

    public Banner3DView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public void setImage(Bitmap bitmap, int i4, int i5) {
        this.f6082c.setImageBitmap(bitmap);
        ViewGroup.LayoutParams layoutParams = this.f6082c.getLayoutParams();
        layoutParams.width = i4;
        layoutParams.height = i5;
        this.f6082c.setLayoutParams(layoutParams);
    }

    public Banner3DView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        a();
    }

    private static String[] a(String str) {
        boolean z;
        String[] strArr = new String[2];
        if (str.length() > 55) {
            char[] charArray = str.substring(0, 55).toCharArray();
            int length = charArray.length;
            int i4 = length - 1;
            int i5 = length - 2;
            while (true) {
                if (i5 <= 0) {
                    z = false;
                    break;
                }
                if (charArray[i5] == ' ') {
                    z = true;
                    i4 = i5;
                    break;
                }
                i5--;
            }
            int i6 = z ? i4 : 55;
            strArr[0] = str.substring(0, i6);
            strArr[1] = str.substring(i6 + 1);
            return strArr;
        }
        strArr[0] = str;
        strArr[1] = null;
        return strArr;
    }
}
