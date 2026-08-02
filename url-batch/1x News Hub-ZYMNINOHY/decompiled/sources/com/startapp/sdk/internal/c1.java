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
    public final AdDetails f3620a;

    /* renamed from: b, reason: collision with root package name */
    public Point f3621b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap f3622c;

    /* renamed from: d, reason: collision with root package name */
    public Bitmap f3623d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f3624e;
    public final TrackingParams f;

    /* renamed from: g, reason: collision with root package name */
    public xf f3625g;

    /* renamed from: h, reason: collision with root package name */
    public Banner3DView f3626h;

    public c1(Context context, Banner3D banner3D, AdDetails adDetails, BannerOptions bannerOptions, TrackingParams trackingParams) {
        this.f3622c = null;
        this.f3623d = null;
        this.f3624e = new AtomicBoolean(false);
        this.f3625g = null;
        this.f3626h = null;
        this.f3620a = adDetails;
        this.f = trackingParams;
        a(context, bannerOptions, banner3D);
    }

    public final void a(Context context, BannerOptions bannerOptions, Banner3D banner3D) {
        int a3 = ii.a(context, bannerOptions.d() - 5);
        this.f3621b = new Point((int) (bannerOptions.p() * Math.round(TypedValue.applyDimension(1, bannerOptions.o(), context.getResources().getDisplayMetrics()))), (int) (bannerOptions.e() * Math.round(TypedValue.applyDimension(1, bannerOptions.d(), context.getResources().getDisplayMetrics()))));
        Banner3DView banner3DView = new Banner3DView(context, new Point(bannerOptions.o(), bannerOptions.d()));
        this.f3626h = banner3DView;
        banner3DView.setText(this.f3620a.x());
        this.f3626h.setRating(this.f3620a.u());
        this.f3626h.setDescription(this.f3620a.j());
        this.f3626h.setButtonText(this.f3620a.C());
        Bitmap bitmap = this.f3622c;
        if (bitmap != null) {
            this.f3626h.setImage(bitmap, a3, a3);
        } else {
            this.f3626h.setImage(R.drawable.sym_def_app_icon, a3, a3);
            new j2(context, this.f3620a.m(), this, 0).a();
        }
        Point point = this.f3621b;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(point.x, point.y);
        layoutParams.addRule(13);
        banner3D.addView(this.f3626h, layoutParams);
        this.f3626h.setVisibility(8);
        a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f3620a, i3);
        parcel.writeInt(this.f3621b.x);
        parcel.writeInt(this.f3621b.y);
        parcel.writeParcelable(this.f3622c, i3);
        parcel.writeBooleanArray(new boolean[]{this.f3624e.get()});
        parcel.writeSerializable(this.f);
    }

    public c1(Parcel parcel) {
        this.f3622c = null;
        this.f3623d = null;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f3624e = atomicBoolean;
        this.f3625g = null;
        this.f3626h = null;
        this.f3620a = (AdDetails) parcel.readParcelable(AdDetails.class.getClassLoader());
        Point point = new Point(1, 1);
        this.f3621b = point;
        point.x = parcel.readInt();
        this.f3621b.y = parcel.readInt();
        this.f3622c = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        atomicBoolean.set(zArr[0]);
        this.f = (TrackingParams) parcel.readSerializable();
    }

    public final void a() {
        Bitmap a3;
        Point point;
        int i3;
        int i4;
        Banner3DView banner3DView = this.f3626h;
        if (banner3DView != null) {
            try {
                a3 = a(banner3DView);
            } catch (OutOfMemoryError unused) {
            } catch (Throwable th) {
                d9.a(th);
            }
            this.f3623d = a3;
            if (a3 == null && (i3 = (point = this.f3621b).x) > 0 && (i4 = point.y) > 0) {
                this.f3623d = Bitmap.createScaledBitmap(a3, i3, i4, false);
            }
            return;
        }
        a3 = null;
        this.f3623d = a3;
        if (a3 == null) {
            return;
        }
        this.f3623d = Bitmap.createScaledBitmap(a3, i3, i4, false);
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
    public final void a(Bitmap bitmap, int i3) {
        Banner3DView banner3DView;
        if (bitmap == null || (banner3DView = this.f3626h) == null) {
            return;
        }
        this.f3622c = bitmap;
        banner3DView.setImage(bitmap);
        a();
    }
}
