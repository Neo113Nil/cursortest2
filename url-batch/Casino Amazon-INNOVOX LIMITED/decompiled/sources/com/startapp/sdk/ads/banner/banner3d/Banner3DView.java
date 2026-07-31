package com.startapp.sdk.ads.banner.banner3d;

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
import androidx.core.view.GravityCompat;
import com.startapp.sdk.ads.banner.banner3d.Banner3DSize;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.internal.a1;
import com.startapp.sdk.internal.ph;
import com.startapp.sdk.json.RatingBar;
import com.startapp.startappsdk.R;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class Banner3DView extends RelativeLayout {
    public static final int g = R.id.io_start_banner_photo;
    public static final int h = R.id.io_start_banner_title;
    public static final int i = R.id.io_start_banner_description;
    public static final int j = R.id.io_start_banner_download;
    public static final int k = R.id.io_start_banner_rating;

    /* renamed from: a, reason: collision with root package name */
    private TextView f74a;
    private TextView b;
    private ImageView c;
    private RatingBar d;
    private TextView e;
    private final Point f;

    /* compiled from: Sta */
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
        int i2 = this.f.x;
        Banner3DSize.Size size = Banner3DSize.Size.SMALL;
        if (i2 > size.getSize().getWidth() || this.f.y > size.getSize().getHeight()) {
            template = Template.M;
        }
        int i3 = this.f.x;
        Banner3DSize.Size size2 = Banner3DSize.Size.MEDIUM;
        if (i3 > size2.getSize().getWidth() || this.f.y > size2.getSize().getHeight()) {
            template = Template.L;
        }
        int i4 = this.f.x;
        Banner3DSize.Size size3 = Banner3DSize.Size.LARGE;
        if (i4 > size3.getSize().getWidth() || this.f.y > size3.getSize().getHeight()) {
            template = Template.XL;
        }
        setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{AdsCommonMetaData.k().p(), AdsCommonMetaData.k().o()}));
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        int a2 = ph.a(context, 2);
        int round = Math.round(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
        Math.round(TypedValue.applyDimension(1, 4.0f, context.getResources().getDisplayMetrics()));
        int round2 = Math.round(TypedValue.applyDimension(1, 5.0f, context.getResources().getDisplayMetrics()));
        int round3 = Math.round(TypedValue.applyDimension(1, 6.0f, context.getResources().getDisplayMetrics()));
        int round4 = Math.round(TypedValue.applyDimension(1, 8.0f, context.getResources().getDisplayMetrics()));
        Math.round(TypedValue.applyDimension(1, 10.0f, context.getResources().getDisplayMetrics()));
        int round5 = Math.round(TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics()));
        Math.round(TypedValue.applyDimension(1, 84.0f, context.getResources().getDisplayMetrics()));
        int round6 = Math.round(TypedValue.applyDimension(1, 90.0f, context.getResources().getDisplayMetrics()));
        setPadding(round2, 0, round2, 0);
        setTag(this);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        int i5 = g;
        imageView.setId(i5);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(round6, round6);
        layoutParams.addRule(15);
        this.c.setLayoutParams(layoutParams);
        TextView textView = new TextView(context);
        this.f74a = textView;
        int i6 = h;
        textView.setId(i6);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(17, i5);
        layoutParams2.addRule(14);
        this.f74a.setLayoutParams(layoutParams2);
        this.f74a.setTextColor(AdsCommonMetaData.k().q().intValue());
        this.f74a.setGravity(GravityCompat.START);
        this.f74a.setBackgroundColor(0);
        int ordinal = template.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            this.f74a.setTextSize(17.0f);
            this.f74a.setPadding(round, 0, 0, a2);
            layoutParams2.width = ph.a(getContext(), (int) (this.f.x * 0.55d));
        } else if (ordinal == 2) {
            this.f74a.setTextSize(17.0f);
            this.f74a.setPadding(round, 0, 0, a2);
            layoutParams2.width = ph.a(getContext(), (int) (this.f.x * 0.65d));
        } else if (ordinal == 3 || ordinal == 4) {
            this.f74a.setTextSize(22.0f);
            this.f74a.setPadding(round, 0, 0, round2);
        }
        this.f74a.setSingleLine(true);
        this.f74a.setEllipsize(TextUtils.TruncateAt.END);
        ph.a(this.f74a, AdsCommonMetaData.k().r());
        TextView textView2 = new TextView(context);
        this.b = textView2;
        int i7 = i;
        textView2.setId(i7);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(17, i5);
        layoutParams3.addRule(3, i6);
        layoutParams3.setMargins(0, 0, 0, round2);
        this.b.setLayoutParams(layoutParams3);
        this.b.setTextColor(AdsCommonMetaData.k().l().intValue());
        this.b.setTextSize(18.0f);
        this.b.setMaxLines(2);
        this.b.setLines(2);
        this.b.setSingleLine(false);
        this.b.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.b.setHorizontallyScrolling(true);
        this.b.setPadding(round, 0, 0, 0);
        RatingBar ratingBar = new RatingBar(getContext());
        this.d = ratingBar;
        ratingBar.setId(k);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        int ordinal2 = template.ordinal();
        if (ordinal2 == 0 || ordinal2 == 1 || ordinal2 == 2) {
            layoutParams4.addRule(17, i5);
            layoutParams4.addRule(8, i5);
        } else if (ordinal2 == 3 || ordinal2 == 4) {
            layoutParams4.addRule(17, i6);
            layoutParams3.width = ph.a(getContext(), (int) (this.f.x * 0.6d));
        }
        layoutParams4.setMargins(round, round4, round, 0);
        this.d.setLayoutParams(layoutParams4);
        this.e = new TextView(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        int ordinal3 = template.ordinal();
        if (ordinal3 == 0 || ordinal3 == 1 || ordinal3 == 2) {
            this.e.setTextSize(13.0f);
            layoutParams5.addRule(17, i6);
            layoutParams5.addRule(15);
        } else if (ordinal3 == 3) {
            layoutParams5.addRule(17, i7);
            layoutParams5.addRule(15);
            layoutParams5.setMargins(round5, 0, 0, 0);
            this.e.setTextSize(26.0f);
        } else if (ordinal3 == 4) {
            layoutParams5.addRule(17, i7);
            layoutParams5.addRule(15);
            layoutParams5.setMargins(round5 * 7, 0, 0, 0);
            this.e.setTextSize(26.0f);
        }
        this.e.setPadding(round3, round3, round3, round3);
        this.e.setLayoutParams(layoutParams5);
        setButtonText(false);
        this.e.setTextColor(-1);
        this.e.setTypeface(null, 1);
        this.e.setId(j);
        this.e.setShadowLayer(2.5f, -3.0f, 3.0f, -9013642);
        this.e.setBackgroundDrawable(new a1(new RoundRectShape(new float[]{10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f}, null, null)));
        addView(this.c);
        addView(this.f74a);
        int ordinal4 = template.ordinal();
        if (ordinal4 == 0 || ordinal4 == 1 || ordinal4 == 2) {
            addView(this.e);
        } else if (ordinal4 == 3 || ordinal4 == 4) {
            addView(this.e);
            addView(this.b);
        }
        addView(this.d);
    }

    public void setButtonText(boolean z) {
        TextView textView = this.e;
        if (z) {
            textView.setText("OPEN");
        } else {
            textView.setText("DOWNLOAD");
        }
    }

    public void setDescription(String str) {
        if (str != null) {
            if (str.compareTo("") != 0) {
                String[] a2 = a(str);
                String str2 = a2[0];
                String str3 = a2[1];
                String str4 = str3 != null ? a(str3)[0] : "";
                if (str.length() >= 110) {
                    str4 = str4 + "...";
                }
                this.b.setText(str2 + "\n" + str4);
            }
        }
    }

    public void setImage(Bitmap bitmap) {
        this.c.setImageBitmap(bitmap);
    }

    public void setRating(float f) {
        try {
            this.d.setRating(f);
        } catch (NullPointerException unused) {
        }
    }

    public void setText(String str) {
        this.f74a.setText(str);
    }

    public void setImage(int i2, int i3, int i4) {
        this.c.setImageResource(i2);
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        layoutParams.width = i3;
        layoutParams.height = i4;
        this.c.setLayoutParams(layoutParams);
    }

    public Banner3DView(Context context, Point point) {
        super(context);
        this.f = point;
        a();
    }

    public void setImage(Bitmap bitmap, int i2, int i3) {
        this.c.setImageBitmap(bitmap);
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i3;
        this.c.setLayoutParams(layoutParams);
    }

    public Banner3DView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public Banner3DView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a();
    }

    private static String[] a(String str) {
        boolean z;
        String[] strArr = new String[2];
        if (str.length() > 55) {
            char[] charArray = str.substring(0, 55).toCharArray();
            int length = charArray.length;
            int i2 = length - 1;
            int i3 = length - 2;
            while (true) {
                if (i3 <= 0) {
                    z = false;
                    break;
                }
                if (charArray[i3] == ' ') {
                    z = true;
                    i2 = i3;
                    break;
                }
                i3--;
            }
            int i4 = z ? i2 : 55;
            strArr[0] = str.substring(0, i4);
            strArr[1] = str.substring(i4 + 1);
            return strArr;
        }
        strArr[0] = str;
        strArr[1] = null;
        return strArr;
    }
}
