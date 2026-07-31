package com.startapp.sdk.adsbase.adinformation;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.startapp.sdk.internal.c2;
import com.startapp.sdk.internal.d2;
import com.startapp.sdk.internal.zh;
import com.startapp.startappsdk.R;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class ImageResourceConfig implements Serializable {
    private static final long serialVersionUID = -8927634568015374287L;

    /* renamed from: a, reason: collision with root package name */
    public volatile transient Bitmap f123a;
    private int height;
    private String imageUrlSecured;
    private String name;
    private int width;

    public static Drawable a(Context context) {
        Drawable drawable = context.getDrawable(R.drawable.io_start_info);
        return drawable != null ? drawable : new ColorDrawable(-1728053248);
    }

    public final Drawable b(Context context) {
        Bitmap bitmap;
        return (this.imageUrlSecured == null || (bitmap = this.f123a) == null) ? a(context) : new BitmapDrawable(context.getResources(), bitmap);
    }

    public final String c() {
        return this.name;
    }

    public final int d() {
        return this.width;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ImageResourceConfig imageResourceConfig = (ImageResourceConfig) obj;
            if (this.width == imageResourceConfig.width && this.height == imageResourceConfig.height && zh.a((Object) this.imageUrlSecured, (Object) imageResourceConfig.imageUrlSecured) && zh.a((Object) this.name, (Object) imageResourceConfig.name)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.imageUrlSecured, Integer.valueOf(this.width), Integer.valueOf(this.height), this.name};
        WeakHashMap weakHashMap = zh.f528a;
        return Arrays.deepHashCode(objArr);
    }

    public final void c(Context context) {
        String str = this.imageUrlSecured;
        if (str == null) {
            return;
        }
        d2 d2Var = new d2(context, str, new c2() { // from class: com.startapp.sdk.adsbase.adinformation.ImageResourceConfig$$ExternalSyntheticLambda0
            @Override // com.startapp.sdk.internal.c2
            public final void a(Bitmap bitmap, int i) {
                ImageResourceConfig.this.a(bitmap, i);
            }
        }, 0);
        d2Var.b = true;
        d2Var.a();
    }

    public final int a() {
        return this.height;
    }

    public final /* synthetic */ void a(Bitmap bitmap, int i) {
        this.f123a = bitmap;
    }

    public final String b() {
        return this.imageUrlSecured;
    }
}
