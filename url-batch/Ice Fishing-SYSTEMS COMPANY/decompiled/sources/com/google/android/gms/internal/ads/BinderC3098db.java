package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.db, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3098db extends AbstractBinderC3186f8 implements InterfaceC3637nb {

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f30064n;

    /* renamed from: u, reason: collision with root package name */
    public final Uri f30065u;

    /* renamed from: v, reason: collision with root package name */
    public final double f30066v;

    /* renamed from: w, reason: collision with root package name */
    public final int f30067w;

    /* renamed from: x, reason: collision with root package name */
    public final int f30068x;

    /* renamed from: y, reason: collision with root package name */
    public final HashMap f30069y;

    public BinderC3098db(Drawable drawable, Uri uri, double d2, int i, int i4, HashMap hashMap) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        this.f30064n = drawable;
        this.f30065u = uri;
        this.f30066v = d2;
        this.f30067w = i;
        this.f30068x = i4;
        this.f30069y = hashMap;
    }

    public static InterfaceC3637nb G3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof InterfaceC3637nb ? (InterfaceC3637nb) queryLocalInterface : new C3583mb(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                V2.a d2 = d();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, d2);
                return true;
            case 2:
                parcel2.writeNoException();
                AbstractC3241g8.d(parcel2, this.f30065u);
                return true;
            case 3:
                parcel2.writeNoException();
                parcel2.writeDouble(this.f30066v);
                return true;
            case 4:
                parcel2.writeNoException();
                parcel2.writeInt(this.f30067w);
                return true;
            case 5:
                parcel2.writeNoException();
                parcel2.writeInt(this.f30068x);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeMap(this.f30069y);
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3637nb
    public final int c() {
        return this.f30067w;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3637nb
    public final V2.a d() {
        return new V2.b(this.f30064n);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3637nb
    public final Map e() {
        return this.f30069y;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3637nb
    public final int f() {
        return this.f30068x;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3637nb
    public final Uri i() {
        return this.f30065u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3637nb
    public final double o() {
        return this.f30066v;
    }
}
