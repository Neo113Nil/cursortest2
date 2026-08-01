package q1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.oriondriftchasers.arordrft.R;
import e2.o;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f3102a;

    /* renamed from: b, reason: collision with root package name */
    public final b f3103b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3104c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3105e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3106f;

    /* renamed from: g, reason: collision with root package name */
    public final float f3107g;

    /* renamed from: h, reason: collision with root package name */
    public final float f3108h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3109j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3110k;

    /* renamed from: l, reason: collision with root package name */
    public int f3111l;

    public c(Context context, b bVar) {
        AttributeSet attributeSet;
        int i;
        int next;
        b bVar2 = new b();
        bVar2.f3089n = 255;
        bVar2.f3091p = -2;
        bVar2.f3092q = -2;
        bVar2.f3093r = -2;
        bVar2.f3100y = Boolean.TRUE;
        this.f3103b = bVar2;
        int i4 = bVar.f3082f;
        if (i4 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i4);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                attributeSet = asAttributeSet;
                i = asAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e4) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i4));
                notFoundException.initCause(e4);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i = 0;
        }
        TypedArray f2 = o.f(context, attributeSet, n1.a.f2810a, R.attr.badgeStyle, i == 0 ? R.style.Widget_MaterialComponents_Badge : i, new int[0]);
        Resources resources = context.getResources();
        this.f3104c = f2.getDimensionPixelSize(5, -1);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.f3109j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.d = f2.getDimensionPixelSize(15, -1);
        this.f3105e = f2.getDimension(13, resources.getDimension(R.dimen.m3_badge_size));
        this.f3107g = f2.getDimension(18, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f3106f = f2.getDimension(4, resources.getDimension(R.dimen.m3_badge_size));
        this.f3108h = f2.getDimension(14, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f3110k = f2.getInt(25, 1);
        this.f3111l = f2.getInt(2, 0);
        b bVar3 = this.f3103b;
        int i5 = bVar.f3089n;
        bVar3.f3089n = i5 == -2 ? 255 : i5;
        int i6 = bVar.f3091p;
        if (i6 != -2) {
            bVar3.f3091p = i6;
        } else if (f2.hasValue(24)) {
            this.f3103b.f3091p = f2.getInt(24, 0);
        } else {
            this.f3103b.f3091p = -1;
        }
        String str = bVar.f3090o;
        if (str != null) {
            this.f3103b.f3090o = str;
        } else if (f2.hasValue(8)) {
            this.f3103b.f3090o = f2.getString(8);
        }
        b bVar4 = this.f3103b;
        bVar4.f3095t = bVar.f3095t;
        CharSequence charSequence = bVar.f3096u;
        bVar4.f3096u = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        b bVar5 = this.f3103b;
        int i7 = bVar.f3097v;
        bVar5.f3097v = i7 == 0 ? R.plurals.mtrl_badge_content_description : i7;
        int i8 = bVar.f3098w;
        bVar5.f3098w = i8 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i8;
        Boolean bool = bVar.f3100y;
        bVar5.f3100y = Boolean.valueOf(bool == null || bool.booleanValue());
        b bVar6 = this.f3103b;
        int i9 = bVar.f3092q;
        bVar6.f3092q = i9 == -2 ? f2.getInt(22, -2) : i9;
        b bVar7 = this.f3103b;
        int i10 = bVar.f3093r;
        bVar7.f3093r = i10 == -2 ? f2.getInt(23, -2) : i10;
        b bVar8 = this.f3103b;
        Integer num = bVar.f3085j;
        bVar8.f3085j = Integer.valueOf(num == null ? f2.getResourceId(6, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        b bVar9 = this.f3103b;
        Integer num2 = bVar.f3086k;
        bVar9.f3086k = Integer.valueOf(num2 == null ? f2.getResourceId(7, 0) : num2.intValue());
        b bVar10 = this.f3103b;
        Integer num3 = bVar.f3087l;
        bVar10.f3087l = Integer.valueOf(num3 == null ? f2.getResourceId(16, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        b bVar11 = this.f3103b;
        Integer num4 = bVar.f3088m;
        bVar11.f3088m = Integer.valueOf(num4 == null ? f2.getResourceId(17, 0) : num4.intValue());
        b bVar12 = this.f3103b;
        Integer num5 = bVar.f3083g;
        bVar12.f3083g = Integer.valueOf(num5 == null ? h.a.t(context, f2, 1).getDefaultColor() : num5.intValue());
        b bVar13 = this.f3103b;
        Integer num6 = bVar.i;
        bVar13.i = Integer.valueOf(num6 == null ? f2.getResourceId(9, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = bVar.f3084h;
        if (num7 != null) {
            this.f3103b.f3084h = num7;
        } else if (f2.hasValue(10)) {
            this.f3103b.f3084h = Integer.valueOf(h.a.t(context, f2, 10).getDefaultColor());
        } else {
            int intValue = this.f3103b.i.intValue();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(intValue, f.a.f1259v);
            obtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList t2 = h.a.t(context, obtainStyledAttributes, 3);
            h.a.t(context, obtainStyledAttributes, 4);
            h.a.t(context, obtainStyledAttributes, 5);
            obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.getInt(1, 1);
            int i11 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
            obtainStyledAttributes.getResourceId(i11, 0);
            obtainStyledAttributes.getString(i11);
            obtainStyledAttributes.getBoolean(14, false);
            h.a.t(context, obtainStyledAttributes, 6);
            obtainStyledAttributes.getFloat(7, 0.0f);
            obtainStyledAttributes.getFloat(8, 0.0f);
            obtainStyledAttributes.getFloat(9, 0.0f);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(intValue, n1.a.f2830w);
            obtainStyledAttributes2.hasValue(0);
            obtainStyledAttributes2.getFloat(0, 0.0f);
            if (Build.VERSION.SDK_INT >= 26) {
                obtainStyledAttributes2.getString(obtainStyledAttributes2.hasValue(3) ? 3 : 1);
            }
            obtainStyledAttributes2.recycle();
            this.f3103b.f3084h = Integer.valueOf(t2.getDefaultColor());
        }
        b bVar14 = this.f3103b;
        Integer num8 = bVar.f3099x;
        bVar14.f3099x = Integer.valueOf(num8 == null ? f2.getInt(3, 8388661) : num8.intValue());
        b bVar15 = this.f3103b;
        Integer num9 = bVar.f3101z;
        bVar15.f3101z = Integer.valueOf(num9 == null ? f2.getDimensionPixelSize(12, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        b bVar16 = this.f3103b;
        Integer num10 = bVar.A;
        bVar16.A = Integer.valueOf(num10 == null ? f2.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        b bVar17 = this.f3103b;
        Integer num11 = bVar.B;
        bVar17.B = Integer.valueOf(num11 == null ? f2.getDimensionPixelOffset(19, 0) : num11.intValue());
        b bVar18 = this.f3103b;
        Integer num12 = bVar.C;
        bVar18.C = Integer.valueOf(num12 == null ? f2.getDimensionPixelOffset(26, 0) : num12.intValue());
        b bVar19 = this.f3103b;
        Integer num13 = bVar.D;
        bVar19.D = Integer.valueOf(num13 == null ? f2.getDimensionPixelOffset(20, bVar19.B.intValue()) : num13.intValue());
        b bVar20 = this.f3103b;
        Integer num14 = bVar.E;
        bVar20.E = Integer.valueOf(num14 == null ? f2.getDimensionPixelOffset(27, bVar20.C.intValue()) : num14.intValue());
        b bVar21 = this.f3103b;
        Integer num15 = bVar.H;
        bVar21.H = Integer.valueOf(num15 == null ? f2.getDimensionPixelOffset(21, 0) : num15.intValue());
        b bVar22 = this.f3103b;
        Integer num16 = bVar.F;
        bVar22.F = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        b bVar23 = this.f3103b;
        Integer num17 = bVar.G;
        bVar23.G = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        b bVar24 = this.f3103b;
        Boolean bool2 = bVar.I;
        bVar24.I = Boolean.valueOf(bool2 == null ? f2.getBoolean(0, false) : bool2.booleanValue());
        f2.recycle();
        Locale locale = bVar.f3094s;
        if (locale == null) {
            this.f3103b.f3094s = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.f3103b.f3094s = locale;
        }
        this.f3102a = bVar;
    }
}
