package com.startapp.sdk.internal;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.View;
import android.widget.RelativeLayout;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.ads.banner.banner3d.Banner3D;
import com.startapp.sdk.ads.banner.banner3d.Banner3DView;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdDetails;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class z0 implements c2, Parcelable {
    public static final Parcelable.Creator<z0> CREATOR = new y0();

    /* renamed from: a, reason: collision with root package name */
    public final AdDetails f516a;
    public Point b;
    public Bitmap c;
    public Bitmap d;
    public final AtomicBoolean e;
    public final TrackingParams f;
    public ff g;
    public Banner3DView h;

    public z0(Context context, Banner3D banner3D, AdDetails adDetails, BannerOptions bannerOptions, TrackingParams trackingParams) {
        this.c = null;
        this.d = null;
        this.e = new AtomicBoolean(false);
        this.g = null;
        this.h = null;
        this.f516a = adDetails;
        this.f = trackingParams;
        a(context, bannerOptions, banner3D);
    }

    public final void a(Context context, BannerOptions bannerOptions, Banner3D banner3D) {
        int a2 = ph.a(context, bannerOptions.d() - 5);
        this.b = new Point((int) (bannerOptions.p() * Math.round(TypedValue.applyDimension(1, bannerOptions.o(), context.getResources().getDisplayMetrics()))), (int) (bannerOptions.e() * Math.round(TypedValue.applyDimension(1, bannerOptions.d(), context.getResources().getDisplayMetrics()))));
        Banner3DView banner3DView = new Banner3DView(context, new Point(bannerOptions.o(), bannerOptions.d()));
        this.h = banner3DView;
        banner3DView.setText(this.f516a.x());
        this.h.setRating(this.f516a.u());
        this.h.setDescription(this.f516a.j());
        this.h.setButtonText(this.f516a.C());
        Bitmap bitmap = this.c;
        Banner3DView banner3DView2 = this.h;
        if (bitmap != null) {
            banner3DView2.setImage(bitmap, a2, a2);
        } else {
            banner3DView2.setImage(R.drawable.sym_def_app_icon, a2, a2);
            new d2(context, this.f516a.m(), this, 0).a();
        }
        Point point = this.b;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(point.x, point.y);
        layoutParams.addRule(13);
        banner3D.addView(this.h, layoutParams);
        this.h.setVisibility(8);
        a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f516a, i);
        parcel.writeInt(this.b.x);
        parcel.writeInt(this.b.y);
        parcel.writeParcelable(this.c, i);
        parcel.writeBooleanArray(new boolean[]{this.e.get()});
        parcel.writeSerializable(this.f);
    }

    public z0(Parcel parcel) {
        this.c = null;
        this.d = null;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e = atomicBoolean;
        this.g = null;
        this.h = null;
        this.f516a = (AdDetails) parcel.readParcelable(AdDetails.class.getClassLoader());
        Point point = new Point(1, 1);
        this.b = point;
        point.x = parcel.readInt();
        this.b.y = parcel.readInt();
        this.c = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        atomicBoolean.set(zArr[0]);
        this.f = (TrackingParams) parcel.readSerializable();
    }

    public final void a() {
        Bitmap a2;
        Point point;
        int i;
        int i2;
        Banner3DView banner3DView = this.h;
        if (banner3DView != null) {
            try {
                a2 = a(banner3DView);
            } catch (OutOfMemoryError unused) {
            } catch (Throwable th) {
                n8.a(th);
            }
            this.d = a2;
            if (a2 == null && (i = (point = this.b).x) > 0 && (i2 = point.y) > 0) {
                this.d = Bitmap.createScaledBitmap(a2, i, i2, false);
            }
            return;
        }
        a2 = null;
        this.d = a2;
        if (a2 == null) {
            return;
        }
        this.d = Bitmap.createScaledBitmap(a2, i, i2, false);
    }

    public static Bitmap a(View view) {
        view.measure(view.getMeasuredWidth(), view.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.draw(canvas);
        return createBitmap;
    }

    @Override // com.startapp.sdk.internal.c2
    public final void a(Bitmap bitmap, int i) {
        Banner3DView banner3DView;
        if (bitmap == null || (banner3DView = this.h) == null) {
            return;
        }
        this.c = bitmap;
        banner3DView.setImage(bitmap);
        a();
    }
}
