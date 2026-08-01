package v0;

import T.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0293a extends b {
    public static final Parcelable.Creator<C0293a> CREATOR = new F0.b(6);

    /* renamed from: c, reason: collision with root package name */
    public final int f3842c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3843e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3844f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3845g;

    public C0293a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3842c = parcel.readInt();
        this.d = parcel.readInt();
        this.f3843e = parcel.readInt() == 1;
        this.f3844f = parcel.readInt() == 1;
        this.f3845g = parcel.readInt() == 1;
    }

    @Override // T.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3842c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f3843e ? 1 : 0);
        parcel.writeInt(this.f3844f ? 1 : 0);
        parcel.writeInt(this.f3845g ? 1 : 0);
    }

    public C0293a(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f3842c = bottomSheetBehavior.f1754L;
        this.d = bottomSheetBehavior.f1776e;
        this.f3843e = bottomSheetBehavior.f1771b;
        this.f3844f = bottomSheetBehavior.f1751I;
        this.f3845g = bottomSheetBehavior.f1752J;
    }
}
