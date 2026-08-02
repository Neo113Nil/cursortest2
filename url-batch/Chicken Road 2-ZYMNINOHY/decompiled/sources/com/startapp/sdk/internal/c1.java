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

/* loaded from: classes.dex */
public final class c1 implements i2, Parcelable {
    public static final Parcelable.Creator<c1> CREATOR = new b1();

    /* renamed from: a, reason: collision with root package name */
    public final AdDetails f6727a;

    /* renamed from: b, reason: collision with root package name */
    public Point f6728b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap f6729c;

    /* renamed from: d, reason: collision with root package name */
    public Bitmap f6730d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f6731e;

    /* renamed from: f, reason: collision with root package name */
    public final TrackingParams f6732f;

    /* renamed from: g, reason: collision with root package name */
    public xf f6733g;

    /* renamed from: h, reason: collision with root package name */
    public Banner3DView f6734h;

    public c1(Context context, Banner3D banner3D, AdDetails adDetails, BannerOptions bannerOptions, TrackingParams trackingParams) {
        this.f6729c = null;
        this.f6730d = null;
        this.f6731e = new AtomicBoolean(false);
        this.f6733g = null;
        this.f6734h = null;
        this.f6727a = adDetails;
        this.f6732f = trackingParams;
        a(context, bannerOptions, banner3D);
    }

    public final void a(Context context, BannerOptions bannerOptions, Banner3D banner3D) {
        int a3 = ii.a(context, bannerOptions.d() - 5);
        this.f6728b = new Point((int) (bannerOptions.p() * Math.round(TypedValue.applyDimension(1, bannerOptions.o(), context.getResources().getDisplayMetrics()))), (int) (bannerOptions.e() * Math.round(TypedValue.applyDimension(1, bannerOptions.d(), context.getResources().getDisplayMetrics()))));
        Banner3DView banner3DView = new Banner3DView(context, new Point(bannerOptions.o(), bannerOptions.d()));
        this.f6734h = banner3DView;
        banner3DView.setText(this.f6727a.x());
        this.f6734h.setRating(this.f6727a.u());
        this.f6734h.setDescription(this.f6727a.j());
        this.f6734h.setButtonText(this.f6727a.C());
        Bitmap bitmap = this.f6729c;
        if (bitmap != null) {
            this.f6734h.setImage(bitmap, a3, a3);
        } else {
            this.f6734h.setImage(R.drawable.sym_def_app_icon, a3, a3);
            new j2(context, this.f6727a.m(), this, 0).a();
        }
        Point point = this.f6728b;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(point.x, point.y);
        layoutParams.addRule(13);
        banner3D.addView(this.f6734h, layoutParams);
        this.f6734h.setVisibility(8);
        a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f6727a, i4);
        parcel.writeInt(this.f6728b.x);
        parcel.writeInt(this.f6728b.y);
        parcel.writeParcelable(this.f6729c, i4);
        parcel.writeBooleanArray(new boolean[]{this.f6731e.get()});
        parcel.writeSerializable(this.f6732f);
    }

    public c1(Parcel parcel) {
        this.f6729c = null;
        this.f6730d = null;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f6731e = atomicBoolean;
        this.f6733g = null;
        this.f6734h = null;
        this.f6727a = (AdDetails) parcel.readParcelable(AdDetails.class.getClassLoader());
        Point point = new Point(1, 1);
        this.f6728b = point;
        point.x = parcel.readInt();
        this.f6728b.y = parcel.readInt();
        this.f6729c = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        atomicBoolean.set(zArr[0]);
        this.f6732f = (TrackingParams) parcel.readSerializable();
    }

    public final void a() {
        Bitmap a3;
        Point point;
        int i4;
        int i5;
        Banner3DView banner3DView = this.f6734h;
        if (banner3DView != null) {
            try {
                a3 = a(banner3DView);
            } catch (OutOfMemoryError unused) {
            } catch (Throwable th) {
                d9.a(th);
            }
            this.f6730d = a3;
            if (a3 == null && (i4 = (point = this.f6728b).x) > 0 && (i5 = point.y) > 0) {
                this.f6730d = Bitmap.createScaledBitmap(a3, i4, i5, false);
            }
            return;
        }
        a3 = null;
        this.f6730d = a3;
        if (a3 == null) {
            return;
        }
        this.f6730d = Bitmap.createScaledBitmap(a3, i4, i5, false);
    }

    public static Bitmap a(View view) {
        view.measure(view.getMeasuredWidth(), view.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.draw(canvas);
        return createBitmap;
    }

    @Override // com.startapp.sdk.internal.i2
    public final void a(Bitmap bitmap, int i4) {
        Banner3DView banner3DView;
        if (bitmap == null || (banner3DView = this.f6734h) == null) {
            return;
        }
        this.f6729c = bitmap;
        banner3DView.setImage(bitmap);
        a();
    }
}
